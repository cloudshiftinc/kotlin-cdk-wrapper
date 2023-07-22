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

  /**
   * @param defaultResourceSpec A collection that defines the default `InstanceType` ,
   * `SageMakerImageArn` , and `SageMakerImageVersionArn` for the Domain.
   */
  public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
    cdkBuilder.defaultResourceSpec(defaultResourceSpec)
  }

  /**
   * @param defaultResourceSpec A collection that defines the default `InstanceType` ,
   * `SageMakerImageArn` , and `SageMakerImageVersionArn` for the Domain.
   */
  public fun defaultResourceSpec(defaultResourceSpec: CfnDomain.ResourceSpecProperty) {
    cdkBuilder.defaultResourceSpec(defaultResourceSpec)
  }

  /**
   * @param domainExecutionRoleArn The ARN of the execution role for the `RStudioServerPro`
   * Domain-level app. 
   */
  public fun domainExecutionRoleArn(domainExecutionRoleArn: String) {
    cdkBuilder.domainExecutionRoleArn(domainExecutionRoleArn)
  }

  /**
   * @param rStudioConnectUrl A URL pointing to an RStudio Connect server.
   */
  public fun rStudioConnectUrl(rStudioConnectUrl: String) {
    cdkBuilder.rStudioConnectUrl(rStudioConnectUrl)
  }

  /**
   * @param rStudioPackageManagerUrl A URL pointing to an RStudio Package Manager server.
   */
  public fun rStudioPackageManagerUrl(rStudioPackageManagerUrl: String) {
    cdkBuilder.rStudioPackageManagerUrl(rStudioPackageManagerUrl)
  }

  public fun build(): CfnDomain.RStudioServerProDomainSettingsProperty = cdkBuilder.build()
}
