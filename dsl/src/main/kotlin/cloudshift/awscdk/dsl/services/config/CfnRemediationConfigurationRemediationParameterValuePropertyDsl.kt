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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

@CdkDslMarker
public class CfnRemediationConfigurationRemediationParameterValuePropertyDsl {
    private val cdkBuilder: CfnRemediationConfiguration.RemediationParameterValueProperty.Builder =
        CfnRemediationConfiguration.RemediationParameterValueProperty.builder()

    public fun resourceValue(resourceValue: IResolvable) {
        cdkBuilder.resourceValue(resourceValue)
    }

    public fun resourceValue(resourceValue: CfnRemediationConfiguration.ResourceValueProperty) {
        cdkBuilder.resourceValue(resourceValue)
    }

    public fun staticValue(staticValue: IResolvable) {
        cdkBuilder.staticValue(staticValue)
    }

    public fun staticValue(staticValue: CfnRemediationConfiguration.StaticValueProperty) {
        cdkBuilder.staticValue(staticValue)
    }

    public fun build(): CfnRemediationConfiguration.RemediationParameterValueProperty =
        cdkBuilder.build()
}
