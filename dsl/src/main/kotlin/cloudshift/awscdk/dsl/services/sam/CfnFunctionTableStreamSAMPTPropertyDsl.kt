@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

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
