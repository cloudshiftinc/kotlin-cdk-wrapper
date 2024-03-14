package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IStackSynthesizer {
  public fun addDockerImageAsset(arg0: DockerImageAssetSource): DockerImageAssetLocation

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e85405255a4559d9d101644bfe36735011455aae5a7b2c0ff140d999863ded")
  public fun addDockerImageAsset(arg0: DockerImageAssetSource.Builder.() -> Unit):
      DockerImageAssetLocation

  public fun addFileAsset(arg0: FileAssetSource): FileAssetLocation

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
  public fun addFileAsset(arg0: FileAssetSource.Builder.() -> Unit): FileAssetLocation

  public fun bind(arg0: Stack)

  public fun bootstrapQualifier(): String? = unwrap(this).getBootstrapQualifier()

  public fun lookupRole(): String? = unwrap(this).getLookupRole()

  public fun synthesize(arg0: ISynthesisSession)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.IStackSynthesizer,
  ) : IStackSynthesizer {
    override fun addDockerImageAsset(arg0: DockerImageAssetSource): DockerImageAssetLocation =
        unwrap(this).addDockerImageAsset(arg0.let(DockerImageAssetSource::unwrap)).let(DockerImageAssetLocation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60e85405255a4559d9d101644bfe36735011455aae5a7b2c0ff140d999863ded")
    override fun addDockerImageAsset(arg0: DockerImageAssetSource.Builder.() -> Unit):
        DockerImageAssetLocation = addDockerImageAsset(DockerImageAssetSource(arg0))

    override fun addFileAsset(arg0: FileAssetSource): FileAssetLocation =
        unwrap(this).addFileAsset(arg0.let(FileAssetSource::unwrap)).let(FileAssetLocation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
    override fun addFileAsset(arg0: FileAssetSource.Builder.() -> Unit): FileAssetLocation =
        addFileAsset(FileAssetSource(arg0))

    override fun bind(arg0: Stack) {
      unwrap(this).bind(arg0.let(Stack::unwrap))
    }

    override fun bootstrapQualifier(): String? = unwrap(this).getBootstrapQualifier()

    override fun lookupRole(): String? = unwrap(this).getLookupRole()

    override fun synthesize(arg0: ISynthesisSession) {
      unwrap(this).synthesize(arg0.let(ISynthesisSession::unwrap))
    }
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.IStackSynthesizer): IStackSynthesizer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStackSynthesizer): software.amazon.awscdk.IStackSynthesizer =
        (wrapped as Wrapper).cdkObject
  }
}
