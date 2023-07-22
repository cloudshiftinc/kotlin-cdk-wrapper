@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLCaptchaActionPropertyDsl {
  private val cdkBuilder: CfnWebACL.CaptchaActionProperty.Builder =
      CfnWebACL.CaptchaActionProperty.builder()

  /**
   * @param customRequestHandling Defines custom handling for the web request, used when the
   * `CAPTCHA` inspection determines that the request's token is valid and unexpired.
   * For information about customizing web requests and responses, see [Customizing web requests and
   * responses in AWS
   * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
   * the *AWS WAF Developer Guide* .
   */
  public fun customRequestHandling(customRequestHandling: IResolvable) {
    cdkBuilder.customRequestHandling(customRequestHandling)
  }

  /**
   * @param customRequestHandling Defines custom handling for the web request, used when the
   * `CAPTCHA` inspection determines that the request's token is valid and unexpired.
   * For information about customizing web requests and responses, see [Customizing web requests and
   * responses in AWS
   * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
   * the *AWS WAF Developer Guide* .
   */
  public fun customRequestHandling(customRequestHandling: CfnWebACL.CustomRequestHandlingProperty) {
    cdkBuilder.customRequestHandling(customRequestHandling)
  }

  public fun build(): CfnWebACL.CaptchaActionProperty = cdkBuilder.build()
}
