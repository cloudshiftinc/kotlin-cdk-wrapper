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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition

/**
 * A function is a Lambda function that's referenced from an AWS IoT Greengrass group.
 *
 * The function is deployed to a Greengrass core where it runs locally. For more information, see
 * [Run Lambda Functions on the AWS IoT Greengrass Core](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-functions.html)
 * in the *Developer Guide* .
 *
 * In an AWS CloudFormation template, the `Functions` property of the
 * [`FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html)
 * property type contains a list of `Function` property types.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object variables;
 * FunctionProperty functionProperty = FunctionProperty.builder()
 * .functionArn("functionArn")
 * .functionConfiguration(FunctionConfigurationProperty.builder()
 * .encodingType("encodingType")
 * .environment(EnvironmentProperty.builder()
 * .accessSysfs(false)
 * .execution(ExecutionProperty.builder()
 * .isolationMode("isolationMode")
 * .runAs(RunAsProperty.builder()
 * .gid(123)
 * .uid(123)
 * .build())
 * .build())
 * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
 * .resourceId("resourceId")
 * // the properties below are optional
 * .permission("permission")
 * .build()))
 * .variables(variables)
 * .build())
 * .execArgs("execArgs")
 * .executable("executable")
 * .memorySize(123)
 * .pinned(false)
 * .timeout(123)
 * .build())
 * .id("id")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
 */
@CdkDslMarker
public class CfnFunctionDefinitionFunctionPropertyDsl {
    private val cdkBuilder: CfnFunctionDefinition.FunctionProperty.Builder =
        CfnFunctionDefinition.FunctionProperty.builder()

    /**
     * @param functionArn The Amazon Resource Name (ARN) of the alias (recommended) or version of
     *   the referenced Lambda function.
     */
    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    /**
     * @param functionConfiguration The group-specific settings of the Lambda function. These
     *   settings configure the function's behavior in the Greengrass group.
     */
    public fun functionConfiguration(functionConfiguration: IResolvable) {
        cdkBuilder.functionConfiguration(functionConfiguration)
    }

    /**
     * @param functionConfiguration The group-specific settings of the Lambda function. These
     *   settings configure the function's behavior in the Greengrass group.
     */
    public fun functionConfiguration(
        functionConfiguration: CfnFunctionDefinition.FunctionConfigurationProperty
    ) {
        cdkBuilder.functionConfiguration(functionConfiguration)
    }

    /**
     * @param id A descriptive or arbitrary ID for the function. This value must be unique within
     *   the function definition version. Maximum length is 128 characters with pattern
     *   `[a-zA-Z0-9:_-]+` .
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun build(): CfnFunctionDefinition.FunctionProperty = cdkBuilder.build()
}
