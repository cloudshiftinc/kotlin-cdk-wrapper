@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.datasync

import software.amazon.awscdk.services.datasync.CfnAgent
import software.amazon.awscdk.services.datasync.CfnAgentProps
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
import kotlin.String
import kotlin.Unit

public object datasync {
    public inline fun cfnAgent(
        scope: Construct,
        id: String,
        block: CfnAgentDsl.() -> Unit = {},
    ): CfnAgent {
        val builder = CfnAgentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAgentProps(block: CfnAgentPropsDsl.() -> Unit = {}): CfnAgentProps {
        val builder = CfnAgentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationEFS(
        scope: Construct,
        id: String,
        block: CfnLocationEFSDsl.() -> Unit = {},
    ): CfnLocationEFS {
        val builder = CfnLocationEFSDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationEFSEc2ConfigProperty(
        block: CfnLocationEFSEc2ConfigPropertyDsl.() -> Unit =
            {},
    ): CfnLocationEFS.Ec2ConfigProperty {
        val builder = CfnLocationEFSEc2ConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationEFSProps(block: CfnLocationEFSPropsDsl.() -> Unit = {}): CfnLocationEFSProps {
        val builder = CfnLocationEFSPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxLustre(
        scope: Construct,
        id: String,
        block: CfnLocationFSxLustreDsl.() -> Unit = {},
    ): CfnLocationFSxLustre {
        val builder = CfnLocationFSxLustreDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxLustreProps(block: CfnLocationFSxLustrePropsDsl.() -> Unit = {}): CfnLocationFSxLustreProps {
        val builder = CfnLocationFSxLustrePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxONTAP(
        scope: Construct,
        id: String,
        block: CfnLocationFSxONTAPDsl.() -> Unit = {},
    ): CfnLocationFSxONTAP {
        val builder = CfnLocationFSxONTAPDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxONTAPNFSProperty(
        block: CfnLocationFSxONTAPNFSPropertyDsl.() -> Unit = {
        },
    ): CfnLocationFSxONTAP.NFSProperty {
        val builder = CfnLocationFSxONTAPNFSPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxONTAPNfsMountOptionsProperty(
        block: CfnLocationFSxONTAPNfsMountOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnLocationFSxONTAP.NfsMountOptionsProperty {
        val builder = CfnLocationFSxONTAPNfsMountOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxONTAPProps(block: CfnLocationFSxONTAPPropsDsl.() -> Unit = {}): CfnLocationFSxONTAPProps {
        val builder = CfnLocationFSxONTAPPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxONTAPProtocolProperty(
        block: CfnLocationFSxONTAPProtocolPropertyDsl.() -> Unit =
            {},
    ): CfnLocationFSxONTAP.ProtocolProperty {
        val builder = CfnLocationFSxONTAPProtocolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxONTAPSMBProperty(
        block: CfnLocationFSxONTAPSMBPropertyDsl.() -> Unit = {
        },
    ): CfnLocationFSxONTAP.SMBProperty {
        val builder = CfnLocationFSxONTAPSMBPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxONTAPSmbMountOptionsProperty(
        block: CfnLocationFSxONTAPSmbMountOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnLocationFSxONTAP.SmbMountOptionsProperty {
        val builder = CfnLocationFSxONTAPSmbMountOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxOpenZFS(
        scope: Construct,
        id: String,
        block: CfnLocationFSxOpenZFSDsl.() -> Unit = {},
    ): CfnLocationFSxOpenZFS {
        val builder = CfnLocationFSxOpenZFSDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxOpenZFSMountOptionsProperty(
        block: CfnLocationFSxOpenZFSMountOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnLocationFSxOpenZFS.MountOptionsProperty {
        val builder = CfnLocationFSxOpenZFSMountOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxOpenZFSNFSProperty(
        block: CfnLocationFSxOpenZFSNFSPropertyDsl.() -> Unit =
            {},
    ): CfnLocationFSxOpenZFS.NFSProperty {
        val builder = CfnLocationFSxOpenZFSNFSPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxOpenZFSProps(
        block: CfnLocationFSxOpenZFSPropsDsl.() -> Unit =
            {},
    ): CfnLocationFSxOpenZFSProps {
        val builder = CfnLocationFSxOpenZFSPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxOpenZFSProtocolProperty(
        block: CfnLocationFSxOpenZFSProtocolPropertyDsl.() -> Unit =
            {},
    ): CfnLocationFSxOpenZFS.ProtocolProperty {
        val builder = CfnLocationFSxOpenZFSProtocolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxWindows(
        scope: Construct,
        id: String,
        block: CfnLocationFSxWindowsDsl.() -> Unit = {},
    ): CfnLocationFSxWindows {
        val builder = CfnLocationFSxWindowsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationFSxWindowsProps(
        block: CfnLocationFSxWindowsPropsDsl.() -> Unit =
            {},
    ): CfnLocationFSxWindowsProps {
        val builder = CfnLocationFSxWindowsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationHDFS(
        scope: Construct,
        id: String,
        block: CfnLocationHDFSDsl.() -> Unit = {},
    ): CfnLocationHDFS {
        val builder = CfnLocationHDFSDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationHDFSNameNodeProperty(
        block: CfnLocationHDFSNameNodePropertyDsl.() -> Unit =
            {},
    ): CfnLocationHDFS.NameNodeProperty {
        val builder = CfnLocationHDFSNameNodePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationHDFSProps(block: CfnLocationHDFSPropsDsl.() -> Unit = {}): CfnLocationHDFSProps {
        val builder = CfnLocationHDFSPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationHDFSQopConfigurationProperty(
        block: CfnLocationHDFSQopConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnLocationHDFS.QopConfigurationProperty {
        val builder = CfnLocationHDFSQopConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationNFS(
        scope: Construct,
        id: String,
        block: CfnLocationNFSDsl.() -> Unit = {},
    ): CfnLocationNFS {
        val builder = CfnLocationNFSDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationNFSMountOptionsProperty(
        block: CfnLocationNFSMountOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnLocationNFS.MountOptionsProperty {
        val builder = CfnLocationNFSMountOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationNFSOnPremConfigProperty(
        block: CfnLocationNFSOnPremConfigPropertyDsl.() -> Unit =
            {},
    ): CfnLocationNFS.OnPremConfigProperty {
        val builder = CfnLocationNFSOnPremConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationNFSProps(block: CfnLocationNFSPropsDsl.() -> Unit = {}): CfnLocationNFSProps {
        val builder = CfnLocationNFSPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationObjectStorage(
        scope: Construct,
        id: String,
        block: CfnLocationObjectStorageDsl.() -> Unit = {},
    ): CfnLocationObjectStorage {
        val builder = CfnLocationObjectStorageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationObjectStorageProps(
        block: CfnLocationObjectStoragePropsDsl.() -> Unit =
            {},
    ): CfnLocationObjectStorageProps {
        val builder = CfnLocationObjectStoragePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationS3(
        scope: Construct,
        id: String,
        block: CfnLocationS3Dsl.() -> Unit = {},
    ): CfnLocationS3 {
        val builder = CfnLocationS3Dsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationS3Props(block: CfnLocationS3PropsDsl.() -> Unit = {}): CfnLocationS3Props {
        val builder = CfnLocationS3PropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationS3S3ConfigProperty(
        block: CfnLocationS3S3ConfigPropertyDsl.() -> Unit =
            {},
    ): CfnLocationS3.S3ConfigProperty {
        val builder = CfnLocationS3S3ConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationSMB(
        scope: Construct,
        id: String,
        block: CfnLocationSMBDsl.() -> Unit = {},
    ): CfnLocationSMB {
        val builder = CfnLocationSMBDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationSMBMountOptionsProperty(
        block: CfnLocationSMBMountOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnLocationSMB.MountOptionsProperty {
        val builder = CfnLocationSMBMountOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLocationSMBProps(block: CfnLocationSMBPropsDsl.() -> Unit = {}): CfnLocationSMBProps {
        val builder = CfnLocationSMBPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStorageSystem(
        scope: Construct,
        id: String,
        block: CfnStorageSystemDsl.() -> Unit = {},
    ): CfnStorageSystem {
        val builder = CfnStorageSystemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStorageSystemProps(block: CfnStorageSystemPropsDsl.() -> Unit = {}): CfnStorageSystemProps {
        val builder = CfnStorageSystemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStorageSystemServerConfigurationProperty(
        block: CfnStorageSystemServerConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnStorageSystem.ServerConfigurationProperty {
        val builder = CfnStorageSystemServerConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStorageSystemServerCredentialsProperty(
        block: CfnStorageSystemServerCredentialsPropertyDsl.() -> Unit =
            {},
    ): CfnStorageSystem.ServerCredentialsProperty {
        val builder = CfnStorageSystemServerCredentialsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTask(
        scope: Construct,
        id: String,
        block: CfnTaskDsl.() -> Unit = {},
    ): CfnTask {
        val builder = CfnTaskDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskFilterRuleProperty(block: CfnTaskFilterRulePropertyDsl.() -> Unit = {}): CfnTask.FilterRuleProperty {
        val builder = CfnTaskFilterRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskOptionsProperty(block: CfnTaskOptionsPropertyDsl.() -> Unit = {}): CfnTask.OptionsProperty {
        val builder = CfnTaskOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskProps(block: CfnTaskPropsDsl.() -> Unit = {}): CfnTaskProps {
        val builder = CfnTaskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskTaskScheduleProperty(
        block: CfnTaskTaskSchedulePropertyDsl.() -> Unit =
            {},
    ): CfnTask.TaskScheduleProperty {
        val builder = CfnTaskTaskSchedulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
