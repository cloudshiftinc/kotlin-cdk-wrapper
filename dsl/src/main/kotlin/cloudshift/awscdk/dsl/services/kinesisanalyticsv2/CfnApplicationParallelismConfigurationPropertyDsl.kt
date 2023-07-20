@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationParallelismConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.ParallelismConfigurationProperty.Builder =
      CfnApplication.ParallelismConfigurationProperty.builder()

  public fun autoScalingEnabled(autoScalingEnabled: Boolean) {
    cdkBuilder.autoScalingEnabled(autoScalingEnabled)
  }

  public fun autoScalingEnabled(autoScalingEnabled: IResolvable) {
    cdkBuilder.autoScalingEnabled(autoScalingEnabled)
  }

  public fun configurationType(configurationType: String) {
    cdkBuilder.configurationType(configurationType)
  }

  public fun parallelism(parallelism: Number) {
    cdkBuilder.parallelism(parallelism)
  }

  public fun parallelismPerKpu(parallelismPerKpu: Number) {
    cdkBuilder.parallelismPerKpu(parallelismPerKpu)
  }

  public fun build(): CfnApplication.ParallelismConfigurationProperty = cdkBuilder.build()
}
