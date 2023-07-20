@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorWorkerConfigurationPropertyDsl {
  private val cdkBuilder: CfnConnector.WorkerConfigurationProperty.Builder =
      CfnConnector.WorkerConfigurationProperty.builder()

  public fun revision(revision: Number) {
    cdkBuilder.revision(revision)
  }

  public fun workerConfigurationArn(workerConfigurationArn: String) {
    cdkBuilder.workerConfigurationArn(workerConfigurationArn)
  }

  public fun build(): CfnConnector.WorkerConfigurationProperty = cdkBuilder.build()
}
