@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * The client authentication information used in order to authenticate with the Apache Kafka
 * cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * KafkaClusterClientAuthenticationProperty kafkaClusterClientAuthenticationProperty =
 * KafkaClusterClientAuthenticationProperty.builder()
 * .authenticationType("authenticationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkaclusterclientauthentication.html)
 */
@CdkDslMarker
public class CfnConnectorKafkaClusterClientAuthenticationPropertyDsl {
  private val cdkBuilder: CfnConnector.KafkaClusterClientAuthenticationProperty.Builder =
      CfnConnector.KafkaClusterClientAuthenticationProperty.builder()

  /**
   * @param authenticationType The type of client authentication used to connect to the Apache Kafka
   * cluster. 
   * Value NONE means that no client authentication is used.
   */
  public fun authenticationType(authenticationType: String) {
    cdkBuilder.authenticationType(authenticationType)
  }

  public fun build(): CfnConnector.KafkaClusterClientAuthenticationProperty = cdkBuilder.build()
}
