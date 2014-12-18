<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="HandheldFriendly" content="True">
<meta name="MobileOptimized" content="320">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">

<!-- if has title, use the title -->
{{#title}}<title>{{title}}</title>{{/title}}

<!-- No title, use default one -->
{{^title}}<title>{{sanitized-ns}}</title>{{/title}}

<link rel="shortcut icon" href="http://cdn.ink.sapo.pt/3.1.1/img/favicon.ico">
<link rel="apple-touch-icon-precomposed" href="http://cdn.ink.sapo.pt/3.1.1/img/touch-icon.57.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="http://cdn.ink.sapo.pt/3.1.1/img/touch-icon.72.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="http://cdn.ink.sapo.pt/3.1.1/img/touch-icon.114.png">
<link rel="apple-touch-startup-image" href="http://cdn.ink.sapo.pt/3.1.1/img/splash.320x460.png" media="screen and (min-device-width: 200px) and (max-device-width: 320px) and (orientation:portrait)">
<link rel="apple-touch-startup-image" href="http://cdn.ink.sapo.pt/3.1.1/img/splash.768x1004.png" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:portrait)">
<link rel="apple-touch-startup-image" href="http://cdn.ink.sapo.pt/3.1.1/img/splash.1024x748.png" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:landscape)">

<!-- load main css from cdn -->
<link rel="stylesheet" type="text/css" href="http://cdn.ink.sapo.pt/3.1.1/css/ink-flex.min.css">
<link rel="stylesheet" type="text/css" href="http://cdn.ink.sapo.pt/3.1.1/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css" href="/static/css/site.css">

        
{{#dev?}}
<!-- dev specific code -->
{{/dev?}}
{{#prod?}}
<!-- production specific code -->
{{/prod?}}

<!-- load ink css for IE8 -->
<!--[if lt IE 9 ]>
    <link rel="stylesheet" href="http://cdn.ink.sapo.pt/3.1.1/css/ink-ie.min.css" type="text/css" media="screen" title="no title" charset="utf-8">
<![endif]-->

<!-- test browser flexbox support and load legacy grid if unsupported -->
<script type="text/javascript" src="http://cdn.ink.sapo.pt/3.1.1/js/modernizr.js"></script>
<script type="text/javascript">
    Modernizr.load({
      test: Modernizr.flexbox,
      nope : 'http://cdn.ink.sapo.pt/3.1.1/css/ink-legacy.min.css'
    });
</script>
