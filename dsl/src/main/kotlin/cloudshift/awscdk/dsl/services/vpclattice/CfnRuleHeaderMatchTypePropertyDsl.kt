@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnRule

@CdkDslMarker
public class CfnRuleHeaderMatchTypePropertyDsl {
  private val cdkBuilder: CfnRule.HeaderMatchTypeProperty.Builder =
      CfnRule.HeaderMatchTypeProperty.builder()

  public fun contains(contains: String) {
    cdkBuilder.contains(contains)
  }

  public fun exact(exact: String) {
    cdkBuilder.exact(exact)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnRule.HeaderMatchTypeProperty = cdkBuilder.build()
}
