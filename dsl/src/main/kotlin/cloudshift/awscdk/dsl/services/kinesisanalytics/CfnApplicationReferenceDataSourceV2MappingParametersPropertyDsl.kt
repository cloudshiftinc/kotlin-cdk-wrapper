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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2

@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2MappingParametersPropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSourceV2.MappingParametersProperty.Builder =
        CfnApplicationReferenceDataSourceV2.MappingParametersProperty.builder()

    public fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters)
    }

    public fun csvMappingParameters(csvMappingParameters: CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty) {
        cdkBuilder.csvMappingParameters(csvMappingParameters)
    }

    public fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters)
    }

    public fun jsonMappingParameters(jsonMappingParameters: CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters)
    }

    public fun build(): CfnApplicationReferenceDataSourceV2.MappingParametersProperty =
        cdkBuilder.build()
}
