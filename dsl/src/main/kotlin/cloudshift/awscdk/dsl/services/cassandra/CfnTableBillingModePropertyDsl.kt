@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnTable

@CdkDslMarker
public class CfnTableBillingModePropertyDsl {
  private val cdkBuilder: CfnTable.BillingModeProperty.Builder =
      CfnTable.BillingModeProperty.builder()

  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun provisionedThroughput(provisionedThroughput: IResolvable) {
    cdkBuilder.provisionedThroughput(provisionedThroughput)
  }

  public fun provisionedThroughput(provisionedThroughput: CfnTable.ProvisionedThroughputProperty) {
    cdkBuilder.provisionedThroughput(provisionedThroughput)
  }

  public fun build(): CfnTable.BillingModeProperty = cdkBuilder.build()
}
