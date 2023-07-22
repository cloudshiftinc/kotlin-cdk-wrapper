@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions
import software.amazon.awscdk.services.codebuild.LoggingOptions
import software.amazon.awscdk.services.codebuild.S3LoggingOptions

/**
 * Information about logs for the build project.
 *
 * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
 *
 * Example:
 *
 * ```
 * Project.Builder.create(this, "Project")
 * .logging(LoggingOptions.builder()
 * .cloudWatch(CloudWatchLoggingOptions.builder()
 * .logGroup(new LogGroup(this, "MyLogGroup"))
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class LoggingOptionsDsl {
  private val cdkBuilder: LoggingOptions.Builder = LoggingOptions.builder()

  /**
   * @param cloudWatch Information about Amazon CloudWatch Logs for a build project.
   */
  public fun cloudWatch(cloudWatch: CloudWatchLoggingOptionsDsl.() -> Unit = {}) {
    val builder = CloudWatchLoggingOptionsDsl()
    builder.apply(cloudWatch)
    cdkBuilder.cloudWatch(builder.build())
  }

  /**
   * @param cloudWatch Information about Amazon CloudWatch Logs for a build project.
   */
  public fun cloudWatch(cloudWatch: CloudWatchLoggingOptions) {
    cdkBuilder.cloudWatch(cloudWatch)
  }

  /**
   * @param s3 Information about logs built to an S3 bucket for a build project.
   */
  public fun s3(s3: S3LoggingOptionsDsl.() -> Unit = {}) {
    val builder = S3LoggingOptionsDsl()
    builder.apply(s3)
    cdkBuilder.s3(builder.build())
  }

  /**
   * @param s3 Information about logs built to an S3 bucket for a build project.
   */
  public fun s3(s3: S3LoggingOptions) {
    cdkBuilder.s3(s3)
  }

  public fun build(): LoggingOptions = cdkBuilder.build()
}
