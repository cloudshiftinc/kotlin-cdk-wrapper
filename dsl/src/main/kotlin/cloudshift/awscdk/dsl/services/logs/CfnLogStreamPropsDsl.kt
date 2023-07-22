@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnLogStreamProps

/**
 * Properties for defining a `CfnLogStream`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnLogStreamProps cfnLogStreamProps = CfnLogStreamProps.builder()
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .logStreamName("logStreamName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html)
 */
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
