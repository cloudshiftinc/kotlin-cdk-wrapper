@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.MathExpressionOptions

@CdkDslMarker
public class MathExpressionOptionsDsl {
  private val cdkBuilder: MathExpressionOptions.Builder = MathExpressionOptions.builder()

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  public fun period(period: Duration) {
    cdkBuilder.period(period)
  }

  public fun searchAccount(searchAccount: String) {
    cdkBuilder.searchAccount(searchAccount)
  }

  public fun searchRegion(searchRegion: String) {
    cdkBuilder.searchRegion(searchRegion)
  }

  public fun build(): MathExpressionOptions = cdkBuilder.build()
}
