@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationFlinkApplicationConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.FlinkApplicationConfigurationProperty.Builder =
      CfnApplication.FlinkApplicationConfigurationProperty.builder()

  /**
   * @param checkpointConfiguration Describes an application's checkpointing configuration.
   * Checkpointing is the process of persisting application state for fault tolerance. For more
   * information, see [Checkpoints for Fault
   * Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
   * in the [Apache Flink
   * Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
   * .
   */
  public fun checkpointConfiguration(checkpointConfiguration: IResolvable) {
    cdkBuilder.checkpointConfiguration(checkpointConfiguration)
  }

  /**
   * @param checkpointConfiguration Describes an application's checkpointing configuration.
   * Checkpointing is the process of persisting application state for fault tolerance. For more
   * information, see [Checkpoints for Fault
   * Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
   * in the [Apache Flink
   * Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
   * .
   */
  public
      fun checkpointConfiguration(checkpointConfiguration: CfnApplication.CheckpointConfigurationProperty) {
    cdkBuilder.checkpointConfiguration(checkpointConfiguration)
  }

  /**
   * @param monitoringConfiguration Describes configuration parameters for Amazon CloudWatch logging
   * for an application.
   */
  public fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
    cdkBuilder.monitoringConfiguration(monitoringConfiguration)
  }

  /**
   * @param monitoringConfiguration Describes configuration parameters for Amazon CloudWatch logging
   * for an application.
   */
  public
      fun monitoringConfiguration(monitoringConfiguration: CfnApplication.MonitoringConfigurationProperty) {
    cdkBuilder.monitoringConfiguration(monitoringConfiguration)
  }

  /**
   * @param parallelismConfiguration Describes parameters for how an application executes multiple
   * tasks simultaneously.
   */
  public fun parallelismConfiguration(parallelismConfiguration: IResolvable) {
    cdkBuilder.parallelismConfiguration(parallelismConfiguration)
  }

  /**
   * @param parallelismConfiguration Describes parameters for how an application executes multiple
   * tasks simultaneously.
   */
  public
      fun parallelismConfiguration(parallelismConfiguration: CfnApplication.ParallelismConfigurationProperty) {
    cdkBuilder.parallelismConfiguration(parallelismConfiguration)
  }

  public fun build(): CfnApplication.FlinkApplicationConfigurationProperty = cdkBuilder.build()
}
