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
public class CfnBotTextLogDestinationPropertyDsl {
    private val cdkBuilder: CfnBot.TextLogDestinationProperty.Builder =
        CfnBot.TextLogDestinationProperty.builder()

    public fun cloudWatch(cloudWatch: IResolvable) {
        cdkBuilder.cloudWatch(cloudWatch)
    }

    public fun cloudWatch(cloudWatch: CfnBot.CloudWatchLogGroupLogDestinationProperty) {
        cdkBuilder.cloudWatch(cloudWatch)
    }

    public fun build(): CfnBot.TextLogDestinationProperty = cdkBuilder.build()
}
