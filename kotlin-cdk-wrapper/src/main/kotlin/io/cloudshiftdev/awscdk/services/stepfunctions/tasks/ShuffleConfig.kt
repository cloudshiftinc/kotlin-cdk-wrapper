@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface ShuffleConfig {
  public fun seed(): Number

  @CdkDslMarker
  public interface Builder {
    public fun seed(seed: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig.builder()

    override fun seed(seed: Number) {
      cdkBuilder.seed(seed)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig,
  ) : CdkObject(cdkObject), ShuffleConfig {
    override fun seed(): Number = unwrap(this).getSeed()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ShuffleConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig):
        ShuffleConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ShuffleConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig
  }
}
