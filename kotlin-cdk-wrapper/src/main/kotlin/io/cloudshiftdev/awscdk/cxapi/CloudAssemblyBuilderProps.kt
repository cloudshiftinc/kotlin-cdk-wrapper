@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CloudAssemblyBuilderProps {
  public fun assetOutdir(): String? = unwrap(this).getAssetOutdir()

  public fun parentBuilder(): CloudAssemblyBuilder? =
      unwrap(this).getParentBuilder()?.let(CloudAssemblyBuilder::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun assetOutdir(assetOutdir: String)

    public fun parentBuilder(parentBuilder: CloudAssemblyBuilder)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps.Builder =
        software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps.builder()

    override fun assetOutdir(assetOutdir: String) {
      cdkBuilder.assetOutdir(assetOutdir)
    }

    override fun parentBuilder(parentBuilder: CloudAssemblyBuilder) {
      cdkBuilder.parentBuilder(parentBuilder.let(CloudAssemblyBuilder::unwrap))
    }

    public fun build(): software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps,
  ) : CdkObject(cdkObject), CloudAssemblyBuilderProps {
    override fun assetOutdir(): String? = unwrap(this).getAssetOutdir()

    override fun parentBuilder(): CloudAssemblyBuilder? =
        unwrap(this).getParentBuilder()?.let(CloudAssemblyBuilder::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudAssemblyBuilderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps):
        CloudAssemblyBuilderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudAssemblyBuilderProps):
        software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps
  }
}
