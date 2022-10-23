<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="myCarousel" class="carousel slide">
    <!-- 轮播（Carousel）指标 -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <!-- 轮播（Carousel）项目 -->
    <div class="carousel-inner">
        <div class="item active">
            <img src="//oasisstatics.oneplus.cn/content/dam/oasis/page/2022/operation/apr/homepage/ACE-new-S.jpg.thumb.webp" alt="ip14" style="width:100%">
        </div>
        <div class="item">
            <img src="//oasisstatics.oneplus.cn/content/dam/oasis/page/2022/operation/july/ovaltine/Ace-pro-S-1.jpg.thumb.webp" alt=" huawei" style="width:100%">
        </div>
        <div class="item">
            <img src="//oasisstatics.oneplus.cn/content/dam/oasis/page/2022/operation/may/cn/Ace-KV-S2.jpg.transform/scale-50/image.jpg" alt="iwatch2" style="width:100%">
        </div>
    </div>
    <!-- 轮播（Carousel）导航 -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>