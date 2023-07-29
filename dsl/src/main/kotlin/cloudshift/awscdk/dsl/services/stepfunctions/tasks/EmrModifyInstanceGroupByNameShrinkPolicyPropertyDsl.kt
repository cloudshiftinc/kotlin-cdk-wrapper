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
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName

/**
 * Policy for customizing shrink operations.
 *
 * Allows configuration of decommissioning timeout and targeted instance shrinking.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * ShrinkPolicyProperty shrinkPolicyProperty = ShrinkPolicyProperty.builder()
 * .decommissionTimeout(Duration.minutes(30))
 * .instanceResizePolicy(InstanceResizePolicyProperty.builder()
 * .instancesToProtect(List.of("instancesToProtect"))
 * .instancesToTerminate(List.of("instancesToTerminate"))
 * .instanceTerminationTimeout(Duration.minutes(30))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ShrinkPolicy.html)
 */
@CdkDslMarker
public class EmrModifyInstanceGroupByNameShrinkPolicyPropertyDsl {
    private val cdkBuilder: EmrModifyInstanceGroupByName.ShrinkPolicyProperty.Builder =
        EmrModifyInstanceGroupByName.ShrinkPolicyProperty.builder()

    /**
     * @param decommissionTimeout The desired timeout for decommissioning an instance. Overrides the
     *   default YARN decommissioning timeout.
     */
    public fun decommissionTimeout(decommissionTimeout: Duration) {
        cdkBuilder.decommissionTimeout(decommissionTimeout)
    }

    /**
     * @param instanceResizePolicy Custom policy for requesting termination protection or
     *   termination of specific instances when shrinking an instance group.
     */
    public fun instanceResizePolicy(
        instanceResizePolicy:
            EmrModifyInstanceGroupByNameInstanceResizePolicyPropertyDsl.() -> Unit =
            {}
    ) {
        val builder = EmrModifyInstanceGroupByNameInstanceResizePolicyPropertyDsl()
        builder.apply(instanceResizePolicy)
        cdkBuilder.instanceResizePolicy(builder.build())
    }

    /**
     * @param instanceResizePolicy Custom policy for requesting termination protection or
     *   termination of specific instances when shrinking an instance group.
     */
    public fun instanceResizePolicy(
        instanceResizePolicy: EmrModifyInstanceGroupByName.InstanceResizePolicyProperty
    ) {
        cdkBuilder.instanceResizePolicy(instanceResizePolicy)
    }

    public fun build(): EmrModifyInstanceGroupByName.ShrinkPolicyProperty = cdkBuilder.build()
}
