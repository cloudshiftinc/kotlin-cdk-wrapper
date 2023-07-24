@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import software.amazon.awscdk.services.iotwireless.CfnDestination
import software.amazon.awscdk.services.iotwireless.CfnDestinationProps
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfile
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps
import software.amazon.awscdk.services.iotwireless.CfnFuotaTask
import software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroup
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps
import software.amazon.awscdk.services.iotwireless.CfnServiceProfile
import software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps
import software.amazon.awscdk.services.iotwireless.CfnWirelessGateway
import software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object iotwireless {
    /**
     * Creates a new destination that maps a device message to an AWS IoT rule.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnDestination cfnDestination = CfnDestination.Builder.create(this, "MyCfnDestination")
     * .expression("expression")
     * .expressionType("expressionType")
     * .name("name")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-destination.html)
     */
    public inline fun cfnDestination(
        scope: Construct,
        id: String,
        block: CfnDestinationDsl.() -> Unit = {}
    ): CfnDestination {
        val builder = CfnDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDestination`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnDestinationProps cfnDestinationProps = CfnDestinationProps.builder()
     * .expression("expression")
     * .expressionType("expressionType")
     * .name("name")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-destination.html)
     */
    public inline fun cfnDestinationProps(block: CfnDestinationPropsDsl.() -> Unit = {}): CfnDestinationProps {
        val builder = CfnDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new device profile.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnDeviceProfile cfnDeviceProfile = CfnDeviceProfile.Builder.create(this, "MyCfnDeviceProfile")
     * .loRaWan(LoRaWANDeviceProfileProperty.builder()
     * .classBTimeout(123)
     * .classCTimeout(123)
     * .factoryPresetFreqsList(List.of(123))
     * .macVersion("macVersion")
     * .maxDutyCycle(123)
     * .maxEirp(123)
     * .pingSlotDr(123)
     * .pingSlotFreq(123)
     * .pingSlotPeriod(123)
     * .regParamsRevision("regParamsRevision")
     * .rfRegion("rfRegion")
     * .rxDataRate2(123)
     * .rxDelay1(123)
     * .rxDrOffset1(123)
     * .rxFreq2(123)
     * .supports32BitFCnt(false)
     * .supportsClassB(false)
     * .supportsClassC(false)
     * .supportsJoin(false)
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html)
     */
    public inline fun cfnDeviceProfile(
        scope: Construct,
        id: String,
        block: CfnDeviceProfileDsl.() -> Unit = {}
    ): CfnDeviceProfile {
        val builder = CfnDeviceProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * LoRaWAN device profile object.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * LoRaWANDeviceProfileProperty loRaWANDeviceProfileProperty =
     * LoRaWANDeviceProfileProperty.builder()
     * .classBTimeout(123)
     * .classCTimeout(123)
     * .factoryPresetFreqsList(List.of(123))
     * .macVersion("macVersion")
     * .maxDutyCycle(123)
     * .maxEirp(123)
     * .pingSlotDr(123)
     * .pingSlotFreq(123)
     * .pingSlotPeriod(123)
     * .regParamsRevision("regParamsRevision")
     * .rfRegion("rfRegion")
     * .rxDataRate2(123)
     * .rxDelay1(123)
     * .rxDrOffset1(123)
     * .rxFreq2(123)
     * .supports32BitFCnt(false)
     * .supportsClassB(false)
     * .supportsClassC(false)
     * .supportsJoin(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html)
     */
    public inline fun cfnDeviceProfileLoRaWANDeviceProfileProperty(
        block: CfnDeviceProfileLoRaWANDeviceProfilePropertyDsl.() -> Unit =
            {}
    ): CfnDeviceProfile.LoRaWANDeviceProfileProperty {
        val builder = CfnDeviceProfileLoRaWANDeviceProfilePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeviceProfile`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnDeviceProfileProps cfnDeviceProfileProps = CfnDeviceProfileProps.builder()
     * .loRaWan(LoRaWANDeviceProfileProperty.builder()
     * .classBTimeout(123)
     * .classCTimeout(123)
     * .factoryPresetFreqsList(List.of(123))
     * .macVersion("macVersion")
     * .maxDutyCycle(123)
     * .maxEirp(123)
     * .pingSlotDr(123)
     * .pingSlotFreq(123)
     * .pingSlotPeriod(123)
     * .regParamsRevision("regParamsRevision")
     * .rfRegion("rfRegion")
     * .rxDataRate2(123)
     * .rxDelay1(123)
     * .rxDrOffset1(123)
     * .rxFreq2(123)
     * .supports32BitFCnt(false)
     * .supportsClassB(false)
     * .supportsClassC(false)
     * .supportsJoin(false)
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html)
     */
    public inline fun cfnDeviceProfileProps(block: CfnDeviceProfilePropsDsl.() -> Unit = {}): CfnDeviceProfileProps {
        val builder = CfnDeviceProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A FUOTA task.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnFuotaTask cfnFuotaTask = CfnFuotaTask.Builder.create(this, "MyCfnFuotaTask")
     * .firmwareUpdateImage("firmwareUpdateImage")
     * .firmwareUpdateRole("firmwareUpdateRole")
     * .loRaWan(LoRaWANProperty.builder()
     * .rfRegion("rfRegion")
     * // the properties below are optional
     * .startTime("startTime")
     * .build())
     * // the properties below are optional
     * .associateMulticastGroup("associateMulticastGroup")
     * .associateWirelessDevice("associateWirelessDevice")
     * .description("description")
     * .disassociateMulticastGroup("disassociateMulticastGroup")
     * .disassociateWirelessDevice("disassociateWirelessDevice")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html)
     */
    public inline fun cfnFuotaTask(
        scope: Construct,
        id: String,
        block: CfnFuotaTaskDsl.() -> Unit = {}
    ): CfnFuotaTask {
        val builder = CfnFuotaTaskDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The LoRaWAN information used with a FUOTA task.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * LoRaWANProperty loRaWANProperty = LoRaWANProperty.builder()
     * .rfRegion("rfRegion")
     * // the properties below are optional
     * .startTime("startTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-fuotatask-lorawan.html)
     */
    public inline fun cfnFuotaTaskLoRaWANProperty(
        block: CfnFuotaTaskLoRaWANPropertyDsl.() -> Unit =
            {}
    ): CfnFuotaTask.LoRaWANProperty {
        val builder = CfnFuotaTaskLoRaWANPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFuotaTask`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnFuotaTaskProps cfnFuotaTaskProps = CfnFuotaTaskProps.builder()
     * .firmwareUpdateImage("firmwareUpdateImage")
     * .firmwareUpdateRole("firmwareUpdateRole")
     * .loRaWan(LoRaWANProperty.builder()
     * .rfRegion("rfRegion")
     * // the properties below are optional
     * .startTime("startTime")
     * .build())
     * // the properties below are optional
     * .associateMulticastGroup("associateMulticastGroup")
     * .associateWirelessDevice("associateWirelessDevice")
     * .description("description")
     * .disassociateMulticastGroup("disassociateMulticastGroup")
     * .disassociateWirelessDevice("disassociateWirelessDevice")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html)
     */
    public inline fun cfnFuotaTaskProps(block: CfnFuotaTaskPropsDsl.() -> Unit = {}): CfnFuotaTaskProps {
        val builder = CfnFuotaTaskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A multicast group.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnMulticastGroup cfnMulticastGroup = CfnMulticastGroup.Builder.create(this,
     * "MyCfnMulticastGroup")
     * .loRaWan(LoRaWANProperty.builder()
     * .dlClass("dlClass")
     * .rfRegion("rfRegion")
     * // the properties below are optional
     * .numberOfDevicesInGroup(123)
     * .numberOfDevicesRequested(123)
     * .build())
     * // the properties below are optional
     * .associateWirelessDevice("associateWirelessDevice")
     * .description("description")
     * .disassociateWirelessDevice("disassociateWirelessDevice")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html)
     */
    public inline fun cfnMulticastGroup(
        scope: Construct,
        id: String,
        block: CfnMulticastGroupDsl.() -> Unit = {}
    ): CfnMulticastGroup {
        val builder = CfnMulticastGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The LoRaWAN information that is to be used with the multicast group.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * LoRaWANProperty loRaWANProperty = LoRaWANProperty.builder()
     * .dlClass("dlClass")
     * .rfRegion("rfRegion")
     * // the properties below are optional
     * .numberOfDevicesInGroup(123)
     * .numberOfDevicesRequested(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-multicastgroup-lorawan.html)
     */
    public inline fun cfnMulticastGroupLoRaWANProperty(
        block: CfnMulticastGroupLoRaWANPropertyDsl.() -> Unit =
            {}
    ): CfnMulticastGroup.LoRaWANProperty {
        val builder = CfnMulticastGroupLoRaWANPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMulticastGroup`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnMulticastGroupProps cfnMulticastGroupProps = CfnMulticastGroupProps.builder()
     * .loRaWan(LoRaWANProperty.builder()
     * .dlClass("dlClass")
     * .rfRegion("rfRegion")
     * // the properties below are optional
     * .numberOfDevicesInGroup(123)
     * .numberOfDevicesRequested(123)
     * .build())
     * // the properties below are optional
     * .associateWirelessDevice("associateWirelessDevice")
     * .description("description")
     * .disassociateWirelessDevice("disassociateWirelessDevice")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html)
     */
    public inline fun cfnMulticastGroupProps(block: CfnMulticastGroupPropsDsl.() -> Unit = {}): CfnMulticastGroupProps {
        val builder = CfnMulticastGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Network analyzer configuration.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * Object traceContent;
     * CfnNetworkAnalyzerConfiguration cfnNetworkAnalyzerConfiguration =
     * CfnNetworkAnalyzerConfiguration.Builder.create(this, "MyCfnNetworkAnalyzerConfiguration")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .traceContent(traceContent)
     * .wirelessDevices(List.of("wirelessDevices"))
     * .wirelessGateways(List.of("wirelessGateways"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html)
     */
    public inline fun cfnNetworkAnalyzerConfiguration(
        scope: Construct,
        id: String,
        block: CfnNetworkAnalyzerConfigurationDsl.() -> Unit = {}
    ): CfnNetworkAnalyzerConfiguration {
        val builder = CfnNetworkAnalyzerConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNetworkAnalyzerConfiguration`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * Object traceContent;
     * CfnNetworkAnalyzerConfigurationProps cfnNetworkAnalyzerConfigurationProps =
     * CfnNetworkAnalyzerConfigurationProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .traceContent(traceContent)
     * .wirelessDevices(List.of("wirelessDevices"))
     * .wirelessGateways(List.of("wirelessGateways"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html)
     */
    public inline fun cfnNetworkAnalyzerConfigurationProps(
        block: CfnNetworkAnalyzerConfigurationPropsDsl.() -> Unit =
            {}
    ): CfnNetworkAnalyzerConfigurationProps {
        val builder = CfnNetworkAnalyzerConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Trace content for your wireless gateway and wireless device resources.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * TraceContentProperty traceContentProperty = TraceContentProperty.builder()
     * .logLevel("logLevel")
     * .wirelessDeviceFrameInfo("wirelessDeviceFrameInfo")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-networkanalyzerconfiguration-tracecontent.html)
     */
    public inline fun cfnNetworkAnalyzerConfigurationTraceContentProperty(
        block: CfnNetworkAnalyzerConfigurationTraceContentPropertyDsl.() -> Unit =
            {}
    ): CfnNetworkAnalyzerConfiguration.TraceContentProperty {
        val builder = CfnNetworkAnalyzerConfigurationTraceContentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A partner account.
     *
     * If `PartnerAccountId` and `PartnerType` are `null` , returns all partner accounts.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnPartnerAccount cfnPartnerAccount = CfnPartnerAccount.Builder.create(this,
     * "MyCfnPartnerAccount")
     * .accountLinked(false)
     * .partnerAccountId("partnerAccountId")
     * .partnerType("partnerType")
     * .sidewalk(SidewalkAccountInfoProperty.builder()
     * .appServerPrivateKey("appServerPrivateKey")
     * .build())
     * .sidewalkResponse(SidewalkAccountInfoWithFingerprintProperty.builder()
     * .amazonId("amazonId")
     * .arn("arn")
     * .fingerprint("fingerprint")
     * .build())
     * .sidewalkUpdate(SidewalkUpdateAccountProperty.builder()
     * .appServerPrivateKey("appServerPrivateKey")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html)
     */
    public inline fun cfnPartnerAccount(
        scope: Construct,
        id: String,
        block: CfnPartnerAccountDsl.() -> Unit = {}
    ): CfnPartnerAccount {
        val builder = CfnPartnerAccountDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPartnerAccount`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnPartnerAccountProps cfnPartnerAccountProps = CfnPartnerAccountProps.builder()
     * .accountLinked(false)
     * .partnerAccountId("partnerAccountId")
     * .partnerType("partnerType")
     * .sidewalk(SidewalkAccountInfoProperty.builder()
     * .appServerPrivateKey("appServerPrivateKey")
     * .build())
     * .sidewalkResponse(SidewalkAccountInfoWithFingerprintProperty.builder()
     * .amazonId("amazonId")
     * .arn("arn")
     * .fingerprint("fingerprint")
     * .build())
     * .sidewalkUpdate(SidewalkUpdateAccountProperty.builder()
     * .appServerPrivateKey("appServerPrivateKey")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html)
     */
    public inline fun cfnPartnerAccountProps(block: CfnPartnerAccountPropsDsl.() -> Unit = {}): CfnPartnerAccountProps {
        val builder = CfnPartnerAccountPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a Sidewalk account.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * SidewalkAccountInfoProperty sidewalkAccountInfoProperty = SidewalkAccountInfoProperty.builder()
     * .appServerPrivateKey("appServerPrivateKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfo.html)
     */
    public inline fun cfnPartnerAccountSidewalkAccountInfoProperty(
        block: CfnPartnerAccountSidewalkAccountInfoPropertyDsl.() -> Unit =
            {}
    ): CfnPartnerAccount.SidewalkAccountInfoProperty {
        val builder = CfnPartnerAccountSidewalkAccountInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a Sidewalk account.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * SidewalkAccountInfoWithFingerprintProperty sidewalkAccountInfoWithFingerprintProperty =
     * SidewalkAccountInfoWithFingerprintProperty.builder()
     * .amazonId("amazonId")
     * .arn("arn")
     * .fingerprint("fingerprint")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint.html)
     */
    public inline fun cfnPartnerAccountSidewalkAccountInfoWithFingerprintProperty(
        block: CfnPartnerAccountSidewalkAccountInfoWithFingerprintPropertyDsl.() -> Unit =
            {}
    ): CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty {
        val builder = CfnPartnerAccountSidewalkAccountInfoWithFingerprintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sidewalk update.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * SidewalkUpdateAccountProperty sidewalkUpdateAccountProperty =
     * SidewalkUpdateAccountProperty.builder()
     * .appServerPrivateKey("appServerPrivateKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkupdateaccount.html)
     */
    public inline fun cfnPartnerAccountSidewalkUpdateAccountProperty(
        block: CfnPartnerAccountSidewalkUpdateAccountPropertyDsl.() -> Unit =
            {}
    ): CfnPartnerAccount.SidewalkUpdateAccountProperty {
        val builder = CfnPartnerAccountSidewalkUpdateAccountPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new service profile.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnServiceProfile cfnServiceProfile = CfnServiceProfile.Builder.create(this,
     * "MyCfnServiceProfile")
     * .loRaWan(LoRaWANServiceProfileProperty.builder()
     * .addGwMetadata(false)
     * .channelMask("channelMask")
     * .devStatusReqFreq(123)
     * .dlBucketSize(123)
     * .dlRate(123)
     * .dlRatePolicy("dlRatePolicy")
     * .drMax(123)
     * .drMin(123)
     * .hrAllowed(false)
     * .minGwDiversity(123)
     * .nwkGeoLoc(false)
     * .prAllowed(false)
     * .raAllowed(false)
     * .reportDevStatusBattery(false)
     * .reportDevStatusMargin(false)
     * .targetPer(123)
     * .ulBucketSize(123)
     * .ulRate(123)
     * .ulRatePolicy("ulRatePolicy")
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html)
     */
    public inline fun cfnServiceProfile(
        scope: Construct,
        id: String,
        block: CfnServiceProfileDsl.() -> Unit = {}
    ): CfnServiceProfile {
        val builder = CfnServiceProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * LoRaWANServiceProfile object.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * LoRaWANServiceProfileProperty loRaWANServiceProfileProperty =
     * LoRaWANServiceProfileProperty.builder()
     * .addGwMetadata(false)
     * .channelMask("channelMask")
     * .devStatusReqFreq(123)
     * .dlBucketSize(123)
     * .dlRate(123)
     * .dlRatePolicy("dlRatePolicy")
     * .drMax(123)
     * .drMin(123)
     * .hrAllowed(false)
     * .minGwDiversity(123)
     * .nwkGeoLoc(false)
     * .prAllowed(false)
     * .raAllowed(false)
     * .reportDevStatusBattery(false)
     * .reportDevStatusMargin(false)
     * .targetPer(123)
     * .ulBucketSize(123)
     * .ulRate(123)
     * .ulRatePolicy("ulRatePolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html)
     */
    public inline fun cfnServiceProfileLoRaWANServiceProfileProperty(
        block: CfnServiceProfileLoRaWANServiceProfilePropertyDsl.() -> Unit =
            {}
    ): CfnServiceProfile.LoRaWANServiceProfileProperty {
        val builder = CfnServiceProfileLoRaWANServiceProfilePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServiceProfile`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnServiceProfileProps cfnServiceProfileProps = CfnServiceProfileProps.builder()
     * .loRaWan(LoRaWANServiceProfileProperty.builder()
     * .addGwMetadata(false)
     * .channelMask("channelMask")
     * .devStatusReqFreq(123)
     * .dlBucketSize(123)
     * .dlRate(123)
     * .dlRatePolicy("dlRatePolicy")
     * .drMax(123)
     * .drMin(123)
     * .hrAllowed(false)
     * .minGwDiversity(123)
     * .nwkGeoLoc(false)
     * .prAllowed(false)
     * .raAllowed(false)
     * .reportDevStatusBattery(false)
     * .reportDevStatusMargin(false)
     * .targetPer(123)
     * .ulBucketSize(123)
     * .ulRate(123)
     * .ulRatePolicy("ulRatePolicy")
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html)
     */
    public inline fun cfnServiceProfileProps(block: CfnServiceProfilePropsDsl.() -> Unit = {}): CfnServiceProfileProps {
        val builder = CfnServiceProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a gateway task definition.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnTaskDefinition cfnTaskDefinition = CfnTaskDefinition.Builder.create(this,
     * "MyCfnTaskDefinition")
     * .autoCreateTasks(false)
     * // the properties below are optional
     * .loRaWanUpdateGatewayTaskEntry(LoRaWANUpdateGatewayTaskEntryProperty.builder()
     * .currentVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .updateVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskDefinitionType("taskDefinitionType")
     * .update(UpdateWirelessGatewayTaskCreateProperty.builder()
     * .loRaWan(LoRaWANUpdateGatewayTaskCreateProperty.builder()
     * .currentVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .sigKeyCrc(123)
     * .updateSignature("updateSignature")
     * .updateVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .build())
     * .updateDataRole("updateDataRole")
     * .updateDataSource("updateDataSource")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html)
     */
    public inline fun cfnTaskDefinition(
        scope: Construct,
        id: String,
        block: CfnTaskDefinitionDsl.() -> Unit = {}
    ): CfnTaskDefinition {
        val builder = CfnTaskDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * LoRaWANGatewayVersion object.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * LoRaWANGatewayVersionProperty loRaWANGatewayVersionProperty =
     * LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawangatewayversion.html)
     */
    public inline fun cfnTaskDefinitionLoRaWANGatewayVersionProperty(
        block: CfnTaskDefinitionLoRaWANGatewayVersionPropertyDsl.() -> Unit =
            {}
    ): CfnTaskDefinition.LoRaWANGatewayVersionProperty {
        val builder = CfnTaskDefinitionLoRaWANGatewayVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The signature used to verify the update firmware.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * LoRaWANUpdateGatewayTaskCreateProperty loRaWANUpdateGatewayTaskCreateProperty =
     * LoRaWANUpdateGatewayTaskCreateProperty.builder()
     * .currentVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .sigKeyCrc(123)
     * .updateSignature("updateSignature")
     * .updateVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskcreate.html)
     */
    public inline fun cfnTaskDefinitionLoRaWANUpdateGatewayTaskCreateProperty(
        block: CfnTaskDefinitionLoRaWANUpdateGatewayTaskCreatePropertyDsl.() -> Unit =
            {}
    ): CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty {
        val builder = CfnTaskDefinitionLoRaWANUpdateGatewayTaskCreatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * LoRaWANUpdateGatewayTaskEntry object.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * LoRaWANUpdateGatewayTaskEntryProperty loRaWANUpdateGatewayTaskEntryProperty =
     * LoRaWANUpdateGatewayTaskEntryProperty.builder()
     * .currentVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .updateVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskentry.html)
     */
    public inline fun cfnTaskDefinitionLoRaWANUpdateGatewayTaskEntryProperty(
        block: CfnTaskDefinitionLoRaWANUpdateGatewayTaskEntryPropertyDsl.() -> Unit =
            {}
    ): CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty {
        val builder = CfnTaskDefinitionLoRaWANUpdateGatewayTaskEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTaskDefinition`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnTaskDefinitionProps cfnTaskDefinitionProps = CfnTaskDefinitionProps.builder()
     * .autoCreateTasks(false)
     * // the properties below are optional
     * .loRaWanUpdateGatewayTaskEntry(LoRaWANUpdateGatewayTaskEntryProperty.builder()
     * .currentVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .updateVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskDefinitionType("taskDefinitionType")
     * .update(UpdateWirelessGatewayTaskCreateProperty.builder()
     * .loRaWan(LoRaWANUpdateGatewayTaskCreateProperty.builder()
     * .currentVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .sigKeyCrc(123)
     * .updateSignature("updateSignature")
     * .updateVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .build())
     * .updateDataRole("updateDataRole")
     * .updateDataSource("updateDataSource")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html)
     */
    public inline fun cfnTaskDefinitionProps(block: CfnTaskDefinitionPropsDsl.() -> Unit = {}): CfnTaskDefinitionProps {
        val builder = CfnTaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * UpdateWirelessGatewayTaskCreate object.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * UpdateWirelessGatewayTaskCreateProperty updateWirelessGatewayTaskCreateProperty =
     * UpdateWirelessGatewayTaskCreateProperty.builder()
     * .loRaWan(LoRaWANUpdateGatewayTaskCreateProperty.builder()
     * .currentVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .sigKeyCrc(123)
     * .updateSignature("updateSignature")
     * .updateVersion(LoRaWANGatewayVersionProperty.builder()
     * .model("model")
     * .packageVersion("packageVersion")
     * .station("station")
     * .build())
     * .build())
     * .updateDataRole("updateDataRole")
     * .updateDataSource("updateDataSource")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate.html)
     */
    public inline fun cfnTaskDefinitionUpdateWirelessGatewayTaskCreateProperty(
        block: CfnTaskDefinitionUpdateWirelessGatewayTaskCreatePropertyDsl.() -> Unit =
            {}
    ): CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty {
        val builder = CfnTaskDefinitionUpdateWirelessGatewayTaskCreatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provisions a wireless device.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnWirelessDevice cfnWirelessDevice = CfnWirelessDevice.Builder.create(this,
     * "MyCfnWirelessDevice")
     * .destinationName("destinationName")
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .lastUplinkReceivedAt("lastUplinkReceivedAt")
     * .loRaWan(LoRaWANDeviceProperty.builder()
     * .abpV10X(AbpV10xProperty.builder()
     * .devAddr("devAddr")
     * .sessionKeys(SessionKeysAbpV10xProperty.builder()
     * .appSKey("appSKey")
     * .nwkSKey("nwkSKey")
     * .build())
     * .build())
     * .abpV11(AbpV11Property.builder()
     * .devAddr("devAddr")
     * .sessionKeys(SessionKeysAbpV11Property.builder()
     * .appSKey("appSKey")
     * .fNwkSIntKey("fNwkSIntKey")
     * .nwkSEncKey("nwkSEncKey")
     * .sNwkSIntKey("sNwkSIntKey")
     * .build())
     * .build())
     * .devEui("devEui")
     * .deviceProfileId("deviceProfileId")
     * .otaaV10X(OtaaV10xProperty.builder()
     * .appEui("appEui")
     * .appKey("appKey")
     * .build())
     * .otaaV11(OtaaV11Property.builder()
     * .appKey("appKey")
     * .joinEui("joinEui")
     * .nwkKey("nwkKey")
     * .build())
     * .serviceProfileId("serviceProfileId")
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .thingArn("thingArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html)
     */
    public inline fun cfnWirelessDevice(
        scope: Construct,
        id: String,
        block: CfnWirelessDeviceDsl.() -> Unit = {}
    ): CfnWirelessDevice {
        val builder = CfnWirelessDeviceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * ABP device object for LoRaWAN specification v1.0.x.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * AbpV10xProperty abpV10xProperty = AbpV10xProperty.builder()
     * .devAddr("devAddr")
     * .sessionKeys(SessionKeysAbpV10xProperty.builder()
     * .appSKey("appSKey")
     * .nwkSKey("nwkSKey")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv10x.html)
     */
    public inline fun cfnWirelessDeviceAbpV10xProperty(
        block: CfnWirelessDeviceAbpV10xPropertyDsl.() -> Unit =
            {}
    ): CfnWirelessDevice.AbpV10xProperty {
        val builder = CfnWirelessDeviceAbpV10xPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * ABP device object for create APIs for v1.1.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * AbpV11Property abpV11Property = AbpV11Property.builder()
     * .devAddr("devAddr")
     * .sessionKeys(SessionKeysAbpV11Property.builder()
     * .appSKey("appSKey")
     * .fNwkSIntKey("fNwkSIntKey")
     * .nwkSEncKey("nwkSEncKey")
     * .sNwkSIntKey("sNwkSIntKey")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv11.html)
     */
    public inline fun cfnWirelessDeviceAbpV11Property(
        block: CfnWirelessDeviceAbpV11PropertyDsl.() -> Unit =
            {}
    ): CfnWirelessDevice.AbpV11Property {
        val builder = CfnWirelessDeviceAbpV11PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about an import task for wireless devices.
     *
     * When creating the resource, either create a single wireless device import task using the
     * Sidewalk manufacturing serial number (SMSN) of the wireless device, or create an import task for
     * multiple devices by specifying both the `DeviceCreationFile` and the `Role` .
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnWirelessDeviceImportTask cfnWirelessDeviceImportTask =
     * CfnWirelessDeviceImportTask.Builder.create(this, "MyCfnWirelessDeviceImportTask")
     * .destinationName("destinationName")
     * .sidewalk(SidewalkProperty.builder()
     * .deviceCreationFile("deviceCreationFile")
     * .deviceCreationFileList(List.of("deviceCreationFileList"))
     * .role("role")
     * .sidewalkManufacturingSn("sidewalkManufacturingSn")
     * .build())
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html)
     */
    public inline fun cfnWirelessDeviceImportTask(
        scope: Construct,
        id: String,
        block: CfnWirelessDeviceImportTaskDsl.() -> Unit = {}
    ): CfnWirelessDeviceImportTask {
        val builder = CfnWirelessDeviceImportTaskDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWirelessDeviceImportTask`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnWirelessDeviceImportTaskProps cfnWirelessDeviceImportTaskProps =
     * CfnWirelessDeviceImportTaskProps.builder()
     * .destinationName("destinationName")
     * .sidewalk(SidewalkProperty.builder()
     * .deviceCreationFile("deviceCreationFile")
     * .deviceCreationFileList(List.of("deviceCreationFileList"))
     * .role("role")
     * .sidewalkManufacturingSn("sidewalkManufacturingSn")
     * .build())
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html)
     */
    public inline fun cfnWirelessDeviceImportTaskProps(
        block: CfnWirelessDeviceImportTaskPropsDsl.() -> Unit =
            {}
    ): CfnWirelessDeviceImportTaskProps {
        val builder = CfnWirelessDeviceImportTaskPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sidewalk-related information about a wireless device import task.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * SidewalkProperty sidewalkProperty = SidewalkProperty.builder()
     * .deviceCreationFile("deviceCreationFile")
     * .deviceCreationFileList(List.of("deviceCreationFileList"))
     * .role("role")
     * .sidewalkManufacturingSn("sidewalkManufacturingSn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdeviceimporttask-sidewalk.html)
     */
    public inline fun cfnWirelessDeviceImportTaskSidewalkProperty(
        block: CfnWirelessDeviceImportTaskSidewalkPropertyDsl.() -> Unit =
            {}
    ): CfnWirelessDeviceImportTask.SidewalkProperty {
        val builder = CfnWirelessDeviceImportTaskSidewalkPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * LoRaWAN object for create functions.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * LoRaWANDeviceProperty loRaWANDeviceProperty = LoRaWANDeviceProperty.builder()
     * .abpV10X(AbpV10xProperty.builder()
     * .devAddr("devAddr")
     * .sessionKeys(SessionKeysAbpV10xProperty.builder()
     * .appSKey("appSKey")
     * .nwkSKey("nwkSKey")
     * .build())
     * .build())
     * .abpV11(AbpV11Property.builder()
     * .devAddr("devAddr")
     * .sessionKeys(SessionKeysAbpV11Property.builder()
     * .appSKey("appSKey")
     * .fNwkSIntKey("fNwkSIntKey")
     * .nwkSEncKey("nwkSEncKey")
     * .sNwkSIntKey("sNwkSIntKey")
     * .build())
     * .build())
     * .devEui("devEui")
     * .deviceProfileId("deviceProfileId")
     * .otaaV10X(OtaaV10xProperty.builder()
     * .appEui("appEui")
     * .appKey("appKey")
     * .build())
     * .otaaV11(OtaaV11Property.builder()
     * .appKey("appKey")
     * .joinEui("joinEui")
     * .nwkKey("nwkKey")
     * .build())
     * .serviceProfileId("serviceProfileId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-lorawandevice.html)
     */
    public inline fun cfnWirelessDeviceLoRaWANDeviceProperty(
        block: CfnWirelessDeviceLoRaWANDevicePropertyDsl.() -> Unit =
            {}
    ): CfnWirelessDevice.LoRaWANDeviceProperty {
        val builder = CfnWirelessDeviceLoRaWANDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * OTAA device object for create APIs for v1.0.x.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * OtaaV10xProperty otaaV10xProperty = OtaaV10xProperty.builder()
     * .appEui("appEui")
     * .appKey("appKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav10x.html)
     */
    public inline fun cfnWirelessDeviceOtaaV10xProperty(
        block: CfnWirelessDeviceOtaaV10xPropertyDsl.() -> Unit =
            {}
    ): CfnWirelessDevice.OtaaV10xProperty {
        val builder = CfnWirelessDeviceOtaaV10xPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * OTAA device object for v1.1 for create APIs.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * OtaaV11Property otaaV11Property = OtaaV11Property.builder()
     * .appKey("appKey")
     * .joinEui("joinEui")
     * .nwkKey("nwkKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav11.html)
     */
    public inline fun cfnWirelessDeviceOtaaV11Property(
        block: CfnWirelessDeviceOtaaV11PropertyDsl.() -> Unit =
            {}
    ): CfnWirelessDevice.OtaaV11Property {
        val builder = CfnWirelessDeviceOtaaV11PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWirelessDevice`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnWirelessDeviceProps cfnWirelessDeviceProps = CfnWirelessDeviceProps.builder()
     * .destinationName("destinationName")
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .lastUplinkReceivedAt("lastUplinkReceivedAt")
     * .loRaWan(LoRaWANDeviceProperty.builder()
     * .abpV10X(AbpV10xProperty.builder()
     * .devAddr("devAddr")
     * .sessionKeys(SessionKeysAbpV10xProperty.builder()
     * .appSKey("appSKey")
     * .nwkSKey("nwkSKey")
     * .build())
     * .build())
     * .abpV11(AbpV11Property.builder()
     * .devAddr("devAddr")
     * .sessionKeys(SessionKeysAbpV11Property.builder()
     * .appSKey("appSKey")
     * .fNwkSIntKey("fNwkSIntKey")
     * .nwkSEncKey("nwkSEncKey")
     * .sNwkSIntKey("sNwkSIntKey")
     * .build())
     * .build())
     * .devEui("devEui")
     * .deviceProfileId("deviceProfileId")
     * .otaaV10X(OtaaV10xProperty.builder()
     * .appEui("appEui")
     * .appKey("appKey")
     * .build())
     * .otaaV11(OtaaV11Property.builder()
     * .appKey("appKey")
     * .joinEui("joinEui")
     * .nwkKey("nwkKey")
     * .build())
     * .serviceProfileId("serviceProfileId")
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .thingArn("thingArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html)
     */
    public inline fun cfnWirelessDeviceProps(block: CfnWirelessDevicePropsDsl.() -> Unit = {}): CfnWirelessDeviceProps {
        val builder = CfnWirelessDevicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * LoRaWAN object for create APIs.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * SessionKeysAbpV10xProperty sessionKeysAbpV10xProperty = SessionKeysAbpV10xProperty.builder()
     * .appSKey("appSKey")
     * .nwkSKey("nwkSKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv10x.html)
     */
    public inline fun cfnWirelessDeviceSessionKeysAbpV10xProperty(
        block: CfnWirelessDeviceSessionKeysAbpV10xPropertyDsl.() -> Unit =
            {}
    ): CfnWirelessDevice.SessionKeysAbpV10xProperty {
        val builder = CfnWirelessDeviceSessionKeysAbpV10xPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Session keys for ABP v1.1.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * SessionKeysAbpV11Property sessionKeysAbpV11Property = SessionKeysAbpV11Property.builder()
     * .appSKey("appSKey")
     * .fNwkSIntKey("fNwkSIntKey")
     * .nwkSEncKey("nwkSEncKey")
     * .sNwkSIntKey("sNwkSIntKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv11.html)
     */
    public inline fun cfnWirelessDeviceSessionKeysAbpV11Property(
        block: CfnWirelessDeviceSessionKeysAbpV11PropertyDsl.() -> Unit =
            {}
    ): CfnWirelessDevice.SessionKeysAbpV11Property {
        val builder = CfnWirelessDeviceSessionKeysAbpV11PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provisions a wireless gateway.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnWirelessGateway cfnWirelessGateway = CfnWirelessGateway.Builder.create(this,
     * "MyCfnWirelessGateway")
     * .loRaWan(LoRaWANGatewayProperty.builder()
     * .gatewayEui("gatewayEui")
     * .rfRegion("rfRegion")
     * .build())
     * // the properties below are optional
     * .description("description")
     * .lastUplinkReceivedAt("lastUplinkReceivedAt")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .thingArn("thingArn")
     * .thingName("thingName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html)
     */
    public inline fun cfnWirelessGateway(
        scope: Construct,
        id: String,
        block: CfnWirelessGatewayDsl.() -> Unit = {}
    ): CfnWirelessGateway {
        val builder = CfnWirelessGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * LoRaWAN wireless gateway object.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * LoRaWANGatewayProperty loRaWANGatewayProperty = LoRaWANGatewayProperty.builder()
     * .gatewayEui("gatewayEui")
     * .rfRegion("rfRegion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessgateway-lorawangateway.html)
     */
    public inline fun cfnWirelessGatewayLoRaWANGatewayProperty(
        block: CfnWirelessGatewayLoRaWANGatewayPropertyDsl.() -> Unit =
            {}
    ): CfnWirelessGateway.LoRaWANGatewayProperty {
        val builder = CfnWirelessGatewayLoRaWANGatewayPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWirelessGateway`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotwireless.*;
     * CfnWirelessGatewayProps cfnWirelessGatewayProps = CfnWirelessGatewayProps.builder()
     * .loRaWan(LoRaWANGatewayProperty.builder()
     * .gatewayEui("gatewayEui")
     * .rfRegion("rfRegion")
     * .build())
     * // the properties below are optional
     * .description("description")
     * .lastUplinkReceivedAt("lastUplinkReceivedAt")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .thingArn("thingArn")
     * .thingName("thingName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html)
     */
    public inline fun cfnWirelessGatewayProps(block: CfnWirelessGatewayPropsDsl.() -> Unit = {}): CfnWirelessGatewayProps {
        val builder = CfnWirelessGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
