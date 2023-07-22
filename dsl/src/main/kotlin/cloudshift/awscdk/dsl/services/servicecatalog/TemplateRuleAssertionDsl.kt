@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.ICfnRuleConditionExpression
import software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion

@CdkDslMarker
public class TemplateRuleAssertionDsl {
  private val cdkBuilder: TemplateRuleAssertion.Builder = TemplateRuleAssertion.builder()

  /**
   * @param assertValue The assertion condition. 
   */
  public fun assertValue(assertValue: ICfnRuleConditionExpression) {
    cdkBuilder.assertValue(assertValue)
  }

  /**
   * @param description The description for the asssertion.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun build(): TemplateRuleAssertion = cdkBuilder.build()
}
