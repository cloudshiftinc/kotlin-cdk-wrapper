@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@CdkDslMarker
public class CfnApplicationLogPatternPropertyDsl {
  private val cdkBuilder: CfnApplication.LogPatternProperty.Builder =
      CfnApplication.LogPatternProperty.builder()

  public fun pattern(pattern: String) {
    cdkBuilder.pattern(pattern)
  }

  public fun patternName(patternName: String) {
    cdkBuilder.patternName(patternName)
  }

  public fun rank(rank: Number) {
    cdkBuilder.rank(rank)
  }

  public fun build(): CfnApplication.LogPatternProperty = cdkBuilder.build()
}
