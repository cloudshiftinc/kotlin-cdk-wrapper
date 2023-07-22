@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition
import software.constructs.Construct

/**
 * The `AWS::Greengrass::FunctionDefinition` resource represents a function definition for AWS IoT
 * Greengrass .
 *
 * Function definitions are used to organize your function definition versions.
 *
 * Function definitions can reference multiple function definition versions. All function definition
 * versions must be associated with a function definition. Each function definition version can contain
 * one or more functions.
 *
 *
 * When you create a function definition, you can optionally include an initial function definition
 * version. To associate a function definition version later, create an
 * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
 * resource and specify the ID of this function definition.
 *
 * After you create the function definition version that contains the functions you want to deploy,
 * you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object tags;
 * Object variables;
 * CfnFunctionDefinition cfnFunctionDefinition = CfnFunctionDefinition.Builder.create(this,
 * "MyCfnFunctionDefinition")
 * .name("name")
 * // the properties below are optional
 * .initialVersion(FunctionDefinitionVersionProperty.builder()
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
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html)
 */
@CdkDslMarker
public class CfnFunctionDefinitionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFunctionDefinition.Builder =
      CfnFunctionDefinition.Builder.create(scope, id)

  /**
   * The function definition version to include when the function definition is created.
   *
   * A function definition version contains a list of
   * [`function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
   * property types.
   *
   *
   * To associate a function definition version after the function definition is created, create an
   * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
   * resource and specify the ID of this function definition.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-initialversion)
   * @param initialVersion The function definition version to include when the function definition
   * is created. 
   */
  public fun initialVersion(initialVersion: IResolvable) {
    cdkBuilder.initialVersion(initialVersion)
  }

  /**
   * The function definition version to include when the function definition is created.
   *
   * A function definition version contains a list of
   * [`function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
   * property types.
   *
   *
   * To associate a function definition version after the function definition is created, create an
   * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
   * resource and specify the ID of this function definition.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-initialversion)
   * @param initialVersion The function definition version to include when the function definition
   * is created. 
   */
  public
      fun initialVersion(initialVersion: CfnFunctionDefinition.FunctionDefinitionVersionProperty) {
    cdkBuilder.initialVersion(initialVersion)
  }

  /**
   * The name of the function definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-name)
   * @param name The name of the function definition. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Application-specific metadata to attach to the function definition.
   *
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
   * Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
   * in the *Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-tags)
   * @param tags Application-specific metadata to attach to the function definition. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * Application-specific metadata to attach to the function definition.
   *
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
   * Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
   * in the *Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html#cfn-greengrass-functiondefinition-tags)
   * @param tags Application-specific metadata to attach to the function definition. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnFunctionDefinition = cdkBuilder.build()
}
