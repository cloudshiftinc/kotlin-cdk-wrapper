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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow
import kotlin.String

@CdkDslMarker
public class CfnFlowMarketoDestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.MarketoDestinationPropertiesProperty.Builder =
        CfnFlow.MarketoDestinationPropertiesProperty.builder()

    public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.MarketoDestinationPropertiesProperty = cdkBuilder.build()
}
