@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface EnvironmentOptions {
  public fun removeInEdge(): Boolean? = unwrap(this).getRemoveInEdge()

  @CdkDslMarker
  public interface Builder {
    public fun removeInEdge(removeInEdge: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EnvironmentOptions.Builder =
        software.amazon.awscdk.services.lambda.EnvironmentOptions.builder()

    override fun removeInEdge(removeInEdge: Boolean) {
      cdkBuilder.removeInEdge(removeInEdge)
    }

    public fun build(): software.amazon.awscdk.services.lambda.EnvironmentOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.EnvironmentOptions,
  ) : CdkObject(cdkObject), EnvironmentOptions {
    override fun removeInEdge(): Boolean? = unwrap(this).getRemoveInEdge()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EnvironmentOptions):
        EnvironmentOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentOptions):
        software.amazon.awscdk.services.lambda.EnvironmentOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.EnvironmentOptions
  }
}
