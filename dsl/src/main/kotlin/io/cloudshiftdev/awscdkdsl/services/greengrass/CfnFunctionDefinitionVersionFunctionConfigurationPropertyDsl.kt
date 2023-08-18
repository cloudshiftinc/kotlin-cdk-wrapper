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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

/**
 * The group-specific configuration settings for a Lambda function.
 *
 * These settings configure the function's behavior in the Greengrass group. For more information,
 * see
 * [Controlling Execution of Greengrass Lambda Functions by Using Group-Specific Configuration](https://docs.aws.amazon.com/greengrass/latest/developerguide/lambda-group-config.html)
 * in the *Developer Guide* .
 *
 * In an AWS CloudFormation template, `FunctionConfiguration` is a property of the
 * [`Function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-function.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object variables;
 * FunctionConfigurationProperty functionConfigurationProperty =
 * FunctionConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html)
 */
@CdkDslMarker
public class CfnFunctionDefinitionVersionFunctionConfigurationPropertyDsl {
    private val cdkBuilder: CfnFunctionDefinitionVersion.FunctionConfigurationProperty.Builder =
        CfnFunctionDefinitionVersion.FunctionConfigurationProperty.builder()

    /**
     * @param encodingType The expected encoding type of the input payload for the function. Valid
     *   values are `json` (default) and `binary` .
     */
    public fun encodingType(encodingType: String) {
        cdkBuilder.encodingType(encodingType)
    }

    /** @param environment The environment configuration of the function. */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /** @param environment The environment configuration of the function. */
    public fun environment(environment: CfnFunctionDefinitionVersion.EnvironmentProperty) {
        cdkBuilder.environment(environment)
    }

    /** @param execArgs The execution arguments. */
    public fun execArgs(execArgs: String) {
        cdkBuilder.execArgs(execArgs)
    }

    /** @param executable The name of the function executable. */
    public fun executable(executable: String) {
        cdkBuilder.executable(executable)
    }

    /**
     * @param memorySize The memory size (in KB) required by the function.
     *
     * This property applies only to Lambda functions that run in a Greengrass container.
     */
    public fun memorySize(memorySize: Number) {
        cdkBuilder.memorySize(memorySize)
    }

    /**
     * @param pinned Indicates whether the function is pinned (or *long-lived* ). Pinned functions
     *   start when the core starts and process all requests in the same container. The default
     *   value is false.
     */
    public fun pinned(pinned: Boolean) {
        cdkBuilder.pinned(pinned)
    }

    /**
     * @param pinned Indicates whether the function is pinned (or *long-lived* ). Pinned functions
     *   start when the core starts and process all requests in the same container. The default
     *   value is false.
     */
    public fun pinned(pinned: IResolvable) {
        cdkBuilder.pinned(pinned)
    }

    /**
     * @param timeout The allowed execution time (in seconds) after which the function should
     *   terminate. For pinned functions, this timeout applies for each request.
     */
    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CfnFunctionDefinitionVersion.FunctionConfigurationProperty =
        cdkBuilder.build()
}
