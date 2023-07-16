@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule

@CdkDslMarker
public class CfnRuleHeaderMatchPropertyDsl {
  private val cdkBuilder: CfnRule.HeaderMatchProperty.Builder =
      CfnRule.HeaderMatchProperty.builder()

  public fun caseSensitive(caseSensitive: Boolean) {
    cdkBuilder.caseSensitive(caseSensitive)
  }

  public fun caseSensitive(caseSensitive: IResolvable) {
    cdkBuilder.caseSensitive(caseSensitive)
  }

  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  public fun match(match: CfnRule.HeaderMatchTypeProperty) {
    cdkBuilder.match(match)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnRule.HeaderMatchProperty = cdkBuilder.build()
}
