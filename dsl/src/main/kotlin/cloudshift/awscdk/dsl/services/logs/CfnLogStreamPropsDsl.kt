@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnLogStreamProps

@CdkDslMarker
public class CfnLogStreamPropsDsl {
  private val cdkBuilder: CfnLogStreamProps.Builder = CfnLogStreamProps.builder()

  /**
   * @param logGroupName The name of the log group where the log stream is created. 
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * @param logStreamName The name of the log stream.
   * The name must be unique within the log group.
   */
  public fun logStreamName(logStreamName: String) {
    cdkBuilder.logStreamName(logStreamName)
  }

  public fun build(): CfnLogStreamProps = cdkBuilder.build()
}
