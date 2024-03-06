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

package io.cloudshiftdev.awscdkdsl.services.datasync

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnAgent
import software.amazon.awscdk.services.datasync.CfnAgentProps
import software.amazon.awscdk.services.datasync.CfnLocationAzureBlob
import software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps
import software.amazon.awscdk.services.datasync.CfnLocationEFS
import software.amazon.awscdk.services.datasync.CfnLocationEFSProps
import software.amazon.awscdk.services.datasync.CfnLocationFSxLustre
import software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps
import software.amazon.awscdk.services.datasync.CfnLocationFSxWindows
import software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps
import software.amazon.awscdk.services.datasync.CfnLocationHDFS
import software.amazon.awscdk.services.datasync.CfnLocationHDFSProps
import software.amazon.awscdk.services.datasync.CfnLocationNFS
import software.amazon.awscdk.services.datasync.CfnLocationNFSProps
import software.amazon.awscdk.services.datasync.CfnLocationObjectStorage
import software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps
import software.amazon.awscdk.services.datasync.CfnLocationS3
import software.amazon.awscdk.services.datasync.CfnLocationS3Props
import software.amazon.awscdk.services.datasync.CfnLocationSMB
import software.amazon.awscdk.services.datasync.CfnLocationSMBProps
import software.amazon.awscdk.services.datasync.CfnStorageSystem
import software.amazon.awscdk.services.datasync.CfnStorageSystemProps
import software.amazon.awscdk.services.datasync.CfnTask
import software.amazon.awscdk.services.datasync.CfnTaskProps
import software.constructs.Construct

