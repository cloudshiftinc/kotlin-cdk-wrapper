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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnInstanceStorageConfigKinesisVideoStreamConfigPropertyDsl {
    private val cdkBuilder: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.Builder =
        CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.builder()

    public fun encryptionConfig(encryptionConfig: IResolvable) {
        cdkBuilder.encryptionConfig(encryptionConfig)
    }

    public fun encryptionConfig(encryptionConfig: CfnInstanceStorageConfig.EncryptionConfigProperty) {
        cdkBuilder.encryptionConfig(encryptionConfig)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun retentionPeriodHours(retentionPeriodHours: Number) {
        cdkBuilder.retentionPeriodHours(retentionPeriodHours)
    }

    public fun build(): CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty = cdkBuilder.build()
}
