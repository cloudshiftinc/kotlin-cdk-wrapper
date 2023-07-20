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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class EmrModifyInstanceGroupByNameInstanceResizePolicyPropertyDsl {
    private val cdkBuilder: EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.Builder =
        EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.builder()

    private val _instancesToProtect: MutableList<String> = mutableListOf()

    private val _instancesToTerminate: MutableList<String> = mutableListOf()

    public fun instanceTerminationTimeout(instanceTerminationTimeout: Duration) {
        cdkBuilder.instanceTerminationTimeout(instanceTerminationTimeout)
    }

    public fun instancesToProtect(vararg instancesToProtect: String) {
        _instancesToProtect.addAll(listOf(*instancesToProtect))
    }

    public fun instancesToProtect(instancesToProtect: Collection<String>) {
        _instancesToProtect.addAll(instancesToProtect)
    }

    public fun instancesToTerminate(vararg instancesToTerminate: String) {
        _instancesToTerminate.addAll(listOf(*instancesToTerminate))
    }

    public fun instancesToTerminate(instancesToTerminate: Collection<String>) {
        _instancesToTerminate.addAll(instancesToTerminate)
    }

    public fun build(): EmrModifyInstanceGroupByName.InstanceResizePolicyProperty {
        if (_instancesToProtect.isNotEmpty()) cdkBuilder.instancesToProtect(_instancesToProtect)
        if (_instancesToTerminate.isNotEmpty()) cdkBuilder.instancesToTerminate(_instancesToTerminate)
        return cdkBuilder.build()
    }
}
