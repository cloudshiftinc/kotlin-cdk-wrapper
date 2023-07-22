@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.LogRetention
import software.amazon.awscdk.services.logs.LogRetentionRetryOptions
import software.amazon.awscdk.services.logs.RetentionDays
import software.constructs.Construct

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
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.logs.*;
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
@CdkDslMarker
public class LogRetentionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: LogRetention.Builder = LogRetention.Builder.create(scope, id)

  /**
   * The log group name.
   *
   * @param logGroupName The log group name. 
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * The region where the log group should be created.
   *
   * Default: - same region as the stack
   *
   * @param logGroupRegion The region where the log group should be created. 
   */
  public fun logGroupRegion(logGroupRegion: String) {
    cdkBuilder.logGroupRegion(logGroupRegion)
  }

  /**
   * Retry options for all AWS API calls.
   *
   * Default: - AWS SDK default retry options
   *
   * @param logRetentionRetryOptions Retry options for all AWS API calls. 
   */
  public
      fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptionsDsl.() -> Unit
      = {}) {
    val builder = LogRetentionRetryOptionsDsl()
    builder.apply(logRetentionRetryOptions)
    cdkBuilder.logRetentionRetryOptions(builder.build())
  }

  /**
   * Retry options for all AWS API calls.
   *
   * Default: - AWS SDK default retry options
   *
   * @param logRetentionRetryOptions Retry options for all AWS API calls. 
   */
  public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
    cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions)
  }

  /**
   * The removalPolicy for the log group when the stack is deleted.
   *
   * Default: RemovalPolicy.RETAIN
   *
   * @param removalPolicy The removalPolicy for the log group when the stack is deleted. 
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * The number of days log events are kept in CloudWatch Logs.
   *
   * @param retention The number of days log events are kept in CloudWatch Logs. 
   */
  public fun retention(retention: RetentionDays) {
    cdkBuilder.retention(retention)
  }

  /**
   * The IAM role for the Lambda function associated with the custom resource.
   *
   * Default: - A new role is created
   *
   * @param role The IAM role for the Lambda function associated with the custom resource. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): LogRetention = cdkBuilder.build()
}
