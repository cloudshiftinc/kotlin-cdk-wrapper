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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2CSVMappingParametersPropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.Builder =
        CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.builder()

    public fun recordColumnDelimiter(recordColumnDelimiter: String) {
        cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
    }

    public fun recordRowDelimiter(recordRowDelimiter: String) {
        cdkBuilder.recordRowDelimiter(recordRowDelimiter)
    }

    public fun build(): CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty =
        cdkBuilder.build()
}
