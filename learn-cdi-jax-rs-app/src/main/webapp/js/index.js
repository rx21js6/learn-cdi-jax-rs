const onAddMessageButtonClick = function() {
    const messageInputElement = document.getElementById("input_indexForm:messageInput");
    const jsonResultElement = document.getElementById("input_indexForm:jsonResult");
    const message = messageInputElement.value;
    // alert("onAddMessageButtonClick: " + message);

    const data = { requestMessage : message };
    const url = axios.post("ws/index/addMessage", data)
        .then(response => {
            console.log(response);
            jsonResultElement.value = response.data.messages.join(",");

        })
        .catch(err => {
            console.log("err:", err);
        });
}
