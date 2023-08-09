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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.IFilterPattern
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.ILogSubscriptionDestination
import software.amazon.awscdk.services.logs.SubscriptionFilter
import software.constructs.Construct

/**
 * A new Subscription on a CloudWatch log group.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.logs.destinations.*;
 * Function fn;
 * LogGroup logGroup;
 * SubscriptionFilter.Builder.create(this, "Subscription")
 * .logGroup(logGroup)
 * .destination(new LambdaDestination(fn))
 * .filterPattern(FilterPattern.allTerms("ERROR", "MainThread"))
 * .filterName("ErrorInMainThread")
 * .build();
 * ```
 */
@CdkDslMarker
public class SubscriptionFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: SubscriptionFilter.Builder =
        SubscriptionFilter.Builder.create(scope, id)

    /**
     * The destination to send the filtered events to.
     *
     * For example, a Kinesis stream or a Lambda function.
     *
     * @param destination The destination to send the filtered events to.
     */
    public fun destination(destination: ILogSubscriptionDestination) {
        cdkBuilder.destination(destination)
    }

    /**
     * The name of the subscription filter.
     *
     * Default: Automatically generated
     *
     * @param filterName The name of the subscription filter.
     */
    public fun filterName(filterName: String) {
        cdkBuilder.filterName(filterName)
    }

    /**
     * Log events matching this pattern will be sent to the destination.
     *
     * @param filterPattern Log events matching this pattern will be sent to the destination.
     */
    public fun filterPattern(filterPattern: IFilterPattern) {
        cdkBuilder.filterPattern(filterPattern)
    }

    /**
     * The log group to create the subscription on.
     *
     * @param logGroup The log group to create the subscription on.
     */
    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun build(): SubscriptionFilter = cdkBuilder.build()
}
