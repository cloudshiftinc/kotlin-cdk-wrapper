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

package io.cloudshiftdev.awscdkdsl.services.personalize

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnDataset

/**
 * Describes the data source that contains the data to upload to a dataset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * DataSourceProperty dataSourceProperty = DataSourceProperty.builder()
 * .dataLocation("dataLocation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasource.html)
 */
@CdkDslMarker
public class CfnDatasetDataSourcePropertyDsl {
    private val cdkBuilder: CfnDataset.DataSourceProperty.Builder =
        CfnDataset.DataSourceProperty.builder()

    /**
     * @param dataLocation The path to the Amazon S3 bucket where the data that you want to upload
     *   to your dataset is stored. For example:
     *
     * `s3://bucket-name/folder-name/`
     */
    public fun dataLocation(dataLocation: String) {
        cdkBuilder.dataLocation(dataLocation)
    }

    public fun build(): CfnDataset.DataSourceProperty = cdkBuilder.build()
}
