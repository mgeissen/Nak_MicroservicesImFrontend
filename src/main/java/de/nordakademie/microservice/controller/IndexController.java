package de.nordakademie.microservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * You should not touch this file. It is just for providing some general debug information
 * and contact details about this seminar.
 */

@Controller
public class IndexController {

    private final String contextPath;
    private final Integer localPort;

    public IndexController(
            @Value("${server.servlet.context-path:/}") String contextPath,
            @Value("${server.port}") Integer localPort
    ) {
        this.contextPath = contextPath;
        this.localPort = localPort;
    }

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("adrianBase64", ADRIAN_BASE64);
        modelAndView.addObject("matthiasBase64", MATTHIAS_BASE64);
        modelAndView.addObject("teamsIconBase64", TEAMS_ICON);
        modelAndView.addObject("linkedInIconBase64", LINKED_IN_ICON);

        modelAndView.addObject("contextPath", contextPath);
        modelAndView.addObject("localPort", localPort);
        return modelAndView;
    }

    private static final String ADRIAN_BASE64 = "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";
    private static final String MATTHIAS_BASE64 = "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";

    private static final String TEAMS_ICON = "iVBORw0KGgoAAAANSUhEUgAADwAAAAhwAgMAAADt0CPhAAAACVBMVEVHcExUV67/\n" +
            "//+mTRiNAAAAAXRSTlMAQObYZgAAIjJJREFUeNrt3U2O28bWgGEK6J63AXsVdxMM\n" +
            "kMwVoHuV6oEWYCC1gOykG7DmIsA7CJw4TneLRVGsOqznmXw/106uab0+pyhKvuuA\n" +
            "sO5cAhAwIGBAwCBgQMCAgAEBg4ABAQMCBgEDAgYEDAgYBAwIGBAwIGAQMCBgQMAg\n" +
            "YEDAgIABAYOAAQEDAgYEDAIGBAwIGAQMCBgQMCBgEDAgYEDAIGBAwICAAQGDgAEB\n" +
            "AwIGBAwCBgQMCBgEDAgYEDAgYBAwIGBAwICAQcCAgAEBg4ABAQMCBgQMAgYEDAgY\n" +
            "EDAImA348r/kIgiYoJ66FxdBwMR0v3cNBEzY9bl3DQRMULtH10DAWJ8RMNZnBIz1\n" +
            "WcAYvwgY/SJgrM8IGONXwMT35BIIGOszAsb6jICxPgsY9SJg9IuAWZhPLggY4xcB\n" +
            "szrvHQkY6zMCxvqMgLE+C5gGePRKwFifETDWZwSM9RkBG78IGP0iYKzPCJh/uPss\n" +
            "YExfBIzpi4CZyCcXBIzxi4DRLwLG+oyAjV8ETL08eiVgrM8IGOszAsb6jIAb4NlJ\n" +
            "AWN9RsBYnxEw1mcEbPwiYExfBIzpi4D5zqNXAsb6jICxPiNgrM8IuAEevULA1mcE\n" +
            "jPUZAWN9RsDGLwJGvwgY6zMCxvhFwBvg2UkEbH1GwJi+CJiJPHqFgONy8woBW58R\n" +
            "MNZnBIzxi4D1i4CxPiNglufuMwKOy6NXCNj6jICxPiNgrM8I2PgFAesXAaNeBMx3\n" +
            "Hr1CwHG5eYWArc8IGOszAmYqj14hYOszAsb6jICxPiNg4xcErF8EjPUZAWP8IuAt\n" +
            "8OwkArY+I2CszwiYiTx6hYBNXwTM+ty8QsDWZwSM8YuA0S8Ctj6DgI1fBMziPHqF\n" +
            "gK3PIGDrMwLG+oyAG+DZSQRs/IKA9YuAsT4j4M3z3hECNn1BwOvz3i8Ctj6DgI1f\n" +
            "BIx+EbD1GQRs/CJgFufRKwRsfQYBW58RMNZnBNwAz04iYOszCNj6jICxPiNg0xcE\n" +
            "bPqCgI1fBMx3Hr1CwNZnELD1GQFjfUbADfDoFQK2PoOArc8IGOszAjZ+QcD6BQFb\n" +
            "nxEwxi8C3gDPTiJg0xcEbPoiYCby6BUCtj6DgK3PCBjrMwI2fkHA+gUBW58RMMYv\n" +
            "At4Cn1xAwNZnEPDqPLyBgK3PIGDjFwSsXwSsXhBwtbz3i4DjcvMKAVufQcDWZxDw\n" +
            "VB69QsDWZxCw9RkEbH1GwMYvCFi/IGDrMwLG+EXAW+DZSQRsfQYBW59BwBN59AoB\n" +
            "m74g4PW5eYWArc8gYOMXBKxfBGx9BgEbvyDgxXn0CgFbn0HA1mcQsPUZATfAs5MI\n" +
            "2PoMArY+g4CtzwjY9AUBm74gYOMXBPydR68QsPUZBLw+7/0iYOszCNj4BQHrFwFb\n" +
            "n0HAxi8IeHEe3kDA1mcQsPUZBKxf8K2UIGBAwICAQcCAgAEBAwIGAQMCBgQMAgYE\n" +
            "DAgYEDAIGBAwIGBAwCBgQMCAgEHAgIABAQMCBgEDAgYEDAgYBAwIGBAwCBgQMCBg\n" +
            "QMAgYEDAgIBBwICAAQEDAgYBAwIGBAwIGAQMCBgQMAgYEDAgYEDAIGBAwICAAQGD\n" +
            "gAEBAwIGAQMCBgQMCBgEDAgYEDAgYBAwIGBAwCBgQMCAgAEBg4ABAQMCBgEDAgYE\n" +
            "DAgYBAwIGBAwIGAQMCBgQMAgYEDAgIABAYOAAQEDAgYEDAIGBAwIGAQMCBgQMCBg\n" +
            "EDAgYEDAgIBBwICAAQGDgAEBAwIGBAwCBgQMCBgEDAgYEDAgYBAwIGBAwICAQcCA\n" +
            "gAEBg4ABAQMCBgQMAoZ/7D73Xdd9++pKCJhwvvR//c9PT93B1RAwodzvf/g/nsZn\n" +
            "V0TAxBu/35fpp5fkogiYIJ7eKFrBAiZqvwoWMGH253e2agULmHDn3wtdI2Aqsnt8\n" +
            "f7M+H10fAVO1zx/8Z/e2aAFTtfs+/3SMgKlkgd5//J/vLdECJuYCbYkWMJEX6CmF\n" +
            "I2CK2V/esY1gAVPrAF5gyUbAFPIw4ccYwQKmTrt+yo8yggVMlT5PzNwIFjBRB7AR\n" +
            "LGBCv0aMYAFTof3UH2gEC5j6Nugb/EgEzEoy5qonogVMbQO4n/5jPREtYOIOYKdg\n" +
            "ARN8XBvBAqYmfdaPfnDBBExF7m/6wxEwN5U7Uu3QAqamQ23mT3AbS8AEfn14mEPA\n" +
            "xN2g7dACJvAG7T60gKnHjBOt+9ACphb9nJ9jhxYwVZg1Te3QAqa16hEwi9vP+ll2\n" +
            "aAETeJbaoQVMDf3uZ/48I1jARF2gjWAB40WFa00hnocWMCBgypyefTulgPGqwqXG\n" +
            "IVjAkMU7wQImMO8ECxgvK1xpHIIFDA7BAsYhGAHjdYULjUOwgOFNnqYUMF5YuM7Y\n" +
            "oQUMCJhmeCdYwICAKcGjHALGKwuXmRLchhYwkbmLJWAcghEwXlquMiBgWuEuloCJ\n" +
            "zF0sAROYu1gCxmsLFxmHYAGDQ7CAAQFTP3exBIwXF64xCBgQMK3wPpKAicz7SAIG\n" +
            "BEwJ3kcSMCBgvLpcYsjiNrSAAQFThL8lWMCAgPHycoUBAdMKt6EFDAiYInycQcAE\n" +
            "5mloAQMCxuvLBQYETCu8jyRgQMAU4X0kAQMCpgRvBAsYLzBcXxAwIGBAwCBguB2P\n" +
            "YgkYEDBFeBRLwICAQcCQZblnKe9+77ru21eXVMCEs3v8639+eupenKoFTKxX2Jf+\n" +
            "h//96eCyCph44/e7p7O/NE3ARHG//8//5/HZZREwa0zPG/TbdTt/camAWcWVT3L8\n" +
            "vD5/r9oaLWDiHX9/SNgzXgKmdp/f/4++uDoC5uauepLjvv/gP3QOFjB1L9D7j+u2\n" +
            "RAuYmAu0JVrAVP4S+3CB7rqu83awgAm6QHdd1+2aX6IFTNQF2hItYGrWT/kxScBw\n" +
            "y0V49gl4oSktYKjxBOwULGAin4CNYAFz+6PsvBnZT/thjY9gAVOnyfeX2x7BAqbO\n" +
            "E3A//UcmAcPNzPo0Q8Zcbfq9YAETewB3bX8qScCEf13euVBQlX3OD275FCxgKnyN\n" +
            "3ef98M8uLlQk877XTsBQj6xbWF3X8m0sAVOfz17GfuVUM0+zf0af/a9o9jaWgKnO\n" +
            "ff5PeegEDC01L2C4iQeXQMDEPTP3M35Sq4dgAXNzmXHNek22+iyHgNnEBr0TMNTg\n" +
            "4re5v63R73gXMFsYwM2OYAFTl1m3sGactAUMN5ips1+Rbd7GEjCb2KBb3aEFTF36\n" +
            "+T8zCRgKH4ELzG4BQ/kX5J3rBVGPwI0eggXMRo7AbR6CBcxGjsBtHoIFTE0vsjsv\n" +
            "Zr9mmjwCt3kIFjBbOQI3eQgWMFs5Ajd5CBYw23k53rliUND+up/e4LfLCpjNbNAt\n" +
            "7tACZkOvxjuXDIq5eoDuBAzF9Nf/E5KAIegRuMFDsIDxYnTNwOvZL5imLbD/7gQM\n" +
            "hfQugYBp/A+BJGAoYZH1t7Xb0AJmU6/FOxcNilhkeO4EDGWOry6BgGn7CNzcXSwB\n" +
            "s62X4mdXDaIegf2xB6GPwDsBQ+Q/CJKAYW2LTc62VnEB45XoskEtg/NOwGAXFzBM\n" +
            "1y/3T0oCBnNTwBD4NC1gWP+FeOe6AQIGBIyDa46dgGFlvUsgYMJadGrujwIGr0MX\n" +
            "Drpu8KL2a2XTfB2HgOEGB2oBw0X9sv+0JGAwMwUMTtQCxssQVw6var9UyHOy8woY\n" +
            "JtsJGFbUuwQChr//QEgCBiuvgGF9DwKGpaTVX4V3AgYDU8DgUC1gNq13CQRMrcYS\n" +
            "fyQkAYOFV8CwvgcBgxehawde136hxDW4BAIGBAwChkV5klLA1OtU4N+5EzAgYLik\n" +
            "dwkETLVSiXW3lYehBcwmtXJjTMAgYHjP6DUoYPDCFjAIGHJc/CyDB7EEDP+2EzAg\n" +
            "YBp38VHo3jUSMPz0x0ISMCBgmnZpEvpSWQHDzx4EDAiYpnkUWsDglS1gSvCt0AJm\n" +
            "yzwKLWDqdXIJBAy5dgIGBEzT0qUf0LtGAgYBw+LGYv/mNj6OJGAQMCBg2uPThAKm\n" +
            "Xp6kFDDM8CBguJYnKQUMCJgSkleggAlr9NL2qwQETAHeRRIwIGBKuPwukm/UETAI\n" +
            "GJaXyv2rdwIGBEyzRpdAwMTlXSQB85ZfP3XdwWVAwPF8+jXMf9UJn0Xq/YYKuB27\n" +
            "z17wCDjm79Uv/3roIcINouR3TcCm7sObO3OA9znL/hnTxPfKCrhyv34K/F/eTWgB\n" +
            "i7fO8YaA+cCnu/7SZl3/L8IXYgm4yd+UXzbyEZ3k91LAjXnnjpUVGgFvJ94YK7Q/\n" +
            "YgTcjtC3mxGweDc336a8i+SvRhJwbJdvN3vpI+A6r/4vm/5GKO8iCXjDfrsy3vpX\n" +
            "6OQ3WcCblHe72QqNgLczecPwLpKAxRu4Dx9lEPCWPPy28B5e+y/YPSwBb8KXvs1f\n" +
            "d/JbL+Dgdr/e7sBb+wrtCCzg2G785XO1r9COwAIWb2COwAKOaaWPJdS+ojoCC9jk\n" +
            "DbxCI+BYfGdzpAVBwPx4Hdf/WELlhbiHJeAok/ehyB2ryldo97AELN7Akksg4MqV\n" +
            "/RacbRwyHZUF3GC89a/QwhRwtWZ/C05D3MMScK0q+XBC3TPOPSwBE3iFTn6DBExY\n" +
            "jsACJnAjr35/BEzgFRoBE3c7qOEInASMFXoWbyIJmMArtDeRBExgySUQMGFX6Jz/\n" +
            "aqn3WylgK7QjsIDBEVjANL9COwILmMArNAImrrMNRcAUf4HOvj/sCCxgyq/QL47A\n" +
            "AiawmSM4bzUwrgXMbbyu+tMQMMueso/7OT+rkg16EDCNm9WAASxgFj9qzvtXzDkF\n" +
            "Zw5gj10KuE1rPMgx4w6Tb8MSMLWY8UiGDVrAVDPq8m9jJb8zAqaSFTryCfUkYIz5\n" +
            "my/dzswC1lY9O/TRb4yAqWaFzt2hzVMBU9Wcz3sruKJ70EnAWKFVI2ACr9B5N3Pn\n" +
            "fJTf11IKmNvJatItLAFT21Y8fUK6hSVgaqslY4d+bfDyCJiqz8DdefIIPqebH7IR\n" +
            "sAmcafJcreoEPAgYEzjnT4qz3xMBU6GJj1POHMA+0S9gK/RtT8EGsIAJu0JPfCep\n" +
            "sveATwKGv0y5jTV7AHvzWMBW6Bv/qyaMYA9hCZhKV+gJf8tKdSfgJGD4e75euBE9\n" +
            "XjGAfZpBwFboG7v0OJbvohQw9a7Ql5boeQ9RbuaPNwETeoker7qD5WFoAVN0iX52\n" +
            "eQRM5Uvi+0t0jc9gDQLGGfjfc/bxnX6PWhMwtU/gbjzc75fP90ZOAsYE/jnW/w7h\n" +
            "8fp+PUspYNYawk8/HYyTiyJg4gyuf63RY723n5OAsUK/tUYf7n5fOF/PUgqY9QwH\n" +
            "64mA8Rr9zqNYArZCI2BAwFihETBW6NkGAYPaBAwFnASMM7BfiYBxBkbAbNnyz1Im\n" +
            "AUPYE2s7S7mAQcCsb0NTZqj+HyhgluYmFgJmk8vEScBYoREwVugJln4fKQkYLCcC\n" +
            "xqvUmVXAbHuFXtggYFCcgMFGLmA2fgb2lpiAnYEjW/Z9pCRgMM8FjJepU6uA2foK\n" +
            "PVT7DxMwJvC6v5iTgDGB40oChpWj610DAVuhwzq5MAK2QmMCAwLGCl3IIGCs0HGr\n" +
            "OwkY7BMChsmWex8pCRgzy3URMM7ATq4CpgVDdf8gAWNVNMoFTAsr9GJ/HiUBYwKv\n" +
            "77h3WQRsArd+CB4EDI7AAsYKbfcVMG+81odT2t6vaplnsZKAqXlD/POb5dccF3BA\n" +
            "X8dtn++Gav4hAmZZ34bkIqw3xgXMYsfd09dmfqmOwALWbmC+mVLAG/H6h/UXATvu\n" +
            "Nre1CJhShj8aH0FDFf8IATPDwSVYYnyeBAylXH8XKwkYSnm99h9w7gQMYXfok4Ah\n" +
            "8A4uYBb37Wv3pXcZprjyWzka/ESigG9oSN9chFUvuIBZaOp6HGOOK29CnQTMtbb+\n" +
            "ob8bH2KvOmskAXPF1O2+ughXuuoPvxa/lEfA0t3MKXYQMLkT40/3qZZ01RA9CZjp\n" +
            "L7WT+1SVHYKTgJnCfaoqD8FNfi+tgPO9uATbOz8LGMpWeBIwFDbOPwQnAUPYQ3Cb\n" +
            "fzWLgKnL7KcpnwUM5c38RFKjfzeagKnMsOpPEzAsauYoPQoYwu7Qrf7twgJmEzv0\n" +
            "IGCIu0MfBQyBd2gBQ1tTW8BwAzOe5XgVMNQi/3noJGCoRfY8PXcChrAn2qOAoR6Z\n" +
            "96HHTsBQj8zHMl4FDDXt0Fm3scYkYKhJ1veOPXcChqpkjOCxEzDU5fUmP1TAUNkp\n" +
            "uOUTsIAJP4KbHsACJvoITgKGsCO48b8nQ8CEHsFtn4AFTPAR/NoJGMKO4CRgCDuC\n" +
            "z52AIeoIHo8ChlpdvMP82gkYqvX8+PECnQTsRULFS/SHn+y3QAuYun14k+rZ9REw\n" +
            "dTvcvzeDR/0KmPpn8DtbtH4FTIiC33wzSb8CJoaXtwrWr4CJUvB/tmjzV8AE2qJ/\n" +
            "ej/4JbkmAiaO8fDlhzX64IIImGBr9OHud9NXwIQ1GLwCJsPTTSapASpgQMAgYEDA\n" +
            "gIBBwICAAQEDAgYBAwIGBAwCdglAwICAAQGDgAEBAwIGBAwCBgQMCBgEDAgYEDAg\n" +
            "YBAwIGBAwICAQcCAgAEBg4ABAQMCBgQMAgYEDAgYEDAIGBAwIGAQMCBgQMCAgEHA\n" +
            "gIABAYOAAQEDAgYEDAIGBAwIGBAwCBgQMCBgEDAgYEDAgIBBwICAAQEDAgYBAwIG\n" +
            "BAwCBgQMCBgQMAgYEDAgYEDAIGBAwICAQcCAgAEBAwIGAQMCBgQMAgYEDAgYEDAI\n" +
            "GBAwIGBAwCBgQMCAgEHAgIABAQMCBgEDAgYEDAgYBAwIGBAw4eweb/aPPh8FDAgY\n" +
            "EDAgYBAwIGBAwCBgQMCAgAEBg4ABAQMCBgQMAgYEDAgYBAwIGBAwIGAQMCBgQMCA\n" +
            "gEHAgIABAYOAAQEDAgYEDAIGBAwIGAQMCBgQMCBgEDAgYEDAgIBBwICAAQGDgAEB\n" +
            "AwIGBAwCBgQMCBgQMAgYEDAgYBAwIGBAwICAQcCAgAEBg4ABAQMCBgQMAgYEDAgY\n" +
            "EDAIGBAwIGAQMCBgQMCAgEHAgIABAQMCBgEDAgYEDAIGBAwIGBAwCBgQMCBgQMAg\n" +
            "YEDAgIBBwICAAQEDAgYBAwIGBAwCBgQMCBgQMAgYEDAgYEDAIGBAwICAQcCAgAEB\n" +
            "AwIGAQMCBgQMCBgEDAgYEDAIGBAwIGBAwCBgQMCAgAEBg4ABAQMCBgEDAgYEDAgY\n" +
            "BAwIGBAwCBgQMCBgQMAgYEDAgIABAYOAAQEDAgYBAwIGBAwIGAQMCBgQMCBgEDAg\n" +
            "YEDAIGBAwICAAQGDgAEBAwIGAbsEIGBAwICAQcCAgAEBAwIGAQMCBgQMAgYEDAgY\n" +
            "EDAIGBAwIGBAwCBgQMCAgEHAgIABAQMCBgEDAgYEDAgYBAwIGBAwCBgQMCBgQMAg\n" +
            "YEDAgIBBwICAAQEDAgYBAwIGBAwIGAQMCBgQMAgYEDAgYEDAIGBAwICAAQGDgAEB\n" +
            "AwIGAQMCBgQMCBgEDAgYEDAgYBAwIGBAwCBgQMCAgAEBg4ABAQMCBgEDAgYEDAgY\n" +
            "BAwIGBAwIGAQMCBgQMAgYEDAgIABAYOAAQEDAgYEDAIGBAwIGAQMCBgQMCBgEDAg\n" +
            "YEDAgIBBwICAAQGDgAEBAwIGBAwCBgQMCBgEDAgYEDAgYBAwIGBAwICAQcCAgAEB\n" +
            "g4ABAQMCBgQMAgYEDAgYEDAIGBAwIGAQMCBgQMCAgEHAgIABAYOAAQEDAgYEDAIG\n" +
            "BAwIGBAwCBgQMCBgEDAgYEDAgIBBwICAAQEDAgYBAwIGBAwCBgQMCBgQMAgYEDAg\n" +
            "YEDAIGBAwICAQcCAgAEBAwIGAYPXtl8k3NogYEDAgIDBa1vAOAMLGBAwIGAQMCBg\n" +
            "QMCAgEHAgIABAQMCBgEDAgYEDAIGBAwIGOY6CRgQMCBgQMAgYEDAcDNJwICAAQED\n" +
            "AgYBQ+VGAQMCBgQMCBgEDLUbBAwIGAo4CRgQMCBgQMA0IgkYEDAgYMgwChgQMCBg\n" +
            "QMA0YhAwIGAo4CRgQMB03bfUuwgIOKrh5dB1XdfdPwh5JUnALO78chAxAhYxHxsF\n" +
            "jIgRMCIuYBAwIkbATIrYdUDAgSN2DZZ1EjAgYCggCRgQMKxvFDAgYEDAgIBpxCBg\n" +
            "iOskYEDAUEASMCBgWN8oYIhrEDAgYCjgJGBAwFBAEjCE1c5NaAGDgKEmg4ABAUMB\n" +
            "JwFDXEnAEFZDN6EFzPYMAgZHYAEDAoYcScAQVkv3sAQMAoZ6DAIGBAwFnAQMcSUB\n" +
            "Q1hN3YQWMFszCBgcgQUMCBhyJAFDWGcTGByBBQw2aAFDhrETMIQ1CBgcgQUMjsAC\n" +
            "BgRMG0YBQ1yDgCGuk4AhriRgcAQWMDgCCxgcgQWMI7CAoW4vnYDBABYwrG7sBAxh\n" +
            "DQKGuE4CBkdgAYMjsIDBEVjAOAILGCrfoJOAwQYtYLBBCxhs0ALGBi1gsEELGG7j\n" +
            "nAQMYR07AQMChvU3aAGDDVrAsL6xEzCE9SpgiDuAk4AhrKETMIR1FDCEde4EDAaw\n" +
            "gGF1YydgCOtVwBB3ACcBgwEsYFjdSxIwWKAFDBZoAcN0ScAQ1rkTMIQ9AR8FDE7A\n" +
            "Aob1B3ASsFcBYT27BAImrLNLIGDiOroEAiasF5dAwITlDpaACcwdLAFjgRYwrK/V\n" +
            "v05UwGxi/upXwOhXwGB/FjBM79cTHAImLJ8hFDClXL/8jt4AFjBx569+BYzzr4BB\n" +
            "vwKGyQ4ugYAxfgUMa/P4lYAJy91nAWP8ChjkK2CYyr1nAVPJSTbvR7+avAKm6qKN\n" +
            "VwGDgAEBAwIGBExlBpdAwICAQcCAgAEBg4DhZk4ugYABAYOAAQHTiOQSCBgQMAgY\n" +
            "EDBtGF0CAQMCBgEDAqYRvpBDwICAQcCQxacJBQwIGAQMCJhWJJdAwICAWZ/PMggY\n" +
            "EDAIGLJ4FFrAgIApwZOUAgYEDAKGLMklEDAgYNbnQSwBAwIGAQMCBgRM9TwKLWAC\n" +
            "8ySlgAEBU0JyCQQMCJj1eRBLwICAKcG7SAIGBEwJ3gYWMCBgSkgugYABAbM+bwML\n" +
            "GBAwJXgbWMAE5l0kARNYcgkEDAiY9bkJLWACcw9LwICAKcFNaAETWHIJBAwImPW5\n" +
            "CS1gQMCU4F0kAQMCpgTvIgmYwJJLIGDCchNawATmHpaAcQRGwDgCCxgcgQUMCJja\n" +
            "uYclYAJzD0vABJZcAgETlntYAsYRGAHjCCxgcAQWMI7ACBgEDAgY/uvVJRAwcY/A\n" +
            "yTUQMCBgbNAChgw2aAET+AjsEgiYuDwILWAC8yC0gHEERsA4AgsYHIEFjCMwAqb2\n" +
            "DdoRWMCAgHEEFjA4AguYNpwdgQWMAYyAWZ970AImMLewBIwNGgFjgxYw2KAFTCOO\n" +
            "LoGAibtBuwQCxgaNgLFBCxhs0AKmDb7QXcAEllwCARPW2SUQMHG5hSVg4jq4BAIm\n" +
            "LLegBUxgHuIQME7ACJgC3IIWMIFPwAawgHECRsAYwAKGDJ6CFjCBJZdAwITlFrSA\n" +
            "cQJGwDgBCxhyFmgnYAETlwVawMT14hIImLB8DFjAmL8ImCulPvunuIElYOJOU+8A\n" +
            "C5iKzrNPmT/h2TUTMPV4fnQAFjBhjVkFvzgAC5iwBetXwMQtWL8CpsKCj3v9Cpiw\n" +
            "zpPeDvYAloCp08vlgkfvHwmYagu+tEWfPb8hYCreoj8u2PosYOou+INnsty9EjDV\n" +
            "O3RPtmcBEznhrrv7XbsCJqzh0HXd7qH75lIImKBG+QoYEDAIGBAwIGBAwCBgQMCA\n" +
            "gAEBg4ABAQMCBgEDAgYEDAgYBAwIGBAwIGAQMCBgQMAgYEDAgIABAYOAAQEDAgYE\n" +
            "DAIGBAwIGAQMCBgQMCBgEDAgYEDAIGBAwICAAQGDgAEBAwIGBAwCBgQMCBgEDAgY\n" +
            "EDAgYBAwIGBAwICAQcCAgAEBg4ABAQMCBgQMAgYEDAgYEDAIGBAwIGAQMCBgQMCA\n" +
            "gEHAgIABAYOAAQEDAgYEDAIGBAwIGBAwCBgQMCBgEDAgYEDAgIBBwICAAQEDAgYB\n" +
            "AwIGBAwCBgQMCBgQMAgYEDAgYBAwIGBAwICAQcCAgAEBAwIGAQMCBgQMAgYEDAgY\n" +
            "EDAIGBAwIGBAwCBgQMCAgEHAgIABAQMCBgEDAgYEDAgYBAwIGBAwCBgQMCBgQMAg\n" +
            "YEDAgIBBwICAAQEDAgYBAwIGBAy0GPDhyW80Ag5c8P3ebzUCDuv8/Oj3GgGHNVqj\n" +
            "EbA1GgRcaI02hBFw6CGsYARsjQYBW6NBwNlD+Evvdx0Bh/VytEYj4MBrtIc6EHBg\n" +
            "ozUaAYdeow1hBBx6CHemMAI2hUHAhaaw94QRcGBuZiFgazQI2BoNAs5fo32+AQEH\n" +
            "5sEsBGyNBgFbo0HA+Wu0IYyAQw9hBSNgazQI2BoNAs4ewp6sRMCB+bYdBBx7jfYx\n" +
            "YQQcegp7MAsBB+bBLAQcmptZCNgaDQIutUYbwgg48hBOCkbA1mgQsDUaBJw7hD2Y\n" +
            "hYAD8207CNgaDQK2RoOA89doT1Yi4Mis0Qg49Bp96ExhBBx5CvvGLAQc+SjsZhYC\n" +
            "jlywm1kI2BoNAi40hD2YhYAD8207CDj2Gu09YQQcmI8JI+DYa7QhjIAjD2HftoOA\n" +
            "rdEgYGs0AiZ7CHuyEgEH5qEOBGyNBgGXWqN9TBgBh2YKI+DQU9jNLAQcmI8JI+DY\n" +
            "a7SPCSPgyEPYGo2ArdEgYGs0AiZ7CHswCwEH5tt2ELA1GgRsjUbAzFijPVmJgAPz\n" +
            "ZCUCtkaDgK3RCJj8NdrHhBFwaKYwAg49hR2FEXDoo7A1GgFHXqM9mIWAA/OOEgK2\n" +
            "RoOArdEImPw12hBGwKGHsIIRsDUaBGyNRsBkD2FPViLgwHxMGAFbo0HA1mgETP4a\n" +
            "fdh5tBIBx+XLOhBw7Cns8w0IOPQQdjMLAQdmjUbA1mgQsDUaAZO/Rvt8AwIOzLft\n" +
            "IGBrNAjYGo2AyV+jDWEEHHoIKxgBW6MRMNZoBEz2EPZkJQIOzN8mjIBNYQRMsSns\n" +
            "wSwEHJgHsxCwNRoBY41GwMxYow1hBBx5CCcFI2BrNALGGo2AyR3C/ho0BByYb9tB\n" +
            "wNZoBIw1GgGTv0Z7shIBR2aNRsCh12gfE0bAsaewb8xCwJGPwm5mIeDIBbuZhYCt\n" +
            "0QiYQkPYg1kIODDftoOArdEIGGs0AmbGGu3BLAQcmG/bQcChC7ZGI2BrNAKm0BD2\n" +
            "ZCUCDszdaARsjUbAlFqjfUwYAYdmCiPg0FPYzSwEHJiPCSPg2Gu0zzcg4MhD2BqN\n" +
            "gK3RCBhrNAImewh7MAsBB+bbdhCwNRoBY41GwMxYoz1ZKWAC82SlgLFGI2Cs0QiY\n" +
            "/DX6sDOFBYwpjIApM4UdhQVM6CHswSwBE5g1WsBYoxEw1mgETP4a7fMNAiYwD2YJ\n" +
            "GGs0AsYajYDJX6MNYQETeggrWMBYoxEw1mgETPYQ7nzIUMAE5h0lARN7Cvt8g4AJ\n" +
            "zOcbBIw1GgFjjUbAWKMRsDUaARNmjfZgloAJzMeEBYw1GgFjjUbA5K/RhrCACT2E\n" +
            "FSxgrNEIGGs0AiZ7CHemsIAxhREwhaawzzcImMB8vkHARObBLAFjjUbAWKMRMDPW\n" +
            "aENYwEQewknBAsYajYCxRiNgcofw0ZOVAiYu37YjYKzRCBhrNAImf432ZKWAiezg\n" +
            "EggYEDAgYBAwIGBAwICAQcCAgAEBg4ABAQMCBgQMAgYEDAgYEDAIGBAwIGAQMCBg\n" +
            "QMCAgEHAgIABAYOAXQIQMCBgQMAgYEDAgIABAYOAAQEDAgYBAwIGBAwIGAQMCBgQ\n" +
            "MCBgEDAgYEDAIGBAwICAAQGDgAEBAwIGBAwCBgQMCBgEDAgYEDAgYBAwIGBAwCBg\n" +
            "QMCAgAEBg4ABAQMCBgQMAgYEDAgYBAwIGBAwIGAQMCBgQMCAgGEL/g8+izYwxwQV\n" +
            "XAAAAABJRU5ErkJggg==";

    private static final String LINKED_IN_ICON = "iVBORw0KGgoAAAANSUhEUgAAAQAAAAEACAMAAABrrFhUAAAAA3NCSVQICAjb4U/g\n" +
            "AAAACXBIWXMAAAlHAAAJRwHdSYvuAAAAGXRFWHRTb2Z0d2FyZQB3d3cuaW5rc2Nh\n" +
            "cGUub3Jnm+48GgAAAqxQTFRF////AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3\n" +
            "AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3AHe3mh1WSwAAAON0Uk5TAAECAwQF\n" +
            "BgcICQoLDA0ODxARExQVFhcYGRobHB0eHyAhIiMkJScoKSstLi8xMjM0NTY3ODk6\n" +
            "Ozw9P0BBQkRFRkdISUpLTE1OT1BRUlRXWFlaW1xdXl9iY2VmZ2prbG1ub3BxcnR1\n" +
            "dnd4eXp7fH1+f4CBg4SFhoeIiYqLjI2Oj5CRkpOUlZaXmpydnp+goaKkpqeoqqus\n" +
            "ra6vsLGytLW2t7i5uru8vb6/wMHCw8TFx8jJysvMzc7P0NHS09TV1tfY2drb3+Dh\n" +
            "4uPk5ebn6Onq6+zt7u/w8fLz9PX29/j5+vv8/f7MqBT6AAAHzklEQVR42u3d+1/T\n" +
            "VRgH8GdDGJoKGKjTpKsmiWGNJM1qOK+haKhollrkJdHMWWp4q6ycMlZeSyosXV7o\n" +
            "MitN0eYtSYuBCvOSITI4/0g/hAqyyznfbb0453k+v5+z87zZxnfn8v0C3BWdyepw\n" +
            "ur1MuXjdTofVpIOg0VtsHqZ0PDaLPnD95gqGIBXmAOWnOxmSONP91V/gY2jiK2hX\n" +
            "vsHOUMVuaFt/ioshiyulzd8fXf2MuVq/B+wMYeytvv8Yytz+Jkz34QTw3fpv6GRI\n" +
            "42y5/mNoYwYA0FfgBajQA4CFIY4FAGyYAWwAOg9mAI8OTAx1TGDFDWAFB24AB96r\n" +
            "oFvXQm7cAG7w4gbwAkMeAiAAAiAA4Zz8YsOb+dkj8ua/t+1gIzaAxn2vPdh6Qjlx\n" +
            "8tbLiAAqpye2X1OKff4AEoC6uYYA64pj3AgAGlYnBV5YjpnhUR2gZmjwvQU9f1Qb\n" +
            "4Eg/CJG4YpUBtneB0JFxhZ0ToFgHPMlVFeD7OODLMjUBziZz1g+6nSoCXEsD7nQ9\n" +
            "piBAPgik/03lAI7rRQDgQ+UARgvVD8lXFQMoB8EsVgzAJArQpUopgOMgnFVKAbwt\n" +
            "DpClFECGOIC+RiGA8zpxANioEMBHGuqHMQoB5GsBMCoEYNYC0KlJHYA0LQBQow5A\n" +
            "D00AR5UBuKGpfvhaGYAqbQCblQFo0GkC2K3Od0CyJoBj6gAM0gRwQR2AkVrqj21W\n" +
            "B2C6FoC+Cl0J2rQA5CgEUK3XAPCJSvMBT2n4KVCnEkCROMAIpWaEzogDfKAUAHtW\n" +
            "tP6EWrUADoleDa9kagGwiYIXAf+oBvB7rBCAZBtleFaHZ4nUP6hJPYD6J/jrTzrD\n" +
            "1ANgVX1464/Zw1QEYIc6cwK8z9QEYNtiuOp/iakKwHYncuyQsjarC8BO9w9V/z2f\n" +
            "MaYwALucHbz+VDnvQyCwW7xpU9/A5cfPl/QAotB5gfp3A3wTxOSfZwwBAGN1hQ/5\n" +
            "ufiZ8htjSAAYY8eXtdk00m/2t1Kfm9J0aqyqfMua13NzZi0v2XOKSR46N0gABEAA\n" +
            "BEAABEAABNDR03iqdOXMSWOGZwzok9D9vrSs0XmvLFr15V8oABrLF48fEGBxoteo\n" +
            "JaXn/xeAuhU5qYlB0vO5hScCNj7x6tP3JgTL/S+saQjwu6N4QkKouah+C09GHWCX\n" +
            "MfScoGFlgLPDa+M5JlTT/Mwo+bZmcq5MDll/MaoAu/iGMcdvY85tNr3uXlW+ujZV\n" +
            "ZGfWOFf0AOqMfIPQ7ffTuLIbZwl5bZpdL+wuujCfWxktgBW8Qxjmp/E67r9hfatW\n" +
            "3zygYXOSYcGV6ADkcB8d9rM0OoV7/Hfewxde1LZJGZI3RQWA/7Po5+s4k7vx7Zs7\n" +
            "7u8BmpPfEAWARO6XP9i+Mf/Jy5KWFsWxEEZMVZIDNL8B4cX4k9QATZMg3Bi2ywww\n" +
            "E8JP3D55ARZBJJJwTFaAdRCZ9DknJ8A+fYQAYKBXRoCLRohYJkkIUDwKIphS+QAy\n" +
            "Ilk/9K6TDiDCmYYdgOsAq9IAA5uRA8Dn2AEGYweAMuwAmdgBwIUdYBZ2gORG5ACw\n" +
            "CztAHnaArteRA4T6DKgPMBc7wGDsAPo6mQF0xqFTlpRsXr90ztik6Pwk7MgAcdN+\n" +
            "abVg3nR4tbZ7+syWFCBxQfstYLuf09DRcCkBOq3wf3/mr1KEuzLKCJAQ8AxydbZw\n" +
            "Z9fkA0gNcgrLN0G0t8PSAQypDjaYm4I3O4ctsgEYLwUfTf1Asf6WSgag3xtqOL+K\n" +
            "baGZLBnAgtDjsQp1+LhcABkcj6i42k2kx+5yARzhGdDLQl16ZAIYyTUgt1CfB2QC\n" +
            "KOfb1zBcpM+NEgFk8tXPtot0WiQRQCknQKPIb4JF8gAkcR/FHx+hH8QdDCCPt362\n" +
            "XKDXqfIA7OAG2CvQ6zhpAOL/5ga4InCbw2ekATAz/jwamYnhjgUwTwBgKn+3D0sD\n" +
            "YBcAeEtgiVgagJ8FAASefxMnC4DumgDADoF/AzckAUgVqJ99JwDglQRgpAjAaQGA\n" +
            "WkkA5ooAeAUALkkCYBMBEHkAzgVJAEqiBVCDHcCDHaAKO8Cf2AHOYQf4AztAJQEQ\n" +
            "AAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQ\n" +
            "AAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQAAEQAAG0pD/3S51t3ziLu/Gn\n" +
            "IgA3BW4lFfbhae4HYffw03gG9ziPigCwR7j77d4cLsDHvC811k/jDbyNOzcKAUzk\n" +
            "BhjGwgVoeIzvleL9PHqc1fbmHOc8ofrZD9wPaN0ZNgA7HM/1Smv9Ni7jG+aAejEA\n" +
            "Np+z/mC3E+QFYCeGhH6hXoGky3jeA2OrBetnTUUGjn5jChsiAcB8OwvNpiAZNtsR\n" +
            "+HZFtRtmZD0ZLNkLy5iGnCrKNQXt1zThnRD3KQaGPARAAASAHMCLu34vuHEDuMGJ\n" +
            "G8AJDtwADrDiBrCCCTeACXQezPV7dII38lQtNgCwYAawAIC+Am/9FXoAsXvaKxbz\n" +
            "f3MmaK+FnC2TRuk+nPX70m9NmxXgBCi4M3Fox1i/vdXMqcGFr35XmynlFHQCrrse\n" +
            "VWVA9imwt19SKED0v8BX4G8JJR3N9YAzPcAqkhnFVXGFOfA6mt5iU/zXscdmCbGo\n" +
            "rDNZHU63gnPFXrfTYTW121byL73dMc4yXy6wAAAAAElFTkSuQmCC";

}