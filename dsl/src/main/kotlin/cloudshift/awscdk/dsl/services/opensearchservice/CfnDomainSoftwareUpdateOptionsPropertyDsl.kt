@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@CdkDslMarker
public class CfnDomainSoftwareUpdateOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.SoftwareUpdateOptionsProperty.Builder =
      CfnDomain.SoftwareUpdateOptionsProperty.builder()

  public fun autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled: Boolean) {
    cdkBuilder.autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled)
  }

  public fun autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled: IResolvable) {
    cdkBuilder.autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled)
  }

  public fun build(): CfnDomain.SoftwareUpdateOptionsProperty = cdkBuilder.build()
}
