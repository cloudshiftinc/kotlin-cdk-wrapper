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

  /**
   * @param caseSensitive Indicates whether the match is case sensitive.
   * Defaults to false.
   */
  public fun caseSensitive(caseSensitive: Boolean) {
    cdkBuilder.caseSensitive(caseSensitive)
  }

  /**
   * @param caseSensitive Indicates whether the match is case sensitive.
   * Defaults to false.
   */
  public fun caseSensitive(caseSensitive: IResolvable) {
    cdkBuilder.caseSensitive(caseSensitive)
  }

  /**
   * @param match The header match type. 
   */
  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  /**
   * @param match The header match type. 
   */
  public fun match(match: CfnRule.HeaderMatchTypeProperty) {
    cdkBuilder.match(match)
  }

  /**
   * @param name The name of the header. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnRule.HeaderMatchProperty = cdkBuilder.build()
}
