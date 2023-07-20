@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.route53.MxRecordValue

@CdkDslMarker
public class MxRecordValueDsl {
  private val cdkBuilder: MxRecordValue.Builder = MxRecordValue.builder()

  public fun hostName(hostName: String) {
    cdkBuilder.hostName(hostName)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): MxRecordValue = cdkBuilder.build()
}
