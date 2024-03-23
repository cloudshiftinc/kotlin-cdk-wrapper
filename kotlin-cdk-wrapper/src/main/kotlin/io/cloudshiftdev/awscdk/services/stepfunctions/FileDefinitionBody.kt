@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.AssetHashType
import io.cloudshiftdev.awscdk.BundlingOptions
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * IChainable chainable;
 * DefinitionBody fileDefinitionBody = FileDefinitionBody.fromChainable(chainable);
 * ```
 */
public open class FileDefinitionBody(
  cdkObject: software.amazon.awscdk.services.stepfunctions.FileDefinitionBody,
) : DefinitionBody(cdkObject) {
  public constructor(path: String) :
      this(software.amazon.awscdk.services.stepfunctions.FileDefinitionBody(path)
  )

  public constructor(path: String, options: AssetOptions) :
      this(software.amazon.awscdk.services.stepfunctions.FileDefinitionBody(path,
      options.let(AssetOptions::unwrap))
  )

  public constructor(path: String, options: AssetOptions.Builder.() -> Unit) : this(path,
      AssetOptions(options)
  )

  /**
   * @param scope 
   * @param _sfnPrincipal 
   * @param _sfnProps 
   * @param _graph
   */
  public override fun bind(
    scope: Construct,
    sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps,
  ): DefinitionConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      sfnPrincipal.let(IPrincipal::unwrap),
      sfnProps.let(StateMachineProps::unwrap)).let(DefinitionConfig::wrap)

  /**
   * @param scope 
   * @param _sfnPrincipal 
   * @param _sfnProps 
   * @param _graph
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2dbd4d1e5f21bba5dd51d75253d432be0ee512a924449cbb7efb61b2d333163")
  public override fun bind(
    scope: Construct,
    sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps.Builder.() -> Unit,
  ): DefinitionConfig = bind(scope, sfnPrincipal, StateMachineProps(sfnProps))

  /**
   * @param scope 
   * @param _sfnPrincipal 
   * @param _sfnProps 
   * @param _graph
   */
  public override fun bind(
    scope: Construct,
    sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps,
    graph: StateGraph,
  ): DefinitionConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      sfnPrincipal.let(IPrincipal::unwrap), sfnProps.let(StateMachineProps::unwrap),
      graph.let(StateGraph::unwrap)).let(DefinitionConfig::wrap)

  /**
   *
   */
  public open fun path(): String = unwrap(this).getPath()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.FileDefinitionBody].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specify a custom hash for this asset.
     *
     * If `assetHashType` is set it must
     * be set to `AssetHashType.CUSTOM`. For consistency, this custom hash will
     * be SHA256 hashed and encoded as hex. The resulting hash will be the asset
     * hash.
     *
     * NOTE: the hash is used in order to identify a specific revision of the asset, and
     * used for optimizing and caching deployment activities related to this asset such as
     * packaging, uploading to Amazon S3, etc. If you chose to customize the hash, you will
     * need to make sure it is updated every time the asset changes, or otherwise it is
     * possible that some deployments will not be invalidated.
     *
     * Default: - based on `assetHashType`
     *
     * @param assetHash Specify a custom hash for this asset. 
     */
    public fun assetHash(assetHash: String)

    /**
     * Specifies the type of hash to calculate for this asset.
     *
     * If `assetHash` is configured, this option must be `undefined` or
     * `AssetHashType.CUSTOM`.
     *
     * Default: - the default is `AssetHashType.SOURCE`, but if `assetHash` is
     * explicitly specified this value defaults to `AssetHashType.CUSTOM`.
     *
     * @param assetHashType Specifies the type of hash to calculate for this asset. 
     */
    public fun assetHashType(assetHashType: AssetHashType)

    /**
     * Bundle the asset by executing a command in a Docker container or a custom bundling provider.
     *
     * The asset path will be mounted at `/asset-input`. The Docker
     * container is responsible for putting content at `/asset-output`.
     * The content at `/asset-output` will be zipped and used as the
     * final asset.
     *
     * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file,
     * archived into a .zip file and uploaded to S3 otherwise
     *
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     * bundling provider. 
     */
    public fun bundling(bundling: BundlingOptions)

    /**
     * Bundle the asset by executing a command in a Docker container or a custom bundling provider.
     *
     * The asset path will be mounted at `/asset-input`. The Docker
     * container is responsible for putting content at `/asset-output`.
     * The content at `/asset-output` will be zipped and used as the
     * final asset.
     *
     * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file,
     * archived into a .zip file and uploaded to S3 otherwise
     *
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     * bundling provider. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("625386c228742d36732516113386b44af2294e14e8626bf8d69b52efd5c84c74")
    public fun bundling(bundling: BundlingOptions.Builder.() -> Unit)

    /**
     * Whether or not the asset needs to exist beyond deployment time;
     *
     * i.e.
     * are copied over to a different location and not needed afterwards.
     * Setting this property to true has an impact on the lifecycle of the asset,
     * because we will assume that it is safe to delete after the CloudFormation
     * deployment succeeds.
     *
     * For example, Lambda Function assets are copied over to Lambda during
     * deployment. Therefore, it is not necessary to store the asset in S3, so
     * we consider those deployTime assets.
     *
     * Default: false
     *
     * @param deployTime Whether or not the asset needs to exist beyond deployment time;. 
     */
    public fun deployTime(deployTime: Boolean)

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     *
     * Default: - nothing is excluded
     *
     * @param exclude File paths matching the patterns will be excluded. 
     */
    public fun exclude(exclude: List<String>)

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     *
     * Default: - nothing is excluded
     *
     * @param exclude File paths matching the patterns will be excluded. 
     */
    public fun exclude(vararg exclude: String)

    /**
     * A strategy for how to handle symlinks.
     *
     * Default: SymlinkFollowMode.NEVER
     *
     * @param followSymlinks A strategy for how to handle symlinks. 
     */
    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    /**
     * The ignore behavior to use for `exclude` patterns.
     *
     * Default: IgnoreMode.GLOB
     *
     * @param ignoreMode The ignore behavior to use for `exclude` patterns. 
     */
    public fun ignoreMode(ignoreMode: IgnoreMode)

    /**
     * A list of principals that should be able to read this asset from S3.
     *
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     *
     * Default: - No principals that can read file asset.
     *
     * @param readers A list of principals that should be able to read this asset from S3. 
     */
    public fun readers(readers: List<IGrantable>)

    /**
     * A list of principals that should be able to read this asset from S3.
     *
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     *
     * Default: - No principals that can read file asset.
     *
     * @param readers A list of principals that should be able to read this asset from S3. 
     */
    public fun readers(vararg readers: IGrantable)
  }

  private class BuilderImpl(
    path: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.FileDefinitionBody.Builder
        = software.amazon.awscdk.services.stepfunctions.FileDefinitionBody.Builder.create(path)

    /**
     * Specify a custom hash for this asset.
     *
     * If `assetHashType` is set it must
     * be set to `AssetHashType.CUSTOM`. For consistency, this custom hash will
     * be SHA256 hashed and encoded as hex. The resulting hash will be the asset
     * hash.
     *
     * NOTE: the hash is used in order to identify a specific revision of the asset, and
     * used for optimizing and caching deployment activities related to this asset such as
     * packaging, uploading to Amazon S3, etc. If you chose to customize the hash, you will
     * need to make sure it is updated every time the asset changes, or otherwise it is
     * possible that some deployments will not be invalidated.
     *
     * Default: - based on `assetHashType`
     *
     * @param assetHash Specify a custom hash for this asset. 
     */
    override fun assetHash(assetHash: String) {
      cdkBuilder.assetHash(assetHash)
    }

    /**
     * Specifies the type of hash to calculate for this asset.
     *
     * If `assetHash` is configured, this option must be `undefined` or
     * `AssetHashType.CUSTOM`.
     *
     * Default: - the default is `AssetHashType.SOURCE`, but if `assetHash` is
     * explicitly specified this value defaults to `AssetHashType.CUSTOM`.
     *
     * @param assetHashType Specifies the type of hash to calculate for this asset. 
     */
    override fun assetHashType(assetHashType: AssetHashType) {
      cdkBuilder.assetHashType(assetHashType.let(AssetHashType::unwrap))
    }

    /**
     * Bundle the asset by executing a command in a Docker container or a custom bundling provider.
     *
     * The asset path will be mounted at `/asset-input`. The Docker
     * container is responsible for putting content at `/asset-output`.
     * The content at `/asset-output` will be zipped and used as the
     * final asset.
     *
     * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file,
     * archived into a .zip file and uploaded to S3 otherwise
     *
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     * bundling provider. 
     */
    override fun bundling(bundling: BundlingOptions) {
      cdkBuilder.bundling(bundling.let(BundlingOptions::unwrap))
    }

    /**
     * Bundle the asset by executing a command in a Docker container or a custom bundling provider.
     *
     * The asset path will be mounted at `/asset-input`. The Docker
     * container is responsible for putting content at `/asset-output`.
     * The content at `/asset-output` will be zipped and used as the
     * final asset.
     *
     * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file,
     * archived into a .zip file and uploaded to S3 otherwise
     *
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     * bundling provider. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("625386c228742d36732516113386b44af2294e14e8626bf8d69b52efd5c84c74")
    override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
        bundling(BundlingOptions(bundling))

    /**
     * Whether or not the asset needs to exist beyond deployment time;
     *
     * i.e.
     * are copied over to a different location and not needed afterwards.
     * Setting this property to true has an impact on the lifecycle of the asset,
     * because we will assume that it is safe to delete after the CloudFormation
     * deployment succeeds.
     *
     * For example, Lambda Function assets are copied over to Lambda during
     * deployment. Therefore, it is not necessary to store the asset in S3, so
     * we consider those deployTime assets.
     *
     * Default: false
     *
     * @param deployTime Whether or not the asset needs to exist beyond deployment time;. 
     */
    override fun deployTime(deployTime: Boolean) {
      cdkBuilder.deployTime(deployTime)
    }

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     *
     * Default: - nothing is excluded
     *
     * @param exclude File paths matching the patterns will be excluded. 
     */
    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     *
     * Default: - nothing is excluded
     *
     * @param exclude File paths matching the patterns will be excluded. 
     */
    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    /**
     * A strategy for how to handle symlinks.
     *
     * Default: SymlinkFollowMode.NEVER
     *
     * @param followSymlinks A strategy for how to handle symlinks. 
     */
    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    /**
     * The ignore behavior to use for `exclude` patterns.
     *
     * Default: IgnoreMode.GLOB
     *
     * @param ignoreMode The ignore behavior to use for `exclude` patterns. 
     */
    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    /**
     * A list of principals that should be able to read this asset from S3.
     *
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     *
     * Default: - No principals that can read file asset.
     *
     * @param readers A list of principals that should be able to read this asset from S3. 
     */
    override fun readers(readers: List<IGrantable>) {
      cdkBuilder.readers(readers.map(IGrantable::unwrap))
    }

    /**
     * A list of principals that should be able to read this asset from S3.
     *
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     *
     * Default: - No principals that can read file asset.
     *
     * @param readers A list of principals that should be able to read this asset from S3. 
     */
    override fun readers(vararg readers: IGrantable): Unit = readers(readers.toList())

    public fun build(): software.amazon.awscdk.services.stepfunctions.FileDefinitionBody =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(path: String, block: Builder.() -> Unit = {}): FileDefinitionBody {
      val builderImpl = BuilderImpl(path)
      return FileDefinitionBody(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.FileDefinitionBody):
        FileDefinitionBody = FileDefinitionBody(cdkObject)

    internal fun unwrap(wrapped: FileDefinitionBody):
        software.amazon.awscdk.services.stepfunctions.FileDefinitionBody = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.FileDefinitionBody
  }
}
