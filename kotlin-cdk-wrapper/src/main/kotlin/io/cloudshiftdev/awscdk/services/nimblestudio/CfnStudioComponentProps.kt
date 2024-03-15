@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnStudioComponentProps {
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  public fun description(): String? = unwrap(this).getDescription()

  public fun ec2SecurityGroupIds(): List<String> = unwrap(this).getEc2SecurityGroupIds() ?:
      emptyList()

  public fun initializationScripts(): Any? = unwrap(this).getInitializationScripts()

  public fun name(): String

  public fun runtimeRoleArn(): String? = unwrap(this).getRuntimeRoleArn()

  public fun scriptParameters(): Any? = unwrap(this).getScriptParameters()

  public fun secureInitializationRoleArn(): String? = unwrap(this).getSecureInitializationRoleArn()

  public fun studioId(): String

  public fun subtype(): String? = unwrap(this).getSubtype()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3ae6329dcd29294cb05a8362f31818aa25fdd3b66bb5ebc7c23386e83b61c5")
    public
        fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun ec2SecurityGroupIds(ec2SecurityGroupIds: List<String>)

    public fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String)

    public fun initializationScripts(initializationScripts: IResolvable)

    public fun initializationScripts(initializationScripts: List<Any>)

    public fun initializationScripts(vararg initializationScripts: Any)

    public fun name(name: String)

    public fun runtimeRoleArn(runtimeRoleArn: String)

    public fun scriptParameters(scriptParameters: IResolvable)

    public fun scriptParameters(scriptParameters: List<Any>)

    public fun scriptParameters(vararg scriptParameters: Any)

    public fun secureInitializationRoleArn(secureInitializationRoleArn: String)

    public fun studioId(studioId: String)

    public fun subtype(subtype: String)

    public fun tags(tags: Map<String, String>)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps.builder()

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override
        fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnStudioComponent.StudioComponentConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3ae6329dcd29294cb05a8362f31818aa25fdd3b66bb5ebc7c23386e83b61c5")
    override
        fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnStudioComponent.StudioComponentConfigurationProperty(configuration))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ec2SecurityGroupIds(ec2SecurityGroupIds: List<String>) {
      cdkBuilder.ec2SecurityGroupIds(ec2SecurityGroupIds)
    }

    override fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String): Unit =
        ec2SecurityGroupIds(ec2SecurityGroupIds.toList())

    override fun initializationScripts(initializationScripts: IResolvable) {
      cdkBuilder.initializationScripts(initializationScripts.let(IResolvable::unwrap))
    }

    override fun initializationScripts(initializationScripts: List<Any>) {
      cdkBuilder.initializationScripts(initializationScripts)
    }

    override fun initializationScripts(vararg initializationScripts: Any): Unit =
        initializationScripts(initializationScripts.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun runtimeRoleArn(runtimeRoleArn: String) {
      cdkBuilder.runtimeRoleArn(runtimeRoleArn)
    }

    override fun scriptParameters(scriptParameters: IResolvable) {
      cdkBuilder.scriptParameters(scriptParameters.let(IResolvable::unwrap))
    }

    override fun scriptParameters(scriptParameters: List<Any>) {
      cdkBuilder.scriptParameters(scriptParameters)
    }

    override fun scriptParameters(vararg scriptParameters: Any): Unit =
        scriptParameters(scriptParameters.toList())

    override fun secureInitializationRoleArn(secureInitializationRoleArn: String) {
      cdkBuilder.secureInitializationRoleArn(secureInitializationRoleArn)
    }

    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    override fun subtype(subtype: String) {
      cdkBuilder.subtype(subtype)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps,
  ) : CdkObject(cdkObject), CfnStudioComponentProps {
    override fun configuration(): Any? = unwrap(this).getConfiguration()

    override fun description(): String? = unwrap(this).getDescription()

    override fun ec2SecurityGroupIds(): List<String> = unwrap(this).getEc2SecurityGroupIds() ?:
        emptyList()

    override fun initializationScripts(): Any? = unwrap(this).getInitializationScripts()

    override fun name(): String = unwrap(this).getName()

    override fun runtimeRoleArn(): String? = unwrap(this).getRuntimeRoleArn()

    override fun scriptParameters(): Any? = unwrap(this).getScriptParameters()

    override fun secureInitializationRoleArn(): String? =
        unwrap(this).getSecureInitializationRoleArn()

    override fun studioId(): String = unwrap(this).getStudioId()

    override fun subtype(): String? = unwrap(this).getSubtype()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStudioComponentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps):
        CfnStudioComponentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStudioComponentProps):
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps
  }
}
