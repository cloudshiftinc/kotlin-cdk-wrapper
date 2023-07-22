@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.AwsLogDriver
import software.amazon.awscdk.services.ecs.AwsLogDriverMode
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.RetentionDays

@CdkDslMarker
public class AwsLogDriverDsl {
  private val cdkBuilder: AwsLogDriver.Builder = AwsLogDriver.Builder.create()

  /**
   * This option defines a multiline start pattern in Python strftime format.
   *
   * A log message consists of a line that matches the pattern and any
   * following lines that don’t match the pattern. Thus the matched line is
   * the delimiter between log messages.
   *
   * Default: - No multiline matching.
   *
   * @param datetimeFormat This option defines a multiline start pattern in Python strftime format. 
   */
  public fun datetimeFormat(datetimeFormat: String) {
    cdkBuilder.datetimeFormat(datetimeFormat)
  }

  /**
   * The log group to log to.
   *
   * Default: - A log group is automatically created.
   *
   * @param logGroup The log group to log to. 
   */
  public fun logGroup(logGroup: ILogGroup) {
    cdkBuilder.logGroup(logGroup)
  }

  /**
   * The number of days log events are kept in CloudWatch Logs when the log group is automatically
   * created by this construct.
   *
   * Default: - Logs never expire.
   *
   * @param logRetention The number of days log events are kept in CloudWatch Logs when the log
   * group is automatically created by this construct. 
   */
  public fun logRetention(logRetention: RetentionDays) {
    cdkBuilder.logRetention(logRetention)
  }

  /**
   * The delivery mode of log messages from the container to awslogs.
   *
   * Default: - AwsLogDriverMode.BLOCKING
   *
   * @param mode The delivery mode of log messages from the container to awslogs. 
   */
  public fun mode(mode: AwsLogDriverMode) {
    cdkBuilder.mode(mode)
  }

  /**
   * This option defines a multiline start pattern using a regular expression.
   *
   * A log message consists of a line that matches the pattern and any
   * following lines that don’t match the pattern. Thus the matched line is
   * the delimiter between log messages.
   *
   * This option is ignored if datetimeFormat is also configured.
   *
   * Default: - No multiline matching.
   *
   * @param multilinePattern This option defines a multiline start pattern using a regular
   * expression. 
   */
  public fun multilinePattern(multilinePattern: String) {
    cdkBuilder.multilinePattern(multilinePattern)
  }

  /**
   * Prefix for the log streams.
   *
   * The awslogs-stream-prefix option allows you to associate a log stream
   * with the specified prefix, the container name, and the ID of the Amazon
   * ECS task to which the container belongs. If you specify a prefix with
   * this option, then the log stream takes the following format:
   *
   * ```
   * prefix-name/container-name/ecs-task-id
   * ```
   *
   * @param streamPrefix Prefix for the log streams. 
   */
  public fun streamPrefix(streamPrefix: String) {
    cdkBuilder.streamPrefix(streamPrefix)
  }

  public fun build(): AwsLogDriver = cdkBuilder.build()
}
