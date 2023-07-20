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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionTopicSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.TopicSAMPTProperty.Builder =
        CfnFunction.TopicSAMPTProperty.builder()

    public fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
    }

    public fun build(): CfnFunction.TopicSAMPTProperty = cdkBuilder.build()
}
