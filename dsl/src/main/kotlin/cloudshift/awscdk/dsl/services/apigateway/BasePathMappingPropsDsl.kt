@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.apigateway.BasePathMappingProps
import software.amazon.awscdk.services.apigateway.IDomainName
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.Stage

@CdkDslMarker
public class BasePathMappingPropsDsl {
  private val cdkBuilder: BasePathMappingProps.Builder = BasePathMappingProps.builder()

  /**
   * @param attachToStage Whether to attach the base path mapping to a stage.
   * Use this property to create a base path mapping without attaching it to the Rest API default
   * stage.
   * This property is ignored if `stage` is provided.
   */
  public fun attachToStage(attachToStage: Boolean) {
    cdkBuilder.attachToStage(attachToStage)
  }

  /**
   * @param basePath The base path name that callers of the API must provide in the URL after the
   * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
   * string.
   */
  public fun basePath(basePath: String) {
    cdkBuilder.basePath(basePath)
  }

  /**
   * @param domainName The DomainName to associate with this base path mapping. 
   */
  public fun domainName(domainName: IDomainName) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param restApi The RestApi resource to target. 
   */
  public fun restApi(restApi: IRestApi) {
    cdkBuilder.restApi(restApi)
  }

  /**
   * @param stage The Deployment stage of API [disable-awslint:ref-via-interface].
   */
  public fun stage(stage: Stage) {
    cdkBuilder.stage(stage)
  }

  public fun build(): BasePathMappingProps = cdkBuilder.build()
}
