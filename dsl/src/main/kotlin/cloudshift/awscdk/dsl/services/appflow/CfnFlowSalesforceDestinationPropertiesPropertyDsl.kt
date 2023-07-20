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
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFlowSalesforceDestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.SalesforceDestinationPropertiesProperty.Builder =
        CfnFlow.SalesforceDestinationPropertiesProperty.builder()

    private val _idFieldNames: MutableList<String> = mutableListOf()

    public fun dataTransferApi(dataTransferApi: String) {
        cdkBuilder.dataTransferApi(dataTransferApi)
    }

    public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    public fun idFieldNames(vararg idFieldNames: String) {
        _idFieldNames.addAll(listOf(*idFieldNames))
    }

    public fun idFieldNames(idFieldNames: Collection<String>) {
        _idFieldNames.addAll(idFieldNames)
    }

    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun writeOperationType(writeOperationType: String) {
        cdkBuilder.writeOperationType(writeOperationType)
    }

    public fun build(): CfnFlow.SalesforceDestinationPropertiesProperty {
        if (_idFieldNames.isNotEmpty()) cdkBuilder.idFieldNames(_idFieldNames)
        return cdkBuilder.build()
    }
}
