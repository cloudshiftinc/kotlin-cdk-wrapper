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
import software.amazon.awscdk.services.lex.CfnBotAlias
import kotlin.String

@CdkDslMarker
public class CfnBotAliasLambdaCodeHookPropertyDsl {
    private val cdkBuilder: CfnBotAlias.LambdaCodeHookProperty.Builder =
        CfnBotAlias.LambdaCodeHookProperty.builder()

    public fun codeHookInterfaceVersion(codeHookInterfaceVersion: String) {
        cdkBuilder.codeHookInterfaceVersion(codeHookInterfaceVersion)
    }

    public fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
    }

    public fun build(): CfnBotAlias.LambdaCodeHookProperty = cdkBuilder.build()
}
