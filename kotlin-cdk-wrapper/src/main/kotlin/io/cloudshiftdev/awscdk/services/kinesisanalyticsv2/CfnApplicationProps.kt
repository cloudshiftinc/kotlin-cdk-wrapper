@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnApplicationProps {
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
        fun applicationConfiguration(applicationConfiguration: CfnApplication.ApplicationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0311262f37fdea8610ef532b83f150fa088cd6b977e7d5f8506f2aec9e87187f")
    public
        fun applicationConfiguration(applicationConfiguration: CfnApplication.ApplicationConfigurationProperty.Builder.() -> Unit)

    public fun applicationDescription(applicationDescription: String)

    public fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable)

    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplication.ApplicationMaintenanceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6e8d4ae0d711726a391dceb350c3c6278c0987adacf55593e14fbe3d9f6b95b")
    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplication.ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit)

    public fun applicationMode(applicationMode: String)

    public fun applicationName(applicationName: String)

    public fun runConfiguration(runConfiguration: IResolvable)

    public fun runConfiguration(runConfiguration: CfnApplication.RunConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a848636436393563579e51b9e873c3e51744a04ea6909c18c9771bd03591e8fa")
    public
        fun runConfiguration(runConfiguration: CfnApplication.RunConfigurationProperty.Builder.() -> Unit)

    public fun runtimeEnvironment(runtimeEnvironment: String)

    public fun serviceExecutionRole(serviceExecutionRole: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps.builder()

    override fun applicationConfiguration(applicationConfiguration: IResolvable) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun applicationConfiguration(applicationConfiguration: CfnApplication.ApplicationConfigurationProperty) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(CfnApplication.ApplicationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0311262f37fdea8610ef532b83f150fa088cd6b977e7d5f8506f2aec9e87187f")
    override
        fun applicationConfiguration(applicationConfiguration: CfnApplication.ApplicationConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationConfiguration(CfnApplication.ApplicationConfigurationProperty(applicationConfiguration))

    override fun applicationDescription(applicationDescription: String) {
      cdkBuilder.applicationDescription(applicationDescription)
    }

    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplication.ApplicationMaintenanceConfigurationProperty) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(CfnApplication.ApplicationMaintenanceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6e8d4ae0d711726a391dceb350c3c6278c0987adacf55593e14fbe3d9f6b95b")
    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplication.ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationMaintenanceConfiguration(CfnApplication.ApplicationMaintenanceConfigurationProperty(applicationMaintenanceConfiguration))

    override fun applicationMode(applicationMode: String) {
      cdkBuilder.applicationMode(applicationMode)
    }

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun runConfiguration(runConfiguration: IResolvable) {
      cdkBuilder.runConfiguration(runConfiguration.let(IResolvable::unwrap))
    }

    override fun runConfiguration(runConfiguration: CfnApplication.RunConfigurationProperty) {
      cdkBuilder.runConfiguration(runConfiguration.let(CfnApplication.RunConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a848636436393563579e51b9e873c3e51744a04ea6909c18c9771bd03591e8fa")
    override
        fun runConfiguration(runConfiguration: CfnApplication.RunConfigurationProperty.Builder.() -> Unit):
        Unit = runConfiguration(CfnApplication.RunConfigurationProperty(runConfiguration))

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

    public fun build(): software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps
  }
}
