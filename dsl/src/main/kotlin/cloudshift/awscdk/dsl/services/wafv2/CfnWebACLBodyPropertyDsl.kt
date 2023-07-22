@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLBodyPropertyDsl {
  private val cdkBuilder: CfnWebACL.BodyProperty.Builder = CfnWebACL.BodyProperty.builder()

  /**
   * @param oversizeHandling What AWS WAF should do if the body is larger than AWS WAF can inspect.
   * AWS WAF does not support inspecting the entire contents of the web request body if the body
   * exceeds the limit for the resource type. If the body is larger than the limit, the underlying host
   * service only forwards the contents that are below the limit to AWS WAF for inspection.
   *
   * The default limit is 8 KB (8,192 kilobytes) for regional resources and 16 KB (16,384 kilobytes)
   * for CloudFront distributions. For CloudFront distributions, you can increase the limit in the web
   * ACL `AssociationConfig` , for additional processing fees.
   *
   * The options for oversize handling are the following:
   *
   * * `CONTINUE` - Inspect the available body contents normally, according to the rule inspection
   * criteria.
   * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
   * action to the request.
   * * `NO_MATCH` - Treat the web request as not matching the rule statement.
   *
   * You can combine the `MATCH` or `NO_MATCH` settings for oversize handling with your rule and web
   * ACL action settings, so that you block any request whose body is over the limit.
   *
   * Default: `CONTINUE`
   */
  public fun oversizeHandling(oversizeHandling: String) {
    cdkBuilder.oversizeHandling(oversizeHandling)
  }

  public fun build(): CfnWebACL.BodyProperty = cdkBuilder.build()
}
