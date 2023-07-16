@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps

@CdkDslMarker
public class CfnEmailTemplatePropsDsl {
  private val cdkBuilder: CfnEmailTemplateProps.Builder = CfnEmailTemplateProps.builder()

  public fun defaultSubstitutions(defaultSubstitutions: String) {
    cdkBuilder.defaultSubstitutions(defaultSubstitutions)
  }

  public fun htmlPart(htmlPart: String) {
    cdkBuilder.htmlPart(htmlPart)
  }

  public fun subject(subject: String) {
    cdkBuilder.subject(subject)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun templateDescription(templateDescription: String) {
    cdkBuilder.templateDescription(templateDescription)
  }

  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  public fun textPart(textPart: String) {
    cdkBuilder.textPart(textPart)
  }

  public fun build(): CfnEmailTemplateProps = cdkBuilder.build()
}
