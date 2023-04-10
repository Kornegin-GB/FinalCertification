# Решение задания часть 1 (Linux)

1. задание

```bash
cat > Pets
Dogs
Cats
Hamsters

cat > 'Pack animals'
Horses
Camels
Donkeys

cat Pets 'Pack animals' > 'Human Friends' | cat 'Human Friends'
```

2. задание

```bash
mkdir frends | mv 'Human Friends' frends
```

3. задание

```bash
wget -c https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb

sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb

sudo apt install mysql-server
```

4. задание

```bash
sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb
sudo dpkg -r mysql-apt-config_0.8.24-1_all.deb
```
