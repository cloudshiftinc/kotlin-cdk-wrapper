@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface WithoutPolicyUpdatesOptions {
  public fun addGrantsToResources(): Boolean? = unwrap(this).getAddGrantsToResources()

  @CdkDslMarker
  public interface Builder {
    public fun addGrantsToResources(addGrantsToResources: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions.Builder
        = software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions.builder()

    override fun addGrantsToResources(addGrantsToResources: Boolean) {
      cdkBuilder.addGrantsToResources(addGrantsToResources)
    }

    public fun build(): software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions,
  ) : CdkObject(cdkObject), WithoutPolicyUpdatesOptions {
    override fun addGrantsToResources(): Boolean? = unwrap(this).getAddGrantsToResources()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WithoutPolicyUpdatesOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions):
        WithoutPolicyUpdatesOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WithoutPolicyUpdatesOptions):
        software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions
  }
}
