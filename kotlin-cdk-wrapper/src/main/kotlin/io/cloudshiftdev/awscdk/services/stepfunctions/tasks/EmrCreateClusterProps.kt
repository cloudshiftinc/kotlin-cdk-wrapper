@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface EmrCreateClusterProps : TaskStateBaseProps {
  public fun additionalInfo(): String? = unwrap(this).getAdditionalInfo()

  public fun applications(): List<EmrCreateCluster.ApplicationConfigProperty> =
      unwrap(this).getApplications()?.map(EmrCreateCluster.ApplicationConfigProperty::wrap) ?:
      emptyList()

  public fun autoScalingRole(): IRole? = unwrap(this).getAutoScalingRole()?.let(IRole::wrap)

  public fun bootstrapActions(): List<EmrCreateCluster.BootstrapActionConfigProperty> =
      unwrap(this).getBootstrapActions()?.map(EmrCreateCluster.BootstrapActionConfigProperty::wrap)
      ?: emptyList()

  public fun clusterRole(): IRole? = unwrap(this).getClusterRole()?.let(IRole::wrap)

  public fun configurations(): List<EmrCreateCluster.ConfigurationProperty> =
      unwrap(this).getConfigurations()?.map(EmrCreateCluster.ConfigurationProperty::wrap) ?:
      emptyList()

  public fun customAmiId(): String? = unwrap(this).getCustomAmiId()

  public fun ebsRootVolumeSize(): Size? = unwrap(this).getEbsRootVolumeSize()?.let(Size::wrap)

  public fun instances(): EmrCreateCluster.InstancesConfigProperty

  public fun kerberosAttributes(): EmrCreateCluster.KerberosAttributesProperty? =
      unwrap(this).getKerberosAttributes()?.let(EmrCreateCluster.KerberosAttributesProperty::wrap)

  public fun logUri(): String? = unwrap(this).getLogUri()

  public fun name(): String

  public fun releaseLabel(): String? = unwrap(this).getReleaseLabel()

  public fun scaleDownBehavior(): EmrCreateCluster.EmrClusterScaleDownBehavior? =
      unwrap(this).getScaleDownBehavior()?.let(EmrCreateCluster.EmrClusterScaleDownBehavior::wrap)

  public fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  public fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

  public fun stepConcurrencyLevel(): Number? = unwrap(this).getStepConcurrencyLevel()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun visibleToAllUsers(): Boolean? = unwrap(this).getVisibleToAllUsers()

  @CdkDslMarker
  public interface Builder {
    public fun additionalInfo(additionalInfo: String)

    public fun applications(applications: List<EmrCreateCluster.ApplicationConfigProperty>)

    public fun applications(vararg applications: EmrCreateCluster.ApplicationConfigProperty)

    public fun autoScalingRole(autoScalingRole: IRole)

    public
        fun bootstrapActions(bootstrapActions: List<EmrCreateCluster.BootstrapActionConfigProperty>)

    public fun bootstrapActions(vararg
        bootstrapActions: EmrCreateCluster.BootstrapActionConfigProperty)

    public fun clusterRole(clusterRole: IRole)

    public fun comment(comment: String)

    public fun configurations(configurations: List<EmrCreateCluster.ConfigurationProperty>)

    public fun configurations(vararg configurations: EmrCreateCluster.ConfigurationProperty)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8a05a8b2a900a80c197ac0ad4a8607e1e6d8dab2c2961ef4f376f23b4d79a99")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun customAmiId(customAmiId: String)

    public fun ebsRootVolumeSize(ebsRootVolumeSize: Size)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun instances(instances: EmrCreateCluster.InstancesConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6670c1584377799a925b231cbe1e233b38f22472b024cb49039a2f57b62ab47")
    public fun instances(instances: EmrCreateCluster.InstancesConfigProperty.Builder.() -> Unit)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun kerberosAttributes(kerberosAttributes: EmrCreateCluster.KerberosAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce9ec945d76fee5cbc7cc6079170f8c756b38f52e61194024be928f2c5609656")
    public
        fun kerberosAttributes(kerberosAttributes: EmrCreateCluster.KerberosAttributesProperty.Builder.() -> Unit)

    public fun logUri(logUri: String)

    public fun name(name: String)

    public fun outputPath(outputPath: String)

    public fun releaseLabel(releaseLabel: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun scaleDownBehavior(scaleDownBehavior: EmrCreateCluster.EmrClusterScaleDownBehavior)

    public fun securityConfiguration(securityConfiguration: String)

    public fun serviceRole(serviceRole: IRole)

    public fun stateName(stateName: String)

    public fun stepConcurrencyLevel(stepConcurrencyLevel: Number)

    public fun tags(tags: Map<String, String>)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    public fun visibleToAllUsers(visibleToAllUsers: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps.builder()

    override fun additionalInfo(additionalInfo: String) {
      cdkBuilder.additionalInfo(additionalInfo)
    }

    override fun applications(applications: List<EmrCreateCluster.ApplicationConfigProperty>) {
      cdkBuilder.applications(applications.map(EmrCreateCluster.ApplicationConfigProperty::unwrap))
    }

    override fun applications(vararg applications: EmrCreateCluster.ApplicationConfigProperty): Unit
        = applications(applications.toList())

    override fun autoScalingRole(autoScalingRole: IRole) {
      cdkBuilder.autoScalingRole(autoScalingRole.let(IRole::unwrap))
    }

    override
        fun bootstrapActions(bootstrapActions: List<EmrCreateCluster.BootstrapActionConfigProperty>) {
      cdkBuilder.bootstrapActions(bootstrapActions.map(EmrCreateCluster.BootstrapActionConfigProperty::unwrap))
    }

    override fun bootstrapActions(vararg
        bootstrapActions: EmrCreateCluster.BootstrapActionConfigProperty): Unit =
        bootstrapActions(bootstrapActions.toList())

    override fun clusterRole(clusterRole: IRole) {
      cdkBuilder.clusterRole(clusterRole.let(IRole::unwrap))
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun configurations(configurations: List<EmrCreateCluster.ConfigurationProperty>) {
      cdkBuilder.configurations(configurations.map(EmrCreateCluster.ConfigurationProperty::unwrap))
    }

    override fun configurations(vararg configurations: EmrCreateCluster.ConfigurationProperty): Unit
        = configurations(configurations.toList())

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8a05a8b2a900a80c197ac0ad4a8607e1e6d8dab2c2961ef4f376f23b4d79a99")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    override fun customAmiId(customAmiId: String) {
      cdkBuilder.customAmiId(customAmiId)
    }

    override fun ebsRootVolumeSize(ebsRootVolumeSize: Size) {
      cdkBuilder.ebsRootVolumeSize(ebsRootVolumeSize.let(Size::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun instances(instances: EmrCreateCluster.InstancesConfigProperty) {
      cdkBuilder.instances(instances.let(EmrCreateCluster.InstancesConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6670c1584377799a925b231cbe1e233b38f22472b024cb49039a2f57b62ab47")
    override fun instances(instances: EmrCreateCluster.InstancesConfigProperty.Builder.() -> Unit):
        Unit = instances(EmrCreateCluster.InstancesConfigProperty(instances))

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override
        fun kerberosAttributes(kerberosAttributes: EmrCreateCluster.KerberosAttributesProperty) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(EmrCreateCluster.KerberosAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce9ec945d76fee5cbc7cc6079170f8c756b38f52e61194024be928f2c5609656")
    override
        fun kerberosAttributes(kerberosAttributes: EmrCreateCluster.KerberosAttributesProperty.Builder.() -> Unit):
        Unit = kerberosAttributes(EmrCreateCluster.KerberosAttributesProperty(kerberosAttributes))

    override fun logUri(logUri: String) {
      cdkBuilder.logUri(logUri)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun releaseLabel(releaseLabel: String) {
      cdkBuilder.releaseLabel(releaseLabel)
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override
        fun scaleDownBehavior(scaleDownBehavior: EmrCreateCluster.EmrClusterScaleDownBehavior) {
      cdkBuilder.scaleDownBehavior(scaleDownBehavior.let(EmrCreateCluster.EmrClusterScaleDownBehavior::unwrap))
    }

    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun stepConcurrencyLevel(stepConcurrencyLevel: Number) {
      cdkBuilder.stepConcurrencyLevel(stepConcurrencyLevel)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun visibleToAllUsers(visibleToAllUsers: Boolean) {
      cdkBuilder.visibleToAllUsers(visibleToAllUsers)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps,
  ) : CdkObject(cdkObject), EmrCreateClusterProps {
    override fun additionalInfo(): String? = unwrap(this).getAdditionalInfo()

    override fun applications(): List<EmrCreateCluster.ApplicationConfigProperty> =
        unwrap(this).getApplications()?.map(EmrCreateCluster.ApplicationConfigProperty::wrap) ?:
        emptyList()

    override fun autoScalingRole(): IRole? = unwrap(this).getAutoScalingRole()?.let(IRole::wrap)

    override fun bootstrapActions(): List<EmrCreateCluster.BootstrapActionConfigProperty> =
        unwrap(this).getBootstrapActions()?.map(EmrCreateCluster.BootstrapActionConfigProperty::wrap)
        ?: emptyList()

    override fun clusterRole(): IRole? = unwrap(this).getClusterRole()?.let(IRole::wrap)

    override fun comment(): String? = unwrap(this).getComment()

    override fun configurations(): List<EmrCreateCluster.ConfigurationProperty> =
        unwrap(this).getConfigurations()?.map(EmrCreateCluster.ConfigurationProperty::wrap) ?:
        emptyList()

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    override fun customAmiId(): String? = unwrap(this).getCustomAmiId()

    override fun ebsRootVolumeSize(): Size? = unwrap(this).getEbsRootVolumeSize()?.let(Size::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun instances(): EmrCreateCluster.InstancesConfigProperty =
        unwrap(this).getInstances().let(EmrCreateCluster.InstancesConfigProperty::wrap)

    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    override fun kerberosAttributes(): EmrCreateCluster.KerberosAttributesProperty? =
        unwrap(this).getKerberosAttributes()?.let(EmrCreateCluster.KerberosAttributesProperty::wrap)

    override fun logUri(): String? = unwrap(this).getLogUri()

    override fun name(): String = unwrap(this).getName()

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun releaseLabel(): String? = unwrap(this).getReleaseLabel()

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun scaleDownBehavior(): EmrCreateCluster.EmrClusterScaleDownBehavior? =
        unwrap(this).getScaleDownBehavior()?.let(EmrCreateCluster.EmrClusterScaleDownBehavior::wrap)

    override fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun stepConcurrencyLevel(): Number? = unwrap(this).getStepConcurrencyLevel()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun visibleToAllUsers(): Boolean? = unwrap(this).getVisibleToAllUsers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EmrCreateClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps):
        EmrCreateClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmrCreateClusterProps):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps
  }
}
