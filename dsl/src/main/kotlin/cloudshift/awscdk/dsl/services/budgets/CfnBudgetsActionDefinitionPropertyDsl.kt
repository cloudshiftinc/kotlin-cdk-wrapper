@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

@CdkDslMarker
public class CfnBudgetsActionDefinitionPropertyDsl {
    private val cdkBuilder: CfnBudgetsAction.DefinitionProperty.Builder =
        CfnBudgetsAction.DefinitionProperty.builder()

    public fun iamActionDefinition(iamActionDefinition: IResolvable) {
        cdkBuilder.iamActionDefinition(iamActionDefinition)
    }

    public fun iamActionDefinition(iamActionDefinition: CfnBudgetsAction.IamActionDefinitionProperty) {
        cdkBuilder.iamActionDefinition(iamActionDefinition)
    }

    public fun scpActionDefinition(scpActionDefinition: IResolvable) {
        cdkBuilder.scpActionDefinition(scpActionDefinition)
    }

    public fun scpActionDefinition(scpActionDefinition: CfnBudgetsAction.ScpActionDefinitionProperty) {
        cdkBuilder.scpActionDefinition(scpActionDefinition)
    }

    public fun ssmActionDefinition(ssmActionDefinition: IResolvable) {
        cdkBuilder.ssmActionDefinition(ssmActionDefinition)
    }

    public fun ssmActionDefinition(ssmActionDefinition: CfnBudgetsAction.SsmActionDefinitionProperty) {
        cdkBuilder.ssmActionDefinition(ssmActionDefinition)
    }

    public fun build(): CfnBudgetsAction.DefinitionProperty = cdkBuilder.build()
}
