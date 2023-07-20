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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRuleDestination
import software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps
import kotlin.String

@CdkDslMarker
public class CfnTopicRuleDestinationPropsDsl {
    private val cdkBuilder: CfnTopicRuleDestinationProps.Builder =
        CfnTopicRuleDestinationProps.builder()

    public fun httpUrlProperties(httpUrlProperties: IResolvable) {
        cdkBuilder.httpUrlProperties(httpUrlProperties)
    }

    public fun httpUrlProperties(httpUrlProperties: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty) {
        cdkBuilder.httpUrlProperties(httpUrlProperties)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun vpcProperties(vpcProperties: IResolvable) {
        cdkBuilder.vpcProperties(vpcProperties)
    }

    public fun vpcProperties(vpcProperties: CfnTopicRuleDestination.VpcDestinationPropertiesProperty) {
        cdkBuilder.vpcProperties(vpcProperties)
    }

    public fun build(): CfnTopicRuleDestinationProps = cdkBuilder.build()
}
