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
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource
import kotlin.String

@CdkDslMarker
public class CfnApplicationReferenceDataSourceCSVMappingParametersPropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSource.CSVMappingParametersProperty.Builder =
        CfnApplicationReferenceDataSource.CSVMappingParametersProperty.builder()

    public fun recordColumnDelimiter(recordColumnDelimiter: String) {
        cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
    }

    public fun recordRowDelimiter(recordRowDelimiter: String) {
        cdkBuilder.recordRowDelimiter(recordRowDelimiter)
    }

    public fun build(): CfnApplicationReferenceDataSource.CSVMappingParametersProperty =
        cdkBuilder.build()
}
