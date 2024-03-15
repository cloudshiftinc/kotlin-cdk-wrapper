@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class CliCredentialsStackSynthesizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CliCredentialsStackSynthesizer,
) : StackSynthesizer(cdkObject), IReusableStackSynthesizer, IBoundStackSynthesizer {
  public override fun addDockerImageAsset(asset: DockerImageAssetSource): DockerImageAssetLocation =
      unwrap(this).addDockerImageAsset(asset.let(DockerImageAssetSource::unwrap)).let(DockerImageAssetLocation::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e85405255a4559d9d101644bfe36735011455aae5a7b2c0ff140d999863ded")
  public override fun addDockerImageAsset(asset: DockerImageAssetSource.Builder.() -> Unit):
      DockerImageAssetLocation = addDockerImageAsset(DockerImageAssetSource(asset))

  public override fun addFileAsset(asset: FileAssetSource): FileAssetLocation =
      unwrap(this).addFileAsset(asset.let(FileAssetSource::unwrap)).let(FileAssetLocation::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
  public override fun addFileAsset(asset: FileAssetSource.Builder.() -> Unit): FileAssetLocation =
      addFileAsset(FileAssetSource(asset))

  public override fun bind(stack: Stack) {
    unwrap(this).bind(stack.let(Stack::unwrap))
  }

  public override fun bootstrapQualifier(): String? = unwrap(this).getBootstrapQualifier()

  public override fun reusableBind(stack: Stack): IBoundStackSynthesizer =
      unwrap(this).reusableBind(stack.let(Stack::unwrap)).let(IBoundStackSynthesizer::wrap)

  public override fun synthesize(session: ISynthesisSession) {
    unwrap(this).synthesize(session.let(ISynthesisSession::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun bucketPrefix(bucketPrefix: String)

    public fun dockerTagPrefix(dockerTagPrefix: String)

    public fun fileAssetsBucketName(fileAssetsBucketName: String)

    public fun imageAssetsRepositoryName(imageAssetsRepositoryName: String)

    public fun qualifier(qualifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CliCredentialsStackSynthesizer.Builder =
        software.amazon.awscdk.CliCredentialsStackSynthesizer.Builder.create()

    override fun bucketPrefix(bucketPrefix: String) {
      cdkBuilder.bucketPrefix(bucketPrefix)
    }

    override fun dockerTagPrefix(dockerTagPrefix: String) {
      cdkBuilder.dockerTagPrefix(dockerTagPrefix)
    }

    override fun fileAssetsBucketName(fileAssetsBucketName: String) {
      cdkBuilder.fileAssetsBucketName(fileAssetsBucketName)
    }

    override fun imageAssetsRepositoryName(imageAssetsRepositoryName: String) {
      cdkBuilder.imageAssetsRepositoryName(imageAssetsRepositoryName)
    }

    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    public fun build(): software.amazon.awscdk.CliCredentialsStackSynthesizer = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CliCredentialsStackSynthesizer {
      val builderImpl = BuilderImpl()
      return CliCredentialsStackSynthesizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CliCredentialsStackSynthesizer):
        CliCredentialsStackSynthesizer = CliCredentialsStackSynthesizer(cdkObject)

    internal fun unwrap(wrapped: CliCredentialsStackSynthesizer):
        software.amazon.awscdk.CliCredentialsStackSynthesizer = wrapped.cdkObject
  }
}
