@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry

@CdkDslMarker
public class FileAssetMetadataEntryDsl {
  private val cdkBuilder: FileAssetMetadataEntry.Builder = FileAssetMetadataEntry.builder()

  /**
   * @param artifactHashParameter The name of the parameter where the hash of the bundled asset
   * should be passed in. 
   */
  public fun artifactHashParameter(artifactHashParameter: String) {
    cdkBuilder.artifactHashParameter(artifactHashParameter)
  }

  /**
   * @param id Logical identifier for the asset. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param packaging Requested packaging style. 
   */
  public fun packaging(packaging: String) {
    cdkBuilder.packaging(packaging)
  }

  /**
   * @param path Path on disk to the asset. 
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * @param s3BucketParameter Name of parameter where S3 bucket should be passed in. 
   */
  public fun s3BucketParameter(s3BucketParameter: String) {
    cdkBuilder.s3BucketParameter(s3BucketParameter)
  }

  /**
   * @param s3KeyParameter Name of parameter where S3 key should be passed in. 
   */
  public fun s3KeyParameter(s3KeyParameter: String) {
    cdkBuilder.s3KeyParameter(s3KeyParameter)
  }

  /**
   * @param sourceHash The hash of the asset source. 
   */
  public fun sourceHash(sourceHash: String) {
    cdkBuilder.sourceHash(sourceHash)
  }

  public fun build(): FileAssetMetadataEntry = cdkBuilder.build()
}
