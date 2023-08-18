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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.VersionProps

/**
 * Properties for a new Lambda version.
 *
 * Example:
 * ```
 * Function fn;
 * Version version = Version.Builder.create(this, "MyVersion")
 * .lambda(fn)
 * .build();
 * ```
 */
@CdkDslMarker
public class VersionPropsDsl {
    private val cdkBuilder: VersionProps.Builder = VersionProps.builder()

    /**
     * @param codeSha256 SHA256 of the version of the Lambda source code. Specify to validate that
     *   you're deploying the right version.
     */
    public fun codeSha256(codeSha256: String) {
        cdkBuilder.codeSha256(codeSha256)
    }

    /** @param description Description of the version. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param lambda Function to get the value of. */
    public fun lambda(lambda: IFunction) {
        cdkBuilder.lambda(lambda)
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     *   processing. Minimum: 60 seconds Maximum: 6 hours
     */
    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    /** @param onFailure The destination for failed invocations. */
    public fun onFailure(onFailure: IDestination) {
        cdkBuilder.onFailure(onFailure)
    }

    /** @param onSuccess The destination for successful invocations. */
    public fun onSuccess(onSuccess: IDestination) {
        cdkBuilder.onSuccess(onSuccess)
    }

    /**
     * @param provisionedConcurrentExecutions Specifies a provisioned concurrency configuration for
     *   a function's version.
     */
    public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
        cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
    }

    /**
     * @param removalPolicy Whether to retain old versions of this function when a new version is
     *   created.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     *   Minimum: 0 Maximum: 2
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): VersionProps = cdkBuilder.build()
}
