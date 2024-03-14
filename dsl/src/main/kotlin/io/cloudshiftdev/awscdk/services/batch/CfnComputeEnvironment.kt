package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CfnResource
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

public open class CfnComputeEnvironment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrComputeEnvironmentArn(): String = unwrap(this).getAttrComputeEnvironmentArn()

  public open fun computeEnvironmentName(): String? = unwrap(this).getComputeEnvironmentName()

  public open fun computeEnvironmentName(`value`: String) {
    unwrap(this).setComputeEnvironmentName(`value`)
  }

  public open fun computeResources(): Any? = unwrap(this).getComputeResources()

  public open fun computeResources(`value`: IResolvable) {
    unwrap(this).setComputeResources(`value`.let(IResolvable::unwrap))
  }

  public open fun computeResources(`value`: ComputeResourcesProperty) {
    unwrap(this).setComputeResources(`value`.let(ComputeResourcesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5848bb91251b86183b3ea469b2c7529ed7ab8f70dbbc389524f94cd0e5079fb")
  public open fun computeResources(`value`: ComputeResourcesProperty.Builder.() -> Unit): Unit =
      computeResources(ComputeResourcesProperty(`value`))

  public open fun eksConfiguration(): Any? = unwrap(this).getEksConfiguration()

  public open fun eksConfiguration(`value`: IResolvable) {
    unwrap(this).setEksConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun eksConfiguration(`value`: EksConfigurationProperty) {
    unwrap(this).setEksConfiguration(`value`.let(EksConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a7ac2f3acb977dd704e35301bf1b1e50a07dc03e5d3714467f0c8d6e26707a67")
  public open fun eksConfiguration(`value`: EksConfigurationProperty.Builder.() -> Unit): Unit =
      eksConfiguration(EksConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun replaceComputeEnvironment(): Any? = unwrap(this).getReplaceComputeEnvironment()

  public open fun replaceComputeEnvironment(`value`: Boolean) {
    unwrap(this).setReplaceComputeEnvironment(`value`)
  }

  public open fun replaceComputeEnvironment(`value`: IResolvable) {
    unwrap(this).setReplaceComputeEnvironment(`value`.let(IResolvable::unwrap))
  }

  public open fun serviceRole(): String? = unwrap(this).getServiceRole()

  public open fun serviceRole(`value`: String) {
    unwrap(this).setServiceRole(`value`)
  }

  public open fun state(): String? = unwrap(this).getState()

  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun unmanagedvCpus(): Number? = unwrap(this).getUnmanagedvCpus()

  public open fun unmanagedvCpus(`value`: Number) {
    unwrap(this).setUnmanagedvCpus(`value`)
  }

  public open fun updatePolicy(): Any? = unwrap(this).getUpdatePolicy()

  public open fun updatePolicy(`value`: IResolvable) {
    unwrap(this).setUpdatePolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun updatePolicy(`value`: UpdatePolicyProperty) {
    unwrap(this).setUpdatePolicy(`value`.let(UpdatePolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("43e9768d3ae210b5c50e0040a03095541fc4fa3f91879ec7a20dd2ef9eed9581")
  public open fun updatePolicy(`value`: UpdatePolicyProperty.Builder.() -> Unit): Unit =
      updatePolicy(UpdatePolicyProperty(`value`))

  public interface Builder {
    public fun computeEnvironmentName(computeEnvironmentName: String)

    public fun computeResources(computeResources: IResolvable)

    public fun computeResources(computeResources: ComputeResourcesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e68d3d39757a2bb02d27a14eaf143cce0c2876be80e425917f05c02c84205abb")
    public fun computeResources(computeResources: ComputeResourcesProperty.Builder.() -> Unit)

    public fun eksConfiguration(eksConfiguration: IResolvable)

    public fun eksConfiguration(eksConfiguration: EksConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("628654f205977f50317fb6bb74c7f132d076467b6a42e16fe1d1b5c152f2e10c")
    public fun eksConfiguration(eksConfiguration: EksConfigurationProperty.Builder.() -> Unit)

    public fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean)

    public fun replaceComputeEnvironment(replaceComputeEnvironment: IResolvable)

    public fun serviceRole(serviceRole: String)

    public fun state(state: String)

    public fun tags(tags: Map<String, String>)

    public fun type(type: String)

    public fun unmanagedvCpus(unmanagedvCpus: Number)

    public fun updatePolicy(updatePolicy: IResolvable)

    public fun updatePolicy(updatePolicy: UpdatePolicyProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adcb17e92adf67ccaad6ef9bc71615a32075fcca90b5091cee7b718d76f5919e")
    public fun updatePolicy(updatePolicy: UpdatePolicyProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnComputeEnvironment.Builder =
        software.amazon.awscdk.services.batch.CfnComputeEnvironment.Builder.create(scope, id)

    override fun computeEnvironmentName(computeEnvironmentName: String) {
      cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    override fun computeResources(computeResources: IResolvable) {
      cdkBuilder.computeResources(computeResources.let(IResolvable::unwrap))
    }

    override fun computeResources(computeResources: ComputeResourcesProperty) {
      cdkBuilder.computeResources(computeResources.let(ComputeResourcesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e68d3d39757a2bb02d27a14eaf143cce0c2876be80e425917f05c02c84205abb")
    override fun computeResources(computeResources: ComputeResourcesProperty.Builder.() -> Unit):
        Unit = computeResources(ComputeResourcesProperty(computeResources))

    override fun eksConfiguration(eksConfiguration: IResolvable) {
      cdkBuilder.eksConfiguration(eksConfiguration.let(IResolvable::unwrap))
    }

    override fun eksConfiguration(eksConfiguration: EksConfigurationProperty) {
      cdkBuilder.eksConfiguration(eksConfiguration.let(EksConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("628654f205977f50317fb6bb74c7f132d076467b6a42e16fe1d1b5c152f2e10c")
    override fun eksConfiguration(eksConfiguration: EksConfigurationProperty.Builder.() -> Unit):
        Unit = eksConfiguration(EksConfigurationProperty(eksConfiguration))

    override fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean) {
      cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
    }

    override fun replaceComputeEnvironment(replaceComputeEnvironment: IResolvable) {
      cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment.let(IResolvable::unwrap))
    }

    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun unmanagedvCpus(unmanagedvCpus: Number) {
      cdkBuilder.unmanagedvCpus(unmanagedvCpus)
    }

    override fun updatePolicy(updatePolicy: IResolvable) {
      cdkBuilder.updatePolicy(updatePolicy.let(IResolvable::unwrap))
    }

    override fun updatePolicy(updatePolicy: UpdatePolicyProperty) {
      cdkBuilder.updatePolicy(updatePolicy.let(UpdatePolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adcb17e92adf67ccaad6ef9bc71615a32075fcca90b5091cee7b718d76f5919e")
    override fun updatePolicy(updatePolicy: UpdatePolicyProperty.Builder.() -> Unit): Unit =
        updatePolicy(UpdatePolicyProperty(updatePolicy))

    public fun build(): software.amazon.awscdk.services.batch.CfnComputeEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnComputeEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnComputeEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment):
        CfnComputeEnvironment = CfnComputeEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnComputeEnvironment):
        software.amazon.awscdk.services.batch.CfnComputeEnvironment = wrapped.cdkObject
  }

  public interface EksConfigurationProperty {
    public fun eksClusterArn(): String

    public fun kubernetesNamespace(): String

    public interface Builder {
      public fun eksClusterArn(eksClusterArn: String)

      public fun kubernetesNamespace(kubernetesNamespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty.builder()

      override fun eksClusterArn(eksClusterArn: String) {
        cdkBuilder.eksClusterArn(eksClusterArn)
      }

      override fun kubernetesNamespace(kubernetesNamespace: String) {
        cdkBuilder.kubernetesNamespace(kubernetesNamespace)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty,
    ) : EksConfigurationProperty {
      override fun eksClusterArn(): String = unwrap(this).getEksClusterArn()

      override fun kubernetesNamespace(): String = unwrap(this).getKubernetesNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EksConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty):
          EksConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksConfigurationProperty):
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.EksConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface Ec2ConfigurationObjectProperty {
    public fun imageIdOverride(): String? = unwrap(this).getImageIdOverride()

    public fun imageKubernetesVersion(): String? = unwrap(this).getImageKubernetesVersion()

    public fun imageType(): String

    public interface Builder {
      public fun imageIdOverride(imageIdOverride: String)

      public fun imageKubernetesVersion(imageKubernetesVersion: String)

      public fun imageType(imageType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty.builder()

      override fun imageIdOverride(imageIdOverride: String) {
        cdkBuilder.imageIdOverride(imageIdOverride)
      }

      override fun imageKubernetesVersion(imageKubernetesVersion: String) {
        cdkBuilder.imageKubernetesVersion(imageKubernetesVersion)
      }

      override fun imageType(imageType: String) {
        cdkBuilder.imageType(imageType)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty,
    ) : Ec2ConfigurationObjectProperty {
      override fun imageIdOverride(): String? = unwrap(this).getImageIdOverride()

      override fun imageKubernetesVersion(): String? = unwrap(this).getImageKubernetesVersion()

      override fun imageType(): String = unwrap(this).getImageType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Ec2ConfigurationObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty):
          Ec2ConfigurationObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ec2ConfigurationObjectProperty):
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateSpecificationProperty {
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun launchTemplateId(launchTemplateId: String)

      public fun launchTemplateName(launchTemplateName: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.builder()

      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty,
    ) : LaunchTemplateSpecificationProperty {
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty):
          LaunchTemplateSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateSpecificationProperty):
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface UpdatePolicyProperty {
    public fun jobExecutionTimeoutMinutes(): Number? = unwrap(this).getJobExecutionTimeoutMinutes()

    public fun terminateJobsOnUpdate(): Any? = unwrap(this).getTerminateJobsOnUpdate()

    public interface Builder {
      public fun jobExecutionTimeoutMinutes(jobExecutionTimeoutMinutes: Number)

      public fun terminateJobsOnUpdate(terminateJobsOnUpdate: Boolean)

      public fun terminateJobsOnUpdate(terminateJobsOnUpdate: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty.Builder =
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty.builder()

      override fun jobExecutionTimeoutMinutes(jobExecutionTimeoutMinutes: Number) {
        cdkBuilder.jobExecutionTimeoutMinutes(jobExecutionTimeoutMinutes)
      }

      override fun terminateJobsOnUpdate(terminateJobsOnUpdate: Boolean) {
        cdkBuilder.terminateJobsOnUpdate(terminateJobsOnUpdate)
      }

      override fun terminateJobsOnUpdate(terminateJobsOnUpdate: IResolvable) {
        cdkBuilder.terminateJobsOnUpdate(terminateJobsOnUpdate.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty,
    ) : UpdatePolicyProperty {
      override fun jobExecutionTimeoutMinutes(): Number? =
          unwrap(this).getJobExecutionTimeoutMinutes()

      override fun terminateJobsOnUpdate(): Any? = unwrap(this).getTerminateJobsOnUpdate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UpdatePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty):
          UpdatePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpdatePolicyProperty):
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.UpdatePolicyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComputeResourcesProperty {
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    public fun bidPercentage(): Number? = unwrap(this).getBidPercentage()

    public fun desiredvCpus(): Number? = unwrap(this).getDesiredvCpus()

    public fun ec2Configuration(): Any? = unwrap(this).getEc2Configuration()

    public fun ec2KeyPair(): String? = unwrap(this).getEc2KeyPair()

    public fun imageId(): String? = unwrap(this).getImageId()

    public fun instanceRole(): String? = unwrap(this).getInstanceRole()

    public fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

    public fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

    public fun maxvCpus(): Number

    public fun minvCpus(): Number? = unwrap(this).getMinvCpus()

    public fun placementGroup(): String? = unwrap(this).getPlacementGroup()

    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun spotIamFleetRole(): String? = unwrap(this).getSpotIamFleetRole()

    public fun subnets(): List<String>

    public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    public fun type(): String

    public fun updateToLatestImageVersion(): Any? = unwrap(this).getUpdateToLatestImageVersion()

    public interface Builder {
      public fun allocationStrategy(allocationStrategy: String)

      public fun bidPercentage(bidPercentage: Number)

      public fun desiredvCpus(desiredvCpus: Number)

      public fun ec2Configuration(ec2Configuration: IResolvable)

      public fun ec2Configuration(ec2Configuration: List<Any>)

      public fun ec2Configuration(vararg ec2Configuration: Any)

      public fun ec2KeyPair(ec2KeyPair: String)

      public fun imageId(imageId: String)

      public fun instanceRole(instanceRole: String)

      public fun instanceTypes(instanceTypes: List<String>)

      public fun instanceTypes(vararg instanceTypes: String)

      public fun launchTemplate(launchTemplate: IResolvable)

      public fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bd41018a6fa33ec98a87098a1d8f9d11f4aa26819b580cb26432a7dddf3ff5f")
      public
          fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit)

      public fun maxvCpus(maxvCpus: Number)

      public fun minvCpus(minvCpus: Number)

      public fun placementGroup(placementGroup: String)

      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun spotIamFleetRole(spotIamFleetRole: String)

      public fun subnets(subnets: List<String>)

      public fun subnets(vararg subnets: String)

      public fun tags(tags: Map<String, String>)

      public fun type(type: String)

      public fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean)

      public fun updateToLatestImageVersion(updateToLatestImageVersion: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.builder()

      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      override fun bidPercentage(bidPercentage: Number) {
        cdkBuilder.bidPercentage(bidPercentage)
      }

      override fun desiredvCpus(desiredvCpus: Number) {
        cdkBuilder.desiredvCpus(desiredvCpus)
      }

      override fun ec2Configuration(ec2Configuration: IResolvable) {
        cdkBuilder.ec2Configuration(ec2Configuration.let(IResolvable::unwrap))
      }

      override fun ec2Configuration(ec2Configuration: List<Any>) {
        cdkBuilder.ec2Configuration(ec2Configuration)
      }

      override fun ec2Configuration(vararg ec2Configuration: Any): Unit =
          ec2Configuration(ec2Configuration.toList())

      override fun ec2KeyPair(ec2KeyPair: String) {
        cdkBuilder.ec2KeyPair(ec2KeyPair)
      }

      override fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
      }

      override fun instanceRole(instanceRole: String) {
        cdkBuilder.instanceRole(instanceRole)
      }

      override fun instanceTypes(instanceTypes: List<String>) {
        cdkBuilder.instanceTypes(instanceTypes)
      }

      override fun instanceTypes(vararg instanceTypes: String): Unit =
          instanceTypes(instanceTypes.toList())

      override fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
      }

      override fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplate(launchTemplate.let(LaunchTemplateSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bd41018a6fa33ec98a87098a1d8f9d11f4aa26819b580cb26432a7dddf3ff5f")
      override
          fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
          Unit = launchTemplate(LaunchTemplateSpecificationProperty(launchTemplate))

      override fun maxvCpus(maxvCpus: Number) {
        cdkBuilder.maxvCpus(maxvCpus)
      }

      override fun minvCpus(minvCpus: Number) {
        cdkBuilder.minvCpus(minvCpus)
      }

      override fun placementGroup(placementGroup: String) {
        cdkBuilder.placementGroup(placementGroup)
      }

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun spotIamFleetRole(spotIamFleetRole: String) {
        cdkBuilder.spotIamFleetRole(spotIamFleetRole)
      }

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      override fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean) {
        cdkBuilder.updateToLatestImageVersion(updateToLatestImageVersion)
      }

      override fun updateToLatestImageVersion(updateToLatestImageVersion: IResolvable) {
        cdkBuilder.updateToLatestImageVersion(updateToLatestImageVersion.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty,
    ) : ComputeResourcesProperty {
      override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

      override fun bidPercentage(): Number? = unwrap(this).getBidPercentage()

      override fun desiredvCpus(): Number? = unwrap(this).getDesiredvCpus()

      override fun ec2Configuration(): Any? = unwrap(this).getEc2Configuration()

      override fun ec2KeyPair(): String? = unwrap(this).getEc2KeyPair()

      override fun imageId(): String? = unwrap(this).getImageId()

      override fun instanceRole(): String? = unwrap(this).getInstanceRole()

      override fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

      override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

      override fun maxvCpus(): Number = unwrap(this).getMaxvCpus()

      override fun minvCpus(): Number? = unwrap(this).getMinvCpus()

      override fun placementGroup(): String? = unwrap(this).getPlacementGroup()

      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun spotIamFleetRole(): String? = unwrap(this).getSpotIamFleetRole()

      override fun subnets(): List<String> = unwrap(this).getSubnets()

      override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

      override fun type(): String = unwrap(this).getType()

      override fun updateToLatestImageVersion(): Any? = unwrap(this).getUpdateToLatestImageVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty):
          ComputeResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeResourcesProperty):
          software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
