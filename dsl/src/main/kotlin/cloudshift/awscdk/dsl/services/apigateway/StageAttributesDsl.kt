@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.StageAttributes

/**
 * The attributes of an imported Stage.
 *
 * Example:
 *
 * ```
 * IRestApi restApi;
 * IStage importedStage = Stage.fromStageAttributes(this, "imported-stage",
 * StageAttributes.builder()
 * .stageName("myStageName")
 * .restApi(restApi)
 * .build());
 * importedStage.addApiKey("MyApiKey");
 * ```
 */
@CdkDslMarker
public class StageAttributesDsl {
  private val cdkBuilder: StageAttributes.Builder = StageAttributes.builder()

  /**
   * @param restApi The RestApi that the stage belongs to. 
   */
  public fun restApi(restApi: IRestApi) {
    cdkBuilder.restApi(restApi)
  }

  /**
   * @param stageName The name of the stage. 
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun build(): StageAttributes = cdkBuilder.build()
}
