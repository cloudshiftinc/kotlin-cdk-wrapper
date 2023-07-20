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
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class EmrModifyInstanceGroupByNameInstanceGroupModifyConfigPropertyDsl {
    private val cdkBuilder: EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.Builder =
        EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.builder()

    private val _configurations: MutableList<EmrCreateCluster.ConfigurationProperty> = mutableListOf()

    private val _eC2InstanceIdsToTerminate: MutableList<String> = mutableListOf()

    public fun configurations(configurations: EmrCreateClusterConfigurationPropertyDsl.() -> Unit) {
        _configurations.add(EmrCreateClusterConfigurationPropertyDsl().apply(configurations).build())
    }

    public fun configurations(configurations: Collection<EmrCreateCluster.ConfigurationProperty>) {
        _configurations.addAll(configurations)
    }

    public fun eC2InstanceIdsToTerminate(vararg eC2InstanceIdsToTerminate: String) {
        _eC2InstanceIdsToTerminate.addAll(listOf(*eC2InstanceIdsToTerminate))
    }

    public fun eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate: Collection<String>) {
        _eC2InstanceIdsToTerminate.addAll(eC2InstanceIdsToTerminate)
    }

    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    public fun shrinkPolicy(
        block: EmrModifyInstanceGroupByNameShrinkPolicyPropertyDsl.() -> Unit =
            {},
    ) {
        val builder = EmrModifyInstanceGroupByNameShrinkPolicyPropertyDsl()
        builder.apply(block)
        cdkBuilder.shrinkPolicy(builder.build())
    }

    public fun shrinkPolicy(shrinkPolicy: EmrModifyInstanceGroupByName.ShrinkPolicyProperty) {
        cdkBuilder.shrinkPolicy(shrinkPolicy)
    }

    public fun build(): EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty {
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        if (_eC2InstanceIdsToTerminate.isNotEmpty()) {
            cdkBuilder.eC2InstanceIdsToTerminate(_eC2InstanceIdsToTerminate)
        }
        return cdkBuilder.build()
    }
}
