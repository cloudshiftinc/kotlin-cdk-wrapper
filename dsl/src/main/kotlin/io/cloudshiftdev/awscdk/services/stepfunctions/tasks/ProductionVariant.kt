package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ProductionVariant {
  public fun acceleratorType(): AcceleratorType? =
      unwrap(this).getAcceleratorType()?.let(AcceleratorType::wrap)

  public fun initialInstanceCount(): Number? = unwrap(this).getInitialInstanceCount()

  public fun initialVariantWeight(): Number? = unwrap(this).getInitialVariantWeight()

  public fun instanceType(): InstanceType

  public fun modelName(): String

  public fun variantName(): String

  public interface Builder {
    public fun acceleratorType(acceleratorType: AcceleratorType) {
    }

    public fun initialInstanceCount(initialInstanceCount: Number) {
    }

    public fun initialVariantWeight(initialVariantWeight: Number) {
    }

    public fun instanceType(instanceType: InstanceType) {
    }

    public fun modelName(modelName: String) {
    }

    public fun variantName(variantName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant.builder()

    public override fun acceleratorType(acceleratorType: AcceleratorType) {
      cdkBuilder.acceleratorType(acceleratorType.let(AcceleratorType::unwrap))
    }

    public override fun initialInstanceCount(initialInstanceCount: Number) {
      cdkBuilder.initialInstanceCount(initialInstanceCount)
    }

    public override fun initialVariantWeight(initialVariantWeight: Number) {
      cdkBuilder.initialVariantWeight(initialVariantWeight)
    }

    public override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    public override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    public override fun variantName(variantName: String) {
      cdkBuilder.variantName(variantName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant,
  ) : ProductionVariant {
    public override fun acceleratorType(): AcceleratorType? =
        unwrap(this).getAcceleratorType()?.let(AcceleratorType::wrap)

    public override fun initialInstanceCount(): Number? = unwrap(this).getInitialInstanceCount()

    public override fun initialVariantWeight(): Number? = unwrap(this).getInitialVariantWeight()

    public override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    public override fun modelName(): String = unwrap(this).getModelName()

    public override fun variantName(): String = unwrap(this).getVariantName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ProductionVariant {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant):
        ProductionVariant = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProductionVariant):
        software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant = (wrapped as
        Wrapper).cdkObject
  }
}
