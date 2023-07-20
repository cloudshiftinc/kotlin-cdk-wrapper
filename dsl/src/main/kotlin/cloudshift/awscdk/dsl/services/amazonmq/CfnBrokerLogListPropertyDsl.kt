@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnBroker

@CdkDslMarker
public class CfnBrokerLogListPropertyDsl {
  private val cdkBuilder: CfnBroker.LogListProperty.Builder = CfnBroker.LogListProperty.builder()

  public fun audit(audit: Boolean) {
    cdkBuilder.audit(audit)
  }

  public fun audit(audit: IResolvable) {
    cdkBuilder.audit(audit)
  }

  public fun general(general: Boolean) {
    cdkBuilder.general(general)
  }

  public fun general(general: IResolvable) {
    cdkBuilder.general(general)
  }

  public fun build(): CfnBroker.LogListProperty = cdkBuilder.build()
}
