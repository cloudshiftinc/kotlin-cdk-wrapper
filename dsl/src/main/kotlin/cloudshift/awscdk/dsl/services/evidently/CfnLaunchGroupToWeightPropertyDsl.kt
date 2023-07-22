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

  /**
   * @param groupName The name of the launch group. 
   * It can include up to 127 characters.
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * @param splitWeight The portion of launch traffic to allocate to this launch group. 
   * This is represented in thousandths of a percent. For example, specify 20,000 to allocate 20% of
   * the launch audience to this launch group.
   */
  public fun splitWeight(splitWeight: Number) {
    cdkBuilder.splitWeight(splitWeight)
  }

  public fun build(): CfnLaunch.GroupToWeightProperty = cdkBuilder.build()
}
