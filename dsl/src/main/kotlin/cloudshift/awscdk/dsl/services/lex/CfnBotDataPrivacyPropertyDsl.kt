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

@CdkDslMarker
public class CfnBotDataPrivacyPropertyDsl {
    private val cdkBuilder: CfnBot.DataPrivacyProperty.Builder = CfnBot.DataPrivacyProperty.builder()

    public fun childDirected(childDirected: Boolean) {
        cdkBuilder.childDirected(childDirected)
    }

    public fun childDirected(childDirected: IResolvable) {
        cdkBuilder.childDirected(childDirected)
    }

    public fun build(): CfnBot.DataPrivacyProperty = cdkBuilder.build()
}
