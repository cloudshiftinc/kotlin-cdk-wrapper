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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource

/**
 * For a SQL-based Managed Service for Apache Flink application, provides additional mapping
 * information when JSON is the record format on the streaming source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * JSONMappingParametersProperty jSONMappingParametersProperty =
 * JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceJSONMappingParametersPropertyDsl {
    private val cdkBuilder:
        CfnApplicationReferenceDataSource.JSONMappingParametersProperty.Builder =
        CfnApplicationReferenceDataSource.JSONMappingParametersProperty.builder()

    /** @param recordRowPath The path to the top-level parent that contains the records. */
    public fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
    }

    public fun build(): CfnApplicationReferenceDataSource.JSONMappingParametersProperty =
        cdkBuilder.build()
}
