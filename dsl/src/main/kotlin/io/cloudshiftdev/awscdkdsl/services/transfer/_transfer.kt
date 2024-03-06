@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.transfer

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnAgreement
import software.amazon.awscdk.services.transfer.CfnAgreementProps
import software.amazon.awscdk.services.transfer.CfnCertificate
import software.amazon.awscdk.services.transfer.CfnCertificateProps
import software.amazon.awscdk.services.transfer.CfnConnector
import software.amazon.awscdk.services.transfer.CfnConnectorProps
import software.amazon.awscdk.services.transfer.CfnProfile
import software.amazon.awscdk.services.transfer.CfnProfileProps
import software.amazon.awscdk.services.transfer.CfnServer
import software.amazon.awscdk.services.transfer.CfnServerProps
import software.amazon.awscdk.services.transfer.CfnUser
import software.amazon.awscdk.services.transfer.CfnUserProps
import software.amazon.awscdk.services.transfer.CfnWorkflow
import software.amazon.awscdk.services.transfer.CfnWorkflowProps
import software.constructs.Construct

public object transfer {
    /**
     * Creates an agreement.
     *
     * An agreement is a bilateral trading partner agreement, or partnership, between an AWS
     * Transfer Family server and an AS2 process. The agreement defines the file and message
     * transfer relationship between the server and the AS2 process. To define an agreement,
     * Transfer Family combines a server, local profile, partner profile, certificate, and other
     * attributes.
     *
     * The partner is identified with the `PartnerProfileId` , and the AS2 process is identified
     * with the `LocalProfileId` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * CfnAgreement cfnAgreement = CfnAgreement.Builder.create(this, "MyCfnAgreement")
     * .accessRole("accessRole")
     * .baseDirectory("baseDirectory")
     * .localProfileId("localProfileId")
     * .partnerProfileId("partnerProfileId")
     * .serverId("serverId")
     * // the properties below are optional
     * .description("description")
     * .status("status")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html)
     */
    public inline fun cfnAgreement(
        scope: Construct,
        id: String,
        block: CfnAgreementDsl.() -> Unit = {},
    ): CfnAgreement {
        val builder = CfnAgreementDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAgreement`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * CfnAgreementProps cfnAgreementProps = CfnAgreementProps.builder()
     * .accessRole("accessRole")
     * .baseDirectory("baseDirectory")
     * .localProfileId("localProfileId")
     * .partnerProfileId("partnerProfileId")
     * .serverId("serverId")
     * // the properties below are optional
     * .description("description")
     * .status("status")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-agreement.html)
     */
    public inline fun cfnAgreementProps(
        block: CfnAgreementPropsDsl.() -> Unit = {}
    ): CfnAgreementProps {
        val builder = CfnAgreementPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Imports the signing and encryption certificates that you need to create local (AS2) profiles
     * and partner profiles.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * CfnCertificate cfnCertificate = CfnCertificate.Builder.create(this, "MyCfnCertificate")
     * .certificate("certificate")
     * .usage("usage")
     * // the properties below are optional
     * .activeDate("activeDate")
     * .certificateChain("certificateChain")
     * .description("description")
     * .inactiveDate("inactiveDate")
     * .privateKey("privateKey")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html)
     */
    public inline fun cfnCertificate(
        scope: Construct,
        id: String,
        block: CfnCertificateDsl.() -> Unit = {},
    ): CfnCertificate {
        val builder = CfnCertificateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCertificate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * CfnCertificateProps cfnCertificateProps = CfnCertificateProps.builder()
     * .certificate("certificate")
     * .usage("usage")
     * // the properties below are optional
     * .activeDate("activeDate")
     * .certificateChain("certificateChain")
     * .description("description")
     * .inactiveDate("inactiveDate")
     * .privateKey("privateKey")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html)
     */
    public inline fun cfnCertificateProps(
        block: CfnCertificatePropsDsl.() -> Unit = {}
    ): CfnCertificateProps {
        val builder = CfnCertificatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates the connector, which captures the parameters for a connection for the AS2 or SFTP
     * protocol.
     *
     * For AS2, the connector is required for sending files to an externally hosted AS2 server. For
     * SFTP, the connector is required when sending files to an SFTP server or receiving files from
     * an SFTP server. For more details about connectors, see
     * [Configure AS2 connectors](https://docs.aws.amazon.com/transfer/latest/userguide/configure-as2-connector.html)
     * and
     * [Create SFTP connectors](https://docs.aws.amazon.com/transfer/latest/userguide/configure-sftp-connector.html)
     * .
     *
     * You must specify exactly one configuration object: either for AS2 ( `As2Config` ) or SFTP (
     * `SftpConfig` ).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * Object as2Config;
     * CfnConnector cfnConnector = CfnConnector.Builder.create(this, "MyCfnConnector")
     * .accessRole("accessRole")
     * .url("url")
     * // the properties below are optional
     * .as2Config(as2Config)
     * .loggingRole("loggingRole")
     * .sftpConfig(SftpConfigProperty.builder()
     * .trustedHostKeys(List.of("trustedHostKeys"))
     * .userSecretId("userSecretId")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html)
     */
    public inline fun cfnConnector(
        scope: Construct,
        id: String,
        block: CfnConnectorDsl.() -> Unit = {},
    ): CfnConnector {
        val builder = CfnConnectorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains the parameters for an AS2 connector object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * As2ConfigProperty as2ConfigProperty = As2ConfigProperty.builder()
     * .basicAuthSecretId("basicAuthSecretId")
     * .compression("compression")
     * .encryptionAlgorithm("encryptionAlgorithm")
     * .localProfileId("localProfileId")
     * .mdnResponse("mdnResponse")
     * .mdnSigningAlgorithm("mdnSigningAlgorithm")
     * .messageSubject("messageSubject")
     * .partnerProfileId("partnerProfileId")
     * .signingAlgorithm("signingAlgorithm")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-as2config.html)
     */
    public inline fun cfnConnectorAs2ConfigProperty(
        block: CfnConnectorAs2ConfigPropertyDsl.() -> Unit = {}
    ): CfnConnector.As2ConfigProperty {
        val builder = CfnConnectorAs2ConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConnector`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * Object as2Config;
     * CfnConnectorProps cfnConnectorProps = CfnConnectorProps.builder()
     * .accessRole("accessRole")
     * .url("url")
     * // the properties below are optional
     * .as2Config(as2Config)
     * .loggingRole("loggingRole")
     * .sftpConfig(SftpConfigProperty.builder()
     * .trustedHostKeys(List.of("trustedHostKeys"))
     * .userSecretId("userSecretId")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-connector.html)
     */
    public inline fun cfnConnectorProps(
        block: CfnConnectorPropsDsl.() -> Unit = {}
    ): CfnConnectorProps {
        val builder = CfnConnectorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains the parameters for an SFTP connector object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * SftpConfigProperty sftpConfigProperty = SftpConfigProperty.builder()
     * .trustedHostKeys(List.of("trustedHostKeys"))
     * .userSecretId("userSecretId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-connector-sftpconfig.html)
     */
    public inline fun cfnConnectorSftpConfigProperty(
        block: CfnConnectorSftpConfigPropertyDsl.() -> Unit = {}
    ): CfnConnector.SftpConfigProperty {
        val builder = CfnConnectorSftpConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates the local or partner profile to use for AS2 transfers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * CfnProfile cfnProfile = CfnProfile.Builder.create(this, "MyCfnProfile")
     * .as2Id("as2Id")
     * .profileType("profileType")
     * // the properties below are optional
     * .certificateIds(List.of("certificateIds"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html)
     */
    public inline fun cfnProfile(
        scope: Construct,
        id: String,
        block: CfnProfileDsl.() -> Unit = {},
    ): CfnProfile {
        val builder = CfnProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProfile`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * CfnProfileProps cfnProfileProps = CfnProfileProps.builder()
     * .as2Id("as2Id")
     * .profileType("profileType")
     * // the properties below are optional
     * .certificateIds(List.of("certificateIds"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html)
     */
    public inline fun cfnProfileProps(block: CfnProfilePropsDsl.() -> Unit = {}): CfnProfileProps {
        val builder = CfnProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Instantiates an auto-scaling virtual server based on the selected file transfer protocol in
     * AWS .
     *
     * When you make updates to your file transfer protocol-enabled server or when you work with
     * users, use the service-generated `ServerId` property that is assigned to the newly created
     * server.
     *
     * Example:
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
    public inline fun cfnServer(
        scope: Construct,
        id: String,
        block: CfnServerDsl.() -> Unit = {},
    ): CfnServer {
        val builder = CfnServerDsl(scope, id)
        builder.apply(block)
        return builder.build()
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
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
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
    public inline fun cfnServerEndpointDetailsProperty(
        block: CfnServerEndpointDetailsPropertyDsl.() -> Unit = {}
    ): CfnServer.EndpointDetailsProperty {
        val builder = CfnServerEndpointDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
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
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
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
    public inline fun cfnServerIdentityProviderDetailsProperty(
        block: CfnServerIdentityProviderDetailsPropertyDsl.() -> Unit = {}
    ): CfnServer.IdentityProviderDetailsProperty {
        val builder = CfnServerIdentityProviderDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
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
    public inline fun cfnServerProps(block: CfnServerPropsDsl.() -> Unit = {}): CfnServerProps {
        val builder = CfnServerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The protocol settings that are configured for your server.
     * * To indicate passive mode (for FTP and FTPS protocols), use the `PassiveIp` parameter. Enter
     *   a single dotted-quad IPv4 address, such as the external IP address of a firewall, router,
     *   or load balancer.
     * * To ignore the error that is generated when the client attempts to use the `SETSTAT` command
     *   on a file that you are uploading to an Amazon S3 bucket, use the `SetStatOption` parameter.
     *   To have the AWS Transfer Family server ignore the `SETSTAT` command and upload files
     *   without needing to make any changes to your SFTP client, set the value to `ENABLE_NO_OP` .
     *   If you set the `SetStatOption` parameter to `ENABLE_NO_OP` , Transfer Family generates a
     *   log entry to Amazon CloudWatch Logs, so that you can determine when the client is making a
     *   `SETSTAT` call.
     * * To determine whether your AWS Transfer Family server resumes recent, negotiated sessions
     *   through a unique session ID, use the `TlsSessionResumptionMode` parameter.
     * * `As2Transports` indicates the transport method for the AS2 messages. Currently, only HTTP
     *   is supported.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
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
    public inline fun cfnServerProtocolDetailsProperty(
        block: CfnServerProtocolDetailsPropertyDsl.() -> Unit = {}
    ): CfnServer.ProtocolDetailsProperty {
        val builder = CfnServerProtocolDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon S3 storage options that are configured for your server.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * S3StorageOptionsProperty s3StorageOptionsProperty = S3StorageOptionsProperty.builder()
     * .directoryListingOptimization("directoryListingOptimization")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-s3storageoptions.html)
     */
    public inline fun cfnServerS3StorageOptionsProperty(
        block: CfnServerS3StorageOptionsPropertyDsl.() -> Unit = {}
    ): CfnServer.S3StorageOptionsProperty {
        val builder = CfnServerS3StorageOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for
     * executing the workflow.
     *
     * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails`
     * can also contain a workflow ID (and execution role) for a workflow to execute on partial
     * upload. A partial upload occurs when a file is open when the session disconnects.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * WorkflowDetailProperty workflowDetailProperty = WorkflowDetailProperty.builder()
     * .executionRole("executionRole")
     * .workflowId("workflowId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetail.html)
     */
    public inline fun cfnServerWorkflowDetailProperty(
        block: CfnServerWorkflowDetailPropertyDsl.() -> Unit = {}
    ): CfnServer.WorkflowDetailProperty {
        val builder = CfnServerWorkflowDetailPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Container for the `WorkflowDetail` data type.
     *
     * It is used by actions that trigger a workflow to begin execution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
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
    public inline fun cfnServerWorkflowDetailsProperty(
        block: CfnServerWorkflowDetailsPropertyDsl.() -> Unit = {}
    ): CfnServer.WorkflowDetailsProperty {
        val builder = CfnServerWorkflowDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Transfer::User` resource creates a user and associates them with an existing
     * server.
     *
     * You can only create and associate users with servers that have the `IdentityProviderType` set
     * to `SERVICE_MANAGED` . Using parameters for `CreateUser` , you can specify the user name, set
     * the home directory, store the user's public key, and assign the user's AWS Identity and
     * Access Management (IAM) role. You can also optionally add a session policy, and assign
     * metadata with tags that can be used to group and search for users.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
     * .role("role")
     * .serverId("serverId")
     * .userName("userName")
     * // the properties below are optional
     * .homeDirectory("homeDirectory")
     * .homeDirectoryMappings(List.of(HomeDirectoryMapEntryProperty.builder()
     * .entry("entry")
     * .target("target")
     * // the properties below are optional
     * .type("type")
     * .build()))
     * .homeDirectoryType("homeDirectoryType")
     * .policy("policy")
     * .posixProfile(PosixProfileProperty.builder()
     * .gid(123)
     * .uid(123)
     * // the properties below are optional
     * .secondaryGids(List.of(123))
     * .build())
     * .sshPublicKeys(List.of("sshPublicKeys"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html)
     */
    public inline fun cfnUser(
        scope: Construct,
        id: String,
        block: CfnUserDsl.() -> Unit = {},
    ): CfnUser {
        val builder = CfnUserDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents an object that contains entries and targets for `HomeDirectoryMappings` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * HomeDirectoryMapEntryProperty homeDirectoryMapEntryProperty =
     * HomeDirectoryMapEntryProperty.builder()
     * .entry("entry")
     * .target("target")
     * // the properties below are optional
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html)
     */
    public inline fun cfnUserHomeDirectoryMapEntryProperty(
        block: CfnUserHomeDirectoryMapEntryPropertyDsl.() -> Unit = {}
    ): CfnUser.HomeDirectoryMapEntryProperty {
        val builder = CfnUserHomeDirectoryMapEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The full POSIX identity, including user ID ( `Uid` ), group ID ( `Gid` ), and any secondary
     * groups IDs ( `SecondaryGids` ), that controls your users' access to your Amazon EFS file
     * systems.
     *
     * The POSIX permissions that are set on files and directories in your file system determine the
     * level of access your users get when transferring files into and out of your Amazon EFS file
     * systems.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * PosixProfileProperty posixProfileProperty = PosixProfileProperty.builder()
     * .gid(123)
     * .uid(123)
     * // the properties below are optional
     * .secondaryGids(List.of(123))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-posixprofile.html)
     */
    public inline fun cfnUserPosixProfileProperty(
        block: CfnUserPosixProfilePropertyDsl.() -> Unit = {}
    ): CfnUser.PosixProfileProperty {
        val builder = CfnUserPosixProfilePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUser`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * CfnUserProps cfnUserProps = CfnUserProps.builder()
     * .role("role")
     * .serverId("serverId")
     * .userName("userName")
     * // the properties below are optional
     * .homeDirectory("homeDirectory")
     * .homeDirectoryMappings(List.of(HomeDirectoryMapEntryProperty.builder()
     * .entry("entry")
     * .target("target")
     * // the properties below are optional
     * .type("type")
     * .build()))
     * .homeDirectoryType("homeDirectoryType")
     * .policy("policy")
     * .posixProfile(PosixProfileProperty.builder()
     * .gid(123)
     * .uid(123)
     * // the properties below are optional
     * .secondaryGids(List.of(123))
     * .build())
     * .sshPublicKeys(List.of("sshPublicKeys"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-user.html)
     */
    public inline fun cfnUserProps(block: CfnUserPropsDsl.() -> Unit = {}): CfnUserProps {
        val builder = CfnUserPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allows you to create a workflow with specified steps and step details the workflow invokes
     * after file transfer completes.
     *
     * After creating a workflow, you can associate the workflow created with any transfer servers
     * by specifying the `workflow-details` field in `CreateServer` and `UpdateServer` operations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * Object copyStepDetails;
     * Object customStepDetails;
     * Object deleteStepDetails;
     * Object tagStepDetails;
     * CfnWorkflow cfnWorkflow = CfnWorkflow.Builder.create(this, "MyCfnWorkflow")
     * .steps(List.of(WorkflowStepProperty.builder()
     * .copyStepDetails(copyStepDetails)
     * .customStepDetails(customStepDetails)
     * .decryptStepDetails(DecryptStepDetailsProperty.builder()
     * .destinationFileLocation(InputFileLocationProperty.builder()
     * .efsFileLocation(EfsInputFileLocationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .path("path")
     * .build())
     * .s3FileLocation(S3InputFileLocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build())
     * .name("name")
     * .overwriteExisting("overwriteExisting")
     * .sourceFileLocation("sourceFileLocation")
     * .type("type")
     * .build())
     * .deleteStepDetails(deleteStepDetails)
     * .tagStepDetails(tagStepDetails)
     * .type("type")
     * .build()))
     * // the properties below are optional
     * .description("description")
     * .onExceptionSteps(List.of(WorkflowStepProperty.builder()
     * .copyStepDetails(copyStepDetails)
     * .customStepDetails(customStepDetails)
     * .decryptStepDetails(DecryptStepDetailsProperty.builder()
     * .destinationFileLocation(InputFileLocationProperty.builder()
     * .efsFileLocation(EfsInputFileLocationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .path("path")
     * .build())
     * .s3FileLocation(S3InputFileLocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build())
     * .name("name")
     * .overwriteExisting("overwriteExisting")
     * .sourceFileLocation("sourceFileLocation")
     * .type("type")
     * .build())
     * .deleteStepDetails(deleteStepDetails)
     * .tagStepDetails(tagStepDetails)
     * .type("type")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html)
     */
    public inline fun cfnWorkflow(
        scope: Construct,
        id: String,
        block: CfnWorkflowDsl.() -> Unit = {},
    ): CfnWorkflow {
        val builder = CfnWorkflowDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for a step that performs a file copy.
     *
     * Consists of the following values:
     * * A description
     * * An Amazon S3 location for the destination of the file copy.
     * * A flag that indicates whether to overwrite an existing file of the same name. The default
     *   is `FALSE` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * CopyStepDetailsProperty copyStepDetailsProperty = CopyStepDetailsProperty.builder()
     * .destinationFileLocation(S3FileLocationProperty.builder()
     * .s3FileLocation(S3InputFileLocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build())
     * .name("name")
     * .overwriteExisting("overwriteExisting")
     * .sourceFileLocation("sourceFileLocation")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-copystepdetails.html)
     */
    public inline fun cfnWorkflowCopyStepDetailsProperty(
        block: CfnWorkflowCopyStepDetailsPropertyDsl.() -> Unit = {}
    ): CfnWorkflow.CopyStepDetailsProperty {
        val builder = CfnWorkflowCopyStepDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for a step that invokes an AWS Lambda function.
     *
     * Consists of the Lambda function's name, target, and timeout (in seconds).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * CustomStepDetailsProperty customStepDetailsProperty = CustomStepDetailsProperty.builder()
     * .name("name")
     * .sourceFileLocation("sourceFileLocation")
     * .target("target")
     * .timeoutSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-customstepdetails.html)
     */
    public inline fun cfnWorkflowCustomStepDetailsProperty(
        block: CfnWorkflowCustomStepDetailsPropertyDsl.() -> Unit = {}
    ): CfnWorkflow.CustomStepDetailsProperty {
        val builder = CfnWorkflowCustomStepDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for a step that decrypts an encrypted file.
     *
     * Consists of the following values:
     * * A descriptive name
     * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
     *   decrypt.
     * * An S3 or Amazon EFS location for the destination of the file decryption.
     * * A flag that indicates whether to overwrite an existing file of the same name. The default
     *   is `FALSE` .
     * * The type of encryption that's used. Currently, only PGP encryption is supported.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * DecryptStepDetailsProperty decryptStepDetailsProperty = DecryptStepDetailsProperty.builder()
     * .destinationFileLocation(InputFileLocationProperty.builder()
     * .efsFileLocation(EfsInputFileLocationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .path("path")
     * .build())
     * .s3FileLocation(S3InputFileLocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build())
     * .name("name")
     * .overwriteExisting("overwriteExisting")
     * .sourceFileLocation("sourceFileLocation")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html)
     */
    public inline fun cfnWorkflowDecryptStepDetailsProperty(
        block: CfnWorkflowDecryptStepDetailsPropertyDsl.() -> Unit = {}
    ): CfnWorkflow.DecryptStepDetailsProperty {
        val builder = CfnWorkflowDecryptStepDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that contains the name and file location for a file being deleted by a workflow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * DeleteStepDetailsProperty deleteStepDetailsProperty = DeleteStepDetailsProperty.builder()
     * .name("name")
     * .sourceFileLocation("sourceFileLocation")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-deletestepdetails.html)
     */
    public inline fun cfnWorkflowDeleteStepDetailsProperty(
        block: CfnWorkflowDeleteStepDetailsPropertyDsl.() -> Unit = {}
    ): CfnWorkflow.DeleteStepDetailsProperty {
        val builder = CfnWorkflowDeleteStepDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the Amazon EFS identifier and the path for the file being used.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * EfsInputFileLocationProperty efsInputFileLocationProperty =
     * EfsInputFileLocationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .path("path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-efsinputfilelocation.html)
     */
    public inline fun cfnWorkflowEfsInputFileLocationProperty(
        block: CfnWorkflowEfsInputFileLocationPropertyDsl.() -> Unit = {}
    ): CfnWorkflow.EfsInputFileLocationProperty {
        val builder = CfnWorkflowEfsInputFileLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the location for the file that's being processed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * InputFileLocationProperty inputFileLocationProperty = InputFileLocationProperty.builder()
     * .efsFileLocation(EfsInputFileLocationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .path("path")
     * .build())
     * .s3FileLocation(S3InputFileLocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-inputfilelocation.html)
     */
    public inline fun cfnWorkflowInputFileLocationProperty(
        block: CfnWorkflowInputFileLocationPropertyDsl.() -> Unit = {}
    ): CfnWorkflow.InputFileLocationProperty {
        val builder = CfnWorkflowInputFileLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWorkflow`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * Object copyStepDetails;
     * Object customStepDetails;
     * Object deleteStepDetails;
     * Object tagStepDetails;
     * CfnWorkflowProps cfnWorkflowProps = CfnWorkflowProps.builder()
     * .steps(List.of(WorkflowStepProperty.builder()
     * .copyStepDetails(copyStepDetails)
     * .customStepDetails(customStepDetails)
     * .decryptStepDetails(DecryptStepDetailsProperty.builder()
     * .destinationFileLocation(InputFileLocationProperty.builder()
     * .efsFileLocation(EfsInputFileLocationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .path("path")
     * .build())
     * .s3FileLocation(S3InputFileLocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build())
     * .name("name")
     * .overwriteExisting("overwriteExisting")
     * .sourceFileLocation("sourceFileLocation")
     * .type("type")
     * .build())
     * .deleteStepDetails(deleteStepDetails)
     * .tagStepDetails(tagStepDetails)
     * .type("type")
     * .build()))
     * // the properties below are optional
     * .description("description")
     * .onExceptionSteps(List.of(WorkflowStepProperty.builder()
     * .copyStepDetails(copyStepDetails)
     * .customStepDetails(customStepDetails)
     * .decryptStepDetails(DecryptStepDetailsProperty.builder()
     * .destinationFileLocation(InputFileLocationProperty.builder()
     * .efsFileLocation(EfsInputFileLocationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .path("path")
     * .build())
     * .s3FileLocation(S3InputFileLocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build())
     * .name("name")
     * .overwriteExisting("overwriteExisting")
     * .sourceFileLocation("sourceFileLocation")
     * .type("type")
     * .build())
     * .deleteStepDetails(deleteStepDetails)
     * .tagStepDetails(tagStepDetails)
     * .type("type")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html)
     */
    public inline fun cfnWorkflowProps(
        block: CfnWorkflowPropsDsl.() -> Unit = {}
    ): CfnWorkflowProps {
        val builder = CfnWorkflowPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the S3 details for the file being used, such as bucket, ETag, and so forth.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * S3FileLocationProperty s3FileLocationProperty = S3FileLocationProperty.builder()
     * .s3FileLocation(S3InputFileLocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3filelocation.html)
     */
    public inline fun cfnWorkflowS3FileLocationProperty(
        block: CfnWorkflowS3FileLocationPropertyDsl.() -> Unit = {}
    ): CfnWorkflow.S3FileLocationProperty {
        val builder = CfnWorkflowS3FileLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the details for the Amazon S3 location for an input file to a workflow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * S3InputFileLocationProperty s3InputFileLocationProperty = S3InputFileLocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3inputfilelocation.html)
     */
    public inline fun cfnWorkflowS3InputFileLocationProperty(
        block: CfnWorkflowS3InputFileLocationPropertyDsl.() -> Unit = {}
    ): CfnWorkflow.S3InputFileLocationProperty {
        val builder = CfnWorkflowS3InputFileLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the key-value pair that are assigned to a file during the execution of a Tagging
     * step.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * S3TagProperty s3TagProperty = S3TagProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3tag.html)
     */
    public inline fun cfnWorkflowS3TagProperty(
        block: CfnWorkflowS3TagPropertyDsl.() -> Unit = {}
    ): CfnWorkflow.S3TagProperty {
        val builder = CfnWorkflowS3TagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for a step that creates one or more tags.
     *
     * You specify one or more tags. Each tag contains a key-value pair.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * TagStepDetailsProperty tagStepDetailsProperty = TagStepDetailsProperty.builder()
     * .name("name")
     * .sourceFileLocation("sourceFileLocation")
     * .tags(List.of(S3TagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-tagstepdetails.html)
     */
    public inline fun cfnWorkflowTagStepDetailsProperty(
        block: CfnWorkflowTagStepDetailsPropertyDsl.() -> Unit = {}
    ): CfnWorkflow.TagStepDetailsProperty {
        val builder = CfnWorkflowTagStepDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The basic building block of a workflow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.transfer.*;
     * Object copyStepDetails;
     * Object customStepDetails;
     * Object deleteStepDetails;
     * Object tagStepDetails;
     * WorkflowStepProperty workflowStepProperty = WorkflowStepProperty.builder()
     * .copyStepDetails(copyStepDetails)
     * .customStepDetails(customStepDetails)
     * .decryptStepDetails(DecryptStepDetailsProperty.builder()
     * .destinationFileLocation(InputFileLocationProperty.builder()
     * .efsFileLocation(EfsInputFileLocationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .path("path")
     * .build())
     * .s3FileLocation(S3InputFileLocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build())
     * .name("name")
     * .overwriteExisting("overwriteExisting")
     * .sourceFileLocation("sourceFileLocation")
     * .type("type")
     * .build())
     * .deleteStepDetails(deleteStepDetails)
     * .tagStepDetails(tagStepDetails)
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html)
     */
    public inline fun cfnWorkflowWorkflowStepProperty(
        block: CfnWorkflowWorkflowStepPropertyDsl.() -> Unit = {}
    ): CfnWorkflow.WorkflowStepProperty {
        val builder = CfnWorkflowWorkflowStepPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
