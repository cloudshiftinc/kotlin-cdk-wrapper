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
import software.amazon.awscdk.services.lambda.EventInvokeConfigProps
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.IFunction
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class EventInvokeConfigPropsDsl {
    private val cdkBuilder: EventInvokeConfigProps.Builder = EventInvokeConfigProps.builder()

    public fun function(function: IFunction) {
        cdkBuilder.function(function)
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

    public fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
    }

    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): EventInvokeConfigProps = cdkBuilder.build()
}
