@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.TemplateRule

@CdkDslMarker
public class CloudFormationRuleConstraintOptionsDsl {
  private val cdkBuilder: CloudFormationRuleConstraintOptions.Builder =
      CloudFormationRuleConstraintOptions.builder()

  /**
   * @param description The description of the constraint.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param messageLanguage The language code.
   * Configures the language for error messages from service catalog.
   */
  public fun messageLanguage(messageLanguage: MessageLanguage) {
    cdkBuilder.messageLanguage(messageLanguage)
  }

  /**
   * @param rule The rule with condition and assertions to apply to template. 
   */
  public fun rule(rule: TemplateRuleDsl.() -> Unit = {}) {
    val builder = TemplateRuleDsl()
    builder.apply(rule)
    cdkBuilder.rule(builder.build())
  }

  /**
   * @param rule The rule with condition and assertions to apply to template. 
   */
  public fun rule(rule: TemplateRule) {
    cdkBuilder.rule(rule)
  }

  public fun build(): CloudFormationRuleConstraintOptions = cdkBuilder.build()
}
