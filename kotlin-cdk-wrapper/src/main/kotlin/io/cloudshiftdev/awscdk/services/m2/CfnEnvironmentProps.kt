@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.m2

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

public interface CfnEnvironmentProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun engineType(): String

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun highAvailabilityConfig(): Any? = unwrap(this).getHighAvailabilityConfig()

  public fun instanceType(): String

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun name(): String

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun storageConfigurations(): Any? = unwrap(this).getStorageConfigurations()

  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun engineType(engineType: String)

    public fun engineVersion(engineVersion: String)

    public fun highAvailabilityConfig(highAvailabilityConfig: IResolvable)

    public
        fun highAvailabilityConfig(highAvailabilityConfig: CfnEnvironment.HighAvailabilityConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e21c4aab02522d5ee15d80737f824bad6ed26a8bc924eb9497418e6012e21c4")
    public
        fun highAvailabilityConfig(highAvailabilityConfig: CfnEnvironment.HighAvailabilityConfigProperty.Builder.() -> Unit)

    public fun instanceType(instanceType: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun storageConfigurations(storageConfigurations: IResolvable)

    public fun storageConfigurations(storageConfigurations: List<Any>)

    public fun storageConfigurations(vararg storageConfigurations: Any)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.m2.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.m2.CfnEnvironmentProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun highAvailabilityConfig(highAvailabilityConfig: IResolvable) {
      cdkBuilder.highAvailabilityConfig(highAvailabilityConfig.let(IResolvable::unwrap))
    }

    override
        fun highAvailabilityConfig(highAvailabilityConfig: CfnEnvironment.HighAvailabilityConfigProperty) {
      cdkBuilder.highAvailabilityConfig(highAvailabilityConfig.let(CfnEnvironment.HighAvailabilityConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e21c4aab02522d5ee15d80737f824bad6ed26a8bc924eb9497418e6012e21c4")
    override
        fun highAvailabilityConfig(highAvailabilityConfig: CfnEnvironment.HighAvailabilityConfigProperty.Builder.() -> Unit):
        Unit =
        highAvailabilityConfig(CfnEnvironment.HighAvailabilityConfigProperty(highAvailabilityConfig))

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun storageConfigurations(storageConfigurations: IResolvable) {
      cdkBuilder.storageConfigurations(storageConfigurations.let(IResolvable::unwrap))
    }

    override fun storageConfigurations(storageConfigurations: List<Any>) {
      cdkBuilder.storageConfigurations(storageConfigurations)
    }

    override fun storageConfigurations(vararg storageConfigurations: Any): Unit =
        storageConfigurations(storageConfigurations.toList())

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.m2.CfnEnvironmentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.m2.CfnEnvironmentProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun engineType(): String = unwrap(this).getEngineType()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun highAvailabilityConfig(): Any? = unwrap(this).getHighAvailabilityConfig()

    override fun instanceType(): String = unwrap(this).getInstanceType()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun name(): String = unwrap(this).getName()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun storageConfigurations(): Any? = unwrap(this).getStorageConfigurations()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnEnvironmentProps):
        CfnEnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.m2.CfnEnvironmentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.m2.CfnEnvironmentProps
  }
}
