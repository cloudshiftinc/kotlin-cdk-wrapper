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

package io.cloudshiftdev.awscdkdsl.services.logs.destinations

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.logs.destinations.LambdaDestination

/**
 * Use a Lambda Function as the destination for a log subscription.
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
public class LambdaDestinationDsl(
    fn: IFunction,
) {
    private val cdkBuilder: LambdaDestination.Builder = LambdaDestination.Builder.create(fn)

    /**
     * Whether or not to add Lambda Permissions.
     *
     * Default: true
     *
     * @param addPermissions Whether or not to add Lambda Permissions.
     */
    public fun addPermissions(addPermissions: Boolean) {
        cdkBuilder.addPermissions(addPermissions)
    }

    public fun build(): LambdaDestination = cdkBuilder.build()
}
