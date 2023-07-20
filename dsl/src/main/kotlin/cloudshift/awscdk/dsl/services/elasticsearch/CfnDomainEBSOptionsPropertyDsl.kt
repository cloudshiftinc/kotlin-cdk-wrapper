@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@CdkDslMarker
public class CfnDomainEBSOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.EBSOptionsProperty.Builder =
      CfnDomain.EBSOptionsProperty.builder()

  public fun ebsEnabled(ebsEnabled: Boolean) {
    cdkBuilder.ebsEnabled(ebsEnabled)
  }

  public fun ebsEnabled(ebsEnabled: IResolvable) {
    cdkBuilder.ebsEnabled(ebsEnabled)
  }

  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  public fun volumeSize(volumeSize: Number) {
    cdkBuilder.volumeSize(volumeSize)
  }

  public fun volumeType(volumeType: String) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): CfnDomain.EBSOptionsProperty = cdkBuilder.build()
}
