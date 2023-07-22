@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ce.CfnAnomalySubscription

@CdkDslMarker
public class CfnAnomalySubscriptionResourceTagPropertyDsl {
  private val cdkBuilder: CfnAnomalySubscription.ResourceTagProperty.Builder =
      CfnAnomalySubscription.ResourceTagProperty.builder()

  /**
   * @param key The key that's associated with the tag. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value that's associated with the tag. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnomalySubscription.ResourceTagProperty = cdkBuilder.build()
}
