# Everybody Codes {year}

## Housekeeping

Before creating a new repository from this template, perform the following steps.

### Personal Access Token Setup

Open **[Personal access tokens (classic)](https://github.com/settings/tokens)** settings and verify if there is any
``PAT_TOKEN`` or if it is nearly to expire.

#### Creation of a new token

If there is no ``PAT_TOKEN`` created:

1. Click on **Generate New Token**.
2. Select ``repo`` checkbox.
3. Copy the token.

#### Refresh of an existing token

If there is an existing ``PAT_TOKEN``:

1. Click on it.
2. If the expiration date is due soon, click on **regenerate the token**.
3. Update the ``PAT_TOKEN`` at this template repository.

### Update dependencies

Open [dependency graph](https://github.com/Flashky/everybody-codes-yyyy/network/updates) settings
and manually run the following jobs:

- ``pom.xml``
- ``.github/workflows/build-report.yml``

Review and merge any pending pull requests.

## New repository creation

Follow this steps after housekeeping is finished.

### Creation

1. Open the main page of the [template repository](https://github.com/Flashky/everybody-codes-yyyy).
2. Click on **Use this template**.
3. Select **Create a new repository**:
    1. Give a name to the new repository. Example: ``everybody-codes-2022``.

### Personal Access Token Setup

Add the previously mentioned ``PAT_TOKEN`` to this new repository.

### Codacy Project Token Setup

1. Go to [Codacy](https://app.codacy.com) and add the repository.
2. Open **Settings / Coverage** and copy the ``CODACY_PROJECT_TOKEN`` value.
3. Open the created repository.
4. Open **Settings / Secrets and variables / Actions** and click on **New repository secret**:
    1. **Name:** ``CODACY_PROJECT_TOKEN``
    2. **Secret:** The previously copied token.

### Update repository information

1. Go to **Settings / Actions / General**.
2. Under **Workflow permissions**:
    1. Enable **Read and write permissions**.
    2. Enable **Allow GitHub Actions to create and approve pull requests**.
    3. Go to **Actions** and open the **Update year** workflow:
       1. Click on **Run workflow**.
       2. Type the year in ``yyyy`` format and click on **Run workflow**.

After the workflow has ended a Pull Request will be created:
1. Open the **pull request**.
2. Verify everything is right and then **merge** it.

After the PR is merged the repository will have its description and topics updated. Also, all ``README.md`` and ``pom.xml`` will be updated with current year value. The PR can be declined and workflow can be executed again if there was any problem that needed a fix.

### Data Repository Setup

1. Create a private data repository using [everybody-codes-yyyy-data](https://github.com/Flashky/everybody-codes-yyyy-data) template repository and set it up.
2. Add the data repository as a [submodule](https://github.blog/2016-02-01-working-with-submodules/) using the command:

```bash
git clone https://github.com/Flashky/everybody-codes-{year}.git &&
cd everybody-codes-{year} &&
git submodule add -b master https://github.com/Flashky/everybody-codes-{year}-data.git src/test/resources/inputs && 
git push
```

### Codacy Badges Setup

1. Go to [Codacy](https://app.codacy.com) and open the repository.
2. Open **Settings / General** and copy both the ``code quality`` and ``coverage`` badges.
3. Add them to this ``README.md``.

### Almost done...

1. Remove these instructions from ``README.md``.
2. Push the changes and...

**Enjoy your new Everybody Codes event!**

---

- [Quest 1](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day01)
- [Quest 2](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day02)
- [Quest 3](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day03)
- [Quest 4](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day04)
- [Quest 5](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day05)
- [Quest 6](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day06)
- [Quest 7](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day07)
- [Quest 8](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day08)
- [Quest 9](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day09)
- [Quest 10](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day10)
- [Quest 11](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day11)
- [Quest 12](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day12)
- [Quest 13](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day13)
- [Quest 14](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day14)
- [Quest 15](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day15)
- [Quest 16](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day16)
- [Quest 17](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day17)
- [Quest 18](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day18)
- [Quest 19](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day19)
- [Quest 20](https://github.com/Flashky/everybody-codes-{year}/tree/master/src/main/java/com/everybodycodes/flashk/day20)

## Cloning this repository

Without data repository:

```bash
git clone https://github.com/Flashky/everybody-codes-{year}.git
```

Including data repository:

```bash
git clone https://github.com/Flashky/everybody-codes-{year}.git --recurse-submodules
```

## About

- [Everybody Codes](https://everybody.codes/home)
