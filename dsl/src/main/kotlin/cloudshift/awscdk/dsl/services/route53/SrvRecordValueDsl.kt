@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.route53.SrvRecordValue

@CdkDslMarker
public class SrvRecordValueDsl {
  private val cdkBuilder: SrvRecordValue.Builder = SrvRecordValue.builder()

  /**
   * @param hostName The server host name. 
   */
  public fun hostName(hostName: String) {
    cdkBuilder.hostName(hostName)
  }

  /**
   * @param port The port. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param priority The priority. 
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param weight The weight. 
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): SrvRecordValue = cdkBuilder.build()
}
