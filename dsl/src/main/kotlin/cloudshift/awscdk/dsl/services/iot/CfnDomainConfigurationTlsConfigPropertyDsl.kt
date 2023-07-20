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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnDomainConfiguration
import kotlin.String

@CdkDslMarker
public class CfnDomainConfigurationTlsConfigPropertyDsl {
    private val cdkBuilder: CfnDomainConfiguration.TlsConfigProperty.Builder =
        CfnDomainConfiguration.TlsConfigProperty.builder()

    public fun securityPolicy(securityPolicy: String) {
        cdkBuilder.securityPolicy(securityPolicy)
    }

    public fun build(): CfnDomainConfiguration.TlsConfigProperty = cdkBuilder.build()
}
