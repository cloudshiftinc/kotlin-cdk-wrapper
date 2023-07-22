@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * Details of encryption in transit to the Apache Kafka cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * KafkaClusterEncryptionInTransitProperty kafkaClusterEncryptionInTransitProperty =
 * KafkaClusterEncryptionInTransitProperty.builder()
 * .encryptionType("encryptionType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkaclusterencryptionintransit.html)
 */
@CdkDslMarker
public class CfnConnectorKafkaClusterEncryptionInTransitPropertyDsl {
  private val cdkBuilder: CfnConnector.KafkaClusterEncryptionInTransitProperty.Builder =
      CfnConnector.KafkaClusterEncryptionInTransitProperty.builder()

  /**
   * @param encryptionType The type of encryption in transit to the Apache Kafka cluster. 
   */
  public fun encryptionType(encryptionType: String) {
    cdkBuilder.encryptionType(encryptionType)
  }

  public fun build(): CfnConnector.KafkaClusterEncryptionInTransitProperty = cdkBuilder.build()
}
