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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Configuration for profile jobs.
 *
 * Configuration can be used to select columns, do evaluations, and override default parameters of
 * evaluations. When configuration is undefined, the profile job will apply default settings to all
 * supported columns.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * ProfileConfigurationProperty profileConfigurationProperty =
 * ProfileConfigurationProperty.builder()
 * .columnStatisticsConfigurations(List.of(ColumnStatisticsConfigurationProperty.builder()
 * .statistics(StatisticsConfigurationProperty.builder()
 * .includedStatistics(List.of("includedStatistics"))
 * .overrides(List.of(StatisticOverrideProperty.builder()
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .statistic("statistic")
 * .build()))
 * .build())
 * // the properties below are optional
 * .selectors(List.of(ColumnSelectorProperty.builder()
 * .name("name")
 * .regex("regex")
 * .build()))
 * .build()))
 * .datasetStatisticsConfiguration(StatisticsConfigurationProperty.builder()
 * .includedStatistics(List.of("includedStatistics"))
 * .overrides(List.of(StatisticOverrideProperty.builder()
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .statistic("statistic")
 * .build()))
 * .build())
 * .entityDetectorConfiguration(EntityDetectorConfigurationProperty.builder()
 * .entityTypes(List.of("entityTypes"))
 * // the properties below are optional
 * .allowedStatistics(AllowedStatisticsProperty.builder()
 * .statistics(List.of("statistics"))
 * .build())
 * .build())
 * .profileColumns(List.of(ColumnSelectorProperty.builder()
 * .name("name")
 * .regex("regex")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-profileconfiguration.html)
 */
@CdkDslMarker
public class CfnJobProfileConfigurationPropertyDsl {
    private val cdkBuilder: CfnJob.ProfileConfigurationProperty.Builder =
        CfnJob.ProfileConfigurationProperty.builder()

    private val _columnStatisticsConfigurations: MutableList<Any> = mutableListOf()

    private val _profileColumns: MutableList<Any> = mutableListOf()

    /**
     * @param columnStatisticsConfigurations List of configurations for column evaluations.
     *   ColumnStatisticsConfigurations are used to select evaluations and override parameters of
     *   evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
     *   profile job will profile all supported columns and run all supported evaluations.
     */
    public fun columnStatisticsConfigurations(vararg columnStatisticsConfigurations: Any) {
        _columnStatisticsConfigurations.addAll(listOf(*columnStatisticsConfigurations))
    }

    /**
     * @param columnStatisticsConfigurations List of configurations for column evaluations.
     *   ColumnStatisticsConfigurations are used to select evaluations and override parameters of
     *   evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
     *   profile job will profile all supported columns and run all supported evaluations.
     */
    public fun columnStatisticsConfigurations(columnStatisticsConfigurations: Collection<Any>) {
        _columnStatisticsConfigurations.addAll(columnStatisticsConfigurations)
    }

    /**
     * @param columnStatisticsConfigurations List of configurations for column evaluations.
     *   ColumnStatisticsConfigurations are used to select evaluations and override parameters of
     *   evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
     *   profile job will profile all supported columns and run all supported evaluations.
     */
    public fun columnStatisticsConfigurations(columnStatisticsConfigurations: IResolvable) {
        cdkBuilder.columnStatisticsConfigurations(columnStatisticsConfigurations)
    }

    /**
     * @param datasetStatisticsConfiguration Configuration for inter-column evaluations.
     *   Configuration can be used to select evaluations and override parameters of evaluations.
     *   When configuration is undefined, the profile job will run all supported inter-column
     *   evaluations.
     */
    public fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: IResolvable) {
        cdkBuilder.datasetStatisticsConfiguration(datasetStatisticsConfiguration)
    }

    /**
     * @param datasetStatisticsConfiguration Configuration for inter-column evaluations.
     *   Configuration can be used to select evaluations and override parameters of evaluations.
     *   When configuration is undefined, the profile job will run all supported inter-column
     *   evaluations.
     */
    public fun datasetStatisticsConfiguration(
        datasetStatisticsConfiguration: CfnJob.StatisticsConfigurationProperty
    ) {
        cdkBuilder.datasetStatisticsConfiguration(datasetStatisticsConfiguration)
    }

    /**
     * @param entityDetectorConfiguration Configuration of entity detection for a profile job. When
     *   undefined, entity detection is disabled.
     */
    public fun entityDetectorConfiguration(entityDetectorConfiguration: IResolvable) {
        cdkBuilder.entityDetectorConfiguration(entityDetectorConfiguration)
    }

    /**
     * @param entityDetectorConfiguration Configuration of entity detection for a profile job. When
     *   undefined, entity detection is disabled.
     */
    public fun entityDetectorConfiguration(
        entityDetectorConfiguration: CfnJob.EntityDetectorConfigurationProperty
    ) {
        cdkBuilder.entityDetectorConfiguration(entityDetectorConfiguration)
    }

    /**
     * @param profileColumns List of column selectors. ProfileColumns can be used to select columns
     *   from the dataset. When ProfileColumns is undefined, the profile job will profile all
     *   supported columns.
     */
    public fun profileColumns(vararg profileColumns: Any) {
        _profileColumns.addAll(listOf(*profileColumns))
    }

    /**
     * @param profileColumns List of column selectors. ProfileColumns can be used to select columns
     *   from the dataset. When ProfileColumns is undefined, the profile job will profile all
     *   supported columns.
     */
    public fun profileColumns(profileColumns: Collection<Any>) {
        _profileColumns.addAll(profileColumns)
    }

    /**
     * @param profileColumns List of column selectors. ProfileColumns can be used to select columns
     *   from the dataset. When ProfileColumns is undefined, the profile job will profile all
     *   supported columns.
     */
    public fun profileColumns(profileColumns: IResolvable) {
        cdkBuilder.profileColumns(profileColumns)
    }

    public fun build(): CfnJob.ProfileConfigurationProperty {
        if (_columnStatisticsConfigurations.isNotEmpty())
            cdkBuilder.columnStatisticsConfigurations(_columnStatisticsConfigurations)
        if (_profileColumns.isNotEmpty()) cdkBuilder.profileColumns(_profileColumns)
        return cdkBuilder.build()
    }
}
