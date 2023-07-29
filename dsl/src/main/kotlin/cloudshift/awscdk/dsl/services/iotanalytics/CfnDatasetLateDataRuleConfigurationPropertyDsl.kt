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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * The information needed to configure a delta time session window.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * LateDataRuleConfigurationProperty lateDataRuleConfigurationProperty =
 * LateDataRuleConfigurationProperty.builder()
 * .deltaTimeSessionWindowConfiguration(DeltaTimeSessionWindowConfigurationProperty.builder()
 * .timeoutInMinutes(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-latedataruleconfiguration.html)
 */
@CdkDslMarker
public class CfnDatasetLateDataRuleConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataset.LateDataRuleConfigurationProperty.Builder =
        CfnDataset.LateDataRuleConfigurationProperty.builder()

    /**
     * @param deltaTimeSessionWindowConfiguration The information needed to configure a delta time
     *   session window.
     */
    public fun deltaTimeSessionWindowConfiguration(
        deltaTimeSessionWindowConfiguration: IResolvable
    ) {
        cdkBuilder.deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration)
    }

    /**
     * @param deltaTimeSessionWindowConfiguration The information needed to configure a delta time
     *   session window.
     */
    public fun deltaTimeSessionWindowConfiguration(
        deltaTimeSessionWindowConfiguration: CfnDataset.DeltaTimeSessionWindowConfigurationProperty
    ) {
        cdkBuilder.deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration)
    }

    public fun build(): CfnDataset.LateDataRuleConfigurationProperty = cdkBuilder.build()
}
