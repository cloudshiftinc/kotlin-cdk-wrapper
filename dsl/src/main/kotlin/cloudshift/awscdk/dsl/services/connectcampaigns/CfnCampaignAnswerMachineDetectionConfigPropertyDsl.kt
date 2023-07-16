@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connectcampaigns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

@CdkDslMarker
public class CfnCampaignAnswerMachineDetectionConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.AnswerMachineDetectionConfigProperty.Builder =
      CfnCampaign.AnswerMachineDetectionConfigProperty.builder()

  public fun enableAnswerMachineDetection(enableAnswerMachineDetection: Boolean) {
    cdkBuilder.enableAnswerMachineDetection(enableAnswerMachineDetection)
  }

  public fun enableAnswerMachineDetection(enableAnswerMachineDetection: IResolvable) {
    cdkBuilder.enableAnswerMachineDetection(enableAnswerMachineDetection)
  }

  public fun build(): CfnCampaign.AnswerMachineDetectionConfigProperty = cdkBuilder.build()
}
