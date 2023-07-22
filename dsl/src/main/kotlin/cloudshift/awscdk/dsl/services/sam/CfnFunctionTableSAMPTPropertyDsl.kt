@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionTableSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.TableSAMPTProperty.Builder =
      CfnFunction.TableSAMPTProperty.builder()

  /**
   * @param tableName the value to be set. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnFunction.TableSAMPTProperty = cdkBuilder.build()
}
