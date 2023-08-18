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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType
import software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant

/**
 * Identifies a model that you want to host and the resources to deploy for hosting it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * AcceleratorType acceleratorType;
 * InstanceType instanceType;
 * ProductionVariant productionVariant = ProductionVariant.builder()
 * .instanceType(instanceType)
 * .modelName("modelName")
 * .variantName("variantName")
 * // the properties below are optional
 * .acceleratorType(acceleratorType)
 * .initialInstanceCount(123)
 * .initialVariantWeight(123)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ProductionVariant.html)
 */
@CdkDslMarker
public class ProductionVariantDsl {
    private val cdkBuilder: ProductionVariant.Builder = ProductionVariant.builder()

    /**
     * @param acceleratorType The size of the Elastic Inference (EI) instance to use for the
     *   production variant.
     */
    public fun acceleratorType(acceleratorType: AcceleratorType) {
        cdkBuilder.acceleratorType(acceleratorType)
    }

    /** @param initialInstanceCount Number of instances to launch initially. */
    public fun initialInstanceCount(initialInstanceCount: Number) {
        cdkBuilder.initialInstanceCount(initialInstanceCount)
    }

    /**
     * @param initialVariantWeight Determines initial traffic distribution among all of the models
     *   that you specify in the endpoint configuration.
     */
    public fun initialVariantWeight(initialVariantWeight: Number) {
        cdkBuilder.initialVariantWeight(initialVariantWeight)
    }

    /** @param instanceType The ML compute instance type. */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param modelName The name of the model that you want to host. This is the name that you
     *   specified when creating the model.
     */
    public fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
    }

    /** @param variantName The name of the production variant. */
    public fun variantName(variantName: String) {
        cdkBuilder.variantName(variantName)
    }

    public fun build(): ProductionVariant = cdkBuilder.build()
}
