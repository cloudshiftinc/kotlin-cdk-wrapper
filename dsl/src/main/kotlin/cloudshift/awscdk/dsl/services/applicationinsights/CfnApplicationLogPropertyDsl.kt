@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application Log` property type specifies a log to monitor for the
 * component.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * LogProperty logProperty = LogProperty.builder()
 * .logType("logType")
 * // the properties below are optional
 * .encoding("encoding")
 * .logGroupName("logGroupName")
 * .logPath("logPath")
 * .patternSet("patternSet")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html)
 */
@CdkDslMarker
public class CfnApplicationLogPropertyDsl {
  private val cdkBuilder: CfnApplication.LogProperty.Builder = CfnApplication.LogProperty.builder()

  /**
   * @param encoding The type of encoding of the logs to be monitored.
   * The specified encoding should be included in the list of CloudWatch agent supported encodings.
   * If not provided, CloudWatch Application Insights uses the default encoding type for the log type:
   *
   * * `APPLICATION/DEFAULT` : utf-8 encoding
   * * `SQL_SERVER` : utf-16 encoding
   * * `IIS` : ascii encoding
   */
  public fun encoding(encoding: String) {
    cdkBuilder.encoding(encoding)
  }

  /**
   * @param logGroupName The CloudWatch log group name to be associated with the monitored log.
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * @param logPath The path of the logs to be monitored.
   * The log path must be an absolute Windows or Linux system file path. For more information, see
   * [CloudWatch Agent Configuration File: Logs
   * Section](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Agent-Configuration-File-Details.html#CloudWatch-Agent-Configuration-File-Logssection)
   * .
   */
  public fun logPath(logPath: String) {
    cdkBuilder.logPath(logPath)
  }

  /**
   * @param logType The log type decides the log patterns against which Application Insights
   * analyzes the log. 
   * The log type is selected from the following: `SQL_SERVER` , `MYSQL` , `MYSQL_SLOW_QUERY` ,
   * `POSTGRESQL` , `ORACLE_ALERT` , `ORACLE_LISTENER` , `IIS` , `APPLICATION` , `WINDOWS_EVENTS` ,
   * `WINDOWS_EVENTS_ACTIVE_DIRECTORY` , `WINDOWS_EVENTS_DNS` , `WINDOWS_EVENTS_IIS` ,
   * `WINDOWS_EVENTS_SHAREPOINT` , `SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP` ,
   * `SQL_SERVER_FAILOVER_CLUSTER_INSTANCE` , `STEP_FUNCTION` , `API_GATEWAY_ACCESS` ,
   * `API_GATEWAY_EXECUTION` , `SAP_HANA_LOGS` , `SAP_HANA_TRACE` , `SAP_HANA_HIGH_AVAILABILITY` , and
   * `DEFAULT` .
   */
  public fun logType(logType: String) {
    cdkBuilder.logType(logType)
  }

  /**
   * @param patternSet The log pattern set.
   */
  public fun patternSet(patternSet: String) {
    cdkBuilder.patternSet(patternSet)
  }

  public fun build(): CfnApplication.LogProperty = cdkBuilder.build()
}
