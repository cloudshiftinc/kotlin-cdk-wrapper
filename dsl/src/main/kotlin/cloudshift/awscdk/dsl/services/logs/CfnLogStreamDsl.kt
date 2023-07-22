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

  /**
   * The name of the log group where the log stream is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname)
   * @param logGroupName The name of the log group where the log stream is created. 
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * The name of the log stream.
   *
   * The name must be unique within the log group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname)
   * @param logStreamName The name of the log stream. 
   */
  public fun logStreamName(logStreamName: String) {
    cdkBuilder.logStreamName(logStreamName)
  }

  public fun build(): CfnLogStream = cdkBuilder.build()
}
