@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry

@CdkDslMarker
public class FileAssetMetadataEntryDsl {
  private val cdkBuilder: FileAssetMetadataEntry.Builder = FileAssetMetadataEntry.builder()

  public fun artifactHashParameter(artifactHashParameter: String) {
    cdkBuilder.artifactHashParameter(artifactHashParameter)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun packaging(packaging: String) {
    cdkBuilder.packaging(packaging)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun s3BucketParameter(s3BucketParameter: String) {
    cdkBuilder.s3BucketParameter(s3BucketParameter)
  }

  public fun s3KeyParameter(s3KeyParameter: String) {
    cdkBuilder.s3KeyParameter(s3KeyParameter)
  }

  public fun sourceHash(sourceHash: String) {
    cdkBuilder.sourceHash(sourceHash)
  }

  public fun build(): FileAssetMetadataEntry = cdkBuilder.build()
}
