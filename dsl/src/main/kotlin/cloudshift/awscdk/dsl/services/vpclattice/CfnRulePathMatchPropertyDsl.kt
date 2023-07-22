@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule

@CdkDslMarker
public class CfnRulePathMatchPropertyDsl {
  private val cdkBuilder: CfnRule.PathMatchProperty.Builder = CfnRule.PathMatchProperty.builder()

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
   * @param match The type of path match. 
   */
  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  /**
   * @param match The type of path match. 
   */
  public fun match(match: CfnRule.PathMatchTypeProperty) {
    cdkBuilder.match(match)
  }

  public fun build(): CfnRule.PathMatchProperty = cdkBuilder.build()
}
