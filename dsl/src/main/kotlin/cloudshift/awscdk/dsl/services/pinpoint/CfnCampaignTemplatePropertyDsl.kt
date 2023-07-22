@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignTemplatePropertyDsl {
  private val cdkBuilder: CfnCampaign.TemplateProperty.Builder =
      CfnCampaign.TemplateProperty.builder()

  /**
   * @param name The name of the message template to use for the message.
   * If specified, this value must match the name of an existing message template.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param version The unique identifier for the version of the message template to use for the
   * message.
   * If specified, this value must match the identifier for an existing template version. To
   * retrieve a list of versions and version identifiers for a template, use the [Template
   * Versions](https://docs.aws.amazon.com/pinpoint/latest/apireference/templates-template-name-template-type-versions.html)
   * resource.
   *
   * If you don't specify a value for this property, Amazon Pinpoint uses the *active version* of
   * the template. The *active version* is typically the version of a template that's been most
   * recently reviewed and approved for use, depending on your workflow. It isn't necessarily the
   * latest version of a template.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnCampaign.TemplateProperty = cdkBuilder.build()
}
