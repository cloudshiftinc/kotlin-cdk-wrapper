@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Specifies that AWS WAF should allow the request and optionally defines additional custom handling
 * for the request.
 *
 * This is used in the context of other settings, for example to specify values for a rule action or
 * a web ACL default action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * AllowActionProperty allowActionProperty = AllowActionProperty.builder()
 * .customRequestHandling(CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-allowaction.html)
 */
@CdkDslMarker
public class CfnWebACLAllowActionPropertyDsl {
  private val cdkBuilder: CfnWebACL.AllowActionProperty.Builder =
      CfnWebACL.AllowActionProperty.builder()

  /**
   * @param customRequestHandling Defines custom handling for the web request.
   * For information about customizing web requests and responses, see [Customizing web requests and
   * responses in AWS
   * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
   * the *AWS WAF Developer Guide* .
   */
  public fun customRequestHandling(customRequestHandling: IResolvable) {
    cdkBuilder.customRequestHandling(customRequestHandling)
  }

  /**
   * @param customRequestHandling Defines custom handling for the web request.
   * For information about customizing web requests and responses, see [Customizing web requests and
   * responses in AWS
   * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
   * the *AWS WAF Developer Guide* .
   */
  public fun customRequestHandling(customRequestHandling: CfnWebACL.CustomRequestHandlingProperty) {
    cdkBuilder.customRequestHandling(customRequestHandling)
  }

  public fun build(): CfnWebACL.AllowActionProperty = cdkBuilder.build()
}
