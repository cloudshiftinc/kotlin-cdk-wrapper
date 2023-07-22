@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLResponseInspectionPropertyDsl {
  private val cdkBuilder: CfnWebACL.ResponseInspectionProperty.Builder =
      CfnWebACL.ResponseInspectionProperty.builder()

  /**
   * @param bodyContains Configures inspection of the response body.
   * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body.
   */
  public fun bodyContains(bodyContains: IResolvable) {
    cdkBuilder.bodyContains(bodyContains)
  }

  /**
   * @param bodyContains Configures inspection of the response body.
   * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body.
   */
  public fun bodyContains(bodyContains: CfnWebACL.ResponseInspectionBodyContainsProperty) {
    cdkBuilder.bodyContains(bodyContains)
  }

  /**
   * @param header Configures inspection of the response header.
   */
  public fun `header`(`header`: IResolvable) {
    cdkBuilder.`header`(`header`)
  }

  /**
   * @param header Configures inspection of the response header.
   */
  public fun `header`(`header`: CfnWebACL.ResponseInspectionHeaderProperty) {
    cdkBuilder.`header`(`header`)
  }

  /**
   * @param json Configures inspection of the response JSON.
   * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON.
   */
  public fun json(json: IResolvable) {
    cdkBuilder.json(json)
  }

  /**
   * @param json Configures inspection of the response JSON.
   * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON.
   */
  public fun json(json: CfnWebACL.ResponseInspectionJsonProperty) {
    cdkBuilder.json(json)
  }

  /**
   * @param statusCode Configures inspection of the response status code.
   */
  public fun statusCode(statusCode: IResolvable) {
    cdkBuilder.statusCode(statusCode)
  }

  /**
   * @param statusCode Configures inspection of the response status code.
   */
  public fun statusCode(statusCode: CfnWebACL.ResponseInspectionStatusCodeProperty) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun build(): CfnWebACL.ResponseInspectionProperty = cdkBuilder.build()
}
