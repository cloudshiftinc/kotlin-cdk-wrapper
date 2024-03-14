package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface FileAssetMetadataEntry {
  /**
   * The name of the parameter where the hash of the bundled asset should be passed in.
   */
  public fun artifactHashParameter(): String

  /**
   * Logical identifier for the asset.
   */
  public fun id(): String

  /**
   * Requested packaging style.
   */
  public fun packaging(): String

  /**
   * Path on disk to the asset.
   */
  public fun path(): String

  /**
   * Name of parameter where S3 bucket should be passed in.
   */
  public fun s3BucketParameter(): String

  /**
   * Name of parameter where S3 key should be passed in.
   */
  public fun s3KeyParameter(): String

  /**
   * The hash of the asset source.
   */
  public fun sourceHash(): String

  /**
   * A builder for [FileAssetMetadataEntry]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param artifactHashParameter The name of the parameter where the hash of the bundled asset
     * should be passed in. 
     */
    public fun artifactHashParameter(artifactHashParameter: String)

    /**
     * @param id Logical identifier for the asset. 
     */
    public fun id(id: String)

    /**
     * @param packaging Requested packaging style. 
     */
    public fun packaging(packaging: String)

    /**
     * @param path Path on disk to the asset. 
     */
    public fun path(path: String)

    /**
     * @param s3BucketParameter Name of parameter where S3 bucket should be passed in. 
     */
    public fun s3BucketParameter(s3BucketParameter: String)

    /**
     * @param s3KeyParameter Name of parameter where S3 key should be passed in. 
     */
    public fun s3KeyParameter(s3KeyParameter: String)

    /**
     * @param sourceHash The hash of the asset source. 
     */
    public fun sourceHash(sourceHash: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry.Builder =
        software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry.builder()

    /**
     * @param artifactHashParameter The name of the parameter where the hash of the bundled asset
     * should be passed in. 
     */
    override fun artifactHashParameter(artifactHashParameter: String) {
      cdkBuilder.artifactHashParameter(artifactHashParameter)
    }

    /**
     * @param id Logical identifier for the asset. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param packaging Requested packaging style. 
     */
    override fun packaging(packaging: String) {
      cdkBuilder.packaging(packaging)
    }

    /**
     * @param path Path on disk to the asset. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param s3BucketParameter Name of parameter where S3 bucket should be passed in. 
     */
    override fun s3BucketParameter(s3BucketParameter: String) {
      cdkBuilder.s3BucketParameter(s3BucketParameter)
    }

    /**
     * @param s3KeyParameter Name of parameter where S3 key should be passed in. 
     */
    override fun s3KeyParameter(s3KeyParameter: String) {
      cdkBuilder.s3KeyParameter(s3KeyParameter)
    }

    /**
     * @param sourceHash The hash of the asset source. 
     */
    override fun sourceHash(sourceHash: String) {
      cdkBuilder.sourceHash(sourceHash)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry,
  ) : FileAssetMetadataEntry {
    /**
     * The name of the parameter where the hash of the bundled asset should be passed in.
     */
    override fun artifactHashParameter(): String = unwrap(this).getArtifactHashParameter()

    /**
     * Logical identifier for the asset.
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * Requested packaging style.
     */
    override fun packaging(): String = unwrap(this).getPackaging()

    /**
     * Path on disk to the asset.
     */
    override fun path(): String = unwrap(this).getPath()

    /**
     * Name of parameter where S3 bucket should be passed in.
     */
    override fun s3BucketParameter(): String = unwrap(this).getS3BucketParameter()

    /**
     * Name of parameter where S3 key should be passed in.
     */
    override fun s3KeyParameter(): String = unwrap(this).getS3KeyParameter()

    /**
     * The hash of the asset source.
     */
    override fun sourceHash(): String = unwrap(this).getSourceHash()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FileAssetMetadataEntry {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry):
        FileAssetMetadataEntry = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileAssetMetadataEntry):
        software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry = (wrapped as
        Wrapper).cdkObject
  }
}
