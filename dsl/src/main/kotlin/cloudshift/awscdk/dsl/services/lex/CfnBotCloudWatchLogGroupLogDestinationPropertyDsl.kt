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
public class CfnBotCloudWatchLogGroupLogDestinationPropertyDsl {
    private val cdkBuilder: CfnBot.CloudWatchLogGroupLogDestinationProperty.Builder =
        CfnBot.CloudWatchLogGroupLogDestinationProperty.builder()

    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
        cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    public fun logPrefix(logPrefix: String) {
        cdkBuilder.logPrefix(logPrefix)
    }

    public fun build(): CfnBot.CloudWatchLogGroupLogDestinationProperty = cdkBuilder.build()
}
