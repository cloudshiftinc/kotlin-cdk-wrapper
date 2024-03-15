@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IReusableStackSynthesizer : IStackSynthesizer {
  public fun reusableBind(arg0: Stack): IBoundStackSynthesizer

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IReusableStackSynthesizer,
  ) : CdkObject(cdkObject), IReusableStackSynthesizer {
    override fun addDockerImageAsset(arg0: DockerImageAssetSource): DockerImageAssetLocation =
        unwrap(this).addDockerImageAsset(arg0.let(DockerImageAssetSource::unwrap)).let(DockerImageAssetLocation::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60e85405255a4559d9d101644bfe36735011455aae5a7b2c0ff140d999863ded")
    override fun addDockerImageAsset(arg0: DockerImageAssetSource.Builder.() -> Unit):
        DockerImageAssetLocation = addDockerImageAsset(DockerImageAssetSource(arg0))

    override fun addFileAsset(arg0: FileAssetSource): FileAssetLocation =
        unwrap(this).addFileAsset(arg0.let(FileAssetSource::unwrap)).let(FileAssetLocation::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
    override fun addFileAsset(arg0: FileAssetSource.Builder.() -> Unit): FileAssetLocation =
        addFileAsset(FileAssetSource(arg0))

    override fun bind(arg0: Stack) {
      unwrap(this).bind(arg0.let(Stack::unwrap))
    }

    override fun bootstrapQualifier(): String? = unwrap(this).getBootstrapQualifier()

    override fun lookupRole(): String? = unwrap(this).getLookupRole()

    override fun reusableBind(arg0: Stack): IBoundStackSynthesizer =
        unwrap(this).reusableBind(arg0.let(Stack::unwrap)).let(IBoundStackSynthesizer::wrap)

    override fun synthesize(arg0: ISynthesisSession) {
      unwrap(this).synthesize(arg0.let(ISynthesisSession::unwrap))
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IReusableStackSynthesizer):
        IReusableStackSynthesizer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IReusableStackSynthesizer):
        software.amazon.awscdk.IReusableStackSynthesizer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IReusableStackSynthesizer
  }
}
