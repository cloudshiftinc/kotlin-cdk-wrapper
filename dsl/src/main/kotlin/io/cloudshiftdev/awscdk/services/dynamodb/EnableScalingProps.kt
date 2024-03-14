package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface EnableScalingProps {
  /**
   * Maximum capacity to scale to.
   */
  public fun maxCapacity(): Number

  /**
   * Minimum capacity to scale to.
   */
  public fun minCapacity(): Number

  /**
   * A builder for [EnableScalingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxCapacity Maximum capacity to scale to. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param minCapacity Minimum capacity to scale to. 
     */
    public fun minCapacity(minCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.EnableScalingProps.Builder =
        software.amazon.awscdk.services.dynamodb.EnableScalingProps.builder()

    /**
     * @param maxCapacity Maximum capacity to scale to. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity Minimum capacity to scale to. 
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.EnableScalingProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.EnableScalingProps,
  ) : EnableScalingProps {
    /**
     * Maximum capacity to scale to.
     */
    override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    /**
     * Minimum capacity to scale to.
     */
    override fun minCapacity(): Number = unwrap(this).getMinCapacity()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EnableScalingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.EnableScalingProps):
        EnableScalingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnableScalingProps):
        software.amazon.awscdk.services.dynamodb.EnableScalingProps = (wrapped as Wrapper).cdkObject
  }
}
