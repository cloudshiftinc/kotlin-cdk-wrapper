@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnServer
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.transfer.*;
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
@CdkDslMarker
public class CfnServerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnServer.Builder = CfnServer.Builder.create(scope, id)

  private val _protocols: MutableList<String> = mutableListOf()

  private val _structuredLogDestinations: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

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
   * @param certificate The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM)
   * certificate. 
   */
  public fun certificate(certificate: String) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * Specifies the domain of the storage system that is used for file transfers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-domain)
   * @param domain Specifies the domain of the storage system that is used for file transfers. 
   */
  public fun domain(domain: String) {
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
  public fun endpointDetails(endpointDetails: IResolvable) {
    cdkBuilder.endpointDetails(endpointDetails)
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
  public fun endpointDetails(endpointDetails: CfnServer.EndpointDetailsProperty) {
    cdkBuilder.endpointDetails(endpointDetails)
  }

  /**
   * The type of endpoint that you want your server to use.
   *
   * You can choose to make your server's endpoint publicly accessible (PUBLIC) or host it inside
   * your VPC. With an endpoint that is hosted in a VPC, you can restrict access to your server and
   * resources only within your VPC or choose to make it internet facing by attaching Elastic IP
   * addresses directly to it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointtype)
   * @param endpointType The type of endpoint that you want your server to use. 
   */
  public fun endpointType(endpointType: String) {
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
  public fun identityProviderDetails(identityProviderDetails: IResolvable) {
    cdkBuilder.identityProviderDetails(identityProviderDetails)
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
  public
      fun identityProviderDetails(identityProviderDetails: CfnServer.IdentityProviderDetailsProperty) {
    cdkBuilder.identityProviderDetails(identityProviderDetails)
  }

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
   * @param identityProviderType The mode of authentication for a server. 
   */
  public fun identityProviderType(identityProviderType: String) {
    cdkBuilder.identityProviderType(identityProviderType)
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that allows
   * a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents.
   *
   * When set, you can view user activity in your CloudWatch logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-loggingrole)
   * @param loggingRole The Amazon Resource Name (ARN) of the AWS Identity and Access Management
   * (IAM) role that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon
   * EFSevents. 
   */
  public fun loggingRole(loggingRole: String) {
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
  public fun postAuthenticationLoginBanner(postAuthenticationLoginBanner: String) {
    cdkBuilder.postAuthenticationLoginBanner(postAuthenticationLoginBanner)
  }

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
   * @param preAuthenticationLoginBanner Specifies a string to display when users connect to a
   * server. 
   */
  public fun preAuthenticationLoginBanner(preAuthenticationLoginBanner: String) {
    cdkBuilder.preAuthenticationLoginBanner(preAuthenticationLoginBanner)
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
   * The `Protocols` parameter is an array of strings.
   *
   * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocoldetails)
   * @param protocolDetails The protocol settings that are configured for your server. 
   */
  public fun protocolDetails(protocolDetails: IResolvable) {
    cdkBuilder.protocolDetails(protocolDetails)
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
   * The `Protocols` parameter is an array of strings.
   *
   * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocoldetails)
   * @param protocolDetails The protocol settings that are configured for your server. 
   */
  public fun protocolDetails(protocolDetails: CfnServer.ProtocolDetailsProperty) {
    cdkBuilder.protocolDetails(protocolDetails)
  }

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
   * @param protocols Specifies the file transfer protocol or protocols over which your file
   * transfer protocol client can connect to your server's endpoint. 
   */
  public fun protocols(vararg protocols: String) {
    _protocols.addAll(listOf(*protocols))
  }

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
   * @param protocols Specifies the file transfer protocol or protocols over which your file
   * transfer protocol client can connect to your server's endpoint. 
   */
  public fun protocols(protocols: Collection<String>) {
    _protocols.addAll(protocols)
  }

  /**
   * Specifies the name of the security policy that is attached to the server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-securitypolicyname)
   * @param securityPolicyName Specifies the name of the security policy that is attached to the
   * server. 
   */
  public fun securityPolicyName(securityPolicyName: String) {
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
   * If you have previously specified a log group for a server, you can clear it, and in effect turn
   * off structured logging, by providing an empty value for this parameter in an `update-server` call.
   * For example:
   *
   * `update-server --server-id s-1234567890abcdef0 --structured-log-destinations`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-structuredlogdestinations)
   * @param structuredLogDestinations Specifies the log groups to which your server logs are sent. 
   */
  public fun structuredLogDestinations(vararg structuredLogDestinations: String) {
    _structuredLogDestinations.addAll(listOf(*structuredLogDestinations))
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
   * If you have previously specified a log group for a server, you can clear it, and in effect turn
   * off structured logging, by providing an empty value for this parameter in an `update-server` call.
   * For example:
   *
   * `update-server --server-id s-1234567890abcdef0 --structured-log-destinations`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-structuredlogdestinations)
   * @param structuredLogDestinations Specifies the log groups to which your server logs are sent. 
   */
  public fun structuredLogDestinations(structuredLogDestinations: Collection<String>) {
    _structuredLogDestinations.addAll(structuredLogDestinations)
  }

  /**
   * Key-value pairs that can be used to group and search for servers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-tags)
   * @param tags Key-value pairs that can be used to group and search for servers. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Key-value pairs that can be used to group and search for servers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-tags)
   * @param tags Key-value pairs that can be used to group and search for servers. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Specifies the workflow ID for the workflow to assign and the execution role that's used for
   * executing the workflow.
   *
   * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails` can
   * also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A
   * partial upload occurs when a file is open when the session disconnects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-workflowdetails)
   * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
   * role that's used for executing the workflow. 
   */
  public fun workflowDetails(workflowDetails: IResolvable) {
    cdkBuilder.workflowDetails(workflowDetails)
  }

  /**
   * Specifies the workflow ID for the workflow to assign and the execution role that's used for
   * executing the workflow.
   *
   * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails` can
   * also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A
   * partial upload occurs when a file is open when the session disconnects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-workflowdetails)
   * @param workflowDetails Specifies the workflow ID for the workflow to assign and the execution
   * role that's used for executing the workflow. 
   */
  public fun workflowDetails(workflowDetails: CfnServer.WorkflowDetailsProperty) {
    cdkBuilder.workflowDetails(workflowDetails)
  }

  public fun build(): CfnServer {
    if(_protocols.isNotEmpty()) cdkBuilder.protocols(_protocols)
    if(_structuredLogDestinations.isNotEmpty())
        cdkBuilder.structuredLogDestinations(_structuredLogDestinations)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
