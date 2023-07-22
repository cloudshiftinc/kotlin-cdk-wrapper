@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnRule

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
