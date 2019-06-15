<#import "parts/common.ftl" as h>
<#import "parts/login.ftl" as l>
<@h.page>
Add new user
${message}
    <@l.login "/registration" >
    </@l.login >
</@h.page>