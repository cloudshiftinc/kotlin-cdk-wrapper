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

import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps
import software.amazon.awscdk.services.pinpointemail.CfnIdentity
import software.amazon.awscdk.services.pinpointemail.CfnIdentityProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object pinpointemail {
    public inline fun cfnConfigurationSet(
        scope: Construct,
        id: String,
        block: CfnConfigurationSetDsl.() -> Unit = {},
    ): CfnConfigurationSet {
        val builder = CfnConfigurationSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetDeliveryOptionsProperty(
        block: CfnConfigurationSetDeliveryOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationSet.DeliveryOptionsProperty {
        val builder = CfnConfigurationSetDeliveryOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetEventDestination(
        scope: Construct,
        id: String,
        block: CfnConfigurationSetEventDestinationDsl.() -> Unit = {},
    ): CfnConfigurationSetEventDestination {
        val builder = CfnConfigurationSetEventDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetEventDestinationCloudWatchDestinationProperty(
        block: CfnConfigurationSetEventDestinationCloudWatchDestinationPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationSetEventDestination.CloudWatchDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationCloudWatchDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetEventDestinationDimensionConfigurationProperty(
        block: CfnConfigurationSetEventDestinationDimensionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationSetEventDestination.DimensionConfigurationProperty {
        val builder = CfnConfigurationSetEventDestinationDimensionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetEventDestinationEventDestinationProperty(
        block: CfnConfigurationSetEventDestinationEventDestinationPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationSetEventDestination.EventDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationEventDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetEventDestinationKinesisFirehoseDestinationProperty(
        block: CfnConfigurationSetEventDestinationKinesisFirehoseDestinationPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationKinesisFirehoseDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetEventDestinationPinpointDestinationProperty(
        block: CfnConfigurationSetEventDestinationPinpointDestinationPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationSetEventDestination.PinpointDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationPinpointDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetEventDestinationProps(
        block: CfnConfigurationSetEventDestinationPropsDsl.() -> Unit =
            {},
    ): CfnConfigurationSetEventDestinationProps {
        val builder = CfnConfigurationSetEventDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetEventDestinationSnsDestinationProperty(
        block: CfnConfigurationSetEventDestinationSnsDestinationPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationSetEventDestination.SnsDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationSnsDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetProps(block: CfnConfigurationSetPropsDsl.() -> Unit = {}): CfnConfigurationSetProps {
        val builder = CfnConfigurationSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetReputationOptionsProperty(
        block: CfnConfigurationSetReputationOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationSet.ReputationOptionsProperty {
        val builder = CfnConfigurationSetReputationOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetSendingOptionsProperty(
        block: CfnConfigurationSetSendingOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationSet.SendingOptionsProperty {
        val builder = CfnConfigurationSetSendingOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetTagsProperty(
        block: CfnConfigurationSetTagsPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationSet.TagsProperty {
        val builder = CfnConfigurationSetTagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationSetTrackingOptionsProperty(
        block: CfnConfigurationSetTrackingOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationSet.TrackingOptionsProperty {
        val builder = CfnConfigurationSetTrackingOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDedicatedIpPool(
        scope: Construct,
        id: String,
        block: CfnDedicatedIpPoolDsl.() -> Unit = {},
    ): CfnDedicatedIpPool {
        val builder = CfnDedicatedIpPoolDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDedicatedIpPoolProps(block: CfnDedicatedIpPoolPropsDsl.() -> Unit = {}): CfnDedicatedIpPoolProps {
        val builder = CfnDedicatedIpPoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDedicatedIpPoolTagsProperty(
        block: CfnDedicatedIpPoolTagsPropertyDsl.() -> Unit = {
        },
    ): CfnDedicatedIpPool.TagsProperty {
        val builder = CfnDedicatedIpPoolTagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIdentity(
        scope: Construct,
        id: String,
        block: CfnIdentityDsl.() -> Unit = {},
    ): CfnIdentity {
        val builder = CfnIdentityDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIdentityMailFromAttributesProperty(
        block: CfnIdentityMailFromAttributesPropertyDsl.() -> Unit =
            {},
    ): CfnIdentity.MailFromAttributesProperty {
        val builder = CfnIdentityMailFromAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIdentityProps(block: CfnIdentityPropsDsl.() -> Unit = {}): CfnIdentityProps {
        val builder = CfnIdentityPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIdentityTagsProperty(block: CfnIdentityTagsPropertyDsl.() -> Unit = {}): CfnIdentity.TagsProperty {
        val builder = CfnIdentityTagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
