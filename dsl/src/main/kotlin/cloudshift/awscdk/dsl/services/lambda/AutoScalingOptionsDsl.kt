@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lambda.AutoScalingOptions

@CdkDslMarker
public class AutoScalingOptionsDsl {
  private val cdkBuilder: AutoScalingOptions.Builder = AutoScalingOptions.builder()

  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): AutoScalingOptions = cdkBuilder.build()
}
