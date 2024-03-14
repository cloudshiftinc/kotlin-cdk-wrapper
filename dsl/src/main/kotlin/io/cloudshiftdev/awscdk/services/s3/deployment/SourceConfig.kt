package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface SourceConfig {
  /**
   * The source bucket to deploy from.
   */
  public fun bucket(): IBucket

  /**
   * A set of markers to substitute in the source content.
   *
   * Default: - no markers
   */
  public fun markers(): Map<String, Any> = unwrap(this).getMarkers() ?: emptyMap()

  /**
   * An S3 object key in the source bucket that points to a zip file.
   */
  public fun zipObjectKey(): String

  /**
   * A builder for [SourceConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The source bucket to deploy from. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param markers A set of markers to substitute in the source content.
     */
    public fun markers(markers: Map<String, Any>)

    /**
     * @param zipObjectKey An S3 object key in the source bucket that points to a zip file. 
     */
    public fun zipObjectKey(zipObjectKey: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.deployment.SourceConfig.Builder =
        software.amazon.awscdk.services.s3.deployment.SourceConfig.builder()

    /**
     * @param bucket The source bucket to deploy from. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param markers A set of markers to substitute in the source content.
     */
    override fun markers(markers: Map<String, Any>) {
      cdkBuilder.markers(markers)
    }

    /**
     * @param zipObjectKey An S3 object key in the source bucket that points to a zip file. 
     */
    override fun zipObjectKey(zipObjectKey: String) {
      cdkBuilder.zipObjectKey(zipObjectKey)
    }

    public fun build(): software.amazon.awscdk.services.s3.deployment.SourceConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.deployment.SourceConfig,
  ) : CdkObject(cdkObject), SourceConfig {
    /**
     * The source bucket to deploy from.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * A set of markers to substitute in the source content.
     *
     * Default: - no markers
     */
    override fun markers(): Map<String, Any> = unwrap(this).getMarkers() ?: emptyMap()

    /**
     * An S3 object key in the source bucket that points to a zip file.
     */
    override fun zipObjectKey(): String = unwrap(this).getZipObjectKey()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.SourceConfig):
        SourceConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceConfig):
        software.amazon.awscdk.services.s3.deployment.SourceConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.deployment.SourceConfig
  }
}
