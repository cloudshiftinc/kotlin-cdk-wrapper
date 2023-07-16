@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupBlockPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.BlockProperty.Builder = CfnRuleGroup.BlockProperty.builder()

  public fun customResponse(customResponse: IResolvable) {
    cdkBuilder.customResponse(customResponse)
  }

  public fun customResponse(customResponse: CfnRuleGroup.CustomResponseProperty) {
    cdkBuilder.customResponse(customResponse)
  }

  public fun build(): CfnRuleGroup.BlockProperty = cdkBuilder.build()
}
