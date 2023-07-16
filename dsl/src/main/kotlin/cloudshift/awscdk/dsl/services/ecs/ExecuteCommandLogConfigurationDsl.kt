@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class ExecuteCommandLogConfigurationDsl {
  private val cdkBuilder: ExecuteCommandLogConfiguration.Builder =
      ExecuteCommandLogConfiguration.builder()

  public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean) {
    cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled)
  }

  public fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup) {
    cdkBuilder.cloudWatchLogGroup(cloudWatchLogGroup)
  }

  public fun s3Bucket(s3Bucket: IBucket) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  public fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean) {
    cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled)
  }

  public fun s3KeyPrefix(s3KeyPrefix: String) {
    cdkBuilder.s3KeyPrefix(s3KeyPrefix)
  }

  public fun build(): ExecuteCommandLogConfiguration = cdkBuilder.build()
}
