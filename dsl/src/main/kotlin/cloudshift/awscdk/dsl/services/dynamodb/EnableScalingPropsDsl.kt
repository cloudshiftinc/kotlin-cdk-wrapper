@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.dynamodb.EnableScalingProps

@CdkDslMarker
public class EnableScalingPropsDsl {
  private val cdkBuilder: EnableScalingProps.Builder = EnableScalingProps.builder()

  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): EnableScalingProps = cdkBuilder.build()
}
