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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration of a KPI visual.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-kpiconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateKPIConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.KPIConfigurationProperty.Builder =
        CfnTemplate.KPIConfigurationProperty.builder()

    /** @param fieldWells The field well configuration of a KPI visual. */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field well configuration of a KPI visual. */
    public fun fieldWells(fieldWells: CfnTemplate.KPIFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param kpiOptions The options that determine the presentation of a KPI visual. */
    public fun kpiOptions(kpiOptions: IResolvable) {
        cdkBuilder.kpiOptions(kpiOptions)
    }

    /** @param kpiOptions The options that determine the presentation of a KPI visual. */
    public fun kpiOptions(kpiOptions: CfnTemplate.KPIOptionsProperty) {
        cdkBuilder.kpiOptions(kpiOptions)
    }

    /** @param sortConfiguration The sort configuration of a KPI visual. */
    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param sortConfiguration The sort configuration of a KPI visual. */
    public fun sortConfiguration(sortConfiguration: CfnTemplate.KPISortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun build(): CfnTemplate.KPIConfigurationProperty = cdkBuilder.build()
}
