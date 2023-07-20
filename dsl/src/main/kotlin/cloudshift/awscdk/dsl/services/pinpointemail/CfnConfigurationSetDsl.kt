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

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnConfigurationSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfigurationSet.Builder = CfnConfigurationSet.Builder.create(
        scope,
        id,
    )

    private val _tags: MutableList<CfnConfigurationSet.TagsProperty> = mutableListOf()

    public fun deliveryOptions(deliveryOptions: IResolvable) {
        cdkBuilder.deliveryOptions(deliveryOptions)
    }

    public fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty) {
        cdkBuilder.deliveryOptions(deliveryOptions)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun reputationOptions(reputationOptions: IResolvable) {
        cdkBuilder.reputationOptions(reputationOptions)
    }

    public fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty) {
        cdkBuilder.reputationOptions(reputationOptions)
    }

    public fun sendingOptions(sendingOptions: IResolvable) {
        cdkBuilder.sendingOptions(sendingOptions)
    }

    public fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty) {
        cdkBuilder.sendingOptions(sendingOptions)
    }

    public fun tags(tags: CfnConfigurationSetTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnConfigurationSetTagsPropertyDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnConfigurationSet.TagsProperty>) {
        _tags.addAll(tags)
    }

    public fun trackingOptions(trackingOptions: IResolvable) {
        cdkBuilder.trackingOptions(trackingOptions)
    }

    public fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty) {
        cdkBuilder.trackingOptions(trackingOptions)
    }

    public fun build(): CfnConfigurationSet {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
