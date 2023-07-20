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
import software.amazon.awscdk.services.sam.CfnHttpApi
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnHttpApiS3LocationPropertyDsl {
    private val cdkBuilder: CfnHttpApi.S3LocationProperty.Builder =
        CfnHttpApi.S3LocationProperty.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun version(version: Number) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnHttpApi.S3LocationProperty = cdkBuilder.build()
}
