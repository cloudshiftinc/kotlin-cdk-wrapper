@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnDomain
import software.constructs.Construct

@CdkDslMarker
public class CfnDomainDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

  private val _autoSubDomainCreationPatterns: MutableList<String> = mutableListOf()

  private val _subDomainSettings: MutableList<Any> = mutableListOf()

  public fun appId(appId: String) {
    cdkBuilder.appId(appId)
  }

  public fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String) {
    _autoSubDomainCreationPatterns.addAll(listOf(*autoSubDomainCreationPatterns))
  }

  public fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: Collection<String>) {
    _autoSubDomainCreationPatterns.addAll(autoSubDomainCreationPatterns)
  }

  public fun autoSubDomainIamRole(autoSubDomainIamRole: String) {
    cdkBuilder.autoSubDomainIamRole(autoSubDomainIamRole)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun enableAutoSubDomain(enableAutoSubDomain: Boolean) {
    cdkBuilder.enableAutoSubDomain(enableAutoSubDomain)
  }

  public fun enableAutoSubDomain(enableAutoSubDomain: IResolvable) {
    cdkBuilder.enableAutoSubDomain(enableAutoSubDomain)
  }

  public fun subDomainSettings(vararg subDomainSettings: Any) {
    _subDomainSettings.addAll(listOf(*subDomainSettings))
  }

  public fun subDomainSettings(subDomainSettings: Collection<Any>) {
    _subDomainSettings.addAll(subDomainSettings)
  }

  public fun subDomainSettings(subDomainSettings: IResolvable) {
    cdkBuilder.subDomainSettings(subDomainSettings)
  }

  public fun build(): CfnDomain {
    if(_autoSubDomainCreationPatterns.isNotEmpty())
        cdkBuilder.autoSubDomainCreationPatterns(_autoSubDomainCreationPatterns)
    if(_subDomainSettings.isNotEmpty()) cdkBuilder.subDomainSettings(_subDomainSettings)
    return cdkBuilder.build()
  }
}
