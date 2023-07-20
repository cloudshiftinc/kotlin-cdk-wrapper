@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps

@CdkDslMarker
public class CfnIdentityProviderConfigPropsDsl {
  private val cdkBuilder: CfnIdentityProviderConfigProps.Builder =
      CfnIdentityProviderConfigProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  public fun identityProviderConfigName(identityProviderConfigName: String) {
    cdkBuilder.identityProviderConfigName(identityProviderConfigName)
  }

  public fun oidc(oidc: IResolvable) {
    cdkBuilder.oidc(oidc)
  }

  public fun oidc(oidc: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty) {
    cdkBuilder.oidc(oidc)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnIdentityProviderConfigProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
