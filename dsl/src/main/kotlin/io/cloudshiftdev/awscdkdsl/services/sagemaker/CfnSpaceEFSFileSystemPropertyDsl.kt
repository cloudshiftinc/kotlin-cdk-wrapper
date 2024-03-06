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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnSpace

/**
 * A file system, created by you in Amazon EFS, that you assign to a user profile or space for an
 * Amazon SageMaker Domain.
 *
 * Permitted users can access this file system in Amazon SageMaker Studio.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * EFSFileSystemProperty eFSFileSystemProperty = EFSFileSystemProperty.builder()
 * .fileSystemId("fileSystemId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-efsfilesystem.html)
 */
@CdkDslMarker
public class CfnSpaceEFSFileSystemPropertyDsl {
    private val cdkBuilder: CfnSpace.EFSFileSystemProperty.Builder =
        CfnSpace.EFSFileSystemProperty.builder()

    /** @param fileSystemId The ID of your Amazon EFS file system. */
    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    public fun build(): CfnSpace.EFSFileSystemProperty = cdkBuilder.build()
}
