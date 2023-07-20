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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketRoutingRulePropertyDsl {
    private val cdkBuilder: CfnBucket.RoutingRuleProperty.Builder =
        CfnBucket.RoutingRuleProperty.builder()

    public fun redirectRule(redirectRule: IResolvable) {
        cdkBuilder.redirectRule(redirectRule)
    }

    public fun redirectRule(redirectRule: CfnBucket.RedirectRuleProperty) {
        cdkBuilder.redirectRule(redirectRule)
    }

    public fun routingRuleCondition(routingRuleCondition: IResolvable) {
        cdkBuilder.routingRuleCondition(routingRuleCondition)
    }

    public fun routingRuleCondition(routingRuleCondition: CfnBucket.RoutingRuleConditionProperty) {
        cdkBuilder.routingRuleCondition(routingRuleCondition)
    }

    public fun build(): CfnBucket.RoutingRuleProperty = cdkBuilder.build()
}
