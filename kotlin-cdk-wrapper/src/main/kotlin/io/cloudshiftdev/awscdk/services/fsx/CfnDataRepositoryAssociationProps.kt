@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataRepositoryAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fsx.*;
 * CfnDataRepositoryAssociationProps cfnDataRepositoryAssociationProps =
 * CfnDataRepositoryAssociationProps.builder()
 * .dataRepositoryPath("dataRepositoryPath")
 * .fileSystemId("fileSystemId")
 * .fileSystemPath("fileSystemPath")
 * // the properties below are optional
 * .batchImportMetaDataOnCreate(false)
 * .importedFileChunkSize(123)
 * .s3(S3Property.builder()
 * .autoExportPolicy(AutoExportPolicyProperty.builder()
 * .events(List.of("events"))
 * .build())
 * .autoImportPolicy(AutoImportPolicyProperty.builder()
 * .events(List.of("events"))
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html)
 */
public interface CfnDataRepositoryAssociationProps {
  /**
   * A boolean flag indicating whether an import data repository task to import metadata should run
   * after the data repository association is created.
   *
   * The task runs if this flag is set to `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-batchimportmetadataoncreate)
   */
  public fun batchImportMetaDataOnCreate(): Any? = unwrap(this).getBatchImportMetaDataOnCreate()

  /**
   * The path to the Amazon S3 data repository that will be linked to the file system.
   *
   * The path can be an S3 bucket or prefix in the format `s3://myBucket/myPrefix/` . This path
   * specifies where in the S3 data repository files will be imported from or exported to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-datarepositorypath)
   */
  public fun dataRepositoryPath(): String

  /**
   * The ID of the file system on which the data repository association is configured.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-filesystemid)
   */
  public fun fileSystemId(): String

  /**
   * A path on the Amazon FSx for Lustre file system that points to a high-level directory (such as
   * `/ns1/` ) or subdirectory (such as `/ns1/subdir/` ) that will be mapped 1-1 with
   * `DataRepositoryPath` .
   *
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
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-filesystempath)
   */
  public fun fileSystemPath(): String

  /**
   * For files imported from a data repository, this value determines the stripe count and maximum
   * amount of data per file (in MiB) stored on a single physical disk.
   *
   * The maximum number of disks that a single file can be striped across is limited by the total
   * number of disks that make up the file system or cache.
   *
   * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon
   * S3 objects have a maximum size of 5 TB.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-importedfilechunksize)
   */
  public fun importedFileChunkSize(): Number? = unwrap(this).getImportedFileChunkSize()

  /**
   * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
   * with a data repository association.
   *
   * The configuration defines which file events (new, changed, or deleted files or directories) are
   * automatically imported from the linked data repository to the file system or automatically
   * exported from the file system to the data repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-s3)
   */
  public fun s3(): Any? = unwrap(this).getS3()

  /**
   * A list of `Tag` values, with a maximum of 50 elements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDataRepositoryAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param batchImportMetaDataOnCreate A boolean flag indicating whether an import data
     * repository task to import metadata should run after the data repository association is created.
     * The task runs if this flag is set to `true` .
     */
    public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: Boolean)

    /**
     * @param batchImportMetaDataOnCreate A boolean flag indicating whether an import data
     * repository task to import metadata should run after the data repository association is created.
     * The task runs if this flag is set to `true` .
     */
    public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: IResolvable)

    /**
     * @param dataRepositoryPath The path to the Amazon S3 data repository that will be linked to
     * the file system. 
     * The path can be an S3 bucket or prefix in the format `s3://myBucket/myPrefix/` . This path
     * specifies where in the S3 data repository files will be imported from or exported to.
     */
    public fun dataRepositoryPath(dataRepositoryPath: String)

    /**
     * @param fileSystemId The ID of the file system on which the data repository association is
     * configured. 
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * @param fileSystemPath A path on the Amazon FSx for Lustre file system that points to a
     * high-level directory (such as `/ns1/` ) or subdirectory (such as `/ns1/subdir/` ) that will be
     * mapped 1-1 with `DataRepositoryPath` . 
     * The leading forward slash in the name is required. Two data repository associations cannot
     * have overlapping file system paths. For example, if a data repository is associated with file
     * system path `/ns1/` , then you cannot link another data repository with file system path
     * `/ns1/ns2` .
     *
     * This path specifies where in your file system files will be exported from or imported to.
     * This file system directory can be linked to only one Amazon S3 bucket, and no other S3 bucket
     * can be linked to the directory.
     *
     *
     * If you specify only a forward slash ( `/` ) as the file system path, you can link only one
     * data repository to the file system. You can only specify "/" as the file system path for the
     * first data repository associated with a file system.
     */
    public fun fileSystemPath(fileSystemPath: String)

    /**
     * @param importedFileChunkSize For files imported from a data repository, this value determines
     * the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk.
     * The maximum number of disks that a single file can be striped across is limited by the total
     * number of disks that make up the file system or cache.
     *
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB).
     * Amazon S3 objects have a maximum size of 5 TB.
     */
    public fun importedFileChunkSize(importedFileChunkSize: Number)

    /**
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     * file system with a data repository association.
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     */
    public fun s3(s3: IResolvable)

    /**
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     * file system with a data repository association.
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     */
    public fun s3(s3: CfnDataRepositoryAssociation.S3Property)

    /**
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     * file system with a data repository association.
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5b393c430c9d88d7df5b4cae373fdab299b4e13a8ab124dda7feefcaf8a6884")
    public fun s3(s3: CfnDataRepositoryAssociation.S3Property.Builder.() -> Unit)

    /**
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps.Builder =
        software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps.builder()

    /**
     * @param batchImportMetaDataOnCreate A boolean flag indicating whether an import data
     * repository task to import metadata should run after the data repository association is created.
     * The task runs if this flag is set to `true` .
     */
    override fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: Boolean) {
      cdkBuilder.batchImportMetaDataOnCreate(batchImportMetaDataOnCreate)
    }

    /**
     * @param batchImportMetaDataOnCreate A boolean flag indicating whether an import data
     * repository task to import metadata should run after the data repository association is created.
     * The task runs if this flag is set to `true` .
     */
    override fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: IResolvable) {
      cdkBuilder.batchImportMetaDataOnCreate(batchImportMetaDataOnCreate.let(IResolvable::unwrap))
    }

    /**
     * @param dataRepositoryPath The path to the Amazon S3 data repository that will be linked to
     * the file system. 
     * The path can be an S3 bucket or prefix in the format `s3://myBucket/myPrefix/` . This path
     * specifies where in the S3 data repository files will be imported from or exported to.
     */
    override fun dataRepositoryPath(dataRepositoryPath: String) {
      cdkBuilder.dataRepositoryPath(dataRepositoryPath)
    }

    /**
     * @param fileSystemId The ID of the file system on which the data repository association is
     * configured. 
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * @param fileSystemPath A path on the Amazon FSx for Lustre file system that points to a
     * high-level directory (such as `/ns1/` ) or subdirectory (such as `/ns1/subdir/` ) that will be
     * mapped 1-1 with `DataRepositoryPath` . 
     * The leading forward slash in the name is required. Two data repository associations cannot
     * have overlapping file system paths. For example, if a data repository is associated with file
     * system path `/ns1/` , then you cannot link another data repository with file system path
     * `/ns1/ns2` .
     *
     * This path specifies where in your file system files will be exported from or imported to.
     * This file system directory can be linked to only one Amazon S3 bucket, and no other S3 bucket
     * can be linked to the directory.
     *
     *
     * If you specify only a forward slash ( `/` ) as the file system path, you can link only one
     * data repository to the file system. You can only specify "/" as the file system path for the
     * first data repository associated with a file system.
     */
    override fun fileSystemPath(fileSystemPath: String) {
      cdkBuilder.fileSystemPath(fileSystemPath)
    }

    /**
     * @param importedFileChunkSize For files imported from a data repository, this value determines
     * the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk.
     * The maximum number of disks that a single file can be striped across is limited by the total
     * number of disks that make up the file system or cache.
     *
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB).
     * Amazon S3 objects have a maximum size of 5 TB.
     */
    override fun importedFileChunkSize(importedFileChunkSize: Number) {
      cdkBuilder.importedFileChunkSize(importedFileChunkSize)
    }

    /**
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     * file system with a data repository association.
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     */
    override fun s3(s3: IResolvable) {
      cdkBuilder.s3(s3.let(IResolvable::unwrap))
    }

    /**
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     * file system with a data repository association.
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     */
    override fun s3(s3: CfnDataRepositoryAssociation.S3Property) {
      cdkBuilder.s3(s3.let(CfnDataRepositoryAssociation.S3Property::unwrap))
    }

    /**
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     * file system with a data repository association.
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5b393c430c9d88d7df5b4cae373fdab299b4e13a8ab124dda7feefcaf8a6884")
    override fun s3(s3: CfnDataRepositoryAssociation.S3Property.Builder.() -> Unit): Unit =
        s3(CfnDataRepositoryAssociation.S3Property(s3))

    /**
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps,
  ) : CdkObject(cdkObject), CfnDataRepositoryAssociationProps {
    /**
     * A boolean flag indicating whether an import data repository task to import metadata should
     * run after the data repository association is created.
     *
     * The task runs if this flag is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-batchimportmetadataoncreate)
     */
    override fun batchImportMetaDataOnCreate(): Any? = unwrap(this).getBatchImportMetaDataOnCreate()

    /**
     * The path to the Amazon S3 data repository that will be linked to the file system.
     *
     * The path can be an S3 bucket or prefix in the format `s3://myBucket/myPrefix/` . This path
     * specifies where in the S3 data repository files will be imported from or exported to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-datarepositorypath)
     */
    override fun dataRepositoryPath(): String = unwrap(this).getDataRepositoryPath()

    /**
     * The ID of the file system on which the data repository association is configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-filesystemid)
     */
    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    /**
     * A path on the Amazon FSx for Lustre file system that points to a high-level directory (such
     * as `/ns1/` ) or subdirectory (such as `/ns1/subdir/` ) that will be mapped 1-1 with
     * `DataRepositoryPath` .
     *
     * The leading forward slash in the name is required. Two data repository associations cannot
     * have overlapping file system paths. For example, if a data repository is associated with file
     * system path `/ns1/` , then you cannot link another data repository with file system path
     * `/ns1/ns2` .
     *
     * This path specifies where in your file system files will be exported from or imported to.
     * This file system directory can be linked to only one Amazon S3 bucket, and no other S3 bucket
     * can be linked to the directory.
     *
     *
     * If you specify only a forward slash ( `/` ) as the file system path, you can link only one
     * data repository to the file system. You can only specify "/" as the file system path for the
     * first data repository associated with a file system.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-filesystempath)
     */
    override fun fileSystemPath(): String = unwrap(this).getFileSystemPath()

    /**
     * For files imported from a data repository, this value determines the stripe count and maximum
     * amount of data per file (in MiB) stored on a single physical disk.
     *
     * The maximum number of disks that a single file can be striped across is limited by the total
     * number of disks that make up the file system or cache.
     *
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB).
     * Amazon S3 objects have a maximum size of 5 TB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-importedfilechunksize)
     */
    override fun importedFileChunkSize(): Number? = unwrap(this).getImportedFileChunkSize()

    /**
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
     * with a data repository association.
     *
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-s3)
     */
    override fun s3(): Any? = unwrap(this).getS3()

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataRepositoryAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps):
        CfnDataRepositoryAssociationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnDataRepositoryAssociationProps

    internal fun unwrap(wrapped: CfnDataRepositoryAssociationProps):
        software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps
  }
}
