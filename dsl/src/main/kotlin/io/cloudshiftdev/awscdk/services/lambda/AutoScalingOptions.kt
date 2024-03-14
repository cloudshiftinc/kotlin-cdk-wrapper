package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface AutoScalingOptions {
  /**
   * Maximum capacity to scale to.
   */
  public fun maxCapacity(): Number

  /**
   * Minimum capacity to scale to.
   *
   * Default: 1
   */
  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  /**
   * A builder for [AutoScalingOptions]
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
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AutoScalingOptions.Builder =
        software.amazon.awscdk.services.lambda.AutoScalingOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.lambda.AutoScalingOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.AutoScalingOptions,
  ) : AutoScalingOptions {
    /**
     * Maximum capacity to scale to.
     */
    override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    /**
     * Minimum capacity to scale to.
     *
     * Default: 1
     */
    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AutoScalingOptions):
        AutoScalingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoScalingOptions):
        software.amazon.awscdk.services.lambda.AutoScalingOptions = (wrapped as Wrapper).cdkObject
  }
}
