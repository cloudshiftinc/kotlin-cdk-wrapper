@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition

@CdkDslMarker
public class CfnSubscriptionDefinitionSubscriptionDefinitionVersionPropertyDsl {
  private val cdkBuilder: CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty.Builder =
      CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty.builder()

  private val _subscriptions: MutableList<Any> = mutableListOf()

  public fun subscriptions(vararg subscriptions: Any) {
    _subscriptions.addAll(listOf(*subscriptions))
  }

  public fun subscriptions(subscriptions: Collection<Any>) {
    _subscriptions.addAll(subscriptions)
  }

  public fun subscriptions(subscriptions: IResolvable) {
    cdkBuilder.subscriptions(subscriptions)
  }

  public fun build(): CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty {
    if(_subscriptions.isNotEmpty()) cdkBuilder.subscriptions(_subscriptions)
    return cdkBuilder.build()
  }
}
