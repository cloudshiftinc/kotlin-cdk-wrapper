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

package cloudshift.awscdk.dsl.services.ssmincidents

import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object ssmincidents {
    public inline fun cfnReplicationSet(
        scope: Construct,
        id: String,
        block: CfnReplicationSetDsl.() -> Unit = {},
    ): CfnReplicationSet {
        val builder = CfnReplicationSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnReplicationSetProps(block: CfnReplicationSetPropsDsl.() -> Unit = {}): CfnReplicationSetProps {
        val builder = CfnReplicationSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnReplicationSetRegionConfigurationProperty(
        block: CfnReplicationSetRegionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnReplicationSet.RegionConfigurationProperty {
        val builder = CfnReplicationSetRegionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnReplicationSetReplicationRegionProperty(
        block: CfnReplicationSetReplicationRegionPropertyDsl.() -> Unit =
            {},
    ): CfnReplicationSet.ReplicationRegionProperty {
        val builder = CfnReplicationSetReplicationRegionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlan(
        scope: Construct,
        id: String,
        block: CfnResponsePlanDsl.() -> Unit = {},
    ): CfnResponsePlan {
        val builder = CfnResponsePlanDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlanActionProperty(
        block: CfnResponsePlanActionPropertyDsl.() -> Unit =
            {},
    ): CfnResponsePlan.ActionProperty {
        val builder = CfnResponsePlanActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlanChatChannelProperty(
        block: CfnResponsePlanChatChannelPropertyDsl.() -> Unit =
            {},
    ): CfnResponsePlan.ChatChannelProperty {
        val builder = CfnResponsePlanChatChannelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlanDynamicSsmParameterProperty(
        block: CfnResponsePlanDynamicSsmParameterPropertyDsl.() -> Unit =
            {},
    ): CfnResponsePlan.DynamicSsmParameterProperty {
        val builder = CfnResponsePlanDynamicSsmParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlanDynamicSsmParameterValueProperty(
        block: CfnResponsePlanDynamicSsmParameterValuePropertyDsl.() -> Unit =
            {},
    ): CfnResponsePlan.DynamicSsmParameterValueProperty {
        val builder = CfnResponsePlanDynamicSsmParameterValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlanIncidentTemplateProperty(
        block: CfnResponsePlanIncidentTemplatePropertyDsl.() -> Unit =
            {},
    ): CfnResponsePlan.IncidentTemplateProperty {
        val builder = CfnResponsePlanIncidentTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlanIntegrationProperty(
        block: CfnResponsePlanIntegrationPropertyDsl.() -> Unit =
            {},
    ): CfnResponsePlan.IntegrationProperty {
        val builder = CfnResponsePlanIntegrationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlanNotificationTargetItemProperty(
        block: CfnResponsePlanNotificationTargetItemPropertyDsl.() -> Unit =
            {},
    ): CfnResponsePlan.NotificationTargetItemProperty {
        val builder = CfnResponsePlanNotificationTargetItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlanPagerDutyConfigurationProperty(
        block: CfnResponsePlanPagerDutyConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnResponsePlan.PagerDutyConfigurationProperty {
        val builder = CfnResponsePlanPagerDutyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlanPagerDutyIncidentConfigurationProperty(
        block: CfnResponsePlanPagerDutyIncidentConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnResponsePlan.PagerDutyIncidentConfigurationProperty {
        val builder = CfnResponsePlanPagerDutyIncidentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlanProps(block: CfnResponsePlanPropsDsl.() -> Unit = {}): CfnResponsePlanProps {
        val builder = CfnResponsePlanPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlanSsmAutomationProperty(
        block: CfnResponsePlanSsmAutomationPropertyDsl.() -> Unit =
            {},
    ): CfnResponsePlan.SsmAutomationProperty {
        val builder = CfnResponsePlanSsmAutomationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResponsePlanSsmParameterProperty(
        block: CfnResponsePlanSsmParameterPropertyDsl.() -> Unit =
            {},
    ): CfnResponsePlan.SsmParameterProperty {
        val builder = CfnResponsePlanSsmParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
