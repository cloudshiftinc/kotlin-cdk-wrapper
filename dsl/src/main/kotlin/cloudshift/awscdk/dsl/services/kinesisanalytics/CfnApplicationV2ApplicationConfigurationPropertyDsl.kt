@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2ApplicationConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.ApplicationConfigurationProperty.Builder =
      CfnApplicationV2.ApplicationConfigurationProperty.builder()

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
      fun applicationCodeConfiguration(applicationCodeConfiguration: CfnApplicationV2.ApplicationCodeConfigurationProperty) {
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
      fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: CfnApplicationV2.ApplicationSnapshotConfigurationProperty) {
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
      fun environmentProperties(environmentProperties: CfnApplicationV2.EnvironmentPropertiesProperty) {
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
      fun flinkApplicationConfiguration(flinkApplicationConfiguration: CfnApplicationV2.FlinkApplicationConfigurationProperty) {
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
      fun sqlApplicationConfiguration(sqlApplicationConfiguration: CfnApplicationV2.SqlApplicationConfigurationProperty) {
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
      fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: CfnApplicationV2.ZeppelinApplicationConfigurationProperty) {
    cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration)
  }

  public fun build(): CfnApplicationV2.ApplicationConfigurationProperty {
    if(_vpcConfigurations.isNotEmpty()) cdkBuilder.vpcConfigurations(_vpcConfigurations)
    return cdkBuilder.build()
  }
}
