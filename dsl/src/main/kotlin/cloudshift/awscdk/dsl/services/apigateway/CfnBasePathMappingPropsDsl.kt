@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps

@CdkDslMarker
public class CfnBasePathMappingPropsDsl {
  private val cdkBuilder: CfnBasePathMappingProps.Builder = CfnBasePathMappingProps.builder()

  /**
   * @param basePath The base path name that callers of the API must provide as part of the URL
   * after the domain name.
   */
  public fun basePath(basePath: String) {
    cdkBuilder.basePath(basePath)
  }

  /**
   * @param domainName The domain name of the BasePathMapping resource to be described. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param id the value to be set.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param restApiId The string identifier of the associated RestApi.
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  /**
   * @param stage The name of the associated stage.
   */
  public fun stage(stage: String) {
    cdkBuilder.stage(stage)
  }

  public fun build(): CfnBasePathMappingProps = cdkBuilder.build()
}
