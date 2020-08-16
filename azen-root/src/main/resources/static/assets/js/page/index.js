"use strict";

$(function () {
    chart1();
    chart2();
    chart3();

    var sparkline_values = [10, 7, 4, 8, 5, 8, 6, 5, 2, 4, 7, 4, 9, 6, 5, 9];
    var sparkline_values_chart = [2, 6, 4, 8, 3, 5, 2, 7];
    var sparkline_values_bar = [10, 7, 4, 8, 5, 8, 6, 5, 2, 4, 7, 4, 9, 10, 7, 4, 8, 5, 8, 6, 5, 2, 4, 7, 4, 9, 8, 6, 5, 2, 4, 7, 4, 9, 10, 2, 4, 7, 4, 9, 7, 4, 8, 5, 8, 6, 5];
    $(".sparkline-bar").sparkline(sparkline_values_bar, {
        type: "bar",
        width: "100%",
        height: "100",
        barColor: "white",
        barWidth: 2
    });

    $('.sparkline-inline').sparkline(sparkline_values, {
        type: 'line',
        width: '100%',
        height: '100',
        lineWidth: 1,
        lineColor: 'white',
        fillColor: 'rgba(87,75,144,.25)',
        highlightSpotColor: "rgba(63,82,227,.1)",
        highlightLineColor: "rgba(63,82,227,.1)",
        spotRadius: 3,
    });
    if ($("#activity-scroll").length) {
        $("#activity-scroll")
            .css({
                height: 400
            })
            .niceScroll();
    }

    if ($("#support-scroll").length) {
        $("#support-scroll")
            .css({
                height: 400
            })
            .niceScroll();
    }
    if ($("#project-team-scroll").length) {
        $("#project-team-scroll")
            .css({
                height: 400
            })
            .niceScroll();
    }

});



function chart1() {
    var options = {
        chart: {
            height: 240,
            type: "line",
            zoom: {
                enabled: !1
            }
            ,
            toolbar: {
                show: !1
            }
        }
        ,
        dataLabels: {
            enabled: !1
        }
        ,
        stroke: {
            width: 3, curve: "smooth", dashArray: [0, 8]
        }
        ,
        series: [{
            name: "2019", data: [15, 48, 36, 20, 40, 60, 35, 20, 16, 31, 22, 11]
        }
            ,
        {
            name: "2018", type: "area", data: [8, 22, 60, 35, 17, 24, 48, 37, 56, 22, 32, 38]
        }
        ],
        colors: ["#8793ea",
            "#4caf50"],
        //      colors: ["#3dc7be", "#ffa117"],
        fill: {
            opacity: [1, .15]
        }
        ,
        markers: {
            size: 0,
            hover: {
                sizeOffset: 6
            }
        }
        ,
        xaxis: {
            categories: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
            labels: {
                style: {
                    colors: '#8e8da4',
                }
            },
        },
        yaxis: {
            labels: {
                style: {
                    color: '#8e8da4',
                }
            }
        },
        grid: {
            borderColor: "#f1f1f1"
        }
    };

    var chart = new ApexCharts(document.querySelector("#revenue"), options);

    chart.render();
}

