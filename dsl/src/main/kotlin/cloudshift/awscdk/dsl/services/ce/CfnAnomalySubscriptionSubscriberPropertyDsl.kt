@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ce.CfnAnomalySubscription

@CdkDslMarker
public class CfnAnomalySubscriptionSubscriberPropertyDsl {
  private val cdkBuilder: CfnAnomalySubscription.SubscriberProperty.Builder =
      CfnAnomalySubscription.SubscriberProperty.builder()

  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnAnomalySubscription.SubscriberProperty = cdkBuilder.build()
}
