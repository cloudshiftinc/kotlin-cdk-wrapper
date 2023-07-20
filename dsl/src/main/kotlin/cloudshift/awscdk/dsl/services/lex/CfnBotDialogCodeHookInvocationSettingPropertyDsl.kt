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
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnBotDialogCodeHookInvocationSettingPropertyDsl {
    private val cdkBuilder: CfnBot.DialogCodeHookInvocationSettingProperty.Builder =
        CfnBot.DialogCodeHookInvocationSettingProperty.builder()

    public fun enableCodeHookInvocation(enableCodeHookInvocation: Boolean) {
        cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation)
    }

    public fun enableCodeHookInvocation(enableCodeHookInvocation: IResolvable) {
        cdkBuilder.enableCodeHookInvocation(enableCodeHookInvocation)
    }

    public fun invocationLabel(invocationLabel: String) {
        cdkBuilder.invocationLabel(invocationLabel)
    }

    public fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
    }

    public fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive)
    }

    public fun postCodeHookSpecification(postCodeHookSpecification: IResolvable) {
        cdkBuilder.postCodeHookSpecification(postCodeHookSpecification)
    }

    public fun postCodeHookSpecification(postCodeHookSpecification: CfnBot.PostDialogCodeHookInvocationSpecificationProperty) {
        cdkBuilder.postCodeHookSpecification(postCodeHookSpecification)
    }

    public fun build(): CfnBot.DialogCodeHookInvocationSettingProperty = cdkBuilder.build()
}
