@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.AssetHashType
import software.amazon.awscdk.AssetStaging
import software.amazon.awscdk.BundlingOptions
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode
import software.constructs.Construct

@CdkDslMarker
public class AssetStagingDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: AssetStaging.Builder = AssetStaging.Builder.create(scope, id)

  private val _exclude: MutableList<String> = mutableListOf()

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
  public fun assetHash(assetHash: String) {
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
  public fun assetHashType(assetHashType: AssetHashType) {
    cdkBuilder.assetHashType(assetHashType)
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
  public fun bundling(bundling: BundlingOptionsDsl.() -> Unit = {}) {
    val builder = BundlingOptionsDsl()
    builder.apply(bundling)
    cdkBuilder.bundling(builder.build())
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
  public fun bundling(bundling: BundlingOptions) {
    cdkBuilder.bundling(bundling)
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
  public fun exclude(vararg exclude: String) {
    _exclude.addAll(listOf(*exclude))
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
  public fun exclude(exclude: Collection<String>) {
    _exclude.addAll(exclude)
  }

  /**
   * Extra information to encode into the fingerprint (e.g. build instructions and other inputs).
   *
   * Default: - hash is only based on source content
   *
   * @param extraHash Extra information to encode into the fingerprint (e.g. build instructions and
   * other inputs). 
   */
  public fun extraHash(extraHash: String) {
    cdkBuilder.extraHash(extraHash)
  }

  /**
   * A strategy for how to handle symlinks.
   *
   * Default: SymlinkFollowMode.NEVER
   *
   * @param follow A strategy for how to handle symlinks. 
   */
  public fun follow(follow: SymlinkFollowMode) {
    cdkBuilder.follow(follow)
  }

  /**
   * The ignore behavior to use for `exclude` patterns.
   *
   * Default: IgnoreMode.GLOB
   *
   * @param ignoreMode The ignore behavior to use for `exclude` patterns. 
   */
  public fun ignoreMode(ignoreMode: IgnoreMode) {
    cdkBuilder.ignoreMode(ignoreMode)
  }

  /**
   * The source file or directory to copy from.
   *
   * @param sourcePath The source file or directory to copy from. 
   */
  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): AssetStaging {
    if(_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
    return cdkBuilder.build()
  }
}
