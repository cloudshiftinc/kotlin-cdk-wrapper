@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule

/**
 * Describes the conditions that can be applied when matching a path for incoming requests.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * PathMatchProperty pathMatchProperty = PathMatchProperty.builder()
 * .match(PathMatchTypeProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .build())
 * // the properties below are optional
 * .caseSensitive(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatch.html)
 */
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
