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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.CfnRestApi
import kotlin.String

@CdkDslMarker
public class CfnRestApiS3LocationPropertyDsl {
    private val cdkBuilder: CfnRestApi.S3LocationProperty.Builder =
        CfnRestApi.S3LocationProperty.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun eTag(eTag: String) {
        cdkBuilder.eTag(eTag)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnRestApi.S3LocationProperty = cdkBuilder.build()
}
