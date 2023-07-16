@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnLaunch

@CdkDslMarker
public class CfnLaunchGroupToWeightPropertyDsl {
  private val cdkBuilder: CfnLaunch.GroupToWeightProperty.Builder =
      CfnLaunch.GroupToWeightProperty.builder()

  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  public fun splitWeight(splitWeight: Number) {
    cdkBuilder.splitWeight(splitWeight)
  }

  public fun build(): CfnLaunch.GroupToWeightProperty = cdkBuilder.build()
}
