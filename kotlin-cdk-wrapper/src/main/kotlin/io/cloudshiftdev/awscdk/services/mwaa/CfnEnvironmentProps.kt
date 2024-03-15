@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mwaa

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnEnvironmentProps {
  public fun airflowConfigurationOptions(): Any? = unwrap(this).getAirflowConfigurationOptions()

  public fun airflowVersion(): String? = unwrap(this).getAirflowVersion()

  public fun dagS3Path(): String? = unwrap(this).getDagS3Path()

  public fun endpointManagement(): String? = unwrap(this).getEndpointManagement()

  public fun environmentClass(): String? = unwrap(this).getEnvironmentClass()

  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public fun kmsKey(): String? = unwrap(this).getKmsKey()

  public fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  public fun maxWorkers(): Number? = unwrap(this).getMaxWorkers()

  public fun minWorkers(): Number? = unwrap(this).getMinWorkers()

  public fun name(): String

  public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  public fun pluginsS3ObjectVersion(): String? = unwrap(this).getPluginsS3ObjectVersion()

  public fun pluginsS3Path(): String? = unwrap(this).getPluginsS3Path()

  public fun requirementsS3ObjectVersion(): String? = unwrap(this).getRequirementsS3ObjectVersion()

  public fun requirementsS3Path(): String? = unwrap(this).getRequirementsS3Path()

  public fun schedulers(): Number? = unwrap(this).getSchedulers()

  public fun sourceBucketArn(): String? = unwrap(this).getSourceBucketArn()

  public fun startupScriptS3ObjectVersion(): String? =
      unwrap(this).getStartupScriptS3ObjectVersion()

  public fun startupScriptS3Path(): String? = unwrap(this).getStartupScriptS3Path()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun webserverAccessMode(): String? = unwrap(this).getWebserverAccessMode()

  public fun weeklyMaintenanceWindowStart(): String? =
      unwrap(this).getWeeklyMaintenanceWindowStart()

  @CdkDslMarker
  public interface Builder {
    public fun airflowConfigurationOptions(airflowConfigurationOptions: Any)

    public fun airflowVersion(airflowVersion: String)

    public fun dagS3Path(dagS3Path: String)

    public fun endpointManagement(endpointManagement: String)

    public fun environmentClass(environmentClass: String)

    public fun executionRoleArn(executionRoleArn: String)

    public fun kmsKey(kmsKey: String)

    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    public
        fun loggingConfiguration(loggingConfiguration: CfnEnvironment.LoggingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84c4995f1fc8404e9fd03a20a635368e0afe50e6837eecfaa13de0a8657f6013")
    public
        fun loggingConfiguration(loggingConfiguration: CfnEnvironment.LoggingConfigurationProperty.Builder.() -> Unit)

    public fun maxWorkers(maxWorkers: Number)

    public fun minWorkers(minWorkers: Number)

    public fun name(name: String)

    public fun networkConfiguration(networkConfiguration: IResolvable)

    public
        fun networkConfiguration(networkConfiguration: CfnEnvironment.NetworkConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f719f4306d8b70cb82d76adfb17cd504ec1924aa10537a03995fe73a23882a0a")
    public
        fun networkConfiguration(networkConfiguration: CfnEnvironment.NetworkConfigurationProperty.Builder.() -> Unit)

    public fun pluginsS3ObjectVersion(pluginsS3ObjectVersion: String)

    public fun pluginsS3Path(pluginsS3Path: String)

    public fun requirementsS3ObjectVersion(requirementsS3ObjectVersion: String)

    public fun requirementsS3Path(requirementsS3Path: String)

    public fun schedulers(schedulers: Number)

    public fun sourceBucketArn(sourceBucketArn: String)

    public fun startupScriptS3ObjectVersion(startupScriptS3ObjectVersion: String)

    public fun startupScriptS3Path(startupScriptS3Path: String)

    public fun tags(tags: Any)

    public fun webserverAccessMode(webserverAccessMode: String)

    public fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mwaa.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.mwaa.CfnEnvironmentProps.builder()

    override fun airflowConfigurationOptions(airflowConfigurationOptions: Any) {
      cdkBuilder.airflowConfigurationOptions(airflowConfigurationOptions)
    }

    override fun airflowVersion(airflowVersion: String) {
      cdkBuilder.airflowVersion(airflowVersion)
    }

    override fun dagS3Path(dagS3Path: String) {
      cdkBuilder.dagS3Path(dagS3Path)
    }

    override fun endpointManagement(endpointManagement: String) {
      cdkBuilder.endpointManagement(endpointManagement)
    }

    override fun environmentClass(environmentClass: String) {
      cdkBuilder.environmentClass(environmentClass)
    }

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun loggingConfiguration(loggingConfiguration: CfnEnvironment.LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(CfnEnvironment.LoggingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84c4995f1fc8404e9fd03a20a635368e0afe50e6837eecfaa13de0a8657f6013")
    override
        fun loggingConfiguration(loggingConfiguration: CfnEnvironment.LoggingConfigurationProperty.Builder.() -> Unit):
        Unit =
        loggingConfiguration(CfnEnvironment.LoggingConfigurationProperty(loggingConfiguration))

    override fun maxWorkers(maxWorkers: Number) {
      cdkBuilder.maxWorkers(maxWorkers)
    }

    override fun minWorkers(minWorkers: Number) {
      cdkBuilder.minWorkers(minWorkers)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    override
        fun networkConfiguration(networkConfiguration: CfnEnvironment.NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(CfnEnvironment.NetworkConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f719f4306d8b70cb82d76adfb17cd504ec1924aa10537a03995fe73a23882a0a")
    override
        fun networkConfiguration(networkConfiguration: CfnEnvironment.NetworkConfigurationProperty.Builder.() -> Unit):
        Unit =
        networkConfiguration(CfnEnvironment.NetworkConfigurationProperty(networkConfiguration))

    override fun pluginsS3ObjectVersion(pluginsS3ObjectVersion: String) {
      cdkBuilder.pluginsS3ObjectVersion(pluginsS3ObjectVersion)
    }

    override fun pluginsS3Path(pluginsS3Path: String) {
      cdkBuilder.pluginsS3Path(pluginsS3Path)
    }

    override fun requirementsS3ObjectVersion(requirementsS3ObjectVersion: String) {
      cdkBuilder.requirementsS3ObjectVersion(requirementsS3ObjectVersion)
    }

    override fun requirementsS3Path(requirementsS3Path: String) {
      cdkBuilder.requirementsS3Path(requirementsS3Path)
    }

    override fun schedulers(schedulers: Number) {
      cdkBuilder.schedulers(schedulers)
    }

    override fun sourceBucketArn(sourceBucketArn: String) {
      cdkBuilder.sourceBucketArn(sourceBucketArn)
    }

    override fun startupScriptS3ObjectVersion(startupScriptS3ObjectVersion: String) {
      cdkBuilder.startupScriptS3ObjectVersion(startupScriptS3ObjectVersion)
    }

    override fun startupScriptS3Path(startupScriptS3Path: String) {
      cdkBuilder.startupScriptS3Path(startupScriptS3Path)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun webserverAccessMode(webserverAccessMode: String) {
      cdkBuilder.webserverAccessMode(webserverAccessMode)
    }

    override fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String) {
      cdkBuilder.weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart)
    }

    public fun build(): software.amazon.awscdk.services.mwaa.CfnEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironmentProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProps {
    override fun airflowConfigurationOptions(): Any? = unwrap(this).getAirflowConfigurationOptions()

    override fun airflowVersion(): String? = unwrap(this).getAirflowVersion()

    override fun dagS3Path(): String? = unwrap(this).getDagS3Path()

    override fun endpointManagement(): String? = unwrap(this).getEndpointManagement()

    override fun environmentClass(): String? = unwrap(this).getEnvironmentClass()

    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    override fun kmsKey(): String? = unwrap(this).getKmsKey()

    override fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

    override fun maxWorkers(): Number? = unwrap(this).getMaxWorkers()

    override fun minWorkers(): Number? = unwrap(this).getMinWorkers()

    override fun name(): String = unwrap(this).getName()

    override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    override fun pluginsS3ObjectVersion(): String? = unwrap(this).getPluginsS3ObjectVersion()

    override fun pluginsS3Path(): String? = unwrap(this).getPluginsS3Path()

    override fun requirementsS3ObjectVersion(): String? =
        unwrap(this).getRequirementsS3ObjectVersion()

    override fun requirementsS3Path(): String? = unwrap(this).getRequirementsS3Path()

    override fun schedulers(): Number? = unwrap(this).getSchedulers()

    override fun sourceBucketArn(): String? = unwrap(this).getSourceBucketArn()

    override fun startupScriptS3ObjectVersion(): String? =
        unwrap(this).getStartupScriptS3ObjectVersion()

    override fun startupScriptS3Path(): String? = unwrap(this).getStartupScriptS3Path()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun webserverAccessMode(): String? = unwrap(this).getWebserverAccessMode()

    override fun weeklyMaintenanceWindowStart(): String? =
        unwrap(this).getWeeklyMaintenanceWindowStart()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironmentProps):
        CfnEnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.mwaa.CfnEnvironmentProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.mwaa.CfnEnvironmentProps
  }
}
