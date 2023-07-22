@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnTemplate
import software.amazon.awscdk.services.ses.CfnTemplateProps

@CdkDslMarker
public class CfnTemplatePropsDsl {
  private val cdkBuilder: CfnTemplateProps.Builder = CfnTemplateProps.builder()

  /**
   * @param template The content of the email, composed of a subject line and either an HTML part or
   * a text-only part.
   */
  public fun template(template: IResolvable) {
    cdkBuilder.template(template)
  }

  /**
   * @param template The content of the email, composed of a subject line and either an HTML part or
   * a text-only part.
   */
  public fun template(template: CfnTemplate.TemplateProperty) {
    cdkBuilder.template(template)
  }

  public fun build(): CfnTemplateProps = cdkBuilder.build()
}
