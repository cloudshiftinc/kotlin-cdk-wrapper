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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnInferenceComponent

/**
 * Defines the compute resources to allocate to run a model that you assign to an inference
 * component.
 *
 * These resources include CPU cores, accelerators, and memory.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * InferenceComponentComputeResourceRequirementsProperty
 * inferenceComponentComputeResourceRequirementsProperty =
 * InferenceComponentComputeResourceRequirementsProperty.builder()
 * .maxMemoryRequiredInMb(123)
 * .minMemoryRequiredInMb(123)
 * .numberOfAcceleratorDevicesRequired(123)
 * .numberOfCpuCoresRequired(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements.html)
 */
@CdkDslMarker
public class CfnInferenceComponentInferenceComponentComputeResourceRequirementsPropertyDsl {
    private val cdkBuilder:
        CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty.Builder =
        CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty.builder()

    /**
     * @param maxMemoryRequiredInMb The maximum MB of memory to allocate to run a model that you
     *   assign to an inference component.
     */
    public fun maxMemoryRequiredInMb(maxMemoryRequiredInMb: Number) {
        cdkBuilder.maxMemoryRequiredInMb(maxMemoryRequiredInMb)
    }

    /**
     * @param minMemoryRequiredInMb The minimum MB of memory to allocate to run a model that you
     *   assign to an inference component.
     */
    public fun minMemoryRequiredInMb(minMemoryRequiredInMb: Number) {
        cdkBuilder.minMemoryRequiredInMb(minMemoryRequiredInMb)
    }

    /**
     * @param numberOfAcceleratorDevicesRequired The number of accelerators to allocate to run a
     *   model that you assign to an inference component. Accelerators include GPUs and AWS
     *   Inferentia.
     */
    public fun numberOfAcceleratorDevicesRequired(numberOfAcceleratorDevicesRequired: Number) {
        cdkBuilder.numberOfAcceleratorDevicesRequired(numberOfAcceleratorDevicesRequired)
    }

    /**
     * @param numberOfCpuCoresRequired The number of CPU cores to allocate to run a model that you
     *   assign to an inference component.
     */
    public fun numberOfCpuCoresRequired(numberOfCpuCoresRequired: Number) {
        cdkBuilder.numberOfCpuCoresRequired(numberOfCpuCoresRequired)
    }

    public fun build():
        CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty =
        cdkBuilder.build()
}
