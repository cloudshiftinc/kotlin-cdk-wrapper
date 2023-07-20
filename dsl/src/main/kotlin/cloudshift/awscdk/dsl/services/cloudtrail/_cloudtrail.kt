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

package cloudshift.awscdk.dsl.services.cloudtrail

import software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions
import software.amazon.awscdk.services.cloudtrail.CfnChannel
import software.amazon.awscdk.services.cloudtrail.CfnChannelProps
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps
import software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy
import software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps
import software.amazon.awscdk.services.cloudtrail.CfnTrail
import software.amazon.awscdk.services.cloudtrail.CfnTrailProps
import software.amazon.awscdk.services.cloudtrail.S3EventSelector
import software.amazon.awscdk.services.cloudtrail.Trail
import software.amazon.awscdk.services.cloudtrail.TrailProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object cloudtrail {
    public inline fun addEventSelectorOptions(block: AddEventSelectorOptionsDsl.() -> Unit = {}): AddEventSelectorOptions {
        val builder = AddEventSelectorOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnChannel(
        scope: Construct,
        id: String,
        block: CfnChannelDsl.() -> Unit = {},
    ): CfnChannel {
        val builder = CfnChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnChannelDestinationProperty(
        block: CfnChannelDestinationPropertyDsl.() -> Unit =
            {},
    ): CfnChannel.DestinationProperty {
        val builder = CfnChannelDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnChannelProps(block: CfnChannelPropsDsl.() -> Unit = {}): CfnChannelProps {
        val builder = CfnChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEventDataStore(
        scope: Construct,
        id: String,
        block: CfnEventDataStoreDsl.() -> Unit = {},
    ): CfnEventDataStore {
        val builder = CfnEventDataStoreDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEventDataStoreAdvancedEventSelectorProperty(
        block: CfnEventDataStoreAdvancedEventSelectorPropertyDsl.() -> Unit =
            {},
    ): CfnEventDataStore.AdvancedEventSelectorProperty {
        val builder = CfnEventDataStoreAdvancedEventSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEventDataStoreAdvancedFieldSelectorProperty(
        block: CfnEventDataStoreAdvancedFieldSelectorPropertyDsl.() -> Unit =
            {},
    ): CfnEventDataStore.AdvancedFieldSelectorProperty {
        val builder = CfnEventDataStoreAdvancedFieldSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEventDataStoreProps(block: CfnEventDataStorePropsDsl.() -> Unit = {}): CfnEventDataStoreProps {
        val builder = CfnEventDataStorePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourcePolicy(
        scope: Construct,
        id: String,
        block: CfnResourcePolicyDsl.() -> Unit = {},
    ): CfnResourcePolicy {
        val builder = CfnResourcePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourcePolicyProps(block: CfnResourcePolicyPropsDsl.() -> Unit = {}): CfnResourcePolicyProps {
        val builder = CfnResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTrail(
        scope: Construct,
        id: String,
        block: CfnTrailDsl.() -> Unit = {},
    ): CfnTrail {
        val builder = CfnTrailDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTrailAdvancedEventSelectorProperty(
        block: CfnTrailAdvancedEventSelectorPropertyDsl.() -> Unit =
            {},
    ): CfnTrail.AdvancedEventSelectorProperty {
        val builder = CfnTrailAdvancedEventSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTrailAdvancedFieldSelectorProperty(
        block: CfnTrailAdvancedFieldSelectorPropertyDsl.() -> Unit =
            {},
    ): CfnTrail.AdvancedFieldSelectorProperty {
        val builder = CfnTrailAdvancedFieldSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTrailDataResourceProperty(
        block: CfnTrailDataResourcePropertyDsl.() -> Unit =
            {},
    ): CfnTrail.DataResourceProperty {
        val builder = CfnTrailDataResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTrailEventSelectorProperty(
        block: CfnTrailEventSelectorPropertyDsl.() -> Unit =
            {},
    ): CfnTrail.EventSelectorProperty {
        val builder = CfnTrailEventSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTrailInsightSelectorProperty(
        block: CfnTrailInsightSelectorPropertyDsl.() -> Unit =
            {},
    ): CfnTrail.InsightSelectorProperty {
        val builder = CfnTrailInsightSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTrailProps(block: CfnTrailPropsDsl.() -> Unit = {}): CfnTrailProps {
        val builder = CfnTrailPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3EventSelector(block: S3EventSelectorDsl.() -> Unit = {}): S3EventSelector {
        val builder = S3EventSelectorDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun trail(
        scope: Construct,
        id: String,
        block: TrailDsl.() -> Unit = {},
    ): Trail {
        val builder = TrailDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun trailProps(block: TrailPropsDsl.() -> Unit = {}): TrailProps {
        val builder = TrailPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
