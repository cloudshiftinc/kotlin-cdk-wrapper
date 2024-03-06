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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Specifies a model that you want to host and the resources to deploy for hosting it.
 *
 * If you are deploying multiple models, tell Amazon SageMaker how to distribute traffic among the
 * models by specifying the `InitialVariantWeight` objects.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ProductionVariantProperty productionVariantProperty = ProductionVariantProperty.builder()
 * .variantName("variantName")
 * // the properties below are optional
 * .acceleratorType("acceleratorType")
 * .containerStartupHealthCheckTimeoutInSeconds(123)
 * .enableSsmAccess(false)
 * .initialInstanceCount(123)
 * .initialVariantWeight(123)
 * .instanceType("instanceType")
 * .managedInstanceScaling(ManagedInstanceScalingProperty.builder()
 * .maxInstanceCount(123)
 * .minInstanceCount(123)
 * .status("status")
 * .build())
 * .modelDataDownloadTimeoutInSeconds(123)
 * .modelName("modelName")
 * .routingConfig(RoutingConfigProperty.builder()
 * .routingStrategy("routingStrategy")
 * .build())
 * .serverlessConfig(ServerlessConfigProperty.builder()
 * .maxConcurrency(123)
 * .memorySizeInMb(123)
 * // the properties below are optional
 * .provisionedConcurrency(123)
 * .build())
 * .volumeSizeInGb(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html)
 */
@CdkDslMarker
public class CfnEndpointConfigProductionVariantPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ProductionVariantProperty.Builder =
        CfnEndpointConfig.ProductionVariantProperty.builder()

    /**
     * @param acceleratorType The size of the Elastic Inference (EI) instance to use for the
     *   production variant. EI instances provide on-demand GPU computing for inference. For more
     *   information, see
     *   [Using Elastic Inference in Amazon SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html)
     *   . For more information, see
     *   [Using Elastic Inference in Amazon SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html)
     *   .
     */
    public fun acceleratorType(acceleratorType: String) {
        cdkBuilder.acceleratorType(acceleratorType)
    }

    /**
     * @param containerStartupHealthCheckTimeoutInSeconds The timeout value, in seconds, for your
     *   inference container to pass health check by SageMaker Hosting. For more information about
     *   health check, see
     *   [How Your Container Should Respond to Health Check (Ping) Requests](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests)
     *   .
     */
    public fun containerStartupHealthCheckTimeoutInSeconds(
        containerStartupHealthCheckTimeoutInSeconds: Number
    ) {
        cdkBuilder.containerStartupHealthCheckTimeoutInSeconds(
            containerStartupHealthCheckTimeoutInSeconds
        )
    }

    /**
     * @param enableSsmAccess You can use this parameter to turn on native AWS Systems Manager (SSM)
     *   access for a production variant behind an endpoint. By default, SSM access is disabled for
     *   all production variants behind an endpoint. You can turn on or turn off SSM access for a
     *   production variant behind an existing endpoint by creating a new endpoint configuration and
     *   calling `UpdateEndpoint` .
     */
    public fun enableSsmAccess(enableSsmAccess: Boolean) {
        cdkBuilder.enableSsmAccess(enableSsmAccess)
    }

    /**
     * @param enableSsmAccess You can use this parameter to turn on native AWS Systems Manager (SSM)
     *   access for a production variant behind an endpoint. By default, SSM access is disabled for
     *   all production variants behind an endpoint. You can turn on or turn off SSM access for a
     *   production variant behind an existing endpoint by creating a new endpoint configuration and
     *   calling `UpdateEndpoint` .
     */
    public fun enableSsmAccess(enableSsmAccess: IResolvable) {
        cdkBuilder.enableSsmAccess(enableSsmAccess)
    }

    /** @param initialInstanceCount Number of instances to launch initially. */
    public fun initialInstanceCount(initialInstanceCount: Number) {
        cdkBuilder.initialInstanceCount(initialInstanceCount)
    }

    /**
     * @param initialVariantWeight Determines initial traffic distribution among all of the models
     *   that you specify in the endpoint configuration. The traffic to a production variant is
     *   determined by the ratio of the `VariantWeight` to the sum of all `VariantWeight` values
     *   across all ProductionVariants. If unspecified, it defaults to 1.0.
     */
    public fun initialVariantWeight(initialVariantWeight: Number) {
        cdkBuilder.initialVariantWeight(initialVariantWeight)
    }

    /** @param instanceType The ML compute instance type. */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /** @param managedInstanceScaling the value to be set. */
    public fun managedInstanceScaling(managedInstanceScaling: IResolvable) {
        cdkBuilder.managedInstanceScaling(managedInstanceScaling)
    }

    /** @param managedInstanceScaling the value to be set. */
    public fun managedInstanceScaling(
        managedInstanceScaling: CfnEndpointConfig.ManagedInstanceScalingProperty
    ) {
        cdkBuilder.managedInstanceScaling(managedInstanceScaling)
    }

    /**
     * @param modelDataDownloadTimeoutInSeconds The timeout value, in seconds, to download and
     *   extract the model that you want to host from Amazon S3 to the individual inference instance
     *   associated with this production variant.
     */
    public fun modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds: Number) {
        cdkBuilder.modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds)
    }

    /**
     * @param modelName The name of the model that you want to host. This is the name that you
     *   specified when creating the model.
     */
    public fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
    }

    /** @param routingConfig the value to be set. */
    public fun routingConfig(routingConfig: IResolvable) {
        cdkBuilder.routingConfig(routingConfig)
    }

    /** @param routingConfig the value to be set. */
    public fun routingConfig(routingConfig: CfnEndpointConfig.RoutingConfigProperty) {
        cdkBuilder.routingConfig(routingConfig)
    }

    /**
     * @param serverlessConfig The serverless configuration for an endpoint. Specifies a serverless
     *   endpoint configuration instead of an instance-based endpoint configuration.
     */
    public fun serverlessConfig(serverlessConfig: IResolvable) {
        cdkBuilder.serverlessConfig(serverlessConfig)
    }

    /**
     * @param serverlessConfig The serverless configuration for an endpoint. Specifies a serverless
     *   endpoint configuration instead of an instance-based endpoint configuration.
     */
    public fun serverlessConfig(serverlessConfig: CfnEndpointConfig.ServerlessConfigProperty) {
        cdkBuilder.serverlessConfig(serverlessConfig)
    }

    /** @param variantName The name of the production variant. */
    public fun variantName(variantName: String) {
        cdkBuilder.variantName(variantName)
    }

    /**
     * @param volumeSizeInGb The size, in GB, of the ML storage volume attached to individual
     *   inference instance associated with the production variant. Currently only Amazon EBS gp2
     *   storage volumes are supported.
     */
    public fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
    }

    public fun build(): CfnEndpointConfig.ProductionVariantProperty = cdkBuilder.build()
}
