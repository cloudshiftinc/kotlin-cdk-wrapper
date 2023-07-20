@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnRuleAssertion
import software.amazon.awscdk.ICfnConditionExpression

@CdkDslMarker
public class CfnRuleAssertionDsl {
  private val cdkBuilder: CfnRuleAssertion.Builder = CfnRuleAssertion.builder()

  public fun assertDescription(assertDescription: String) {
    cdkBuilder.assertDescription(assertDescription)
  }

  public fun assertValue(assertValue: ICfnConditionExpression) {
    cdkBuilder.assertValue(assertValue)
  }

  public fun build(): CfnRuleAssertion = cdkBuilder.build()
}
