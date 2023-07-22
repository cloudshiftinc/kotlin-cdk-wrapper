@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import software.constructs.Construct

@CdkDslMarker
public class CfnApplicationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Use this parameter to configure the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
   * @param applicationConfiguration Use this parameter to configure the application. 
   */
  public fun applicationConfiguration(applicationConfiguration: IResolvable) {
    cdkBuilder.applicationConfiguration(applicationConfiguration)
  }

  /**
   * Use this parameter to configure the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
   * @param applicationConfiguration Use this parameter to configure the application. 
   */
  public
      fun applicationConfiguration(applicationConfiguration: CfnApplication.ApplicationConfigurationProperty) {
    cdkBuilder.applicationConfiguration(applicationConfiguration)
  }

  /**
   * The description of the application.
   *
   * Default: - ""
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationdescription)
   * @param applicationDescription The description of the application. 
   */
  public fun applicationDescription(applicationDescription: String) {
    cdkBuilder.applicationDescription(applicationDescription)
  }

  /**
   * Describes the maintenance configuration for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
   * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
   * application. 
   */
  public fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable) {
    cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration)
  }

  /**
   * Describes the maintenance configuration for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
   * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
   * application. 
   */
  public
      fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplication.ApplicationMaintenanceConfigurationProperty) {
    cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration)
  }

  /**
   * To create a Kinesis Data Analytics Studio notebook, you must set the mode to `INTERACTIVE` .
   *
   * However, for a Kinesis Data Analytics for Apache Flink application, the mode is optional.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmode)
   * @param applicationMode To create a Kinesis Data Analytics Studio notebook, you must set the
   * mode to `INTERACTIVE` . 
   */
  public fun applicationMode(applicationMode: String) {
    cdkBuilder.applicationMode(applicationMode)
  }

  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationname)
   * @param applicationName The name of the application. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
   *
   * This section is evaluated only on stack updates for applications in running RUNNING state and
   * has no effect during manual application start.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
   * @param runConfiguration Identifies the run configuration (start parameters) of a Kinesis Data
   * Analytics application. 
   */
  public fun runConfiguration(runConfiguration: IResolvable) {
    cdkBuilder.runConfiguration(runConfiguration)
  }

  /**
   * Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
   *
   * This section is evaluated only on stack updates for applications in running RUNNING state and
   * has no effect during manual application start.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
   * @param runConfiguration Identifies the run configuration (start parameters) of a Kinesis Data
   * Analytics application. 
   */
  public fun runConfiguration(runConfiguration: CfnApplication.RunConfigurationProperty) {
    cdkBuilder.runConfiguration(runConfiguration)
  }

  /**
   * The runtime environment for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runtimeenvironment)
   * @param runtimeEnvironment The runtime environment for the application. 
   */
  public fun runtimeEnvironment(runtimeEnvironment: String) {
    cdkBuilder.runtimeEnvironment(runtimeEnvironment)
  }

  /**
   * Specifies the IAM role that the application uses to access external resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-serviceexecutionrole)
   * @param serviceExecutionRole Specifies the IAM role that the application uses to access external
   * resources. 
   */
  public fun serviceExecutionRole(serviceExecutionRole: String) {
    cdkBuilder.serviceExecutionRole(serviceExecutionRole)
  }

  /**
   * A list of one or more tags to assign to the application.
   *
   * A tag is a key-value pair that identifies an application. Note that the maximum number of
   * application tags includes system tags. The maximum number of user-defined application tags is 50.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-tags)
   * @param tags A list of one or more tags to assign to the application. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of one or more tags to assign to the application.
   *
   * A tag is a key-value pair that identifies an application. Note that the maximum number of
   * application tags includes system tags. The maximum number of user-defined application tags is 50.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-tags)
   * @param tags A list of one or more tags to assign to the application. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnApplication {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
