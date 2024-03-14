package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.String
import kotlin.Unit

public interface AwsLogDriverProps {
  /**
   * This option defines a multiline start pattern in Python strftime format.
   *
   * A log message consists of a line that matches the pattern and any
   * following lines that don’t match the pattern. Thus the matched line is
   * the delimiter between log messages.
   *
   * Default: - No multiline matching.
   */
  public fun datetimeFormat(): String? = unwrap(this).getDatetimeFormat()

  /**
   * The log group to log to.
   *
   * Default: - A log group is automatically created.
   */
  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  /**
   * The number of days log events are kept in CloudWatch Logs when the log group is automatically
   * created by this construct.
   *
   * Default: - Logs never expire.
   */
  public fun logRetention(): RetentionDays? =
      unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

  /**
   * When AwsLogDriverMode.NON_BLOCKING is configured, this parameter controls the size of the
   * non-blocking buffer used to temporarily store messages. This parameter is not valid with
   * AwsLogDriverMode.BLOCKING.
   *
   * Default: - 1 megabyte if driver mode is non-blocking, otherwise this property is not set
   */
  public fun maxBufferSize(): Size? = unwrap(this).getMaxBufferSize()?.let(Size::wrap)

  /**
   * The delivery mode of log messages from the container to awslogs.
   *
   * Default: - AwsLogDriverMode.BLOCKING
   */
  public fun mode(): AwsLogDriverMode? = unwrap(this).getMode()?.let(AwsLogDriverMode::wrap)

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
   */
  public fun multilinePattern(): String? = unwrap(this).getMultilinePattern()

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
   */
  public fun streamPrefix(): String

  /**
   * A builder for [AwsLogDriverProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param datetimeFormat This option defines a multiline start pattern in Python strftime
     * format.
     * A log message consists of a line that matches the pattern and any
     * following lines that don’t match the pattern. Thus the matched line is
     * the delimiter between log messages.
     */
    public fun datetimeFormat(datetimeFormat: String)

    /**
     * @param logGroup The log group to log to.
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * @param logRetention The number of days log events are kept in CloudWatch Logs when the log
     * group is automatically created by this construct.
     */
    public fun logRetention(logRetention: RetentionDays)

    /**
     * @param maxBufferSize When AwsLogDriverMode.NON_BLOCKING is configured, this parameter
     * controls the size of the non-blocking buffer used to temporarily store messages. This parameter
     * is not valid with AwsLogDriverMode.BLOCKING.
     */
    public fun maxBufferSize(maxBufferSize: Size)

    /**
     * @param mode The delivery mode of log messages from the container to awslogs.
     */
    public fun mode(mode: AwsLogDriverMode)

    /**
     * @param multilinePattern This option defines a multiline start pattern using a regular
     * expression.
     * A log message consists of a line that matches the pattern and any
     * following lines that don’t match the pattern. Thus the matched line is
     * the delimiter between log messages.
     *
     * This option is ignored if datetimeFormat is also configured.
     */
    public fun multilinePattern(multilinePattern: String)

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
    public fun streamPrefix(streamPrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.AwsLogDriverProps.builder()

    /**
     * @param datetimeFormat This option defines a multiline start pattern in Python strftime
     * format.
     * A log message consists of a line that matches the pattern and any
     * following lines that don’t match the pattern. Thus the matched line is
     * the delimiter between log messages.
     */
    override fun datetimeFormat(datetimeFormat: String) {
      cdkBuilder.datetimeFormat(datetimeFormat)
    }

    /**
     * @param logGroup The log group to log to.
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param logRetention The number of days log events are kept in CloudWatch Logs when the log
     * group is automatically created by this construct.
     */
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    /**
     * @param maxBufferSize When AwsLogDriverMode.NON_BLOCKING is configured, this parameter
     * controls the size of the non-blocking buffer used to temporarily store messages. This parameter
     * is not valid with AwsLogDriverMode.BLOCKING.
     */
    override fun maxBufferSize(maxBufferSize: Size) {
      cdkBuilder.maxBufferSize(maxBufferSize.let(Size::unwrap))
    }

    /**
     * @param mode The delivery mode of log messages from the container to awslogs.
     */
    override fun mode(mode: AwsLogDriverMode) {
      cdkBuilder.mode(mode.let(AwsLogDriverMode::unwrap))
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
    override fun multilinePattern(multilinePattern: String) {
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
    override fun streamPrefix(streamPrefix: String) {
      cdkBuilder.streamPrefix(streamPrefix)
    }

    public fun build(): software.amazon.awscdk.services.ecs.AwsLogDriverProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.AwsLogDriverProps,
  ) : CdkObject(cdkObject), AwsLogDriverProps {
    /**
     * This option defines a multiline start pattern in Python strftime format.
     *
     * A log message consists of a line that matches the pattern and any
     * following lines that don’t match the pattern. Thus the matched line is
     * the delimiter between log messages.
     *
     * Default: - No multiline matching.
     */
    override fun datetimeFormat(): String? = unwrap(this).getDatetimeFormat()

    /**
     * The log group to log to.
     *
     * Default: - A log group is automatically created.
     */
    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    /**
     * The number of days log events are kept in CloudWatch Logs when the log group is automatically
     * created by this construct.
     *
     * Default: - Logs never expire.
     */
    override fun logRetention(): RetentionDays? =
        unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

    /**
     * When AwsLogDriverMode.NON_BLOCKING is configured, this parameter controls the size of the
     * non-blocking buffer used to temporarily store messages. This parameter is not valid with
     * AwsLogDriverMode.BLOCKING.
     *
     * Default: - 1 megabyte if driver mode is non-blocking, otherwise this property is not set
     */
    override fun maxBufferSize(): Size? = unwrap(this).getMaxBufferSize()?.let(Size::wrap)

    /**
     * The delivery mode of log messages from the container to awslogs.
     *
     * Default: - AwsLogDriverMode.BLOCKING
     */
    override fun mode(): AwsLogDriverMode? = unwrap(this).getMode()?.let(AwsLogDriverMode::wrap)

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
     */
    override fun multilinePattern(): String? = unwrap(this).getMultilinePattern()

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
     */
    override fun streamPrefix(): String = unwrap(this).getStreamPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AwsLogDriverProps):
        AwsLogDriverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsLogDriverProps):
        software.amazon.awscdk.services.ecs.AwsLogDriverProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.AwsLogDriverProps
  }
}
