@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDomain

@CdkDslMarker
public class CfnDomainDomainSettingsPropertyDsl {
  private val cdkBuilder: CfnDomain.DomainSettingsProperty.Builder =
      CfnDomain.DomainSettingsProperty.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  /**
   * @param rStudioServerProDomainSettings A collection of settings that configure the
   * `RStudioServerPro` Domain-level app.
   */
  public fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: IResolvable) {
    cdkBuilder.rStudioServerProDomainSettings(rStudioServerProDomainSettings)
  }

  /**
   * @param rStudioServerProDomainSettings A collection of settings that configure the
   * `RStudioServerPro` Domain-level app.
   */
  public
      fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: CfnDomain.RStudioServerProDomainSettingsProperty) {
    cdkBuilder.rStudioServerProDomainSettings(rStudioServerProDomainSettings)
  }

  /**
   * @param securityGroupIds The security groups for the Amazon Virtual Private Cloud that the
   * `Domain` uses for communication between Domain-level apps and user apps.
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds The security groups for the Amazon Virtual Private Cloud that the
   * `Domain` uses for communication between Domain-level apps and user apps.
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  public fun build(): CfnDomain.DomainSettingsProperty {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    return cdkBuilder.build()
  }
}
