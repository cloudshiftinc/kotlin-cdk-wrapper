@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelSqsPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.SqsProperty.Builder =
      CfnDetectorModel.SqsProperty.builder()

  /**
   * @param payload You can configure the action payload when you send a message to an Amazon SQS
   * queue.
   */
  public fun payload(payload: IResolvable) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param payload You can configure the action payload when you send a message to an Amazon SQS
   * queue.
   */
  public fun payload(payload: CfnDetectorModel.PayloadProperty) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param queueUrl The URL of the SQS queue where the data is written. 
   */
  public fun queueUrl(queueUrl: String) {
    cdkBuilder.queueUrl(queueUrl)
  }

  /**
   * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
   * written to the queue.
   * Otherwise, set this to FALSE.
   */
  public fun useBase64(useBase64: Boolean) {
    cdkBuilder.useBase64(useBase64)
  }

  /**
   * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
   * written to the queue.
   * Otherwise, set this to FALSE.
   */
  public fun useBase64(useBase64: IResolvable) {
    cdkBuilder.useBase64(useBase64)
  }

  public fun build(): CfnDetectorModel.SqsProperty = cdkBuilder.build()
}
