@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ecs.AwsLogDriver
import software.amazon.awscdk.services.ecs.AwsLogDriverMode
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.RetentionDays

/**
 * A log driver that sends log information to CloudWatch Logs.
 *
 * Example:
 * ```
 * Cluster cluster;
 * // Create a Task Definition for the container to start
 * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromAsset(resolve(__dirname, "..", "eventhandler-image")))
 * .memoryLimitMiB(256)
 * .logging(AwsLogDriver.Builder.create().streamPrefix("EventDemo").mode(AwsLogDriverMode.NON_BLOCKING).build())
 * .build());
 * // An Rule that describes the event trigger (in this case a scheduled run)
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.expression("rate(1 min)"))
 * .build();
 * // Pass an environment variable to the container 'TheContainer' in the task
 * rule.addTarget(EcsTask.Builder.create()
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .taskCount(1)
 * .containerOverrides(List.of(ContainerOverride.builder()
 * .containerName("TheContainer")
 * .environment(List.of(TaskEnvironmentVariable.builder()
 * .name("I_WAS_TRIGGERED")
 * .value("From CloudWatch Events")
 * .build()))
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class AwsLogDriverDsl {
    private val cdkBuilder: AwsLogDriver.Builder = AwsLogDriver.Builder.create()

    /**
     * This option defines a multiline start pattern in Python strftime format.
     *
     * A log message consists of a line that matches the pattern and any following lines that don’t
     * match the pattern. Thus the matched line is the delimiter between log messages.
     *
     * Default: - No multiline matching.
     *
     * @param datetimeFormat This option defines a multiline start pattern in Python strftime
     *   format.
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
     *   group is automatically created by this construct.
     */
    public fun logRetention(logRetention: RetentionDays) {
        cdkBuilder.logRetention(logRetention)
    }

    /**
     * When AwsLogDriverMode.NON_BLOCKING is configured, this parameter controls the size of the
     * non-blocking buffer used to temporarily store messages. This parameter is not valid with
     * AwsLogDriverMode.BLOCKING.
     *
     * Default: - 1 megabyte if driver mode is non-blocking, otherwise this property is not set
     *
     * @param maxBufferSize When AwsLogDriverMode.NON_BLOCKING is configured, this parameter
     *   controls the size of the non-blocking buffer used to temporarily store messages. This
     *   parameter is not valid with AwsLogDriverMode.BLOCKING.
     */
    public fun maxBufferSize(maxBufferSize: Size) {
        cdkBuilder.maxBufferSize(maxBufferSize)
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
     * A log message consists of a line that matches the pattern and any following lines that don’t
     * match the pattern. Thus the matched line is the delimiter between log messages.
     *
     * This option is ignored if datetimeFormat is also configured.
     *
     * Default: - No multiline matching.
     *
     * @param multilinePattern This option defines a multiline start pattern using a regular
     *   expression.
     */
    public fun multilinePattern(multilinePattern: String) {
        cdkBuilder.multilinePattern(multilinePattern)
    }

    /**
     * Prefix for the log streams.
     *
     * The awslogs-stream-prefix option allows you to associate a log stream with the specified
     * prefix, the container name, and the ID of the Amazon ECS task to which the container belongs.
     * If you specify a prefix with this option, then the log stream takes the following format:
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
