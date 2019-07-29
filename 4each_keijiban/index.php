<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>4eachblog 掲示板</title>
  <link rel="stylesheet" type="text/css" href="style3.css">
</head>
<body>
  
  <?php
  
  mb_internal_encoding("utf8");
  $pdo = new PDO("mysql:dbname=lesson02;host=localhost;","root","mysql");
  $stmt = $pdo->query("select * from 4each_keijiban");
 
  ?>
  
  <header>
  <img src="4eachblog_logo.jpg">
  <div class="header1">
    <ul>
      <li>トップ</li>
      <li>プロフィール</li>
      <li>4eachについて</li>
      <li>登録フォーム</li>
      <li>問い合わせ</li>
      <li>その他</li>
    </ul>
  </div>
</header>
<main>
  <div class="mainall">
    <div class="mainleft">
      <p class="text1">プログラミングに役立つ掲示板</p>
      <form method="post" action="insert.php">
        <h1>入力フォーム</h1>
        <diV>
          <p>ハンドルネーム</p>
          <input type="text" name="handlename" class="handlename" size="30">
        </diV>
        <div>
          <p>タイトル</p>
          <input tyep="text" name="title" class="title" size="30">
        </div>
        <div>
          <p>コメント</p>
          <textarea name="comments" rows="10" cols="70" class="comments"></textarea>
        </div>
        <div>
          <input type="submit" value="投稿する" class="submit">
        </div>
      </form>
      
      <?php
      
      while($row = $stmt->fetch()){
        echo "<div class='toukou'>";
        echo "<h3>".$row['title']."</h3>";
        echo "<div class='naiyou'>";
        echo $row['comments'];
        echo "</div>";
        echo "<div class='name1'>posted by ".$row['handlename']."</div>";
        echo "</div>";
      }
      ?>
      
    </div>
    <div class="mainright">
      <div class="rightbox1">
        <p class="text2">人気の記事</p>
        <p>PHP オススメ本</p>
        <p>PHP MyAdminの使い方</p>
        <p>今人気のエディタ Top5</p>
        <p>HTMLの基礎</p>
      </div>
      <div class="rightbox2">
        <p class="text2">オススメリンク</p>
        <p>インターノウス株式会社</p>
        <p>XAMPPのダウンロード</p>
        <p>Eclipseのダウンロード</p>
        <p>Bracketsのダウンロード</p>
      </div>  
      <div class="rightbox3">
        <p class="text2">カテゴリ</p>
        <p>HTML</p>
        <p>PHP</p>
        <p>MySQL</p>
        <p>JavaScript</p>
      </div>
    </div>
  </div>
</main>
<footer>
  copyright © internous l 4each blog is the one which provides A to Z about programming.
</footer>
</body>
</html>