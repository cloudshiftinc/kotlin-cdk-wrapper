package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface ShuffleConfig {
  /**
   * Determines the shuffling order.
   */
  public fun seed(): Number

  /**
   * A builder for [ShuffleConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param seed Determines the shuffling order. 
     */
    public fun seed(seed: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig.builder()

    /**
     * @param seed Determines the shuffling order. 
     */
    override fun seed(seed: Number) {
      cdkBuilder.seed(seed)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig,
  ) : ShuffleConfig {
    /**
     * Determines the shuffling order.
     */
    override fun seed(): Number = unwrap(this).getSeed()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ShuffleConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig):
        ShuffleConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ShuffleConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig = (wrapped as
        Wrapper).cdkObject
  }
}
