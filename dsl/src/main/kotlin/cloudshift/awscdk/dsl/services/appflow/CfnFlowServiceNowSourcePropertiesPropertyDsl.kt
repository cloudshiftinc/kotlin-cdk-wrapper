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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appflow.CfnFlow
import kotlin.String

@CdkDslMarker
public class CfnFlowServiceNowSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.ServiceNowSourcePropertiesProperty.Builder =
        CfnFlow.ServiceNowSourcePropertiesProperty.builder()

    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.ServiceNowSourcePropertiesProperty = cdkBuilder.build()
}
