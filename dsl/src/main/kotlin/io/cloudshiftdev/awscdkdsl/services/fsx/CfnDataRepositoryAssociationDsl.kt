@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.fsx

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation
import software.constructs.Construct

/**
 * Creates an Amazon FSx for Lustre data repository association (DRA).
 *
 * A data repository association is a link between a directory on the file system and an Amazon S3
 * bucket or prefix. You can have a maximum of 8 data repository associations on a file system. Data
 * repository associations are supported on all FSx for Lustre 2.12 and newer file systems,
 * excluding `scratch_1` deployment type.
 *
 * Each data repository association must have a unique Amazon FSx file system directory and a unique
 * S3 bucket or prefix associated with it. You can configure a data repository association for
 * automatic import only, for automatic export only, or for both. To learn more about linking a data
 * repository to your file system, see
 * [Linking your file system to an S3 bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-dra-linked-data-repo.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
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
@CdkDslMarker
public class CfnDataRepositoryAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDataRepositoryAssociation.Builder =
        CfnDataRepositoryAssociation.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A boolean flag indicating whether an import data repository task to import metadata should
     * run after the data repository association is created.
     *
     * The task runs if this flag is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-batchimportmetadataoncreate)
     *
     * @param batchImportMetaDataOnCreate A boolean flag indicating whether an import data
     *   repository task to import metadata should run after the data repository association is
     *   created.
     */
    public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: Boolean) {
        cdkBuilder.batchImportMetaDataOnCreate(batchImportMetaDataOnCreate)
    }

    /**
     * A boolean flag indicating whether an import data repository task to import metadata should
     * run after the data repository association is created.
     *
     * The task runs if this flag is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-batchimportmetadataoncreate)
     *
     * @param batchImportMetaDataOnCreate A boolean flag indicating whether an import data
     *   repository task to import metadata should run after the data repository association is
     *   created.
     */
    public fun batchImportMetaDataOnCreate(batchImportMetaDataOnCreate: IResolvable) {
        cdkBuilder.batchImportMetaDataOnCreate(batchImportMetaDataOnCreate)
    }

    /**
     * The path to the Amazon S3 data repository that will be linked to the file system.
     *
     * The path can be an S3 bucket or prefix in the format `s3://myBucket/myPrefix/` . This path
     * specifies where in the S3 data repository files will be imported from or exported to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-datarepositorypath)
     *
     * @param dataRepositoryPath The path to the Amazon S3 data repository that will be linked to
     *   the file system.
     */
    public fun dataRepositoryPath(dataRepositoryPath: String) {
        cdkBuilder.dataRepositoryPath(dataRepositoryPath)
    }

    /**
     * The ID of the file system on which the data repository association is configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-filesystemid)
     *
     * @param fileSystemId The ID of the file system on which the data repository association is
     *   configured.
     */
    public fun fileSystemId(fileSystemId: String) {
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
     * If you specify only a forward slash ( `/` ) as the file system path, you can link only one
     * data repository to the file system. You can only specify "/" as the file system path for the
     * first data repository associated with a file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-filesystempath)
     *
     * @param fileSystemPath A path on the Amazon FSx for Lustre file system that points to a
     *   high-level directory (such as `/ns1/` ) or subdirectory (such as `/ns1/subdir/` ) that will
     *   be mapped 1-1 with `DataRepositoryPath` .
     */
    public fun fileSystemPath(fileSystemPath: String) {
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
     *
     * @param importedFileChunkSize For files imported from a data repository, this value determines
     *   the stripe count and maximum amount of data per file (in MiB) stored on a single physical
     *   disk.
     */
    public fun importedFileChunkSize(importedFileChunkSize: Number) {
        cdkBuilder.importedFileChunkSize(importedFileChunkSize)
    }

    /**
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
     * with a data repository association.
     *
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or
     * automatically exported from the file system to the data repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-s3)
     *
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     *   file system with a data repository association.
     */
    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    /**
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
     * with a data repository association.
     *
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or
     * automatically exported from the file system to the data repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-s3)
     *
     * @param s3 The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre
     *   file system with a data repository association.
     */
    public fun s3(s3: CfnDataRepositoryAssociation.S3Property) {
        cdkBuilder.s3(s3)
    }

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-tags)
     *
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html#cfn-fsx-datarepositoryassociation-tags)
     *
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDataRepositoryAssociation {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
