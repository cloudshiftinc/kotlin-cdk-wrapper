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
import software.amazon.awscdk.services.iot.CfnTopicRule
import kotlin.String

@CdkDslMarker
public class CfnTopicRuleElasticsearchActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.ElasticsearchActionProperty.Builder =
        CfnTopicRule.ElasticsearchActionProperty.builder()

    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun index(index: String) {
        cdkBuilder.index(index)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTopicRule.ElasticsearchActionProperty = cdkBuilder.build()
}
