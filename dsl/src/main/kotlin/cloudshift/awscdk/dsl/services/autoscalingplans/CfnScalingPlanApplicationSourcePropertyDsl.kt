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

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScalingPlanApplicationSourcePropertyDsl {
    private val cdkBuilder: CfnScalingPlan.ApplicationSourceProperty.Builder =
        CfnScalingPlan.ApplicationSourceProperty.builder()

    private val _tagFilters: MutableList<Any> = mutableListOf()

    public fun cloudFormationStackArn(cloudFormationStackArn: String) {
        cdkBuilder.cloudFormationStackArn(cloudFormationStackArn)
    }

    public fun tagFilters(vararg tagFilters: Any) {
        _tagFilters.addAll(listOf(*tagFilters))
    }

    public fun tagFilters(tagFilters: Collection<Any>) {
        _tagFilters.addAll(tagFilters)
    }

    public fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters)
    }

    public fun build(): CfnScalingPlan.ApplicationSourceProperty {
        if (_tagFilters.isNotEmpty()) cdkBuilder.tagFilters(_tagFilters)
        return cdkBuilder.build()
    }
}
