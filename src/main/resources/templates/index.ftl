<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Dynamic Slider</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
    <link rel="stylesheet" href="/style.css">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			 <div class="col-xs-12 col-sm-10 col-md-8 col-lg-6 col-sm-offset-1 col-md-offset-2 col-lg-offset-3">
				<h2>Enter values and submit form</h2>
				<div id="slider"></div>
				<h4>current value: <span id="current-value">0</span></h4>
				<div class="inputs row">
					<div class="col-xs-6 col-sm-4 col-sm-offset-2">
						<input class="form-control" type="number" id="minValue" name="minValue" placeholder="min" required>
					</div>
					<div class="col-xs-6 col-sm-4">
						<input class="form-control" type="number" id="maxValue" name="maxValue" placeholder="max" required>
					</div>
					<div class="submit col-xs-4 col-xs-offset-4">
						<button class="btn btn-default btn-block" id="submit">Start</button>
					</div>
				</div>
				 <h6>*if you will not enter the values, min = 0 and max = 100</h6>
			</div>
		</div>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
    <script src="/common.js"></script>

</body>
</html>