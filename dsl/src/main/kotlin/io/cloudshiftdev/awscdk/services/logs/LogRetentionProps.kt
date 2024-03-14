package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface LogRetentionProps {
  /**
   * The log group name.
   */
  public fun logGroupName(): String

  /**
   * The region where the log group should be created.
   *
   * Default: - same region as the stack
   */
  public fun logGroupRegion(): String? = unwrap(this).getLogGroupRegion()

  /**
   * Retry options for all AWS API calls.
   *
   * Default: - AWS SDK default retry options
   */
  public fun logRetentionRetryOptions(): LogRetentionRetryOptions? =
      unwrap(this).getLogRetentionRetryOptions()?.let(LogRetentionRetryOptions::wrap)

  /**
   * The removalPolicy for the log group when the stack is deleted.
   *
   * Default: RemovalPolicy.RETAIN
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * The number of days log events are kept in CloudWatch Logs.
   */
  public fun retention(): RetentionDays

  /**
   * The IAM role for the Lambda function associated with the custom resource.
   *
   * Default: - A new role is created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [LogRetentionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logGroupName The log group name. 
     */
    public fun logGroupName(logGroupName: String)

    /**
     * @param logGroupRegion The region where the log group should be created.
     */
    public fun logGroupRegion(logGroupRegion: String)

    /**
     * @param logRetentionRetryOptions Retry options for all AWS API calls.
     */
    public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions)

    /**
     * @param logRetentionRetryOptions Retry options for all AWS API calls.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dbe5bb0480327a1e081cf0bcf4f5f580ab8939cdef90debe6c0c5a00b82b40b6")
    public
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit)

    /**
     * @param removalPolicy The removalPolicy for the log group when the stack is deleted.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param retention The number of days log events are kept in CloudWatch Logs. 
     */
    public fun retention(retention: RetentionDays)

    /**
     * @param role The IAM role for the Lambda function associated with the custom resource.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.LogRetentionProps.Builder =
        software.amazon.awscdk.services.logs.LogRetentionProps.builder()

    /**
     * @param logGroupName The log group name. 
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * @param logGroupRegion The region where the log group should be created.
     */
    override fun logGroupRegion(logGroupRegion: String) {
      cdkBuilder.logGroupRegion(logGroupRegion)
    }

    /**
     * @param logRetentionRetryOptions Retry options for all AWS API calls.
     */
    override fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
      cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions.let(LogRetentionRetryOptions::unwrap))
    }

    /**
     * @param logRetentionRetryOptions Retry options for all AWS API calls.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dbe5bb0480327a1e081cf0bcf4f5f580ab8939cdef90debe6c0c5a00b82b40b6")
    override
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit):
        Unit = logRetentionRetryOptions(LogRetentionRetryOptions(logRetentionRetryOptions))

    /**
     * @param removalPolicy The removalPolicy for the log group when the stack is deleted.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param retention The number of days log events are kept in CloudWatch Logs. 
     */
    override fun retention(retention: RetentionDays) {
      cdkBuilder.retention(retention.let(RetentionDays::unwrap))
    }

    /**
     * @param role The IAM role for the Lambda function associated with the custom resource.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogRetentionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.LogRetentionProps,
  ) : CdkObject(cdkObject), LogRetentionProps {
    /**
     * The log group name.
     */
    override fun logGroupName(): String = unwrap(this).getLogGroupName()

    /**
     * The region where the log group should be created.
     *
     * Default: - same region as the stack
     */
    override fun logGroupRegion(): String? = unwrap(this).getLogGroupRegion()

    /**
     * Retry options for all AWS API calls.
     *
     * Default: - AWS SDK default retry options
     */
    override fun logRetentionRetryOptions(): LogRetentionRetryOptions? =
        unwrap(this).getLogRetentionRetryOptions()?.let(LogRetentionRetryOptions::wrap)

    /**
     * The removalPolicy for the log group when the stack is deleted.
     *
     * Default: RemovalPolicy.RETAIN
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * The number of days log events are kept in CloudWatch Logs.
     */
    override fun retention(): RetentionDays = unwrap(this).getRetention().let(RetentionDays::wrap)

    /**
     * The IAM role for the Lambda function associated with the custom resource.
     *
     * Default: - A new role is created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogRetentionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.LogRetentionProps):
        LogRetentionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogRetentionProps):
        software.amazon.awscdk.services.logs.LogRetentionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.LogRetentionProps
  }
}
