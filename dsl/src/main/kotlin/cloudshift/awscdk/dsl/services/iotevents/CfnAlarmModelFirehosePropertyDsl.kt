@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelFirehosePropertyDsl {
  private val cdkBuilder: CfnAlarmModel.FirehoseProperty.Builder =
      CfnAlarmModel.FirehoseProperty.builder()

  /**
   * @param deliveryStreamName The name of the Kinesis Data Firehose delivery stream where the data
   * is written. 
   */
  public fun deliveryStreamName(deliveryStreamName: String) {
    cdkBuilder.deliveryStreamName(deliveryStreamName)
  }

  /**
   * @param payload You can configure the action payload when you send a message to an Amazon
   * Kinesis Data Firehose delivery stream.
   */
  public fun payload(payload: IResolvable) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param payload You can configure the action payload when you send a message to an Amazon
   * Kinesis Data Firehose delivery stream.
   */
  public fun payload(payload: CfnAlarmModel.PayloadProperty) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param separator A character separator that is used to separate records written to the Kinesis
   * Data Firehose delivery stream.
   * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
   */
  public fun separator(separator: String) {
    cdkBuilder.separator(separator)
  }

  public fun build(): CfnAlarmModel.FirehoseProperty = cdkBuilder.build()
}
