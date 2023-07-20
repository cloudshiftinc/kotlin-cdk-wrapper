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
import kotlin.Number

@CdkDslMarker
public class CfnBotTextInputSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.TextInputSpecificationProperty.Builder =
        CfnBot.TextInputSpecificationProperty.builder()

    public fun startTimeoutMs(startTimeoutMs: Number) {
        cdkBuilder.startTimeoutMs(startTimeoutMs)
    }

    public fun build(): CfnBot.TextInputSpecificationProperty = cdkBuilder.build()
}
