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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnJobDefinitionFargatePlatformConfigurationPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.FargatePlatformConfigurationProperty.Builder =
        CfnJobDefinition.FargatePlatformConfigurationProperty.builder()

    public fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
    }

    public fun build(): CfnJobDefinition.FargatePlatformConfigurationProperty = cdkBuilder.build()
}
