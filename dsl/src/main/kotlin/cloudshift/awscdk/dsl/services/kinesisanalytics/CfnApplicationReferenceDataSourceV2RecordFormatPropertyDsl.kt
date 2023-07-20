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
import kotlin.String

@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2RecordFormatPropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSourceV2.RecordFormatProperty.Builder =
        CfnApplicationReferenceDataSourceV2.RecordFormatProperty.builder()

    public fun mappingParameters(mappingParameters: IResolvable) {
        cdkBuilder.mappingParameters(mappingParameters)
    }

    public fun mappingParameters(mappingParameters: CfnApplicationReferenceDataSourceV2.MappingParametersProperty) {
        cdkBuilder.mappingParameters(mappingParameters)
    }

    public fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
    }

    public fun build(): CfnApplicationReferenceDataSourceV2.RecordFormatProperty = cdkBuilder.build()
}
