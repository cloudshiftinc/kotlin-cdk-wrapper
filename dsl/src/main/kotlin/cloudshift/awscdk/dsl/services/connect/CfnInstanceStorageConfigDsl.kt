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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnInstanceStorageConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInstanceStorageConfig.Builder =
        CfnInstanceStorageConfig.Builder.create(scope, id)

    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    public fun kinesisFirehoseConfig(kinesisFirehoseConfig: IResolvable) {
        cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig)
    }

    public fun kinesisFirehoseConfig(kinesisFirehoseConfig: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty) {
        cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig)
    }

    public fun kinesisStreamConfig(kinesisStreamConfig: IResolvable) {
        cdkBuilder.kinesisStreamConfig(kinesisStreamConfig)
    }

    public fun kinesisStreamConfig(kinesisStreamConfig: CfnInstanceStorageConfig.KinesisStreamConfigProperty) {
        cdkBuilder.kinesisStreamConfig(kinesisStreamConfig)
    }

    public fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: IResolvable) {
        cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig)
    }

    public fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty) {
        cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig)
    }

    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    public fun s3Config(s3Config: IResolvable) {
        cdkBuilder.s3Config(s3Config)
    }

    public fun s3Config(s3Config: CfnInstanceStorageConfig.S3ConfigProperty) {
        cdkBuilder.s3Config(s3Config)
    }

    public fun storageType(storageType: String) {
        cdkBuilder.storageType(storageType)
    }

    public fun build(): CfnInstanceStorageConfig = cdkBuilder.build()
}
