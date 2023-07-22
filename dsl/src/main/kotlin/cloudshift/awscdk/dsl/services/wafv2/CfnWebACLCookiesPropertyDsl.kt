@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLCookiesPropertyDsl {
  private val cdkBuilder: CfnWebACL.CookiesProperty.Builder = CfnWebACL.CookiesProperty.builder()

  /**
   * @param matchPattern The filter to use to identify the subset of cookies to inspect in a web
   * request. 
   * You must specify exactly one setting: either `All` , `IncludedCookies` , or `ExcludedCookies` .
   *
   * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
   */
  public fun matchPattern(matchPattern: IResolvable) {
    cdkBuilder.matchPattern(matchPattern)
  }

  /**
   * @param matchPattern The filter to use to identify the subset of cookies to inspect in a web
   * request. 
   * You must specify exactly one setting: either `All` , `IncludedCookies` , or `ExcludedCookies` .
   *
   * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
   */
  public fun matchPattern(matchPattern: CfnWebACL.CookieMatchPatternProperty) {
    cdkBuilder.matchPattern(matchPattern)
  }

  /**
   * @param matchScope The parts of the cookies to inspect with the rule inspection criteria. 
   * If you specify `All` , AWS WAF inspects both keys and values.
   */
  public fun matchScope(matchScope: String) {
    cdkBuilder.matchScope(matchScope)
  }

  /**
   * @param oversizeHandling What AWS WAF should do if the cookies of the request are more numerous
   * or larger than AWS WAF can inspect. 
   * AWS WAF does not support inspecting the entire contents of request cookies when they exceed 8
   * KB (8192 bytes) or 200 total cookies. The underlying host service forwards a maximum of 200
   * cookies and at most 8 KB of cookie contents to AWS WAF .
   *
   * The options for oversize handling are the following:
   *
   * * `CONTINUE` - Inspect the available cookies normally, according to the rule inspection
   * criteria.
   * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
   * action to the request.
   * * `NO_MATCH` - Treat the web request as not matching the rule statement.
   */
  public fun oversizeHandling(oversizeHandling: String) {
    cdkBuilder.oversizeHandling(oversizeHandling)
  }

  public fun build(): CfnWebACL.CookiesProperty = cdkBuilder.build()
}
