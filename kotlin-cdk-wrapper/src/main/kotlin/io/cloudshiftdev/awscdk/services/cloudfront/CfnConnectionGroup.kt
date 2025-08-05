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
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The connection group for your distribution tenants.
 *
 * When you first create a distribution tenant and you don't specify a connection group, CloudFront
 * will automatically create a default connection group for you. When you create a new distribution
 * tenant and don't specify a connection group, the default one will be associated with your
 * distribution tenant.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.route53.*;
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
 * // Create a connection group and a cname record in an existing hosted zone to validate domain
 * ownership
 * CfnConnectionGroup connectionGroup = CfnConnectionGroup.Builder.create(this,
 * "cf-hosted-connection-group")
 * .enabled(true)
 * .ipv6Enabled(true)
 * .name("my-connection-group")
 * .build();
 * // Import the existing hosted zone info, replacing with your hostedZoneId and zoneName
 * String hostedZoneId = "YOUR_HOSTED_ZONE_ID";
 * String zoneName = "my.domain.com";
 * IHostedZone hostedZone = HostedZone.fromHostedZoneAttributes(this, "hosted-zone",
 * HostedZoneAttributes.builder()
 * .hostedZoneId(hostedZoneId)
 * .zoneName(zoneName)
 * .build());
 * CnameRecord record = CnameRecord.Builder.create(this, "cname-record")
 * .domainName(connectionGroup.getAttrRoutingEndpoint())
 * .zone(hostedZone)
 * .recordName("cf-hosted-tenant.my.domain.com")
 * .build();
 * // Create the cloudfront-hosted tenant, passing in the previously created connection group
 * CfnDistributionTenant cloudfrontHostedTenant = CfnDistributionTenant.Builder.create(this,
 * "cf-hosted-tenant")
 * .distributionId(myMultiTenantDistribution.getDistributionId())
 * .name("cf-hosted-tenant")
 * .domains(List.of("cf-hosted-tenant.my.domain.com"))
 * .connectionGroupId(connectionGroup.getAttrId())
 * .enabled(true)
 * .managedCertificateRequest(ManagedCertificateRequestProperty.builder()
 * .validationTokenHost("cloudfront")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html)
 */
public open class CfnConnectionGroup(
  cdkObject: software.amazon.awscdk.services.cloudfront.CfnConnectionGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectionGroupProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.CfnConnectionGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConnectionGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectionGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConnectionGroupProps(props)
  )

  /**
   * The ID of the Anycast static IP list.
   */
  public open fun anycastIpListId(): String? = unwrap(this).getAnycastIpListId()

  /**
   * The ID of the Anycast static IP list.
   */
  public open fun anycastIpListId(`value`: String) {
    unwrap(this).setAnycastIpListId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the connection group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time when the connection group was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * The current version of the connection group.
   */
  public open fun attrETag(): String = unwrap(this).getAttrETag()

  /**
   * The ID of the connection group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Whether the connection group is the default connection group for the distribution tenants.
   */
  public open fun attrIsDefault(): IResolvable =
      unwrap(this).getAttrIsDefault().let(IResolvable::wrap)

  /**
   * The date and time when the connection group was updated.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * The routing endpoint (also known as the DNS name) that is assigned to the connection group,
   * such as d111111abcdef8.cloudfront.net.
   */
  public open fun attrRoutingEndpoint(): String = unwrap(this).getAttrRoutingEndpoint()

  /**
   * The status of the connection group.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Whether the connection group is enabled.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Whether the connection group is enabled.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Whether the connection group is enabled.
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
   * IPv6 is enabled for the connection group.
   */
  public open fun ipv6Enabled(): Any? = unwrap(this).getIpv6Enabled()

  /**
   * IPv6 is enabled for the connection group.
   */
  public open fun ipv6Enabled(`value`: Boolean) {
    unwrap(this).setIpv6Enabled(`value`)
  }

  /**
   * IPv6 is enabled for the connection group.
   */
  public open fun ipv6Enabled(`value`: IResolvable) {
    unwrap(this).setIpv6Enabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The name of the connection group.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the connection group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnConnectionGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-anycastiplistid)
     * @param anycastIpListId The ID of the Anycast static IP list. 
     */
    public fun anycastIpListId(anycastIpListId: String)

    /**
     * Whether the connection group is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-enabled)
     * @param enabled Whether the connection group is enabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Whether the connection group is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-enabled)
     * @param enabled Whether the connection group is enabled. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * IPv6 is enabled for the connection group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-ipv6enabled)
     * @param ipv6Enabled IPv6 is enabled for the connection group. 
     */
    public fun ipv6Enabled(ipv6Enabled: Boolean)

    /**
     * IPv6 is enabled for the connection group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-ipv6enabled)
     * @param ipv6Enabled IPv6 is enabled for the connection group. 
     */
    public fun ipv6Enabled(ipv6Enabled: IResolvable)

    /**
     * The name of the connection group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-name)
     * @param name The name of the connection group. 
     */
    public fun name(name: String)

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnConnectionGroup.Builder =
        software.amazon.awscdk.services.cloudfront.CfnConnectionGroup.Builder.create(scope, id)

    /**
     * The ID of the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-anycastiplistid)
     * @param anycastIpListId The ID of the Anycast static IP list. 
     */
    override fun anycastIpListId(anycastIpListId: String) {
      cdkBuilder.anycastIpListId(anycastIpListId)
    }

    /**
     * Whether the connection group is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-enabled)
     * @param enabled Whether the connection group is enabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Whether the connection group is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-enabled)
     * @param enabled Whether the connection group is enabled. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * IPv6 is enabled for the connection group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-ipv6enabled)
     * @param ipv6Enabled IPv6 is enabled for the connection group. 
     */
    override fun ipv6Enabled(ipv6Enabled: Boolean) {
      cdkBuilder.ipv6Enabled(ipv6Enabled)
    }

    /**
     * IPv6 is enabled for the connection group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-ipv6enabled)
     * @param ipv6Enabled IPv6 is enabled for the connection group. 
     */
    override fun ipv6Enabled(ipv6Enabled: IResolvable) {
      cdkBuilder.ipv6Enabled(ipv6Enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The name of the connection group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-name)
     * @param name The name of the connection group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnConnectionGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnConnectionGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnectionGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnectionGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnConnectionGroup):
        CfnConnectionGroup = CfnConnectionGroup(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionGroup):
        software.amazon.awscdk.services.cloudfront.CfnConnectionGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnConnectionGroup
  }
}
