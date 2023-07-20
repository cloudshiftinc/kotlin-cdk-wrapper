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
public class CfnFlowSAPODataDestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.SAPODataDestinationPropertiesProperty.Builder =
        CfnFlow.SAPODataDestinationPropertiesProperty.builder()

    private val _idFieldNames: MutableList<String> = mutableListOf()

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

    public fun objectPath(objectPath: String) {
        cdkBuilder.objectPath(objectPath)
    }

    public fun successResponseHandlingConfig(successResponseHandlingConfig: IResolvable) {
        cdkBuilder.successResponseHandlingConfig(successResponseHandlingConfig)
    }

    public fun successResponseHandlingConfig(successResponseHandlingConfig: CfnFlow.SuccessResponseHandlingConfigProperty) {
        cdkBuilder.successResponseHandlingConfig(successResponseHandlingConfig)
    }

    public fun writeOperationType(writeOperationType: String) {
        cdkBuilder.writeOperationType(writeOperationType)
    }

    public fun build(): CfnFlow.SAPODataDestinationPropertiesProperty {
        if (_idFieldNames.isNotEmpty()) cdkBuilder.idFieldNames(_idFieldNames)
        return cdkBuilder.build()
    }
}
