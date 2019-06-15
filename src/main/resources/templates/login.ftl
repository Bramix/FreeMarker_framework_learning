<#import "parts/common.ftl" as h>
<#import "parts/login.ftl" as l>
<@h.page>
    <@l.login "/login" >
        <a href="/registration">Add new user</a>
    </@l.login>
</@h.page>