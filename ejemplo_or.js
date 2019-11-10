

    var chart_config = {
        chart: {
            container: "#basic-example",
            
            connectors: {
                type: 'bCurve'
            },
            animateOnInit: true,
            
            node: {
                collapsable: true,HTMLclass: 'nodeExample1'
            },
            animation: {
                nodeAnimation: "easeOutBounce",
                nodeSpeed: 700,
                connectorsAnimation: "bounce",
                connectorsSpeed: 700
            }
        },
        nodeStructure: {         

                    text:{
                        name: "Juan",
                        title: "82283181"
                    },
                    collapsed: true,
                    children: [
                        {
                            text:{ // izquierda
                                name: "Checha",
                                title: "1243556567"
                            }
                        },
                        {
                            text:{ //derecha
                                name: "Cherk",
                                title: "13354668"
                            }
                        }
                    ]
                }

    };

