@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

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
 * Properties for defining a `CfnDomainNameV2`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * Object policy;
 * CfnDomainNameV2Props cfnDomainNameV2Props = CfnDomainNameV2Props.builder()
 * .certificateArn("certificateArn")
 * .domainName("domainName")
 * .endpointConfiguration(EndpointConfigurationProperty.builder()
 * .ipAddressType("ipAddressType")
 * .types(List.of("types"))
 * .build())
 * .policy(policy)
 * .routingMode("routingMode")
 * .securityPolicy("securityPolicy")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html)
 */
public interface CfnDomainNameV2Props {
  /**
   * The reference to an AWS -managed certificate that will be used by the private endpoint for this
   * domain name.
   *
   * AWS Certificate Manager is the only supported source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-certificatearn)
   */
  public fun certificateArn(): String? = unwrap(this).getCertificateArn()

  /**
   * Represents a custom domain name as a user-friendly host name of an API (RestApi).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-domainname)
   */
  public fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
   * domain name (DomainName) has and the IP address types that can invoke it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-endpointconfiguration)
   */
  public fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  /**
   * A stringified JSON policy document that applies to the `execute-api` service for this
   * DomainName regardless of the caller and Method configuration.
   *
   * You can use `Fn::ToJsonString` to enter your `policy` . For more information, see
   * [Fn::ToJsonString](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ToJsonString.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-policy)
   */
  public fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * The routing mode for this domain name.
   *
   * The routing mode determines how API Gateway sends traffic from your custom domain name to your
   * private APIs.
   *
   * Default: - "BASE_PATH_MAPPING_ONLY"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-routingmode)
   */
  public fun routingMode(): String? = unwrap(this).getRoutingMode()

  /**
   * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
   *
   * Only `TLS_1_2` is supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-securitypolicy)
   */
  public fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDomainNameV2Props]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateArn The reference to an AWS -managed certificate that will be used by the
     * private endpoint for this domain name.
     * AWS Certificate Manager is the only supported source.
     */
    public fun certificateArn(certificateArn: String)

    /**
     * @param domainName Represents a custom domain name as a user-friendly host name of an API
     * (RestApi).
     */
    public fun domainName(domainName: String)

    /**
     * @param endpointConfiguration The endpoint configuration to indicate the types of endpoints an
     * API (RestApi) or its custom domain name (DomainName) has and the IP address types that can
     * invoke it.
     */
    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    /**
     * @param endpointConfiguration The endpoint configuration to indicate the types of endpoints an
     * API (RestApi) or its custom domain name (DomainName) has and the IP address types that can
     * invoke it.
     */
    public
        fun endpointConfiguration(endpointConfiguration: CfnDomainNameV2.EndpointConfigurationProperty)

    /**
     * @param endpointConfiguration The endpoint configuration to indicate the types of endpoints an
     * API (RestApi) or its custom domain name (DomainName) has and the IP address types that can
     * invoke it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49a70fda523db86322b4e8c0d3543885b9701b04659d860766b5fc0788e423cb")
    public
        fun endpointConfiguration(endpointConfiguration: CfnDomainNameV2.EndpointConfigurationProperty.Builder.() -> Unit)

    /**
     * @param policy A stringified JSON policy document that applies to the `execute-api` service
     * for this DomainName regardless of the caller and Method configuration.
     * You can use `Fn::ToJsonString` to enter your `policy` . For more information, see
     * [Fn::ToJsonString](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ToJsonString.html)
     * .
     */
    public fun policy(policy: Any)

    /**
     * @param routingMode The routing mode for this domain name.
     * The routing mode determines how API Gateway sends traffic from your custom domain name to
     * your private APIs.
     */
    public fun routingMode(routingMode: String)

    /**
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * DomainName.
     * Only `TLS_1_2` is supported.
     */
    public fun securityPolicy(securityPolicy: String)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnDomainNameV2Props.Builder
        = software.amazon.awscdk.services.apigateway.CfnDomainNameV2Props.builder()

    /**
     * @param certificateArn The reference to an AWS -managed certificate that will be used by the
     * private endpoint for this domain name.
     * AWS Certificate Manager is the only supported source.
     */
    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * @param domainName Represents a custom domain name as a user-friendly host name of an API
     * (RestApi).
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param endpointConfiguration The endpoint configuration to indicate the types of endpoints an
     * API (RestApi) or its custom domain name (DomainName) has and the IP address types that can
     * invoke it.
     */
    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param endpointConfiguration The endpoint configuration to indicate the types of endpoints an
     * API (RestApi) or its custom domain name (DomainName) has and the IP address types that can
     * invoke it.
     */
    override
        fun endpointConfiguration(endpointConfiguration: CfnDomainNameV2.EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(CfnDomainNameV2.EndpointConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param endpointConfiguration The endpoint configuration to indicate the types of endpoints an
     * API (RestApi) or its custom domain name (DomainName) has and the IP address types that can
     * invoke it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49a70fda523db86322b4e8c0d3543885b9701b04659d860766b5fc0788e423cb")
    override
        fun endpointConfiguration(endpointConfiguration: CfnDomainNameV2.EndpointConfigurationProperty.Builder.() -> Unit):
        Unit =
        endpointConfiguration(CfnDomainNameV2.EndpointConfigurationProperty(endpointConfiguration))

    /**
     * @param policy A stringified JSON policy document that applies to the `execute-api` service
     * for this DomainName regardless of the caller and Method configuration.
     * You can use `Fn::ToJsonString` to enter your `policy` . For more information, see
     * [Fn::ToJsonString](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ToJsonString.html)
     * .
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param routingMode The routing mode for this domain name.
     * The routing mode determines how API Gateway sends traffic from your custom domain name to
     * your private APIs.
     */
    override fun routingMode(routingMode: String) {
      cdkBuilder.routingMode(routingMode)
    }

    /**
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * DomainName.
     * Only `TLS_1_2` is supported.
     */
    override fun securityPolicy(securityPolicy: String) {
      cdkBuilder.securityPolicy(securityPolicy)
    }

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDomainNameV2Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameV2Props,
  ) : CdkObject(cdkObject),
      CfnDomainNameV2Props {
    /**
     * The reference to an AWS -managed certificate that will be used by the private endpoint for
     * this domain name.
     *
     * AWS Certificate Manager is the only supported source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-certificatearn)
     */
    override fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * Represents a custom domain name as a user-friendly host name of an API (RestApi).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-domainname)
     */
    override fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
     * domain name (DomainName) has and the IP address types that can invoke it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-endpointconfiguration)
     */
    override fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

    /**
     * A stringified JSON policy document that applies to the `execute-api` service for this
     * DomainName regardless of the caller and Method configuration.
     *
     * You can use `Fn::ToJsonString` to enter your `policy` . For more information, see
     * [Fn::ToJsonString](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ToJsonString.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-policy)
     */
    override fun policy(): Any? = unwrap(this).getPolicy()

    /**
     * The routing mode for this domain name.
     *
     * The routing mode determines how API Gateway sends traffic from your custom domain name to
     * your private APIs.
     *
     * Default: - "BASE_PATH_MAPPING_ONLY"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-routingmode)
     */
    override fun routingMode(): String? = unwrap(this).getRoutingMode()

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
     *
     * Only `TLS_1_2` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-securitypolicy)
     */
    override fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainNameV2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameV2Props):
        CfnDomainNameV2Props = CdkObjectWrappers.wrap(cdkObject) as? CfnDomainNameV2Props ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameV2Props):
        software.amazon.awscdk.services.apigateway.CfnDomainNameV2Props = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnDomainNameV2Props
  }
}
