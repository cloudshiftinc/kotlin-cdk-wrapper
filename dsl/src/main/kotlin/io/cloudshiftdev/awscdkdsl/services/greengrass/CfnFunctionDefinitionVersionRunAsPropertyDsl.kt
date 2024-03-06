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

package io.cloudshiftdev.awscdkdsl.services.greengrass

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

/**
 * The user and group permissions used to run the Lambda function.
 *
 * This setting overrides the default access identity that's specified for the group (by default,
 * ggc_user and ggc_group). You can override the user, group, or both. For more information, see
 * [Run as](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-access-identity.html)
 * in the *Developer Guide* .
 *
 * Running as the root user increases risks to your data and device. Do not run as root (UID/GID=0)
 * unless your business case requires it. For more information and requirements, see
 * [Running a Lambda Function as Root](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-running-as-root)
 * .
 *
 * In an AWS CloudFormation template, `RunAs` is a property of the
 * [`Execution`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * RunAsProperty runAsProperty = RunAsProperty.builder()
 * .gid(123)
 * .uid(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html)
 */
@CdkDslMarker
public class CfnFunctionDefinitionVersionRunAsPropertyDsl {
    private val cdkBuilder: CfnFunctionDefinitionVersion.RunAsProperty.Builder =
        CfnFunctionDefinitionVersion.RunAsProperty.builder()

    /**
     * @param gid The group ID whose permissions are used to run the Lambda function. You can use
     *   the `getent group` command on your core device to look up the group ID.
     */
    public fun gid(gid: Number) {
        cdkBuilder.gid(gid)
    }

    /**
     * @param uid The user ID whose permissions are used to run the Lambda function. You can use the
     *   `getent passwd` command on your core device to look up the user ID.
     */
    public fun uid(uid: Number) {
        cdkBuilder.uid(uid)
    }

    public fun build(): CfnFunctionDefinitionVersion.RunAsProperty = cdkBuilder.build()
}
