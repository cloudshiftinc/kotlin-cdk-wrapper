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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.VersionOptions
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class VersionOptionsDsl {
    private val cdkBuilder: VersionOptions.Builder = VersionOptions.builder()

    public fun codeSha256(codeSha256: String) {
        cdkBuilder.codeSha256(codeSha256)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    public fun onFailure(onFailure: IDestination) {
        cdkBuilder.onFailure(onFailure)
    }

    public fun onSuccess(onSuccess: IDestination) {
        cdkBuilder.onSuccess(onSuccess)
    }

    public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
        cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): VersionOptions = cdkBuilder.build()
}
