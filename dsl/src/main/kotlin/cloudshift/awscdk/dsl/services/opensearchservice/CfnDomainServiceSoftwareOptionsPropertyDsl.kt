@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@CdkDslMarker
public class CfnDomainServiceSoftwareOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.ServiceSoftwareOptionsProperty.Builder =
      CfnDomain.ServiceSoftwareOptionsProperty.builder()

  public fun automatedUpdateDate(automatedUpdateDate: String) {
    cdkBuilder.automatedUpdateDate(automatedUpdateDate)
  }

  public fun cancellable(cancellable: Boolean) {
    cdkBuilder.cancellable(cancellable)
  }

  public fun cancellable(cancellable: IResolvable) {
    cdkBuilder.cancellable(cancellable)
  }

  public fun currentVersion(currentVersion: String) {
    cdkBuilder.currentVersion(currentVersion)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun newVersion(newVersion: String) {
    cdkBuilder.newVersion(newVersion)
  }

  public fun optionalDeployment(optionalDeployment: Boolean) {
    cdkBuilder.optionalDeployment(optionalDeployment)
  }

  public fun optionalDeployment(optionalDeployment: IResolvable) {
    cdkBuilder.optionalDeployment(optionalDeployment)
  }

  public fun updateAvailable(updateAvailable: Boolean) {
    cdkBuilder.updateAvailable(updateAvailable)
  }

  public fun updateAvailable(updateAvailable: IResolvable) {
    cdkBuilder.updateAvailable(updateAvailable)
  }

  public fun updateStatus(updateStatus: String) {
    cdkBuilder.updateStatus(updateStatus)
  }

  public fun build(): CfnDomain.ServiceSoftwareOptionsProperty = cdkBuilder.build()
}
