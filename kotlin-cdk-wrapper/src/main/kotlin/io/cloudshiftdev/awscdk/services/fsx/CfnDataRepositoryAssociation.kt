@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon FSx for Lustre data repository association (DRA).
 *
 * A data repository association is a link between a directory on the file system and an Amazon S3
 * bucket or prefix. You can have a maximum of 8 data repository associations on a file system. Data
 * repository associations are supported on all FSx for Lustre 2.12 and newer file systems, excluding
 * `scratch_1` deployment type.
 *
 * Each data repository association must have a unique Amazon FSx file system directory and a unique
 * S3 bucket or prefix associated with it. You can configure a data repository association for
 * automatic import only, for automatic export only, or for both. To learn more about linking a data
 * repository to your file system, see [Linking your file system to an S3
 * bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-dra-linked-data-repo.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fsx.*;
 * CfnDataRepositoryAssociation cfnDataRepositoryAssociation =
 * CfnDataRepositoryAssociation.Builder.create(this, "MyCfnDataRepositoryAssociation")
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
public open class CfnDataRepositoryAssociation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataRepositoryAssociationProps,
  ) :
      this(software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDataRepositoryAssociationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataRepositoryAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataRepositoryAssociationProps(props)
  )

  /**
   * Returns the data repository association's system generated Association ID.
   *
   * Example: `dra-abcdef0123456789d`
   */
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  /**
   * Returns the data repository association's Amazon Resource Name (ARN).
   *
   * Example:
   * `arn:aws:fsx:us-east-1:111122223333:association/fs-abc012345def6789a/dra-abcdef0123456789b`
   */
  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  /**
   * A boolean flag indicating whether an import data repository task to import metadata should run
   * after the data repository association is created.
   */
  public open fun batchImportMetaDataOnCreate(): Any? =
      unwrap(this).getBatchImportMetaDataOnCreate()

  /**
   * A boolean flag indicating whether an import data repository task to import metadata should run
   * after the data repository association is created.
   */
  public open fun batchImportMetaDataOnCreate(`value`: Boolean) {
    unwrap(this).setBatchImportMetaDataOnCreate(`value`)
  }

  /**
   * A boolean flag indicating whether an import data repository task to import metadata should run
   * after the data repository association is created.
   */
  public open fun batchImportMetaDataOnCreate(`value`: IResolvable) {
    unwrap(this).setBatchImportMetaDataOnCreate(`value`.let(IResolvable::unwrap))
  }

  /**
   * The path to the Amazon S3 data repository that will be linked to the file system.
   */
  public open fun dataRepositoryPath(): String = unwrap(this).getDataRepositoryPath()

  /**
   * The path to the Amazon S3 data repository that will be linked to the file system.
   */
  public open fun dataRepositoryPath(`value`: String) {
    unwrap(this).setDataRepositoryPath(`value`)
  }

  /**
   * The ID of the file system on which the data repository association is configured.
   */
  public open fun fileSystemId(): String = unwrap(this).getFileSystemId()

  /**
   * The ID of the file system on which the data repository association is configured.
   */
  public open fun fileSystemId(`value`: String) {
    unwrap(this).setFileSystemId(`value`)
  }

  /**
   * A path on the Amazon FSx for Lustre file system that points to a high-level directory (such as
   * `/ns1/` ) or subdirectory (such as `/ns1/subdir/` ) that will be mapped 1-1 with
   * `DataRepositoryPath` .
   */
  public open fun fileSystemPath(): String = unwrap(this).getFileSystemPath()

  /**
   * A path on the Amazon FSx for Lustre file system that points to a high-level directory (such as
   * `/ns1/` ) or subdirectory (such as `/ns1/subdir/` ) that will be mapped 1-1 with
   * `DataRepositoryPath` .
   */
  public open fun fileSystemPath(`value`: String) {
    unwrap(this).setFileSystemPath(`value`)
  }

  /**
   * For files imported from a data repository, this value determines the stripe count and maximum
   * amount of data per file (in MiB) stored on a single physical disk.
   */
  public open fun importedFileChunkSize(): Number? = unwrap(this).getImportedFileChunkSize()

  /**
   * For files imported from a data repository, this value determines the stripe count and maximum
   * amount of data per file (in MiB) stored on a single physical disk.
   */
  public open fun importedFileChunkSize(`value`: Number) {
    unwrap(this).setImportedFileChunkSize(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
   * with a data repository association.
   */
  public open fun s3(): Any? = unwrap(this).getS3()

  /**
   * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
   * with a data repository association.
   */
  public open fun s3(`value`: IResolvable) {
    unwrap(this).setS3(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
   * with a data repository association.
   */
  public open fun s3(`value`: S3Property) {
    unwrap(this).setS3(`value`.let(S3Property::unwrap))
  }

  /**
   * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
   * with a data repository association.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("434be3d797254fdc2361f6d8152b5729f357e3967f52aff0704464c7797a3784")
  public open fun s3(`value`: S3Property.Builder.() -> Unit): Unit = s3(S3Property(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of `Tag` values, with a maximum of 50 elements.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of `Tag` values, with a maximum of 50 elements.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of `Tag` values, with a maximum of 50 elements.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fsx.CfnDataRepositoryAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A boolean flag indicating whether an import data repository task to import metadata should
     * run after the data repository association is created.
     *
     * The task runs if this flag is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-batchimportmetadataoncreate)
     * @param batchImportMetaDataOnCreate A boolean flag indicating whether an import data
     * repository task to import metadata should run after the data repository association is created. 
     */
    public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: Boolean)

    /**
     * A boolean flag indicating whether an import data repository task to import metadata should
     * run after the data repository association is created.
     *
     * The task runs if this flag is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-batchimportmetadataoncreate)
     * @param batchImportMetaDataOnCreate A boolean flag indicating whether an import data
     * repository task to import metadata should run after the data repository association is created. 
     */
    public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: IResolvable)

    /**
     * The path to the Amazon S3 data repository that will be linked to the file system.
     *
     * The path can be an S3 bucket or prefix in the format `s3://myBucket/myPrefix/` . This path
     * specifies where in the S3 data repository files will be imported from or exported to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-datarepositorypath)
     * @param dataRepositoryPath The path to the Amazon S3 data repository that will be linked to
     * the file system. 
     */
    public fun dataRepositoryPath(dataRepositoryPath: String)

    /**
     * The ID of the file system on which the data repository association is configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-filesystemid)
     * @param fileSystemId The ID of the file system on which the data repository association is
     * configured. 
     */
    public fun fileSystemId(fileSystemId: String)

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
     * @param fileSystemPath A path on the Amazon FSx for Lustre file system that points to a
     * high-level directory (such as `/ns1/` ) or subdirectory (such as `/ns1/subdir/` ) that will be
     * mapped 1-1 with `DataRepositoryPath` . 
     */
    public fun fileSystemPath(fileSystemPath: String)

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
     * @param importedFileChunkSize For files imported from a data repository, this value determines
     * the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. 
     */
    public fun importedFileChunkSize(importedFileChunkSize: Number)

    /**
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
     * with a data repository association.
     *
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-s3)
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     * file system with a data repository association. 
     */
    public fun s3(s3: IResolvable)

    /**
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
     * with a data repository association.
     *
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-s3)
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     * file system with a data repository association. 
     */
    public fun s3(s3: S3Property)

    /**
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
     * with a data repository association.
     *
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-s3)
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     * file system with a data repository association. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d155d31be96a96ecab728e3679af95e4339d6701004028ec9b5e310c7bafa495")
    public fun s3(s3: S3Property.Builder.() -> Unit)

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-tags)
     * @param tags A list of `Tag` values, with a maximum of 50 elements. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-tags)
     * @param tags A list of `Tag` values, with a maximum of 50 elements. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.Builder
        = software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.Builder.create(scope, id)

    /**
     * A boolean flag indicating whether an import data repository task to import metadata should
     * run after the data repository association is created.
     *
     * The task runs if this flag is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-batchimportmetadataoncreate)
     * @param batchImportMetaDataOnCreate A boolean flag indicating whether an import data
     * repository task to import metadata should run after the data repository association is created. 
     */
    override fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: Boolean) {
      cdkBuilder.batchImportMetaDataOnCreate(batchImportMetaDataOnCreate)
    }

    /**
     * A boolean flag indicating whether an import data repository task to import metadata should
     * run after the data repository association is created.
     *
     * The task runs if this flag is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-batchimportmetadataoncreate)
     * @param batchImportMetaDataOnCreate A boolean flag indicating whether an import data
     * repository task to import metadata should run after the data repository association is created. 
     */
    override fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: IResolvable) {
      cdkBuilder.batchImportMetaDataOnCreate(batchImportMetaDataOnCreate.let(IResolvable::unwrap))
    }

    /**
     * The path to the Amazon S3 data repository that will be linked to the file system.
     *
     * The path can be an S3 bucket or prefix in the format `s3://myBucket/myPrefix/` . This path
     * specifies where in the S3 data repository files will be imported from or exported to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-datarepositorypath)
     * @param dataRepositoryPath The path to the Amazon S3 data repository that will be linked to
     * the file system. 
     */
    override fun dataRepositoryPath(dataRepositoryPath: String) {
      cdkBuilder.dataRepositoryPath(dataRepositoryPath)
    }

    /**
     * The ID of the file system on which the data repository association is configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-filesystemid)
     * @param fileSystemId The ID of the file system on which the data repository association is
     * configured. 
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

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
     * @param fileSystemPath A path on the Amazon FSx for Lustre file system that points to a
     * high-level directory (such as `/ns1/` ) or subdirectory (such as `/ns1/subdir/` ) that will be
     * mapped 1-1 with `DataRepositoryPath` . 
     */
    override fun fileSystemPath(fileSystemPath: String) {
      cdkBuilder.fileSystemPath(fileSystemPath)
    }

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
     * @param importedFileChunkSize For files imported from a data repository, this value determines
     * the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. 
     */
    override fun importedFileChunkSize(importedFileChunkSize: Number) {
      cdkBuilder.importedFileChunkSize(importedFileChunkSize)
    }

    /**
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
     * with a data repository association.
     *
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-s3)
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     * file system with a data repository association. 
     */
    override fun s3(s3: IResolvable) {
      cdkBuilder.s3(s3.let(IResolvable::unwrap))
    }

    /**
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
     * with a data repository association.
     *
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-s3)
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     * file system with a data repository association. 
     */
    override fun s3(s3: S3Property) {
      cdkBuilder.s3(s3.let(S3Property::unwrap))
    }

    /**
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
     * with a data repository association.
     *
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-s3)
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     * file system with a data repository association. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d155d31be96a96ecab728e3679af95e4339d6701004028ec9b5e310c7bafa495")
    override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-tags)
     * @param tags A list of `Tag` values, with a maximum of 50 elements. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-tags)
     * @param tags A list of `Tag` values, with a maximum of 50 elements. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataRepositoryAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataRepositoryAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation):
        CfnDataRepositoryAssociation = CfnDataRepositoryAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnDataRepositoryAssociation):
        software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation = wrapped.cdkObject
  }

  /**
   * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
   * with a data repository association.
   *
   * The configuration defines which file events (new, changed, or deleted files or directories) are
   * automatically imported from the linked data repository to the file system or automatically
   * exported from the file system to the data repository.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * S3Property s3Property = S3Property.builder()
   * .autoExportPolicy(AutoExportPolicyProperty.builder()
   * .events(List.of("events"))
   * .build())
   * .autoImportPolicy(AutoImportPolicyProperty.builder()
   * .events(List.of("events"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-s3.html)
   */
  public interface S3Property {
    /**
     * Describes a data repository association's automatic export policy.
     *
     * The `AutoExportPolicy` defines the types of updated objects on the file system that will be
     * automatically exported to the data repository. As you create, modify, or delete files, Amazon
     * FSx for Lustre automatically exports the defined changes asynchronously once your application
     * finishes modifying the file.
     *
     * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
     * repository association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-s3.html#cfn-fsx-datarepositoryassociation-s3-autoexportpolicy)
     */
    public fun autoExportPolicy(): Any? = unwrap(this).getAutoExportPolicy()

    /**
     * Describes the data repository association's automatic import policy.
     *
     * The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings
     * up to date by importing changes to your Amazon FSx for Lustre file system as you modify objects
     * in a linked S3 bucket.
     *
     * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
     * repository association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-s3.html#cfn-fsx-datarepositoryassociation-s3-autoimportpolicy)
     */
    public fun autoImportPolicy(): Any? = unwrap(this).getAutoImportPolicy()

    /**
     * A builder for [S3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoExportPolicy Describes a data repository association's automatic export policy.
       * The `AutoExportPolicy` defines the types of updated objects on the file system that will be
       * automatically exported to the data repository. As you create, modify, or delete files, Amazon
       * FSx for Lustre automatically exports the defined changes asynchronously once your application
       * finishes modifying the file.
       *
       * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       */
      public fun autoExportPolicy(autoExportPolicy: IResolvable)

      /**
       * @param autoExportPolicy Describes a data repository association's automatic export policy.
       * The `AutoExportPolicy` defines the types of updated objects on the file system that will be
       * automatically exported to the data repository. As you create, modify, or delete files, Amazon
       * FSx for Lustre automatically exports the defined changes asynchronously once your application
       * finishes modifying the file.
       *
       * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       */
      public fun autoExportPolicy(autoExportPolicy: AutoExportPolicyProperty)

      /**
       * @param autoExportPolicy Describes a data repository association's automatic export policy.
       * The `AutoExportPolicy` defines the types of updated objects on the file system that will be
       * automatically exported to the data repository. As you create, modify, or delete files, Amazon
       * FSx for Lustre automatically exports the defined changes asynchronously once your application
       * finishes modifying the file.
       *
       * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b9826f5d10b18cf60f54bde89d04930731d9424654a56ed546a396e95f7425a")
      public fun autoExportPolicy(autoExportPolicy: AutoExportPolicyProperty.Builder.() -> Unit)

      /**
       * @param autoImportPolicy Describes the data repository association's automatic import
       * policy.
       * The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings
       * up to date by importing changes to your Amazon FSx for Lustre file system as you modify
       * objects in a linked S3 bucket.
       *
       * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       */
      public fun autoImportPolicy(autoImportPolicy: IResolvable)

      /**
       * @param autoImportPolicy Describes the data repository association's automatic import
       * policy.
       * The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings
       * up to date by importing changes to your Amazon FSx for Lustre file system as you modify
       * objects in a linked S3 bucket.
       *
       * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       */
      public fun autoImportPolicy(autoImportPolicy: AutoImportPolicyProperty)

      /**
       * @param autoImportPolicy Describes the data repository association's automatic import
       * policy.
       * The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings
       * up to date by importing changes to your Amazon FSx for Lustre file system as you modify
       * objects in a linked S3 bucket.
       *
       * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a4e991b05f37673588ed1ea38a16225162101dc2acdb79159dffcf913a5171f")
      public fun autoImportPolicy(autoImportPolicy: AutoImportPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property.Builder =
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property.builder()

      /**
       * @param autoExportPolicy Describes a data repository association's automatic export policy.
       * The `AutoExportPolicy` defines the types of updated objects on the file system that will be
       * automatically exported to the data repository. As you create, modify, or delete files, Amazon
       * FSx for Lustre automatically exports the defined changes asynchronously once your application
       * finishes modifying the file.
       *
       * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       */
      override fun autoExportPolicy(autoExportPolicy: IResolvable) {
        cdkBuilder.autoExportPolicy(autoExportPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param autoExportPolicy Describes a data repository association's automatic export policy.
       * The `AutoExportPolicy` defines the types of updated objects on the file system that will be
       * automatically exported to the data repository. As you create, modify, or delete files, Amazon
       * FSx for Lustre automatically exports the defined changes asynchronously once your application
       * finishes modifying the file.
       *
       * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       */
      override fun autoExportPolicy(autoExportPolicy: AutoExportPolicyProperty) {
        cdkBuilder.autoExportPolicy(autoExportPolicy.let(AutoExportPolicyProperty::unwrap))
      }

      /**
       * @param autoExportPolicy Describes a data repository association's automatic export policy.
       * The `AutoExportPolicy` defines the types of updated objects on the file system that will be
       * automatically exported to the data repository. As you create, modify, or delete files, Amazon
       * FSx for Lustre automatically exports the defined changes asynchronously once your application
       * finishes modifying the file.
       *
       * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b9826f5d10b18cf60f54bde89d04930731d9424654a56ed546a396e95f7425a")
      override fun autoExportPolicy(autoExportPolicy: AutoExportPolicyProperty.Builder.() -> Unit):
          Unit = autoExportPolicy(AutoExportPolicyProperty(autoExportPolicy))

      /**
       * @param autoImportPolicy Describes the data repository association's automatic import
       * policy.
       * The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings
       * up to date by importing changes to your Amazon FSx for Lustre file system as you modify
       * objects in a linked S3 bucket.
       *
       * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       */
      override fun autoImportPolicy(autoImportPolicy: IResolvable) {
        cdkBuilder.autoImportPolicy(autoImportPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param autoImportPolicy Describes the data repository association's automatic import
       * policy.
       * The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings
       * up to date by importing changes to your Amazon FSx for Lustre file system as you modify
       * objects in a linked S3 bucket.
       *
       * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       */
      override fun autoImportPolicy(autoImportPolicy: AutoImportPolicyProperty) {
        cdkBuilder.autoImportPolicy(autoImportPolicy.let(AutoImportPolicyProperty::unwrap))
      }

      /**
       * @param autoImportPolicy Describes the data repository association's automatic import
       * policy.
       * The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings
       * up to date by importing changes to your Amazon FSx for Lustre file system as you modify
       * objects in a linked S3 bucket.
       *
       * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a4e991b05f37673588ed1ea38a16225162101dc2acdb79159dffcf913a5171f")
      override fun autoImportPolicy(autoImportPolicy: AutoImportPolicyProperty.Builder.() -> Unit):
          Unit = autoImportPolicy(AutoImportPolicyProperty(autoImportPolicy))

      public fun build():
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property,
    ) : CdkObject(cdkObject), S3Property {
      /**
       * Describes a data repository association's automatic export policy.
       *
       * The `AutoExportPolicy` defines the types of updated objects on the file system that will be
       * automatically exported to the data repository. As you create, modify, or delete files, Amazon
       * FSx for Lustre automatically exports the defined changes asynchronously once your application
       * finishes modifying the file.
       *
       * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-s3.html#cfn-fsx-datarepositoryassociation-s3-autoexportpolicy)
       */
      override fun autoExportPolicy(): Any? = unwrap(this).getAutoExportPolicy()

      /**
       * Describes the data repository association's automatic import policy.
       *
       * The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings
       * up to date by importing changes to your Amazon FSx for Lustre file system as you modify
       * objects in a linked S3 bucket.
       *
       * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
       * repository association.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-s3.html#cfn-fsx-datarepositoryassociation-s3-autoimportpolicy)
       */
      override fun autoImportPolicy(): Any? = unwrap(this).getAutoImportPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property):
          S3Property = CdkObjectWrappers.wrap(cdkObject) as? S3Property ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.S3Property
    }
  }

  /**
   * Describes the data repository association's automatic import policy.
   *
   * The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings up
   * to date by importing changes to your Amazon FSx for Lustre file system as you modify objects in a
   * linked S3 bucket.
   *
   * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
   * repository association.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * AutoImportPolicyProperty autoImportPolicyProperty = AutoImportPolicyProperty.builder()
   * .events(List.of("events"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-autoimportpolicy.html)
   */
  public interface AutoImportPolicyProperty {
    /**
     * The `AutoImportPolicy` can have the following event values:.
     *
     * * `NEW` - Amazon FSx automatically imports metadata of files added to the linked S3 bucket
     * that do not currently exist in the FSx file system.
     * * `CHANGED` - Amazon FSx automatically updates file metadata and invalidates existing file
     * content on the file system as files change in the data repository.
     * * `DELETED` - Amazon FSx automatically deletes files on the file system as corresponding
     * files are deleted in the data repository.
     *
     * You can define any combination of event types for your `AutoImportPolicy` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-autoimportpolicy.html#cfn-fsx-datarepositoryassociation-autoimportpolicy-events)
     */
    public fun events(): List<String>

    /**
     * A builder for [AutoImportPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param events The `AutoImportPolicy` can have the following event values:. 
       * * `NEW` - Amazon FSx automatically imports metadata of files added to the linked S3 bucket
       * that do not currently exist in the FSx file system.
       * * `CHANGED` - Amazon FSx automatically updates file metadata and invalidates existing file
       * content on the file system as files change in the data repository.
       * * `DELETED` - Amazon FSx automatically deletes files on the file system as corresponding
       * files are deleted in the data repository.
       *
       * You can define any combination of event types for your `AutoImportPolicy` .
       */
      public fun events(events: List<String>)

      /**
       * @param events The `AutoImportPolicy` can have the following event values:. 
       * * `NEW` - Amazon FSx automatically imports metadata of files added to the linked S3 bucket
       * that do not currently exist in the FSx file system.
       * * `CHANGED` - Amazon FSx automatically updates file metadata and invalidates existing file
       * content on the file system as files change in the data repository.
       * * `DELETED` - Amazon FSx automatically deletes files on the file system as corresponding
       * files are deleted in the data repository.
       *
       * You can define any combination of event types for your `AutoImportPolicy` .
       */
      public fun events(vararg events: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty.builder()

      /**
       * @param events The `AutoImportPolicy` can have the following event values:. 
       * * `NEW` - Amazon FSx automatically imports metadata of files added to the linked S3 bucket
       * that do not currently exist in the FSx file system.
       * * `CHANGED` - Amazon FSx automatically updates file metadata and invalidates existing file
       * content on the file system as files change in the data repository.
       * * `DELETED` - Amazon FSx automatically deletes files on the file system as corresponding
       * files are deleted in the data repository.
       *
       * You can define any combination of event types for your `AutoImportPolicy` .
       */
      override fun events(events: List<String>) {
        cdkBuilder.events(events)
      }

      /**
       * @param events The `AutoImportPolicy` can have the following event values:. 
       * * `NEW` - Amazon FSx automatically imports metadata of files added to the linked S3 bucket
       * that do not currently exist in the FSx file system.
       * * `CHANGED` - Amazon FSx automatically updates file metadata and invalidates existing file
       * content on the file system as files change in the data repository.
       * * `DELETED` - Amazon FSx automatically deletes files on the file system as corresponding
       * files are deleted in the data repository.
       *
       * You can define any combination of event types for your `AutoImportPolicy` .
       */
      override fun events(vararg events: String): Unit = events(events.toList())

      public fun build():
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty,
    ) : CdkObject(cdkObject), AutoImportPolicyProperty {
      /**
       * The `AutoImportPolicy` can have the following event values:.
       *
       * * `NEW` - Amazon FSx automatically imports metadata of files added to the linked S3 bucket
       * that do not currently exist in the FSx file system.
       * * `CHANGED` - Amazon FSx automatically updates file metadata and invalidates existing file
       * content on the file system as files change in the data repository.
       * * `DELETED` - Amazon FSx automatically deletes files on the file system as corresponding
       * files are deleted in the data repository.
       *
       * You can define any combination of event types for your `AutoImportPolicy` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-autoimportpolicy.html#cfn-fsx-datarepositoryassociation-autoimportpolicy-events)
       */
      override fun events(): List<String> = unwrap(this).getEvents()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoImportPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty):
          AutoImportPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? AutoImportPolicyProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoImportPolicyProperty):
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoImportPolicyProperty
    }
  }

  /**
   * Describes a data repository association's automatic export policy.
   *
   * The `AutoExportPolicy` defines the types of updated objects on the file system that will be
   * automatically exported to the data repository. As you create, modify, or delete files, Amazon FSx
   * for Lustre automatically exports the defined changes asynchronously once your application finishes
   * modifying the file.
   *
   * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
   * repository association.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * AutoExportPolicyProperty autoExportPolicyProperty = AutoExportPolicyProperty.builder()
   * .events(List.of("events"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-autoexportpolicy.html)
   */
  public interface AutoExportPolicyProperty {
    /**
     * The `AutoExportPolicy` can have the following event values:.
     *
     * * `NEW` - New files and directories are automatically exported to the data repository as they
     * are added to the file system.
     * * `CHANGED` - Changes to files and directories on the file system are automatically exported
     * to the data repository.
     * * `DELETED` - Files and directories are automatically deleted on the data repository when
     * they are deleted on the file system.
     *
     * You can define any combination of event types for your `AutoExportPolicy` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-autoexportpolicy.html#cfn-fsx-datarepositoryassociation-autoexportpolicy-events)
     */
    public fun events(): List<String>

    /**
     * A builder for [AutoExportPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param events The `AutoExportPolicy` can have the following event values:. 
       * * `NEW` - New files and directories are automatically exported to the data repository as
       * they are added to the file system.
       * * `CHANGED` - Changes to files and directories on the file system are automatically
       * exported to the data repository.
       * * `DELETED` - Files and directories are automatically deleted on the data repository when
       * they are deleted on the file system.
       *
       * You can define any combination of event types for your `AutoExportPolicy` .
       */
      public fun events(events: List<String>)

      /**
       * @param events The `AutoExportPolicy` can have the following event values:. 
       * * `NEW` - New files and directories are automatically exported to the data repository as
       * they are added to the file system.
       * * `CHANGED` - Changes to files and directories on the file system are automatically
       * exported to the data repository.
       * * `DELETED` - Files and directories are automatically deleted on the data repository when
       * they are deleted on the file system.
       *
       * You can define any combination of event types for your `AutoExportPolicy` .
       */
      public fun events(vararg events: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty.builder()

      /**
       * @param events The `AutoExportPolicy` can have the following event values:. 
       * * `NEW` - New files and directories are automatically exported to the data repository as
       * they are added to the file system.
       * * `CHANGED` - Changes to files and directories on the file system are automatically
       * exported to the data repository.
       * * `DELETED` - Files and directories are automatically deleted on the data repository when
       * they are deleted on the file system.
       *
       * You can define any combination of event types for your `AutoExportPolicy` .
       */
      override fun events(events: List<String>) {
        cdkBuilder.events(events)
      }

      /**
       * @param events The `AutoExportPolicy` can have the following event values:. 
       * * `NEW` - New files and directories are automatically exported to the data repository as
       * they are added to the file system.
       * * `CHANGED` - Changes to files and directories on the file system are automatically
       * exported to the data repository.
       * * `DELETED` - Files and directories are automatically deleted on the data repository when
       * they are deleted on the file system.
       *
       * You can define any combination of event types for your `AutoExportPolicy` .
       */
      override fun events(vararg events: String): Unit = events(events.toList())

      public fun build():
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty,
    ) : CdkObject(cdkObject), AutoExportPolicyProperty {
      /**
       * The `AutoExportPolicy` can have the following event values:.
       *
       * * `NEW` - New files and directories are automatically exported to the data repository as
       * they are added to the file system.
       * * `CHANGED` - Changes to files and directories on the file system are automatically
       * exported to the data repository.
       * * `DELETED` - Files and directories are automatically deleted on the data repository when
       * they are deleted on the file system.
       *
       * You can define any combination of event types for your `AutoExportPolicy` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-autoexportpolicy.html#cfn-fsx-datarepositoryassociation-autoexportpolicy-events)
       */
      override fun events(): List<String> = unwrap(this).getEvents()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoExportPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty):
          AutoExportPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? AutoExportPolicyProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoExportPolicyProperty):
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation.AutoExportPolicyProperty
    }
  }
}
