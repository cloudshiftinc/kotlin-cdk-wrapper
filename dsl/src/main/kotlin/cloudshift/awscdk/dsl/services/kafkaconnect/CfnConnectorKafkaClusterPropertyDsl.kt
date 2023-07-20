@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorKafkaClusterPropertyDsl {
  private val cdkBuilder: CfnConnector.KafkaClusterProperty.Builder =
      CfnConnector.KafkaClusterProperty.builder()

  public fun apacheKafkaCluster(apacheKafkaCluster: IResolvable) {
    cdkBuilder.apacheKafkaCluster(apacheKafkaCluster)
  }

  public fun apacheKafkaCluster(apacheKafkaCluster: CfnConnector.ApacheKafkaClusterProperty) {
    cdkBuilder.apacheKafkaCluster(apacheKafkaCluster)
  }

  public fun build(): CfnConnector.KafkaClusterProperty = cdkBuilder.build()
}
