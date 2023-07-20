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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.logs.IFilterPattern
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.ILogSubscriptionDestination
import software.amazon.awscdk.services.logs.SubscriptionFilter
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class SubscriptionFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: SubscriptionFilter.Builder = SubscriptionFilter.Builder.create(scope, id)

    public fun destination(destination: ILogSubscriptionDestination) {
        cdkBuilder.destination(destination)
    }

    public fun filterPattern(filterPattern: IFilterPattern) {
        cdkBuilder.filterPattern(filterPattern)
    }

    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun build(): SubscriptionFilter = cdkBuilder.build()
}
