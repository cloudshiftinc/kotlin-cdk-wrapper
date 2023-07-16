@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.TimeConversionOptions

@CdkDslMarker
public class TimeConversionOptionsDsl {
  private val cdkBuilder: TimeConversionOptions.Builder = TimeConversionOptions.builder()

  public fun integral(integral: Boolean) {
    cdkBuilder.integral(integral)
  }

  public fun build(): TimeConversionOptions = cdkBuilder.build()
}
