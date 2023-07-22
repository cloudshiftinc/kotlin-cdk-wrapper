@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnClassifier

@CdkDslMarker
public class CfnClassifierJsonClassifierPropertyDsl {
  private val cdkBuilder: CfnClassifier.JsonClassifierProperty.Builder =
      CfnClassifier.JsonClassifierProperty.builder()

  /**
   * @param jsonPath A `JsonPath` string defining the JSON data for the classifier to classify. 
   * AWS Glue supports a subset of `JsonPath` , as described in [Writing JsonPath Custom
   * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json)
   * .
   */
  public fun jsonPath(jsonPath: String) {
    cdkBuilder.jsonPath(jsonPath)
  }

  /**
   * @param name The name of the classifier.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnClassifier.JsonClassifierProperty = cdkBuilder.build()
}
