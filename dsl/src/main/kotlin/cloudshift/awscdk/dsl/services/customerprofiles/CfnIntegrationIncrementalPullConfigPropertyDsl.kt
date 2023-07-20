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
public class CfnIntegrationIncrementalPullConfigPropertyDsl {
    private val cdkBuilder: CfnIntegration.IncrementalPullConfigProperty.Builder =
        CfnIntegration.IncrementalPullConfigProperty.builder()

    public fun datetimeTypeFieldName(datetimeTypeFieldName: String) {
        cdkBuilder.datetimeTypeFieldName(datetimeTypeFieldName)
    }

    public fun build(): CfnIntegration.IncrementalPullConfigProperty = cdkBuilder.build()
}
