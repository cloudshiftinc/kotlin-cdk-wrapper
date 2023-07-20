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
import software.amazon.awscdk.services.lex.CfnBotAlias

@CdkDslMarker
public class CfnBotAliasTextLogDestinationPropertyDsl {
    private val cdkBuilder: CfnBotAlias.TextLogDestinationProperty.Builder =
        CfnBotAlias.TextLogDestinationProperty.builder()

    public fun cloudWatch(cloudWatch: IResolvable) {
        cdkBuilder.cloudWatch(cloudWatch)
    }

    public fun cloudWatch(cloudWatch: CfnBotAlias.CloudWatchLogGroupLogDestinationProperty) {
        cdkBuilder.cloudWatch(cloudWatch)
    }

    public fun build(): CfnBotAlias.TextLogDestinationProperty = cdkBuilder.build()
}
