@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDistributionTenant`.
 *
 * Example:
 *
 * ```
 * // Create the simple Origin
 * Bucket myBucket = new Bucket(this, "myBucket");
 * IOrigin s3Origin = S3BucketOrigin.withOriginAccessControl(myBucket,
 * S3BucketOriginWithOACProps.builder()
 * .originAccessLevels(List.of(AccessLevel.READ, AccessLevel.LIST))
 * .build());
 * // Create the Distribution construct
 * Distribution myMultiTenantDistribution = Distribution.Builder.create(this,
 * "cf-hosted-distribution")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(s3Origin)
 * .build())
 * .defaultRootObject("index.html")
 * .build();
 * // Access the underlying L1 CfnDistribution to configure SaaS Manager properties which are not
 * yet available in the L2 Distribution construct
 * CfnDistribution cfnDistribution =
 * (CfnDistribution)myMultiTenantDistribution.getNode().getDefaultChild();
 * DefaultCacheBehaviorProperty defaultCacheBehavior = DefaultCacheBehaviorProperty.builder()
 * .targetOriginId(myBucket.getBucketArn())
 * .viewerProtocolPolicy("allow-all")
 * .compress(false)
 * .allowedMethods(List.of("GET", "HEAD"))
 * .cachePolicyId(CachePolicy.CACHING_OPTIMIZED.getCachePolicyId())
 * .build();
 * // Create the updated distributionConfig
 * DistributionConfigProperty distributionConfig = DistributionConfigProperty.builder()
 * .defaultCacheBehavior(defaultCacheBehavior)
 * .enabled(true)
 * // the properties below are optional
 * .connectionMode("tenant-only")
 * .origins(List.of(OriginProperty.builder()
 * .id(myBucket.getBucketArn())
 * .domainName(myBucket.getBucketDomainName())
 * .s3OriginConfig(S3OriginConfigProperty.builder().build())
 * .originPath("/{{tenantName}}")
 * .build()))
 * .tenantConfig(TenantConfigProperty.builder()
 * .parameterDefinitions(List.of(ParameterDefinitionProperty.builder()
 * .definition(DefinitionProperty.builder()
 * .stringSchema(StringSchemaProperty.builder()
 * .required(false)
 * // the properties below are optional
 * .comment("tenantName")
 * .defaultValue("root")
 * .build())
 * .build())
 * .name("tenantName")
 * .build()))
 * .build())
 * .build();
 * // Override the distribution configuration to enable multi-tenancy.
 * cfnDistribution.getDistributionConfig() = distributionConfig;
 * // Create a connection group so we have access to the RoutingEndpoint associated with the tenant
 * we are about to create
 * CfnConnectionGroup connectionGroup = CfnConnectionGroup.Builder.create(this,
 * "self-hosted-connection-group")
 * .enabled(true)
 * .ipv6Enabled(true)
 * .name("self-hosted-connection-group")
 * .build();
 * // Export the RoutingEndpoint, skip this step if you'd prefer to fetch it from the CloudFront
 * console or via Cloudfront.ListConnectionGroups API
 * // Export the RoutingEndpoint, skip this step if you'd prefer to fetch it from the CloudFront
 * console or via Cloudfront.ListConnectionGroups API
 * CfnOutput.Builder.create(this, "RoutingEndpoint")
 * .value(connectionGroup.getAttrRoutingEndpoint())
 * .description("CloudFront Routing Endpoint to be added to my hosted zone CNAME records")
 * .build();
 * // Create a distribution tenant with a self-hosted domain.
 * CfnDistributionTenant selfHostedTenant = CfnDistributionTenant.Builder.create(this,
 * "self-hosted-tenant")
 * .distributionId(myMultiTenantDistribution.getDistributionId())
 * .connectionGroupId(connectionGroup.getAttrId())
 * .name("self-hosted-tenant")
 * .domains(List.of("self-hosted-tenant.my.domain.com"))
 * .enabled(true)
 * .managedCertificateRequest(ManagedCertificateRequestProperty.builder()
 * .primaryDomainName("self-hosted-tenant.my.domain.com")
 * .validationTokenHost("self-hosted")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html)
 */
public interface CfnDistributionTenantProps {
  /**
   * The ID of the connection group for the distribution tenant.
   *
   * If you don't specify a connection group, CloudFront uses the default connection group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-connectiongroupid)
   */
  public fun connectionGroupId(): String? = unwrap(this).getConnectionGroupId()

