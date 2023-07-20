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
import software.amazon.awscdk.services.logs.CfnSubscriptionFilter
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSubscriptionFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSubscriptionFilter.Builder =
        CfnSubscriptionFilter.Builder.create(scope, id)

    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    public fun distribution(distribution: String) {
        cdkBuilder.distribution(distribution)
    }

    public fun filterName(filterName: String) {
        cdkBuilder.filterName(filterName)
    }

    public fun filterPattern(filterPattern: String) {
        cdkBuilder.filterPattern(filterPattern)
    }

    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnSubscriptionFilter = cdkBuilder.build()
}
