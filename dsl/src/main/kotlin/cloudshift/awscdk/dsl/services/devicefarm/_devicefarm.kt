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

package cloudshift.awscdk.dsl.services.devicefarm

import software.amazon.awscdk.services.devicefarm.CfnDevicePool
import software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps
import software.amazon.awscdk.services.devicefarm.CfnInstanceProfile
import software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps
import software.amazon.awscdk.services.devicefarm.CfnNetworkProfile
import software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps
import software.amazon.awscdk.services.devicefarm.CfnProject
import software.amazon.awscdk.services.devicefarm.CfnProjectProps
import software.amazon.awscdk.services.devicefarm.CfnTestGridProject
import software.amazon.awscdk.services.devicefarm.CfnTestGridProjectProps
import software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration
import software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object devicefarm {
    public inline fun cfnDevicePool(
        scope: Construct,
        id: String,
        block: CfnDevicePoolDsl.() -> Unit = {},
    ): CfnDevicePool {
        val builder = CfnDevicePoolDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDevicePoolProps(block: CfnDevicePoolPropsDsl.() -> Unit = {}): CfnDevicePoolProps {
        val builder = CfnDevicePoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDevicePoolRuleProperty(block: CfnDevicePoolRulePropertyDsl.() -> Unit = {}): CfnDevicePool.RuleProperty {
        val builder = CfnDevicePoolRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceProfile(
        scope: Construct,
        id: String,
        block: CfnInstanceProfileDsl.() -> Unit = {},
    ): CfnInstanceProfile {
        val builder = CfnInstanceProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceProfileProps(block: CfnInstanceProfilePropsDsl.() -> Unit = {}): CfnInstanceProfileProps {
        val builder = CfnInstanceProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNetworkProfile(
        scope: Construct,
        id: String,
        block: CfnNetworkProfileDsl.() -> Unit = {},
    ): CfnNetworkProfile {
        val builder = CfnNetworkProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNetworkProfileProps(block: CfnNetworkProfilePropsDsl.() -> Unit = {}): CfnNetworkProfileProps {
        val builder = CfnNetworkProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProject(
        scope: Construct,
        id: String,
        block: CfnProjectDsl.() -> Unit = {},
    ): CfnProject {
        val builder = CfnProjectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
        val builder = CfnProjectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProjectVpcConfigProperty(
        block: CfnProjectVpcConfigPropertyDsl.() -> Unit =
            {},
    ): CfnProject.VpcConfigProperty {
        val builder = CfnProjectVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTestGridProject(
        scope: Construct,
        id: String,
        block: CfnTestGridProjectDsl.() -> Unit = {},
    ): CfnTestGridProject {
        val builder = CfnTestGridProjectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTestGridProjectProps(block: CfnTestGridProjectPropsDsl.() -> Unit = {}): CfnTestGridProjectProps {
        val builder = CfnTestGridProjectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTestGridProjectVpcConfigProperty(
        block: CfnTestGridProjectVpcConfigPropertyDsl.() -> Unit =
            {},
    ): CfnTestGridProject.VpcConfigProperty {
        val builder = CfnTestGridProjectVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVPCEConfiguration(
        scope: Construct,
        id: String,
        block: CfnVPCEConfigurationDsl.() -> Unit = {},
    ): CfnVPCEConfiguration {
        val builder = CfnVPCEConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVPCEConfigurationProps(block: CfnVPCEConfigurationPropsDsl.() -> Unit = {}): CfnVPCEConfigurationProps {
        val builder = CfnVPCEConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
