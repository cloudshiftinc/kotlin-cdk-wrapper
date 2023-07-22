@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelSnsPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.SnsProperty.Builder = CfnAlarmModel.SnsProperty.builder()

  /**
   * @param payload You can configure the action payload when you send a message as an Amazon SNS
   * push notification.
   */
  public fun payload(payload: IResolvable) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param payload You can configure the action payload when you send a message as an Amazon SNS
   * push notification.
   */
  public fun payload(payload: CfnAlarmModel.PayloadProperty) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param targetArn The ARN of the Amazon SNS target where the message is sent. 
   */
  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  public fun build(): CfnAlarmModel.SnsProperty = cdkBuilder.build()
}
