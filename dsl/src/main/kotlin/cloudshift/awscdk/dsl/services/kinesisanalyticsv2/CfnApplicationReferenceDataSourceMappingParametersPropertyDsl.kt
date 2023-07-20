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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource

@CdkDslMarker
public class CfnApplicationReferenceDataSourceMappingParametersPropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSource.MappingParametersProperty.Builder =
        CfnApplicationReferenceDataSource.MappingParametersProperty.builder()

    public fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters)
    }

    public fun csvMappingParameters(csvMappingParameters: CfnApplicationReferenceDataSource.CSVMappingParametersProperty) {
        cdkBuilder.csvMappingParameters(csvMappingParameters)
    }

    public fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters)
    }

    public fun jsonMappingParameters(jsonMappingParameters: CfnApplicationReferenceDataSource.JSONMappingParametersProperty) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters)
    }

    public fun build(): CfnApplicationReferenceDataSource.MappingParametersProperty =
        cdkBuilder.build()
}
