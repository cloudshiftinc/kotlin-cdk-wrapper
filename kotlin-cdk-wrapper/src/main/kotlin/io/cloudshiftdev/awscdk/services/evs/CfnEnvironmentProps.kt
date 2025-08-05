@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.evs

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
 * Properties for defining a `CfnEnvironment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.evs.*;
 * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
 * .connectivityInfo(ConnectivityInfoProperty.builder()
 * .privateRouteServerPeerings(List.of("privateRouteServerPeerings"))
 * .build())
 * .licenseInfo(LicenseInfoProperty.builder()
 * .solutionKey("solutionKey")
 * .vsanKey("vsanKey")
 * .build())
 * .serviceAccessSubnetId("serviceAccessSubnetId")
 * .siteId("siteId")
 * .termsAccepted(false)
 * .vcfHostnames(VcfHostnamesProperty.builder()
 * .cloudBuilder("cloudBuilder")
 * .nsx("nsx")
 * .nsxEdge1("nsxEdge1")
 * .nsxEdge2("nsxEdge2")
 * .nsxManager1("nsxManager1")
 * .nsxManager2("nsxManager2")
 * .nsxManager3("nsxManager3")
 * .sddcManager("sddcManager")
 * .vCenter("vCenter")
 * .build())
 * .vcfVersion("vcfVersion")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .environmentName("environmentName")
 * .hosts(List.of(HostInfoForCreateProperty.builder()
 * .hostName("hostName")
 * .instanceType("instanceType")
 * .keyName("keyName")
 * // the properties below are optional
 * .dedicatedHostId("dedicatedHostId")
 * .placementGroupId("placementGroupId")
 * .build()))
 * .initialVlans(InitialVlansProperty.builder()
 * .edgeVTep(InitialVlanInfoProperty.builder()
 * .cidr("cidr")
 * .build())
 * .expansionVlan1(InitialVlanInfoProperty.builder()
 * .cidr("cidr")
 * .build())
 * .expansionVlan2(InitialVlanInfoProperty.builder()
 * .cidr("cidr")
 * .build())
 * .hcx(InitialVlanInfoProperty.builder()
 * .cidr("cidr")
 * .build())
 * .nsxUpLink(InitialVlanInfoProperty.builder()
 * .cidr("cidr")
 * .build())
 * .vmkManagement(InitialVlanInfoProperty.builder()
 * .cidr("cidr")
 * .build())
 * .vmManagement(InitialVlanInfoProperty.builder()
 * .cidr("cidr")
 * .build())
 * .vMotion(InitialVlanInfoProperty.builder()
 * .cidr("cidr")
 * .build())
 * .vSan(InitialVlanInfoProperty.builder()
 * .cidr("cidr")
 * .build())
 * .vTep(InitialVlanInfoProperty.builder()
 * .cidr("cidr")
 * .build())
 * .build())
 * .kmsKeyId("kmsKeyId")
 * .serviceAccessSecurityGroups(ServiceAccessSecurityGroupsProperty.builder()
 * .securityGroups(List.of("securityGroups"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html)
 */
public interface CfnEnvironmentProps {
  /**
   * The connectivity configuration for the environment.
   *
   * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
   * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
   * network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-connectivityinfo)
   */
  public fun connectivityInfo(): Any

  /**
   * The name of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-environmentname)
   */
  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  /**
   * Required for environment resource creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-hosts)
   */
  public fun hosts(): Any? = unwrap(this).getHosts()

  /**
   * Amazon EVS is in public preview release and is subject to change.
   *
   * The initial VLAN subnets for the environment. Amazon EVS VLAN subnets have a minimum CIDR block
   * size of /28 and a maximum size of /24. Amazon EVS VLAN subnet CIDR blocks must not overlap with
   * other subnets in the VPC.
   *
   * Required for environment resource creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-initialvlans)
   */
  public fun initialVlans(): Any? = unwrap(this).getInitialVlans()

  /**
   * The AWS KMS key ID that AWS Secrets Manager uses to encrypt secrets that are associated with
   * the environment.
   *
   * These secrets contain the VCF credentials that are needed to install vCenter Server, NSX, and
   * SDDC Manager.
   *
   * By default, Amazon EVS use the AWS Secrets Manager managed key `aws/secretsmanager` . You can
   * also specify a customer managed key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The license information that Amazon EVS requires to create an environment.
   *
   * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
   * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110 TiB
   * of vSAN capacity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-licenseinfo)
   */
  public fun licenseInfo(): Any

  /**
   * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
   * service access.
   *
   * If a security group is not specified, Amazon EVS uses the default security group in your
   * account for service access.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-serviceaccesssecuritygroups)
   */
  public fun serviceAccessSecurityGroups(): Any? = unwrap(this).getServiceAccessSecurityGroups()

  /**
   * The subnet that is used to establish connectivity between the Amazon EVS control plane and VPC.
   *
   * Amazon EVS uses this subnet to perform validations and create the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-serviceaccesssubnetid)
   */
  public fun serviceAccessSubnetId(): String

  /**
   * The Broadcom Site ID that is associated with your Amazon EVS environment.
   *
   * Amazon EVS uses the Broadcom Site ID that you provide to meet Broadcom VCF license usage
   * reporting requirements for Amazon EVS.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-siteid)
   */
  public fun siteId(): String

  /**
   * Metadata that assists with categorization and organization.
   *
   * Each tag consists of a key and an optional value. You define both. Tags don't propagate to any
   * other cluster or AWS resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Customer confirmation that the customer has purchased and will continue to maintain the
   * required number of VCF software licenses to cover all physical processor cores in the Amazon EVS
   * environment.
   *
   * Information about your VCF software in Amazon EVS will be shared with Broadcom to verify
   * license compliance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-termsaccepted)
   */
  public fun termsAccepted(): Any

  /**
   * The DNS hostnames to be used by the VCF management appliances in your environment.
   *
   * For environment creation to be successful, each hostname entry must resolve to a domain name
   * that you've registered in your DNS service of choice and configured in the DHCP option set of your
   * VPC. DNS hostnames cannot be changed after environment creation has started.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vcfhostnames)
   */
  public fun vcfHostnames(): Any

  /**
   * The VCF version of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vcfversion)
   */
  public fun vcfVersion(): String

  /**
   * The VPC associated with the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectivityInfo The connectivity configuration for the environment. 
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     */
    public fun connectivityInfo(connectivityInfo: IResolvable)

    /**
     * @param connectivityInfo The connectivity configuration for the environment. 
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     */
    public fun connectivityInfo(connectivityInfo: CfnEnvironment.ConnectivityInfoProperty)

    /**
     * @param connectivityInfo The connectivity configuration for the environment. 
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1198b0ff178b47744a3757130d902a2a5c37683650b0d49dcf33a42ac8c4e6e0")
    public
        fun connectivityInfo(connectivityInfo: CfnEnvironment.ConnectivityInfoProperty.Builder.() -> Unit)

    /**
     * @param environmentName The name of the environment.
     */
    public fun environmentName(environmentName: String)

    /**
     * @param hosts Required for environment resource creation.
     */
    public fun hosts(hosts: IResolvable)

    /**
     * @param hosts Required for environment resource creation.
     */
    public fun hosts(hosts: List<Any>)

    /**
     * @param hosts Required for environment resource creation.
     */
    public fun hosts(vararg hosts: Any)

    /**
     * @param initialVlans Amazon EVS is in public preview release and is subject to change.
     * The initial VLAN subnets for the environment. Amazon EVS VLAN subnets have a minimum CIDR
     * block size of /28 and a maximum size of /24. Amazon EVS VLAN subnet CIDR blocks must not overlap
     * with other subnets in the VPC.
     *
     * Required for environment resource creation.
     */
    public fun initialVlans(initialVlans: IResolvable)

    /**
     * @param initialVlans Amazon EVS is in public preview release and is subject to change.
     * The initial VLAN subnets for the environment. Amazon EVS VLAN subnets have a minimum CIDR
     * block size of /28 and a maximum size of /24. Amazon EVS VLAN subnet CIDR blocks must not overlap
     * with other subnets in the VPC.
     *
     * Required for environment resource creation.
     */
    public fun initialVlans(initialVlans: CfnEnvironment.InitialVlansProperty)

    /**
     * @param initialVlans Amazon EVS is in public preview release and is subject to change.
     * The initial VLAN subnets for the environment. Amazon EVS VLAN subnets have a minimum CIDR
     * block size of /28 and a maximum size of /24. Amazon EVS VLAN subnet CIDR blocks must not overlap
     * with other subnets in the VPC.
     *
     * Required for environment resource creation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("537add437b13c5c8f24163133d3b1590e924f27298fee1132a3d0bbbe420d38d")
    public fun initialVlans(initialVlans: CfnEnvironment.InitialVlansProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyId The AWS KMS key ID that AWS Secrets Manager uses to encrypt secrets that are
     * associated with the environment.
     * These secrets contain the VCF credentials that are needed to install vCenter Server, NSX, and
     * SDDC Manager.
     *
     * By default, Amazon EVS use the AWS Secrets Manager managed key `aws/secretsmanager` . You can
     * also specify a customer managed key.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param licenseInfo The license information that Amazon EVS requires to create an environment.
     * 
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     */
    public fun licenseInfo(licenseInfo: IResolvable)

    /**
     * @param licenseInfo The license information that Amazon EVS requires to create an environment.
     * 
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     */
    public fun licenseInfo(licenseInfo: CfnEnvironment.LicenseInfoProperty)

    /**
     * @param licenseInfo The license information that Amazon EVS requires to create an environment.
     * 
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc2420bd7f698e46a3abc486ca26da210b012f25be7b74382f1dfe921cbc11cb")
    public fun licenseInfo(licenseInfo: CfnEnvironment.LicenseInfoProperty.Builder.() -> Unit)

    /**
     * @param serviceAccessSecurityGroups The security groups that allow traffic between the Amazon
     * EVS control plane and your VPC for service access.
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     */
    public fun serviceAccessSecurityGroups(serviceAccessSecurityGroups: IResolvable)

    /**
     * @param serviceAccessSecurityGroups The security groups that allow traffic between the Amazon
     * EVS control plane and your VPC for service access.
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     */
    public
        fun serviceAccessSecurityGroups(serviceAccessSecurityGroups: CfnEnvironment.ServiceAccessSecurityGroupsProperty)

    /**
     * @param serviceAccessSecurityGroups The security groups that allow traffic between the Amazon
     * EVS control plane and your VPC for service access.
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("775c875e92739c59c1bbf3e4d8b6253a44936bffef0435509613fd5fe510272c")
    public
        fun serviceAccessSecurityGroups(serviceAccessSecurityGroups: CfnEnvironment.ServiceAccessSecurityGroupsProperty.Builder.() -> Unit)

    /**
     * @param serviceAccessSubnetId The subnet that is used to establish connectivity between the
     * Amazon EVS control plane and VPC. 
     * Amazon EVS uses this subnet to perform validations and create the environment.
     */
    public fun serviceAccessSubnetId(serviceAccessSubnetId: String)

    /**
     * @param siteId The Broadcom Site ID that is associated with your Amazon EVS environment. 
     * Amazon EVS uses the Broadcom Site ID that you provide to meet Broadcom VCF license usage
     * reporting requirements for Amazon EVS.
     */
    public fun siteId(siteId: String)

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param termsAccepted Customer confirmation that the customer has purchased and will continue
     * to maintain the required number of VCF software licenses to cover all physical processor cores
     * in the Amazon EVS environment. 
     * Information about your VCF software in Amazon EVS will be shared with Broadcom to verify
     * license compliance.
     */
    public fun termsAccepted(termsAccepted: Boolean)

    /**
     * @param termsAccepted Customer confirmation that the customer has purchased and will continue
     * to maintain the required number of VCF software licenses to cover all physical processor cores
     * in the Amazon EVS environment. 
     * Information about your VCF software in Amazon EVS will be shared with Broadcom to verify
     * license compliance.
     */
    public fun termsAccepted(termsAccepted: IResolvable)

    /**
     * @param vcfHostnames The DNS hostnames to be used by the VCF management appliances in your
     * environment. 
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     */
    public fun vcfHostnames(vcfHostnames: IResolvable)

    /**
     * @param vcfHostnames The DNS hostnames to be used by the VCF management appliances in your
     * environment. 
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     */
    public fun vcfHostnames(vcfHostnames: CfnEnvironment.VcfHostnamesProperty)

    /**
     * @param vcfHostnames The DNS hostnames to be used by the VCF management appliances in your
     * environment. 
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec33a0405d5255a3953f8d6f72802ef099f962925f15af707cd308c70e366825")
    public fun vcfHostnames(vcfHostnames: CfnEnvironment.VcfHostnamesProperty.Builder.() -> Unit)

    /**
     * @param vcfVersion The VCF version of the environment. 
     */
    public fun vcfVersion(vcfVersion: String)

    /**
     * @param vpcId The VPC associated with the environment. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evs.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.evs.CfnEnvironmentProps.builder()

    /**
     * @param connectivityInfo The connectivity configuration for the environment. 
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     */
    override fun connectivityInfo(connectivityInfo: IResolvable) {
      cdkBuilder.connectivityInfo(connectivityInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param connectivityInfo The connectivity configuration for the environment. 
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     */
    override fun connectivityInfo(connectivityInfo: CfnEnvironment.ConnectivityInfoProperty) {
      cdkBuilder.connectivityInfo(connectivityInfo.let(CfnEnvironment.ConnectivityInfoProperty.Companion::unwrap))
    }

    /**
     * @param connectivityInfo The connectivity configuration for the environment. 
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1198b0ff178b47744a3757130d902a2a5c37683650b0d49dcf33a42ac8c4e6e0")
    override
        fun connectivityInfo(connectivityInfo: CfnEnvironment.ConnectivityInfoProperty.Builder.() -> Unit):
        Unit = connectivityInfo(CfnEnvironment.ConnectivityInfoProperty(connectivityInfo))

    /**
     * @param environmentName The name of the environment.
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * @param hosts Required for environment resource creation.
     */
    override fun hosts(hosts: IResolvable) {
      cdkBuilder.hosts(hosts.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param hosts Required for environment resource creation.
     */
    override fun hosts(hosts: List<Any>) {
      cdkBuilder.hosts(hosts.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param hosts Required for environment resource creation.
     */
    override fun hosts(vararg hosts: Any): Unit = hosts(hosts.toList())

    /**
     * @param initialVlans Amazon EVS is in public preview release and is subject to change.
     * The initial VLAN subnets for the environment. Amazon EVS VLAN subnets have a minimum CIDR
     * block size of /28 and a maximum size of /24. Amazon EVS VLAN subnet CIDR blocks must not overlap
     * with other subnets in the VPC.
     *
     * Required for environment resource creation.
     */
    override fun initialVlans(initialVlans: IResolvable) {
      cdkBuilder.initialVlans(initialVlans.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param initialVlans Amazon EVS is in public preview release and is subject to change.
     * The initial VLAN subnets for the environment. Amazon EVS VLAN subnets have a minimum CIDR
     * block size of /28 and a maximum size of /24. Amazon EVS VLAN subnet CIDR blocks must not overlap
     * with other subnets in the VPC.
     *
     * Required for environment resource creation.
     */
    override fun initialVlans(initialVlans: CfnEnvironment.InitialVlansProperty) {
      cdkBuilder.initialVlans(initialVlans.let(CfnEnvironment.InitialVlansProperty.Companion::unwrap))
    }

    /**
     * @param initialVlans Amazon EVS is in public preview release and is subject to change.
     * The initial VLAN subnets for the environment. Amazon EVS VLAN subnets have a minimum CIDR
     * block size of /28 and a maximum size of /24. Amazon EVS VLAN subnet CIDR blocks must not overlap
     * with other subnets in the VPC.
     *
     * Required for environment resource creation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("537add437b13c5c8f24163133d3b1590e924f27298fee1132a3d0bbbe420d38d")
    override fun initialVlans(initialVlans: CfnEnvironment.InitialVlansProperty.Builder.() -> Unit):
        Unit = initialVlans(CfnEnvironment.InitialVlansProperty(initialVlans))

    /**
     * @param kmsKeyId The AWS KMS key ID that AWS Secrets Manager uses to encrypt secrets that are
     * associated with the environment.
     * These secrets contain the VCF credentials that are needed to install vCenter Server, NSX, and
     * SDDC Manager.
     *
     * By default, Amazon EVS use the AWS Secrets Manager managed key `aws/secretsmanager` . You can
     * also specify a customer managed key.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param licenseInfo The license information that Amazon EVS requires to create an environment.
     * 
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     */
    override fun licenseInfo(licenseInfo: IResolvable) {
      cdkBuilder.licenseInfo(licenseInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param licenseInfo The license information that Amazon EVS requires to create an environment.
     * 
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     */
    override fun licenseInfo(licenseInfo: CfnEnvironment.LicenseInfoProperty) {
      cdkBuilder.licenseInfo(licenseInfo.let(CfnEnvironment.LicenseInfoProperty.Companion::unwrap))
    }

    /**
     * @param licenseInfo The license information that Amazon EVS requires to create an environment.
     * 
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc2420bd7f698e46a3abc486ca26da210b012f25be7b74382f1dfe921cbc11cb")
    override fun licenseInfo(licenseInfo: CfnEnvironment.LicenseInfoProperty.Builder.() -> Unit):
        Unit = licenseInfo(CfnEnvironment.LicenseInfoProperty(licenseInfo))

    /**
     * @param serviceAccessSecurityGroups The security groups that allow traffic between the Amazon
     * EVS control plane and your VPC for service access.
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     */
    override fun serviceAccessSecurityGroups(serviceAccessSecurityGroups: IResolvable) {
      cdkBuilder.serviceAccessSecurityGroups(serviceAccessSecurityGroups.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param serviceAccessSecurityGroups The security groups that allow traffic between the Amazon
     * EVS control plane and your VPC for service access.
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     */
    override
        fun serviceAccessSecurityGroups(serviceAccessSecurityGroups: CfnEnvironment.ServiceAccessSecurityGroupsProperty) {
      cdkBuilder.serviceAccessSecurityGroups(serviceAccessSecurityGroups.let(CfnEnvironment.ServiceAccessSecurityGroupsProperty.Companion::unwrap))
    }

    /**
     * @param serviceAccessSecurityGroups The security groups that allow traffic between the Amazon
     * EVS control plane and your VPC for service access.
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("775c875e92739c59c1bbf3e4d8b6253a44936bffef0435509613fd5fe510272c")
    override
        fun serviceAccessSecurityGroups(serviceAccessSecurityGroups: CfnEnvironment.ServiceAccessSecurityGroupsProperty.Builder.() -> Unit):
        Unit =
        serviceAccessSecurityGroups(CfnEnvironment.ServiceAccessSecurityGroupsProperty(serviceAccessSecurityGroups))

    /**
     * @param serviceAccessSubnetId The subnet that is used to establish connectivity between the
     * Amazon EVS control plane and VPC. 
     * Amazon EVS uses this subnet to perform validations and create the environment.
     */
    override fun serviceAccessSubnetId(serviceAccessSubnetId: String) {
      cdkBuilder.serviceAccessSubnetId(serviceAccessSubnetId)
    }

    /**
     * @param siteId The Broadcom Site ID that is associated with your Amazon EVS environment. 
     * Amazon EVS uses the Broadcom Site ID that you provide to meet Broadcom VCF license usage
     * reporting requirements for Amazon EVS.
     */
    override fun siteId(siteId: String) {
      cdkBuilder.siteId(siteId)
    }

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param termsAccepted Customer confirmation that the customer has purchased and will continue
     * to maintain the required number of VCF software licenses to cover all physical processor cores
     * in the Amazon EVS environment. 
     * Information about your VCF software in Amazon EVS will be shared with Broadcom to verify
     * license compliance.
     */
    override fun termsAccepted(termsAccepted: Boolean) {
      cdkBuilder.termsAccepted(termsAccepted)
    }

    /**
     * @param termsAccepted Customer confirmation that the customer has purchased and will continue
     * to maintain the required number of VCF software licenses to cover all physical processor cores
     * in the Amazon EVS environment. 
     * Information about your VCF software in Amazon EVS will be shared with Broadcom to verify
     * license compliance.
     */
    override fun termsAccepted(termsAccepted: IResolvable) {
      cdkBuilder.termsAccepted(termsAccepted.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vcfHostnames The DNS hostnames to be used by the VCF management appliances in your
     * environment. 
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     */
    override fun vcfHostnames(vcfHostnames: IResolvable) {
      cdkBuilder.vcfHostnames(vcfHostnames.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vcfHostnames The DNS hostnames to be used by the VCF management appliances in your
     * environment. 
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     */
    override fun vcfHostnames(vcfHostnames: CfnEnvironment.VcfHostnamesProperty) {
      cdkBuilder.vcfHostnames(vcfHostnames.let(CfnEnvironment.VcfHostnamesProperty.Companion::unwrap))
    }

    /**
     * @param vcfHostnames The DNS hostnames to be used by the VCF management appliances in your
     * environment. 
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec33a0405d5255a3953f8d6f72802ef099f962925f15af707cd308c70e366825")
    override fun vcfHostnames(vcfHostnames: CfnEnvironment.VcfHostnamesProperty.Builder.() -> Unit):
        Unit = vcfHostnames(CfnEnvironment.VcfHostnamesProperty(vcfHostnames))

    /**
     * @param vcfVersion The VCF version of the environment. 
     */
    override fun vcfVersion(vcfVersion: String) {
      cdkBuilder.vcfVersion(vcfVersion)
    }

    /**
     * @param vpcId The VPC associated with the environment. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.evs.CfnEnvironmentProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.evs.CfnEnvironmentProps,
  ) : CdkObject(cdkObject),
      CfnEnvironmentProps {
    /**
     * The connectivity configuration for the environment.
     *
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-connectivityinfo)
     */
    override fun connectivityInfo(): Any = unwrap(this).getConnectivityInfo()

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-environmentname)
     */
    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    /**
     * Required for environment resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-hosts)
     */
    override fun hosts(): Any? = unwrap(this).getHosts()

    /**
     * Amazon EVS is in public preview release and is subject to change.
     *
     * The initial VLAN subnets for the environment. Amazon EVS VLAN subnets have a minimum CIDR
     * block size of /28 and a maximum size of /24. Amazon EVS VLAN subnet CIDR blocks must not overlap
     * with other subnets in the VPC.
     *
     * Required for environment resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-initialvlans)
     */
    override fun initialVlans(): Any? = unwrap(this).getInitialVlans()

    /**
     * The AWS KMS key ID that AWS Secrets Manager uses to encrypt secrets that are associated with
     * the environment.
     *
     * These secrets contain the VCF credentials that are needed to install vCenter Server, NSX, and
     * SDDC Manager.
     *
     * By default, Amazon EVS use the AWS Secrets Manager managed key `aws/secretsmanager` . You can
     * also specify a customer managed key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The license information that Amazon EVS requires to create an environment.
     *
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-licenseinfo)
     */
    override fun licenseInfo(): Any = unwrap(this).getLicenseInfo()

    /**
     * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
     * service access.
     *
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-serviceaccesssecuritygroups)
     */
    override fun serviceAccessSecurityGroups(): Any? = unwrap(this).getServiceAccessSecurityGroups()

    /**
     * The subnet that is used to establish connectivity between the Amazon EVS control plane and
     * VPC.
     *
     * Amazon EVS uses this subnet to perform validations and create the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-serviceaccesssubnetid)
     */
    override fun serviceAccessSubnetId(): String = unwrap(this).getServiceAccessSubnetId()

    /**
     * The Broadcom Site ID that is associated with your Amazon EVS environment.
     *
     * Amazon EVS uses the Broadcom Site ID that you provide to meet Broadcom VCF license usage
     * reporting requirements for Amazon EVS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-siteid)
     */
    override fun siteId(): String = unwrap(this).getSiteId()

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Customer confirmation that the customer has purchased and will continue to maintain the
     * required number of VCF software licenses to cover all physical processor cores in the Amazon EVS
     * environment.
     *
     * Information about your VCF software in Amazon EVS will be shared with Broadcom to verify
     * license compliance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-termsaccepted)
     */
    override fun termsAccepted(): Any = unwrap(this).getTermsAccepted()

    /**
     * The DNS hostnames to be used by the VCF management appliances in your environment.
     *
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vcfhostnames)
     */
    override fun vcfHostnames(): Any = unwrap(this).getVcfHostnames()

    /**
     * The VCF version of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vcfversion)
     */
    override fun vcfVersion(): String = unwrap(this).getVcfVersion()

    /**
     * The VPC associated with the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evs.CfnEnvironmentProps):
        CfnEnvironmentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEnvironmentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.evs.CfnEnvironmentProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.evs.CfnEnvironmentProps
  }
}
