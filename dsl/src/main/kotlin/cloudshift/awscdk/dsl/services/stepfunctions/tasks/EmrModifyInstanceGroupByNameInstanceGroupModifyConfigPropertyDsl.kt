@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName

/**
 * Modify the size or configurations of an instance group.
 *
 * Example:
 * ```
 * EmrModifyInstanceGroupByName.Builder.create(this, "Task")
 * .clusterId("ClusterId")
 * .instanceGroupName(JsonPath.stringAt("$.InstanceGroupName"))
 * .instanceGroup(InstanceGroupModifyConfigProperty.builder()
 * .instanceCount(1)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceGroupModifyConfig.html)
 */
@CdkDslMarker
public class EmrModifyInstanceGroupByNameInstanceGroupModifyConfigPropertyDsl {
    private val cdkBuilder: EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.Builder =
        EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.builder()

    private val _configurations: MutableList<EmrCreateCluster.ConfigurationProperty> =
        mutableListOf()

    private val _eC2InstanceIdsToTerminate: MutableList<String> = mutableListOf()

    /**
     * @param configurations A list of new or modified configurations to apply for an instance
     *   group.
     */
    public fun configurations(configurations: EmrCreateClusterConfigurationPropertyDsl.() -> Unit) {
        _configurations.add(
            EmrCreateClusterConfigurationPropertyDsl().apply(configurations).build()
        )
    }

    /**
     * @param configurations A list of new or modified configurations to apply for an instance
     *   group.
     */
    public fun configurations(configurations: Collection<EmrCreateCluster.ConfigurationProperty>) {
        _configurations.addAll(configurations)
    }

    /**
     * @param eC2InstanceIdsToTerminate The EC2 InstanceIds to terminate. After you terminate the
     *   instances, the instance group will not return to its original requested size.
     */
    public fun eC2InstanceIdsToTerminate(vararg eC2InstanceIdsToTerminate: String) {
        _eC2InstanceIdsToTerminate.addAll(listOf(*eC2InstanceIdsToTerminate))
    }

    /**
     * @param eC2InstanceIdsToTerminate The EC2 InstanceIds to terminate. After you terminate the
     *   instances, the instance group will not return to its original requested size.
     */
    public fun eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate: Collection<String>) {
        _eC2InstanceIdsToTerminate.addAll(eC2InstanceIdsToTerminate)
    }

    /** @param instanceCount Target size for the instance group. */
    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    /** @param shrinkPolicy Policy for customizing shrink operations. */
    public fun shrinkPolicy(
        shrinkPolicy: EmrModifyInstanceGroupByNameShrinkPolicyPropertyDsl.() -> Unit = {}
    ) {
        val builder = EmrModifyInstanceGroupByNameShrinkPolicyPropertyDsl()
        builder.apply(shrinkPolicy)
        cdkBuilder.shrinkPolicy(builder.build())
    }

    /** @param shrinkPolicy Policy for customizing shrink operations. */
    public fun shrinkPolicy(shrinkPolicy: EmrModifyInstanceGroupByName.ShrinkPolicyProperty) {
        cdkBuilder.shrinkPolicy(shrinkPolicy)
    }

    public fun build(): EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty {
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        if (_eC2InstanceIdsToTerminate.isNotEmpty())
            cdkBuilder.eC2InstanceIdsToTerminate(_eC2InstanceIdsToTerminate)
        return cdkBuilder.build()
    }
}
