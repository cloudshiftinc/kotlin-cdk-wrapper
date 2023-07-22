@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps
import software.amazon.awscdk.services.appsync.Code
import software.amazon.awscdk.services.appsync.FunctionRuntime
import software.amazon.awscdk.services.appsync.MappingTemplate

@CdkDslMarker
public class BaseAppsyncFunctionPropsDsl {
  private val cdkBuilder: BaseAppsyncFunctionProps.Builder = BaseAppsyncFunctionProps.builder()

  /**
   * @param code The function code.
   */
  public fun code(code: Code) {
    cdkBuilder.code(code)
  }

  /**
   * @param description the description for this AppSync Function.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name the name of the AppSync Function. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param requestMappingTemplate the request mapping template for the AppSync Function.
   */
  public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
    cdkBuilder.requestMappingTemplate(requestMappingTemplate)
  }

  /**
   * @param responseMappingTemplate the response mapping template for the AppSync Function.
   */
  public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
    cdkBuilder.responseMappingTemplate(responseMappingTemplate)
  }

  /**
   * @param runtime The functions runtime.
   */
  public fun runtime(runtime: FunctionRuntime) {
    cdkBuilder.runtime(runtime)
  }

  public fun build(): BaseAppsyncFunctionProps = cdkBuilder.build()
}
