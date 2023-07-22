@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * Describes an application's checkpointing configuration.
 *
 * Checkpointing is the process of persisting application state for fault tolerance. For more
 * information, see [Checkpoints for Fault
 * Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
 * in the [Apache Flink
 * Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * CheckpointConfigurationProperty checkpointConfigurationProperty =
 * CheckpointConfigurationProperty.builder()
 * .configurationType("configurationType")
 * // the properties below are optional
 * .checkpointingEnabled(false)
 * .checkpointInterval(123)
 * .minPauseBetweenCheckpoints(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationCheckpointConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.CheckpointConfigurationProperty.Builder =
      CfnApplication.CheckpointConfigurationProperty.builder()

  /**
   * @param checkpointInterval Describes the interval in milliseconds between checkpoint operations.
   *
   * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
   * `CheckpointInterval` value of 60000, even if this value is set to another value using this API or
   * in application code.
   */
  public fun checkpointInterval(checkpointInterval: Number) {
    cdkBuilder.checkpointInterval(checkpointInterval)
  }

  /**
   * @param checkpointingEnabled Describes whether checkpointing is enabled for a Flink-based
   * Kinesis Data Analytics application.
   *
   * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
   * `CheckpointingEnabled` value of `true` , even if this value is set to another value using this API
   * or in application code.
   */
  public fun checkpointingEnabled(checkpointingEnabled: Boolean) {
    cdkBuilder.checkpointingEnabled(checkpointingEnabled)
  }

  /**
   * @param checkpointingEnabled Describes whether checkpointing is enabled for a Flink-based
   * Kinesis Data Analytics application.
   *
   * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
   * `CheckpointingEnabled` value of `true` , even if this value is set to another value using this API
   * or in application code.
   */
  public fun checkpointingEnabled(checkpointingEnabled: IResolvable) {
    cdkBuilder.checkpointingEnabled(checkpointingEnabled)
  }

  /**
   * @param configurationType Describes whether the application uses Kinesis Data Analytics' default
   * checkpointing behavior. 
   * You must set this property to `CUSTOM` in order to set the `CheckpointingEnabled` ,
   * `CheckpointInterval` , or `MinPauseBetweenCheckpoints` parameters.
   *
   *
   * If this value is set to `DEFAULT` , the application will use the following values, even if they
   * are set to other values using APIs or application code:
   *
   * * *CheckpointingEnabled:* true
   * * *CheckpointInterval:* 60000
   * * *MinPauseBetweenCheckpoints:* 5000
   */
  public fun configurationType(configurationType: String) {
    cdkBuilder.configurationType(configurationType)
  }

  /**
   * @param minPauseBetweenCheckpoints Describes the minimum time in milliseconds after a checkpoint
   * operation completes that a new checkpoint operation can start.
   * If a checkpoint operation takes longer than the `CheckpointInterval` , the application
   * otherwise performs continual checkpoint operations. For more information, see [Tuning
   * Checkpointing](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/large_state_tuning.html#tuning-checkpointing)
   * in the [Apache Flink
   * Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
   * .
   *
   *
   * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
   * `MinPauseBetweenCheckpoints` value of 5000, even if this value is set using this API or in
   * application code.
   */
  public fun minPauseBetweenCheckpoints(minPauseBetweenCheckpoints: Number) {
    cdkBuilder.minPauseBetweenCheckpoints(minPauseBetweenCheckpoints)
  }

  public fun build(): CfnApplication.CheckpointConfigurationProperty = cdkBuilder.build()
}
