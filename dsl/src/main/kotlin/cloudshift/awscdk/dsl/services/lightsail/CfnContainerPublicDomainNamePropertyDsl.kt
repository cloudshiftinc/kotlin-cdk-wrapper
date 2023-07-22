@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lightsail.CfnContainer

@CdkDslMarker
public class CfnContainerPublicDomainNamePropertyDsl {
  private val cdkBuilder: CfnContainer.PublicDomainNameProperty.Builder =
      CfnContainer.PublicDomainNameProperty.builder()

  private val _domainNames: MutableList<String> = mutableListOf()

  /**
   * @param certificateName The name of the certificate for the public domains.
   */
  public fun certificateName(certificateName: String) {
    cdkBuilder.certificateName(certificateName)
  }

  /**
   * @param domainNames The public domain names to use with the container service.
   */
  public fun domainNames(vararg domainNames: String) {
    _domainNames.addAll(listOf(*domainNames))
  }

  /**
   * @param domainNames The public domain names to use with the container service.
   */
  public fun domainNames(domainNames: Collection<String>) {
    _domainNames.addAll(domainNames)
  }

  public fun build(): CfnContainer.PublicDomainNameProperty {
    if(_domainNames.isNotEmpty()) cdkBuilder.domainNames(_domainNames)
    return cdkBuilder.build()
  }
}
