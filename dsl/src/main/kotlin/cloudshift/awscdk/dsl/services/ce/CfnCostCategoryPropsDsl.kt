@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ce.CfnCostCategoryProps

@CdkDslMarker
public class CfnCostCategoryPropsDsl {
  private val cdkBuilder: CfnCostCategoryProps.Builder = CfnCostCategoryProps.builder()

  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun ruleVersion(ruleVersion: String) {
    cdkBuilder.ruleVersion(ruleVersion)
  }

  public fun rules(rules: String) {
    cdkBuilder.rules(rules)
  }

  public fun splitChargeRules(splitChargeRules: String) {
    cdkBuilder.splitChargeRules(splitChargeRules)
  }

  public fun build(): CfnCostCategoryProps = cdkBuilder.build()
}
