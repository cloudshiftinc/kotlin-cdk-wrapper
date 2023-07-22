@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.LogStreamProps

/**
 * Properties for a LogStream.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.logs.*;
 * LogGroup logGroup;
 * LogStreamProps logStreamProps = LogStreamProps.builder()
 * .logGroup(logGroup)
 * // the properties below are optional
 * .logStreamName("logStreamName")
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .build();
 * ```
 */
@CdkDslMarker
public class LogStreamPropsDsl {
  private val cdkBuilder: LogStreamProps.Builder = LogStreamProps.builder()

  /**
   * @param logGroup The log group to create a log stream for. 
   */
  public fun logGroup(logGroup: ILogGroup) {
    cdkBuilder.logGroup(logGroup)
  }

  /**
   * @param logStreamName The name of the log stream to create.
   * The name must be unique within the log group.
   */
  public fun logStreamName(logStreamName: String) {
    cdkBuilder.logStreamName(logStreamName)
  }

  /**
   * @param removalPolicy Determine what happens when the log stream resource is removed from the
   * app.
   * Normally you want to retain the log stream so you can diagnose issues from
   * logs even after a deployment that no longer includes the log stream.
   *
   * The date-based retention policy of your log group will age out the logs
   * after a certain time.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun build(): LogStreamProps = cdkBuilder.build()
}
