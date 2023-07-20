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
public class CfnBotAudioLogSettingPropertyDsl {
    private val cdkBuilder: CfnBot.AudioLogSettingProperty.Builder =
        CfnBot.AudioLogSettingProperty.builder()

    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    public fun destination(destination: CfnBot.AudioLogDestinationProperty) {
        cdkBuilder.destination(destination)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnBot.AudioLogSettingProperty = cdkBuilder.build()
}
