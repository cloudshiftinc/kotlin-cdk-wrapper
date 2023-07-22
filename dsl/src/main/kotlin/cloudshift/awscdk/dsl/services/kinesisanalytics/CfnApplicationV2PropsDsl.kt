@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props

@CdkDslMarker
public class CfnApplicationV2PropsDsl {
  private val cdkBuilder: CfnApplicationV2Props.Builder = CfnApplicationV2Props.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param applicationConfiguration Use this parameter to configure the application.
   */
  public fun applicationConfiguration(applicationConfiguration: IResolvable) {
    cdkBuilder.applicationConfiguration(applicationConfiguration)
  }

  /**
   * @param applicationConfiguration Use this parameter to configure the application.
   */
  public
      fun applicationConfiguration(applicationConfiguration: CfnApplicationV2.ApplicationConfigurationProperty) {
    cdkBuilder.applicationConfiguration(applicationConfiguration)
  }

  /**
   * @param applicationDescription The description of the application.
   */
  public fun applicationDescription(applicationDescription: String) {
    cdkBuilder.applicationDescription(applicationDescription)
  }

  /**
   * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
   * application.
   */
  public fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable) {
    cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration)
  }

  /**
   * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
   * application.
   */
  public
      fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplicationV2.ApplicationMaintenanceConfigurationProperty) {
    cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration)
  }

  /**
   * @param applicationMode To create a Kinesis Data Analytics Studio notebook, you must set the
   * mode to `INTERACTIVE` .
   * However, for a Kinesis Data Analytics for Apache Flink application, the mode is optional.
   */
  public fun applicationMode(applicationMode: String) {
    cdkBuilder.applicationMode(applicationMode)
  }

  /**
   * @param applicationName The name of the application.
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * @param runConfiguration Identifies the run configuration (start parameters) of a Kinesis Data
   * Analytics application.
   * This section is evaluated only on stack updates for applications in running RUNNING state and
   * has no effect during manual application start.
   */
  public fun runConfiguration(runConfiguration: IResolvable) {
    cdkBuilder.runConfiguration(runConfiguration)
  }

  /**
   * @param runConfiguration Identifies the run configuration (start parameters) of a Kinesis Data
   * Analytics application.
   * This section is evaluated only on stack updates for applications in running RUNNING state and
   * has no effect during manual application start.
   */
  public fun runConfiguration(runConfiguration: CfnApplicationV2.RunConfigurationProperty) {
    cdkBuilder.runConfiguration(runConfiguration)
  }

  /**
   * @param runtimeEnvironment The runtime environment for the application. 
   */
  public fun runtimeEnvironment(runtimeEnvironment: String) {
    cdkBuilder.runtimeEnvironment(runtimeEnvironment)
  }

  /**
   * @param serviceExecutionRole Specifies the IAM role that the application uses to access external
   * resources. 
   */
  public fun serviceExecutionRole(serviceExecutionRole: String) {
    cdkBuilder.serviceExecutionRole(serviceExecutionRole)
  }

  /**
   * @param tags A list of one or more tags to assign to the application.
   * A tag is a key-value pair that identifies an application. Note that the maximum number of
   * application tags includes system tags. The maximum number of user-defined application tags is 50.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of one or more tags to assign to the application.
   * A tag is a key-value pair that identifies an application. Note that the maximum number of
   * application tags includes system tags. The maximum number of user-defined application tags is 50.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnApplicationV2Props {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
