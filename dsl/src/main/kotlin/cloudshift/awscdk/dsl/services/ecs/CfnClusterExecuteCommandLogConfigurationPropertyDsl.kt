@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCluster
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnClusterExecuteCommandLogConfigurationPropertyDsl {
    private val cdkBuilder: CfnCluster.ExecuteCommandLogConfigurationProperty.Builder =
        CfnCluster.ExecuteCommandLogConfigurationProperty.builder()

    public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean) {
        cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled)
    }

    public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: IResolvable) {
        cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled)
    }

    public fun cloudWatchLogGroupName(cloudWatchLogGroupName: String) {
        cdkBuilder.cloudWatchLogGroupName(cloudWatchLogGroupName)
    }

    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    public fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean) {
        cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled)
    }

    public fun s3EncryptionEnabled(s3EncryptionEnabled: IResolvable) {
        cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled)
    }

    public fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    public fun build(): CfnCluster.ExecuteCommandLogConfigurationProperty = cdkBuilder.build()
}
