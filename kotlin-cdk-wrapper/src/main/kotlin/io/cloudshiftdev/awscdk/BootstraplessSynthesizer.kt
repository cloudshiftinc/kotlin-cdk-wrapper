@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Synthesizer that reuses bootstrap roles from a different region.
 *
 * A special synthesizer that behaves similarly to `DefaultStackSynthesizer`,
 * but doesn't require bootstrapping the environment it operates in. Instead,
 * it will re-use the Roles that were created for a different region (which
 * is possible because IAM is a global service).
 *
 * However, it will not assume asset buckets or repositories have been created,
 * and therefore does not support assets.
 *
 * The name is poorly chosen -- it does still require bootstrapping, it just
 * does not support assets.
 *
 * Used by the CodePipeline construct for the support stacks needed for
 * cross-region replication S3 buckets. App builders do not need to use this
 * synthesizer directly.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * BootstraplessSynthesizer bootstraplessSynthesizer = BootstraplessSynthesizer.Builder.create()
 * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
 * .deployRoleArn("deployRoleArn")
 * .build();
 * ```
 */
public open class BootstraplessSynthesizer(
  cdkObject: software.amazon.awscdk.BootstraplessSynthesizer,
) : DefaultStackSynthesizer(cdkObject) {
  public constructor() : this(software.amazon.awscdk.BootstraplessSynthesizer()
  )

  public constructor(props: BootstraplessSynthesizerProps) :
      this(software.amazon.awscdk.BootstraplessSynthesizer(props.let(BootstraplessSynthesizerProps.Companion::unwrap))
  )

  public constructor(props: BootstraplessSynthesizerProps.Builder.() -> Unit) :
      this(BootstraplessSynthesizerProps(props)
  )

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
   * @param _asset 
   */
  public override fun addDockerImageAsset(asset: DockerImageAssetSource): DockerImageAssetLocation =
      unwrap(this).addDockerImageAsset(asset.let(DockerImageAssetSource.Companion::unwrap)).let(DockerImageAssetLocation::wrap)

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
   * @param _asset 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
   * @param _asset 
   */
  public override fun addFileAsset(asset: FileAssetSource): FileAssetLocation =
      unwrap(this).addFileAsset(asset.let(FileAssetSource.Companion::unwrap)).let(FileAssetLocation::wrap)

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
   * @param _asset 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
  public override fun addFileAsset(asset: FileAssetSource.Builder.() -> Unit): FileAssetLocation =
      addFileAsset(FileAssetSource(asset))

  /**
   * Synthesize the associated stack to the session.
   *
   * @param session 
   */
  public override fun synthesize(session: ISynthesisSession) {
    unwrap(this).synthesize(session.let(ISynthesisSession.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.BootstraplessSynthesizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CFN execution Role ARN to use.
     *
     * Default: - No CloudFormation role (use CLI credentials)
     *
     * @param cloudFormationExecutionRoleArn The CFN execution Role ARN to use. 
     */
    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String)

    /**
     * The deploy Role ARN to use.
     *
     * Default: - No deploy role (use CLI credentials)
     *
     * @param deployRoleArn The deploy Role ARN to use. 
     */
    public fun deployRoleArn(deployRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.BootstraplessSynthesizer.Builder =
        software.amazon.awscdk.BootstraplessSynthesizer.Builder.create()

    /**
     * The CFN execution Role ARN to use.
     *
     * Default: - No CloudFormation role (use CLI credentials)
     *
     * @param cloudFormationExecutionRoleArn The CFN execution Role ARN to use. 
     */
    override fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
      cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
    }

    /**
     * The deploy Role ARN to use.
     *
     * Default: - No deploy role (use CLI credentials)
     *
     * @param deployRoleArn The deploy Role ARN to use. 
     */
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
        software.amazon.awscdk.BootstraplessSynthesizer = wrapped.cdkObject as
        software.amazon.awscdk.BootstraplessSynthesizer
  }
}
