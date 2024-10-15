<script>
    document.getElementById("yesButton").addEventListener("click", showAlert);

    function showAlert() {
        document.getElementById("main").style.display = "none"; // Hide main content
        document.getElementById("calendarContainer").style.display = "flex"; // Show calendar
    }

    var yesButton = document.getElementById("yesButton");
    var no = document.getElementById("no");
    var valentineImage = document.getElementById("valentineImage");

    var noTexts = ["Are you sure?", "But whyyyyy", "Alaa nak laaaa", "Pleaseeee :(", "Awak nak kan", "Kene pergi jugak"];
    var imageSources = [
        "https://content.imageresizer.com/images/memes/Sad-Cat-Looking-At-Phone-meme-4.jpg",
        "https://i.pinimg.com/280x280_RS/fa/dc/ee/fadceefa6e7647c2a71e3bef47544053.jpg",
        "https://p3.itc.cn/images01/20220721/3e78b2b6caa146b5aa1db7f6d9a4a7ff.jpeg",
        "https://i.pinimg.com/736x/cb/d8/3b/cbd83b534a315e809a9da2b8cd3ac3bf.jpg"
    ];

    no.addEventListener("click", change);

    function change() {
        var randomIndex = Math.floor(Math.random() * noTexts.length);
        var randomText = noTexts[randomIndex];
        no.innerText = randomText;

        var i = Math.floor(Math.random() * 1000) + 1;
        var j = Math.floor(Math.random() * 700) + 1;
        no.style.left = i + "px";
        no.style.top = j + "px";

        var currentWidth = yesButton.offsetWidth;
        var currentHeight = yesButton.offsetHeight;
        yesButton.style.width = currentWidth + 30 + "px";
        yesButton.style.height = currentHeight + 10 + "px";

        var randomImageIndex = Math.floor(Math.random() * imageSources.length);
        valentineImage.src = imageSources[randomImageIndex];
    }

    document.getElementById("confirmDateButton").addEventListener("click", function () {
        var selectedDate = document.getElementById("dateInput").value;
        var selectedTime = document.getElementById("timeInput").value;
        if (selectedDate && selectedTime) {
            document.getElementById("calendarContainer").style.display = "none"; // Hide calendar
            document.getElementById("summaryText").innerText = "We will meet on : " + selectedDate + " at " + selectedTime;
            document.getElementById("summaryContainer").style.display = "flex"; // Show summary
        } else {
            alert("Please select both a date and a time.");
        }
    });
</script>
