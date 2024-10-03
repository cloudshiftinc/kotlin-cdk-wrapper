@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for `S3Artifacts`.
 *
 * Example:
 *
 * ```
 * Bucket bucket;
 * Project project = Project.Builder.create(this, "MyProject")
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2")))
 * .artifacts(Artifacts.s3(S3ArtifactsProps.builder()
 * .bucket(bucket)
 * .includeBuildId(false)
 * .packageZip(true)
 * .path("another/path")
 * .identifier("AddArtifact1")
 * .build()))
 * .build();
 * ```
 */
public interface S3ArtifactsProps : ArtifactsProps {
  /**
   * The name of the output bucket.
   */
  public fun bucket(): IBucket

  /**
   * If this is false, build output will not be encrypted.
   *
   * This is useful if the artifact to publish a static website or sharing content with others
   *
   * Default: true - output will be encrypted
   */
  public fun encryption(): Boolean? = unwrap(this).getEncryption()

  /**
   * Indicates if the build ID should be included in the path.
   *
   * If this is set to true,
   * then the build artifact will be stored in "<path>/<build-id>/<name>".
   *
   * Default: true
   */
  public fun includeBuildId(): Boolean? = unwrap(this).getIncludeBuildId()

  /**
   * The name of the build output ZIP file or folder inside the bucket.
   *
   * The full S3 object key will be "<path>/<build-id>/<name>" or
   * "<path>/<name>" depending on whether `includeBuildId` is set to true.
   *
   * If not set, `overrideArtifactName` will be set and the name from the
   * buildspec will be used instead.
   *
   * Default: undefined, and use the name from the buildspec
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * If this is true, all build output will be packaged into a single .zip file. Otherwise, all
   * files will be uploaded to <path>/<name>.
   *
   * Default: true - files will be archived
   */
  public fun packageZip(): Boolean? = unwrap(this).getPackageZip()

  /**
   * The path inside of the bucket for the build output .zip file or folder. If a value is not
   * specified, then build output will be stored at the root of the bucket (or under the <build-id>
   * directory if `includeBuildId` is set to true).
   *
   * Default: the root of the bucket
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * A builder for [S3ArtifactsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The name of the output bucket. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param encryption If this is false, build output will not be encrypted.
     * This is useful if the artifact to publish a static website or sharing content with others
     */
    public fun encryption(encryption: Boolean)

    /**
     * @param identifier The artifact identifier.
     * This property is required on secondary artifacts.
     */
    public fun identifier(identifier: String)

    /**
     * @param includeBuildId Indicates if the build ID should be included in the path.
     * If this is set to true,
     * then the build artifact will be stored in "<path>/<build-id>/<name>".
     */
    public fun includeBuildId(includeBuildId: Boolean)

    /**
     * @param name The name of the build output ZIP file or folder inside the bucket.
     * The full S3 object key will be "<path>/<build-id>/<name>" or
     * "<path>/<name>" depending on whether `includeBuildId` is set to true.
     *
     * If not set, `overrideArtifactName` will be set and the name from the
     * buildspec will be used instead.
     */
    public fun name(name: String)

    /**
     * @param packageZip If this is true, all build output will be packaged into a single .zip file.
     * Otherwise, all files will be uploaded to <path>/<name>.
     */
    public fun packageZip(packageZip: Boolean)

    /**
     * @param path The path inside of the bucket for the build output .zip file or folder. If a
     * value is not specified, then build output will be stored at the root of the bucket (or under the
     * <build-id> directory if `includeBuildId` is set to true).
     */
    public fun path(path: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.S3ArtifactsProps.Builder =
        software.amazon.awscdk.services.codebuild.S3ArtifactsProps.builder()

    /**
     * @param bucket The name of the output bucket. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param encryption If this is false, build output will not be encrypted.
     * This is useful if the artifact to publish a static website or sharing content with others
     */
    override fun encryption(encryption: Boolean) {
      cdkBuilder.encryption(encryption)
    }

    /**
     * @param identifier The artifact identifier.
     * This property is required on secondary artifacts.
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    /**
     * @param includeBuildId Indicates if the build ID should be included in the path.
     * If this is set to true,
     * then the build artifact will be stored in "<path>/<build-id>/<name>".
     */
    override fun includeBuildId(includeBuildId: Boolean) {
      cdkBuilder.includeBuildId(includeBuildId)
    }

    /**
     * @param name The name of the build output ZIP file or folder inside the bucket.
     * The full S3 object key will be "<path>/<build-id>/<name>" or
     * "<path>/<name>" depending on whether `includeBuildId` is set to true.
     *
     * If not set, `overrideArtifactName` will be set and the name from the
     * buildspec will be used instead.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param packageZip If this is true, all build output will be packaged into a single .zip file.
     * Otherwise, all files will be uploaded to <path>/<name>.
     */
    override fun packageZip(packageZip: Boolean) {
      cdkBuilder.packageZip(packageZip)
    }

    /**
     * @param path The path inside of the bucket for the build output .zip file or folder. If a
     * value is not specified, then build output will be stored at the root of the bucket (or under the
     * <build-id> directory if `includeBuildId` is set to true).
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.S3ArtifactsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.S3ArtifactsProps,
  ) : CdkObject(cdkObject),
      S3ArtifactsProps {
    /**
     * The name of the output bucket.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * If this is false, build output will not be encrypted.
     *
     * This is useful if the artifact to publish a static website or sharing content with others
     *
     * Default: true - output will be encrypted
     */
    override fun encryption(): Boolean? = unwrap(this).getEncryption()

    /**
     * The artifact identifier.
     *
     * This property is required on secondary artifacts.
     */
    override fun identifier(): String? = unwrap(this).getIdentifier()

    /**
     * Indicates if the build ID should be included in the path.
     *
     * If this is set to true,
     * then the build artifact will be stored in "<path>/<build-id>/<name>".
     *
     * Default: true
     */
    override fun includeBuildId(): Boolean? = unwrap(this).getIncludeBuildId()

    /**
     * The name of the build output ZIP file or folder inside the bucket.
     *
     * The full S3 object key will be "<path>/<build-id>/<name>" or
     * "<path>/<name>" depending on whether `includeBuildId` is set to true.
     *
     * If not set, `overrideArtifactName` will be set and the name from the
     * buildspec will be used instead.
     *
     * Default: undefined, and use the name from the buildspec
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * If this is true, all build output will be packaged into a single .zip file. Otherwise, all
     * files will be uploaded to <path>/<name>.
     *
     * Default: true - files will be archived
     */
    override fun packageZip(): Boolean? = unwrap(this).getPackageZip()

    /**
     * The path inside of the bucket for the build output .zip file or folder. If a value is not
     * specified, then build output will be stored at the root of the bucket (or under the <build-id>
     * directory if `includeBuildId` is set to true).
     *
     * Default: the root of the bucket
     */
    override fun path(): String? = unwrap(this).getPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3ArtifactsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.S3ArtifactsProps):
        S3ArtifactsProps = CdkObjectWrappers.wrap(cdkObject) as? S3ArtifactsProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3ArtifactsProps):
        software.amazon.awscdk.services.codebuild.S3ArtifactsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.S3ArtifactsProps
  }
}
