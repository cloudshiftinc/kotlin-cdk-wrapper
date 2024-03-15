@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class StackSynthesizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.StackSynthesizer,
) : CdkObject(cdkObject), IStackSynthesizer {
  public override fun addDockerImageAsset(arg0: DockerImageAssetSource): DockerImageAssetLocation =
      unwrap(this).addDockerImageAsset(arg0.let(DockerImageAssetSource::unwrap)).let(DockerImageAssetLocation::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e85405255a4559d9d101644bfe36735011455aae5a7b2c0ff140d999863ded")
  public override fun addDockerImageAsset(arg0: DockerImageAssetSource.Builder.() -> Unit):
      DockerImageAssetLocation = addDockerImageAsset(DockerImageAssetSource(arg0))

  public override fun addFileAsset(arg0: FileAssetSource): FileAssetLocation =
      unwrap(this).addFileAsset(arg0.let(FileAssetSource::unwrap)).let(FileAssetLocation::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
  public override fun addFileAsset(arg0: FileAssetSource.Builder.() -> Unit): FileAssetLocation =
      addFileAsset(FileAssetSource(arg0))

  public override fun bind(stack: Stack) {
    unwrap(this).bind(stack.let(Stack::unwrap))
  }

  public override fun bootstrapQualifier(): String? = unwrap(this).getBootstrapQualifier()

  public override fun lookupRole(): String? = unwrap(this).getLookupRole()

  public override fun synthesize(arg0: ISynthesisSession) {
    unwrap(this).synthesize(arg0.let(ISynthesisSession::unwrap))
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.StackSynthesizer,
  ) : StackSynthesizer(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.StackSynthesizer): StackSynthesizer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackSynthesizer): software.amazon.awscdk.StackSynthesizer =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.StackSynthesizer
  }
}
