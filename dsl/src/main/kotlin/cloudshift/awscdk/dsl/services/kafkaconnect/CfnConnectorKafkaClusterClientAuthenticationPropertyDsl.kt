@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorKafkaClusterClientAuthenticationPropertyDsl {
  private val cdkBuilder: CfnConnector.KafkaClusterClientAuthenticationProperty.Builder =
      CfnConnector.KafkaClusterClientAuthenticationProperty.builder()

  public fun authenticationType(authenticationType: String) {
    cdkBuilder.authenticationType(authenticationType)
  }

  public fun build(): CfnConnector.KafkaClusterClientAuthenticationProperty = cdkBuilder.build()
}
