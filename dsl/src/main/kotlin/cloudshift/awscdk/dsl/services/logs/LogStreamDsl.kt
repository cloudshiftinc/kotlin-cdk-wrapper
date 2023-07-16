@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.LogStream
import software.constructs.Construct

@CdkDslMarker
public class LogStreamDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: LogStream.Builder = LogStream.Builder.create(scope, id)

  public fun logGroup(logGroup: ILogGroup) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun logStreamName(logStreamName: String) {
    cdkBuilder.logStreamName(logStreamName)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun build(): LogStream = cdkBuilder.build()
}
