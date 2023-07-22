@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.constructs.Construct

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
   * @param defaultConfig The default configuration that applies to all Lambda functions in the
   * group. 
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
   * @param defaultConfig The default configuration that applies to all Lambda functions in the
   * group. 
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
   * @param functionDefinitionId The ID of the function definition associated with this version. 
   */
  public fun functionDefinitionId(functionDefinitionId: String) {
    cdkBuilder.functionDefinitionId(functionDefinitionId)
  }

  /**
   * The functions in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
   * @param functions The functions in this version. 
   */
  public fun functions(vararg functions: Any) {
    _functions.addAll(listOf(*functions))
  }

  /**
   * The functions in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
   * @param functions The functions in this version. 
   */
  public fun functions(functions: Collection<Any>) {
    _functions.addAll(functions)
  }

  /**
   * The functions in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html#cfn-greengrass-functiondefinitionversion-functions)
   * @param functions The functions in this version. 
   */
  public fun functions(functions: IResolvable) {
    cdkBuilder.functions(functions)
  }

  public fun build(): CfnFunctionDefinitionVersion {
    if(_functions.isNotEmpty()) cdkBuilder.functions(_functions)
    return cdkBuilder.build()
  }
}
