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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnSpace

/**
 * A file system, created by you, that you assign to a user profile or space for an Amazon SageMaker
 * Domain.
 *
 * Permitted users can access this file system in Amazon SageMaker Studio.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CustomFileSystemProperty customFileSystemProperty = CustomFileSystemProperty.builder()
 * .efsFileSystem(EFSFileSystemProperty.builder()
 * .fileSystemId("fileSystemId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customfilesystem.html)
 */
@CdkDslMarker
public class CfnSpaceCustomFileSystemPropertyDsl {
    private val cdkBuilder: CfnSpace.CustomFileSystemProperty.Builder =
        CfnSpace.CustomFileSystemProperty.builder()

    /** @param efsFileSystem A custom file system in Amazon EFS. */
    public fun efsFileSystem(efsFileSystem: IResolvable) {
        cdkBuilder.efsFileSystem(efsFileSystem)
    }

    /** @param efsFileSystem A custom file system in Amazon EFS. */
    public fun efsFileSystem(efsFileSystem: CfnSpace.EFSFileSystemProperty) {
        cdkBuilder.efsFileSystem(efsFileSystem)
    }

    public fun build(): CfnSpace.CustomFileSystemProperty = cdkBuilder.build()
}
