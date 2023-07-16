@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorApacheKafkaClusterPropertyDsl {
  private val cdkBuilder: CfnConnector.ApacheKafkaClusterProperty.Builder =
      CfnConnector.ApacheKafkaClusterProperty.builder()

  public fun bootstrapServers(bootstrapServers: String) {
    cdkBuilder.bootstrapServers(bootstrapServers)
  }

  public fun vpc(vpc: IResolvable) {
    cdkBuilder.vpc(vpc)
  }

  public fun vpc(vpc: CfnConnector.VpcProperty) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): CfnConnector.ApacheKafkaClusterProperty = cdkBuilder.build()
}
