@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps

@CdkDslMarker
public class CfnSubscriptionDefinitionVersionPropsDsl {
  private val cdkBuilder: CfnSubscriptionDefinitionVersionProps.Builder =
      CfnSubscriptionDefinitionVersionProps.builder()

  private val _subscriptions: MutableList<Any> = mutableListOf()

  /**
   * @param subscriptionDefinitionId The ID of the subscription definition associated with this
   * version. 
   * This value is a GUID.
   */
  public fun subscriptionDefinitionId(subscriptionDefinitionId: String) {
    cdkBuilder.subscriptionDefinitionId(subscriptionDefinitionId)
  }

  /**
   * @param subscriptions The subscriptions in this version. 
   */
  public fun subscriptions(vararg subscriptions: Any) {
    _subscriptions.addAll(listOf(*subscriptions))
  }

  /**
   * @param subscriptions The subscriptions in this version. 
   */
  public fun subscriptions(subscriptions: Collection<Any>) {
    _subscriptions.addAll(subscriptions)
  }

  /**
   * @param subscriptions The subscriptions in this version. 
   */
  public fun subscriptions(subscriptions: IResolvable) {
    cdkBuilder.subscriptions(subscriptions)
  }

  public fun build(): CfnSubscriptionDefinitionVersionProps {
    if(_subscriptions.isNotEmpty()) cdkBuilder.subscriptions(_subscriptions)
    return cdkBuilder.build()
  }
}
