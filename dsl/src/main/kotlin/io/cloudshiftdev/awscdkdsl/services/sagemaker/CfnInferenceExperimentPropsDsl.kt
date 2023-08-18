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
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps

/**
 * Properties for defining a `CfnInferenceExperiment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnInferenceExperimentProps cfnInferenceExperimentProps = CfnInferenceExperimentProps.builder()
 * .endpointName("endpointName")
 * .modelVariants(List.of(ModelVariantConfigProperty.builder()
 * .infrastructureConfig(ModelInfrastructureConfigProperty.builder()
 * .infrastructureType("infrastructureType")
 * .realTimeInferenceConfig(RealTimeInferenceConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .build())
 * .build())
 * .modelName("modelName")
 * .variantName("variantName")
 * .build()))
 * .name("name")
 * .roleArn("roleArn")
 * .type("type")
 * // the properties below are optional
 * .dataStorageConfig(DataStorageConfigProperty.builder()
 * .destination("destination")
 * // the properties below are optional
 * .contentType(CaptureContentTypeHeaderProperty.builder()
 * .csvContentTypes(List.of("csvContentTypes"))
 * .jsonContentTypes(List.of("jsonContentTypes"))
 * .build())
 * .kmsKey("kmsKey")
 * .build())
 * .description("description")
 * .desiredState("desiredState")
 * .kmsKey("kmsKey")
 * .schedule(InferenceExperimentScheduleProperty.builder()
 * .endTime("endTime")
 * .startTime("startTime")
 * .build())
 * .shadowModeConfig(ShadowModeConfigProperty.builder()
 * .shadowModelVariants(List.of(ShadowModelVariantConfigProperty.builder()
 * .samplingPercentage(123)
 * .shadowModelVariantName("shadowModelVariantName")
 * .build()))
 * .sourceModelVariantName("sourceModelVariantName")
 * .build())
 * .statusReason("statusReason")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html)
 */
@CdkDslMarker
public class CfnInferenceExperimentPropsDsl {
    private val cdkBuilder: CfnInferenceExperimentProps.Builder =
        CfnInferenceExperimentProps.builder()

    private val _modelVariants: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     *   request and response data.
     */
    public fun dataStorageConfig(dataStorageConfig: IResolvable) {
        cdkBuilder.dataStorageConfig(dataStorageConfig)
    }

    /**
     * @param dataStorageConfig The Amazon S3 location and configuration for storing inference
     *   request and response data.
     */
    public fun dataStorageConfig(
        dataStorageConfig: CfnInferenceExperiment.DataStorageConfigProperty
    ) {
        cdkBuilder.dataStorageConfig(dataStorageConfig)
    }

    /** @param description The description of the inference experiment. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param desiredState The desired state of the experiment after stopping. The possible states
     *   are the following:.
     * * `Completed` : The experiment completed successfully
     * * `Cancelled` : The experiment was canceled
     */
    public fun desiredState(desiredState: String) {
        cdkBuilder.desiredState(desiredState)
    }

    /** @param endpointName The name of the endpoint. */
    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    /**
     * @param kmsKey The AWS Key Management Service key that Amazon SageMaker uses to encrypt
     *   captured data at rest using Amazon S3 server-side encryption.
     */
    public fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
    }

    /**
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. There is one for each
     *   variant in the inference experiment. Each `ModelVariantConfigSummary` object in the array
     *   describes the infrastructure configuration for deploying the corresponding variant.
     */
    public fun modelVariants(vararg modelVariants: Any) {
        _modelVariants.addAll(listOf(*modelVariants))
    }

    /**
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. There is one for each
     *   variant in the inference experiment. Each `ModelVariantConfigSummary` object in the array
     *   describes the infrastructure configuration for deploying the corresponding variant.
     */
    public fun modelVariants(modelVariants: Collection<Any>) {
        _modelVariants.addAll(modelVariants)
    }

    /**
     * @param modelVariants An array of `ModelVariantConfigSummary` objects. There is one for each
     *   variant in the inference experiment. Each `ModelVariantConfigSummary` object in the array
     *   describes the infrastructure configuration for deploying the corresponding variant.
     */
    public fun modelVariants(modelVariants: IResolvable) {
        cdkBuilder.modelVariants(modelVariants)
    }

    /** @param name The name of the inference experiment. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param roleArn The ARN of the IAM role that Amazon SageMaker can assume to access model
     *   artifacts and container images, and manage Amazon SageMaker Inference endpoints for model
     *   deployment.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param schedule The duration for which the inference experiment ran or will run. The maximum
     *   duration that you can set for an inference experiment is 30 days.
     */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param schedule The duration for which the inference experiment ran or will run. The maximum
     *   duration that you can set for an inference experiment is 30 days.
     */
    public fun schedule(schedule: CfnInferenceExperiment.InferenceExperimentScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     *   shows the production variant that takes all the inference requests, and the shadow variant
     *   to which Amazon SageMaker replicates a percentage of the inference requests. For the shadow
     *   variant it also shows the percentage of requests that Amazon SageMaker replicates.
     */
    public fun shadowModeConfig(shadowModeConfig: IResolvable) {
        cdkBuilder.shadowModeConfig(shadowModeConfig)
    }

    /**
     * @param shadowModeConfig The configuration of `ShadowMode` inference experiment type, which
     *   shows the production variant that takes all the inference requests, and the shadow variant
     *   to which Amazon SageMaker replicates a percentage of the inference requests. For the shadow
     *   variant it also shows the percentage of requests that Amazon SageMaker replicates.
     */
    public fun shadowModeConfig(shadowModeConfig: CfnInferenceExperiment.ShadowModeConfigProperty) {
        cdkBuilder.shadowModeConfig(shadowModeConfig)
    }

    /** @param statusReason The error message for the inference experiment status result. */
    public fun statusReason(statusReason: String) {
        cdkBuilder.statusReason(statusReason)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param type The type of the inference experiment. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnInferenceExperimentProps {
        if (_modelVariants.isNotEmpty()) cdkBuilder.modelVariants(_modelVariants)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
