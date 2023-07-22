@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition

/**
 * A function definition version contains a list of functions.
 *
 *
 * After you create a function definition version that contains the functions you want to deploy,
 * you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 *
 * In an AWS CloudFormation template, `FunctionDefinitionVersion` is the property type of the
 * `InitialVersion` property in the
 * [`AWS::Greengrass::FunctionDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html)
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object variables;
 * FunctionDefinitionVersionProperty functionDefinitionVersionProperty =
 * FunctionDefinitionVersionProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html)
 */
@CdkDslMarker
public class CfnFunctionDefinitionFunctionDefinitionVersionPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinition.FunctionDefinitionVersionProperty.Builder =
      CfnFunctionDefinition.FunctionDefinitionVersionProperty.builder()

  private val _functions: MutableList<Any> = mutableListOf()

  /**
   * @param defaultConfig The default configuration that applies to all Lambda functions in the
   * group.
   * Individual Lambda functions can override these settings.
   */
  public fun defaultConfig(defaultConfig: IResolvable) {
    cdkBuilder.defaultConfig(defaultConfig)
  }

  /**
   * @param defaultConfig The default configuration that applies to all Lambda functions in the
   * group.
   * Individual Lambda functions can override these settings.
   */
  public fun defaultConfig(defaultConfig: CfnFunctionDefinition.DefaultConfigProperty) {
    cdkBuilder.defaultConfig(defaultConfig)
  }

  /**
   * @param functions The functions in this version. 
   */
  public fun functions(vararg functions: Any) {
    _functions.addAll(listOf(*functions))
  }

  /**
   * @param functions The functions in this version. 
   */
  public fun functions(functions: Collection<Any>) {
    _functions.addAll(functions)
  }

  /**
   * @param functions The functions in this version. 
   */
  public fun functions(functions: IResolvable) {
    cdkBuilder.functions(functions)
  }

  public fun build(): CfnFunctionDefinition.FunctionDefinitionVersionProperty {
    if(_functions.isNotEmpty()) cdkBuilder.functions(_functions)
    return cdkBuilder.build()
  }
}
