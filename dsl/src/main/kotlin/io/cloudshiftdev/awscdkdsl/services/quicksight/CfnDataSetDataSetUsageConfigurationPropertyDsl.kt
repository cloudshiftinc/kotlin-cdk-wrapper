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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * The usage configuration to apply to child datasets that reference this dataset as a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataSetUsageConfigurationProperty dataSetUsageConfigurationProperty =
 * DataSetUsageConfigurationProperty.builder()
 * .disableUseAsDirectQuerySource(false)
 * .disableUseAsImportedSource(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetusageconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSetDataSetUsageConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSet.DataSetUsageConfigurationProperty.Builder =
        CfnDataSet.DataSetUsageConfigurationProperty.builder()

    /**
     * @param disableUseAsDirectQuerySource An option that controls whether a child dataset of a
     *   direct query can use this dataset as a source.
     */
    public fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: Boolean) {
        cdkBuilder.disableUseAsDirectQuerySource(disableUseAsDirectQuerySource)
    }

    /**
     * @param disableUseAsDirectQuerySource An option that controls whether a child dataset of a
     *   direct query can use this dataset as a source.
     */
    public fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: IResolvable) {
        cdkBuilder.disableUseAsDirectQuerySource(disableUseAsDirectQuerySource)
    }

    /**
     * @param disableUseAsImportedSource An option that controls whether a child dataset that's
     *   stored in QuickSight can use this dataset as a source.
     */
    public fun disableUseAsImportedSource(disableUseAsImportedSource: Boolean) {
        cdkBuilder.disableUseAsImportedSource(disableUseAsImportedSource)
    }

    /**
     * @param disableUseAsImportedSource An option that controls whether a child dataset that's
     *   stored in QuickSight can use this dataset as a source.
     */
    public fun disableUseAsImportedSource(disableUseAsImportedSource: IResolvable) {
        cdkBuilder.disableUseAsImportedSource(disableUseAsImportedSource)
    }

    public fun build(): CfnDataSet.DataSetUsageConfigurationProperty = cdkBuilder.build()
}
