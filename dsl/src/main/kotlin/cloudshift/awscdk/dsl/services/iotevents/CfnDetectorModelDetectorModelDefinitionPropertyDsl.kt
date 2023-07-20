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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDetectorModelDetectorModelDefinitionPropertyDsl {
    private val cdkBuilder: CfnDetectorModel.DetectorModelDefinitionProperty.Builder =
        CfnDetectorModel.DetectorModelDefinitionProperty.builder()

    private val _states: MutableList<Any> = mutableListOf()

    public fun initialStateName(initialStateName: String) {
        cdkBuilder.initialStateName(initialStateName)
    }

    public fun states(vararg states: Any) {
        _states.addAll(listOf(*states))
    }

    public fun states(states: Collection<Any>) {
        _states.addAll(states)
    }

    public fun states(states: IResolvable) {
        cdkBuilder.states(states)
    }

    public fun build(): CfnDetectorModel.DetectorModelDefinitionProperty {
        if (_states.isNotEmpty()) cdkBuilder.states(_states)
        return cdkBuilder.build()
    }
}
