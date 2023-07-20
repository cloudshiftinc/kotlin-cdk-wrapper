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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.String

@CdkDslMarker
public class CfnBucketEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.EncryptionConfigurationProperty.Builder =
        CfnBucket.EncryptionConfigurationProperty.builder()

    public fun replicaKmsKeyId(replicaKmsKeyId: String) {
        cdkBuilder.replicaKmsKeyId(replicaKmsKeyId)
    }

    public fun build(): CfnBucket.EncryptionConfigurationProperty = cdkBuilder.build()
}
