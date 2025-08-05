@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An asset that represents a Docker image.
 *
 * The image will loaded from an existing tarball and uploaded to an ECR repository.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecr.assets.TarballImageAsset;
 * TarballImageAsset asset = TarballImageAsset.Builder.create(this, "MyBuildImage")
 * .tarballFile("local-image.tar")
 * .build();
 * ```
 */
public open class TarballImageAsset(
  cdkObject: software.amazon.awscdk.services.ecr.assets.TarballImageAsset,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TarballImageAssetProps,
  ) :
      this(software.amazon.awscdk.services.ecr.assets.TarballImageAsset(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(TarballImageAssetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TarballImageAssetProps.Builder.() -> Unit,
  ) : this(scope, id, TarballImageAssetProps(props)
  )

  /**
   * A hash of this asset, which is available at construction time.
   *
   * As this is a plain string, it
   * can be used in construct IDs in order to enforce creation of a new resource when the content
   * hash has changed.
   */
  public open fun assetHash(): String = unwrap(this).getAssetHash()

  /**
   * The tag of this asset when it is uploaded to ECR.
   *
   * The tag may differ from the assetHash if a stack synthesizer adds a dockerTagPrefix.
   */
  public open fun imageTag(): String = unwrap(this).getImageTag()

  /**
   * The full URI of the image (including a tag).
   *
   * Use this reference to pull
   * the asset.
   */
  public open fun imageUri(): String = unwrap(this).getImageUri()

  /**
   * The full URI of the image (including a tag).
   *
   * Use this reference to pull
   * the asset.
   */
  public open fun imageUri(`value`: String) {
    unwrap(this).setImageUri(`value`)
  }

  /**
   * Repository where the image is stored.
   */
  public open fun repository(): IRepository = unwrap(this).getRepository().let(IRepository::wrap)

  /**
   * Repository where the image is stored.
   */
  public open fun repository(`value`: IRepository) {
    unwrap(this).setRepository(`value`.let(IRepository.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.assets.TarballImageAsset].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A display name for this asset.
     *
     * If supplied, the display name will be used in locations where the asset
     * identifier is printed, like in the CLI progress information. If the same
     * asset is added multiple times, the display name of the first occurrence is
     * used.
     *
     * The default is the construct path of the `TarballImageAsset` construct,
     * with respect to the enclosing stack. If the asset is produced by a
     * construct helper function (such as `lambda.Code.fromAssetImage()`), this
     * will look like `MyFunction/AssetImage`.
     *
     * We use the stack-relative construct path so that in the common case where
     * you have multiple stacks with the same asset, we won't show something like
     * `/MyBetaStack/MyFunction/Code` when you are actually deploying to
     * production.
     *
     * Default: - Stack-relative construct path
     *
     * @param displayName A display name for this asset. 
     */
    public fun displayName(displayName: String)

    /**
     * Absolute path to the tarball.
     *
     * It is recommended to to use the script running directory (e.g. `__dirname`
     * in Node.js projects or dirname of `__file__` in Python) if your tarball
     * is located as a resource inside your project.
     *
     * @param tarballFile Absolute path to the tarball. 
     */
    public fun tarballFile(tarballFile: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.assets.TarballImageAsset.Builder =
        software.amazon.awscdk.services.ecr.assets.TarballImageAsset.Builder.create(scope, id)

    /**
     * A display name for this asset.
     *
     * If supplied, the display name will be used in locations where the asset
     * identifier is printed, like in the CLI progress information. If the same
     * asset is added multiple times, the display name of the first occurrence is
     * used.
     *
     * The default is the construct path of the `TarballImageAsset` construct,
     * with respect to the enclosing stack. If the asset is produced by a
     * construct helper function (such as `lambda.Code.fromAssetImage()`), this
     * will look like `MyFunction/AssetImage`.
     *
     * We use the stack-relative construct path so that in the common case where
     * you have multiple stacks with the same asset, we won't show something like
     * `/MyBetaStack/MyFunction/Code` when you are actually deploying to
     * production.
     *
     * Default: - Stack-relative construct path
     *
     * @param displayName A display name for this asset. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * Absolute path to the tarball.
     *
     * It is recommended to to use the script running directory (e.g. `__dirname`
     * in Node.js projects or dirname of `__file__` in Python) if your tarball
     * is located as a resource inside your project.
     *
     * @param tarballFile Absolute path to the tarball. 
     */
    override fun tarballFile(tarballFile: String) {
      cdkBuilder.tarballFile(tarballFile)
    }

    public fun build(): software.amazon.awscdk.services.ecr.assets.TarballImageAsset =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): TarballImageAsset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return TarballImageAsset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.TarballImageAsset):
        TarballImageAsset = TarballImageAsset(cdkObject)

    internal fun unwrap(wrapped: TarballImageAsset):
        software.amazon.awscdk.services.ecr.assets.TarballImageAsset = wrapped.cdkObject as
        software.amazon.awscdk.services.ecr.assets.TarballImageAsset
  }
}
