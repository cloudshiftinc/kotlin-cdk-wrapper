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

@CdkDslMarker
public class LogRetentionPropsDsl {
  private val cdkBuilder: LogRetentionProps.Builder = LogRetentionProps.builder()

  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun logGroupRegion(logGroupRegion: String) {
    cdkBuilder.logGroupRegion(logGroupRegion)
  }

  public fun logRetentionRetryOptions(block: LogRetentionRetryOptionsDsl.() -> Unit = {}) {
    val builder = LogRetentionRetryOptionsDsl()
    builder.apply(block)
    cdkBuilder.logRetentionRetryOptions(builder.build())
  }

  public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
    cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun retention(retention: RetentionDays) {
    cdkBuilder.retention(retention)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): LogRetentionProps = cdkBuilder.build()
}
