@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule

/**
 * Describes the constraints for a header match.
 *
 * Matches incoming requests with rule based on request header value before applying rule action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * HeaderMatchProperty headerMatchProperty = HeaderMatchProperty.builder()
 * .match(HeaderMatchTypeProperty.builder()
 * .contains("contains")
 * .exact("exact")
 * .prefix("prefix")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .caseSensitive(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatch.html)
 */
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
