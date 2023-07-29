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

package cloudshift.awscdk.dsl.services.appstream

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnAppBlock
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilder
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps
import software.amazon.awscdk.services.appstream.CfnAppBlockProps
import software.amazon.awscdk.services.appstream.CfnApplication
import software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation
import software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps
import software.amazon.awscdk.services.appstream.CfnApplicationProps
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig
import software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps
import software.amazon.awscdk.services.appstream.CfnEntitlement
import software.amazon.awscdk.services.appstream.CfnEntitlementProps
import software.amazon.awscdk.services.appstream.CfnFleet
import software.amazon.awscdk.services.appstream.CfnFleetProps
import software.amazon.awscdk.services.appstream.CfnImageBuilder
import software.amazon.awscdk.services.appstream.CfnImageBuilderProps
import software.amazon.awscdk.services.appstream.CfnStack
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociation
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps
import software.amazon.awscdk.services.appstream.CfnStackProps
import software.amazon.awscdk.services.appstream.CfnStackUserAssociation
import software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps
import software.amazon.awscdk.services.appstream.CfnUser
import software.amazon.awscdk.services.appstream.CfnUserProps
import software.constructs.Construct

public object appstream {
    /**
     * This resource creates an app block.
     *
     * App blocks store details about the virtual hard disk that contains the files for the
     * application in an S3 bucket. It also stores the setup script with details about how to mount
     * the virtual hard disk. App blocks are only supported for Elastic fleets.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnAppBlock cfnAppBlock = CfnAppBlock.Builder.create(this, "MyCfnAppBlock")
     * .name("name")
     * .sourceS3Location(S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3Key("s3Key")
     * .build())
     * // the properties below are optional
     * .description("description")
     * .displayName("displayName")
     * .packagingType("packagingType")
     * .postSetupScriptDetails(ScriptDetailsProperty.builder()
     * .executablePath("executablePath")
     * .scriptS3Location(S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3Key("s3Key")
     * .build())
     * .timeoutInSeconds(123)
     * // the properties below are optional
     * .executableParameters("executableParameters")
     * .build())
     * .setupScriptDetails(ScriptDetailsProperty.builder()
     * .executablePath("executablePath")
     * .scriptS3Location(S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3Key("s3Key")
     * .build())
     * .timeoutInSeconds(123)
     * // the properties below are optional
     * .executableParameters("executableParameters")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html)
     */
    public inline fun cfnAppBlock(
        scope: Construct,
        id: String,
        block: CfnAppBlockDsl.() -> Unit = {},
    ): CfnAppBlock {
        val builder = CfnAppBlockDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an app block builder.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnAppBlockBuilder cfnAppBlockBuilder = CfnAppBlockBuilder.Builder.create(this,
     * "MyCfnAppBlockBuilder")
     * .instanceType("instanceType")
     * .name("name")
     * .platform("platform")
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * // the properties below are optional
     * .accessEndpoints(List.of(AccessEndpointProperty.builder()
     * .endpointType("endpointType")
     * .vpceId("vpceId")
     * .build()))
     * .appBlockArns(List.of("appBlockArns"))
     * .description("description")
     * .displayName("displayName")
     * .enableDefaultInternetAccess(false)
     * .iamRoleArn("iamRoleArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html)
     */
    public inline fun cfnAppBlockBuilder(
        scope: Construct,
        id: String,
        block: CfnAppBlockBuilderDsl.() -> Unit = {},
    ): CfnAppBlockBuilder {
        val builder = CfnAppBlockBuilderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an interface VPC endpoint (interface endpoint) that lets you create a private
     * connection between the virtual private cloud (VPC) that you specify and AppStream 2.0. When
     * you specify an interface endpoint for a stack, users of the stack can connect to AppStream
     * 2.0 only through that endpoint. When you specify an interface endpoint for an image builder,
     * administrators can connect to the image builder only through that endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * AccessEndpointProperty accessEndpointProperty = AccessEndpointProperty.builder()
     * .endpointType("endpointType")
     * .vpceId("vpceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblockbuilder-accessendpoint.html)
     */
    public inline fun cfnAppBlockBuilderAccessEndpointProperty(
        block: CfnAppBlockBuilderAccessEndpointPropertyDsl.() -> Unit = {}
    ): CfnAppBlockBuilder.AccessEndpointProperty {
        val builder = CfnAppBlockBuilderAccessEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAppBlockBuilder`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnAppBlockBuilderProps cfnAppBlockBuilderProps = CfnAppBlockBuilderProps.builder()
     * .instanceType("instanceType")
     * .name("name")
     * .platform("platform")
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * // the properties below are optional
     * .accessEndpoints(List.of(AccessEndpointProperty.builder()
     * .endpointType("endpointType")
     * .vpceId("vpceId")
     * .build()))
     * .appBlockArns(List.of("appBlockArns"))
     * .description("description")
     * .displayName("displayName")
     * .enableDefaultInternetAccess(false)
     * .iamRoleArn("iamRoleArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html)
     */
    public inline fun cfnAppBlockBuilderProps(
        block: CfnAppBlockBuilderPropsDsl.() -> Unit = {}
    ): CfnAppBlockBuilderProps {
        val builder = CfnAppBlockBuilderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes VPC configuration information for fleets and image builders.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblockbuilder-vpcconfig.html)
     */
    public inline fun cfnAppBlockBuilderVpcConfigProperty(
        block: CfnAppBlockBuilderVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnAppBlockBuilder.VpcConfigProperty {
        val builder = CfnAppBlockBuilderVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAppBlock`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnAppBlockProps cfnAppBlockProps = CfnAppBlockProps.builder()
     * .name("name")
     * .sourceS3Location(S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3Key("s3Key")
     * .build())
     * // the properties below are optional
     * .description("description")
     * .displayName("displayName")
     * .packagingType("packagingType")
     * .postSetupScriptDetails(ScriptDetailsProperty.builder()
     * .executablePath("executablePath")
     * .scriptS3Location(S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3Key("s3Key")
     * .build())
     * .timeoutInSeconds(123)
     * // the properties below are optional
     * .executableParameters("executableParameters")
     * .build())
     * .setupScriptDetails(ScriptDetailsProperty.builder()
     * .executablePath("executablePath")
     * .scriptS3Location(S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3Key("s3Key")
     * .build())
     * .timeoutInSeconds(123)
     * // the properties below are optional
     * .executableParameters("executableParameters")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html)
     */
    public inline fun cfnAppBlockProps(
        block: CfnAppBlockPropsDsl.() -> Unit = {}
    ): CfnAppBlockProps {
        val builder = CfnAppBlockPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The S3 location of the app block.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3Key("s3Key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-s3location.html)
     */
    public inline fun cfnAppBlockS3LocationProperty(
        block: CfnAppBlockS3LocationPropertyDsl.() -> Unit = {}
    ): CfnAppBlock.S3LocationProperty {
        val builder = CfnAppBlockS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the script.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * ScriptDetailsProperty scriptDetailsProperty = ScriptDetailsProperty.builder()
     * .executablePath("executablePath")
     * .scriptS3Location(S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3Key("s3Key")
     * .build())
     * .timeoutInSeconds(123)
     * // the properties below are optional
     * .executableParameters("executableParameters")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-scriptdetails.html)
     */
    public inline fun cfnAppBlockScriptDetailsProperty(
        block: CfnAppBlockScriptDetailsPropertyDsl.() -> Unit = {}
    ): CfnAppBlock.ScriptDetailsProperty {
        val builder = CfnAppBlockScriptDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource creates an application.
     *
     * Applications store the details about how to launch applications on streaming instances. This
     * is only supported for Elastic fleets.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
     * .appBlockArn("appBlockArn")
     * .iconS3Location(S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build())
     * .instanceFamilies(List.of("instanceFamilies"))
     * .launchPath("launchPath")
     * .name("name")
     * .platforms(List.of("platforms"))
     * // the properties below are optional
     * .attributesToDelete(List.of("attributesToDelete"))
     * .description("description")
     * .displayName("displayName")
     * .launchParameters("launchParameters")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html)
     */
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates an application to an entitlement.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnApplicationEntitlementAssociation cfnApplicationEntitlementAssociation =
     * CfnApplicationEntitlementAssociation.Builder.create(this,
     * "MyCfnApplicationEntitlementAssociation")
     * .applicationIdentifier("applicationIdentifier")
     * .entitlementName("entitlementName")
     * .stackName("stackName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html)
     */
    public inline fun cfnApplicationEntitlementAssociation(
        scope: Construct,
        id: String,
        block: CfnApplicationEntitlementAssociationDsl.() -> Unit = {},
    ): CfnApplicationEntitlementAssociation {
        val builder = CfnApplicationEntitlementAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplicationEntitlementAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnApplicationEntitlementAssociationProps cfnApplicationEntitlementAssociationProps =
     * CfnApplicationEntitlementAssociationProps.builder()
     * .applicationIdentifier("applicationIdentifier")
     * .entitlementName("entitlementName")
     * .stackName("stackName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html)
     */
    public inline fun cfnApplicationEntitlementAssociationProps(
        block: CfnApplicationEntitlementAssociationPropsDsl.() -> Unit = {}
    ): CfnApplicationEntitlementAssociationProps {
        val builder = CfnApplicationEntitlementAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource associates the specified application with the specified fleet.
     *
     * This is only supported for Elastic fleets.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnApplicationFleetAssociation cfnApplicationFleetAssociation =
     * CfnApplicationFleetAssociation.Builder.create(this, "MyCfnApplicationFleetAssociation")
     * .applicationArn("applicationArn")
     * .fleetName("fleetName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html)
     */
    public inline fun cfnApplicationFleetAssociation(
        scope: Construct,
        id: String,
        block: CfnApplicationFleetAssociationDsl.() -> Unit = {},
    ): CfnApplicationFleetAssociation {
        val builder = CfnApplicationFleetAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplicationFleetAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnApplicationFleetAssociationProps cfnApplicationFleetAssociationProps =
     * CfnApplicationFleetAssociationProps.builder()
     * .applicationArn("applicationArn")
     * .fleetName("fleetName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html)
     */
    public inline fun cfnApplicationFleetAssociationProps(
        block: CfnApplicationFleetAssociationPropsDsl.() -> Unit = {}
    ): CfnApplicationFleetAssociationProps {
        val builder = CfnApplicationFleetAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplication`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
     * .appBlockArn("appBlockArn")
     * .iconS3Location(S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build())
     * .instanceFamilies(List.of("instanceFamilies"))
     * .launchPath("launchPath")
     * .name("name")
     * .platforms(List.of("platforms"))
     * // the properties below are optional
     * .attributesToDelete(List.of("attributesToDelete"))
     * .description("description")
     * .displayName("displayName")
     * .launchParameters("launchParameters")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html)
     */
    public inline fun cfnApplicationProps(
        block: CfnApplicationPropsDsl.() -> Unit = {}
    ): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The S3 location of the application icon.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-application-s3location.html)
     */
    public inline fun cfnApplicationS3LocationProperty(
        block: CfnApplicationS3LocationPropertyDsl.() -> Unit = {}
    ): CfnApplication.S3LocationProperty {
        val builder = CfnApplicationS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppStream::DirectoryConfig` resource specifies the configuration information
     * required to join Amazon AppStream 2.0 fleets and image builders to Microsoft Active Directory
     * domains.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnDirectoryConfig cfnDirectoryConfig = CfnDirectoryConfig.Builder.create(this,
     * "MyCfnDirectoryConfig")
     * .directoryName("directoryName")
     * .organizationalUnitDistinguishedNames(List.of("organizationalUnitDistinguishedNames"))
     * .serviceAccountCredentials(ServiceAccountCredentialsProperty.builder()
     * .accountName("accountName")
     * .accountPassword("accountPassword")
     * .build())
     * // the properties below are optional
     * .certificateBasedAuthProperties(CertificateBasedAuthPropertiesProperty.builder()
     * .certificateAuthorityArn("certificateAuthorityArn")
     * .status("status")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html)
     */
    public inline fun cfnDirectoryConfig(
        scope: Construct,
        id: String,
        block: CfnDirectoryConfigDsl.() -> Unit = {},
    ): CfnDirectoryConfig {
        val builder = CfnDirectoryConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The certificate-based authentication properties used to authenticate SAML 2.0 Identity
     * Provider (IdP) user identities to Active Directory domain-joined streaming instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CertificateBasedAuthPropertiesProperty certificateBasedAuthPropertiesProperty =
     * CertificateBasedAuthPropertiesProperty.builder()
     * .certificateAuthorityArn("certificateAuthorityArn")
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-certificatebasedauthproperties.html)
     */
    public inline fun cfnDirectoryConfigCertificateBasedAuthPropertiesProperty(
        block: CfnDirectoryConfigCertificateBasedAuthPropertiesPropertyDsl.() -> Unit = {}
    ): CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty {
        val builder = CfnDirectoryConfigCertificateBasedAuthPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDirectoryConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnDirectoryConfigProps cfnDirectoryConfigProps = CfnDirectoryConfigProps.builder()
     * .directoryName("directoryName")
     * .organizationalUnitDistinguishedNames(List.of("organizationalUnitDistinguishedNames"))
     * .serviceAccountCredentials(ServiceAccountCredentialsProperty.builder()
     * .accountName("accountName")
     * .accountPassword("accountPassword")
     * .build())
     * // the properties below are optional
     * .certificateBasedAuthProperties(CertificateBasedAuthPropertiesProperty.builder()
     * .certificateAuthorityArn("certificateAuthorityArn")
     * .status("status")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html)
     */
    public inline fun cfnDirectoryConfigProps(
        block: CfnDirectoryConfigPropsDsl.() -> Unit = {}
    ): CfnDirectoryConfigProps {
        val builder = CfnDirectoryConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The credentials for the service account used by the streaming instance to connect to the
     * directory.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * ServiceAccountCredentialsProperty serviceAccountCredentialsProperty =
     * ServiceAccountCredentialsProperty.builder()
     * .accountName("accountName")
     * .accountPassword("accountPassword")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html)
     */
    public inline fun cfnDirectoryConfigServiceAccountCredentialsProperty(
        block: CfnDirectoryConfigServiceAccountCredentialsPropertyDsl.() -> Unit = {}
    ): CfnDirectoryConfig.ServiceAccountCredentialsProperty {
        val builder = CfnDirectoryConfigServiceAccountCredentialsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an entitlement to control access, based on user attributes, to specific applications
     * within a stack.
     *
     * Entitlements apply to SAML 2.0 federated user identities. Amazon AppStream 2.0 user pool and
     * streaming URL users are entitled to all applications in a stack. Entitlements don't apply to
     * the desktop stream view application or to applications managed by a dynamic app provider
     * using the Dynamic Application Framework.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnEntitlement cfnEntitlement = CfnEntitlement.Builder.create(this, "MyCfnEntitlement")
     * .appVisibility("appVisibility")
     * .attributes(List.of(AttributeProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .name("name")
     * .stackName("stackName")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html)
     */
    public inline fun cfnEntitlement(
        scope: Construct,
        id: String,
        block: CfnEntitlementDsl.() -> Unit = {},
    ): CfnEntitlement {
        val builder = CfnEntitlementDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An attribute that belongs to an entitlement.
     *
     * Application entitlements work by matching a supported SAML 2.0 attribute name to a value when
     * a user identity federates to an AppStream 2.0 SAML application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * AttributeProperty attributeProperty = AttributeProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-entitlement-attribute.html)
     */
    public inline fun cfnEntitlementAttributeProperty(
        block: CfnEntitlementAttributePropertyDsl.() -> Unit = {}
    ): CfnEntitlement.AttributeProperty {
        val builder = CfnEntitlementAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEntitlement`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnEntitlementProps cfnEntitlementProps = CfnEntitlementProps.builder()
     * .appVisibility("appVisibility")
     * .attributes(List.of(AttributeProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .name("name")
     * .stackName("stackName")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html)
     */
    public inline fun cfnEntitlementProps(
        block: CfnEntitlementPropsDsl.() -> Unit = {}
    ): CfnEntitlementProps {
        val builder = CfnEntitlementPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppStream::Fleet` resource creates a fleet for Amazon AppStream 2.0. A fleet
     * consists of streaming instances that run a specified image when using Always-On or On-Demand.
     *
     * Example:
     * ```
     * CfnFleet fleet = CfnFleet.Builder.create(this, "Fleet")
     * .instanceType("stream.standard.small")
     * .name("Fleet")
     * .computeCapacity(ComputeCapacityProperty.builder()
     * .desiredInstances(1)
     * .build())
     * .imageName("AppStream-AmazonLinux2-09-21-2022")
     * .build();
     * fleet.getCfnOptions().getCreationPolicy() = CfnCreationPolicy.builder()
     * .startFleet(true)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html)
     */
    public inline fun cfnFleet(
        scope: Construct,
        id: String,
        block: CfnFleetDsl.() -> Unit = {},
    ): CfnFleet {
        val builder = CfnFleetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The desired capacity for a fleet.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * ComputeCapacityProperty computeCapacityProperty = ComputeCapacityProperty.builder()
     * .desiredInstances(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html)
     */
    public inline fun cfnFleetComputeCapacityProperty(
        block: CfnFleetComputeCapacityPropertyDsl.() -> Unit = {}
    ): CfnFleet.ComputeCapacityProperty {
        val builder = CfnFleetComputeCapacityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The name of the directory and organizational unit (OU) to use to join a fleet to a Microsoft
     * Active Directory domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * DomainJoinInfoProperty domainJoinInfoProperty = DomainJoinInfoProperty.builder()
     * .directoryName("directoryName")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html)
     */
    public inline fun cfnFleetDomainJoinInfoProperty(
        block: CfnFleetDomainJoinInfoPropertyDsl.() -> Unit = {}
    ): CfnFleet.DomainJoinInfoProperty {
        val builder = CfnFleetDomainJoinInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFleet`.
     *
     * Example:
     * ```
     * CfnFleet fleet = CfnFleet.Builder.create(this, "Fleet")
     * .instanceType("stream.standard.small")
     * .name("Fleet")
     * .computeCapacity(ComputeCapacityProperty.builder()
     * .desiredInstances(1)
     * .build())
     * .imageName("AppStream-AmazonLinux2-09-21-2022")
     * .build();
     * fleet.getCfnOptions().getCreationPolicy() = CfnCreationPolicy.builder()
     * .startFleet(true)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html)
     */
    public inline fun cfnFleetProps(block: CfnFleetPropsDsl.() -> Unit = {}): CfnFleetProps {
        val builder = CfnFleetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the S3 location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-s3location.html)
     */
    public inline fun cfnFleetS3LocationProperty(
        block: CfnFleetS3LocationPropertyDsl.() -> Unit = {}
    ): CfnFleet.S3LocationProperty {
        val builder = CfnFleetS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The VPC configuration information for the fleet.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-vpcconfig.html)
     */
    public inline fun cfnFleetVpcConfigProperty(
        block: CfnFleetVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnFleet.VpcConfigProperty {
        val builder = CfnFleetVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppStream::ImageBuilder` resource creates an image builder for Amazon AppStream
     * 2.0. An image builder is a virtual machine that is used to create an image.
     *
     * The initial state of the image builder is `PENDING` . When it is ready, the state is
     * `RUNNING` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnImageBuilder cfnImageBuilder = CfnImageBuilder.Builder.create(this, "MyCfnImageBuilder")
     * .instanceType("instanceType")
     * .name("name")
     * // the properties below are optional
     * .accessEndpoints(List.of(AccessEndpointProperty.builder()
     * .endpointType("endpointType")
     * .vpceId("vpceId")
     * .build()))
     * .appstreamAgentVersion("appstreamAgentVersion")
     * .description("description")
     * .displayName("displayName")
     * .domainJoinInfo(DomainJoinInfoProperty.builder()
     * .directoryName("directoryName")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .build())
     * .enableDefaultInternetAccess(false)
     * .iamRoleArn("iamRoleArn")
     * .imageArn("imageArn")
     * .imageName("imageName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html)
     */
    public inline fun cfnImageBuilder(
        scope: Construct,
        id: String,
        block: CfnImageBuilderDsl.() -> Unit = {},
    ): CfnImageBuilder {
        val builder = CfnImageBuilderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an interface VPC endpoint (interface endpoint) that lets you create a private
     * connection between the virtual private cloud (VPC) that you specify and AppStream 2.0. When
     * you specify an interface endpoint for a stack, users of the stack can connect to AppStream
     * 2.0 only through that endpoint. When you specify an interface endpoint for an image builder,
     * administrators can connect to the image builder only through that endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * AccessEndpointProperty accessEndpointProperty = AccessEndpointProperty.builder()
     * .endpointType("endpointType")
     * .vpceId("vpceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-accessendpoint.html)
     */
    public inline fun cfnImageBuilderAccessEndpointProperty(
        block: CfnImageBuilderAccessEndpointPropertyDsl.() -> Unit = {}
    ): CfnImageBuilder.AccessEndpointProperty {
        val builder = CfnImageBuilderAccessEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The name of the directory and organizational unit (OU) to use to join the image builder to a
     * Microsoft Active Directory domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * DomainJoinInfoProperty domainJoinInfoProperty = DomainJoinInfoProperty.builder()
     * .directoryName("directoryName")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-domainjoininfo.html)
     */
    public inline fun cfnImageBuilderDomainJoinInfoProperty(
        block: CfnImageBuilderDomainJoinInfoPropertyDsl.() -> Unit = {}
    ): CfnImageBuilder.DomainJoinInfoProperty {
        val builder = CfnImageBuilderDomainJoinInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnImageBuilder`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnImageBuilderProps cfnImageBuilderProps = CfnImageBuilderProps.builder()
     * .instanceType("instanceType")
     * .name("name")
     * // the properties below are optional
     * .accessEndpoints(List.of(AccessEndpointProperty.builder()
     * .endpointType("endpointType")
     * .vpceId("vpceId")
     * .build()))
     * .appstreamAgentVersion("appstreamAgentVersion")
     * .description("description")
     * .displayName("displayName")
     * .domainJoinInfo(DomainJoinInfoProperty.builder()
     * .directoryName("directoryName")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .build())
     * .enableDefaultInternetAccess(false)
     * .iamRoleArn("iamRoleArn")
     * .imageArn("imageArn")
     * .imageName("imageName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html)
     */
    public inline fun cfnImageBuilderProps(
        block: CfnImageBuilderPropsDsl.() -> Unit = {}
    ): CfnImageBuilderProps {
        val builder = CfnImageBuilderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The VPC configuration for the image builder.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-vpcconfig.html)
     */
    public inline fun cfnImageBuilderVpcConfigProperty(
        block: CfnImageBuilderVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnImageBuilder.VpcConfigProperty {
        val builder = CfnImageBuilderVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppStream::Stack` resource creates a stack to start streaming applications to
     * Amazon AppStream 2.0 users. A stack consists of an associated fleet, user access policies,
     * and storage configurations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnStack cfnStack = CfnStack.Builder.create(this, "MyCfnStack")
     * .accessEndpoints(List.of(AccessEndpointProperty.builder()
     * .endpointType("endpointType")
     * .vpceId("vpceId")
     * .build()))
     * .applicationSettings(ApplicationSettingsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .settingsGroup("settingsGroup")
     * .build())
     * .attributesToDelete(List.of("attributesToDelete"))
     * .deleteStorageConnectors(false)
     * .description("description")
     * .displayName("displayName")
     * .embedHostDomains(List.of("embedHostDomains"))
     * .feedbackUrl("feedbackUrl")
     * .name("name")
     * .redirectUrl("redirectUrl")
     * .storageConnectors(List.of(StorageConnectorProperty.builder()
     * .connectorType("connectorType")
     * // the properties below are optional
     * .domains(List.of("domains"))
     * .resourceIdentifier("resourceIdentifier")
     * .build()))
     * .streamingExperienceSettings(StreamingExperienceSettingsProperty.builder()
     * .preferredProtocol("preferredProtocol")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userSettings(List.of(UserSettingProperty.builder()
     * .action("action")
     * .permission("permission")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html)
     */
    public inline fun cfnStack(
        scope: Construct,
        id: String,
        block: CfnStackDsl.() -> Unit = {},
    ): CfnStack {
        val builder = CfnStackDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an interface VPC endpoint (interface endpoint) that lets you create a private
     * connection between the virtual private cloud (VPC) that you specify and AppStream 2.0. When
     * you specify an interface endpoint for a stack, users of the stack can connect to AppStream
     * 2.0 only through that endpoint. When you specify an interface endpoint for an image builder,
     * administrators can connect to the image builder only through that endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * AccessEndpointProperty accessEndpointProperty = AccessEndpointProperty.builder()
     * .endpointType("endpointType")
     * .vpceId("vpceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html)
     */
    public inline fun cfnStackAccessEndpointProperty(
        block: CfnStackAccessEndpointPropertyDsl.() -> Unit = {}
    ): CfnStack.AccessEndpointProperty {
        val builder = CfnStackAccessEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The persistent application settings for users of a stack.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * ApplicationSettingsProperty applicationSettingsProperty = ApplicationSettingsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .settingsGroup("settingsGroup")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-applicationsettings.html)
     */
    public inline fun cfnStackApplicationSettingsProperty(
        block: CfnStackApplicationSettingsPropertyDsl.() -> Unit = {}
    ): CfnStack.ApplicationSettingsProperty {
        val builder = CfnStackApplicationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppStream::StackFleetAssociation` resource associates the specified fleet with the
     * specified stack for Amazon AppStream 2.0.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnStackFleetAssociation cfnStackFleetAssociation =
     * CfnStackFleetAssociation.Builder.create(this, "MyCfnStackFleetAssociation")
     * .fleetName("fleetName")
     * .stackName("stackName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html)
     */
    public inline fun cfnStackFleetAssociation(
        scope: Construct,
        id: String,
        block: CfnStackFleetAssociationDsl.() -> Unit = {},
    ): CfnStackFleetAssociation {
        val builder = CfnStackFleetAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStackFleetAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnStackFleetAssociationProps cfnStackFleetAssociationProps =
     * CfnStackFleetAssociationProps.builder()
     * .fleetName("fleetName")
     * .stackName("stackName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html)
     */
    public inline fun cfnStackFleetAssociationProps(
        block: CfnStackFleetAssociationPropsDsl.() -> Unit = {}
    ): CfnStackFleetAssociationProps {
        val builder = CfnStackFleetAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStack`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnStackProps cfnStackProps = CfnStackProps.builder()
     * .accessEndpoints(List.of(AccessEndpointProperty.builder()
     * .endpointType("endpointType")
     * .vpceId("vpceId")
     * .build()))
     * .applicationSettings(ApplicationSettingsProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .settingsGroup("settingsGroup")
     * .build())
     * .attributesToDelete(List.of("attributesToDelete"))
     * .deleteStorageConnectors(false)
     * .description("description")
     * .displayName("displayName")
     * .embedHostDomains(List.of("embedHostDomains"))
     * .feedbackUrl("feedbackUrl")
     * .name("name")
     * .redirectUrl("redirectUrl")
     * .storageConnectors(List.of(StorageConnectorProperty.builder()
     * .connectorType("connectorType")
     * // the properties below are optional
     * .domains(List.of("domains"))
     * .resourceIdentifier("resourceIdentifier")
     * .build()))
     * .streamingExperienceSettings(StreamingExperienceSettingsProperty.builder()
     * .preferredProtocol("preferredProtocol")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userSettings(List.of(UserSettingProperty.builder()
     * .action("action")
     * .permission("permission")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html)
     */
    public inline fun cfnStackProps(block: CfnStackPropsDsl.() -> Unit = {}): CfnStackProps {
        val builder = CfnStackPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A connector that enables persistent storage for users.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * StorageConnectorProperty storageConnectorProperty = StorageConnectorProperty.builder()
     * .connectorType("connectorType")
     * // the properties below are optional
     * .domains(List.of("domains"))
     * .resourceIdentifier("resourceIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html)
     */
    public inline fun cfnStackStorageConnectorProperty(
        block: CfnStackStorageConnectorPropertyDsl.() -> Unit = {}
    ): CfnStack.StorageConnectorProperty {
        val builder = CfnStackStorageConnectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The streaming protocol that you want your stack to prefer.
     *
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * StreamingExperienceSettingsProperty streamingExperienceSettingsProperty =
     * StreamingExperienceSettingsProperty.builder()
     * .preferredProtocol("preferredProtocol")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-streamingexperiencesettings.html)
     */
    public inline fun cfnStackStreamingExperienceSettingsProperty(
        block: CfnStackStreamingExperienceSettingsPropertyDsl.() -> Unit = {}
    ): CfnStack.StreamingExperienceSettingsProperty {
        val builder = CfnStackStreamingExperienceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppStream::StackUserAssociation` resource associates the specified users with the
     * specified stacks for Amazon AppStream 2.0. Users in an AppStream 2.0 user pool cannot be
     * assigned to stacks with fleets that are joined to an Active Directory domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnStackUserAssociation cfnStackUserAssociation = CfnStackUserAssociation.Builder.create(this,
     * "MyCfnStackUserAssociation")
     * .authenticationType("authenticationType")
     * .stackName("stackName")
     * .userName("userName")
     * // the properties below are optional
     * .sendEmailNotification(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html)
     */
    public inline fun cfnStackUserAssociation(
        scope: Construct,
        id: String,
        block: CfnStackUserAssociationDsl.() -> Unit = {},
    ): CfnStackUserAssociation {
        val builder = CfnStackUserAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStackUserAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnStackUserAssociationProps cfnStackUserAssociationProps =
     * CfnStackUserAssociationProps.builder()
     * .authenticationType("authenticationType")
     * .stackName("stackName")
     * .userName("userName")
     * // the properties below are optional
     * .sendEmailNotification(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html)
     */
    public inline fun cfnStackUserAssociationProps(
        block: CfnStackUserAssociationPropsDsl.() -> Unit = {}
    ): CfnStackUserAssociationProps {
        val builder = CfnStackUserAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an action and whether the action is enabled or disabled for users during their
     * streaming sessions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * UserSettingProperty userSettingProperty = UserSettingProperty.builder()
     * .action("action")
     * .permission("permission")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-usersetting.html)
     */
    public inline fun cfnStackUserSettingProperty(
        block: CfnStackUserSettingPropertyDsl.() -> Unit = {}
    ): CfnStack.UserSettingProperty {
        val builder = CfnStackUserSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppStream::User` resource creates a new user in the AppStream 2.0 user pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
     * .authenticationType("authenticationType")
     * .userName("userName")
     * // the properties below are optional
     * .firstName("firstName")
     * .lastName("lastName")
     * .messageAction("messageAction")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html)
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
     * Properties for defining a `CfnUser`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appstream.*;
     * CfnUserProps cfnUserProps = CfnUserProps.builder()
     * .authenticationType("authenticationType")
     * .userName("userName")
     * // the properties below are optional
     * .firstName("firstName")
     * .lastName("lastName")
     * .messageAction("messageAction")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html)
     */
    public inline fun cfnUserProps(block: CfnUserPropsDsl.() -> Unit = {}): CfnUserProps {
        val builder = CfnUserPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
