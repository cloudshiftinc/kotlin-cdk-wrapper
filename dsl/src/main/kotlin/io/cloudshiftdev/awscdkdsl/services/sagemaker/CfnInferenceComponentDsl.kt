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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceComponent
import software.constructs.Construct

/**
 * Creates an inference component, which is a SageMaker hosting object that you can use to deploy a
 * model to an endpoint.
 *
 * In the inference component settings, you specify the model, the endpoint, and how the model
 * utilizes the resources that the endpoint hosts. You can optimize resource utilization by
 * tailoring how the required CPU cores, accelerators, and memory are allocated. You can deploy
 * multiple inference components to an endpoint, where each inference component contains one model
 * and the resource utilization needs for that individual model. After you deploy an inference
 * component, you can directly invoke the associated model when you use the InvokeEndpoint API
 * action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnInferenceComponent cfnInferenceComponent = CfnInferenceComponent.Builder.create(this,
 * "MyCfnInferenceComponent")
 * .endpointName("endpointName")
 * .runtimeConfig(InferenceComponentRuntimeConfigProperty.builder()
 * .copyCount(123)
 * .currentCopyCount(123)
 * .desiredCopyCount(123)
 * .build())
 * .specification(InferenceComponentSpecificationProperty.builder()
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
 * .build())
 * .variantName("variantName")
 * // the properties below are optional
 * .endpointArn("endpointArn")
 * .inferenceComponentName("inferenceComponentName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html)
 */
@CdkDslMarker
public class CfnInferenceComponentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInferenceComponent.Builder =
        CfnInferenceComponent.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-endpointarn)
     *
     * @param endpointArn The Amazon Resource Name (ARN) of the endpoint that hosts the inference
     *   component.
     */
    public fun endpointArn(endpointArn: String) {
        cdkBuilder.endpointArn(endpointArn)
    }

    /**
     * The name of the endpoint that hosts the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-endpointname)
     *
     * @param endpointName The name of the endpoint that hosts the inference component.
     */
    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    /**
     * The name of the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-inferencecomponentname)
     *
     * @param inferenceComponentName The name of the inference component.
     */
    public fun inferenceComponentName(inferenceComponentName: String) {
        cdkBuilder.inferenceComponentName(inferenceComponentName)
    }

    /**
     * The runtime config for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-runtimeconfig)
     *
     * @param runtimeConfig The runtime config for the inference component.
     */
    public fun runtimeConfig(runtimeConfig: IResolvable) {
        cdkBuilder.runtimeConfig(runtimeConfig)
    }

    /**
     * The runtime config for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-runtimeconfig)
     *
     * @param runtimeConfig The runtime config for the inference component.
     */
    public fun runtimeConfig(
        runtimeConfig: CfnInferenceComponent.InferenceComponentRuntimeConfigProperty
    ) {
        cdkBuilder.runtimeConfig(runtimeConfig)
    }

    /**
     * The specification for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-specification)
     *
     * @param specification The specification for the inference component.
     */
    public fun specification(specification: IResolvable) {
        cdkBuilder.specification(specification)
    }

    /**
     * The specification for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-specification)
     *
     * @param specification The specification for the inference component.
     */
    public fun specification(
        specification: CfnInferenceComponent.InferenceComponentSpecificationProperty
    ) {
        cdkBuilder.specification(specification)
    }

    /**
     * An array of tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-tags)
     *
     * @param tags An array of tags to apply to the resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-tags)
     *
     * @param tags An array of tags to apply to the resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The name of the production variant that hosts the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-variantname)
     *
     * @param variantName The name of the production variant that hosts the inference component.
     */
    public fun variantName(variantName: String) {
        cdkBuilder.variantName(variantName)
    }

    public fun build(): CfnInferenceComponent {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
