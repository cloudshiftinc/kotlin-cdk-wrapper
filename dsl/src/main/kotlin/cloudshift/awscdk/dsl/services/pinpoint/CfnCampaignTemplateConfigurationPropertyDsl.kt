@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Specifies the message template to use for the message, for each type of channel.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * TemplateConfigurationProperty templateConfigurationProperty =
 * TemplateConfigurationProperty.builder()
 * .emailTemplate(TemplateProperty.builder()
 * .name("name")
 * .version("version")
 * .build())
 * .pushTemplate(TemplateProperty.builder()
 * .name("name")
 * .version("version")
 * .build())
 * .smsTemplate(TemplateProperty.builder()
 * .name("name")
 * .version("version")
 * .build())
 * .voiceTemplate(TemplateProperty.builder()
 * .name("name")
 * .version("version")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-templateconfiguration.html)
 */
@CdkDslMarker
public class CfnCampaignTemplateConfigurationPropertyDsl {
  private val cdkBuilder: CfnCampaign.TemplateConfigurationProperty.Builder =
      CfnCampaign.TemplateConfigurationProperty.builder()

  /**
   * @param emailTemplate The email template to use for the message.
   */
  public fun emailTemplate(emailTemplate: IResolvable) {
    cdkBuilder.emailTemplate(emailTemplate)
  }

  /**
   * @param emailTemplate The email template to use for the message.
   */
  public fun emailTemplate(emailTemplate: CfnCampaign.TemplateProperty) {
    cdkBuilder.emailTemplate(emailTemplate)
  }

  /**
   * @param pushTemplate The push notification template to use for the message.
   */
  public fun pushTemplate(pushTemplate: IResolvable) {
    cdkBuilder.pushTemplate(pushTemplate)
  }

  /**
   * @param pushTemplate The push notification template to use for the message.
   */
  public fun pushTemplate(pushTemplate: CfnCampaign.TemplateProperty) {
    cdkBuilder.pushTemplate(pushTemplate)
  }

  /**
   * @param smsTemplate The SMS template to use for the message.
   */
  public fun smsTemplate(smsTemplate: IResolvable) {
    cdkBuilder.smsTemplate(smsTemplate)
  }

  /**
   * @param smsTemplate The SMS template to use for the message.
   */
  public fun smsTemplate(smsTemplate: CfnCampaign.TemplateProperty) {
    cdkBuilder.smsTemplate(smsTemplate)
  }

  /**
   * @param voiceTemplate The voice template to use for the message.
   * This object isn't supported for campaigns.
   */
  public fun voiceTemplate(voiceTemplate: IResolvable) {
    cdkBuilder.voiceTemplate(voiceTemplate)
  }

  /**
   * @param voiceTemplate The voice template to use for the message.
   * This object isn't supported for campaigns.
   */
  public fun voiceTemplate(voiceTemplate: CfnCampaign.TemplateProperty) {
    cdkBuilder.voiceTemplate(voiceTemplate)
  }

  public fun build(): CfnCampaign.TemplateConfigurationProperty = cdkBuilder.build()
}
