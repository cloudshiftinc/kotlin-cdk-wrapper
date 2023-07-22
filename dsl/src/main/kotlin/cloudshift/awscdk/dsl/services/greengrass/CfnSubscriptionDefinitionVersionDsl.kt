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

  /**
   * The ID of the subscription definition associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptiondefinitionid)
   * @param subscriptionDefinitionId The ID of the subscription definition associated with this
   * version. 
   */
  public fun subscriptionDefinitionId(subscriptionDefinitionId: String) {
    cdkBuilder.subscriptionDefinitionId(subscriptionDefinitionId)
  }

  /**
   * The subscriptions in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
   * @param subscriptions The subscriptions in this version. 
   */
  public fun subscriptions(vararg subscriptions: Any) {
    _subscriptions.addAll(listOf(*subscriptions))
  }

  /**
   * The subscriptions in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
   * @param subscriptions The subscriptions in this version. 
   */
  public fun subscriptions(subscriptions: Collection<Any>) {
    _subscriptions.addAll(subscriptions)
  }

  /**
   * The subscriptions in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
   * @param subscriptions The subscriptions in this version. 
   */
  public fun subscriptions(subscriptions: IResolvable) {
    cdkBuilder.subscriptions(subscriptions)
  }

  public fun build(): CfnSubscriptionDefinitionVersion {
    if(_subscriptions.isNotEmpty()) cdkBuilder.subscriptions(_subscriptions)
    return cdkBuilder.build()
  }
}
