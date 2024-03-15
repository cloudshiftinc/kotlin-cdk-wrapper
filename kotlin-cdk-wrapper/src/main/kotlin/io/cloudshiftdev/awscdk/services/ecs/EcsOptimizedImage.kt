@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import io.cloudshiftdev.awscdk.services.ec2.MachineImageConfig
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

public open class EcsOptimizedImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.EcsOptimizedImage,
) : CdkObject(cdkObject), IMachineImage {
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  public companion object {
    public fun amazonLinux(): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux().let(EcsOptimizedImage::wrap)

    public fun amazonLinux(options: EcsOptimizedImageOptions): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux(options.let(EcsOptimizedImageOptions::unwrap)).let(EcsOptimizedImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f93e5a87fbd6616222398433e1ccd8b9a1e019d397ddd8e321f33a36989609a7")
    public fun amazonLinux(options: EcsOptimizedImageOptions.Builder.() -> Unit): EcsOptimizedImage
        = amazonLinux(EcsOptimizedImageOptions(options))

    public fun amazonLinux2(): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux2().let(EcsOptimizedImage::wrap)

    public fun amazonLinux2(hardwareType: AmiHardwareType): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux2(hardwareType.let(AmiHardwareType::unwrap)).let(EcsOptimizedImage::wrap)

    public fun amazonLinux2(hardwareType: AmiHardwareType, options: EcsOptimizedImageOptions):
        EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux2(hardwareType.let(AmiHardwareType::unwrap),
        options.let(EcsOptimizedImageOptions::unwrap)).let(EcsOptimizedImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc3aa8d938d5713c1147297adfe81e772ad3efd29124368f915a9af0ce144697")
    public fun amazonLinux2(hardwareType: AmiHardwareType,
        options: EcsOptimizedImageOptions.Builder.() -> Unit): EcsOptimizedImage =
        amazonLinux2(hardwareType, EcsOptimizedImageOptions(options))

    public fun amazonLinux2023(): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux2023().let(EcsOptimizedImage::wrap)

    public fun amazonLinux2023(hardwareType: AmiHardwareType): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux2023(hardwareType.let(AmiHardwareType::unwrap)).let(EcsOptimizedImage::wrap)

    public fun amazonLinux2023(hardwareType: AmiHardwareType, options: EcsOptimizedImageOptions):
        EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux2023(hardwareType.let(AmiHardwareType::unwrap),
        options.let(EcsOptimizedImageOptions::unwrap)).let(EcsOptimizedImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa3b2f35b5fa6f9d797342f29e3bf57f158ca291e867516dafe0ff05bb7c144c")
    public fun amazonLinux2023(hardwareType: AmiHardwareType,
        options: EcsOptimizedImageOptions.Builder.() -> Unit): EcsOptimizedImage =
        amazonLinux2023(hardwareType, EcsOptimizedImageOptions(options))

    public fun windows(windowsVersion: WindowsOptimizedVersion): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.windows(windowsVersion.let(WindowsOptimizedVersion::unwrap)).let(EcsOptimizedImage::wrap)

    public fun windows(windowsVersion: WindowsOptimizedVersion, options: EcsOptimizedImageOptions):
        EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.windows(windowsVersion.let(WindowsOptimizedVersion::unwrap),
        options.let(EcsOptimizedImageOptions::unwrap)).let(EcsOptimizedImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6b383a2e109bf0dcab6b90cd7f90e03c0ab136e7b88e89b9a716c1541d1e014")
    public fun windows(windowsVersion: WindowsOptimizedVersion,
        options: EcsOptimizedImageOptions.Builder.() -> Unit): EcsOptimizedImage =
        windows(windowsVersion, EcsOptimizedImageOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EcsOptimizedImage):
        EcsOptimizedImage = EcsOptimizedImage(cdkObject)

    internal fun unwrap(wrapped: EcsOptimizedImage):
        software.amazon.awscdk.services.ecs.EcsOptimizedImage = wrapped.cdkObject
  }
}
