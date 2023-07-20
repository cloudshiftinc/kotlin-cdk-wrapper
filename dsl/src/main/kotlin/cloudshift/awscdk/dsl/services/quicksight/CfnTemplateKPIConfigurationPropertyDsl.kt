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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateKPIConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.KPIConfigurationProperty.Builder =
        CfnTemplate.KPIConfigurationProperty.builder()

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnTemplate.KPIFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun kpiOptions(kpiOptions: IResolvable) {
        cdkBuilder.kpiOptions(kpiOptions)
    }

    public fun kpiOptions(kpiOptions: CfnTemplate.KPIOptionsProperty) {
        cdkBuilder.kpiOptions(kpiOptions)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnTemplate.KPISortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun build(): CfnTemplate.KPIConfigurationProperty = cdkBuilder.build()
}
