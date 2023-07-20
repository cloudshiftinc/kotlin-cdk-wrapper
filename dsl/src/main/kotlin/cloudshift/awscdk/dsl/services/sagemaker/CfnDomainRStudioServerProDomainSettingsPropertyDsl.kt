@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDomain

@CdkDslMarker
public class CfnDomainRStudioServerProDomainSettingsPropertyDsl {
  private val cdkBuilder: CfnDomain.RStudioServerProDomainSettingsProperty.Builder =
      CfnDomain.RStudioServerProDomainSettingsProperty.builder()

  public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
    cdkBuilder.defaultResourceSpec(defaultResourceSpec)
  }

  public fun defaultResourceSpec(defaultResourceSpec: CfnDomain.ResourceSpecProperty) {
    cdkBuilder.defaultResourceSpec(defaultResourceSpec)
  }

  public fun domainExecutionRoleArn(domainExecutionRoleArn: String) {
    cdkBuilder.domainExecutionRoleArn(domainExecutionRoleArn)
  }

  public fun rStudioConnectUrl(rStudioConnectUrl: String) {
    cdkBuilder.rStudioConnectUrl(rStudioConnectUrl)
  }

  public fun rStudioPackageManagerUrl(rStudioPackageManagerUrl: String) {
    cdkBuilder.rStudioPackageManagerUrl(rStudioPackageManagerUrl)
  }

  public fun build(): CfnDomain.RStudioServerProDomainSettingsProperty = cdkBuilder.build()
}
