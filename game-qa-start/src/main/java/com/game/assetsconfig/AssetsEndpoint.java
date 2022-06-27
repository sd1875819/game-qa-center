package com.game.assetsconfig;

import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Author 11123357
 * @Date 2020/9/28 14:51
 * @Version 1.0
 */
@Controller
public class AssetsEndpoint {
/*
    @Value("${frontend.assets.location}")
    private String assetsHost;

    @Value("${spring.assets.getlocal}")
    private boolean getLocalAssets;
    

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;

    @RequestMapping(value = {"/", "/home/index.html"}, method = GET)
    public ModelAndView index(@RequestParam(value = "debug",required = false) String debug) throws Exception {
        ModelAndView mv = genMAV("home", debug);
        mv.addObject("pageChineseName", "home");
        return mv;
    }

    @RequestMapping(value = {"/test.html"}, method = GET)
    public ModelAndView test() throws Exception {
        ModelAndView mv = genNewMAV("testnew");
        mv.addObject("pageChineseName", "testnew");
        return mv;
    }

    private ModelAndView genNewMAV(String pageName) {
        ModelAndView modelAndView = new ModelAndView(pageName);
        modelAndView.addObject("pageName", pageName);
        modelAndView.addObject("name", "ly");
        return modelAndView;
    }

    private ModelAndView genMAV(String pageName, String debug) {
        ModelAndView modelAndView = new ModelAndView("home");
        String url = request.getRequestURL().toString();
        String realAssetsHost = "";
        if(getLocalAssets && url.contains(".test")) {
            realAssetsHost = assetsHost;
        } else {
            if(url.contains(".test") || url.contains(".net")|| url.contains("pre-")) {
                realAssetsHost = "https://g-assets.daily.taobao.net/LazadaMobileQACenter/lazada-mobile-ice/" + SwitchConfig.assertsVersion;
            } else {
                realAssetsHost = "https://g.alicdn.com/LazadaMobileQACenter/lazada-mobile-ice/" + SwitchConfig.assertsVersion;
            }
        }
        String cssLocation = realAssetsHost  + "/css/index.css";
        String jsLocation = realAssetsHost  + "/js/index.js";
        modelAndView.addObject("cssLocation", cssLocation);
        modelAndView.addObject("jsLocation", jsLocation);
        modelAndView.addObject("name", "ly");
        modelAndView.addObject("pageName", pageName);
//        try {
//            BucSSOUser ssoUser = SimpleUserUtil.getBucSSOUser(this.request);
//            modelAndView.addObject("userInfo", JSON.toJSON(ssoUser));
//            lzdUserVisitService.insertUserVisit(ssoUser.getEmpId(), ssoUser.getNickNameCn(), null, null);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        return modelAndView;
    }


    */
/**
     * get request response session
     * @param request
     * @param response
     *//*

    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request,
                             HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session = request.getSession();
    }
*/

}
