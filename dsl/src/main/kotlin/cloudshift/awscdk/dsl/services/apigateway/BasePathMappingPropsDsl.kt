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

  public fun attachToStage(attachToStage: Boolean) {
    cdkBuilder.attachToStage(attachToStage)
  }

  public fun basePath(basePath: String) {
    cdkBuilder.basePath(basePath)
  }

  public fun domainName(domainName: IDomainName) {
    cdkBuilder.domainName(domainName)
  }

  public fun restApi(restApi: IRestApi) {
    cdkBuilder.restApi(restApi)
  }

  public fun stage(stage: Stage) {
    cdkBuilder.stage(stage)
  }

  public fun build(): BasePathMappingProps = cdkBuilder.build()
}
