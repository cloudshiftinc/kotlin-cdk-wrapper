@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration

/**
 * Logging configuration defines where Image Builder uploads your logs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * LoggingProperty loggingProperty = LoggingProperty.builder()
 * .s3Logs(S3LogsProperty.builder()
 * .s3BucketName("s3BucketName")
 * .s3KeyPrefix("s3KeyPrefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-logging.html)
 */
@CdkDslMarker
public class CfnInfrastructureConfigurationLoggingPropertyDsl {
  private val cdkBuilder: CfnInfrastructureConfiguration.LoggingProperty.Builder =
      CfnInfrastructureConfiguration.LoggingProperty.builder()

  /**
   * @param s3Logs The Amazon S3 logging configuration.
   */
  public fun s3Logs(s3Logs: IResolvable) {
    cdkBuilder.s3Logs(s3Logs)
  }

  /**
   * @param s3Logs The Amazon S3 logging configuration.
   */
  public fun s3Logs(s3Logs: CfnInfrastructureConfiguration.S3LogsProperty) {
    cdkBuilder.s3Logs(s3Logs)
  }

  public fun build(): CfnInfrastructureConfiguration.LoggingProperty = cdkBuilder.build()
}
