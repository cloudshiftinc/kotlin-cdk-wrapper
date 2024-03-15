@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a custom resource to control the retention policy of a CloudWatch Logs log group.
 *
 * The log group is created if it doesn't already exist. The policy
 * is removed when `retentionDays` is `undefined` or equal to `Infinity`.
 * Log group can be created in the region that is different from stack region by
 * specifying `logGroupRegion`
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * Role role;
 * LogRetention logRetention = LogRetention.Builder.create(this, "MyLogRetention")
 * .logGroupName("logGroupName")
 * .retention(RetentionDays.ONE_DAY)
 * // the properties below are optional
 * .logGroupRegion("logGroupRegion")
 * .logRetentionRetryOptions(LogRetentionRetryOptions.builder()
 * .base(Duration.minutes(30))
 * .maxRetries(123)
 * .build())
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .role(role)
 * .build();
 * ```
 */
public open class LogRetention internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.LogRetention,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  /**
   * The ARN of the LogGroup.
   */
  public open fun logGroupArn(): String = unwrap(this).getLogGroupArn()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.LogRetention].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The log group name.
     *
     * @param logGroupName The log group name. 
     */
    public fun logGroupName(logGroupName: String)

    /**
     * The region where the log group should be created.
     *
     * Default: - same region as the stack
     *
     * @param logGroupRegion The region where the log group should be created. 
     */
    public fun logGroupRegion(logGroupRegion: String)

    /**
     * Retry options for all AWS API calls.
     *
     * Default: - AWS SDK default retry options
     *
     * @param logRetentionRetryOptions Retry options for all AWS API calls. 
     */
    public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions)

    /**
     * Retry options for all AWS API calls.
     *
     * Default: - AWS SDK default retry options
     *
     * @param logRetentionRetryOptions Retry options for all AWS API calls. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efcdd4942bd022962255054dc2ff87e9319e87002c3990d10f0cac097f804d6b")
    public
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit)

    /**
     * The removalPolicy for the log group when the stack is deleted.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removalPolicy for the log group when the stack is deleted. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * The number of days log events are kept in CloudWatch Logs.
     *
     * @param retention The number of days log events are kept in CloudWatch Logs. 
     */
    public fun retention(retention: RetentionDays)

    /**
     * The IAM role for the Lambda function associated with the custom resource.
     *
     * Default: - A new role is created
     *
     * @param role The IAM role for the Lambda function associated with the custom resource. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.LogRetention.Builder =
        software.amazon.awscdk.services.logs.LogRetention.Builder.create(scope, id)

    /**
     * The log group name.
     *
     * @param logGroupName The log group name. 
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * The region where the log group should be created.
     *
     * Default: - same region as the stack
     *
     * @param logGroupRegion The region where the log group should be created. 
     */
    override fun logGroupRegion(logGroupRegion: String) {
      cdkBuilder.logGroupRegion(logGroupRegion)
    }

    /**
     * Retry options for all AWS API calls.
     *
     * Default: - AWS SDK default retry options
     *
     * @param logRetentionRetryOptions Retry options for all AWS API calls. 
     */
    override fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
      cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions.let(LogRetentionRetryOptions::unwrap))
    }

    /**
     * Retry options for all AWS API calls.
     *
     * Default: - AWS SDK default retry options
     *
     * @param logRetentionRetryOptions Retry options for all AWS API calls. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efcdd4942bd022962255054dc2ff87e9319e87002c3990d10f0cac097f804d6b")
    override
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit):
        Unit = logRetentionRetryOptions(LogRetentionRetryOptions(logRetentionRetryOptions))

    /**
     * The removalPolicy for the log group when the stack is deleted.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removalPolicy for the log group when the stack is deleted. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * The number of days log events are kept in CloudWatch Logs.
     *
     * @param retention The number of days log events are kept in CloudWatch Logs. 
     */
    override fun retention(retention: RetentionDays) {
      cdkBuilder.retention(retention.let(RetentionDays::unwrap))
    }

    /**
     * The IAM role for the Lambda function associated with the custom resource.
     *
     * Default: - A new role is created
     *
     * @param role The IAM role for the Lambda function associated with the custom resource. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogRetention = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LogRetention {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LogRetention(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.LogRetention): LogRetention =
        LogRetention(cdkObject)

    internal fun unwrap(wrapped: LogRetention): software.amazon.awscdk.services.logs.LogRetention =
        wrapped.cdkObject
  }
}
