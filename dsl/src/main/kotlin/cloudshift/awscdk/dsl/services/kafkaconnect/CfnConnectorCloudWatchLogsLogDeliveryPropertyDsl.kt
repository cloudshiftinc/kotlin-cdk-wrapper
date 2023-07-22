@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorCloudWatchLogsLogDeliveryPropertyDsl {
  private val cdkBuilder: CfnConnector.CloudWatchLogsLogDeliveryProperty.Builder =
      CfnConnector.CloudWatchLogsLogDeliveryProperty.builder()

  /**
   * @param enabled Whether log delivery to Amazon CloudWatch Logs is enabled. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Whether log delivery to Amazon CloudWatch Logs is enabled. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param logGroup The name of the CloudWatch log group that is the destination for log delivery.
   */
  public fun logGroup(logGroup: String) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun build(): CfnConnector.CloudWatchLogsLogDeliveryProperty = cdkBuilder.build()
}
