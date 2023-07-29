@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource

/**
 * Provides additional mapping information when JSON is the record format on the streaming source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * JSONMappingParametersProperty jSONMappingParametersProperty =
 * JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceJSONMappingParametersPropertyDsl {
    private val cdkBuilder:
        CfnApplicationReferenceDataSource.JSONMappingParametersProperty.Builder =
        CfnApplicationReferenceDataSource.JSONMappingParametersProperty.builder()

    /** @param recordRowPath Path to the top-level parent that contains the records. */
    public fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
    }

    public fun build(): CfnApplicationReferenceDataSource.JSONMappingParametersProperty =
        cdkBuilder.build()
}
