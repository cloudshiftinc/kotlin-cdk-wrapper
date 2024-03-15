@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnClusterProps {
  public fun additionalInfo(): Any? = unwrap(this).getAdditionalInfo()

  public fun applications(): Any? = unwrap(this).getApplications()

  public fun autoScalingRole(): String? = unwrap(this).getAutoScalingRole()

  public fun autoTerminationPolicy(): Any? = unwrap(this).getAutoTerminationPolicy()

  public fun bootstrapActions(): Any? = unwrap(this).getBootstrapActions()

  public fun configurations(): Any? = unwrap(this).getConfigurations()

  public fun customAmiId(): String? = unwrap(this).getCustomAmiId()

  public fun ebsRootVolumeIops(): Number? = unwrap(this).getEbsRootVolumeIops()

  public fun ebsRootVolumeSize(): Number? = unwrap(this).getEbsRootVolumeSize()

  public fun ebsRootVolumeThroughput(): Number? = unwrap(this).getEbsRootVolumeThroughput()

  public fun instances(): Any

  public fun jobFlowRole(): String

  public fun kerberosAttributes(): Any? = unwrap(this).getKerberosAttributes()

  public fun logEncryptionKmsKeyId(): String? = unwrap(this).getLogEncryptionKmsKeyId()

  public fun logUri(): String? = unwrap(this).getLogUri()

  public fun managedScalingPolicy(): Any? = unwrap(this).getManagedScalingPolicy()

  public fun name(): String

  public fun osReleaseLabel(): String? = unwrap(this).getOsReleaseLabel()

  public fun placementGroupConfigs(): Any? = unwrap(this).getPlacementGroupConfigs()

  public fun releaseLabel(): String? = unwrap(this).getReleaseLabel()

  public fun scaleDownBehavior(): String? = unwrap(this).getScaleDownBehavior()

  public fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  public fun serviceRole(): String

  public fun stepConcurrencyLevel(): Number? = unwrap(this).getStepConcurrencyLevel()

  public fun steps(): Any? = unwrap(this).getSteps()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun visibleToAllUsers(): Any? = unwrap(this).getVisibleToAllUsers()

  @CdkDslMarker
  public interface Builder {
    public fun additionalInfo(additionalInfo: Any)

    public fun applications(applications: IResolvable)

    public fun applications(applications: List<Any>)

    public fun applications(vararg applications: Any)

    public fun autoScalingRole(autoScalingRole: String)

    public fun autoTerminationPolicy(autoTerminationPolicy: IResolvable)

    public
        fun autoTerminationPolicy(autoTerminationPolicy: CfnCluster.AutoTerminationPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f3240acf26a1c9c7b4ba81bd6a1e25256e5be8202b4c67f86b93242c1944044")
    public
        fun autoTerminationPolicy(autoTerminationPolicy: CfnCluster.AutoTerminationPolicyProperty.Builder.() -> Unit)

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

    public fun instances(instances: CfnCluster.JobFlowInstancesConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3187d564387336529962c72fd2106d28abad87dda841f9a9006103caf648cb4")
    public fun instances(instances: CfnCluster.JobFlowInstancesConfigProperty.Builder.() -> Unit)

    public fun jobFlowRole(jobFlowRole: String)

    public fun kerberosAttributes(kerberosAttributes: IResolvable)

    public fun kerberosAttributes(kerberosAttributes: CfnCluster.KerberosAttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d934421d8d810d6cbcf3885258551a0173093dbe4de5d5a3c75038b49cb30143")
    public
        fun kerberosAttributes(kerberosAttributes: CfnCluster.KerberosAttributesProperty.Builder.() -> Unit)

    public fun logEncryptionKmsKeyId(logEncryptionKmsKeyId: String)

    public fun logUri(logUri: String)

    public fun managedScalingPolicy(managedScalingPolicy: IResolvable)

    public fun managedScalingPolicy(managedScalingPolicy: CfnCluster.ManagedScalingPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc9c5ff76a6f289ebce415acdd74380dda47578b061a80d4d2045428f21afe26")
    public
        fun managedScalingPolicy(managedScalingPolicy: CfnCluster.ManagedScalingPolicyProperty.Builder.() -> Unit)

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnClusterProps.Builder =
        software.amazon.awscdk.services.emr.CfnClusterProps.builder()

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

    override
        fun autoTerminationPolicy(autoTerminationPolicy: CfnCluster.AutoTerminationPolicyProperty) {
      cdkBuilder.autoTerminationPolicy(autoTerminationPolicy.let(CfnCluster.AutoTerminationPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f3240acf26a1c9c7b4ba81bd6a1e25256e5be8202b4c67f86b93242c1944044")
    override
        fun autoTerminationPolicy(autoTerminationPolicy: CfnCluster.AutoTerminationPolicyProperty.Builder.() -> Unit):
        Unit =
        autoTerminationPolicy(CfnCluster.AutoTerminationPolicyProperty(autoTerminationPolicy))

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

    override fun instances(instances: CfnCluster.JobFlowInstancesConfigProperty) {
      cdkBuilder.instances(instances.let(CfnCluster.JobFlowInstancesConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3187d564387336529962c72fd2106d28abad87dda841f9a9006103caf648cb4")
    override fun instances(instances: CfnCluster.JobFlowInstancesConfigProperty.Builder.() -> Unit):
        Unit = instances(CfnCluster.JobFlowInstancesConfigProperty(instances))

    override fun jobFlowRole(jobFlowRole: String) {
      cdkBuilder.jobFlowRole(jobFlowRole)
    }

    override fun kerberosAttributes(kerberosAttributes: IResolvable) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(IResolvable::unwrap))
    }

    override fun kerberosAttributes(kerberosAttributes: CfnCluster.KerberosAttributesProperty) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(CfnCluster.KerberosAttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d934421d8d810d6cbcf3885258551a0173093dbe4de5d5a3c75038b49cb30143")
    override
        fun kerberosAttributes(kerberosAttributes: CfnCluster.KerberosAttributesProperty.Builder.() -> Unit):
        Unit = kerberosAttributes(CfnCluster.KerberosAttributesProperty(kerberosAttributes))

    override fun logEncryptionKmsKeyId(logEncryptionKmsKeyId: String) {
      cdkBuilder.logEncryptionKmsKeyId(logEncryptionKmsKeyId)
    }

    override fun logUri(logUri: String) {
      cdkBuilder.logUri(logUri)
    }

    override fun managedScalingPolicy(managedScalingPolicy: IResolvable) {
      cdkBuilder.managedScalingPolicy(managedScalingPolicy.let(IResolvable::unwrap))
    }

    override
        fun managedScalingPolicy(managedScalingPolicy: CfnCluster.ManagedScalingPolicyProperty) {
      cdkBuilder.managedScalingPolicy(managedScalingPolicy.let(CfnCluster.ManagedScalingPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc9c5ff76a6f289ebce415acdd74380dda47578b061a80d4d2045428f21afe26")
    override
        fun managedScalingPolicy(managedScalingPolicy: CfnCluster.ManagedScalingPolicyProperty.Builder.() -> Unit):
        Unit = managedScalingPolicy(CfnCluster.ManagedScalingPolicyProperty(managedScalingPolicy))

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

    public fun build(): software.amazon.awscdk.services.emr.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emr.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
    override fun additionalInfo(): Any? = unwrap(this).getAdditionalInfo()

    override fun applications(): Any? = unwrap(this).getApplications()

    override fun autoScalingRole(): String? = unwrap(this).getAutoScalingRole()

    override fun autoTerminationPolicy(): Any? = unwrap(this).getAutoTerminationPolicy()

    override fun bootstrapActions(): Any? = unwrap(this).getBootstrapActions()

    override fun configurations(): Any? = unwrap(this).getConfigurations()

    override fun customAmiId(): String? = unwrap(this).getCustomAmiId()

    override fun ebsRootVolumeIops(): Number? = unwrap(this).getEbsRootVolumeIops()

    override fun ebsRootVolumeSize(): Number? = unwrap(this).getEbsRootVolumeSize()

    override fun ebsRootVolumeThroughput(): Number? = unwrap(this).getEbsRootVolumeThroughput()

    override fun instances(): Any = unwrap(this).getInstances()

    override fun jobFlowRole(): String = unwrap(this).getJobFlowRole()

    override fun kerberosAttributes(): Any? = unwrap(this).getKerberosAttributes()

    override fun logEncryptionKmsKeyId(): String? = unwrap(this).getLogEncryptionKmsKeyId()

    override fun logUri(): String? = unwrap(this).getLogUri()

    override fun managedScalingPolicy(): Any? = unwrap(this).getManagedScalingPolicy()

    override fun name(): String = unwrap(this).getName()

    override fun osReleaseLabel(): String? = unwrap(this).getOsReleaseLabel()

    override fun placementGroupConfigs(): Any? = unwrap(this).getPlacementGroupConfigs()

    override fun releaseLabel(): String? = unwrap(this).getReleaseLabel()

    override fun scaleDownBehavior(): String? = unwrap(this).getScaleDownBehavior()

    override fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

    override fun serviceRole(): String = unwrap(this).getServiceRole()

    override fun stepConcurrencyLevel(): Number? = unwrap(this).getStepConcurrencyLevel()

    override fun steps(): Any? = unwrap(this).getSteps()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun visibleToAllUsers(): Any? = unwrap(this).getVisibleToAllUsers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnClusterProps):
        CfnClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.emr.CfnClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.emr.CfnClusterProps
  }
}
