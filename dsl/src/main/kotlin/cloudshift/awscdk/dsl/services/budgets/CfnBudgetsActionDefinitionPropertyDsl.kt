@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

@CdkDslMarker
public class CfnBudgetsActionDefinitionPropertyDsl {
  private val cdkBuilder: CfnBudgetsAction.DefinitionProperty.Builder =
      CfnBudgetsAction.DefinitionProperty.builder()

  /**
   * @param iamActionDefinition The AWS Identity and Access Management ( IAM ) action definition
   * details.
   */
  public fun iamActionDefinition(iamActionDefinition: IResolvable) {
    cdkBuilder.iamActionDefinition(iamActionDefinition)
  }

  /**
   * @param iamActionDefinition The AWS Identity and Access Management ( IAM ) action definition
   * details.
   */
  public
      fun iamActionDefinition(iamActionDefinition: CfnBudgetsAction.IamActionDefinitionProperty) {
    cdkBuilder.iamActionDefinition(iamActionDefinition)
  }

  /**
   * @param scpActionDefinition The service control policies (SCP) action definition details.
   */
  public fun scpActionDefinition(scpActionDefinition: IResolvable) {
    cdkBuilder.scpActionDefinition(scpActionDefinition)
  }

  /**
   * @param scpActionDefinition The service control policies (SCP) action definition details.
   */
  public
      fun scpActionDefinition(scpActionDefinition: CfnBudgetsAction.ScpActionDefinitionProperty) {
    cdkBuilder.scpActionDefinition(scpActionDefinition)
  }

  /**
   * @param ssmActionDefinition The Amazon EC2 Systems Manager ( SSM ) action definition details.
   */
  public fun ssmActionDefinition(ssmActionDefinition: IResolvable) {
    cdkBuilder.ssmActionDefinition(ssmActionDefinition)
  }

  /**
   * @param ssmActionDefinition The Amazon EC2 Systems Manager ( SSM ) action definition details.
   */
  public
      fun ssmActionDefinition(ssmActionDefinition: CfnBudgetsAction.SsmActionDefinitionProperty) {
    cdkBuilder.ssmActionDefinition(ssmActionDefinition)
  }

  public fun build(): CfnBudgetsAction.DefinitionProperty = cdkBuilder.build()
}
