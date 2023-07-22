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
import software.constructs.Construct

@CdkDslMarker
public class CfnIdentityProviderConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnIdentityProviderConfig.Builder =
      CfnIdentityProviderConfig.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The cluster that the configuration is associated to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-clustername)
   * @param clusterName The cluster that the configuration is associated to. 
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  /**
   * The name of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-identityproviderconfigname)
   * @param identityProviderConfigName The name of the configuration. 
   */
  public fun identityProviderConfigName(identityProviderConfigName: String) {
    cdkBuilder.identityProviderConfigName(identityProviderConfigName)
  }

  /**
   * An object representing an OpenID Connect (OIDC) identity provider configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-oidc)
   * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration. 
   */
  public fun oidc(oidc: IResolvable) {
    cdkBuilder.oidc(oidc)
  }

  /**
   * An object representing an OpenID Connect (OIDC) identity provider configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-oidc)
   * @param oidc An object representing an OpenID Connect (OIDC) identity provider configuration. 
   */
  public fun oidc(oidc: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty) {
    cdkBuilder.oidc(oidc)
  }

  /**
   * The metadata to apply to the provider configuration to assist with categorization and
   * organization.
   *
   * Each tag consists of a key and an optional value. You define both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-tags)
   * @param tags The metadata to apply to the provider configuration to assist with categorization
   * and organization. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The metadata to apply to the provider configuration to assist with categorization and
   * organization.
   *
   * Each tag consists of a key and an optional value. You define both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-tags)
   * @param tags The metadata to apply to the provider configuration to assist with categorization
   * and organization. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The type of the identity provider configuration.
   *
   * The only type available is `oidc` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html#cfn-eks-identityproviderconfig-type)
   * @param type The type of the identity provider configuration. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnIdentityProviderConfig {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
