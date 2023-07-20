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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import kotlin.String

@CdkDslMarker
public class CfnIntegrationZendeskSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnIntegration.ZendeskSourcePropertiesProperty.Builder =
        CfnIntegration.ZendeskSourcePropertiesProperty.builder()

    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnIntegration.ZendeskSourcePropertiesProperty = cdkBuilder.build()
}
