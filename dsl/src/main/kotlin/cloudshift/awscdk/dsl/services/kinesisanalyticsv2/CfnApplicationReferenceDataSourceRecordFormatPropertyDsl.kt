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
import kotlin.String

@CdkDslMarker
public class CfnApplicationReferenceDataSourceRecordFormatPropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSource.RecordFormatProperty.Builder =
        CfnApplicationReferenceDataSource.RecordFormatProperty.builder()

    public fun mappingParameters(mappingParameters: IResolvable) {
        cdkBuilder.mappingParameters(mappingParameters)
    }

    public fun mappingParameters(mappingParameters: CfnApplicationReferenceDataSource.MappingParametersProperty) {
        cdkBuilder.mappingParameters(mappingParameters)
    }

    public fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
    }

    public fun build(): CfnApplicationReferenceDataSource.RecordFormatProperty = cdkBuilder.build()
}
