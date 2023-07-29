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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.EventInvokeConfigProps
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.IFunction

/**
 * Properties for an EventInvokeConfig.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.lambda.*;
 * IDestination destination;
 * Function function_;
 * EventInvokeConfigProps eventInvokeConfigProps = EventInvokeConfigProps.builder()
 * .function(function_)
 * // the properties below are optional
 * .maxEventAge(Duration.minutes(30))
 * .onFailure(destination)
 * .onSuccess(destination)
 * .qualifier("qualifier")
 * .retryAttempts(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class EventInvokeConfigPropsDsl {
    private val cdkBuilder: EventInvokeConfigProps.Builder = EventInvokeConfigProps.builder()

    /** @param function The Lambda function. */
    public fun function(function: IFunction) {
        cdkBuilder.function(function)
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

    /** @param qualifier The qualifier. */
    public fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     *   Minimum: 0 Maximum: 2
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): EventInvokeConfigProps = cdkBuilder.build()
}
