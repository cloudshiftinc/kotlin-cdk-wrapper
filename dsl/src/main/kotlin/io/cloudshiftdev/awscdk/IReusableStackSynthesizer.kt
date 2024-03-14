package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IReusableStackSynthesizer : IStackSynthesizer {
  public fun reusableBind(arg0: Stack): IBoundStackSynthesizer

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.IReusableStackSynthesizer,
  ) : IReusableStackSynthesizer {
    public override fun addDockerImageAsset(arg0: DockerImageAssetSource): DockerImageAssetLocation
        =
        unwrap(this).addDockerImageAsset(arg0.let(DockerImageAssetSource::unwrap)).let(DockerImageAssetLocation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60e85405255a4559d9d101644bfe36735011455aae5a7b2c0ff140d999863ded")
    public override fun addDockerImageAsset(arg0: DockerImageAssetSource.Builder.() -> Unit):
        DockerImageAssetLocation = addDockerImageAsset(DockerImageAssetSource(arg0))

    public override fun addFileAsset(arg0: FileAssetSource): FileAssetLocation =
        unwrap(this).addFileAsset(arg0.let(FileAssetSource::unwrap)).let(FileAssetLocation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
    public override fun addFileAsset(arg0: FileAssetSource.Builder.() -> Unit): FileAssetLocation =
        addFileAsset(FileAssetSource(arg0))

    public override fun bind(arg0: Stack) {
      unwrap(this).bind(arg0.let(Stack::unwrap))
    }

    public override fun bootstrapQualifier(): String? = unwrap(this).getBootstrapQualifier()

    public override fun lookupRole(): String? = unwrap(this).getLookupRole()

    public override fun reusableBind(arg0: Stack): IBoundStackSynthesizer =
        unwrap(this).reusableBind(arg0.let(Stack::unwrap)).let(IBoundStackSynthesizer::wrap)

    public override fun synthesize(arg0: ISynthesisSession) {
      unwrap(this).synthesize(arg0.let(ISynthesisSession::unwrap))
    }
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.IReusableStackSynthesizer):
        IReusableStackSynthesizer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IReusableStackSynthesizer):
        software.amazon.awscdk.IReusableStackSynthesizer = (wrapped as Wrapper).cdkObject
  }
}
