# Setup Notes

## Open Spark UI in a browser from Ubuntu on Windows 

[Run firefox with bash for Windows 10]( https://ethanvanderbuilt.com/how-to-run-the-firefox-web-browser-with-bash-for-windows-10/ )

- Required: install a X server e.g. https://x.cygwin.com/ on windows 10

- Install firefox

```shell
apt-get -y install firefox
export DISPLAY=:0
echo "export DISPLAY=:0" >> ~/.bashrc
```

- Then type at the bash prompt: ``firefox http://localhost:4040``


- Alternatively, install xdg utils
 
```shell
sudo apt -y install xdg-utils
```

Then open the default browser using: 

```shell
xdg-open http://localhost:4040
```

You may also use ``sensible-browser``, which is installed by default