@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * Incremental Refresh</p>.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * IncrementalRefreshProperty incrementalRefreshProperty = IncrementalRefreshProperty.builder()
 * .lookbackWindow(LookbackWindowProperty.builder()
 * .columnName("columnName")
 * .size(123)
 * .sizeUnit("sizeUnit")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-incrementalrefresh.html)
 */
@CdkDslMarker
public class CfnDataSetIncrementalRefreshPropertyDsl {
    private val cdkBuilder: CfnDataSet.IncrementalRefreshProperty.Builder =
        CfnDataSet.IncrementalRefreshProperty.builder()

    /**
     * @param lookbackWindow the value to be set.
     */
    public fun lookbackWindow(lookbackWindow: IResolvable) {
        cdkBuilder.lookbackWindow(lookbackWindow)
    }

    /**
     * @param lookbackWindow the value to be set.
     */
    public fun lookbackWindow(lookbackWindow: CfnDataSet.LookbackWindowProperty) {
        cdkBuilder.lookbackWindow(lookbackWindow)
    }

    public fun build(): CfnDataSet.IncrementalRefreshProperty = cdkBuilder.build()
}
