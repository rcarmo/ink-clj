<!DOCTYPE html>
<html lang="en">
    <head>
        {{>partials/head}}
    </head>
 
    <body>
        {{>partials/header}}
        <div id="page-content" class="ink-grid content-drawer">
            <div class="page-header">
              <h1 class="slab">Welcome to {{title}}</h1>
            </div>
            
            <p>Your user agent is {{user-agent}}</p>

            <h3>Example list</h3>
            <ul>
                {{#list}}
                <li>{{ . }}</li>
                {{/list}}
            </ul>
        </div>
        {{>partials/footer}}
    </body>
</html>






