@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps

@CdkDslMarker
public class CfnFunctionDefinitionVersionPropsDsl {
  private val cdkBuilder: CfnFunctionDefinitionVersionProps.Builder =
      CfnFunctionDefinitionVersionProps.builder()

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
  public fun defaultConfig(defaultConfig: CfnFunctionDefinitionVersion.DefaultConfigProperty) {
    cdkBuilder.defaultConfig(defaultConfig)
  }

  /**
   * @param functionDefinitionId The ID of the function definition associated with this version. 
   * This value is a GUID.
   */
  public fun functionDefinitionId(functionDefinitionId: String) {
    cdkBuilder.functionDefinitionId(functionDefinitionId)
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

  public fun build(): CfnFunctionDefinitionVersionProps {
    if(_functions.isNotEmpty()) cdkBuilder.functions(_functions)
    return cdkBuilder.build()
  }
}
