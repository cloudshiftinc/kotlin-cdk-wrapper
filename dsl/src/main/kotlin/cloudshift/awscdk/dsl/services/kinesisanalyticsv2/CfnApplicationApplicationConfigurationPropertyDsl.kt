@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationApplicationConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.ApplicationConfigurationProperty.Builder =
      CfnApplication.ApplicationConfigurationProperty.builder()

  private val _vpcConfigurations: MutableList<Any> = mutableListOf()

  /**
   * @param applicationCodeConfiguration The code location and type parameters for a Flink-based
   * Kinesis Data Analytics application.
   */
  public fun applicationCodeConfiguration(applicationCodeConfiguration: IResolvable) {
    cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration)
  }

  /**
   * @param applicationCodeConfiguration The code location and type parameters for a Flink-based
   * Kinesis Data Analytics application.
   */
  public
      fun applicationCodeConfiguration(applicationCodeConfiguration: CfnApplication.ApplicationCodeConfigurationProperty) {
    cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration)
  }

  /**
   * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
   * Flink-based Kinesis Data Analytics application.
   */
  public fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: IResolvable) {
    cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration)
  }

  /**
   * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
   * Flink-based Kinesis Data Analytics application.
   */
  public
      fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: CfnApplication.ApplicationSnapshotConfigurationProperty) {
    cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration)
  }

  /**
   * @param environmentProperties Describes execution properties for a Flink-based Kinesis Data
   * Analytics application.
   */
  public fun environmentProperties(environmentProperties: IResolvable) {
    cdkBuilder.environmentProperties(environmentProperties)
  }

  /**
   * @param environmentProperties Describes execution properties for a Flink-based Kinesis Data
   * Analytics application.
   */
  public
      fun environmentProperties(environmentProperties: CfnApplication.EnvironmentPropertiesProperty) {
    cdkBuilder.environmentProperties(environmentProperties)
  }

  /**
   * @param flinkApplicationConfiguration The creation and update parameters for a Flink-based
   * Kinesis Data Analytics application.
   */
  public fun flinkApplicationConfiguration(flinkApplicationConfiguration: IResolvable) {
    cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration)
  }

  /**
   * @param flinkApplicationConfiguration The creation and update parameters for a Flink-based
   * Kinesis Data Analytics application.
   */
  public
      fun flinkApplicationConfiguration(flinkApplicationConfiguration: CfnApplication.FlinkApplicationConfigurationProperty) {
    cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration)
  }

  /**
   * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based Kinesis
   * Data Analytics application.
   */
  public fun sqlApplicationConfiguration(sqlApplicationConfiguration: IResolvable) {
    cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration)
  }

  /**
   * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based Kinesis
   * Data Analytics application.
   */
  public
      fun sqlApplicationConfiguration(sqlApplicationConfiguration: CfnApplication.SqlApplicationConfigurationProperty) {
    cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration)
  }

  /**
   * @param vpcConfigurations The array of descriptions of VPC configurations available to the
   * application.
   */
  public fun vpcConfigurations(vararg vpcConfigurations: Any) {
    _vpcConfigurations.addAll(listOf(*vpcConfigurations))
  }

  /**
   * @param vpcConfigurations The array of descriptions of VPC configurations available to the
   * application.
   */
  public fun vpcConfigurations(vpcConfigurations: Collection<Any>) {
    _vpcConfigurations.addAll(vpcConfigurations)
  }

  /**
   * @param vpcConfigurations The array of descriptions of VPC configurations available to the
   * application.
   */
  public fun vpcConfigurations(vpcConfigurations: IResolvable) {
    cdkBuilder.vpcConfigurations(vpcConfigurations)
  }

  /**
   * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis Data
   * Analytics Studio notebook.
   */
  public fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: IResolvable) {
    cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration)
  }

  /**
   * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis Data
   * Analytics Studio notebook.
   */
  public
      fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: CfnApplication.ZeppelinApplicationConfigurationProperty) {
    cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration)
  }

  public fun build(): CfnApplication.ApplicationConfigurationProperty {
    if(_vpcConfigurations.isNotEmpty()) cdkBuilder.vpcConfigurations(_vpcConfigurations)
    return cdkBuilder.build()
  }
}
