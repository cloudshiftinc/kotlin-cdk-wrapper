@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnIdentityPoolRoleAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * Object roles;
 * CfnIdentityPoolRoleAttachmentProps cfnIdentityPoolRoleAttachmentProps =
 * CfnIdentityPoolRoleAttachmentProps.builder()
 * .identityPoolId("identityPoolId")
 * // the properties below are optional
 * .roleMappings(Map.of(
 * "roleMappingsKey", RoleMappingProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .ambiguousRoleResolution("ambiguousRoleResolution")
 * .identityProvider("identityProvider")
 * .rulesConfiguration(RulesConfigurationTypeProperty.builder()
 * .rules(List.of(MappingRuleProperty.builder()
 * .claim("claim")
 * .matchType("matchType")
 * .roleArn("roleArn")
 * .value("value")
 * .build()))
 * .build())
 * .build()))
 * .roles(roles)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html)
 */
public interface CfnIdentityPoolRoleAttachmentProps {
  /**
   * An identity pool ID in the format `REGION:GUID` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-identitypoolid)
   */
  public fun identityPoolId(): String

  /**
   * How users for a specific identity provider are mapped to roles.
   *
   * This is a string to the `RoleMapping` object map. The string identifies the identity provider.
   * For example: `graph.facebook.com` or
   * `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id` .
   *
   * If the `IdentityProvider` field isn't provided in this object, the string is used as the
   * identity provider name.
   *
   * For more information, see the [RoleMapping
   * property](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-rolemappings)
   */
  public fun roleMappings(): Any? = unwrap(this).getRoleMappings()

  /**
   * The map of the roles associated with this pool.
   *
   * For a given role, the key is either "authenticated" or "unauthenticated". The value is the role
   * ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-roles)
   */
  public fun roles(): Any? = unwrap(this).getRoles()

  /**
   * A builder for [CfnIdentityPoolRoleAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identityPoolId An identity pool ID in the format `REGION:GUID` . 
     */
    public fun identityPoolId(identityPoolId: String)

    /**
     * @param roleMappings How users for a specific identity provider are mapped to roles.
     * This is a string to the `RoleMapping` object map. The string identifies the identity
     * provider. For example: `graph.facebook.com` or
     * `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id` .
     *
     * If the `IdentityProvider` field isn't provided in this object, the string is used as the
     * identity provider name.
     *
     * For more information, see the [RoleMapping
     * property](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
     * .
     */
    public fun roleMappings(roleMappings: IResolvable)

    /**
     * @param roleMappings How users for a specific identity provider are mapped to roles.
     * This is a string to the `RoleMapping` object map. The string identifies the identity
     * provider. For example: `graph.facebook.com` or
     * `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id` .
     *
     * If the `IdentityProvider` field isn't provided in this object, the string is used as the
     * identity provider name.
     *
     * For more information, see the [RoleMapping
     * property](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
     * .
     */
    public fun roleMappings(roleMappings: Map<String, Any>)

    /**
     * @param roles The map of the roles associated with this pool.
     * For a given role, the key is either "authenticated" or "unauthenticated". The value is the
     * role ARN.
     */
    public fun roles(roles: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder =
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.builder()

    /**
     * @param identityPoolId An identity pool ID in the format `REGION:GUID` . 
     */
    override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

    /**
     * @param roleMappings How users for a specific identity provider are mapped to roles.
     * This is a string to the `RoleMapping` object map. The string identifies the identity
     * provider. For example: `graph.facebook.com` or
     * `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id` .
     *
     * If the `IdentityProvider` field isn't provided in this object, the string is used as the
     * identity provider name.
     *
     * For more information, see the [RoleMapping
     * property](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
     * .
     */
    override fun roleMappings(roleMappings: IResolvable) {
      cdkBuilder.roleMappings(roleMappings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param roleMappings How users for a specific identity provider are mapped to roles.
     * This is a string to the `RoleMapping` object map. The string identifies the identity
     * provider. For example: `graph.facebook.com` or
     * `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id` .
     *
     * If the `IdentityProvider` field isn't provided in this object, the string is used as the
     * identity provider name.
     *
     * For more information, see the [RoleMapping
     * property](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
     * .
     */
    override fun roleMappings(roleMappings: Map<String, Any>) {
      cdkBuilder.roleMappings(roleMappings.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param roles The map of the roles associated with this pool.
     * For a given role, the key is either "authenticated" or "unauthenticated". The value is the
     * role ARN.
     */
    override fun roles(roles: Any) {
      cdkBuilder.roles(roles)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps,
  ) : CdkObject(cdkObject), CfnIdentityPoolRoleAttachmentProps {
    /**
     * An identity pool ID in the format `REGION:GUID` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-identitypoolid)
     */
    override fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

    /**
     * How users for a specific identity provider are mapped to roles.
     *
     * This is a string to the `RoleMapping` object map. The string identifies the identity
     * provider. For example: `graph.facebook.com` or
     * `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id` .
     *
     * If the `IdentityProvider` field isn't provided in this object, the string is used as the
     * identity provider name.
     *
     * For more information, see the [RoleMapping
     * property](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-rolemappings)
     */
    override fun roleMappings(): Any? = unwrap(this).getRoleMappings()

    /**
     * The map of the roles associated with this pool.
     *
     * For a given role, the key is either "authenticated" or "unauthenticated". The value is the
     * role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-roles)
     */
    override fun roles(): Any? = unwrap(this).getRoles()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentityPoolRoleAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps):
        CfnIdentityPoolRoleAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnIdentityPoolRoleAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityPoolRoleAttachmentProps):
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps
  }
}
