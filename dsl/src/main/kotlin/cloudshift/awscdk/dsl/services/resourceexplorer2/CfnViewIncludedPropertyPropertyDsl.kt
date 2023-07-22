@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourceexplorer2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.resourceexplorer2.CfnView

@CdkDslMarker
public class CfnViewIncludedPropertyPropertyDsl {
  private val cdkBuilder: CfnView.IncludedPropertyProperty.Builder =
      CfnView.IncludedPropertyProperty.builder()

  /**
   * @param name The name of the property that is included in this view. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnView.IncludedPropertyProperty = cdkBuilder.build()
}
