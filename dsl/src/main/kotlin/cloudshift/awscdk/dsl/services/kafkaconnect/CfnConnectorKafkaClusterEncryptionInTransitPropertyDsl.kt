@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorKafkaClusterEncryptionInTransitPropertyDsl {
  private val cdkBuilder: CfnConnector.KafkaClusterEncryptionInTransitProperty.Builder =
      CfnConnector.KafkaClusterEncryptionInTransitProperty.builder()

  public fun encryptionType(encryptionType: String) {
    cdkBuilder.encryptionType(encryptionType)
  }

  public fun build(): CfnConnector.KafkaClusterEncryptionInTransitProperty = cdkBuilder.build()
}