  /**
   * Customizations for the distribution tenant.
   *
   * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
   * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values that
   * you can override or disable from the multi-tenant distribution that was used to create the
   * distribution tenant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-customizations)
   */
  public fun customizations(): Any? = unwrap(this).getCustomizations()

  /**
   * The ID of the multi-tenant distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-distributionid)
   */
  public fun distributionId(): String

  /**
   * The domains associated with the distribution tenant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-domains)
   */
  public fun domains(): List<String>

  /**
   * Indicates whether the distribution tenant is in an enabled state.
   *
   * If disabled, the distribution tenant won't serve traffic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * An object that represents the request for the Amazon CloudFront managed ACM certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-managedcertificaterequest)
   */
  public fun managedCertificateRequest(): Any? = unwrap(this).getManagedCertificateRequest()

  /**
   * The name of the distribution tenant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-name)
   */
  public fun name(): String

  /**
   * A list of parameter values to add to the resource.
   *
   * A parameter is specified as a key-value pair. A valid parameter value must exist for any
   * parameter that is marked as required in the multi-tenant distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * A complex type that contains zero or more `Tag` elements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDistributionTenantProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionGroupId The ID of the connection group for the distribution tenant.
     * If you don't specify a connection group, CloudFront uses the default connection group.
     */
    public fun connectionGroupId(connectionGroupId: String)

    /**
     * @param customizations Customizations for the distribution tenant.
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     */
    public fun customizations(customizations: IResolvable)

    /**
     * @param customizations Customizations for the distribution tenant.
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     */
    public fun customizations(customizations: CfnDistributionTenant.CustomizationsProperty)

    /**
     * @param customizations Customizations for the distribution tenant.
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3c251b58725cbf60a3c18de182c0518fc99a2a2402029233d2136d20a4e05be")
    public
        fun customizations(customizations: CfnDistributionTenant.CustomizationsProperty.Builder.() -> Unit)

    /**
     * @param distributionId The ID of the multi-tenant distribution. 
     */
    public fun distributionId(distributionId: String)

    /**
     * @param domains The domains associated with the distribution tenant. 
     */
    public fun domains(domains: List<String>)

    /**
     * @param domains The domains associated with the distribution tenant. 
     */
    public fun domains(vararg domains: String)

    /**
     * @param enabled Indicates whether the distribution tenant is in an enabled state.
     * If disabled, the distribution tenant won't serve traffic.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Indicates whether the distribution tenant is in an enabled state.
     * If disabled, the distribution tenant won't serve traffic.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param managedCertificateRequest An object that represents the request for the Amazon
     * CloudFront managed ACM certificate.
     */
    public fun managedCertificateRequest(managedCertificateRequest: IResolvable)

    /**
     * @param managedCertificateRequest An object that represents the request for the Amazon
     * CloudFront managed ACM certificate.
     */
    public
        fun managedCertificateRequest(managedCertificateRequest: CfnDistributionTenant.ManagedCertificateRequestProperty)

    /**
     * @param managedCertificateRequest An object that represents the request for the Amazon
     * CloudFront managed ACM certificate.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d228ec4c3c20adcdb7b29232424359db42a993d591e049e4a830f99ad61a4412")
    public
        fun managedCertificateRequest(managedCertificateRequest: CfnDistributionTenant.ManagedCertificateRequestProperty.Builder.() -> Unit)

    /**
     * @param name The name of the distribution tenant. 
     */
    public fun name(name: String)

    /**
     * @param parameters A list of parameter values to add to the resource.
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters A list of parameter values to add to the resource.
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     */
    public fun parameters(parameters: List<Any>)

    /**
     * @param parameters A list of parameter values to add to the resource.
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     */
    public fun parameters(vararg parameters: Any)

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnDistributionTenantProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnDistributionTenantProps.builder()

    /**
     * @param connectionGroupId The ID of the connection group for the distribution tenant.
     * If you don't specify a connection group, CloudFront uses the default connection group.
     */
    override fun connectionGroupId(connectionGroupId: String) {
      cdkBuilder.connectionGroupId(connectionGroupId)
    }

