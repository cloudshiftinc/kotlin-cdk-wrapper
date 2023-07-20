@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule

@CdkDslMarker
public class CfnRuleMatchPropertyDsl {
  private val cdkBuilder: CfnRule.MatchProperty.Builder = CfnRule.MatchProperty.builder()

  public fun httpMatch(httpMatch: IResolvable) {
    cdkBuilder.httpMatch(httpMatch)
  }

  public fun httpMatch(httpMatch: CfnRule.HttpMatchProperty) {
    cdkBuilder.httpMatch(httpMatch)
  }

  public fun build(): CfnRule.MatchProperty = cdkBuilder.build()
}
