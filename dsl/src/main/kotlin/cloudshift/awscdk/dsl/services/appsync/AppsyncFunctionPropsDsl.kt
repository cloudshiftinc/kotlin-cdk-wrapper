@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.AppsyncFunctionProps
import software.amazon.awscdk.services.appsync.BaseDataSource
import software.amazon.awscdk.services.appsync.Code
import software.amazon.awscdk.services.appsync.FunctionRuntime
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.MappingTemplate

/**
 * the CDK properties for AppSync Functions.
 *
 * Example:
 *
 * ```
 * GraphqlApi api;
 * AppsyncFunction appsyncFunction = AppsyncFunction.Builder.create(this, "function")
 * .name("appsync_function")
 * .api(api)
 * .dataSource(api.addNoneDataSource("none"))
 * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
 * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
 * .build();
 * ```
 */
@CdkDslMarker
public class AppsyncFunctionPropsDsl {
  private val cdkBuilder: AppsyncFunctionProps.Builder = AppsyncFunctionProps.builder()

  /**
   * @param api the GraphQL Api linked to this AppSync Function. 
   */
  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  /**
   * @param code The function code.
   */
  public fun code(code: Code) {
    cdkBuilder.code(code)
  }

  /**
   * @param dataSource the data source linked to this AppSync Function. 
   */
  public fun dataSource(dataSource: BaseDataSource) {
    cdkBuilder.dataSource(dataSource)
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

  public fun build(): AppsyncFunctionProps = cdkBuilder.build()
}
