@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Configuration for a shuffle option for input data in a channel.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * ShuffleConfig shuffleConfig = ShuffleConfig.builder()
 * .seed(123)
 * .build();
 * ```
 */
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig,
  ) : CdkObject(cdkObject), ShuffleConfig {
    /**
     * Determines the shuffling order.
     */
    override fun seed(): Number = unwrap(this).getSeed()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ShuffleConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig):
        ShuffleConfig = CdkObjectWrappers.wrap(cdkObject) as? ShuffleConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ShuffleConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig
  }
}
