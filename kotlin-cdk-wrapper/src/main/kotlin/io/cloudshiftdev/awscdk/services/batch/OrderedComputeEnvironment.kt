@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Assigns an order to a ComputeEnvironment.
 *
 * The JobQueue will prioritize the lowest-order ComputeEnvironment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * IComputeEnvironment computeEnvironment;
 * OrderedComputeEnvironment orderedComputeEnvironment = OrderedComputeEnvironment.builder()
 * .computeEnvironment(computeEnvironment)
 * .order(123)
 * .build();
 * ```
 */
public interface OrderedComputeEnvironment {
  /**
   * The ComputeEnvironment to link to this JobQueue.
   */
  public fun computeEnvironment(): IComputeEnvironment

  /**
   * The order associated with `computeEnvironment`.
   */
  public fun order(): Number

  /**
   * A builder for [OrderedComputeEnvironment]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param computeEnvironment The ComputeEnvironment to link to this JobQueue. 
     */
    public fun computeEnvironment(computeEnvironment: IComputeEnvironment)

    /**
     * @param order The order associated with `computeEnvironment`. 
     */
    public fun order(order: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.OrderedComputeEnvironment.Builder
        = software.amazon.awscdk.services.batch.OrderedComputeEnvironment.builder()

    /**
     * @param computeEnvironment The ComputeEnvironment to link to this JobQueue. 
     */
    override fun computeEnvironment(computeEnvironment: IComputeEnvironment) {
      cdkBuilder.computeEnvironment(computeEnvironment.let(IComputeEnvironment::unwrap))
    }

    /**
     * @param order The order associated with `computeEnvironment`. 
     */
    override fun order(order: Number) {
      cdkBuilder.order(order)
    }

    public fun build(): software.amazon.awscdk.services.batch.OrderedComputeEnvironment =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.OrderedComputeEnvironment,
  ) : CdkObject(cdkObject), OrderedComputeEnvironment {
    /**
     * The ComputeEnvironment to link to this JobQueue.
     */
    override fun computeEnvironment(): IComputeEnvironment =
        unwrap(this).getComputeEnvironment().let(IComputeEnvironment::wrap)

    /**
     * The order associated with `computeEnvironment`.
     */
    override fun order(): Number = unwrap(this).getOrder()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OrderedComputeEnvironment {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.OrderedComputeEnvironment):
        OrderedComputeEnvironment = CdkObjectWrappers.wrap(cdkObject) as? OrderedComputeEnvironment
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: OrderedComputeEnvironment):
        software.amazon.awscdk.services.batch.OrderedComputeEnvironment = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.OrderedComputeEnvironment
  }
}
