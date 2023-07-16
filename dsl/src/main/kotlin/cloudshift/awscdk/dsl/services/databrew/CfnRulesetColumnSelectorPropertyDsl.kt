@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnRuleset

@CdkDslMarker
public class CfnRulesetColumnSelectorPropertyDsl {
  private val cdkBuilder: CfnRuleset.ColumnSelectorProperty.Builder =
      CfnRuleset.ColumnSelectorProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun regex(regex: String) {
    cdkBuilder.regex(regex)
  }

  public fun build(): CfnRuleset.ColumnSelectorProperty = cdkBuilder.build()
}
