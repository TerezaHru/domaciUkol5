[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Přihláška na tábor</title>
    <link rel="stylesheet" href="/style.css"/>
</head>
<body>
<div class="container">
    <div class="kosik">
        <h1>Přehled</h1>
        <div>
            [#if jmeno??]
                Jméno: ${jmeno}
            [/#if]
        </div>
        <div>
            [#if prijmeni??]
                Přijmení: ${prijmeni}
            [/#if]
        </div>
        <div>
            [#if datum_narozeni??]
                Narozen(yyyy-MM-dd): ${datum_narozeni}
            [/#if]
        </div>
        <div>
            [#if vek??]
                Věk: ${vek}
            [/#if]
        </div>
        <div>
            [#if turnus??]
                Turnus: ${turnus}
            [/#if]
        </div>
        <div>
            [#if email??]
                Email: ${email}
            [/#if]
        </div>
    </div>
</div>
</body>
</html>
