const puppteteer = require('puppeteer');

async function scrapeCoronaData(){
    const browser = await puppteteer.launch();
    const page = await browser.newPage();
    await page.goto('https://www.worldometers.info/coronavirus/');

    const [el] = await page.$x('//*[@id="main_table_countries_today"]/tbody[1]/tr[40]/td[2]');
    const src = await el.getProperty('textContent');
    var cases = await src.jsonValue();

    const [el2] = await page.$x('//*[@id="main_table_countries_today"]/tbody[1]/tr[40]/td[4]');
    const src2 = await el2.getProperty('textContent');
    deaths = await src2.jsonValue();

    const [el3] = await page.$x('//*[@id="main_table_countries_today"]/tbody[1]/tr[42]/td[6]');
    const src3 = await el3.getProperty('textContent');
    recovered = await src3.jsonValue();

    const [el4] = await page.$x('//*[@id="main_table_countries_today"]/tbody[1]/tr[40]/td[3]');
    const src4 = await el4.getProperty('textContent');
    newCases = await src4.jsonValue();

    const [el5] = await page.$x('//*[@id="main_table_countries_today"]/tbody[2]/tr/td[2]');
    const src5 = await el5.getProperty('textContent');
    var worldCases = await src5.jsonValue();

    const [el6] = await page.$x('//*[@id="main_table_countries_today"]/tbody[2]/tr/td[4]');
    const src6 = await el6.getProperty('textContent');
    worldDeaths = await src6.jsonValue();

    const [el7] = await page.$x('//*[@id="main_table_countries_today"]/tbody[2]/tr/td[6]');
    const src7 = await el7.getProperty('textContent');
    worldRecovered = await src7.jsonValue();

    const [el8] = await page.$x('//*[@id="main_table_countries_today"]/tbody[2]/tr/td[5]');
    const src8 = await el8.getProperty('textContent');
    worldNewDeaths = await src8.jsonValue();

    const [el9] = await page.$x('//*[@id="main_table_countries_today"]/tbody[2]/tr/td[3]');
    const src9 = await el9.getProperty('textContent');
    worldNewCases = await src9.jsonValue();


    console.log({cases, deaths, recovered, newCases, worldCases,worldDeaths, worldRecovered, worldNewDeaths, worldNewCases});
    browser.close();
}

scrapeCoronaData()