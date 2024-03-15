@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface FileAssetMetadataEntry {
  public fun artifactHashParameter(): String

  public fun id(): String

  public fun packaging(): String

  public fun path(): String

  public fun s3BucketParameter(): String

  public fun s3KeyParameter(): String

  public fun sourceHash(): String

  @CdkDslMarker
  public interface Builder {
    public fun artifactHashParameter(artifactHashParameter: String)

    public fun id(id: String)

    public fun packaging(packaging: String)

    public fun path(path: String)

    public fun s3BucketParameter(s3BucketParameter: String)

    public fun s3KeyParameter(s3KeyParameter: String)

    public fun sourceHash(sourceHash: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry.Builder =
        software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry.builder()

    override fun artifactHashParameter(artifactHashParameter: String) {
      cdkBuilder.artifactHashParameter(artifactHashParameter)
    }

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun packaging(packaging: String) {
      cdkBuilder.packaging(packaging)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun s3BucketParameter(s3BucketParameter: String) {
      cdkBuilder.s3BucketParameter(s3BucketParameter)
    }

    override fun s3KeyParameter(s3KeyParameter: String) {
      cdkBuilder.s3KeyParameter(s3KeyParameter)
    }

    override fun sourceHash(sourceHash: String) {
      cdkBuilder.sourceHash(sourceHash)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry,
  ) : CdkObject(cdkObject), FileAssetMetadataEntry {
    override fun artifactHashParameter(): String = unwrap(this).getArtifactHashParameter()

    override fun id(): String = unwrap(this).getId()

    override fun packaging(): String = unwrap(this).getPackaging()

    override fun path(): String = unwrap(this).getPath()

    override fun s3BucketParameter(): String = unwrap(this).getS3BucketParameter()

    override fun s3KeyParameter(): String = unwrap(this).getS3KeyParameter()

    override fun sourceHash(): String = unwrap(this).getSourceHash()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileAssetMetadataEntry {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry):
        FileAssetMetadataEntry = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileAssetMetadataEntry):
        software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry
  }
}
