@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnRule

/**
 * Describes a header match type.
 *
 * Only one can be provided.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * HeaderMatchTypeProperty headerMatchTypeProperty = HeaderMatchTypeProperty.builder()
 * .contains("contains")
 * .exact("exact")
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatchtype.html)
 */
@CdkDslMarker
public class CfnRuleHeaderMatchTypePropertyDsl {
  private val cdkBuilder: CfnRule.HeaderMatchTypeProperty.Builder =
      CfnRule.HeaderMatchTypeProperty.builder()

  /**
   * @param contains Specifies a contains type match.
   */
  public fun contains(contains: String) {
    cdkBuilder.contains(contains)
  }

  /**
   * @param exact Specifies an exact type match.
   */
  public fun exact(exact: String) {
    cdkBuilder.exact(exact)
  }

  /**
   * @param prefix Specifies a prefix type match.
   * Matches the value with the prefix.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnRule.HeaderMatchTypeProperty = cdkBuilder.build()
}
