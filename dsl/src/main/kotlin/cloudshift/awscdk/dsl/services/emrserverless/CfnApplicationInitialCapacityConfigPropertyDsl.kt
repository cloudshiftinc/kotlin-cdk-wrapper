@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

@CdkDslMarker
public class CfnApplicationInitialCapacityConfigPropertyDsl {
  private val cdkBuilder: CfnApplication.InitialCapacityConfigProperty.Builder =
      CfnApplication.InitialCapacityConfigProperty.builder()

  public fun workerConfiguration(workerConfiguration: IResolvable) {
    cdkBuilder.workerConfiguration(workerConfiguration)
  }

  public fun workerConfiguration(workerConfiguration: CfnApplication.WorkerConfigurationProperty) {
    cdkBuilder.workerConfiguration(workerConfiguration)
  }

  public fun workerCount(workerCount: Number) {
    cdkBuilder.workerCount(workerCount)
  }

  public fun build(): CfnApplication.InitialCapacityConfigProperty = cdkBuilder.build()
}
