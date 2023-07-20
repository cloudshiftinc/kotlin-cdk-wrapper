@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignTemplateConfigurationPropertyDsl {
  private val cdkBuilder: CfnCampaign.TemplateConfigurationProperty.Builder =
      CfnCampaign.TemplateConfigurationProperty.builder()

  public fun emailTemplate(emailTemplate: IResolvable) {
    cdkBuilder.emailTemplate(emailTemplate)
  }

  public fun emailTemplate(emailTemplate: CfnCampaign.TemplateProperty) {
    cdkBuilder.emailTemplate(emailTemplate)
  }

  public fun pushTemplate(pushTemplate: IResolvable) {
    cdkBuilder.pushTemplate(pushTemplate)
  }

  public fun pushTemplate(pushTemplate: CfnCampaign.TemplateProperty) {
    cdkBuilder.pushTemplate(pushTemplate)
  }

  public fun smsTemplate(smsTemplate: IResolvable) {
    cdkBuilder.smsTemplate(smsTemplate)
  }

  public fun smsTemplate(smsTemplate: CfnCampaign.TemplateProperty) {
    cdkBuilder.smsTemplate(smsTemplate)
  }

  public fun voiceTemplate(voiceTemplate: IResolvable) {
    cdkBuilder.voiceTemplate(voiceTemplate)
  }

  public fun voiceTemplate(voiceTemplate: CfnCampaign.TemplateProperty) {
    cdkBuilder.voiceTemplate(voiceTemplate)
  }

  public fun build(): CfnCampaign.TemplateConfigurationProperty = cdkBuilder.build()
}
