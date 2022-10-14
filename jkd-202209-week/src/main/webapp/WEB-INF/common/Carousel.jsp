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
            <img src="https://res.vmallres.com//uomcdn/CN/ams/202210/065E380459626D2FEA76659FB07EC3C5.jpg" alt="First slide" style="width:100%">
        </div>
        <div class="item">
            <img src="https://res.vmallres.com/cmscdn/CN/2022-10/6e26f31787ec43208d69e8c5b93b39c3.jpg" alt="Second slide" style="width:100%">
        </div>
        <div class="item">
            <img src="https://res.vmallres.com/cmscdn/CN/2022-10/f217ea82410a4d089bff17e56e7b34b9.jpg" alt="Third slide" style="width:100%">
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