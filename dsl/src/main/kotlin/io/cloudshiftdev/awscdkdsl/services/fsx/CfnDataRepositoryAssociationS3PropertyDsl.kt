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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation

/**
 * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
 * with a data repository association.
 *
 * The configuration defines which file events (new, changed, or deleted files or directories) are
 * automatically imported from the linked data repository to the file system or automatically
 * exported from the file system to the data repository.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
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
@CdkDslMarker
public class CfnDataRepositoryAssociationS3PropertyDsl {
    private val cdkBuilder: CfnDataRepositoryAssociation.S3Property.Builder =
        CfnDataRepositoryAssociation.S3Property.builder()

    /**
     * @param autoExportPolicy Describes a data repository association's automatic export policy.
     *   The `AutoExportPolicy` defines the types of updated objects on the file system that will be
     *   automatically exported to the data repository. As you create, modify, or delete files,
     *   Amazon FSx for Lustre automatically exports the defined changes asynchronously once your
     *   application finishes modifying the file.
     *
     * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
     * repository association.
     */
    public fun autoExportPolicy(autoExportPolicy: IResolvable) {
        cdkBuilder.autoExportPolicy(autoExportPolicy)
    }

    /**
     * @param autoExportPolicy Describes a data repository association's automatic export policy.
     *   The `AutoExportPolicy` defines the types of updated objects on the file system that will be
     *   automatically exported to the data repository. As you create, modify, or delete files,
     *   Amazon FSx for Lustre automatically exports the defined changes asynchronously once your
     *   application finishes modifying the file.
     *
     * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
     * repository association.
     */
    public fun autoExportPolicy(
        autoExportPolicy: CfnDataRepositoryAssociation.AutoExportPolicyProperty
    ) {
        cdkBuilder.autoExportPolicy(autoExportPolicy)
    }

    /**
     * @param autoImportPolicy Describes the data repository association's automatic import policy.
     *   The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings
     *   up to date by importing changes to your Amazon FSx for Lustre file system as you modify
     *   objects in a linked S3 bucket.
     *
     * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
     * repository association.
     */
    public fun autoImportPolicy(autoImportPolicy: IResolvable) {
        cdkBuilder.autoImportPolicy(autoImportPolicy)
    }

    /**
     * @param autoImportPolicy Describes the data repository association's automatic import policy.
     *   The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings
     *   up to date by importing changes to your Amazon FSx for Lustre file system as you modify
     *   objects in a linked S3 bucket.
     *
     * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
     * repository association.
     */
    public fun autoImportPolicy(
        autoImportPolicy: CfnDataRepositoryAssociation.AutoImportPolicyProperty
    ) {
        cdkBuilder.autoImportPolicy(autoImportPolicy)
    }

    public fun build(): CfnDataRepositoryAssociation.S3Property = cdkBuilder.build()
}
