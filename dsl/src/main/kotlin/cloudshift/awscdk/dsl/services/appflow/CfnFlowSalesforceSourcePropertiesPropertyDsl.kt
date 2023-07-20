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
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnFlowSalesforceSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.SalesforceSourcePropertiesProperty.Builder =
        CfnFlow.SalesforceSourcePropertiesProperty.builder()

    public fun dataTransferApi(dataTransferApi: String) {
        cdkBuilder.dataTransferApi(dataTransferApi)
    }

    public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: Boolean) {
        cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate)
    }

    public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: IResolvable) {
        cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate)
    }

    public fun includeDeletedRecords(includeDeletedRecords: Boolean) {
        cdkBuilder.includeDeletedRecords(includeDeletedRecords)
    }

    public fun includeDeletedRecords(includeDeletedRecords: IResolvable) {
        cdkBuilder.includeDeletedRecords(includeDeletedRecords)
    }

    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.SalesforceSourcePropertiesProperty = cdkBuilder.build()
}
