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
import kotlin.String

@CdkDslMarker
public class CfnServiceCodeConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.CodeConfigurationProperty.Builder =
        CfnService.CodeConfigurationProperty.builder()

    public fun codeConfigurationValues(codeConfigurationValues: IResolvable) {
        cdkBuilder.codeConfigurationValues(codeConfigurationValues)
    }

    public fun codeConfigurationValues(codeConfigurationValues: CfnService.CodeConfigurationValuesProperty) {
        cdkBuilder.codeConfigurationValues(codeConfigurationValues)
    }

    public fun configurationSource(configurationSource: String) {
        cdkBuilder.configurationSource(configurationSource)
    }

    public fun build(): CfnService.CodeConfigurationProperty = cdkBuilder.build()
}
