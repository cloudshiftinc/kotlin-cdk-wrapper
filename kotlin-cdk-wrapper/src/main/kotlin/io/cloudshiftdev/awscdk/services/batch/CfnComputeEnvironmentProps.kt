@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnComputeEnvironmentProps {
  public fun computeEnvironmentName(): String? = unwrap(this).getComputeEnvironmentName()

  public fun computeResources(): Any? = unwrap(this).getComputeResources()

  public fun eksConfiguration(): Any? = unwrap(this).getEksConfiguration()

  public fun replaceComputeEnvironment(): Any? = unwrap(this).getReplaceComputeEnvironment()

  public fun serviceRole(): String? = unwrap(this).getServiceRole()

  public fun state(): String? = unwrap(this).getState()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun type(): String

  public fun unmanagedvCpus(): Number? = unwrap(this).getUnmanagedvCpus()

  public fun updatePolicy(): Any? = unwrap(this).getUpdatePolicy()

  @CdkDslMarker
  public interface Builder {
    public fun computeEnvironmentName(computeEnvironmentName: String)

    public fun computeResources(computeResources: IResolvable)

    public fun computeResources(computeResources: CfnComputeEnvironment.ComputeResourcesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c5aa89e96bc4834f076a358ce0ec44674fba0f607213a72f5e343e80332b474")
    public
        fun computeResources(computeResources: CfnComputeEnvironment.ComputeResourcesProperty.Builder.() -> Unit)

    public fun eksConfiguration(eksConfiguration: IResolvable)

    public fun eksConfiguration(eksConfiguration: CfnComputeEnvironment.EksConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8d705fb34abc0493032b9fb456a8b2b36eaa3e10da14eecdb7cf4152b0185bf")
    public
        fun eksConfiguration(eksConfiguration: CfnComputeEnvironment.EksConfigurationProperty.Builder.() -> Unit)

    public fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean)

    public fun replaceComputeEnvironment(replaceComputeEnvironment: IResolvable)

    public fun serviceRole(serviceRole: String)

    public fun state(state: String)

    public fun tags(tags: Map<String, String>)

    public fun type(type: String)

    public fun unmanagedvCpus(unmanagedvCpus: Number)

    public fun updatePolicy(updatePolicy: IResolvable)

    public fun updatePolicy(updatePolicy: CfnComputeEnvironment.UpdatePolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf05b2bc6a5f5e5d12a143040f55c2f9b59a535129c128fff8454fdfd532d420")
    public
        fun updatePolicy(updatePolicy: CfnComputeEnvironment.UpdatePolicyProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder
        = software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.builder()

    override fun computeEnvironmentName(computeEnvironmentName: String) {
      cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    override fun computeResources(computeResources: IResolvable) {
      cdkBuilder.computeResources(computeResources.let(IResolvable::unwrap))
    }

    override
        fun computeResources(computeResources: CfnComputeEnvironment.ComputeResourcesProperty) {
      cdkBuilder.computeResources(computeResources.let(CfnComputeEnvironment.ComputeResourcesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c5aa89e96bc4834f076a358ce0ec44674fba0f607213a72f5e343e80332b474")
    override
        fun computeResources(computeResources: CfnComputeEnvironment.ComputeResourcesProperty.Builder.() -> Unit):
        Unit = computeResources(CfnComputeEnvironment.ComputeResourcesProperty(computeResources))

    override fun eksConfiguration(eksConfiguration: IResolvable) {
      cdkBuilder.eksConfiguration(eksConfiguration.let(IResolvable::unwrap))
    }

    override
        fun eksConfiguration(eksConfiguration: CfnComputeEnvironment.EksConfigurationProperty) {
      cdkBuilder.eksConfiguration(eksConfiguration.let(CfnComputeEnvironment.EksConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8d705fb34abc0493032b9fb456a8b2b36eaa3e10da14eecdb7cf4152b0185bf")
    override
        fun eksConfiguration(eksConfiguration: CfnComputeEnvironment.EksConfigurationProperty.Builder.() -> Unit):
        Unit = eksConfiguration(CfnComputeEnvironment.EksConfigurationProperty(eksConfiguration))

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

    override fun updatePolicy(updatePolicy: CfnComputeEnvironment.UpdatePolicyProperty) {
      cdkBuilder.updatePolicy(updatePolicy.let(CfnComputeEnvironment.UpdatePolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf05b2bc6a5f5e5d12a143040f55c2f9b59a535129c128fff8454fdfd532d420")
    override
        fun updatePolicy(updatePolicy: CfnComputeEnvironment.UpdatePolicyProperty.Builder.() -> Unit):
        Unit = updatePolicy(CfnComputeEnvironment.UpdatePolicyProperty(updatePolicy))

    public fun build(): software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps,
  ) : CdkObject(cdkObject), CfnComputeEnvironmentProps {
    override fun computeEnvironmentName(): String? = unwrap(this).getComputeEnvironmentName()

    override fun computeResources(): Any? = unwrap(this).getComputeResources()

    override fun eksConfiguration(): Any? = unwrap(this).getEksConfiguration()

    override fun replaceComputeEnvironment(): Any? = unwrap(this).getReplaceComputeEnvironment()

    override fun serviceRole(): String? = unwrap(this).getServiceRole()

    override fun state(): String? = unwrap(this).getState()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun type(): String = unwrap(this).getType()

    override fun unmanagedvCpus(): Number? = unwrap(this).getUnmanagedvCpus()

    override fun updatePolicy(): Any? = unwrap(this).getUpdatePolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnComputeEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps):
        CfnComputeEnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnComputeEnvironmentProps):
        software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps
  }
}
