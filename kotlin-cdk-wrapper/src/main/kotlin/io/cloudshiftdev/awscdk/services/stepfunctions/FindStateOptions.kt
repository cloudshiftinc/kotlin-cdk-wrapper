@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface FindStateOptions {
  public fun includeErrorHandlers(): Boolean? = unwrap(this).getIncludeErrorHandlers()

  @CdkDslMarker
  public interface Builder {
    public fun includeErrorHandlers(includeErrorHandlers: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.FindStateOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.FindStateOptions.builder()

    override fun includeErrorHandlers(includeErrorHandlers: Boolean) {
      cdkBuilder.includeErrorHandlers(includeErrorHandlers)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.FindStateOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.FindStateOptions,
  ) : CdkObject(cdkObject), FindStateOptions {
    override fun includeErrorHandlers(): Boolean? = unwrap(this).getIncludeErrorHandlers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FindStateOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.FindStateOptions):
        FindStateOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FindStateOptions):
        software.amazon.awscdk.services.stepfunctions.FindStateOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.FindStateOptions
  }
}
