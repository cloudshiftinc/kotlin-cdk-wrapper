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
public open class CfnIdentitySource internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdentitySourceProps,
  ) :
      this(software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnIdentitySourceProps::unwrap))
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
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains configuration information used when creating a new identity source.
   */
  public open fun configuration(`value`: IdentitySourceConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(IdentitySourceConfigurationProperty::unwrap))
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * Contains configuration information used when creating a new identity source.
     *
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     */
    public fun configuration(configuration: IdentitySourceConfigurationProperty)

    /**
     * Contains configuration information used when creating a new identity source.
     *
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
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
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * Contains configuration information used when creating a new identity source.
     *
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     * @param configuration Contains configuration information used when creating a new identity
     * source. 
     */
    override fun configuration(configuration: IdentitySourceConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(IdentitySourceConfigurationProperty::unwrap))
    }

    /**
     * Contains configuration information used when creating a new identity source.
     *
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
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
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource = wrapped.cdkObject
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
    public fun cognitoUserPoolConfiguration(): Any

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
        cdkBuilder.cognitoUserPoolConfiguration(cognitoUserPoolConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param cognitoUserPoolConfiguration A structure that contains configuration information
       * used when creating or updating an identity source that represents a connection to an Amazon
       * Cognito user pool used as an identity provider for Verified Permissions . 
       */
      override
          fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: CognitoUserPoolConfigurationProperty) {
        cdkBuilder.cognitoUserPoolConfiguration(cognitoUserPoolConfiguration.let(CognitoUserPoolConfigurationProperty::unwrap))
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

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty,
    ) : CdkObject(cdkObject), IdentitySourceConfigurationProperty {
      /**
       * A structure that contains configuration information used when creating or updating an
       * identity source that represents a connection to an Amazon Cognito user pool used as an
       * identity provider for Verified Permissions .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourceconfiguration.html#cfn-verifiedpermissions-identitysource-identitysourceconfiguration-cognitouserpoolconfiguration)
       */
      override fun cognitoUserPoolConfiguration(): Any =
          unwrap(this).getCognitoUserPoolConfiguration()
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
   * A structure that contains configuration of the identity source.
   *
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
     * The application client IDs associated with the specified Amazon Cognito user pool that are
     * enabled for this identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-clientids)
     */
    public fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

    /**
     * The well-known URL that points to this user pool's OIDC discovery endpoint.
     *
     * This is a URL string in the following format. This URL replaces the placeholders for both the
     * AWS Region and the user pool identifier with those appropriate for this user pool.
     *
     * `https://cognito-idp. *&lt;region&gt;* .amazonaws.com/ *&lt;user-pool-id&gt;*
     * /.well-known/openid-configuration`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-discoveryurl)
     */
    public fun discoveryUrl(): String? = unwrap(this).getDiscoveryUrl()

    /**
     * A string that identifies the type of OIDC service represented by this identity source.
     *
     * At this time, the only valid value is `cognito` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-openidissuer)
     */
    public fun openIdIssuer(): String? = unwrap(this).getOpenIdIssuer()

    /**
     * The [Amazon Resource Name
     * (ARN)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the
     * Amazon Cognito user pool whose identities are accessible to this Verified Permissions policy
     * store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-userpoolarn)
     */
    public fun userPoolArn(): String? = unwrap(this).getUserPoolArn()

    /**
     * A builder for [IdentitySourceDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientIds The application client IDs associated with the specified Amazon Cognito
       * user pool that are enabled for this identity source.
       */
      public fun clientIds(clientIds: List<String>)

      /**
       * @param clientIds The application client IDs associated with the specified Amazon Cognito
       * user pool that are enabled for this identity source.
       */
      public fun clientIds(vararg clientIds: String)

      /**
       * @param discoveryUrl The well-known URL that points to this user pool's OIDC discovery
       * endpoint.
       * This is a URL string in the following format. This URL replaces the placeholders for both
       * the AWS Region and the user pool identifier with those appropriate for this user pool.
       *
       * `https://cognito-idp. *&lt;region&gt;* .amazonaws.com/ *&lt;user-pool-id&gt;*
       * /.well-known/openid-configuration`
       */
      public fun discoveryUrl(discoveryUrl: String)

      /**
       * @param openIdIssuer A string that identifies the type of OIDC service represented by this
       * identity source.
       * At this time, the only valid value is `cognito` .
       */
      public fun openIdIssuer(openIdIssuer: String)

      /**
       * @param userPoolArn The [Amazon Resource Name
       * (ARN)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the
       * Amazon Cognito user pool whose identities are accessible to this Verified Permissions policy
       * store.
       */
      public fun userPoolArn(userPoolArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty.builder()

      /**
       * @param clientIds The application client IDs associated with the specified Amazon Cognito
       * user pool that are enabled for this identity source.
       */
      override fun clientIds(clientIds: List<String>) {
        cdkBuilder.clientIds(clientIds)
      }

      /**
       * @param clientIds The application client IDs associated with the specified Amazon Cognito
       * user pool that are enabled for this identity source.
       */
      override fun clientIds(vararg clientIds: String): Unit = clientIds(clientIds.toList())

      /**
       * @param discoveryUrl The well-known URL that points to this user pool's OIDC discovery
       * endpoint.
       * This is a URL string in the following format. This URL replaces the placeholders for both
       * the AWS Region and the user pool identifier with those appropriate for this user pool.
       *
       * `https://cognito-idp. *&lt;region&gt;* .amazonaws.com/ *&lt;user-pool-id&gt;*
       * /.well-known/openid-configuration`
       */
      override fun discoveryUrl(discoveryUrl: String) {
        cdkBuilder.discoveryUrl(discoveryUrl)
      }

      /**
       * @param openIdIssuer A string that identifies the type of OIDC service represented by this
       * identity source.
       * At this time, the only valid value is `cognito` .
       */
      override fun openIdIssuer(openIdIssuer: String) {
        cdkBuilder.openIdIssuer(openIdIssuer)
      }

      /**
       * @param userPoolArn The [Amazon Resource Name
       * (ARN)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the
       * Amazon Cognito user pool whose identities are accessible to this Verified Permissions policy
       * store.
       */
      override fun userPoolArn(userPoolArn: String) {
        cdkBuilder.userPoolArn(userPoolArn)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty,
    ) : CdkObject(cdkObject), IdentitySourceDetailsProperty {
      /**
       * The application client IDs associated with the specified Amazon Cognito user pool that are
       * enabled for this identity source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-clientids)
       */
      override fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

      /**
       * The well-known URL that points to this user pool's OIDC discovery endpoint.
       *
       * This is a URL string in the following format. This URL replaces the placeholders for both
       * the AWS Region and the user pool identifier with those appropriate for this user pool.
       *
       * `https://cognito-idp. *&lt;region&gt;* .amazonaws.com/ *&lt;user-pool-id&gt;*
       * /.well-known/openid-configuration`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-discoveryurl)
       */
      override fun discoveryUrl(): String? = unwrap(this).getDiscoveryUrl()

      /**
       * A string that identifies the type of OIDC service represented by this identity source.
       *
       * At this time, the only valid value is `cognito` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html#cfn-verifiedpermissions-identitysource-identitysourcedetails-openidissuer)
       */
      override fun openIdIssuer(): String? = unwrap(this).getOpenIdIssuer()

      /**
       * The [Amazon Resource Name
       * (ARN)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) of the
       * Amazon Cognito user pool whose identities are accessible to this Verified Permissions policy
       * store.
       *
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
      override val cdkObject:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty,
    ) : CdkObject(cdkObject), CognitoUserPoolConfigurationProperty {
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
}
