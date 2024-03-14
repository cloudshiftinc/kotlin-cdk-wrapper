package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface BetweenCondition {
  /**
   * The start value.
   */
  public fun start(): Number

  /**
   * The stop value.
   */
  public fun stop(): Number

  /**
   * A builder for [BetweenCondition]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param start The start value. 
     */
    public fun start(start: Number)

    /**
     * @param stop The stop value. 
     */
    public fun stop(stop: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.BetweenCondition.Builder =
        software.amazon.awscdk.services.sns.BetweenCondition.builder()

    /**
     * @param start The start value. 
     */
    override fun start(start: Number) {
      cdkBuilder.start(start)
    }

    /**
     * @param stop The stop value. 
     */
    override fun stop(stop: Number) {
      cdkBuilder.stop(stop)
    }

    public fun build(): software.amazon.awscdk.services.sns.BetweenCondition = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.BetweenCondition,
  ) : CdkObject(cdkObject), BetweenCondition {
    /**
     * The start value.
     */
    override fun start(): Number = unwrap(this).getStart()

    /**
     * The stop value.
     */
    override fun stop(): Number = unwrap(this).getStop()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BetweenCondition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.BetweenCondition):
        BetweenCondition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BetweenCondition):
        software.amazon.awscdk.services.sns.BetweenCondition = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sns.BetweenCondition
  }
}
