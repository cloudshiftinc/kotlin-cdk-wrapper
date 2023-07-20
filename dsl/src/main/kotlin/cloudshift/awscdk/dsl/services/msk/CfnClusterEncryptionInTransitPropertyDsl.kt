@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterEncryptionInTransitPropertyDsl {
  private val cdkBuilder: CfnCluster.EncryptionInTransitProperty.Builder =
      CfnCluster.EncryptionInTransitProperty.builder()

  public fun clientBroker(clientBroker: String) {
    cdkBuilder.clientBroker(clientBroker)
  }

  public fun inCluster(inCluster: Boolean) {
    cdkBuilder.inCluster(inCluster)
  }

  public fun inCluster(inCluster: IResolvable) {
    cdkBuilder.inCluster(inCluster)
  }

  public fun build(): CfnCluster.EncryptionInTransitProperty = cdkBuilder.build()
}
