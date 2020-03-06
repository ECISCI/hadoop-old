(function () {
    var params = {};
    if(document) {
        params.domain = document.domain || ''; 
        params.url = document.URL || ''; 
        params.title = document.title || ''; 
        params.referrer = document.referrer || ''; 
    }   
    if(window && window.screen) {
        params.sh = window.screen.height || 0;
        params.sw = window.screen.width || 0;
        params.cd = window.screen.colorDepth || 0;
    }   
    if(navigator) {
        params.lang = navigator.language || ''; 
    }   
    if(_maq) {
        for(var i in _maq) {
            switch(_maq[i][0]) {
                case 'type':
                    params.account = _maq[i][1];
                    break;
                default:
                    break;
            }   
        }   
    }   
    var args = '';
    for(var i in params) {
        if(args != '') {
            args += '&';
        }   
        args += i + '=' + encodeURIComponent(params[i]);
    }   
    var img = new Image(1, 1);
    img.src = 'http://xxx.xxx.xxx.xxx/log.gif?' + args;
})();
