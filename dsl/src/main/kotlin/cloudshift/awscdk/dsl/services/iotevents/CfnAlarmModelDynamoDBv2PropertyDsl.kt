@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelDynamoDBv2PropertyDsl {
  private val cdkBuilder: CfnAlarmModel.DynamoDBv2Property.Builder =
      CfnAlarmModel.DynamoDBv2Property.builder()

  /**
   * @param payload Information needed to configure the payload.
   * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
   * payload contains all attribute-value pairs that have the information about the detector model
   * instance and the event triggered the action. To configure the action payload, you can use
   * `contentExpression` .
   */
  public fun payload(payload: IResolvable) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param payload Information needed to configure the payload.
   * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
   * payload contains all attribute-value pairs that have the information about the detector model
   * instance and the event triggered the action. To configure the action payload, you can use
   * `contentExpression` .
   */
  public fun payload(payload: CfnAlarmModel.PayloadProperty) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param tableName The name of the DynamoDB table. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnAlarmModel.DynamoDBv2Property = cdkBuilder.build()
}
