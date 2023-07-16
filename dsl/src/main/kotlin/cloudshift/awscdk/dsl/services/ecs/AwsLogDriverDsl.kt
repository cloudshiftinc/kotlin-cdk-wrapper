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

  public fun datetimeFormat(datetimeFormat: String) {
    cdkBuilder.datetimeFormat(datetimeFormat)
  }

  public fun logGroup(logGroup: ILogGroup) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun logRetention(logRetention: RetentionDays) {
    cdkBuilder.logRetention(logRetention)
  }

  public fun mode(mode: AwsLogDriverMode) {
    cdkBuilder.mode(mode)
  }

  public fun multilinePattern(multilinePattern: String) {
    cdkBuilder.multilinePattern(multilinePattern)
  }

  public fun streamPrefix(streamPrefix: String) {
    cdkBuilder.streamPrefix(streamPrefix)
  }

  public fun build(): AwsLogDriver = cdkBuilder.build()
}
