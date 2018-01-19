<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Añadir</title>
<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<!--Import materialize.css-->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">

 <!--Let browser know website is optimized for mobile-->
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</head>
<body>
	<div class="container">
	<div class="row">
    <form class="col s12" action="Insertar" method="post">
      <div class="row">
        <div class="input-field col s12">
          <input id=email type="email" class="validate" name="mail">
          <label for="email">Mail</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input id="categoria" type="text" class="validate" name="categoria">
          <label for="categoria">Categoria</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input id="titulo" type="text" class="validate" name="titulo">
          <label for="titulo">Titulo</label>
        </div>
      </div>
       <div class="row">
        <div class="input-field col s12">
          <textarea id="contenido" class="materialize-textarea" name="contenido"></textarea>
          <label for="contenido">Contenido</label>
        </div>
      </div>
    </form>
	</div>
	<!--  <button class="btn waves-effect waves-light" type="submit" name="action">
    	<a href="Insertar"><i class="material-icons right">Publicar</i></a>
	 </button>-->
	 <input type="submit" value="publicar"> 
	</div>
	<!--Import jQuery before materialize.js-->
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<!-- Compiled and minified JavaScript -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>	
</body>
</html>