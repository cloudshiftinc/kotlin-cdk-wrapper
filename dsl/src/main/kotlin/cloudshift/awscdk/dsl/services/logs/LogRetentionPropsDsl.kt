@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.LogRetentionProps
import software.amazon.awscdk.services.logs.LogRetentionRetryOptions
import software.amazon.awscdk.services.logs.RetentionDays

/**
 * Construction properties for a LogRetention.
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
 * LogRetentionProps logRetentionProps = LogRetentionProps.builder()
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
public class LogRetentionPropsDsl {
  private val cdkBuilder: LogRetentionProps.Builder = LogRetentionProps.builder()

  /**
   * @param logGroupName The log group name. 
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * @param logGroupRegion The region where the log group should be created.
   */
  public fun logGroupRegion(logGroupRegion: String) {
    cdkBuilder.logGroupRegion(logGroupRegion)
  }

  /**
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
   * @param logRetentionRetryOptions Retry options for all AWS API calls.
   */
  public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
    cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions)
  }

  /**
   * @param removalPolicy The removalPolicy for the log group when the stack is deleted.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * @param retention The number of days log events are kept in CloudWatch Logs. 
   */
  public fun retention(retention: RetentionDays) {
    cdkBuilder.retention(retention)
  }

  /**
   * @param role The IAM role for the Lambda function associated with the custom resource.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): LogRetentionProps = cdkBuilder.build()
}
