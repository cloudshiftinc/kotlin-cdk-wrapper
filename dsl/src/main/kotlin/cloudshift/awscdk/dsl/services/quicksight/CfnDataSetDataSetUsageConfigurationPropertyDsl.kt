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
import kotlin.Boolean

@CdkDslMarker
public class CfnDataSetDataSetUsageConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSet.DataSetUsageConfigurationProperty.Builder =
        CfnDataSet.DataSetUsageConfigurationProperty.builder()

    public fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: Boolean) {
        cdkBuilder.disableUseAsDirectQuerySource(disableUseAsDirectQuerySource)
    }

    public fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: IResolvable) {
        cdkBuilder.disableUseAsDirectQuerySource(disableUseAsDirectQuerySource)
    }

    public fun disableUseAsImportedSource(disableUseAsImportedSource: Boolean) {
        cdkBuilder.disableUseAsImportedSource(disableUseAsImportedSource)
    }

    public fun disableUseAsImportedSource(disableUseAsImportedSource: IResolvable) {
        cdkBuilder.disableUseAsImportedSource(disableUseAsImportedSource)
    }

    public fun build(): CfnDataSet.DataSetUsageConfigurationProperty = cdkBuilder.build()
}
