@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connectcampaigns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

@CdkDslMarker
public class CfnCampaignOutboundCallConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.OutboundCallConfigProperty.Builder =
      CfnCampaign.OutboundCallConfigProperty.builder()

  public fun answerMachineDetectionConfig(answerMachineDetectionConfig: IResolvable) {
    cdkBuilder.answerMachineDetectionConfig(answerMachineDetectionConfig)
  }

  public
      fun answerMachineDetectionConfig(answerMachineDetectionConfig: CfnCampaign.AnswerMachineDetectionConfigProperty) {
    cdkBuilder.answerMachineDetectionConfig(answerMachineDetectionConfig)
  }

  public fun connectContactFlowArn(connectContactFlowArn: String) {
    cdkBuilder.connectContactFlowArn(connectContactFlowArn)
  }

  public fun connectQueueArn(connectQueueArn: String) {
    cdkBuilder.connectQueueArn(connectQueueArn)
  }

  public fun connectSourcePhoneNumber(connectSourcePhoneNumber: String) {
    cdkBuilder.connectSourcePhoneNumber(connectSourcePhoneNumber)
  }

  public fun build(): CfnCampaign.OutboundCallConfigProperty = cdkBuilder.build()
}
