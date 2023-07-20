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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.String

@CdkDslMarker
public class CfnBotConditionalBranchPropertyDsl {
    private val cdkBuilder: CfnBot.ConditionalBranchProperty.Builder =
        CfnBot.ConditionalBranchProperty.builder()

    public fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition)
    }

    public fun condition(condition: CfnBot.ConditionProperty) {
        cdkBuilder.condition(condition)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep)
    }

    public fun nextStep(nextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.nextStep(nextStep)
    }

    public fun response(response: IResolvable) {
        cdkBuilder.response(response)
    }

    public fun response(response: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.response(response)
    }

    public fun build(): CfnBot.ConditionalBranchProperty = cdkBuilder.build()
}
