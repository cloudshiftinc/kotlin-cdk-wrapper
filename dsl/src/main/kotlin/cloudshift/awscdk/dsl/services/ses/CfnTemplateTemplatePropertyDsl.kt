@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnTemplate

/**
 * The content of the email, composed of a subject line and either an HTML part or a text-only part.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * TemplateProperty templateProperty = TemplateProperty.builder()
 * .subjectPart("subjectPart")
 * // the properties below are optional
 * .htmlPart("htmlPart")
 * .templateName("templateName")
 * .textPart("textPart")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html)
 */
@CdkDslMarker
public class CfnTemplateTemplatePropertyDsl {
  private val cdkBuilder: CfnTemplate.TemplateProperty.Builder =
      CfnTemplate.TemplateProperty.builder()

  /**
   * @param htmlPart The HTML body of the email.
   */
  public fun htmlPart(htmlPart: String) {
    cdkBuilder.htmlPart(htmlPart)
  }

  /**
   * @param subjectPart The subject line of the email. 
   */
  public fun subjectPart(subjectPart: String) {
    cdkBuilder.subjectPart(subjectPart)
  }

  /**
   * @param templateName The name of the template.
   */
  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  /**
   * @param textPart The email body that is visible to recipients whose email clients do not display
   * HTML content.
   */
  public fun textPart(textPart: String) {
    cdkBuilder.textPart(textPart)
  }

  public fun build(): CfnTemplate.TemplateProperty = cdkBuilder.build()
}
