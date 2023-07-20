@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps

@CdkDslMarker
public class UserPoolIdentityProviderSamlPropsDsl {
  private val cdkBuilder: UserPoolIdentityProviderSamlProps.Builder =
      UserPoolIdentityProviderSamlProps.builder()

  private val _identifiers: MutableList<String> = mutableListOf()

  public fun attributeMapping(block: AttributeMappingDsl.() -> Unit = {}) {
    val builder = AttributeMappingDsl()
    builder.apply(block)
    cdkBuilder.attributeMapping(builder.build())
  }

  public fun attributeMapping(attributeMapping: AttributeMapping) {
    cdkBuilder.attributeMapping(attributeMapping)
  }

  public fun identifiers(vararg identifiers: String) {
    _identifiers.addAll(listOf(*identifiers))
  }

  public fun identifiers(identifiers: Collection<String>) {
    _identifiers.addAll(identifiers)
  }

  public fun idpSignout(idpSignout: Boolean) {
    cdkBuilder.idpSignout(idpSignout)
  }

  public fun metadata(metadata: UserPoolIdentityProviderSamlMetadata) {
    cdkBuilder.metadata(metadata)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  public fun build(): UserPoolIdentityProviderSamlProps {
    if(_identifiers.isNotEmpty()) cdkBuilder.identifiers(_identifiers)
    return cdkBuilder.build()
  }
}
