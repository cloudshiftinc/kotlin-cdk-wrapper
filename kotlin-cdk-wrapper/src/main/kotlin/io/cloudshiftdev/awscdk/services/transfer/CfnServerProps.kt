@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

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
 * Properties for defining a `CfnServer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.transfer.*;
 * CfnServerProps cfnServerProps = CfnServerProps.builder()
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
public interface CfnServerProps {
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
   * private certificate](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-private.html)
   * in the *AWS Certificate Manager User Guide* .
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
   */
  public fun certificate(): String? = unwrap(this).getCertificate()

  /**
   * Specifies the domain of the storage system that is used for file transfers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-domain)
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * The virtual private cloud (VPC) endpoint settings that are configured for your server.
   *
   * When you host your endpoint within your VPC, you can make your endpoint accessible only to
   * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
   * accessible to clients over the internet. Your VPC's default security groups are automatically
   * assigned to your endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointdetails)
   */
  public fun endpointDetails(): Any? = unwrap(this).getEndpointDetails()

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
   * It is recommended that you use `VPC` as the `EndpointType` . With this endpoint type, you have
   * the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with your
   * server's endpoint and use VPC security groups to restrict traffic by the client's public IP
   * address. This is not possible with `EndpointType` set to `VPC_ENDPOINT` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointtype)
   */
  public fun endpointType(): String? = unwrap(this).getEndpointType()

  /**
   * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
   * `API_GATEWAY` .
   *
   * Accepts an array containing all of the information required to use a directory in
   * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
   * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityproviderdetails)
   */
  public fun identityProviderDetails(): Any? = unwrap(this).getIdentityProviderDetails()

  /**
   * The mode of authentication for a server.
   *
   * The default value is `SERVICE_MANAGED` , which allows you to store and access user credentials
   * within the AWS Transfer Family service.
   *
   * Use `AWS_DIRECTORY_SERVICE` to provide access to Active Directory groups in AWS Directory
   * Service for Microsoft Active Directory or Microsoft Active Directory in your on-premises
   * environment or in AWS using AD Connector. This option also requires you to provide a Directory ID
   * by using the `IdentityProviderDetails` parameter.
   *
   * Use the `API_GATEWAY` value to integrate with an identity provider of your choosing. The
   * `API_GATEWAY` setting requires you to provide an Amazon API Gateway endpoint URL to call for
   * authentication by using the `IdentityProviderDetails` parameter.
   *
   * Use the `AWS_LAMBDA` value to directly use an AWS Lambda function as your identity provider. If
   * you choose this value, you must specify the ARN for the Lambda function in the `Function`
   * parameter for the `IdentityProviderDetails` data type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityprovidertype)
   */
  public fun identityProviderType(): String? = unwrap(this).getIdentityProviderType()

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that allows
   * a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents.
   *
   * When set, you can view user activity in your CloudWatch logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-loggingrole)
   */
  public fun loggingRole(): String? = unwrap(this).getLoggingRole()

  /**
   * Specifies a string to display when users connect to a server. This string is displayed after
   * the user authenticates.
   *
   *
   * The SFTP protocol does not support post-authentication display banners.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-postauthenticationloginbanner)
   */
  public fun postAuthenticationLoginBanner(): String? =
      unwrap(this).getPostAuthenticationLoginBanner()

  /**
   * Specifies a string to display when users connect to a server.
   *
   * This string is displayed before the user authenticates. For example, the following banner
   * displays details about using the system:
   *
   * `This system is for the use of authorized users only. Individuals using this computer system
   * without authority, or in excess of their authority, are subject to having all of their activities
   * on this system monitored and recorded by system personnel.`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-preauthenticationloginbanner)
   */
  public fun preAuthenticationLoginBanner(): String? =
      unwrap(this).getPreAuthenticationLoginBanner()

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
   * The `Protocols` parameter is an array of strings.
   *
   * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocoldetails)
   */
  public fun protocolDetails(): Any? = unwrap(this).getProtocolDetails()

  /**
   * Specifies the file transfer protocol or protocols over which your file transfer protocol client
   * can connect to your server's endpoint.
   *
   * The available protocols are:
   *
   * * `SFTP` (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
   * * `FTPS` (File Transfer Protocol Secure): File transfer with TLS encryption
   * * `FTP` (File Transfer Protocol): Unencrypted file transfer
   * * `AS2` (Applicability Statement 2): used for transporting structured business-to-business data
   *
   *
   * * If you select `FTPS` , you must choose a certificate stored in AWS Certificate Manager (ACM)
   * which is used to identify your server when clients connect to it over FTPS.
   * * If `Protocol` includes either `FTP` or `FTPS` , then the `EndpointType` must be `VPC` and the
   * `IdentityProviderType` must be either `AWS_DIRECTORY_SERVICE` , `AWS_LAMBDA` , or `API_GATEWAY` .
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
   */
  public fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

  /**
   * Specifies whether or not performance for your Amazon S3 directories is optimized. This is
   * disabled by default.
   *
   * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
   * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
   * mapping to have a file target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-s3storageoptions)
   */
  public fun s3StorageOptions(): Any? = unwrap(this).getS3StorageOptions()

  /**
   * Specifies the name of the security policy that is attached to the server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-securitypolicyname)
   */
  public fun securityPolicyName(): String? = unwrap(this).getSecurityPolicyName()

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
   * If you have previously specified a log group for a server, you can clear it, and in effect turn
   * off structured logging, by providing an empty value for this parameter in an `update-server` call.
   * For example:
   *
   * `update-server --server-id s-1234567890abcdef0 --structured-log-destinations`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-structuredlogdestinations)
   */
  public fun structuredLogDestinations(): List<String> = unwrap(this).getStructuredLogDestinations()
      ?: emptyList()

  /**
   * Key-value pairs that can be used to group and search for servers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies the workflow ID for the workflow to assign and the execution role that's used for
   * executing the workflow.
   *
   * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails` can
   * also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A
   * partial upload occurs when a file is open when the session disconnects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-workflowdetails)
   */
  public fun workflowDetails(): Any? = unwrap(this).getWorkflowDetails()

  /**
   * A builder for [CfnServerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificate The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM)
     * certificate.
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
     */
    public fun certificate(certificate: String)

    /**
     * @param domain Specifies the domain of the storage system that is used for file transfers.
     */
    public fun domain(domain: String)

    /**
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that are configured
     * for your server.
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     */
    public fun endpointDetails(endpointDetails: IResolvable)

    /**
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that are configured
     * for your server.
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     */
    public fun endpointDetails(endpointDetails: CfnServer.EndpointDetailsProperty)

    /**
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that are configured
     * for your server.
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3aad3feabd3aa90dc199f7e58e041a1812f6b7683c8b69f1f404a02867899694")
    public
        fun endpointDetails(endpointDetails: CfnServer.EndpointDetailsProperty.Builder.() -> Unit)

    /**
     * @param endpointType The type of endpoint that you want your server to use.
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
     */
    public fun endpointType(endpointType: String)

    /**
     * @param identityProviderDetails Required when `IdentityProviderType` is set to
     * `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or `API_GATEWAY` .
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     */
    public fun identityProviderDetails(identityProviderDetails: IResolvable)

    /**
     * @param identityProviderDetails Required when `IdentityProviderType` is set to
     * `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or `API_GATEWAY` .
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     */
    public
        fun identityProviderDetails(identityProviderDetails: CfnServer.IdentityProviderDetailsProperty)

    /**
     * @param identityProviderDetails Required when `IdentityProviderType` is set to
     * `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or `API_GATEWAY` .
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6667a8bdf89f0753feaef33b9217a294a51f08fbe0aa3ea2ee73f5f953743e1c")
    public
        fun identityProviderDetails(identityProviderDetails: CfnServer.IdentityProviderDetailsProperty.Builder.() -> Unit)

    /**
     * @param identityProviderType The mode of authentication for a server.
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
     */
    public fun identityProviderType(identityProviderType: String)

    /**
     * @param loggingRole The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon
     * EFSevents.
     * When set, you can view user activity in your CloudWatch logs.
     */
    public fun loggingRole(loggingRole: String)

    /**
     * @param postAuthenticationLoginBanner Specifies a string to display when users connect to a
     * server. This string is displayed after the user authenticates.
     *
     * The SFTP protocol does not support post-authentication display banners.
     */
    public fun postAuthenticationLoginBanner(postAuthenticationLoginBanner: String)

    /**
     * @param preAuthenticationLoginBanner Specifies a string to display when users connect to a
     * server.
     * This string is displayed before the user authenticates. For example, the following banner
     * displays details about using the system:
     *
     * `This system is for the use of authorized users only. Individuals using this computer system
     * without authority, or in excess of their authority, are subject to having all of their
     * activities on this system monitored and recorded by system personnel.`
     */
    public fun preAuthenticationLoginBanner(preAuthenticationLoginBanner: String)

    /**
     * @param protocolDetails The protocol settings that are configured for your server.
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
     */
    public fun protocolDetails(protocolDetails: IResolvable)

    /**
     * @param protocolDetails The protocol settings that are configured for your server.
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
     */
    public fun protocolDetails(protocolDetails: CfnServer.ProtocolDetailsProperty)

    /**
     * @param protocolDetails The protocol settings that are configured for your server.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bbc3d66ee8227193a2ee88f5caa15361313225e1e0a66c9f32d77f54f8bcfcf")
    public
        fun protocolDetails(protocolDetails: CfnServer.ProtocolDetailsProperty.Builder.() -> Unit)

    /**
     * @param protocols Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint.
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
     */
    public fun protocols(protocols: List<String>)

    /**
     * @param protocols Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint.
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
     */
    public fun protocols(vararg protocols: String)

    /**
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories
     * is optimized. This is disabled by default.
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     */
    public fun s3StorageOptions(s3StorageOptions: IResolvable)

    /**
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories
     * is optimized. This is disabled by default.
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     */
    public fun s3StorageOptions(s3StorageOptions: CfnServer.S3StorageOptionsProperty)

    /**
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories
     * is optimized. This is disabled by default.
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d5c2ccf7baee0839a5a63d0df370c197c84eacbb07af1249ab365c0fe8f5e79")
    public
        fun s3StorageOptions(s3StorageOptions: CfnServer.S3StorageOptionsProperty.Builder.() -> Unit)

    /**
     * @param securityPolicyName Specifies the name of the security policy that is attached to the
     * server.
     */
    public fun securityPolicyName(securityPolicyName: String)

    /**
     * @param structuredLogDestinations Specifies the log groups to which your server logs are sent.
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
     */
    public fun structuredLogDestinations(structuredLogDestinations: List<String>)

    /**
     * @param structuredLogDestinations Specifies the log groups to which your server logs are sent.
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
     */
    public fun structuredLogDestinations(vararg structuredLogDestinations: String)

    /**
     * @param tags Key-value pairs that can be used to group and search for servers.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs that can be used to group and search for servers.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
     * role that's used for executing the workflow.
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     */
    public fun workflowDetails(workflowDetails: IResolvable)

    /**
     * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
     * role that's used for executing the workflow.
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     */
    public fun workflowDetails(workflowDetails: CfnServer.WorkflowDetailsProperty)

    /**
     * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
     * role that's used for executing the workflow.
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ae894fabf61c848aa94abd87d00d72cf85150ed4e548ee128b3de4c0953f6892")
    public
        fun workflowDetails(workflowDetails: CfnServer.WorkflowDetailsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnServerProps.Builder =
        software.amazon.awscdk.services.transfer.CfnServerProps.builder()

    /**
     * @param certificate The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM)
     * certificate.
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
     */
    override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    /**
     * @param domain Specifies the domain of the storage system that is used for file transfers.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that are configured
     * for your server.
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     */
    override fun endpointDetails(endpointDetails: IResolvable) {
      cdkBuilder.endpointDetails(endpointDetails.let(IResolvable::unwrap))
    }

    /**
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that are configured
     * for your server.
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     */
    override fun endpointDetails(endpointDetails: CfnServer.EndpointDetailsProperty) {
      cdkBuilder.endpointDetails(endpointDetails.let(CfnServer.EndpointDetailsProperty::unwrap))
    }

    /**
     * @param endpointDetails The virtual private cloud (VPC) endpoint settings that are configured
     * for your server.
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3aad3feabd3aa90dc199f7e58e041a1812f6b7683c8b69f1f404a02867899694")
    override
        fun endpointDetails(endpointDetails: CfnServer.EndpointDetailsProperty.Builder.() -> Unit):
        Unit = endpointDetails(CfnServer.EndpointDetailsProperty(endpointDetails))

    /**
     * @param endpointType The type of endpoint that you want your server to use.
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
     */
    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    /**
     * @param identityProviderDetails Required when `IdentityProviderType` is set to
     * `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or `API_GATEWAY` .
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     */
    override fun identityProviderDetails(identityProviderDetails: IResolvable) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(IResolvable::unwrap))
    }

    /**
     * @param identityProviderDetails Required when `IdentityProviderType` is set to
     * `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or `API_GATEWAY` .
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     */
    override
        fun identityProviderDetails(identityProviderDetails: CfnServer.IdentityProviderDetailsProperty) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(CfnServer.IdentityProviderDetailsProperty::unwrap))
    }

    /**
     * @param identityProviderDetails Required when `IdentityProviderType` is set to
     * `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or `API_GATEWAY` .
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6667a8bdf89f0753feaef33b9217a294a51f08fbe0aa3ea2ee73f5f953743e1c")
    override
        fun identityProviderDetails(identityProviderDetails: CfnServer.IdentityProviderDetailsProperty.Builder.() -> Unit):
        Unit =
        identityProviderDetails(CfnServer.IdentityProviderDetailsProperty(identityProviderDetails))

    /**
     * @param identityProviderType The mode of authentication for a server.
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
     */
    override fun identityProviderType(identityProviderType: String) {
      cdkBuilder.identityProviderType(identityProviderType)
    }

    /**
     * @param loggingRole The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon
     * EFSevents.
     * When set, you can view user activity in your CloudWatch logs.
     */
    override fun loggingRole(loggingRole: String) {
      cdkBuilder.loggingRole(loggingRole)
    }

    /**
     * @param postAuthenticationLoginBanner Specifies a string to display when users connect to a
     * server. This string is displayed after the user authenticates.
     *
     * The SFTP protocol does not support post-authentication display banners.
     */
    override fun postAuthenticationLoginBanner(postAuthenticationLoginBanner: String) {
      cdkBuilder.postAuthenticationLoginBanner(postAuthenticationLoginBanner)
    }

    /**
     * @param preAuthenticationLoginBanner Specifies a string to display when users connect to a
     * server.
     * This string is displayed before the user authenticates. For example, the following banner
     * displays details about using the system:
     *
     * `This system is for the use of authorized users only. Individuals using this computer system
     * without authority, or in excess of their authority, are subject to having all of their
     * activities on this system monitored and recorded by system personnel.`
     */
    override fun preAuthenticationLoginBanner(preAuthenticationLoginBanner: String) {
      cdkBuilder.preAuthenticationLoginBanner(preAuthenticationLoginBanner)
    }

    /**
     * @param protocolDetails The protocol settings that are configured for your server.
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
     */
    override fun protocolDetails(protocolDetails: IResolvable) {
      cdkBuilder.protocolDetails(protocolDetails.let(IResolvable::unwrap))
    }

    /**
     * @param protocolDetails The protocol settings that are configured for your server.
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
     */
    override fun protocolDetails(protocolDetails: CfnServer.ProtocolDetailsProperty) {
      cdkBuilder.protocolDetails(protocolDetails.let(CfnServer.ProtocolDetailsProperty::unwrap))
    }

    /**
     * @param protocolDetails The protocol settings that are configured for your server.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bbc3d66ee8227193a2ee88f5caa15361313225e1e0a66c9f32d77f54f8bcfcf")
    override
        fun protocolDetails(protocolDetails: CfnServer.ProtocolDetailsProperty.Builder.() -> Unit):
        Unit = protocolDetails(CfnServer.ProtocolDetailsProperty(protocolDetails))

    /**
     * @param protocols Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint.
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
     */
    override fun protocols(protocols: List<String>) {
      cdkBuilder.protocols(protocols)
    }

    /**
     * @param protocols Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint.
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
     */
    override fun protocols(vararg protocols: String): Unit = protocols(protocols.toList())

    /**
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories
     * is optimized. This is disabled by default.
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     */
    override fun s3StorageOptions(s3StorageOptions: IResolvable) {
      cdkBuilder.s3StorageOptions(s3StorageOptions.let(IResolvable::unwrap))
    }

    /**
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories
     * is optimized. This is disabled by default.
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     */
    override fun s3StorageOptions(s3StorageOptions: CfnServer.S3StorageOptionsProperty) {
      cdkBuilder.s3StorageOptions(s3StorageOptions.let(CfnServer.S3StorageOptionsProperty::unwrap))
    }

    /**
     * @param s3StorageOptions Specifies whether or not performance for your Amazon S3 directories
     * is optimized. This is disabled by default.
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d5c2ccf7baee0839a5a63d0df370c197c84eacbb07af1249ab365c0fe8f5e79")
    override
        fun s3StorageOptions(s3StorageOptions: CfnServer.S3StorageOptionsProperty.Builder.() -> Unit):
        Unit = s3StorageOptions(CfnServer.S3StorageOptionsProperty(s3StorageOptions))

    /**
     * @param securityPolicyName Specifies the name of the security policy that is attached to the
     * server.
     */
    override fun securityPolicyName(securityPolicyName: String) {
      cdkBuilder.securityPolicyName(securityPolicyName)
    }

    /**
     * @param structuredLogDestinations Specifies the log groups to which your server logs are sent.
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
     */
    override fun structuredLogDestinations(structuredLogDestinations: List<String>) {
      cdkBuilder.structuredLogDestinations(structuredLogDestinations)
    }

    /**
     * @param structuredLogDestinations Specifies the log groups to which your server logs are sent.
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
     */
    override fun structuredLogDestinations(vararg structuredLogDestinations: String): Unit =
        structuredLogDestinations(structuredLogDestinations.toList())

    /**
     * @param tags Key-value pairs that can be used to group and search for servers.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for servers.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
     * role that's used for executing the workflow.
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     */
    override fun workflowDetails(workflowDetails: IResolvable) {
      cdkBuilder.workflowDetails(workflowDetails.let(IResolvable::unwrap))
    }

    /**
     * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
     * role that's used for executing the workflow.
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     */
    override fun workflowDetails(workflowDetails: CfnServer.WorkflowDetailsProperty) {
      cdkBuilder.workflowDetails(workflowDetails.let(CfnServer.WorkflowDetailsProperty::unwrap))
    }

    /**
     * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
     * role that's used for executing the workflow.
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ae894fabf61c848aa94abd87d00d72cf85150ed4e548ee128b3de4c0953f6892")
    override
        fun workflowDetails(workflowDetails: CfnServer.WorkflowDetailsProperty.Builder.() -> Unit):
        Unit = workflowDetails(CfnServer.WorkflowDetailsProperty(workflowDetails))

    public fun build(): software.amazon.awscdk.services.transfer.CfnServerProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.transfer.CfnServerProps,
  ) : CdkObject(cdkObject), CfnServerProps {
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
     */
    override fun certificate(): String? = unwrap(this).getCertificate()

    /**
     * Specifies the domain of the storage system that is used for file transfers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-domain)
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * The virtual private cloud (VPC) endpoint settings that are configured for your server.
     *
     * When you host your endpoint within your VPC, you can make your endpoint accessible only to
     * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
     * accessible to clients over the internet. Your VPC's default security groups are automatically
     * assigned to your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointdetails)
     */
    override fun endpointDetails(): Any? = unwrap(this).getEndpointDetails()

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
     */
    override fun endpointType(): String? = unwrap(this).getEndpointType()

    /**
     * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
     * `API_GATEWAY` .
     *
     * Accepts an array containing all of the information required to use a directory in
     * `AWS_DIRECTORY_SERVICE` or invoke a customer-supplied authentication API, including the API
     * Gateway URL. Not required when `IdentityProviderType` is set to `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityproviderdetails)
     */
    override fun identityProviderDetails(): Any? = unwrap(this).getIdentityProviderDetails()

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
     */
    override fun identityProviderType(): String? = unwrap(this).getIdentityProviderType()

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents.
     *
     * When set, you can view user activity in your CloudWatch logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-loggingrole)
     */
    override fun loggingRole(): String? = unwrap(this).getLoggingRole()

    /**
     * Specifies a string to display when users connect to a server. This string is displayed after
     * the user authenticates.
     *
     *
     * The SFTP protocol does not support post-authentication display banners.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-postauthenticationloginbanner)
     */
    override fun postAuthenticationLoginBanner(): String? =
        unwrap(this).getPostAuthenticationLoginBanner()

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
     */
    override fun preAuthenticationLoginBanner(): String? =
        unwrap(this).getPreAuthenticationLoginBanner()

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
     */
    override fun protocolDetails(): Any? = unwrap(this).getProtocolDetails()

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
     */
    override fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

    /**
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is
     * disabled by default.
     *
     * By default, home directory mappings have a `TYPE` of `DIRECTORY` . If you enable this option,
     * you would then need to explicitly set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a
     * mapping to have a file target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-s3storageoptions)
     */
    override fun s3StorageOptions(): Any? = unwrap(this).getS3StorageOptions()

    /**
     * Specifies the name of the security policy that is attached to the server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-securitypolicyname)
     */
    override fun securityPolicyName(): String? = unwrap(this).getSecurityPolicyName()

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
     */
    override fun structuredLogDestinations(): List<String> =
        unwrap(this).getStructuredLogDestinations() ?: emptyList()

    /**
     * Key-value pairs that can be used to group and search for servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for
     * executing the workflow.
     *
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial upload.
     * A partial upload occurs when a file is open when the session disconnects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-workflowdetails)
     */
    override fun workflowDetails(): Any? = unwrap(this).getWorkflowDetails()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServerProps):
        CfnServerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnServerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServerProps):
        software.amazon.awscdk.services.transfer.CfnServerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.transfer.CfnServerProps
  }
}
