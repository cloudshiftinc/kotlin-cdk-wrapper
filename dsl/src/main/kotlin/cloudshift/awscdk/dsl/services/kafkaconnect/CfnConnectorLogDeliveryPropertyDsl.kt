@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorLogDeliveryPropertyDsl {
  private val cdkBuilder: CfnConnector.LogDeliveryProperty.Builder =
      CfnConnector.LogDeliveryProperty.builder()

  /**
   * @param workerLogDelivery The workers can send worker logs to different destination types. 
   * This configuration specifies the details of these destinations.
   */
  public fun workerLogDelivery(workerLogDelivery: IResolvable) {
    cdkBuilder.workerLogDelivery(workerLogDelivery)
  }

  /**
   * @param workerLogDelivery The workers can send worker logs to different destination types. 
   * This configuration specifies the details of these destinations.
   */
  public fun workerLogDelivery(workerLogDelivery: CfnConnector.WorkerLogDeliveryProperty) {
    cdkBuilder.workerLogDelivery(workerLogDelivery)
  }

  public fun build(): CfnConnector.LogDeliveryProperty = cdkBuilder.build()
}