function chart2() {
    am4core.useTheme(am4themes_animated);

    // Create chart instance
    var chart = am4core.create("amchart1", am4charts.XYChart);


    // Add data
    chart.data = [{
        "x": 1,
        "ay": 6.5,
        "by": 2.2,
        "aValue": 15,
        "bValue": 10
    }, {
        "x": 2,
        "ay": 12.3,
        "by": 4.9,
        "aValue": 8,
        "bValue": 3
    }, {
        "x": 3,
        "ay": 12.3,
        "by": 5.1,
        "aValue": 16,
        "bValue": 4
    }, {
        "x": 5,
        "ay": 2.9,
        "aValue": 9
    }, {
        "x": 7,
        "by": 8.3,
        "bValue": 13
    }, {
        "x": 10,
        "ay": 2.8,
        "by": 13.3,
        "aValue": 9,
        "bValue": 13
    }, {
        "x": 12,
        "ay": 3.5,
        "by": 6.1,
        "aValue": 5,
        "bValue": 2
    }, {
        "x": 13,
        "ay": 5.1,
        "aValue": 10
    }, {
        "x": 15,
        "ay": 6.7,
        "by": 10.5,
        "aValue": 3,
        "bValue": 10
    }, {
        "x": 16,
        "ay": 8,
        "by": 12.3,
        "aValue": 5,
        "bValue": 13
    }, {
        "x": 20,
        "by": 4.5,
        "bValue": 11
    }, {
        "x": 22,
        "ay": 9.7,
        "by": 15,
        "aValue": 15,
        "bValue": 10
    }, {
        "x": 23,
        "ay": 10.4,
        "by": 10.8,
        "aValue": 1,
        "bValue": 11
    }, {
        "x": 24,
        "ay": 1.7,
        "by": 19,
        "aValue": 12,
        "bValue": 3
    }];

    // Create axes
    var xAxis = chart.xAxes.push(new am4charts.ValueAxis());
    xAxis.renderer.minGridDistance = 40;
    xAxis.renderer.labels.template.fill = am4core.color("#8e8da4");

    // Create value axis
    var yAxis = chart.yAxes.push(new am4charts.ValueAxis());
    yAxis.renderer.labels.template.fill = am4core.color("#8e8da4");

    // Create series
    var series1 = chart.series.push(new am4charts.LineSeries());
    series1.dataFields.valueX = "x";
    series1.dataFields.valueY = "ay";
    series1.dataFields.value = "aValue";
    series1.strokeWidth = 2;

    var bullet1 = series1.bullets.push(new am4charts.CircleBullet());
    series1.heatRules.push({
        target: bullet1.circle,
        min: 5,
        max: 20
    });

    bullet1.tooltipText = "x={valueX}, y= {valueY}";

    var series2 = chart.series.push(new am4charts.LineSeries());
    series2.dataFields.valueX = "x";
    series2.dataFields.valueY = "by";
    series2.dataFields.value = "bValue";
    series2.strokeWidth = 2;

    var bullet2 = series2.bullets.push(new am4charts.CircleBullet());
    series2.heatRules.push({
        target: bullet2.circle,
        min: 5,
        max: 20
    });

    bullet2.tooltipText = "x={valueX}, y= {valueY}";
}

function chart3() {
    // Themes begin
    am4core.useTheme(am4themes_animated);
    // Themes end

    var chart = am4core.create("amchart2", am4charts.XYChart);

    var data = [];
    var open = 100;
    var close = 120;

    var names = [
        "Raina",
        "Demarcus",
        "Carlo",
        "Jacinda",
        "Richie",
        "Antony",
        "Amada",
        "Idalia",
        "Janella",
        "Marla",
        "Curtis",
        "Shellie"
    ];

    for (var i = 0; i < names.length; i++) {
        open += Math.round((Math.random() < 0.5 ? 1 : -1) * Math.random() * 5);
        close = open + Math.round(Math.random() * 10) + 3;
        data.push({
            category: names[i],
            open: open,
            close: close
        });
    }

    chart.data = data;

    var categoryAxis = chart.xAxes.push(new am4charts.CategoryAxis());
    categoryAxis.renderer.grid.template.location = 0;
    categoryAxis.renderer.ticks.template.disabled = true;
    categoryAxis.renderer.axisFills.template.disabled = true;
    categoryAxis.dataFields.category = "category";
    categoryAxis.renderer.minGridDistance = 15;
    categoryAxis.renderer.grid.template.location = 0.5;
    categoryAxis.renderer.grid.template.strokeDasharray = "1,3";
    categoryAxis.renderer.labels.template.rotation = -90;
    categoryAxis.renderer.labels.template.horizontalCenter = "left";
    categoryAxis.renderer.labels.template.dx = 17;
    categoryAxis.renderer.inside = true;
    categoryAxis.renderer.labels.template.fill = am4core.color("#8e8da4");

    var valueAxis = chart.yAxes.push(new am4charts.ValueAxis());
    valueAxis.tooltip.disabled = true;
    valueAxis.renderer.ticks.template.disabled = true;
    valueAxis.renderer.axisFills.template.disabled = true;
    valueAxis.renderer.labels.template.fill = am4core.color("#8e8da4");

    var series = chart.series.push(new am4charts.ColumnSeries());
    series.dataFields.categoryX = "category";
    series.dataFields.openValueY = "open";
    series.dataFields.valueY = "close";
    series.tooltipText = "open: {openValueY.value} close: {valueY.value}";
    series.sequencedInterpolation = true;
    series.fillOpacity = 0;
    series.strokeOpacity = 1;
    series.columns.template.width = 0.01;
    series.tooltip.pointerOrientation = "horizontal";

    var openBullet = series.bullets.create(am4charts.CircleBullet);
    openBullet.locationY = 1;

    var closeBullet = series.bullets.create(am4charts.CircleBullet);

    closeBullet.fill = chart.colors.getIndex(4);
    closeBullet.stroke = closeBullet.fill;

    chart.cursor = new am4charts.XYCursor();
}
