@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.apigateway.BasePathMapping
import software.amazon.awscdk.services.apigateway.IDomainName
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.Stage
import software.constructs.Construct

@CdkDslMarker
public class BasePathMappingDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: BasePathMapping.Builder = BasePathMapping.Builder.create(scope, id)

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

  public fun build(): BasePathMapping = cdkBuilder.build()
}
