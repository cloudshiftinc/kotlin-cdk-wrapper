@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates or updates a reference to Amazon Cognito as an external identity provider.
 *
 * If you are creating a new identity source, then you must specify a `Configuration` . If you are
 * updating an existing identity source, then you must specify an `UpdateConfiguration` .
 *
 * After you create an identity source, you can use the identities provided by the IdP as proxies
 * for the principal in authorization queries that use the
 * [IsAuthorizedWithToken](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html)
 * operation. These identities take the form of tokens that contain claims about the user, such as IDs,
 * attributes and group memberships. Amazon Cognito provides both identity tokens and access tokens,
 * and Verified Permissions can use either or both. Any combination of identity and access tokens
 * results in the same Cedar principal. Verified Permissions automatically translates the information
 * about the identities into the standard Cedar attributes that can be evaluated by your policies.
 * Because the Amazon Cognito identity and access tokens can contain different information, the tokens
 * you choose to use determine the attributes that are available to access in the Cedar principal from
 * your policies.
 *
 * Amazon Cognito Identity is not available in all of the same AWS Regions as Amazon Verified
 * Permissions . Because of this, the `AWS::VerifiedPermissions::IdentitySource` type is not available
 * to create from AWS CloudFormation in Regions where Amazon Cognito Identity is not currently
 * available. Users can still create `AWS::VerifiedPermissions::IdentitySource` in those Regions, but
 * only from the AWS CLI , Amazon Verified Permissions SDK, or from the AWS console.
 *
 *
 * To reference a user from this identity source in your Cedar policies, use the following syntax.
 *
 * *IdentityType::"<CognitoUserPoolIdentifier>|<CognitoClientId>*
 *
 * Where `IdentityType` is the string that you provide to the `PrincipalEntityType` parameter for
 * this operation. The `CognitoUserPoolId` and `CognitoClientId` are defined by the Amazon Cognito user
 * pool.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
 * CfnIdentitySource cfnIdentitySource = CfnIdentitySource.Builder.create(this,
 * "MyCfnIdentitySource")
 * .configuration(IdentitySourceConfigurationProperty.builder()
 * .cognitoUserPoolConfiguration(CognitoUserPoolConfigurationProperty.builder()
 * .userPoolArn("userPoolArn")
 * // the properties below are optional
 * .clientIds(List.of("clientIds"))
 * .groupConfiguration(CognitoGroupConfigurationProperty.builder()
 * .groupEntityType("groupEntityType")
 * .build())
 * .build())
 * .openIdConnectConfiguration(OpenIdConnectConfigurationProperty.builder()
 * .issuer("issuer")
 * .tokenSelection(OpenIdConnectTokenSelectionProperty.builder()
 * .accessTokenOnly(OpenIdConnectAccessTokenConfigurationProperty.builder()
 * .audiences(List.of("audiences"))
 * .principalIdClaim("principalIdClaim")
 * .build())
 * .identityTokenOnly(OpenIdConnectIdentityTokenConfigurationProperty.builder()
 * .clientIds(List.of("clientIds"))
 * .principalIdClaim("principalIdClaim")
 * .build())
 * .build())
 * // the properties below are optional
 * .entityIdPrefix("entityIdPrefix")
 * .groupConfiguration(OpenIdConnectGroupConfigurationProperty.builder()
 * .groupClaim("groupClaim")
 * .groupEntityType("groupEntityType")
 * .build())
 * .build())
 * .build())
 * .policyStoreId("policyStoreId")
 * // the properties below are optional
 * .principalEntityType("principalEntityType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html)
 */
public open class CfnIdentitySource(
  cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdentitySourceProps,
  ) :
      this(software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIdentitySourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdentitySourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIdentitySourceProps(props)
  )

  /**
   *
   */
  public open fun attrDetails(): IResolvable = unwrap(this).getAttrDetails().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrDetailsClientIds(): List<String> = unwrap(this).getAttrDetailsClientIds()

  /**
   *
   */
  public open fun attrDetailsDiscoveryUrl(): String = unwrap(this).getAttrDetailsDiscoveryUrl()

  /**
   *
   */
  public open fun attrDetailsOpenIdIssuer(): String = unwrap(this).getAttrDetailsOpenIdIssuer()

  /**
   *
   */
  public open fun attrDetailsUserPoolArn(): String = unwrap(this).getAttrDetailsUserPoolArn()

  /**
   * The unique ID of the new or updated identity store.
   */
  public open fun attrIdentitySourceId(): String = unwrap(this).getAttrIdentitySourceId()

  /**
   * Contains configuration information used when creating a new identity source.
   */
  public open fun configuration(): Any = unwrap(this).getConfiguration()

  /**
   * Contains configuration information used when creating a new identity source.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains configuration information used when creating a new identity source.
   */
  public open fun configuration(`value`: IdentitySourceConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(IdentitySourceConfigurationProperty.Companion::unwrap))
  }

  /**
   * Contains configuration information used when creating a new identity source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f097b6a0169411a9541f2f293b2ec50920e1c9135042b5e23a00482ca4233e1")
  public open fun configuration(`value`: IdentitySourceConfigurationProperty.Builder.() -> Unit):
      Unit = configuration(IdentitySourceConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Specifies the ID of the policy store in which you want to store this identity source.
   */
  public open fun policyStoreId(): String = unwrap(this).getPolicyStoreId()

  /**
   * Specifies the ID of the policy store in which you want to store this identity source.
   */
  public open fun policyStoreId(`value`: String) {
    unwrap(this).setPolicyStoreId(`value`)
  }

  /**
   * Specifies the namespace and data type of the principals generated for identities authenticated
   * by the new identity source.
   */
  public open fun principalEntityType(): String? = unwrap(this).getPrincipalEntityType()

  /**
   * Specifies the namespace and data type of the principals generated for identities authenticated
   * by the new identity source.
   */
  public open fun principalEntityType(`value`: String) {
    unwrap(this).setPrincipalEntityType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.verifiedpermissions.CfnIdentitySource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains configuration information used when creating a new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * Contains configuration information used when creating a new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     */
    public fun configuration(configuration: IdentitySourceConfigurationProperty)

    /**
     * Contains configuration information used when creating a new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bbfe0ed3878f6d1c30b37f35051aaaf5948f60ea00fa239fb3ec49a4c3cee4d")
    public fun configuration(configuration: IdentitySourceConfigurationProperty.Builder.() -> Unit)

    /**
     * Specifies the ID of the policy store in which you want to store this identity source.
     *
     * Only policies and requests made using this policy store can reference identities from the
     * identity provider configured in the new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-policystoreid)
     * @param policyStoreId Specifies the ID of the policy store in which you want to store this
     * identity source. 
     */
    public fun policyStoreId(policyStoreId: String)

    /**
     * Specifies the namespace and data type of the principals generated for identities
     * authenticated by the new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-principalentitytype)
     * @param principalEntityType Specifies the namespace and data type of the principals generated
     * for identities authenticated by the new identity source. 
     */
    public fun principalEntityType(principalEntityType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.Builder.create(scope,
        id)

    /**
     * Contains configuration information used when creating a new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains configuration information used when creating a new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     */
    override fun configuration(configuration: IdentitySourceConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(IdentitySourceConfigurationProperty.Companion::unwrap))
    }

    /**
     * Contains configuration information used when creating a new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bbfe0ed3878f6d1c30b37f35051aaaf5948f60ea00fa239fb3ec49a4c3cee4d")
    override
        fun configuration(configuration: IdentitySourceConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(IdentitySourceConfigurationProperty(configuration))

    /**
     * Specifies the ID of the policy store in which you want to store this identity source.
     *
     * Only policies and requests made using this policy store can reference identities from the
     * identity provider configured in the new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-policystoreid)
     * @param policyStoreId Specifies the ID of the policy store in which you want to store this
     * identity source. 
     */
    override fun policyStoreId(policyStoreId: String) {
      cdkBuilder.policyStoreId(policyStoreId)
    }

    /**
     * Specifies the namespace and data type of the principals generated for identities
     * authenticated by the new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-principalentitytype)
     * @param principalEntityType Specifies the namespace and data type of the principals generated
     * for identities authenticated by the new identity source. 
     */
    override fun principalEntityType(principalEntityType: String) {
      cdkBuilder.principalEntityType(principalEntityType)
    }

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentitySource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentitySource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource):
        CfnIdentitySource = CfnIdentitySource(cdkObject)

    internal fun unwrap(wrapped: CfnIdentitySource):
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource = wrapped.cdkObject as
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource
  }

  /**
   * The type of entity that a policy store maps to groups from an Amazon Cognito user pool identity
   * source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
   * CognitoGroupConfigurationProperty cognitoGroupConfigurationProperty =
   * CognitoGroupConfigurationProperty.builder()
   * .groupEntityType("groupEntityType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-cognitogroupconfiguration.html)
   */
  public interface CognitoGroupConfigurationProperty {
    /**
     * The name of the schema entity type that's mapped to the user pool group.
     *
     * Defaults to `AWS::CognitoGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-cognitogroupconfiguration.html#cfn-verifiedpermissions-identitysource-cognitogroupconfiguration-groupentitytype)
     */
    public fun groupEntityType(): String

    /**
     * A builder for [CognitoGroupConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupEntityType The name of the schema entity type that's mapped to the user pool
       * group. 
       * Defaults to `AWS::CognitoGroup` .
       */
      public fun groupEntityType(groupEntityType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoGroupConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoGroupConfigurationProperty.builder()

      /**
       * @param groupEntityType The name of the schema entity type that's mapped to the user pool
       * group. 
       * Defaults to `AWS::CognitoGroup` .
       */
      override fun groupEntityType(groupEntityType: String) {
        cdkBuilder.groupEntityType(groupEntityType)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoGroupConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoGroupConfigurationProperty,
    ) : CdkObject(cdkObject),
        CognitoGroupConfigurationProperty {
      /**
       * The name of the schema entity type that's mapped to the user pool group.
       *
       * Defaults to `AWS::CognitoGroup` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-cognitogroupconfiguration.html#cfn-verifiedpermissions-identitysource-cognitogroupconfiguration-groupentitytype)
       */
      override fun groupEntityType(): String = unwrap(this).getGroupEntityType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CognitoGroupConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoGroupConfigurationProperty):
          CognitoGroupConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CognitoGroupConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoGroupConfigurationProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoGroupConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoGroupConfigurationProperty
    }
  }

  /**
   * A structure that contains configuration information used when creating or updating an identity
   * source that represents a connection to an Amazon Cognito user pool used as an identity provider
   * for Verified Permissions .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
   * CognitoUserPoolConfigurationProperty cognitoUserPoolConfigurationProperty =
   * CognitoUserPoolConfigurationProperty.builder()
   * .userPoolArn("userPoolArn")
   * // the properties below are optional
   * .clientIds(List.of("clientIds"))
   * .groupConfiguration(CognitoGroupConfigurationProperty.builder()
   * .groupEntityType("groupEntityType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-cognitouserpoolconfiguration.html)
   */
  public interface CognitoUserPoolConfigurationProperty {
    /**
     * The unique application client IDs that are associated with the specified Amazon Cognito user
     * pool.
     *
     * Example: `"ClientIds": ["&amp;ExampleCogClientId;"]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-cognitouserpoolconfiguration.html#cfn-verifiedpermissions-identitysource-cognitouserpoolconfiguration-clientids)
     */
    public fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

    /**
     * The type of entity that a policy store maps to groups from an Amazon Cognito user pool
     * identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-cognitouserpoolconfiguration.html#cfn-verifiedpermissions-identitysource-cognitouserpoolconfiguration-groupconfiguration)
     */
    public fun groupConfiguration(): Any? = unwrap(this).getGroupConfiguration()

    /**
     * The [Amazon Resource Name
     * (ARN)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the
     * Amazon Cognito user pool that contains the identities to be authorized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-cognitouserpoolconfiguration.html#cfn-verifiedpermissions-identitysource-cognitouserpoolconfiguration-userpoolarn)
     */
    public fun userPoolArn(): String

    /**
     * A builder for [CognitoUserPoolConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientIds The unique application client IDs that are associated with the specified
       * Amazon Cognito user pool.
       * Example: `"ClientIds": ["&amp;ExampleCogClientId;"]`
       */
      public fun clientIds(clientIds: List<String>)

      /**
       * @param clientIds The unique application client IDs that are associated with the specified
       * Amazon Cognito user pool.
       * Example: `"ClientIds": ["&amp;ExampleCogClientId;"]`
       */
      public fun clientIds(vararg clientIds: String)

      /**
       * @param groupConfiguration The type of entity that a policy store maps to groups from an
       * Amazon Cognito user pool identity source.
       */
      public fun groupConfiguration(groupConfiguration: IResolvable)

      /**
       * @param groupConfiguration The type of entity that a policy store maps to groups from an
       * Amazon Cognito user pool identity source.
       */
      public fun groupConfiguration(groupConfiguration: CognitoGroupConfigurationProperty)

      /**
       * @param groupConfiguration The type of entity that a policy store maps to groups from an
       * Amazon Cognito user pool identity source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c5f638c5e106cbb2c9bd28fc549fa07c96453673ad0b8790d827edaf575c470")
      public
          fun groupConfiguration(groupConfiguration: CognitoGroupConfigurationProperty.Builder.() -> Unit)

      /**
       * @param userPoolArn The [Amazon Resource Name
       * (ARN)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the
       * Amazon Cognito user pool that contains the identities to be authorized. 
       */
      public fun userPoolArn(userPoolArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty.builder()

      /**
       * @param clientIds The unique application client IDs that are associated with the specified
       * Amazon Cognito user pool.
       * Example: `"ClientIds": ["&amp;ExampleCogClientId;"]`
       */
      override fun clientIds(clientIds: List<String>) {
        cdkBuilder.clientIds(clientIds)
      }

      /**
       * @param clientIds The unique application client IDs that are associated with the specified
       * Amazon Cognito user pool.
       * Example: `"ClientIds": ["&amp;ExampleCogClientId;"]`
       */
      override fun clientIds(vararg clientIds: String): Unit = clientIds(clientIds.toList())

      /**
       * @param groupConfiguration The type of entity that a policy store maps to groups from an
       * Amazon Cognito user pool identity source.
       */
      override fun groupConfiguration(groupConfiguration: IResolvable) {
        cdkBuilder.groupConfiguration(groupConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param groupConfiguration The type of entity that a policy store maps to groups from an
       * Amazon Cognito user pool identity source.
       */
      override fun groupConfiguration(groupConfiguration: CognitoGroupConfigurationProperty) {
        cdkBuilder.groupConfiguration(groupConfiguration.let(CognitoGroupConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param groupConfiguration The type of entity that a policy store maps to groups from an
       * Amazon Cognito user pool identity source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c5f638c5e106cbb2c9bd28fc549fa07c96453673ad0b8790d827edaf575c470")
      override
          fun groupConfiguration(groupConfiguration: CognitoGroupConfigurationProperty.Builder.() -> Unit):
          Unit = groupConfiguration(CognitoGroupConfigurationProperty(groupConfiguration))

      /**
       * @param userPoolArn The [Amazon Resource Name
       * (ARN)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the
       * Amazon Cognito user pool that contains the identities to be authorized. 
       */
      override fun userPoolArn(userPoolArn: String) {
        cdkBuilder.userPoolArn(userPoolArn)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty,
    ) : CdkObject(cdkObject),
        CognitoUserPoolConfigurationProperty {
      /**
       * The unique application client IDs that are associated with the specified Amazon Cognito
       * user pool.
       *
       * Example: `"ClientIds": ["&amp;ExampleCogClientId;"]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-cognitouserpoolconfiguration.html#cfn-verifiedpermissions-identitysource-cognitouserpoolconfiguration-clientids)
       */
      override fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

      /**
       * The type of entity that a policy store maps to groups from an Amazon Cognito user pool
       * identity source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-cognitouserpoolconfiguration.html#cfn-verifiedpermissions-identitysource-cognitouserpoolconfiguration-groupconfiguration)
       */
      override fun groupConfiguration(): Any? = unwrap(this).getGroupConfiguration()

      /**
       * The [Amazon Resource Name
       * (ARN)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the
       * Amazon Cognito user pool that contains the identities to be authorized.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-cognitouserpoolconfiguration.html#cfn-verifiedpermissions-identitysource-cognitouserpoolconfiguration-userpoolarn)
       */
      override fun userPoolArn(): String = unwrap(this).getUserPoolArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CognitoUserPoolConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty):
          CognitoUserPoolConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CognitoUserPoolConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoUserPoolConfigurationProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty
    }
  }

  /**
   * A structure that contains configuration information used when creating or updating a new
   * identity source.
   *
   *
   * At this time, the only valid member of this structure is a Amazon Cognito user pool
   * configuration.
   *
   * You must specify a `userPoolArn` , and optionally, a `ClientId` .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
   * IdentitySourceConfigurationProperty identitySourceConfigurationProperty =
   * IdentitySourceConfigurationProperty.builder()
   * .cognitoUserPoolConfiguration(CognitoUserPoolConfigurationProperty.builder()
   * .userPoolArn("userPoolArn")
   * // the properties below are optional
   * .clientIds(List.of("clientIds"))
   * .groupConfiguration(CognitoGroupConfigurationProperty.builder()
   * .groupEntityType("groupEntityType")
   * .build())
   * .build())
   * .openIdConnectConfiguration(OpenIdConnectConfigurationProperty.builder()
   * .issuer("issuer")
   * .tokenSelection(OpenIdConnectTokenSelectionProperty.builder()
   * .accessTokenOnly(OpenIdConnectAccessTokenConfigurationProperty.builder()
   * .audiences(List.of("audiences"))
   * .principalIdClaim("principalIdClaim")
   * .build())
   * .identityTokenOnly(OpenIdConnectIdentityTokenConfigurationProperty.builder()
   * .clientIds(List.of("clientIds"))
   * .principalIdClaim("principalIdClaim")
   * .build())
   * .build())
   * // the properties below are optional
   * .entityIdPrefix("entityIdPrefix")
   * .groupConfiguration(OpenIdConnectGroupConfigurationProperty.builder()
   * .groupClaim("groupClaim")
   * .groupEntityType("groupEntityType")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourceconfiguration.html)
   */
  public interface IdentitySourceConfigurationProperty {
    /**
     * A structure that contains configuration information used when creating or updating an
     * identity source that represents a connection to an Amazon Cognito user pool used as an identity
     * provider for Verified Permissions .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourceconfiguration.html#cfn-verifiedpermissions-identitysource-identitysourceconfiguration-cognitouserpoolconfiguration)
     */
    public fun cognitoUserPoolConfiguration(): Any? = unwrap(this).getCognitoUserPoolConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourceconfiguration.html#cfn-verifiedpermissions-identitysource-identitysourceconfiguration-openidconnectconfiguration)
     */
    public fun openIdConnectConfiguration(): Any? = unwrap(this).getOpenIdConnectConfiguration()

    /**
     * A builder for [IdentitySourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cognitoUserPoolConfiguration A structure that contains configuration information
       * used when creating or updating an identity source that represents a connection to an Amazon
       * Cognito user pool used as an identity provider for Verified Permissions .
       */
      public fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: IResolvable)

      /**
       * @param cognitoUserPoolConfiguration A structure that contains configuration information
       * used when creating or updating an identity source that represents a connection to an Amazon
       * Cognito user pool used as an identity provider for Verified Permissions .
       */
      public
          fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: CognitoUserPoolConfigurationProperty)

      /**
       * @param cognitoUserPoolConfiguration A structure that contains configuration information
       * used when creating or updating an identity source that represents a connection to an Amazon
       * Cognito user pool used as an identity provider for Verified Permissions .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51bdf9dd6707933905c3a015af20f3e511473a2a30ce40b46ee0e5fe6764b226")
      public
          fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: CognitoUserPoolConfigurationProperty.Builder.() -> Unit)

      /**
       * @param openIdConnectConfiguration the value to be set.
       */
      public fun openIdConnectConfiguration(openIdConnectConfiguration: IResolvable)

      /**
       * @param openIdConnectConfiguration the value to be set.
       */
      public
          fun openIdConnectConfiguration(openIdConnectConfiguration: OpenIdConnectConfigurationProperty)

      /**
       * @param openIdConnectConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e302c19608fde93e2042f9662d74e15f730e62214508da1182cee1db965d3bc1")
      public
          fun openIdConnectConfiguration(openIdConnectConfiguration: OpenIdConnectConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty.builder()

      /**
       * @param cognitoUserPoolConfiguration A structure that contains configuration information
       * used when creating or updating an identity source that represents a connection to an Amazon
       * Cognito user pool used as an identity provider for Verified Permissions .
       */
      override fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: IResolvable) {
        cdkBuilder.cognitoUserPoolConfiguration(cognitoUserPoolConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cognitoUserPoolConfiguration A structure that contains configuration information
       * used when creating or updating an identity source that represents a connection to an Amazon
       * Cognito user pool used as an identity provider for Verified Permissions .
       */
      override
          fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: CognitoUserPoolConfigurationProperty) {
        cdkBuilder.cognitoUserPoolConfiguration(cognitoUserPoolConfiguration.let(CognitoUserPoolConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param cognitoUserPoolConfiguration A structure that contains configuration information
       * used when creating or updating an identity source that represents a connection to an Amazon
       * Cognito user pool used as an identity provider for Verified Permissions .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51bdf9dd6707933905c3a015af20f3e511473a2a30ce40b46ee0e5fe6764b226")
      override
          fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: CognitoUserPoolConfigurationProperty.Builder.() -> Unit):
          Unit =
          cognitoUserPoolConfiguration(CognitoUserPoolConfigurationProperty(cognitoUserPoolConfiguration))

      /**
       * @param openIdConnectConfiguration the value to be set.
       */
      override fun openIdConnectConfiguration(openIdConnectConfiguration: IResolvable) {
        cdkBuilder.openIdConnectConfiguration(openIdConnectConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param openIdConnectConfiguration the value to be set.
       */
      override
          fun openIdConnectConfiguration(openIdConnectConfiguration: OpenIdConnectConfigurationProperty) {
        cdkBuilder.openIdConnectConfiguration(openIdConnectConfiguration.let(OpenIdConnectConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param openIdConnectConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e302c19608fde93e2042f9662d74e15f730e62214508da1182cee1db965d3bc1")
      override
          fun openIdConnectConfiguration(openIdConnectConfiguration: OpenIdConnectConfigurationProperty.Builder.() -> Unit):
          Unit =
          openIdConnectConfiguration(OpenIdConnectConfigurationProperty(openIdConnectConfiguration))

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        IdentitySourceConfigurationProperty {
      /**
       * A structure that contains configuration information used when creating or updating an
       * identity source that represents a connection to an Amazon Cognito user pool used as an
       * identity provider for Verified Permissions .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourceconfiguration.html#cfn-verifiedpermissions-identitysource-identitysourceconfiguration-cognitouserpoolconfiguration)
       */
      override fun cognitoUserPoolConfiguration(): Any? =
          unwrap(this).getCognitoUserPoolConfiguration()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourceconfiguration.html#cfn-verifiedpermissions-identitysource-identitysourceconfiguration-openidconnectconfiguration)
       */
      override fun openIdConnectConfiguration(): Any? = unwrap(this).getOpenIdConnectConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdentitySourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty):
          IdentitySourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdentitySourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentitySourceConfigurationProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
   * IdentitySourceDetailsProperty identitySourceDetailsProperty =
   * IdentitySourceDetailsProperty.builder()
   * .clientIds(List.of("clientIds"))
   * .discoveryUrl("discoveryUrl")
   * .openIdIssuer("openIdIssuer")
   * .userPoolArn("userPoolArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html)
   */
  public interface IdentitySourceDetailsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-clientids)
     */
    public fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-discoveryurl)
     */
    public fun discoveryUrl(): String? = unwrap(this).getDiscoveryUrl()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-openidissuer)
     */
    public fun openIdIssuer(): String? = unwrap(this).getOpenIdIssuer()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-userpoolarn)
     */
    public fun userPoolArn(): String? = unwrap(this).getUserPoolArn()

    /**
     * A builder for [IdentitySourceDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientIds the value to be set.
       */
      public fun clientIds(clientIds: List<String>)

      /**
       * @param clientIds the value to be set.
       */
      public fun clientIds(vararg clientIds: String)

      /**
       * @param discoveryUrl the value to be set.
       */
      public fun discoveryUrl(discoveryUrl: String)

      /**
       * @param openIdIssuer the value to be set.
       */
      public fun openIdIssuer(openIdIssuer: String)

      /**
       * @param userPoolArn the value to be set.
       */
      public fun userPoolArn(userPoolArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty.builder()

      /**
       * @param clientIds the value to be set.
       */
      override fun clientIds(clientIds: List<String>) {
        cdkBuilder.clientIds(clientIds)
      }

      /**
       * @param clientIds the value to be set.
       */
      override fun clientIds(vararg clientIds: String): Unit = clientIds(clientIds.toList())

      /**
       * @param discoveryUrl the value to be set.
       */
      override fun discoveryUrl(discoveryUrl: String) {
        cdkBuilder.discoveryUrl(discoveryUrl)
      }

      /**
       * @param openIdIssuer the value to be set.
       */
      override fun openIdIssuer(openIdIssuer: String) {
        cdkBuilder.openIdIssuer(openIdIssuer)
      }

      /**
       * @param userPoolArn the value to be set.
       */
      override fun userPoolArn(userPoolArn: String) {
        cdkBuilder.userPoolArn(userPoolArn)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty,
    ) : CdkObject(cdkObject),
        IdentitySourceDetailsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-clientids)
       */
      override fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-discoveryurl)
       */
      override fun discoveryUrl(): String? = unwrap(this).getDiscoveryUrl()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-openidissuer)
       */
      override fun openIdIssuer(): String? = unwrap(this).getOpenIdIssuer()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-userpoolarn)
       */
      override fun userPoolArn(): String? = unwrap(this).getUserPoolArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdentitySourceDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty):
          IdentitySourceDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdentitySourceDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentitySourceDetailsProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty
    }
  }

  /**
   * The configuration of an OpenID Connect (OIDC) identity source for handling access token claims.
   *
   * Contains the claim that you want to identify as the principal in an authorization request, and
   * the values of the `aud` claim, or audiences, that you want to accept.
   *
   * This data type is part of a
   * [OpenIdConnectTokenSelection](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_OpenIdConnectTokenSelection.html)
   * structure, which is a parameter of
   * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
   * OpenIdConnectAccessTokenConfigurationProperty openIdConnectAccessTokenConfigurationProperty =
   * OpenIdConnectAccessTokenConfigurationProperty.builder()
   * .audiences(List.of("audiences"))
   * .principalIdClaim("principalIdClaim")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectaccesstokenconfiguration.html)
   */
  public interface OpenIdConnectAccessTokenConfigurationProperty {
    /**
     * The access token `aud` claim values that you want to accept in your policy store.
     *
     * For example, `https://myapp.example.com, https://myapp2.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectaccesstokenconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectaccesstokenconfiguration-audiences)
     */
    public fun audiences(): List<String> = unwrap(this).getAudiences() ?: emptyList()

    /**
     * The claim that determines the principal in OIDC access tokens.
     *
     * For example, `sub` .
     *
     * Default: - "sub"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectaccesstokenconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectaccesstokenconfiguration-principalidclaim)
     */
    public fun principalIdClaim(): String? = unwrap(this).getPrincipalIdClaim()

    /**
     * A builder for [OpenIdConnectAccessTokenConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param audiences The access token `aud` claim values that you want to accept in your policy
       * store.
       * For example, `https://myapp.example.com, https://myapp2.example.com` .
       */
      public fun audiences(audiences: List<String>)

      /**
       * @param audiences The access token `aud` claim values that you want to accept in your policy
       * store.
       * For example, `https://myapp.example.com, https://myapp2.example.com` .
       */
      public fun audiences(vararg audiences: String)

      /**
       * @param principalIdClaim The claim that determines the principal in OIDC access tokens.
       * For example, `sub` .
       */
      public fun principalIdClaim(principalIdClaim: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectAccessTokenConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectAccessTokenConfigurationProperty.builder()

      /**
       * @param audiences The access token `aud` claim values that you want to accept in your policy
       * store.
       * For example, `https://myapp.example.com, https://myapp2.example.com` .
       */
      override fun audiences(audiences: List<String>) {
        cdkBuilder.audiences(audiences)
      }

      /**
       * @param audiences The access token `aud` claim values that you want to accept in your policy
       * store.
       * For example, `https://myapp.example.com, https://myapp2.example.com` .
       */
      override fun audiences(vararg audiences: String): Unit = audiences(audiences.toList())

      /**
       * @param principalIdClaim The claim that determines the principal in OIDC access tokens.
       * For example, `sub` .
       */
      override fun principalIdClaim(principalIdClaim: String) {
        cdkBuilder.principalIdClaim(principalIdClaim)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectAccessTokenConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectAccessTokenConfigurationProperty,
    ) : CdkObject(cdkObject),
        OpenIdConnectAccessTokenConfigurationProperty {
      /**
       * The access token `aud` claim values that you want to accept in your policy store.
       *
       * For example, `https://myapp.example.com, https://myapp2.example.com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectaccesstokenconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectaccesstokenconfiguration-audiences)
       */
      override fun audiences(): List<String> = unwrap(this).getAudiences() ?: emptyList()

      /**
       * The claim that determines the principal in OIDC access tokens.
       *
       * For example, `sub` .
       *
       * Default: - "sub"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectaccesstokenconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectaccesstokenconfiguration-principalidclaim)
       */
      override fun principalIdClaim(): String? = unwrap(this).getPrincipalIdClaim()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OpenIdConnectAccessTokenConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectAccessTokenConfigurationProperty):
          OpenIdConnectAccessTokenConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenIdConnectAccessTokenConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenIdConnectAccessTokenConfigurationProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectAccessTokenConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectAccessTokenConfigurationProperty
    }
  }

  /**
   * Contains configuration details of an OpenID Connect (OIDC) identity provider, or identity
   * source, that Verified Permissions can use to generate entities from authenticated identities.
   *
   * It specifies the issuer URL, token type that you want to use, and policy store entity details.
   *
   * This data type is part of a
   * [Configuration](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_Configuration.html)
   * structure, which is a parameter to
   * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
   * OpenIdConnectConfigurationProperty openIdConnectConfigurationProperty =
   * OpenIdConnectConfigurationProperty.builder()
   * .issuer("issuer")
   * .tokenSelection(OpenIdConnectTokenSelectionProperty.builder()
   * .accessTokenOnly(OpenIdConnectAccessTokenConfigurationProperty.builder()
   * .audiences(List.of("audiences"))
   * .principalIdClaim("principalIdClaim")
   * .build())
   * .identityTokenOnly(OpenIdConnectIdentityTokenConfigurationProperty.builder()
   * .clientIds(List.of("clientIds"))
   * .principalIdClaim("principalIdClaim")
   * .build())
   * .build())
   * // the properties below are optional
   * .entityIdPrefix("entityIdPrefix")
   * .groupConfiguration(OpenIdConnectGroupConfigurationProperty.builder()
   * .groupClaim("groupClaim")
   * .groupEntityType("groupEntityType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectconfiguration.html)
   */
  public interface OpenIdConnectConfigurationProperty {
    /**
     * A descriptive string that you want to prefix to user entities from your OIDC identity
     * provider.
     *
     * For example, if you set an `entityIdPrefix` of `MyOIDCProvider` , you can reference
     * principals in your policies in the format `MyCorp::User::MyOIDCProvider|Carlos` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectconfiguration-entityidprefix)
     */
    public fun entityIdPrefix(): String? = unwrap(this).getEntityIdPrefix()

    /**
     * The claim in OIDC identity provider tokens that indicates a user's group membership, and the
     * entity type that you want to map it to.
     *
     * For example, this object can map the contents of a `groups` claim to `MyCorp::UserGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectconfiguration-groupconfiguration)
     */
    public fun groupConfiguration(): Any? = unwrap(this).getGroupConfiguration()

    /**
     * The issuer URL of an OIDC identity provider.
     *
     * This URL must have an OIDC discovery endpoint at the path `.well-known/openid-configuration`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectconfiguration-issuer)
     */
    public fun issuer(): String

    /**
     * The token type that you want to process from your OIDC identity provider.
     *
     * Your policy store can process either identity (ID) or access tokens from a given OIDC
     * identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectconfiguration-tokenselection)
     */
    public fun tokenSelection(): Any

    /**
     * A builder for [OpenIdConnectConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entityIdPrefix A descriptive string that you want to prefix to user entities from
       * your OIDC identity provider.
       * For example, if you set an `entityIdPrefix` of `MyOIDCProvider` , you can reference
       * principals in your policies in the format `MyCorp::User::MyOIDCProvider|Carlos` .
       */
      public fun entityIdPrefix(entityIdPrefix: String)

      /**
       * @param groupConfiguration The claim in OIDC identity provider tokens that indicates a
       * user's group membership, and the entity type that you want to map it to.
       * For example, this object can map the contents of a `groups` claim to `MyCorp::UserGroup` .
       */
      public fun groupConfiguration(groupConfiguration: IResolvable)

      /**
       * @param groupConfiguration The claim in OIDC identity provider tokens that indicates a
       * user's group membership, and the entity type that you want to map it to.
       * For example, this object can map the contents of a `groups` claim to `MyCorp::UserGroup` .
       */
      public fun groupConfiguration(groupConfiguration: OpenIdConnectGroupConfigurationProperty)

      /**
       * @param groupConfiguration The claim in OIDC identity provider tokens that indicates a
       * user's group membership, and the entity type that you want to map it to.
       * For example, this object can map the contents of a `groups` claim to `MyCorp::UserGroup` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59665db2f60079d16c60706069d7c72386fa7a8064d53c291a9fa1c924dcae37")
      public
          fun groupConfiguration(groupConfiguration: OpenIdConnectGroupConfigurationProperty.Builder.() -> Unit)

      /**
       * @param issuer The issuer URL of an OIDC identity provider. 
       * This URL must have an OIDC discovery endpoint at the path
       * `.well-known/openid-configuration` .
       */
      public fun issuer(issuer: String)

      /**
       * @param tokenSelection The token type that you want to process from your OIDC identity
       * provider. 
       * Your policy store can process either identity (ID) or access tokens from a given OIDC
       * identity source.
       */
      public fun tokenSelection(tokenSelection: IResolvable)

      /**
       * @param tokenSelection The token type that you want to process from your OIDC identity
       * provider. 
       * Your policy store can process either identity (ID) or access tokens from a given OIDC
       * identity source.
       */
      public fun tokenSelection(tokenSelection: OpenIdConnectTokenSelectionProperty)

      /**
       * @param tokenSelection The token type that you want to process from your OIDC identity
       * provider. 
       * Your policy store can process either identity (ID) or access tokens from a given OIDC
       * identity source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b179f443f7a241512ebec7e5b8c7fe5a3ad107bc04b0b36823f173ac1edb1c27")
      public
          fun tokenSelection(tokenSelection: OpenIdConnectTokenSelectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectConfigurationProperty.builder()

      /**
       * @param entityIdPrefix A descriptive string that you want to prefix to user entities from
       * your OIDC identity provider.
       * For example, if you set an `entityIdPrefix` of `MyOIDCProvider` , you can reference
       * principals in your policies in the format `MyCorp::User::MyOIDCProvider|Carlos` .
       */
      override fun entityIdPrefix(entityIdPrefix: String) {
        cdkBuilder.entityIdPrefix(entityIdPrefix)
      }

      /**
       * @param groupConfiguration The claim in OIDC identity provider tokens that indicates a
       * user's group membership, and the entity type that you want to map it to.
       * For example, this object can map the contents of a `groups` claim to `MyCorp::UserGroup` .
       */
      override fun groupConfiguration(groupConfiguration: IResolvable) {
        cdkBuilder.groupConfiguration(groupConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param groupConfiguration The claim in OIDC identity provider tokens that indicates a
       * user's group membership, and the entity type that you want to map it to.
       * For example, this object can map the contents of a `groups` claim to `MyCorp::UserGroup` .
       */
      override fun groupConfiguration(groupConfiguration: OpenIdConnectGroupConfigurationProperty) {
        cdkBuilder.groupConfiguration(groupConfiguration.let(OpenIdConnectGroupConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param groupConfiguration The claim in OIDC identity provider tokens that indicates a
       * user's group membership, and the entity type that you want to map it to.
       * For example, this object can map the contents of a `groups` claim to `MyCorp::UserGroup` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59665db2f60079d16c60706069d7c72386fa7a8064d53c291a9fa1c924dcae37")
      override
          fun groupConfiguration(groupConfiguration: OpenIdConnectGroupConfigurationProperty.Builder.() -> Unit):
          Unit = groupConfiguration(OpenIdConnectGroupConfigurationProperty(groupConfiguration))

      /**
       * @param issuer The issuer URL of an OIDC identity provider. 
       * This URL must have an OIDC discovery endpoint at the path
       * `.well-known/openid-configuration` .
       */
      override fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
      }

      /**
       * @param tokenSelection The token type that you want to process from your OIDC identity
       * provider. 
       * Your policy store can process either identity (ID) or access tokens from a given OIDC
       * identity source.
       */
      override fun tokenSelection(tokenSelection: IResolvable) {
        cdkBuilder.tokenSelection(tokenSelection.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tokenSelection The token type that you want to process from your OIDC identity
       * provider. 
       * Your policy store can process either identity (ID) or access tokens from a given OIDC
       * identity source.
       */
      override fun tokenSelection(tokenSelection: OpenIdConnectTokenSelectionProperty) {
        cdkBuilder.tokenSelection(tokenSelection.let(OpenIdConnectTokenSelectionProperty.Companion::unwrap))
      }

      /**
       * @param tokenSelection The token type that you want to process from your OIDC identity
       * provider. 
       * Your policy store can process either identity (ID) or access tokens from a given OIDC
       * identity source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b179f443f7a241512ebec7e5b8c7fe5a3ad107bc04b0b36823f173ac1edb1c27")
      override
          fun tokenSelection(tokenSelection: OpenIdConnectTokenSelectionProperty.Builder.() -> Unit):
          Unit = tokenSelection(OpenIdConnectTokenSelectionProperty(tokenSelection))

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectConfigurationProperty,
    ) : CdkObject(cdkObject),
        OpenIdConnectConfigurationProperty {
      /**
       * A descriptive string that you want to prefix to user entities from your OIDC identity
       * provider.
       *
       * For example, if you set an `entityIdPrefix` of `MyOIDCProvider` , you can reference
       * principals in your policies in the format `MyCorp::User::MyOIDCProvider|Carlos` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectconfiguration-entityidprefix)
       */
      override fun entityIdPrefix(): String? = unwrap(this).getEntityIdPrefix()

      /**
       * The claim in OIDC identity provider tokens that indicates a user's group membership, and
       * the entity type that you want to map it to.
       *
       * For example, this object can map the contents of a `groups` claim to `MyCorp::UserGroup` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectconfiguration-groupconfiguration)
       */
      override fun groupConfiguration(): Any? = unwrap(this).getGroupConfiguration()

      /**
       * The issuer URL of an OIDC identity provider.
       *
       * This URL must have an OIDC discovery endpoint at the path
       * `.well-known/openid-configuration` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectconfiguration-issuer)
       */
      override fun issuer(): String = unwrap(this).getIssuer()

      /**
       * The token type that you want to process from your OIDC identity provider.
       *
       * Your policy store can process either identity (ID) or access tokens from a given OIDC
       * identity source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectconfiguration-tokenselection)
       */
      override fun tokenSelection(): Any = unwrap(this).getTokenSelection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OpenIdConnectConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectConfigurationProperty):
          OpenIdConnectConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenIdConnectConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenIdConnectConfigurationProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectConfigurationProperty
    }
  }

  /**
   * The claim in OIDC identity provider tokens that indicates a user's group membership, and the
   * entity type that you want to map it to.
   *
   * For example, this object can map the contents of a `groups` claim to `MyCorp::UserGroup` .
   *
   * This data type is part of a
   * [OpenIdConnectConfiguration](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_OpenIdConnectConfiguration.html)
   * structure, which is a parameter of
   * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
   * OpenIdConnectGroupConfigurationProperty openIdConnectGroupConfigurationProperty =
   * OpenIdConnectGroupConfigurationProperty.builder()
   * .groupClaim("groupClaim")
   * .groupEntityType("groupEntityType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectgroupconfiguration.html)
   */
  public interface OpenIdConnectGroupConfigurationProperty {
    /**
     * The token claim that you want Verified Permissions to interpret as group membership.
     *
     * For example, `groups` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectgroupconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectgroupconfiguration-groupclaim)
     */
    public fun groupClaim(): String

    /**
     * The policy store entity type that you want to map your users' group claim to.
     *
     * For example, `MyCorp::UserGroup` . A group entity type is an entity that can have a user
     * entity type as a member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectgroupconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectgroupconfiguration-groupentitytype)
     */
    public fun groupEntityType(): String

    /**
     * A builder for [OpenIdConnectGroupConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupClaim The token claim that you want Verified Permissions to interpret as group
       * membership. 
       * For example, `groups` .
       */
      public fun groupClaim(groupClaim: String)

      /**
       * @param groupEntityType The policy store entity type that you want to map your users' group
       * claim to. 
       * For example, `MyCorp::UserGroup` . A group entity type is an entity that can have a user
       * entity type as a member.
       */
      public fun groupEntityType(groupEntityType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectGroupConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectGroupConfigurationProperty.builder()

      /**
       * @param groupClaim The token claim that you want Verified Permissions to interpret as group
       * membership. 
       * For example, `groups` .
       */
      override fun groupClaim(groupClaim: String) {
        cdkBuilder.groupClaim(groupClaim)
      }

      /**
       * @param groupEntityType The policy store entity type that you want to map your users' group
       * claim to. 
       * For example, `MyCorp::UserGroup` . A group entity type is an entity that can have a user
       * entity type as a member.
       */
      override fun groupEntityType(groupEntityType: String) {
        cdkBuilder.groupEntityType(groupEntityType)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectGroupConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectGroupConfigurationProperty,
    ) : CdkObject(cdkObject),
        OpenIdConnectGroupConfigurationProperty {
      /**
       * The token claim that you want Verified Permissions to interpret as group membership.
       *
       * For example, `groups` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectgroupconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectgroupconfiguration-groupclaim)
       */
      override fun groupClaim(): String = unwrap(this).getGroupClaim()

      /**
       * The policy store entity type that you want to map your users' group claim to.
       *
       * For example, `MyCorp::UserGroup` . A group entity type is an entity that can have a user
       * entity type as a member.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectgroupconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectgroupconfiguration-groupentitytype)
       */
      override fun groupEntityType(): String = unwrap(this).getGroupEntityType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OpenIdConnectGroupConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectGroupConfigurationProperty):
          OpenIdConnectGroupConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenIdConnectGroupConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenIdConnectGroupConfigurationProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectGroupConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectGroupConfigurationProperty
    }
  }

  /**
   * The configuration of an OpenID Connect (OIDC) identity source for handling identity (ID) token
   * claims.
   *
   * Contains the claim that you want to identify as the principal in an authorization request, and
   * the values of the `aud` claim, or audiences, that you want to accept.
   *
   * This data type is part of a
   * [OpenIdConnectTokenSelection](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_OpenIdConnectTokenSelection.html)
   * structure, which is a parameter of
   * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
   * OpenIdConnectIdentityTokenConfigurationProperty openIdConnectIdentityTokenConfigurationProperty
   * = OpenIdConnectIdentityTokenConfigurationProperty.builder()
   * .clientIds(List.of("clientIds"))
   * .principalIdClaim("principalIdClaim")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectidentitytokenconfiguration.html)
   */
  public interface OpenIdConnectIdentityTokenConfigurationProperty {
    /**
     * The ID token audience, or client ID, claim values that you want to accept in your policy
     * store from an OIDC identity provider.
     *
     * For example, `1example23456789, 2example10111213` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectidentitytokenconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectidentitytokenconfiguration-clientids)
     */
    public fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

    /**
     * The claim that determines the principal in OIDC access tokens.
     *
     * For example, `sub` .
     *
     * Default: - "sub"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectidentitytokenconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectidentitytokenconfiguration-principalidclaim)
     */
    public fun principalIdClaim(): String? = unwrap(this).getPrincipalIdClaim()

    /**
     * A builder for [OpenIdConnectIdentityTokenConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientIds The ID token audience, or client ID, claim values that you want to accept
       * in your policy store from an OIDC identity provider.
       * For example, `1example23456789, 2example10111213` .
       */
      public fun clientIds(clientIds: List<String>)

      /**
       * @param clientIds The ID token audience, or client ID, claim values that you want to accept
       * in your policy store from an OIDC identity provider.
       * For example, `1example23456789, 2example10111213` .
       */
      public fun clientIds(vararg clientIds: String)

      /**
       * @param principalIdClaim The claim that determines the principal in OIDC access tokens.
       * For example, `sub` .
       */
      public fun principalIdClaim(principalIdClaim: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectIdentityTokenConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectIdentityTokenConfigurationProperty.builder()

      /**
       * @param clientIds The ID token audience, or client ID, claim values that you want to accept
       * in your policy store from an OIDC identity provider.
       * For example, `1example23456789, 2example10111213` .
       */
      override fun clientIds(clientIds: List<String>) {
        cdkBuilder.clientIds(clientIds)
      }

      /**
       * @param clientIds The ID token audience, or client ID, claim values that you want to accept
       * in your policy store from an OIDC identity provider.
       * For example, `1example23456789, 2example10111213` .
       */
      override fun clientIds(vararg clientIds: String): Unit = clientIds(clientIds.toList())

      /**
       * @param principalIdClaim The claim that determines the principal in OIDC access tokens.
       * For example, `sub` .
       */
      override fun principalIdClaim(principalIdClaim: String) {
        cdkBuilder.principalIdClaim(principalIdClaim)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectIdentityTokenConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectIdentityTokenConfigurationProperty,
    ) : CdkObject(cdkObject),
        OpenIdConnectIdentityTokenConfigurationProperty {
      /**
       * The ID token audience, or client ID, claim values that you want to accept in your policy
       * store from an OIDC identity provider.
       *
       * For example, `1example23456789, 2example10111213` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectidentitytokenconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectidentitytokenconfiguration-clientids)
       */
      override fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

      /**
       * The claim that determines the principal in OIDC access tokens.
       *
       * For example, `sub` .
       *
       * Default: - "sub"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnectidentitytokenconfiguration.html#cfn-verifiedpermissions-identitysource-openidconnectidentitytokenconfiguration-principalidclaim)
       */
      override fun principalIdClaim(): String? = unwrap(this).getPrincipalIdClaim()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OpenIdConnectIdentityTokenConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectIdentityTokenConfigurationProperty):
          OpenIdConnectIdentityTokenConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenIdConnectIdentityTokenConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenIdConnectIdentityTokenConfigurationProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectIdentityTokenConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectIdentityTokenConfigurationProperty
    }
  }

  /**
   * The token type that you want to process from your OIDC identity provider.
   *
   * Your policy store can process either identity (ID) or access tokens from a given OIDC identity
   * source.
   *
   * This data type is part of a
   * [OpenIdConnectConfiguration](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_OpenIdConnectConfiguration.html)
   * structure, which is a parameter of
   * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
   * OpenIdConnectTokenSelectionProperty openIdConnectTokenSelectionProperty =
   * OpenIdConnectTokenSelectionProperty.builder()
   * .accessTokenOnly(OpenIdConnectAccessTokenConfigurationProperty.builder()
   * .audiences(List.of("audiences"))
   * .principalIdClaim("principalIdClaim")
   * .build())
   * .identityTokenOnly(OpenIdConnectIdentityTokenConfigurationProperty.builder()
   * .clientIds(List.of("clientIds"))
   * .principalIdClaim("principalIdClaim")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnecttokenselection.html)
   */
  public interface OpenIdConnectTokenSelectionProperty {
    /**
     * The OIDC configuration for processing access tokens.
     *
     * Contains allowed audience claims, for example `https://auth.example.com` , and the claim that
     * you want to map to the principal, for example `sub` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnecttokenselection.html#cfn-verifiedpermissions-identitysource-openidconnecttokenselection-accesstokenonly)
     */
    public fun accessTokenOnly(): Any? = unwrap(this).getAccessTokenOnly()

    /**
     * The OIDC configuration for processing identity (ID) tokens.
     *
     * Contains allowed client ID claims, for example `1example23456789` , and the claim that you
     * want to map to the principal, for example `sub` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnecttokenselection.html#cfn-verifiedpermissions-identitysource-openidconnecttokenselection-identitytokenonly)
     */
    public fun identityTokenOnly(): Any? = unwrap(this).getIdentityTokenOnly()

    /**
     * A builder for [OpenIdConnectTokenSelectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessTokenOnly The OIDC configuration for processing access tokens.
       * Contains allowed audience claims, for example `https://auth.example.com` , and the claim
       * that you want to map to the principal, for example `sub` .
       */
      public fun accessTokenOnly(accessTokenOnly: IResolvable)

      /**
       * @param accessTokenOnly The OIDC configuration for processing access tokens.
       * Contains allowed audience claims, for example `https://auth.example.com` , and the claim
       * that you want to map to the principal, for example `sub` .
       */
      public fun accessTokenOnly(accessTokenOnly: OpenIdConnectAccessTokenConfigurationProperty)

      /**
       * @param accessTokenOnly The OIDC configuration for processing access tokens.
       * Contains allowed audience claims, for example `https://auth.example.com` , and the claim
       * that you want to map to the principal, for example `sub` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa3c9fa6856bb3ac117266e9947e89bc29d87d3b5bacbcc69c5542cc490b9b8d")
      public
          fun accessTokenOnly(accessTokenOnly: OpenIdConnectAccessTokenConfigurationProperty.Builder.() -> Unit)

      /**
       * @param identityTokenOnly The OIDC configuration for processing identity (ID) tokens.
       * Contains allowed client ID claims, for example `1example23456789` , and the claim that you
       * want to map to the principal, for example `sub` .
       */
      public fun identityTokenOnly(identityTokenOnly: IResolvable)

      /**
       * @param identityTokenOnly The OIDC configuration for processing identity (ID) tokens.
       * Contains allowed client ID claims, for example `1example23456789` , and the claim that you
       * want to map to the principal, for example `sub` .
       */
      public
          fun identityTokenOnly(identityTokenOnly: OpenIdConnectIdentityTokenConfigurationProperty)

      /**
       * @param identityTokenOnly The OIDC configuration for processing identity (ID) tokens.
       * Contains allowed client ID claims, for example `1example23456789` , and the claim that you
       * want to map to the principal, for example `sub` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23e46a2c2cf78b04ec9460b66c4488ca2a170829b8ef6f0d157d5a7d140f1e22")
      public
          fun identityTokenOnly(identityTokenOnly: OpenIdConnectIdentityTokenConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectTokenSelectionProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectTokenSelectionProperty.builder()

      /**
       * @param accessTokenOnly The OIDC configuration for processing access tokens.
       * Contains allowed audience claims, for example `https://auth.example.com` , and the claim
       * that you want to map to the principal, for example `sub` .
       */
      override fun accessTokenOnly(accessTokenOnly: IResolvable) {
        cdkBuilder.accessTokenOnly(accessTokenOnly.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param accessTokenOnly The OIDC configuration for processing access tokens.
       * Contains allowed audience claims, for example `https://auth.example.com` , and the claim
       * that you want to map to the principal, for example `sub` .
       */
      override fun accessTokenOnly(accessTokenOnly: OpenIdConnectAccessTokenConfigurationProperty) {
        cdkBuilder.accessTokenOnly(accessTokenOnly.let(OpenIdConnectAccessTokenConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param accessTokenOnly The OIDC configuration for processing access tokens.
       * Contains allowed audience claims, for example `https://auth.example.com` , and the claim
       * that you want to map to the principal, for example `sub` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa3c9fa6856bb3ac117266e9947e89bc29d87d3b5bacbcc69c5542cc490b9b8d")
      override
          fun accessTokenOnly(accessTokenOnly: OpenIdConnectAccessTokenConfigurationProperty.Builder.() -> Unit):
          Unit = accessTokenOnly(OpenIdConnectAccessTokenConfigurationProperty(accessTokenOnly))

      /**
       * @param identityTokenOnly The OIDC configuration for processing identity (ID) tokens.
       * Contains allowed client ID claims, for example `1example23456789` , and the claim that you
       * want to map to the principal, for example `sub` .
       */
      override fun identityTokenOnly(identityTokenOnly: IResolvable) {
        cdkBuilder.identityTokenOnly(identityTokenOnly.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param identityTokenOnly The OIDC configuration for processing identity (ID) tokens.
       * Contains allowed client ID claims, for example `1example23456789` , and the claim that you
       * want to map to the principal, for example `sub` .
       */
      override
          fun identityTokenOnly(identityTokenOnly: OpenIdConnectIdentityTokenConfigurationProperty) {
        cdkBuilder.identityTokenOnly(identityTokenOnly.let(OpenIdConnectIdentityTokenConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param identityTokenOnly The OIDC configuration for processing identity (ID) tokens.
       * Contains allowed client ID claims, for example `1example23456789` , and the claim that you
       * want to map to the principal, for example `sub` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23e46a2c2cf78b04ec9460b66c4488ca2a170829b8ef6f0d157d5a7d140f1e22")
      override
          fun identityTokenOnly(identityTokenOnly: OpenIdConnectIdentityTokenConfigurationProperty.Builder.() -> Unit):
          Unit =
          identityTokenOnly(OpenIdConnectIdentityTokenConfigurationProperty(identityTokenOnly))

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectTokenSelectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectTokenSelectionProperty,
    ) : CdkObject(cdkObject),
        OpenIdConnectTokenSelectionProperty {
      /**
       * The OIDC configuration for processing access tokens.
       *
       * Contains allowed audience claims, for example `https://auth.example.com` , and the claim
       * that you want to map to the principal, for example `sub` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnecttokenselection.html#cfn-verifiedpermissions-identitysource-openidconnecttokenselection-accesstokenonly)
       */
      override fun accessTokenOnly(): Any? = unwrap(this).getAccessTokenOnly()

      /**
       * The OIDC configuration for processing identity (ID) tokens.
       *
       * Contains allowed client ID claims, for example `1example23456789` , and the claim that you
       * want to map to the principal, for example `sub` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-openidconnecttokenselection.html#cfn-verifiedpermissions-identitysource-openidconnecttokenselection-identitytokenonly)
       */
      override fun identityTokenOnly(): Any? = unwrap(this).getIdentityTokenOnly()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OpenIdConnectTokenSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectTokenSelectionProperty):
          OpenIdConnectTokenSelectionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenIdConnectTokenSelectionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenIdConnectTokenSelectionProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectTokenSelectionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.OpenIdConnectTokenSelectionProperty
    }
  }
}
