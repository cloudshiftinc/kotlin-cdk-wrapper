package io.cloudshiftdev.awscdk.services.batch

import kotlin.Number
import kotlin.Unit

public interface OrderedComputeEnvironment {
  public fun computeEnvironment(): IComputeEnvironment

  public fun order(): Number

  public interface Builder {
    public fun computeEnvironment(computeEnvironment: IComputeEnvironment) {
    }

    public fun order(order: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.OrderedComputeEnvironment.Builder
        = software.amazon.awscdk.services.batch.OrderedComputeEnvironment.builder()

    public override fun computeEnvironment(computeEnvironment: IComputeEnvironment) {
      cdkBuilder.computeEnvironment(computeEnvironment.let(IComputeEnvironment::unwrap))
    }

    public override fun order(order: Number) {
      cdkBuilder.order(order)
    }

    public fun build(): software.amazon.awscdk.services.batch.OrderedComputeEnvironment =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.OrderedComputeEnvironment,
  ) : OrderedComputeEnvironment {
    public override fun computeEnvironment(): IComputeEnvironment =
        unwrap(this).getComputeEnvironment().let(IComputeEnvironment::wrap)

    public override fun order(): Number = unwrap(this).getOrder()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OrderedComputeEnvironment {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.OrderedComputeEnvironment):
        OrderedComputeEnvironment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OrderedComputeEnvironment):
        software.amazon.awscdk.services.batch.OrderedComputeEnvironment = (wrapped as
        Wrapper).cdkObject
  }
}
