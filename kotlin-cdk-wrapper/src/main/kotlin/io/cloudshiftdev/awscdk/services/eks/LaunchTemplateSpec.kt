@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface LaunchTemplateSpec {
  public fun id(): String

  public fun version(): String? = unwrap(this).getVersion()

  @CdkDslMarker
  public interface Builder {
    public fun id(id: String)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.LaunchTemplateSpec.Builder =
        software.amazon.awscdk.services.eks.LaunchTemplateSpec.builder()

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.eks.LaunchTemplateSpec = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.LaunchTemplateSpec,
  ) : CdkObject(cdkObject), LaunchTemplateSpec {
    override fun id(): String = unwrap(this).getId()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateSpec {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.LaunchTemplateSpec):
        LaunchTemplateSpec = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplateSpec):
        software.amazon.awscdk.services.eks.LaunchTemplateSpec = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.LaunchTemplateSpec
  }
}
