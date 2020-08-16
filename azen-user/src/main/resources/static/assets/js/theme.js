var custom_js = {
    init: function () {
        jQuery('#preload').delay(100).fadeOut(500, function () {
            jQuery(this).remove();
        });

        jQuery('.date-social .product-share span').on("click", function () {
            jQuery(this).parent().toggleClass('active')
        })
    },

    mobile_menu: function () {
        /*Hamburger Button*/
        jQuery('.menu-mobile-effect').on("click", function () {
            jQuery(this).toggleClass("is-active");
            jQuery('#js-navbar-fixed .main-menu').slideToggle(200, 'linear');
        });

        jQuery('.navmenu .menu-item-has-children').append('<span class="zmdi zmdi-chevron-down show-submenu-mobile"></span>');
        jQuery('.navmenu .menu-item-has-children .show-submenu-mobile').on('click touch', function (e) {
            e.preventDefault();
            if (jQuery(this).prev().is(':hidden')) {
                jQuery(this).prev().slideDown(200, 'linear');
                jQuery(this).addClass('toggle-open');
            } else {
                jQuery(this).prev().slideUp(200, 'linear');
                jQuery(this).removeClass('toggle-open');
            }
        });
        /*End Mobile Menu*/
    },

    search: function () {
        jQuery('.search-toggler').on('click', function (e) {
            jQuery('.search-overlay').css('visibility', 'visible');
        });
        jQuery('.closeicon,.background-overlay').on('click', function (e) {
            jQuery('.search-overlay').css('visibility', 'hidden');
        });
        jQuery(document).keyup(function (e) {
            if (e.keyCode == 27) {
                jQuery('.search-overlay').css('visibility', 'hidden');
            }
        });
        jQuery('.search-toggler').on('click', function (e) {
            jQuery('.menu-desktop-inner').css('position', 'inherit');
        });
        jQuery('.homepage-v6 .search-toggler').on('click', function (e) {
            jQuery('.search-overlay').css('position', 'fixed');
        });
        jQuery(".featured-layout-2 .slick-prev").html('PREV');
        jQuery(".woocommerce-pagination .page-numbers .next").html('NEXT');
    },
    Headerminicart: function () {
        jQuery('.widget_shopping_cart').on('click', function (e) {
            jQuery('.minicart-content').css('visibility', 'visible');
            jQuery('.widget_shopping_cart_contents').css('right', '0');
            jQuery('body').css('overflow', 'hidden');
        });
        jQuery('.close-cart,.background-overlay-cart').on('click', function (e) {
            jQuery('.minicart-content').css('visibility', 'hidden');
            jQuery('.widget_shopping_cart_contents').css('right', '-450px');
            jQuery('body').css('overflow', 'initial');
        });
        jQuery(document).keyup(function (e) {
            if (e.keyCode == 27) {
                jQuery('.minicart-content').css('visibility', 'hidden');
                jQuery('.widget_shopping_cart_contents').css('right', '-450px');
                jQuery('body').css('overflow', 'initial');
            }
        });

    },
    scrollToTop: function () {
        jQuery(window).scroll(function () {
            if (jQuery(this).scrollTop() > 100) {
                jQuery('.footer__arrow-top').css({bottom: "30px"});
            } else {
                jQuery('.footer__arrow-top').css({bottom: "-100px"});
            }
        });
        jQuery('.footer__arrow-top').on('click', function () {
            jQuery('html, body').animate({scrollTop: '0px'}, 800);
            return false;
        });
    },
    stickyHeaderInit: function () {
        //Add class for masthead
        var height_header_wrap = jQuery('.sticky_header').outerHeight();
        if (height_header_wrap > 0) {
            jQuery('.sticky_header').css({"min-height": height_header_wrap + 'px'});
        }
        jQuery(window).scroll(function () {
            if (jQuery(this).scrollTop() > 1) {
                jQuery('.header-hp-1').removeClass('affix-top').addClass('affix');
            } else {
                jQuery('.header-hp-1').removeClass('affix').addClass('affix-top');
            }
        });
    },
    flexslider_owlCarousel: function () {
        if (jQuery().flexslider) {
            jQuery('.gallery-slider').flexslider({
                slideshow: true,
                animation: 'fade',
                pauseOnHover: true,
                animationSpeed: 400,
                smoothHeight: true,
                directionNav: true,
                controlNav: false,
                prevText: '',
                nextText: ''
            });
        }
        if (jQuery().owlCarousel) {
            jQuery(".testimonials-hp-azen").each(function () {
                var $this = jQuery(this),
                    owl = $this.find('.sc-testimonials');
                owl.owlCarousel({
                    items: 1,
                    loop: true,
                    margin: 40,
                    thumbs: false,
                    thumbImage: false,
                    nav: false,
                    dots: true,
                    navText: [
                        "<span class='zmdi zmdi-chevron-left'></span>",
                        "<span class='zmdi zmdi-chevron-right'></span>"],
                    slideSpeed: 3000,
                    panigationSpeed: 400,
                    responsiveClass: true,
                    responsive: {
                        0: {
                            items: 1,
                            nav: false
                        },
                        576: {
                            items: 1

                        },
                        992: {
                            items: 1
                        }
                    }
                });
            });
            jQuery(".list-sale-1").each(function () {
                var $this = jQuery(this),
                    owl = $this.find('.sc-list-sale');
                owl.owlCarousel({
                    items: 4,
                    loop: true,
                    margin: 30,
                    nav: true,
                    dots: false,
                    thumbs: false,
                    navText: [
                        "PREV",
                        "NEXT"],
                    slideSpeed: 300,
                    panigationSpeed: 400,
                    responsiveClass: true,
                    responsive: {
                        0: {
                            items: 1,
                            nav: false
                        },
                        576: {
                            items: 2

                        },
                        992: {
                            items: 4
                        }
                    }
                });
            });
            jQuery(".ourteam-1").each(function () {
                var $this = jQuery(this),
                    owl = $this.find('.sc-ourteam');

                owl.owlCarousel({
                    items: 1,
                    loop: true,
                    margin: 15,
                    nav: true,
                    dots: false,
                    thumbs: false,
                    navText: [
                        "PREV",
                        "NEXT"],
                    slideSpeed: 300,
                    panigationSpeed: 400,
                    responsiveClass: true,
                    responsive: {
                        0: {
                            items: 1,
                            nav: false
                        },
                        768: {
                            items: 2

                        },
                        992: {
                            items: 3
                        }
                    }
                });

            });
        }
        jQuery('.partner-content').owlCarousel({
            loop: true,
            margin: 110,
            nav: false,
            thumbs: true,
            thumbImage: true,
            dots: false,
            responsive: {
                0: {
                    items: 2
                },
                600: {
                    items:4
                },
                1000: {
                    items: 6
                }
            }
        })
    },
    slick_slider: function () {
        if (jQuery().slick) {
            jQuery(".sc-posts-layout_2").each(function () {
                var $this = jQuery(this),
                    slider = $this.find('.inner-list-posts');
                slider.slick({
                    infinite: true,
                    arrows: false,
                    speed: 3000,
                    dots: true,
                    autoplay: true,
                    autoplaySpeed: 3000,
                    slidesToShow: 3,
                    slidesToScroll: 1,
                    centerMode: false,
                    responsive: [
                        {
                            breakpoint: 992,
                            settings: {
                                slidesToShow: 3,
                                slidesToScroll: 1,
                            }
                        },
                        {
                            breakpoint: 768,
                            settings: {
                                slidesToShow: 2,
                                slidesToScroll: 1,
                            }
                        },
                        {
                            breakpoint: 480,
                            settings: {
                                slidesToShow: 1,
                                slidesToScroll: 1,
                            }
                        }
                    ]
                });
            });
            jQuery(".featured-layout-3").each(function () {
                var $this = jQuery(this),
                    slider = $this.find('.products'),
                    $btn_prev = slider.parent().prev().find('.es-nav-prev'),
                    $btn_next = slider.parent().prev().find('.es-nav-next');
                slider.slick({
                    infinite: true,
                    arrows: true,
                    dots: false,
                    autoplay: true,
                    autoplaySpeed: 30000,
                    slidesToShow: 1,
                    rows: 1,
                    slidesToScroll: 1,
                    centerMode: false,
                    prevArrow: $btn_prev,
                    nextArrow: $btn_next,
                });
            });
            jQuery(".featured-layout-2").each(function () {
                var $this = jQuery(this),
                    slider = $this.find('.products');
                slider.slick({
                    infinite: true,
                    arrows: true,
                    dots: false,
                    autoplay: true,
                    autoplaySpeed: 3000,
                    slidesToShow: 4,
                    slidesToScroll: 1,
                    centerMode: false,
                    responsive: [
                        {
                            breakpoint: 1024,
                            settings: {
                                slidesToShow: 2,
                                slidesToScroll: 2
                            }
                        },
                        {
                            breakpoint: 480,
                            settings: {
                                slidesToShow: 1,
                                slidesToScroll: 1
                            }
                        }
                    ]
                });
            });
        }
    },
    select_number_product: function () {
        //select product
        jQuery('.prev').on('click', function (e) {
            e.stopImmediatePropagation();
            var btn_group_parent = $(this).closest('.btn-group');
            var number = 0;
            var show_number = btn_group_parent.find('.show-number');
            var a = show_number.text();
            a = parseInt(a);
            if (a > 1) {
                number = a - 1;
            } else {
                number = 0;
            }
            show_number.text(number);

        });

        jQuery('.next').on('click', function (e) {
            e.stopImmediatePropagation();
            var btn_group_parent = $(this).closest('.btn-group');
            var number = 0;
            var show_number = btn_group_parent.find('.show-number');
            var a = show_number.text();
            a = parseInt(a);
            if (a >= 0) {
                number = a + 1;
            }
            show_number.text(number);
        });
    },
    singleSlider: function () {
        if (jQuery().flexslider) {

            jQuery('#carousel').flexslider({
                animation: "slide",
                controlNav: false,
                animationLoop: true,
                slideshow: true,
                itemWidth: 130,
                itemMargin: 20,
                asNavFor: '#slider',
                smoothHeight: false,
                directionNav: true,
                prevText: "",
                nextText: ""
            });

            jQuery('#slider').flexslider({
                animation: "slide",
                controlNav: false,
                animationLoop: true,
                slideshow: true,
                sync: "#carousel",
                directionNav: false,
            });

        }
    },
    revolution_slider: function () {
        jQuery("#rev_slider_1_1").show().revolution({
            sliderType: "standard",
            sliderLayout: "fullwidth",
            dottedOverlay: "none",
            delay: 3000,
            navigation: {
                keyboardNavigation: "off",
                keyboard_direction: "horizontal",
                mouseScrollNavigation: "off",
                mouseScrollReverse: "default",
                onHoverStop: "on",
                touch: {
                    touchenabled: "on",
                    touchOnDesktop: "off",
                    swipe_threshold: 75,
                    swipe_min_touches: 50,
                    swipe_direction: "horizontal",
                    drag_block_vertical: false
                }
                ,
                arrows: {
                    style: "custom",
                    enable: true,
                    hide_onmobile: true,
                    hide_under: 600,
                    hide_onleave: false,
                    tmp: '',
                    left: {
                        container: "layergrid",
                        h_align: "left",
                        v_align: "center",
                        h_offset: 30,
                        v_offset: 0
                    },
                    right: {
                        container: "layergrid",
                        h_align: "right",
                        v_align: "center",
                        h_offset: 30,
                        v_offset: 0
                    }
                }
                ,
                bullets: {
                    enable: true,
                    hide_onmobile: true,
                    hide_under: 600,
                    style: "persephone",
                    hide_onleave: false,
                    direction: "horizontal",
                    h_align: "center",
                    v_align: "bottom",
                    h_offset: 0,
                    v_offset: 30,
                    space: 10,
                    tmp: ''
                }
            },
            responsiveLevels: [1240, 1024, 778, 480],
            visibilityLevels: [1240, 1024, 778, 480],
            gridwidth: [1500, 1024, 778, 480],
            gridheight: [700, 600, 500, 400],
            lazyType: "none",
            parallax: {
                type: "mouse",
                origo: "slidercenter",
                speed: 2000,
                speedbg: 0,
                speedls: 0,
                levels: [2, 3, 4, 5, 6, 7, 12, 16, 10, 50, 47, 48, 49, 50, 51, 55],
            },
            shadow: 0,
            spinner: "off",
            stopLoop: "off",
            stopAfterLoops: -1,
            stopAtSlide: -1,
            shuffle: "on",
            autoHeight: "off",
            disableProgressBar: "on",
            hideThumbsOnMobile: "off",
            hideSliderAtLimit: 0,
            hideCaptionAtLimit: 0,
            hideAllCaptionAtLilmit: 0,
            debugMode: false,
            fallbacks: {
                simplifyAll: "off",
                nextSlideOnWindowFocus: "off",
                disableFocusListener: false,
            }
        });
        jQuery("#rev_slider_2_1").show().revolution({
            sliderType: "standard",
            sliderLayout: "auto",
            dottedOverlay: "none",
            delay: 3000,
            navigation: {
                keyboardNavigation: "off",
                keyboard_direction: "horizontal",
                mouseScrollNavigation: "off",
                mouseScrollReverse: "default",
                onHoverStop: "on",
                touch: {
                    touchenabled: "on",
                    touchOnDesktop: "off",
                    swipe_threshold: 75,
                    swipe_min_touches: 50,
                    swipe_direction: "horizontal",
                    drag_block_vertical: false
                }
                ,
                arrows: {
                    style: "custom",
                    enable: true,
                    hide_onmobile: true,
                    hide_under: 600,
                    hide_onleave: false,
                    tmp: '',
                    left: {
                        container: "layergrid",
                        h_align: "left",
                        v_align: "center",
                        h_offset: 0,
                        v_offset: 0
                    },
                    right: {
                        container: "layergrid",
                        h_align: "right",
                        v_align: "center",
                        h_offset: 0,
                        v_offset: 0
                    }
                }
                ,
                bullets: {
                    enable: true,
                    hide_onmobile: true,
                    hide_under: 600,
                    style: "persephone",
                    hide_onleave: false,
                    direction: "horizontal",
                    h_align: "center",
                    v_align: "bottom",
                    h_offset: 0,
                    v_offset: 30,
                    space: 10,
                    tmp: ''
                }
            },
            responsiveLevels: [1240, 1024, 778, 480],
            visibilityLevels: [1240, 1024, 778, 480],
            gridwidth: [1700, 1300, 778, 480],
            gridheight: [700, 600, 500, 400],
            lazyType: "none",
            parallax: {
                type: "mouse",
                origo: "slidercenter",
                speed: 2000,
                speedbg: 0,
                speedls: 0,
                levels: [2, 3, 4, 5, 6, 7, 12, 16, 10, 50, 47, 48, 49, 50, 51, 55],
            },
            shadow: 0,
            spinner: "off",
            stopLoop: "off",
            stopAfterLoops: -1,
            stopAtSlide: -1,
            shuffle: "on",
            autoHeight: "off",
            disableProgressBar: "on",
            hideThumbsOnMobile: "off",
            hideSliderAtLimit: 0,
            hideCaptionAtLimit: 0,
            hideAllCaptionAtLilmit: 0,
            debugMode: false,
            fallbacks: {
                simplifyAll: "off",
                nextSlideOnWindowFocus: "off",
                disableFocusListener: false,
            }
        });
        jQuery("#rev_slider_3_1").show().revolution({
            sliderType: "standard",
            sliderLayout: "fullwidth",
            dottedOverlay: "none",
            delay: 3000,
            navigation: {
                keyboardNavigation: "off",
                keyboard_direction: "horizontal",
                mouseScrollNavigation: "off",
                mouseScrollReverse: "default",
                onHoverStop: "on",
                touch: {
                    touchenabled: "on",
                    touchOnDesktop: "off",
                    swipe_threshold: 75,
                    swipe_min_touches: 50,
                    swipe_direction: "horizontal",
                    drag_block_vertical: false
                }
                ,
                arrows: {
                    style: "custom",
                    enable: true,
                    hide_onmobile: true,
                    hide_under: 600,
                    hide_onleave: false,
                    tmp: '',
                    left: {
                        container: "layergrid",
                        h_align: "left",
                        v_align: "center",
                        h_offset: 30,
                        v_offset: 0
                    },
                    right: {
                        container: "layergrid",
                        h_align: "right",
                        v_align: "center",
                        h_offset: 30,
                        v_offset: 0
                    }
                }
                ,
                bullets: {
                    enable: true,
                    hide_onmobile: true,
                    hide_under: 600,
                    style: "persephone",
                    hide_onleave: false,
                    direction: "horizontal",
                    h_align: "center",
                    v_align: "bottom",
                    h_offset: 0,
                    v_offset: 30,
                    space: 10,
                    tmp: ''
                }
            },
            responsiveLevels: [1240, 1024, 778, 480],
            visibilityLevels: [1240, 1024, 778, 480],
            gridwidth: [1500, 1024, 778, 480],
            gridheight: [700, 600, 500, 400],
            lazyType: "none",
            parallax: {
                type: "mouse",
                origo: "slidercenter",
                speed: 2000,
                speedbg: 0,
                speedls: 0,
                levels: [2, 3, 4, 5, 6, 7, 12, 16, 10, 50, 47, 48, 49, 50, 51, 55],
            },
            shadow: 0,
            spinner: "off",
            stopLoop: "off",
            stopAfterLoops: -1,
            stopAtSlide: -1,
            shuffle: "on",
            autoHeight: "off",
            disableProgressBar: "on",
            hideThumbsOnMobile: "off",
            hideSliderAtLimit: 0,
            hideCaptionAtLimit: 0,
            hideAllCaptionAtLilmit: 0,
            debugMode: false,
            fallbacks: {
                simplifyAll: "off",
                nextSlideOnWindowFocus: "off",
                disableFocusListener: false,
            }
        });
        jQuery("#rev_slider_4_1").show().revolution({
            sliderType: "standard",
            sliderLayout: "auto",
            dottedOverlay: "none",
            delay: 3000,
            navigation: {
                keyboardNavigation: "off",
                keyboard_direction: "horizontal",
                mouseScrollNavigation: "off",
                mouseScrollReverse: "default",
                onHoverStop: "on",
                touch: {
                    touchenabled: "on",
                    touchOnDesktop: "off",
                    swipe_threshold: 75,
                    swipe_min_touches: 50,
                    swipe_direction: "horizontal",
                    drag_block_vertical: false
                }
                ,
                arrows: {
                    style: "uranus",
                    enable: true,
                    hide_onmobile: true,
                    hide_under: 600,
                    hide_onleave: false,
                    tmp: '',
                    left: {
                        container: "layergrid",
                        h_align: "left",
                        v_align: "center",
                        h_offset: 20,
                        v_offset: 0
                    },
                    right: {
                        container: "layergrid",
                        h_align: "right",
                        v_align: "center",
                        h_offset: 20,
                        v_offset: 0
                    }
                }
                ,
                bullets: {
                    enable: true,
                    hide_onmobile: true,
                    hide_under: 600,
                    style: "persephone",
                    hide_onleave: false,
                    direction: "horizontal",
                    h_align: "center",
                    v_align: "bottom",
                    h_offset: 0,
                    v_offset: -30,
                    space: 10,
                    tmp: ''
                }
            },
            responsiveLevels: [1240, 1024, 778, 480],
            visibilityLevels: [1240, 1024, 778, 480],
            gridwidth: [1400, 1024, 778, 480],
            gridheight: [700, 600, 500, 400],
            lazyType: "none",
            parallax: {
                type: "mouse",
                origo: "slidercenter",
                speed: 2000,
                speedbg: 0,
                speedls: 0,
                levels: [2, 3, 4, 5, 6, 7, 12, 16, 10, 50, 47, 48, 49, 50, 51, 55],
            },
            shadow: 0,
            spinner: "off",
            stopLoop: "off",
            stopAfterLoops: -1,
            stopAtSlide: -1,
            shuffle: "on",
            autoHeight: "off",
            disableProgressBar: "on",
            hideThumbsOnMobile: "off",
            hideSliderAtLimit: 0,
            hideCaptionAtLimit: 0,
            hideAllCaptionAtLilmit: 0,
            debugMode: false,
            fallbacks: {
                simplifyAll: "off",
                nextSlideOnWindowFocus: "off",
                disableFocusListener: false,
            }
        });
        jQuery("#rev_slider_5_1").show().revolution({
            sliderType: "standard",
            sliderLayout: "auto",
            dottedOverlay: "none",
            delay: 3000,
            navigation: {
                keyboardNavigation: "off",
                keyboard_direction: "horizontal",
                mouseScrollNavigation: "off",
                mouseScrollReverse: "default",
                onHoverStop: "on",
                touch: {
                    touchenabled: "on",
                    touchOnDesktop: "off",
                    swipe_threshold: 75,
                    swipe_min_touches: 50,
                    swipe_direction: "horizontal",
                    drag_block_vertical: false
                }
                ,
                arrows: {
                    style: "custom",
                    enable: true,
                    hide_onmobile: true,
                    hide_under: 600,
                    hide_onleave: false,
                    tmp: '',
                    left: {
                        container: "layergrid",
                        h_align: "left",
                        v_align: "center",
                        h_offset: 0,
                        v_offset: 0
                    },
                    right: {
                        container: "layergrid",
                        h_align: "right",
                        v_align: "center",
                        h_offset: 0,
                        v_offset: 0
                    }
                }
                ,
                bullets: {
                    enable: true,
                    hide_onmobile: true,
                    hide_under: 600,
                    style: "persephone",
                    hide_onleave: false,
                    direction: "horizontal",
                    h_align: "center",
                    v_align: "bottom",
                    h_offset: 0,
                    v_offset: 30,
                    space: 10,
                    tmp: ''
                }
            },
            responsiveLevels: [1240, 1024, 778, 480],
            visibilityLevels: [1240, 1024, 778, 480],
            gridwidth: [1500, 1200, 778, 480],
            gridheight: [700, 600, 500, 400],
            lazyType: "none",
            parallax: {
                type: "mouse",
                origo: "slidercenter",
                speed: 2000,
                speedbg: 0,
                speedls: 0,
                levels: [2, 3, 4, 5, 6, 7, 12, 16, 10, 50, 47, 48, 49, 50, 51, 55],
            },
            shadow: 0,
            spinner: "off",
            stopLoop: "off",
            stopAfterLoops: -1,
            stopAtSlide: -1,
            shuffle: "on",
            autoHeight: "off",
            disableProgressBar: "on",
            hideThumbsOnMobile: "off",
            hideSliderAtLimit: 0,
            hideCaptionAtLimit: 0,
            hideAllCaptionAtLilmit: 0,
            debugMode: false,
            fallbacks: {
                simplifyAll: "off",
                nextSlideOnWindowFocus: "off",
                disableFocusListener: false,
            }
        });
        jQuery("#rev_slider_6_1").show().revolution({
            sliderType: "standard",
            sliderLayout: "fullwidth",
            dottedOverlay: "none",
            delay: 3000,
            navigation: {
                keyboardNavigation: "off",
                keyboard_direction: "horizontal",
                mouseScrollNavigation: "off",
                mouseScrollReverse: "default",
                onHoverStop: "off",
                arrows: {
                    style: "uranus",
                    enable: true,
                    hide_onmobile: true,
                    hide_under: 500,
                    hide_onleave: false,
                    tmp: '',
                    left: {
                        h_align: "left",
                        v_align: "center",
                        h_offset: 30,
                        v_offset: 0
                    },
                    right: {
                        h_align: "right",
                        v_align: "center",
                        h_offset: 30,
                        v_offset: 0
                    }
                }
            },
            responsiveLevels: [1240, 1024, 778, 480],
            visibilityLevels: [1240, 1024, 778, 480],
            gridwidth: [1700, 1300, 778, 480],
            gridheight: [700, 600, 500, 400],
            lazyType: "none",
            shadow: 0,
            spinner: "spinner0",
            stopLoop: "off",
            stopAfterLoops: -1,
            stopAtSlide: -1,
            shuffle: "on",
            autoHeight: "off",
            disableProgressBar: "on",
            hideThumbsOnMobile: "off",
            hideSliderAtLimit: 0,
            hideCaptionAtLimit: 0,
            hideAllCaptionAtLilmit: 0,
            debugMode: false,
            fallbacks: {
                simplifyAll: "off",
                nextSlideOnWindowFocus: "off",
                disableFocusListener: false,
            }
        });
    },
    variablie_product: function () {
        jQuery('.shop-single-v1-section .cart .thwvsf-wrapper-ul li').on('click touch', function () {
            var parent = $(this).closest('ul');
            var elActived = parent.find('li.active');
            elActived.removeClass('active');
            jQuery(this).addClass("active");
        })
        jQuery(".showcoupon").on('click', function () {
            jQuery(".woocommerce-form-coupon").slideToggle();
        });
        jQuery(".showlogin").on('click', function () {
            jQuery(".checkout-login").slideToggle();
        });
        jQuery('.input-radio').on('click', function (e) {
            jQuery(this).parent().toggleClass('active')
        });
    },
    slider_ranger_price: function () {
        jQuery('.price_ranger_slider .price_slider_wrapper .price_slider').each(function () {
            var minvalue = jQuery(this).data('min');
            var maxvalue = jQuery(this).data('max');
            var limitvalue = jQuery(this).data('limit');
            jQuery(this).slider({
                range:true,
                min: 0,
                max: limitvalue,
                values: [ minvalue, maxvalue ],
                slide: function( event, ui ) {
                    jQuery( "#ranger_price" ).val( "$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ] );
                }
            });
            jQuery( "#ranger_price" ).val( "$" + jQuery( this ).slider( "values", 0 ) +
                " - $" + jQuery(this).slider( "values", 1 ) );

        })
    }
}

jQuery(document).ready(function ($) {
    custom_js.init();
    custom_js.mobile_menu();
    custom_js.Headerminicart();
    custom_js.search();
    custom_js.scrollToTop();
    custom_js.stickyHeaderInit();
    custom_js.flexslider_owlCarousel();
    custom_js.slick_slider();
    custom_js.select_number_product();
    custom_js.singleSlider();
    custom_js.variablie_product();
    custom_js.slider_ranger_price();


    var rev_slider_wrapper = jQuery('.rev_slider_wrapper');
    if (rev_slider_wrapper.length) {
        custom_js.revolution_slider();
    }

    var homepage6 = jQuery('.homepage-v6');
    if (homepage6.length) {
        var countdown = jQuery('.sc-list-sale .item .wrap-countdown');
        for (var i = 0; i < countdown.length; i++) {
            var count = jQuery(countdown[i]).find('.countdown'),
                time = count.data('time'),
                labels = [
                    count.data('text-year') ? count.data('text-year') : 'Years',
                    count.data('text-month') ? count.data('text-month') : 'Months',
                    count.data('text-week') ? count.data('text-week') : 'Weeks',
                    count.data('text-day') ? count.data('text-day') : 'Days',
                    count.data('text-hour') ? count.data('text-hour') : 'Hours',
                    count.data('text-minute') ? count.data('text-minute') : 'Mins',
                    count.data('text-second') ? count.data('text-second') : 'Secs',
                ];
            time = new Date(time);
            jQuery(countdown[i]).countdown({
                labels: labels,
                until: time
            });
        }
    }


    var commingsoon = jQuery('.comming-soon-page');
    if (commingsoon.length) {
        var time_comming = jQuery('.deal-hp-2 .deal-content .wrap-countdown .countdown');
        var timecomming = time_comming.data('time');

        timecomming = new Date(timecomming);
        jQuery(time_comming).countdown({
            until: timecomming
        });
    }


});

