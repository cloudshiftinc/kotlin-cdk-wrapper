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

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnServiceServiceObservabilityConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.ServiceObservabilityConfigurationProperty.Builder =
        CfnService.ServiceObservabilityConfigurationProperty.builder()

    public fun observabilityConfigurationArn(observabilityConfigurationArn: String) {
        cdkBuilder.observabilityConfigurationArn(observabilityConfigurationArn)
    }

    public fun observabilityEnabled(observabilityEnabled: Boolean) {
        cdkBuilder.observabilityEnabled(observabilityEnabled)
    }

    public fun observabilityEnabled(observabilityEnabled: IResolvable) {
        cdkBuilder.observabilityEnabled(observabilityEnabled)
    }

    public fun build(): CfnService.ServiceObservabilityConfigurationProperty = cdkBuilder.build()
}
