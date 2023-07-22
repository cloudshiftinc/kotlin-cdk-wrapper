@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mwaa

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mwaa.CfnEnvironment

/**
 * Defines the type of logs to send for the Apache Airflow log type (e.g. `DagProcessingLogs` ).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mwaa.*;
 * ModuleLoggingConfigurationProperty moduleLoggingConfigurationProperty =
 * ModuleLoggingConfigurationProperty.builder()
 * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
 * .enabled(false)
 * .logLevel("logLevel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-moduleloggingconfiguration.html)
 */
@CdkDslMarker
public class CfnEnvironmentModuleLoggingConfigurationPropertyDsl {
  private val cdkBuilder: CfnEnvironment.ModuleLoggingConfigurationProperty.Builder =
      CfnEnvironment.ModuleLoggingConfigurationProperty.builder()

  /**
   * @param cloudWatchLogGroupArn The ARN of the CloudWatch Logs log group for each type of Apache
   * Airflow log type that you have enabled.
   *
   * `CloudWatchLogGroupArn` is available only as a return value, accessible when specified as an
   * attribute in the
   * [`Fn:GetAtt`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html#aws-resource-mwaa-environment-return-values)
   * intrinsic function. Any value you provide for `CloudWatchLogGroupArn` is discarded by Amazon MWAA.
   */
  public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
    cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
  }

  /**
   * @param enabled Indicates whether to enable the Apache Airflow log type (e.g.
   * `DagProcessingLogs` ) in CloudWatch Logs.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether to enable the Apache Airflow log type (e.g.
   * `DagProcessingLogs` ) in CloudWatch Logs.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param logLevel Defines the Apache Airflow logs to send for the log type (e.g.
   * `DagProcessingLogs` ) to CloudWatch Logs. Valid values: `CRITICAL` , `ERROR` , `WARNING` , `INFO`
   * .
   */
  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  public fun build(): CfnEnvironment.ModuleLoggingConfigurationProperty = cdkBuilder.build()
}
