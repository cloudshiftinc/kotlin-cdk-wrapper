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

package cloudshift.awscdk.dsl.services.mwaa

import software.amazon.awscdk.services.mwaa.CfnEnvironment
import software.amazon.awscdk.services.mwaa.CfnEnvironmentProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object mwaa {
    public inline fun cfnEnvironment(
        scope: Construct,
        id: String,
        block: CfnEnvironmentDsl.() -> Unit = {},
    ): CfnEnvironment {
        val builder = CfnEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEnvironmentLoggingConfigurationProperty(
        block: CfnEnvironmentLoggingConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnEnvironment.LoggingConfigurationProperty {
        val builder = CfnEnvironmentLoggingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEnvironmentModuleLoggingConfigurationProperty(
        block: CfnEnvironmentModuleLoggingConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnEnvironment.ModuleLoggingConfigurationProperty {
        val builder = CfnEnvironmentModuleLoggingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEnvironmentNetworkConfigurationProperty(
        block: CfnEnvironmentNetworkConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnEnvironment.NetworkConfigurationProperty {
        val builder = CfnEnvironmentNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEnvironmentProps(block: CfnEnvironmentPropsDsl.() -> Unit = {}): CfnEnvironmentProps {
        val builder = CfnEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
