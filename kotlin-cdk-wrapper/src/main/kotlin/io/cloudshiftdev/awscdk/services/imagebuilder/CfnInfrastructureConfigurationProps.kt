@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnInfrastructureConfigurationProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun instanceMetadataOptions(): Any? = unwrap(this).getInstanceMetadataOptions()

  public fun instanceProfileName(): String

  public fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

  public fun keyPair(): String? = unwrap(this).getKeyPair()

  public fun logging(): Any? = unwrap(this).getLogging()

  public fun name(): String

  public fun resourceTags(): Any? = unwrap(this).getResourceTags()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  public fun subnetId(): String? = unwrap(this).getSubnetId()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun terminateInstanceOnFailure(): Any? = unwrap(this).getTerminateInstanceOnFailure()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun instanceMetadataOptions(instanceMetadataOptions: IResolvable)

    public
        fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a6a8239cd0b9d52c1d027610fb7cdc90f79c930841a33643caaa091a0fafc8e")
    public
        fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Builder.() -> Unit)

    public fun instanceProfileName(instanceProfileName: String)

    public fun instanceTypes(instanceTypes: List<String>)

    public fun instanceTypes(vararg instanceTypes: String)

    public fun keyPair(keyPair: String)

    public fun logging(logging: IResolvable)

    public fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf648abfd79f264614f5df1feaae17d622c7d7a162001c656eecb67db4671b0")
    public fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun resourceTags(resourceTags: IResolvable)

    public fun resourceTags(resourceTags: Map<String, String>)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun snsTopicArn(snsTopicArn: String)

    public fun subnetId(subnetId: String)

    public fun tags(tags: Map<String, String>)

    public fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean)

    public fun terminateInstanceOnFailure(terminateInstanceOnFailure: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceMetadataOptions(instanceMetadataOptions: IResolvable) {
      cdkBuilder.instanceMetadataOptions(instanceMetadataOptions.let(IResolvable::unwrap))
    }

    override
        fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty) {
      cdkBuilder.instanceMetadataOptions(instanceMetadataOptions.let(CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a6a8239cd0b9d52c1d027610fb7cdc90f79c930841a33643caaa091a0fafc8e")
    override
        fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Builder.() -> Unit):
        Unit =
        instanceMetadataOptions(CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty(instanceMetadataOptions))

    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    override fun instanceTypes(instanceTypes: List<String>) {
      cdkBuilder.instanceTypes(instanceTypes)
    }

    override fun instanceTypes(vararg instanceTypes: String): Unit =
        instanceTypes(instanceTypes.toList())

    override fun keyPair(keyPair: String) {
      cdkBuilder.keyPair(keyPair)
    }

    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable::unwrap))
    }

    override fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty) {
      cdkBuilder.logging(logging.let(CfnInfrastructureConfiguration.LoggingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf648abfd79f264614f5df1feaae17d622c7d7a162001c656eecb67db4671b0")
    override
        fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty.Builder.() -> Unit):
        Unit = logging(CfnInfrastructureConfiguration.LoggingProperty(logging))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    override fun resourceTags(resourceTags: Map<String, String>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean) {
      cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure)
    }

    override fun terminateInstanceOnFailure(terminateInstanceOnFailure: IResolvable) {
      cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure.let(IResolvable::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps,
  ) : CdkObject(cdkObject), CfnInfrastructureConfigurationProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun instanceMetadataOptions(): Any? = unwrap(this).getInstanceMetadataOptions()

    override fun instanceProfileName(): String = unwrap(this).getInstanceProfileName()

    override fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

    override fun keyPair(): String? = unwrap(this).getKeyPair()

    override fun logging(): Any? = unwrap(this).getLogging()

    override fun name(): String = unwrap(this).getName()

    override fun resourceTags(): Any? = unwrap(this).getResourceTags()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    override fun subnetId(): String? = unwrap(this).getSubnetId()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun terminateInstanceOnFailure(): Any? = unwrap(this).getTerminateInstanceOnFailure()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnInfrastructureConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps):
        CfnInfrastructureConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInfrastructureConfigurationProps):
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps
  }
}
