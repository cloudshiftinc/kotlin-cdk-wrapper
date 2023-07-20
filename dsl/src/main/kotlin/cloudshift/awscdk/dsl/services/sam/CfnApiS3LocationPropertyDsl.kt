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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnApi
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnApiS3LocationPropertyDsl {
    private val cdkBuilder: CfnApi.S3LocationProperty.Builder = CfnApi.S3LocationProperty.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun version(version: Number) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnApi.S3LocationProperty = cdkBuilder.build()
}
