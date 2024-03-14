package io.cloudshiftdev.awscdk

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class LegacyStackSynthesizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.LegacyStackSynthesizer,
) : StackSynthesizer(cdkObject), IReusableStackSynthesizer, IBoundStackSynthesizer {
  /**
   * Register a Docker Image Asset.
   *
   * Returns the parameters that can be used to refer to the asset inside the template.
   *
   * The synthesizer must rely on some out-of-band mechanism to make sure the given files
   * are actually placed in the returned location before the deployment happens. This can
   * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
   * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
   * mechanism.
   *
   * @param asset 
   */
  public override fun addDockerImageAsset(asset: DockerImageAssetSource): DockerImageAssetLocation =
      unwrap(this).addDockerImageAsset(asset.let(DockerImageAssetSource::unwrap)).let(DockerImageAssetLocation::wrap)

  /**
   * Register a Docker Image Asset.
   *
   * Returns the parameters that can be used to refer to the asset inside the template.
   *
   * The synthesizer must rely on some out-of-band mechanism to make sure the given files
   * are actually placed in the returned location before the deployment happens. This can
   * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
   * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
   * mechanism.
   *
   * @param asset 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e85405255a4559d9d101644bfe36735011455aae5a7b2c0ff140d999863ded")
  public override fun addDockerImageAsset(asset: DockerImageAssetSource.Builder.() -> Unit):
      DockerImageAssetLocation = addDockerImageAsset(DockerImageAssetSource(asset))

  /**
   * Register a File Asset.
   *
   * Returns the parameters that can be used to refer to the asset inside the template.
   *
   * The synthesizer must rely on some out-of-band mechanism to make sure the given files
   * are actually placed in the returned location before the deployment happens. This can
   * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
   * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
   * mechanism.
   *
   * @param asset 
   */
  public override fun addFileAsset(asset: FileAssetSource): FileAssetLocation =
      unwrap(this).addFileAsset(asset.let(FileAssetSource::unwrap)).let(FileAssetLocation::wrap)

  /**
   * Register a File Asset.
   *
   * Returns the parameters that can be used to refer to the asset inside the template.
   *
   * The synthesizer must rely on some out-of-band mechanism to make sure the given files
   * are actually placed in the returned location before the deployment happens. This can
   * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
   * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
   * mechanism.
   *
   * @param asset 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
  public override fun addFileAsset(asset: FileAssetSource.Builder.() -> Unit): FileAssetLocation =
      addFileAsset(FileAssetSource(asset))

  /**
   * Produce a bound Stack Synthesizer for the given stack.
   *
   * This method may be called more than once on the same object.
   *
   * @param stack 
   */
  public override fun reusableBind(stack: Stack): IBoundStackSynthesizer =
      unwrap(this).reusableBind(stack.let(Stack::unwrap)).let(IBoundStackSynthesizer::wrap)

  /**
   * Synthesize the associated stack to the session.
   *
   * @param session 
   */
  public override fun synthesize(session: ISynthesisSession) {
    unwrap(this).synthesize(session.let(ISynthesisSession::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.LegacyStackSynthesizer):
        LegacyStackSynthesizer = LegacyStackSynthesizer(cdkObject)

    internal fun unwrap(wrapped: LegacyStackSynthesizer):
        software.amazon.awscdk.LegacyStackSynthesizer = wrapped.cdkObject
  }
}
