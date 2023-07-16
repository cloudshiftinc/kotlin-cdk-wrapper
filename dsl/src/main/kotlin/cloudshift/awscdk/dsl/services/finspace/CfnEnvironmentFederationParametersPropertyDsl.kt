@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.finspace

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.finspace.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentFederationParametersPropertyDsl {
  private val cdkBuilder: CfnEnvironment.FederationParametersProperty.Builder =
      CfnEnvironment.FederationParametersProperty.builder()

  private val _attributeMap: MutableList<Any> = mutableListOf()

  public fun applicationCallBackUrl(applicationCallBackUrl: String) {
    cdkBuilder.applicationCallBackUrl(applicationCallBackUrl)
  }

  public fun attributeMap(vararg attributeMap: Any) {
    _attributeMap.addAll(listOf(*attributeMap))
  }

  public fun attributeMap(attributeMap: Collection<Any>) {
    _attributeMap.addAll(attributeMap)
  }

  public fun attributeMap(attributeMap: IResolvable) {
    cdkBuilder.attributeMap(attributeMap)
  }

  public fun federationProviderName(federationProviderName: String) {
    cdkBuilder.federationProviderName(federationProviderName)
  }

  public fun federationUrn(federationUrn: String) {
    cdkBuilder.federationUrn(federationUrn)
  }

  public fun samlMetadataDocument(samlMetadataDocument: String) {
    cdkBuilder.samlMetadataDocument(samlMetadataDocument)
  }

  public fun samlMetadataUrl(samlMetadataUrl: String) {
    cdkBuilder.samlMetadataUrl(samlMetadataUrl)
  }

  public fun build(): CfnEnvironment.FederationParametersProperty {
    if(_attributeMap.isNotEmpty()) cdkBuilder.attributeMap(_attributeMap)
    return cdkBuilder.build()
  }
}
