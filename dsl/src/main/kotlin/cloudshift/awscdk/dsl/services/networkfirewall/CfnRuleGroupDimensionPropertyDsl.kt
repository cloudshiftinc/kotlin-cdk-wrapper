@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupDimensionPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.DimensionProperty.Builder =
      CfnRuleGroup.DimensionProperty.builder()

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnRuleGroup.DimensionProperty = cdkBuilder.build()
}
