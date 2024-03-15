@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEC2FleetProps {
  public fun context(): String? = unwrap(this).getContext()

  public fun excessCapacityTerminationPolicy(): String? =
      unwrap(this).getExcessCapacityTerminationPolicy()

  public fun launchTemplateConfigs(): Any

  public fun onDemandOptions(): Any? = unwrap(this).getOnDemandOptions()

  public fun replaceUnhealthyInstances(): Any? = unwrap(this).getReplaceUnhealthyInstances()

  public fun spotOptions(): Any? = unwrap(this).getSpotOptions()

  public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  public fun targetCapacitySpecification(): Any

  public fun terminateInstancesWithExpiration(): Any? =
      unwrap(this).getTerminateInstancesWithExpiration()

  public fun type(): String? = unwrap(this).getType()

  public fun validFrom(): String? = unwrap(this).getValidFrom()

  public fun validUntil(): String? = unwrap(this).getValidUntil()

  @CdkDslMarker
  public interface Builder {
    public fun context(context: String)

    public fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String)

    public fun launchTemplateConfigs(launchTemplateConfigs: IResolvable)

    public fun launchTemplateConfigs(launchTemplateConfigs: List<Any>)

    public fun launchTemplateConfigs(vararg launchTemplateConfigs: Any)

    public fun onDemandOptions(onDemandOptions: IResolvable)

    public fun onDemandOptions(onDemandOptions: CfnEC2Fleet.OnDemandOptionsRequestProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaa7b2bfbe6b74008fc249f9186fc70a68fd8fe93b800c2e90c3430ce0609656")
    public
        fun onDemandOptions(onDemandOptions: CfnEC2Fleet.OnDemandOptionsRequestProperty.Builder.() -> Unit)

    public fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean)

    public fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable)

    public fun spotOptions(spotOptions: IResolvable)

    public fun spotOptions(spotOptions: CfnEC2Fleet.SpotOptionsRequestProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f6f3ed9b887bab23ab40d8ca03eae8cce7b8d9e53e1030f9b49651caf25f6f5")
    public fun spotOptions(spotOptions: CfnEC2Fleet.SpotOptionsRequestProperty.Builder.() -> Unit)

    public fun tagSpecifications(tagSpecifications: IResolvable)

    public fun tagSpecifications(tagSpecifications: List<Any>)

    public fun tagSpecifications(vararg tagSpecifications: Any)

    public fun targetCapacitySpecification(targetCapacitySpecification: IResolvable)

    public
        fun targetCapacitySpecification(targetCapacitySpecification: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81b1d42586c55d6d673218be0c158958f7fdec79271c464e78d67c7f098e0348")
    public
        fun targetCapacitySpecification(targetCapacitySpecification: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.Builder.() -> Unit)

    public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean)

    public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable)

    public fun type(type: String)

    public fun validFrom(validFrom: String)

    public fun validUntil(validUntil: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnEC2FleetProps.Builder =
        software.amazon.awscdk.services.ec2.CfnEC2FleetProps.builder()

    override fun context(context: String) {
      cdkBuilder.context(context)
    }

    override fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String) {
      cdkBuilder.excessCapacityTerminationPolicy(excessCapacityTerminationPolicy)
    }

    override fun launchTemplateConfigs(launchTemplateConfigs: IResolvable) {
      cdkBuilder.launchTemplateConfigs(launchTemplateConfigs.let(IResolvable::unwrap))
    }

    override fun launchTemplateConfigs(launchTemplateConfigs: List<Any>) {
      cdkBuilder.launchTemplateConfigs(launchTemplateConfigs)
    }

    override fun launchTemplateConfigs(vararg launchTemplateConfigs: Any): Unit =
        launchTemplateConfigs(launchTemplateConfigs.toList())

    override fun onDemandOptions(onDemandOptions: IResolvable) {
      cdkBuilder.onDemandOptions(onDemandOptions.let(IResolvable::unwrap))
    }

    override fun onDemandOptions(onDemandOptions: CfnEC2Fleet.OnDemandOptionsRequestProperty) {
      cdkBuilder.onDemandOptions(onDemandOptions.let(CfnEC2Fleet.OnDemandOptionsRequestProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaa7b2bfbe6b74008fc249f9186fc70a68fd8fe93b800c2e90c3430ce0609656")
    override
        fun onDemandOptions(onDemandOptions: CfnEC2Fleet.OnDemandOptionsRequestProperty.Builder.() -> Unit):
        Unit = onDemandOptions(CfnEC2Fleet.OnDemandOptionsRequestProperty(onDemandOptions))

    override fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean) {
      cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
    }

    override fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable) {
      cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances.let(IResolvable::unwrap))
    }

    override fun spotOptions(spotOptions: IResolvable) {
      cdkBuilder.spotOptions(spotOptions.let(IResolvable::unwrap))
    }

    override fun spotOptions(spotOptions: CfnEC2Fleet.SpotOptionsRequestProperty) {
      cdkBuilder.spotOptions(spotOptions.let(CfnEC2Fleet.SpotOptionsRequestProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f6f3ed9b887bab23ab40d8ca03eae8cce7b8d9e53e1030f9b49651caf25f6f5")
    override
        fun spotOptions(spotOptions: CfnEC2Fleet.SpotOptionsRequestProperty.Builder.() -> Unit):
        Unit = spotOptions(CfnEC2Fleet.SpotOptionsRequestProperty(spotOptions))

    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    override fun targetCapacitySpecification(targetCapacitySpecification: IResolvable) {
      cdkBuilder.targetCapacitySpecification(targetCapacitySpecification.let(IResolvable::unwrap))
    }

    override
        fun targetCapacitySpecification(targetCapacitySpecification: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty) {
      cdkBuilder.targetCapacitySpecification(targetCapacitySpecification.let(CfnEC2Fleet.TargetCapacitySpecificationRequestProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81b1d42586c55d6d673218be0c158958f7fdec79271c464e78d67c7f098e0348")
    override
        fun targetCapacitySpecification(targetCapacitySpecification: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.Builder.() -> Unit):
        Unit =
        targetCapacitySpecification(CfnEC2Fleet.TargetCapacitySpecificationRequestProperty(targetCapacitySpecification))

    override fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean) {
      cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration)
    }

    override fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable) {
      cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration.let(IResolvable::unwrap))
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun validFrom(validFrom: String) {
      cdkBuilder.validFrom(validFrom)
    }

    override fun validUntil(validUntil: String) {
      cdkBuilder.validUntil(validUntil)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEC2FleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnEC2FleetProps,
  ) : CdkObject(cdkObject), CfnEC2FleetProps {
    override fun context(): String? = unwrap(this).getContext()

    override fun excessCapacityTerminationPolicy(): String? =
        unwrap(this).getExcessCapacityTerminationPolicy()

    override fun launchTemplateConfigs(): Any = unwrap(this).getLaunchTemplateConfigs()

    override fun onDemandOptions(): Any? = unwrap(this).getOnDemandOptions()

    override fun replaceUnhealthyInstances(): Any? = unwrap(this).getReplaceUnhealthyInstances()

    override fun spotOptions(): Any? = unwrap(this).getSpotOptions()

    override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    override fun targetCapacitySpecification(): Any = unwrap(this).getTargetCapacitySpecification()

    override fun terminateInstancesWithExpiration(): Any? =
        unwrap(this).getTerminateInstancesWithExpiration()

    override fun type(): String? = unwrap(this).getType()

    override fun validFrom(): String? = unwrap(this).getValidFrom()

    override fun validUntil(): String? = unwrap(this).getValidUntil()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEC2FleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2FleetProps):
        CfnEC2FleetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEC2FleetProps):
        software.amazon.awscdk.services.ec2.CfnEC2FleetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnEC2FleetProps
  }
}
