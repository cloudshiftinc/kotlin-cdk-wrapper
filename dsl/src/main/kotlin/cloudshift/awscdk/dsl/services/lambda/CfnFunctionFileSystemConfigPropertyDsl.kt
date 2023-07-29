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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnFunction

/**
 * Details about the connection between a Lambda function and an
 * [Amazon EFS file system](https://docs.aws.amazon.com/lambda/latest/dg/configuration-filesystem.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * FileSystemConfigProperty fileSystemConfigProperty = FileSystemConfigProperty.builder()
 * .arn("arn")
 * .localMountPath("localMountPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-filesystemconfig.html)
 */
@CdkDslMarker
public class CfnFunctionFileSystemConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.FileSystemConfigProperty.Builder =
        CfnFunction.FileSystemConfigProperty.builder()

    /**
     * @param arn The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access
     *   to the file system.
     */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /**
     * @param localMountPath The path where the function can access the file system, starting with
     *   `/mnt/` .
     */
    public fun localMountPath(localMountPath: String) {
        cdkBuilder.localMountPath(localMountPath)
    }

    public fun build(): CfnFunction.FileSystemConfigProperty = cdkBuilder.build()
}
