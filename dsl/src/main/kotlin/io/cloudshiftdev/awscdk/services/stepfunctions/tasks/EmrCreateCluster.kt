package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EmrCreateCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster,
) : TaskStateBase(cdkObject) {
  public open fun autoScalingRole(): IRole = unwrap(this).getAutoScalingRole().let(IRole::wrap)

  public open fun clusterRole(): IRole = unwrap(this).getClusterRole().let(IRole::wrap)

  public open fun serviceRole(): IRole = unwrap(this).getServiceRole().let(IRole::wrap)

  public interface Builder {
    public fun additionalInfo(additionalInfo: String) {
    }

    public fun applications(applications: List<ApplicationConfigProperty>) {
    }

    public fun autoScalingRole(autoScalingRole: IRole) {
    }

    public fun bootstrapActions(bootstrapActions: List<BootstrapActionConfigProperty>) {
    }

    public fun clusterRole(clusterRole: IRole) {
    }

    public fun comment(comment: String) {
    }

    public fun configurations(configurations: List<ConfigurationProperty>) {
    }

    public fun credentials(credentials: Credentials) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb5f460e0e2cfd6af91ce0e7b89d551a99a1db683817e26654ab34ee73268da1")
    public fun credentials(credentials: Credentials.Builder.() -> Unit) {
    }

    public fun customAmiId(customAmiId: String) {
    }

    public fun ebsRootVolumeSize(ebsRootVolumeSize: Size) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
    }

    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    }

    public fun inputPath(inputPath: String) {
    }

    public fun instances(instances: InstancesConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10af92922533ae8a24ffcad71bb2c27c2cd7261090d74dc74f03665583298f1d")
    public fun instances(instances: InstancesConfigProperty.Builder.() -> Unit) {
    }

    public fun integrationPattern(integrationPattern: IntegrationPattern) {
    }

    public fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("009696d119485783fe485fae2584ed39873548c64acbcf4b360c05866bd665ec")
    public
        fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty.Builder.() -> Unit) {
    }

    public fun logUri(logUri: String) {
    }

    public fun name(name: String) {
    }

    public fun outputPath(outputPath: String) {
    }

    public fun releaseLabel(releaseLabel: String) {
    }

    public fun resultPath(resultPath: String) {
    }

    public fun resultSelector(resultSelector: Map<String, Any>) {
    }

    public fun scaleDownBehavior(scaleDownBehavior: EmrClusterScaleDownBehavior) {
    }

    public fun securityConfiguration(securityConfiguration: String) {
    }

    public fun serviceRole(serviceRole: IRole) {
    }

    public fun stateName(stateName: String) {
    }

    public fun stepConcurrencyLevel(stepConcurrencyLevel: Number) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun taskTimeout(taskTimeout: Timeout) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
    }

    public fun visibleToAllUsers(visibleToAllUsers: Boolean) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.Builder.create(scope,
        id)

    public override fun additionalInfo(additionalInfo: String) {
      cdkBuilder.additionalInfo(additionalInfo)
    }

    public override fun applications(applications: List<ApplicationConfigProperty>) {
      cdkBuilder.applications(applications.map(ApplicationConfigProperty::unwrap))
    }

    public override fun autoScalingRole(autoScalingRole: IRole) {
      cdkBuilder.autoScalingRole(autoScalingRole.let(IRole::unwrap))
    }

    public override fun bootstrapActions(bootstrapActions: List<BootstrapActionConfigProperty>) {
      cdkBuilder.bootstrapActions(bootstrapActions.map(BootstrapActionConfigProperty::unwrap))
    }

    public override fun clusterRole(clusterRole: IRole) {
      cdkBuilder.clusterRole(clusterRole.let(IRole::unwrap))
    }

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun configurations(configurations: List<ConfigurationProperty>) {
      cdkBuilder.configurations(configurations.map(ConfigurationProperty::unwrap))
    }

    public override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb5f460e0e2cfd6af91ce0e7b89d551a99a1db683817e26654ab34ee73268da1")
    public override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    public override fun customAmiId(customAmiId: String) {
      cdkBuilder.customAmiId(customAmiId)
    }

    public override fun ebsRootVolumeSize(ebsRootVolumeSize: Size) {
      cdkBuilder.ebsRootVolumeSize(ebsRootVolumeSize.let(Size::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    public override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    public override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    public override fun instances(instances: InstancesConfigProperty) {
      cdkBuilder.instances(instances.let(InstancesConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10af92922533ae8a24ffcad71bb2c27c2cd7261090d74dc74f03665583298f1d")
    public override fun instances(instances: InstancesConfigProperty.Builder.() -> Unit): Unit =
        instances(InstancesConfigProperty(instances))

    public override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    public override fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(KerberosAttributesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("009696d119485783fe485fae2584ed39873548c64acbcf4b360c05866bd665ec")
    public override
        fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty.Builder.() -> Unit):
        Unit = kerberosAttributes(KerberosAttributesProperty(kerberosAttributes))

    public override fun logUri(logUri: String) {
      cdkBuilder.logUri(logUri)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    public override fun releaseLabel(releaseLabel: String) {
      cdkBuilder.releaseLabel(releaseLabel)
    }

    public override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    public override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    public override fun scaleDownBehavior(scaleDownBehavior: EmrClusterScaleDownBehavior) {
      cdkBuilder.scaleDownBehavior(scaleDownBehavior.let(EmrClusterScaleDownBehavior::unwrap))
    }

    public override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    public override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public override fun stepConcurrencyLevel(stepConcurrencyLevel: Number) {
      cdkBuilder.stepConcurrencyLevel(stepConcurrencyLevel)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun visibleToAllUsers(visibleToAllUsers: Boolean) {
      cdkBuilder.visibleToAllUsers(visibleToAllUsers)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun classification(classification: String) {
      }

      public fun configurations(configurations: List<ConfigurationProperty>) {
      }

      public fun properties(properties: Map<String, String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty.builder()

      public override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      public override fun configurations(configurations: List<ConfigurationProperty>) {
        cdkBuilder.configurations(configurations.map(ConfigurationProperty::unwrap))
      }

      public override fun properties(properties: Map<String, String>) {
        cdkBuilder.properties(properties)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty,
    ) : ConfigurationProperty {
      public override fun classification(): String? = unwrap(this).getClassification()

      public override fun configurations(): List<ConfigurationProperty> =
          unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

      public override fun properties(): Map<String, String> = unwrap(this).getProperties() ?:
          emptyMap()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty):
          ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun name(name: String) {
      }

      public fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e46424a100529b23b874f3d97c0f1eb4a4773b914c6ee48bbba8948c430ae044")
      public
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty) {
        cdkBuilder.scriptBootstrapAction(scriptBootstrapAction.let(ScriptBootstrapActionConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e46424a100529b23b874f3d97c0f1eb4a4773b914c6ee48bbba8948c430ae044")
      public override
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty.Builder.() -> Unit):
          Unit = scriptBootstrapAction(ScriptBootstrapActionConfigProperty(scriptBootstrapAction))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty,
    ) : BootstrapActionConfigProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun scriptBootstrapAction(): ScriptBootstrapActionConfigProperty =
          unwrap(this).getScriptBootstrapAction().let(ScriptBootstrapActionConfigProperty::wrap)
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BootstrapActionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty):
          BootstrapActionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BootstrapActionConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6f90ce225f535e721d478357450c309793426146555761af77137d6011275d2")
      public
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit) {
      }

      public fun volumesPerInstance(volumesPerInstance: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty.builder()

      public override fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(VolumeSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6f90ce225f535e721d478357450c309793426146555761af77137d6011275d2")
      public override
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit):
          Unit = volumeSpecification(VolumeSpecificationProperty(volumeSpecification))

      public override fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty,
    ) : EbsBlockDeviceConfigProperty {
      public override fun volumeSpecification(): VolumeSpecificationProperty =
          unwrap(this).getVolumeSpecification().let(VolumeSpecificationProperty::wrap)

      public override fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty):
          EbsBlockDeviceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VolumeSpecificationProperty {
    public fun iops(): Number? = unwrap(this).getIops()

    public fun volumeSize(): Size

    public fun volumeType(): EbsBlockDeviceVolumeType

    public interface Builder {
      public fun iops(iops: Number) {
      }

      public fun volumeSize(volumeSize: Size) {
      }

      public fun volumeType(volumeType: EbsBlockDeviceVolumeType) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty.builder()

      public override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      public override fun volumeSize(volumeSize: Size) {
        cdkBuilder.volumeSize(volumeSize.let(Size::unwrap))
      }

      public override fun volumeType(volumeType: EbsBlockDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType.let(EbsBlockDeviceVolumeType::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty,
    ) : VolumeSpecificationProperty {
      public override fun iops(): Number? = unwrap(this).getIops()

      public override fun volumeSize(): Size = unwrap(this).getVolumeSize().let(Size::wrap)

      public override fun volumeType(): EbsBlockDeviceVolumeType =
          unwrap(this).getVolumeType().let(EbsBlockDeviceVolumeType::wrap)
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty):
          VolumeSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeSpecificationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationConfigProperty {
    public fun additionalInfo(): Map<String, String> = unwrap(this).getAdditionalInfo() ?:
        emptyMap()

    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    public fun name(): String

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun additionalInfo(additionalInfo: Map<String, String>) {
      }

      public fun args(args: List<String>) {
      }

      public fun name(name: String) {
      }

      public fun version(version: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty.builder()

      public override fun additionalInfo(additionalInfo: Map<String, String>) {
        cdkBuilder.additionalInfo(additionalInfo)
      }

      public override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty,
    ) : ApplicationConfigProperty {
      public override fun additionalInfo(): Map<String, String> = unwrap(this).getAdditionalInfo()
          ?: emptyMap()

      public override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      public override fun name(): String = unwrap(this).getName()

      public override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty):
          ApplicationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun bidPrice(bidPrice: String) {
      }

      public fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
      }

      public fun configurations(configurations: List<ConfigurationProperty>) {
      }

      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("133da82e296eb42525c1f9483336b2cf7e322346309773613f5c5555f23f23a1")
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit) {
      }

      public fun instanceType(instanceType: String) {
      }

      public fun weightedCapacity(weightedCapacity: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty.builder()

      public override fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
      }

      public override
          fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
        cdkBuilder.bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice)
      }

      public override fun configurations(configurations: List<ConfigurationProperty>) {
        cdkBuilder.configurations(configurations.map(ConfigurationProperty::unwrap))
      }

      public override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("133da82e296eb42525c1f9483336b2cf7e322346309773613f5c5555f23f23a1")
      public override
          fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit): Unit
          = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

      public override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty,
    ) : InstanceTypeConfigProperty {
      public override fun bidPrice(): String? = unwrap(this).getBidPrice()

      public override fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
          unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

      public override fun configurations(): List<ConfigurationProperty> =
          unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

      public override fun ebsConfiguration(): EbsConfigurationProperty? =
          unwrap(this).getEbsConfiguration()?.let(EbsConfigurationProperty::wrap)

      public override fun instanceType(): String = unwrap(this).getInstanceType()

      public override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty):
          InstanceTypeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceTypeConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac2482af47863b3a51f0bc8765595bbe84c51d68d67eae14b91ffa4868f55b85")
      public
          fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit) {
      }

      public fun bidPrice(bidPrice: String) {
      }

      public fun configurations(configurations: List<ConfigurationProperty>) {
      }

      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("14867309e2488f898214a5b68d3ac2bc85d329c3b00acb0ef46ad1903ac33246")
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit) {
      }

      public fun instanceCount(instanceCount: Number) {
      }

      public fun instanceRole(instanceRole: InstanceRoleType) {
      }

      public fun instanceType(instanceType: String) {
      }

      public fun market(market: InstanceMarket) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty.builder()

      public override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(AutoScalingPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac2482af47863b3a51f0bc8765595bbe84c51d68d67eae14b91ffa4868f55b85")
      public override
          fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit):
          Unit = autoScalingPolicy(AutoScalingPolicyProperty(autoScalingPolicy))

      public override fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
      }

      public override fun configurations(configurations: List<ConfigurationProperty>) {
        cdkBuilder.configurations(configurations.map(ConfigurationProperty::unwrap))
      }

      public override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("14867309e2488f898214a5b68d3ac2bc85d329c3b00acb0ef46ad1903ac33246")
      public override
          fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit): Unit
          = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

      public override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      public override fun instanceRole(instanceRole: InstanceRoleType) {
        cdkBuilder.instanceRole(instanceRole.let(InstanceRoleType::unwrap))
      }

      public override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public override fun market(market: InstanceMarket) {
        cdkBuilder.market(market.let(InstanceMarket::unwrap))
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty,
    ) : InstanceGroupConfigProperty {
      public override fun autoScalingPolicy(): AutoScalingPolicyProperty? =
          unwrap(this).getAutoScalingPolicy()?.let(AutoScalingPolicyProperty::wrap)

      public override fun bidPrice(): String? = unwrap(this).getBidPrice()

      public override fun configurations(): List<ConfigurationProperty> =
          unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

      public override fun ebsConfiguration(): EbsConfigurationProperty? =
          unwrap(this).getEbsConfiguration()?.let(EbsConfigurationProperty::wrap)

      public override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      public override fun instanceRole(): InstanceRoleType =
          unwrap(this).getInstanceRole().let(InstanceRoleType::wrap)

      public override fun instanceType(): String = unwrap(this).getInstanceType()

      public override fun market(): InstanceMarket? =
          unwrap(this).getMarket()?.let(InstanceMarket::wrap)

      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty):
          InstanceGroupConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceGroupConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun comparisonOperator(comparisonOperator: CloudWatchAlarmComparisonOperator) {
      }

      public fun dimensions(dimensions: List<MetricDimensionProperty>) {
      }

      public fun evaluationPeriods(evaluationPeriods: Number) {
      }

      public fun metricName(metricName: String) {
      }

      public fun namespace(namespace: String) {
      }

      public fun period(period: Duration) {
      }

      public fun statistic(statistic: CloudWatchAlarmStatistic) {
      }

      public fun threshold(threshold: Number) {
      }

      public fun unit(unit: CloudWatchAlarmUnit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty.builder()

      public override
          fun comparisonOperator(comparisonOperator: CloudWatchAlarmComparisonOperator) {
        cdkBuilder.comparisonOperator(comparisonOperator.let(CloudWatchAlarmComparisonOperator::unwrap))
      }

      public override fun dimensions(dimensions: List<MetricDimensionProperty>) {
        cdkBuilder.dimensions(dimensions.map(MetricDimensionProperty::unwrap))
      }

      public override fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
      }

      public override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      public override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public override fun period(period: Duration) {
        cdkBuilder.period(period.let(Duration::unwrap))
      }

      public override fun statistic(statistic: CloudWatchAlarmStatistic) {
        cdkBuilder.statistic(statistic.let(CloudWatchAlarmStatistic::unwrap))
      }

      public override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      public override fun unit(unit: CloudWatchAlarmUnit) {
        cdkBuilder.unit(unit.let(CloudWatchAlarmUnit::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty,
    ) : CloudWatchAlarmDefinitionProperty {
      public override fun comparisonOperator(): CloudWatchAlarmComparisonOperator =
          unwrap(this).getComparisonOperator().let(CloudWatchAlarmComparisonOperator::wrap)

      public override fun dimensions(): List<MetricDimensionProperty> =
          unwrap(this).getDimensions()?.map(MetricDimensionProperty::wrap) ?: emptyList()

      public override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

      public override fun metricName(): String = unwrap(this).getMetricName()

      public override fun namespace(): String? = unwrap(this).getNamespace()

      public override fun period(): Duration = unwrap(this).getPeriod().let(Duration::wrap)

      public override fun statistic(): CloudWatchAlarmStatistic? =
          unwrap(this).getStatistic()?.let(CloudWatchAlarmStatistic::wrap)

      public override fun threshold(): Number? = unwrap(this).getThreshold()

      public override fun unit(): CloudWatchAlarmUnit? =
          unwrap(this).getUnit()?.let(CloudWatchAlarmUnit::wrap)
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun additionalMasterSecurityGroups(additionalMasterSecurityGroups: List<String>) {
      }

      public fun additionalSlaveSecurityGroups(additionalSlaveSecurityGroups: List<String>) {
      }

      public fun ec2KeyName(ec2KeyName: String) {
      }

      public fun ec2SubnetId(ec2SubnetId: String) {
      }

      public fun ec2SubnetIds(ec2SubnetIds: List<String>) {
      }

      public fun emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup: String) {
      }

      public fun emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup: String) {
      }

      public fun hadoopVersion(hadoopVersion: String) {
      }

      public fun instanceCount(instanceCount: Number) {
      }

      public fun instanceFleets(instanceFleets: List<InstanceFleetConfigProperty>) {
      }

      public fun instanceGroups(instanceGroups: List<InstanceGroupConfigProperty>) {
      }

      public fun masterInstanceType(masterInstanceType: String) {
      }

      public fun placement(placement: PlacementTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e3b0f389fd006aec3b704b161d2f4aadc8aa927fc43eb4badeb7b51c29ca11f")
      public fun placement(placement: PlacementTypeProperty.Builder.() -> Unit) {
      }

      public fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String) {
      }

      public fun slaveInstanceType(slaveInstanceType: String) {
      }

      public fun terminationProtected(terminationProtected: Boolean) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty.builder()

      public override
          fun additionalMasterSecurityGroups(additionalMasterSecurityGroups: List<String>) {
        cdkBuilder.additionalMasterSecurityGroups(additionalMasterSecurityGroups)
      }

      public override
          fun additionalSlaveSecurityGroups(additionalSlaveSecurityGroups: List<String>) {
        cdkBuilder.additionalSlaveSecurityGroups(additionalSlaveSecurityGroups)
      }

      public override fun ec2KeyName(ec2KeyName: String) {
        cdkBuilder.ec2KeyName(ec2KeyName)
      }

      public override fun ec2SubnetId(ec2SubnetId: String) {
        cdkBuilder.ec2SubnetId(ec2SubnetId)
      }

      public override fun ec2SubnetIds(ec2SubnetIds: List<String>) {
        cdkBuilder.ec2SubnetIds(ec2SubnetIds)
      }

      public override fun emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup: String) {
        cdkBuilder.emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup)
      }

      public override fun emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup: String) {
        cdkBuilder.emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup)
      }

      public override fun hadoopVersion(hadoopVersion: String) {
        cdkBuilder.hadoopVersion(hadoopVersion)
      }

      public override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      public override fun instanceFleets(instanceFleets: List<InstanceFleetConfigProperty>) {
        cdkBuilder.instanceFleets(instanceFleets.map(InstanceFleetConfigProperty::unwrap))
      }

      public override fun instanceGroups(instanceGroups: List<InstanceGroupConfigProperty>) {
        cdkBuilder.instanceGroups(instanceGroups.map(InstanceGroupConfigProperty::unwrap))
      }

      public override fun masterInstanceType(masterInstanceType: String) {
        cdkBuilder.masterInstanceType(masterInstanceType)
      }

      public override fun placement(placement: PlacementTypeProperty) {
        cdkBuilder.placement(placement.let(PlacementTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e3b0f389fd006aec3b704b161d2f4aadc8aa927fc43eb4badeb7b51c29ca11f")
      public override fun placement(placement: PlacementTypeProperty.Builder.() -> Unit): Unit =
          placement(PlacementTypeProperty(placement))

      public override fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String) {
        cdkBuilder.serviceAccessSecurityGroup(serviceAccessSecurityGroup)
      }

      public override fun slaveInstanceType(slaveInstanceType: String) {
        cdkBuilder.slaveInstanceType(slaveInstanceType)
      }

      public override fun terminationProtected(terminationProtected: Boolean) {
        cdkBuilder.terminationProtected(terminationProtected)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty,
    ) : InstancesConfigProperty {
      public override fun additionalMasterSecurityGroups(): List<String> =
          unwrap(this).getAdditionalMasterSecurityGroups() ?: emptyList()

      public override fun additionalSlaveSecurityGroups(): List<String> =
          unwrap(this).getAdditionalSlaveSecurityGroups() ?: emptyList()

      public override fun ec2KeyName(): String? = unwrap(this).getEc2KeyName()

      public override fun ec2SubnetId(): String? = unwrap(this).getEc2SubnetId()

      public override fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds() ?:
          emptyList()

      public override fun emrManagedMasterSecurityGroup(): String? =
          unwrap(this).getEmrManagedMasterSecurityGroup()

      public override fun emrManagedSlaveSecurityGroup(): String? =
          unwrap(this).getEmrManagedSlaveSecurityGroup()

      public override fun hadoopVersion(): String? = unwrap(this).getHadoopVersion()

      public override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

      public override fun instanceFleets(): List<InstanceFleetConfigProperty> =
          unwrap(this).getInstanceFleets()?.map(InstanceFleetConfigProperty::wrap) ?: emptyList()

      public override fun instanceGroups(): List<InstanceGroupConfigProperty> =
          unwrap(this).getInstanceGroups()?.map(InstanceGroupConfigProperty::wrap) ?: emptyList()

      public override fun masterInstanceType(): String? = unwrap(this).getMasterInstanceType()

      public override fun placement(): PlacementTypeProperty? =
          unwrap(this).getPlacement()?.let(PlacementTypeProperty::wrap)

      public override fun serviceAccessSecurityGroup(): String? =
          unwrap(this).getServiceAccessSecurityGroup()

      public override fun slaveInstanceType(): String? = unwrap(this).getSlaveInstanceType()

      public override fun terminationProtected(): Boolean? = unwrap(this).getTerminationProtected()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstancesConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty):
          InstancesConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstancesConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c5143f0f368b10f8293c7c19139035f9e5f156e01d3eb4a4af5de4067bfb8bd")
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty.builder()

      public override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(CloudWatchAlarmDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c5143f0f368b10f8293c7c19139035f9e5f156e01d3eb4a4af5de4067bfb8bd")
      public override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit):
          Unit =
          cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty(cloudWatchAlarmDefinition))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty,
    ) : ScalingTriggerProperty {
      public override fun cloudWatchAlarmDefinition(): CloudWatchAlarmDefinitionProperty =
          unwrap(this).getCloudWatchAlarmDefinition().let(CloudWatchAlarmDefinitionProperty::wrap)
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingTriggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty):
          ScalingTriggerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingTriggerProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cc5c6e36111350c146653cc34d554ba1cb7c4998de9d5153e62997276118c5d")
      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit) {
      }

      public fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb28faea62562f38e013d4b232ac177ef55ad2d2f527c7520bd0752b03f014d1")
      public
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.builder()

      public override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty) {
        cdkBuilder.onDemandSpecification(onDemandSpecification.let(OnDemandProvisioningSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cc5c6e36111350c146653cc34d554ba1cb7c4998de9d5153e62997276118c5d")
      public override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit =
          onDemandSpecification(OnDemandProvisioningSpecificationProperty(onDemandSpecification))

      public override
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty) {
        cdkBuilder.spotSpecification(spotSpecification.let(SpotProvisioningSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb28faea62562f38e013d4b232ac177ef55ad2d2f527c7520bd0752b03f014d1")
      public override
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit = spotSpecification(SpotProvisioningSpecificationProperty(spotSpecification))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty,
    ) : InstanceFleetProvisioningSpecificationsProperty {
      public override fun onDemandSpecification(): OnDemandProvisioningSpecificationProperty? =
          unwrap(this).getOnDemandSpecification()?.let(OnDemandProvisioningSpecificationProperty::wrap)

      public override fun spotSpecification(): SpotProvisioningSpecificationProperty? =
          unwrap(this).getSpotSpecification()?.let(SpotProvisioningSpecificationProperty::wrap)
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun instanceFleetType(instanceFleetType: InstanceRoleType) {
      }

      public fun instanceTypeConfigs(instanceTypeConfigs: List<InstanceTypeConfigProperty>) {
      }

      public
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb2478130551805471ecf26441a7e34a3479fc96116d2c647f7b4de2d1ba04fc")
      public
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }

      public fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
      }

      public fun targetSpotCapacity(targetSpotCapacity: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty.builder()

      public override fun instanceFleetType(instanceFleetType: InstanceRoleType) {
        cdkBuilder.instanceFleetType(instanceFleetType.let(InstanceRoleType::unwrap))
      }

      public override
          fun instanceTypeConfigs(instanceTypeConfigs: List<InstanceTypeConfigProperty>) {
        cdkBuilder.instanceTypeConfigs(instanceTypeConfigs.map(InstanceTypeConfigProperty::unwrap))
      }

      public override
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty) {
        cdkBuilder.launchSpecifications(launchSpecifications.let(InstanceFleetProvisioningSpecificationsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb2478130551805471ecf26441a7e34a3479fc96116d2c647f7b4de2d1ba04fc")
      public override
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit):
          Unit =
          launchSpecifications(InstanceFleetProvisioningSpecificationsProperty(launchSpecifications))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
        cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
      }

      public override fun targetSpotCapacity(targetSpotCapacity: Number) {
        cdkBuilder.targetSpotCapacity(targetSpotCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty,
    ) : InstanceFleetConfigProperty {
      public override fun instanceFleetType(): InstanceRoleType =
          unwrap(this).getInstanceFleetType().let(InstanceRoleType::wrap)

      public override fun instanceTypeConfigs(): List<InstanceTypeConfigProperty> =
          unwrap(this).getInstanceTypeConfigs()?.map(InstanceTypeConfigProperty::wrap) ?:
          emptyList()

      public override fun launchSpecifications(): InstanceFleetProvisioningSpecificationsProperty? =
          unwrap(this).getLaunchSpecifications()?.let(InstanceFleetProvisioningSpecificationsProperty::wrap)

      public override fun name(): String? = unwrap(this).getName()

      public override fun targetOnDemandCapacity(): Number? =
          unwrap(this).getTargetOnDemandCapacity()

      public override fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceFleetConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty):
          InstanceFleetConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceFleetConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty,
    ) : MetricDimensionProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty):
          MetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AutoScalingPolicyProperty {
    public fun constraints(): ScalingConstraintsProperty

    public fun rules(): List<ScalingRuleProperty>

    public interface Builder {
      public fun constraints(constraints: ScalingConstraintsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51fc13e916d8f62d76ddddc327ded07f986aa53a7deb5d169ecc47452ad10bcb")
      public fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit) {
      }

      public fun rules(rules: List<ScalingRuleProperty>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty.builder()

      public override fun constraints(constraints: ScalingConstraintsProperty) {
        cdkBuilder.constraints(constraints.let(ScalingConstraintsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51fc13e916d8f62d76ddddc327ded07f986aa53a7deb5d169ecc47452ad10bcb")
      public override fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit):
          Unit = constraints(ScalingConstraintsProperty(constraints))

      public override fun rules(rules: List<ScalingRuleProperty>) {
        cdkBuilder.rules(rules.map(ScalingRuleProperty::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty,
    ) : AutoScalingPolicyProperty {
      public override fun constraints(): ScalingConstraintsProperty =
          unwrap(this).getConstraints().let(ScalingConstraintsProperty::wrap)

      public override fun rules(): List<ScalingRuleProperty> =
          unwrap(this).getRules().map(ScalingRuleProperty::wrap)
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty):
          AutoScalingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingPolicyProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun allocationStrategy(allocationStrategy: SpotAllocationStrategy) {
      }

      @Deprecated(message = "deprecated in CDK")
      public fun blockDurationMinutes(blockDurationMinutes: Number) {
      }

      public fun timeout(timeout: Duration) {
      }

      public fun timeoutAction(timeoutAction: SpotTimeoutAction) {
      }

      @Deprecated(message = "deprecated in CDK")
      public fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty.builder()

      public override fun allocationStrategy(allocationStrategy: SpotAllocationStrategy) {
        cdkBuilder.allocationStrategy(allocationStrategy.let(SpotAllocationStrategy::unwrap))
      }

      @Deprecated(message = "deprecated in CDK")
      public override fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
      }

      public override fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout.let(Duration::unwrap))
      }

      public override fun timeoutAction(timeoutAction: SpotTimeoutAction) {
        cdkBuilder.timeoutAction(timeoutAction.let(SpotTimeoutAction::unwrap))
      }

      @Deprecated(message = "deprecated in CDK")
      public override fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
        cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty,
    ) : SpotProvisioningSpecificationProperty {
      public override fun allocationStrategy(): SpotAllocationStrategy? =
          unwrap(this).getAllocationStrategy()?.let(SpotAllocationStrategy::wrap)

      @Deprecated(message = "deprecated in CDK")
      public override fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

      public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

      public override fun timeoutAction(): SpotTimeoutAction =
          unwrap(this).getTimeoutAction().let(SpotTimeoutAction::wrap)

      @Deprecated(message = "deprecated in CDK")
      public override fun timeoutDurationMinutes(): Number? =
          unwrap(this).getTimeoutDurationMinutes()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OnDemandProvisioningSpecificationProperty {
    public fun allocationStrategy(): OnDemandAllocationStrategy

    public interface Builder {
      public fun allocationStrategy(allocationStrategy: OnDemandAllocationStrategy) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty.builder()

      public override fun allocationStrategy(allocationStrategy: OnDemandAllocationStrategy) {
        cdkBuilder.allocationStrategy(allocationStrategy.let(OnDemandAllocationStrategy::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty,
    ) : OnDemandProvisioningSpecificationProperty {
      public override fun allocationStrategy(): OnDemandAllocationStrategy =
          unwrap(this).getAllocationStrategy().let(OnDemandAllocationStrategy::wrap)
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun availabilityZone(availabilityZone: String) {
      }

      public fun availabilityZones(availabilityZones: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty.builder()

      public override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      public override fun availabilityZones(availabilityZones: List<String>) {
        cdkBuilder.availabilityZones(availabilityZones)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty,
    ) : PlacementTypeProperty {
      public override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      public override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty):
          PlacementTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementTypeProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScriptBootstrapActionConfigProperty {
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    public fun path(): String

    public interface Builder {
      public fun args(args: List<String>) {
      }

      public fun path(path: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty.builder()

      public override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      public override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty,
    ) : ScriptBootstrapActionConfigProperty {
      public override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      public override fun path(): String = unwrap(this).getPath()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScalingConstraintsProperty {
    public fun maxCapacity(): Number

    public fun minCapacity(): Number

    public interface Builder {
      public fun maxCapacity(maxCapacity: Number) {
      }

      public fun minCapacity(minCapacity: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty.builder()

      public override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      public override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty,
    ) : ScalingConstraintsProperty {
      public override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      public override fun minCapacity(): Number = unwrap(this).getMinCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty):
          ScalingConstraintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConstraintsProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KerberosAttributesProperty {
    public fun adDomainJoinPassword(): String? = unwrap(this).getAdDomainJoinPassword()

    public fun adDomainJoinUser(): String? = unwrap(this).getAdDomainJoinUser()

    public fun crossRealmTrustPrincipalPassword(): String? =
        unwrap(this).getCrossRealmTrustPrincipalPassword()

    public fun kdcAdminPassword(): String? = unwrap(this).getKdcAdminPassword()

    public fun realm(): String

    public interface Builder {
      public fun adDomainJoinPassword(adDomainJoinPassword: String) {
      }

      public fun adDomainJoinUser(adDomainJoinUser: String) {
      }

      public fun crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword: String) {
      }

      public fun kdcAdminPassword(kdcAdminPassword: String) {
      }

      public fun realm(realm: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty.builder()

      public override fun adDomainJoinPassword(adDomainJoinPassword: String) {
        cdkBuilder.adDomainJoinPassword(adDomainJoinPassword)
      }

      public override fun adDomainJoinUser(adDomainJoinUser: String) {
        cdkBuilder.adDomainJoinUser(adDomainJoinUser)
      }

      public override
          fun crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword: String) {
        cdkBuilder.crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword)
      }

      public override fun kdcAdminPassword(kdcAdminPassword: String) {
        cdkBuilder.kdcAdminPassword(kdcAdminPassword)
      }

      public override fun realm(realm: String) {
        cdkBuilder.realm(realm)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty,
    ) : KerberosAttributesProperty {
      public override fun adDomainJoinPassword(): String? = unwrap(this).getAdDomainJoinPassword()

      public override fun adDomainJoinUser(): String? = unwrap(this).getAdDomainJoinUser()

      public override fun crossRealmTrustPrincipalPassword(): String? =
          unwrap(this).getCrossRealmTrustPrincipalPassword()

      public override fun kdcAdminPassword(): String? = unwrap(this).getKdcAdminPassword()

      public override fun realm(): String = unwrap(this).getRealm()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KerberosAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty):
          KerberosAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KerberosAttributesProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SimpleScalingPolicyConfigurationProperty {
    public fun adjustmentType(): ScalingAdjustmentType? =
        unwrap(this).getAdjustmentType()?.let(ScalingAdjustmentType::wrap)

    public fun coolDown(): Number? = unwrap(this).getCoolDown()

    public fun scalingAdjustment(): Number

    public interface Builder {
      public fun adjustmentType(adjustmentType: ScalingAdjustmentType) {
      }

      public fun coolDown(coolDown: Number) {
      }

      public fun scalingAdjustment(scalingAdjustment: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.builder()

      public override fun adjustmentType(adjustmentType: ScalingAdjustmentType) {
        cdkBuilder.adjustmentType(adjustmentType.let(ScalingAdjustmentType::unwrap))
      }

      public override fun coolDown(coolDown: Number) {
        cdkBuilder.coolDown(coolDown)
      }

      public override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty,
    ) : SimpleScalingPolicyConfigurationProperty {
      public override fun adjustmentType(): ScalingAdjustmentType? =
          unwrap(this).getAdjustmentType()?.let(ScalingAdjustmentType::wrap)

      public override fun coolDown(): Number? = unwrap(this).getCoolDown()

      public override fun scalingAdjustment(): Number = unwrap(this).getScalingAdjustment()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EbsConfigurationProperty {
    public fun ebsBlockDeviceConfigs(): List<EbsBlockDeviceConfigProperty> =
        unwrap(this).getEbsBlockDeviceConfigs()?.map(EbsBlockDeviceConfigProperty::wrap) ?:
        emptyList()

    public fun ebsOptimized(): Boolean? = unwrap(this).getEbsOptimized()

    public interface Builder {
      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<EbsBlockDeviceConfigProperty>) {
      }

      public fun ebsOptimized(ebsOptimized: Boolean) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty.builder()

      public override
          fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<EbsBlockDeviceConfigProperty>) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.map(EbsBlockDeviceConfigProperty::unwrap))
      }

      public override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty,
    ) : EbsConfigurationProperty {
      public override fun ebsBlockDeviceConfigs(): List<EbsBlockDeviceConfigProperty> =
          unwrap(this).getEbsBlockDeviceConfigs()?.map(EbsBlockDeviceConfigProperty::wrap) ?:
          emptyList()

      public override fun ebsOptimized(): Boolean? = unwrap(this).getEbsOptimized()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EbsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty):
          EbsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun action(action: ScalingActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("419a416e51f605bf57d25fa82dcf2bbcf704147957ee6f675c027e9ec5fe9ad2")
      public fun action(action: ScalingActionProperty.Builder.() -> Unit) {
      }

      public fun description(description: String) {
      }

      public fun name(name: String) {
      }

      public fun trigger(trigger: ScalingTriggerProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5c45c94aca8ef11b0a1bb5a0ef0a77aa1be244839715fcb3ffff379edfdf4aa")
      public fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty.builder()

      public override fun action(action: ScalingActionProperty) {
        cdkBuilder.action(action.let(ScalingActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("419a416e51f605bf57d25fa82dcf2bbcf704147957ee6f675c027e9ec5fe9ad2")
      public override fun action(action: ScalingActionProperty.Builder.() -> Unit): Unit =
          action(ScalingActionProperty(action))

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun trigger(trigger: ScalingTriggerProperty) {
        cdkBuilder.trigger(trigger.let(ScalingTriggerProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5c45c94aca8ef11b0a1bb5a0ef0a77aa1be244839715fcb3ffff379edfdf4aa")
      public override fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit): Unit =
          trigger(ScalingTriggerProperty(trigger))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty,
    ) : ScalingRuleProperty {
      public override fun action(): ScalingActionProperty =
          unwrap(this).getAction().let(ScalingActionProperty::wrap)

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun name(): String = unwrap(this).getName()

      public override fun trigger(): ScalingTriggerProperty =
          unwrap(this).getTrigger().let(ScalingTriggerProperty::wrap)
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty):
          ScalingRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingRuleProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty =
          (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun market(market: InstanceMarket) {
      }

      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52fa52aefda71e5cc5ed6656af95c8e2fdc117aa5e1fe1d0b00f1070bb4f5c82")
      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty.builder()

      public override fun market(market: InstanceMarket) {
        cdkBuilder.market(market.let(InstanceMarket::unwrap))
      }

      public override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(SimpleScalingPolicyConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52fa52aefda71e5cc5ed6656af95c8e2fdc117aa5e1fe1d0b00f1070bb4f5c82")
      public override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit):
          Unit =
          simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty(simpleScalingPolicyConfiguration))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty,
    ) : ScalingActionProperty {
      public override fun market(): InstanceMarket? =
          unwrap(this).getMarket()?.let(InstanceMarket::wrap)

      public override fun simpleScalingPolicyConfiguration():
          SimpleScalingPolicyConfigurationProperty =
          unwrap(this).getSimpleScalingPolicyConfiguration().let(SimpleScalingPolicyConfigurationProperty::wrap)
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty):
          ScalingActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingActionProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
