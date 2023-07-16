@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emrserverless.CfnApplication

@CdkDslMarker
public class CfnApplicationWorkerConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.WorkerConfigurationProperty.Builder =
      CfnApplication.WorkerConfigurationProperty.builder()

  public fun cpu(cpu: String) {
    cdkBuilder.cpu(cpu)
  }

  public fun disk(disk: String) {
    cdkBuilder.disk(disk)
  }

  public fun memory(memory: String) {
    cdkBuilder.memory(memory)
  }

  public fun build(): CfnApplication.WorkerConfigurationProperty = cdkBuilder.build()
}
