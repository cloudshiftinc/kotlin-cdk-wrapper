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
 * TableSAMPTProperty tableSAMPTProperty = TableSAMPTProperty.builder()
 * .tableName("tableName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-tablesampt.html)
 */
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
