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

  public fun code(code: Code) {
    cdkBuilder.code(code)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
    cdkBuilder.requestMappingTemplate(requestMappingTemplate)
  }

  public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
    cdkBuilder.responseMappingTemplate(responseMappingTemplate)
  }

  public fun runtime(runtime: FunctionRuntime) {
    cdkBuilder.runtime(runtime)
  }

  public fun build(): BaseAppsyncFunctionProps = cdkBuilder.build()
}
