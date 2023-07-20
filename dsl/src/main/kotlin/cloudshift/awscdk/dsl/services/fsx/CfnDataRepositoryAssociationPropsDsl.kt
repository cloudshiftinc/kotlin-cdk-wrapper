@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps

@CdkDslMarker
public class CfnDataRepositoryAssociationPropsDsl {
  private val cdkBuilder: CfnDataRepositoryAssociationProps.Builder =
      CfnDataRepositoryAssociationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: Boolean) {
    cdkBuilder.batchImportMetaDataOnCreate(batchImportMetaDataOnCreate)
  }

  public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: IResolvable) {
    cdkBuilder.batchImportMetaDataOnCreate(batchImportMetaDataOnCreate)
  }

  public fun dataRepositoryPath(dataRepositoryPath: String) {
    cdkBuilder.dataRepositoryPath(dataRepositoryPath)
  }

  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  public fun fileSystemPath(fileSystemPath: String) {
    cdkBuilder.fileSystemPath(fileSystemPath)
  }

  public fun importedFileChunkSize(importedFileChunkSize: Number) {
    cdkBuilder.importedFileChunkSize(importedFileChunkSize)
  }

  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  public fun s3(s3: CfnDataRepositoryAssociation.S3Property) {
    cdkBuilder.s3(s3)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDataRepositoryAssociationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
