@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.evs

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
 * Amazon EVS is in public preview release and is subject to change.
 *
 * Creates an Amazon EVS environment that runs VCF software, such as SDDC Manager, NSX Manager, and
 * vCenter Server.
 *
 * During environment creation, Amazon EVS performs validations on DNS settings, provisions VLAN
 * subnets and hosts, and deploys the supplied version of VCF.
 *
 * It can take several hours to create an environment. After the deployment completes, you can
 * configure VCF in the vSphere user interface according to your needs.
 *
 *
 * You cannot use the `dedicatedHostId` and `placementGroupId` parameters together in the same
 * `CreateEnvironment` action. This results in a `ValidationException` response.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.evs.*;
 * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
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
public open class CfnEnvironment(
  cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentProps,
  ) :
      this(software.amazon.awscdk.services.evs.CfnEnvironment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEnvironmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEnvironmentProps(props)
  )

  /**
   * A check on the environment to identify instance health and VMware VCF licensing issues. For
   * example:.
   *
   * `{ "checks": [ { "type": "KEY_REUSE", "result": "PASSED" }, { "type": "KEY_COVERAGE", "result":
   * "PASSED" }, { "type": "REACHABILITY", "result": "PASSED" }, { "type": "HOST_COUNT", "result":
   * "PASSED" } ] }`
   */
  public open fun attrChecks(): IResolvable = unwrap(this).getAttrChecks().let(IResolvable::wrap)

  /**
   * The date and time that the environment was created.
   *
   * For example: `1749081600.000` .
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The VCF credentials that are stored as Amazon EVS managed secrets in AWS Secrets Manager.
   *
   * Amazon EVS stores credentials that are needed to install vCenter Server, NSX, and SDDC Manager.
   * For example:
   *
   * `{ [ { "secretArn":
   * "arn:aws:secretsmanager:us-east-1:000000000000:secret:evs!env-1234567890_vCenterAdmin-MnTMEi" }, {
   * "secretArn":
   * "arn:aws:secretsmanager:us-east-1:000000000000:secret:evs!env-1234567890_vCenterRoot-87VyCF" }, {
   * "secretArn":
   * "arn:aws:secretsmanager:us-east-1:000000000000:secret:evs!env-1234567890_NSXRoot-SR3k43" }, {
   * "secretArn":
   * "arn:aws:secretsmanager:us-east-1:000000000000:secret:evs!env-1234567890_NSXAdmin-L5LUiD" }, {
   * "secretArn":
   * "arn:aws:secretsmanager:us-east-1:000000000000:secret:evs!env-1234567890_NSXAudit-Q2oW46" }, {
   * "secretArn":
   * "arn:aws:secretsmanager:us-east-1:000000000000:secret:evs!env-1234567890_SDDCManagerRoot-bFulOq"
   * }, { "secretArn":
   * "arn:aws:secretsmanager:us-east-1:000000000000:secret:evs!env-1234567890_SDDCManagerVCF-Ec3gES" },
   * { "secretArn":
   * "arn:aws:secretsmanager:us-east-1:000000000000:secret:evs!env-1234567890_SDDCManagerAdmin-JMTAAb"
   * } ] }`
   */
  public open fun attrCredentials(): IResolvable =
      unwrap(this).getAttrCredentials().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (ARN) that is associated with the environment.
   *
   * For example: `arn:aws:evs:us-east-1:000000000000:environment/env-1234567890` .
   */
  public open fun attrEnvironmentArn(): String = unwrap(this).getAttrEnvironmentArn()

  /**
   * The unique ID for the environment.
   *
   * For example: `env-1234567890` .
   */
  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  /**
   * The state of an environment.
   *
   * For example: `CREATED` .
   */
  public open fun attrEnvironmentState(): String = unwrap(this).getAttrEnvironmentState()

  /**
   * The date and time that the environment was modified.
   *
   * For example: `1749081600.000` .
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * A detailed description of the `environmentState` of an environment.
   *
   * For example: `Environment successfully created` .
   */
  public open fun attrStateDetails(): String = unwrap(this).getAttrStateDetails()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The connectivity configuration for the environment.
   */
  public open fun connectivityInfo(): Any = unwrap(this).getConnectivityInfo()

  /**
   * The connectivity configuration for the environment.
   */
  public open fun connectivityInfo(`value`: IResolvable) {
    unwrap(this).setConnectivityInfo(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The connectivity configuration for the environment.
   */
  public open fun connectivityInfo(`value`: ConnectivityInfoProperty) {
    unwrap(this).setConnectivityInfo(`value`.let(ConnectivityInfoProperty.Companion::unwrap))
  }

  /**
   * The connectivity configuration for the environment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4fe17c25c441c1a205a2ec5705966684cb999557311d14ac7b4e93512fe77862")
  public open fun connectivityInfo(`value`: ConnectivityInfoProperty.Builder.() -> Unit): Unit =
      connectivityInfo(ConnectivityInfoProperty(`value`))

  /**
   * The name of the environment.
   */
  public open fun environmentName(): String? = unwrap(this).getEnvironmentName()

  /**
   * The name of the environment.
   */
  public open fun environmentName(`value`: String) {
    unwrap(this).setEnvironmentName(`value`)
  }

  /**
   * Required for environment resource creation.
   */
  public open fun hosts(): Any? = unwrap(this).getHosts()

  /**
   * Required for environment resource creation.
   */
  public open fun hosts(`value`: IResolvable) {
    unwrap(this).setHosts(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Required for environment resource creation.
   */
  public open fun hosts(`value`: List<Any>) {
    unwrap(this).setHosts(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Required for environment resource creation.
   */
  public open fun hosts(vararg `value`: Any): Unit = hosts(`value`.toList())

  /**
   * Amazon EVS is in public preview release and is subject to change.
   */
  public open fun initialVlans(): Any? = unwrap(this).getInitialVlans()

  /**
   * Amazon EVS is in public preview release and is subject to change.
   */
  public open fun initialVlans(`value`: IResolvable) {
    unwrap(this).setInitialVlans(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Amazon EVS is in public preview release and is subject to change.
   */
  public open fun initialVlans(`value`: InitialVlansProperty) {
    unwrap(this).setInitialVlans(`value`.let(InitialVlansProperty.Companion::unwrap))
  }

  /**
   * Amazon EVS is in public preview release and is subject to change.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("444622cc8bbcc022bac8d65f88a9317dbefc0eed0fc8707d2207d744e9702a68")
  public open fun initialVlans(`value`: InitialVlansProperty.Builder.() -> Unit): Unit =
      initialVlans(InitialVlansProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The AWS KMS key ID that AWS Secrets Manager uses to encrypt secrets that are associated with
   * the environment.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The AWS KMS key ID that AWS Secrets Manager uses to encrypt secrets that are associated with
   * the environment.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The license information that Amazon EVS requires to create an environment.
   */
  public open fun licenseInfo(): Any = unwrap(this).getLicenseInfo()

  /**
   * The license information that Amazon EVS requires to create an environment.
   */
  public open fun licenseInfo(`value`: IResolvable) {
    unwrap(this).setLicenseInfo(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The license information that Amazon EVS requires to create an environment.
   */
  public open fun licenseInfo(`value`: LicenseInfoProperty) {
    unwrap(this).setLicenseInfo(`value`.let(LicenseInfoProperty.Companion::unwrap))
  }

  /**
   * The license information that Amazon EVS requires to create an environment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("596d6f8bdb8092626bb916a3a6c49f5731245c7c87d96359462e132c8a692e5a")
  public open fun licenseInfo(`value`: LicenseInfoProperty.Builder.() -> Unit): Unit =
      licenseInfo(LicenseInfoProperty(`value`))

  /**
   * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
   * service access.
   */
  public open fun serviceAccessSecurityGroups(): Any? =
      unwrap(this).getServiceAccessSecurityGroups()

  /**
   * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
   * service access.
   */
  public open fun serviceAccessSecurityGroups(`value`: IResolvable) {
    unwrap(this).setServiceAccessSecurityGroups(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
   * service access.
   */
  public open fun serviceAccessSecurityGroups(`value`: ServiceAccessSecurityGroupsProperty) {
    unwrap(this).setServiceAccessSecurityGroups(`value`.let(ServiceAccessSecurityGroupsProperty.Companion::unwrap))
  }

  /**
   * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
   * service access.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca319e3939075b74ab3665575ab4ca764d0a266188a386d65899e6f7acff5967")
  public open
      fun serviceAccessSecurityGroups(`value`: ServiceAccessSecurityGroupsProperty.Builder.() -> Unit):
      Unit = serviceAccessSecurityGroups(ServiceAccessSecurityGroupsProperty(`value`))

  /**
   * The subnet that is used to establish connectivity between the Amazon EVS control plane and VPC.
   */
  public open fun serviceAccessSubnetId(): String = unwrap(this).getServiceAccessSubnetId()

  /**
   * The subnet that is used to establish connectivity between the Amazon EVS control plane and VPC.
   */
  public open fun serviceAccessSubnetId(`value`: String) {
    unwrap(this).setServiceAccessSubnetId(`value`)
  }

  /**
   * The Broadcom Site ID that is associated with your Amazon EVS environment.
   */
  public open fun siteId(): String = unwrap(this).getSiteId()

  /**
   * The Broadcom Site ID that is associated with your Amazon EVS environment.
   */
  public open fun siteId(`value`: String) {
    unwrap(this).setSiteId(`value`)
  }

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * Customer confirmation that the customer has purchased and will continue to maintain the
   * required number of VCF software licenses to cover all physical processor cores in the Amazon EVS
   * environment.
   */
  public open fun termsAccepted(): Any = unwrap(this).getTermsAccepted()

  /**
   * Customer confirmation that the customer has purchased and will continue to maintain the
   * required number of VCF software licenses to cover all physical processor cores in the Amazon EVS
   * environment.
   */
  public open fun termsAccepted(`value`: Boolean) {
    unwrap(this).setTermsAccepted(`value`)
  }

  /**
   * Customer confirmation that the customer has purchased and will continue to maintain the
   * required number of VCF software licenses to cover all physical processor cores in the Amazon EVS
   * environment.
   */
  public open fun termsAccepted(`value`: IResolvable) {
    unwrap(this).setTermsAccepted(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The DNS hostnames to be used by the VCF management appliances in your environment.
   */
  public open fun vcfHostnames(): Any = unwrap(this).getVcfHostnames()

  /**
   * The DNS hostnames to be used by the VCF management appliances in your environment.
   */
  public open fun vcfHostnames(`value`: IResolvable) {
    unwrap(this).setVcfHostnames(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The DNS hostnames to be used by the VCF management appliances in your environment.
   */
  public open fun vcfHostnames(`value`: VcfHostnamesProperty) {
    unwrap(this).setVcfHostnames(`value`.let(VcfHostnamesProperty.Companion::unwrap))
  }

  /**
   * The DNS hostnames to be used by the VCF management appliances in your environment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d97da96a74c6d0ab077b6ec6715a9568afa752595dd42ba01a831742fd02a5c4")
  public open fun vcfHostnames(`value`: VcfHostnamesProperty.Builder.() -> Unit): Unit =
      vcfHostnames(VcfHostnamesProperty(`value`))

  /**
   * The VCF version of the environment.
   */
  public open fun vcfVersion(): String = unwrap(this).getVcfVersion()

  /**
   * The VCF version of the environment.
   */
  public open fun vcfVersion(`value`: String) {
    unwrap(this).setVcfVersion(`value`)
  }

  /**
   * The VPC associated with the environment.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The VPC associated with the environment.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.evs.CfnEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The connectivity configuration for the environment.
     *
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-connectivityinfo)
     * @param connectivityInfo The connectivity configuration for the environment. 
     */
    public fun connectivityInfo(connectivityInfo: IResolvable)

    /**
     * The connectivity configuration for the environment.
     *
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-connectivityinfo)
     * @param connectivityInfo The connectivity configuration for the environment. 
     */
    public fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty)

    /**
     * The connectivity configuration for the environment.
     *
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-connectivityinfo)
     * @param connectivityInfo The connectivity configuration for the environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("645741bf55d960ed1fe8523ff41288ef56e58dac9b594d92c014c13571a6b898")
    public fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty.Builder.() -> Unit)

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-environmentname)
     * @param environmentName The name of the environment. 
     */
    public fun environmentName(environmentName: String)

    /**
     * Required for environment resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-hosts)
     * @param hosts Required for environment resource creation. 
     */
    public fun hosts(hosts: IResolvable)

    /**
     * Required for environment resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-hosts)
     * @param hosts Required for environment resource creation. 
     */
    public fun hosts(hosts: List<Any>)

    /**
     * Required for environment resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-hosts)
     * @param hosts Required for environment resource creation. 
     */
    public fun hosts(vararg hosts: Any)

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
     * @param initialVlans Amazon EVS is in public preview release and is subject to change. 
     */
    public fun initialVlans(initialVlans: IResolvable)

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
     * @param initialVlans Amazon EVS is in public preview release and is subject to change. 
     */
    public fun initialVlans(initialVlans: InitialVlansProperty)

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
     * @param initialVlans Amazon EVS is in public preview release and is subject to change. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17a9797eee2aeaa6098debd4d587326ee05310549b808ed59b13be3fda529227")
    public fun initialVlans(initialVlans: InitialVlansProperty.Builder.() -> Unit)

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
     * @param kmsKeyId The AWS KMS key ID that AWS Secrets Manager uses to encrypt secrets that are
     * associated with the environment. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The license information that Amazon EVS requires to create an environment.
     *
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-licenseinfo)
     * @param licenseInfo The license information that Amazon EVS requires to create an environment.
     * 
     */
    public fun licenseInfo(licenseInfo: IResolvable)

    /**
     * The license information that Amazon EVS requires to create an environment.
     *
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-licenseinfo)
     * @param licenseInfo The license information that Amazon EVS requires to create an environment.
     * 
     */
    public fun licenseInfo(licenseInfo: LicenseInfoProperty)

    /**
     * The license information that Amazon EVS requires to create an environment.
     *
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-licenseinfo)
     * @param licenseInfo The license information that Amazon EVS requires to create an environment.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75131e70816db22f73d2edce9b3bce31a13a5c2a250fb1663490587cd640b0fe")
    public fun licenseInfo(licenseInfo: LicenseInfoProperty.Builder.() -> Unit)

    /**
     * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
     * service access.
     *
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-serviceaccesssecuritygroups)
     * @param serviceAccessSecurityGroups The security groups that allow traffic between the Amazon
     * EVS control plane and your VPC for service access. 
     */
    public fun serviceAccessSecurityGroups(serviceAccessSecurityGroups: IResolvable)

    /**
     * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
     * service access.
     *
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-serviceaccesssecuritygroups)
     * @param serviceAccessSecurityGroups The security groups that allow traffic between the Amazon
     * EVS control plane and your VPC for service access. 
     */
    public
        fun serviceAccessSecurityGroups(serviceAccessSecurityGroups: ServiceAccessSecurityGroupsProperty)

    /**
     * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
     * service access.
     *
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-serviceaccesssecuritygroups)
     * @param serviceAccessSecurityGroups The security groups that allow traffic between the Amazon
     * EVS control plane and your VPC for service access. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e7d826e3273362622e32e8e6eeedc27314d0435befc64a956322bec9c4bc466")
    public
        fun serviceAccessSecurityGroups(serviceAccessSecurityGroups: ServiceAccessSecurityGroupsProperty.Builder.() -> Unit)

    /**
     * The subnet that is used to establish connectivity between the Amazon EVS control plane and
     * VPC.
     *
     * Amazon EVS uses this subnet to perform validations and create the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-serviceaccesssubnetid)
     * @param serviceAccessSubnetId The subnet that is used to establish connectivity between the
     * Amazon EVS control plane and VPC. 
     */
    public fun serviceAccessSubnetId(serviceAccessSubnetId: String)

    /**
     * The Broadcom Site ID that is associated with your Amazon EVS environment.
     *
     * Amazon EVS uses the Broadcom Site ID that you provide to meet Broadcom VCF license usage
     * reporting requirements for Amazon EVS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-siteid)
     * @param siteId The Broadcom Site ID that is associated with your Amazon EVS environment. 
     */
    public fun siteId(siteId: String)

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Customer confirmation that the customer has purchased and will continue to maintain the
     * required number of VCF software licenses to cover all physical processor cores in the Amazon EVS
     * environment.
     *
     * Information about your VCF software in Amazon EVS will be shared with Broadcom to verify
     * license compliance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-termsaccepted)
     * @param termsAccepted Customer confirmation that the customer has purchased and will continue
     * to maintain the required number of VCF software licenses to cover all physical processor cores
     * in the Amazon EVS environment. 
     */
    public fun termsAccepted(termsAccepted: Boolean)

    /**
     * Customer confirmation that the customer has purchased and will continue to maintain the
     * required number of VCF software licenses to cover all physical processor cores in the Amazon EVS
     * environment.
     *
     * Information about your VCF software in Amazon EVS will be shared with Broadcom to verify
     * license compliance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-termsaccepted)
     * @param termsAccepted Customer confirmation that the customer has purchased and will continue
     * to maintain the required number of VCF software licenses to cover all physical processor cores
     * in the Amazon EVS environment. 
     */
    public fun termsAccepted(termsAccepted: IResolvable)

    /**
     * The DNS hostnames to be used by the VCF management appliances in your environment.
     *
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vcfhostnames)
     * @param vcfHostnames The DNS hostnames to be used by the VCF management appliances in your
     * environment. 
     */
    public fun vcfHostnames(vcfHostnames: IResolvable)

    /**
     * The DNS hostnames to be used by the VCF management appliances in your environment.
     *
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vcfhostnames)
     * @param vcfHostnames The DNS hostnames to be used by the VCF management appliances in your
     * environment. 
     */
    public fun vcfHostnames(vcfHostnames: VcfHostnamesProperty)

    /**
     * The DNS hostnames to be used by the VCF management appliances in your environment.
     *
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vcfhostnames)
     * @param vcfHostnames The DNS hostnames to be used by the VCF management appliances in your
     * environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4701c94758537640a76adcf69cf3901032a0ae7cc2dafaf0cadcf73014ca71e7")
    public fun vcfHostnames(vcfHostnames: VcfHostnamesProperty.Builder.() -> Unit)

    /**
     * The VCF version of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vcfversion)
     * @param vcfVersion The VCF version of the environment. 
     */
    public fun vcfVersion(vcfVersion: String)

    /**
     * The VPC associated with the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vpcid)
     * @param vpcId The VPC associated with the environment. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evs.CfnEnvironment.Builder =
        software.amazon.awscdk.services.evs.CfnEnvironment.Builder.create(scope, id)

    /**
     * The connectivity configuration for the environment.
     *
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-connectivityinfo)
     * @param connectivityInfo The connectivity configuration for the environment. 
     */
    override fun connectivityInfo(connectivityInfo: IResolvable) {
      cdkBuilder.connectivityInfo(connectivityInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * The connectivity configuration for the environment.
     *
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-connectivityinfo)
     * @param connectivityInfo The connectivity configuration for the environment. 
     */
    override fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty) {
      cdkBuilder.connectivityInfo(connectivityInfo.let(ConnectivityInfoProperty.Companion::unwrap))
    }

    /**
     * The connectivity configuration for the environment.
     *
     * Amazon EVS requires that you specify two route server peer IDs. During environment creation,
     * the route server endpoints peer with the NSX uplink VLAN for connectivity to the NSX overlay
     * network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-connectivityinfo)
     * @param connectivityInfo The connectivity configuration for the environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("645741bf55d960ed1fe8523ff41288ef56e58dac9b594d92c014c13571a6b898")
    override fun connectivityInfo(connectivityInfo: ConnectivityInfoProperty.Builder.() -> Unit):
        Unit = connectivityInfo(ConnectivityInfoProperty(connectivityInfo))

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-environmentname)
     * @param environmentName The name of the environment. 
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * Required for environment resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-hosts)
     * @param hosts Required for environment resource creation. 
     */
    override fun hosts(hosts: IResolvable) {
      cdkBuilder.hosts(hosts.let(IResolvable.Companion::unwrap))
    }

    /**
     * Required for environment resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-hosts)
     * @param hosts Required for environment resource creation. 
     */
    override fun hosts(hosts: List<Any>) {
      cdkBuilder.hosts(hosts.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Required for environment resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-hosts)
     * @param hosts Required for environment resource creation. 
     */
    override fun hosts(vararg hosts: Any): Unit = hosts(hosts.toList())

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
     * @param initialVlans Amazon EVS is in public preview release and is subject to change. 
     */
    override fun initialVlans(initialVlans: IResolvable) {
      cdkBuilder.initialVlans(initialVlans.let(IResolvable.Companion::unwrap))
    }

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
     * @param initialVlans Amazon EVS is in public preview release and is subject to change. 
     */
    override fun initialVlans(initialVlans: InitialVlansProperty) {
      cdkBuilder.initialVlans(initialVlans.let(InitialVlansProperty.Companion::unwrap))
    }

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
     * @param initialVlans Amazon EVS is in public preview release and is subject to change. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17a9797eee2aeaa6098debd4d587326ee05310549b808ed59b13be3fda529227")
    override fun initialVlans(initialVlans: InitialVlansProperty.Builder.() -> Unit): Unit =
        initialVlans(InitialVlansProperty(initialVlans))

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
     * @param kmsKeyId The AWS KMS key ID that AWS Secrets Manager uses to encrypt secrets that are
     * associated with the environment. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The license information that Amazon EVS requires to create an environment.
     *
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-licenseinfo)
     * @param licenseInfo The license information that Amazon EVS requires to create an environment.
     * 
     */
    override fun licenseInfo(licenseInfo: IResolvable) {
      cdkBuilder.licenseInfo(licenseInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * The license information that Amazon EVS requires to create an environment.
     *
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-licenseinfo)
     * @param licenseInfo The license information that Amazon EVS requires to create an environment.
     * 
     */
    override fun licenseInfo(licenseInfo: LicenseInfoProperty) {
      cdkBuilder.licenseInfo(licenseInfo.let(LicenseInfoProperty.Companion::unwrap))
    }

    /**
     * The license information that Amazon EVS requires to create an environment.
     *
     * Amazon EVS requires two license keys: a VCF solution key and a vSAN license key. The VCF
     * solution key must cover a minimum of 256 cores. The vSAN license key must provide at least 110
     * TiB of vSAN capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-licenseinfo)
     * @param licenseInfo The license information that Amazon EVS requires to create an environment.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75131e70816db22f73d2edce9b3bce31a13a5c2a250fb1663490587cd640b0fe")
    override fun licenseInfo(licenseInfo: LicenseInfoProperty.Builder.() -> Unit): Unit =
        licenseInfo(LicenseInfoProperty(licenseInfo))

    /**
     * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
     * service access.
     *
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-serviceaccesssecuritygroups)
     * @param serviceAccessSecurityGroups The security groups that allow traffic between the Amazon
     * EVS control plane and your VPC for service access. 
     */
    override fun serviceAccessSecurityGroups(serviceAccessSecurityGroups: IResolvable) {
      cdkBuilder.serviceAccessSecurityGroups(serviceAccessSecurityGroups.let(IResolvable.Companion::unwrap))
    }

    /**
     * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
     * service access.
     *
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-serviceaccesssecuritygroups)
     * @param serviceAccessSecurityGroups The security groups that allow traffic between the Amazon
     * EVS control plane and your VPC for service access. 
     */
    override
        fun serviceAccessSecurityGroups(serviceAccessSecurityGroups: ServiceAccessSecurityGroupsProperty) {
      cdkBuilder.serviceAccessSecurityGroups(serviceAccessSecurityGroups.let(ServiceAccessSecurityGroupsProperty.Companion::unwrap))
    }

    /**
     * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
     * service access.
     *
     * If a security group is not specified, Amazon EVS uses the default security group in your
     * account for service access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-serviceaccesssecuritygroups)
     * @param serviceAccessSecurityGroups The security groups that allow traffic between the Amazon
     * EVS control plane and your VPC for service access. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e7d826e3273362622e32e8e6eeedc27314d0435befc64a956322bec9c4bc466")
    override
        fun serviceAccessSecurityGroups(serviceAccessSecurityGroups: ServiceAccessSecurityGroupsProperty.Builder.() -> Unit):
        Unit =
        serviceAccessSecurityGroups(ServiceAccessSecurityGroupsProperty(serviceAccessSecurityGroups))

    /**
     * The subnet that is used to establish connectivity between the Amazon EVS control plane and
     * VPC.
     *
     * Amazon EVS uses this subnet to perform validations and create the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-serviceaccesssubnetid)
     * @param serviceAccessSubnetId The subnet that is used to establish connectivity between the
     * Amazon EVS control plane and VPC. 
     */
    override fun serviceAccessSubnetId(serviceAccessSubnetId: String) {
      cdkBuilder.serviceAccessSubnetId(serviceAccessSubnetId)
    }

    /**
     * The Broadcom Site ID that is associated with your Amazon EVS environment.
     *
     * Amazon EVS uses the Broadcom Site ID that you provide to meet Broadcom VCF license usage
     * reporting requirements for Amazon EVS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-siteid)
     * @param siteId The Broadcom Site ID that is associated with your Amazon EVS environment. 
     */
    override fun siteId(siteId: String) {
      cdkBuilder.siteId(siteId)
    }

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Customer confirmation that the customer has purchased and will continue to maintain the
     * required number of VCF software licenses to cover all physical processor cores in the Amazon EVS
     * environment.
     *
     * Information about your VCF software in Amazon EVS will be shared with Broadcom to verify
     * license compliance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-termsaccepted)
     * @param termsAccepted Customer confirmation that the customer has purchased and will continue
     * to maintain the required number of VCF software licenses to cover all physical processor cores
     * in the Amazon EVS environment. 
     */
    override fun termsAccepted(termsAccepted: Boolean) {
      cdkBuilder.termsAccepted(termsAccepted)
    }

    /**
     * Customer confirmation that the customer has purchased and will continue to maintain the
     * required number of VCF software licenses to cover all physical processor cores in the Amazon EVS
     * environment.
     *
     * Information about your VCF software in Amazon EVS will be shared with Broadcom to verify
     * license compliance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-termsaccepted)
     * @param termsAccepted Customer confirmation that the customer has purchased and will continue
     * to maintain the required number of VCF software licenses to cover all physical processor cores
     * in the Amazon EVS environment. 
     */
    override fun termsAccepted(termsAccepted: IResolvable) {
      cdkBuilder.termsAccepted(termsAccepted.let(IResolvable.Companion::unwrap))
    }

    /**
     * The DNS hostnames to be used by the VCF management appliances in your environment.
     *
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vcfhostnames)
     * @param vcfHostnames The DNS hostnames to be used by the VCF management appliances in your
     * environment. 
     */
    override fun vcfHostnames(vcfHostnames: IResolvable) {
      cdkBuilder.vcfHostnames(vcfHostnames.let(IResolvable.Companion::unwrap))
    }

    /**
     * The DNS hostnames to be used by the VCF management appliances in your environment.
     *
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vcfhostnames)
     * @param vcfHostnames The DNS hostnames to be used by the VCF management appliances in your
     * environment. 
     */
    override fun vcfHostnames(vcfHostnames: VcfHostnamesProperty) {
      cdkBuilder.vcfHostnames(vcfHostnames.let(VcfHostnamesProperty.Companion::unwrap))
    }

    /**
     * The DNS hostnames to be used by the VCF management appliances in your environment.
     *
     * For environment creation to be successful, each hostname entry must resolve to a domain name
     * that you've registered in your DNS service of choice and configured in the DHCP option set of
     * your VPC. DNS hostnames cannot be changed after environment creation has started.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vcfhostnames)
     * @param vcfHostnames The DNS hostnames to be used by the VCF management appliances in your
     * environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4701c94758537640a76adcf69cf3901032a0ae7cc2dafaf0cadcf73014ca71e7")
    override fun vcfHostnames(vcfHostnames: VcfHostnamesProperty.Builder.() -> Unit): Unit =
        vcfHostnames(VcfHostnamesProperty(vcfHostnames))

    /**
     * The VCF version of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vcfversion)
     * @param vcfVersion The VCF version of the environment. 
     */
    override fun vcfVersion(vcfVersion: String) {
      cdkBuilder.vcfVersion(vcfVersion)
    }

    /**
     * The VPC associated with the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evs-environment.html#cfn-evs-environment-vpcid)
     * @param vpcId The VPC associated with the environment. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.evs.CfnEnvironment = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.evs.CfnEnvironment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment): CfnEnvironment
        = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment): software.amazon.awscdk.services.evs.CfnEnvironment
        = wrapped.cdkObject as software.amazon.awscdk.services.evs.CfnEnvironment
  }

  /**
   * Amazon EVS is in public preview release and is subject to change.
   *
   * A check on the environment to identify environment health and validate VMware VCF licensing
   * compliance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evs.*;
   * CheckProperty checkProperty = CheckProperty.builder()
   * .result("result")
   * .type("type")
   * // the properties below are optional
   * .impairedSince("impairedSince")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-check.html)
   */
  public interface CheckProperty {
    /**
     * The time when environment health began to be impaired.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-check.html#cfn-evs-environment-check-impairedsince)
     */
    public fun impairedSince(): String? = unwrap(this).getImpairedSince()

    /**
     * The check result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-check.html#cfn-evs-environment-check-result)
     */
    public fun result(): String

    /**
     * The check type. Amazon EVS performs the following checks.
     *
     * * `KEY_REUSE` : checks that the VCF license key is not used by another Amazon EVS
     * environment. This check fails if a used license is added to the environment.
     * * `KEY_COVERAGE` : checks that your VCF license key allocates sufficient vCPU cores for all
     * deployed hosts. The check fails when any assigned hosts in the EVS environment are not covered
     * by license keys, or when any unassigned hosts cannot be covered by available vCPU cores in keys.
     * * `REACHABILITY` : checks that the Amazon EVS control plane has a persistent connection to
     * SDDC Manager. If Amazon EVS cannot reach the environment, this check fails.
     * * `HOST_COUNT` : Checks that your environment has a minimum of 4 hosts, which is a
     * requirement for VCF 5.2.1.
     *
     * If this check fails, you will need to add hosts so that your environment meets this minimum
     * requirement. Amazon EVS only supports environments with 4-16 hosts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-check.html#cfn-evs-environment-check-type)
     */
    public fun type(): String

    /**
     * A builder for [CheckProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param impairedSince The time when environment health began to be impaired.
       */
      public fun impairedSince(impairedSince: String)

      /**
       * @param result The check result. 
       */
      public fun result(result: String)

      /**
       * @param type The check type. Amazon EVS performs the following checks. 
       * * `KEY_REUSE` : checks that the VCF license key is not used by another Amazon EVS
       * environment. This check fails if a used license is added to the environment.
       * * `KEY_COVERAGE` : checks that your VCF license key allocates sufficient vCPU cores for all
       * deployed hosts. The check fails when any assigned hosts in the EVS environment are not covered
       * by license keys, or when any unassigned hosts cannot be covered by available vCPU cores in
       * keys.
       * * `REACHABILITY` : checks that the Amazon EVS control plane has a persistent connection to
       * SDDC Manager. If Amazon EVS cannot reach the environment, this check fails.
       * * `HOST_COUNT` : Checks that your environment has a minimum of 4 hosts, which is a
       * requirement for VCF 5.2.1.
       *
       * If this check fails, you will need to add hosts so that your environment meets this minimum
       * requirement. Amazon EVS only supports environments with 4-16 hosts.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evs.CfnEnvironment.CheckProperty.Builder =
          software.amazon.awscdk.services.evs.CfnEnvironment.CheckProperty.builder()

      /**
       * @param impairedSince The time when environment health began to be impaired.
       */
      override fun impairedSince(impairedSince: String) {
        cdkBuilder.impairedSince(impairedSince)
      }

      /**
       * @param result The check result. 
       */
      override fun result(result: String) {
        cdkBuilder.result(result)
      }

      /**
       * @param type The check type. Amazon EVS performs the following checks. 
       * * `KEY_REUSE` : checks that the VCF license key is not used by another Amazon EVS
       * environment. This check fails if a used license is added to the environment.
       * * `KEY_COVERAGE` : checks that your VCF license key allocates sufficient vCPU cores for all
       * deployed hosts. The check fails when any assigned hosts in the EVS environment are not covered
       * by license keys, or when any unassigned hosts cannot be covered by available vCPU cores in
       * keys.
       * * `REACHABILITY` : checks that the Amazon EVS control plane has a persistent connection to
       * SDDC Manager. If Amazon EVS cannot reach the environment, this check fails.
       * * `HOST_COUNT` : Checks that your environment has a minimum of 4 hosts, which is a
       * requirement for VCF 5.2.1.
       *
       * If this check fails, you will need to add hosts so that your environment meets this minimum
       * requirement. Amazon EVS only supports environments with 4-16 hosts.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.evs.CfnEnvironment.CheckProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.CheckProperty,
    ) : CdkObject(cdkObject),
        CheckProperty {
      /**
       * The time when environment health began to be impaired.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-check.html#cfn-evs-environment-check-impairedsince)
       */
      override fun impairedSince(): String? = unwrap(this).getImpairedSince()

      /**
       * The check result.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-check.html#cfn-evs-environment-check-result)
       */
      override fun result(): String = unwrap(this).getResult()

      /**
       * The check type. Amazon EVS performs the following checks.
       *
       * * `KEY_REUSE` : checks that the VCF license key is not used by another Amazon EVS
       * environment. This check fails if a used license is added to the environment.
       * * `KEY_COVERAGE` : checks that your VCF license key allocates sufficient vCPU cores for all
       * deployed hosts. The check fails when any assigned hosts in the EVS environment are not covered
       * by license keys, or when any unassigned hosts cannot be covered by available vCPU cores in
       * keys.
       * * `REACHABILITY` : checks that the Amazon EVS control plane has a persistent connection to
       * SDDC Manager. If Amazon EVS cannot reach the environment, this check fails.
       * * `HOST_COUNT` : Checks that your environment has a minimum of 4 hosts, which is a
       * requirement for VCF 5.2.1.
       *
       * If this check fails, you will need to add hosts so that your environment meets this minimum
       * requirement. Amazon EVS only supports environments with 4-16 hosts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-check.html#cfn-evs-environment-check-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CheckProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.CheckProperty):
          CheckProperty = CdkObjectWrappers.wrap(cdkObject) as? CheckProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CheckProperty):
          software.amazon.awscdk.services.evs.CfnEnvironment.CheckProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.evs.CfnEnvironment.CheckProperty
    }
  }

  /**
   * Amazon EVS is in public preview release and is subject to change.
   *
   * The connectivity configuration for the environment. Amazon EVS requires that you specify two
   * route server peer IDs. During environment creation, the route server endpoints peer with the NSX
   * uplink VLAN for connectivity to the NSX overlay network.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evs.*;
   * ConnectivityInfoProperty connectivityInfoProperty = ConnectivityInfoProperty.builder()
   * .privateRouteServerPeerings(List.of("privateRouteServerPeerings"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-connectivityinfo.html)
   */
  public interface ConnectivityInfoProperty {
    /**
     * The unique IDs for private route server peers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-connectivityinfo.html#cfn-evs-environment-connectivityinfo-privaterouteserverpeerings)
     */
    public fun privateRouteServerPeerings(): List<String>

    /**
     * A builder for [ConnectivityInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param privateRouteServerPeerings The unique IDs for private route server peers. 
       */
      public fun privateRouteServerPeerings(privateRouteServerPeerings: List<String>)

      /**
       * @param privateRouteServerPeerings The unique IDs for private route server peers. 
       */
      public fun privateRouteServerPeerings(vararg privateRouteServerPeerings: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evs.CfnEnvironment.ConnectivityInfoProperty.Builder =
          software.amazon.awscdk.services.evs.CfnEnvironment.ConnectivityInfoProperty.builder()

      /**
       * @param privateRouteServerPeerings The unique IDs for private route server peers. 
       */
      override fun privateRouteServerPeerings(privateRouteServerPeerings: List<String>) {
        cdkBuilder.privateRouteServerPeerings(privateRouteServerPeerings)
      }

      /**
       * @param privateRouteServerPeerings The unique IDs for private route server peers. 
       */
      override fun privateRouteServerPeerings(vararg privateRouteServerPeerings: String): Unit =
          privateRouteServerPeerings(privateRouteServerPeerings.toList())

      public fun build():
          software.amazon.awscdk.services.evs.CfnEnvironment.ConnectivityInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.ConnectivityInfoProperty,
    ) : CdkObject(cdkObject),
        ConnectivityInfoProperty {
      /**
       * The unique IDs for private route server peers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-connectivityinfo.html#cfn-evs-environment-connectivityinfo-privaterouteserverpeerings)
       */
      override fun privateRouteServerPeerings(): List<String> =
          unwrap(this).getPrivateRouteServerPeerings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectivityInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.ConnectivityInfoProperty):
          ConnectivityInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? ConnectivityInfoProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectivityInfoProperty):
          software.amazon.awscdk.services.evs.CfnEnvironment.ConnectivityInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.evs.CfnEnvironment.ConnectivityInfoProperty
    }
  }

  /**
   * Amazon EVS is in public preview release and is subject to change.
   *
   * An object that represents a host.
   *
   *
   * You cannot use `dedicatedHostId` and `placementGroupId` together in the same
   * `HostInfoForCreate` object. This results in a `ValidationException` response.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evs.*;
   * HostInfoForCreateProperty hostInfoForCreateProperty = HostInfoForCreateProperty.builder()
   * .hostName("hostName")
   * .instanceType("instanceType")
   * .keyName("keyName")
   * // the properties below are optional
   * .dedicatedHostId("dedicatedHostId")
   * .placementGroupId("placementGroupId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-hostinfoforcreate.html)
   */
  public interface HostInfoForCreateProperty {
    /**
     * The unique ID of the Amazon EC2 Dedicated Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-hostinfoforcreate.html#cfn-evs-environment-hostinfoforcreate-dedicatedhostid)
     */
    public fun dedicatedHostId(): String? = unwrap(this).getDedicatedHostId()

    /**
     * The DNS hostname of the host.
     *
     * DNS hostnames for hosts must be unique across Amazon EVS environments and within VCF.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-hostinfoforcreate.html#cfn-evs-environment-hostinfoforcreate-hostname)
     */
    public fun hostName(): String

    /**
     * The EC2 instance type that represents the host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-hostinfoforcreate.html#cfn-evs-environment-hostinfoforcreate-instancetype)
     */
    public fun instanceType(): String

    /**
     * The name of the SSH key that is used to access the host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-hostinfoforcreate.html#cfn-evs-environment-hostinfoforcreate-keyname)
     */
    public fun keyName(): String

    /**
     * The unique ID of the placement group where the host is placed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-hostinfoforcreate.html#cfn-evs-environment-hostinfoforcreate-placementgroupid)
     */
    public fun placementGroupId(): String? = unwrap(this).getPlacementGroupId()

    /**
     * A builder for [HostInfoForCreateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dedicatedHostId The unique ID of the Amazon EC2 Dedicated Host.
       */
      public fun dedicatedHostId(dedicatedHostId: String)

      /**
       * @param hostName The DNS hostname of the host. 
       * DNS hostnames for hosts must be unique across Amazon EVS environments and within VCF.
       */
      public fun hostName(hostName: String)

      /**
       * @param instanceType The EC2 instance type that represents the host. 
       */
      public fun instanceType(instanceType: String)

      /**
       * @param keyName The name of the SSH key that is used to access the host. 
       */
      public fun keyName(keyName: String)

      /**
       * @param placementGroupId The unique ID of the placement group where the host is placed.
       */
      public fun placementGroupId(placementGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evs.CfnEnvironment.HostInfoForCreateProperty.Builder =
          software.amazon.awscdk.services.evs.CfnEnvironment.HostInfoForCreateProperty.builder()

      /**
       * @param dedicatedHostId The unique ID of the Amazon EC2 Dedicated Host.
       */
      override fun dedicatedHostId(dedicatedHostId: String) {
        cdkBuilder.dedicatedHostId(dedicatedHostId)
      }

      /**
       * @param hostName The DNS hostname of the host. 
       * DNS hostnames for hosts must be unique across Amazon EVS environments and within VCF.
       */
      override fun hostName(hostName: String) {
        cdkBuilder.hostName(hostName)
      }

      /**
       * @param instanceType The EC2 instance type that represents the host. 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param keyName The name of the SSH key that is used to access the host. 
       */
      override fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
      }

      /**
       * @param placementGroupId The unique ID of the placement group where the host is placed.
       */
      override fun placementGroupId(placementGroupId: String) {
        cdkBuilder.placementGroupId(placementGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.evs.CfnEnvironment.HostInfoForCreateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.HostInfoForCreateProperty,
    ) : CdkObject(cdkObject),
        HostInfoForCreateProperty {
      /**
       * The unique ID of the Amazon EC2 Dedicated Host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-hostinfoforcreate.html#cfn-evs-environment-hostinfoforcreate-dedicatedhostid)
       */
      override fun dedicatedHostId(): String? = unwrap(this).getDedicatedHostId()

      /**
       * The DNS hostname of the host.
       *
       * DNS hostnames for hosts must be unique across Amazon EVS environments and within VCF.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-hostinfoforcreate.html#cfn-evs-environment-hostinfoforcreate-hostname)
       */
      override fun hostName(): String = unwrap(this).getHostName()

      /**
       * The EC2 instance type that represents the host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-hostinfoforcreate.html#cfn-evs-environment-hostinfoforcreate-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * The name of the SSH key that is used to access the host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-hostinfoforcreate.html#cfn-evs-environment-hostinfoforcreate-keyname)
       */
      override fun keyName(): String = unwrap(this).getKeyName()

      /**
       * The unique ID of the placement group where the host is placed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-hostinfoforcreate.html#cfn-evs-environment-hostinfoforcreate-placementgroupid)
       */
      override fun placementGroupId(): String? = unwrap(this).getPlacementGroupId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostInfoForCreateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.HostInfoForCreateProperty):
          HostInfoForCreateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HostInfoForCreateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostInfoForCreateProperty):
          software.amazon.awscdk.services.evs.CfnEnvironment.HostInfoForCreateProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.evs.CfnEnvironment.HostInfoForCreateProperty
    }
  }

  /**
   * Amazon EVS is in public preview release and is subject to change.
   *
   * An object that represents an initial VLAN subnet for the Amazon EVS environment. Amazon EVS
   * creates initial VLAN subnets when you first create the environment. Amazon EVS creates the
   * following 10 VLAN subnets: host management VLAN, vMotion VLAN, vSAN VLAN, VTEP VLAN, Edge VTEP
   * VLAN, Management VM VLAN, HCX uplink VLAN, NSX uplink VLAN, expansion VLAN 1, expansion VLAN 2.
   *
   *
   * For each Amazon EVS VLAN subnet, you must specify a non-overlapping CIDR block. Amazon EVS VLAN
   * subnets have a minimum CIDR block size of /28 and a maximum size of /24.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evs.*;
   * InitialVlanInfoProperty initialVlanInfoProperty = InitialVlanInfoProperty.builder()
   * .cidr("cidr")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlaninfo.html)
   */
  public interface InitialVlanInfoProperty {
    /**
     * The CIDR block that you provide to create an Amazon EVS VLAN subnet.
     *
     * Amazon EVS VLAN subnets have a minimum CIDR block size of /28 and a maximum size of /24.
     * Amazon EVS VLAN subnet CIDR blocks must not overlap with other subnets in the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlaninfo.html#cfn-evs-environment-initialvlaninfo-cidr)
     */
    public fun cidr(): String

    /**
     * A builder for [InitialVlanInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidr The CIDR block that you provide to create an Amazon EVS VLAN subnet. 
       * Amazon EVS VLAN subnets have a minimum CIDR block size of /28 and a maximum size of /24.
       * Amazon EVS VLAN subnet CIDR blocks must not overlap with other subnets in the VPC.
       */
      public fun cidr(cidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlanInfoProperty.Builder =
          software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlanInfoProperty.builder()

      /**
       * @param cidr The CIDR block that you provide to create an Amazon EVS VLAN subnet. 
       * Amazon EVS VLAN subnets have a minimum CIDR block size of /28 and a maximum size of /24.
       * Amazon EVS VLAN subnet CIDR blocks must not overlap with other subnets in the VPC.
       */
      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      public fun build(): software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlanInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlanInfoProperty,
    ) : CdkObject(cdkObject),
        InitialVlanInfoProperty {
      /**
       * The CIDR block that you provide to create an Amazon EVS VLAN subnet.
       *
       * Amazon EVS VLAN subnets have a minimum CIDR block size of /28 and a maximum size of /24.
       * Amazon EVS VLAN subnet CIDR blocks must not overlap with other subnets in the VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlaninfo.html#cfn-evs-environment-initialvlaninfo-cidr)
       */
      override fun cidr(): String = unwrap(this).getCidr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InitialVlanInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlanInfoProperty):
          InitialVlanInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? InitialVlanInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InitialVlanInfoProperty):
          software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlanInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlanInfoProperty
    }
  }

  /**
   * Amazon EVS is in public preview release and is subject to change.
   *
   * The initial VLAN subnets for the environment. Amazon EVS VLAN subnets have a minimum CIDR block
   * size of /28 and a maximum size of /24. Amazon EVS VLAN subnet CIDR blocks must not overlap with
   * other subnets in the VPC.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evs.*;
   * InitialVlansProperty initialVlansProperty = InitialVlansProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html)
   */
  public interface InitialVlansProperty {
    /**
     * The edge VTEP VLAN subnet.
     *
     * This VLAN subnet manages traffic flowing between the internal network and external networks,
     * including internet access and other site connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-edgevtep)
     */
    public fun edgeVTep(): Any

    /**
     * An additional VLAN subnet that can be used to extend VCF capabilities once configured.
     *
     * For example, you can configure an expansion VLAN subnet to use NSX Federation for centralized
     * management and synchronization of multiple NSX deployments across different locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-expansionvlan1)
     */
    public fun expansionVlan1(): Any

    /**
     * An additional VLAN subnet that can be used to extend VCF capabilities once configured.
     *
     * For example, you can configure an expansion VLAN subnet to use NSX Federation for centralized
     * management and synchronization of multiple NSX deployments across different locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-expansionvlan2)
     */
    public fun expansionVlan2(): Any

    /**
     * The HCX VLAN subnet.
     *
     * This VLAN subnet allows the HCX Interconnnect (IX) and HCX Network Extension (NE) to reach
     * their peers and enable HCX Service Mesh creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-hcx)
     */
    public fun hcx(): Any

    /**
     * The NSX uplink VLAN subnet.
     *
     * This VLAN subnet allows connectivity to the NSX overlay network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-nsxuplink)
     */
    public fun nsxUpLink(): Any

    /**
     * The vMotion VLAN subnet.
     *
     * This VLAN subnet carries traffic for vSphere vMotion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-vmotion)
     */
    public fun vMotion(): Any

    /**
     * The vSAN VLAN subnet.
     *
     * This VLAN subnet carries the communication between ESXi hosts to implement a vSAN shared
     * storage pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-vsan)
     */
    public fun vSan(): Any

    /**
     * The VTEP VLAN subnet.
     *
     * This VLAN subnet handles internal network traffic between virtual machines within a VCF
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-vtep)
     */
    public fun vTep(): Any

    /**
     * The VM management VLAN subnet.
     *
     * This VLAN subnet carries traffic for vSphere virtual machines.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-vmmanagement)
     */
    public fun vmManagement(): Any

    /**
     * The host VMkernel management VLAN subnet.
     *
     * This VLAN subnet carries traffic for managing ESXi hosts and communicating with VMware
     * vCenter Server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-vmkmanagement)
     */
    public fun vmkManagement(): Any

    /**
     * A builder for [InitialVlansProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param edgeVTep The edge VTEP VLAN subnet. 
       * This VLAN subnet manages traffic flowing between the internal network and external
       * networks, including internet access and other site connections.
       */
      public fun edgeVTep(edgeVTep: IResolvable)

      /**
       * @param edgeVTep The edge VTEP VLAN subnet. 
       * This VLAN subnet manages traffic flowing between the internal network and external
       * networks, including internet access and other site connections.
       */
      public fun edgeVTep(edgeVTep: InitialVlanInfoProperty)

      /**
       * @param edgeVTep The edge VTEP VLAN subnet. 
       * This VLAN subnet manages traffic flowing between the internal network and external
       * networks, including internet access and other site connections.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ebb428e1722f6124bea2f8ff8700b11051ac630215192d52bc581dd6f64e063")
      public fun edgeVTep(edgeVTep: InitialVlanInfoProperty.Builder.() -> Unit)

      /**
       * @param expansionVlan1 An additional VLAN subnet that can be used to extend VCF capabilities
       * once configured. 
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       */
      public fun expansionVlan1(expansionVlan1: IResolvable)

      /**
       * @param expansionVlan1 An additional VLAN subnet that can be used to extend VCF capabilities
       * once configured. 
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       */
      public fun expansionVlan1(expansionVlan1: InitialVlanInfoProperty)

      /**
       * @param expansionVlan1 An additional VLAN subnet that can be used to extend VCF capabilities
       * once configured. 
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b798d4db5c6b4227253a7d5b5f2749609711b7945d1dd99ba30327abbd37fbcc")
      public fun expansionVlan1(expansionVlan1: InitialVlanInfoProperty.Builder.() -> Unit)

      /**
       * @param expansionVlan2 An additional VLAN subnet that can be used to extend VCF capabilities
       * once configured. 
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       */
      public fun expansionVlan2(expansionVlan2: IResolvable)

      /**
       * @param expansionVlan2 An additional VLAN subnet that can be used to extend VCF capabilities
       * once configured. 
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       */
      public fun expansionVlan2(expansionVlan2: InitialVlanInfoProperty)

      /**
       * @param expansionVlan2 An additional VLAN subnet that can be used to extend VCF capabilities
       * once configured. 
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0daaa961fd6637993c5fae1e64b589f734d97b718166d1c4a928c41d461c12ae")
      public fun expansionVlan2(expansionVlan2: InitialVlanInfoProperty.Builder.() -> Unit)

      /**
       * @param hcx The HCX VLAN subnet. 
       * This VLAN subnet allows the HCX Interconnnect (IX) and HCX Network Extension (NE) to reach
       * their peers and enable HCX Service Mesh creation.
       */
      public fun hcx(hcx: IResolvable)

      /**
       * @param hcx The HCX VLAN subnet. 
       * This VLAN subnet allows the HCX Interconnnect (IX) and HCX Network Extension (NE) to reach
       * their peers and enable HCX Service Mesh creation.
       */
      public fun hcx(hcx: InitialVlanInfoProperty)

      /**
       * @param hcx The HCX VLAN subnet. 
       * This VLAN subnet allows the HCX Interconnnect (IX) and HCX Network Extension (NE) to reach
       * their peers and enable HCX Service Mesh creation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c71aae8f754921d6dbe319e83ae6ee5f2416d5fb053c809b019a1553ffdeda26")
      public fun hcx(hcx: InitialVlanInfoProperty.Builder.() -> Unit)

      /**
       * @param nsxUpLink The NSX uplink VLAN subnet. 
       * This VLAN subnet allows connectivity to the NSX overlay network.
       */
      public fun nsxUpLink(nsxUpLink: IResolvable)

      /**
       * @param nsxUpLink The NSX uplink VLAN subnet. 
       * This VLAN subnet allows connectivity to the NSX overlay network.
       */
      public fun nsxUpLink(nsxUpLink: InitialVlanInfoProperty)

      /**
       * @param nsxUpLink The NSX uplink VLAN subnet. 
       * This VLAN subnet allows connectivity to the NSX overlay network.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1d7eb6a3fd969c3e11c76d23abf2f20d1f74cf311f977c34d465e4cac5ee2e0")
      public fun nsxUpLink(nsxUpLink: InitialVlanInfoProperty.Builder.() -> Unit)

      /**
       * @param vMotion The vMotion VLAN subnet. 
       * This VLAN subnet carries traffic for vSphere vMotion.
       */
      public fun vMotion(vMotion: IResolvable)

      /**
       * @param vMotion The vMotion VLAN subnet. 
       * This VLAN subnet carries traffic for vSphere vMotion.
       */
      public fun vMotion(vMotion: InitialVlanInfoProperty)

      /**
       * @param vMotion The vMotion VLAN subnet. 
       * This VLAN subnet carries traffic for vSphere vMotion.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee87412e26f8c9ec39f17b2e51dacb43b762e53d0f7bfef1e072f112cc50db84")
      public fun vMotion(vMotion: InitialVlanInfoProperty.Builder.() -> Unit)

      /**
       * @param vSan The vSAN VLAN subnet. 
       * This VLAN subnet carries the communication between ESXi hosts to implement a vSAN shared
       * storage pool.
       */
      public fun vSan(vSan: IResolvable)

      /**
       * @param vSan The vSAN VLAN subnet. 
       * This VLAN subnet carries the communication between ESXi hosts to implement a vSAN shared
       * storage pool.
       */
      public fun vSan(vSan: InitialVlanInfoProperty)

      /**
       * @param vSan The vSAN VLAN subnet. 
       * This VLAN subnet carries the communication between ESXi hosts to implement a vSAN shared
       * storage pool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdedfbb061d43c569789a7f45d26c000f75f574c8849865cd7105e567d8d19d9")
      public fun vSan(vSan: InitialVlanInfoProperty.Builder.() -> Unit)

      /**
       * @param vTep The VTEP VLAN subnet. 
       * This VLAN subnet handles internal network traffic between virtual machines within a VCF
       * instance.
       */
      public fun vTep(vTep: IResolvable)

      /**
       * @param vTep The VTEP VLAN subnet. 
       * This VLAN subnet handles internal network traffic between virtual machines within a VCF
       * instance.
       */
      public fun vTep(vTep: InitialVlanInfoProperty)

      /**
       * @param vTep The VTEP VLAN subnet. 
       * This VLAN subnet handles internal network traffic between virtual machines within a VCF
       * instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dc888d5d6209e02685bc693f15685e7c49c54a66090a403be5efafd4f65ae7d")
      public fun vTep(vTep: InitialVlanInfoProperty.Builder.() -> Unit)

      /**
       * @param vmManagement The VM management VLAN subnet. 
       * This VLAN subnet carries traffic for vSphere virtual machines.
       */
      public fun vmManagement(vmManagement: IResolvable)

      /**
       * @param vmManagement The VM management VLAN subnet. 
       * This VLAN subnet carries traffic for vSphere virtual machines.
       */
      public fun vmManagement(vmManagement: InitialVlanInfoProperty)

      /**
       * @param vmManagement The VM management VLAN subnet. 
       * This VLAN subnet carries traffic for vSphere virtual machines.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2087a023d21cce25b8f92e34b95edcaaa7aa1c5a2d7f80729b2304f78eeac290")
      public fun vmManagement(vmManagement: InitialVlanInfoProperty.Builder.() -> Unit)

      /**
       * @param vmkManagement The host VMkernel management VLAN subnet. 
       * This VLAN subnet carries traffic for managing ESXi hosts and communicating with VMware
       * vCenter Server.
       */
      public fun vmkManagement(vmkManagement: IResolvable)

      /**
       * @param vmkManagement The host VMkernel management VLAN subnet. 
       * This VLAN subnet carries traffic for managing ESXi hosts and communicating with VMware
       * vCenter Server.
       */
      public fun vmkManagement(vmkManagement: InitialVlanInfoProperty)

      /**
       * @param vmkManagement The host VMkernel management VLAN subnet. 
       * This VLAN subnet carries traffic for managing ESXi hosts and communicating with VMware
       * vCenter Server.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec9f688c9503c980409b65fc8c89527033f9b2fbdfc1ba926f5616d9ef935dbb")
      public fun vmkManagement(vmkManagement: InitialVlanInfoProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlansProperty.Builder =
          software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlansProperty.builder()

      /**
       * @param edgeVTep The edge VTEP VLAN subnet. 
       * This VLAN subnet manages traffic flowing between the internal network and external
       * networks, including internet access and other site connections.
       */
      override fun edgeVTep(edgeVTep: IResolvable) {
        cdkBuilder.edgeVTep(edgeVTep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param edgeVTep The edge VTEP VLAN subnet. 
       * This VLAN subnet manages traffic flowing between the internal network and external
       * networks, including internet access and other site connections.
       */
      override fun edgeVTep(edgeVTep: InitialVlanInfoProperty) {
        cdkBuilder.edgeVTep(edgeVTep.let(InitialVlanInfoProperty.Companion::unwrap))
      }

      /**
       * @param edgeVTep The edge VTEP VLAN subnet. 
       * This VLAN subnet manages traffic flowing between the internal network and external
       * networks, including internet access and other site connections.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ebb428e1722f6124bea2f8ff8700b11051ac630215192d52bc581dd6f64e063")
      override fun edgeVTep(edgeVTep: InitialVlanInfoProperty.Builder.() -> Unit): Unit =
          edgeVTep(InitialVlanInfoProperty(edgeVTep))

      /**
       * @param expansionVlan1 An additional VLAN subnet that can be used to extend VCF capabilities
       * once configured. 
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       */
      override fun expansionVlan1(expansionVlan1: IResolvable) {
        cdkBuilder.expansionVlan1(expansionVlan1.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param expansionVlan1 An additional VLAN subnet that can be used to extend VCF capabilities
       * once configured. 
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       */
      override fun expansionVlan1(expansionVlan1: InitialVlanInfoProperty) {
        cdkBuilder.expansionVlan1(expansionVlan1.let(InitialVlanInfoProperty.Companion::unwrap))
      }

      /**
       * @param expansionVlan1 An additional VLAN subnet that can be used to extend VCF capabilities
       * once configured. 
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b798d4db5c6b4227253a7d5b5f2749609711b7945d1dd99ba30327abbd37fbcc")
      override fun expansionVlan1(expansionVlan1: InitialVlanInfoProperty.Builder.() -> Unit): Unit
          = expansionVlan1(InitialVlanInfoProperty(expansionVlan1))

      /**
       * @param expansionVlan2 An additional VLAN subnet that can be used to extend VCF capabilities
       * once configured. 
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       */
      override fun expansionVlan2(expansionVlan2: IResolvable) {
        cdkBuilder.expansionVlan2(expansionVlan2.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param expansionVlan2 An additional VLAN subnet that can be used to extend VCF capabilities
       * once configured. 
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       */
      override fun expansionVlan2(expansionVlan2: InitialVlanInfoProperty) {
        cdkBuilder.expansionVlan2(expansionVlan2.let(InitialVlanInfoProperty.Companion::unwrap))
      }

      /**
       * @param expansionVlan2 An additional VLAN subnet that can be used to extend VCF capabilities
       * once configured. 
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0daaa961fd6637993c5fae1e64b589f734d97b718166d1c4a928c41d461c12ae")
      override fun expansionVlan2(expansionVlan2: InitialVlanInfoProperty.Builder.() -> Unit): Unit
          = expansionVlan2(InitialVlanInfoProperty(expansionVlan2))

      /**
       * @param hcx The HCX VLAN subnet. 
       * This VLAN subnet allows the HCX Interconnnect (IX) and HCX Network Extension (NE) to reach
       * their peers and enable HCX Service Mesh creation.
       */
      override fun hcx(hcx: IResolvable) {
        cdkBuilder.hcx(hcx.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param hcx The HCX VLAN subnet. 
       * This VLAN subnet allows the HCX Interconnnect (IX) and HCX Network Extension (NE) to reach
       * their peers and enable HCX Service Mesh creation.
       */
      override fun hcx(hcx: InitialVlanInfoProperty) {
        cdkBuilder.hcx(hcx.let(InitialVlanInfoProperty.Companion::unwrap))
      }

      /**
       * @param hcx The HCX VLAN subnet. 
       * This VLAN subnet allows the HCX Interconnnect (IX) and HCX Network Extension (NE) to reach
       * their peers and enable HCX Service Mesh creation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c71aae8f754921d6dbe319e83ae6ee5f2416d5fb053c809b019a1553ffdeda26")
      override fun hcx(hcx: InitialVlanInfoProperty.Builder.() -> Unit): Unit =
          hcx(InitialVlanInfoProperty(hcx))

      /**
       * @param nsxUpLink The NSX uplink VLAN subnet. 
       * This VLAN subnet allows connectivity to the NSX overlay network.
       */
      override fun nsxUpLink(nsxUpLink: IResolvable) {
        cdkBuilder.nsxUpLink(nsxUpLink.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nsxUpLink The NSX uplink VLAN subnet. 
       * This VLAN subnet allows connectivity to the NSX overlay network.
       */
      override fun nsxUpLink(nsxUpLink: InitialVlanInfoProperty) {
        cdkBuilder.nsxUpLink(nsxUpLink.let(InitialVlanInfoProperty.Companion::unwrap))
      }

      /**
       * @param nsxUpLink The NSX uplink VLAN subnet. 
       * This VLAN subnet allows connectivity to the NSX overlay network.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1d7eb6a3fd969c3e11c76d23abf2f20d1f74cf311f977c34d465e4cac5ee2e0")
      override fun nsxUpLink(nsxUpLink: InitialVlanInfoProperty.Builder.() -> Unit): Unit =
          nsxUpLink(InitialVlanInfoProperty(nsxUpLink))

      /**
       * @param vMotion The vMotion VLAN subnet. 
       * This VLAN subnet carries traffic for vSphere vMotion.
       */
      override fun vMotion(vMotion: IResolvable) {
        cdkBuilder.vMotion(vMotion.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vMotion The vMotion VLAN subnet. 
       * This VLAN subnet carries traffic for vSphere vMotion.
       */
      override fun vMotion(vMotion: InitialVlanInfoProperty) {
        cdkBuilder.vMotion(vMotion.let(InitialVlanInfoProperty.Companion::unwrap))
      }

      /**
       * @param vMotion The vMotion VLAN subnet. 
       * This VLAN subnet carries traffic for vSphere vMotion.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee87412e26f8c9ec39f17b2e51dacb43b762e53d0f7bfef1e072f112cc50db84")
      override fun vMotion(vMotion: InitialVlanInfoProperty.Builder.() -> Unit): Unit =
          vMotion(InitialVlanInfoProperty(vMotion))

      /**
       * @param vSan The vSAN VLAN subnet. 
       * This VLAN subnet carries the communication between ESXi hosts to implement a vSAN shared
       * storage pool.
       */
      override fun vSan(vSan: IResolvable) {
        cdkBuilder.vSan(vSan.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vSan The vSAN VLAN subnet. 
       * This VLAN subnet carries the communication between ESXi hosts to implement a vSAN shared
       * storage pool.
       */
      override fun vSan(vSan: InitialVlanInfoProperty) {
        cdkBuilder.vSan(vSan.let(InitialVlanInfoProperty.Companion::unwrap))
      }

      /**
       * @param vSan The vSAN VLAN subnet. 
       * This VLAN subnet carries the communication between ESXi hosts to implement a vSAN shared
       * storage pool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdedfbb061d43c569789a7f45d26c000f75f574c8849865cd7105e567d8d19d9")
      override fun vSan(vSan: InitialVlanInfoProperty.Builder.() -> Unit): Unit =
          vSan(InitialVlanInfoProperty(vSan))

      /**
       * @param vTep The VTEP VLAN subnet. 
       * This VLAN subnet handles internal network traffic between virtual machines within a VCF
       * instance.
       */
      override fun vTep(vTep: IResolvable) {
        cdkBuilder.vTep(vTep.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vTep The VTEP VLAN subnet. 
       * This VLAN subnet handles internal network traffic between virtual machines within a VCF
       * instance.
       */
      override fun vTep(vTep: InitialVlanInfoProperty) {
        cdkBuilder.vTep(vTep.let(InitialVlanInfoProperty.Companion::unwrap))
      }

      /**
       * @param vTep The VTEP VLAN subnet. 
       * This VLAN subnet handles internal network traffic between virtual machines within a VCF
       * instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dc888d5d6209e02685bc693f15685e7c49c54a66090a403be5efafd4f65ae7d")
      override fun vTep(vTep: InitialVlanInfoProperty.Builder.() -> Unit): Unit =
          vTep(InitialVlanInfoProperty(vTep))

      /**
       * @param vmManagement The VM management VLAN subnet. 
       * This VLAN subnet carries traffic for vSphere virtual machines.
       */
      override fun vmManagement(vmManagement: IResolvable) {
        cdkBuilder.vmManagement(vmManagement.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vmManagement The VM management VLAN subnet. 
       * This VLAN subnet carries traffic for vSphere virtual machines.
       */
      override fun vmManagement(vmManagement: InitialVlanInfoProperty) {
        cdkBuilder.vmManagement(vmManagement.let(InitialVlanInfoProperty.Companion::unwrap))
      }

      /**
       * @param vmManagement The VM management VLAN subnet. 
       * This VLAN subnet carries traffic for vSphere virtual machines.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2087a023d21cce25b8f92e34b95edcaaa7aa1c5a2d7f80729b2304f78eeac290")
      override fun vmManagement(vmManagement: InitialVlanInfoProperty.Builder.() -> Unit): Unit =
          vmManagement(InitialVlanInfoProperty(vmManagement))

      /**
       * @param vmkManagement The host VMkernel management VLAN subnet. 
       * This VLAN subnet carries traffic for managing ESXi hosts and communicating with VMware
       * vCenter Server.
       */
      override fun vmkManagement(vmkManagement: IResolvable) {
        cdkBuilder.vmkManagement(vmkManagement.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vmkManagement The host VMkernel management VLAN subnet. 
       * This VLAN subnet carries traffic for managing ESXi hosts and communicating with VMware
       * vCenter Server.
       */
      override fun vmkManagement(vmkManagement: InitialVlanInfoProperty) {
        cdkBuilder.vmkManagement(vmkManagement.let(InitialVlanInfoProperty.Companion::unwrap))
      }

      /**
       * @param vmkManagement The host VMkernel management VLAN subnet. 
       * This VLAN subnet carries traffic for managing ESXi hosts and communicating with VMware
       * vCenter Server.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec9f688c9503c980409b65fc8c89527033f9b2fbdfc1ba926f5616d9ef935dbb")
      override fun vmkManagement(vmkManagement: InitialVlanInfoProperty.Builder.() -> Unit): Unit =
          vmkManagement(InitialVlanInfoProperty(vmkManagement))

      public fun build(): software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlansProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlansProperty,
    ) : CdkObject(cdkObject),
        InitialVlansProperty {
      /**
       * The edge VTEP VLAN subnet.
       *
       * This VLAN subnet manages traffic flowing between the internal network and external
       * networks, including internet access and other site connections.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-edgevtep)
       */
      override fun edgeVTep(): Any = unwrap(this).getEdgeVTep()

      /**
       * An additional VLAN subnet that can be used to extend VCF capabilities once configured.
       *
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-expansionvlan1)
       */
      override fun expansionVlan1(): Any = unwrap(this).getExpansionVlan1()

      /**
       * An additional VLAN subnet that can be used to extend VCF capabilities once configured.
       *
       * For example, you can configure an expansion VLAN subnet to use NSX Federation for
       * centralized management and synchronization of multiple NSX deployments across different
       * locations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-expansionvlan2)
       */
      override fun expansionVlan2(): Any = unwrap(this).getExpansionVlan2()

      /**
       * The HCX VLAN subnet.
       *
       * This VLAN subnet allows the HCX Interconnnect (IX) and HCX Network Extension (NE) to reach
       * their peers and enable HCX Service Mesh creation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-hcx)
       */
      override fun hcx(): Any = unwrap(this).getHcx()

      /**
       * The NSX uplink VLAN subnet.
       *
       * This VLAN subnet allows connectivity to the NSX overlay network.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-nsxuplink)
       */
      override fun nsxUpLink(): Any = unwrap(this).getNsxUpLink()

      /**
       * The vMotion VLAN subnet.
       *
       * This VLAN subnet carries traffic for vSphere vMotion.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-vmotion)
       */
      override fun vMotion(): Any = unwrap(this).getVMotion()

      /**
       * The vSAN VLAN subnet.
       *
       * This VLAN subnet carries the communication between ESXi hosts to implement a vSAN shared
       * storage pool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-vsan)
       */
      override fun vSan(): Any = unwrap(this).getVSan()

      /**
       * The VTEP VLAN subnet.
       *
       * This VLAN subnet handles internal network traffic between virtual machines within a VCF
       * instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-vtep)
       */
      override fun vTep(): Any = unwrap(this).getVTep()

      /**
       * The VM management VLAN subnet.
       *
       * This VLAN subnet carries traffic for vSphere virtual machines.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-vmmanagement)
       */
      override fun vmManagement(): Any = unwrap(this).getVmManagement()

      /**
       * The host VMkernel management VLAN subnet.
       *
       * This VLAN subnet carries traffic for managing ESXi hosts and communicating with VMware
       * vCenter Server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-initialvlans.html#cfn-evs-environment-initialvlans-vmkmanagement)
       */
      override fun vmkManagement(): Any = unwrap(this).getVmkManagement()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InitialVlansProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlansProperty):
          InitialVlansProperty = CdkObjectWrappers.wrap(cdkObject) as? InitialVlansProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InitialVlansProperty):
          software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlansProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.evs.CfnEnvironment.InitialVlansProperty
    }
  }

  /**
   * Amazon EVS is in public preview release and is subject to change.
   *
   * The license information that Amazon EVS requires to create an environment. Amazon EVS requires
   * two license keys: a VCF solution key and a vSAN license key.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evs.*;
   * LicenseInfoProperty licenseInfoProperty = LicenseInfoProperty.builder()
   * .solutionKey("solutionKey")
   * .vsanKey("vsanKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-licenseinfo.html)
   */
  public interface LicenseInfoProperty {
    /**
     * The VCF solution key.
     *
     * This license unlocks VMware VCF product features, including vSphere, NSX, SDDC Manager, and
     * vCenter Server. The VCF solution key must cover a minimum of 256 cores.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-licenseinfo.html#cfn-evs-environment-licenseinfo-solutionkey)
     */
    public fun solutionKey(): String

    /**
     * The VSAN license key.
     *
     * This license unlocks vSAN features. The vSAN license key must provide at least 110 TiB of
     * vSAN capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-licenseinfo.html#cfn-evs-environment-licenseinfo-vsankey)
     */
    public fun vsanKey(): String

    /**
     * A builder for [LicenseInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param solutionKey The VCF solution key. 
       * This license unlocks VMware VCF product features, including vSphere, NSX, SDDC Manager, and
       * vCenter Server. The VCF solution key must cover a minimum of 256 cores.
       */
      public fun solutionKey(solutionKey: String)

      /**
       * @param vsanKey The VSAN license key. 
       * This license unlocks vSAN features. The vSAN license key must provide at least 110 TiB of
       * vSAN capacity.
       */
      public fun vsanKey(vsanKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evs.CfnEnvironment.LicenseInfoProperty.Builder =
          software.amazon.awscdk.services.evs.CfnEnvironment.LicenseInfoProperty.builder()

      /**
       * @param solutionKey The VCF solution key. 
       * This license unlocks VMware VCF product features, including vSphere, NSX, SDDC Manager, and
       * vCenter Server. The VCF solution key must cover a minimum of 256 cores.
       */
      override fun solutionKey(solutionKey: String) {
        cdkBuilder.solutionKey(solutionKey)
      }

      /**
       * @param vsanKey The VSAN license key. 
       * This license unlocks vSAN features. The vSAN license key must provide at least 110 TiB of
       * vSAN capacity.
       */
      override fun vsanKey(vsanKey: String) {
        cdkBuilder.vsanKey(vsanKey)
      }

      public fun build(): software.amazon.awscdk.services.evs.CfnEnvironment.LicenseInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.LicenseInfoProperty,
    ) : CdkObject(cdkObject),
        LicenseInfoProperty {
      /**
       * The VCF solution key.
       *
       * This license unlocks VMware VCF product features, including vSphere, NSX, SDDC Manager, and
       * vCenter Server. The VCF solution key must cover a minimum of 256 cores.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-licenseinfo.html#cfn-evs-environment-licenseinfo-solutionkey)
       */
      override fun solutionKey(): String = unwrap(this).getSolutionKey()

      /**
       * The VSAN license key.
       *
       * This license unlocks vSAN features. The vSAN license key must provide at least 110 TiB of
       * vSAN capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-licenseinfo.html#cfn-evs-environment-licenseinfo-vsankey)
       */
      override fun vsanKey(): String = unwrap(this).getVsanKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LicenseInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.LicenseInfoProperty):
          LicenseInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? LicenseInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LicenseInfoProperty):
          software.amazon.awscdk.services.evs.CfnEnvironment.LicenseInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.evs.CfnEnvironment.LicenseInfoProperty
    }
  }

  /**
   * Amazon EVS is in public preview release and is subject to change.
   *
   * A managed secret that contains the credentials for installing vCenter Server, NSX, and SDDC
   * Manager. During environment creation, the Amazon EVS control plane uses AWS Secrets Manager to
   * create, encrypt, validate, and store secrets. If you choose to delete your environment, Amazon EVS
   * also deletes the secrets that are associated with your environment. Amazon EVS does not provide
   * managed rotation of secrets. We recommend that you rotate secrets regularly to ensure that secrets
   * are not long-lived.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evs.*;
   * SecretProperty secretProperty = SecretProperty.builder()
   * .secretArn("secretArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-secret.html)
   */
  public interface SecretProperty {
    /**
     * The Amazon Resource Name (ARN) of the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-secret.html#cfn-evs-environment-secret-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * A builder for [SecretProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param secretArn The Amazon Resource Name (ARN) of the secret.
       */
      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evs.CfnEnvironment.SecretProperty.Builder =
          software.amazon.awscdk.services.evs.CfnEnvironment.SecretProperty.builder()

      /**
       * @param secretArn The Amazon Resource Name (ARN) of the secret.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build(): software.amazon.awscdk.services.evs.CfnEnvironment.SecretProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.SecretProperty,
    ) : CdkObject(cdkObject),
        SecretProperty {
      /**
       * The Amazon Resource Name (ARN) of the secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-secret.html#cfn-evs-environment-secret-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.SecretProperty):
          SecretProperty = CdkObjectWrappers.wrap(cdkObject) as? SecretProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretProperty):
          software.amazon.awscdk.services.evs.CfnEnvironment.SecretProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.evs.CfnEnvironment.SecretProperty
    }
  }

  /**
   * Amazon EVS is in public preview release and is subject to change.
   *
   * The security groups that allow traffic between the Amazon EVS control plane and your VPC for
   * Amazon EVS service access. If a security group is not specified, Amazon EVS uses the default
   * security group in your account for service access.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evs.*;
   * ServiceAccessSecurityGroupsProperty serviceAccessSecurityGroupsProperty =
   * ServiceAccessSecurityGroupsProperty.builder()
   * .securityGroups(List.of("securityGroups"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-serviceaccesssecuritygroups.html)
   */
  public interface ServiceAccessSecurityGroupsProperty {
    /**
     * The security groups that allow service access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-serviceaccesssecuritygroups.html#cfn-evs-environment-serviceaccesssecuritygroups-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * A builder for [ServiceAccessSecurityGroupsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroups The security groups that allow service access.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups The security groups that allow service access.
       */
      public fun securityGroups(vararg securityGroups: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evs.CfnEnvironment.ServiceAccessSecurityGroupsProperty.Builder
          =
          software.amazon.awscdk.services.evs.CfnEnvironment.ServiceAccessSecurityGroupsProperty.builder()

      /**
       * @param securityGroups The security groups that allow service access.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups The security groups that allow service access.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      public fun build():
          software.amazon.awscdk.services.evs.CfnEnvironment.ServiceAccessSecurityGroupsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.ServiceAccessSecurityGroupsProperty,
    ) : CdkObject(cdkObject),
        ServiceAccessSecurityGroupsProperty {
      /**
       * The security groups that allow service access.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-serviceaccesssecuritygroups.html#cfn-evs-environment-serviceaccesssecuritygroups-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceAccessSecurityGroupsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.ServiceAccessSecurityGroupsProperty):
          ServiceAccessSecurityGroupsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceAccessSecurityGroupsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceAccessSecurityGroupsProperty):
          software.amazon.awscdk.services.evs.CfnEnvironment.ServiceAccessSecurityGroupsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.evs.CfnEnvironment.ServiceAccessSecurityGroupsProperty
    }
  }

  /**
   * Amazon EVS is in public preview release and is subject to change.
   *
   * The DNS hostnames that Amazon EVS uses to install VMware vCenter Server, NSX, SDDC Manager, and
   * Cloud Builder. Each hostname must be unique, and resolve to a domain name that you've registered
   * in your DNS service of choice. Hostnames cannot be changed.
   *
   * VMware VCF requires the deployment of two NSX Edge nodes, and three NSX Manager virtual
   * machines.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.evs.*;
   * VcfHostnamesProperty vcfHostnamesProperty = VcfHostnamesProperty.builder()
   * .cloudBuilder("cloudBuilder")
   * .nsx("nsx")
   * .nsxEdge1("nsxEdge1")
   * .nsxEdge2("nsxEdge2")
   * .nsxManager1("nsxManager1")
   * .nsxManager2("nsxManager2")
   * .nsxManager3("nsxManager3")
   * .sddcManager("sddcManager")
   * .vCenter("vCenter")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html)
   */
  public interface VcfHostnamesProperty {
    /**
     * The hostname for VMware Cloud Builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-cloudbuilder)
     */
    public fun cloudBuilder(): String

    /**
     * The VMware NSX hostname.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-nsx)
     */
    public fun nsx(): String

    /**
     * The hostname for the first NSX Edge node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-nsxedge1)
     */
    public fun nsxEdge1(): String

    /**
     * The hostname for the second NSX Edge node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-nsxedge2)
     */
    public fun nsxEdge2(): String

    /**
     * The hostname for the first VMware NSX Manager virtual machine (VM).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-nsxmanager1)
     */
    public fun nsxManager1(): String

    /**
     * The hostname for the second VMware NSX Manager virtual machine (VM).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-nsxmanager2)
     */
    public fun nsxManager2(): String

    /**
     * The hostname for the third VMware NSX Manager virtual machine (VM).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-nsxmanager3)
     */
    public fun nsxManager3(): String

    /**
     * The hostname for SDDC Manager.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-sddcmanager)
     */
    public fun sddcManager(): String

    /**
     * The VMware vCenter hostname.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-vcenter)
     */
    public fun vCenter(): String

    /**
     * A builder for [VcfHostnamesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudBuilder The hostname for VMware Cloud Builder. 
       */
      public fun cloudBuilder(cloudBuilder: String)

      /**
       * @param nsx The VMware NSX hostname. 
       */
      public fun nsx(nsx: String)

      /**
       * @param nsxEdge1 The hostname for the first NSX Edge node. 
       */
      public fun nsxEdge1(nsxEdge1: String)

      /**
       * @param nsxEdge2 The hostname for the second NSX Edge node. 
       */
      public fun nsxEdge2(nsxEdge2: String)

      /**
       * @param nsxManager1 The hostname for the first VMware NSX Manager virtual machine (VM). 
       */
      public fun nsxManager1(nsxManager1: String)

      /**
       * @param nsxManager2 The hostname for the second VMware NSX Manager virtual machine (VM). 
       */
      public fun nsxManager2(nsxManager2: String)

      /**
       * @param nsxManager3 The hostname for the third VMware NSX Manager virtual machine (VM). 
       */
      public fun nsxManager3(nsxManager3: String)

      /**
       * @param sddcManager The hostname for SDDC Manager. 
       */
      public fun sddcManager(sddcManager: String)

      /**
       * @param vCenter The VMware vCenter hostname. 
       */
      public fun vCenter(vCenter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evs.CfnEnvironment.VcfHostnamesProperty.Builder =
          software.amazon.awscdk.services.evs.CfnEnvironment.VcfHostnamesProperty.builder()

      /**
       * @param cloudBuilder The hostname for VMware Cloud Builder. 
       */
      override fun cloudBuilder(cloudBuilder: String) {
        cdkBuilder.cloudBuilder(cloudBuilder)
      }

      /**
       * @param nsx The VMware NSX hostname. 
       */
      override fun nsx(nsx: String) {
        cdkBuilder.nsx(nsx)
      }

      /**
       * @param nsxEdge1 The hostname for the first NSX Edge node. 
       */
      override fun nsxEdge1(nsxEdge1: String) {
        cdkBuilder.nsxEdge1(nsxEdge1)
      }

      /**
       * @param nsxEdge2 The hostname for the second NSX Edge node. 
       */
      override fun nsxEdge2(nsxEdge2: String) {
        cdkBuilder.nsxEdge2(nsxEdge2)
      }

      /**
       * @param nsxManager1 The hostname for the first VMware NSX Manager virtual machine (VM). 
       */
      override fun nsxManager1(nsxManager1: String) {
        cdkBuilder.nsxManager1(nsxManager1)
      }

      /**
       * @param nsxManager2 The hostname for the second VMware NSX Manager virtual machine (VM). 
       */
      override fun nsxManager2(nsxManager2: String) {
        cdkBuilder.nsxManager2(nsxManager2)
      }

      /**
       * @param nsxManager3 The hostname for the third VMware NSX Manager virtual machine (VM). 
       */
      override fun nsxManager3(nsxManager3: String) {
        cdkBuilder.nsxManager3(nsxManager3)
      }

      /**
       * @param sddcManager The hostname for SDDC Manager. 
       */
      override fun sddcManager(sddcManager: String) {
        cdkBuilder.sddcManager(sddcManager)
      }

      /**
       * @param vCenter The VMware vCenter hostname. 
       */
      override fun vCenter(vCenter: String) {
        cdkBuilder.vCenter(vCenter)
      }

      public fun build(): software.amazon.awscdk.services.evs.CfnEnvironment.VcfHostnamesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.VcfHostnamesProperty,
    ) : CdkObject(cdkObject),
        VcfHostnamesProperty {
      /**
       * The hostname for VMware Cloud Builder.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-cloudbuilder)
       */
      override fun cloudBuilder(): String = unwrap(this).getCloudBuilder()

      /**
       * The VMware NSX hostname.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-nsx)
       */
      override fun nsx(): String = unwrap(this).getNsx()

      /**
       * The hostname for the first NSX Edge node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-nsxedge1)
       */
      override fun nsxEdge1(): String = unwrap(this).getNsxEdge1()

      /**
       * The hostname for the second NSX Edge node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-nsxedge2)
       */
      override fun nsxEdge2(): String = unwrap(this).getNsxEdge2()

      /**
       * The hostname for the first VMware NSX Manager virtual machine (VM).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-nsxmanager1)
       */
      override fun nsxManager1(): String = unwrap(this).getNsxManager1()

      /**
       * The hostname for the second VMware NSX Manager virtual machine (VM).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-nsxmanager2)
       */
      override fun nsxManager2(): String = unwrap(this).getNsxManager2()

      /**
       * The hostname for the third VMware NSX Manager virtual machine (VM).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-nsxmanager3)
       */
      override fun nsxManager3(): String = unwrap(this).getNsxManager3()

      /**
       * The hostname for SDDC Manager.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-sddcmanager)
       */
      override fun sddcManager(): String = unwrap(this).getSddcManager()

      /**
       * The VMware vCenter hostname.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evs-environment-vcfhostnames.html#cfn-evs-environment-vcfhostnames-vcenter)
       */
      override fun vCenter(): String = unwrap(this).getVCenter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VcfHostnamesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evs.CfnEnvironment.VcfHostnamesProperty):
          VcfHostnamesProperty = CdkObjectWrappers.wrap(cdkObject) as? VcfHostnamesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VcfHostnamesProperty):
          software.amazon.awscdk.services.evs.CfnEnvironment.VcfHostnamesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.evs.CfnEnvironment.VcfHostnamesProperty
    }
  }
}
