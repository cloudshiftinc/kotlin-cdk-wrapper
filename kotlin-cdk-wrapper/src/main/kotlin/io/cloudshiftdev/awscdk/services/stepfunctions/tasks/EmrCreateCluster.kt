@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EmrCreateCluster internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster,
) : TaskStateBase(cdkObject) {
  public open fun autoScalingRole(): IRole = unwrap(this).getAutoScalingRole().let(IRole::wrap)

  public open fun clusterRole(): IRole = unwrap(this).getClusterRole().let(IRole::wrap)

  public open fun serviceRole(): IRole = unwrap(this).getServiceRole().let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun additionalInfo(additionalInfo: String)

    public fun applications(applications: List<ApplicationConfigProperty>)

    public fun applications(vararg applications: ApplicationConfigProperty)

    public fun autoScalingRole(autoScalingRole: IRole)

    public fun bootstrapActions(bootstrapActions: List<BootstrapActionConfigProperty>)

    public fun bootstrapActions(vararg bootstrapActions: BootstrapActionConfigProperty)

    public fun clusterRole(clusterRole: IRole)

    public fun comment(comment: String)

    public fun configurations(configurations: List<ConfigurationProperty>)

    public fun configurations(vararg configurations: ConfigurationProperty)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb5f460e0e2cfd6af91ce0e7b89d551a99a1db683817e26654ab34ee73268da1")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun customAmiId(customAmiId: String)

    public fun ebsRootVolumeSize(ebsRootVolumeSize: Size)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun instances(instances: InstancesConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10af92922533ae8a24ffcad71bb2c27c2cd7261090d74dc74f03665583298f1d")
    public fun instances(instances: InstancesConfigProperty.Builder.() -> Unit)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("009696d119485783fe485fae2584ed39873548c64acbcf4b360c05866bd665ec")
    public fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty.Builder.() -> Unit)

    public fun logUri(logUri: String)

    public fun name(name: String)

    public fun outputPath(outputPath: String)

    public fun releaseLabel(releaseLabel: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun scaleDownBehavior(scaleDownBehavior: EmrClusterScaleDownBehavior)

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.Builder.create(scope,
        id)

    override fun additionalInfo(additionalInfo: String) {
      cdkBuilder.additionalInfo(additionalInfo)
    }

    override fun applications(applications: List<ApplicationConfigProperty>) {
      cdkBuilder.applications(applications.map(ApplicationConfigProperty::unwrap))
    }

    override fun applications(vararg applications: ApplicationConfigProperty): Unit =
        applications(applications.toList())

    override fun autoScalingRole(autoScalingRole: IRole) {
      cdkBuilder.autoScalingRole(autoScalingRole.let(IRole::unwrap))
    }

    override fun bootstrapActions(bootstrapActions: List<BootstrapActionConfigProperty>) {
      cdkBuilder.bootstrapActions(bootstrapActions.map(BootstrapActionConfigProperty::unwrap))
    }

    override fun bootstrapActions(vararg bootstrapActions: BootstrapActionConfigProperty): Unit =
        bootstrapActions(bootstrapActions.toList())

    override fun clusterRole(clusterRole: IRole) {
      cdkBuilder.clusterRole(clusterRole.let(IRole::unwrap))
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun configurations(configurations: List<ConfigurationProperty>) {
      cdkBuilder.configurations(configurations.map(ConfigurationProperty::unwrap))
    }

    override fun configurations(vararg configurations: ConfigurationProperty): Unit =
        configurations(configurations.toList())

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb5f460e0e2cfd6af91ce0e7b89d551a99a1db683817e26654ab34ee73268da1")
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

    override fun instances(instances: InstancesConfigProperty) {
      cdkBuilder.instances(instances.let(InstancesConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10af92922533ae8a24ffcad71bb2c27c2cd7261090d74dc74f03665583298f1d")
    override fun instances(instances: InstancesConfigProperty.Builder.() -> Unit): Unit =
        instances(InstancesConfigProperty(instances))

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(KerberosAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("009696d119485783fe485fae2584ed39873548c64acbcf4b360c05866bd665ec")
    override
        fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty.Builder.() -> Unit):
        Unit = kerberosAttributes(KerberosAttributesProperty(kerberosAttributes))

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

    override fun scaleDownBehavior(scaleDownBehavior: EmrClusterScaleDownBehavior) {
      cdkBuilder.scaleDownBehavior(scaleDownBehavior.let(EmrClusterScaleDownBehavior::unwrap))
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EmrCreateCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EmrCreateCluster(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster):
        EmrCreateCluster = EmrCreateCluster(cdkObject)

    internal fun unwrap(wrapped: EmrCreateCluster):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster = wrapped.cdkObject
  }

  public interface ConfigurationProperty {
    public fun classification(): String? = unwrap(this).getClassification()

    public fun configurations(): List<ConfigurationProperty> =
        unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

    public fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()

    @CdkDslMarker
    public interface Builder {
      public fun classification(classification: String)

      public fun configurations(configurations: List<ConfigurationProperty>)

      public fun configurations(vararg configurations: ConfigurationProperty)

      public fun properties(properties: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty.builder()

      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      override fun configurations(configurations: List<ConfigurationProperty>) {
        cdkBuilder.configurations(configurations.map(ConfigurationProperty::unwrap))
      }

      override fun configurations(vararg configurations: ConfigurationProperty): Unit =
          configurations(configurations.toList())

      override fun properties(properties: Map<String, String>) {
        cdkBuilder.properties(properties)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty,
    ) : CdkObject(cdkObject), ConfigurationProperty {
      override fun classification(): String? = unwrap(this).getClassification()

      override fun configurations(): List<ConfigurationProperty> =
          unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

      override fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty):
          ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty
    }
  }

  public enum class ScalingAdjustmentType(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType,
  ) {
    CHANGE_IN_CAPACITY(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.CHANGE_IN_CAPACITY),
    PERCENT_CHANGE_IN_CAPACITY(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.PERCENT_CHANGE_IN_CAPACITY),
    EXACT_CAPACITY(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.EXACT_CAPACITY),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType):
          ScalingAdjustmentType = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.CHANGE_IN_CAPACITY ->
            ScalingAdjustmentType.CHANGE_IN_CAPACITY
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.PERCENT_CHANGE_IN_CAPACITY ->
            ScalingAdjustmentType.PERCENT_CHANGE_IN_CAPACITY
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.EXACT_CAPACITY ->
            ScalingAdjustmentType.EXACT_CAPACITY
      }

      internal fun unwrap(wrapped: ScalingAdjustmentType):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType
          = wrapped.cdkObject
    }
  }

  public interface BootstrapActionConfigProperty {
    public fun name(): String

    public fun scriptBootstrapAction(): ScriptBootstrapActionConfigProperty

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e46424a100529b23b874f3d97c0f1eb4a4773b914c6ee48bbba8948c430ae044")
      public
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty) {
        cdkBuilder.scriptBootstrapAction(scriptBootstrapAction.let(ScriptBootstrapActionConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e46424a100529b23b874f3d97c0f1eb4a4773b914c6ee48bbba8948c430ae044")
      override
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty.Builder.() -> Unit):
          Unit = scriptBootstrapAction(ScriptBootstrapActionConfigProperty(scriptBootstrapAction))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty,
    ) : CdkObject(cdkObject), BootstrapActionConfigProperty {
      override fun name(): String = unwrap(this).getName()

      override fun scriptBootstrapAction(): ScriptBootstrapActionConfigProperty =
          unwrap(this).getScriptBootstrapAction().let(ScriptBootstrapActionConfigProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BootstrapActionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty):
          BootstrapActionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BootstrapActionConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty
    }
  }

  public enum class EbsBlockDeviceVolumeType(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType,
  ) {
    GP3(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.GP3),
    GP2(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.GP2),
    IO1(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.IO1),
    ST1(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.ST1),
    SC1(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.SC1),
    STANDARD(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.STANDARD),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType):
          EbsBlockDeviceVolumeType = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.GP3 ->
            EbsBlockDeviceVolumeType.GP3
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.GP2 ->
            EbsBlockDeviceVolumeType.GP2
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.IO1 ->
            EbsBlockDeviceVolumeType.IO1
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.ST1 ->
            EbsBlockDeviceVolumeType.ST1
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.SC1 ->
            EbsBlockDeviceVolumeType.SC1
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.STANDARD ->
            EbsBlockDeviceVolumeType.STANDARD
      }

      internal fun unwrap(wrapped: EbsBlockDeviceVolumeType):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType
          = wrapped.cdkObject
    }
  }

  public interface EbsBlockDeviceConfigProperty {
    public fun volumeSpecification(): VolumeSpecificationProperty

    public fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()

    @CdkDslMarker
    public interface Builder {
      public fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6f90ce225f535e721d478357450c309793426146555761af77137d6011275d2")
      public
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit)

      public fun volumesPerInstance(volumesPerInstance: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty.builder()

      override fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(VolumeSpecificationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6f90ce225f535e721d478357450c309793426146555761af77137d6011275d2")
      override
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit):
          Unit = volumeSpecification(VolumeSpecificationProperty(volumeSpecification))

      override fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty,
    ) : CdkObject(cdkObject), EbsBlockDeviceConfigProperty {
      override fun volumeSpecification(): VolumeSpecificationProperty =
          unwrap(this).getVolumeSpecification().let(VolumeSpecificationProperty::wrap)

      override fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty):
          EbsBlockDeviceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty
    }
  }

  public interface VolumeSpecificationProperty {
    public fun iops(): Number? = unwrap(this).getIops()

    public fun volumeSize(): Size

    public fun volumeType(): EbsBlockDeviceVolumeType

    @CdkDslMarker
    public interface Builder {
      public fun iops(iops: Number)

      public fun volumeSize(volumeSize: Size)

      public fun volumeType(volumeType: EbsBlockDeviceVolumeType)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty.builder()

      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      override fun volumeSize(volumeSize: Size) {
        cdkBuilder.volumeSize(volumeSize.let(Size::unwrap))
      }

      override fun volumeType(volumeType: EbsBlockDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType.let(EbsBlockDeviceVolumeType::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty,
    ) : CdkObject(cdkObject), VolumeSpecificationProperty {
      override fun iops(): Number? = unwrap(this).getIops()

      override fun volumeSize(): Size = unwrap(this).getVolumeSize().let(Size::wrap)

      override fun volumeType(): EbsBlockDeviceVolumeType =
          unwrap(this).getVolumeType().let(EbsBlockDeviceVolumeType::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty):
          VolumeSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeSpecificationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty
    }
  }

  public interface ApplicationConfigProperty {
    public fun additionalInfo(): Map<String, String> = unwrap(this).getAdditionalInfo() ?:
        emptyMap()

    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    public fun name(): String

    public fun version(): String? = unwrap(this).getVersion()

    @CdkDslMarker
    public interface Builder {
      public fun additionalInfo(additionalInfo: Map<String, String>)

      public fun args(args: List<String>)

      public fun args(vararg args: String)

      public fun name(name: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty.builder()

      override fun additionalInfo(additionalInfo: Map<String, String>) {
        cdkBuilder.additionalInfo(additionalInfo)
      }

      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      override fun args(vararg args: String): Unit = args(args.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty,
    ) : CdkObject(cdkObject), ApplicationConfigProperty {
      override fun additionalInfo(): Map<String, String> = unwrap(this).getAdditionalInfo() ?:
          emptyMap()

      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      override fun name(): String = unwrap(this).getName()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty):
          ApplicationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty
    }
  }

  public interface InstanceTypeConfigProperty {
    public fun bidPrice(): String? = unwrap(this).getBidPrice()

    public fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
        unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

    public fun configurations(): List<ConfigurationProperty> =
        unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

    public fun ebsConfiguration(): EbsConfigurationProperty? =
        unwrap(this).getEbsConfiguration()?.let(EbsConfigurationProperty::wrap)

    public fun instanceType(): String

    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    @CdkDslMarker
    public interface Builder {
      public fun bidPrice(bidPrice: String)

      public fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number)

      public fun configurations(configurations: List<ConfigurationProperty>)

      public fun configurations(vararg configurations: ConfigurationProperty)

      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("133da82e296eb42525c1f9483336b2cf7e322346309773613f5c5555f23f23a1")
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit)

      public fun instanceType(instanceType: String)

      public fun weightedCapacity(weightedCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty.builder()

      override fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
      }

      override
          fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
        cdkBuilder.bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice)
      }

      override fun configurations(configurations: List<ConfigurationProperty>) {
        cdkBuilder.configurations(configurations.map(ConfigurationProperty::unwrap))
      }

      override fun configurations(vararg configurations: ConfigurationProperty): Unit =
          configurations(configurations.toList())

      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("133da82e296eb42525c1f9483336b2cf7e322346309773613f5c5555f23f23a1")
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit):
          Unit = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty,
    ) : CdkObject(cdkObject), InstanceTypeConfigProperty {
      override fun bidPrice(): String? = unwrap(this).getBidPrice()

      override fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
          unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

      override fun configurations(): List<ConfigurationProperty> =
          unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

      override fun ebsConfiguration(): EbsConfigurationProperty? =
          unwrap(this).getEbsConfiguration()?.let(EbsConfigurationProperty::wrap)

      override fun instanceType(): String = unwrap(this).getInstanceType()

      override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty):
          InstanceTypeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceTypeConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty
    }
  }

  public interface InstanceGroupConfigProperty {
    public fun autoScalingPolicy(): AutoScalingPolicyProperty? =
        unwrap(this).getAutoScalingPolicy()?.let(AutoScalingPolicyProperty::wrap)

    public fun bidPrice(): String? = unwrap(this).getBidPrice()

    public fun configurations(): List<ConfigurationProperty> =
        unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

    public fun ebsConfiguration(): EbsConfigurationProperty? =
        unwrap(this).getEbsConfiguration()?.let(EbsConfigurationProperty::wrap)

    public fun instanceCount(): Number

    public fun instanceRole(): InstanceRoleType

    public fun instanceType(): String

    public fun market(): InstanceMarket? = unwrap(this).getMarket()?.let(InstanceMarket::wrap)

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac2482af47863b3a51f0bc8765595bbe84c51d68d67eae14b91ffa4868f55b85")
      public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit)

      public fun bidPrice(bidPrice: String)

      public fun configurations(configurations: List<ConfigurationProperty>)

      public fun configurations(vararg configurations: ConfigurationProperty)

      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("14867309e2488f898214a5b68d3ac2bc85d329c3b00acb0ef46ad1903ac33246")
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit)

      public fun instanceCount(instanceCount: Number)

      public fun instanceRole(instanceRole: InstanceRoleType)

      public fun instanceType(instanceType: String)

      public fun market(market: InstanceMarket)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty.builder()

      override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(AutoScalingPolicyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac2482af47863b3a51f0bc8765595bbe84c51d68d67eae14b91ffa4868f55b85")
      override
          fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit):
          Unit = autoScalingPolicy(AutoScalingPolicyProperty(autoScalingPolicy))

      override fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
      }

      override fun configurations(configurations: List<ConfigurationProperty>) {
        cdkBuilder.configurations(configurations.map(ConfigurationProperty::unwrap))
      }

      override fun configurations(vararg configurations: ConfigurationProperty): Unit =
          configurations(configurations.toList())

      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("14867309e2488f898214a5b68d3ac2bc85d329c3b00acb0ef46ad1903ac33246")
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit):
          Unit = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      override fun instanceRole(instanceRole: InstanceRoleType) {
        cdkBuilder.instanceRole(instanceRole.let(InstanceRoleType::unwrap))
      }

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun market(market: InstanceMarket) {
        cdkBuilder.market(market.let(InstanceMarket::unwrap))
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty,
    ) : CdkObject(cdkObject), InstanceGroupConfigProperty {
      override fun autoScalingPolicy(): AutoScalingPolicyProperty? =
          unwrap(this).getAutoScalingPolicy()?.let(AutoScalingPolicyProperty::wrap)

      override fun bidPrice(): String? = unwrap(this).getBidPrice()

      override fun configurations(): List<ConfigurationProperty> =
          unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

      override fun ebsConfiguration(): EbsConfigurationProperty? =
          unwrap(this).getEbsConfiguration()?.let(EbsConfigurationProperty::wrap)

      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      override fun instanceRole(): InstanceRoleType =
          unwrap(this).getInstanceRole().let(InstanceRoleType::wrap)

      override fun instanceType(): String = unwrap(this).getInstanceType()

      override fun market(): InstanceMarket? = unwrap(this).getMarket()?.let(InstanceMarket::wrap)

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty):
          InstanceGroupConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceGroupConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty
    }
  }

  public interface CloudWatchAlarmDefinitionProperty {
    public fun comparisonOperator(): CloudWatchAlarmComparisonOperator

    public fun dimensions(): List<MetricDimensionProperty> =
        unwrap(this).getDimensions()?.map(MetricDimensionProperty::wrap) ?: emptyList()

    public fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

    public fun metricName(): String

    public fun namespace(): String? = unwrap(this).getNamespace()

    public fun period(): Duration

    public fun statistic(): CloudWatchAlarmStatistic? =
        unwrap(this).getStatistic()?.let(CloudWatchAlarmStatistic::wrap)

    public fun threshold(): Number? = unwrap(this).getThreshold()

    public fun unit(): CloudWatchAlarmUnit? = unwrap(this).getUnit()?.let(CloudWatchAlarmUnit::wrap)

    @CdkDslMarker
    public interface Builder {
      public fun comparisonOperator(comparisonOperator: CloudWatchAlarmComparisonOperator)

      public fun dimensions(dimensions: List<MetricDimensionProperty>)

      public fun dimensions(vararg dimensions: MetricDimensionProperty)

      public fun evaluationPeriods(evaluationPeriods: Number)

      public fun metricName(metricName: String)

      public fun namespace(namespace: String)

      public fun period(period: Duration)

      public fun statistic(statistic: CloudWatchAlarmStatistic)

      public fun threshold(threshold: Number)

      public fun unit(unit: CloudWatchAlarmUnit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty.builder()

      override fun comparisonOperator(comparisonOperator: CloudWatchAlarmComparisonOperator) {
        cdkBuilder.comparisonOperator(comparisonOperator.let(CloudWatchAlarmComparisonOperator::unwrap))
      }

      override fun dimensions(dimensions: List<MetricDimensionProperty>) {
        cdkBuilder.dimensions(dimensions.map(MetricDimensionProperty::unwrap))
      }

      override fun dimensions(vararg dimensions: MetricDimensionProperty): Unit =
          dimensions(dimensions.toList())

      override fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
      }

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      override fun period(period: Duration) {
        cdkBuilder.period(period.let(Duration::unwrap))
      }

      override fun statistic(statistic: CloudWatchAlarmStatistic) {
        cdkBuilder.statistic(statistic.let(CloudWatchAlarmStatistic::unwrap))
      }

      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      override fun unit(unit: CloudWatchAlarmUnit) {
        cdkBuilder.unit(unit.let(CloudWatchAlarmUnit::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty,
    ) : CdkObject(cdkObject), CloudWatchAlarmDefinitionProperty {
      override fun comparisonOperator(): CloudWatchAlarmComparisonOperator =
          unwrap(this).getComparisonOperator().let(CloudWatchAlarmComparisonOperator::wrap)

      override fun dimensions(): List<MetricDimensionProperty> =
          unwrap(this).getDimensions()?.map(MetricDimensionProperty::wrap) ?: emptyList()

      override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

      override fun metricName(): String = unwrap(this).getMetricName()

      override fun namespace(): String? = unwrap(this).getNamespace()

      override fun period(): Duration = unwrap(this).getPeriod().let(Duration::wrap)

      override fun statistic(): CloudWatchAlarmStatistic? =
          unwrap(this).getStatistic()?.let(CloudWatchAlarmStatistic::wrap)

      override fun threshold(): Number? = unwrap(this).getThreshold()

      override fun unit(): CloudWatchAlarmUnit? =
          unwrap(this).getUnit()?.let(CloudWatchAlarmUnit::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchAlarmDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty):
          CloudWatchAlarmDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchAlarmDefinitionProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty
    }
  }

  public interface InstancesConfigProperty {
    public fun additionalMasterSecurityGroups(): List<String> =
        unwrap(this).getAdditionalMasterSecurityGroups() ?: emptyList()

    public fun additionalSlaveSecurityGroups(): List<String> =
        unwrap(this).getAdditionalSlaveSecurityGroups() ?: emptyList()

    public fun ec2KeyName(): String? = unwrap(this).getEc2KeyName()

    public fun ec2SubnetId(): String? = unwrap(this).getEc2SubnetId()

    public fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds() ?: emptyList()

    public fun emrManagedMasterSecurityGroup(): String? =
        unwrap(this).getEmrManagedMasterSecurityGroup()

    public fun emrManagedSlaveSecurityGroup(): String? =
        unwrap(this).getEmrManagedSlaveSecurityGroup()

    public fun hadoopVersion(): String? = unwrap(this).getHadoopVersion()

    public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    public fun instanceFleets(): List<InstanceFleetConfigProperty> =
        unwrap(this).getInstanceFleets()?.map(InstanceFleetConfigProperty::wrap) ?: emptyList()

    public fun instanceGroups(): List<InstanceGroupConfigProperty> =
        unwrap(this).getInstanceGroups()?.map(InstanceGroupConfigProperty::wrap) ?: emptyList()

    public fun masterInstanceType(): String? = unwrap(this).getMasterInstanceType()

    public fun placement(): PlacementTypeProperty? =
        unwrap(this).getPlacement()?.let(PlacementTypeProperty::wrap)

    public fun serviceAccessSecurityGroup(): String? = unwrap(this).getServiceAccessSecurityGroup()

    public fun slaveInstanceType(): String? = unwrap(this).getSlaveInstanceType()

    public fun terminationProtected(): Boolean? = unwrap(this).getTerminationProtected()

    @CdkDslMarker
    public interface Builder {
      public fun additionalMasterSecurityGroups(additionalMasterSecurityGroups: List<String>)

      public fun additionalMasterSecurityGroups(vararg additionalMasterSecurityGroups: String)

      public fun additionalSlaveSecurityGroups(additionalSlaveSecurityGroups: List<String>)

      public fun additionalSlaveSecurityGroups(vararg additionalSlaveSecurityGroups: String)

      public fun ec2KeyName(ec2KeyName: String)

      public fun ec2SubnetId(ec2SubnetId: String)

      public fun ec2SubnetIds(ec2SubnetIds: List<String>)

      public fun ec2SubnetIds(vararg ec2SubnetIds: String)

      public fun emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup: String)

      public fun emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup: String)

      public fun hadoopVersion(hadoopVersion: String)

      public fun instanceCount(instanceCount: Number)

      public fun instanceFleets(instanceFleets: List<InstanceFleetConfigProperty>)

      public fun instanceFleets(vararg instanceFleets: InstanceFleetConfigProperty)

      public fun instanceGroups(instanceGroups: List<InstanceGroupConfigProperty>)

      public fun instanceGroups(vararg instanceGroups: InstanceGroupConfigProperty)

      public fun masterInstanceType(masterInstanceType: String)

      public fun placement(placement: PlacementTypeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e3b0f389fd006aec3b704b161d2f4aadc8aa927fc43eb4badeb7b51c29ca11f")
      public fun placement(placement: PlacementTypeProperty.Builder.() -> Unit)

      public fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String)

      public fun slaveInstanceType(slaveInstanceType: String)

      public fun terminationProtected(terminationProtected: Boolean)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty.builder()

      override fun additionalMasterSecurityGroups(additionalMasterSecurityGroups: List<String>) {
        cdkBuilder.additionalMasterSecurityGroups(additionalMasterSecurityGroups)
      }

      override fun additionalMasterSecurityGroups(vararg additionalMasterSecurityGroups: String):
          Unit = additionalMasterSecurityGroups(additionalMasterSecurityGroups.toList())

      override fun additionalSlaveSecurityGroups(additionalSlaveSecurityGroups: List<String>) {
        cdkBuilder.additionalSlaveSecurityGroups(additionalSlaveSecurityGroups)
      }

      override fun additionalSlaveSecurityGroups(vararg additionalSlaveSecurityGroups: String): Unit
          = additionalSlaveSecurityGroups(additionalSlaveSecurityGroups.toList())

      override fun ec2KeyName(ec2KeyName: String) {
        cdkBuilder.ec2KeyName(ec2KeyName)
      }

      override fun ec2SubnetId(ec2SubnetId: String) {
        cdkBuilder.ec2SubnetId(ec2SubnetId)
      }

      override fun ec2SubnetIds(ec2SubnetIds: List<String>) {
        cdkBuilder.ec2SubnetIds(ec2SubnetIds)
      }

      override fun ec2SubnetIds(vararg ec2SubnetIds: String): Unit =
          ec2SubnetIds(ec2SubnetIds.toList())

      override fun emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup: String) {
        cdkBuilder.emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup)
      }

      override fun emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup: String) {
        cdkBuilder.emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup)
      }

      override fun hadoopVersion(hadoopVersion: String) {
        cdkBuilder.hadoopVersion(hadoopVersion)
      }

      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      override fun instanceFleets(instanceFleets: List<InstanceFleetConfigProperty>) {
        cdkBuilder.instanceFleets(instanceFleets.map(InstanceFleetConfigProperty::unwrap))
      }

      override fun instanceFleets(vararg instanceFleets: InstanceFleetConfigProperty): Unit =
          instanceFleets(instanceFleets.toList())

      override fun instanceGroups(instanceGroups: List<InstanceGroupConfigProperty>) {
        cdkBuilder.instanceGroups(instanceGroups.map(InstanceGroupConfigProperty::unwrap))
      }

      override fun instanceGroups(vararg instanceGroups: InstanceGroupConfigProperty): Unit =
          instanceGroups(instanceGroups.toList())

      override fun masterInstanceType(masterInstanceType: String) {
        cdkBuilder.masterInstanceType(masterInstanceType)
      }

      override fun placement(placement: PlacementTypeProperty) {
        cdkBuilder.placement(placement.let(PlacementTypeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e3b0f389fd006aec3b704b161d2f4aadc8aa927fc43eb4badeb7b51c29ca11f")
      override fun placement(placement: PlacementTypeProperty.Builder.() -> Unit): Unit =
          placement(PlacementTypeProperty(placement))

      override fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String) {
        cdkBuilder.serviceAccessSecurityGroup(serviceAccessSecurityGroup)
      }

      override fun slaveInstanceType(slaveInstanceType: String) {
        cdkBuilder.slaveInstanceType(slaveInstanceType)
      }

      override fun terminationProtected(terminationProtected: Boolean) {
        cdkBuilder.terminationProtected(terminationProtected)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty,
    ) : CdkObject(cdkObject), InstancesConfigProperty {
      override fun additionalMasterSecurityGroups(): List<String> =
          unwrap(this).getAdditionalMasterSecurityGroups() ?: emptyList()

      override fun additionalSlaveSecurityGroups(): List<String> =
          unwrap(this).getAdditionalSlaveSecurityGroups() ?: emptyList()

      override fun ec2KeyName(): String? = unwrap(this).getEc2KeyName()

      override fun ec2SubnetId(): String? = unwrap(this).getEc2SubnetId()

      override fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds() ?: emptyList()

      override fun emrManagedMasterSecurityGroup(): String? =
          unwrap(this).getEmrManagedMasterSecurityGroup()

      override fun emrManagedSlaveSecurityGroup(): String? =
          unwrap(this).getEmrManagedSlaveSecurityGroup()

      override fun hadoopVersion(): String? = unwrap(this).getHadoopVersion()

      override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

      override fun instanceFleets(): List<InstanceFleetConfigProperty> =
          unwrap(this).getInstanceFleets()?.map(InstanceFleetConfigProperty::wrap) ?: emptyList()

      override fun instanceGroups(): List<InstanceGroupConfigProperty> =
          unwrap(this).getInstanceGroups()?.map(InstanceGroupConfigProperty::wrap) ?: emptyList()

      override fun masterInstanceType(): String? = unwrap(this).getMasterInstanceType()

      override fun placement(): PlacementTypeProperty? =
          unwrap(this).getPlacement()?.let(PlacementTypeProperty::wrap)

      override fun serviceAccessSecurityGroup(): String? =
          unwrap(this).getServiceAccessSecurityGroup()

      override fun slaveInstanceType(): String? = unwrap(this).getSlaveInstanceType()

      override fun terminationProtected(): Boolean? = unwrap(this).getTerminationProtected()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstancesConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty):
          InstancesConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstancesConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty
    }
  }

  public enum class InstanceMarket(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket,
  ) {
    ON_DEMAND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket.ON_DEMAND),
    SPOT(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket.SPOT),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket):
          InstanceMarket = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket.ON_DEMAND ->
            InstanceMarket.ON_DEMAND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket.SPOT ->
            InstanceMarket.SPOT
      }

      internal fun unwrap(wrapped: InstanceMarket):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket =
          wrapped.cdkObject
    }
  }

  public interface ScalingTriggerProperty {
    public fun cloudWatchAlarmDefinition(): CloudWatchAlarmDefinitionProperty

    @CdkDslMarker
    public interface Builder {
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c5143f0f368b10f8293c7c19139035f9e5f156e01d3eb4a4af5de4067bfb8bd")
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty.builder()

      override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(CloudWatchAlarmDefinitionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c5143f0f368b10f8293c7c19139035f9e5f156e01d3eb4a4af5de4067bfb8bd")
      override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit):
          Unit =
          cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty(cloudWatchAlarmDefinition))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty,
    ) : CdkObject(cdkObject), ScalingTriggerProperty {
      override fun cloudWatchAlarmDefinition(): CloudWatchAlarmDefinitionProperty =
          unwrap(this).getCloudWatchAlarmDefinition().let(CloudWatchAlarmDefinitionProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingTriggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty):
          ScalingTriggerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingTriggerProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty
    }
  }

  public enum class InstanceRoleType(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType,
  ) {
    MASTER(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.MASTER),
    CORE(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.CORE),
    TASK(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.TASK),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType):
          InstanceRoleType = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.MASTER ->
            InstanceRoleType.MASTER
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.CORE ->
            InstanceRoleType.CORE
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.TASK ->
            InstanceRoleType.TASK
      }

      internal fun unwrap(wrapped: InstanceRoleType):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType =
          wrapped.cdkObject
    }
  }

  public interface InstanceFleetProvisioningSpecificationsProperty {
    public fun onDemandSpecification(): OnDemandProvisioningSpecificationProperty? =
        unwrap(this).getOnDemandSpecification()?.let(OnDemandProvisioningSpecificationProperty::wrap)

    public fun spotSpecification(): SpotProvisioningSpecificationProperty? =
        unwrap(this).getSpotSpecification()?.let(SpotProvisioningSpecificationProperty::wrap)

    @CdkDslMarker
    public interface Builder {
      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cc5c6e36111350c146653cc34d554ba1cb7c4998de9d5153e62997276118c5d")
      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit)

      public fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb28faea62562f38e013d4b232ac177ef55ad2d2f527c7520bd0752b03f014d1")
      public
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.builder()

      override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty) {
        cdkBuilder.onDemandSpecification(onDemandSpecification.let(OnDemandProvisioningSpecificationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cc5c6e36111350c146653cc34d554ba1cb7c4998de9d5153e62997276118c5d")
      override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit =
          onDemandSpecification(OnDemandProvisioningSpecificationProperty(onDemandSpecification))

      override fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty) {
        cdkBuilder.spotSpecification(spotSpecification.let(SpotProvisioningSpecificationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb28faea62562f38e013d4b232ac177ef55ad2d2f527c7520bd0752b03f014d1")
      override
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit = spotSpecification(SpotProvisioningSpecificationProperty(spotSpecification))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty,
    ) : CdkObject(cdkObject), InstanceFleetProvisioningSpecificationsProperty {
      override fun onDemandSpecification(): OnDemandProvisioningSpecificationProperty? =
          unwrap(this).getOnDemandSpecification()?.let(OnDemandProvisioningSpecificationProperty::wrap)

      override fun spotSpecification(): SpotProvisioningSpecificationProperty? =
          unwrap(this).getSpotSpecification()?.let(SpotProvisioningSpecificationProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceFleetProvisioningSpecificationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty):
          InstanceFleetProvisioningSpecificationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceFleetProvisioningSpecificationsProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty
    }
  }

  public interface InstanceFleetConfigProperty {
    public fun instanceFleetType(): InstanceRoleType

    public fun instanceTypeConfigs(): List<InstanceTypeConfigProperty> =
        unwrap(this).getInstanceTypeConfigs()?.map(InstanceTypeConfigProperty::wrap) ?: emptyList()

    public fun launchSpecifications(): InstanceFleetProvisioningSpecificationsProperty? =
        unwrap(this).getLaunchSpecifications()?.let(InstanceFleetProvisioningSpecificationsProperty::wrap)

    public fun name(): String? = unwrap(this).getName()

    public fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

    public fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()

    @CdkDslMarker
    public interface Builder {
      public fun instanceFleetType(instanceFleetType: InstanceRoleType)

      public fun instanceTypeConfigs(instanceTypeConfigs: List<InstanceTypeConfigProperty>)

      public fun instanceTypeConfigs(vararg instanceTypeConfigs: InstanceTypeConfigProperty)

      public
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb2478130551805471ecf26441a7e34a3479fc96116d2c647f7b4de2d1ba04fc")
      public
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun targetOnDemandCapacity(targetOnDemandCapacity: Number)

      public fun targetSpotCapacity(targetSpotCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty.builder()

      override fun instanceFleetType(instanceFleetType: InstanceRoleType) {
        cdkBuilder.instanceFleetType(instanceFleetType.let(InstanceRoleType::unwrap))
      }

      override fun instanceTypeConfigs(instanceTypeConfigs: List<InstanceTypeConfigProperty>) {
        cdkBuilder.instanceTypeConfigs(instanceTypeConfigs.map(InstanceTypeConfigProperty::unwrap))
      }

      override fun instanceTypeConfigs(vararg instanceTypeConfigs: InstanceTypeConfigProperty): Unit
          = instanceTypeConfigs(instanceTypeConfigs.toList())

      override
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty) {
        cdkBuilder.launchSpecifications(launchSpecifications.let(InstanceFleetProvisioningSpecificationsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb2478130551805471ecf26441a7e34a3479fc96116d2c647f7b4de2d1ba04fc")
      override
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit):
          Unit =
          launchSpecifications(InstanceFleetProvisioningSpecificationsProperty(launchSpecifications))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
        cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
      }

      override fun targetSpotCapacity(targetSpotCapacity: Number) {
        cdkBuilder.targetSpotCapacity(targetSpotCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty,
    ) : CdkObject(cdkObject), InstanceFleetConfigProperty {
      override fun instanceFleetType(): InstanceRoleType =
          unwrap(this).getInstanceFleetType().let(InstanceRoleType::wrap)

      override fun instanceTypeConfigs(): List<InstanceTypeConfigProperty> =
          unwrap(this).getInstanceTypeConfigs()?.map(InstanceTypeConfigProperty::wrap) ?:
          emptyList()

      override fun launchSpecifications(): InstanceFleetProvisioningSpecificationsProperty? =
          unwrap(this).getLaunchSpecifications()?.let(InstanceFleetProvisioningSpecificationsProperty::wrap)

      override fun name(): String? = unwrap(this).getName()

      override fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

      override fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceFleetConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty):
          InstanceFleetConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceFleetConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty
    }
  }

  public enum class CloudWatchAlarmStatistic(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic,
  ) {
    SAMPLE_COUNT(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.SAMPLE_COUNT),
    AVERAGE(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.AVERAGE),
    SUM(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.SUM),
    MINIMUM(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.MINIMUM),
    MAXIMUM(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.MAXIMUM),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic):
          CloudWatchAlarmStatistic = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.SAMPLE_COUNT ->
            CloudWatchAlarmStatistic.SAMPLE_COUNT
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.AVERAGE ->
            CloudWatchAlarmStatistic.AVERAGE
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.SUM ->
            CloudWatchAlarmStatistic.SUM
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.MINIMUM ->
            CloudWatchAlarmStatistic.MINIMUM
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.MAXIMUM ->
            CloudWatchAlarmStatistic.MAXIMUM
      }

      internal fun unwrap(wrapped: CloudWatchAlarmStatistic):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic
          = wrapped.cdkObject
    }
  }

  public interface MetricDimensionProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty,
    ) : CdkObject(cdkObject), MetricDimensionProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty):
          MetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty
    }
  }

  public interface AutoScalingPolicyProperty {
    public fun constraints(): ScalingConstraintsProperty

    public fun rules(): List<ScalingRuleProperty>

    @CdkDslMarker
    public interface Builder {
      public fun constraints(constraints: ScalingConstraintsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51fc13e916d8f62d76ddddc327ded07f986aa53a7deb5d169ecc47452ad10bcb")
      public fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit)

      public fun rules(rules: List<ScalingRuleProperty>)

      public fun rules(vararg rules: ScalingRuleProperty)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty.builder()

      override fun constraints(constraints: ScalingConstraintsProperty) {
        cdkBuilder.constraints(constraints.let(ScalingConstraintsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51fc13e916d8f62d76ddddc327ded07f986aa53a7deb5d169ecc47452ad10bcb")
      override fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit): Unit =
          constraints(ScalingConstraintsProperty(constraints))

      override fun rules(rules: List<ScalingRuleProperty>) {
        cdkBuilder.rules(rules.map(ScalingRuleProperty::unwrap))
      }

      override fun rules(vararg rules: ScalingRuleProperty): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty,
    ) : CdkObject(cdkObject), AutoScalingPolicyProperty {
      override fun constraints(): ScalingConstraintsProperty =
          unwrap(this).getConstraints().let(ScalingConstraintsProperty::wrap)

      override fun rules(): List<ScalingRuleProperty> =
          unwrap(this).getRules().map(ScalingRuleProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty):
          AutoScalingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingPolicyProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty
    }
  }

  public enum class OnDemandAllocationStrategy(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandAllocationStrategy,
  ) {
    LOWEST_PRICE(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandAllocationStrategy.LOWEST_PRICE),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandAllocationStrategy):
          OnDemandAllocationStrategy = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandAllocationStrategy.LOWEST_PRICE ->
            OnDemandAllocationStrategy.LOWEST_PRICE
      }

      internal fun unwrap(wrapped: OnDemandAllocationStrategy):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandAllocationStrategy
          = wrapped.cdkObject
    }
  }

  public enum class SpotTimeoutAction(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction,
  ) {
    SWITCH_TO_ON_DEMAND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction.SWITCH_TO_ON_DEMAND),
    TERMINATE_CLUSTER(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction.TERMINATE_CLUSTER),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction):
          SpotTimeoutAction = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction.SWITCH_TO_ON_DEMAND ->
            SpotTimeoutAction.SWITCH_TO_ON_DEMAND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction.TERMINATE_CLUSTER ->
            SpotTimeoutAction.TERMINATE_CLUSTER
      }

      internal fun unwrap(wrapped: SpotTimeoutAction):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction =
          wrapped.cdkObject
    }
  }

  public enum class CloudWatchAlarmComparisonOperator(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator,
  ) {
    GREATER_THAN_OR_EQUAL(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.GREATER_THAN_OR_EQUAL),
    GREATER_THAN(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.GREATER_THAN),
    LESS_THAN(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.LESS_THAN),
    LESS_THAN_OR_EQUAL(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.LESS_THAN_OR_EQUAL),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator):
          CloudWatchAlarmComparisonOperator = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.GREATER_THAN_OR_EQUAL ->
            CloudWatchAlarmComparisonOperator.GREATER_THAN_OR_EQUAL
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.GREATER_THAN ->
            CloudWatchAlarmComparisonOperator.GREATER_THAN
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.LESS_THAN ->
            CloudWatchAlarmComparisonOperator.LESS_THAN
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.LESS_THAN_OR_EQUAL ->
            CloudWatchAlarmComparisonOperator.LESS_THAN_OR_EQUAL
      }

      internal fun unwrap(wrapped: CloudWatchAlarmComparisonOperator):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator
          = wrapped.cdkObject
    }
  }

  public interface SpotProvisioningSpecificationProperty {
    public fun allocationStrategy(): SpotAllocationStrategy? =
        unwrap(this).getAllocationStrategy()?.let(SpotAllocationStrategy::wrap)

    @Deprecated(message = "deprecated in CDK")
    public fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

    public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    public fun timeoutAction(): SpotTimeoutAction

    @Deprecated(message = "deprecated in CDK")
    public fun timeoutDurationMinutes(): Number? = unwrap(this).getTimeoutDurationMinutes()

    @CdkDslMarker
    public interface Builder {
      public fun allocationStrategy(allocationStrategy: SpotAllocationStrategy)

      @Deprecated(message = "deprecated in CDK")
      public fun blockDurationMinutes(blockDurationMinutes: Number)

      public fun timeout(timeout: Duration)

      public fun timeoutAction(timeoutAction: SpotTimeoutAction)

      @Deprecated(message = "deprecated in CDK")
      public fun timeoutDurationMinutes(timeoutDurationMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty.builder()

      override fun allocationStrategy(allocationStrategy: SpotAllocationStrategy) {
        cdkBuilder.allocationStrategy(allocationStrategy.let(SpotAllocationStrategy::unwrap))
      }

      @Deprecated(message = "deprecated in CDK")
      override fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
      }

      override fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout.let(Duration::unwrap))
      }

      override fun timeoutAction(timeoutAction: SpotTimeoutAction) {
        cdkBuilder.timeoutAction(timeoutAction.let(SpotTimeoutAction::unwrap))
      }

      @Deprecated(message = "deprecated in CDK")
      override fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
        cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty,
    ) : CdkObject(cdkObject), SpotProvisioningSpecificationProperty {
      override fun allocationStrategy(): SpotAllocationStrategy? =
          unwrap(this).getAllocationStrategy()?.let(SpotAllocationStrategy::wrap)

      @Deprecated(message = "deprecated in CDK")
      override fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

      override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

      override fun timeoutAction(): SpotTimeoutAction =
          unwrap(this).getTimeoutAction().let(SpotTimeoutAction::wrap)

      @Deprecated(message = "deprecated in CDK")
      override fun timeoutDurationMinutes(): Number? = unwrap(this).getTimeoutDurationMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotProvisioningSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty):
          SpotProvisioningSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotProvisioningSpecificationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty
    }
  }

  public interface OnDemandProvisioningSpecificationProperty {
    public fun allocationStrategy(): OnDemandAllocationStrategy

    @CdkDslMarker
    public interface Builder {
      public fun allocationStrategy(allocationStrategy: OnDemandAllocationStrategy)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty.builder()

      override fun allocationStrategy(allocationStrategy: OnDemandAllocationStrategy) {
        cdkBuilder.allocationStrategy(allocationStrategy.let(OnDemandAllocationStrategy::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty,
    ) : CdkObject(cdkObject), OnDemandProvisioningSpecificationProperty {
      override fun allocationStrategy(): OnDemandAllocationStrategy =
          unwrap(this).getAllocationStrategy().let(OnDemandAllocationStrategy::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OnDemandProvisioningSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty):
          OnDemandProvisioningSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnDemandProvisioningSpecificationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty
    }
  }

  public enum class SpotAllocationStrategy(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy,
  ) {
    CAPACITY_OPTIMIZED(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.CAPACITY_OPTIMIZED),
    PRICE_CAPACITY_OPTIMIZED(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED),
    LOWEST_PRICE(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.LOWEST_PRICE),
    DIVERSIFIED(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.DIVERSIFIED),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy):
          SpotAllocationStrategy = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.CAPACITY_OPTIMIZED ->
            SpotAllocationStrategy.CAPACITY_OPTIMIZED
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED ->
            SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.LOWEST_PRICE ->
            SpotAllocationStrategy.LOWEST_PRICE
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.DIVERSIFIED ->
            SpotAllocationStrategy.DIVERSIFIED
      }

      internal fun unwrap(wrapped: SpotAllocationStrategy):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy
          = wrapped.cdkObject
    }
  }

  public interface PlacementTypeProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun availabilityZone(availabilityZone: String)

      public fun availabilityZones(availabilityZones: List<String>)

      public fun availabilityZones(vararg availabilityZones: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty.builder()

      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      override fun availabilityZones(availabilityZones: List<String>) {
        cdkBuilder.availabilityZones(availabilityZones)
      }

      override fun availabilityZones(vararg availabilityZones: String): Unit =
          availabilityZones(availabilityZones.toList())

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty,
    ) : CdkObject(cdkObject), PlacementTypeProperty {
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty):
          PlacementTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementTypeProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty
    }
  }

  public interface ScriptBootstrapActionConfigProperty {
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    public fun path(): String

    @CdkDslMarker
    public interface Builder {
      public fun args(args: List<String>)

      public fun args(vararg args: String)

      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty.builder()

      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      override fun args(vararg args: String): Unit = args(args.toList())

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty,
    ) : CdkObject(cdkObject), ScriptBootstrapActionConfigProperty {
      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      override fun path(): String = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ScriptBootstrapActionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty):
          ScriptBootstrapActionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScriptBootstrapActionConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty
    }
  }

  public interface ScalingConstraintsProperty {
    public fun maxCapacity(): Number

    public fun minCapacity(): Number

    @CdkDslMarker
    public interface Builder {
      public fun maxCapacity(maxCapacity: Number)

      public fun minCapacity(minCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty.builder()

      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty,
    ) : CdkObject(cdkObject), ScalingConstraintsProperty {
      override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      override fun minCapacity(): Number = unwrap(this).getMinCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty):
          ScalingConstraintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConstraintsProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty
    }
  }

  public interface KerberosAttributesProperty {
    public fun adDomainJoinPassword(): String? = unwrap(this).getAdDomainJoinPassword()

    public fun adDomainJoinUser(): String? = unwrap(this).getAdDomainJoinUser()

    public fun crossRealmTrustPrincipalPassword(): String? =
        unwrap(this).getCrossRealmTrustPrincipalPassword()

    public fun kdcAdminPassword(): String? = unwrap(this).getKdcAdminPassword()

    public fun realm(): String

    @CdkDslMarker
    public interface Builder {
      public fun adDomainJoinPassword(adDomainJoinPassword: String)

      public fun adDomainJoinUser(adDomainJoinUser: String)

      public fun crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword: String)

      public fun kdcAdminPassword(kdcAdminPassword: String)

      public fun realm(realm: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty.builder()

      override fun adDomainJoinPassword(adDomainJoinPassword: String) {
        cdkBuilder.adDomainJoinPassword(adDomainJoinPassword)
      }

      override fun adDomainJoinUser(adDomainJoinUser: String) {
        cdkBuilder.adDomainJoinUser(adDomainJoinUser)
      }

      override fun crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword: String) {
        cdkBuilder.crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword)
      }

      override fun kdcAdminPassword(kdcAdminPassword: String) {
        cdkBuilder.kdcAdminPassword(kdcAdminPassword)
      }

      override fun realm(realm: String) {
        cdkBuilder.realm(realm)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty,
    ) : CdkObject(cdkObject), KerberosAttributesProperty {
      override fun adDomainJoinPassword(): String? = unwrap(this).getAdDomainJoinPassword()

      override fun adDomainJoinUser(): String? = unwrap(this).getAdDomainJoinUser()

      override fun crossRealmTrustPrincipalPassword(): String? =
          unwrap(this).getCrossRealmTrustPrincipalPassword()

      override fun kdcAdminPassword(): String? = unwrap(this).getKdcAdminPassword()

      override fun realm(): String = unwrap(this).getRealm()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KerberosAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty):
          KerberosAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KerberosAttributesProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty
    }
  }

  public interface SimpleScalingPolicyConfigurationProperty {
    public fun adjustmentType(): ScalingAdjustmentType? =
        unwrap(this).getAdjustmentType()?.let(ScalingAdjustmentType::wrap)

    public fun coolDown(): Number? = unwrap(this).getCoolDown()

    public fun scalingAdjustment(): Number

    @CdkDslMarker
    public interface Builder {
      public fun adjustmentType(adjustmentType: ScalingAdjustmentType)

      public fun coolDown(coolDown: Number)

      public fun scalingAdjustment(scalingAdjustment: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.builder()

      override fun adjustmentType(adjustmentType: ScalingAdjustmentType) {
        cdkBuilder.adjustmentType(adjustmentType.let(ScalingAdjustmentType::unwrap))
      }

      override fun coolDown(coolDown: Number) {
        cdkBuilder.coolDown(coolDown)
      }

      override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty,
    ) : CdkObject(cdkObject), SimpleScalingPolicyConfigurationProperty {
      override fun adjustmentType(): ScalingAdjustmentType? =
          unwrap(this).getAdjustmentType()?.let(ScalingAdjustmentType::wrap)

      override fun coolDown(): Number? = unwrap(this).getCoolDown()

      override fun scalingAdjustment(): Number = unwrap(this).getScalingAdjustment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SimpleScalingPolicyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty):
          SimpleScalingPolicyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SimpleScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty
    }
  }

  public interface EbsConfigurationProperty {
    public fun ebsBlockDeviceConfigs(): List<EbsBlockDeviceConfigProperty> =
        unwrap(this).getEbsBlockDeviceConfigs()?.map(EbsBlockDeviceConfigProperty::wrap) ?:
        emptyList()

    public fun ebsOptimized(): Boolean? = unwrap(this).getEbsOptimized()

    @CdkDslMarker
    public interface Builder {
      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<EbsBlockDeviceConfigProperty>)

      public fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: EbsBlockDeviceConfigProperty)

      public fun ebsOptimized(ebsOptimized: Boolean)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty.builder()

      override
          fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<EbsBlockDeviceConfigProperty>) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.map(EbsBlockDeviceConfigProperty::unwrap))
      }

      override fun ebsBlockDeviceConfigs(vararg
          ebsBlockDeviceConfigs: EbsBlockDeviceConfigProperty): Unit =
          ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.toList())

      override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty,
    ) : CdkObject(cdkObject), EbsConfigurationProperty {
      override fun ebsBlockDeviceConfigs(): List<EbsBlockDeviceConfigProperty> =
          unwrap(this).getEbsBlockDeviceConfigs()?.map(EbsBlockDeviceConfigProperty::wrap) ?:
          emptyList()

      override fun ebsOptimized(): Boolean? = unwrap(this).getEbsOptimized()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty):
          EbsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty
    }
  }

  public enum class CloudWatchAlarmUnit(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit,
  ) {
    NONE(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.NONE),
    SECONDS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.SECONDS),
    MICRO_SECONDS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MICRO_SECONDS),
    MILLI_SECONDS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MILLI_SECONDS),
    BYTES(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BYTES),
    KILO_BYTES(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BYTES),
    MEGA_BYTES(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BYTES),
    GIGA_BYTES(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BYTES),
    TERA_BYTES(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BYTES),
    BITS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BITS),
    KILO_BITS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BITS),
    MEGA_BITS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BITS),
    GIGA_BITS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BITS),
    TERA_BITS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BITS),
    PERCENT(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.PERCENT),
    COUNT(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.COUNT),
    BYTES_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BYTES_PER_SECOND),
    KILO_BYTES_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BYTES_PER_SECOND),
    MEGA_BYTES_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BYTES_PER_SECOND),
    GIGA_BYTES_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BYTES_PER_SECOND),
    TERA_BYTES_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BYTES_PER_SECOND),
    BITS_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BITS_PER_SECOND),
    KILO_BITS_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BITS_PER_SECOND),
    MEGA_BITS_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BITS_PER_SECOND),
    GIGA_BITS_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BITS_PER_SECOND),
    TERA_BITS_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BITS_PER_SECOND),
    COUNT_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.COUNT_PER_SECOND),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit):
          CloudWatchAlarmUnit = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.NONE ->
            CloudWatchAlarmUnit.NONE
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.SECONDS ->
            CloudWatchAlarmUnit.SECONDS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MICRO_SECONDS ->
            CloudWatchAlarmUnit.MICRO_SECONDS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MILLI_SECONDS ->
            CloudWatchAlarmUnit.MILLI_SECONDS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BYTES ->
            CloudWatchAlarmUnit.BYTES
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BYTES ->
            CloudWatchAlarmUnit.KILO_BYTES
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BYTES ->
            CloudWatchAlarmUnit.MEGA_BYTES
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BYTES ->
            CloudWatchAlarmUnit.GIGA_BYTES
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BYTES ->
            CloudWatchAlarmUnit.TERA_BYTES
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BITS ->
            CloudWatchAlarmUnit.BITS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BITS ->
            CloudWatchAlarmUnit.KILO_BITS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BITS ->
            CloudWatchAlarmUnit.MEGA_BITS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BITS ->
            CloudWatchAlarmUnit.GIGA_BITS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BITS ->
            CloudWatchAlarmUnit.TERA_BITS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.PERCENT ->
            CloudWatchAlarmUnit.PERCENT
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.COUNT ->
            CloudWatchAlarmUnit.COUNT
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BYTES_PER_SECOND ->
            CloudWatchAlarmUnit.BYTES_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BYTES_PER_SECOND ->
            CloudWatchAlarmUnit.KILO_BYTES_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BYTES_PER_SECOND ->
            CloudWatchAlarmUnit.MEGA_BYTES_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BYTES_PER_SECOND ->
            CloudWatchAlarmUnit.GIGA_BYTES_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BYTES_PER_SECOND ->
            CloudWatchAlarmUnit.TERA_BYTES_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BITS_PER_SECOND ->
            CloudWatchAlarmUnit.BITS_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BITS_PER_SECOND ->
            CloudWatchAlarmUnit.KILO_BITS_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BITS_PER_SECOND ->
            CloudWatchAlarmUnit.MEGA_BITS_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BITS_PER_SECOND ->
            CloudWatchAlarmUnit.GIGA_BITS_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BITS_PER_SECOND ->
            CloudWatchAlarmUnit.TERA_BITS_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.COUNT_PER_SECOND ->
            CloudWatchAlarmUnit.COUNT_PER_SECOND
      }

      internal fun unwrap(wrapped: CloudWatchAlarmUnit):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit =
          wrapped.cdkObject
    }
  }

  public interface ScalingRuleProperty {
    public fun action(): ScalingActionProperty

    public fun description(): String? = unwrap(this).getDescription()

    public fun name(): String

    public fun trigger(): ScalingTriggerProperty

    @CdkDslMarker
    public interface Builder {
      public fun action(action: ScalingActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("419a416e51f605bf57d25fa82dcf2bbcf704147957ee6f675c027e9ec5fe9ad2")
      public fun action(action: ScalingActionProperty.Builder.() -> Unit)

      public fun description(description: String)

      public fun name(name: String)

      public fun trigger(trigger: ScalingTriggerProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5c45c94aca8ef11b0a1bb5a0ef0a77aa1be244839715fcb3ffff379edfdf4aa")
      public fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty.builder()

      override fun action(action: ScalingActionProperty) {
        cdkBuilder.action(action.let(ScalingActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("419a416e51f605bf57d25fa82dcf2bbcf704147957ee6f675c027e9ec5fe9ad2")
      override fun action(action: ScalingActionProperty.Builder.() -> Unit): Unit =
          action(ScalingActionProperty(action))

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun trigger(trigger: ScalingTriggerProperty) {
        cdkBuilder.trigger(trigger.let(ScalingTriggerProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5c45c94aca8ef11b0a1bb5a0ef0a77aa1be244839715fcb3ffff379edfdf4aa")
      override fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit): Unit =
          trigger(ScalingTriggerProperty(trigger))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty,
    ) : CdkObject(cdkObject), ScalingRuleProperty {
      override fun action(): ScalingActionProperty =
          unwrap(this).getAction().let(ScalingActionProperty::wrap)

      override fun description(): String? = unwrap(this).getDescription()

      override fun name(): String = unwrap(this).getName()

      override fun trigger(): ScalingTriggerProperty =
          unwrap(this).getTrigger().let(ScalingTriggerProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty):
          ScalingRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingRuleProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty
    }
  }

  public enum class EmrClusterScaleDownBehavior(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior,
  ) {
    TERMINATE_AT_INSTANCE_HOUR(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior.TERMINATE_AT_INSTANCE_HOUR),
    TERMINATE_AT_TASK_COMPLETION(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior.TERMINATE_AT_TASK_COMPLETION),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior):
          EmrClusterScaleDownBehavior = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior.TERMINATE_AT_INSTANCE_HOUR ->
            EmrClusterScaleDownBehavior.TERMINATE_AT_INSTANCE_HOUR
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior.TERMINATE_AT_TASK_COMPLETION ->
            EmrClusterScaleDownBehavior.TERMINATE_AT_TASK_COMPLETION
      }

      internal fun unwrap(wrapped: EmrClusterScaleDownBehavior):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior
          = wrapped.cdkObject
    }
  }

  public interface ScalingActionProperty {
    public fun market(): InstanceMarket? = unwrap(this).getMarket()?.let(InstanceMarket::wrap)

    public fun simpleScalingPolicyConfiguration(): SimpleScalingPolicyConfigurationProperty

    @CdkDslMarker
    public interface Builder {
      public fun market(market: InstanceMarket)

      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52fa52aefda71e5cc5ed6656af95c8e2fdc117aa5e1fe1d0b00f1070bb4f5c82")
      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty.builder()

      override fun market(market: InstanceMarket) {
        cdkBuilder.market(market.let(InstanceMarket::unwrap))
      }

      override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(SimpleScalingPolicyConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52fa52aefda71e5cc5ed6656af95c8e2fdc117aa5e1fe1d0b00f1070bb4f5c82")
      override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit):
          Unit =
          simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty(simpleScalingPolicyConfiguration))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty,
    ) : CdkObject(cdkObject), ScalingActionProperty {
      override fun market(): InstanceMarket? = unwrap(this).getMarket()?.let(InstanceMarket::wrap)

      override fun simpleScalingPolicyConfiguration(): SimpleScalingPolicyConfigurationProperty =
          unwrap(this).getSimpleScalingPolicyConfiguration().let(SimpleScalingPolicyConfigurationProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty):
          ScalingActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingActionProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty
    }
  }
}
