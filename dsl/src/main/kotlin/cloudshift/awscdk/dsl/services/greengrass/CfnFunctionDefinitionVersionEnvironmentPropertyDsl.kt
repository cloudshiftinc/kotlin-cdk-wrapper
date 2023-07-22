@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

/**
 * The environment configuration for a Lambda function on the AWS IoT Greengrass core.
 *
 * In an AWS CloudFormation template, `Environment` is a property of the
 * [`FunctionConfiguration`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object variables;
 * EnvironmentProperty environmentProperty = EnvironmentProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
 */
@CdkDslMarker
public class CfnFunctionDefinitionVersionEnvironmentPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinitionVersion.EnvironmentProperty.Builder =
      CfnFunctionDefinitionVersion.EnvironmentProperty.builder()

  private val _resourceAccessPolicies: MutableList<Any> = mutableListOf()

  /**
   * @param accessSysfs Indicates whether the function is allowed to access the `/sys` directory on
   * the core device, which allows the read device information from `/sys` .
   *
   * This property applies only to Lambda functions that run in a Greengrass container.
   */
  public fun accessSysfs(accessSysfs: Boolean) {
    cdkBuilder.accessSysfs(accessSysfs)
  }

  /**
   * @param accessSysfs Indicates whether the function is allowed to access the `/sys` directory on
   * the core device, which allows the read device information from `/sys` .
   *
   * This property applies only to Lambda functions that run in a Greengrass container.
   */
  public fun accessSysfs(accessSysfs: IResolvable) {
    cdkBuilder.accessSysfs(accessSysfs)
  }

  /**
   * @param execution Settings for the Lambda execution environment in AWS IoT Greengrass .
   */
  public fun execution(execution: IResolvable) {
    cdkBuilder.execution(execution)
  }

  /**
   * @param execution Settings for the Lambda execution environment in AWS IoT Greengrass .
   */
  public fun execution(execution: CfnFunctionDefinitionVersion.ExecutionProperty) {
    cdkBuilder.execution(execution)
  }

  /**
   * @param resourceAccessPolicies A list of the
   * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
   * in the group that the function can access, with the corresponding read-only or read-write
   * permissions. The maximum is 10 resources.
   *
   * This property applies only to Lambda functions that run in a Greengrass container.
   */
  public fun resourceAccessPolicies(vararg resourceAccessPolicies: Any) {
    _resourceAccessPolicies.addAll(listOf(*resourceAccessPolicies))
  }

  /**
   * @param resourceAccessPolicies A list of the
   * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
   * in the group that the function can access, with the corresponding read-only or read-write
   * permissions. The maximum is 10 resources.
   *
   * This property applies only to Lambda functions that run in a Greengrass container.
   */
  public fun resourceAccessPolicies(resourceAccessPolicies: Collection<Any>) {
    _resourceAccessPolicies.addAll(resourceAccessPolicies)
  }

  /**
   * @param resourceAccessPolicies A list of the
   * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
   * in the group that the function can access, with the corresponding read-only or read-write
   * permissions. The maximum is 10 resources.
   *
   * This property applies only to Lambda functions that run in a Greengrass container.
   */
  public fun resourceAccessPolicies(resourceAccessPolicies: IResolvable) {
    cdkBuilder.resourceAccessPolicies(resourceAccessPolicies)
  }

  /**
   * @param variables Environment variables for the Lambda function.
   */
  public fun variables(variables: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(variables)
    cdkBuilder.variables(builder.map)
  }

  /**
   * @param variables Environment variables for the Lambda function.
   */
  public fun variables(variables: Any) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnFunctionDefinitionVersion.EnvironmentProperty {
    if(_resourceAccessPolicies.isNotEmpty())
        cdkBuilder.resourceAccessPolicies(_resourceAccessPolicies)
    return cdkBuilder.build()
  }
}
