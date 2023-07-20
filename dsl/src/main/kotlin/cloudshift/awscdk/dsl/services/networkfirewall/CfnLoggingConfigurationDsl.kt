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
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnLoggingConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLoggingConfiguration.Builder =
        CfnLoggingConfiguration.Builder.create(scope, id)

    public fun firewallArn(firewallArn: String) {
        cdkBuilder.firewallArn(firewallArn)
    }

    public fun firewallName(firewallName: String) {
        cdkBuilder.firewallName(firewallName)
    }

    public fun loggingConfiguration(loggingConfiguration: IResolvable) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    public fun loggingConfiguration(loggingConfiguration: CfnLoggingConfiguration.LoggingConfigurationProperty) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    public fun build(): CfnLoggingConfiguration = cdkBuilder.build()
}
