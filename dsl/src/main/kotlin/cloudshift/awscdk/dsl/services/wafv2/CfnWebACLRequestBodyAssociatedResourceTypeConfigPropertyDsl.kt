@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLRequestBodyAssociatedResourceTypeConfigPropertyDsl {
  private val cdkBuilder: CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty.Builder =
      CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty.builder()

  /**
   * @param defaultSizeInspectionLimit Specifies the maximum size of the web request body component
   * that an associated CloudFront distribution should send to AWS WAF for inspection. 
   * This applies to statements in the web ACL that inspect the body or JSON body.
   *
   * Default: `16 KB (16,384 kilobytes)`
   */
  public fun defaultSizeInspectionLimit(defaultSizeInspectionLimit: String) {
    cdkBuilder.defaultSizeInspectionLimit(defaultSizeInspectionLimit)
  }

  public fun build(): CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty = cdkBuilder.build()
}
