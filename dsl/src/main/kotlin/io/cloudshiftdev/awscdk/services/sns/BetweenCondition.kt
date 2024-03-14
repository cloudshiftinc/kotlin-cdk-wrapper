package io.cloudshiftdev.awscdk.services.sns

import kotlin.Number
import kotlin.Unit

public interface BetweenCondition {
  public fun start(): Number

  public fun stop(): Number

  public interface Builder {
    public fun start(start: Number) {
    }

    public fun stop(stop: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.BetweenCondition.Builder =
        software.amazon.awscdk.services.sns.BetweenCondition.builder()

    public override fun start(start: Number) {
      cdkBuilder.start(start)
    }

    public override fun stop(stop: Number) {
      cdkBuilder.stop(stop)
    }

    public fun build(): software.amazon.awscdk.services.sns.BetweenCondition = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sns.BetweenCondition,
  ) : BetweenCondition {
    public override fun start(): Number = unwrap(this).getStart()

    public override fun stop(): Number = unwrap(this).getStop()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BetweenCondition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.BetweenCondition):
        BetweenCondition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BetweenCondition):
        software.amazon.awscdk.services.sns.BetweenCondition = (wrapped as Wrapper).cdkObject
  }
}
