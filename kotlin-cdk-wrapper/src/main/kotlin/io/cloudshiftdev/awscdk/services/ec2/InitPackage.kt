@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A package to be installed during cfn-init time.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * IMachineImage machineImage;
 * Instance.Builder.create(this, "Instance")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(machineImage)
 * // Showing the most complex setup, if you have simpler requirements
 * // you can use `CloudFormationInit.fromElements()`.
 * .init(CloudFormationInit.fromConfigSets(ConfigSetProps.builder()
 * .configSets(Map.of(
 * // Applies the configs below in this order
 * "default", List.of("yumPreinstall", "config")))
 * .configs(Map.of(
 * "yumPreinstall", new InitConfig(List.of(InitPackage.yum("git"))),
 * "config", new InitConfig(List.of(InitFile.fromObject("/etc/stack.json", Map.of(
 * "stackId", Stack.of(this).getStackId(),
 * "stackName", Stack.of(this).getStackName(),
 * "region", Stack.of(this).getRegion())), InitGroup.fromName("my-group"),
 * InitUser.fromName("my-user"),
 * InitPackage.rpm("http://mirrors.ukfast.co.uk/sites/dl.fedoraproject.org/pub/epel/8/Everything/x86_64/Packages/r/rubygem-git-1.5.0-2.el8.noarch.rpm")))))
 * .build()))
 * .initOptions(ApplyCloudFormationInitOptions.builder()
 * // Optional, which configsets to activate (['default'] by default)
 * .configSets(List.of("default"))
 * // Optional, how long the installation is expected to take (5 minutes by default)
 * .timeout(Duration.minutes(30))
 * // Optional, whether to include the --url argument when running cfn-init and cfn-signal commands
 * (false by default)
 * .includeUrl(true)
 * // Optional, whether to include the --role argument when running cfn-init and cfn-signal commands
 * (false by default)
 * .includeRole(true)
 * .build())
 * .build();
 * ```
 */
public open class InitPackage(
  cdkObject: software.amazon.awscdk.services.ec2.InitPackage,
) : InitElement(cdkObject) {
  /**
   * Returns the init element type for this element.
   */
  public override fun elementType(): String = unwrap(this).getElementType()

  public companion object {
    public fun apt(packageName: String): InitPackage =
        software.amazon.awscdk.services.ec2.InitPackage.apt(packageName).let(InitPackage::wrap)

    public fun apt(packageName: String, options: NamedPackageOptions): InitPackage =
        software.amazon.awscdk.services.ec2.InitPackage.apt(packageName,
        options.let(NamedPackageOptions::unwrap)).let(InitPackage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("56c5ef4dac296da113d618dc5a4c58d0f05db718cb912e50eff52e25a849456f")
    public fun apt(packageName: String, options: NamedPackageOptions.Builder.() -> Unit):
        InitPackage = apt(packageName, NamedPackageOptions(options))

    public fun msi(location: String): InitPackage =
        software.amazon.awscdk.services.ec2.InitPackage.msi(location).let(InitPackage::wrap)

    public fun msi(location: String, options: LocationPackageOptions): InitPackage =
        software.amazon.awscdk.services.ec2.InitPackage.msi(location,
        options.let(LocationPackageOptions::unwrap)).let(InitPackage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b31ac763634b5421ccf514f35d44f1c8490df358012f23e9765e8ca2bf948245")
    public fun msi(location: String, options: LocationPackageOptions.Builder.() -> Unit):
        InitPackage = msi(location, LocationPackageOptions(options))

    public fun python(packageName: String): InitPackage =
        software.amazon.awscdk.services.ec2.InitPackage.python(packageName).let(InitPackage::wrap)

    public fun python(packageName: String, options: NamedPackageOptions): InitPackage =
        software.amazon.awscdk.services.ec2.InitPackage.python(packageName,
        options.let(NamedPackageOptions::unwrap)).let(InitPackage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("840c48621004e25887c34b3d3cf879b2b56dfc1967359f95c3fbb02007c1ca00")
    public fun python(packageName: String, options: NamedPackageOptions.Builder.() -> Unit):
        InitPackage = python(packageName, NamedPackageOptions(options))

    public fun rpm(location: String): InitPackage =
        software.amazon.awscdk.services.ec2.InitPackage.rpm(location).let(InitPackage::wrap)

    public fun rpm(location: String, options: LocationPackageOptions): InitPackage =
        software.amazon.awscdk.services.ec2.InitPackage.rpm(location,
        options.let(LocationPackageOptions::unwrap)).let(InitPackage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25b7cdfdafa50d54608d0c0d3078099e5fb70eb1b8b2edf44cc4f9878d770d9e")
    public fun rpm(location: String, options: LocationPackageOptions.Builder.() -> Unit):
        InitPackage = rpm(location, LocationPackageOptions(options))

    public fun rubyGem(gemName: String): InitPackage =
        software.amazon.awscdk.services.ec2.InitPackage.rubyGem(gemName).let(InitPackage::wrap)

    public fun rubyGem(gemName: String, options: NamedPackageOptions): InitPackage =
        software.amazon.awscdk.services.ec2.InitPackage.rubyGem(gemName,
        options.let(NamedPackageOptions::unwrap)).let(InitPackage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98ea1b042a15902fe297b634ac1de33b10b9f3cd77a7d20936c283b18a29567d")
    public fun rubyGem(gemName: String, options: NamedPackageOptions.Builder.() -> Unit):
        InitPackage = rubyGem(gemName, NamedPackageOptions(options))

    public fun yum(packageName: String): InitPackage =
        software.amazon.awscdk.services.ec2.InitPackage.yum(packageName).let(InitPackage::wrap)

    public fun yum(packageName: String, options: NamedPackageOptions): InitPackage =
        software.amazon.awscdk.services.ec2.InitPackage.yum(packageName,
        options.let(NamedPackageOptions::unwrap)).let(InitPackage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48256aac0dd654897815af44a1e0b5fb724b9ee9a6e898adf016e444af0fd075")
    public fun yum(packageName: String, options: NamedPackageOptions.Builder.() -> Unit):
        InitPackage = yum(packageName, NamedPackageOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitPackage): InitPackage =
        InitPackage(cdkObject)

    internal fun unwrap(wrapped: InitPackage): software.amazon.awscdk.services.ec2.InitPackage =
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.InitPackage
  }
}
