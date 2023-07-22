@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

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
