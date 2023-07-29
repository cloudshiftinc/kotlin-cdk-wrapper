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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps

/**
 * Properties for defining a `CfnFunctionDefinitionVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object variables;
 * CfnFunctionDefinitionVersionProps cfnFunctionDefinitionVersionProps =
 * CfnFunctionDefinitionVersionProps.builder()
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
public class CfnFunctionDefinitionVersionPropsDsl {
    private val cdkBuilder: CfnFunctionDefinitionVersionProps.Builder =
        CfnFunctionDefinitionVersionProps.builder()

    private val _functions: MutableList<Any> = mutableListOf()

    /**
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     *   group. Individual Lambda functions can override these settings.
     */
    public fun defaultConfig(defaultConfig: IResolvable) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    /**
     * @param defaultConfig The default configuration that applies to all Lambda functions in the
     *   group. Individual Lambda functions can override these settings.
     */
    public fun defaultConfig(defaultConfig: CfnFunctionDefinitionVersion.DefaultConfigProperty) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    /**
     * @param functionDefinitionId The ID of the function definition associated with this version.
     *   This value is a GUID.
     */
    public fun functionDefinitionId(functionDefinitionId: String) {
        cdkBuilder.functionDefinitionId(functionDefinitionId)
    }

    /** @param functions The functions in this version. */
    public fun functions(vararg functions: Any) {
        _functions.addAll(listOf(*functions))
    }

    /** @param functions The functions in this version. */
    public fun functions(functions: Collection<Any>) {
        _functions.addAll(functions)
    }

    /** @param functions The functions in this version. */
    public fun functions(functions: IResolvable) {
        cdkBuilder.functions(functions)
    }

    public fun build(): CfnFunctionDefinitionVersionProps {
        if (_functions.isNotEmpty()) cdkBuilder.functions(_functions)
        return cdkBuilder.build()
    }
}
