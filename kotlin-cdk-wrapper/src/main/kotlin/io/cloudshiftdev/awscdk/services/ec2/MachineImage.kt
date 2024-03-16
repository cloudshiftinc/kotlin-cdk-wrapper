@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Factory functions for standard Amazon Machine Image objects.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * SecurityGroup mySecurityGroup = SecurityGroup.Builder.create(this,
 * "SecurityGroup").vpc(vpc).build();
 * AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO))
 * .machineImage(MachineImage.latestAmazonLinux2())
 * .securityGroup(mySecurityGroup)
 * .build();
 * ```
 */
public abstract class MachineImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.MachineImage,
) : CdkObject(cdkObject) {
  public companion object {
    public fun fromSsmParameter(parameterName: String): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.fromSsmParameter(parameterName).let(IMachineImage::wrap)

    public fun fromSsmParameter(parameterName: String, options: SsmParameterImageOptions):
        IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.fromSsmParameter(parameterName,
        options.let(SsmParameterImageOptions::unwrap)).let(IMachineImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63f792ad7ab1cae3d66a8afcf4dab8ff31f2f3686850e6fa434c157beddea96f")
    public fun fromSsmParameter(parameterName: String,
        options: SsmParameterImageOptions.Builder.() -> Unit): IMachineImage =
        fromSsmParameter(parameterName, SsmParameterImageOptions(options))

    public fun genericLinux(amiMap: Map<String, String>): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.genericLinux(amiMap).let(IMachineImage::wrap)

    public fun genericLinux(amiMap: Map<String, String>, props: GenericLinuxImageProps):
        IMachineImage = software.amazon.awscdk.services.ec2.MachineImage.genericLinux(amiMap,
        props.let(GenericLinuxImageProps::unwrap)).let(IMachineImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4701b43763562a0f4d863888e6a78e2df7f0f72cedceb197faff2ef9bc9d05")
    public fun genericLinux(amiMap: Map<String, String>,
        props: GenericLinuxImageProps.Builder.() -> Unit): IMachineImage = genericLinux(amiMap,
        GenericLinuxImageProps(props))

    public fun genericWindows(amiMap: Map<String, String>): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.genericWindows(amiMap).let(IMachineImage::wrap)

    public fun genericWindows(amiMap: Map<String, String>, props: GenericWindowsImageProps):
        IMachineImage = software.amazon.awscdk.services.ec2.MachineImage.genericWindows(amiMap,
        props.let(GenericWindowsImageProps::unwrap)).let(IMachineImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29e5f78664e3160d40efe8d6ae2a2ee3887b5b8456e895c964544c2bf66115c7")
    public fun genericWindows(amiMap: Map<String, String>,
        props: GenericWindowsImageProps.Builder.() -> Unit): IMachineImage = genericWindows(amiMap,
        GenericWindowsImageProps(props))

    @Deprecated(message = "deprecated in CDK")
    public fun latestAmazonLinux(): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.latestAmazonLinux().let(IMachineImage::wrap)

    @Deprecated(message = "deprecated in CDK")
    public fun latestAmazonLinux(props: AmazonLinuxImageProps): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.latestAmazonLinux(props.let(AmazonLinuxImageProps::unwrap)).let(IMachineImage::wrap)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f234b0512d7779c7472d44eebbc6f88b8e35755407dd14de53537add10acd289")
    public fun latestAmazonLinux(props: AmazonLinuxImageProps.Builder.() -> Unit): IMachineImage =
        latestAmazonLinux(AmazonLinuxImageProps(props))

    public fun latestAmazonLinux2(): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.latestAmazonLinux2().let(IMachineImage::wrap)

    public fun latestAmazonLinux2(props: AmazonLinux2ImageSsmParameterProps): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.latestAmazonLinux2(props.let(AmazonLinux2ImageSsmParameterProps::unwrap)).let(IMachineImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92aee78120dd85359a1deb7426f9f01a98e4be3482c8fcdad9edcd36c195bdcf")
    public fun latestAmazonLinux2(props: AmazonLinux2ImageSsmParameterProps.Builder.() -> Unit):
        IMachineImage = latestAmazonLinux2(AmazonLinux2ImageSsmParameterProps(props))

    @Deprecated(message = "deprecated in CDK")
    public fun latestAmazonLinux2022(): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.latestAmazonLinux2022().let(IMachineImage::wrap)

    @Deprecated(message = "deprecated in CDK")
    public fun latestAmazonLinux2022(props: AmazonLinux2022ImageSsmParameterProps): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.latestAmazonLinux2022(props.let(AmazonLinux2022ImageSsmParameterProps::unwrap)).let(IMachineImage::wrap)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("850f4b6bd4a56ab7a6b7fd3e3ccbce93dc30f3e99fe16b1b4ace93a8f06a4adc")
    public
        fun latestAmazonLinux2022(props: AmazonLinux2022ImageSsmParameterProps.Builder.() -> Unit):
        IMachineImage = latestAmazonLinux2022(AmazonLinux2022ImageSsmParameterProps(props))

    public fun latestAmazonLinux2023(): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.latestAmazonLinux2023().let(IMachineImage::wrap)

    public fun latestAmazonLinux2023(props: AmazonLinux2023ImageSsmParameterProps): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.latestAmazonLinux2023(props.let(AmazonLinux2023ImageSsmParameterProps::unwrap)).let(IMachineImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("545cf7df6acb42be8aa9ee9750008fa1bdfe60c4469909f4955fd3783d1b1327")
    public
        fun latestAmazonLinux2023(props: AmazonLinux2023ImageSsmParameterProps.Builder.() -> Unit):
        IMachineImage = latestAmazonLinux2023(AmazonLinux2023ImageSsmParameterProps(props))

    public fun latestWindows(version: WindowsVersion): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.latestWindows(version.let(WindowsVersion::unwrap)).let(IMachineImage::wrap)

    public fun latestWindows(version: WindowsVersion, props: WindowsImageProps): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.latestWindows(version.let(WindowsVersion::unwrap),
        props.let(WindowsImageProps::unwrap)).let(IMachineImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("336d6ff6633fbb37fbdf64dde60a0c92781fa5a8560d350fb14f4c08b62b0bbc")
    public fun latestWindows(version: WindowsVersion, props: WindowsImageProps.Builder.() -> Unit):
        IMachineImage = latestWindows(version, WindowsImageProps(props))

    public fun lookup(props: LookupMachineImageProps): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.lookup(props.let(LookupMachineImageProps::unwrap)).let(IMachineImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8326e1f75e2666153392f77bc811eee47a73dae6b93750bfc303dfe7c75a1ff0")
    public fun lookup(props: LookupMachineImageProps.Builder.() -> Unit): IMachineImage =
        lookup(LookupMachineImageProps(props))

    public fun resolveSsmParameterAtLaunch(parameterName: String): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.resolveSsmParameterAtLaunch(parameterName).let(IMachineImage::wrap)

    public fun resolveSsmParameterAtLaunch(parameterName: String,
        options: SsmParameterImageOptions): IMachineImage =
        software.amazon.awscdk.services.ec2.MachineImage.resolveSsmParameterAtLaunch(parameterName,
        options.let(SsmParameterImageOptions::unwrap)).let(IMachineImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b0b6c7443f43c1241e86464c786f51f56714c41e618bf304d5e0ba468b35dec")
    public fun resolveSsmParameterAtLaunch(parameterName: String,
        options: SsmParameterImageOptions.Builder.() -> Unit): IMachineImage =
        resolveSsmParameterAtLaunch(parameterName, SsmParameterImageOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.MachineImage): MachineImage =
        CdkObjectWrappers.wrap(cdkObject) as MachineImage

    internal fun unwrap(wrapped: MachineImage): software.amazon.awscdk.services.ec2.MachineImage =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.MachineImage
  }
}
