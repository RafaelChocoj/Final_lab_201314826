    var chart_config = { 
chart: {    container: "#basic-example",
    connectors: 
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
    text: { 
    name: "raiz", 
    title: "0_0", 
},
collapsed: true,
children: [
    {
        text:{
            name: "L 0",
            title: "0_1"
       }
   },
    {
        text:{
            name: "R 0",
            title: "0_2"
       }
   }
    ]
        } 
};