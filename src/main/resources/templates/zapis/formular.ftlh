[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Přihláška na tábor</title>
    <link rel="stylesheet" href="/style.css"/>
</head>
<body>
<div class="container">
    <form class="kosik" action="/zapis" method="post">
        <h1>Přihlášení na tábor</h1>

        <label for="jmeno" class="radek">Jméno:</label>
        [@spring.formInput path="form.jmeno" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="prijmeni" class="radek">Příjmení:</label>
        [@spring.formInput path="form.prijmeni" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="datum_narozeni" class="radek">Datum narození:</label>
        [@spring.formInput path="form.datum_narozeni" fieldType="date"/]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="pohlavi" class="radek">Pohlaví:</label>
        [@spring.formSingleSelect path="form.pohlavi" options={
        "": "",
        "1": "Chlapec",
        "2": "Dívka"
        } /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="turnus" class="radek">Turnus:</label>
        [@spring.formSingleSelect path="form.turnus" options={
        "": "",
        "5.-11.července": "5.-11.července",
        "12.-18.července": "12.-18.července",
        "19.-25.července": "19.-25.července"
        } /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="email" class="radek">E-mail:</label>
        [@spring.formInput path="form.email" fieldType="email" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="telefon" class="radek">Telefon:</label>
        [@spring.formInput path="form.telefon" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>


        <div class="radek controls">
            <button type="submit">Objednat</button>
        </div>
    </form>
</div>
</body>
</html>
