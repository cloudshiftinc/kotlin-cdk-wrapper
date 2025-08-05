@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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
 * The distribution tenant.
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
public open class CfnDistributionTenant(
  cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDistributionTenantProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.CfnDistributionTenant(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDistributionTenantProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDistributionTenantProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDistributionTenantProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the distribution tenant.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time when the distribution tenant was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   *
   */
  public open fun attrDomainResults(): IResolvable =
      unwrap(this).getAttrDomainResults().let(IResolvable::wrap)

  /**
   * The current version of the distribution tenant.
   */
  public open fun attrETag(): String = unwrap(this).getAttrETag()

  /**
   * The ID of the distribution tenant.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The date and time when the distribution tenant was updated.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * The status of the distribution tenant.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The ID of the connection group for the distribution tenant.
   */
  public open fun connectionGroupId(): String? = unwrap(this).getConnectionGroupId()

  /**
   * The ID of the connection group for the distribution tenant.
   */
  public open fun connectionGroupId(`value`: String) {
    unwrap(this).setConnectionGroupId(`value`)
  }

  /**
   * Customizations for the distribution tenant.
   */
  public open fun customizations(): Any? = unwrap(this).getCustomizations()

  /**
   * Customizations for the distribution tenant.
   */
  public open fun customizations(`value`: IResolvable) {
    unwrap(this).setCustomizations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Customizations for the distribution tenant.
   */
  public open fun customizations(`value`: CustomizationsProperty) {
    unwrap(this).setCustomizations(`value`.let(CustomizationsProperty.Companion::unwrap))
  }

  /**
   * Customizations for the distribution tenant.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a06f4312b1ec2ba51fd483b9a69b4845091e40b0a55d565d6830e24100e9b49")
  public open fun customizations(`value`: CustomizationsProperty.Builder.() -> Unit): Unit =
      customizations(CustomizationsProperty(`value`))

  /**
   * The ID of the multi-tenant distribution.
   */
  public open fun distributionId(): String = unwrap(this).getDistributionId()

  /**
   * The ID of the multi-tenant distribution.
   */
  public open fun distributionId(`value`: String) {
    unwrap(this).setDistributionId(`value`)
  }

  /**
   * The domains associated with the distribution tenant.
   */
  public open fun domains(): List<String> = unwrap(this).getDomains()

  /**
   * The domains associated with the distribution tenant.
   */
  public open fun domains(`value`: List<String>) {
    unwrap(this).setDomains(`value`)
  }

  /**
   * The domains associated with the distribution tenant.
   */
  public open fun domains(vararg `value`: String): Unit = domains(`value`.toList())

  /**
   * Indicates whether the distribution tenant is in an enabled state.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Indicates whether the distribution tenant is in an enabled state.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Indicates whether the distribution tenant is in an enabled state.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * An object that represents the request for the Amazon CloudFront managed ACM certificate.
   */
  public open fun managedCertificateRequest(): Any? = unwrap(this).getManagedCertificateRequest()

  /**
   * An object that represents the request for the Amazon CloudFront managed ACM certificate.
   */
  public open fun managedCertificateRequest(`value`: IResolvable) {
    unwrap(this).setManagedCertificateRequest(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that represents the request for the Amazon CloudFront managed ACM certificate.
   */
  public open fun managedCertificateRequest(`value`: ManagedCertificateRequestProperty) {
    unwrap(this).setManagedCertificateRequest(`value`.let(ManagedCertificateRequestProperty.Companion::unwrap))
  }

  /**
   * An object that represents the request for the Amazon CloudFront managed ACM certificate.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ca2f004e4d702c8997e8702bb8c65c7573264ae3a2ad43fb33d0679bb36157f")
  public open
      fun managedCertificateRequest(`value`: ManagedCertificateRequestProperty.Builder.() -> Unit):
      Unit = managedCertificateRequest(ManagedCertificateRequestProperty(`value`))

  /**
   * The name of the distribution tenant.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the distribution tenant.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of parameter values to add to the resource.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * A list of parameter values to add to the resource.
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of parameter values to add to the resource.
   */
  public open fun parameters(`value`: List<Any>) {
    unwrap(this).setParameters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of parameter values to add to the resource.
   */
  public open fun parameters(vararg `value`: Any): Unit = parameters(`value`.toList())

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnDistributionTenant].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the connection group for the distribution tenant.
     *
     * If you don't specify a connection group, CloudFront uses the default connection group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-connectiongroupid)
     * @param connectionGroupId The ID of the connection group for the distribution tenant. 
     */
    public fun connectionGroupId(connectionGroupId: String)

    /**
     * Customizations for the distribution tenant.
     *
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-customizations)
     * @param customizations Customizations for the distribution tenant. 
     */
    public fun customizations(customizations: IResolvable)

    /**
     * Customizations for the distribution tenant.
     *
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-customizations)
     * @param customizations Customizations for the distribution tenant. 
     */
    public fun customizations(customizations: CustomizationsProperty)

    /**
     * Customizations for the distribution tenant.
     *
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-customizations)
     * @param customizations Customizations for the distribution tenant. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0f79e5fbf12817f3a015e4ac5ee21a06fd08464b827e2d7bc648dfd4c0c906c")
    public fun customizations(customizations: CustomizationsProperty.Builder.() -> Unit)

    /**
     * The ID of the multi-tenant distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-distributionid)
     * @param distributionId The ID of the multi-tenant distribution. 
     */
    public fun distributionId(distributionId: String)

    /**
     * The domains associated with the distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-domains)
     * @param domains The domains associated with the distribution tenant. 
     */
    public fun domains(domains: List<String>)

    /**
     * The domains associated with the distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-domains)
     * @param domains The domains associated with the distribution tenant. 
     */
    public fun domains(vararg domains: String)

    /**
     * Indicates whether the distribution tenant is in an enabled state.
     *
     * If disabled, the distribution tenant won't serve traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-enabled)
     * @param enabled Indicates whether the distribution tenant is in an enabled state. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Indicates whether the distribution tenant is in an enabled state.
     *
     * If disabled, the distribution tenant won't serve traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-enabled)
     * @param enabled Indicates whether the distribution tenant is in an enabled state. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * An object that represents the request for the Amazon CloudFront managed ACM certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-managedcertificaterequest)
     * @param managedCertificateRequest An object that represents the request for the Amazon
     * CloudFront managed ACM certificate. 
     */
    public fun managedCertificateRequest(managedCertificateRequest: IResolvable)

    /**
     * An object that represents the request for the Amazon CloudFront managed ACM certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-managedcertificaterequest)
     * @param managedCertificateRequest An object that represents the request for the Amazon
     * CloudFront managed ACM certificate. 
     */
    public
        fun managedCertificateRequest(managedCertificateRequest: ManagedCertificateRequestProperty)

    /**
     * An object that represents the request for the Amazon CloudFront managed ACM certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-managedcertificaterequest)
     * @param managedCertificateRequest An object that represents the request for the Amazon
     * CloudFront managed ACM certificate. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7a7ececdcf38ceec36abf6118354d94f04d40ef3f8aabd53295d6f934a21660")
    public
        fun managedCertificateRequest(managedCertificateRequest: ManagedCertificateRequestProperty.Builder.() -> Unit)

    /**
     * The name of the distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-name)
     * @param name The name of the distribution tenant. 
     */
    public fun name(name: String)

    /**
     * A list of parameter values to add to the resource.
     *
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-parameters)
     * @param parameters A list of parameter values to add to the resource. 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * A list of parameter values to add to the resource.
     *
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-parameters)
     * @param parameters A list of parameter values to add to the resource. 
     */
    public fun parameters(parameters: List<Any>)

    /**
     * A list of parameter values to add to the resource.
     *
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-parameters)
     * @param parameters A list of parameter values to add to the resource. 
     */
    public fun parameters(vararg parameters: Any)

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.Builder
        = software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.Builder.create(scope, id)

    /**
     * The ID of the connection group for the distribution tenant.
     *
     * If you don't specify a connection group, CloudFront uses the default connection group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-connectiongroupid)
     * @param connectionGroupId The ID of the connection group for the distribution tenant. 
     */
    override fun connectionGroupId(connectionGroupId: String) {
      cdkBuilder.connectionGroupId(connectionGroupId)
    }

    /**
     * Customizations for the distribution tenant.
     *
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-customizations)
     * @param customizations Customizations for the distribution tenant. 
     */
    override fun customizations(customizations: IResolvable) {
      cdkBuilder.customizations(customizations.let(IResolvable.Companion::unwrap))
    }

    /**
     * Customizations for the distribution tenant.
     *
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-customizations)
     * @param customizations Customizations for the distribution tenant. 
     */
    override fun customizations(customizations: CustomizationsProperty) {
      cdkBuilder.customizations(customizations.let(CustomizationsProperty.Companion::unwrap))
    }

    /**
     * Customizations for the distribution tenant.
     *
     * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
     * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values
     * that you can override or disable from the multi-tenant distribution that was used to create the
     * distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-customizations)
     * @param customizations Customizations for the distribution tenant. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0f79e5fbf12817f3a015e4ac5ee21a06fd08464b827e2d7bc648dfd4c0c906c")
    override fun customizations(customizations: CustomizationsProperty.Builder.() -> Unit): Unit =
        customizations(CustomizationsProperty(customizations))

    /**
     * The ID of the multi-tenant distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-distributionid)
     * @param distributionId The ID of the multi-tenant distribution. 
     */
    override fun distributionId(distributionId: String) {
      cdkBuilder.distributionId(distributionId)
    }

    /**
     * The domains associated with the distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-domains)
     * @param domains The domains associated with the distribution tenant. 
     */
    override fun domains(domains: List<String>) {
      cdkBuilder.domains(domains)
    }

    /**
     * The domains associated with the distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-domains)
     * @param domains The domains associated with the distribution tenant. 
     */
    override fun domains(vararg domains: String): Unit = domains(domains.toList())

    /**
     * Indicates whether the distribution tenant is in an enabled state.
     *
     * If disabled, the distribution tenant won't serve traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-enabled)
     * @param enabled Indicates whether the distribution tenant is in an enabled state. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Indicates whether the distribution tenant is in an enabled state.
     *
     * If disabled, the distribution tenant won't serve traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-enabled)
     * @param enabled Indicates whether the distribution tenant is in an enabled state. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that represents the request for the Amazon CloudFront managed ACM certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-managedcertificaterequest)
     * @param managedCertificateRequest An object that represents the request for the Amazon
     * CloudFront managed ACM certificate. 
     */
    override fun managedCertificateRequest(managedCertificateRequest: IResolvable) {
      cdkBuilder.managedCertificateRequest(managedCertificateRequest.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that represents the request for the Amazon CloudFront managed ACM certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-managedcertificaterequest)
     * @param managedCertificateRequest An object that represents the request for the Amazon
     * CloudFront managed ACM certificate. 
     */
    override
        fun managedCertificateRequest(managedCertificateRequest: ManagedCertificateRequestProperty) {
      cdkBuilder.managedCertificateRequest(managedCertificateRequest.let(ManagedCertificateRequestProperty.Companion::unwrap))
    }

    /**
     * An object that represents the request for the Amazon CloudFront managed ACM certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-managedcertificaterequest)
     * @param managedCertificateRequest An object that represents the request for the Amazon
     * CloudFront managed ACM certificate. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7a7ececdcf38ceec36abf6118354d94f04d40ef3f8aabd53295d6f934a21660")
    override
        fun managedCertificateRequest(managedCertificateRequest: ManagedCertificateRequestProperty.Builder.() -> Unit):
        Unit =
        managedCertificateRequest(ManagedCertificateRequestProperty(managedCertificateRequest))

    /**
     * The name of the distribution tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-name)
     * @param name The name of the distribution tenant. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of parameter values to add to the resource.
     *
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-parameters)
     * @param parameters A list of parameter values to add to the resource. 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of parameter values to add to the resource.
     *
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-parameters)
     * @param parameters A list of parameter values to add to the resource. 
     */
    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of parameter values to add to the resource.
     *
     * A parameter is specified as a key-value pair. A valid parameter value must exist for any
     * parameter that is marked as required in the multi-tenant distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-parameters)
     * @param parameters A list of parameter values to add to the resource. 
     */
    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distributiontenant.html#cfn-cloudfront-distributiontenant-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistributionTenant =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDistributionTenant {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDistributionTenant(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant):
        CfnDistributionTenant = CfnDistributionTenant(cdkObject)

    internal fun unwrap(wrapped: CfnDistributionTenant):
        software.amazon.awscdk.services.cloudfront.CfnDistributionTenant = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnDistributionTenant
  }

  /**
   * The AWS Certificate Manager (ACM) certificate associated with your distribution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * CertificateProperty certificateProperty = CertificateProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-certificate.html)
   */
  public interface CertificateProperty {
    /**
     * The Amazon Resource Name (ARN) of the ACM certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-certificate.html#cfn-cloudfront-distributiontenant-certificate-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * A builder for [CertificateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the ACM certificate.
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CertificateProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CertificateProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the ACM certificate.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CertificateProperty,
    ) : CdkObject(cdkObject),
        CertificateProperty {
      /**
       * The Amazon Resource Name (ARN) of the ACM certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-certificate.html#cfn-cloudfront-distributiontenant-certificate-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CertificateProperty):
          CertificateProperty = CdkObjectWrappers.wrap(cdkObject) as? CertificateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CertificateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CertificateProperty
    }
  }

  /**
   * Customizations for the distribution tenant.
   *
   * For each distribution tenant, you can specify the geographic restrictions, and the Amazon
   * Resource Names (ARNs) for the ACM certificate and AWS WAF web ACL. These are specific values that
   * you can override or disable from the multi-tenant distribution that was used to create the
   * distribution tenant.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * CustomizationsProperty customizationsProperty = CustomizationsProperty.builder()
   * .certificate(CertificateProperty.builder()
   * .arn("arn")
   * .build())
   * .geoRestrictions(GeoRestrictionCustomizationProperty.builder()
   * .locations(List.of("locations"))
   * .restrictionType("restrictionType")
   * .build())
   * .webAcl(WebAclCustomizationProperty.builder()
   * .action("action")
   * .arn("arn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-customizations.html)
   */
  public interface CustomizationsProperty {
    /**
     * The AWS Certificate Manager (ACM) certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-customizations.html#cfn-cloudfront-distributiontenant-customizations-certificate)
     */
    public fun certificate(): Any? = unwrap(this).getCertificate()

    /**
     * The geographic restrictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-customizations.html#cfn-cloudfront-distributiontenant-customizations-georestrictions)
     */
    public fun geoRestrictions(): Any? = unwrap(this).getGeoRestrictions()

    /**
     * The AWS WAF web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-customizations.html#cfn-cloudfront-distributiontenant-customizations-webacl)
     */
    public fun webAcl(): Any? = unwrap(this).getWebAcl()

    /**
     * A builder for [CustomizationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificate The AWS Certificate Manager (ACM) certificate.
       */
      public fun certificate(certificate: IResolvable)

      /**
       * @param certificate The AWS Certificate Manager (ACM) certificate.
       */
      public fun certificate(certificate: CertificateProperty)

      /**
       * @param certificate The AWS Certificate Manager (ACM) certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bace4e4d56380b48d18164ebb6e180a42bd9700d0b3bce03e17ba8073b0ebac")
      public fun certificate(certificate: CertificateProperty.Builder.() -> Unit)

      /**
       * @param geoRestrictions The geographic restrictions.
       */
      public fun geoRestrictions(geoRestrictions: IResolvable)

      /**
       * @param geoRestrictions The geographic restrictions.
       */
      public fun geoRestrictions(geoRestrictions: GeoRestrictionCustomizationProperty)

      /**
       * @param geoRestrictions The geographic restrictions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be5b113c163ce41d1badbdc37cb72cff4012054f517d816ba64f3b649c76de5d")
      public
          fun geoRestrictions(geoRestrictions: GeoRestrictionCustomizationProperty.Builder.() -> Unit)

      /**
       * @param webAcl The AWS WAF web ACL.
       */
      public fun webAcl(webAcl: IResolvable)

      /**
       * @param webAcl The AWS WAF web ACL.
       */
      public fun webAcl(webAcl: WebAclCustomizationProperty)

      /**
       * @param webAcl The AWS WAF web ACL.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25ac8df924dc2f2a12e32c9a84ab68aedd1c26ec3b950bbf920876a9af5a3f33")
      public fun webAcl(webAcl: WebAclCustomizationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CustomizationsProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CustomizationsProperty.builder()

      /**
       * @param certificate The AWS Certificate Manager (ACM) certificate.
       */
      override fun certificate(certificate: IResolvable) {
        cdkBuilder.certificate(certificate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param certificate The AWS Certificate Manager (ACM) certificate.
       */
      override fun certificate(certificate: CertificateProperty) {
        cdkBuilder.certificate(certificate.let(CertificateProperty.Companion::unwrap))
      }

      /**
       * @param certificate The AWS Certificate Manager (ACM) certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bace4e4d56380b48d18164ebb6e180a42bd9700d0b3bce03e17ba8073b0ebac")
      override fun certificate(certificate: CertificateProperty.Builder.() -> Unit): Unit =
          certificate(CertificateProperty(certificate))

      /**
       * @param geoRestrictions The geographic restrictions.
       */
      override fun geoRestrictions(geoRestrictions: IResolvable) {
        cdkBuilder.geoRestrictions(geoRestrictions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param geoRestrictions The geographic restrictions.
       */
      override fun geoRestrictions(geoRestrictions: GeoRestrictionCustomizationProperty) {
        cdkBuilder.geoRestrictions(geoRestrictions.let(GeoRestrictionCustomizationProperty.Companion::unwrap))
      }

      /**
       * @param geoRestrictions The geographic restrictions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be5b113c163ce41d1badbdc37cb72cff4012054f517d816ba64f3b649c76de5d")
      override
          fun geoRestrictions(geoRestrictions: GeoRestrictionCustomizationProperty.Builder.() -> Unit):
          Unit = geoRestrictions(GeoRestrictionCustomizationProperty(geoRestrictions))

      /**
       * @param webAcl The AWS WAF web ACL.
       */
      override fun webAcl(webAcl: IResolvable) {
        cdkBuilder.webAcl(webAcl.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param webAcl The AWS WAF web ACL.
       */
      override fun webAcl(webAcl: WebAclCustomizationProperty) {
        cdkBuilder.webAcl(webAcl.let(WebAclCustomizationProperty.Companion::unwrap))
      }

      /**
       * @param webAcl The AWS WAF web ACL.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25ac8df924dc2f2a12e32c9a84ab68aedd1c26ec3b950bbf920876a9af5a3f33")
      override fun webAcl(webAcl: WebAclCustomizationProperty.Builder.() -> Unit): Unit =
          webAcl(WebAclCustomizationProperty(webAcl))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CustomizationsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CustomizationsProperty,
    ) : CdkObject(cdkObject),
        CustomizationsProperty {
      /**
       * The AWS Certificate Manager (ACM) certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-customizations.html#cfn-cloudfront-distributiontenant-customizations-certificate)
       */
      override fun certificate(): Any? = unwrap(this).getCertificate()

      /**
       * The geographic restrictions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-customizations.html#cfn-cloudfront-distributiontenant-customizations-georestrictions)
       */
      override fun geoRestrictions(): Any? = unwrap(this).getGeoRestrictions()

      /**
       * The AWS WAF web ACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-customizations.html#cfn-cloudfront-distributiontenant-customizations-webacl)
       */
      override fun webAcl(): Any? = unwrap(this).getWebAcl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomizationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CustomizationsProperty):
          CustomizationsProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomizationsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomizationsProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CustomizationsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.CustomizationsProperty
    }
  }

  /**
   * The details about the domain result.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * DomainResultProperty domainResultProperty = DomainResultProperty.builder()
   * .domain("domain")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-domainresult.html)
   */
  public interface DomainResultProperty {
    /**
     * The specified domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-domainresult.html#cfn-cloudfront-distributiontenant-domainresult-domain)
     */
    public fun domain(): String? = unwrap(this).getDomain()

    /**
     * Whether the domain is active or inactive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-domainresult.html#cfn-cloudfront-distributiontenant-domainresult-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [DomainResultProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domain The specified domain.
       */
      public fun domain(domain: String)

      /**
       * @param status Whether the domain is active or inactive.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.DomainResultProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.DomainResultProperty.builder()

      /**
       * @param domain The specified domain.
       */
      override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      /**
       * @param status Whether the domain is active or inactive.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.DomainResultProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.DomainResultProperty,
    ) : CdkObject(cdkObject),
        DomainResultProperty {
      /**
       * The specified domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-domainresult.html#cfn-cloudfront-distributiontenant-domainresult-domain)
       */
      override fun domain(): String? = unwrap(this).getDomain()

      /**
       * Whether the domain is active or inactive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-domainresult.html#cfn-cloudfront-distributiontenant-domainresult-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainResultProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.DomainResultProperty):
          DomainResultProperty = CdkObjectWrappers.wrap(cdkObject) as? DomainResultProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainResultProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.DomainResultProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.DomainResultProperty
    }
  }

  /**
   * The customizations that you specified for the distribution tenant for geographic restrictions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * GeoRestrictionCustomizationProperty geoRestrictionCustomizationProperty =
   * GeoRestrictionCustomizationProperty.builder()
   * .locations(List.of("locations"))
   * .restrictionType("restrictionType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-georestrictioncustomization.html)
   */
  public interface GeoRestrictionCustomizationProperty {
    /**
     * The locations for geographic restrictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-georestrictioncustomization.html#cfn-cloudfront-distributiontenant-georestrictioncustomization-locations)
     */
    public fun locations(): List<String> = unwrap(this).getLocations() ?: emptyList()

    /**
     * The method that you want to use to restrict distribution of your content by country:.
     *
     * * `none` : No geographic restriction is enabled, meaning access to content is not restricted
     * by client geo location.
     * * `blacklist` : The `Location` elements specify the countries in which you don't want
     * CloudFront to distribute your content.
     * * `whitelist` : The `Location` elements specify the countries in which you want CloudFront to
     * distribute your content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-georestrictioncustomization.html#cfn-cloudfront-distributiontenant-georestrictioncustomization-restrictiontype)
     */
    public fun restrictionType(): String? = unwrap(this).getRestrictionType()

    /**
     * A builder for [GeoRestrictionCustomizationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param locations The locations for geographic restrictions.
       */
      public fun locations(locations: List<String>)

      /**
       * @param locations The locations for geographic restrictions.
       */
      public fun locations(vararg locations: String)

      /**
       * @param restrictionType The method that you want to use to restrict distribution of your
       * content by country:.
       * * `none` : No geographic restriction is enabled, meaning access to content is not
       * restricted by client geo location.
       * * `blacklist` : The `Location` elements specify the countries in which you don't want
       * CloudFront to distribute your content.
       * * `whitelist` : The `Location` elements specify the countries in which you want CloudFront
       * to distribute your content.
       */
      public fun restrictionType(restrictionType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.GeoRestrictionCustomizationProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.GeoRestrictionCustomizationProperty.builder()

      /**
       * @param locations The locations for geographic restrictions.
       */
      override fun locations(locations: List<String>) {
        cdkBuilder.locations(locations)
      }

      /**
       * @param locations The locations for geographic restrictions.
       */
      override fun locations(vararg locations: String): Unit = locations(locations.toList())

      /**
       * @param restrictionType The method that you want to use to restrict distribution of your
       * content by country:.
       * * `none` : No geographic restriction is enabled, meaning access to content is not
       * restricted by client geo location.
       * * `blacklist` : The `Location` elements specify the countries in which you don't want
       * CloudFront to distribute your content.
       * * `whitelist` : The `Location` elements specify the countries in which you want CloudFront
       * to distribute your content.
       */
      override fun restrictionType(restrictionType: String) {
        cdkBuilder.restrictionType(restrictionType)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.GeoRestrictionCustomizationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.GeoRestrictionCustomizationProperty,
    ) : CdkObject(cdkObject),
        GeoRestrictionCustomizationProperty {
      /**
       * The locations for geographic restrictions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-georestrictioncustomization.html#cfn-cloudfront-distributiontenant-georestrictioncustomization-locations)
       */
      override fun locations(): List<String> = unwrap(this).getLocations() ?: emptyList()

      /**
       * The method that you want to use to restrict distribution of your content by country:.
       *
       * * `none` : No geographic restriction is enabled, meaning access to content is not
       * restricted by client geo location.
       * * `blacklist` : The `Location` elements specify the countries in which you don't want
       * CloudFront to distribute your content.
       * * `whitelist` : The `Location` elements specify the countries in which you want CloudFront
       * to distribute your content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-georestrictioncustomization.html#cfn-cloudfront-distributiontenant-georestrictioncustomization-restrictiontype)
       */
      override fun restrictionType(): String? = unwrap(this).getRestrictionType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GeoRestrictionCustomizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.GeoRestrictionCustomizationProperty):
          GeoRestrictionCustomizationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GeoRestrictionCustomizationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoRestrictionCustomizationProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.GeoRestrictionCustomizationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.GeoRestrictionCustomizationProperty
    }
  }

  /**
   * An object that represents the request for the Amazon CloudFront managed ACM certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * ManagedCertificateRequestProperty managedCertificateRequestProperty =
   * ManagedCertificateRequestProperty.builder()
   * .certificateTransparencyLoggingPreference("certificateTransparencyLoggingPreference")
   * .primaryDomainName("primaryDomainName")
   * .validationTokenHost("validationTokenHost")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-managedcertificaterequest.html)
   */
  public interface ManagedCertificateRequestProperty {
    /**
     * You can opt out of certificate transparency logging by specifying the `disabled` option.
     *
     * Opt in by specifying `enabled` . For more information, see [Certificate Transparency
     * Logging](https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency)
     * in the *AWS Certificate Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-managedcertificaterequest.html#cfn-cloudfront-distributiontenant-managedcertificaterequest-certificatetransparencyloggingpreference)
     */
    public fun certificateTransparencyLoggingPreference(): String? =
        unwrap(this).getCertificateTransparencyLoggingPreference()

    /**
     * The primary domain name associated with the CloudFront managed ACM certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-managedcertificaterequest.html#cfn-cloudfront-distributiontenant-managedcertificaterequest-primarydomainname)
     */
    public fun primaryDomainName(): String? = unwrap(this).getPrimaryDomainName()

    /**
     * Specify how the HTTP validation token will be served when requesting the CloudFront managed
     * ACM certificate.
     *
     * * For `cloudfront` , CloudFront will automatically serve the validation token. Choose this
     * mode if you can point the domain's DNS to CloudFront immediately.
     * * For `self-hosted` , you serve the validation token from your existing infrastructure.
     * Choose this mode when you need to maintain current traffic flow while your certificate is being
     * issued. You can place the validation token at the well-known path on your existing web server,
     * wait for ACM to validate and issue the certificate, and then update your DNS to point to
     * CloudFront.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-managedcertificaterequest.html#cfn-cloudfront-distributiontenant-managedcertificaterequest-validationtokenhost)
     */
    public fun validationTokenHost(): String? = unwrap(this).getValidationTokenHost()

    /**
     * A builder for [ManagedCertificateRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateTransparencyLoggingPreference You can opt out of certificate transparency
       * logging by specifying the `disabled` option.
       * Opt in by specifying `enabled` . For more information, see [Certificate Transparency
       * Logging](https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency)
       * in the *AWS Certificate Manager User Guide* .
       */
      public
          fun certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference: String)

      /**
       * @param primaryDomainName The primary domain name associated with the CloudFront managed ACM
       * certificate.
       */
      public fun primaryDomainName(primaryDomainName: String)

      /**
       * @param validationTokenHost Specify how the HTTP validation token will be served when
       * requesting the CloudFront managed ACM certificate.
       * * For `cloudfront` , CloudFront will automatically serve the validation token. Choose this
       * mode if you can point the domain's DNS to CloudFront immediately.
       * * For `self-hosted` , you serve the validation token from your existing infrastructure.
       * Choose this mode when you need to maintain current traffic flow while your certificate is
       * being issued. You can place the validation token at the well-known path on your existing web
       * server, wait for ACM to validate and issue the certificate, and then update your DNS to point
       * to CloudFront.
       */
      public fun validationTokenHost(validationTokenHost: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ManagedCertificateRequestProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ManagedCertificateRequestProperty.builder()

      /**
       * @param certificateTransparencyLoggingPreference You can opt out of certificate transparency
       * logging by specifying the `disabled` option.
       * Opt in by specifying `enabled` . For more information, see [Certificate Transparency
       * Logging](https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency)
       * in the *AWS Certificate Manager User Guide* .
       */
      override
          fun certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference: String) {
        cdkBuilder.certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference)
      }

      /**
       * @param primaryDomainName The primary domain name associated with the CloudFront managed ACM
       * certificate.
       */
      override fun primaryDomainName(primaryDomainName: String) {
        cdkBuilder.primaryDomainName(primaryDomainName)
      }

      /**
       * @param validationTokenHost Specify how the HTTP validation token will be served when
       * requesting the CloudFront managed ACM certificate.
       * * For `cloudfront` , CloudFront will automatically serve the validation token. Choose this
       * mode if you can point the domain's DNS to CloudFront immediately.
       * * For `self-hosted` , you serve the validation token from your existing infrastructure.
       * Choose this mode when you need to maintain current traffic flow while your certificate is
       * being issued. You can place the validation token at the well-known path on your existing web
       * server, wait for ACM to validate and issue the certificate, and then update your DNS to point
       * to CloudFront.
       */
      override fun validationTokenHost(validationTokenHost: String) {
        cdkBuilder.validationTokenHost(validationTokenHost)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ManagedCertificateRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ManagedCertificateRequestProperty,
    ) : CdkObject(cdkObject),
        ManagedCertificateRequestProperty {
      /**
       * You can opt out of certificate transparency logging by specifying the `disabled` option.
       *
       * Opt in by specifying `enabled` . For more information, see [Certificate Transparency
       * Logging](https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency)
       * in the *AWS Certificate Manager User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-managedcertificaterequest.html#cfn-cloudfront-distributiontenant-managedcertificaterequest-certificatetransparencyloggingpreference)
       */
      override fun certificateTransparencyLoggingPreference(): String? =
          unwrap(this).getCertificateTransparencyLoggingPreference()

      /**
       * The primary domain name associated with the CloudFront managed ACM certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-managedcertificaterequest.html#cfn-cloudfront-distributiontenant-managedcertificaterequest-primarydomainname)
       */
      override fun primaryDomainName(): String? = unwrap(this).getPrimaryDomainName()

      /**
       * Specify how the HTTP validation token will be served when requesting the CloudFront managed
       * ACM certificate.
       *
       * * For `cloudfront` , CloudFront will automatically serve the validation token. Choose this
       * mode if you can point the domain's DNS to CloudFront immediately.
       * * For `self-hosted` , you serve the validation token from your existing infrastructure.
       * Choose this mode when you need to maintain current traffic flow while your certificate is
       * being issued. You can place the validation token at the well-known path on your existing web
       * server, wait for ACM to validate and issue the certificate, and then update your DNS to point
       * to CloudFront.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-managedcertificaterequest.html#cfn-cloudfront-distributiontenant-managedcertificaterequest-validationtokenhost)
       */
      override fun validationTokenHost(): String? = unwrap(this).getValidationTokenHost()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ManagedCertificateRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ManagedCertificateRequestProperty):
          ManagedCertificateRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ManagedCertificateRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedCertificateRequestProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ManagedCertificateRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ManagedCertificateRequestProperty
    }
  }

  /**
   * A list of parameter values to add to the resource.
   *
   * A parameter is specified as a key-value pair. A valid parameter value must exist for any
   * parameter that is marked as required in the multi-tenant distribution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * ParameterProperty parameterProperty = ParameterProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-parameter.html)
   */
  public interface ParameterProperty {
    /**
     * The parameter name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-parameter.html#cfn-cloudfront-distributiontenant-parameter-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The parameter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-parameter.html#cfn-cloudfront-distributiontenant-parameter-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The parameter name.
       */
      public fun name(name: String)

      /**
       * @param value The parameter value.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ParameterProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ParameterProperty.builder()

      /**
       * @param name The parameter name.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The parameter value.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ParameterProperty,
    ) : CdkObject(cdkObject),
        ParameterProperty {
      /**
       * The parameter name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-parameter.html#cfn-cloudfront-distributiontenant-parameter-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The parameter value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-parameter.html#cfn-cloudfront-distributiontenant-parameter-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ParameterProperty):
          ParameterProperty = CdkObjectWrappers.wrap(cdkObject) as? ParameterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.ParameterProperty
    }
  }

  /**
   * The AWS WAF web ACL customization specified for the distribution tenant.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * WebAclCustomizationProperty webAclCustomizationProperty = WebAclCustomizationProperty.builder()
   * .action("action")
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-webaclcustomization.html)
   */
  public interface WebAclCustomizationProperty {
    /**
     * The action for the AWS WAF web ACL customization.
     *
     * You can specify `override` to specify a separate AWS WAF web ACL for the distribution tenant.
     * If you specify `disable` , the distribution tenant won't have AWS WAF web ACL protections and
     * won't inherit from the multi-tenant distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-webaclcustomization.html#cfn-cloudfront-distributiontenant-webaclcustomization-action)
     */
    public fun action(): String? = unwrap(this).getAction()

    /**
     * The Amazon Resource Name (ARN) of the AWS WAF web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-webaclcustomization.html#cfn-cloudfront-distributiontenant-webaclcustomization-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * A builder for [WebAclCustomizationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action for the AWS WAF web ACL customization.
       * You can specify `override` to specify a separate AWS WAF web ACL for the distribution
       * tenant. If you specify `disable` , the distribution tenant won't have AWS WAF web ACL
       * protections and won't inherit from the multi-tenant distribution.
       */
      public fun action(action: String)

      /**
       * @param arn The Amazon Resource Name (ARN) of the AWS WAF web ACL.
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.WebAclCustomizationProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.WebAclCustomizationProperty.builder()

      /**
       * @param action The action for the AWS WAF web ACL customization.
       * You can specify `override` to specify a separate AWS WAF web ACL for the distribution
       * tenant. If you specify `disable` , the distribution tenant won't have AWS WAF web ACL
       * protections and won't inherit from the multi-tenant distribution.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param arn The Amazon Resource Name (ARN) of the AWS WAF web ACL.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.WebAclCustomizationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.WebAclCustomizationProperty,
    ) : CdkObject(cdkObject),
        WebAclCustomizationProperty {
      /**
       * The action for the AWS WAF web ACL customization.
       *
       * You can specify `override` to specify a separate AWS WAF web ACL for the distribution
       * tenant. If you specify `disable` , the distribution tenant won't have AWS WAF web ACL
       * protections and won't inherit from the multi-tenant distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-webaclcustomization.html#cfn-cloudfront-distributiontenant-webaclcustomization-action)
       */
      override fun action(): String? = unwrap(this).getAction()

      /**
       * The Amazon Resource Name (ARN) of the AWS WAF web ACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distributiontenant-webaclcustomization.html#cfn-cloudfront-distributiontenant-webaclcustomization-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebAclCustomizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.WebAclCustomizationProperty):
          WebAclCustomizationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WebAclCustomizationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebAclCustomizationProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.WebAclCustomizationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistributionTenant.WebAclCustomizationProperty
    }
  }
}
