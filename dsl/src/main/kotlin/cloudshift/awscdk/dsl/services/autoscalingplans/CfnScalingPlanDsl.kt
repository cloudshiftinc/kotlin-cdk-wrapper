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
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScalingPlanDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnScalingPlan.Builder = CfnScalingPlan.Builder.create(scope, id)

    private val _scalingInstructions: MutableList<Any> = mutableListOf()

    public fun applicationSource(applicationSource: IResolvable) {
        cdkBuilder.applicationSource(applicationSource)
    }

    public fun applicationSource(applicationSource: CfnScalingPlan.ApplicationSourceProperty) {
        cdkBuilder.applicationSource(applicationSource)
    }

    public fun scalingInstructions(vararg scalingInstructions: Any) {
        _scalingInstructions.addAll(listOf(*scalingInstructions))
    }

    public fun scalingInstructions(scalingInstructions: Collection<Any>) {
        _scalingInstructions.addAll(scalingInstructions)
    }

    public fun scalingInstructions(scalingInstructions: IResolvable) {
        cdkBuilder.scalingInstructions(scalingInstructions)
    }

    public fun build(): CfnScalingPlan {
        if (_scalingInstructions.isNotEmpty()) cdkBuilder.scalingInstructions(_scalingInstructions)
        return cdkBuilder.build()
    }
}
