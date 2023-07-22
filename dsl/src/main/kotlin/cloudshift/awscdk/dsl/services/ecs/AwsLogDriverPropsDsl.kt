@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.AwsLogDriverMode
import software.amazon.awscdk.services.ecs.AwsLogDriverProps
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.RetentionDays

/**
 * Specifies the awslogs log driver configuration options.
 *
 * Example:
 *
 * ```
 * // Create a Task Definition for the Windows container to start
 * FargateTaskDefinition taskDefinition = FargateTaskDefinition.Builder.create(this, "TaskDef")
 * .runtimePlatform(RuntimePlatform.builder()
 * .operatingSystemFamily(OperatingSystemFamily.WINDOWS_SERVER_2019_CORE)
 * .cpuArchitecture(CpuArchitecture.X86_64)
 * .build())
 * .cpu(1024)
 * .memoryLimitMiB(2048)
 * .build();
 * taskDefinition.addContainer("windowsservercore", ContainerDefinitionOptions.builder()
 * .logging(LogDriver.awsLogs(AwsLogDriverProps.builder().streamPrefix("win-iis-on-fargate").build()))
 * .portMappings(List.of(PortMapping.builder().containerPort(80).build()))
 * .image(ContainerImage.fromRegistry("mcr.microsoft.com/windows/servercore/iis:windowsservercore-ltsc2019"))
 * .build());
 * ```
 */
@CdkDslMarker
public class AwsLogDriverPropsDsl {
  private val cdkBuilder: AwsLogDriverProps.Builder = AwsLogDriverProps.builder()

  /**
   * @param datetimeFormat This option defines a multiline start pattern in Python strftime format.
   * A log message consists of a line that matches the pattern and any
   * following lines that don’t match the pattern. Thus the matched line is
   * the delimiter between log messages.
   */
  public fun datetimeFormat(datetimeFormat: String) {
    cdkBuilder.datetimeFormat(datetimeFormat)
  }

  /**
   * @param logGroup The log group to log to.
   */
  public fun logGroup(logGroup: ILogGroup) {
    cdkBuilder.logGroup(logGroup)
  }

  /**
   * @param logRetention The number of days log events are kept in CloudWatch Logs when the log
   * group is automatically created by this construct.
   */
  public fun logRetention(logRetention: RetentionDays) {
    cdkBuilder.logRetention(logRetention)
  }

  /**
   * @param mode The delivery mode of log messages from the container to awslogs.
   */
  public fun mode(mode: AwsLogDriverMode) {
    cdkBuilder.mode(mode)
  }

  /**
   * @param multilinePattern This option defines a multiline start pattern using a regular
   * expression.
   * A log message consists of a line that matches the pattern and any
   * following lines that don’t match the pattern. Thus the matched line is
   * the delimiter between log messages.
   *
   * This option is ignored if datetimeFormat is also configured.
   */
  public fun multilinePattern(multilinePattern: String) {
    cdkBuilder.multilinePattern(multilinePattern)
  }

  /**
   * @param streamPrefix Prefix for the log streams. 
   * The awslogs-stream-prefix option allows you to associate a log stream
   * with the specified prefix, the container name, and the ID of the Amazon
   * ECS task to which the container belongs. If you specify a prefix with
   * this option, then the log stream takes the following format:
   *
   * ```
   * prefix-name/container-name/ecs-task-id
   * ```
   */
  public fun streamPrefix(streamPrefix: String) {
    cdkBuilder.streamPrefix(streamPrefix)
  }

  public fun build(): AwsLogDriverProps = cdkBuilder.build()
}
