@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobProfileConfigurationPropertyDsl {
  private val cdkBuilder: CfnJob.ProfileConfigurationProperty.Builder =
      CfnJob.ProfileConfigurationProperty.builder()

  private val _columnStatisticsConfigurations: MutableList<Any> = mutableListOf()

  private val _profileColumns: MutableList<Any> = mutableListOf()

  /**
   * @param columnStatisticsConfigurations List of configurations for column evaluations.
   * ColumnStatisticsConfigurations are used to select evaluations and override parameters of
   * evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the profile
   * job will profile all supported columns and run all supported evaluations.
   */
  public fun columnStatisticsConfigurations(vararg columnStatisticsConfigurations: Any) {
    _columnStatisticsConfigurations.addAll(listOf(*columnStatisticsConfigurations))
  }

  /**
   * @param columnStatisticsConfigurations List of configurations for column evaluations.
   * ColumnStatisticsConfigurations are used to select evaluations and override parameters of
   * evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the profile
   * job will profile all supported columns and run all supported evaluations.
   */
  public fun columnStatisticsConfigurations(columnStatisticsConfigurations: Collection<Any>) {
    _columnStatisticsConfigurations.addAll(columnStatisticsConfigurations)
  }

  /**
   * @param columnStatisticsConfigurations List of configurations for column evaluations.
   * ColumnStatisticsConfigurations are used to select evaluations and override parameters of
   * evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the profile
   * job will profile all supported columns and run all supported evaluations.
   */
  public fun columnStatisticsConfigurations(columnStatisticsConfigurations: IResolvable) {
    cdkBuilder.columnStatisticsConfigurations(columnStatisticsConfigurations)
  }

  /**
   * @param datasetStatisticsConfiguration Configuration for inter-column evaluations.
   * Configuration can be used to select evaluations and override parameters of evaluations. When
   * configuration is undefined, the profile job will run all supported inter-column evaluations.
   */
  public fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: IResolvable) {
    cdkBuilder.datasetStatisticsConfiguration(datasetStatisticsConfiguration)
  }

  /**
   * @param datasetStatisticsConfiguration Configuration for inter-column evaluations.
   * Configuration can be used to select evaluations and override parameters of evaluations. When
   * configuration is undefined, the profile job will run all supported inter-column evaluations.
   */
  public
      fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: CfnJob.StatisticsConfigurationProperty) {
    cdkBuilder.datasetStatisticsConfiguration(datasetStatisticsConfiguration)
  }

  /**
   * @param entityDetectorConfiguration Configuration of entity detection for a profile job.
   * When undefined, entity detection is disabled.
   */
  public fun entityDetectorConfiguration(entityDetectorConfiguration: IResolvable) {
    cdkBuilder.entityDetectorConfiguration(entityDetectorConfiguration)
  }

  /**
   * @param entityDetectorConfiguration Configuration of entity detection for a profile job.
   * When undefined, entity detection is disabled.
   */
  public
      fun entityDetectorConfiguration(entityDetectorConfiguration: CfnJob.EntityDetectorConfigurationProperty) {
    cdkBuilder.entityDetectorConfiguration(entityDetectorConfiguration)
  }

  /**
   * @param profileColumns List of column selectors.
   * ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
   * undefined, the profile job will profile all supported columns.
   */
  public fun profileColumns(vararg profileColumns: Any) {
    _profileColumns.addAll(listOf(*profileColumns))
  }

  /**
   * @param profileColumns List of column selectors.
   * ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
   * undefined, the profile job will profile all supported columns.
   */
  public fun profileColumns(profileColumns: Collection<Any>) {
    _profileColumns.addAll(profileColumns)
  }

  /**
   * @param profileColumns List of column selectors.
   * ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
   * undefined, the profile job will profile all supported columns.
   */
  public fun profileColumns(profileColumns: IResolvable) {
    cdkBuilder.profileColumns(profileColumns)
  }

  public fun build(): CfnJob.ProfileConfigurationProperty {
    if(_columnStatisticsConfigurations.isNotEmpty())
        cdkBuilder.columnStatisticsConfigurations(_columnStatisticsConfigurations)
    if(_profileColumns.isNotEmpty()) cdkBuilder.profileColumns(_profileColumns)
    return cdkBuilder.build()
  }
}
