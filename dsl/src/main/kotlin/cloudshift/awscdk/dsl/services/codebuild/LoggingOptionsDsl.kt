@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions
import software.amazon.awscdk.services.codebuild.LoggingOptions
import software.amazon.awscdk.services.codebuild.S3LoggingOptions

@CdkDslMarker
public class LoggingOptionsDsl {
  private val cdkBuilder: LoggingOptions.Builder = LoggingOptions.builder()

  public fun cloudWatch(block: CloudWatchLoggingOptionsDsl.() -> Unit = {}) {
    val builder = CloudWatchLoggingOptionsDsl()
    builder.apply(block)
    cdkBuilder.cloudWatch(builder.build())
  }

  public fun cloudWatch(cloudWatch: CloudWatchLoggingOptions) {
    cdkBuilder.cloudWatch(cloudWatch)
  }

  public fun s3(block: S3LoggingOptionsDsl.() -> Unit = {}) {
    val builder = S3LoggingOptionsDsl()
    builder.apply(block)
    cdkBuilder.s3(builder.build())
  }

  public fun s3(s3: S3LoggingOptions) {
    cdkBuilder.s3(s3)
  }

  public fun build(): LoggingOptions = cdkBuilder.build()
}
