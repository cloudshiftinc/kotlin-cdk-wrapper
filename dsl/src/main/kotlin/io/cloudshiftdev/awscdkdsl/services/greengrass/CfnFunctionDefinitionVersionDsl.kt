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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.constructs.Construct

/**
 * The `AWS::Greengrass::FunctionDefinitionVersion` resource represents a function definition
 * version for AWS IoT Greengrass .
 *
 * A function definition version contains contain a list of functions.
 *
 * To create a function definition version, you must specify the ID of the function definition that
 * you want to associate with the version. For information about creating a function definition, see
 * [`AWS::Greengrass::FunctionDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html)
 * .
 *
 * After you create a function definition version that contains the functions you want to deploy,
 * you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object variables;
 * CfnFunctionDefinitionVersion cfnFunctionDefinitionVersion =
 * CfnFunctionDefinitionVersion.Builder.create(this, "MyCfnFunctionDefinitionVersion")
 * .functionDefinitionId("functionDefinitionId")
 * .functions(List.of(FunctionProperty.builder()
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
 * .build()))
 * // the properties below are optional
 * .defaultConfig(DefaultConfigProperty.builder()
 * .execution(ExecutionProperty.builder()
 * .isolationMode("isolationMode")
 * .runAs(RunAsProperty.builder()
 * .gid(123)
 * .uid(123)
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
 */
@CdkDslMarker
public class CfnFunctionDefinitionVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFunctionDefinitionVersion.Builder =
        CfnFunctionDefinitionVersion.Builder.create(scope, id)

    private val _functions: MutableList<Any> = mutableListOf()

    /**
     * The default configuration that applies to all Lambda functions in the group.
     *
     * Individual Lambda functions can override these settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-defaultconfig)
     *
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     *   group.
     */
    public fun defaultConfig(defaultConfig: IResolvable) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    /**
     * The default configuration that applies to all Lambda functions in the group.
     *
     * Individual Lambda functions can override these settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-defaultconfig)
     *
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     *   group.
     */
    public fun defaultConfig(defaultConfig: CfnFunctionDefinitionVersion.DefaultConfigProperty) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    /**
     * The ID of the function definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functiondefinitionid)
     *
     * @param functionDefinitionId The ID of the function definition associated with this version.
     */
    public fun functionDefinitionId(functionDefinitionId: String) {
        cdkBuilder.functionDefinitionId(functionDefinitionId)
    }

    /**
     * The functions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
     *
     * @param functions The functions in this version.
     */
    public fun functions(vararg functions: Any) {
        _functions.addAll(listOf(*functions))
    }

    /**
     * The functions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
     *
     * @param functions The functions in this version.
     */
    public fun functions(functions: Collection<Any>) {
        _functions.addAll(functions)
    }

    /**
     * The functions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
     *
     * @param functions The functions in this version.
     */
    public fun functions(functions: IResolvable) {
        cdkBuilder.functions(functions)
    }

    public fun build(): CfnFunctionDefinitionVersion {
        if (_functions.isNotEmpty()) cdkBuilder.functions(_functions)
        return cdkBuilder.build()
    }
}
