@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Instantiates an auto-scaling virtual server based on the selected file transfer protocol in AWS .
 *
 * When you make updates to your file transfer protocol-enabled server or when you work with users,
 * use the service-generated `ServerId` property that is assigned to the newly created server.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.transfer.*;
 * CfnServer cfnServer = CfnServer.Builder.create(this, "MyCfnServer")
 * .certificate("certificate")
 * .domain("domain")
 * .endpointDetails(EndpointDetailsProperty.builder()
 * .addressAllocationIds(List.of("addressAllocationIds"))
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcEndpointId("vpcEndpointId")
 * .vpcId("vpcId")
 * .build())
 * .endpointType("endpointType")
 * .identityProviderDetails(IdentityProviderDetailsProperty.builder()
 * .directoryId("directoryId")
 * .function("function")
 * .invocationRole("invocationRole")
 * .sftpAuthenticationMethods("sftpAuthenticationMethods")
 * .url("url")
 * .build())
 * .identityProviderType("identityProviderType")
 * .loggingRole("loggingRole")
 * .postAuthenticationLoginBanner("postAuthenticationLoginBanner")
 * .preAuthenticationLoginBanner("preAuthenticationLoginBanner")
 * .protocolDetails(ProtocolDetailsProperty.builder()
 * .as2Transports(List.of("as2Transports"))
 * .passiveIp("passiveIp")
 * .setStatOption("setStatOption")
 * .tlsSessionResumptionMode("tlsSessionResumptionMode")
 * .build())
 * .protocols(List.of("protocols"))
 * .s3StorageOptions(S3StorageOptionsProperty.builder()
 * .directoryListingOptimization("directoryListingOptimization")
 * .build())
 * .securityPolicyName("securityPolicyName")
 * .structuredLogDestinations(List.of("structuredLogDestinations"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workflowDetails(WorkflowDetailsProperty.builder()
 * .onPartialUpload(List.of(WorkflowDetailProperty.builder()
 * .executionRole("executionRole")
 * .workflowId("workflowId")
 * .build()))
 * .onUpload(List.of(WorkflowDetailProperty.builder()
 * .executionRole("executionRole")
 * .workflowId("workflowId")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html)
 */
public open class CfnServer(
  cdkObject: software.amazon.awscdk.services.transfer.CfnServer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.transfer.CfnServer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServerProps,
  ) :
      this(software.amazon.awscdk.services.transfer.CfnServer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnServerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnServerProps(props)
  )

  /**
   * The Amazon Resource Name associated with the server, in the form `arn:aws:transfer:region:
   * *account-id* :server/ *server-id* /` .
   *
   * An example of a server ARN is:
   * `arn:aws:transfer:us-east-1:123456789012:server/s-01234567890abcdef` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The service-assigned ID of the server that is created.
   *
   * An example `ServerId` is `s-01234567890abcdef` .
   */
  public open fun attrServerId(): String = unwrap(this).getAttrServerId()

  /**
   * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM) certificate.
   */
  public open fun certificate(): String? = unwrap(this).getCertificate()

  /**
   * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM) certificate.
   */
  public open fun certificate(`value`: String) {
    unwrap(this).setCertificate(`value`)
  }

  /**
   * Specifies the domain of the storage system that is used for file transfers.
   */
  public open fun domain(): String? = unwrap(this).getDomain()

  /**
   * Specifies the domain of the storage system that is used for file transfers.
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  /**
   * The virtual private cloud (VPC) endpoint settings that are configured for your server.
   */
  public open fun endpointDetails(): Any? = unwrap(this).getEndpointDetails()

  /**
   * The virtual private cloud (VPC) endpoint settings that are configured for your server.
   */
  public open fun endpointDetails(`value`: IResolvable) {
    unwrap(this).setEndpointDetails(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The virtual private cloud (VPC) endpoint settings that are configured for your server.
   */
  public open fun endpointDetails(`value`: EndpointDetailsProperty) {
    unwrap(this).setEndpointDetails(`value`.let(EndpointDetailsProperty.Companion::unwrap))
  }

  /**
   * The virtual private cloud (VPC) endpoint settings that are configured for your server.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9248c1e476b7aa73977f8fa65f42edbe0686363da48ae7407f52925dc9724ade")
  public open fun endpointDetails(`value`: EndpointDetailsProperty.Builder.() -> Unit): Unit =
      endpointDetails(EndpointDetailsProperty(`value`))

  /**
   * The type of endpoint that you want your server to use.
   */
  public open fun endpointType(): String? = unwrap(this).getEndpointType()

  /**
   * The type of endpoint that you want your server to use.
   */
  public open fun endpointType(`value`: String) {
    unwrap(this).setEndpointType(`value`)
  }

  /**
   * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
   * `API_GATEWAY` .
   */
  public open fun identityProviderDetails(): Any? = unwrap(this).getIdentityProviderDetails()

  /**
   * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
   * `API_GATEWAY` .
   */
  public open fun identityProviderDetails(`value`: IResolvable) {
    unwrap(this).setIdentityProviderDetails(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
   * `API_GATEWAY` .
   */
  public open fun identityProviderDetails(`value`: IdentityProviderDetailsProperty) {
    unwrap(this).setIdentityProviderDetails(`value`.let(IdentityProviderDetailsProperty.Companion::unwrap))
  }

  /**
   * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
   * `API_GATEWAY` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e73d3ec6a0016eb519bdac51e0d36a3d5d1bdfe9fdb8d215ae37d2b92cced963")
  public open
      fun identityProviderDetails(`value`: IdentityProviderDetailsProperty.Builder.() -> Unit): Unit
      = identityProviderDetails(IdentityProviderDetailsProperty(`value`))

  /**
   * The mode of authentication for a server.
   */
  public open fun identityProviderType(): String? = unwrap(this).getIdentityProviderType()

  /**
   * The mode of authentication for a server.
   */
  public open fun identityProviderType(`value`: String) {
    unwrap(this).setIdentityProviderType(`value`)
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
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that allows
   * a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents.
   */
  public open fun loggingRole(): String? = unwrap(this).getLoggingRole()

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that allows
   * a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents.
   */
  public open fun loggingRole(`value`: String) {
    unwrap(this).setLoggingRole(`value`)
  }

  /**
   * Specifies a string to display when users connect to a server.
   *
   * This string is displayed after the user authenticates.
   */
  public open fun postAuthenticationLoginBanner(): String? =
      unwrap(this).getPostAuthenticationLoginBanner()

  /**
   * Specifies a string to display when users connect to a server.
   *
   * This string is displayed after the user authenticates.
   */
  public open fun postAuthenticationLoginBanner(`value`: String) {
    unwrap(this).setPostAuthenticationLoginBanner(`value`)
  }

  /**
   * Specifies a string to display when users connect to a server.
   */
  public open fun preAuthenticationLoginBanner(): String? =
      unwrap(this).getPreAuthenticationLoginBanner()

  /**
   * Specifies a string to display when users connect to a server.
   */
  public open fun preAuthenticationLoginBanner(`value`: String) {
    unwrap(this).setPreAuthenticationLoginBanner(`value`)
  }

  /**
   * The protocol settings that are configured for your server.
   */
  public open fun protocolDetails(): Any? = unwrap(this).getProtocolDetails()

  /**
   * The protocol settings that are configured for your server.
   */
  public open fun protocolDetails(`value`: IResolvable) {
    unwrap(this).setProtocolDetails(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The protocol settings that are configured for your server.
   */
  public open fun protocolDetails(`value`: ProtocolDetailsProperty) {
    unwrap(this).setProtocolDetails(`value`.let(ProtocolDetailsProperty.Companion::unwrap))
  }

  /**
   * The protocol settings that are configured for your server.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("03951fca7913f7e63e432ef91c6f77c51fbdaaac60ec58f0590bb8ac6288e316")
  public open fun protocolDetails(`value`: ProtocolDetailsProperty.Builder.() -> Unit): Unit =
      protocolDetails(ProtocolDetailsProperty(`value`))

  /**
   * Specifies the file transfer protocol or protocols over which your file transfer protocol client
   * can connect to your server's endpoint.
   */
  public open fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

  /**
   * Specifies the file transfer protocol or protocols over which your file transfer protocol client
   * can connect to your server's endpoint.
   */
  public open fun protocols(`value`: List<String>) {
    unwrap(this).setProtocols(`value`)
  }

  /**
   * Specifies the file transfer protocol or protocols over which your file transfer protocol client
   * can connect to your server's endpoint.
   */
  public open fun protocols(vararg `value`: String): Unit = protocols(`value`.toList())

  /**
   * Specifies whether or not performance for your Amazon S3 directories is optimized.
   *
   * This is disabled by default.
   */
  public open fun s3StorageOptions(): Any? = unwrap(this).getS3StorageOptions()

  /**
   * Specifies whether or not performance for your Amazon S3 directories is optimized.
   *
   * This is disabled by default.
   */
  public open fun s3StorageOptions(`value`: IResolvable) {
    unwrap(this).setS3StorageOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies whether or not performance for your Amazon S3 directories is optimized.
   *
   * This is disabled by default.
   */
  public open fun s3StorageOptions(`value`: S3StorageOptionsProperty) {
    unwrap(this).setS3StorageOptions(`value`.let(S3StorageOptionsProperty.Companion::unwrap))
  }

  /**
   * Specifies whether or not performance for your Amazon S3 directories is optimized.
   *
   * This is disabled by default.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("803382341c7075b476f354623c495bcadf2ea00bca87af7ff63b4bd8585fe539")
  public open fun s3StorageOptions(`value`: S3StorageOptionsProperty.Builder.() -> Unit): Unit =
      s3StorageOptions(S3StorageOptionsProperty(`value`))

  /**
   * Specifies the name of the security policy for the server.
   */
  public open fun securityPolicyName(): String? = unwrap(this).getSecurityPolicyName()

  /**
   * Specifies the name of the security policy for the server.
   */
  public open fun securityPolicyName(`value`: String) {
    unwrap(this).setSecurityPolicyName(`value`)
  }

  /**
   * Specifies the log groups to which your server logs are sent.
   */
  public open fun structuredLogDestinations(): List<String> =
      unwrap(this).getStructuredLogDestinations() ?: emptyList()

  /**
   * Specifies the log groups to which your server logs are sent.
   */
  public open fun structuredLogDestinations(`value`: List<String>) {
    unwrap(this).setStructuredLogDestinations(`value`)
  }

  /**
   * Specifies the log groups to which your server logs are sent.
   */
  public open fun structuredLogDestinations(vararg `value`: String): Unit =
      structuredLogDestinations(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs that can be used to group and search for servers.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key-value pairs that can be used to group and search for servers.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Key-value pairs that can be used to group and search for servers.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Specifies the workflow ID for the workflow to assign and the execution role that's used for
   * executing the workflow.
   */
  public open fun workflowDetails(): Any? = unwrap(this).getWorkflowDetails()

  /**
   * Specifies the workflow ID for the workflow to assign and the execution role that's used for
   * executing the workflow.
   */
  public open fun workflowDetails(`value`: IResolvable) {
    unwrap(this).setWorkflowDetails(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the workflow ID for the workflow to assign and the execution role that's used for
   * executing the workflow.
   */
  public open fun workflowDetails(`value`: WorkflowDetailsProperty) {
    unwrap(this).setWorkflowDetails(`value`.let(WorkflowDetailsProperty.Companion::unwrap))
  }

  /**
   * Specifies the workflow ID for the workflow to assign and the execution role that's used for
   * executing the workflow.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8dbe5ea55055b01f6b208a2a8c15192e828c064b9a093572185f4d6fbebb08d7")
  public open fun workflowDetails(`value`: WorkflowDetailsProperty.Builder.() -> Unit): Unit =
      workflowDetails(WorkflowDetailsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.transfer.CfnServer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM) certificate.
     *
     * Required when `Protocols` is set to `FTPS` .
     *
     * To request a new public certificate, see [Request a public
     * certificate](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-public.html) in the
     * *AWS Certificate Manager User Guide* .
     *
     * To import an existing certificate into ACM, see [Importing certificates into
     * ACM](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the *AWS
     * Certificate Manager User Guide* .
     *
     * To request a private certificate to use FTPS through private IP addresses, see [Request a
     * private
     * certificate](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-private.html) in
     * the *AWS Certificate Manager User Guide* .
     *
     * Certificates with the following cryptographic algorithms and key sizes are supported:
     *
     * * 2048-bit RSA (RSA_2048)
     * * 4096-bit RSA (RSA_4096)
     * * Elliptic Prime Curve 256 bit (EC_prime256v1)
     * * Elliptic Prime Curve 384 bit (EC_secp384r1)
     * * Elliptic Prime Curve 521 bit (EC_secp521r1)
     *
     *
     * The certificate must be a valid SSL/TLS X.509 version 3 certificate with FQDN or IP address
     * specified and information about the issuer.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-certificate)
     * @param certificate The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM)
     * certificate. 
     */
    public fun certificate(certificate: String)

    /**
     * Specifies the domain of the storage system that is used for file transfers.
     *
     * There are two domains available: Amazon Simple Storage Service (Amazon S3) and Amazon Elastic
     * File System (Amazon EFS). The default value is S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-domain)
     * @param domain Specifies the domain of the storage system that is used for file transfers. 
     */
    public fun domain(domain: String)

    /**
     * The virtual private cloud (VPC) endpoint settings that are configured for your server.
     *
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointdetails)
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that are configured
     * for your server. 
     */
    public fun endpointDetails(endpointDetails: IResolvable)

    /**
     * The virtual private cloud (VPC) endpoint settings that are configured for your server.
     *
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointdetails)
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that are configured
     * for your server. 
     */
    public fun endpointDetails(endpointDetails: EndpointDetailsProperty)

    /**
     * The virtual private cloud (VPC) endpoint settings that are configured for your server.
     *
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointdetails)
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that are configured
     * for your server. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf0a236db158e33b6465b83db4fee875e78a60764aeaeab4a59b5a8275e50fa2")
    public fun endpointDetails(endpointDetails: EndpointDetailsProperty.Builder.() -> Unit)

    /**
     * The type of endpoint that you want your server to use.
     *
     * You can choose to make your server's endpoint publicly accessible (PUBLIC) or host it inside
     * your VPC. With an endpoint that is hosted in a VPC, you can restrict access to your server and
     * resources only within your VPC or choose to make it internet facing by attaching Elastic IP
     * addresses directly to it.
     *
     *
     * After May 19, 2021, you won't be able to create a server using `EndpointType=VPC_ENDPOINT` in
     * your AWS account if your account hasn't already done so before May 19, 2021. If you have already
     * created servers with `EndpointType=VPC_ENDPOINT` in your AWS account on or before May 19, 2021,
     * you will not be affected. After this date, use `EndpointType` = `VPC` .
     *
     * For more information, see [Discontinuing the use of
     * VPC_ENDPOINT](https://docs.aws.amazon.com//transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint)
     * .
     *
     * It is recommended that you use `VPC` as the `EndpointType` . With this endpoint type, you
     * have the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with
     * your server's endpoint and use VPC security groups to restrict traffic by the client's public IP
     * address. This is not possible with `EndpointType` set to `VPC_ENDPOINT` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointtype)
     * @param endpointType The type of endpoint that you want your server to use. 
     */
    public fun endpointType(endpointType: String)

    /**
     * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
     * `API_GATEWAY` .
     *
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityproviderdetails)
     * @param identityProviderDetails Required when `IdentityProviderType` is set to
     * `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or `API_GATEWAY` . 
     */
    public fun identityProviderDetails(identityProviderDetails: IResolvable)

    /**
     * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
     * `API_GATEWAY` .
     *
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityproviderdetails)
     * @param identityProviderDetails Required when `IdentityProviderType` is set to
     * `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or `API_GATEWAY` . 
     */
    public fun identityProviderDetails(identityProviderDetails: IdentityProviderDetailsProperty)

    /**
     * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
     * `API_GATEWAY` .
     *
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityproviderdetails)
     * @param identityProviderDetails Required when `IdentityProviderType` is set to
     * `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or `API_GATEWAY` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24ae31b6e5fbf0065d8de2b14590fdff805ca7ab2469499255b6d601154a318e")
    public
        fun identityProviderDetails(identityProviderDetails: IdentityProviderDetailsProperty.Builder.() -> Unit)

    /**
     * The mode of authentication for a server.
     *
     * The default value is `SERVICE_MANAGED` , which allows you to store and access user
     * credentials within the AWS Transfer Family service.
     *
     * Use `AWS_DIRECTORY_SERVICE` to provide access to Active Directory groups in AWS Directory
     * Service for Microsoft Active Directory or Microsoft Active Directory in your on-premises
     * environment or in AWS using AD Connector. This option also requires you to provide a Directory
     * ID by using the `IdentityProviderDetails` parameter.
     *
     * Use the `API_GATEWAY` value to integrate with an identity provider of your choosing. The
     * `API_GATEWAY` setting requires you to provide an Amazon API Gateway endpoint URL to call for
     * authentication by using the `IdentityProviderDetails` parameter.
     *
     * Use the `AWS_LAMBDA` value to directly use an AWS Lambda function as your identity provider.
     * If you choose this value, you must specify the ARN for the Lambda function in the `Function`
     * parameter for the `IdentityProviderDetails` data type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityprovidertype)
     * @param identityProviderType The mode of authentication for a server. 
     */
    public fun identityProviderType(identityProviderType: String)

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents.
     *
     * When set, you can view user activity in your CloudWatch logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-loggingrole)
     * @param loggingRole The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon
     * EFSevents. 
     */
    public fun loggingRole(loggingRole: String)

    /**
     * Specifies a string to display when users connect to a server. This string is displayed after
     * the user authenticates.
     *
     *
     * The SFTP protocol does not support post-authentication display banners.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-postauthenticationloginbanner)
     * @param postAuthenticationLoginBanner Specifies a string to display when users connect to a
     * server. This string is displayed after the user authenticates. 
     */
    public fun postAuthenticationLoginBanner(postAuthenticationLoginBanner: String)

    /**
     * Specifies a string to display when users connect to a server.
     *
     * This string is displayed before the user authenticates. For example, the following banner
     * displays details about using the system:
     *
     * `This system is for the use of authorized users only. Individuals using this computer system
     * without authority, or in excess of their authority, are subject to having all of their
     * activities on this system monitored and recorded by system personnel.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-preauthenticationloginbanner)
     * @param preAuthenticationLoginBanner Specifies a string to display when users connect to a
     * server. 
     */
    public fun preAuthenticationLoginBanner(preAuthenticationLoginBanner: String)

    /**
     * The protocol settings that are configured for your server.
     *
     * * To indicate passive mode (for FTP and FTPS protocols), use the `PassiveIp` parameter. Enter
     * a single dotted-quad IPv4 address, such as the external IP address of a firewall, router, or
     * load balancer.
     * * To ignore the error that is generated when the client attempts to use the `SETSTAT` command
     * on a file that you are uploading to an Amazon S3 bucket, use the `SetStatOption` parameter. To
     * have the AWS Transfer Family server ignore the `SETSTAT` command and upload files without
     * needing to make any changes to your SFTP client, set the value to `ENABLE_NO_OP` . If you set
     * the `SetStatOption` parameter to `ENABLE_NO_OP` , Transfer Family generates a log entry to
     * Amazon CloudWatch Logs, so that you can determine when the client is making a `SETSTAT` call.
     * * To determine whether your AWS Transfer Family server resumes recent, negotiated sessions
     * through a unique session ID, use the `TlsSessionResumptionMode` parameter.
     * * `As2Transports` indicates the transport method for the AS2 messages. Currently, only HTTP
     * is supported.
     *
     * The `Protocols` parameter is an array of strings.
     *
     * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocoldetails)
     * @param protocolDetails The protocol settings that are configured for your server. 
     */
    public fun protocolDetails(protocolDetails: IResolvable)

    /**
     * The protocol settings that are configured for your server.
     *
     * * To indicate passive mode (for FTP and FTPS protocols), use the `PassiveIp` parameter. Enter
     * a single dotted-quad IPv4 address, such as the external IP address of a firewall, router, or
     * load balancer.
     * * To ignore the error that is generated when the client attempts to use the `SETSTAT` command
     * on a file that you are uploading to an Amazon S3 bucket, use the `SetStatOption` parameter. To
     * have the AWS Transfer Family server ignore the `SETSTAT` command and upload files without
     * needing to make any changes to your SFTP client, set the value to `ENABLE_NO_OP` . If you set
     * the `SetStatOption` parameter to `ENABLE_NO_OP` , Transfer Family generates a log entry to
     * Amazon CloudWatch Logs, so that you can determine when the client is making a `SETSTAT` call.
     * * To determine whether your AWS Transfer Family server resumes recent, negotiated sessions
     * through a unique session ID, use the `TlsSessionResumptionMode` parameter.
     * * `As2Transports` indicates the transport method for the AS2 messages. Currently, only HTTP
     * is supported.
     *
     * The `Protocols` parameter is an array of strings.
     *
     * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocoldetails)
     * @param protocolDetails The protocol settings that are configured for your server. 
     */
    public fun protocolDetails(protocolDetails: ProtocolDetailsProperty)

    /**
     * The protocol settings that are configured for your server.
     *
     * * To indicate passive mode (for FTP and FTPS protocols), use the `PassiveIp` parameter. Enter
     * a single dotted-quad IPv4 address, such as the external IP address of a firewall, router, or
     * load balancer.
     * * To ignore the error that is generated when the client attempts to use the `SETSTAT` command
     * on a file that you are uploading to an Amazon S3 bucket, use the `SetStatOption` parameter. To
     * have the AWS Transfer Family server ignore the `SETSTAT` command and upload files without
     * needing to make any changes to your SFTP client, set the value to `ENABLE_NO_OP` . If you set
     * the `SetStatOption` parameter to `ENABLE_NO_OP` , Transfer Family generates a log entry to
     * Amazon CloudWatch Logs, so that you can determine when the client is making a `SETSTAT` call.
     * * To determine whether your AWS Transfer Family server resumes recent, negotiated sessions
     * through a unique session ID, use the `TlsSessionResumptionMode` parameter.
     * * `As2Transports` indicates the transport method for the AS2 messages. Currently, only HTTP
     * is supported.
     *
     * The `Protocols` parameter is an array of strings.
     *
     * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocoldetails)
     * @param protocolDetails The protocol settings that are configured for your server. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccc7183bb666df2becd469fea8bddfeb4f843e9946ac8688388de90179b8c491")
    public fun protocolDetails(protocolDetails: ProtocolDetailsProperty.Builder.() -> Unit)

    /**
     * Specifies the file transfer protocol or protocols over which your file transfer protocol
     * client can connect to your server's endpoint.
     *
     * The available protocols are:
     *
     * * `SFTP` (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * * `FTPS` (File Transfer Protocol Secure): File transfer with TLS encryption
     * * `FTP` (File Transfer Protocol): Unencrypted file transfer
     * * `AS2` (Applicability Statement 2): used for transporting structured business-to-business
     * data
     *
     *
     * * If you select `FTPS` , you must choose a certificate stored in AWS Certificate Manager
     * (ACM) which is used to identify your server when clients connect to it over FTPS.
     * * If `Protocol` includes either `FTP` or `FTPS` , then the `EndpointType` must be `VPC` and
     * the `IdentityProviderType` must be either `AWS_DIRECTORY_SERVICE` , `AWS_LAMBDA` , or
     * `API_GATEWAY` .
     * * If `Protocol` includes `FTP` , then `AddressAllocationIds` cannot be associated.
     * * If `Protocol` is set only to `SFTP` , the `EndpointType` can be set to `PUBLIC` and the
     * `IdentityProviderType` can be set any of the supported identity types: `SERVICE_MANAGED` ,
     * `AWS_DIRECTORY_SERVICE` , `AWS_LAMBDA` , or `API_GATEWAY` .
     * * If `Protocol` includes `AS2` , then the `EndpointType` must be `VPC` , and domain must be
     * Amazon S3.
     *
     *
     * The `Protocols` parameter is an array of strings.
     *
     * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocols)
     * @param protocols Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint. 
     */
    public fun protocols(protocols: List<String>)

    /**
     * Specifies the file transfer protocol or protocols over which your file transfer protocol
     * client can connect to your server's endpoint.
     *
     * The available protocols are:
     *
     * * `SFTP` (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * * `FTPS` (File Transfer Protocol Secure): File transfer with TLS encryption
     * * `FTP` (File Transfer Protocol): Unencrypted file transfer
     * * `AS2` (Applicability Statement 2): used for transporting structured business-to-business
     * data
     *
     *
     * * If you select `FTPS` , you must choose a certificate stored in AWS Certificate Manager
     * (ACM) which is used to identify your server when clients connect to it over FTPS.
     * * If `Protocol` includes either `FTP` or `FTPS` , then the `EndpointType` must be `VPC` and
     * the `IdentityProviderType` must be either `AWS_DIRECTORY_SERVICE` , `AWS_LAMBDA` , or
     * `API_GATEWAY` .
     * * If `Protocol` includes `FTP` , then `AddressAllocationIds` cannot be associated.
     * * If `Protocol` is set only to `SFTP` , the `EndpointType` can be set to `PUBLIC` and the
     * `IdentityProviderType` can be set any of the supported identity types: `SERVICE_MANAGED` ,
     * `AWS_DIRECTORY_SERVICE` , `AWS_LAMBDA` , or `API_GATEWAY` .
     * * If `Protocol` includes `AS2` , then the `EndpointType` must be `VPC` , and domain must be
     * Amazon S3.
     *
     *
     * The `Protocols` parameter is an array of strings.
     *
     * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocols)
     * @param protocols Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint. 
     */
    public fun protocols(vararg protocols: String)

    /**
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is
     * disabled by default.
     *
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-s3storageoptions)
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories
     * is optimized. This is disabled by default. 
     */
    public fun s3StorageOptions(s3StorageOptions: IResolvable)

    /**
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is
     * disabled by default.
     *
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-s3storageoptions)
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories
     * is optimized. This is disabled by default. 
     */
    public fun s3StorageOptions(s3StorageOptions: S3StorageOptionsProperty)

    /**
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is
     * disabled by default.
     *
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-s3storageoptions)
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories
     * is optimized. This is disabled by default. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b659ec0eca872ff75383846e223a401c1c1166dc943ca76d7852c3201d038157")
    public fun s3StorageOptions(s3StorageOptions: S3StorageOptionsProperty.Builder.() -> Unit)

    /**
     * Specifies the name of the security policy for the server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-securitypolicyname)
     * @param securityPolicyName Specifies the name of the security policy for the server. 
     */
    public fun securityPolicyName(securityPolicyName: String)

    /**
     * Specifies the log groups to which your server logs are sent.
     *
     * To specify a log group, you must provide the ARN for an existing log group. In this case, the
     * format of the log group is as follows:
     *
     * `arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*`
     *
     * For example, `arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*`
     *
     * If you have previously specified a log group for a server, you can clear it, and in effect
     * turn off structured logging, by providing an empty value for this parameter in an
     * `update-server` call. For example:
     *
     * `update-server --server-id s-1234567890abcdef0 --structured-log-destinations`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-structuredlogdestinations)
     * @param structuredLogDestinations Specifies the log groups to which your server logs are sent.
     * 
     */
    public fun structuredLogDestinations(structuredLogDestinations: List<String>)

    /**
     * Specifies the log groups to which your server logs are sent.
     *
     * To specify a log group, you must provide the ARN for an existing log group. In this case, the
     * format of the log group is as follows:
     *
     * `arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*`
     *
     * For example, `arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*`
     *
     * If you have previously specified a log group for a server, you can clear it, and in effect
     * turn off structured logging, by providing an empty value for this parameter in an
     * `update-server` call. For example:
     *
     * `update-server --server-id s-1234567890abcdef0 --structured-log-destinations`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-structuredlogdestinations)
     * @param structuredLogDestinations Specifies the log groups to which your server logs are sent.
     * 
     */
    public fun structuredLogDestinations(vararg structuredLogDestinations: String)

    /**
     * Key-value pairs that can be used to group and search for servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-tags)
     * @param tags Key-value pairs that can be used to group and search for servers. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs that can be used to group and search for servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-tags)
     * @param tags Key-value pairs that can be used to group and search for servers. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for
     * executing the workflow.
     *
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-workflowdetails)
     * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
     * role that's used for executing the workflow. 
     */
    public fun workflowDetails(workflowDetails: IResolvable)

    /**
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for
     * executing the workflow.
     *
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-workflowdetails)
     * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
     * role that's used for executing the workflow. 
     */
    public fun workflowDetails(workflowDetails: WorkflowDetailsProperty)

    /**
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for
     * executing the workflow.
     *
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-workflowdetails)
     * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
     * role that's used for executing the workflow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ef374116af82579036ffca50924ac903bbdc16964dff47ec56c8af807f752c7")
    public fun workflowDetails(workflowDetails: WorkflowDetailsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnServer.Builder =
        software.amazon.awscdk.services.transfer.CfnServer.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM) certificate.
     *
     * Required when `Protocols` is set to `FTPS` .
     *
     * To request a new public certificate, see [Request a public
     * certificate](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-public.html) in the
     * *AWS Certificate Manager User Guide* .
     *
     * To import an existing certificate into ACM, see [Importing certificates into
     * ACM](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the *AWS
     * Certificate Manager User Guide* .
     *
     * To request a private certificate to use FTPS through private IP addresses, see [Request a
     * private
     * certificate](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-private.html) in
     * the *AWS Certificate Manager User Guide* .
     *
     * Certificates with the following cryptographic algorithms and key sizes are supported:
     *
     * * 2048-bit RSA (RSA_2048)
     * * 4096-bit RSA (RSA_4096)
     * * Elliptic Prime Curve 256 bit (EC_prime256v1)
     * * Elliptic Prime Curve 384 bit (EC_secp384r1)
     * * Elliptic Prime Curve 521 bit (EC_secp521r1)
     *
     *
     * The certificate must be a valid SSL/TLS X.509 version 3 certificate with FQDN or IP address
     * specified and information about the issuer.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-certificate)
     * @param certificate The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM)
     * certificate. 
     */
    override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    /**
     * Specifies the domain of the storage system that is used for file transfers.
     *
     * There are two domains available: Amazon Simple Storage Service (Amazon S3) and Amazon Elastic
     * File System (Amazon EFS). The default value is S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-domain)
     * @param domain Specifies the domain of the storage system that is used for file transfers. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * The virtual private cloud (VPC) endpoint settings that are configured for your server.
     *
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointdetails)
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that are configured
     * for your server. 
     */
    override fun endpointDetails(endpointDetails: IResolvable) {
      cdkBuilder.endpointDetails(endpointDetails.let(IResolvable.Companion::unwrap))
    }

    /**
     * The virtual private cloud (VPC) endpoint settings that are configured for your server.
     *
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointdetails)
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that are configured
     * for your server. 
     */
    override fun endpointDetails(endpointDetails: EndpointDetailsProperty) {
      cdkBuilder.endpointDetails(endpointDetails.let(EndpointDetailsProperty.Companion::unwrap))
    }

    /**
     * The virtual private cloud (VPC) endpoint settings that are configured for your server.
     *
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointdetails)
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that are configured
     * for your server. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf0a236db158e33b6465b83db4fee875e78a60764aeaeab4a59b5a8275e50fa2")
    override fun endpointDetails(endpointDetails: EndpointDetailsProperty.Builder.() -> Unit): Unit
        = endpointDetails(EndpointDetailsProperty(endpointDetails))

    /**
     * The type of endpoint that you want your server to use.
     *
     * You can choose to make your server's endpoint publicly accessible (PUBLIC) or host it inside
     * your VPC. With an endpoint that is hosted in a VPC, you can restrict access to your server and
     * resources only within your VPC or choose to make it internet facing by attaching Elastic IP
     * addresses directly to it.
     *
     *
     * After May 19, 2021, you won't be able to create a server using `EndpointType=VPC_ENDPOINT` in
     * your AWS account if your account hasn't already done so before May 19, 2021. If you have already
     * created servers with `EndpointType=VPC_ENDPOINT` in your AWS account on or before May 19, 2021,
     * you will not be affected. After this date, use `EndpointType` = `VPC` .
     *
     * For more information, see [Discontinuing the use of
     * VPC_ENDPOINT](https://docs.aws.amazon.com//transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint)
     * .
     *
     * It is recommended that you use `VPC` as the `EndpointType` . With this endpoint type, you
     * have the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with
     * your server's endpoint and use VPC security groups to restrict traffic by the client's public IP
     * address. This is not possible with `EndpointType` set to `VPC_ENDPOINT` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointtype)
     * @param endpointType The type of endpoint that you want your server to use. 
     */
    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    /**
     * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
     * `API_GATEWAY` .
     *
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityproviderdetails)
     * @param identityProviderDetails Required when `IdentityProviderType` is set to
     * `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or `API_GATEWAY` . 
     */
    override fun identityProviderDetails(identityProviderDetails: IResolvable) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(IResolvable.Companion::unwrap))
    }

    /**
     * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
     * `API_GATEWAY` .
     *
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityproviderdetails)
     * @param identityProviderDetails Required when `IdentityProviderType` is set to
     * `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or `API_GATEWAY` . 
     */
    override fun identityProviderDetails(identityProviderDetails: IdentityProviderDetailsProperty) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(IdentityProviderDetailsProperty.Companion::unwrap))
    }

    /**
     * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
     * `API_GATEWAY` .
     *
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityproviderdetails)
     * @param identityProviderDetails Required when `IdentityProviderType` is set to
     * `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or `API_GATEWAY` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24ae31b6e5fbf0065d8de2b14590fdff805ca7ab2469499255b6d601154a318e")
    override
        fun identityProviderDetails(identityProviderDetails: IdentityProviderDetailsProperty.Builder.() -> Unit):
        Unit = identityProviderDetails(IdentityProviderDetailsProperty(identityProviderDetails))

    /**
     * The mode of authentication for a server.
     *
     * The default value is `SERVICE_MANAGED` , which allows you to store and access user
     * credentials within the AWS Transfer Family service.
     *
     * Use `AWS_DIRECTORY_SERVICE` to provide access to Active Directory groups in AWS Directory
     * Service for Microsoft Active Directory or Microsoft Active Directory in your on-premises
     * environment or in AWS using AD Connector. This option also requires you to provide a Directory
     * ID by using the `IdentityProviderDetails` parameter.
     *
     * Use the `API_GATEWAY` value to integrate with an identity provider of your choosing. The
     * `API_GATEWAY` setting requires you to provide an Amazon API Gateway endpoint URL to call for
     * authentication by using the `IdentityProviderDetails` parameter.
     *
     * Use the `AWS_LAMBDA` value to directly use an AWS Lambda function as your identity provider.
     * If you choose this value, you must specify the ARN for the Lambda function in the `Function`
     * parameter for the `IdentityProviderDetails` data type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityprovidertype)
     * @param identityProviderType The mode of authentication for a server. 
     */
    override fun identityProviderType(identityProviderType: String) {
      cdkBuilder.identityProviderType(identityProviderType)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents.
     *
     * When set, you can view user activity in your CloudWatch logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-loggingrole)
     * @param loggingRole The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon
     * EFSevents. 
     */
    override fun loggingRole(loggingRole: String) {
      cdkBuilder.loggingRole(loggingRole)
    }

    /**
     * Specifies a string to display when users connect to a server. This string is displayed after
     * the user authenticates.
     *
     *
     * The SFTP protocol does not support post-authentication display banners.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-postauthenticationloginbanner)
     * @param postAuthenticationLoginBanner Specifies a string to display when users connect to a
     * server. This string is displayed after the user authenticates. 
     */
    override fun postAuthenticationLoginBanner(postAuthenticationLoginBanner: String) {
      cdkBuilder.postAuthenticationLoginBanner(postAuthenticationLoginBanner)
    }

    /**
     * Specifies a string to display when users connect to a server.
     *
     * This string is displayed before the user authenticates. For example, the following banner
     * displays details about using the system:
     *
     * `This system is for the use of authorized users only. Individuals using this computer system
     * without authority, or in excess of their authority, are subject to having all of their
     * activities on this system monitored and recorded by system personnel.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-preauthenticationloginbanner)
     * @param preAuthenticationLoginBanner Specifies a string to display when users connect to a
     * server. 
     */
    override fun preAuthenticationLoginBanner(preAuthenticationLoginBanner: String) {
      cdkBuilder.preAuthenticationLoginBanner(preAuthenticationLoginBanner)
    }

    /**
     * The protocol settings that are configured for your server.
     *
     * * To indicate passive mode (for FTP and FTPS protocols), use the `PassiveIp` parameter. Enter
     * a single dotted-quad IPv4 address, such as the external IP address of a firewall, router, or
     * load balancer.
     * * To ignore the error that is generated when the client attempts to use the `SETSTAT` command
     * on a file that you are uploading to an Amazon S3 bucket, use the `SetStatOption` parameter. To
     * have the AWS Transfer Family server ignore the `SETSTAT` command and upload files without
     * needing to make any changes to your SFTP client, set the value to `ENABLE_NO_OP` . If you set
     * the `SetStatOption` parameter to `ENABLE_NO_OP` , Transfer Family generates a log entry to
     * Amazon CloudWatch Logs, so that you can determine when the client is making a `SETSTAT` call.
     * * To determine whether your AWS Transfer Family server resumes recent, negotiated sessions
     * through a unique session ID, use the `TlsSessionResumptionMode` parameter.
     * * `As2Transports` indicates the transport method for the AS2 messages. Currently, only HTTP
     * is supported.
     *
     * The `Protocols` parameter is an array of strings.
     *
     * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocoldetails)
     * @param protocolDetails The protocol settings that are configured for your server. 
     */
    override fun protocolDetails(protocolDetails: IResolvable) {
      cdkBuilder.protocolDetails(protocolDetails.let(IResolvable.Companion::unwrap))
    }

    /**
     * The protocol settings that are configured for your server.
     *
     * * To indicate passive mode (for FTP and FTPS protocols), use the `PassiveIp` parameter. Enter
     * a single dotted-quad IPv4 address, such as the external IP address of a firewall, router, or
     * load balancer.
     * * To ignore the error that is generated when the client attempts to use the `SETSTAT` command
     * on a file that you are uploading to an Amazon S3 bucket, use the `SetStatOption` parameter. To
     * have the AWS Transfer Family server ignore the `SETSTAT` command and upload files without
     * needing to make any changes to your SFTP client, set the value to `ENABLE_NO_OP` . If you set
     * the `SetStatOption` parameter to `ENABLE_NO_OP` , Transfer Family generates a log entry to
     * Amazon CloudWatch Logs, so that you can determine when the client is making a `SETSTAT` call.
     * * To determine whether your AWS Transfer Family server resumes recent, negotiated sessions
     * through a unique session ID, use the `TlsSessionResumptionMode` parameter.
     * * `As2Transports` indicates the transport method for the AS2 messages. Currently, only HTTP
     * is supported.
     *
     * The `Protocols` parameter is an array of strings.
     *
     * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocoldetails)
     * @param protocolDetails The protocol settings that are configured for your server. 
     */
    override fun protocolDetails(protocolDetails: ProtocolDetailsProperty) {
      cdkBuilder.protocolDetails(protocolDetails.let(ProtocolDetailsProperty.Companion::unwrap))
    }

    /**
     * The protocol settings that are configured for your server.
     *
     * * To indicate passive mode (for FTP and FTPS protocols), use the `PassiveIp` parameter. Enter
     * a single dotted-quad IPv4 address, such as the external IP address of a firewall, router, or
     * load balancer.
     * * To ignore the error that is generated when the client attempts to use the `SETSTAT` command
     * on a file that you are uploading to an Amazon S3 bucket, use the `SetStatOption` parameter. To
     * have the AWS Transfer Family server ignore the `SETSTAT` command and upload files without
     * needing to make any changes to your SFTP client, set the value to `ENABLE_NO_OP` . If you set
     * the `SetStatOption` parameter to `ENABLE_NO_OP` , Transfer Family generates a log entry to
     * Amazon CloudWatch Logs, so that you can determine when the client is making a `SETSTAT` call.
     * * To determine whether your AWS Transfer Family server resumes recent, negotiated sessions
     * through a unique session ID, use the `TlsSessionResumptionMode` parameter.
     * * `As2Transports` indicates the transport method for the AS2 messages. Currently, only HTTP
     * is supported.
     *
     * The `Protocols` parameter is an array of strings.
     *
     * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocoldetails)
     * @param protocolDetails The protocol settings that are configured for your server. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccc7183bb666df2becd469fea8bddfeb4f843e9946ac8688388de90179b8c491")
    override fun protocolDetails(protocolDetails: ProtocolDetailsProperty.Builder.() -> Unit): Unit
        = protocolDetails(ProtocolDetailsProperty(protocolDetails))

    /**
     * Specifies the file transfer protocol or protocols over which your file transfer protocol
     * client can connect to your server's endpoint.
     *
     * The available protocols are:
     *
     * * `SFTP` (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * * `FTPS` (File Transfer Protocol Secure): File transfer with TLS encryption
     * * `FTP` (File Transfer Protocol): Unencrypted file transfer
     * * `AS2` (Applicability Statement 2): used for transporting structured business-to-business
     * data
     *
     *
     * * If you select `FTPS` , you must choose a certificate stored in AWS Certificate Manager
     * (ACM) which is used to identify your server when clients connect to it over FTPS.
     * * If `Protocol` includes either `FTP` or `FTPS` , then the `EndpointType` must be `VPC` and
     * the `IdentityProviderType` must be either `AWS_DIRECTORY_SERVICE` , `AWS_LAMBDA` , or
     * `API_GATEWAY` .
     * * If `Protocol` includes `FTP` , then `AddressAllocationIds` cannot be associated.
     * * If `Protocol` is set only to `SFTP` , the `EndpointType` can be set to `PUBLIC` and the
     * `IdentityProviderType` can be set any of the supported identity types: `SERVICE_MANAGED` ,
     * `AWS_DIRECTORY_SERVICE` , `AWS_LAMBDA` , or `API_GATEWAY` .
     * * If `Protocol` includes `AS2` , then the `EndpointType` must be `VPC` , and domain must be
     * Amazon S3.
     *
     *
     * The `Protocols` parameter is an array of strings.
     *
     * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocols)
     * @param protocols Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint. 
     */
    override fun protocols(protocols: List<String>) {
      cdkBuilder.protocols(protocols)
    }

    /**
     * Specifies the file transfer protocol or protocols over which your file transfer protocol
     * client can connect to your server's endpoint.
     *
     * The available protocols are:
     *
     * * `SFTP` (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * * `FTPS` (File Transfer Protocol Secure): File transfer with TLS encryption
     * * `FTP` (File Transfer Protocol): Unencrypted file transfer
     * * `AS2` (Applicability Statement 2): used for transporting structured business-to-business
     * data
     *
     *
     * * If you select `FTPS` , you must choose a certificate stored in AWS Certificate Manager
     * (ACM) which is used to identify your server when clients connect to it over FTPS.
     * * If `Protocol` includes either `FTP` or `FTPS` , then the `EndpointType` must be `VPC` and
     * the `IdentityProviderType` must be either `AWS_DIRECTORY_SERVICE` , `AWS_LAMBDA` , or
     * `API_GATEWAY` .
     * * If `Protocol` includes `FTP` , then `AddressAllocationIds` cannot be associated.
     * * If `Protocol` is set only to `SFTP` , the `EndpointType` can be set to `PUBLIC` and the
     * `IdentityProviderType` can be set any of the supported identity types: `SERVICE_MANAGED` ,
     * `AWS_DIRECTORY_SERVICE` , `AWS_LAMBDA` , or `API_GATEWAY` .
     * * If `Protocol` includes `AS2` , then the `EndpointType` must be `VPC` , and domain must be
     * Amazon S3.
     *
     *
     * The `Protocols` parameter is an array of strings.
     *
     * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocols)
     * @param protocols Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint. 
     */
    override fun protocols(vararg protocols: String): Unit = protocols(protocols.toList())

    /**
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is
     * disabled by default.
     *
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-s3storageoptions)
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories
     * is optimized. This is disabled by default. 
     */
    override fun s3StorageOptions(s3StorageOptions: IResolvable) {
      cdkBuilder.s3StorageOptions(s3StorageOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is
     * disabled by default.
     *
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-s3storageoptions)
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories
     * is optimized. This is disabled by default. 
     */
    override fun s3StorageOptions(s3StorageOptions: S3StorageOptionsProperty) {
      cdkBuilder.s3StorageOptions(s3StorageOptions.let(S3StorageOptionsProperty.Companion::unwrap))
    }

    /**
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is
     * disabled by default.
     *
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-s3storageoptions)
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories
     * is optimized. This is disabled by default. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b659ec0eca872ff75383846e223a401c1c1166dc943ca76d7852c3201d038157")
    override fun s3StorageOptions(s3StorageOptions: S3StorageOptionsProperty.Builder.() -> Unit):
        Unit = s3StorageOptions(S3StorageOptionsProperty(s3StorageOptions))

    /**
     * Specifies the name of the security policy for the server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-securitypolicyname)
     * @param securityPolicyName Specifies the name of the security policy for the server. 
     */
    override fun securityPolicyName(securityPolicyName: String) {
      cdkBuilder.securityPolicyName(securityPolicyName)
    }

    /**
     * Specifies the log groups to which your server logs are sent.
     *
     * To specify a log group, you must provide the ARN for an existing log group. In this case, the
     * format of the log group is as follows:
     *
     * `arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*`
     *
     * For example, `arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*`
     *
     * If you have previously specified a log group for a server, you can clear it, and in effect
     * turn off structured logging, by providing an empty value for this parameter in an
     * `update-server` call. For example:
     *
     * `update-server --server-id s-1234567890abcdef0 --structured-log-destinations`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-structuredlogdestinations)
     * @param structuredLogDestinations Specifies the log groups to which your server logs are sent.
     * 
     */
    override fun structuredLogDestinations(structuredLogDestinations: List<String>) {
      cdkBuilder.structuredLogDestinations(structuredLogDestinations)
    }

    /**
     * Specifies the log groups to which your server logs are sent.
     *
     * To specify a log group, you must provide the ARN for an existing log group. In this case, the
     * format of the log group is as follows:
     *
     * `arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*`
     *
     * For example, `arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*`
     *
     * If you have previously specified a log group for a server, you can clear it, and in effect
     * turn off structured logging, by providing an empty value for this parameter in an
     * `update-server` call. For example:
     *
     * `update-server --server-id s-1234567890abcdef0 --structured-log-destinations`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-structuredlogdestinations)
     * @param structuredLogDestinations Specifies the log groups to which your server logs are sent.
     * 
     */
    override fun structuredLogDestinations(vararg structuredLogDestinations: String): Unit =
        structuredLogDestinations(structuredLogDestinations.toList())

    /**
     * Key-value pairs that can be used to group and search for servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-tags)
     * @param tags Key-value pairs that can be used to group and search for servers. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Key-value pairs that can be used to group and search for servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-tags)
     * @param tags Key-value pairs that can be used to group and search for servers. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for
     * executing the workflow.
     *
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-workflowdetails)
     * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
     * role that's used for executing the workflow. 
     */
    override fun workflowDetails(workflowDetails: IResolvable) {
      cdkBuilder.workflowDetails(workflowDetails.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for
     * executing the workflow.
     *
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-workflowdetails)
     * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
     * role that's used for executing the workflow. 
     */
    override fun workflowDetails(workflowDetails: WorkflowDetailsProperty) {
      cdkBuilder.workflowDetails(workflowDetails.let(WorkflowDetailsProperty.Companion::unwrap))
    }

    /**
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for
     * executing the workflow.
     *
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-workflowdetails)
     * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
     * role that's used for executing the workflow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ef374116af82579036ffca50924ac903bbdc16964dff47ec56c8af807f752c7")
    override fun workflowDetails(workflowDetails: WorkflowDetailsProperty.Builder.() -> Unit): Unit
        = workflowDetails(WorkflowDetailsProperty(workflowDetails))

    public fun build(): software.amazon.awscdk.services.transfer.CfnServer = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.transfer.CfnServer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer): CfnServer =
        CfnServer(cdkObject)

    internal fun unwrap(wrapped: CfnServer): software.amazon.awscdk.services.transfer.CfnServer =
        wrapped.cdkObject as software.amazon.awscdk.services.transfer.CfnServer
  }

  /**
   * The virtual private cloud (VPC) endpoint settings that are configured for your server.
   *
   * When you host your endpoint within your VPC, you can make your endpoint accessible only to
   * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
   * accessible to clients over the internet. Your VPC's default security groups are automatically
   * assigned to your endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * EndpointDetailsProperty endpointDetailsProperty = EndpointDetailsProperty.builder()
   * .addressAllocationIds(List.of("addressAllocationIds"))
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .vpcEndpointId("vpcEndpointId")
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html)
   */
  public interface EndpointDetailsProperty {
    /**
     * A list of address allocation IDs that are required to attach an Elastic IP address to your
     * server's endpoint.
     *
     * An address allocation ID corresponds to the allocation ID of an Elastic IP address. This
     * value can be retrieved from the `allocationId` field from the Amazon EC2
     * [Address](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Address.html) data type.
     * One way to retrieve this value is by calling the EC2
     * [DescribeAddresses](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html)
     * API.
     *
     * This parameter is optional. Set this parameter if you want to make your VPC endpoint
     * public-facing. For details, see [Create an internet-facing endpoint for your
     * server](https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#create-internet-facing-endpoint)
     * .
     *
     *
     * This property can only be set as follows:
     *
     * * `EndpointType` must be set to `VPC`
     * * The Transfer Family server must be offline.
     * * You cannot set this parameter for Transfer Family servers that use the FTP protocol.
     * * The server must already have `SubnetIds` populated ( `SubnetIds` and `AddressAllocationIds`
     * cannot be updated simultaneously).
     * * `AddressAllocationIds` can't contain duplicates, and must be equal in length to `SubnetIds`
     * . For example, if you have three subnet IDs, you must also specify three address allocation IDs.
     * * Call the `UpdateServer` API to set or change this parameter.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-addressallocationids)
     */
    public fun addressAllocationIds(): List<String> = unwrap(this).getAddressAllocationIds() ?:
        emptyList()

    /**
     * A list of security groups IDs that are available to attach to your server's endpoint.
     *
     *
     * This property can only be set when `EndpointType` is set to `VPC` .
     *
     * You can edit the `SecurityGroupIds` property in the
     * [UpdateServer](https://docs.aws.amazon.com/transfer/latest/userguide/API_UpdateServer.html) API
     * only if you are changing the `EndpointType` from `PUBLIC` or `VPC_ENDPOINT` to `VPC` . To change
     * security groups associated with your server's VPC endpoint after creation, use the Amazon EC2
     * [ModifyVpcEndpoint](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyVpcEndpoint.html)
     * API.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * A list of subnet IDs that are required to host your server endpoint in your VPC.
     *
     *
     * This property can only be set when `EndpointType` is set to `VPC` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * The ID of the VPC endpoint.
     *
     *
     * This property can only be set when `EndpointType` is set to `VPC_ENDPOINT` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcendpointid)
     */
    public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

    /**
     * The VPC ID of the virtual private cloud in which the server's endpoint will be hosted.
     *
     *
     * This property can only be set when `EndpointType` is set to `VPC` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcid)
     */
    public fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * A builder for [EndpointDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addressAllocationIds A list of address allocation IDs that are required to attach an
       * Elastic IP address to your server's endpoint.
       * An address allocation ID corresponds to the allocation ID of an Elastic IP address. This
       * value can be retrieved from the `allocationId` field from the Amazon EC2
       * [Address](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Address.html) data type.
       * One way to retrieve this value is by calling the EC2
       * [DescribeAddresses](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html)
       * API.
       *
       * This parameter is optional. Set this parameter if you want to make your VPC endpoint
       * public-facing. For details, see [Create an internet-facing endpoint for your
       * server](https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#create-internet-facing-endpoint)
       * .
       *
       *
       * This property can only be set as follows:
       *
       * * `EndpointType` must be set to `VPC`
       * * The Transfer Family server must be offline.
       * * You cannot set this parameter for Transfer Family servers that use the FTP protocol.
       * * The server must already have `SubnetIds` populated ( `SubnetIds` and
       * `AddressAllocationIds` cannot be updated simultaneously).
       * * `AddressAllocationIds` can't contain duplicates, and must be equal in length to
       * `SubnetIds` . For example, if you have three subnet IDs, you must also specify three address
       * allocation IDs.
       * * Call the `UpdateServer` API to set or change this parameter.
       */
      public fun addressAllocationIds(addressAllocationIds: List<String>)

      /**
       * @param addressAllocationIds A list of address allocation IDs that are required to attach an
       * Elastic IP address to your server's endpoint.
       * An address allocation ID corresponds to the allocation ID of an Elastic IP address. This
       * value can be retrieved from the `allocationId` field from the Amazon EC2
       * [Address](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Address.html) data type.
       * One way to retrieve this value is by calling the EC2
       * [DescribeAddresses](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html)
       * API.
       *
       * This parameter is optional. Set this parameter if you want to make your VPC endpoint
       * public-facing. For details, see [Create an internet-facing endpoint for your
       * server](https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#create-internet-facing-endpoint)
       * .
       *
       *
       * This property can only be set as follows:
       *
       * * `EndpointType` must be set to `VPC`
       * * The Transfer Family server must be offline.
       * * You cannot set this parameter for Transfer Family servers that use the FTP protocol.
       * * The server must already have `SubnetIds` populated ( `SubnetIds` and
       * `AddressAllocationIds` cannot be updated simultaneously).
       * * `AddressAllocationIds` can't contain duplicates, and must be equal in length to
       * `SubnetIds` . For example, if you have three subnet IDs, you must also specify three address
       * allocation IDs.
       * * Call the `UpdateServer` API to set or change this parameter.
       */
      public fun addressAllocationIds(vararg addressAllocationIds: String)

      /**
       * @param securityGroupIds A list of security groups IDs that are available to attach to your
       * server's endpoint.
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       *
       * You can edit the `SecurityGroupIds` property in the
       * [UpdateServer](https://docs.aws.amazon.com/transfer/latest/userguide/API_UpdateServer.html)
       * API only if you are changing the `EndpointType` from `PUBLIC` or `VPC_ENDPOINT` to `VPC` . To
       * change security groups associated with your server's VPC endpoint after creation, use the
       * Amazon EC2
       * [ModifyVpcEndpoint](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyVpcEndpoint.html)
       * API.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds A list of security groups IDs that are available to attach to your
       * server's endpoint.
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       *
       * You can edit the `SecurityGroupIds` property in the
       * [UpdateServer](https://docs.aws.amazon.com/transfer/latest/userguide/API_UpdateServer.html)
       * API only if you are changing the `EndpointType` from `PUBLIC` or `VPC_ENDPOINT` to `VPC` . To
       * change security groups associated with your server's VPC endpoint after creation, use the
       * Amazon EC2
       * [ModifyVpcEndpoint](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyVpcEndpoint.html)
       * API.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds A list of subnet IDs that are required to host your server endpoint in
       * your VPC.
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds A list of subnet IDs that are required to host your server endpoint in
       * your VPC.
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       */
      public fun subnetIds(vararg subnetIds: String)

      /**
       * @param vpcEndpointId The ID of the VPC endpoint.
       *
       * This property can only be set when `EndpointType` is set to `VPC_ENDPOINT` .
       */
      public fun vpcEndpointId(vpcEndpointId: String)

      /**
       * @param vpcId The VPC ID of the virtual private cloud in which the server's endpoint will be
       * hosted.
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty.builder()

      /**
       * @param addressAllocationIds A list of address allocation IDs that are required to attach an
       * Elastic IP address to your server's endpoint.
       * An address allocation ID corresponds to the allocation ID of an Elastic IP address. This
       * value can be retrieved from the `allocationId` field from the Amazon EC2
       * [Address](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Address.html) data type.
       * One way to retrieve this value is by calling the EC2
       * [DescribeAddresses](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html)
       * API.
       *
       * This parameter is optional. Set this parameter if you want to make your VPC endpoint
       * public-facing. For details, see [Create an internet-facing endpoint for your
       * server](https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#create-internet-facing-endpoint)
       * .
       *
       *
       * This property can only be set as follows:
       *
       * * `EndpointType` must be set to `VPC`
       * * The Transfer Family server must be offline.
       * * You cannot set this parameter for Transfer Family servers that use the FTP protocol.
       * * The server must already have `SubnetIds` populated ( `SubnetIds` and
       * `AddressAllocationIds` cannot be updated simultaneously).
       * * `AddressAllocationIds` can't contain duplicates, and must be equal in length to
       * `SubnetIds` . For example, if you have three subnet IDs, you must also specify three address
       * allocation IDs.
       * * Call the `UpdateServer` API to set or change this parameter.
       */
      override fun addressAllocationIds(addressAllocationIds: List<String>) {
        cdkBuilder.addressAllocationIds(addressAllocationIds)
      }

      /**
       * @param addressAllocationIds A list of address allocation IDs that are required to attach an
       * Elastic IP address to your server's endpoint.
       * An address allocation ID corresponds to the allocation ID of an Elastic IP address. This
       * value can be retrieved from the `allocationId` field from the Amazon EC2
       * [Address](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Address.html) data type.
       * One way to retrieve this value is by calling the EC2
       * [DescribeAddresses](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html)
       * API.
       *
       * This parameter is optional. Set this parameter if you want to make your VPC endpoint
       * public-facing. For details, see [Create an internet-facing endpoint for your
       * server](https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#create-internet-facing-endpoint)
       * .
       *
       *
       * This property can only be set as follows:
       *
       * * `EndpointType` must be set to `VPC`
       * * The Transfer Family server must be offline.
       * * You cannot set this parameter for Transfer Family servers that use the FTP protocol.
       * * The server must already have `SubnetIds` populated ( `SubnetIds` and
       * `AddressAllocationIds` cannot be updated simultaneously).
       * * `AddressAllocationIds` can't contain duplicates, and must be equal in length to
       * `SubnetIds` . For example, if you have three subnet IDs, you must also specify three address
       * allocation IDs.
       * * Call the `UpdateServer` API to set or change this parameter.
       */
      override fun addressAllocationIds(vararg addressAllocationIds: String): Unit =
          addressAllocationIds(addressAllocationIds.toList())

      /**
       * @param securityGroupIds A list of security groups IDs that are available to attach to your
       * server's endpoint.
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       *
       * You can edit the `SecurityGroupIds` property in the
       * [UpdateServer](https://docs.aws.amazon.com/transfer/latest/userguide/API_UpdateServer.html)
       * API only if you are changing the `EndpointType` from `PUBLIC` or `VPC_ENDPOINT` to `VPC` . To
       * change security groups associated with your server's VPC endpoint after creation, use the
       * Amazon EC2
       * [ModifyVpcEndpoint](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyVpcEndpoint.html)
       * API.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds A list of security groups IDs that are available to attach to your
       * server's endpoint.
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       *
       * You can edit the `SecurityGroupIds` property in the
       * [UpdateServer](https://docs.aws.amazon.com/transfer/latest/userguide/API_UpdateServer.html)
       * API only if you are changing the `EndpointType` from `PUBLIC` or `VPC_ENDPOINT` to `VPC` . To
       * change security groups associated with your server's VPC endpoint after creation, use the
       * Amazon EC2
       * [ModifyVpcEndpoint](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyVpcEndpoint.html)
       * API.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds A list of subnet IDs that are required to host your server endpoint in
       * your VPC.
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds A list of subnet IDs that are required to host your server endpoint in
       * your VPC.
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      /**
       * @param vpcEndpointId The ID of the VPC endpoint.
       *
       * This property can only be set when `EndpointType` is set to `VPC_ENDPOINT` .
       */
      override fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
      }

      /**
       * @param vpcId The VPC ID of the virtual private cloud in which the server's endpoint will be
       * hosted.
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty,
    ) : CdkObject(cdkObject), EndpointDetailsProperty {
      /**
       * A list of address allocation IDs that are required to attach an Elastic IP address to your
       * server's endpoint.
       *
       * An address allocation ID corresponds to the allocation ID of an Elastic IP address. This
       * value can be retrieved from the `allocationId` field from the Amazon EC2
       * [Address](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Address.html) data type.
       * One way to retrieve this value is by calling the EC2
       * [DescribeAddresses](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html)
       * API.
       *
       * This parameter is optional. Set this parameter if you want to make your VPC endpoint
       * public-facing. For details, see [Create an internet-facing endpoint for your
       * server](https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#create-internet-facing-endpoint)
       * .
       *
       *
       * This property can only be set as follows:
       *
       * * `EndpointType` must be set to `VPC`
       * * The Transfer Family server must be offline.
       * * You cannot set this parameter for Transfer Family servers that use the FTP protocol.
       * * The server must already have `SubnetIds` populated ( `SubnetIds` and
       * `AddressAllocationIds` cannot be updated simultaneously).
       * * `AddressAllocationIds` can't contain duplicates, and must be equal in length to
       * `SubnetIds` . For example, if you have three subnet IDs, you must also specify three address
       * allocation IDs.
       * * Call the `UpdateServer` API to set or change this parameter.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-addressallocationids)
       */
      override fun addressAllocationIds(): List<String> = unwrap(this).getAddressAllocationIds() ?:
          emptyList()

      /**
       * A list of security groups IDs that are available to attach to your server's endpoint.
       *
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       *
       * You can edit the `SecurityGroupIds` property in the
       * [UpdateServer](https://docs.aws.amazon.com/transfer/latest/userguide/API_UpdateServer.html)
       * API only if you are changing the `EndpointType` from `PUBLIC` or `VPC_ENDPOINT` to `VPC` . To
       * change security groups associated with your server's VPC endpoint after creation, use the
       * Amazon EC2
       * [ModifyVpcEndpoint](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyVpcEndpoint.html)
       * API.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * A list of subnet IDs that are required to host your server endpoint in your VPC.
       *
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

      /**
       * The ID of the VPC endpoint.
       *
       *
       * This property can only be set when `EndpointType` is set to `VPC_ENDPOINT` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcendpointid)
       */
      override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

      /**
       * The VPC ID of the virtual private cloud in which the server's endpoint will be hosted.
       *
       *
       * This property can only be set when `EndpointType` is set to `VPC` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcid)
       */
      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty):
          EndpointDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as? EndpointDetailsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty
    }
  }

  /**
   * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
   * `API_GATEWAY` .
   *
   * Accepts an array containing all of the information required to use a directory in
   * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
   * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * IdentityProviderDetailsProperty identityProviderDetailsProperty =
   * IdentityProviderDetailsProperty.builder()
   * .directoryId("directoryId")
   * .function("function")
   * .invocationRole("invocationRole")
   * .sftpAuthenticationMethods("sftpAuthenticationMethods")
   * .url("url")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html)
   */
  public interface IdentityProviderDetailsProperty {
    /**
     * The identifier of the AWS Directory Service directory that you want to use as your identity
     * provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html#cfn-transfer-server-identityproviderdetails-directoryid)
     */
    public fun directoryId(): String? = unwrap(this).getDirectoryId()

    /**
     * The ARN for a Lambda function to use for the Identity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html#cfn-transfer-server-identityproviderdetails-function)
     */
    public fun function(): String? = unwrap(this).getFunction()

    /**
     * This parameter is only applicable if your `IdentityProviderType` is `API_GATEWAY` .
     *
     * Provides the type of `InvocationRole` used to authenticate the user account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html#cfn-transfer-server-identityproviderdetails-invocationrole)
     */
    public fun invocationRole(): String? = unwrap(this).getInvocationRole()

    /**
     * For SFTP-enabled servers, and for custom identity providers *only* , you can specify whether
     * to authenticate using a password, SSH key pair, or both.
     *
     * * `PASSWORD` - users must provide their password to connect.
     * * `PUBLIC_KEY` - users must provide their private key to connect.
     * * `PUBLIC_KEY_OR_PASSWORD` - users can authenticate with either their password or their key.
     * This is the default value.
     * * `PUBLIC_KEY_AND_PASSWORD` - users must provide both their private key and their password to
     * connect. The server checks the key first, and then if the key is valid, the system prompts for a
     * password. If the private key provided does not match the public key that is stored,
     * authentication fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html#cfn-transfer-server-identityproviderdetails-sftpauthenticationmethods)
     */
    public fun sftpAuthenticationMethods(): String? = unwrap(this).getSftpAuthenticationMethods()

    /**
     * Provides the location of the service endpoint used to authenticate users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html#cfn-transfer-server-identityproviderdetails-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [IdentityProviderDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param directoryId The identifier of the AWS Directory Service directory that you want to
       * use as your identity provider.
       */
      public fun directoryId(directoryId: String)

      /**
       * @param function The ARN for a Lambda function to use for the Identity provider.
       */
      public fun function(function: String)

      /**
       * @param invocationRole This parameter is only applicable if your `IdentityProviderType` is
       * `API_GATEWAY` .
       * Provides the type of `InvocationRole` used to authenticate the user account.
       */
      public fun invocationRole(invocationRole: String)

      /**
       * @param sftpAuthenticationMethods For SFTP-enabled servers, and for custom identity
       * providers *only* , you can specify whether to authenticate using a password, SSH key pair, or
       * both.
       * * `PASSWORD` - users must provide their password to connect.
       * * `PUBLIC_KEY` - users must provide their private key to connect.
       * * `PUBLIC_KEY_OR_PASSWORD` - users can authenticate with either their password or their
       * key. This is the default value.
       * * `PUBLIC_KEY_AND_PASSWORD` - users must provide both their private key and their password
       * to connect. The server checks the key first, and then if the key is valid, the system prompts
       * for a password. If the private key provided does not match the public key that is stored,
       * authentication fails.
       */
      public fun sftpAuthenticationMethods(sftpAuthenticationMethods: String)

      /**
       * @param url Provides the location of the service endpoint used to authenticate users.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty.Builder
          =
          software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty.builder()

      /**
       * @param directoryId The identifier of the AWS Directory Service directory that you want to
       * use as your identity provider.
       */
      override fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
      }

      /**
       * @param function The ARN for a Lambda function to use for the Identity provider.
       */
      override fun function(function: String) {
        cdkBuilder.function(function)
      }

      /**
       * @param invocationRole This parameter is only applicable if your `IdentityProviderType` is
       * `API_GATEWAY` .
       * Provides the type of `InvocationRole` used to authenticate the user account.
       */
      override fun invocationRole(invocationRole: String) {
        cdkBuilder.invocationRole(invocationRole)
      }

      /**
       * @param sftpAuthenticationMethods For SFTP-enabled servers, and for custom identity
       * providers *only* , you can specify whether to authenticate using a password, SSH key pair, or
       * both.
       * * `PASSWORD` - users must provide their password to connect.
       * * `PUBLIC_KEY` - users must provide their private key to connect.
       * * `PUBLIC_KEY_OR_PASSWORD` - users can authenticate with either their password or their
       * key. This is the default value.
       * * `PUBLIC_KEY_AND_PASSWORD` - users must provide both their private key and their password
       * to connect. The server checks the key first, and then if the key is valid, the system prompts
       * for a password. If the private key provided does not match the public key that is stored,
       * authentication fails.
       */
      override fun sftpAuthenticationMethods(sftpAuthenticationMethods: String) {
        cdkBuilder.sftpAuthenticationMethods(sftpAuthenticationMethods)
      }

      /**
       * @param url Provides the location of the service endpoint used to authenticate users.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty,
    ) : CdkObject(cdkObject), IdentityProviderDetailsProperty {
      /**
       * The identifier of the AWS Directory Service directory that you want to use as your identity
       * provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html#cfn-transfer-server-identityproviderdetails-directoryid)
       */
      override fun directoryId(): String? = unwrap(this).getDirectoryId()

      /**
       * The ARN for a Lambda function to use for the Identity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html#cfn-transfer-server-identityproviderdetails-function)
       */
      override fun function(): String? = unwrap(this).getFunction()

      /**
       * This parameter is only applicable if your `IdentityProviderType` is `API_GATEWAY` .
       *
       * Provides the type of `InvocationRole` used to authenticate the user account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html#cfn-transfer-server-identityproviderdetails-invocationrole)
       */
      override fun invocationRole(): String? = unwrap(this).getInvocationRole()

      /**
       * For SFTP-enabled servers, and for custom identity providers *only* , you can specify
       * whether to authenticate using a password, SSH key pair, or both.
       *
       * * `PASSWORD` - users must provide their password to connect.
       * * `PUBLIC_KEY` - users must provide their private key to connect.
       * * `PUBLIC_KEY_OR_PASSWORD` - users can authenticate with either their password or their
       * key. This is the default value.
       * * `PUBLIC_KEY_AND_PASSWORD` - users must provide both their private key and their password
       * to connect. The server checks the key first, and then if the key is valid, the system prompts
       * for a password. If the private key provided does not match the public key that is stored,
       * authentication fails.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html#cfn-transfer-server-identityproviderdetails-sftpauthenticationmethods)
       */
      override fun sftpAuthenticationMethods(): String? =
          unwrap(this).getSftpAuthenticationMethods()

      /**
       * Provides the location of the service endpoint used to authenticate users.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html#cfn-transfer-server-identityproviderdetails-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdentityProviderDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty):
          IdentityProviderDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdentityProviderDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentityProviderDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty
    }
  }

  /**
   * The protocol settings that are configured for your server.
   *
   * * To indicate passive mode (for FTP and FTPS protocols), use the `PassiveIp` parameter. Enter a
   * single dotted-quad IPv4 address, such as the external IP address of a firewall, router, or load
   * balancer.
   * * To ignore the error that is generated when the client attempts to use the `SETSTAT` command
   * on a file that you are uploading to an Amazon S3 bucket, use the `SetStatOption` parameter. To
   * have the AWS Transfer Family server ignore the `SETSTAT` command and upload files without needing
   * to make any changes to your SFTP client, set the value to `ENABLE_NO_OP` . If you set the
   * `SetStatOption` parameter to `ENABLE_NO_OP` , Transfer Family generates a log entry to Amazon
   * CloudWatch Logs, so that you can determine when the client is making a `SETSTAT` call.
   * * To determine whether your AWS Transfer Family server resumes recent, negotiated sessions
   * through a unique session ID, use the `TlsSessionResumptionMode` parameter.
   * * `As2Transports` indicates the transport method for the AS2 messages. Currently, only HTTP is
   * supported.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * ProtocolDetailsProperty protocolDetailsProperty = ProtocolDetailsProperty.builder()
   * .as2Transports(List.of("as2Transports"))
   * .passiveIp("passiveIp")
   * .setStatOption("setStatOption")
   * .tlsSessionResumptionMode("tlsSessionResumptionMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-protocoldetails.html)
   */
  public interface ProtocolDetailsProperty {
    /**
     * List of `As2Transport` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-protocoldetails.html#cfn-transfer-server-protocoldetails-as2transports)
     */
    public fun as2Transports(): List<String> = unwrap(this).getAs2Transports() ?: emptyList()

    /**
     * Indicates passive mode, for FTP and FTPS protocols.
     *
     * Enter a single IPv4 address, such as the public IP address of a firewall, router, or load
     * balancer. For example:
     *
     * `aws transfer update-server --protocol-details PassiveIp=0.0.0.0`
     *
     * Replace `0.0.0.0` in the example above with the actual IP address you want to use.
     *
     *
     * If you change the `PassiveIp` value, you must stop and then restart your Transfer Family
     * server for the change to take effect. For details on using passive mode (PASV) in a NAT
     * environment, see [Configuring your FTPS server behind a firewall or NAT with AWS Transfer
     * Family](https://docs.aws.amazon.com/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/)
     * .
     *
     *
     * *Special values*
     *
     * The `AUTO` and `0.0.0.0` are special values for the `PassiveIp` parameter. The value
     * `PassiveIp=AUTO` is assigned by default to FTP and FTPS type servers. In this case, the server
     * automatically responds with one of the endpoint IPs within the PASV response.
     * `PassiveIp=0.0.0.0` has a more unique application for its usage. For example, if you have a High
     * Availability (HA) Network Load Balancer (NLB) environment, where you have 3 subnets, you can
     * only specify a single IP address using the `PassiveIp` parameter. This reduces the effectiveness
     * of having High Availability. In this case, you can specify `PassiveIp=0.0.0.0` . This tells the
     * client to use the same IP address as the Control connection and utilize all AZs for their
     * connections. Note, however, that not all FTP clients support the `PassiveIp=0.0.0.0` response.
     * FileZilla and WinSCP do support it. If you are using other clients, check to see if your client
     * supports the `PassiveIp=0.0.0.0` response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-protocoldetails.html#cfn-transfer-server-protocoldetails-passiveip)
     */
    public fun passiveIp(): String? = unwrap(this).getPassiveIp()

    /**
     * Use the `SetStatOption` to ignore the error that is generated when the client attempts to use
     * `SETSTAT` on a file you are uploading to an S3 bucket.
     *
     * Some SFTP file transfer clients can attempt to change the attributes of remote files,
     * including timestamp and permissions, using commands, such as `SETSTAT` when uploading the file.
     * However, these commands are not compatible with object storage systems, such as Amazon S3. Due
     * to this incompatibility, file uploads from these clients can result in errors even when the file
     * is otherwise successfully uploaded.
     *
     * Set the value to `ENABLE_NO_OP` to have the Transfer Family server ignore the `SETSTAT`
     * command, and upload files without needing to make any changes to your SFTP client. While the
     * `SetStatOption` `ENABLE_NO_OP` setting ignores the error, it does generate a log entry in Amazon
     * CloudWatch Logs, so you can determine when the client is making a `SETSTAT` call.
     *
     *
     * If you want to preserve the original timestamp for your file, and modify other file
     * attributes using `SETSTAT` , you can use Amazon EFS as backend storage with Transfer Family.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-protocoldetails.html#cfn-transfer-server-protocoldetails-setstatoption)
     */
    public fun setStatOption(): String? = unwrap(this).getSetStatOption()

    /**
     * A property used with Transfer Family servers that use the FTPS protocol.
     *
     * TLS Session Resumption provides a mechanism to resume or share a negotiated secret key
     * between the control and data connection for an FTPS session. `TlsSessionResumptionMode`
     * determines whether or not the server resumes recent, negotiated sessions through a unique
     * session ID. This property is available during `CreateServer` and `UpdateServer` calls. If a
     * `TlsSessionResumptionMode` value is not specified during `CreateServer` , it is set to
     * `ENFORCED` by default.
     *
     * * `DISABLED` : the server does not process TLS session resumption client requests and creates
     * a new TLS session for each request.
     * * `ENABLED` : the server processes and accepts clients that are performing TLS session
     * resumption. The server doesn't reject client data connections that do not perform the TLS
     * session resumption client processing.
     * * `ENFORCED` : the server processes and accepts clients that are performing TLS session
     * resumption. The server rejects client data connections that do not perform the TLS session
     * resumption client processing. Before you set the value to `ENFORCED` , test your clients.
     *
     *
     * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session
     * resumption, you prevent any connections from FTPS clients that don't perform the protocol
     * negotiation. To determine whether or not you can use the `ENFORCED` value, you need to test your
     * clients.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-protocoldetails.html#cfn-transfer-server-protocoldetails-tlssessionresumptionmode)
     */
    public fun tlsSessionResumptionMode(): String? = unwrap(this).getTlsSessionResumptionMode()

    /**
     * A builder for [ProtocolDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param as2Transports List of `As2Transport` objects.
       */
      public fun as2Transports(as2Transports: List<String>)

      /**
       * @param as2Transports List of `As2Transport` objects.
       */
      public fun as2Transports(vararg as2Transports: String)

      /**
       * @param passiveIp Indicates passive mode, for FTP and FTPS protocols.
       * Enter a single IPv4 address, such as the public IP address of a firewall, router, or load
       * balancer. For example:
       *
       * `aws transfer update-server --protocol-details PassiveIp=0.0.0.0`
       *
       * Replace `0.0.0.0` in the example above with the actual IP address you want to use.
       *
       *
       * If you change the `PassiveIp` value, you must stop and then restart your Transfer Family
       * server for the change to take effect. For details on using passive mode (PASV) in a NAT
       * environment, see [Configuring your FTPS server behind a firewall or NAT with AWS Transfer
       * Family](https://docs.aws.amazon.com/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/)
       * .
       *
       *
       * *Special values*
       *
       * The `AUTO` and `0.0.0.0` are special values for the `PassiveIp` parameter. The value
       * `PassiveIp=AUTO` is assigned by default to FTP and FTPS type servers. In this case, the server
       * automatically responds with one of the endpoint IPs within the PASV response.
       * `PassiveIp=0.0.0.0` has a more unique application for its usage. For example, if you have a
       * High Availability (HA) Network Load Balancer (NLB) environment, where you have 3 subnets, you
       * can only specify a single IP address using the `PassiveIp` parameter. This reduces the
       * effectiveness of having High Availability. In this case, you can specify `PassiveIp=0.0.0.0` .
       * This tells the client to use the same IP address as the Control connection and utilize all AZs
       * for their connections. Note, however, that not all FTP clients support the `PassiveIp=0.0.0.0`
       * response. FileZilla and WinSCP do support it. If you are using other clients, check to see if
       * your client supports the `PassiveIp=0.0.0.0` response.
       */
      public fun passiveIp(passiveIp: String)

      /**
       * @param setStatOption Use the `SetStatOption` to ignore the error that is generated when the
       * client attempts to use `SETSTAT` on a file you are uploading to an S3 bucket.
       * Some SFTP file transfer clients can attempt to change the attributes of remote files,
       * including timestamp and permissions, using commands, such as `SETSTAT` when uploading the
       * file. However, these commands are not compatible with object storage systems, such as Amazon
       * S3. Due to this incompatibility, file uploads from these clients can result in errors even
       * when the file is otherwise successfully uploaded.
       *
       * Set the value to `ENABLE_NO_OP` to have the Transfer Family server ignore the `SETSTAT`
       * command, and upload files without needing to make any changes to your SFTP client. While the
       * `SetStatOption` `ENABLE_NO_OP` setting ignores the error, it does generate a log entry in
       * Amazon CloudWatch Logs, so you can determine when the client is making a `SETSTAT` call.
       *
       *
       * If you want to preserve the original timestamp for your file, and modify other file
       * attributes using `SETSTAT` , you can use Amazon EFS as backend storage with Transfer Family.
       */
      public fun statOption(setStatOption: String)

      /**
       * @param tlsSessionResumptionMode A property used with Transfer Family servers that use the
       * FTPS protocol.
       * TLS Session Resumption provides a mechanism to resume or share a negotiated secret key
       * between the control and data connection for an FTPS session. `TlsSessionResumptionMode`
       * determines whether or not the server resumes recent, negotiated sessions through a unique
       * session ID. This property is available during `CreateServer` and `UpdateServer` calls. If a
       * `TlsSessionResumptionMode` value is not specified during `CreateServer` , it is set to
       * `ENFORCED` by default.
       *
       * * `DISABLED` : the server does not process TLS session resumption client requests and
       * creates a new TLS session for each request.
       * * `ENABLED` : the server processes and accepts clients that are performing TLS session
       * resumption. The server doesn't reject client data connections that do not perform the TLS
       * session resumption client processing.
       * * `ENFORCED` : the server processes and accepts clients that are performing TLS session
       * resumption. The server rejects client data connections that do not perform the TLS session
       * resumption client processing. Before you set the value to `ENFORCED` , test your clients.
       *
       *
       * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS
       * session resumption, you prevent any connections from FTPS clients that don't perform the
       * protocol negotiation. To determine whether or not you can use the `ENFORCED` value, you need
       * to test your clients.
       */
      public fun tlsSessionResumptionMode(tlsSessionResumptionMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty.builder()

      /**
       * @param as2Transports List of `As2Transport` objects.
       */
      override fun as2Transports(as2Transports: List<String>) {
        cdkBuilder.as2Transports(as2Transports)
      }

      /**
       * @param as2Transports List of `As2Transport` objects.
       */
      override fun as2Transports(vararg as2Transports: String): Unit =
          as2Transports(as2Transports.toList())

      /**
       * @param passiveIp Indicates passive mode, for FTP and FTPS protocols.
       * Enter a single IPv4 address, such as the public IP address of a firewall, router, or load
       * balancer. For example:
       *
       * `aws transfer update-server --protocol-details PassiveIp=0.0.0.0`
       *
       * Replace `0.0.0.0` in the example above with the actual IP address you want to use.
       *
       *
       * If you change the `PassiveIp` value, you must stop and then restart your Transfer Family
       * server for the change to take effect. For details on using passive mode (PASV) in a NAT
       * environment, see [Configuring your FTPS server behind a firewall or NAT with AWS Transfer
       * Family](https://docs.aws.amazon.com/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/)
       * .
       *
       *
       * *Special values*
       *
       * The `AUTO` and `0.0.0.0` are special values for the `PassiveIp` parameter. The value
       * `PassiveIp=AUTO` is assigned by default to FTP and FTPS type servers. In this case, the server
       * automatically responds with one of the endpoint IPs within the PASV response.
       * `PassiveIp=0.0.0.0` has a more unique application for its usage. For example, if you have a
       * High Availability (HA) Network Load Balancer (NLB) environment, where you have 3 subnets, you
       * can only specify a single IP address using the `PassiveIp` parameter. This reduces the
       * effectiveness of having High Availability. In this case, you can specify `PassiveIp=0.0.0.0` .
       * This tells the client to use the same IP address as the Control connection and utilize all AZs
       * for their connections. Note, however, that not all FTP clients support the `PassiveIp=0.0.0.0`
       * response. FileZilla and WinSCP do support it. If you are using other clients, check to see if
       * your client supports the `PassiveIp=0.0.0.0` response.
       */
      override fun passiveIp(passiveIp: String) {
        cdkBuilder.passiveIp(passiveIp)
      }

      /**
       * @param setStatOption Use the `SetStatOption` to ignore the error that is generated when the
       * client attempts to use `SETSTAT` on a file you are uploading to an S3 bucket.
       * Some SFTP file transfer clients can attempt to change the attributes of remote files,
       * including timestamp and permissions, using commands, such as `SETSTAT` when uploading the
       * file. However, these commands are not compatible with object storage systems, such as Amazon
       * S3. Due to this incompatibility, file uploads from these clients can result in errors even
       * when the file is otherwise successfully uploaded.
       *
       * Set the value to `ENABLE_NO_OP` to have the Transfer Family server ignore the `SETSTAT`
       * command, and upload files without needing to make any changes to your SFTP client. While the
       * `SetStatOption` `ENABLE_NO_OP` setting ignores the error, it does generate a log entry in
       * Amazon CloudWatch Logs, so you can determine when the client is making a `SETSTAT` call.
       *
       *
       * If you want to preserve the original timestamp for your file, and modify other file
       * attributes using `SETSTAT` , you can use Amazon EFS as backend storage with Transfer Family.
       */
      override fun statOption(setStatOption: String) {
        cdkBuilder.setStatOption(setStatOption)
      }

      /**
       * @param tlsSessionResumptionMode A property used with Transfer Family servers that use the
       * FTPS protocol.
       * TLS Session Resumption provides a mechanism to resume or share a negotiated secret key
       * between the control and data connection for an FTPS session. `TlsSessionResumptionMode`
       * determines whether or not the server resumes recent, negotiated sessions through a unique
       * session ID. This property is available during `CreateServer` and `UpdateServer` calls. If a
       * `TlsSessionResumptionMode` value is not specified during `CreateServer` , it is set to
       * `ENFORCED` by default.
       *
       * * `DISABLED` : the server does not process TLS session resumption client requests and
       * creates a new TLS session for each request.
       * * `ENABLED` : the server processes and accepts clients that are performing TLS session
       * resumption. The server doesn't reject client data connections that do not perform the TLS
       * session resumption client processing.
       * * `ENFORCED` : the server processes and accepts clients that are performing TLS session
       * resumption. The server rejects client data connections that do not perform the TLS session
       * resumption client processing. Before you set the value to `ENFORCED` , test your clients.
       *
       *
       * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS
       * session resumption, you prevent any connections from FTPS clients that don't perform the
       * protocol negotiation. To determine whether or not you can use the `ENFORCED` value, you need
       * to test your clients.
       */
      override fun tlsSessionResumptionMode(tlsSessionResumptionMode: String) {
        cdkBuilder.tlsSessionResumptionMode(tlsSessionResumptionMode)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty,
    ) : CdkObject(cdkObject), ProtocolDetailsProperty {
      /**
       * List of `As2Transport` objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-protocoldetails.html#cfn-transfer-server-protocoldetails-as2transports)
       */
      override fun as2Transports(): List<String> = unwrap(this).getAs2Transports() ?: emptyList()

      /**
       * Indicates passive mode, for FTP and FTPS protocols.
       *
       * Enter a single IPv4 address, such as the public IP address of a firewall, router, or load
       * balancer. For example:
       *
       * `aws transfer update-server --protocol-details PassiveIp=0.0.0.0`
       *
       * Replace `0.0.0.0` in the example above with the actual IP address you want to use.
       *
       *
       * If you change the `PassiveIp` value, you must stop and then restart your Transfer Family
       * server for the change to take effect. For details on using passive mode (PASV) in a NAT
       * environment, see [Configuring your FTPS server behind a firewall or NAT with AWS Transfer
       * Family](https://docs.aws.amazon.com/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/)
       * .
       *
       *
       * *Special values*
       *
       * The `AUTO` and `0.0.0.0` are special values for the `PassiveIp` parameter. The value
       * `PassiveIp=AUTO` is assigned by default to FTP and FTPS type servers. In this case, the server
       * automatically responds with one of the endpoint IPs within the PASV response.
       * `PassiveIp=0.0.0.0` has a more unique application for its usage. For example, if you have a
       * High Availability (HA) Network Load Balancer (NLB) environment, where you have 3 subnets, you
       * can only specify a single IP address using the `PassiveIp` parameter. This reduces the
       * effectiveness of having High Availability. In this case, you can specify `PassiveIp=0.0.0.0` .
       * This tells the client to use the same IP address as the Control connection and utilize all AZs
       * for their connections. Note, however, that not all FTP clients support the `PassiveIp=0.0.0.0`
       * response. FileZilla and WinSCP do support it. If you are using other clients, check to see if
       * your client supports the `PassiveIp=0.0.0.0` response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-protocoldetails.html#cfn-transfer-server-protocoldetails-passiveip)
       */
      override fun passiveIp(): String? = unwrap(this).getPassiveIp()

      /**
       * Use the `SetStatOption` to ignore the error that is generated when the client attempts to
       * use `SETSTAT` on a file you are uploading to an S3 bucket.
       *
       * Some SFTP file transfer clients can attempt to change the attributes of remote files,
       * including timestamp and permissions, using commands, such as `SETSTAT` when uploading the
       * file. However, these commands are not compatible with object storage systems, such as Amazon
       * S3. Due to this incompatibility, file uploads from these clients can result in errors even
       * when the file is otherwise successfully uploaded.
       *
       * Set the value to `ENABLE_NO_OP` to have the Transfer Family server ignore the `SETSTAT`
       * command, and upload files without needing to make any changes to your SFTP client. While the
       * `SetStatOption` `ENABLE_NO_OP` setting ignores the error, it does generate a log entry in
       * Amazon CloudWatch Logs, so you can determine when the client is making a `SETSTAT` call.
       *
       *
       * If you want to preserve the original timestamp for your file, and modify other file
       * attributes using `SETSTAT` , you can use Amazon EFS as backend storage with Transfer Family.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-protocoldetails.html#cfn-transfer-server-protocoldetails-setstatoption)
       */
      override fun setStatOption(): String? = unwrap(this).getSetStatOption()

      /**
       * A property used with Transfer Family servers that use the FTPS protocol.
       *
       * TLS Session Resumption provides a mechanism to resume or share a negotiated secret key
       * between the control and data connection for an FTPS session. `TlsSessionResumptionMode`
       * determines whether or not the server resumes recent, negotiated sessions through a unique
       * session ID. This property is available during `CreateServer` and `UpdateServer` calls. If a
       * `TlsSessionResumptionMode` value is not specified during `CreateServer` , it is set to
       * `ENFORCED` by default.
       *
       * * `DISABLED` : the server does not process TLS session resumption client requests and
       * creates a new TLS session for each request.
       * * `ENABLED` : the server processes and accepts clients that are performing TLS session
       * resumption. The server doesn't reject client data connections that do not perform the TLS
       * session resumption client processing.
       * * `ENFORCED` : the server processes and accepts clients that are performing TLS session
       * resumption. The server rejects client data connections that do not perform the TLS session
       * resumption client processing. Before you set the value to `ENFORCED` , test your clients.
       *
       *
       * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS
       * session resumption, you prevent any connections from FTPS clients that don't perform the
       * protocol negotiation. To determine whether or not you can use the `ENFORCED` value, you need
       * to test your clients.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-protocoldetails.html#cfn-transfer-server-protocoldetails-tlssessionresumptionmode)
       */
      override fun tlsSessionResumptionMode(): String? = unwrap(this).getTlsSessionResumptionMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProtocolDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty):
          ProtocolDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as? ProtocolDetailsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProtocolDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty
    }
  }

  /**
   * The Amazon S3 storage options that are configured for your server.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * S3StorageOptionsProperty s3StorageOptionsProperty = S3StorageOptionsProperty.builder()
   * .directoryListingOptimization("directoryListingOptimization")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-s3storageoptions.html)
   */
  public interface S3StorageOptionsProperty {
    /**
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is
     * disabled by default.
     *
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-s3storageoptions.html#cfn-transfer-server-s3storageoptions-directorylistingoptimization)
     */
    public fun directoryListingOptimization(): String? =
        unwrap(this).getDirectoryListingOptimization()

    /**
     * A builder for [S3StorageOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param directoryListingOptimization Specifies whether or not performance for your Amazon S3
       * directories is optimized. This is disabled by default.
       * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this
       * option, you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if
       * you want a mapping to have a file target.
       */
      public fun directoryListingOptimization(directoryListingOptimization: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty.builder()

      /**
       * @param directoryListingOptimization Specifies whether or not performance for your Amazon S3
       * directories is optimized. This is disabled by default.
       * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this
       * option, you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if
       * you want a mapping to have a file target.
       */
      override fun directoryListingOptimization(directoryListingOptimization: String) {
        cdkBuilder.directoryListingOptimization(directoryListingOptimization)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty,
    ) : CdkObject(cdkObject), S3StorageOptionsProperty {
      /**
       * Specifies whether or not performance for your Amazon S3 directories is optimized. This is
       * disabled by default.
       *
       * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this
       * option, you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if
       * you want a mapping to have a file target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-s3storageoptions.html#cfn-transfer-server-s3storageoptions-directorylistingoptimization)
       */
      override fun directoryListingOptimization(): String? =
          unwrap(this).getDirectoryListingOptimization()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3StorageOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty):
          S3StorageOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? S3StorageOptionsProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3StorageOptionsProperty):
          software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty
    }
  }

  /**
   * Specifies the workflow ID for the workflow to assign and the execution role that's used for
   * executing the workflow.
   *
   * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails` can
   * also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A
   * partial upload occurs when a file is open when the session disconnects.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * WorkflowDetailProperty workflowDetailProperty = WorkflowDetailProperty.builder()
   * .executionRole("executionRole")
   * .workflowId("workflowId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetail.html)
   */
  public interface WorkflowDetailProperty {
    /**
     * Includes the necessary permissions for S3, EFS, and Lambda operations that Transfer can
     * assume, so that all workflow steps can operate on the required resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetail.html#cfn-transfer-server-workflowdetail-executionrole)
     */
    public fun executionRole(): String

    /**
     * A unique identifier for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetail.html#cfn-transfer-server-workflowdetail-workflowid)
     */
    public fun workflowId(): String

    /**
     * A builder for [WorkflowDetailProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param executionRole Includes the necessary permissions for S3, EFS, and Lambda operations
       * that Transfer can assume, so that all workflow steps can operate on the required resources. 
       */
      public fun executionRole(executionRole: String)

      /**
       * @param workflowId A unique identifier for the workflow. 
       */
      public fun workflowId(workflowId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty.builder()

      /**
       * @param executionRole Includes the necessary permissions for S3, EFS, and Lambda operations
       * that Transfer can assume, so that all workflow steps can operate on the required resources. 
       */
      override fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
      }

      /**
       * @param workflowId A unique identifier for the workflow. 
       */
      override fun workflowId(workflowId: String) {
        cdkBuilder.workflowId(workflowId)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty,
    ) : CdkObject(cdkObject), WorkflowDetailProperty {
      /**
       * Includes the necessary permissions for S3, EFS, and Lambda operations that Transfer can
       * assume, so that all workflow steps can operate on the required resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetail.html#cfn-transfer-server-workflowdetail-executionrole)
       */
      override fun executionRole(): String = unwrap(this).getExecutionRole()

      /**
       * A unique identifier for the workflow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetail.html#cfn-transfer-server-workflowdetail-workflowid)
       */
      override fun workflowId(): String = unwrap(this).getWorkflowId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty):
          WorkflowDetailProperty = CdkObjectWrappers.wrap(cdkObject) as? WorkflowDetailProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowDetailProperty):
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty
    }
  }

  /**
   * Container for the `WorkflowDetail` data type.
   *
   * It is used by actions that trigger a workflow to begin execution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * WorkflowDetailsProperty workflowDetailsProperty = WorkflowDetailsProperty.builder()
   * .onPartialUpload(List.of(WorkflowDetailProperty.builder()
   * .executionRole("executionRole")
   * .workflowId("workflowId")
   * .build()))
   * .onUpload(List.of(WorkflowDetailProperty.builder()
   * .executionRole("executionRole")
   * .workflowId("workflowId")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetails.html)
   */
  public interface WorkflowDetailsProperty {
    /**
     * A trigger that starts a workflow if a file is only partially uploaded.
     *
     * You can attach a workflow to a server that executes whenever there is a partial upload.
     *
     * A *partial upload* occurs when a file is open when the session disconnects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetails.html#cfn-transfer-server-workflowdetails-onpartialupload)
     */
    public fun onPartialUpload(): Any? = unwrap(this).getOnPartialUpload()

    /**
     * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     *
     * To remove an associated workflow from a server, you can provide an empty `OnUpload` object,
     * as in the following example.
     *
     * `aws transfer update-server --server-id s-01234567890abcdef --workflow-details
     * '{"OnUpload":[]}'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetails.html#cfn-transfer-server-workflowdetails-onupload)
     */
    public fun onUpload(): Any? = unwrap(this).getOnUpload()

    /**
     * A builder for [WorkflowDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onPartialUpload A trigger that starts a workflow if a file is only partially
       * uploaded.
       * You can attach a workflow to a server that executes whenever there is a partial upload.
       *
       * A *partial upload* occurs when a file is open when the session disconnects.
       */
      public fun onPartialUpload(onPartialUpload: IResolvable)

      /**
       * @param onPartialUpload A trigger that starts a workflow if a file is only partially
       * uploaded.
       * You can attach a workflow to a server that executes whenever there is a partial upload.
       *
       * A *partial upload* occurs when a file is open when the session disconnects.
       */
      public fun onPartialUpload(onPartialUpload: List<Any>)

      /**
       * @param onPartialUpload A trigger that starts a workflow if a file is only partially
       * uploaded.
       * You can attach a workflow to a server that executes whenever there is a partial upload.
       *
       * A *partial upload* occurs when a file is open when the session disconnects.
       */
      public fun onPartialUpload(vararg onPartialUpload: Any)

      /**
       * @param onUpload A trigger that starts a workflow: the workflow begins to execute after a
       * file is uploaded.
       * To remove an associated workflow from a server, you can provide an empty `OnUpload` object,
       * as in the following example.
       *
       * `aws transfer update-server --server-id s-01234567890abcdef --workflow-details
       * '{"OnUpload":[]}'`
       */
      public fun onUpload(onUpload: IResolvable)

      /**
       * @param onUpload A trigger that starts a workflow: the workflow begins to execute after a
       * file is uploaded.
       * To remove an associated workflow from a server, you can provide an empty `OnUpload` object,
       * as in the following example.
       *
       * `aws transfer update-server --server-id s-01234567890abcdef --workflow-details
       * '{"OnUpload":[]}'`
       */
      public fun onUpload(onUpload: List<Any>)

      /**
       * @param onUpload A trigger that starts a workflow: the workflow begins to execute after a
       * file is uploaded.
       * To remove an associated workflow from a server, you can provide an empty `OnUpload` object,
       * as in the following example.
       *
       * `aws transfer update-server --server-id s-01234567890abcdef --workflow-details
       * '{"OnUpload":[]}'`
       */
      public fun onUpload(vararg onUpload: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty.builder()

      /**
       * @param onPartialUpload A trigger that starts a workflow if a file is only partially
       * uploaded.
       * You can attach a workflow to a server that executes whenever there is a partial upload.
       *
       * A *partial upload* occurs when a file is open when the session disconnects.
       */
      override fun onPartialUpload(onPartialUpload: IResolvable) {
        cdkBuilder.onPartialUpload(onPartialUpload.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param onPartialUpload A trigger that starts a workflow if a file is only partially
       * uploaded.
       * You can attach a workflow to a server that executes whenever there is a partial upload.
       *
       * A *partial upload* occurs when a file is open when the session disconnects.
       */
      override fun onPartialUpload(onPartialUpload: List<Any>) {
        cdkBuilder.onPartialUpload(onPartialUpload.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param onPartialUpload A trigger that starts a workflow if a file is only partially
       * uploaded.
       * You can attach a workflow to a server that executes whenever there is a partial upload.
       *
       * A *partial upload* occurs when a file is open when the session disconnects.
       */
      override fun onPartialUpload(vararg onPartialUpload: Any): Unit =
          onPartialUpload(onPartialUpload.toList())

      /**
       * @param onUpload A trigger that starts a workflow: the workflow begins to execute after a
       * file is uploaded.
       * To remove an associated workflow from a server, you can provide an empty `OnUpload` object,
       * as in the following example.
       *
       * `aws transfer update-server --server-id s-01234567890abcdef --workflow-details
       * '{"OnUpload":[]}'`
       */
      override fun onUpload(onUpload: IResolvable) {
        cdkBuilder.onUpload(onUpload.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param onUpload A trigger that starts a workflow: the workflow begins to execute after a
       * file is uploaded.
       * To remove an associated workflow from a server, you can provide an empty `OnUpload` object,
       * as in the following example.
       *
       * `aws transfer update-server --server-id s-01234567890abcdef --workflow-details
       * '{"OnUpload":[]}'`
       */
      override fun onUpload(onUpload: List<Any>) {
        cdkBuilder.onUpload(onUpload.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param onUpload A trigger that starts a workflow: the workflow begins to execute after a
       * file is uploaded.
       * To remove an associated workflow from a server, you can provide an empty `OnUpload` object,
       * as in the following example.
       *
       * `aws transfer update-server --server-id s-01234567890abcdef --workflow-details
       * '{"OnUpload":[]}'`
       */
      override fun onUpload(vararg onUpload: Any): Unit = onUpload(onUpload.toList())

      public fun build(): software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty,
    ) : CdkObject(cdkObject), WorkflowDetailsProperty {
      /**
       * A trigger that starts a workflow if a file is only partially uploaded.
       *
       * You can attach a workflow to a server that executes whenever there is a partial upload.
       *
       * A *partial upload* occurs when a file is open when the session disconnects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetails.html#cfn-transfer-server-workflowdetails-onpartialupload)
       */
      override fun onPartialUpload(): Any? = unwrap(this).getOnPartialUpload()

      /**
       * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
       *
       * To remove an associated workflow from a server, you can provide an empty `OnUpload` object,
       * as in the following example.
       *
       * `aws transfer update-server --server-id s-01234567890abcdef --workflow-details
       * '{"OnUpload":[]}'`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetails.html#cfn-transfer-server-workflowdetails-onupload)
       */
      override fun onUpload(): Any? = unwrap(this).getOnUpload()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty):
          WorkflowDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as? WorkflowDetailsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty
    }
  }
}
