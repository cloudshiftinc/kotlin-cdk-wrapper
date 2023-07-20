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
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.String

@CdkDslMarker
public class CfnBotLambdaCodeHookPropertyDsl {
    private val cdkBuilder: CfnBot.LambdaCodeHookProperty.Builder =
        CfnBot.LambdaCodeHookProperty.builder()

    public fun codeHookInterfaceVersion(codeHookInterfaceVersion: String) {
        cdkBuilder.codeHookInterfaceVersion(codeHookInterfaceVersion)
    }

    public fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
    }

    public fun build(): CfnBot.LambdaCodeHookProperty = cdkBuilder.build()
}
