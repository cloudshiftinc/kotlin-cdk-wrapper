@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.codebuild.S3LoggingOptions
import software.amazon.awscdk.services.s3.IBucket

/**
 * Information about logs built to an S3 bucket for a build project.
 *
 * Example:
 *
 * ```
 * Project.Builder.create(this, "Project")
 * .logging(LoggingOptions.builder()
 * .s3(S3LoggingOptions.builder()
 * .bucket(new Bucket(this, "LogBucket"))
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class S3LoggingOptionsDsl {
  private val cdkBuilder: S3LoggingOptions.Builder = S3LoggingOptions.builder()

  /**
   * @param bucket The S3 Bucket to send logs to. 
   */
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param enabled The current status of the logs in Amazon CloudWatch Logs for a build project.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param encrypted Encrypt the S3 build log output.
   */
  public fun encrypted(encrypted: Boolean) {
    cdkBuilder.encrypted(encrypted)
  }

  /**
   * @param prefix The path prefix for S3 logs.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): S3LoggingOptions = cdkBuilder.build()
}
