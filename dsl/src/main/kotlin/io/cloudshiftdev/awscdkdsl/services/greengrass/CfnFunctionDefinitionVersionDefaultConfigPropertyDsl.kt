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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

/**
 * The default configuration that applies to all Lambda functions in the function definition
 * version.
 *
 * Individual Lambda functions can override these settings.
 *
 * In an AWS CloudFormation template, `DefaultConfig` is a property of the
 * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * DefaultConfigProperty defaultConfigProperty = DefaultConfigProperty.builder()
 * .execution(ExecutionProperty.builder()
 * .isolationMode("isolationMode")
 * .runAs(RunAsProperty.builder()
 * .gid(123)
 * .uid(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
 */
@CdkDslMarker
public class CfnFunctionDefinitionVersionDefaultConfigPropertyDsl {
    private val cdkBuilder: CfnFunctionDefinitionVersion.DefaultConfigProperty.Builder =
        CfnFunctionDefinitionVersion.DefaultConfigProperty.builder()

    /**
     * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
     *   Greengrass core.
     */
    public fun execution(execution: IResolvable) {
        cdkBuilder.execution(execution)
    }

    /**
     * @param execution Configuration settings for the Lambda execution environment on the AWS IoT
     *   Greengrass core.
     */
    public fun execution(execution: CfnFunctionDefinitionVersion.ExecutionProperty) {
        cdkBuilder.execution(execution)
    }

    public fun build(): CfnFunctionDefinitionVersion.DefaultConfigProperty = cdkBuilder.build()
}
