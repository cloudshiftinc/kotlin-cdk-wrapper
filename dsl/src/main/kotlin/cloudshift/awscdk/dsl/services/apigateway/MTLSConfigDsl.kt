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
import software.amazon.awscdk.services.apigateway.MTLSConfig
import software.amazon.awscdk.services.s3.IBucket
import kotlin.String

@CdkDslMarker
public class MTLSConfigDsl {
    private val cdkBuilder: MTLSConfig.Builder = MTLSConfig.builder()

    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): MTLSConfig = cdkBuilder.build()
}
