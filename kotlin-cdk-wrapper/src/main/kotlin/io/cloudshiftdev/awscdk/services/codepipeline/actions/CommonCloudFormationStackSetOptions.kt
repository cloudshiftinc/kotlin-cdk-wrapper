@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CommonCloudFormationStackSetOptions {
  public fun failureTolerancePercentage(): Number? = unwrap(this).getFailureTolerancePercentage()

  public fun maxAccountConcurrencyPercentage(): Number? =
      unwrap(this).getMaxAccountConcurrencyPercentage()

  public fun stackSetRegion(): String? = unwrap(this).getStackSetRegion()

  @CdkDslMarker
  public interface Builder {
    public fun failureTolerancePercentage(failureTolerancePercentage: Number)

    public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number)

    public fun stackSetRegion(stackSetRegion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions.builder()

    override fun failureTolerancePercentage(failureTolerancePercentage: Number) {
      cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
    }

    override fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
      cdkBuilder.maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage)
    }

    override fun stackSetRegion(stackSetRegion: String) {
      cdkBuilder.stackSetRegion(stackSetRegion)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions,
  ) : CdkObject(cdkObject), CommonCloudFormationStackSetOptions {
    override fun failureTolerancePercentage(): Number? =
        unwrap(this).getFailureTolerancePercentage()

    override fun maxAccountConcurrencyPercentage(): Number? =
        unwrap(this).getMaxAccountConcurrencyPercentage()

    override fun stackSetRegion(): String? = unwrap(this).getStackSetRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CommonCloudFormationStackSetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions):
        CommonCloudFormationStackSetOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonCloudFormationStackSetOptions):
        software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions
  }
}
