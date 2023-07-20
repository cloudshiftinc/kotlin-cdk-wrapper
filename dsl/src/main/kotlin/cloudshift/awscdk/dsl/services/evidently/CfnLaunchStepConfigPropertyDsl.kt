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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnLaunch
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLaunchStepConfigPropertyDsl {
    private val cdkBuilder: CfnLaunch.StepConfigProperty.Builder =
        CfnLaunch.StepConfigProperty.builder()

    private val _groupWeights: MutableList<Any> = mutableListOf()

    private val _segmentOverrides: MutableList<Any> = mutableListOf()

    public fun groupWeights(vararg groupWeights: Any) {
        _groupWeights.addAll(listOf(*groupWeights))
    }

    public fun groupWeights(groupWeights: Collection<Any>) {
        _groupWeights.addAll(groupWeights)
    }

    public fun groupWeights(groupWeights: IResolvable) {
        cdkBuilder.groupWeights(groupWeights)
    }

    public fun segmentOverrides(vararg segmentOverrides: Any) {
        _segmentOverrides.addAll(listOf(*segmentOverrides))
    }

    public fun segmentOverrides(segmentOverrides: Collection<Any>) {
        _segmentOverrides.addAll(segmentOverrides)
    }

    public fun segmentOverrides(segmentOverrides: IResolvable) {
        cdkBuilder.segmentOverrides(segmentOverrides)
    }

    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    public fun build(): CfnLaunch.StepConfigProperty {
        if (_groupWeights.isNotEmpty()) cdkBuilder.groupWeights(_groupWeights)
        if (_segmentOverrides.isNotEmpty()) cdkBuilder.segmentOverrides(_segmentOverrides)
        return cdkBuilder.build()
    }
}
