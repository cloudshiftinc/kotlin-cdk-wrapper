@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLResponseInspectionPropertyDsl {
  private val cdkBuilder: CfnWebACL.ResponseInspectionProperty.Builder =
      CfnWebACL.ResponseInspectionProperty.builder()

  public fun bodyContains(bodyContains: IResolvable) {
    cdkBuilder.bodyContains(bodyContains)
  }

  public fun bodyContains(bodyContains: CfnWebACL.ResponseInspectionBodyContainsProperty) {
    cdkBuilder.bodyContains(bodyContains)
  }

  public fun `header`(`header`: IResolvable) {
    cdkBuilder.`header`(`header`)
  }

  public fun `header`(`header`: CfnWebACL.ResponseInspectionHeaderProperty) {
    cdkBuilder.`header`(`header`)
  }

  public fun json(json: IResolvable) {
    cdkBuilder.json(json)
  }

  public fun json(json: CfnWebACL.ResponseInspectionJsonProperty) {
    cdkBuilder.json(json)
  }

  public fun statusCode(statusCode: IResolvable) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun statusCode(statusCode: CfnWebACL.ResponseInspectionStatusCodeProperty) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun build(): CfnWebACL.ResponseInspectionProperty = cdkBuilder.build()
}
