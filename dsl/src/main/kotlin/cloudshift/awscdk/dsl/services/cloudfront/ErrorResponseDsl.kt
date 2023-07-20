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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.ErrorResponse
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class ErrorResponseDsl {
    private val cdkBuilder: ErrorResponse.Builder = ErrorResponse.builder()

    public fun httpStatus(httpStatus: Number) {
        cdkBuilder.httpStatus(httpStatus)
    }

    public fun responseHttpStatus(responseHttpStatus: Number) {
        cdkBuilder.responseHttpStatus(responseHttpStatus)
    }

    public fun responsePagePath(responsePagePath: String) {
        cdkBuilder.responsePagePath(responsePagePath)
    }

    public fun ttl(ttl: Duration) {
        cdkBuilder.ttl(ttl)
    }

    public fun build(): ErrorResponse = cdkBuilder.build()
}
