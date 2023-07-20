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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLoggingConfigurationLoggingConfigurationPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.LoggingConfigurationProperty.Builder =
        CfnLoggingConfiguration.LoggingConfigurationProperty.builder()

    private val _logDestinationConfigs: MutableList<Any> = mutableListOf()

    public fun logDestinationConfigs(vararg logDestinationConfigs: Any) {
        _logDestinationConfigs.addAll(listOf(*logDestinationConfigs))
    }

    public fun logDestinationConfigs(logDestinationConfigs: Collection<Any>) {
        _logDestinationConfigs.addAll(logDestinationConfigs)
    }

    public fun logDestinationConfigs(logDestinationConfigs: IResolvable) {
        cdkBuilder.logDestinationConfigs(logDestinationConfigs)
    }

    public fun build(): CfnLoggingConfiguration.LoggingConfigurationProperty {
        if (_logDestinationConfigs.isNotEmpty()) cdkBuilder.logDestinationConfigs(_logDestinationConfigs)
        return cdkBuilder.build()
    }
}
