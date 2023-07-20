@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2FlinkApplicationConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder =
      CfnApplicationV2.FlinkApplicationConfigurationProperty.builder()

  public fun checkpointConfiguration(checkpointConfiguration: IResolvable) {
    cdkBuilder.checkpointConfiguration(checkpointConfiguration)
  }

  public
      fun checkpointConfiguration(checkpointConfiguration: CfnApplicationV2.CheckpointConfigurationProperty) {
    cdkBuilder.checkpointConfiguration(checkpointConfiguration)
  }

  public fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
    cdkBuilder.monitoringConfiguration(monitoringConfiguration)
  }

  public
      fun monitoringConfiguration(monitoringConfiguration: CfnApplicationV2.MonitoringConfigurationProperty) {
    cdkBuilder.monitoringConfiguration(monitoringConfiguration)
  }

  public fun parallelismConfiguration(parallelismConfiguration: IResolvable) {
    cdkBuilder.parallelismConfiguration(parallelismConfiguration)
  }

  public
      fun parallelismConfiguration(parallelismConfiguration: CfnApplicationV2.ParallelismConfigurationProperty) {
    cdkBuilder.parallelismConfiguration(parallelismConfiguration)
  }

  public fun build(): CfnApplicationV2.FlinkApplicationConfigurationProperty = cdkBuilder.build()
}
