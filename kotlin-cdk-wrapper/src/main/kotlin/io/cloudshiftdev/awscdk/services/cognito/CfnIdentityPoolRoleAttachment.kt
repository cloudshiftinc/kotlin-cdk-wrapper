@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Cognito::IdentityPoolRoleAttachment` resource manages the role configuration for an
 * Amazon Cognito identity pool.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * Object roles;
 * CfnIdentityPoolRoleAttachment cfnIdentityPoolRoleAttachment =
 * CfnIdentityPoolRoleAttachment.Builder.create(this, "MyCfnIdentityPoolRoleAttachment")
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
public open class CfnIdentityPoolRoleAttachment internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The resource ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * An identity pool ID in the format `REGION:GUID` .
   */
  public open fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

  /**
   * An identity pool ID in the format `REGION:GUID` .
   */
  public open fun identityPoolId(`value`: String) {
    unwrap(this).setIdentityPoolId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * How users for a specific identity provider are mapped to roles.
   */
  public open fun roleMappings(): Any? = unwrap(this).getRoleMappings()

  /**
   * How users for a specific identity provider are mapped to roles.
   */
  public open fun roleMappings(`value`: IResolvable) {
    unwrap(this).setRoleMappings(`value`.let(IResolvable::unwrap))
  }

  /**
   * How users for a specific identity provider are mapped to roles.
   */
  public open fun roleMappings(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setRoleMappings(__item_ac66f0)
  }

  /**
   * The map of the roles associated with this pool.
   */
  public open fun roles(): Any? = unwrap(this).getRoles()

  /**
   * The map of the roles associated with this pool.
   */
  public open fun roles(`value`: Any) {
    unwrap(this).setRoles(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnIdentityPoolRoleAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An identity pool ID in the format `REGION:GUID` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-identitypoolid)
     * @param identityPoolId An identity pool ID in the format `REGION:GUID` . 
     */
    public fun identityPoolId(identityPoolId: String)

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
     * @param roleMappings How users for a specific identity provider are mapped to roles. 
     */
    public fun roleMappings(roleMappings: IResolvable)

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
     * @param roleMappings How users for a specific identity provider are mapped to roles. 
     */
    public fun roleMappings(roleMappings: Map<String, Any>)

    /**
     * The map of the roles associated with this pool.
     *
     * For a given role, the key is either "authenticated" or "unauthenticated". The value is the
     * role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-roles)
     * @param roles The map of the roles associated with this pool. 
     */
    public fun roles(roles: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.Builder =
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.Builder.create(scope,
        id)

    /**
     * An identity pool ID in the format `REGION:GUID` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-identitypoolid)
     * @param identityPoolId An identity pool ID in the format `REGION:GUID` . 
     */
    override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

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
     * @param roleMappings How users for a specific identity provider are mapped to roles. 
     */
    override fun roleMappings(roleMappings: IResolvable) {
      cdkBuilder.roleMappings(roleMappings.let(IResolvable::unwrap))
    }

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
     * @param roleMappings How users for a specific identity provider are mapped to roles. 
     */
    override fun roleMappings(roleMappings: Map<String, Any>) {
      cdkBuilder.roleMappings(roleMappings)
    }

    /**
     * The map of the roles associated with this pool.
     *
     * For a given role, the key is either "authenticated" or "unauthenticated". The value is the
     * role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-roles)
     * @param roles The map of the roles associated with this pool. 
     */
    override fun roles(roles: Any) {
      cdkBuilder.roles(roles)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentityPoolRoleAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentityPoolRoleAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment):
        CfnIdentityPoolRoleAttachment = CfnIdentityPoolRoleAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityPoolRoleAttachment):
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment = wrapped.cdkObject
  }

  /**
   * `RulesConfigurationType` is a subproperty of the
   * [RoleMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
   * property that defines the rules to be used for mapping users to roles.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * RulesConfigurationTypeProperty rulesConfigurationTypeProperty =
   * RulesConfigurationTypeProperty.builder()
   * .rules(List.of(MappingRuleProperty.builder()
   * .claim("claim")
   * .matchType("matchType")
   * .roleArn("roleArn")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html)
   */
  public interface RulesConfigurationTypeProperty {
    /**
     * The rules.
     *
     * You can specify up to 25 rules per identity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html#cfn-cognito-identitypoolroleattachment-rulesconfigurationtype-rules)
     */
    public fun rules(): Any

    /**
     * A builder for [RulesConfigurationTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rules The rules. 
       * You can specify up to 25 rules per identity provider.
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules The rules. 
       * You can specify up to 25 rules per identity provider.
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules The rules. 
       * You can specify up to 25 rules per identity provider.
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.builder()

      /**
       * @param rules The rules. 
       * You can specify up to 25 rules per identity provider.
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      /**
       * @param rules The rules. 
       * You can specify up to 25 rules per identity provider.
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      /**
       * @param rules The rules. 
       * You can specify up to 25 rules per identity provider.
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty,
    ) : CdkObject(cdkObject), RulesConfigurationTypeProperty {
      /**
       * The rules.
       *
       * You can specify up to 25 rules per identity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html#cfn-cognito-identitypoolroleattachment-rulesconfigurationtype-rules)
       */
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RulesConfigurationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty):
          RulesConfigurationTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RulesConfigurationTypeProperty):
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty
    }
  }

  /**
   * Defines how to map a claim to a role ARN.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * MappingRuleProperty mappingRuleProperty = MappingRuleProperty.builder()
   * .claim("claim")
   * .matchType("matchType")
   * .roleArn("roleArn")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html)
   */
  public interface MappingRuleProperty {
    /**
     * The claim name that must be present in the token.
     *
     * For example: "isAdmin" or "paid".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-claim)
     */
    public fun claim(): String

    /**
     * The match condition that specifies how closely the claim value in the IdP token must match
     * `Value` .
     *
     * Valid values are: `Equals` , `Contains` , `StartsWith` , and `NotEqual` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-matchtype)
     */
    public fun matchType(): String

    /**
     * The Amazon Resource Name (ARN) of the role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-rolearn)
     */
    public fun roleArn(): String

    /**
     * A brief string that the claim must match.
     *
     * For example, "paid" or "yes".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-value)
     */
    public fun `value`(): String

    /**
     * A builder for [MappingRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param claim The claim name that must be present in the token. 
       * For example: "isAdmin" or "paid".
       */
      public fun claim(claim: String)

      /**
       * @param matchType The match condition that specifies how closely the claim value in the IdP
       * token must match `Value` . 
       * Valid values are: `Equals` , `Contains` , `StartsWith` , and `NotEqual` .
       */
      public fun matchType(matchType: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param value A brief string that the claim must match. 
       * For example, "paid" or "yes".
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.builder()

      /**
       * @param claim The claim name that must be present in the token. 
       * For example: "isAdmin" or "paid".
       */
      override fun claim(claim: String) {
        cdkBuilder.claim(claim)
      }

      /**
       * @param matchType The match condition that specifies how closely the claim value in the IdP
       * token must match `Value` . 
       * Valid values are: `Equals` , `Contains` , `StartsWith` , and `NotEqual` .
       */
      override fun matchType(matchType: String) {
        cdkBuilder.matchType(matchType)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param value A brief string that the claim must match. 
       * For example, "paid" or "yes".
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty,
    ) : CdkObject(cdkObject), MappingRuleProperty {
      /**
       * The claim name that must be present in the token.
       *
       * For example: "isAdmin" or "paid".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-claim)
       */
      override fun claim(): String = unwrap(this).getClaim()

      /**
       * The match condition that specifies how closely the claim value in the IdP token must match
       * `Value` .
       *
       * Valid values are: `Equals` , `Contains` , `StartsWith` , and `NotEqual` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-matchtype)
       */
      override fun matchType(): String = unwrap(this).getMatchType()

      /**
       * The Amazon Resource Name (ARN) of the role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * A brief string that the claim must match.
       *
       * For example, "paid" or "yes".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MappingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty):
          MappingRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingRuleProperty):
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty
    }
  }

  /**
   * One of a set of `RoleMappings` , a property of the
   * [AWS::Cognito::IdentityPoolRoleAttachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html)
   * resource that defines the role-mapping attributes of an Amazon Cognito identity pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * RoleMappingProperty roleMappingProperty = RoleMappingProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
   */
  public interface RoleMappingProperty {
    /**
     * If you specify Token or Rules as the `Type` , `AmbiguousRoleResolution` is required.
     *
     * Specifies the action to be taken if either no rules match the claim value for the `Rules`
     * type, or there is no `cognito:preferred_role` claim and there are multiple `cognito:roles`
     * matches for the `Token` type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-ambiguousroleresolution)
     */
    public fun ambiguousRoleResolution(): String? = unwrap(this).getAmbiguousRoleResolution()

    /**
     * Identifier for the identity provider for which the role is mapped.
     *
     * For example: `graph.facebook.com` or
     * `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id
     * (http://cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id)` . This is the
     * identity provider that is used by the user for authentication.
     *
     * If the identity provider property isn't provided, the key of the entry in the `RoleMappings`
     * map is used as the identity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-identityprovider)
     */
    public fun identityProvider(): String? = unwrap(this).getIdentityProvider()

    /**
     * The rules to be used for mapping users to roles.
     *
     * If you specify "Rules" as the role-mapping type, RulesConfiguration is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-rulesconfiguration)
     */
    public fun rulesConfiguration(): Any? = unwrap(this).getRulesConfiguration()

    /**
     * The role mapping type.
     *
     * Token will use `cognito:roles` and `cognito:preferred_role` claims from the Cognito identity
     * provider token to map groups to roles. Rules will attempt to match claims from the token to map
     * to a role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-type)
     */
    public fun type(): String

    /**
     * A builder for [RoleMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ambiguousRoleResolution If you specify Token or Rules as the `Type` ,
       * `AmbiguousRoleResolution` is required.
       * Specifies the action to be taken if either no rules match the claim value for the `Rules`
       * type, or there is no `cognito:preferred_role` claim and there are multiple `cognito:roles`
       * matches for the `Token` type.
       */
      public fun ambiguousRoleResolution(ambiguousRoleResolution: String)

      /**
       * @param identityProvider Identifier for the identity provider for which the role is mapped.
       * For example: `graph.facebook.com` or
       * `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id
       * (http://cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id)` . This is the
       * identity provider that is used by the user for authentication.
       *
       * If the identity provider property isn't provided, the key of the entry in the
       * `RoleMappings` map is used as the identity provider.
       */
      public fun identityProvider(identityProvider: String)

      /**
       * @param rulesConfiguration The rules to be used for mapping users to roles.
       * If you specify "Rules" as the role-mapping type, RulesConfiguration is required.
       */
      public fun rulesConfiguration(rulesConfiguration: IResolvable)

      /**
       * @param rulesConfiguration The rules to be used for mapping users to roles.
       * If you specify "Rules" as the role-mapping type, RulesConfiguration is required.
       */
      public fun rulesConfiguration(rulesConfiguration: RulesConfigurationTypeProperty)

      /**
       * @param rulesConfiguration The rules to be used for mapping users to roles.
       * If you specify "Rules" as the role-mapping type, RulesConfiguration is required.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("34b2423d58ded2152c85df2c07e9e7361b18364114635054c986d2e0974afe0a")
      public
          fun rulesConfiguration(rulesConfiguration: RulesConfigurationTypeProperty.Builder.() -> Unit)

      /**
       * @param type The role mapping type. 
       * Token will use `cognito:roles` and `cognito:preferred_role` claims from the Cognito
       * identity provider token to map groups to roles. Rules will attempt to match claims from the
       * token to map to a role.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.builder()

      /**
       * @param ambiguousRoleResolution If you specify Token or Rules as the `Type` ,
       * `AmbiguousRoleResolution` is required.
       * Specifies the action to be taken if either no rules match the claim value for the `Rules`
       * type, or there is no `cognito:preferred_role` claim and there are multiple `cognito:roles`
       * matches for the `Token` type.
       */
      override fun ambiguousRoleResolution(ambiguousRoleResolution: String) {
        cdkBuilder.ambiguousRoleResolution(ambiguousRoleResolution)
      }

      /**
       * @param identityProvider Identifier for the identity provider for which the role is mapped.
       * For example: `graph.facebook.com` or
       * `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id
       * (http://cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id)` . This is the
       * identity provider that is used by the user for authentication.
       *
       * If the identity provider property isn't provided, the key of the entry in the
       * `RoleMappings` map is used as the identity provider.
       */
      override fun identityProvider(identityProvider: String) {
        cdkBuilder.identityProvider(identityProvider)
      }

      /**
       * @param rulesConfiguration The rules to be used for mapping users to roles.
       * If you specify "Rules" as the role-mapping type, RulesConfiguration is required.
       */
      override fun rulesConfiguration(rulesConfiguration: IResolvable) {
        cdkBuilder.rulesConfiguration(rulesConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param rulesConfiguration The rules to be used for mapping users to roles.
       * If you specify "Rules" as the role-mapping type, RulesConfiguration is required.
       */
      override fun rulesConfiguration(rulesConfiguration: RulesConfigurationTypeProperty) {
        cdkBuilder.rulesConfiguration(rulesConfiguration.let(RulesConfigurationTypeProperty::unwrap))
      }

      /**
       * @param rulesConfiguration The rules to be used for mapping users to roles.
       * If you specify "Rules" as the role-mapping type, RulesConfiguration is required.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("34b2423d58ded2152c85df2c07e9e7361b18364114635054c986d2e0974afe0a")
      override
          fun rulesConfiguration(rulesConfiguration: RulesConfigurationTypeProperty.Builder.() -> Unit):
          Unit = rulesConfiguration(RulesConfigurationTypeProperty(rulesConfiguration))

      /**
       * @param type The role mapping type. 
       * Token will use `cognito:roles` and `cognito:preferred_role` claims from the Cognito
       * identity provider token to map groups to roles. Rules will attempt to match claims from the
       * token to map to a role.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty,
    ) : CdkObject(cdkObject), RoleMappingProperty {
      /**
       * If you specify Token or Rules as the `Type` , `AmbiguousRoleResolution` is required.
       *
       * Specifies the action to be taken if either no rules match the claim value for the `Rules`
       * type, or there is no `cognito:preferred_role` claim and there are multiple `cognito:roles`
       * matches for the `Token` type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-ambiguousroleresolution)
       */
      override fun ambiguousRoleResolution(): String? = unwrap(this).getAmbiguousRoleResolution()

      /**
       * Identifier for the identity provider for which the role is mapped.
       *
       * For example: `graph.facebook.com` or
       * `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id
       * (http://cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id)` . This is the
       * identity provider that is used by the user for authentication.
       *
       * If the identity provider property isn't provided, the key of the entry in the
       * `RoleMappings` map is used as the identity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-identityprovider)
       */
      override fun identityProvider(): String? = unwrap(this).getIdentityProvider()

      /**
       * The rules to be used for mapping users to roles.
       *
       * If you specify "Rules" as the role-mapping type, RulesConfiguration is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-rulesconfiguration)
       */
      override fun rulesConfiguration(): Any? = unwrap(this).getRulesConfiguration()

      /**
       * The role mapping type.
       *
       * Token will use `cognito:roles` and `cognito:preferred_role` claims from the Cognito
       * identity provider token to map groups to roles. Rules will attempt to match claims from the
       * token to map to a role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RoleMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty):
          RoleMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoleMappingProperty):
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty
    }
  }
}
