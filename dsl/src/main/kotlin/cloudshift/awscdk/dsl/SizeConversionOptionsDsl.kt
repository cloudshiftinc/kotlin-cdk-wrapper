@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.SizeConversionOptions
import software.amazon.awscdk.SizeRoundingBehavior

@CdkDslMarker
public class SizeConversionOptionsDsl {
  private val cdkBuilder: SizeConversionOptions.Builder = SizeConversionOptions.builder()

  public fun rounding(rounding: SizeRoundingBehavior) {
    cdkBuilder.rounding(rounding)
  }

  public fun build(): SizeConversionOptions = cdkBuilder.build()
}
