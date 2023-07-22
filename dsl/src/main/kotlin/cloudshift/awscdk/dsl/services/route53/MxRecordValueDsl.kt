@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.route53.MxRecordValue

@CdkDslMarker
public class MxRecordValueDsl {
  private val cdkBuilder: MxRecordValue.Builder = MxRecordValue.builder()

  /**
   * @param hostName The mail server host name. 
   */
  public fun hostName(hostName: String) {
    cdkBuilder.hostName(hostName)
  }

  /**
   * @param priority The priority. 
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): MxRecordValue = cdkBuilder.build()
}
