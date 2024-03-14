package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface LogStreamProps {
  /**
   * The log group to create a log stream for.
   */
  public fun logGroup(): ILogGroup

  /**
   * The name of the log stream to create.
   *
   * The name must be unique within the log group.
   *
   * Default: Automatically generated
   */
  public fun logStreamName(): String? = unwrap(this).getLogStreamName()

  /**
   * Determine what happens when the log stream resource is removed from the app.
   *
   * Normally you want to retain the log stream so you can diagnose issues from
   * logs even after a deployment that no longer includes the log stream.
   *
   * The date-based retention policy of your log group will age out the logs
   * after a certain time.
   *
   * Default: RemovalPolicy.Retain
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * A builder for [LogStreamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logGroup The log group to create a log stream for. 
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * @param logStreamName The name of the log stream to create.
     * The name must be unique within the log group.
     */
    public fun logStreamName(logStreamName: String)

    /**
     * @param removalPolicy Determine what happens when the log stream resource is removed from the
     * app.
     * Normally you want to retain the log stream so you can diagnose issues from
     * logs even after a deployment that no longer includes the log stream.
     *
     * The date-based retention policy of your log group will age out the logs
     * after a certain time.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.LogStreamProps.Builder =
        software.amazon.awscdk.services.logs.LogStreamProps.builder()

    /**
     * @param logGroup The log group to create a log stream for. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param logStreamName The name of the log stream to create.
     * The name must be unique within the log group.
     */
    override fun logStreamName(logStreamName: String) {
      cdkBuilder.logStreamName(logStreamName)
    }

    /**
     * @param removalPolicy Determine what happens when the log stream resource is removed from the
     * app.
     * Normally you want to retain the log stream so you can diagnose issues from
     * logs even after a deployment that no longer includes the log stream.
     *
     * The date-based retention policy of your log group will age out the logs
     * after a certain time.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogStreamProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.LogStreamProps,
  ) : CdkObject(cdkObject), LogStreamProps {
    /**
     * The log group to create a log stream for.
     */
    override fun logGroup(): ILogGroup = unwrap(this).getLogGroup().let(ILogGroup::wrap)

    /**
     * The name of the log stream to create.
     *
     * The name must be unique within the log group.
     *
     * Default: Automatically generated
     */
    override fun logStreamName(): String? = unwrap(this).getLogStreamName()

    /**
     * Determine what happens when the log stream resource is removed from the app.
     *
     * Normally you want to retain the log stream so you can diagnose issues from
     * logs even after a deployment that no longer includes the log stream.
     *
     * The date-based retention policy of your log group will age out the logs
     * after a certain time.
     *
     * Default: RemovalPolicy.Retain
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.LogStreamProps):
        LogStreamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogStreamProps):
        software.amazon.awscdk.services.logs.LogStreamProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.LogStreamProps
  }
}
