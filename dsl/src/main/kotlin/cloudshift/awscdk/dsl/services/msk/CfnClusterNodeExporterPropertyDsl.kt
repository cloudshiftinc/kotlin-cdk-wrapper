@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterNodeExporterPropertyDsl {
  private val cdkBuilder: CfnCluster.NodeExporterProperty.Builder =
      CfnCluster.NodeExporterProperty.builder()

  /**
   * @param enabledInBroker Indicates whether you want to enable or disable the Node Exporter. 
   */
  public fun enabledInBroker(enabledInBroker: Boolean) {
    cdkBuilder.enabledInBroker(enabledInBroker)
  }

  /**
   * @param enabledInBroker Indicates whether you want to enable or disable the Node Exporter. 
   */
  public fun enabledInBroker(enabledInBroker: IResolvable) {
    cdkBuilder.enabledInBroker(enabledInBroker)
  }

  public fun build(): CfnCluster.NodeExporterProperty = cdkBuilder.build()
}
