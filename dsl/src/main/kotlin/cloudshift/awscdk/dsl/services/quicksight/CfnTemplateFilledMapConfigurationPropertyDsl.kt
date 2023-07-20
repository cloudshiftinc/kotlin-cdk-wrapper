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
public class CfnTemplateFilledMapConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.FilledMapConfigurationProperty.Builder =
        CfnTemplate.FilledMapConfigurationProperty.builder()

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnTemplate.FilledMapFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    public fun legend(legend: CfnTemplate.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    public fun mapStyleOptions(mapStyleOptions: IResolvable) {
        cdkBuilder.mapStyleOptions(mapStyleOptions)
    }

    public fun mapStyleOptions(mapStyleOptions: CfnTemplate.GeospatialMapStyleOptionsProperty) {
        cdkBuilder.mapStyleOptions(mapStyleOptions)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnTemplate.FilledMapSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun tooltip(tooltip: CfnTemplate.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun windowOptions(windowOptions: IResolvable) {
        cdkBuilder.windowOptions(windowOptions)
    }

    public fun windowOptions(windowOptions: CfnTemplate.GeospatialWindowOptionsProperty) {
        cdkBuilder.windowOptions(windowOptions)
    }

    public fun build(): CfnTemplate.FilledMapConfigurationProperty = cdkBuilder.build()
}
