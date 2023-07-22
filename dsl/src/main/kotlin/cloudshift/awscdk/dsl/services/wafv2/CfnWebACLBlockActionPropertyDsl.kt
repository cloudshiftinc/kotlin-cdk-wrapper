@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLBlockActionPropertyDsl {
  private val cdkBuilder: CfnWebACL.BlockActionProperty.Builder =
      CfnWebACL.BlockActionProperty.builder()

  /**
   * @param customResponse Defines a custom response for the web request.
   * For information about customizing web requests and responses, see [Customizing web requests and
   * responses in AWS
   * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
   * the *AWS WAF Developer Guide* .
   */
  public fun customResponse(customResponse: IResolvable) {
    cdkBuilder.customResponse(customResponse)
  }

  /**
   * @param customResponse Defines a custom response for the web request.
   * For information about customizing web requests and responses, see [Customizing web requests and
   * responses in AWS
   * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
   * the *AWS WAF Developer Guide* .
   */
  public fun customResponse(customResponse: CfnWebACL.CustomResponseProperty) {
    cdkBuilder.customResponse(customResponse)
  }

  public fun build(): CfnWebACL.BlockActionProperty = cdkBuilder.build()
}
