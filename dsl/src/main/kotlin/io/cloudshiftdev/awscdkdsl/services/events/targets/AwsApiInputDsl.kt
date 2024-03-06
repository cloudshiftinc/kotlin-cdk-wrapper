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

package io.cloudshiftdev.awscdkdsl.services.events.targets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.AwsApiInput

/**
 * Rule target input for an AwsApi target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.targets.*;
 * Object parameters;
 * AwsApiInput awsApiInput = AwsApiInput.builder()
 * .action("action")
 * .service("service")
 * // the properties below are optional
 * .apiVersion("apiVersion")
 * .catchErrorPattern("catchErrorPattern")
 * .parameters(parameters)
 * .build();
 * ```
 */
@CdkDslMarker
public class AwsApiInputDsl {
    private val cdkBuilder: AwsApiInput.Builder = AwsApiInput.builder()

    /** @param action The service action to call. */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * @param apiVersion API version to use for the service.
     * @deprecated the handler code was migrated to AWS SDK for JavaScript v3, which does not
     *   support this feature anymore
     */
    @Deprecated(message = "deprecated in CDK")
    public fun apiVersion(apiVersion: String) {
        cdkBuilder.apiVersion(apiVersion)
    }

    /**
     * @param catchErrorPattern The regex pattern to use to catch API errors. The `code` property of
     *   the `Error` object will be tested against this pattern. If there is a match an error will
     *   not be thrown.
     */
    public fun catchErrorPattern(catchErrorPattern: String) {
        cdkBuilder.catchErrorPattern(catchErrorPattern)
    }

    /** @param parameters The parameters for the service action. */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /** @param parameters The parameters for the service action. */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /** @param service The service to call. */
    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    public fun build(): AwsApiInput = cdkBuilder.build()
}
