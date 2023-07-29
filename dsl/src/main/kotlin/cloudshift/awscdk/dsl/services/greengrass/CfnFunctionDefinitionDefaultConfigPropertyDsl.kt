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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition

/**
 * The default configuration that applies to all Lambda functions in the function definition
 * version.
 *
 * Individual Lambda functions can override these settings.
 *
 * In an AWS CloudFormation template, `DefaultConfig` is a property of the
 * [`FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html)
 * property type.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-defaultconfig.html)
 */
@CdkDslMarker
public class CfnFunctionDefinitionDefaultConfigPropertyDsl {
    private val cdkBuilder: CfnFunctionDefinition.DefaultConfigProperty.Builder =
        CfnFunctionDefinition.DefaultConfigProperty.builder()

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
    public fun execution(execution: CfnFunctionDefinition.ExecutionProperty) {
        cdkBuilder.execution(execution)
    }

    public fun build(): CfnFunctionDefinition.DefaultConfigProperty = cdkBuilder.build()
}
