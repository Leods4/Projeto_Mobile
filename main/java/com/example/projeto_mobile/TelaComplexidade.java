package com.example.projeto_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public class TelaComplexidade extends AppCompatActivity {

    private String ano;
    private String disciplina;

    // Map para armazenar os links de acordo com as escolhas
    private Map<String, String> linksDrive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_complexidade);

        getWindow().setStatusBarColor(android.graphics.Color.BLACK);

        ano = getIntent().getStringExtra("ano");
        disciplina = getIntent().getStringExtra("disciplina");

        // Inicializa o mapa com as URLs correspondentes
        initLinks();

        setupButton(R.id.button_facil, "Fácil");
        setupButton(R.id.button_medio, "Médio");
        setupButton(R.id.button_dificil, "Difícil");

        ImageButton homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, TelaAnos.class);
            startActivity(intent);
            finish();
        });
    }


    private void setupButton(int buttonId, String complexidade) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> {
            String chave = ano + "|" + disciplina + "|" + complexidade;
            String url = linksDrive.get(chave);

            if (url != null) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            } else {
                Toast.makeText(this, "Link não disponível para essa combinação: " + chave, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initLinks() {
        linksDrive = new HashMap<>();

        // Fundamental I
        linksDrive.put("Fundamental I|Matemática|Fácil", "https://drive.google.com/drive/folders/1vuLh9EFphUeBkuOnHaf-UuOey9L4ip-K?usp=drive_link");
        linksDrive.put("Fundamental I|Matemática|Médio", "https://drive.google.com/drive/folders/113jYU2Ng33U37l9jQT2AW1fBtVocfyVu?usp=drive_link");
        linksDrive.put("Fundamental I|Matemática|Difícil", "https://drive.google.com/drive/folders/1kdj4MI7p56EgItXIN1AJLwGqA2hlPSz4?usp=drive_link");

        linksDrive.put("Fundamental I|Língua Portuguesa|Fácil", "https://drive.google.com/drive/folders/1QiaZQ_0COzloBEx6EWQ_Prf4L7dhC4fU?usp=drive_link");
        linksDrive.put("Fundamental I|Língua Portuguesa|Médio", "https://drive.google.com/drive/folders/1scdW9_-njQb1b2NnOHrQ5lt4L7n1lYf0?usp=drive_link");
        linksDrive.put("Fundamental I|Língua Portuguesa|Difícil", "https://drive.google.com/drive/folders/1Yg_BXbqAsbiWX8EJpZYz6WLZScgKjnWA?usp=drive_link");

        linksDrive.put("Fundamental I|Língua Estrangeira|Fácil", "https://drive.google.com/drive/folders/1xBlA5q_p4b33QrbpvAqws4OU2jRREKad?usp=drive_link");
        linksDrive.put("Fundamental I|Língua Estrangeira|Médio", "https://drive.google.com/drive/folders/1wSiesUlQUnzE9RybQ915ByJbkG_ScO3b?usp=drive_link");
        linksDrive.put("Fundamental I|Língua Estrangeira|Difícil", "https://drive.google.com/drive/folders/1fUAUGthWBzaP_oX2MiXu-cfvQPO3gJeW?usp=drive_link");

        linksDrive.put("Fundamental I|Artes|Fácil", "https://drive.google.com/drive/folders/1Lvql0GelmxFciYtsVMsuUf7EQ3B-nqZy?usp=drive_link");
        linksDrive.put("Fundamental I|Artes|Médio", "https://drive.google.com/drive/folders/10oGs7Yokt2J0vXBUStSjWZY6u2bVdvP2?usp=drive_link");
        linksDrive.put("Fundamental I|Artes|Difícil", "https://drive.google.com/drive/folders/1gPiWZ-AzuyuUdD1sTE6U9mJ15fAkUAst?usp=drive_link");

        linksDrive.put("Fundamental I|História|Fácil", "https://drive.google.com/drive/folders/1fwam8OT4-KLOT3X2kZvL92rlu59fDIBU?usp=drive_link");
        linksDrive.put("Fundamental I|História|Médio", "https://drive.google.com/drive/folders/1naD78vIrj37yutsIn21nxcBukWmAfaaS?usp=drive_link");
        linksDrive.put("Fundamental I|História|Difícil", "https://drive.google.com/drive/folders/1kLslOSQHra-I0dsLda4pcDTOf9v-QwuW?usp=drive_link");

        linksDrive.put("Fundamental I|Geografia|Fácil", "https://drive.google.com/drive/folders/1A-By-zVDsKMrj0M3apN3G1lxOkWh5N2_?usp=drive_link");
        linksDrive.put("Fundamental I|Geografia|Médio", "https://drive.google.com/drive/folders/1mZXZ4s6T45gRWYF57jIUMOAPyTWyc5d_?usp=drive_link");
        linksDrive.put("Fundamental I|Geografia|Difícil", "https://drive.google.com/drive/folders/1RfvqyxT-pkbb-GmCVsKDEjQ5PndBgLn-?usp=drive_link");

        linksDrive.put("Fundamental I|Ciências|Fácil", "https://drive.google.com/drive/folders/1RD99a5VCZp5gxRygrzhqV8TN_BuGhvxI?usp=drive_link");
        linksDrive.put("Fundamental I|Ciências|Médio", "https://drive.google.com/drive/folders/1FaWdUsnENP85yhL_1nUN5P32xMB1yKrF?usp=drive_link");
        linksDrive.put("Fundamental I|Ciências|Difícil", "https://drive.google.com/drive/folders/12ymziZ_DaaagKO_KzHrEbCheASalqrdN?usp=drive_link");

        linksDrive.put("Fundamental I|Educação Física|Fácil", "https://drive.google.com/drive/folders/18hUTG10G4PG4S-RK11heVjJcwiXtvNEt?usp=drive_link");
        linksDrive.put("Fundamental I|Educação Física|Médio", "https://drive.google.com/drive/folders/1HXwRk8m0jnRTtVYIaYjy_ZnfFtynvKms?usp=drive_link");
        linksDrive.put("Fundamental I|Educação Física|Difícil", "https://drive.google.com/drive/folders/1ckZuETLr1Qm8GsQXICNrnCxe9Kh-a8aa?usp=drive_link");

        linksDrive.put("Fundamental I|Ensino Religioso|Fácil", "https://drive.google.com/drive/folders/1_ILFFxmGqiPnHFa0iFYV65_Tg9bO9bxP?usp=drive_link");
        linksDrive.put("Fundamental I|Ensino Religioso|Médio", "https://drive.google.com/drive/folders/1fwZw-8UTs84LvjHfCjJgmUsBxLJa6jmQ?usp=drive_link");
        linksDrive.put("Fundamental I|Ensino Religioso|Difícil", "https://drive.google.com/drive/folders/1HBDVrTUaYQGBcJ9tjs1UqveTJcsioa1y?usp=drive_link");


        linksDrive.put("Fundamental I|Outras|Fácil", "https://drive.google.com/drive/folders/13MmooYmo-qKIaOnwya5cMGOoR6Weznat?usp=drive_link");
        linksDrive.put("Fundamental I|Outras|Médio", "https://drive.google.com/drive/folders/1h0FErpbBSyG0q952lX6gyyH2BqGPDR2a?usp=drive_link");
        linksDrive.put("Fundamental I|Outras|Difícil", "https://drive.google.com/drive/folders/1uuIqC9qt8OIghxxL896MNk_ZSbLCHYpH?usp=sharing");

        // Fundamental II
        linksDrive.put("Fundamental II|Matemática|Fácil", "https://drive.google.com/drive/folders/1nwKcfjqazLCM4bBK89ygYcYns9UqgVK4?usp=drive_link");
        linksDrive.put("Fundamental II|Matemática|Médio", "https://drive.google.com/drive/folders/1TGKLcaLiMkD82qthTY26Lt5butOClPKq?usp=drive_link");
        linksDrive.put("Fundamental II|Matemática|Difícil", "https://drive.google.com/drive/folders/1BVg8f3IgIcPZQBmZypeoEqq_bgkPkvjk?usp=drive_link");

        linksDrive.put("Fundamental II|Língua Portuguesa|Fácil", "https://drive.google.com/drive/folders/1jTwFUafQnveH4xKTkatLm76JH9_zUJZP?usp=drive_link");
        linksDrive.put("Fundamental II|Língua Portuguesa|Médio", "https://drive.google.com/drive/folders/1siGXA5oogQcG0ebisUMalX9FfAzrsYTu?usp=drive_link");
        linksDrive.put("Fundamental II|Língua Portuguesa|Difícil", "https://drive.google.com/drive/folders/1Ub6eJXrsjh6a1LTuawAL7NMYoInW2FCs?usp=drive_link");

        linksDrive.put("Fundamental II|Língua Estrangeira|Fácil", "https://drive.google.com/drive/folders/1UJf0qpK7e_7zTwvAcI82v-mn6AcLsbqj?usp=drive_link");
        linksDrive.put("Fundamental II|Língua Estrangeira|Médio", "https://drive.google.com/drive/folders/1DMzljaK24gxefrAPX3RpizoOqosWIsQy?usp=drive_link");
        linksDrive.put("Fundamental II|Língua Estrangeira|Difícil", "https://drive.google.com/drive/folders/14rKTW5dKTs9AptM-oXnny2SVVkFTuuah?usp=drive_link");

        linksDrive.put("Fundamental II|Artes|Fácil", "https://drive.google.com/drive/folders/1Nx06J2IoacCxpmJuJ4LpfcbE2DODQCyV?usp=drive_link");
        linksDrive.put("Fundamental II|Artes|Médio", "https://drive.google.com/drive/folders/1WcHAS5Mh3gh5fOt-u3TQ82sx7RkbGolS?usp=drive_link");
        linksDrive.put("Fundamental II|Artes|Difícil", "https://drive.google.com/drive/folders/1L8G323VvBuzcK5Jyx0jPCBL1bXjEevG8?usp=drive_link");

        linksDrive.put("Fundamental II|História|Fácil", "https://drive.google.com/drive/folders/1KMZ_At3ChSdAz7ngIp6eIBmD2KhEVOCZ?usp=drive_link");
        linksDrive.put("Fundamental II|História|Médio", "https://drive.google.com/drive/folders/14eHUdaQKeopNkCV-XQtpvgz643ENVKZ8?usp=drive_link");
        linksDrive.put("Fundamental II|História|Difícil", "https://drive.google.com/drive/folders/1U5IgMYOCAbiG8gnIh6-YbEhxTCpjRe7z?usp=drive_link");

        linksDrive.put("Fundamental II|Geografia|Fácil", "https://drive.google.com/drive/folders/1Q-lqu5ZWtZGOKklasyBpTzvUpTXJuWE9?usp=drive_link");
        linksDrive.put("Fundamental II|Geografia|Médio", "https://drive.google.com/drive/folders/1OaNLByUduzNaBi2pL00l3WrpC9rEZhxe?usp=drive_link");
        linksDrive.put("Fundamental II|Geografia|Difícil", "https://drive.google.com/drive/folders/1BG8OM2510ugx-Nunl18r66w73Y46Napw?usp=drive_link");

        linksDrive.put("Fundamental II|Ciências|Fácil", "https://drive.google.com/drive/folders/13wVQH-i3w8aGQP7tR6QpyY7NsA2vKjyL?usp=drive_link");
        linksDrive.put("Fundamental II|Ciências|Médio", "https://drive.google.com/drive/folders/1_2H9os5MLRLqeDVvOFpl9n9VP2QCQ5ZB?usp=drive_link");
        linksDrive.put("Fundamental II|Ciências|Difícil", "https://drive.google.com/drive/folders/1tYC8UzHzozgrj9bD5FSKD42mFp8V4C5o?usp=drive_link");

        linksDrive.put("Fundamental II|Educação Física|Fácil", "https://drive.google.com/drive/folders/1ZQGaME-5fkGQaVxxEQbvHFzWpQztixs3?usp=drive_link");
        linksDrive.put("Fundamental II|Educação Física|Médio", "https://drive.google.com/drive/folders/1L_3KOnrH9iMIT2s1ZzQ7krrEI659uxTY?usp=drive_link");
        linksDrive.put("Fundamental II|Educação Física|Difícil", "https://drive.google.com/drive/folders/1LxYXOoovRE3UUw0yNOrFqATU3jqWi8Lc?usp=drive_link");

        linksDrive.put("Fundamental II|Ensino Religioso|Fácil", "https://drive.google.com/drive/folders/1YhuZayihM4IRZJ6LSv3TZ9oMCvxUpU7X?usp=drive_link");
        linksDrive.put("Fundamental II|Ensino Religioso|Médio", "https://drive.google.com/drive/folders/1EYXpusHvxY0J8Vovh1XeYHFCba1K8vjq?usp=drive_link");
        linksDrive.put("Fundamental II|Ensino Religioso|Difícil", "https://drive.google.com/drive/folders/1wls3BCk8-jIc3PMaKWjQyyen1OJ0lnv3?usp=drive_link");

        linksDrive.put("Fundamental II|Outras|Fácil", "https://drive.google.com/drive/folders/1vSeNbJcDHYwPds_4f9_vsGwWJCVFdiQy?usp=drive_link");
        linksDrive.put("Fundamental II|Outras|Médio", "https://drive.google.com/drive/folders/187kt-sCnXC50NJFsaaXd5jjcBWWy5Hxl?usp=drive_link");
        linksDrive.put("Fundamental II|Outras|Difícil", "https://drive.google.com/drive/folders/1hWHIiYWAP3TWZvEXUOn5Er918gZS75XZ?usp=drive_link");

        // Ensino Médio 1
        linksDrive.put("Ensino Médio 1|Matemática|Fácil", "https://drive.google.com/drive/folders/104JJHGso9-5-quFcgUavLtRTtAlVSnjW");
        linksDrive.put("Ensino Médio 1|Matemática|Médio", "https://drive.google.com/drive/folders/1fN5_kZYVzw--jGplFYqZiAN0hUMYp77P");
        linksDrive.put("Ensino Médio 1|Matemática|Difícil", "https://drive.google.com/drive/folders/1DsFWZHI9kS6cPY8nqY-fqtP1LcSobf9R");

        linksDrive.put("Ensino Médio 1|Língua Portuguesa|Fácil", "https://drive.google.com/drive/folders/12E94kELiUBS_XF1JrgoIYNWs6i-r5ZHU");
        linksDrive.put("Ensino Médio 1|Língua Portuguesa|Médio", "https://drive.google.com/drive/folders/1KbUJPFHc87qfhZj5pGy4peYVXZvkL5fe");
        linksDrive.put("Ensino Médio 1|Língua Portuguesa|Difícil", "https://drive.google.com/drive/folders/1vhWL2m1IicXz8JobN1hMTmYyqZCdEnIu");

        linksDrive.put("Ensino Médio 1|Língua Estrangeira|Fácil", "https://drive.google.com/drive/folders/19_Kt1UNH13tvyjFM679YYgyzWTz_b0yM");
        linksDrive.put("Ensino Médio 1|Língua Estrangeira|Médio", "https://drive.google.com/drive/folders/1FPh50vYhfAh7ZKIhgUFPSYLv7ioMGW3d");
        linksDrive.put("Ensino Médio 1|Língua Estrangeira|Difícil", "https://drive.google.com/drive/folders/1sBrc3-uxE-objMdpHlQP3MF7fBoD7J6T");

        linksDrive.put("Ensino Médio 1|Artes|Fácil", "https://drive.google.com/drive/folders/14MKsJT347k1Z9yTlzAhckZSQn_GnoqF2");
        linksDrive.put("Ensino Médio 1|Artes|Médio", "https://drive.google.com/drive/folders/10nyfTMlE_hVOjtz6QA2BikaATXUXB47p");
        linksDrive.put("Ensino Médio 1|Artes|Difícil", "https://drive.google.com/drive/folders/1Lu9O89GO2DD42XER8Cag6LOMddbk4b7y");

        linksDrive.put("Ensino Médio 1|História|Fácil", "https://drive.google.com/drive/folders/14_pAn8nkv0krZc-Zozu6RmWrdV3DKF1N");
        linksDrive.put("Ensino Médio 1|História|Médio", "https://drive.google.com/drive/folders/1HD6mz-DqhH3AKIVkGmF8nSibyuNjejky");
        linksDrive.put("Ensino Médio 1|História|Difícil", "https://drive.google.com/drive/folders/1NpLriOj9YOGWnpziuRhpjBEdCHjK9Xud");

        linksDrive.put("Ensino Médio 1|Geografia|Fácil", "https://drive.google.com/drive/folders/19Tz8LbWRYb4ZmIsVtz0lGh2GsVzwtmk1");
        linksDrive.put("Ensino Médio 1|Geografia|Médio", "https://drive.google.com/drive/folders/1UdJVVpi-ppuT94Jl_nR43h94aXvN8aBW");
        linksDrive.put("Ensino Médio 1|Geografia|Difícil", "https://drive.google.com/drive/folders/1p1bE-2Y9_HTGdp7cgu9Y5ZXHhKltKjM-");

        linksDrive.put("Ensino Médio 1|Ciências|Fácil", "https://drive.google.com/drive/folders/16uRrsasj7JLPhLJrigXUiVvqFsWI1yZE"); // Biologia
        linksDrive.put("Ensino Médio 1|Ciências|Médio", "https://drive.google.com/drive/folders/1wdAIJhcoaw9fP0BTSBcbGuJQzNxNzkzB");
        linksDrive.put("Ensino Médio 1|Ciências|Difícil", "https://drive.google.com/drive/folders/1ZZWVKNKiEp2xaPRWtn4cRkiVZYJqYqOH");

        linksDrive.put("Ensino Médio 1|Física|Fácil", "https://drive.google.com/drive/folders/1-q9OvfDrtuWBrPPB_amQbcFLLkCRA4ma");
        linksDrive.put("Ensino Médio 1|Física|Médio", "https://drive.google.com/drive/folders/1NjaOrLJzhVpJ_uY-szRjqOiXVc1kTgry");
        linksDrive.put("Ensino Médio 1|Física|Difícil", "https://drive.google.com/drive/folders/1fBV3C8RG7hxhBqPK-j5VIq6KzvHLriMG");

        linksDrive.put("Ensino Médio 1|Química|Fácil", "https://drive.google.com/drive/folders/12XMzwRYPF4RterSPEoQGnK0AZTH3NWnr");
        linksDrive.put("Ensino Médio 1|Química|Médio", "https://drive.google.com/drive/folders/1Li5InvvP0W5ZVTSljXsU77DFbIcZyCgP");
        linksDrive.put("Ensino Médio 1|Química|Difícil", "https://drive.google.com/drive/folders/1__m-69nP8jf7_UA2AOgtXE9R95Axevas");

        linksDrive.put("Ensino Médio 1|Filosofia|Fácil", "https://drive.google.com/drive/folders/1oiaD9POhzQTYkWMq7n1ldUfhr-dOgYM0");
        linksDrive.put("Ensino Médio 1|Filosofia|Médio", "https://drive.google.com/drive/folders/1u7VyA4aLwzYUbvY8D8dhf5evRnYyh7W9");
        linksDrive.put("Ensino Médio 1|Filosofia|Difícil", "https://drive.google.com/drive/folders/1wHcF7FhvAiQ6JyEzFJ7E2j1YKkJ374uR");

        linksDrive.put("Ensino Médio 1|Sociologia|Fácil", "https://drive.google.com/drive/folders/1azFcMJruj8GvO2dOIqOQcwwn_hO3JPcB");
        linksDrive.put("Ensino Médio 1|Sociologia|Médio", "https://drive.google.com/drive/folders/1rCVT99V2OacP1uw7okVzwwsGu822mhMg");
        linksDrive.put("Ensino Médio 1|Sociologia|Difícil", "https://drive.google.com/drive/folders/1gss-PIsvOyuF34Umt7-F9vR_EbWNpHVd");

        linksDrive.put("Ensino Médio 1|Educação Física|Fácil", "https://drive.google.com/drive/folders/1BuoW5AXqVxcGqHDt29m1FMQQx9yIzb2w");
        linksDrive.put("Ensino Médio 1|Educação Física|Médio", "https://drive.google.com/drive/folders/1bstTLwrqd3IFwxoUsTI-WJJaDe2XLIBY");
        linksDrive.put("Ensino Médio 1|Educação Física|Difícil", "https://drive.google.com/drive/folders/18Ez-ql64zqV73JSb13wgvnFmNV8Pt7QZ");

        linksDrive.put("Ensino Médio 1|Outras|Fácil", "https://drive.google.com/drive/folders/1SmQHUh_uxDvk4SNzssPsaKVIlzlh45n3");
        linksDrive.put("Ensino Médio 1|Outras|Médio", "https://drive.google.com/drive/folders/16OxHZ3-c5KA2jwxw0nwMtDBQxBLXuR5e");
        linksDrive.put("Ensino Médio 1|Outras|Difícil", "https://drive.google.com/drive/folders/1KNpiwysMOB9irD3QmGpik9-XC1bjzqPS");


        // Ensino Médio 2
        linksDrive.put("Ensino Médio 2|Artes|Fácil", "https://drive.google.com/drive/folders/1BKQ6zr3PStUjCFP0tC0Q5X1k6UMpYcFD?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Artes|Médio", "https://drive.google.com/drive/folders/1cRSy2-oQQdHwrQl1eUrEsaouW7JIt8QL?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Artes|Difícil", "https://drive.google.com/drive/folders/1yXyCbeaeIYcID84A8qB2wDYbkTI9Q0iv?usp=drive_link");

        linksDrive.put("Ensino Médio 2|Biologia|Fácil", "https://drive.google.com/drive/folders/1UYYofVYR0WF3JrBt4zlWyFF4o9hE3oLM?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Biologia|Médio", "https://drive.google.com/drive/folders/1GcU6L3GCdWVhU8iA_nRNDbahHV-zbHM4?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Biologia|Difícil", "https://drive.google.com/drive/folders/1Q1I2_QDGOF-LnqvoET3X5fauJTtf2vBI?usp=drive_link");

        linksDrive.put("Ensino Médio 2|Educação Física|Fácil", "https://drive.google.com/drive/folders/18RvnLDRFI5kIf0ttJPzzxLpq7VzPHgVL?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Educação Física|Médio", "https://drive.google.com/drive/folders/1_5yxqefiZG3x5SjOTl8T30RodGmd_BRk?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Educação Física|Difícil", "https://drive.google.com/drive/folders/1I2AbpHlsTPE4rDiwFaX_Gai5hb_bMX4O?usp=drive_link");

        linksDrive.put("Ensino Médio 2|Filosofia|Fácil", "https://drive.google.com/drive/folders/1M8U4xTmTu85C1ECso323NKhwUnyj2NJk?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Filosofia|Médio", "https://drive.google.com/drive/folders/1aYtnt_815d3LNj-4U-U0jWnfrv1WmShs?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Filosofia|Difícil", "https://drive.google.com/drive/folders/1D9w_r0QLsHTIoUrXROkCSo7FoBOzRIGE?usp=drive_link");

        linksDrive.put("Ensino Médio 2|Física|Fácil", "https://drive.google.com/drive/folders/1hJDosmdvXnG1VXMfQ0rk_28SCbrL4YZ-?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Física|Médio", "https://drive.google.com/drive/folders/1AuIlg9p3opdOdNE50te-olQBatxpI_gK?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Física|Difícil", "https://drive.google.com/drive/folders/1jFj_Z0PM-hg27pxm-c5aiN5k9PBUwn_L?usp=drive_link");

        linksDrive.put("Ensino Médio 2|Geografia|Fácil", "https://drive.google.com/drive/folders/1ADRzzRgXeBulOTTBACbRLVg8LYZsbHAF?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Geografia|Médio", "https://drive.google.com/drive/folders/1eOBMYiyAAs9lkYx5z8P2hWaUL1VJKTe0?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Geografia|Difícil", "https://drive.google.com/drive/folders/1_vR0_-JjIpZWN02hs2jeW6YJJK82unRm?usp=drive_link");

        linksDrive.put("Ensino Médio 2|História|Fácil", "https://drive.google.com/drive/folders/11GGt69uxG8HTcfx1vJ_54w_N-_ee0U2j?usp=drive_link");
        linksDrive.put("Ensino Médio 2|História|Médio", "https://drive.google.com/drive/folders/1OA4t755kWcP55P9bvsQLfe0npWAe_dOC?usp=drive_link");
        linksDrive.put("Ensino Médio 2|História|Difícil", "https://drive.google.com/drive/folders/1vbQ1lykneaM8N_jbZzwMOCd-lbdMb-B7?usp=drive_link");

        linksDrive.put("Ensino Médio 2|Língua Estrangeira|Fácil", "https://drive.google.com/drive/folders/1NnVxkd9TxRMDF2JgUA6x_rfCXeC4_Sa2?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Língua Estrangeira|Médio", "https://drive.google.com/drive/folders/1OvPdoAW9ZKNtrlseC89g52s_9znFNZYh?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Língua Estrangeira|Difícil", "https://drive.google.com/drive/folders/1uh-kXy7wGhTV9aTVKBnkl3DanDMd4GEC?usp=sharing");

        linksDrive.put("Ensino Médio 2|Língua Portuguesa|Fácil", "https://drive.google.com/drive/folders/18HsZ_ec_0kEm6cT9Nqf9zJcQgSFRChfl?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Língua Portuguesa|Médio", "https://drive.google.com/drive/folders/1-zVXxn9As8P-eUJ3VLUnBIIKSeY3ojgs?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Língua Portuguesa|Difícil", "https://drive.google.com/drive/folders/1E0kyQoSMtJnwZAqLfTLY74ZI1fxHiuUh?usp=drive_link");

        linksDrive.put("Ensino Médio 2|Matemática|Fácil", "https://drive.google.com/drive/folders/1ML1zyj1JyBD9US_uiL3_eiVJDx-tji0R?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Matemática|Médio", "https://drive.google.com/drive/folders/1Hq00p7bXzafx29kgYEiQsu1kkG0VwDFF?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Matemática|Difícil", "https://drive.google.com/drive/folders/1BWNFuLfDi1HIJbmJb3rSoM71TQHDaB-s?usp=drive_link");

        linksDrive.put("Ensino Médio 2|Química|Fácil", "https://drive.google.com/drive/folders/1iaU4v7ALG62Ng6-bBy6ceg_fYUsegu7s?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Química|Médio", "https://drive.google.com/drive/folders/1IS5a4eqJSB_09HMEHrHyrHUhT609sT38?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Química|Difícil", "https://drive.google.com/drive/folders/1767khx1lKeD2nUt0MZGi7nFTmR436KDa?usp=drive_link");

        linksDrive.put("Ensino Médio 2|Sociologia|Fácil", "https://drive.google.com/drive/folders/1QaKBR2Gv5afblQ4vRFsbMS-l2SsHmChn?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Sociologia|Médio", "https://drive.google.com/drive/folders/1od8nJ1ORn4wSzpzo0rWTTrEGBj61Sft_?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Sociologia|Difícil", "https://drive.google.com/drive/folders/1PxvQeBI1kIgv9g5H7P0aaiiFNneG-deI?usp=drive_link");

        linksDrive.put("Ensino Médio 2|Outras|Fácil", "https://drive.google.com/drive/folders/1OEjWTxjWdYklhQtqV0IeM9LVSfdxpVEZ?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Outras|Médio", "https://drive.google.com/drive/folders/1qwsVanNlfOov6C0CENhPrcn9Swtv46h9?usp=drive_link");
        linksDrive.put("Ensino Médio 2|Outras|Difícil", "https://drive.google.com/drive/folders/1h_RCYXnmiTa2meyzPNF-kTpAuTAEHFnh?usp=drive_link");


        // Ensino Médio 3
        linksDrive.put("Ensino Médio 3|Matemática|Fácil", "https://drive.google.com/drive/folders/1FGJ_rGjym_K6mLbtPdB8DYhGS8AFay5S?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Matemática|Médio", "https://drive.google.com/drive/folders/1-K6Wesd3w95upvwd6_413400r6iVYuEN?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Matemática|Difícil", "https://drive.google.com/drive/folders/1q7W3gTdZaQEEEh6nefPNOcGFu2wJlpv8?usp=drive_link");

        linksDrive.put("Ensino Médio 3|Língua Portuguesa|Fácil", "https://drive.google.com/drive/folders/1k4UaTHL3x_DpOFAJNoNd30LP-KgVyTx1?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Língua Portuguesa|Médio", "https://drive.google.com/drive/folders/1xPetSO-DyShK7fBHYPOGx7wPzIAVrtVp?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Língua Portuguesa|Difícil", "https://drive.google.com/drive/folders/1_4gcMJtBD6bUjyylPqNhbiKj0PbNAUKZ?usp=drive_link");

        linksDrive.put("Ensino Médio 3|Língua Estrangeira|Fácil", "https://drive.google.com/drive/folders/1HrYi5RdwgvH4iaqydIAmKEtZ-noqSLZS?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Língua Estrangeira|Médio", "https://drive.google.com/drive/folders/1QsOqxBRMQ9fmwV1kj6YTeQHT7o5jbEUO?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Língua Estrangeira|Difícil", "https://drive.google.com/drive/folders/1uUVlZS6eQm7AI5Eihimww17MondAHMx9?usp=drive_link");

        linksDrive.put("Ensino Médio 3|Artes|Fácil", "https://drive.google.com/drive/folders/17KJWEdgGEWo0HRv6ESGCNnxRM82s1-gD?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Artes|Médio", "https://drive.google.com/drive/folders/1BNoZnHFFnvQsn2amK5NtCp9vVY7b-RjN?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Artes|Difícil", "https://drive.google.com/drive/folders/1KgHNNlXJK71eWTWX6Cbb88eKeKMJ3vYK?usp=drive_link");

        linksDrive.put("Ensino Médio 3|História|Fácil", "https://drive.google.com/drive/folders/1eVCSn6MeZxiy3088XzTq0rCUTkd2B2X9?usp=drive_link");
        linksDrive.put("Ensino Médio 3|História|Médio", "https://drive.google.com/drive/folders/1uqylqFx84aYGpgrWR9fU8w3-WuC_h5Vy?usp=drive_link");
        linksDrive.put("Ensino Médio 3|História|Difícil", "https://drive.google.com/drive/folders/1IOEAYgA8KNtQjpI29Vpmg8IMLOR1oaZ2?usp=drive_link");

        linksDrive.put("Ensino Médio 3|Geografia|Fácil", "https://drive.google.com/drive/folders/10TXDxmn0xmLe62LR2UMLldM_ulfj-q7n?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Geografia|Médio", "https://drive.google.com/drive/folders/1_BSdka9Qehips16NlU-7X8rgd4xJuXxy?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Geografia|Difícil", "https://drive.google.com/drive/folders/1qGK0ekAaLkWWWH5PCwE4Y0dpOAVBzXWX?usp=drive_link");

        linksDrive.put("Ensino Médio 3|Ciências|Fácil", "https://drive.google.com/drive/folders/1-XpRa9dTRHwOvP4G3LVmHPpTk3CKf3_f?usp=sharing");  // Biologia fácil
        linksDrive.put("Ensino Médio 3|Ciências|Médio", "https://drive.google.com/drive/folders/1DwV6FQQtNg5INWZ1XbQl83wNauRYdM-j?usp=drive_link");   // Biologia médio
        linksDrive.put("Ensino Médio 3|Ciências|Difícil", "https://drive.google.com/drive/folders/14IroyNXktgUh1FjSXetdFSz-2suLSHyE?usp=drive_link");  // Biologia difícil

        // Adicionando Química para Ciências (com links próprios)
        linksDrive.put("Ensino Médio 3|Química|Fácil", "https://drive.google.com/drive/folders/1E_6mjtO4TiWBZZlnEwaQ4f7KUHUakJO0?usp=sharing");
        linksDrive.put("Ensino Médio 3|Química|Médio", "https://drive.google.com/drive/folders/1_GmQRTAa0vjURwJrjFqAiCc0H1hIVmgU?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Química|Difícil", "https://drive.google.com/drive/folders/1nbYrHWtDMmKzxxTDRpDSGsw-e_vuhroV?usp=drive_link");

        linksDrive.put("Ensino Médio 3|Educação Física|Fácil", "https://drive.google.com/drive/folders/1NE13EHndhws79HMSc7qa11UJG1Je9ygr?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Educação Física|Médio", "https://drive.google.com/drive/folders/12yf3RWcyQCPBufgVpKzNJ_nCpCwaEoio?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Educação Física|Difícil", "https://drive.google.com/drive/folders/1oW4jDat7wNwOE6y_x-4TAoCl_9dSsSV0?usp=drive_link");

        linksDrive.put("Ensino Médio 3|Filosofia|Fácil", "https://drive.google.com/drive/folders/1iint3Dpa7tB8uJ-5yHjCoMhnUKWhLtxz?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Filosofia|Médio", "https://drive.google.com/drive/folders/1DL6tAF8sWVqyxPvjR88P8JwQBiCmrTlw?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Filosofia|Difícil", "https://drive.google.com/drive/folders/1WaFzFQCoXva-gy4VZygBg1SVJB2w5Pax?usp=drive_link");

        linksDrive.put("Ensino Médio 3|Física|Fácil", "https://drive.google.com/drive/folders/1BnBDewfeyz4X3oIDWsXZld5txMJTljI4?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Física|Médio", "https://drive.google.com/drive/folders/13FI2CeIW-LXE_KvM3hMJLCduksFhrYD3?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Física|Difícil", "https://drive.google.com/drive/folders/1l26drjCmWrl8xVwLdsUfn3t-c-s2rFFa?usp=drive_link");

        linksDrive.put("Ensino Médio 3|Sociologia|Fácil", "https://drive.google.com/drive/folders/1yvWv64gb87rXusHkyG6IdV8bB5VnPjOe?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Sociologia|Médio", "https://drive.google.com/drive/folders/1s-fjHk5EYpkFz0SNzf5r-nMS3v2g_7RN?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Sociologia|Difícil", "https://drive.google.com/drive/folders/1Ku2ZsrP_pdklFefiUoFs2c1n19llNXtK?usp=drive_link");

        linksDrive.put("Ensino Médio 3|Outras|Fácil", "https://drive.google.com/drive/folders/10GA7vc3Lfo6WvukRI7UO49FCg8oJWnj2?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Outras|Médio", "https://drive.google.com/drive/folders/1Sb2GH7PNAqS_dTjbU3zjqWteNCIZGz91?usp=drive_link");
        linksDrive.put("Ensino Médio 3|Outras|Difícil", "https://drive.google.com/drive/folders/17zHkfJUw9qS0bopNwQvcU9ROvmQZWHgI?usp=drive_link");


    }

}