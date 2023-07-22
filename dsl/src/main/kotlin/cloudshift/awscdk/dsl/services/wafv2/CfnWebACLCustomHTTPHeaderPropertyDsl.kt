@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLCustomHTTPHeaderPropertyDsl {
  private val cdkBuilder: CfnWebACL.CustomHTTPHeaderProperty.Builder =
      CfnWebACL.CustomHTTPHeaderProperty.builder()

  /**
   * @param name The name of the custom header. 
   * For custom request header insertion, when AWS WAF inserts the header into the request, it
   * prefixes this name `x-amzn-waf-` , to avoid confusion with the headers that are already in the
   * request. For example, for the header name `sample` , AWS WAF inserts the header
   * `x-amzn-waf-sample` .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value of the custom header. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnWebACL.CustomHTTPHeaderProperty = cdkBuilder.build()
}
