@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 *  Refresh Configuration.</p>.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RefreshConfigurationProperty refreshConfigurationProperty =
 * RefreshConfigurationProperty.builder()
 * .incrementalRefresh(IncrementalRefreshProperty.builder()
 * .lookbackWindow(LookbackWindowProperty.builder()
 * .columnName("columnName")
 * .size(123)
 * .sizeUnit("sizeUnit")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-refreshconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSetRefreshConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSet.RefreshConfigurationProperty.Builder =
        CfnDataSet.RefreshConfigurationProperty.builder()

    /**
     * @param incrementalRefresh Incremental Refresh</p>.
     */
    public fun incrementalRefresh(incrementalRefresh: IResolvable) {
        cdkBuilder.incrementalRefresh(incrementalRefresh)
    }

    /**
     * @param incrementalRefresh Incremental Refresh</p>.
     */
    public fun incrementalRefresh(incrementalRefresh: CfnDataSet.IncrementalRefreshProperty) {
        cdkBuilder.incrementalRefresh(incrementalRefresh)
    }

    public fun build(): CfnDataSet.RefreshConfigurationProperty = cdkBuilder.build()
}
