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
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

/**
 * The settings for assigning a custom Amazon EFS file system to a user profile or space for an
 * Amazon SageMaker Domain.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * EFSFileSystemConfigProperty eFSFileSystemConfigProperty = EFSFileSystemConfigProperty.builder()
 * .fileSystemId("fileSystemId")
 * // the properties below are optional
 * .fileSystemPath("fileSystemPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-efsfilesystemconfig.html)
 */
@CdkDslMarker
public class CfnUserProfileEFSFileSystemConfigPropertyDsl {
    private val cdkBuilder: CfnUserProfile.EFSFileSystemConfigProperty.Builder =
        CfnUserProfile.EFSFileSystemConfigProperty.builder()

    /** @param fileSystemId The ID of your Amazon EFS file system. */
    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * @param fileSystemPath The path to the file system directory that is accessible in Amazon
     *   SageMaker Studio. Permitted users can access only this directory and below.
     */
    public fun fileSystemPath(fileSystemPath: String) {
        cdkBuilder.fileSystemPath(fileSystemPath)
    }

    public fun build(): CfnUserProfile.EFSFileSystemConfigProperty = cdkBuilder.build()
}
