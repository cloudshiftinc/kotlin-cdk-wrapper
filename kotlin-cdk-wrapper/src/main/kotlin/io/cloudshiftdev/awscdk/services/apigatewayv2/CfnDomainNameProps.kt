@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDomainName`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * CfnDomainNameProps cfnDomainNameProps = CfnDomainNameProps.builder()
 * .domainName("domainName")
 * // the properties below are optional
 * .domainNameConfigurations(List.of(DomainNameConfigurationProperty.builder()
 * .certificateArn("certificateArn")
 * .certificateName("certificateName")
 * .endpointType("endpointType")
 * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
 * .securityPolicy("securityPolicy")
 * .build()))
 * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
 * .truststoreUri("truststoreUri")
 * .truststoreVersion("truststoreVersion")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html)
 */
public interface CfnDomainNameProps {
  /**
   * The custom domain name for your API in Amazon API Gateway.
   *
   * Uppercase letters are not supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainname)
   */
  public fun domainName(): String

  /**
   * The domain name configurations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainnameconfigurations)
   */
  public fun domainNameConfigurations(): Any? = unwrap(this).getDomainNameConfigurations()

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-mutualtlsauthentication)
   */
  public fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

  /**
   * The collection of tags associated with a domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnDomainNameProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainName The custom domain name for your API in Amazon API Gateway. 
     * Uppercase letters are not supported.
     */
    public fun domainName(domainName: String)

    /**
     * @param domainNameConfigurations The domain name configurations.
     */
    public fun domainNameConfigurations(domainNameConfigurations: IResolvable)

    /**
     * @param domainNameConfigurations The domain name configurations.
     */
    public fun domainNameConfigurations(domainNameConfigurations: List<Any>)

    /**
     * @param domainNameConfigurations The domain name configurations.
     */
    public fun domainNameConfigurations(vararg domainNameConfigurations: Any)

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name.
     */
    public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable)

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name.
     */
    public
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty)

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9de18601ca103990b55c4ed58b3e33ace137b414a1c7353deead4a8b7c010bc0")
    public
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty.Builder.() -> Unit)

    /**
     * @param tags The collection of tags associated with a domain name.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps.builder()

    /**
     * @param domainName The custom domain name for your API in Amazon API Gateway. 
     * Uppercase letters are not supported.
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param domainNameConfigurations The domain name configurations.
     */
    override fun domainNameConfigurations(domainNameConfigurations: IResolvable) {
      cdkBuilder.domainNameConfigurations(domainNameConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param domainNameConfigurations The domain name configurations.
     */
    override fun domainNameConfigurations(domainNameConfigurations: List<Any>) {
      cdkBuilder.domainNameConfigurations(domainNameConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param domainNameConfigurations The domain name configurations.
     */
    override fun domainNameConfigurations(vararg domainNameConfigurations: Any): Unit =
        domainNameConfigurations(domainNameConfigurations.toList())

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name.
     */
    override fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(IResolvable::unwrap))
    }

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name.
     */
    override
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(CfnDomainName.MutualTlsAuthenticationProperty::unwrap))
    }

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     * domain name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9de18601ca103990b55c4ed58b3e33ace137b414a1c7353deead4a8b7c010bc0")
    override
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty.Builder.() -> Unit):
        Unit =
        mutualTlsAuthentication(CfnDomainName.MutualTlsAuthenticationProperty(mutualTlsAuthentication))

    /**
     * @param tags The collection of tags associated with a domain name.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps,
  ) : CdkObject(cdkObject), CfnDomainNameProps {
    /**
     * The custom domain name for your API in Amazon API Gateway.
     *
     * Uppercase letters are not supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The domain name configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-domainnameconfigurations)
     */
    override fun domainNameConfigurations(): Any? = unwrap(this).getDomainNameConfigurations()

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-mutualtlsauthentication)
     */
    override fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

    /**
     * The collection of tags associated with a domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html#cfn-apigatewayv2-domainname-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps):
        CfnDomainNameProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDomainNameProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameProps):
        software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps
  }
}
