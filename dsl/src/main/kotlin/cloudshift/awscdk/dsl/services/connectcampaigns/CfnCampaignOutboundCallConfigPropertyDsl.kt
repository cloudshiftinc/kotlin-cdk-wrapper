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

  /**
   * @param answerMachineDetectionConfig The configuration used for answering machine detection
   * during outbound calls.
   */
  public fun answerMachineDetectionConfig(answerMachineDetectionConfig: IResolvable) {
    cdkBuilder.answerMachineDetectionConfig(answerMachineDetectionConfig)
  }

  /**
   * @param answerMachineDetectionConfig The configuration used for answering machine detection
   * during outbound calls.
   */
  public
      fun answerMachineDetectionConfig(answerMachineDetectionConfig: CfnCampaign.AnswerMachineDetectionConfigProperty) {
    cdkBuilder.answerMachineDetectionConfig(answerMachineDetectionConfig)
  }

  /**
   * @param connectContactFlowArn The Amazon Resource Name (ARN) of the flow. 
   */
  public fun connectContactFlowArn(connectContactFlowArn: String) {
    cdkBuilder.connectContactFlowArn(connectContactFlowArn)
  }

  /**
   * @param connectQueueArn The Amazon Resource Name (ARN) of the queue. 
   */
  public fun connectQueueArn(connectQueueArn: String) {
    cdkBuilder.connectQueueArn(connectQueueArn)
  }

  /**
   * @param connectSourcePhoneNumber The phone number associated with the outbound call.
   * This is the caller ID that is displayed to customers when an agent calls them.
   */
  public fun connectSourcePhoneNumber(connectSourcePhoneNumber: String) {
    cdkBuilder.connectSourcePhoneNumber(connectSourcePhoneNumber)
  }

  public fun build(): CfnCampaign.OutboundCallConfigProperty = cdkBuilder.build()
}