public object datasync {
    /**
     * The `AWS::DataSync::Agent` resource activates an AWS DataSync agent that you've deployed for
     * storage discovery or data transfers.
     *
     * The activation process associates the agent with your AWS account .
     *
     * For more information, see the following topics in the *AWS DataSync User Guide* :
     * * [DataSync agent
     *   requirements](https://docs.aws.amazon.com/datasync/latest/userguide/agent-requirements.html)
     * * [DataSync network
     *   requirements](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html)
     * * [Create a DataSync
     *   agent](https://docs.aws.amazon.com/datasync/latest/userguide/configure-agent.html)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnAgent cfnAgent = CfnAgent.Builder.create(this, "MyCfnAgent")
     * .activationKey("activationKey")
     * .agentName("agentName")
     * .securityGroupArns(List.of("securityGroupArns"))
     * .subnetArns(List.of("subnetArns"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcEndpointId("vpcEndpointId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html)
     */
    public inline fun cfnAgent(
        scope: Construct,
        id: String,
        block: CfnAgentDsl.() -> Unit = {},
    ): CfnAgent {
        val builder = CfnAgentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAgent`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnAgentProps cfnAgentProps = CfnAgentProps.builder()
     * .activationKey("activationKey")
     * .agentName("agentName")
     * .securityGroupArns(List.of("securityGroupArns"))
     * .subnetArns(List.of("subnetArns"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcEndpointId("vpcEndpointId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html)
     */
    public inline fun cfnAgentProps(block: CfnAgentPropsDsl.() -> Unit = {}): CfnAgentProps {
        val builder = CfnAgentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a transfer *location* for a Microsoft Azure Blob Storage container.
     *
     * AWS DataSync can use this location as a transfer source or destination.
     *
     * Before you begin, make sure you know
     * [how DataSync accesses Azure Blob Storage](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access)
     * and works with
     * [access tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
     * and
     * [blob types](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#blob-types)
     * . You also need a
     * [DataSync agent](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-creating-agent)
     * that can connect to your container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationAzureBlob cfnLocationAzureBlob = CfnLocationAzureBlob.Builder.create(this,
     * "MyCfnLocationAzureBlob")
     * .agentArns(List.of("agentArns"))
     * .azureBlobAuthenticationType("azureBlobAuthenticationType")
     * // the properties below are optional
     * .azureAccessTier("azureAccessTier")
     * .azureBlobContainerUrl("azureBlobContainerUrl")
     * .azureBlobSasConfiguration(AzureBlobSasConfigurationProperty.builder()
     * .azureBlobSasToken("azureBlobSasToken")
     * .build())
     * .azureBlobType("azureBlobType")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html)
     */
    public inline fun cfnLocationAzureBlob(
        scope: Construct,
        id: String,
        block: CfnLocationAzureBlobDsl.() -> Unit = {},
    ): CfnLocationAzureBlob {
        val builder = CfnLocationAzureBlobDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The shared access signature (SAS) configuration that allows AWS DataSync to access your
     * Microsoft Azure Blob Storage.
     *
     * For more information, see
     * [SAS tokens](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-sas-tokens)
     * for accessing your Azure Blob Storage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * AzureBlobSasConfigurationProperty azureBlobSasConfigurationProperty =
     * AzureBlobSasConfigurationProperty.builder()
     * .azureBlobSasToken("azureBlobSasToken")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationazureblob-azureblobsasconfiguration.html)
     */
    public inline fun cfnLocationAzureBlobAzureBlobSasConfigurationProperty(
        block: CfnLocationAzureBlobAzureBlobSasConfigurationPropertyDsl.() -> Unit = {}
    ): CfnLocationAzureBlob.AzureBlobSasConfigurationProperty {
        val builder = CfnLocationAzureBlobAzureBlobSasConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocationAzureBlob`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationAzureBlobProps cfnLocationAzureBlobProps = CfnLocationAzureBlobProps.builder()
     * .agentArns(List.of("agentArns"))
     * .azureBlobAuthenticationType("azureBlobAuthenticationType")
     * // the properties below are optional
     * .azureAccessTier("azureAccessTier")
     * .azureBlobContainerUrl("azureBlobContainerUrl")
     * .azureBlobSasConfiguration(AzureBlobSasConfigurationProperty.builder()
     * .azureBlobSasToken("azureBlobSasToken")
     * .build())
     * .azureBlobType("azureBlobType")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html)
     */
    public inline fun cfnLocationAzureBlobProps(
        block: CfnLocationAzureBlobPropsDsl.() -> Unit = {}
    ): CfnLocationAzureBlobProps {
        val builder = CfnLocationAzureBlobPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataSync::LocationEFS` resource creates an endpoint for an Amazon EFS file system.
     *
     * AWS DataSync can access this endpoint as a source or destination location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationEFS cfnLocationEFS = CfnLocationEFS.Builder.create(this, "MyCfnLocationEFS")
     * .ec2Config(Ec2ConfigProperty.builder()
     * .securityGroupArns(List.of("securityGroupArns"))
     * .subnetArn("subnetArn")
     * .build())
     * // the properties below are optional
     * .accessPointArn("accessPointArn")
     * .efsFilesystemArn("efsFilesystemArn")
     * .fileSystemAccessRoleArn("fileSystemAccessRoleArn")
     * .inTransitEncryption("inTransitEncryption")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html)
     */
    public inline fun cfnLocationEFS(
        scope: Construct,
        id: String,
        block: CfnLocationEFSDsl.() -> Unit = {},
    ): CfnLocationEFS {
        val builder = CfnLocationEFSDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The subnet and security groups that AWS DataSync uses to access your Amazon EFS file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * Ec2ConfigProperty ec2ConfigProperty = Ec2ConfigProperty.builder()
     * .securityGroupArns(List.of("securityGroupArns"))
     * .subnetArn("subnetArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationefs-ec2config.html)
     */
    public inline fun cfnLocationEFSEc2ConfigProperty(
        block: CfnLocationEFSEc2ConfigPropertyDsl.() -> Unit = {}
    ): CfnLocationEFS.Ec2ConfigProperty {
        val builder = CfnLocationEFSEc2ConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocationEFS`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationEFSProps cfnLocationEFSProps = CfnLocationEFSProps.builder()
     * .ec2Config(Ec2ConfigProperty.builder()
     * .securityGroupArns(List.of("securityGroupArns"))
     * .subnetArn("subnetArn")
     * .build())
     * // the properties below are optional
     * .accessPointArn("accessPointArn")
     * .efsFilesystemArn("efsFilesystemArn")
     * .fileSystemAccessRoleArn("fileSystemAccessRoleArn")
     * .inTransitEncryption("inTransitEncryption")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html)
     */
    public inline fun cfnLocationEFSProps(
        block: CfnLocationEFSPropsDsl.() -> Unit = {}
    ): CfnLocationEFSProps {
        val builder = CfnLocationEFSPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataSync::LocationFSxLustre` resource specifies an endpoint for an Amazon FSx for
     * Lustre file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationFSxLustre cfnLocationFSxLustre = CfnLocationFSxLustre.Builder.create(this,
     * "MyCfnLocationFSxLustre")
     * .securityGroupArns(List.of("securityGroupArns"))
     * // the properties below are optional
     * .fsxFilesystemArn("fsxFilesystemArn")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html)
     */
    public inline fun cfnLocationFSxLustre(
        scope: Construct,
        id: String,
        block: CfnLocationFSxLustreDsl.() -> Unit = {},
    ): CfnLocationFSxLustre {
        val builder = CfnLocationFSxLustreDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocationFSxLustre`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationFSxLustreProps cfnLocationFSxLustreProps = CfnLocationFSxLustreProps.builder()
     * .securityGroupArns(List.of("securityGroupArns"))
     * // the properties below are optional
     * .fsxFilesystemArn("fsxFilesystemArn")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxlustre.html)
     */
    public inline fun cfnLocationFSxLustreProps(
        block: CfnLocationFSxLustrePropsDsl.() -> Unit = {}
    ): CfnLocationFSxLustreProps {
        val builder = CfnLocationFSxLustrePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataSync::LocationFSxONTAP` resource creates an endpoint for an Amazon FSx for
     * NetApp ONTAP file system.
     *
     * AWS DataSync can access this endpoint as a source or destination location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationFSxONTAP cfnLocationFSxONTAP = CfnLocationFSxONTAP.Builder.create(this,
     * "MyCfnLocationFSxONTAP")
     * .securityGroupArns(List.of("securityGroupArns"))
     * .storageVirtualMachineArn("storageVirtualMachineArn")
     * // the properties below are optional
     * .protocol(ProtocolProperty.builder()
     * .nfs(NFSProperty.builder()
     * .mountOptions(NfsMountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .build())
     * .smb(SMBProperty.builder()
     * .mountOptions(SmbMountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .password("password")
     * .user("user")
     * // the properties below are optional
     * .domain("domain")
     * .build())
     * .build())
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html)
     */
    public inline fun cfnLocationFSxONTAP(
        scope: Construct,
        id: String,
        block: CfnLocationFSxONTAPDsl.() -> Unit = {},
    ): CfnLocationFSxONTAP {
        val builder = CfnLocationFSxONTAPDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the Network File System (NFS) protocol configuration that AWS DataSync uses to
     * access a storage virtual machine (SVM) on your Amazon FSx for NetApp ONTAP file system.
     *
     * For more information, see
     * [Accessing FSx for ONTAP file systems](https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-access)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * NFSProperty nFSProperty = NFSProperty.builder()
     * .mountOptions(NfsMountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-nfs.html)
     */
    public inline fun cfnLocationFSxONTAPNFSProperty(
        block: CfnLocationFSxONTAPNFSPropertyDsl.() -> Unit = {}
    ): CfnLocationFSxONTAP.NFSProperty {
        val builder = CfnLocationFSxONTAPNFSPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how DataSync can access a location using the NFS protocol.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * NfsMountOptionsProperty nfsMountOptionsProperty = NfsMountOptionsProperty.builder()
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-nfsmountoptions.html)
     */
    public inline fun cfnLocationFSxONTAPNfsMountOptionsProperty(
        block: CfnLocationFSxONTAPNfsMountOptionsPropertyDsl.() -> Unit = {}
    ): CfnLocationFSxONTAP.NfsMountOptionsProperty {
        val builder = CfnLocationFSxONTAPNfsMountOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocationFSxONTAP`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationFSxONTAPProps cfnLocationFSxONTAPProps = CfnLocationFSxONTAPProps.builder()
     * .securityGroupArns(List.of("securityGroupArns"))
     * .storageVirtualMachineArn("storageVirtualMachineArn")
     * // the properties below are optional
     * .protocol(ProtocolProperty.builder()
     * .nfs(NFSProperty.builder()
     * .mountOptions(NfsMountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .build())
     * .smb(SMBProperty.builder()
     * .mountOptions(SmbMountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .password("password")
     * .user("user")
     * // the properties below are optional
     * .domain("domain")
     * .build())
     * .build())
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html)
     */
    public inline fun cfnLocationFSxONTAPProps(
        block: CfnLocationFSxONTAPPropsDsl.() -> Unit = {}
    ): CfnLocationFSxONTAPProps {
        val builder = CfnLocationFSxONTAPPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the data transfer protocol that AWS DataSync uses to access your Amazon FSx file
     * system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * ProtocolProperty protocolProperty = ProtocolProperty.builder()
     * .nfs(NFSProperty.builder()
     * .mountOptions(NfsMountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .build())
     * .smb(SMBProperty.builder()
     * .mountOptions(SmbMountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .password("password")
     * .user("user")
     * // the properties below are optional
     * .domain("domain")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-protocol.html)
     */
    public inline fun cfnLocationFSxONTAPProtocolProperty(
        block: CfnLocationFSxONTAPProtocolPropertyDsl.() -> Unit = {}
    ): CfnLocationFSxONTAP.ProtocolProperty {
        val builder = CfnLocationFSxONTAPProtocolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the Server Message Block (SMB) protocol configuration that AWS DataSync uses to
     * access a storage virtual machine (SVM) on your Amazon FSx for NetApp ONTAP file system.
     *
     * For more information, see
     * [Accessing FSx for ONTAP file systems](https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-access)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * SMBProperty sMBProperty = SMBProperty.builder()
     * .mountOptions(SmbMountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .password("password")
     * .user("user")
     * // the properties below are optional
     * .domain("domain")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smb.html)
     */
    public inline fun cfnLocationFSxONTAPSMBProperty(
        block: CfnLocationFSxONTAPSMBPropertyDsl.() -> Unit = {}
    ): CfnLocationFSxONTAP.SMBProperty {
        val builder = CfnLocationFSxONTAPSMBPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the version of the Server Message Block (SMB) protocol that AWS DataSync uses to
     * access an SMB file server.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * SmbMountOptionsProperty smbMountOptionsProperty = SmbMountOptionsProperty.builder()
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smbmountoptions.html)
     */
    public inline fun cfnLocationFSxONTAPSmbMountOptionsProperty(
        block: CfnLocationFSxONTAPSmbMountOptionsPropertyDsl.() -> Unit = {}
    ): CfnLocationFSxONTAP.SmbMountOptionsProperty {
        val builder = CfnLocationFSxONTAPSmbMountOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataSync::LocationFSxOpenZFS` resource specifies an endpoint for an Amazon FSx for
     * OpenZFS file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationFSxOpenZFS cfnLocationFSxOpenZFS = CfnLocationFSxOpenZFS.Builder.create(this,
     * "MyCfnLocationFSxOpenZFS")
     * .protocol(ProtocolProperty.builder()
     * .nfs(NFSProperty.builder()
     * .mountOptions(MountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .build())
     * .build())
     * .securityGroupArns(List.of("securityGroupArns"))
     * // the properties below are optional
     * .fsxFilesystemArn("fsxFilesystemArn")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html)
     */
    public inline fun cfnLocationFSxOpenZFS(
        scope: Construct,
        id: String,
        block: CfnLocationFSxOpenZFSDsl.() -> Unit = {},
    ): CfnLocationFSxOpenZFS {
        val builder = CfnLocationFSxOpenZFSDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the mount options that are available for DataSync to access a Network File System
     * (NFS) location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * MountOptionsProperty mountOptionsProperty = MountOptionsProperty.builder()
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-mountoptions.html)
     */
    public inline fun cfnLocationFSxOpenZFSMountOptionsProperty(
        block: CfnLocationFSxOpenZFSMountOptionsPropertyDsl.() -> Unit = {}
    ): CfnLocationFSxOpenZFS.MountOptionsProperty {
        val builder = CfnLocationFSxOpenZFSMountOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the Network File System (NFS) protocol that AWS DataSync uses to access your
     * Amazon FSx for OpenZFS file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * NFSProperty nFSProperty = NFSProperty.builder()
     * .mountOptions(MountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-nfs.html)
     */
    public inline fun cfnLocationFSxOpenZFSNFSProperty(
        block: CfnLocationFSxOpenZFSNFSPropertyDsl.() -> Unit = {}
    ): CfnLocationFSxOpenZFS.NFSProperty {
        val builder = CfnLocationFSxOpenZFSNFSPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocationFSxOpenZFS`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationFSxOpenZFSProps cfnLocationFSxOpenZFSProps = CfnLocationFSxOpenZFSProps.builder()
     * .protocol(ProtocolProperty.builder()
     * .nfs(NFSProperty.builder()
     * .mountOptions(MountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .build())
     * .build())
     * .securityGroupArns(List.of("securityGroupArns"))
     * // the properties below are optional
     * .fsxFilesystemArn("fsxFilesystemArn")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html)
     */
    public inline fun cfnLocationFSxOpenZFSProps(
        block: CfnLocationFSxOpenZFSPropsDsl.() -> Unit = {}
    ): CfnLocationFSxOpenZFSProps {
        val builder = CfnLocationFSxOpenZFSPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the protocol that AWS DataSync uses to access your Amazon FSx for OpenZFS file
     * system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * ProtocolProperty protocolProperty = ProtocolProperty.builder()
     * .nfs(NFSProperty.builder()
     * .mountOptions(MountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-protocol.html)
     */
    public inline fun cfnLocationFSxOpenZFSProtocolProperty(
        block: CfnLocationFSxOpenZFSProtocolPropertyDsl.() -> Unit = {}
    ): CfnLocationFSxOpenZFS.ProtocolProperty {
        val builder = CfnLocationFSxOpenZFSProtocolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataSync::LocationFSxWindows` resource specifies an endpoint for an Amazon FSx for
     * Windows Server file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationFSxWindows cfnLocationFSxWindows = CfnLocationFSxWindows.Builder.create(this,
     * "MyCfnLocationFSxWindows")
     * .securityGroupArns(List.of("securityGroupArns"))
     * .user("user")
     * // the properties below are optional
     * .domain("domain")
     * .fsxFilesystemArn("fsxFilesystemArn")
     * .password("password")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html)
     */
    public inline fun cfnLocationFSxWindows(
        scope: Construct,
        id: String,
        block: CfnLocationFSxWindowsDsl.() -> Unit = {},
    ): CfnLocationFSxWindows {
        val builder = CfnLocationFSxWindowsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocationFSxWindows`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationFSxWindowsProps cfnLocationFSxWindowsProps = CfnLocationFSxWindowsProps.builder()
     * .securityGroupArns(List.of("securityGroupArns"))
     * .user("user")
     * // the properties below are optional
     * .domain("domain")
     * .fsxFilesystemArn("fsxFilesystemArn")
     * .password("password")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxwindows.html)
     */
    public inline fun cfnLocationFSxWindowsProps(
        block: CfnLocationFSxWindowsPropsDsl.() -> Unit = {}
    ): CfnLocationFSxWindowsProps {
        val builder = CfnLocationFSxWindowsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataSync::LocationHDFS` resource specifies an endpoint for a Hadoop Distributed
     * File System (HDFS).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationHDFS cfnLocationHDFS = CfnLocationHDFS.Builder.create(this, "MyCfnLocationHDFS")
     * .agentArns(List.of("agentArns"))
     * .authenticationType("authenticationType")
     * .nameNodes(List.of(NameNodeProperty.builder()
     * .hostname("hostname")
     * .port(123)
     * .build()))
     * // the properties below are optional
     * .blockSize(123)
     * .kerberosKeytab("kerberosKeytab")
     * .kerberosKrb5Conf("kerberosKrb5Conf")
     * .kerberosPrincipal("kerberosPrincipal")
     * .kmsKeyProviderUri("kmsKeyProviderUri")
     * .qopConfiguration(QopConfigurationProperty.builder()
     * .dataTransferProtection("dataTransferProtection")
     * .rpcProtection("rpcProtection")
     * .build())
     * .replicationFactor(123)
     * .simpleUser("simpleUser")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html)
     */
    public inline fun cfnLocationHDFS(
        scope: Construct,
        id: String,
        block: CfnLocationHDFSDsl.() -> Unit = {},
    ): CfnLocationHDFS {
        val builder = CfnLocationHDFSDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The NameNode of the Hadoop Distributed File System (HDFS).
     *
     * The NameNode manages the file system's namespace and performs operations such as opening,
     * closing, and renaming files and directories. The NameNode also contains the information to
     * map blocks of data to the DataNodes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * NameNodeProperty nameNodeProperty = NameNodeProperty.builder()
     * .hostname("hostname")
     * .port(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-namenode.html)
     */
    public inline fun cfnLocationHDFSNameNodeProperty(
        block: CfnLocationHDFSNameNodePropertyDsl.() -> Unit = {}
    ): CfnLocationHDFS.NameNodeProperty {
        val builder = CfnLocationHDFSNameNodePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocationHDFS`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationHDFSProps cfnLocationHDFSProps = CfnLocationHDFSProps.builder()
     * .agentArns(List.of("agentArns"))
     * .authenticationType("authenticationType")
     * .nameNodes(List.of(NameNodeProperty.builder()
     * .hostname("hostname")
     * .port(123)
     * .build()))
     * // the properties below are optional
     * .blockSize(123)
     * .kerberosKeytab("kerberosKeytab")
     * .kerberosKrb5Conf("kerberosKrb5Conf")
     * .kerberosPrincipal("kerberosPrincipal")
     * .kmsKeyProviderUri("kmsKeyProviderUri")
     * .qopConfiguration(QopConfigurationProperty.builder()
     * .dataTransferProtection("dataTransferProtection")
     * .rpcProtection("rpcProtection")
     * .build())
     * .replicationFactor(123)
     * .simpleUser("simpleUser")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationhdfs.html)
     */
    public inline fun cfnLocationHDFSProps(
        block: CfnLocationHDFSPropsDsl.() -> Unit = {}
    ): CfnLocationHDFSProps {
        val builder = CfnLocationHDFSPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and
     * data transfer privacy settings configured on the Hadoop Distributed File System (HDFS)
     * cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * QopConfigurationProperty qopConfigurationProperty = QopConfigurationProperty.builder()
     * .dataTransferProtection("dataTransferProtection")
     * .rpcProtection("rpcProtection")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-qopconfiguration.html)
     */
    public inline fun cfnLocationHDFSQopConfigurationProperty(
        block: CfnLocationHDFSQopConfigurationPropertyDsl.() -> Unit = {}
    ): CfnLocationHDFS.QopConfigurationProperty {
        val builder = CfnLocationHDFSQopConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataSync::LocationNFS` resource specifies a Network File System (NFS) file server
     * that AWS DataSync can use as a transfer source or destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationNFS cfnLocationNFS = CfnLocationNFS.Builder.create(this, "MyCfnLocationNFS")
     * .onPremConfig(OnPremConfigProperty.builder()
     * .agentArns(List.of("agentArns"))
     * .build())
     * // the properties below are optional
     * .mountOptions(MountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .serverHostname("serverHostname")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html)
     */
    public inline fun cfnLocationNFS(
        scope: Construct,
        id: String,
        block: CfnLocationNFSDsl.() -> Unit = {},
    ): CfnLocationNFS {
        val builder = CfnLocationNFSDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the options that DataSync can use to mount your NFS file server.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * MountOptionsProperty mountOptionsProperty = MountOptionsProperty.builder()
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationnfs-mountoptions.html)
     */
    public inline fun cfnLocationNFSMountOptionsProperty(
        block: CfnLocationNFSMountOptionsPropertyDsl.() -> Unit = {}
    ): CfnLocationNFS.MountOptionsProperty {
        val builder = CfnLocationNFSMountOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS DataSync agents that are connecting to a Network File System (NFS) location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * OnPremConfigProperty onPremConfigProperty = OnPremConfigProperty.builder()
     * .agentArns(List.of("agentArns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationnfs-onpremconfig.html)
     */
    public inline fun cfnLocationNFSOnPremConfigProperty(
        block: CfnLocationNFSOnPremConfigPropertyDsl.() -> Unit = {}
    ): CfnLocationNFS.OnPremConfigProperty {
        val builder = CfnLocationNFSOnPremConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocationNFS`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationNFSProps cfnLocationNFSProps = CfnLocationNFSProps.builder()
     * .onPremConfig(OnPremConfigProperty.builder()
     * .agentArns(List.of("agentArns"))
     * .build())
     * // the properties below are optional
     * .mountOptions(MountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .serverHostname("serverHostname")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html)
     */
    public inline fun cfnLocationNFSProps(
        block: CfnLocationNFSPropsDsl.() -> Unit = {}
    ): CfnLocationNFSProps {
        val builder = CfnLocationNFSPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataSync::LocationObjectStorage` resource specifies an endpoint for a self-managed
     * object storage bucket.
     *
     * For more information about self-managed object storage locations, see
     * [Creating a Location for Object Storage](https://docs.aws.amazon.com/datasync/latest/userguide/create-object-location.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationObjectStorage cfnLocationObjectStorage =
     * CfnLocationObjectStorage.Builder.create(this, "MyCfnLocationObjectStorage")
     * .agentArns(List.of("agentArns"))
     * // the properties below are optional
     * .accessKey("accessKey")
     * .bucketName("bucketName")
     * .secretKey("secretKey")
     * .serverCertificate("serverCertificate")
     * .serverHostname("serverHostname")
     * .serverPort(123)
     * .serverProtocol("serverProtocol")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html)
     */
    public inline fun cfnLocationObjectStorage(
        scope: Construct,
        id: String,
        block: CfnLocationObjectStorageDsl.() -> Unit = {},
    ): CfnLocationObjectStorage {
        val builder = CfnLocationObjectStorageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocationObjectStorage`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationObjectStorageProps cfnLocationObjectStorageProps =
     * CfnLocationObjectStorageProps.builder()
     * .agentArns(List.of("agentArns"))
     * // the properties below are optional
     * .accessKey("accessKey")
     * .bucketName("bucketName")
     * .secretKey("secretKey")
     * .serverCertificate("serverCertificate")
     * .serverHostname("serverHostname")
     * .serverPort(123)
     * .serverProtocol("serverProtocol")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationobjectstorage.html)
     */
    public inline fun cfnLocationObjectStorageProps(
        block: CfnLocationObjectStoragePropsDsl.() -> Unit = {}
    ): CfnLocationObjectStorageProps {
        val builder = CfnLocationObjectStoragePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataSync::LocationS3` resource specifies an endpoint for an Amazon S3 bucket.
     *
     * For more information, see
     * [Create an Amazon S3 location](https://docs.aws.amazon.com/datasync/latest/userguide/create-locations-cli.html#create-location-s3-cli)
     * in the *AWS DataSync User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationS3 cfnLocationS3 = CfnLocationS3.Builder.create(this, "MyCfnLocationS3")
     * .s3Config(S3ConfigProperty.builder()
     * .bucketAccessRoleArn("bucketAccessRoleArn")
     * .build())
     * // the properties below are optional
     * .s3BucketArn("s3BucketArn")
     * .s3StorageClass("s3StorageClass")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html)
     */
    public inline fun cfnLocationS3(
        scope: Construct,
        id: String,
        block: CfnLocationS3Dsl.() -> Unit = {},
    ): CfnLocationS3 {
        val builder = CfnLocationS3Dsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocationS3`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationS3Props cfnLocationS3Props = CfnLocationS3Props.builder()
     * .s3Config(S3ConfigProperty.builder()
     * .bucketAccessRoleArn("bucketAccessRoleArn")
     * .build())
     * // the properties below are optional
     * .s3BucketArn("s3BucketArn")
     * .s3StorageClass("s3StorageClass")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html)
     */
    public inline fun cfnLocationS3Props(
        block: CfnLocationS3PropsDsl.() -> Unit = {}
    ): CfnLocationS3Props {
        val builder = CfnLocationS3PropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role
     * that DataSync uses to access your S3 bucket.
     *
     * For more information, see
     * [Accessing S3 buckets](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#create-s3-location-access)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * S3ConfigProperty s3ConfigProperty = S3ConfigProperty.builder()
     * .bucketAccessRoleArn("bucketAccessRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locations3-s3config.html)
     */
    public inline fun cfnLocationS3S3ConfigProperty(
        block: CfnLocationS3S3ConfigPropertyDsl.() -> Unit = {}
    ): CfnLocationS3.S3ConfigProperty {
        val builder = CfnLocationS3S3ConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataSync::LocationSMB` resource specifies a Server Message Block (SMB) location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationSMB cfnLocationSMB = CfnLocationSMB.Builder.create(this, "MyCfnLocationSMB")
     * .agentArns(List.of("agentArns"))
     * .user("user")
     * // the properties below are optional
     * .domain("domain")
     * .mountOptions(MountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .password("password")
     * .serverHostname("serverHostname")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html)
     */
    public inline fun cfnLocationSMB(
        scope: Construct,
        id: String,
        block: CfnLocationSMBDsl.() -> Unit = {},
    ): CfnLocationSMB {
        val builder = CfnLocationSMBDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * MountOptionsProperty mountOptionsProperty = MountOptionsProperty.builder()
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationsmb-mountoptions.html)
     */
    public inline fun cfnLocationSMBMountOptionsProperty(
        block: CfnLocationSMBMountOptionsPropertyDsl.() -> Unit = {}
    ): CfnLocationSMB.MountOptionsProperty {
        val builder = CfnLocationSMBMountOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLocationSMB`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnLocationSMBProps cfnLocationSMBProps = CfnLocationSMBProps.builder()
     * .agentArns(List.of("agentArns"))
     * .user("user")
     * // the properties below are optional
     * .domain("domain")
     * .mountOptions(MountOptionsProperty.builder()
     * .version("version")
     * .build())
     * .password("password")
     * .serverHostname("serverHostname")
     * .subdirectory("subdirectory")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationsmb.html)
     */
    public inline fun cfnLocationSMBProps(
        block: CfnLocationSMBPropsDsl.() -> Unit = {}
    ): CfnLocationSMBProps {
        val builder = CfnLocationSMBPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataSync::StorageSystem` resource creates an AWS resource for an on-premises
     * storage system that you want DataSync Discovery to collect information about.
     *
     * For more information, see
     * [discovering your storage with DataSync Discovery.](https://docs.aws.amazon.com/datasync/latest/userguide/understanding-your-storage.html)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnStorageSystem cfnStorageSystem = CfnStorageSystem.Builder.create(this, "MyCfnStorageSystem")
     * .agentArns(List.of("agentArns"))
     * .serverConfiguration(ServerConfigurationProperty.builder()
     * .serverHostname("serverHostname")
     * // the properties below are optional
     * .serverPort(123)
     * .build())
     * .systemType("systemType")
     * // the properties below are optional
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .name("name")
     * .serverCredentials(ServerCredentialsProperty.builder()
     * .password("password")
     * .username("username")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html)
     */
    public inline fun cfnStorageSystem(
        scope: Construct,
        id: String,
        block: CfnStorageSystemDsl.() -> Unit = {},
    ): CfnStorageSystem {
        val builder = CfnStorageSystemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStorageSystem`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnStorageSystemProps cfnStorageSystemProps = CfnStorageSystemProps.builder()
     * .agentArns(List.of("agentArns"))
     * .serverConfiguration(ServerConfigurationProperty.builder()
     * .serverHostname("serverHostname")
     * // the properties below are optional
     * .serverPort(123)
     * .build())
     * .systemType("systemType")
     * // the properties below are optional
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .name("name")
     * .serverCredentials(ServerCredentialsProperty.builder()
     * .password("password")
     * .username("username")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html)
     */
    public inline fun cfnStorageSystemProps(
        block: CfnStorageSystemPropsDsl.() -> Unit = {}
    ): CfnStorageSystemProps {
        val builder = CfnStorageSystemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The network settings that DataSync Discovery uses to connect with your on-premises storage
     * system's management interface.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * ServerConfigurationProperty serverConfigurationProperty = ServerConfigurationProperty.builder()
     * .serverHostname("serverHostname")
     * // the properties below are optional
     * .serverPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-storagesystem-serverconfiguration.html)
     */
    public inline fun cfnStorageSystemServerConfigurationProperty(
        block: CfnStorageSystemServerConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStorageSystem.ServerConfigurationProperty {
        val builder = CfnStorageSystemServerConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The credentials that provide DataSync Discovery read access to your on-premises storage
     * system's management interface.
     *
     * DataSync Discovery stores these credentials in
     * [AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html)
     * . For more information, see
     * [Accessing your on-premises storage system](https://docs.aws.amazon.com/datasync/latest/userguide/discovery-configure-storage.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * ServerCredentialsProperty serverCredentialsProperty = ServerCredentialsProperty.builder()
     * .password("password")
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-storagesystem-servercredentials.html)
     */
    public inline fun cfnStorageSystemServerCredentialsProperty(
        block: CfnStorageSystemServerCredentialsPropertyDsl.() -> Unit = {}
    ): CfnStorageSystem.ServerCredentialsProperty {
        val builder = CfnStorageSystemServerCredentialsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DataSync::Task` resource specifies a task.
     *
     * A task is a set of two locations (source and destination) and a set of `Options` that you use
     * to control the behavior of a task. If you don't specify `Options` when you create a task, AWS
     * DataSync populates them with service defaults.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnTask cfnTask = CfnTask.Builder.create(this, "MyCfnTask")
     * .destinationLocationArn("destinationLocationArn")
     * .sourceLocationArn("sourceLocationArn")
     * // the properties below are optional
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .excludes(List.of(FilterRuleProperty.builder()
     * .filterType("filterType")
     * .value("value")
     * .build()))
     * .includes(List.of(FilterRuleProperty.builder()
     * .filterType("filterType")
     * .value("value")
     * .build()))
     * .name("name")
     * .options(OptionsProperty.builder()
     * .atime("atime")
     * .bytesPerSecond(123)
     * .gid("gid")
     * .logLevel("logLevel")
     * .mtime("mtime")
     * .objectTags("objectTags")
     * .overwriteMode("overwriteMode")
     * .posixPermissions("posixPermissions")
     * .preserveDeletedFiles("preserveDeletedFiles")
     * .preserveDevices("preserveDevices")
     * .securityDescriptorCopyFlags("securityDescriptorCopyFlags")
     * .taskQueueing("taskQueueing")
     * .transferMode("transferMode")
     * .uid("uid")
     * .verifyMode("verifyMode")
     * .build())
     * .schedule(TaskScheduleProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskReportConfig(TaskReportConfigProperty.builder()
     * .destination(DestinationProperty.builder()
     * .s3(S3Property.builder()
     * .bucketAccessRoleArn("bucketAccessRoleArn")
     * .s3BucketArn("s3BucketArn")
     * .subdirectory("subdirectory")
     * .build())
     * .build())
     * .outputType("outputType")
     * // the properties below are optional
     * .objectVersionIds("objectVersionIds")
     * .overrides(OverridesProperty.builder()
     * .deleted(DeletedProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .skipped(SkippedProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .transferred(TransferredProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .verified(VerifiedProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .build())
     * .reportLevel("reportLevel")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html)
     */
    public inline fun cfnTask(
        scope: Construct,
        id: String,
        block: CfnTaskDsl.() -> Unit = {},
    ): CfnTask {
        val builder = CfnTaskDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The reporting level for the deleted section of your DataSync task report.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * DeletedProperty deletedProperty = DeletedProperty.builder()
     * .reportLevel("reportLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-deleted.html)
     */
    public inline fun cfnTaskDeletedProperty(
        block: CfnTaskDeletedPropertyDsl.() -> Unit = {}
    ): CfnTask.DeletedProperty {
        val builder = CfnTaskDeletedPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies where DataSync uploads your
     * [task report](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * DestinationProperty destinationProperty = DestinationProperty.builder()
     * .s3(S3Property.builder()
     * .bucketAccessRoleArn("bucketAccessRoleArn")
     * .s3BucketArn("s3BucketArn")
     * .subdirectory("subdirectory")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-destination.html)
     */
    public inline fun cfnTaskDestinationProperty(
        block: CfnTaskDestinationPropertyDsl.() -> Unit = {}
    ): CfnTask.DestinationProperty {
        val builder = CfnTaskDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies which files, folders, and objects to include or exclude when transferring files
     * from source to destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * FilterRuleProperty filterRuleProperty = FilterRuleProperty.builder()
     * .filterType("filterType")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-filterrule.html)
     */
    public inline fun cfnTaskFilterRuleProperty(
        block: CfnTaskFilterRulePropertyDsl.() -> Unit = {}
    ): CfnTask.FilterRuleProperty {
        val builder = CfnTaskFilterRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the options that are available to control the behavior of a
     * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
     * operation. This behavior includes preserving metadata, such as user ID (UID), group ID (GID),
     * and file permissions; overwriting files in the destination; data integrity verification; and
     * so on.
     *
     * A task has a set of default options associated with it. If you don't specify an option in
     * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
     * , the default value is used. You can override the default options on each task execution by
     * specifying an overriding `Options` value to
     * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * OptionsProperty optionsProperty = OptionsProperty.builder()
     * .atime("atime")
     * .bytesPerSecond(123)
     * .gid("gid")
     * .logLevel("logLevel")
     * .mtime("mtime")
     * .objectTags("objectTags")
     * .overwriteMode("overwriteMode")
     * .posixPermissions("posixPermissions")
     * .preserveDeletedFiles("preserveDeletedFiles")
     * .preserveDevices("preserveDevices")
     * .securityDescriptorCopyFlags("securityDescriptorCopyFlags")
     * .taskQueueing("taskQueueing")
     * .transferMode("transferMode")
     * .uid("uid")
     * .verifyMode("verifyMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html)
     */
    public inline fun cfnTaskOptionsProperty(
        block: CfnTaskOptionsPropertyDsl.() -> Unit = {}
    ): CfnTask.OptionsProperty {
        val builder = CfnTaskOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Customizes the reporting level for aspects of your task report.
     *
     * For example, your report might generally only include errors, but you could specify that you
     * want a list of successes and errors just for the files that DataSync attempted to delete in
     * your destination location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * OverridesProperty overridesProperty = OverridesProperty.builder()
     * .deleted(DeletedProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .skipped(SkippedProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .transferred(TransferredProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .verified(VerifiedProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-overrides.html)
     */
    public inline fun cfnTaskOverridesProperty(
        block: CfnTaskOverridesPropertyDsl.() -> Unit = {}
    ): CfnTask.OverridesProperty {
        val builder = CfnTaskOverridesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTask`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * CfnTaskProps cfnTaskProps = CfnTaskProps.builder()
     * .destinationLocationArn("destinationLocationArn")
     * .sourceLocationArn("sourceLocationArn")
     * // the properties below are optional
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .excludes(List.of(FilterRuleProperty.builder()
     * .filterType("filterType")
     * .value("value")
     * .build()))
     * .includes(List.of(FilterRuleProperty.builder()
     * .filterType("filterType")
     * .value("value")
     * .build()))
     * .name("name")
     * .options(OptionsProperty.builder()
     * .atime("atime")
     * .bytesPerSecond(123)
     * .gid("gid")
     * .logLevel("logLevel")
     * .mtime("mtime")
     * .objectTags("objectTags")
     * .overwriteMode("overwriteMode")
     * .posixPermissions("posixPermissions")
     * .preserveDeletedFiles("preserveDeletedFiles")
     * .preserveDevices("preserveDevices")
     * .securityDescriptorCopyFlags("securityDescriptorCopyFlags")
     * .taskQueueing("taskQueueing")
     * .transferMode("transferMode")
     * .uid("uid")
     * .verifyMode("verifyMode")
     * .build())
     * .schedule(TaskScheduleProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskReportConfig(TaskReportConfigProperty.builder()
     * .destination(DestinationProperty.builder()
     * .s3(S3Property.builder()
     * .bucketAccessRoleArn("bucketAccessRoleArn")
     * .s3BucketArn("s3BucketArn")
     * .subdirectory("subdirectory")
     * .build())
     * .build())
     * .outputType("outputType")
     * // the properties below are optional
     * .objectVersionIds("objectVersionIds")
     * .overrides(OverridesProperty.builder()
     * .deleted(DeletedProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .skipped(SkippedProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .transferred(TransferredProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .verified(VerifiedProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .build())
     * .reportLevel("reportLevel")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-task.html)
     */
    public inline fun cfnTaskProps(block: CfnTaskPropsDsl.() -> Unit = {}): CfnTaskProps {
        val builder = CfnTaskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the Amazon S3 bucket where DataSync uploads your
     * [task report](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * S3Property s3Property = S3Property.builder()
     * .bucketAccessRoleArn("bucketAccessRoleArn")
     * .s3BucketArn("s3BucketArn")
     * .subdirectory("subdirectory")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-s3.html)
     */
    public inline fun cfnTaskS3Property(
        block: CfnTaskS3PropertyDsl.() -> Unit = {}
    ): CfnTask.S3Property {
        val builder = CfnTaskS3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The reporting level for the skipped section of your DataSync task report.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * SkippedProperty skippedProperty = SkippedProperty.builder()
     * .reportLevel("reportLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-skipped.html)
     */
    public inline fun cfnTaskSkippedProperty(
        block: CfnTaskSkippedPropertyDsl.() -> Unit = {}
    ): CfnTask.SkippedProperty {
        val builder = CfnTaskSkippedPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how you want to configure a task report, which provides detailed information about
     * for your AWS DataSync transfer.
     *
     * For more information, see
     * [Task reports](https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * TaskReportConfigProperty taskReportConfigProperty = TaskReportConfigProperty.builder()
     * .destination(DestinationProperty.builder()
     * .s3(S3Property.builder()
     * .bucketAccessRoleArn("bucketAccessRoleArn")
     * .s3BucketArn("s3BucketArn")
     * .subdirectory("subdirectory")
     * .build())
     * .build())
     * .outputType("outputType")
     * // the properties below are optional
     * .objectVersionIds("objectVersionIds")
     * .overrides(OverridesProperty.builder()
     * .deleted(DeletedProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .skipped(SkippedProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .transferred(TransferredProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .verified(VerifiedProperty.builder()
     * .reportLevel("reportLevel")
     * .build())
     * .build())
     * .reportLevel("reportLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskreportconfig.html)
     */
    public inline fun cfnTaskTaskReportConfigProperty(
        block: CfnTaskTaskReportConfigPropertyDsl.() -> Unit = {}
    ): CfnTask.TaskReportConfigProperty {
        val builder = CfnTaskTaskReportConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the schedule you want your task to use for repeated executions.
     *
     * For more information, see
     * [Schedule Expressions for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * TaskScheduleProperty taskScheduleProperty = TaskScheduleProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-taskschedule.html)
     */
    public inline fun cfnTaskTaskScheduleProperty(
        block: CfnTaskTaskSchedulePropertyDsl.() -> Unit = {}
    ): CfnTask.TaskScheduleProperty {
        val builder = CfnTaskTaskSchedulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The reporting level for the transferred section of your DataSync task report.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * TransferredProperty transferredProperty = TransferredProperty.builder()
     * .reportLevel("reportLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-transferred.html)
     */
    public inline fun cfnTaskTransferredProperty(
        block: CfnTaskTransferredPropertyDsl.() -> Unit = {}
    ): CfnTask.TransferredProperty {
        val builder = CfnTaskTransferredPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The reporting level for the verified section of your DataSync task report.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.datasync.*;
     * VerifiedProperty verifiedProperty = VerifiedProperty.builder()
     * .reportLevel("reportLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-verified.html)
     */
    public inline fun cfnTaskVerifiedProperty(
        block: CfnTaskVerifiedPropertyDsl.() -> Unit = {}
    ): CfnTask.VerifiedProperty {
        val builder = CfnTaskVerifiedPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
