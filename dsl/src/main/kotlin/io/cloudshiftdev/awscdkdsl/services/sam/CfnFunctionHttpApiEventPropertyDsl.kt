@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * HttpApiEventProperty httpApiEventProperty = HttpApiEventProperty.builder()
 * .apiId("apiId")
 * .auth(HttpApiFunctionAuthProperty.builder()
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizer("authorizer")
 * .build())
 * .method("method")
 * .path("path")
 * .payloadFormatVersion("payloadFormatVersion")
 * .routeSettings(RouteSettingsProperty.builder()
 * .dataTraceEnabled(false)
 * .detailedMetricsEnabled(false)
 * .loggingLevel("loggingLevel")
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .build())
 * .timeoutInMillis(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapievent.html)
 */
@CdkDslMarker
public class CfnFunctionHttpApiEventPropertyDsl {
    private val cdkBuilder: CfnFunction.HttpApiEventProperty.Builder =
        CfnFunction.HttpApiEventProperty.builder()

    /** @param apiId the value to be set. */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /** @param auth the value to be set. */
    public fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth)
    }

    /** @param auth the value to be set. */
    public fun auth(auth: CfnFunction.HttpApiFunctionAuthProperty) {
        cdkBuilder.auth(auth)
    }

    /** @param method the value to be set. */
    public fun method(method: String) {
        cdkBuilder.method(method)
    }

    /** @param path the value to be set. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /** @param payloadFormatVersion the value to be set. */
    public fun payloadFormatVersion(payloadFormatVersion: String) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

    /** @param routeSettings the value to be set. */
    public fun routeSettings(routeSettings: IResolvable) {
        cdkBuilder.routeSettings(routeSettings)
    }

    /** @param routeSettings the value to be set. */
    public fun routeSettings(routeSettings: CfnFunction.RouteSettingsProperty) {
        cdkBuilder.routeSettings(routeSettings)
    }

    /** @param timeoutInMillis the value to be set. */
    public fun timeoutInMillis(timeoutInMillis: Number) {
        cdkBuilder.timeoutInMillis(timeoutInMillis)
    }

    public fun build(): CfnFunction.HttpApiEventProperty = cdkBuilder.build()
}
