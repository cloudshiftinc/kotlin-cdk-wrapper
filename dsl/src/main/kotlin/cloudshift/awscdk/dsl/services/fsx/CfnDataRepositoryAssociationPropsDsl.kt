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

  /**
   * @param batchImportMetaDataOnCreate A boolean flag indicating whether an import data repository
   * task to import metadata should run after the data repository association is created.
   * The task runs if this flag is set to `true` .
   */
  public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: Boolean) {
    cdkBuilder.batchImportMetaDataOnCreate(batchImportMetaDataOnCreate)
  }

  /**
   * @param batchImportMetaDataOnCreate A boolean flag indicating whether an import data repository
   * task to import metadata should run after the data repository association is created.
   * The task runs if this flag is set to `true` .
   */
  public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: IResolvable) {
    cdkBuilder.batchImportMetaDataOnCreate(batchImportMetaDataOnCreate)
  }

  /**
   * @param dataRepositoryPath The path to the Amazon S3 data repository that will be linked to the
   * file system. 
   * The path can be an S3 bucket or prefix in the format `s3://myBucket/myPrefix/` . This path
   * specifies where in the S3 data repository files will be imported from or exported to.
   */
  public fun dataRepositoryPath(dataRepositoryPath: String) {
    cdkBuilder.dataRepositoryPath(dataRepositoryPath)
  }

  /**
   * @param fileSystemId The ID of the file system on which the data repository association is
   * configured. 
   */
  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  /**
   * @param fileSystemPath A path on the Amazon FSx for Lustre file system that points to a
   * high-level directory (such as `/ns1/` ) or subdirectory (such as `/ns1/subdir/` ) that will be
   * mapped 1-1 with `DataRepositoryPath` . 
   * The leading forward slash in the name is required. Two data repository associations cannot have
   * overlapping file system paths. For example, if a data repository is associated with file system
   * path `/ns1/` , then you cannot link another data repository with file system path `/ns1/ns2` .
   *
   * This path specifies where in your file system files will be exported from or imported to. This
   * file system directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be
   * linked to the directory.
   *
   *
   * If you specify only a forward slash ( `/` ) as the file system path, you can link only one data
   * repository to the file system. You can only specify "/" as the file system path for the first data
   * repository associated with a file system.
   */
  public fun fileSystemPath(fileSystemPath: String) {
    cdkBuilder.fileSystemPath(fileSystemPath)
  }

  /**
   * @param importedFileChunkSize For files imported from a data repository, this value determines
   * the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk.
   * The maximum number of disks that a single file can be striped across is limited by the total
   * number of disks that make up the file system or cache.
   *
   * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon
   * S3 objects have a maximum size of 5 TB.
   */
  public fun importedFileChunkSize(importedFileChunkSize: Number) {
    cdkBuilder.importedFileChunkSize(importedFileChunkSize)
  }

  /**
   * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
   * file system with a data repository association.
   * The configuration defines which file events (new, changed, or deleted files or directories) are
   * automatically imported from the linked data repository to the file system or automatically
   * exported from the file system to the data repository.
   */
  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
   * file system with a data repository association.
   * The configuration defines which file events (new, changed, or deleted files or directories) are
   * automatically imported from the linked data repository to the file system or automatically
   * exported from the file system to the data repository.
   */
  public fun s3(s3: CfnDataRepositoryAssociation.S3Property) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDataRepositoryAssociationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
