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

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sns.CfnSubscriptionProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnSubscriptionPropsDsl {
    private val cdkBuilder: CfnSubscriptionProps.Builder = CfnSubscriptionProps.builder()

    public fun deliveryPolicy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.deliveryPolicy(builder.map)
    }

    public fun deliveryPolicy(deliveryPolicy: Any) {
        cdkBuilder.deliveryPolicy(deliveryPolicy)
    }

    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun filterPolicy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.filterPolicy(builder.map)
    }

    public fun filterPolicy(filterPolicy: Any) {
        cdkBuilder.filterPolicy(filterPolicy)
    }

    public fun filterPolicyScope(filterPolicyScope: String) {
        cdkBuilder.filterPolicyScope(filterPolicyScope)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun rawMessageDelivery(rawMessageDelivery: Boolean) {
        cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    public fun rawMessageDelivery(rawMessageDelivery: IResolvable) {
        cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    public fun redrivePolicy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.redrivePolicy(builder.map)
    }

    public fun redrivePolicy(redrivePolicy: Any) {
        cdkBuilder.redrivePolicy(redrivePolicy)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun subscriptionRoleArn(subscriptionRoleArn: String) {
        cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnSubscriptionProps = cdkBuilder.build()
}
