@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnLogStream
import software.constructs.Construct

@CdkDslMarker
public class CfnLogStreamDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLogStream.Builder = CfnLogStream.Builder.create(scope, id)

  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun logStreamName(logStreamName: String) {
    cdkBuilder.logStreamName(logStreamName)
  }

  public fun build(): CfnLogStream = cdkBuilder.build()
}
