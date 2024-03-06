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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceComponent

/**
 * Details about the resources to deploy with this inference component, including the model,
 * container, and compute resources.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * InferenceComponentSpecificationProperty inferenceComponentSpecificationProperty =
 * InferenceComponentSpecificationProperty.builder()
 * .computeResourceRequirements(InferenceComponentComputeResourceRequirementsProperty.builder()
 * .maxMemoryRequiredInMb(123)
 * .minMemoryRequiredInMb(123)
 * .numberOfAcceleratorDevicesRequired(123)
 * .numberOfCpuCoresRequired(123)
 * .build())
 * // the properties below are optional
 * .container(InferenceComponentContainerSpecificationProperty.builder()
 * .artifactUrl("artifactUrl")
 * .deployedImage(DeployedImageProperty.builder()
 * .resolutionTime("resolutionTime")
 * .resolvedImage("resolvedImage")
 * .specifiedImage("specifiedImage")
 * .build())
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .image("image")
 * .build())
 * .modelName("modelName")
 * .startupParameters(InferenceComponentStartupParametersProperty.builder()
 * .containerStartupHealthCheckTimeoutInSeconds(123)
 * .modelDataDownloadTimeoutInSeconds(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html)
 */
@CdkDslMarker
public class CfnInferenceComponentInferenceComponentSpecificationPropertyDsl {
    private val cdkBuilder: CfnInferenceComponent.InferenceComponentSpecificationProperty.Builder =
        CfnInferenceComponent.InferenceComponentSpecificationProperty.builder()

    /**
     * @param computeResourceRequirements The compute resources allocated to run the model assigned
     *   to the inference component.
     */
    public fun computeResourceRequirements(computeResourceRequirements: IResolvable) {
        cdkBuilder.computeResourceRequirements(computeResourceRequirements)
    }

    /**
     * @param computeResourceRequirements The compute resources allocated to run the model assigned
     *   to the inference component.
     */
    public fun computeResourceRequirements(
        computeResourceRequirements:
            CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty
    ) {
        cdkBuilder.computeResourceRequirements(computeResourceRequirements)
    }

    /**
     * @param container Defines a container that provides the runtime environment for a model that
     *   you deploy with an inference component.
     */
    public fun container(container: IResolvable) {
        cdkBuilder.container(container)
    }

    /**
     * @param container Defines a container that provides the runtime environment for a model that
     *   you deploy with an inference component.
     */
    public fun container(
        container: CfnInferenceComponent.InferenceComponentContainerSpecificationProperty
    ) {
        cdkBuilder.container(container)
    }

    /**
     * @param modelName The name of an existing SageMaker model object in your account that you want
     *   to deploy with the inference component.
     */
    public fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
    }

    /** @param startupParameters Settings that take effect while the model container starts up. */
    public fun startupParameters(startupParameters: IResolvable) {
        cdkBuilder.startupParameters(startupParameters)
    }

    /** @param startupParameters Settings that take effect while the model container starts up. */
    public fun startupParameters(
        startupParameters: CfnInferenceComponent.InferenceComponentStartupParametersProperty
    ) {
        cdkBuilder.startupParameters(startupParameters)
    }

    public fun build(): CfnInferenceComponent.InferenceComponentSpecificationProperty =
        cdkBuilder.build()
}
