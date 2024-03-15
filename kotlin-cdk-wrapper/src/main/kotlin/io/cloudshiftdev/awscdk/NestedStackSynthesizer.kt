@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class NestedStackSynthesizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.NestedStackSynthesizer,
) : StackSynthesizer(cdkObject) {
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

  public override fun bootstrapQualifier(): String? = unwrap(this).getBootstrapQualifier()

  public override fun lookupRole(): String? = unwrap(this).getLookupRole()

  public override fun synthesize(session: ISynthesisSession) {
    unwrap(this).synthesize(session.let(ISynthesisSession::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.NestedStackSynthesizer):
        NestedStackSynthesizer = NestedStackSynthesizer(cdkObject)

    internal fun unwrap(wrapped: NestedStackSynthesizer):
        software.amazon.awscdk.NestedStackSynthesizer = wrapped.cdkObject
  }
}
