@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnEnvironment
import software.constructs.Construct

/**
 * The `AWS::AppConfig::Environment` resource creates an environment, which is a logical deployment
 * group of AWS AppConfig targets, such as applications in a `Beta` or `Production` environment.
 *
 * You define one or more environments for each AWS AppConfig application. You can also define
 * environments for application subcomponents such as the `Web` , `Mobile` and `Back-end` components
 * for your application. You can configure Amazon CloudWatch alarms for each environment. The system
 * monitors alarms during a configuration deployment. If an alarm is triggered, the system rolls back
 * the configuration.
 *
 * AWS AppConfig requires that you create resources and deploy a configuration in the following
 * order:
 *
 * * Create an application
 * * Create an environment
 * * Create a configuration profile
 * * Create a deployment strategy
 * * Deploy the configuration
 *
 * For more information, see [AWS
 * AppConfig](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the
 * *AWS AppConfig User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
 * .applicationId("applicationId")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .monitors(List.of(MonitorsProperty.builder()
 * .alarmArn("alarmArn")
 * .alarmRoleArn("alarmRoleArn")
 * .build()))
 * .tags(List.of(TagsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html)
 */
@CdkDslMarker
public class CfnEnvironmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEnvironment.Builder = CfnEnvironment.Builder.create(scope, id)

  private val _monitors: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnEnvironment.TagsProperty> = mutableListOf()

  /**
   * The application ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-applicationid)
   * @param applicationId The application ID. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * A description of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-description)
   * @param description A description of the environment. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Amazon CloudWatch alarms to monitor during the deployment process.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-monitors)
   * @param monitors Amazon CloudWatch alarms to monitor during the deployment process. 
   */
  public fun monitors(vararg monitors: Any) {
    _monitors.addAll(listOf(*monitors))
  }

  /**
   * Amazon CloudWatch alarms to monitor during the deployment process.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-monitors)
   * @param monitors Amazon CloudWatch alarms to monitor during the deployment process. 
   */
  public fun monitors(monitors: Collection<Any>) {
    _monitors.addAll(monitors)
  }

  /**
   * Amazon CloudWatch alarms to monitor during the deployment process.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-monitors)
   * @param monitors Amazon CloudWatch alarms to monitor during the deployment process. 
   */
  public fun monitors(monitors: IResolvable) {
    cdkBuilder.monitors(monitors)
  }

  /**
   * A name for the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-name)
   * @param name A name for the environment. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Metadata to assign to the environment.
   *
   * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key and
   * an optional value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-tags)
   * @param tags Metadata to assign to the environment. 
   */
  public fun tags(tags: CfnEnvironmentTagsPropertyDsl.() -> Unit) {
    _tags.add(CfnEnvironmentTagsPropertyDsl().apply(tags).build())
  }

  /**
   * Metadata to assign to the environment.
   *
   * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key and
   * an optional value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-tags)
   * @param tags Metadata to assign to the environment. 
   */
  public fun tags(tags: Collection<CfnEnvironment.TagsProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEnvironment {
    if(_monitors.isNotEmpty()) cdkBuilder.monitors(_monitors)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
