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

  /**
   * @param findMatchesParameters The parameters for the find matches algorithm.
   */
  public fun findMatchesParameters(findMatchesParameters: IResolvable) {
    cdkBuilder.findMatchesParameters(findMatchesParameters)
  }

  /**
   * @param findMatchesParameters The parameters for the find matches algorithm.
   */
  public
      fun findMatchesParameters(findMatchesParameters: CfnMLTransform.FindMatchesParametersProperty) {
    cdkBuilder.findMatchesParameters(findMatchesParameters)
  }

  /**
   * @param transformType The type of machine learning transform. `FIND_MATCHES` is the only option.
   * 
   * For information about the types of machine learning transforms, see [Creating Machine Learning
   * Transforms](https://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html) .
   */
  public fun transformType(transformType: String) {
    cdkBuilder.transformType(transformType)
  }

  public fun build(): CfnMLTransform.TransformParametersProperty = cdkBuilder.build()
}
