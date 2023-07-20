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
import software.amazon.awscdk.services.iot.CfnTopicRule
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTopicRuleRepublishActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.RepublishActionProperty.Builder =
        CfnTopicRule.RepublishActionProperty.builder()

    public fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers)
    }

    public fun headers(headers: CfnTopicRule.RepublishActionHeadersProperty) {
        cdkBuilder.headers(headers)
    }

    public fun qos(qos: Number) {
        cdkBuilder.qos(qos)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun topic(topic: String) {
        cdkBuilder.topic(topic)
    }

    public fun build(): CfnTopicRule.RepublishActionProperty = cdkBuilder.build()
}
