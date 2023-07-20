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

package cloudshift.awscdk.dsl.services.resourcegroups

import software.amazon.awscdk.services.resourcegroups.CfnGroup
import software.amazon.awscdk.services.resourcegroups.CfnGroupProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object resourcegroups {
    public inline fun cfnGroup(
        scope: Construct,
        id: String,
        block: CfnGroupDsl.() -> Unit = {},
    ): CfnGroup {
        val builder = CfnGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGroupConfigurationItemProperty(
        block: CfnGroupConfigurationItemPropertyDsl.() -> Unit =
            {},
    ): CfnGroup.ConfigurationItemProperty {
        val builder = CfnGroupConfigurationItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGroupConfigurationParameterProperty(
        block: CfnGroupConfigurationParameterPropertyDsl.() -> Unit =
            {},
    ): CfnGroup.ConfigurationParameterProperty {
        val builder = CfnGroupConfigurationParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGroupProps(block: CfnGroupPropsDsl.() -> Unit = {}): CfnGroupProps {
        val builder = CfnGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGroupQueryProperty(block: CfnGroupQueryPropertyDsl.() -> Unit = {}): CfnGroup.QueryProperty {
        val builder = CfnGroupQueryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGroupResourceQueryProperty(
        block: CfnGroupResourceQueryPropertyDsl.() -> Unit =
            {},
    ): CfnGroup.ResourceQueryProperty {
        val builder = CfnGroupResourceQueryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGroupTagFilterProperty(block: CfnGroupTagFilterPropertyDsl.() -> Unit = {}): CfnGroup.TagFilterProperty {
        val builder = CfnGroupTagFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
