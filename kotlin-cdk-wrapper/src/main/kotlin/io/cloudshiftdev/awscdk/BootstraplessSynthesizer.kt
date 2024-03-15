@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class BootstraplessSynthesizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.BootstraplessSynthesizer,
) : DefaultStackSynthesizer(cdkObject) {
  public override fun addDockerImageAsset(_asset: DockerImageAssetSource): DockerImageAssetLocation
      =
      unwrap(this).addDockerImageAsset(_asset.let(DockerImageAssetSource::unwrap)).let(DockerImageAssetLocation::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e85405255a4559d9d101644bfe36735011455aae5a7b2c0ff140d999863ded")
  public override fun addDockerImageAsset(_asset: DockerImageAssetSource.Builder.() -> Unit):
      DockerImageAssetLocation = addDockerImageAsset(DockerImageAssetSource(_asset))

  public override fun addFileAsset(_asset: FileAssetSource): FileAssetLocation =
      unwrap(this).addFileAsset(_asset.let(FileAssetSource::unwrap)).let(FileAssetLocation::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
  public override fun addFileAsset(_asset: FileAssetSource.Builder.() -> Unit): FileAssetLocation =
      addFileAsset(FileAssetSource(_asset))

  public override fun synthesize(session: ISynthesisSession) {
    unwrap(this).synthesize(session.let(ISynthesisSession::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String)

    public fun deployRoleArn(deployRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.BootstraplessSynthesizer.Builder =
        software.amazon.awscdk.BootstraplessSynthesizer.Builder.create()

    override fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
      cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
    }

    override fun deployRoleArn(deployRoleArn: String) {
      cdkBuilder.deployRoleArn(deployRoleArn)
    }

    public fun build(): software.amazon.awscdk.BootstraplessSynthesizer = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BootstraplessSynthesizer {
      val builderImpl = BuilderImpl()
      return BootstraplessSynthesizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.BootstraplessSynthesizer):
        BootstraplessSynthesizer = BootstraplessSynthesizer(cdkObject)

    internal fun unwrap(wrapped: BootstraplessSynthesizer):
        software.amazon.awscdk.BootstraplessSynthesizer = wrapped.cdkObject
  }
}
