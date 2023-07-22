@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

@CdkDslMarker
public class CfnBudgetsActionSsmActionDefinitionPropertyDsl {
  private val cdkBuilder: CfnBudgetsAction.SsmActionDefinitionProperty.Builder =
      CfnBudgetsAction.SsmActionDefinitionProperty.builder()

  private val _instanceIds: MutableList<String> = mutableListOf()

  /**
   * @param instanceIds The EC2 and RDS instance IDs. 
   */
  public fun instanceIds(vararg instanceIds: String) {
    _instanceIds.addAll(listOf(*instanceIds))
  }

  /**
   * @param instanceIds The EC2 and RDS instance IDs. 
   */
  public fun instanceIds(instanceIds: Collection<String>) {
    _instanceIds.addAll(instanceIds)
  }

  /**
   * @param region The Region to run the ( SSM ) document. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param subtype The action subType. 
   */
  public fun subtype(subtype: String) {
    cdkBuilder.subtype(subtype)
  }

  public fun build(): CfnBudgetsAction.SsmActionDefinitionProperty {
    if(_instanceIds.isNotEmpty()) cdkBuilder.instanceIds(_instanceIds)
    return cdkBuilder.build()
  }
}
