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

/**
 * Properties for defining a `CfnConnectionGroup`.
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
public interface CfnConnectionGroupProps {
  /**
   * The ID of the Anycast static IP list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-anycastiplistid)
   */
  public fun anycastIpListId(): String? = unwrap(this).getAnycastIpListId()

  /**
   * Whether the connection group is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * IPv6 is enabled for the connection group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-ipv6enabled)
   */
  public fun ipv6Enabled(): Any? = unwrap(this).getIpv6Enabled()

  /**
   * The name of the connection group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-name)
   */
  public fun name(): String

  /**
   * A complex type that contains zero or more `Tag` elements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnConnectionGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param anycastIpListId The ID of the Anycast static IP list.
     */
    public fun anycastIpListId(anycastIpListId: String)

    /**
     * @param enabled Whether the connection group is enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Whether the connection group is enabled.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param ipv6Enabled IPv6 is enabled for the connection group.
     */
    public fun ipv6Enabled(ipv6Enabled: Boolean)

    /**
     * @param ipv6Enabled IPv6 is enabled for the connection group.
     */
    public fun ipv6Enabled(ipv6Enabled: IResolvable)

    /**
     * @param name The name of the connection group. 
     */
    public fun name(name: String)

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
        software.amazon.awscdk.services.cloudfront.CfnConnectionGroupProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnConnectionGroupProps.builder()

    /**
     * @param anycastIpListId The ID of the Anycast static IP list.
     */
    override fun anycastIpListId(anycastIpListId: String) {
      cdkBuilder.anycastIpListId(anycastIpListId)
    }

    /**
     * @param enabled Whether the connection group is enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Whether the connection group is enabled.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ipv6Enabled IPv6 is enabled for the connection group.
     */
    override fun ipv6Enabled(ipv6Enabled: Boolean) {
      cdkBuilder.ipv6Enabled(ipv6Enabled)
    }

    /**
     * @param ipv6Enabled IPv6 is enabled for the connection group.
     */
    override fun ipv6Enabled(ipv6Enabled: IResolvable) {
      cdkBuilder.ipv6Enabled(ipv6Enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param name The name of the connection group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnConnectionGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.CfnConnectionGroupProps,
  ) : CdkObject(cdkObject),
      CfnConnectionGroupProps {
    /**
     * The ID of the Anycast static IP list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-anycastiplistid)
     */
    override fun anycastIpListId(): String? = unwrap(this).getAnycastIpListId()

    /**
     * Whether the connection group is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * IPv6 is enabled for the connection group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-ipv6enabled)
     */
    override fun ipv6Enabled(): Any? = unwrap(this).getIpv6Enabled()

    /**
     * The name of the connection group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-connectiongroup.html#cfn-cloudfront-connectiongroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectionGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnConnectionGroupProps):
        CfnConnectionGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConnectionGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionGroupProps):
        software.amazon.awscdk.services.cloudfront.CfnConnectionGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnConnectionGroupProps
  }
}
