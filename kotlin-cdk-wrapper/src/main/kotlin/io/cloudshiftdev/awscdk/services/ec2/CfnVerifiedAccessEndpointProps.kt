@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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
 * Properties for defining a `CfnVerifiedAccessEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVerifiedAccessEndpointProps cfnVerifiedAccessEndpointProps =
 * CfnVerifiedAccessEndpointProps.builder()
 * .attachmentType("attachmentType")
 * .endpointType("endpointType")
 * .verifiedAccessGroupId("verifiedAccessGroupId")
 * // the properties below are optional
 * .applicationDomain("applicationDomain")
 * .cidrOptions(CidrOptionsProperty.builder()
 * .cidr("cidr")
 * .portRanges(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .protocol("protocol")
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .description("description")
 * .domainCertificateArn("domainCertificateArn")
 * .endpointDomainPrefix("endpointDomainPrefix")
 * .loadBalancerOptions(LoadBalancerOptionsProperty.builder()
 * .loadBalancerArn("loadBalancerArn")
 * .port(123)
 * .portRanges(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .protocol("protocol")
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .networkInterfaceOptions(NetworkInterfaceOptionsProperty.builder()
 * .networkInterfaceId("networkInterfaceId")
 * .port(123)
 * .portRanges(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .protocol("protocol")
 * .build())
 * .policyDocument("policyDocument")
 * .policyEnabled(false)
 * .rdsOptions(RdsOptionsProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .rdsDbClusterArn("rdsDbClusterArn")
 * .rdsDbInstanceArn("rdsDbInstanceArn")
 * .rdsDbProxyArn("rdsDbProxyArn")
 * .rdsEndpoint("rdsEndpoint")
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .securityGroupIds(List.of("securityGroupIds"))
 * .sseSpecification(SseSpecificationProperty.builder()
 * .customerManagedKeyEnabled(false)
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html)
 */
public interface CfnVerifiedAccessEndpointProps {
  /**
   * The DNS name for users to reach your application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-applicationdomain)
   */
  public fun applicationDomain(): String? = unwrap(this).getApplicationDomain()

  /**
   * The type of attachment used to provide connectivity between the AWS Verified Access endpoint
   * and the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-attachmenttype)
   */
  public fun attachmentType(): String

  /**
   * The options for a CIDR endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-cidroptions)
   */
  public fun cidrOptions(): Any? = unwrap(this).getCidrOptions()

  /**
   * A description for the AWS Verified Access endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ARN of a public TLS/SSL certificate imported into or created with ACM.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-domaincertificatearn)
   */
  public fun domainCertificateArn(): String? = unwrap(this).getDomainCertificateArn()

  /**
   * A custom identifier that is prepended to the DNS name that is generated for the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-endpointdomainprefix)
   */
  public fun endpointDomainPrefix(): String? = unwrap(this).getEndpointDomainPrefix()

  /**
   * The type of AWS Verified Access endpoint.
   *
   * Incoming application requests will be sent to an IP address, load balancer or a network
   * interface depending on the endpoint type specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-endpointtype)
   */
  public fun endpointType(): String

  /**
   * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer` type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions)
   */
  public fun loadBalancerOptions(): Any? = unwrap(this).getLoadBalancerOptions()

  /**
   * The options for network-interface type endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions)
   */
  public fun networkInterfaceOptions(): Any? = unwrap(this).getNetworkInterfaceOptions()

  /**
   * The Verified Access policy document.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policydocument)
   */
  public fun policyDocument(): String? = unwrap(this).getPolicyDocument()

  /**
   * The status of the Verified Access policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policyenabled)
   */
  public fun policyEnabled(): Any? = unwrap(this).getPolicyEnabled()

  /**
   * The options for an RDS endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-rdsoptions)
   */
  public fun rdsOptions(): Any? = unwrap(this).getRdsOptions()

  /**
   * The IDs of the security groups for the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The options for additional server side encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-ssespecification)
   */
  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * The tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the AWS Verified Access group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-verifiedaccessgroupid)
   */
  public fun verifiedAccessGroupId(): String

  /**
   * A builder for [CfnVerifiedAccessEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationDomain The DNS name for users to reach your application.
     */
    public fun applicationDomain(applicationDomain: String)

    /**
     * @param attachmentType The type of attachment used to provide connectivity between the AWS
     * Verified Access endpoint and the application. 
     */
    public fun attachmentType(attachmentType: String)

    /**
     * @param cidrOptions The options for a CIDR endpoint.
     */
    public fun cidrOptions(cidrOptions: IResolvable)

    /**
     * @param cidrOptions The options for a CIDR endpoint.
     */
    public fun cidrOptions(cidrOptions: CfnVerifiedAccessEndpoint.CidrOptionsProperty)

    /**
     * @param cidrOptions The options for a CIDR endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23277a7186b881091549915b510d2f54fa1987fc0c21af57610d4daa699558c4")
    public
        fun cidrOptions(cidrOptions: CfnVerifiedAccessEndpoint.CidrOptionsProperty.Builder.() -> Unit)

    /**
     * @param description A description for the AWS Verified Access endpoint.
     */
    public fun description(description: String)

    /**
     * @param domainCertificateArn The ARN of a public TLS/SSL certificate imported into or created
     * with ACM.
     */
    public fun domainCertificateArn(domainCertificateArn: String)

    /**
     * @param endpointDomainPrefix A custom identifier that is prepended to the DNS name that is
     * generated for the endpoint.
     */
    public fun endpointDomainPrefix(endpointDomainPrefix: String)

    /**
     * @param endpointType The type of AWS Verified Access endpoint. 
     * Incoming application requests will be sent to an IP address, load balancer or a network
     * interface depending on the endpoint type specified.
     */
    public fun endpointType(endpointType: String)

    /**
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     * endpoint as `load-balancer` type.
     */
    public fun loadBalancerOptions(loadBalancerOptions: IResolvable)

    /**
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     * endpoint as `load-balancer` type.
     */
    public
        fun loadBalancerOptions(loadBalancerOptions: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty)

    /**
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     * endpoint as `load-balancer` type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af1a30bc20d68e52b34c415f5bdbfa8a358832ebe36a95a91ba7eb9dc0987f42")
    public
        fun loadBalancerOptions(loadBalancerOptions: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.Builder.() -> Unit)

    /**
     * @param networkInterfaceOptions The options for network-interface type endpoint.
     */
    public fun networkInterfaceOptions(networkInterfaceOptions: IResolvable)

    /**
     * @param networkInterfaceOptions The options for network-interface type endpoint.
     */
    public
        fun networkInterfaceOptions(networkInterfaceOptions: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty)

    /**
     * @param networkInterfaceOptions The options for network-interface type endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bd1675cbf46b3640af6411e4d791fbb5fb9c5f18ca9debf4f0d7007081a7bb9")
    public
        fun networkInterfaceOptions(networkInterfaceOptions: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.Builder.() -> Unit)

    /**
     * @param policyDocument The Verified Access policy document.
     */
    public fun policyDocument(policyDocument: String)

    /**
     * @param policyEnabled The status of the Verified Access policy.
     */
    public fun policyEnabled(policyEnabled: Boolean)

    /**
     * @param policyEnabled The status of the Verified Access policy.
     */
    public fun policyEnabled(policyEnabled: IResolvable)

    /**
     * @param rdsOptions The options for an RDS endpoint.
     */
    public fun rdsOptions(rdsOptions: IResolvable)

    /**
     * @param rdsOptions The options for an RDS endpoint.
     */
    public fun rdsOptions(rdsOptions: CfnVerifiedAccessEndpoint.RdsOptionsProperty)

    /**
     * @param rdsOptions The options for an RDS endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e2e5ea65766a11e967568c62250f2201832e38025f12e0adb8e2bb8f23ebf73")
    public
        fun rdsOptions(rdsOptions: CfnVerifiedAccessEndpoint.RdsOptionsProperty.Builder.() -> Unit)

    /**
     * @param securityGroupIds The IDs of the security groups for the endpoint.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The IDs of the security groups for the endpoint.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    public
        fun sseSpecification(sseSpecification: CfnVerifiedAccessEndpoint.SseSpecificationProperty)

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b96b07141474c138224c05865bfefe8a32246c8605b272d4743dbf4b60797c3d")
    public
        fun sseSpecification(sseSpecification: CfnVerifiedAccessEndpoint.SseSpecificationProperty.Builder.() -> Unit)

    /**
     * @param tags The tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param verifiedAccessGroupId The ID of the AWS Verified Access group. 
     */
    public fun verifiedAccessGroupId(verifiedAccessGroupId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps.builder()

    /**
     * @param applicationDomain The DNS name for users to reach your application.
     */
    override fun applicationDomain(applicationDomain: String) {
      cdkBuilder.applicationDomain(applicationDomain)
    }

    /**
     * @param attachmentType The type of attachment used to provide connectivity between the AWS
     * Verified Access endpoint and the application. 
     */
    override fun attachmentType(attachmentType: String) {
      cdkBuilder.attachmentType(attachmentType)
    }

    /**
     * @param cidrOptions The options for a CIDR endpoint.
     */
    override fun cidrOptions(cidrOptions: IResolvable) {
      cdkBuilder.cidrOptions(cidrOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cidrOptions The options for a CIDR endpoint.
     */
    override fun cidrOptions(cidrOptions: CfnVerifiedAccessEndpoint.CidrOptionsProperty) {
      cdkBuilder.cidrOptions(cidrOptions.let(CfnVerifiedAccessEndpoint.CidrOptionsProperty.Companion::unwrap))
    }

    /**
     * @param cidrOptions The options for a CIDR endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23277a7186b881091549915b510d2f54fa1987fc0c21af57610d4daa699558c4")
    override
        fun cidrOptions(cidrOptions: CfnVerifiedAccessEndpoint.CidrOptionsProperty.Builder.() -> Unit):
        Unit = cidrOptions(CfnVerifiedAccessEndpoint.CidrOptionsProperty(cidrOptions))

    /**
     * @param description A description for the AWS Verified Access endpoint.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainCertificateArn The ARN of a public TLS/SSL certificate imported into or created
     * with ACM.
     */
    override fun domainCertificateArn(domainCertificateArn: String) {
      cdkBuilder.domainCertificateArn(domainCertificateArn)
    }

    /**
     * @param endpointDomainPrefix A custom identifier that is prepended to the DNS name that is
     * generated for the endpoint.
     */
    override fun endpointDomainPrefix(endpointDomainPrefix: String) {
      cdkBuilder.endpointDomainPrefix(endpointDomainPrefix)
    }

    /**
     * @param endpointType The type of AWS Verified Access endpoint. 
     * Incoming application requests will be sent to an IP address, load balancer or a network
     * interface depending on the endpoint type specified.
     */
    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    /**
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     * endpoint as `load-balancer` type.
     */
    override fun loadBalancerOptions(loadBalancerOptions: IResolvable) {
      cdkBuilder.loadBalancerOptions(loadBalancerOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     * endpoint as `load-balancer` type.
     */
    override
        fun loadBalancerOptions(loadBalancerOptions: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty) {
      cdkBuilder.loadBalancerOptions(loadBalancerOptions.let(CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.Companion::unwrap))
    }

    /**
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     * endpoint as `load-balancer` type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af1a30bc20d68e52b34c415f5bdbfa8a358832ebe36a95a91ba7eb9dc0987f42")
    override
        fun loadBalancerOptions(loadBalancerOptions: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.Builder.() -> Unit):
        Unit =
        loadBalancerOptions(CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty(loadBalancerOptions))

    /**
     * @param networkInterfaceOptions The options for network-interface type endpoint.
     */
    override fun networkInterfaceOptions(networkInterfaceOptions: IResolvable) {
      cdkBuilder.networkInterfaceOptions(networkInterfaceOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networkInterfaceOptions The options for network-interface type endpoint.
     */
    override
        fun networkInterfaceOptions(networkInterfaceOptions: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty) {
      cdkBuilder.networkInterfaceOptions(networkInterfaceOptions.let(CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.Companion::unwrap))
    }

    /**
     * @param networkInterfaceOptions The options for network-interface type endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bd1675cbf46b3640af6411e4d791fbb5fb9c5f18ca9debf4f0d7007081a7bb9")
    override
        fun networkInterfaceOptions(networkInterfaceOptions: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.Builder.() -> Unit):
        Unit =
        networkInterfaceOptions(CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty(networkInterfaceOptions))

    /**
     * @param policyDocument The Verified Access policy document.
     */
    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param policyEnabled The status of the Verified Access policy.
     */
    override fun policyEnabled(policyEnabled: Boolean) {
      cdkBuilder.policyEnabled(policyEnabled)
    }

    /**
     * @param policyEnabled The status of the Verified Access policy.
     */
    override fun policyEnabled(policyEnabled: IResolvable) {
      cdkBuilder.policyEnabled(policyEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param rdsOptions The options for an RDS endpoint.
     */
    override fun rdsOptions(rdsOptions: IResolvable) {
      cdkBuilder.rdsOptions(rdsOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param rdsOptions The options for an RDS endpoint.
     */
    override fun rdsOptions(rdsOptions: CfnVerifiedAccessEndpoint.RdsOptionsProperty) {
      cdkBuilder.rdsOptions(rdsOptions.let(CfnVerifiedAccessEndpoint.RdsOptionsProperty.Companion::unwrap))
    }

    /**
     * @param rdsOptions The options for an RDS endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e2e5ea65766a11e967568c62250f2201832e38025f12e0adb8e2bb8f23ebf73")
    override
        fun rdsOptions(rdsOptions: CfnVerifiedAccessEndpoint.RdsOptionsProperty.Builder.() -> Unit):
        Unit = rdsOptions(CfnVerifiedAccessEndpoint.RdsOptionsProperty(rdsOptions))

    /**
     * @param securityGroupIds The IDs of the security groups for the endpoint.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The IDs of the security groups for the endpoint.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

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
        fun sseSpecification(sseSpecification: CfnVerifiedAccessEndpoint.SseSpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnVerifiedAccessEndpoint.SseSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b96b07141474c138224c05865bfefe8a32246c8605b272d4743dbf4b60797c3d")
    override
        fun sseSpecification(sseSpecification: CfnVerifiedAccessEndpoint.SseSpecificationProperty.Builder.() -> Unit):
        Unit =
        sseSpecification(CfnVerifiedAccessEndpoint.SseSpecificationProperty(sseSpecification))

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
     * @param verifiedAccessGroupId The ID of the AWS Verified Access group. 
     */
    override fun verifiedAccessGroupId(verifiedAccessGroupId: String) {
      cdkBuilder.verifiedAccessGroupId(verifiedAccessGroupId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps,
  ) : CdkObject(cdkObject),
      CfnVerifiedAccessEndpointProps {
    /**
     * The DNS name for users to reach your application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-applicationdomain)
     */
    override fun applicationDomain(): String? = unwrap(this).getApplicationDomain()

    /**
     * The type of attachment used to provide connectivity between the AWS Verified Access endpoint
     * and the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-attachmenttype)
     */
    override fun attachmentType(): String = unwrap(this).getAttachmentType()

    /**
     * The options for a CIDR endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-cidroptions)
     */
    override fun cidrOptions(): Any? = unwrap(this).getCidrOptions()

    /**
     * A description for the AWS Verified Access endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ARN of a public TLS/SSL certificate imported into or created with ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-domaincertificatearn)
     */
    override fun domainCertificateArn(): String? = unwrap(this).getDomainCertificateArn()

    /**
     * A custom identifier that is prepended to the DNS name that is generated for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-endpointdomainprefix)
     */
    override fun endpointDomainPrefix(): String? = unwrap(this).getEndpointDomainPrefix()

    /**
     * The type of AWS Verified Access endpoint.
     *
     * Incoming application requests will be sent to an IP address, load balancer or a network
     * interface depending on the endpoint type specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-endpointtype)
     */
    override fun endpointType(): String = unwrap(this).getEndpointType()

    /**
     * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer`
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions)
     */
    override fun loadBalancerOptions(): Any? = unwrap(this).getLoadBalancerOptions()

    /**
     * The options for network-interface type endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions)
     */
    override fun networkInterfaceOptions(): Any? = unwrap(this).getNetworkInterfaceOptions()

    /**
     * The Verified Access policy document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policydocument)
     */
    override fun policyDocument(): String? = unwrap(this).getPolicyDocument()

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policyenabled)
     */
    override fun policyEnabled(): Any? = unwrap(this).getPolicyEnabled()

    /**
     * The options for an RDS endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-rdsoptions)
     */
    override fun rdsOptions(): Any? = unwrap(this).getRdsOptions()

    /**
     * The IDs of the security groups for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-ssespecification)
     */
    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the AWS Verified Access group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-verifiedaccessgroupid)
     */
    override fun verifiedAccessGroupId(): String = unwrap(this).getVerifiedAccessGroupId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVerifiedAccessEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps):
        CfnVerifiedAccessEndpointProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnVerifiedAccessEndpointProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessEndpointProps):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps
  }
}
