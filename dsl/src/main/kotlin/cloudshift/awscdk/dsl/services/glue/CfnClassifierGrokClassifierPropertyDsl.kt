@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnClassifier

@CdkDslMarker
public class CfnClassifierGrokClassifierPropertyDsl {
  private val cdkBuilder: CfnClassifier.GrokClassifierProperty.Builder =
      CfnClassifier.GrokClassifierProperty.builder()

  public fun classification(classification: String) {
    cdkBuilder.classification(classification)
  }

  public fun customPatterns(customPatterns: String) {
    cdkBuilder.customPatterns(customPatterns)
  }

  public fun grokPattern(grokPattern: String) {
    cdkBuilder.grokPattern(grokPattern)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnClassifier.GrokClassifierProperty = cdkBuilder.build()
}
