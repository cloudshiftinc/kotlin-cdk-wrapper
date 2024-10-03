@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnVerifiedAccessTrustProvider`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVerifiedAccessTrustProviderProps cfnVerifiedAccessTrustProviderProps =
 * CfnVerifiedAccessTrustProviderProps.builder()
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
public interface CfnVerifiedAccessTrustProviderProps {
  /**
   * A description for the AWS Verified Access trust provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The options for device-identity trust provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions)
   */
  public fun deviceOptions(): Any? = unwrap(this).getDeviceOptions()

  /**
   * The type of device-based trust provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-devicetrustprovidertype)
   */
  public fun deviceTrustProviderType(): String? = unwrap(this).getDeviceTrustProviderType()

  /**
   * The options for an OpenID Connect-compatible user-identity trust provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions)
   */
  public fun oidcOptions(): Any? = unwrap(this).getOidcOptions()

  /**
   * The identifier to be used when working with policy rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-policyreferencename)
   */
  public fun policyReferenceName(): String

  /**
   * The options for additional server side encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-ssespecification)
   */
  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * The tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of Verified Access trust provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-trustprovidertype)
   */
  public fun trustProviderType(): String

  /**
   * The type of user-based trust provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-usertrustprovidertype)
   */
  public fun userTrustProviderType(): String? = unwrap(this).getUserTrustProviderType()

  /**
   * A builder for [CfnVerifiedAccessTrustProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the AWS Verified Access trust provider.
     */
    public fun description(description: String)

    /**
     * @param deviceOptions The options for device-identity trust provider.
     */
    public fun deviceOptions(deviceOptions: IResolvable)

    /**
     * @param deviceOptions The options for device-identity trust provider.
     */
    public fun deviceOptions(deviceOptions: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty)

    /**
     * @param deviceOptions The options for device-identity trust provider.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8c43d780c81d3cea6e3e6758e889d0ef1d1f2f21fb74ce3969a567cd54e1b16")
    public
        fun deviceOptions(deviceOptions: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.Builder.() -> Unit)

    /**
     * @param deviceTrustProviderType The type of device-based trust provider.
     */
    public fun deviceTrustProviderType(deviceTrustProviderType: String)

    /**
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     */
    public fun oidcOptions(oidcOptions: IResolvable)

    /**
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     */
    public fun oidcOptions(oidcOptions: CfnVerifiedAccessTrustProvider.OidcOptionsProperty)

    /**
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09b39af35a5a709647d60b4a3a19a76969cff3f4fc90bebda771c8b06e01b4d9")
    public
        fun oidcOptions(oidcOptions: CfnVerifiedAccessTrustProvider.OidcOptionsProperty.Builder.() -> Unit)

    /**
     * @param policyReferenceName The identifier to be used when working with policy rules. 
     */
    public fun policyReferenceName(policyReferenceName: String)

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    public
        fun sseSpecification(sseSpecification: CfnVerifiedAccessTrustProvider.SseSpecificationProperty)

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f98acaa2a315f2bccaf39a204c40bad794ef8678bdd6657916475934dc0094d3")
    public
        fun sseSpecification(sseSpecification: CfnVerifiedAccessTrustProvider.SseSpecificationProperty.Builder.() -> Unit)

    /**
     * @param tags The tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trustProviderType The type of Verified Access trust provider. 
     */
    public fun trustProviderType(trustProviderType: String)

    /**
     * @param userTrustProviderType The type of user-based trust provider.
     */
    public fun userTrustProviderType(userTrustProviderType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps.builder()

    /**
     * @param description A description for the AWS Verified Access trust provider.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param deviceOptions The options for device-identity trust provider.
     */
    override fun deviceOptions(deviceOptions: IResolvable) {
      cdkBuilder.deviceOptions(deviceOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deviceOptions The options for device-identity trust provider.
     */
    override
        fun deviceOptions(deviceOptions: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty) {
      cdkBuilder.deviceOptions(deviceOptions.let(CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.Companion::unwrap))
    }

    /**
     * @param deviceOptions The options for device-identity trust provider.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8c43d780c81d3cea6e3e6758e889d0ef1d1f2f21fb74ce3969a567cd54e1b16")
    override
        fun deviceOptions(deviceOptions: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.Builder.() -> Unit):
        Unit = deviceOptions(CfnVerifiedAccessTrustProvider.DeviceOptionsProperty(deviceOptions))

    /**
     * @param deviceTrustProviderType The type of device-based trust provider.
     */
    override fun deviceTrustProviderType(deviceTrustProviderType: String) {
      cdkBuilder.deviceTrustProviderType(deviceTrustProviderType)
    }

    /**
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     */
    override fun oidcOptions(oidcOptions: IResolvable) {
      cdkBuilder.oidcOptions(oidcOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     */
    override fun oidcOptions(oidcOptions: CfnVerifiedAccessTrustProvider.OidcOptionsProperty) {
      cdkBuilder.oidcOptions(oidcOptions.let(CfnVerifiedAccessTrustProvider.OidcOptionsProperty.Companion::unwrap))
    }

    /**
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09b39af35a5a709647d60b4a3a19a76969cff3f4fc90bebda771c8b06e01b4d9")
    override
        fun oidcOptions(oidcOptions: CfnVerifiedAccessTrustProvider.OidcOptionsProperty.Builder.() -> Unit):
        Unit = oidcOptions(CfnVerifiedAccessTrustProvider.OidcOptionsProperty(oidcOptions))

    /**
     * @param policyReferenceName The identifier to be used when working with policy rules. 
     */
    override fun policyReferenceName(policyReferenceName: String) {
      cdkBuilder.policyReferenceName(policyReferenceName)
    }

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    override
        fun sseSpecification(sseSpecification: CfnVerifiedAccessTrustProvider.SseSpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnVerifiedAccessTrustProvider.SseSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f98acaa2a315f2bccaf39a204c40bad794ef8678bdd6657916475934dc0094d3")
    override
        fun sseSpecification(sseSpecification: CfnVerifiedAccessTrustProvider.SseSpecificationProperty.Builder.() -> Unit):
        Unit =
        sseSpecification(CfnVerifiedAccessTrustProvider.SseSpecificationProperty(sseSpecification))

    /**
     * @param tags The tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trustProviderType The type of Verified Access trust provider. 
     */
    override fun trustProviderType(trustProviderType: String) {
      cdkBuilder.trustProviderType(trustProviderType)
    }

    /**
     * @param userTrustProviderType The type of user-based trust provider.
     */
    override fun userTrustProviderType(userTrustProviderType: String) {
      cdkBuilder.userTrustProviderType(userTrustProviderType)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps,
  ) : CdkObject(cdkObject),
      CfnVerifiedAccessTrustProviderProps {
    /**
     * A description for the AWS Verified Access trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The options for device-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions)
     */
    override fun deviceOptions(): Any? = unwrap(this).getDeviceOptions()

    /**
     * The type of device-based trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-devicetrustprovidertype)
     */
    override fun deviceTrustProviderType(): String? = unwrap(this).getDeviceTrustProviderType()

    /**
     * The options for an OpenID Connect-compatible user-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions)
     */
    override fun oidcOptions(): Any? = unwrap(this).getOidcOptions()

    /**
     * The identifier to be used when working with policy rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-policyreferencename)
     */
    override fun policyReferenceName(): String = unwrap(this).getPolicyReferenceName()

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-ssespecification)
     */
    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of Verified Access trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-trustprovidertype)
     */
    override fun trustProviderType(): String = unwrap(this).getTrustProviderType()

    /**
     * The type of user-based trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-usertrustprovidertype)
     */
    override fun userTrustProviderType(): String? = unwrap(this).getUserTrustProviderType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnVerifiedAccessTrustProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps):
        CfnVerifiedAccessTrustProviderProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnVerifiedAccessTrustProviderProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessTrustProviderProps):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps
  }
}
