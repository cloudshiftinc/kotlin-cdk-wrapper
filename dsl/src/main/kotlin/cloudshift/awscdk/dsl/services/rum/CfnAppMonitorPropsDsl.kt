@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rum

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rum.CfnAppMonitor
import software.amazon.awscdk.services.rum.CfnAppMonitorProps

@CdkDslMarker
public class CfnAppMonitorPropsDsl {
  private val cdkBuilder: CfnAppMonitorProps.Builder = CfnAppMonitorProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param appMonitorConfiguration A structure that contains much of the configuration data for the
   * app monitor.
   * If you are using Amazon Cognito for authorization, you must include this structure in your
   * request, and it must include the ID of the Amazon Cognito identity pool to use for authorization.
   * If you don't include `AppMonitorConfiguration` , you must set up your own authorization method.
   * For more information, see [Authorize your application to send data to
   * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
   * .
   *
   * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
   * sessions.
   */
  public fun appMonitorConfiguration(appMonitorConfiguration: IResolvable) {
    cdkBuilder.appMonitorConfiguration(appMonitorConfiguration)
  }

  /**
   * @param appMonitorConfiguration A structure that contains much of the configuration data for the
   * app monitor.
   * If you are using Amazon Cognito for authorization, you must include this structure in your
   * request, and it must include the ID of the Amazon Cognito identity pool to use for authorization.
   * If you don't include `AppMonitorConfiguration` , you must set up your own authorization method.
   * For more information, see [Authorize your application to send data to
   * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
   * .
   *
   * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
   * sessions.
   */
  public
      fun appMonitorConfiguration(appMonitorConfiguration: CfnAppMonitor.AppMonitorConfigurationProperty) {
    cdkBuilder.appMonitorConfiguration(appMonitorConfiguration)
  }

  /**
   * @param customEvents Specifies whether this app monitor allows the web client to define and send
   * custom events.
   * If you omit this parameter, custom events are `DISABLED` .
   */
  public fun customEvents(customEvents: IResolvable) {
    cdkBuilder.customEvents(customEvents)
  }

  /**
   * @param customEvents Specifies whether this app monitor allows the web client to define and send
   * custom events.
   * If you omit this parameter, custom events are `DISABLED` .
   */
  public fun customEvents(customEvents: CfnAppMonitor.CustomEventsProperty) {
    cdkBuilder.customEvents(customEvents)
  }

  /**
   * @param cwLogEnabled Data collected by CloudWatch RUM is kept by RUM for 30 days and then
   * deleted.
   * This parameter specifies whether CloudWatch RUM sends a copy of this telemetry data to Amazon
   * CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30
   * days, but it does incur Amazon CloudWatch Logs charges.
   *
   * If you omit this parameter, the default is `false` .
   */
  public fun cwLogEnabled(cwLogEnabled: Boolean) {
    cdkBuilder.cwLogEnabled(cwLogEnabled)
  }

  /**
   * @param cwLogEnabled Data collected by CloudWatch RUM is kept by RUM for 30 days and then
   * deleted.
   * This parameter specifies whether CloudWatch RUM sends a copy of this telemetry data to Amazon
   * CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30
   * days, but it does incur Amazon CloudWatch Logs charges.
   *
   * If you omit this parameter, the default is `false` .
   */
  public fun cwLogEnabled(cwLogEnabled: IResolvable) {
    cdkBuilder.cwLogEnabled(cwLogEnabled)
  }

  /**
   * @param domain The top-level internet domain name for which your application has administrative
   * authority. 
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  /**
   * @param name A name for the app monitor. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags Assigns one or more tags (key-value pairs) to the app monitor.
   * Tags can help you organize and categorize your resources. You can also use them to scope user
   * permissions by granting a user permission to access or change only resources with certain tag
   * values.
   *
   * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
   * characters.
   *
   * You can associate as many as 50 tags with an app monitor.
   *
   * For more information, see [Tagging AWS
   * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Assigns one or more tags (key-value pairs) to the app monitor.
   * Tags can help you organize and categorize your resources. You can also use them to scope user
   * permissions by granting a user permission to access or change only resources with certain tag
   * values.
   *
   * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
   * characters.
   *
   * You can associate as many as 50 tags with an app monitor.
   *
   * For more information, see [Tagging AWS
   * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAppMonitorProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
