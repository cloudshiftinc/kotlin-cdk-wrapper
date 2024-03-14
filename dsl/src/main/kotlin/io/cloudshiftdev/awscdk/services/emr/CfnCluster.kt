package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.emr.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun additionalInfo(): Any? = unwrap(this).getAdditionalInfo()

  public open fun additionalInfo(`value`: Any) {
    unwrap(this).setAdditionalInfo(`value`)
  }

  public open fun applications(): Any? = unwrap(this).getApplications()

  public open fun applications(`value`: IResolvable) {
    unwrap(this).setApplications(`value`.let(IResolvable::unwrap))
  }

  public open fun applications(__idx_ac66f0: List<Any>) {
    unwrap(this).setApplications(__idx_ac66f0)
  }

  public open fun applications(vararg __idx_ac66f0: Any): Unit = applications(__idx_ac66f0.toList())

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrMasterPublicDns(): String = unwrap(this).getAttrMasterPublicDns()

  public open fun autoScalingRole(): String? = unwrap(this).getAutoScalingRole()

  public open fun autoScalingRole(`value`: String) {
    unwrap(this).setAutoScalingRole(`value`)
  }

  public open fun autoTerminationPolicy(): Any? = unwrap(this).getAutoTerminationPolicy()

  public open fun autoTerminationPolicy(`value`: IResolvable) {
    unwrap(this).setAutoTerminationPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun autoTerminationPolicy(`value`: AutoTerminationPolicyProperty) {
    unwrap(this).setAutoTerminationPolicy(`value`.let(AutoTerminationPolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2aaccf20f9ad05b9e2a9b80c53a4e38b8470cf554bcd7d844f3217feba9c542")
  public open fun autoTerminationPolicy(`value`: AutoTerminationPolicyProperty.Builder.() -> Unit):
      Unit = autoTerminationPolicy(AutoTerminationPolicyProperty(`value`))

  public open fun bootstrapActions(): Any? = unwrap(this).getBootstrapActions()

  public open fun bootstrapActions(`value`: IResolvable) {
    unwrap(this).setBootstrapActions(`value`.let(IResolvable::unwrap))
  }

  public open fun bootstrapActions(__idx_ac66f0: List<Any>) {
    unwrap(this).setBootstrapActions(__idx_ac66f0)
  }

  public open fun bootstrapActions(vararg __idx_ac66f0: Any): Unit =
      bootstrapActions(__idx_ac66f0.toList())

  public open fun configurations(): Any? = unwrap(this).getConfigurations()

  public open fun configurations(`value`: IResolvable) {
    unwrap(this).setConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun configurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setConfigurations(__idx_ac66f0)
  }

  public open fun configurations(vararg __idx_ac66f0: Any): Unit =
      configurations(__idx_ac66f0.toList())

  public open fun customAmiId(): String? = unwrap(this).getCustomAmiId()

  public open fun customAmiId(`value`: String) {
    unwrap(this).setCustomAmiId(`value`)
  }

  public open fun ebsRootVolumeIops(): Number? = unwrap(this).getEbsRootVolumeIops()

  public open fun ebsRootVolumeIops(`value`: Number) {
    unwrap(this).setEbsRootVolumeIops(`value`)
  }

  public open fun ebsRootVolumeSize(): Number? = unwrap(this).getEbsRootVolumeSize()

  public open fun ebsRootVolumeSize(`value`: Number) {
    unwrap(this).setEbsRootVolumeSize(`value`)
  }

  public open fun ebsRootVolumeThroughput(): Number? = unwrap(this).getEbsRootVolumeThroughput()

  public open fun ebsRootVolumeThroughput(`value`: Number) {
    unwrap(this).setEbsRootVolumeThroughput(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instances(): Any = unwrap(this).getInstances()

  public open fun instances(`value`: IResolvable) {
    unwrap(this).setInstances(`value`.let(IResolvable::unwrap))
  }

  public open fun instances(`value`: JobFlowInstancesConfigProperty) {
    unwrap(this).setInstances(`value`.let(JobFlowInstancesConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d0f4e6dc3e46a777c8b6829fa11cec773997a671e9f27a800bfb577830b7a332")
  public open fun instances(`value`: JobFlowInstancesConfigProperty.Builder.() -> Unit): Unit =
      instances(JobFlowInstancesConfigProperty(`value`))

  public open fun jobFlowRole(): String = unwrap(this).getJobFlowRole()

  public open fun jobFlowRole(`value`: String) {
    unwrap(this).setJobFlowRole(`value`)
  }

  public open fun kerberosAttributes(): Any? = unwrap(this).getKerberosAttributes()

  public open fun kerberosAttributes(`value`: IResolvable) {
    unwrap(this).setKerberosAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun kerberosAttributes(`value`: KerberosAttributesProperty) {
    unwrap(this).setKerberosAttributes(`value`.let(KerberosAttributesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("03f96896a39377f5bddf0b270de86a9d9692a4633e799e8368efcc0bd5aaa284")
  public open fun kerberosAttributes(`value`: KerberosAttributesProperty.Builder.() -> Unit): Unit =
      kerberosAttributes(KerberosAttributesProperty(`value`))

  public open fun logEncryptionKmsKeyId(): String? = unwrap(this).getLogEncryptionKmsKeyId()

  public open fun logEncryptionKmsKeyId(`value`: String) {
    unwrap(this).setLogEncryptionKmsKeyId(`value`)
  }

  public open fun logUri(): String? = unwrap(this).getLogUri()

  public open fun logUri(`value`: String) {
    unwrap(this).setLogUri(`value`)
  }

  public open fun managedScalingPolicy(): Any? = unwrap(this).getManagedScalingPolicy()

  public open fun managedScalingPolicy(`value`: IResolvable) {
    unwrap(this).setManagedScalingPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun managedScalingPolicy(`value`: ManagedScalingPolicyProperty) {
    unwrap(this).setManagedScalingPolicy(`value`.let(ManagedScalingPolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("65ae1f8d959b2610491675c00700c62b7f9b19262c91a1920f4f96b6f1c62d7e")
  public open fun managedScalingPolicy(`value`: ManagedScalingPolicyProperty.Builder.() -> Unit):
      Unit = managedScalingPolicy(ManagedScalingPolicyProperty(`value`))

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun osReleaseLabel(): String? = unwrap(this).getOsReleaseLabel()

  public open fun osReleaseLabel(`value`: String) {
    unwrap(this).setOsReleaseLabel(`value`)
  }

  public open fun placementGroupConfigs(): Any? = unwrap(this).getPlacementGroupConfigs()

  public open fun placementGroupConfigs(`value`: IResolvable) {
    unwrap(this).setPlacementGroupConfigs(`value`.let(IResolvable::unwrap))
  }

  public open fun placementGroupConfigs(__idx_ac66f0: List<Any>) {
    unwrap(this).setPlacementGroupConfigs(__idx_ac66f0)
  }

  public open fun placementGroupConfigs(vararg __idx_ac66f0: Any): Unit =
      placementGroupConfigs(__idx_ac66f0.toList())

  public open fun releaseLabel(): String? = unwrap(this).getReleaseLabel()

  public open fun releaseLabel(`value`: String) {
    unwrap(this).setReleaseLabel(`value`)
  }

  public open fun scaleDownBehavior(): String? = unwrap(this).getScaleDownBehavior()

  public open fun scaleDownBehavior(`value`: String) {
    unwrap(this).setScaleDownBehavior(`value`)
  }

  public open fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  public open fun securityConfiguration(`value`: String) {
    unwrap(this).setSecurityConfiguration(`value`)
  }

  public open fun serviceRole(): String = unwrap(this).getServiceRole()

  public open fun serviceRole(`value`: String) {
    unwrap(this).setServiceRole(`value`)
  }

  public open fun stepConcurrencyLevel(): Number? = unwrap(this).getStepConcurrencyLevel()

  public open fun stepConcurrencyLevel(`value`: Number) {
    unwrap(this).setStepConcurrencyLevel(`value`)
  }

  public open fun steps(): Any? = unwrap(this).getSteps()

  public open fun steps(`value`: IResolvable) {
    unwrap(this).setSteps(`value`.let(IResolvable::unwrap))
  }

  public open fun steps(__idx_ac66f0: List<Any>) {
    unwrap(this).setSteps(__idx_ac66f0)
  }

  public open fun steps(vararg __idx_ac66f0: Any): Unit = steps(__idx_ac66f0.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun visibleToAllUsers(): Any? = unwrap(this).getVisibleToAllUsers()

  public open fun visibleToAllUsers(`value`: Boolean) {
    unwrap(this).setVisibleToAllUsers(`value`)
  }

  public open fun visibleToAllUsers(`value`: IResolvable) {
    unwrap(this).setVisibleToAllUsers(`value`.let(IResolvable::unwrap))
  }

  public interface Builder {
    public fun additionalInfo(additionalInfo: Any)

    public fun applications(applications: IResolvable)

    public fun applications(applications: List<Any>)

    public fun applications(vararg applications: Any)

    public fun autoScalingRole(autoScalingRole: String)

    public fun autoTerminationPolicy(autoTerminationPolicy: IResolvable)

    public fun autoTerminationPolicy(autoTerminationPolicy: AutoTerminationPolicyProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04bf042f7c2a440d931875f8b70e08227df842d1d87d013acf0317b48810b609")
    public
        fun autoTerminationPolicy(autoTerminationPolicy: AutoTerminationPolicyProperty.Builder.() -> Unit)

    public fun bootstrapActions(bootstrapActions: IResolvable)

    public fun bootstrapActions(bootstrapActions: List<Any>)

    public fun bootstrapActions(vararg bootstrapActions: Any)

    public fun configurations(configurations: IResolvable)

    public fun configurations(configurations: List<Any>)

    public fun configurations(vararg configurations: Any)

    public fun customAmiId(customAmiId: String)

    public fun ebsRootVolumeIops(ebsRootVolumeIops: Number)

    public fun ebsRootVolumeSize(ebsRootVolumeSize: Number)

    public fun ebsRootVolumeThroughput(ebsRootVolumeThroughput: Number)

    public fun instances(instances: IResolvable)

    public fun instances(instances: JobFlowInstancesConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4392db05069307858968e7f25c0aed0db99baf1275502c31f16ff933fb598c4e")
    public fun instances(instances: JobFlowInstancesConfigProperty.Builder.() -> Unit)

    public fun jobFlowRole(jobFlowRole: String)

    public fun kerberosAttributes(kerberosAttributes: IResolvable)

    public fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b758ccdadfcc3ccd12852a4ab8d146fec24ec216c503ffa7e97e5e01a97a1000")
    public fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty.Builder.() -> Unit)

    public fun logEncryptionKmsKeyId(logEncryptionKmsKeyId: String)

    public fun logUri(logUri: String)

    public fun managedScalingPolicy(managedScalingPolicy: IResolvable)

    public fun managedScalingPolicy(managedScalingPolicy: ManagedScalingPolicyProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fed765ea5d1af1c7bea77dffebc7688273bed497485e9e69d926f3f3888644a")
    public
        fun managedScalingPolicy(managedScalingPolicy: ManagedScalingPolicyProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun osReleaseLabel(osReleaseLabel: String)

    public fun placementGroupConfigs(placementGroupConfigs: IResolvable)

    public fun placementGroupConfigs(placementGroupConfigs: List<Any>)

    public fun placementGroupConfigs(vararg placementGroupConfigs: Any)

    public fun releaseLabel(releaseLabel: String)

    public fun scaleDownBehavior(scaleDownBehavior: String)

    public fun securityConfiguration(securityConfiguration: String)

    public fun serviceRole(serviceRole: String)

    public fun stepConcurrencyLevel(stepConcurrencyLevel: Number)

    public fun steps(steps: IResolvable)

    public fun steps(steps: List<Any>)

    public fun steps(vararg steps: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun visibleToAllUsers(visibleToAllUsers: Boolean)

    public fun visibleToAllUsers(visibleToAllUsers: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnCluster.Builder =
        software.amazon.awscdk.services.emr.CfnCluster.Builder.create(scope, id)

    override fun additionalInfo(additionalInfo: Any) {
      cdkBuilder.additionalInfo(additionalInfo)
    }

    override fun applications(applications: IResolvable) {
      cdkBuilder.applications(applications.let(IResolvable::unwrap))
    }

    override fun applications(applications: List<Any>) {
      cdkBuilder.applications(applications)
    }

    override fun applications(vararg applications: Any): Unit = applications(applications.toList())

    override fun autoScalingRole(autoScalingRole: String) {
      cdkBuilder.autoScalingRole(autoScalingRole)
    }

    override fun autoTerminationPolicy(autoTerminationPolicy: IResolvable) {
      cdkBuilder.autoTerminationPolicy(autoTerminationPolicy.let(IResolvable::unwrap))
    }

    override fun autoTerminationPolicy(autoTerminationPolicy: AutoTerminationPolicyProperty) {
      cdkBuilder.autoTerminationPolicy(autoTerminationPolicy.let(AutoTerminationPolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04bf042f7c2a440d931875f8b70e08227df842d1d87d013acf0317b48810b609")
    override
        fun autoTerminationPolicy(autoTerminationPolicy: AutoTerminationPolicyProperty.Builder.() -> Unit):
        Unit = autoTerminationPolicy(AutoTerminationPolicyProperty(autoTerminationPolicy))

    override fun bootstrapActions(bootstrapActions: IResolvable) {
      cdkBuilder.bootstrapActions(bootstrapActions.let(IResolvable::unwrap))
    }

    override fun bootstrapActions(bootstrapActions: List<Any>) {
      cdkBuilder.bootstrapActions(bootstrapActions)
    }

    override fun bootstrapActions(vararg bootstrapActions: Any): Unit =
        bootstrapActions(bootstrapActions.toList())

    override fun configurations(configurations: IResolvable) {
      cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
    }

    override fun configurations(configurations: List<Any>) {
      cdkBuilder.configurations(configurations)
    }

    override fun configurations(vararg configurations: Any): Unit =
        configurations(configurations.toList())

    override fun customAmiId(customAmiId: String) {
      cdkBuilder.customAmiId(customAmiId)
    }

    override fun ebsRootVolumeIops(ebsRootVolumeIops: Number) {
      cdkBuilder.ebsRootVolumeIops(ebsRootVolumeIops)
    }

    override fun ebsRootVolumeSize(ebsRootVolumeSize: Number) {
      cdkBuilder.ebsRootVolumeSize(ebsRootVolumeSize)
    }

    override fun ebsRootVolumeThroughput(ebsRootVolumeThroughput: Number) {
      cdkBuilder.ebsRootVolumeThroughput(ebsRootVolumeThroughput)
    }

    override fun instances(instances: IResolvable) {
      cdkBuilder.instances(instances.let(IResolvable::unwrap))
    }

    override fun instances(instances: JobFlowInstancesConfigProperty) {
      cdkBuilder.instances(instances.let(JobFlowInstancesConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4392db05069307858968e7f25c0aed0db99baf1275502c31f16ff933fb598c4e")
    override fun instances(instances: JobFlowInstancesConfigProperty.Builder.() -> Unit): Unit =
        instances(JobFlowInstancesConfigProperty(instances))

    override fun jobFlowRole(jobFlowRole: String) {
      cdkBuilder.jobFlowRole(jobFlowRole)
    }

    override fun kerberosAttributes(kerberosAttributes: IResolvable) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(IResolvable::unwrap))
    }

    override fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(KerberosAttributesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b758ccdadfcc3ccd12852a4ab8d146fec24ec216c503ffa7e97e5e01a97a1000")
    override
        fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty.Builder.() -> Unit):
        Unit = kerberosAttributes(KerberosAttributesProperty(kerberosAttributes))

    override fun logEncryptionKmsKeyId(logEncryptionKmsKeyId: String) {
      cdkBuilder.logEncryptionKmsKeyId(logEncryptionKmsKeyId)
    }

    override fun logUri(logUri: String) {
      cdkBuilder.logUri(logUri)
    }

    override fun managedScalingPolicy(managedScalingPolicy: IResolvable) {
      cdkBuilder.managedScalingPolicy(managedScalingPolicy.let(IResolvable::unwrap))
    }

    override fun managedScalingPolicy(managedScalingPolicy: ManagedScalingPolicyProperty) {
      cdkBuilder.managedScalingPolicy(managedScalingPolicy.let(ManagedScalingPolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fed765ea5d1af1c7bea77dffebc7688273bed497485e9e69d926f3f3888644a")
    override
        fun managedScalingPolicy(managedScalingPolicy: ManagedScalingPolicyProperty.Builder.() -> Unit):
        Unit = managedScalingPolicy(ManagedScalingPolicyProperty(managedScalingPolicy))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun osReleaseLabel(osReleaseLabel: String) {
      cdkBuilder.osReleaseLabel(osReleaseLabel)
    }

    override fun placementGroupConfigs(placementGroupConfigs: IResolvable) {
      cdkBuilder.placementGroupConfigs(placementGroupConfigs.let(IResolvable::unwrap))
    }

    override fun placementGroupConfigs(placementGroupConfigs: List<Any>) {
      cdkBuilder.placementGroupConfigs(placementGroupConfigs)
    }

    override fun placementGroupConfigs(vararg placementGroupConfigs: Any): Unit =
        placementGroupConfigs(placementGroupConfigs.toList())

    override fun releaseLabel(releaseLabel: String) {
      cdkBuilder.releaseLabel(releaseLabel)
    }

    override fun scaleDownBehavior(scaleDownBehavior: String) {
      cdkBuilder.scaleDownBehavior(scaleDownBehavior)
    }

    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    override fun stepConcurrencyLevel(stepConcurrencyLevel: Number) {
      cdkBuilder.stepConcurrencyLevel(stepConcurrencyLevel)
    }

    override fun steps(steps: IResolvable) {
      cdkBuilder.steps(steps.let(IResolvable::unwrap))
    }

    override fun steps(steps: List<Any>) {
      cdkBuilder.steps(steps)
    }

    override fun steps(vararg steps: Any): Unit = steps(steps.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun visibleToAllUsers(visibleToAllUsers: Boolean) {
      cdkBuilder.visibleToAllUsers(visibleToAllUsers)
    }

    override fun visibleToAllUsers(visibleToAllUsers: IResolvable) {
      cdkBuilder.visibleToAllUsers(visibleToAllUsers.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.emr.CfnCluster =
        wrapped.cdkObject
  }

  public interface CloudWatchAlarmDefinitionProperty {
    public fun comparisonOperator(): String

    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

    public fun metricName(): String

    public fun namespace(): String? = unwrap(this).getNamespace()

    public fun period(): Number

    public fun statistic(): String? = unwrap(this).getStatistic()

    public fun threshold(): Number

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun comparisonOperator(comparisonOperator: String)

      public fun dimensions(dimensions: IResolvable)

      public fun dimensions(dimensions: List<Any>)

      public fun dimensions(vararg dimensions: Any)

      public fun evaluationPeriods(evaluationPeriods: Number)

      public fun metricName(metricName: String)

      public fun namespace(namespace: String)

      public fun period(period: Number)

      public fun statistic(statistic: String)

      public fun threshold(threshold: Number)

      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.builder()

      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      override fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
      }

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty,
    ) : CloudWatchAlarmDefinitionProperty {
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      override fun dimensions(): Any? = unwrap(this).getDimensions()

      override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

      override fun metricName(): String = unwrap(this).getMetricName()

      override fun namespace(): String? = unwrap(this).getNamespace()

      override fun period(): Number = unwrap(this).getPeriod()

      override fun statistic(): String? = unwrap(this).getStatistic()

      override fun threshold(): Number = unwrap(this).getThreshold()

      override fun unit(): String? = unwrap(this).getUnit()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty):
          CloudWatchAlarmDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchAlarmDefinitionProperty):
          software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricDimensionProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty,
    ) : MetricDimensionProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty):
          MetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StepConfigProperty {
    public fun actionOnFailure(): String? = unwrap(this).getActionOnFailure()

    public fun hadoopJarStep(): Any

    public fun name(): String

    public interface Builder {
      public fun actionOnFailure(actionOnFailure: String)

      public fun hadoopJarStep(hadoopJarStep: IResolvable)

      public fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35c8e923fe8dffa0f705d5b8464c7d670916d6d321c8b4ec178d10f9ea0ff2b6")
      public fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty.Builder.() -> Unit)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.builder()

      override fun actionOnFailure(actionOnFailure: String) {
        cdkBuilder.actionOnFailure(actionOnFailure)
      }

      override fun hadoopJarStep(hadoopJarStep: IResolvable) {
        cdkBuilder.hadoopJarStep(hadoopJarStep.let(IResolvable::unwrap))
      }

      override fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty) {
        cdkBuilder.hadoopJarStep(hadoopJarStep.let(HadoopJarStepConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35c8e923fe8dffa0f705d5b8464c7d670916d6d321c8b4ec178d10f9ea0ff2b6")
      override fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty.Builder.() -> Unit):
          Unit = hadoopJarStep(HadoopJarStepConfigProperty(hadoopJarStep))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty,
    ) : StepConfigProperty {
      override fun actionOnFailure(): String? = unwrap(this).getActionOnFailure()

      override fun hadoopJarStep(): Any = unwrap(this).getHadoopJarStep()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StepConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty):
          StepConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PlacementTypeProperty {
    public fun availabilityZone(): String

    public interface Builder {
      public fun availabilityZone(availabilityZone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty.builder()

      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty,
    ) : PlacementTypeProperty {
      override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty):
          PlacementTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementTypeProperty):
          software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AutoTerminationPolicyProperty {
    public fun idleTimeout(): Number? = unwrap(this).getIdleTimeout()

    public interface Builder {
      public fun idleTimeout(idleTimeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty.builder()

      override fun idleTimeout(idleTimeout: Number) {
        cdkBuilder.idleTimeout(idleTimeout)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty,
    ) : AutoTerminationPolicyProperty {
      override fun idleTimeout(): Number? = unwrap(this).getIdleTimeout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoTerminationPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty):
          AutoTerminationPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoTerminationPolicyProperty):
          software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AutoScalingPolicyProperty {
    public fun constraints(): Any

    public fun rules(): Any

    public interface Builder {
      public fun constraints(constraints: IResolvable)

      public fun constraints(constraints: ScalingConstraintsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2297aee95e47f66db144bc25bb2a219bac3fb2ba745f0c8036382aa2ab570e6e")
      public fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit)

      public fun rules(rules: IResolvable)

      public fun rules(rules: List<Any>)

      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty.builder()

      override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable::unwrap))
      }

      override fun constraints(constraints: ScalingConstraintsProperty) {
        cdkBuilder.constraints(constraints.let(ScalingConstraintsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2297aee95e47f66db144bc25bb2a219bac3fb2ba745f0c8036382aa2ab570e6e")
      override fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit): Unit =
          constraints(ScalingConstraintsProperty(constraints))

      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty,
    ) : AutoScalingPolicyProperty {
      override fun constraints(): Any = unwrap(this).getConstraints()

      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty):
          AutoScalingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingPolicyProperty):
          software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ComputeLimitsProperty {
    public fun maximumCapacityUnits(): Number

    public fun maximumCoreCapacityUnits(): Number? = unwrap(this).getMaximumCoreCapacityUnits()

    public fun maximumOnDemandCapacityUnits(): Number? =
        unwrap(this).getMaximumOnDemandCapacityUnits()

    public fun minimumCapacityUnits(): Number

    public fun unitType(): String

    public interface Builder {
      public fun maximumCapacityUnits(maximumCapacityUnits: Number)

      public fun maximumCoreCapacityUnits(maximumCoreCapacityUnits: Number)

      public fun maximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits: Number)

      public fun minimumCapacityUnits(minimumCapacityUnits: Number)

      public fun unitType(unitType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty.builder()

      override fun maximumCapacityUnits(maximumCapacityUnits: Number) {
        cdkBuilder.maximumCapacityUnits(maximumCapacityUnits)
      }

      override fun maximumCoreCapacityUnits(maximumCoreCapacityUnits: Number) {
        cdkBuilder.maximumCoreCapacityUnits(maximumCoreCapacityUnits)
      }

      override fun maximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits: Number) {
        cdkBuilder.maximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits)
      }

      override fun minimumCapacityUnits(minimumCapacityUnits: Number) {
        cdkBuilder.minimumCapacityUnits(minimumCapacityUnits)
      }

      override fun unitType(unitType: String) {
        cdkBuilder.unitType(unitType)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty,
    ) : ComputeLimitsProperty {
      override fun maximumCapacityUnits(): Number = unwrap(this).getMaximumCapacityUnits()

      override fun maximumCoreCapacityUnits(): Number? = unwrap(this).getMaximumCoreCapacityUnits()

      override fun maximumOnDemandCapacityUnits(): Number? =
          unwrap(this).getMaximumOnDemandCapacityUnits()

      override fun minimumCapacityUnits(): Number = unwrap(this).getMinimumCapacityUnits()

      override fun unitType(): String = unwrap(this).getUnitType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeLimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty):
          ComputeLimitsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeLimitsProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface JobFlowInstancesConfigProperty {
    public fun additionalMasterSecurityGroups(): List<String> =
        unwrap(this).getAdditionalMasterSecurityGroups() ?: emptyList()

    public fun additionalSlaveSecurityGroups(): List<String> =
        unwrap(this).getAdditionalSlaveSecurityGroups() ?: emptyList()

    public fun coreInstanceFleet(): Any? = unwrap(this).getCoreInstanceFleet()

    public fun coreInstanceGroup(): Any? = unwrap(this).getCoreInstanceGroup()

    public fun ec2KeyName(): String? = unwrap(this).getEc2KeyName()

    public fun ec2SubnetId(): String? = unwrap(this).getEc2SubnetId()

    public fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds() ?: emptyList()

    public fun emrManagedMasterSecurityGroup(): String? =
        unwrap(this).getEmrManagedMasterSecurityGroup()

    public fun emrManagedSlaveSecurityGroup(): String? =
        unwrap(this).getEmrManagedSlaveSecurityGroup()

    public fun hadoopVersion(): String? = unwrap(this).getHadoopVersion()

    public fun keepJobFlowAliveWhenNoSteps(): Any? = unwrap(this).getKeepJobFlowAliveWhenNoSteps()

    public fun masterInstanceFleet(): Any? = unwrap(this).getMasterInstanceFleet()

    public fun masterInstanceGroup(): Any? = unwrap(this).getMasterInstanceGroup()

    public fun placement(): Any? = unwrap(this).getPlacement()

    public fun serviceAccessSecurityGroup(): String? = unwrap(this).getServiceAccessSecurityGroup()

    public fun taskInstanceFleets(): Any? = unwrap(this).getTaskInstanceFleets()

    public fun taskInstanceGroups(): Any? = unwrap(this).getTaskInstanceGroups()

    public fun terminationProtected(): Any? = unwrap(this).getTerminationProtected()

    public fun unhealthyNodeReplacement(): Any? = unwrap(this).getUnhealthyNodeReplacement()

    public interface Builder {
      public fun additionalMasterSecurityGroups(additionalMasterSecurityGroups: List<String>)

      public fun additionalMasterSecurityGroups(vararg additionalMasterSecurityGroups: String)

      public fun additionalSlaveSecurityGroups(additionalSlaveSecurityGroups: List<String>)

      public fun additionalSlaveSecurityGroups(vararg additionalSlaveSecurityGroups: String)

      public fun coreInstanceFleet(coreInstanceFleet: IResolvable)

      public fun coreInstanceFleet(coreInstanceFleet: InstanceFleetConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ece8c06fdf4f69b4f87726d658d7e132bad320781884031ae69285e45e871ffe")
      public
          fun coreInstanceFleet(coreInstanceFleet: InstanceFleetConfigProperty.Builder.() -> Unit)

      public fun coreInstanceGroup(coreInstanceGroup: IResolvable)

      public fun coreInstanceGroup(coreInstanceGroup: InstanceGroupConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67715b405476ee62063fd050da43e4a1d168fa2721f0574cc2735773279d44e6")
      public
          fun coreInstanceGroup(coreInstanceGroup: InstanceGroupConfigProperty.Builder.() -> Unit)

      public fun ec2KeyName(ec2KeyName: String)

      public fun ec2SubnetId(ec2SubnetId: String)

      public fun ec2SubnetIds(ec2SubnetIds: List<String>)

      public fun ec2SubnetIds(vararg ec2SubnetIds: String)

      public fun emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup: String)

      public fun emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup: String)

      public fun hadoopVersion(hadoopVersion: String)

      public fun keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps: Boolean)

      public fun keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps: IResolvable)

      public fun masterInstanceFleet(masterInstanceFleet: IResolvable)

      public fun masterInstanceFleet(masterInstanceFleet: InstanceFleetConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d982dc921f49be4c3b292103d501661502301ce18c5701c80ce4b7afa4384215")
      public
          fun masterInstanceFleet(masterInstanceFleet: InstanceFleetConfigProperty.Builder.() -> Unit)

      public fun masterInstanceGroup(masterInstanceGroup: IResolvable)

      public fun masterInstanceGroup(masterInstanceGroup: InstanceGroupConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e99fd5ba5ee81ee99d08ccf02f72ac58022bdad063059bbc765db0f9f4200136")
      public
          fun masterInstanceGroup(masterInstanceGroup: InstanceGroupConfigProperty.Builder.() -> Unit)

      public fun placement(placement: IResolvable)

      public fun placement(placement: PlacementTypeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad452251bb47bde9c4adffd09ce7b373251ba37ce6c1b3400f6a5aa8f167493c")
      public fun placement(placement: PlacementTypeProperty.Builder.() -> Unit)

      public fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String)

      public fun taskInstanceFleets(taskInstanceFleets: IResolvable)

      public fun taskInstanceFleets(taskInstanceFleets: List<Any>)

      public fun taskInstanceFleets(vararg taskInstanceFleets: Any)

      public fun taskInstanceGroups(taskInstanceGroups: IResolvable)

      public fun taskInstanceGroups(taskInstanceGroups: List<Any>)

      public fun taskInstanceGroups(vararg taskInstanceGroups: Any)

      public fun terminationProtected(terminationProtected: Boolean)

      public fun terminationProtected(terminationProtected: IResolvable)

      public fun unhealthyNodeReplacement(unhealthyNodeReplacement: Boolean)

      public fun unhealthyNodeReplacement(unhealthyNodeReplacement: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.builder()

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

      override fun coreInstanceFleet(coreInstanceFleet: IResolvable) {
        cdkBuilder.coreInstanceFleet(coreInstanceFleet.let(IResolvable::unwrap))
      }

      override fun coreInstanceFleet(coreInstanceFleet: InstanceFleetConfigProperty) {
        cdkBuilder.coreInstanceFleet(coreInstanceFleet.let(InstanceFleetConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ece8c06fdf4f69b4f87726d658d7e132bad320781884031ae69285e45e871ffe")
      override
          fun coreInstanceFleet(coreInstanceFleet: InstanceFleetConfigProperty.Builder.() -> Unit):
          Unit = coreInstanceFleet(InstanceFleetConfigProperty(coreInstanceFleet))

      override fun coreInstanceGroup(coreInstanceGroup: IResolvable) {
        cdkBuilder.coreInstanceGroup(coreInstanceGroup.let(IResolvable::unwrap))
      }

      override fun coreInstanceGroup(coreInstanceGroup: InstanceGroupConfigProperty) {
        cdkBuilder.coreInstanceGroup(coreInstanceGroup.let(InstanceGroupConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67715b405476ee62063fd050da43e4a1d168fa2721f0574cc2735773279d44e6")
      override
          fun coreInstanceGroup(coreInstanceGroup: InstanceGroupConfigProperty.Builder.() -> Unit):
          Unit = coreInstanceGroup(InstanceGroupConfigProperty(coreInstanceGroup))

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

      override fun keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps: Boolean) {
        cdkBuilder.keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps)
      }

      override fun keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps: IResolvable) {
        cdkBuilder.keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps.let(IResolvable::unwrap))
      }

      override fun masterInstanceFleet(masterInstanceFleet: IResolvable) {
        cdkBuilder.masterInstanceFleet(masterInstanceFleet.let(IResolvable::unwrap))
      }

      override fun masterInstanceFleet(masterInstanceFleet: InstanceFleetConfigProperty) {
        cdkBuilder.masterInstanceFleet(masterInstanceFleet.let(InstanceFleetConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d982dc921f49be4c3b292103d501661502301ce18c5701c80ce4b7afa4384215")
      override
          fun masterInstanceFleet(masterInstanceFleet: InstanceFleetConfigProperty.Builder.() -> Unit):
          Unit = masterInstanceFleet(InstanceFleetConfigProperty(masterInstanceFleet))

      override fun masterInstanceGroup(masterInstanceGroup: IResolvable) {
        cdkBuilder.masterInstanceGroup(masterInstanceGroup.let(IResolvable::unwrap))
      }

      override fun masterInstanceGroup(masterInstanceGroup: InstanceGroupConfigProperty) {
        cdkBuilder.masterInstanceGroup(masterInstanceGroup.let(InstanceGroupConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e99fd5ba5ee81ee99d08ccf02f72ac58022bdad063059bbc765db0f9f4200136")
      override
          fun masterInstanceGroup(masterInstanceGroup: InstanceGroupConfigProperty.Builder.() -> Unit):
          Unit = masterInstanceGroup(InstanceGroupConfigProperty(masterInstanceGroup))

      override fun placement(placement: IResolvable) {
        cdkBuilder.placement(placement.let(IResolvable::unwrap))
      }

      override fun placement(placement: PlacementTypeProperty) {
        cdkBuilder.placement(placement.let(PlacementTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad452251bb47bde9c4adffd09ce7b373251ba37ce6c1b3400f6a5aa8f167493c")
      override fun placement(placement: PlacementTypeProperty.Builder.() -> Unit): Unit =
          placement(PlacementTypeProperty(placement))

      override fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String) {
        cdkBuilder.serviceAccessSecurityGroup(serviceAccessSecurityGroup)
      }

      override fun taskInstanceFleets(taskInstanceFleets: IResolvable) {
        cdkBuilder.taskInstanceFleets(taskInstanceFleets.let(IResolvable::unwrap))
      }

      override fun taskInstanceFleets(taskInstanceFleets: List<Any>) {
        cdkBuilder.taskInstanceFleets(taskInstanceFleets)
      }

      override fun taskInstanceFleets(vararg taskInstanceFleets: Any): Unit =
          taskInstanceFleets(taskInstanceFleets.toList())

      override fun taskInstanceGroups(taskInstanceGroups: IResolvable) {
        cdkBuilder.taskInstanceGroups(taskInstanceGroups.let(IResolvable::unwrap))
      }

      override fun taskInstanceGroups(taskInstanceGroups: List<Any>) {
        cdkBuilder.taskInstanceGroups(taskInstanceGroups)
      }

      override fun taskInstanceGroups(vararg taskInstanceGroups: Any): Unit =
          taskInstanceGroups(taskInstanceGroups.toList())

      override fun terminationProtected(terminationProtected: Boolean) {
        cdkBuilder.terminationProtected(terminationProtected)
      }

      override fun terminationProtected(terminationProtected: IResolvable) {
        cdkBuilder.terminationProtected(terminationProtected.let(IResolvable::unwrap))
      }

      override fun unhealthyNodeReplacement(unhealthyNodeReplacement: Boolean) {
        cdkBuilder.unhealthyNodeReplacement(unhealthyNodeReplacement)
      }

      override fun unhealthyNodeReplacement(unhealthyNodeReplacement: IResolvable) {
        cdkBuilder.unhealthyNodeReplacement(unhealthyNodeReplacement.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty,
    ) : JobFlowInstancesConfigProperty {
      override fun additionalMasterSecurityGroups(): List<String> =
          unwrap(this).getAdditionalMasterSecurityGroups() ?: emptyList()

      override fun additionalSlaveSecurityGroups(): List<String> =
          unwrap(this).getAdditionalSlaveSecurityGroups() ?: emptyList()

      override fun coreInstanceFleet(): Any? = unwrap(this).getCoreInstanceFleet()

      override fun coreInstanceGroup(): Any? = unwrap(this).getCoreInstanceGroup()

      override fun ec2KeyName(): String? = unwrap(this).getEc2KeyName()

      override fun ec2SubnetId(): String? = unwrap(this).getEc2SubnetId()

      override fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds() ?: emptyList()

      override fun emrManagedMasterSecurityGroup(): String? =
          unwrap(this).getEmrManagedMasterSecurityGroup()

      override fun emrManagedSlaveSecurityGroup(): String? =
          unwrap(this).getEmrManagedSlaveSecurityGroup()

      override fun hadoopVersion(): String? = unwrap(this).getHadoopVersion()

      override fun keepJobFlowAliveWhenNoSteps(): Any? =
          unwrap(this).getKeepJobFlowAliveWhenNoSteps()

      override fun masterInstanceFleet(): Any? = unwrap(this).getMasterInstanceFleet()

      override fun masterInstanceGroup(): Any? = unwrap(this).getMasterInstanceGroup()

      override fun placement(): Any? = unwrap(this).getPlacement()

      override fun serviceAccessSecurityGroup(): String? =
          unwrap(this).getServiceAccessSecurityGroup()

      override fun taskInstanceFleets(): Any? = unwrap(this).getTaskInstanceFleets()

      override fun taskInstanceGroups(): Any? = unwrap(this).getTaskInstanceGroups()

      override fun terminationProtected(): Any? = unwrap(this).getTerminationProtected()

      override fun unhealthyNodeReplacement(): Any? = unwrap(this).getUnhealthyNodeReplacement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JobFlowInstancesConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty):
          JobFlowInstancesConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobFlowInstancesConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface InstanceFleetConfigProperty {
    public fun instanceTypeConfigs(): Any? = unwrap(this).getInstanceTypeConfigs()

    public fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

    public fun name(): String? = unwrap(this).getName()

    public fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

    public fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()

    public interface Builder {
      public fun instanceTypeConfigs(instanceTypeConfigs: IResolvable)

      public fun instanceTypeConfigs(instanceTypeConfigs: List<Any>)

      public fun instanceTypeConfigs(vararg instanceTypeConfigs: Any)

      public fun launchSpecifications(launchSpecifications: IResolvable)

      public
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2f85e4274949c23fd43accc57821cbd6c34700468d4a30a07af21ad2c6bddf3")
      public
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun targetOnDemandCapacity(targetOnDemandCapacity: Number)

      public fun targetSpotCapacity(targetSpotCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.builder()

      override fun instanceTypeConfigs(instanceTypeConfigs: IResolvable) {
        cdkBuilder.instanceTypeConfigs(instanceTypeConfigs.let(IResolvable::unwrap))
      }

      override fun instanceTypeConfigs(instanceTypeConfigs: List<Any>) {
        cdkBuilder.instanceTypeConfigs(instanceTypeConfigs)
      }

      override fun instanceTypeConfigs(vararg instanceTypeConfigs: Any): Unit =
          instanceTypeConfigs(instanceTypeConfigs.toList())

      override fun launchSpecifications(launchSpecifications: IResolvable) {
        cdkBuilder.launchSpecifications(launchSpecifications.let(IResolvable::unwrap))
      }

      override
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty) {
        cdkBuilder.launchSpecifications(launchSpecifications.let(InstanceFleetProvisioningSpecificationsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2f85e4274949c23fd43accc57821cbd6c34700468d4a30a07af21ad2c6bddf3")
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

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty,
    ) : InstanceFleetConfigProperty {
      override fun instanceTypeConfigs(): Any? = unwrap(this).getInstanceTypeConfigs()

      override fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

      override fun name(): String? = unwrap(this).getName()

      override fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

      override fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceFleetConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty):
          InstanceFleetConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceFleetConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SpotProvisioningSpecificationProperty {
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    public fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

    public fun timeoutAction(): String

    public fun timeoutDurationMinutes(): Number

    public interface Builder {
      public fun allocationStrategy(allocationStrategy: String)

      public fun blockDurationMinutes(blockDurationMinutes: Number)

      public fun timeoutAction(timeoutAction: String)

      public fun timeoutDurationMinutes(timeoutDurationMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.builder()

      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      override fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
      }

      override fun timeoutAction(timeoutAction: String) {
        cdkBuilder.timeoutAction(timeoutAction)
      }

      override fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
        cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty,
    ) : SpotProvisioningSpecificationProperty {
      override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

      override fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

      override fun timeoutAction(): String = unwrap(this).getTimeoutAction()

      override fun timeoutDurationMinutes(): Number = unwrap(this).getTimeoutDurationMinutes()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty):
          SpotProvisioningSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotProvisioningSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceFleetProvisioningSpecificationsProperty {
    public fun onDemandSpecification(): Any? = unwrap(this).getOnDemandSpecification()

    public fun spotSpecification(): Any? = unwrap(this).getSpotSpecification()

    public interface Builder {
      public fun onDemandSpecification(onDemandSpecification: IResolvable)

      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("369b092f799a27e0159f3e3505a102216d79aa0c7a478a36e719d41b750073b4")
      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit)

      public fun spotSpecification(spotSpecification: IResolvable)

      public fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feb9c7ed9ccb5fa3fdaa636ef7684dde558d7eb0ffc5c6e55202ff3c6a0bea6a")
      public
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty.builder()

      override fun onDemandSpecification(onDemandSpecification: IResolvable) {
        cdkBuilder.onDemandSpecification(onDemandSpecification.let(IResolvable::unwrap))
      }

      override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty) {
        cdkBuilder.onDemandSpecification(onDemandSpecification.let(OnDemandProvisioningSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("369b092f799a27e0159f3e3505a102216d79aa0c7a478a36e719d41b750073b4")
      override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit =
          onDemandSpecification(OnDemandProvisioningSpecificationProperty(onDemandSpecification))

      override fun spotSpecification(spotSpecification: IResolvable) {
        cdkBuilder.spotSpecification(spotSpecification.let(IResolvable::unwrap))
      }

      override fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty) {
        cdkBuilder.spotSpecification(spotSpecification.let(SpotProvisioningSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feb9c7ed9ccb5fa3fdaa636ef7684dde558d7eb0ffc5c6e55202ff3c6a0bea6a")
      override
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit = spotSpecification(SpotProvisioningSpecificationProperty(spotSpecification))

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty,
    ) : InstanceFleetProvisioningSpecificationsProperty {
      override fun onDemandSpecification(): Any? = unwrap(this).getOnDemandSpecification()

      override fun spotSpecification(): Any? = unwrap(this).getSpotSpecification()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty):
          InstanceFleetProvisioningSpecificationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceFleetProvisioningSpecificationsProperty):
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SimpleScalingPolicyConfigurationProperty {
    public fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

    public fun coolDown(): Number? = unwrap(this).getCoolDown()

    public fun scalingAdjustment(): Number

    public interface Builder {
      public fun adjustmentType(adjustmentType: String)

      public fun coolDown(coolDown: Number)

      public fun scalingAdjustment(scalingAdjustment: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.builder()

      override fun adjustmentType(adjustmentType: String) {
        cdkBuilder.adjustmentType(adjustmentType)
      }

      override fun coolDown(coolDown: Number) {
        cdkBuilder.coolDown(coolDown)
      }

      override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty,
    ) : SimpleScalingPolicyConfigurationProperty {
      override fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

      override fun coolDown(): Number? = unwrap(this).getCoolDown()

      override fun scalingAdjustment(): Number = unwrap(this).getScalingAdjustment()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty):
          SimpleScalingPolicyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SimpleScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScalingConstraintsProperty {
    public fun maxCapacity(): Number

    public fun minCapacity(): Number

    public interface Builder {
      public fun maxCapacity(maxCapacity: Number)

      public fun minCapacity(minCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.builder()

      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty,
    ) : ScalingConstraintsProperty {
      override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      override fun minCapacity(): Number = unwrap(this).getMinCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty):
          ScalingConstraintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConstraintsProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EbsConfigurationProperty {
    public fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    public interface Builder {
      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable)

      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<Any>)

      public fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: Any)

      public fun ebsOptimized(ebsOptimized: Boolean)

      public fun ebsOptimized(ebsOptimized: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.builder()

      override fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.let(IResolvable::unwrap))
      }

      override fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<Any>) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs)
      }

      override fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: Any): Unit =
          ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.toList())

      override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      override fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty,
    ) : EbsConfigurationProperty {
      override fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

      override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EbsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty):
          EbsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KerberosAttributesProperty {
    public fun adDomainJoinPassword(): String? = unwrap(this).getAdDomainJoinPassword()

    public fun adDomainJoinUser(): String? = unwrap(this).getAdDomainJoinUser()

    public fun crossRealmTrustPrincipalPassword(): String? =
        unwrap(this).getCrossRealmTrustPrincipalPassword()

    public fun kdcAdminPassword(): String

    public fun realm(): String

    public interface Builder {
      public fun adDomainJoinPassword(adDomainJoinPassword: String)

      public fun adDomainJoinUser(adDomainJoinUser: String)

      public fun crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword: String)

      public fun kdcAdminPassword(kdcAdminPassword: String)

      public fun realm(realm: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty,
    ) : KerberosAttributesProperty {
      override fun adDomainJoinPassword(): String? = unwrap(this).getAdDomainJoinPassword()

      override fun adDomainJoinUser(): String? = unwrap(this).getAdDomainJoinUser()

      override fun crossRealmTrustPrincipalPassword(): String? =
          unwrap(this).getCrossRealmTrustPrincipalPassword()

      override fun kdcAdminPassword(): String = unwrap(this).getKdcAdminPassword()

      override fun realm(): String = unwrap(this).getRealm()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KerberosAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty):
          KerberosAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KerberosAttributesProperty):
          software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ManagedScalingPolicyProperty {
    public fun computeLimits(): Any? = unwrap(this).getComputeLimits()

    public interface Builder {
      public fun computeLimits(computeLimits: IResolvable)

      public fun computeLimits(computeLimits: ComputeLimitsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95bc72e2e9aa925adeed929babb4791327d9958ad0bd79ae634df9497a8bec64")
      public fun computeLimits(computeLimits: ComputeLimitsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty.builder()

      override fun computeLimits(computeLimits: IResolvable) {
        cdkBuilder.computeLimits(computeLimits.let(IResolvable::unwrap))
      }

      override fun computeLimits(computeLimits: ComputeLimitsProperty) {
        cdkBuilder.computeLimits(computeLimits.let(ComputeLimitsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95bc72e2e9aa925adeed929babb4791327d9958ad0bd79ae634df9497a8bec64")
      override fun computeLimits(computeLimits: ComputeLimitsProperty.Builder.() -> Unit): Unit =
          computeLimits(ComputeLimitsProperty(computeLimits))

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty,
    ) : ManagedScalingPolicyProperty {
      override fun computeLimits(): Any? = unwrap(this).getComputeLimits()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ManagedScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty):
          ManagedScalingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedScalingPolicyProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OnDemandProvisioningSpecificationProperty {
    public fun allocationStrategy(): String

    public interface Builder {
      public fun allocationStrategy(allocationStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty.builder()

      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty,
    ) : OnDemandProvisioningSpecificationProperty {
      override fun allocationStrategy(): String = unwrap(this).getAllocationStrategy()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty):
          OnDemandProvisioningSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnDemandProvisioningSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BootstrapActionConfigProperty {
    public fun name(): String

    public fun scriptBootstrapAction(): Any

    public interface Builder {
      public fun name(name: String)

      public fun scriptBootstrapAction(scriptBootstrapAction: IResolvable)

      public fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a865fef280f00048f67690c708ff1b8892cd0b48dc38c0a818102b6a89898b59")
      public
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun scriptBootstrapAction(scriptBootstrapAction: IResolvable) {
        cdkBuilder.scriptBootstrapAction(scriptBootstrapAction.let(IResolvable::unwrap))
      }

      override
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty) {
        cdkBuilder.scriptBootstrapAction(scriptBootstrapAction.let(ScriptBootstrapActionConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a865fef280f00048f67690c708ff1b8892cd0b48dc38c0a818102b6a89898b59")
      override
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty.Builder.() -> Unit):
          Unit = scriptBootstrapAction(ScriptBootstrapActionConfigProperty(scriptBootstrapAction))

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty,
    ) : BootstrapActionConfigProperty {
      override fun name(): String = unwrap(this).getName()

      override fun scriptBootstrapAction(): Any = unwrap(this).getScriptBootstrapAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BootstrapActionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty):
          BootstrapActionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BootstrapActionConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InstanceGroupConfigProperty {
    public fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

    public fun bidPrice(): String? = unwrap(this).getBidPrice()

    public fun configurations(): Any? = unwrap(this).getConfigurations()

    public fun customAmiId(): String? = unwrap(this).getCustomAmiId()

    public fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

    public fun instanceCount(): Number

    public fun instanceType(): String

    public fun market(): String? = unwrap(this).getMarket()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun autoScalingPolicy(autoScalingPolicy: IResolvable)

      public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f89ff2b9dd21c94ae6cfe970e5b0e824d10b8cc152e3a40c855e107a70ed2802")
      public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit)

      public fun bidPrice(bidPrice: String)

      public fun configurations(configurations: IResolvable)

      public fun configurations(configurations: List<Any>)

      public fun configurations(vararg configurations: Any)

      public fun customAmiId(customAmiId: String)

      public fun ebsConfiguration(ebsConfiguration: IResolvable)

      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("651928770cfe2bc959b58884807e1ce30b436559d9259fb91b9ac7e79a541aff")
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit)

      public fun instanceCount(instanceCount: Number)

      public fun instanceType(instanceType: String)

      public fun market(market: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.builder()

      override fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(IResolvable::unwrap))
      }

      override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(AutoScalingPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f89ff2b9dd21c94ae6cfe970e5b0e824d10b8cc152e3a40c855e107a70ed2802")
      override
          fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit):
          Unit = autoScalingPolicy(AutoScalingPolicyProperty(autoScalingPolicy))

      override fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
      }

      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      override fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
      }

      override fun ebsConfiguration(ebsConfiguration: IResolvable) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(IResolvable::unwrap))
      }

      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("651928770cfe2bc959b58884807e1ce30b436559d9259fb91b9ac7e79a541aff")
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit):
          Unit = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun market(market: String) {
        cdkBuilder.market(market)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty,
    ) : InstanceGroupConfigProperty {
      override fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

      override fun bidPrice(): String? = unwrap(this).getBidPrice()

      override fun configurations(): Any? = unwrap(this).getConfigurations()

      override fun customAmiId(): String? = unwrap(this).getCustomAmiId()

      override fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      override fun instanceType(): String = unwrap(this).getInstanceType()

      override fun market(): String? = unwrap(this).getMarket()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty):
          InstanceGroupConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceGroupConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KeyValueProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty,
    ) : KeyValueProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty):
          KeyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValueProperty):
          software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EbsBlockDeviceConfigProperty {
    public fun volumeSpecification(): Any

    public fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()

    public interface Builder {
      public fun volumeSpecification(volumeSpecification: IResolvable)

      public fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a6098102f5fe1e7c642ed86c5ea6655bb1f9f5971c6dce82a27acdd3a241902")
      public
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit)

      public fun volumesPerInstance(volumesPerInstance: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.builder()

      override fun volumeSpecification(volumeSpecification: IResolvable) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(IResolvable::unwrap))
      }

      override fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(VolumeSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a6098102f5fe1e7c642ed86c5ea6655bb1f9f5971c6dce82a27acdd3a241902")
      override
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit):
          Unit = volumeSpecification(VolumeSpecificationProperty(volumeSpecification))

      override fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty,
    ) : EbsBlockDeviceConfigProperty {
      override fun volumeSpecification(): Any = unwrap(this).getVolumeSpecification()

      override fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty):
          EbsBlockDeviceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ScalingTriggerProperty {
    public fun cloudWatchAlarmDefinition(): Any

    public interface Builder {
      public fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable)

      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("428bcdc3c65c762349543882ce1e400491bb34b9504fac0dc7b95f64dc197e49")
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty.builder()

      override fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(CloudWatchAlarmDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("428bcdc3c65c762349543882ce1e400491bb34b9504fac0dc7b95f64dc197e49")
      override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit):
          Unit =
          cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty(cloudWatchAlarmDefinition))

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty,
    ) : ScalingTriggerProperty {
      override fun cloudWatchAlarmDefinition(): Any = unwrap(this).getCloudWatchAlarmDefinition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingTriggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty):
          ScalingTriggerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingTriggerProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HadoopJarStepConfigProperty {
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    public fun jar(): String

    public fun mainClass(): String? = unwrap(this).getMainClass()

    public fun stepProperties(): Any? = unwrap(this).getStepProperties()

    public interface Builder {
      public fun args(args: List<String>)

      public fun args(vararg args: String)

      public fun jar(jar: String)

      public fun mainClass(mainClass: String)

      public fun stepProperties(stepProperties: IResolvable)

      public fun stepProperties(stepProperties: List<Any>)

      public fun stepProperties(vararg stepProperties: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.builder()

      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      override fun args(vararg args: String): Unit = args(args.toList())

      override fun jar(jar: String) {
        cdkBuilder.jar(jar)
      }

      override fun mainClass(mainClass: String) {
        cdkBuilder.mainClass(mainClass)
      }

      override fun stepProperties(stepProperties: IResolvable) {
        cdkBuilder.stepProperties(stepProperties.let(IResolvable::unwrap))
      }

      override fun stepProperties(stepProperties: List<Any>) {
        cdkBuilder.stepProperties(stepProperties)
      }

      override fun stepProperties(vararg stepProperties: Any): Unit =
          stepProperties(stepProperties.toList())

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty,
    ) : HadoopJarStepConfigProperty {
      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      override fun jar(): String = unwrap(this).getJar()

      override fun mainClass(): String? = unwrap(this).getMainClass()

      override fun stepProperties(): Any? = unwrap(this).getStepProperties()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HadoopJarStepConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty):
          HadoopJarStepConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HadoopJarStepConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConfigurationProperty {
    public fun classification(): String? = unwrap(this).getClassification()

    public fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

    public fun configurations(): Any? = unwrap(this).getConfigurations()

    public interface Builder {
      public fun classification(classification: String)

      public fun configurationProperties(configurationProperties: IResolvable)

      public fun configurationProperties(configurationProperties: Map<String, String>)

      public fun configurations(configurations: IResolvable)

      public fun configurations(configurations: List<Any>)

      public fun configurations(vararg configurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.builder()

      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      override fun configurationProperties(configurationProperties: IResolvable) {
        cdkBuilder.configurationProperties(configurationProperties.let(IResolvable::unwrap))
      }

      override fun configurationProperties(configurationProperties: Map<String, String>) {
        cdkBuilder.configurationProperties(configurationProperties)
      }

      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty,
    ) : ConfigurationProperty {
      override fun classification(): String? = unwrap(this).getClassification()

      override fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

      override fun configurations(): Any? = unwrap(this).getConfigurations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty):
          ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InstanceTypeConfigProperty {
    public fun bidPrice(): String? = unwrap(this).getBidPrice()

    public fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
        unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

    public fun configurations(): Any? = unwrap(this).getConfigurations()

    public fun customAmiId(): String? = unwrap(this).getCustomAmiId()

    public fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

    public fun instanceType(): String

    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    public interface Builder {
      public fun bidPrice(bidPrice: String)

      public fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number)

      public fun configurations(configurations: IResolvable)

      public fun configurations(configurations: List<Any>)

      public fun configurations(vararg configurations: Any)

      public fun customAmiId(customAmiId: String)

      public fun ebsConfiguration(ebsConfiguration: IResolvable)

      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2a629b219a80793df3f9931317579967e7b78ea6e2fa9d3e5f9aa2490ad026a")
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit)

      public fun instanceType(instanceType: String)

      public fun weightedCapacity(weightedCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.builder()

      override fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
      }

      override
          fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
        cdkBuilder.bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice)
      }

      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      override fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
      }

      override fun ebsConfiguration(ebsConfiguration: IResolvable) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(IResolvable::unwrap))
      }

      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2a629b219a80793df3f9931317579967e7b78ea6e2fa9d3e5f9aa2490ad026a")
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit):
          Unit = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty,
    ) : InstanceTypeConfigProperty {
      override fun bidPrice(): String? = unwrap(this).getBidPrice()

      override fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
          unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

      override fun configurations(): Any? = unwrap(this).getConfigurations()

      override fun customAmiId(): String? = unwrap(this).getCustomAmiId()

      override fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

      override fun instanceType(): String = unwrap(this).getInstanceType()

      override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty):
          InstanceTypeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceTypeConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PlacementGroupConfigProperty {
    public fun instanceRole(): String

    public fun placementStrategy(): String? = unwrap(this).getPlacementStrategy()

    public interface Builder {
      public fun instanceRole(instanceRole: String)

      public fun placementStrategy(placementStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty.builder()

      override fun instanceRole(instanceRole: String) {
        cdkBuilder.instanceRole(instanceRole)
      }

      override fun placementStrategy(placementStrategy: String) {
        cdkBuilder.placementStrategy(placementStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty,
    ) : PlacementGroupConfigProperty {
      override fun instanceRole(): String = unwrap(this).getInstanceRole()

      override fun placementStrategy(): String? = unwrap(this).getPlacementStrategy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty):
          PlacementGroupConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementGroupConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VolumeSpecificationProperty {
    public fun iops(): Number? = unwrap(this).getIops()

    public fun sizeInGb(): Number

    public fun throughput(): Number? = unwrap(this).getThroughput()

    public fun volumeType(): String

    public interface Builder {
      public fun iops(iops: Number)

      public fun sizeInGb(sizeInGb: Number)

      public fun throughput(throughput: Number)

      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.builder()

      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      override fun sizeInGb(sizeInGb: Number) {
        cdkBuilder.sizeInGb(sizeInGb)
      }

      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty,
    ) : VolumeSpecificationProperty {
      override fun iops(): Number? = unwrap(this).getIops()

      override fun sizeInGb(): Number = unwrap(this).getSizeInGb()

      override fun throughput(): Number? = unwrap(this).getThroughput()

      override fun volumeType(): String = unwrap(this).getVolumeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty):
          VolumeSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ApplicationProperty {
    public fun additionalInfo(): Any? = unwrap(this).getAdditionalInfo()

    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    public fun name(): String? = unwrap(this).getName()

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun additionalInfo(additionalInfo: IResolvable)

      public fun additionalInfo(additionalInfo: Map<String, String>)

      public fun args(args: List<String>)

      public fun args(vararg args: String)

      public fun name(name: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.builder()

      override fun additionalInfo(additionalInfo: IResolvable) {
        cdkBuilder.additionalInfo(additionalInfo.let(IResolvable::unwrap))
      }

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

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty,
    ) : ApplicationProperty {
      override fun additionalInfo(): Any? = unwrap(this).getAdditionalInfo()

      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      override fun name(): String? = unwrap(this).getName()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty):
          ApplicationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ScalingActionProperty {
    public fun market(): String? = unwrap(this).getMarket()

    public fun simpleScalingPolicyConfiguration(): Any

    public interface Builder {
      public fun market(market: String)

      public fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable)

      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57b02d666cf409d0da791d543a5027ae708d2738f5d4eb69d19393c49afb51a0")
      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.builder()

      override fun market(market: String) {
        cdkBuilder.market(market)
      }

      override fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(IResolvable::unwrap))
      }

      override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(SimpleScalingPolicyConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57b02d666cf409d0da791d543a5027ae708d2738f5d4eb69d19393c49afb51a0")
      override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit):
          Unit =
          simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty(simpleScalingPolicyConfiguration))

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty,
    ) : ScalingActionProperty {
      override fun market(): String? = unwrap(this).getMarket()

      override fun simpleScalingPolicyConfiguration(): Any =
          unwrap(this).getSimpleScalingPolicyConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty):
          ScalingActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingActionProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ScalingRuleProperty {
    public fun action(): Any

    public fun description(): String? = unwrap(this).getDescription()

    public fun name(): String

    public fun trigger(): Any

    public interface Builder {
      public fun action(action: IResolvable)

      public fun action(action: ScalingActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54312c2345469e16a1b194b05d183d8df3a94ae8cf715d7d9766ff89c6fcbf4f")
      public fun action(action: ScalingActionProperty.Builder.() -> Unit)

      public fun description(description: String)

      public fun name(name: String)

      public fun trigger(trigger: IResolvable)

      public fun trigger(trigger: ScalingTriggerProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed9f626671d043fbff78c239a39dc75380aaa27f98ca356653fb9b4b4426fa22")
      public fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.builder()

      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      override fun action(action: ScalingActionProperty) {
        cdkBuilder.action(action.let(ScalingActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54312c2345469e16a1b194b05d183d8df3a94ae8cf715d7d9766ff89c6fcbf4f")
      override fun action(action: ScalingActionProperty.Builder.() -> Unit): Unit =
          action(ScalingActionProperty(action))

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun trigger(trigger: IResolvable) {
        cdkBuilder.trigger(trigger.let(IResolvable::unwrap))
      }

      override fun trigger(trigger: ScalingTriggerProperty) {
        cdkBuilder.trigger(trigger.let(ScalingTriggerProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed9f626671d043fbff78c239a39dc75380aaa27f98ca356653fb9b4b4426fa22")
      override fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit): Unit =
          trigger(ScalingTriggerProperty(trigger))

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty,
    ) : ScalingRuleProperty {
      override fun action(): Any = unwrap(this).getAction()

      override fun description(): String? = unwrap(this).getDescription()

      override fun name(): String = unwrap(this).getName()

      override fun trigger(): Any = unwrap(this).getTrigger()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty):
          ScalingRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingRuleProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ScriptBootstrapActionConfigProperty {
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    public fun path(): String

    public interface Builder {
      public fun args(args: List<String>)

      public fun args(vararg args: String)

      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty.builder()

      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      override fun args(vararg args: String): Unit = args(args.toList())

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty,
    ) : ScriptBootstrapActionConfigProperty {
      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      override fun path(): String = unwrap(this).getPath()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty):
          ScriptBootstrapActionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScriptBootstrapActionConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
