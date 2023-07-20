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

@CdkDslMarker
public class CfnBotInitialResponseSettingPropertyDsl {
    private val cdkBuilder: CfnBot.InitialResponseSettingProperty.Builder =
        CfnBot.InitialResponseSettingProperty.builder()

    public fun codeHook(codeHook: IResolvable) {
        cdkBuilder.codeHook(codeHook)
    }

    public fun codeHook(codeHook: CfnBot.DialogCodeHookInvocationSettingProperty) {
        cdkBuilder.codeHook(codeHook)
    }

    public fun conditional(conditional: IResolvable) {
        cdkBuilder.conditional(conditional)
    }

    public fun conditional(conditional: CfnBot.ConditionalSpecificationProperty) {
        cdkBuilder.conditional(conditional)
    }

    public fun initialResponse(initialResponse: IResolvable) {
        cdkBuilder.initialResponse(initialResponse)
    }

    public fun initialResponse(initialResponse: CfnBot.ResponseSpecificationProperty) {
        cdkBuilder.initialResponse(initialResponse)
    }

    public fun nextStep(nextStep: IResolvable) {
        cdkBuilder.nextStep(nextStep)
    }

    public fun nextStep(nextStep: CfnBot.DialogStateProperty) {
        cdkBuilder.nextStep(nextStep)
    }

    public fun build(): CfnBot.InitialResponseSettingProperty = cdkBuilder.build()
}
