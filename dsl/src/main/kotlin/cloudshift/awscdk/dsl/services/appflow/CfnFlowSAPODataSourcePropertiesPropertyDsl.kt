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
public class CfnFlowSAPODataSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.SAPODataSourcePropertiesProperty.Builder =
        CfnFlow.SAPODataSourcePropertiesProperty.builder()

    public fun objectPath(objectPath: String) {
        cdkBuilder.objectPath(objectPath)
    }

    public fun build(): CfnFlow.SAPODataSourcePropertiesProperty = cdkBuilder.build()
}
