@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnMLTransform

@CdkDslMarker
public class CfnMLTransformTransformParametersPropertyDsl {
  private val cdkBuilder: CfnMLTransform.TransformParametersProperty.Builder =
      CfnMLTransform.TransformParametersProperty.builder()

  public fun findMatchesParameters(findMatchesParameters: IResolvable) {
    cdkBuilder.findMatchesParameters(findMatchesParameters)
  }

  public
      fun findMatchesParameters(findMatchesParameters: CfnMLTransform.FindMatchesParametersProperty) {
    cdkBuilder.findMatchesParameters(findMatchesParameters)
  }

  public fun transformType(transformType: String) {
    cdkBuilder.transformType(transformType)
  }

  public fun build(): CfnMLTransform.TransformParametersProperty = cdkBuilder.build()
}
