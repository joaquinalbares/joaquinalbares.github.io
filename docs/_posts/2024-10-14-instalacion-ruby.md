---
title: "INSTALACIÓN DE RUBY/C++ EN UBUNTU 24.04"
date: 2024-10-14T09:34:30-04:00
categories:
  - UT02
tags:
  - ruby
  - ubuntu
---

## RUBY

> El siguiente texto es un extracto en inglés de la [web oficial](https://gorails.com/setup/ubuntu/24.04) de Ruby on rails.

En este caso vamos a instalar sólamente Ruby.

### Installing Ruby

The first step is to install dependencies for compiling Ruby. Open your Terminal and run the following commands to install them.

```
sudo apt-get update
sudo apt-get install git-core zlib1g-dev build-essential libssl-dev libreadline-dev libyaml-dev
libsqlite3-dev sqlite3 libxml2-dev libxslt1-dev libcurl4-openssl-dev software-properties-common libffi-dev
```

Next we're going to be installing Ruby using a version manager called [ASDF](https://asdf-vm.com).

The reason we use ASDF over rbenv, rvm or others is that ASDF can manage other languages like Node.js too.

Installing `asdf` is a simple two step process. First you install `asdf`, and then add it to your shell:

```
cd
git clone https://github.com/excid3/asdf.git ~/.asdf
echo '. "$HOME/.asdf/asdf.sh"' >> ~/.bashrc
echo '. "$HOME/.asdf/completions/asdf.bash"' >> ~/.bashrc
echo 'legacy_version_file = yes' >> ~/.asdfrc
echo 'export EDITOR="code --wait"' >> ~/.bashrc
exec $SHELL
```

Then we can install ASDF plugins for each language we want to use. For Rails, we can install Ruby and Node.js for our frontend Javascript.

```
asdf plugin add ruby
asdf plugin add nodejs
```

**Choose the version of Ruby you want to install:**

To install Ruby and set the default version, we'll run the following commands:

```
asdf install ruby 3.3.5
asdf global ruby 3.3.5

# Update to the latest Rubygems version
gem update --system
```

Confirm the default Ruby version matches the version you just installed.

```
which ruby
#=> /home/username/.asdf/shims/ruby
ruby -v
#=> 3.3.5
```

Then we can install the latest Node.js for handling Javascript in our Rails apps:

```
asdf install nodejs 20.18.0
asdf global nodejs 20.18.0

which node
#=> /home/username/.asdf/shims/node
node -v
#=> 20.18.0

# Install yarn for Rails jsbundling/cssbundling or webpacker
npm install -g yarn
```

## C++

> Extraido de un buscador usando IA.

### C++ Installation on Ubuntu 24.04
To develop C++ applications on Ubuntu 24.04, you’ll need to install the GNU Compiler Collection (GCC) and C++ compiler. Here’s a step-by-step guide:

Update the package list: Run the following command to ensure your package list is up-to-date:

```
sudo apt update
```

Install build-essential package: This package contains essential tools for building and compiling software, including GCC and C++ compiler:

```
sudo apt install build-essential
```

Verify GCC installation: Check the GCC version using:

```
gcc --version
```

This should output the version of GCC installed on your system.

**Compiling a C++ Program**

To compile a C++ program, follow these steps:

1. Create a new file: Use your preferred text editor (e.g., nano) to create a new file with a .cpp extension (e.g., helloWorld.cpp).
Write your C++ code: Write your C++ program in the file.
2. Compile the program: Use the following command to compile your C++ program:
  ```g++ helloWorld.cpp -o helloWorld```
  This will generate an executable file named helloWorld.

**Additional Tips**

You can also use the gcc command instead of g++ for C++ compilation. However, g++ is specifically designed for C++ and provides additional features and optimizations.

If you’re using Visual Studio Code (VS Code) as your IDE, you’ll need to configure it to use the GCC C++ compiler and GDB debugger. You can do this by creating a .vscode/c_cpp_properties.json file with the following content:

```
{
  "configurations": [
    {
      "name": "Linux",
      "includePath": ["${workspaceFolder}/**"],
      "defines": [],
      "compilerPath": "/usr/bin/gcc",
      "cStandard": "c11",
      "cppStandard": "c++17",
      "intelliSenseMode": "clang-x64"
    }
  ],
  "version": 4
}
```

This configuration tells VS Code to use GCC as the C++ compiler and GDB as the debugger.

**Resources**

- Ubuntu documentation: https://ubuntu.com/
- GCC documentation: https://gcc.gnu.org/
- VS Code documentation: https://code.visualstudio.com/