@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A trust provider is a third-party entity that creates, maintains, and manages identity
 * information for users and devices.
 *
 * When an application request is made, the identity information sent by the trust provider is
 * evaluated by Verified Access before allowing or denying the application request.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVerifiedAccessTrustProvider cfnVerifiedAccessTrustProvider =
 * CfnVerifiedAccessTrustProvider.Builder.create(this, "MyCfnVerifiedAccessTrustProvider")
 * .policyReferenceName("policyReferenceName")
 * .trustProviderType("trustProviderType")
 * // the properties below are optional
 * .description("description")
 * .deviceOptions(DeviceOptionsProperty.builder()
 * .publicSigningKeyUrl("publicSigningKeyUrl")
 * .tenantId("tenantId")
 * .build())
 * .deviceTrustProviderType("deviceTrustProviderType")
 * .oidcOptions(OidcOptionsProperty.builder()
 * .authorizationEndpoint("authorizationEndpoint")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .issuer("issuer")
 * .scope("scope")
 * .tokenEndpoint("tokenEndpoint")
 * .userInfoEndpoint("userInfoEndpoint")
 * .build())
 * .sseSpecification(SseSpecificationProperty.builder()
 * .customerManagedKeyEnabled(false)
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userTrustProviderType("userTrustProviderType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html)
 */
public open class CfnVerifiedAccessTrustProvider internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVerifiedAccessTrustProviderProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnVerifiedAccessTrustProviderProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVerifiedAccessTrustProviderProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVerifiedAccessTrustProviderProps(props)
  )

  /**
   * The creation time.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The last updated time.
   */
  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  /**
   * The ID of the Verified Access trust provider.
   */
  public open fun attrVerifiedAccessTrustProviderId(): String =
      unwrap(this).getAttrVerifiedAccessTrustProviderId()

  /**
   * A description for the AWS Verified Access trust provider.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the AWS Verified Access trust provider.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The options for device-identity trust provider.
   */
  public open fun deviceOptions(): Any? = unwrap(this).getDeviceOptions()

  /**
   * The options for device-identity trust provider.
   */
  public open fun deviceOptions(`value`: IResolvable) {
    unwrap(this).setDeviceOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The options for device-identity trust provider.
   */
  public open fun deviceOptions(`value`: DeviceOptionsProperty) {
    unwrap(this).setDeviceOptions(`value`.let(DeviceOptionsProperty::unwrap))
  }

  /**
   * The options for device-identity trust provider.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("02b103be5523dded76890a2977b8b8ecc86f2ee22f20340671de732f40ec885f")
  public open fun deviceOptions(`value`: DeviceOptionsProperty.Builder.() -> Unit): Unit =
      deviceOptions(DeviceOptionsProperty(`value`))

  /**
   * The type of device-based trust provider.
   */
  public open fun deviceTrustProviderType(): String? = unwrap(this).getDeviceTrustProviderType()

  /**
   * The type of device-based trust provider.
   */
  public open fun deviceTrustProviderType(`value`: String) {
    unwrap(this).setDeviceTrustProviderType(`value`)
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
   * The options for an OpenID Connect-compatible user-identity trust provider.
   */
  public open fun oidcOptions(): Any? = unwrap(this).getOidcOptions()

  /**
   * The options for an OpenID Connect-compatible user-identity trust provider.
   */
  public open fun oidcOptions(`value`: IResolvable) {
    unwrap(this).setOidcOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The options for an OpenID Connect-compatible user-identity trust provider.
   */
  public open fun oidcOptions(`value`: OidcOptionsProperty) {
    unwrap(this).setOidcOptions(`value`.let(OidcOptionsProperty::unwrap))
  }

  /**
   * The options for an OpenID Connect-compatible user-identity trust provider.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b07119bd712fc4edc9fe5efe5650af35ed4c441129155ea956157b411abb7bba")
  public open fun oidcOptions(`value`: OidcOptionsProperty.Builder.() -> Unit): Unit =
      oidcOptions(OidcOptionsProperty(`value`))

  /**
   * The identifier to be used when working with policy rules.
   */
  public open fun policyReferenceName(): String = unwrap(this).getPolicyReferenceName()

  /**
   * The identifier to be used when working with policy rules.
   */
  public open fun policyReferenceName(`value`: String) {
    unwrap(this).setPolicyReferenceName(`value`)
  }

  /**
   * The options for additional server side encryption.
   */
  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * The options for additional server side encryption.
   */
  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * The options for additional server side encryption.
   */
  public open fun sseSpecification(`value`: SseSpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SseSpecificationProperty::unwrap))
  }

  /**
   * The options for additional server side encryption.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec052c3bbe02e40011474653df6ce24b991207b9de6e5db45275c14c45766bee")
  public open fun sseSpecification(`value`: SseSpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SseSpecificationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of Verified Access trust provider.
   */
  public open fun trustProviderType(): String = unwrap(this).getTrustProviderType()

  /**
   * The type of Verified Access trust provider.
   */
  public open fun trustProviderType(`value`: String) {
    unwrap(this).setTrustProviderType(`value`)
  }

  /**
   * The type of user-based trust provider.
   */
  public open fun userTrustProviderType(): String? = unwrap(this).getUserTrustProviderType()

  /**
   * The type of user-based trust provider.
   */
  public open fun userTrustProviderType(`value`: String) {
    unwrap(this).setUserTrustProviderType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVerifiedAccessTrustProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the AWS Verified Access trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-description)
     * @param description A description for the AWS Verified Access trust provider. 
     */
    public fun description(description: String)

    /**
     * The options for device-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions)
     * @param deviceOptions The options for device-identity trust provider. 
     */
    public fun deviceOptions(deviceOptions: IResolvable)

    /**
     * The options for device-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions)
     * @param deviceOptions The options for device-identity trust provider. 
     */
    public fun deviceOptions(deviceOptions: DeviceOptionsProperty)

    /**
     * The options for device-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions)
     * @param deviceOptions The options for device-identity trust provider. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08a9ad74d3605c06b9cdbb2e0624a533cd24b679a276d476a7a0f874b7dc5684")
    public fun deviceOptions(deviceOptions: DeviceOptionsProperty.Builder.() -> Unit)

    /**
     * The type of device-based trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-devicetrustprovidertype)
     * @param deviceTrustProviderType The type of device-based trust provider. 
     */
    public fun deviceTrustProviderType(deviceTrustProviderType: String)

    /**
     * The options for an OpenID Connect-compatible user-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions)
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     * 
     */
    public fun oidcOptions(oidcOptions: IResolvable)

    /**
     * The options for an OpenID Connect-compatible user-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions)
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     * 
     */
    public fun oidcOptions(oidcOptions: OidcOptionsProperty)

    /**
     * The options for an OpenID Connect-compatible user-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions)
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8ad0a357520e21184534f0d8df7b60b276f4df0f4a8a682b46665ba9da7b84b")
    public fun oidcOptions(oidcOptions: OidcOptionsProperty.Builder.() -> Unit)

    /**
     * The identifier to be used when working with policy rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-policyreferencename)
     * @param policyReferenceName The identifier to be used when working with policy rules. 
     */
    public fun policyReferenceName(policyReferenceName: String)

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    public fun sseSpecification(sseSpecification: SseSpecificationProperty)

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e96c674ba42238511c7f6afb732a4dbfa0d034067272e0f212d83a6740cf2d04")
    public fun sseSpecification(sseSpecification: SseSpecificationProperty.Builder.() -> Unit)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-tags)
     * @param tags The tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-tags)
     * @param tags The tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of Verified Access trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-trustprovidertype)
     * @param trustProviderType The type of Verified Access trust provider. 
     */
    public fun trustProviderType(trustProviderType: String)

    /**
     * The type of user-based trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-usertrustprovidertype)
     * @param userTrustProviderType The type of user-based trust provider. 
     */
    public fun userTrustProviderType(userTrustProviderType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.Builder.create(scope, id)

    /**
     * A description for the AWS Verified Access trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-description)
     * @param description A description for the AWS Verified Access trust provider. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The options for device-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions)
     * @param deviceOptions The options for device-identity trust provider. 
     */
    override fun deviceOptions(deviceOptions: IResolvable) {
      cdkBuilder.deviceOptions(deviceOptions.let(IResolvable::unwrap))
    }

    /**
     * The options for device-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions)
     * @param deviceOptions The options for device-identity trust provider. 
     */
    override fun deviceOptions(deviceOptions: DeviceOptionsProperty) {
      cdkBuilder.deviceOptions(deviceOptions.let(DeviceOptionsProperty::unwrap))
    }

    /**
     * The options for device-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions)
     * @param deviceOptions The options for device-identity trust provider. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08a9ad74d3605c06b9cdbb2e0624a533cd24b679a276d476a7a0f874b7dc5684")
    override fun deviceOptions(deviceOptions: DeviceOptionsProperty.Builder.() -> Unit): Unit =
        deviceOptions(DeviceOptionsProperty(deviceOptions))

    /**
     * The type of device-based trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-devicetrustprovidertype)
     * @param deviceTrustProviderType The type of device-based trust provider. 
     */
    override fun deviceTrustProviderType(deviceTrustProviderType: String) {
      cdkBuilder.deviceTrustProviderType(deviceTrustProviderType)
    }

    /**
     * The options for an OpenID Connect-compatible user-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions)
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     * 
     */
    override fun oidcOptions(oidcOptions: IResolvable) {
      cdkBuilder.oidcOptions(oidcOptions.let(IResolvable::unwrap))
    }

    /**
     * The options for an OpenID Connect-compatible user-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions)
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     * 
     */
    override fun oidcOptions(oidcOptions: OidcOptionsProperty) {
      cdkBuilder.oidcOptions(oidcOptions.let(OidcOptionsProperty::unwrap))
    }

    /**
     * The options for an OpenID Connect-compatible user-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions)
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8ad0a357520e21184534f0d8df7b60b276f4df0f4a8a682b46665ba9da7b84b")
    override fun oidcOptions(oidcOptions: OidcOptionsProperty.Builder.() -> Unit): Unit =
        oidcOptions(OidcOptionsProperty(oidcOptions))

    /**
     * The identifier to be used when working with policy rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-policyreferencename)
     * @param policyReferenceName The identifier to be used when working with policy rules. 
     */
    override fun policyReferenceName(policyReferenceName: String) {
      cdkBuilder.policyReferenceName(policyReferenceName)
    }

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    override fun sseSpecification(sseSpecification: SseSpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SseSpecificationProperty::unwrap))
    }

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e96c674ba42238511c7f6afb732a4dbfa0d034067272e0f212d83a6740cf2d04")
    override fun sseSpecification(sseSpecification: SseSpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(SseSpecificationProperty(sseSpecification))

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-tags)
     * @param tags The tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-tags)
     * @param tags The tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of Verified Access trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-trustprovidertype)
     * @param trustProviderType The type of Verified Access trust provider. 
     */
    override fun trustProviderType(trustProviderType: String) {
      cdkBuilder.trustProviderType(trustProviderType)
    }

    /**
     * The type of user-based trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-usertrustprovidertype)
     * @param userTrustProviderType The type of user-based trust provider. 
     */
    override fun userTrustProviderType(userTrustProviderType: String) {
      cdkBuilder.userTrustProviderType(userTrustProviderType)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVerifiedAccessTrustProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVerifiedAccessTrustProvider(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider):
        CfnVerifiedAccessTrustProvider = CfnVerifiedAccessTrustProvider(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessTrustProvider):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider = wrapped.cdkObject
  }

  /**
   * Describes the options for an OpenID Connect-compatible user-identity trust provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * OidcOptionsProperty oidcOptionsProperty = OidcOptionsProperty.builder()
   * .authorizationEndpoint("authorizationEndpoint")
   * .clientId("clientId")
   * .clientSecret("clientSecret")
   * .issuer("issuer")
   * .scope("scope")
   * .tokenEndpoint("tokenEndpoint")
   * .userInfoEndpoint("userInfoEndpoint")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html)
   */
  public interface OidcOptionsProperty {
    /**
     * The OIDC authorization endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-authorizationendpoint)
     */
    public fun authorizationEndpoint(): String? = unwrap(this).getAuthorizationEndpoint()

    /**
     * The client identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-clientid)
     */
    public fun clientId(): String? = unwrap(this).getClientId()

    /**
     * The client secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-clientsecret)
     */
    public fun clientSecret(): String? = unwrap(this).getClientSecret()

    /**
     * The OIDC issuer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-issuer)
     */
    public fun issuer(): String? = unwrap(this).getIssuer()

    /**
     * The OpenID Connect (OIDC) scope specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-scope)
     */
    public fun scope(): String? = unwrap(this).getScope()

    /**
     * The OIDC token endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-tokenendpoint)
     */
    public fun tokenEndpoint(): String? = unwrap(this).getTokenEndpoint()

    /**
     * The OIDC user info endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-userinfoendpoint)
     */
    public fun userInfoEndpoint(): String? = unwrap(this).getUserInfoEndpoint()

    /**
     * A builder for [OidcOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationEndpoint The OIDC authorization endpoint.
       */
      public fun authorizationEndpoint(authorizationEndpoint: String)

      /**
       * @param clientId The client identifier.
       */
      public fun clientId(clientId: String)

      /**
       * @param clientSecret The client secret.
       */
      public fun clientSecret(clientSecret: String)

      /**
       * @param issuer The OIDC issuer.
       */
      public fun issuer(issuer: String)

      /**
       * @param scope The OpenID Connect (OIDC) scope specified.
       */
      public fun scope(scope: String)

      /**
       * @param tokenEndpoint The OIDC token endpoint.
       */
      public fun tokenEndpoint(tokenEndpoint: String)

      /**
       * @param userInfoEndpoint The OIDC user info endpoint.
       */
      public fun userInfoEndpoint(userInfoEndpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty.builder()

      /**
       * @param authorizationEndpoint The OIDC authorization endpoint.
       */
      override fun authorizationEndpoint(authorizationEndpoint: String) {
        cdkBuilder.authorizationEndpoint(authorizationEndpoint)
      }

      /**
       * @param clientId The client identifier.
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param clientSecret The client secret.
       */
      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      /**
       * @param issuer The OIDC issuer.
       */
      override fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
      }

      /**
       * @param scope The OpenID Connect (OIDC) scope specified.
       */
      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      /**
       * @param tokenEndpoint The OIDC token endpoint.
       */
      override fun tokenEndpoint(tokenEndpoint: String) {
        cdkBuilder.tokenEndpoint(tokenEndpoint)
      }

      /**
       * @param userInfoEndpoint The OIDC user info endpoint.
       */
      override fun userInfoEndpoint(userInfoEndpoint: String) {
        cdkBuilder.userInfoEndpoint(userInfoEndpoint)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty,
    ) : CdkObject(cdkObject), OidcOptionsProperty {
      /**
       * The OIDC authorization endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-authorizationendpoint)
       */
      override fun authorizationEndpoint(): String? = unwrap(this).getAuthorizationEndpoint()

      /**
       * The client identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-clientid)
       */
      override fun clientId(): String? = unwrap(this).getClientId()

      /**
       * The client secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-clientsecret)
       */
      override fun clientSecret(): String? = unwrap(this).getClientSecret()

      /**
       * The OIDC issuer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-issuer)
       */
      override fun issuer(): String? = unwrap(this).getIssuer()

      /**
       * The OpenID Connect (OIDC) scope specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-scope)
       */
      override fun scope(): String? = unwrap(this).getScope()

      /**
       * The OIDC token endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-tokenendpoint)
       */
      override fun tokenEndpoint(): String? = unwrap(this).getTokenEndpoint()

      /**
       * The OIDC user info endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-oidcoptions.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions-userinfoendpoint)
       */
      override fun userInfoEndpoint(): String? = unwrap(this).getUserInfoEndpoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OidcOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty):
          OidcOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? OidcOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OidcOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.OidcOptionsProperty
    }
  }

  /**
   * Describes the options for an AWS Verified Access device-identity based trust provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * DeviceOptionsProperty deviceOptionsProperty = DeviceOptionsProperty.builder()
   * .publicSigningKeyUrl("publicSigningKeyUrl")
   * .tenantId("tenantId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-deviceoptions.html)
   */
  public interface DeviceOptionsProperty {
    /**
     * The URL AWS Verified Access will use to verify the authenticity of the device tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-deviceoptions.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions-publicsigningkeyurl)
     */
    public fun publicSigningKeyUrl(): String? = unwrap(this).getPublicSigningKeyUrl()

    /**
     * The ID of the tenant application with the device-identity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-deviceoptions.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions-tenantid)
     */
    public fun tenantId(): String? = unwrap(this).getTenantId()

    /**
     * A builder for [DeviceOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param publicSigningKeyUrl The URL AWS Verified Access will use to verify the authenticity
       * of the device tokens.
       */
      public fun publicSigningKeyUrl(publicSigningKeyUrl: String)

      /**
       * @param tenantId The ID of the tenant application with the device-identity provider.
       */
      public fun tenantId(tenantId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.builder()

      /**
       * @param publicSigningKeyUrl The URL AWS Verified Access will use to verify the authenticity
       * of the device tokens.
       */
      override fun publicSigningKeyUrl(publicSigningKeyUrl: String) {
        cdkBuilder.publicSigningKeyUrl(publicSigningKeyUrl)
      }

      /**
       * @param tenantId The ID of the tenant application with the device-identity provider.
       */
      override fun tenantId(tenantId: String) {
        cdkBuilder.tenantId(tenantId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty,
    ) : CdkObject(cdkObject), DeviceOptionsProperty {
      /**
       * The URL AWS Verified Access will use to verify the authenticity of the device tokens.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-deviceoptions.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions-publicsigningkeyurl)
       */
      override fun publicSigningKeyUrl(): String? = unwrap(this).getPublicSigningKeyUrl()

      /**
       * The ID of the tenant application with the device-identity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-deviceoptions.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions-tenantid)
       */
      override fun tenantId(): String? = unwrap(this).getTenantId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty):
          DeviceOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? DeviceOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.DeviceOptionsProperty
    }
  }

  /**
   * AWS Verified Access provides server side encryption by default to data at rest using AWS -owned
   * KMS keys.
   *
   * You also have the option of using customer managed KMS keys, which can be specified using the
   * options below.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * SseSpecificationProperty sseSpecificationProperty = SseSpecificationProperty.builder()
   * .customerManagedKeyEnabled(false)
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-ssespecification.html)
   */
  public interface SseSpecificationProperty {
    /**
     * Enable or disable the use of customer managed KMS keys for server side encryption.
     *
     * Valid values: `True` | `False`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-ssespecification.html#cfn-ec2-verifiedaccesstrustprovider-ssespecification-customermanagedkeyenabled)
     */
    public fun customerManagedKeyEnabled(): Any? = unwrap(this).getCustomerManagedKeyEnabled()

    /**
     * The ARN of the KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-ssespecification.html#cfn-ec2-verifiedaccesstrustprovider-ssespecification-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A builder for [SseSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
       * server side encryption.
       * Valid values: `True` | `False`
       */
      public fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean)

      /**
       * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
       * server side encryption.
       * Valid values: `True` | `False`
       */
      public fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable)

      /**
       * @param kmsKeyArn The ARN of the KMS key.
       */
      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty.builder()

      /**
       * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
       * server side encryption.
       * Valid values: `True` | `False`
       */
      override fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled)
      }

      /**
       * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
       * server side encryption.
       * Valid values: `True` | `False`
       */
      override fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param kmsKeyArn The ARN of the KMS key.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty,
    ) : CdkObject(cdkObject), SseSpecificationProperty {
      /**
       * Enable or disable the use of customer managed KMS keys for server side encryption.
       *
       * Valid values: `True` | `False`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-ssespecification.html#cfn-ec2-verifiedaccesstrustprovider-ssespecification-customermanagedkeyenabled)
       */
      override fun customerManagedKeyEnabled(): Any? = unwrap(this).getCustomerManagedKeyEnabled()

      /**
       * The ARN of the KMS key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-ssespecification.html#cfn-ec2-verifiedaccesstrustprovider-ssespecification-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty):
          SseSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as? SseSpecificationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider.SseSpecificationProperty
    }
  }
}
