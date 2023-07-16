@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnSubscriptionDefinitionVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSubscriptionDefinitionVersion.Builder =
      CfnSubscriptionDefinitionVersion.Builder.create(scope, id)

  private val _subscriptions: MutableList<Any> = mutableListOf()

  public fun subscriptionDefinitionId(subscriptionDefinitionId: String) {
    cdkBuilder.subscriptionDefinitionId(subscriptionDefinitionId)
  }

  public fun subscriptions(vararg subscriptions: Any) {
    _subscriptions.addAll(listOf(*subscriptions))
  }

  public fun subscriptions(subscriptions: Collection<Any>) {
    _subscriptions.addAll(subscriptions)
  }

  public fun subscriptions(subscriptions: IResolvable) {
    cdkBuilder.subscriptions(subscriptions)
  }

  public fun build(): CfnSubscriptionDefinitionVersion {
    if(_subscriptions.isNotEmpty()) cdkBuilder.subscriptions(_subscriptions)
    return cdkBuilder.build()
  }
}
