@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for `S3Source`.
 *
 * Example:
 *
 * ```
 * Bucket bucket = new Bucket(this, "MyBucket");
 * Project.Builder.create(this, "MyProject")
 * .source(Source.s3(S3SourceProps.builder()
 * .bucket(bucket)
 * .path("path/to/file.zip")
 * .build()))
 * .build();
 * ```
 */
public interface S3SourceProps : SourceProps {
  /**
   *
   */
  public fun bucket(): IBucket

  /**
   *
   */
  public fun path(): String

  /**
   * The version ID of the object that represents the build input ZIP file to use.
   *
   * Default: latest
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [S3SourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket the value to be set. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param identifier The source identifier.
     * This property is required on secondary sources.
     */
    public fun identifier(identifier: String)

    /**
     * @param path the value to be set. 
     */
    public fun path(path: String)

    /**
     * @param version The version ID of the object that represents the build input ZIP file to use.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.S3SourceProps.Builder =
        software.amazon.awscdk.services.codebuild.S3SourceProps.builder()

    /**
     * @param bucket the value to be set. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param identifier The source identifier.
     * This property is required on secondary sources.
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    /**
     * @param path the value to be set. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param version The version ID of the object that represents the build input ZIP file to use.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.S3SourceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.S3SourceProps,
  ) : CdkObject(cdkObject), S3SourceProps {
    /**
     *
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * The source identifier.
     *
     * This property is required on secondary sources.
     */
    override fun identifier(): String? = unwrap(this).getIdentifier()

    /**
     *
     */
    override fun path(): String = unwrap(this).getPath()

    /**
     * The version ID of the object that represents the build input ZIP file to use.
     *
     * Default: latest
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.S3SourceProps):
        S3SourceProps = CdkObjectWrappers.wrap(cdkObject) as? S3SourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3SourceProps):
        software.amazon.awscdk.services.codebuild.S3SourceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codebuild.S3SourceProps
  }
}
