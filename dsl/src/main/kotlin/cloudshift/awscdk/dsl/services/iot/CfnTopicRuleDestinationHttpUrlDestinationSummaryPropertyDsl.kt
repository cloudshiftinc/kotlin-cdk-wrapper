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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnTopicRuleDestination
import kotlin.String

@CdkDslMarker
public class CfnTopicRuleDestinationHttpUrlDestinationSummaryPropertyDsl {
    private val cdkBuilder: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.Builder =
        CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.builder()

    public fun confirmationUrl(confirmationUrl: String) {
        cdkBuilder.confirmationUrl(confirmationUrl)
    }

    public fun build(): CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty = cdkBuilder.build()
}
