@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnApplicationV2Props {
  public fun applicationConfiguration(): Any? = unwrap(this).getApplicationConfiguration()

  public fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

  public fun applicationMaintenanceConfiguration(): Any? =
      unwrap(this).getApplicationMaintenanceConfiguration()

  public fun applicationMode(): String? = unwrap(this).getApplicationMode()

  public fun applicationName(): String? = unwrap(this).getApplicationName()

  public fun runConfiguration(): Any? = unwrap(this).getRunConfiguration()

  public fun runtimeEnvironment(): String

  public fun serviceExecutionRole(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun applicationConfiguration(applicationConfiguration: IResolvable)

    public
        fun applicationConfiguration(applicationConfiguration: CfnApplicationV2.ApplicationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22c5af73a499c3f2b58faa1fedcf1f381394584b8b3f5530d370d99d09e71b0c")
    public
        fun applicationConfiguration(applicationConfiguration: CfnApplicationV2.ApplicationConfigurationProperty.Builder.() -> Unit)

    public fun applicationDescription(applicationDescription: String)

    public fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable)

    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplicationV2.ApplicationMaintenanceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1a0a93badd4a0bb3809d911f45f4d8b9b5d16962a057b75da3d025c1bd9cde1")
    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplicationV2.ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit)

    public fun applicationMode(applicationMode: String)

    public fun applicationName(applicationName: String)

    public fun runConfiguration(runConfiguration: IResolvable)

    public fun runConfiguration(runConfiguration: CfnApplicationV2.RunConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b9f12cfd1f2e16744ec3ad8392ba5cd9a2ea9dca2b24dac5db7c1423a9e7e27")
    public
        fun runConfiguration(runConfiguration: CfnApplicationV2.RunConfigurationProperty.Builder.() -> Unit)

    public fun runtimeEnvironment(runtimeEnvironment: String)

    public fun serviceExecutionRole(serviceExecutionRole: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.builder()

    override fun applicationConfiguration(applicationConfiguration: IResolvable) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun applicationConfiguration(applicationConfiguration: CfnApplicationV2.ApplicationConfigurationProperty) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(CfnApplicationV2.ApplicationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22c5af73a499c3f2b58faa1fedcf1f381394584b8b3f5530d370d99d09e71b0c")
    override
        fun applicationConfiguration(applicationConfiguration: CfnApplicationV2.ApplicationConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationConfiguration(CfnApplicationV2.ApplicationConfigurationProperty(applicationConfiguration))

    override fun applicationDescription(applicationDescription: String) {
      cdkBuilder.applicationDescription(applicationDescription)
    }

    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplicationV2.ApplicationMaintenanceConfigurationProperty) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(CfnApplicationV2.ApplicationMaintenanceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1a0a93badd4a0bb3809d911f45f4d8b9b5d16962a057b75da3d025c1bd9cde1")
    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplicationV2.ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationMaintenanceConfiguration(CfnApplicationV2.ApplicationMaintenanceConfigurationProperty(applicationMaintenanceConfiguration))

    override fun applicationMode(applicationMode: String) {
      cdkBuilder.applicationMode(applicationMode)
    }

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun runConfiguration(runConfiguration: IResolvable) {
      cdkBuilder.runConfiguration(runConfiguration.let(IResolvable::unwrap))
    }

    override fun runConfiguration(runConfiguration: CfnApplicationV2.RunConfigurationProperty) {
      cdkBuilder.runConfiguration(runConfiguration.let(CfnApplicationV2.RunConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b9f12cfd1f2e16744ec3ad8392ba5cd9a2ea9dca2b24dac5db7c1423a9e7e27")
    override
        fun runConfiguration(runConfiguration: CfnApplicationV2.RunConfigurationProperty.Builder.() -> Unit):
        Unit = runConfiguration(CfnApplicationV2.RunConfigurationProperty(runConfiguration))

    override fun runtimeEnvironment(runtimeEnvironment: String) {
      cdkBuilder.runtimeEnvironment(runtimeEnvironment)
    }

    override fun serviceExecutionRole(serviceExecutionRole: String) {
      cdkBuilder.serviceExecutionRole(serviceExecutionRole)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props,
  ) : CdkObject(cdkObject), CfnApplicationV2Props {
    override fun applicationConfiguration(): Any? = unwrap(this).getApplicationConfiguration()

    override fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

    override fun applicationMaintenanceConfiguration(): Any? =
        unwrap(this).getApplicationMaintenanceConfiguration()

    override fun applicationMode(): String? = unwrap(this).getApplicationMode()

    override fun applicationName(): String? = unwrap(this).getApplicationName()

    override fun runConfiguration(): Any? = unwrap(this).getRunConfiguration()

    override fun runtimeEnvironment(): String = unwrap(this).getRuntimeEnvironment()

    override fun serviceExecutionRole(): String = unwrap(this).getServiceExecutionRole()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationV2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props):
        CfnApplicationV2Props = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationV2Props):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props
  }
}
