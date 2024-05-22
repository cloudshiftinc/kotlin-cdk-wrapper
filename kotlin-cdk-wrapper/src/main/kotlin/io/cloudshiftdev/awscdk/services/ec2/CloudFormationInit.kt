@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A CloudFormation-init configuration.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * Instance.Builder.create(this, "Instance")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(MachineImage.latestAmazonLinux2023())
 * .init(CloudFormationInit.fromElements(InitService.systemdConfigFile("simpleserver",
 * SystemdConfigFileOptions.builder()
 * .command("/usr/bin/python3 -m http.server 8080")
 * .cwd("/var/www/html")
 * .build()), InitService.enable("simpleserver", InitServiceOptions.builder()
 * .serviceManager(ServiceManager.SYSTEMD)
 * .build()), InitFile.fromString("/var/www/html/index.html", "Hello! It's working!")))
 * .build();
 * ```
 */
public open class CloudFormationInit(
  cdkObject: software.amazon.awscdk.services.ec2.CloudFormationInit,
) : CdkObject(cdkObject) {
  /**
   * Add a config with the given name to this CloudFormationInit object.
   *
   * @param configName 
   * @param config 
   */
  public open fun addConfig(configName: String, config: InitConfig) {
    unwrap(this).addConfig(configName, config.let(InitConfig.Companion::unwrap))
  }

  /**
   * Add a config set with the given name to this CloudFormationInit object.
   *
   * The new configset will reference the given configs in the given order.
   *
   * @param configSetName 
   * @param configNames
   */
  public open fun addConfigSet(configSetName: String) {
    unwrap(this).addConfigSet(configSetName)
  }

  /**
   * Add a config set with the given name to this CloudFormationInit object.
   *
   * The new configset will reference the given configs in the given order.
   *
   * @param configSetName 
   * @param configNames
   */
  public open fun addConfigSet(configSetName: String, configNames: List<String>) {
    unwrap(this).addConfigSet(configSetName, configNames)
  }

  /**
   * Attach the CloudFormation Init config to the given resource.
   *
   * As an app builder, use `instance.applyCloudFormationInit()` or
   * `autoScalingGroup.applyCloudFormationInit()` to trigger this method.
   *
   * This method does the following:
   *
   * * Renders the `AWS::CloudFormation::Init` object to the given resource's
   * metadata, potentially adding a `AWS::CloudFormation::Authentication` object
   * next to it if required.
   * * Updates the instance role policy to be able to call the APIs required for
   * `cfn-init` and `cfn-signal` to work, and potentially add permissions to download
   * referenced asset and bucket resources.
   * * Updates the given UserData with commands to execute the `cfn-init` script.
   *
   * @param attachedResource 
   * @param attachOptions 
   */
  public open fun attach(attachedResource: CfnResource, attachOptions: AttachInitOptions) {
    unwrap(this).attach(attachedResource.let(CfnResource.Companion::unwrap),
        attachOptions.let(AttachInitOptions.Companion::unwrap))
  }

  /**
   * Attach the CloudFormation Init config to the given resource.
   *
   * As an app builder, use `instance.applyCloudFormationInit()` or
   * `autoScalingGroup.applyCloudFormationInit()` to trigger this method.
   *
   * This method does the following:
   *
   * * Renders the `AWS::CloudFormation::Init` object to the given resource's
   * metadata, potentially adding a `AWS::CloudFormation::Authentication` object
   * next to it if required.
   * * Updates the instance role policy to be able to call the APIs required for
   * `cfn-init` and `cfn-signal` to work, and potentially add permissions to download
   * referenced asset and bucket resources.
   * * Updates the given UserData with commands to execute the `cfn-init` script.
   *
   * @param attachedResource 
   * @param attachOptions 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6a21fec88c1e8afdffefdf22622801c84a8d49a9d0e50e19f9681e714e12dddd")
  public open fun attach(attachedResource: CfnResource,
      attachOptions: AttachInitOptions.Builder.() -> Unit): Unit = attach(attachedResource,
      AttachInitOptions(attachOptions))

  public companion object {
    public fun fromConfig(config: InitConfig): CloudFormationInit =
        software.amazon.awscdk.services.ec2.CloudFormationInit.fromConfig(config.let(InitConfig.Companion::unwrap)).let(CloudFormationInit::wrap)

    public fun fromConfigSets(props: ConfigSetProps): CloudFormationInit =
        software.amazon.awscdk.services.ec2.CloudFormationInit.fromConfigSets(props.let(ConfigSetProps.Companion::unwrap)).let(CloudFormationInit::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a1ada42d693bd08ad189334b687e14fd6fcae9bb24ccd7817234984da78a781")
    public fun fromConfigSets(props: ConfigSetProps.Builder.() -> Unit): CloudFormationInit =
        fromConfigSets(ConfigSetProps(props))

    public fun fromElements(elements: InitElement): CloudFormationInit =
        software.amazon.awscdk.services.ec2.CloudFormationInit.fromElements(elements.let(InitElement.Companion::unwrap)).let(CloudFormationInit::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CloudFormationInit):
        CloudFormationInit = CloudFormationInit(cdkObject)

    internal fun unwrap(wrapped: CloudFormationInit):
        software.amazon.awscdk.services.ec2.CloudFormationInit = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CloudFormationInit
  }
}
