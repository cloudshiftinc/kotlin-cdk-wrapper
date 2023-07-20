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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import kotlin.String

@CdkDslMarker
public class CfnRemediationConfigurationResourceValuePropertyDsl {
    private val cdkBuilder: CfnRemediationConfiguration.ResourceValueProperty.Builder =
        CfnRemediationConfiguration.ResourceValueProperty.builder()

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnRemediationConfiguration.ResourceValueProperty = cdkBuilder.build()
}
