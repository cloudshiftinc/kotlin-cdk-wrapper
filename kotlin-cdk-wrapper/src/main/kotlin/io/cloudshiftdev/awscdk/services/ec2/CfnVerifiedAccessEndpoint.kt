@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AWS Verified Access endpoint specifies the application that AWS Verified Access provides
 * access to.
 *
 * It must be attached to an AWS Verified Access group. An AWS Verified Access endpoint must also
 * have an attached access policy before you attached it to a group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVerifiedAccessEndpoint cfnVerifiedAccessEndpoint =
 * CfnVerifiedAccessEndpoint.Builder.create(this, "MyCfnVerifiedAccessEndpoint")
 * .applicationDomain("applicationDomain")
 * .attachmentType("attachmentType")
 * .domainCertificateArn("domainCertificateArn")
 * .endpointDomainPrefix("endpointDomainPrefix")
 * .endpointType("endpointType")
 * .verifiedAccessGroupId("verifiedAccessGroupId")
 * // the properties below are optional
 * .description("description")
 * .loadBalancerOptions(LoadBalancerOptionsProperty.builder()
 * .loadBalancerArn("loadBalancerArn")
 * .port(123)
 * .protocol("protocol")
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .networkInterfaceOptions(NetworkInterfaceOptionsProperty.builder()
 * .networkInterfaceId("networkInterfaceId")
 * .port(123)
 * .protocol("protocol")
 * .build())
 * .policyDocument("policyDocument")
 * .policyEnabled(false)
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
public open class CfnVerifiedAccessEndpoint(
  cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVerifiedAccessEndpointProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnVerifiedAccessEndpointProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVerifiedAccessEndpointProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVerifiedAccessEndpointProps(props)
  )

  /**
   * The DNS name for users to reach your application.
   */
  public open fun applicationDomain(): String = unwrap(this).getApplicationDomain()

  /**
   * The DNS name for users to reach your application.
   */
  public open fun applicationDomain(`value`: String) {
    unwrap(this).setApplicationDomain(`value`)
  }

  /**
   * The type of attachment used to provide connectivity between the AWS Verified Access endpoint
   * and the application.
   */
  public open fun attachmentType(): String = unwrap(this).getAttachmentType()

  /**
   * The type of attachment used to provide connectivity between the AWS Verified Access endpoint
   * and the application.
   */
  public open fun attachmentType(`value`: String) {
    unwrap(this).setAttachmentType(`value`)
  }

  /**
   * The creation time.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * Use this to construct the redirect URI to add to your OIDC provider's allow list.
   */
  public open fun attrDeviceValidationDomain(): String =
      unwrap(this).getAttrDeviceValidationDomain()

  /**
   * The DNS name generated for the endpoint.
   */
  public open fun attrEndpointDomain(): String = unwrap(this).getAttrEndpointDomain()

  /**
   * The last updated time.
   */
  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  /**
   * The endpoint status.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The ID of the Verified Access endpoint.
   */
  public open fun attrVerifiedAccessEndpointId(): String =
      unwrap(this).getAttrVerifiedAccessEndpointId()

  /**
   * The instance identifier.
   */
  public open fun attrVerifiedAccessInstanceId(): String =
      unwrap(this).getAttrVerifiedAccessInstanceId()

  /**
   * A description for the AWS Verified Access endpoint.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the AWS Verified Access endpoint.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ARN of a public TLS/SSL certificate imported into or created with ACM.
   */
  public open fun domainCertificateArn(): String = unwrap(this).getDomainCertificateArn()

  /**
   * The ARN of a public TLS/SSL certificate imported into or created with ACM.
   */
  public open fun domainCertificateArn(`value`: String) {
    unwrap(this).setDomainCertificateArn(`value`)
  }

  /**
   * A custom identifier that is prepended to the DNS name that is generated for the endpoint.
   */
  public open fun endpointDomainPrefix(): String = unwrap(this).getEndpointDomainPrefix()

  /**
   * A custom identifier that is prepended to the DNS name that is generated for the endpoint.
   */
  public open fun endpointDomainPrefix(`value`: String) {
    unwrap(this).setEndpointDomainPrefix(`value`)
  }

  /**
   * The type of AWS Verified Access endpoint.
   */
  public open fun endpointType(): String = unwrap(this).getEndpointType()

  /**
   * The type of AWS Verified Access endpoint.
   */
  public open fun endpointType(`value`: String) {
    unwrap(this).setEndpointType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer` type.
   */
  public open fun loadBalancerOptions(): Any? = unwrap(this).getLoadBalancerOptions()

  /**
   * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer` type.
   */
  public open fun loadBalancerOptions(`value`: IResolvable) {
    unwrap(this).setLoadBalancerOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer` type.
   */
  public open fun loadBalancerOptions(`value`: LoadBalancerOptionsProperty) {
    unwrap(this).setLoadBalancerOptions(`value`.let(LoadBalancerOptionsProperty::unwrap))
  }

  /**
   * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer` type.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a124788efaf0789ac8ba6402764765993e15413edebaed50f0fd022ca6528b6")
  public open fun loadBalancerOptions(`value`: LoadBalancerOptionsProperty.Builder.() -> Unit): Unit
      = loadBalancerOptions(LoadBalancerOptionsProperty(`value`))

  /**
   * The options for network-interface type endpoint.
   */
  public open fun networkInterfaceOptions(): Any? = unwrap(this).getNetworkInterfaceOptions()

  /**
   * The options for network-interface type endpoint.
   */
  public open fun networkInterfaceOptions(`value`: IResolvable) {
    unwrap(this).setNetworkInterfaceOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The options for network-interface type endpoint.
   */
  public open fun networkInterfaceOptions(`value`: NetworkInterfaceOptionsProperty) {
    unwrap(this).setNetworkInterfaceOptions(`value`.let(NetworkInterfaceOptionsProperty::unwrap))
  }

  /**
   * The options for network-interface type endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8337e634bb339ea7c0b6c5700f18e57880bbed9f22f8e02d7ce517292a2e577")
  public open
      fun networkInterfaceOptions(`value`: NetworkInterfaceOptionsProperty.Builder.() -> Unit): Unit
      = networkInterfaceOptions(NetworkInterfaceOptionsProperty(`value`))

  /**
   * The Verified Access policy document.
   */
  public open fun policyDocument(): String? = unwrap(this).getPolicyDocument()

  /**
   * The Verified Access policy document.
   */
  public open fun policyDocument(`value`: String) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * The status of the Verified Access policy.
   */
  public open fun policyEnabled(): Any? = unwrap(this).getPolicyEnabled()

  /**
   * The status of the Verified Access policy.
   */
  public open fun policyEnabled(`value`: Boolean) {
    unwrap(this).setPolicyEnabled(`value`)
  }

  /**
   * The status of the Verified Access policy.
   */
  public open fun policyEnabled(`value`: IResolvable) {
    unwrap(this).setPolicyEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The IDs of the security groups for the endpoint.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The IDs of the security groups for the endpoint.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The IDs of the security groups for the endpoint.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The options for additional server side encryption.
   */
  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * The options for additional server side encryption.
   */
  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * The options for additional server side encryption.
   */
  public open fun sseSpecification(`value`: SseSpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SseSpecificationProperty::unwrap))
  }

  /**
   * The options for additional server side encryption.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f32d85d924ae65480defb821300c1182d571b5d5dbd7911712e1ba2c787447ff")
  public open fun sseSpecification(`value`: SseSpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SseSpecificationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the AWS Verified Access group.
   */
  public open fun verifiedAccessGroupId(): String = unwrap(this).getVerifiedAccessGroupId()

  /**
   * The ID of the AWS Verified Access group.
   */
  public open fun verifiedAccessGroupId(`value`: String) {
    unwrap(this).setVerifiedAccessGroupId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVerifiedAccessEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The DNS name for users to reach your application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-applicationdomain)
     * @param applicationDomain The DNS name for users to reach your application. 
     */
    public fun applicationDomain(applicationDomain: String)

    /**
     * The type of attachment used to provide connectivity between the AWS Verified Access endpoint
     * and the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-attachmenttype)
     * @param attachmentType The type of attachment used to provide connectivity between the AWS
     * Verified Access endpoint and the application. 
     */
    public fun attachmentType(attachmentType: String)

    /**
     * A description for the AWS Verified Access endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-description)
     * @param description A description for the AWS Verified Access endpoint. 
     */
    public fun description(description: String)

    /**
     * The ARN of a public TLS/SSL certificate imported into or created with ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-domaincertificatearn)
     * @param domainCertificateArn The ARN of a public TLS/SSL certificate imported into or created
     * with ACM. 
     */
    public fun domainCertificateArn(domainCertificateArn: String)

    /**
     * A custom identifier that is prepended to the DNS name that is generated for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-endpointdomainprefix)
     * @param endpointDomainPrefix A custom identifier that is prepended to the DNS name that is
     * generated for the endpoint. 
     */
    public fun endpointDomainPrefix(endpointDomainPrefix: String)

    /**
     * The type of AWS Verified Access endpoint.
     *
     * Incoming application requests will be sent to an IP address, load balancer or a network
     * interface depending on the endpoint type specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-endpointtype)
     * @param endpointType The type of AWS Verified Access endpoint. 
     */
    public fun endpointType(endpointType: String)

    /**
     * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer`
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions)
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     * endpoint as `load-balancer` type. 
     */
    public fun loadBalancerOptions(loadBalancerOptions: IResolvable)

    /**
     * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer`
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions)
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     * endpoint as `load-balancer` type. 
     */
    public fun loadBalancerOptions(loadBalancerOptions: LoadBalancerOptionsProperty)

    /**
     * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer`
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions)
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     * endpoint as `load-balancer` type. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("143e30768e84ff117f0de95a9204553a81b007de64b519d78dda6c2e926011c5")
    public
        fun loadBalancerOptions(loadBalancerOptions: LoadBalancerOptionsProperty.Builder.() -> Unit)

    /**
     * The options for network-interface type endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions)
     * @param networkInterfaceOptions The options for network-interface type endpoint. 
     */
    public fun networkInterfaceOptions(networkInterfaceOptions: IResolvable)

    /**
     * The options for network-interface type endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions)
     * @param networkInterfaceOptions The options for network-interface type endpoint. 
     */
    public fun networkInterfaceOptions(networkInterfaceOptions: NetworkInterfaceOptionsProperty)

    /**
     * The options for network-interface type endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions)
     * @param networkInterfaceOptions The options for network-interface type endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93b2625a3c0c0e0f890aae64cb437a3d456fd501658d5fff8b2c449e92f2d719")
    public
        fun networkInterfaceOptions(networkInterfaceOptions: NetworkInterfaceOptionsProperty.Builder.() -> Unit)

    /**
     * The Verified Access policy document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policydocument)
     * @param policyDocument The Verified Access policy document. 
     */
    public fun policyDocument(policyDocument: String)

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policyenabled)
     * @param policyEnabled The status of the Verified Access policy. 
     */
    public fun policyEnabled(policyEnabled: Boolean)

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policyenabled)
     * @param policyEnabled The status of the Verified Access policy. 
     */
    public fun policyEnabled(policyEnabled: IResolvable)

    /**
     * The IDs of the security groups for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-securitygroupids)
     * @param securityGroupIds The IDs of the security groups for the endpoint. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The IDs of the security groups for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-securitygroupids)
     * @param securityGroupIds The IDs of the security groups for the endpoint. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    public fun sseSpecification(sseSpecification: SseSpecificationProperty)

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90791316987fd26f73cbd2cfebc78c4966a8f66169472336106115aafd42b831")
    public fun sseSpecification(sseSpecification: SseSpecificationProperty.Builder.() -> Unit)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-tags)
     * @param tags The tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-tags)
     * @param tags The tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the AWS Verified Access group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-verifiedaccessgroupid)
     * @param verifiedAccessGroupId The ID of the AWS Verified Access group. 
     */
    public fun verifiedAccessGroupId(verifiedAccessGroupId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.Builder.create(scope, id)

    /**
     * The DNS name for users to reach your application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-applicationdomain)
     * @param applicationDomain The DNS name for users to reach your application. 
     */
    override fun applicationDomain(applicationDomain: String) {
      cdkBuilder.applicationDomain(applicationDomain)
    }

    /**
     * The type of attachment used to provide connectivity between the AWS Verified Access endpoint
     * and the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-attachmenttype)
     * @param attachmentType The type of attachment used to provide connectivity between the AWS
     * Verified Access endpoint and the application. 
     */
    override fun attachmentType(attachmentType: String) {
      cdkBuilder.attachmentType(attachmentType)
    }

    /**
     * A description for the AWS Verified Access endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-description)
     * @param description A description for the AWS Verified Access endpoint. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ARN of a public TLS/SSL certificate imported into or created with ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-domaincertificatearn)
     * @param domainCertificateArn The ARN of a public TLS/SSL certificate imported into or created
     * with ACM. 
     */
    override fun domainCertificateArn(domainCertificateArn: String) {
      cdkBuilder.domainCertificateArn(domainCertificateArn)
    }

    /**
     * A custom identifier that is prepended to the DNS name that is generated for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-endpointdomainprefix)
     * @param endpointDomainPrefix A custom identifier that is prepended to the DNS name that is
     * generated for the endpoint. 
     */
    override fun endpointDomainPrefix(endpointDomainPrefix: String) {
      cdkBuilder.endpointDomainPrefix(endpointDomainPrefix)
    }

    /**
     * The type of AWS Verified Access endpoint.
     *
     * Incoming application requests will be sent to an IP address, load balancer or a network
     * interface depending on the endpoint type specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-endpointtype)
     * @param endpointType The type of AWS Verified Access endpoint. 
     */
    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    /**
     * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer`
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions)
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     * endpoint as `load-balancer` type. 
     */
    override fun loadBalancerOptions(loadBalancerOptions: IResolvable) {
      cdkBuilder.loadBalancerOptions(loadBalancerOptions.let(IResolvable::unwrap))
    }

    /**
     * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer`
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions)
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     * endpoint as `load-balancer` type. 
     */
    override fun loadBalancerOptions(loadBalancerOptions: LoadBalancerOptionsProperty) {
      cdkBuilder.loadBalancerOptions(loadBalancerOptions.let(LoadBalancerOptionsProperty::unwrap))
    }

    /**
     * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer`
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions)
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     * endpoint as `load-balancer` type. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("143e30768e84ff117f0de95a9204553a81b007de64b519d78dda6c2e926011c5")
    override
        fun loadBalancerOptions(loadBalancerOptions: LoadBalancerOptionsProperty.Builder.() -> Unit):
        Unit = loadBalancerOptions(LoadBalancerOptionsProperty(loadBalancerOptions))

    /**
     * The options for network-interface type endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions)
     * @param networkInterfaceOptions The options for network-interface type endpoint. 
     */
    override fun networkInterfaceOptions(networkInterfaceOptions: IResolvable) {
      cdkBuilder.networkInterfaceOptions(networkInterfaceOptions.let(IResolvable::unwrap))
    }

    /**
     * The options for network-interface type endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions)
     * @param networkInterfaceOptions The options for network-interface type endpoint. 
     */
    override fun networkInterfaceOptions(networkInterfaceOptions: NetworkInterfaceOptionsProperty) {
      cdkBuilder.networkInterfaceOptions(networkInterfaceOptions.let(NetworkInterfaceOptionsProperty::unwrap))
    }

    /**
     * The options for network-interface type endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions)
     * @param networkInterfaceOptions The options for network-interface type endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93b2625a3c0c0e0f890aae64cb437a3d456fd501658d5fff8b2c449e92f2d719")
    override
        fun networkInterfaceOptions(networkInterfaceOptions: NetworkInterfaceOptionsProperty.Builder.() -> Unit):
        Unit = networkInterfaceOptions(NetworkInterfaceOptionsProperty(networkInterfaceOptions))

    /**
     * The Verified Access policy document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policydocument)
     * @param policyDocument The Verified Access policy document. 
     */
    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policyenabled)
     * @param policyEnabled The status of the Verified Access policy. 
     */
    override fun policyEnabled(policyEnabled: Boolean) {
      cdkBuilder.policyEnabled(policyEnabled)
    }

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policyenabled)
     * @param policyEnabled The status of the Verified Access policy. 
     */
    override fun policyEnabled(policyEnabled: IResolvable) {
      cdkBuilder.policyEnabled(policyEnabled.let(IResolvable::unwrap))
    }

    /**
     * The IDs of the security groups for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-securitygroupids)
     * @param securityGroupIds The IDs of the security groups for the endpoint. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The IDs of the security groups for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-securitygroupids)
     * @param securityGroupIds The IDs of the security groups for the endpoint. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    override fun sseSpecification(sseSpecification: SseSpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SseSpecificationProperty::unwrap))
    }

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-ssespecification)
     * @param sseSpecification The options for additional server side encryption. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90791316987fd26f73cbd2cfebc78c4966a8f66169472336106115aafd42b831")
    override fun sseSpecification(sseSpecification: SseSpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(SseSpecificationProperty(sseSpecification))

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-tags)
     * @param tags The tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-tags)
     * @param tags The tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the AWS Verified Access group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-verifiedaccessgroupid)
     * @param verifiedAccessGroupId The ID of the AWS Verified Access group. 
     */
    override fun verifiedAccessGroupId(verifiedAccessGroupId: String) {
      cdkBuilder.verifiedAccessGroupId(verifiedAccessGroupId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVerifiedAccessEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVerifiedAccessEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint):
        CfnVerifiedAccessEndpoint = CfnVerifiedAccessEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessEndpoint):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint
  }

  /**
   * Describes the load balancer options when creating an AWS Verified Access endpoint using the
   * `load-balancer` type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * LoadBalancerOptionsProperty loadBalancerOptionsProperty = LoadBalancerOptionsProperty.builder()
   * .loadBalancerArn("loadBalancerArn")
   * .port(123)
   * .protocol("protocol")
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-loadbalanceroptions.html)
   */
  public interface LoadBalancerOptionsProperty {
    /**
     * The ARN of the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-loadbalanceroptions.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions-loadbalancerarn)
     */
    public fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    /**
     * The IP port number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-loadbalanceroptions.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The IP protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-loadbalanceroptions.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * The IDs of the subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-loadbalanceroptions.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A builder for [LoadBalancerOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param loadBalancerArn The ARN of the load balancer.
       */
      public fun loadBalancerArn(loadBalancerArn: String)

      /**
       * @param port The IP port number.
       */
      public fun port(port: Number)

      /**
       * @param protocol The IP protocol.
       */
      public fun protocol(protocol: String)

      /**
       * @param subnetIds The IDs of the subnets.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The IDs of the subnets.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.builder()

      /**
       * @param loadBalancerArn The ARN of the load balancer.
       */
      override fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
      }

      /**
       * @param port The IP port number.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param protocol The IP protocol.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param subnetIds The IDs of the subnets.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The IDs of the subnets.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty,
    ) : CdkObject(cdkObject), LoadBalancerOptionsProperty {
      /**
       * The ARN of the load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-loadbalanceroptions.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions-loadbalancerarn)
       */
      override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

      /**
       * The IP port number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-loadbalanceroptions.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The IP protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-loadbalanceroptions.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()

      /**
       * The IDs of the subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-loadbalanceroptions.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty):
          LoadBalancerOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoadBalancerOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancerOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty
    }
  }

  /**
   * Describes the network interface options when creating an AWS Verified Access endpoint using the
   * `network-interface` type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * NetworkInterfaceOptionsProperty networkInterfaceOptionsProperty =
   * NetworkInterfaceOptionsProperty.builder()
   * .networkInterfaceId("networkInterfaceId")
   * .port(123)
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-networkinterfaceoptions.html)
   */
  public interface NetworkInterfaceOptionsProperty {
    /**
     * The ID of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-networkinterfaceoptions.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions-networkinterfaceid)
     */
    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    /**
     * The IP port number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-networkinterfaceoptions.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The IP protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-networkinterfaceoptions.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * A builder for [NetworkInterfaceOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param networkInterfaceId The ID of the network interface.
       */
      public fun networkInterfaceId(networkInterfaceId: String)

      /**
       * @param port The IP port number.
       */
      public fun port(port: Number)

      /**
       * @param protocol The IP protocol.
       */
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.builder()

      /**
       * @param networkInterfaceId The ID of the network interface.
       */
      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      /**
       * @param port The IP port number.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param protocol The IP protocol.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceOptionsProperty {
      /**
       * The ID of the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-networkinterfaceoptions.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions-networkinterfaceid)
       */
      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      /**
       * The IP port number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-networkinterfaceoptions.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The IP protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-networkinterfaceoptions.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty):
          NetworkInterfaceOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NetworkInterfaceOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty
    }
  }

  /**
   * AWS Verified Access provides server side encryption by default to data at rest using AWS -owned
   * KMS keys.
   *
   * You also have the option of using customer managed KMS keys, which can be specified using the
   * options below.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * SseSpecificationProperty sseSpecificationProperty = SseSpecificationProperty.builder()
   * .customerManagedKeyEnabled(false)
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-ssespecification.html)
   */
  public interface SseSpecificationProperty {
    /**
     * Enable or disable the use of customer managed KMS keys for server side encryption.
     *
     * Valid values: `True` | `False`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-ssespecification.html#cfn-ec2-verifiedaccessendpoint-ssespecification-customermanagedkeyenabled)
     */
    public fun customerManagedKeyEnabled(): Any? = unwrap(this).getCustomerManagedKeyEnabled()

    /**
     * The ARN of the KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-ssespecification.html#cfn-ec2-verifiedaccessendpoint-ssespecification-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A builder for [SseSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
       * server side encryption.
       * Valid values: `True` | `False`
       */
      public fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean)

      /**
       * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
       * server side encryption.
       * Valid values: `True` | `False`
       */
      public fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable)

      /**
       * @param kmsKeyArn The ARN of the KMS key.
       */
      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty.builder()

      /**
       * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
       * server side encryption.
       * Valid values: `True` | `False`
       */
      override fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled)
      }

      /**
       * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
       * server side encryption.
       * Valid values: `True` | `False`
       */
      override fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param kmsKeyArn The ARN of the KMS key.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty,
    ) : CdkObject(cdkObject), SseSpecificationProperty {
      /**
       * Enable or disable the use of customer managed KMS keys for server side encryption.
       *
       * Valid values: `True` | `False`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-ssespecification.html#cfn-ec2-verifiedaccessendpoint-ssespecification-customermanagedkeyenabled)
       */
      override fun customerManagedKeyEnabled(): Any? = unwrap(this).getCustomerManagedKeyEnabled()

      /**
       * The ARN of the KMS key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-ssespecification.html#cfn-ec2-verifiedaccessendpoint-ssespecification-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty):
          SseSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as? SseSpecificationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint.SseSpecificationProperty
    }
  }
}
