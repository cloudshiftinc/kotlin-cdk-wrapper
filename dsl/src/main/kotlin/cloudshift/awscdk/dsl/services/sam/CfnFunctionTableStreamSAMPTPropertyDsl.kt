@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * TableStreamSAMPTProperty tableStreamSAMPTProperty = TableStreamSAMPTProperty.builder()
 * .streamName("streamName")
 * .tableName("tableName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-tablestreamsampt.html)
 */
@CdkDslMarker
public class CfnFunctionTableStreamSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.TableStreamSAMPTProperty.Builder =
      CfnFunction.TableStreamSAMPTProperty.builder()

  /**
   * @param streamName the value to be set. 
   */
  public fun streamName(streamName: String) {
    cdkBuilder.streamName(streamName)
  }

  /**
   * @param tableName the value to be set. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnFunction.TableStreamSAMPTProperty = cdkBuilder.build()
}