    /**
     * @param customizations Customizations for the distribution tenant.
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     */
    override fun customizations(customizations: IResolvable) {
      cdkBuilder.customizations(customizations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customizations Customizations for the distribution tenant.
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     */
    override fun customizations(customizations: CfnDistributionTenant.CustomizationsProperty) {
      cdkBuilder.customizations(customizations.let(CfnDistributionTenant.CustomizationsProperty.Companion::unwrap))
    }

    /**
     * @param customizations Customizations for the distribution tenant.
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3c251b58725cbf60a3c18de182c0518fc99a2a2402029233d2136d20a4e05be")
    override
        fun customizations(customizations: CfnDistributionTenant.CustomizationsProperty.Builder.() -> Unit):
        Unit = customizations(CfnDistributionTenant.CustomizationsProperty(customizations))

    /**
     * @param distributionId The ID of the multi-tenant distribution. 
     */
    override fun distributionId(distributionId: String) {
      cdkBuilder.distributionId(distributionId)
    }

    /**
     * @param domains The domains associated with the distribution tenant. 
     */
    override fun domains(domains: List<String>) {
      cdkBuilder.domains(domains)
    }

    /**
     * @param domains The domains associated with the distribution tenant. 
     */
    override fun domains(vararg domains: String): Unit = domains(domains.toList())

    /**
     * @param enabled Indicates whether the distribution tenant is in an enabled state.
     * If disabled, the distribution tenant won't serve traffic.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Indicates whether the distribution tenant is in an enabled state.
     * If disabled, the distribution tenant won't serve traffic.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param managedCertificateRequest An object that represents the request for the Amazon
     * CloudFront managed ACM certificate.
     */
    override fun managedCertificateRequest(managedCertificateRequest: IResolvable) {
      cdkBuilder.managedCertificateRequest(managedCertificateRequest.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param managedCertificateRequest An object that represents the request for the Amazon
     * CloudFront managed ACM certificate.
     */
    override
        fun managedCertificateRequest(managedCertificateRequest: CfnDistributionTenant.ManagedCertificateRequestProperty) {
      cdkBuilder.managedCertificateRequest(managedCertificateRequest.let(CfnDistributionTenant.ManagedCertificateRequestProperty.Companion::unwrap))
    }

    /**
     * @param managedCertificateRequest An object that represents the request for the Amazon
     * CloudFront managed ACM certificate.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d228ec4c3c20adcdb7b29232424359db42a993d591e049e4a830f99ad61a4412")
    override
        fun managedCertificateRequest(managedCertificateRequest: CfnDistributionTenant.ManagedCertificateRequestProperty.Builder.() -> Unit):
        Unit =
        managedCertificateRequest(CfnDistributionTenant.ManagedCertificateRequestProperty(managedCertificateRequest))

    /**
     * @param name The name of the distribution tenant. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parameters A list of parameter values to add to the resource.
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param parameters A list of parameter values to add to the resource.
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     */
    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param parameters A list of parameter values to add to the resource.
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     */
    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistributionTenantProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenantProps,
  ) : CdkObject(cdkObject),
      CfnDistributionTenantProps {
    /**
     * The ID of the connection group for the distribution tenant.
     *
     * If you don't specify a connection group, CloudFront uses the default connection group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-connectiongroupid)
     */
    override fun connectionGroupId(): String? = unwrap(this).getConnectionGroupId()

    /**
     * Customizations for the distribution tenant.
     *
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-customizations)
     */
    override fun customizations(): Any? = unwrap(this).getCustomizations()

    /**
     * The ID of the multi-tenant distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-distributionid)
     */
    override fun distributionId(): String = unwrap(this).getDistributionId()

    /**
     * The domains associated with the distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-domains)
     */
    override fun domains(): List<String> = unwrap(this).getDomains()

    /**
     * Indicates whether the distribution tenant is in an enabled state.
     *
     * If disabled, the distribution tenant won't serve traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * An object that represents the request for the Amazon CloudFront managed ACM certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-managedcertificaterequest)
     */
    override fun managedCertificateRequest(): Any? = unwrap(this).getManagedCertificateRequest()

    /**
     * The name of the distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of parameter values to add to the resource.
     *
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDistributionTenantProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenantProps):
        CfnDistributionTenantProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDistributionTenantProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDistributionTenantProps):
        software.amazon.awscdk.services.cloudfront.CfnDistributionTenantProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnDistributionTenantProps
  }
}
