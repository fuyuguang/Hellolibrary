####本地的/home/databackup to ftp服务器上的/home/data####
#!/bin/bash
ftp -n<<!
open 172.16.16.248
user fuyuguang fyg@1234
binary
hash
cd /public/fuyuguang
lcd /Users/fyg/Downloads
prompt
put ./uploadapk.sh
close
bye
!
