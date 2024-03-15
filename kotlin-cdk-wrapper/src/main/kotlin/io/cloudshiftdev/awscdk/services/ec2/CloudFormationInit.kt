@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class CloudFormationInit internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CloudFormationInit,
) : CdkObject(cdkObject) {
  public open fun addConfig(configName: String, config: InitConfig) {
    unwrap(this).addConfig(configName, config.let(InitConfig::unwrap))
  }

  public open fun addConfigSet(configSetName: String) {
    unwrap(this).addConfigSet(configSetName)
  }

  public open fun addConfigSet(configSetName: String, configNames: List<String>) {
    unwrap(this).addConfigSet(configSetName, configNames)
  }

  public open fun attach(attachedResource: CfnResource, attachOptions: AttachInitOptions) {
    unwrap(this).attach(attachedResource.let(CfnResource::unwrap),
        attachOptions.let(AttachInitOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6a21fec88c1e8afdffefdf22622801c84a8d49a9d0e50e19f9681e714e12dddd")
  public open fun attach(attachedResource: CfnResource,
      attachOptions: AttachInitOptions.Builder.() -> Unit): Unit = attach(attachedResource,
      AttachInitOptions(attachOptions))

  public companion object {
    public fun fromConfig(config: InitConfig): CloudFormationInit =
        software.amazon.awscdk.services.ec2.CloudFormationInit.fromConfig(config.let(InitConfig::unwrap)).let(CloudFormationInit::wrap)

    public fun fromConfigSets(props: ConfigSetProps): CloudFormationInit =
        software.amazon.awscdk.services.ec2.CloudFormationInit.fromConfigSets(props.let(ConfigSetProps::unwrap)).let(CloudFormationInit::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a1ada42d693bd08ad189334b687e14fd6fcae9bb24ccd7817234984da78a781")
    public fun fromConfigSets(props: ConfigSetProps.Builder.() -> Unit): CloudFormationInit =
        fromConfigSets(ConfigSetProps(props))

    public fun fromElements(elements: InitElement): CloudFormationInit =
        software.amazon.awscdk.services.ec2.CloudFormationInit.fromElements(elements.let(InitElement::unwrap)).let(CloudFormationInit::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CloudFormationInit):
        CloudFormationInit = CloudFormationInit(cdkObject)

    internal fun unwrap(wrapped: CloudFormationInit):
        software.amazon.awscdk.services.ec2.CloudFormationInit = wrapped.cdkObject
  }
}