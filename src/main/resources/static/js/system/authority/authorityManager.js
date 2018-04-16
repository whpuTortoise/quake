/**
 * 菜单管理
 */
$(function() {
    var e = [{
        text: "父节点 1",
        href: "#parent1",
        tags: ["4"],
        nodes: [{
            text: "子节点 1",
            href: "#child1",
            tags: ["2"],
            nodes: [{
                text: "孙子节点 1",
                href: "#grandchild1",
                tags: ["0"]
            },
            {
                text: "孙子节点 2",
                href: "#grandchild2",
                tags: ["0"]
            }]
        },
        {
            text: "子节点 2",
            href: "#child2",
            tags: ["0"]
        }]
    },
    {
        text: "父节点 2",
        href: "#parent2",
        tags: ["0"]
    },
    {
        text: "父节点 3",
        href: "#parent3",
        tags: ["0"]
    },
    {
        text: "父节点 4",
        href: "#parent4",
        tags: ["0"]
    },
    {
        text: "父节点 5",
        href: "#parent5",
        tags: ["0"]
    }];
   
    $("#treeview5").treeview({
    	showIcon: false,
    	showCheckbox: true,
        color: "#428bca",
        expandIcon: "glyphicon glyphicon-chevron-right",
        collapseIcon: "glyphicon glyphicon-chevron-down",
        nodeIcon: "glyphicon glyphicon-bookmark",
        data: e
    });
    
    $("#treeview11").treeview({
        color: "#428bca",
        data: e,
        onNodeSelected: function(e, o) {
            $("#event_output").prepend("<p>您单击了 " + o.text + "</p>")
        }
    });
   
});