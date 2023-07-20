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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.CfnContactList
import kotlin.String

@CdkDslMarker
public class CfnContactListTopicPropertyDsl {
    private val cdkBuilder: CfnContactList.TopicProperty.Builder =
        CfnContactList.TopicProperty.builder()

    public fun defaultSubscriptionStatus(defaultSubscriptionStatus: String) {
        cdkBuilder.defaultSubscriptionStatus(defaultSubscriptionStatus)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    public fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
    }

    public fun build(): CfnContactList.TopicProperty = cdkBuilder.build()
}
