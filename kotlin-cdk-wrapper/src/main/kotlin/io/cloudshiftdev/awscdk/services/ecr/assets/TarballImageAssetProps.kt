@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface TarballImageAssetProps {
  public fun tarballFile(): String

  @CdkDslMarker
  public interface Builder {
    public fun tarballFile(tarballFile: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps.Builder =
        software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps.builder()

    override fun tarballFile(tarballFile: String) {
      cdkBuilder.tarballFile(tarballFile)
    }

    public fun build(): software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps,
  ) : CdkObject(cdkObject), TarballImageAssetProps {
    override fun tarballFile(): String = unwrap(this).getTarballFile()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TarballImageAssetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps):
        TarballImageAssetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TarballImageAssetProps):
        software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps
  }
}
