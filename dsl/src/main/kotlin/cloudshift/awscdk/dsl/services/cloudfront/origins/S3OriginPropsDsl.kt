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

package cloudshift.awscdk.dsl.services.cloudfront.origins

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.origins.S3OriginProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class S3OriginPropsDsl {
    private val cdkBuilder: S3OriginProps.Builder = S3OriginProps.builder()

    public fun connectionAttempts(connectionAttempts: Number) {
        cdkBuilder.connectionAttempts(connectionAttempts)
    }

    public fun connectionTimeout(connectionTimeout: Duration) {
        cdkBuilder.connectionTimeout(connectionTimeout)
    }

    public fun customHeaders(customHeaders: Map<String, String>) {
        cdkBuilder.customHeaders(customHeaders)
    }

    public fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity) {
        cdkBuilder.originAccessIdentity(originAccessIdentity)
    }

    public fun originId(originId: String) {
        cdkBuilder.originId(originId)
    }

    public fun originPath(originPath: String) {
        cdkBuilder.originPath(originPath)
    }

    public fun originShieldEnabled(originShieldEnabled: Boolean) {
        cdkBuilder.originShieldEnabled(originShieldEnabled)
    }

    public fun originShieldRegion(originShieldRegion: String) {
        cdkBuilder.originShieldRegion(originShieldRegion)
    }

    public fun build(): S3OriginProps = cdkBuilder.build()
}
