@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketLoggingConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.LoggingConfigurationProperty.Builder =
      CfnBucket.LoggingConfigurationProperty.builder()

  public fun destinationBucketName(destinationBucketName: String) {
    cdkBuilder.destinationBucketName(destinationBucketName)
  }

  public fun logFilePrefix(logFilePrefix: String) {
    cdkBuilder.logFilePrefix(logFilePrefix)
  }

  public fun build(): CfnBucket.LoggingConfigurationProperty = cdkBuilder.build()
}
