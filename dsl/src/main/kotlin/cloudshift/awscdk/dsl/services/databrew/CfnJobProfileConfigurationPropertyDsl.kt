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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobProfileConfigurationPropertyDsl {
    private val cdkBuilder: CfnJob.ProfileConfigurationProperty.Builder =
        CfnJob.ProfileConfigurationProperty.builder()

    private val _columnStatisticsConfigurations: MutableList<Any> = mutableListOf()

    private val _profileColumns: MutableList<Any> = mutableListOf()

    public fun columnStatisticsConfigurations(vararg columnStatisticsConfigurations: Any) {
        _columnStatisticsConfigurations.addAll(listOf(*columnStatisticsConfigurations))
    }

    public fun columnStatisticsConfigurations(columnStatisticsConfigurations: Collection<Any>) {
        _columnStatisticsConfigurations.addAll(columnStatisticsConfigurations)
    }

    public fun columnStatisticsConfigurations(columnStatisticsConfigurations: IResolvable) {
        cdkBuilder.columnStatisticsConfigurations(columnStatisticsConfigurations)
    }

    public fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: IResolvable) {
        cdkBuilder.datasetStatisticsConfiguration(datasetStatisticsConfiguration)
    }

    public fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: CfnJob.StatisticsConfigurationProperty) {
        cdkBuilder.datasetStatisticsConfiguration(datasetStatisticsConfiguration)
    }

    public fun entityDetectorConfiguration(entityDetectorConfiguration: IResolvable) {
        cdkBuilder.entityDetectorConfiguration(entityDetectorConfiguration)
    }

    public fun entityDetectorConfiguration(entityDetectorConfiguration: CfnJob.EntityDetectorConfigurationProperty) {
        cdkBuilder.entityDetectorConfiguration(entityDetectorConfiguration)
    }

    public fun profileColumns(vararg profileColumns: Any) {
        _profileColumns.addAll(listOf(*profileColumns))
    }

    public fun profileColumns(profileColumns: Collection<Any>) {
        _profileColumns.addAll(profileColumns)
    }

    public fun profileColumns(profileColumns: IResolvable) {
        cdkBuilder.profileColumns(profileColumns)
    }

    public fun build(): CfnJob.ProfileConfigurationProperty {
        if (_columnStatisticsConfigurations.isNotEmpty()) {
            cdkBuilder.columnStatisticsConfigurations(_columnStatisticsConfigurations)
        }
        if (_profileColumns.isNotEmpty()) cdkBuilder.profileColumns(_profileColumns)
        return cdkBuilder.build()
    }
}
