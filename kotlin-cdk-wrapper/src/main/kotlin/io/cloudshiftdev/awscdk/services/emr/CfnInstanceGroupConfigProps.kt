@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnInstanceGroupConfigProps {
  public fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

  public fun bidPrice(): String? = unwrap(this).getBidPrice()

  public fun configurations(): Any? = unwrap(this).getConfigurations()

  public fun customAmiId(): String? = unwrap(this).getCustomAmiId()

  public fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

  public fun instanceCount(): Number

  public fun instanceRole(): String

  public fun instanceType(): String

  public fun jobFlowId(): String

  public fun market(): String? = unwrap(this).getMarket()

  public fun name(): String? = unwrap(this).getName()

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingPolicy(autoScalingPolicy: IResolvable)

    public
        fun autoScalingPolicy(autoScalingPolicy: CfnInstanceGroupConfig.AutoScalingPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c77469ce0a8910e5660e4e7165b7a702421295111d465a666f7e13b46ac2f56")
    public
        fun autoScalingPolicy(autoScalingPolicy: CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder.() -> Unit)

    public fun bidPrice(bidPrice: String)

    public fun configurations(configurations: IResolvable)

    public fun configurations(configurations: List<Any>)

    public fun configurations(vararg configurations: Any)

    public fun customAmiId(customAmiId: String)

    public fun ebsConfiguration(ebsConfiguration: IResolvable)

    public fun ebsConfiguration(ebsConfiguration: CfnInstanceGroupConfig.EbsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1237a96e8a338e38523c58a7a4468de8e20eea902b7f50c54927bb9611523942")
    public
        fun ebsConfiguration(ebsConfiguration: CfnInstanceGroupConfig.EbsConfigurationProperty.Builder.() -> Unit)

    public fun instanceCount(instanceCount: Number)

    public fun instanceRole(instanceRole: String)

    public fun instanceType(instanceType: String)

    public fun jobFlowId(jobFlowId: String)

    public fun market(market: String)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder
        = software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.builder()

    override fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(IResolvable::unwrap))
    }

    override
        fun autoScalingPolicy(autoScalingPolicy: CfnInstanceGroupConfig.AutoScalingPolicyProperty) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(CfnInstanceGroupConfig.AutoScalingPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c77469ce0a8910e5660e4e7165b7a702421295111d465a666f7e13b46ac2f56")
    override
        fun autoScalingPolicy(autoScalingPolicy: CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder.() -> Unit):
        Unit =
        autoScalingPolicy(CfnInstanceGroupConfig.AutoScalingPolicyProperty(autoScalingPolicy))

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

    override
        fun ebsConfiguration(ebsConfiguration: CfnInstanceGroupConfig.EbsConfigurationProperty) {
      cdkBuilder.ebsConfiguration(ebsConfiguration.let(CfnInstanceGroupConfig.EbsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1237a96e8a338e38523c58a7a4468de8e20eea902b7f50c54927bb9611523942")
    override
        fun ebsConfiguration(ebsConfiguration: CfnInstanceGroupConfig.EbsConfigurationProperty.Builder.() -> Unit):
        Unit = ebsConfiguration(CfnInstanceGroupConfig.EbsConfigurationProperty(ebsConfiguration))

    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    override fun instanceRole(instanceRole: String) {
      cdkBuilder.instanceRole(instanceRole)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun jobFlowId(jobFlowId: String) {
      cdkBuilder.jobFlowId(jobFlowId)
    }

    override fun market(market: String) {
      cdkBuilder.market(market)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps,
  ) : CdkObject(cdkObject), CfnInstanceGroupConfigProps {
    override fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

    override fun bidPrice(): String? = unwrap(this).getBidPrice()

    override fun configurations(): Any? = unwrap(this).getConfigurations()

    override fun customAmiId(): String? = unwrap(this).getCustomAmiId()

    override fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

    override fun instanceCount(): Number = unwrap(this).getInstanceCount()

    override fun instanceRole(): String = unwrap(this).getInstanceRole()

    override fun instanceType(): String = unwrap(this).getInstanceType()

    override fun jobFlowId(): String = unwrap(this).getJobFlowId()

    override fun market(): String? = unwrap(this).getMarket()

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceGroupConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps):
        CfnInstanceGroupConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceGroupConfigProps):
        software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps
  }
}
