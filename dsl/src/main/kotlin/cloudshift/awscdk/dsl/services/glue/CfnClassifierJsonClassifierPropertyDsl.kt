@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnClassifier

@CdkDslMarker
public class CfnClassifierJsonClassifierPropertyDsl {
  private val cdkBuilder: CfnClassifier.JsonClassifierProperty.Builder =
      CfnClassifier.JsonClassifierProperty.builder()

  public fun jsonPath(jsonPath: String) {
    cdkBuilder.jsonPath(jsonPath)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnClassifier.JsonClassifierProperty = cdkBuilder.build()
}
