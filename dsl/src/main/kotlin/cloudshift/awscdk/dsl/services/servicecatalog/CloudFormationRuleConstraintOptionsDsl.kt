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

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun messageLanguage(messageLanguage: MessageLanguage) {
    cdkBuilder.messageLanguage(messageLanguage)
  }

  public fun rule(block: TemplateRuleDsl.() -> Unit = {}) {
    val builder = TemplateRuleDsl()
    builder.apply(block)
    cdkBuilder.rule(builder.build())
  }

  public fun rule(rule: TemplateRule) {
    cdkBuilder.rule(rule)
  }

  public fun build(): CloudFormationRuleConstraintOptions = cdkBuilder.build()
}
