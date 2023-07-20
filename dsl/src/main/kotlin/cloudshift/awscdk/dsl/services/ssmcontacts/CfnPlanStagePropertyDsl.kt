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

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnPlan
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPlanStagePropertyDsl {
    private val cdkBuilder: CfnPlan.StageProperty.Builder = CfnPlan.StageProperty.builder()

    private val _targets: MutableList<Any> = mutableListOf()

    public fun durationInMinutes(durationInMinutes: Number) {
        cdkBuilder.durationInMinutes(durationInMinutes)
    }

    public fun targets(vararg targets: Any) {
        _targets.addAll(listOf(*targets))
    }

    public fun targets(targets: Collection<Any>) {
        _targets.addAll(targets)
    }

    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    public fun build(): CfnPlan.StageProperty {
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
