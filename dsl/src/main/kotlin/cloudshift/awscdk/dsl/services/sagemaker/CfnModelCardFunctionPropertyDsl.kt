@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardFunctionPropertyDsl {
  private val cdkBuilder: CfnModelCard.FunctionProperty.Builder =
      CfnModelCard.FunctionProperty.builder()

  public fun condition(condition: String) {
    cdkBuilder.condition(condition)
  }

  public fun facet(facet: String) {
    cdkBuilder.facet(facet)
  }

  public fun function(function: String) {
    cdkBuilder.function(function)
  }

  public fun build(): CfnModelCard.FunctionProperty = cdkBuilder.build()
}
