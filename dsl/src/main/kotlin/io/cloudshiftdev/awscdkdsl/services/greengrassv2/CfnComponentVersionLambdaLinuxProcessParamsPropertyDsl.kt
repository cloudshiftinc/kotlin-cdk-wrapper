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

package io.cloudshiftdev.awscdkdsl.services.greengrassv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

/**
 * Contains parameters for a Linux process that contains an AWS Lambda function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * LambdaLinuxProcessParamsProperty lambdaLinuxProcessParamsProperty =
 * LambdaLinuxProcessParamsProperty.builder()
 * .containerParams(LambdaContainerParamsProperty.builder()
 * .devices(List.of(LambdaDeviceMountProperty.builder()
 * .addGroupOwner(false)
 * .path("path")
 * .permission("permission")
 * .build()))
 * .memorySizeInKb(123)
 * .mountRoSysfs(false)
 * .volumes(List.of(LambdaVolumeMountProperty.builder()
 * .addGroupOwner(false)
 * .destinationPath("destinationPath")
 * .permission("permission")
 * .sourcePath("sourcePath")
 * .build()))
 * .build())
 * .isolationMode("isolationMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdalinuxprocessparams.html)
 */
@CdkDslMarker
public class CfnComponentVersionLambdaLinuxProcessParamsPropertyDsl {
    private val cdkBuilder: CfnComponentVersion.LambdaLinuxProcessParamsProperty.Builder =
        CfnComponentVersion.LambdaLinuxProcessParamsProperty.builder()

    /**
     * @param containerParams The parameters for the container in which the Lambda function runs.
     */
    public fun containerParams(containerParams: IResolvable) {
        cdkBuilder.containerParams(containerParams)
    }

    /**
     * @param containerParams The parameters for the container in which the Lambda function runs.
     */
    public fun containerParams(containerParams: CfnComponentVersion.LambdaContainerParamsProperty) {
        cdkBuilder.containerParams(containerParams)
    }

    /**
     * @param isolationMode The isolation mode for the process that contains the Lambda function.
     *   The process can run in an isolated runtime environment inside the AWS IoT Greengrass
     *   container, or as a regular process outside any container.
     *
     * Default: `GreengrassContainer`
     */
    public fun isolationMode(isolationMode: String) {
        cdkBuilder.isolationMode(isolationMode)
    }

    public fun build(): CfnComponentVersion.LambdaLinuxProcessParamsProperty = cdkBuilder.build()
}
