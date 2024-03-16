@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Identifies a model that you want to host and the resources to deploy for hosting it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
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
public interface ProductionVariant {
  /**
   * The size of the Elastic Inference (EI) instance to use for the production variant.
   *
   * Default: - None
   */
  public fun acceleratorType(): AcceleratorType? =
      unwrap(this).getAcceleratorType()?.let(AcceleratorType::wrap)

  /**
   * Number of instances to launch initially.
   *
   * Default: - 1
   */
  public fun initialInstanceCount(): Number? = unwrap(this).getInitialInstanceCount()

  /**
   * Determines initial traffic distribution among all of the models that you specify in the
   * endpoint configuration.
   *
   * Default: - 1.0
   */
  public fun initialVariantWeight(): Number? = unwrap(this).getInitialVariantWeight()

  /**
   * The ML compute instance type.
   */
  public fun instanceType(): InstanceType

  /**
   * The name of the model that you want to host.
   *
   * This is the name that you specified when creating the model.
   */
  public fun modelName(): String

  /**
   * The name of the production variant.
   */
  public fun variantName(): String

  /**
   * A builder for [ProductionVariant]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceleratorType The size of the Elastic Inference (EI) instance to use for the
     * production variant.
     */
    public fun acceleratorType(acceleratorType: AcceleratorType)

    /**
     * @param initialInstanceCount Number of instances to launch initially.
     */
    public fun initialInstanceCount(initialInstanceCount: Number)

    /**
     * @param initialVariantWeight Determines initial traffic distribution among all of the models
     * that you specify in the endpoint configuration.
     */
    public fun initialVariantWeight(initialVariantWeight: Number)

    /**
     * @param instanceType The ML compute instance type. 
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param modelName The name of the model that you want to host. 
     * This is the name that you specified when creating the model.
     */
    public fun modelName(modelName: String)

    /**
     * @param variantName The name of the production variant. 
     */
    public fun variantName(variantName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant.builder()

    /**
     * @param acceleratorType The size of the Elastic Inference (EI) instance to use for the
     * production variant.
     */
    override fun acceleratorType(acceleratorType: AcceleratorType) {
      cdkBuilder.acceleratorType(acceleratorType.let(AcceleratorType::unwrap))
    }

    /**
     * @param initialInstanceCount Number of instances to launch initially.
     */
    override fun initialInstanceCount(initialInstanceCount: Number) {
      cdkBuilder.initialInstanceCount(initialInstanceCount)
    }

    /**
     * @param initialVariantWeight Determines initial traffic distribution among all of the models
     * that you specify in the endpoint configuration.
     */
    override fun initialVariantWeight(initialVariantWeight: Number) {
      cdkBuilder.initialVariantWeight(initialVariantWeight)
    }

    /**
     * @param instanceType The ML compute instance type. 
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    /**
     * @param modelName The name of the model that you want to host. 
     * This is the name that you specified when creating the model.
     */
    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    /**
     * @param variantName The name of the production variant. 
     */
    override fun variantName(variantName: String) {
      cdkBuilder.variantName(variantName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant,
  ) : CdkObject(cdkObject), ProductionVariant {
    /**
     * The size of the Elastic Inference (EI) instance to use for the production variant.
     *
     * Default: - None
     */
    override fun acceleratorType(): AcceleratorType? =
        unwrap(this).getAcceleratorType()?.let(AcceleratorType::wrap)

    /**
     * Number of instances to launch initially.
     *
     * Default: - 1
     */
    override fun initialInstanceCount(): Number? = unwrap(this).getInitialInstanceCount()

    /**
     * Determines initial traffic distribution among all of the models that you specify in the
     * endpoint configuration.
     *
     * Default: - 1.0
     */
    override fun initialVariantWeight(): Number? = unwrap(this).getInitialVariantWeight()

    /**
     * The ML compute instance type.
     */
    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    /**
     * The name of the model that you want to host.
     *
     * This is the name that you specified when creating the model.
     */
    override fun modelName(): String = unwrap(this).getModelName()

    /**
     * The name of the production variant.
     */
    override fun variantName(): String = unwrap(this).getVariantName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProductionVariant {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant):
        ProductionVariant = CdkObjectWrappers.wrap(cdkObject) as ProductionVariant

    internal fun unwrap(wrapped: ProductionVariant):
        software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant
  }
}
