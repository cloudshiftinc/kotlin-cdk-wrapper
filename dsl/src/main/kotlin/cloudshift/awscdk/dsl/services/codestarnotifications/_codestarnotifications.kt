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

package cloudshift.awscdk.dsl.services.codestarnotifications

import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps
import software.amazon.awscdk.services.codestarnotifications.NotificationRule
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object codestarnotifications {
    public inline fun cfnNotificationRule(
        scope: Construct,
        id: String,
        block: CfnNotificationRuleDsl.() -> Unit = {},
    ): CfnNotificationRule {
        val builder = CfnNotificationRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNotificationRuleProps(block: CfnNotificationRulePropsDsl.() -> Unit = {}): CfnNotificationRuleProps {
        val builder = CfnNotificationRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNotificationRuleTargetProperty(
        block: CfnNotificationRuleTargetPropertyDsl.() -> Unit =
            {},
    ): CfnNotificationRule.TargetProperty {
        val builder = CfnNotificationRuleTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun notificationRule(
        scope: Construct,
        id: String,
        block: NotificationRuleDsl.() -> Unit = {},
    ): NotificationRule {
        val builder = NotificationRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun notificationRuleOptions(block: NotificationRuleOptionsDsl.() -> Unit = {}): NotificationRuleOptions {
        val builder = NotificationRuleOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun notificationRuleProps(block: NotificationRulePropsDsl.() -> Unit = {}): NotificationRuleProps {
        val builder = NotificationRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun notificationRuleSourceConfig(
        block: NotificationRuleSourceConfigDsl.() -> Unit =
            {},
    ): NotificationRuleSourceConfig {
        val builder = NotificationRuleSourceConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun notificationRuleTargetConfig(
        block: NotificationRuleTargetConfigDsl.() -> Unit =
            {},
    ): NotificationRuleTargetConfig {
        val builder = NotificationRuleTargetConfigDsl()
        builder.apply(block)
        return builder.build()
    }
}
