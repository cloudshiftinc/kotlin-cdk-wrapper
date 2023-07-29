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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * The dataset refresh properties for the dataset.</p>.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataSetRefreshPropertiesProperty dataSetRefreshPropertiesProperty =
 * DataSetRefreshPropertiesProperty.builder()
 * .refreshConfiguration(RefreshConfigurationProperty.builder()
 * .incrementalRefresh(IncrementalRefreshProperty.builder()
 * .lookbackWindow(LookbackWindowProperty.builder()
 * .columnName("columnName")
 * .size(123)
 * .sizeUnit("sizeUnit")
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetrefreshproperties.html)
 */
@CdkDslMarker
public class CfnDataSetDataSetRefreshPropertiesPropertyDsl {
    private val cdkBuilder: CfnDataSet.DataSetRefreshPropertiesProperty.Builder =
        CfnDataSet.DataSetRefreshPropertiesProperty.builder()

    /** @param refreshConfiguration Refresh Configuration.</p>. */
    public fun refreshConfiguration(refreshConfiguration: IResolvable) {
        cdkBuilder.refreshConfiguration(refreshConfiguration)
    }

    /** @param refreshConfiguration Refresh Configuration.</p>. */
    public fun refreshConfiguration(refreshConfiguration: CfnDataSet.RefreshConfigurationProperty) {
        cdkBuilder.refreshConfiguration(refreshConfiguration)
    }

    public fun build(): CfnDataSet.DataSetRefreshPropertiesProperty = cdkBuilder.build()
}
