@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketLoggingConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.LoggingConfigurationProperty.Builder =
      CfnBucket.LoggingConfigurationProperty.builder()

  /**
   * @param destinationBucketName The name of the bucket where Amazon S3 should store server access
   * log files.
   * You can store log files in any bucket that you own. By default, logs are stored in the bucket
   * where the `LoggingConfiguration` property is defined.
   */
  public fun destinationBucketName(destinationBucketName: String) {
    cdkBuilder.destinationBucketName(destinationBucketName)
  }

  /**
   * @param logFilePrefix A prefix for all log object keys.
   * If you store log files from multiple Amazon S3 buckets in a single bucket, you can use a prefix
   * to distinguish which log files came from which bucket.
   */
  public fun logFilePrefix(logFilePrefix: String) {
    cdkBuilder.logFilePrefix(logFilePrefix)
  }

  public fun build(): CfnBucket.LoggingConfigurationProperty = cdkBuilder.build()
}
