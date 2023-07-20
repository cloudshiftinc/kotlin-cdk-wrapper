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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetIncrementalRefreshPropertyDsl {
    private val cdkBuilder: CfnDataSet.IncrementalRefreshProperty.Builder =
        CfnDataSet.IncrementalRefreshProperty.builder()

    public fun lookbackWindow(lookbackWindow: IResolvable) {
        cdkBuilder.lookbackWindow(lookbackWindow)
    }

    public fun lookbackWindow(lookbackWindow: CfnDataSet.LookbackWindowProperty) {
        cdkBuilder.lookbackWindow(lookbackWindow)
    }

    public fun build(): CfnDataSet.IncrementalRefreshProperty = cdkBuilder.build()
}
