@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.robomaker.CfnFleetProps

@CdkDslMarker
public class CfnFleetPropsDsl {
  private val cdkBuilder: CfnFleetProps.Builder = CfnFleetProps.builder()

  /**
   * @param name The name of the fleet.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags The list of all tags added to the fleet.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnFleetProps = cdkBuilder.build()
}
