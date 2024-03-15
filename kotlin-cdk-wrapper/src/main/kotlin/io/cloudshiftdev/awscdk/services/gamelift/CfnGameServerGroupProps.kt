@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnGameServerGroupProps {
  public fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

  public fun balancingStrategy(): String? = unwrap(this).getBalancingStrategy()

  public fun deleteOption(): String? = unwrap(this).getDeleteOption()

  public fun gameServerGroupName(): String

  public fun gameServerProtectionPolicy(): String? = unwrap(this).getGameServerProtectionPolicy()

  public fun instanceDefinitions(): Any

  public fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  public fun maxSize(): Number? = unwrap(this).getMaxSize()

  public fun minSize(): Number? = unwrap(this).getMinSize()

  public fun roleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcSubnets(): List<String> = unwrap(this).getVpcSubnets() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingPolicy(autoScalingPolicy: IResolvable)

    public fun autoScalingPolicy(autoScalingPolicy: CfnGameServerGroup.AutoScalingPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af7dc1465a3a84ffd047c419a400c11a0152ebdffbd3e92ca13af97ae423a7e5")
    public
        fun autoScalingPolicy(autoScalingPolicy: CfnGameServerGroup.AutoScalingPolicyProperty.Builder.() -> Unit)

    public fun balancingStrategy(balancingStrategy: String)

    public fun deleteOption(deleteOption: String)

    public fun gameServerGroupName(gameServerGroupName: String)

    public fun gameServerProtectionPolicy(gameServerProtectionPolicy: String)

    public fun instanceDefinitions(instanceDefinitions: IResolvable)

    public fun instanceDefinitions(instanceDefinitions: List<Any>)

    public fun instanceDefinitions(vararg instanceDefinitions: Any)

    public fun launchTemplate(launchTemplate: IResolvable)

    public fun launchTemplate(launchTemplate: CfnGameServerGroup.LaunchTemplateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9332f53c604d5d12f649c443bc6b4c8b45c59afc7bdc01cf5022db2d85ac0941")
    public
        fun launchTemplate(launchTemplate: CfnGameServerGroup.LaunchTemplateProperty.Builder.() -> Unit)

    public fun maxSize(maxSize: Number)

    public fun minSize(minSize: Number)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcSubnets(vpcSubnets: List<String>)

    public fun vpcSubnets(vararg vpcSubnets: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps.Builder
        = software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps.builder()

    override fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(IResolvable::unwrap))
    }

    override
        fun autoScalingPolicy(autoScalingPolicy: CfnGameServerGroup.AutoScalingPolicyProperty) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(CfnGameServerGroup.AutoScalingPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af7dc1465a3a84ffd047c419a400c11a0152ebdffbd3e92ca13af97ae423a7e5")
    override
        fun autoScalingPolicy(autoScalingPolicy: CfnGameServerGroup.AutoScalingPolicyProperty.Builder.() -> Unit):
        Unit = autoScalingPolicy(CfnGameServerGroup.AutoScalingPolicyProperty(autoScalingPolicy))

    override fun balancingStrategy(balancingStrategy: String) {
      cdkBuilder.balancingStrategy(balancingStrategy)
    }

    override fun deleteOption(deleteOption: String) {
      cdkBuilder.deleteOption(deleteOption)
    }

    override fun gameServerGroupName(gameServerGroupName: String) {
      cdkBuilder.gameServerGroupName(gameServerGroupName)
    }

    override fun gameServerProtectionPolicy(gameServerProtectionPolicy: String) {
      cdkBuilder.gameServerProtectionPolicy(gameServerProtectionPolicy)
    }

    override fun instanceDefinitions(instanceDefinitions: IResolvable) {
      cdkBuilder.instanceDefinitions(instanceDefinitions.let(IResolvable::unwrap))
    }

    override fun instanceDefinitions(instanceDefinitions: List<Any>) {
      cdkBuilder.instanceDefinitions(instanceDefinitions)
    }

    override fun instanceDefinitions(vararg instanceDefinitions: Any): Unit =
        instanceDefinitions(instanceDefinitions.toList())

    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

    override fun launchTemplate(launchTemplate: CfnGameServerGroup.LaunchTemplateProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(CfnGameServerGroup.LaunchTemplateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9332f53c604d5d12f649c443bc6b4c8b45c59afc7bdc01cf5022db2d85ac0941")
    override
        fun launchTemplate(launchTemplate: CfnGameServerGroup.LaunchTemplateProperty.Builder.() -> Unit):
        Unit = launchTemplate(CfnGameServerGroup.LaunchTemplateProperty(launchTemplate))

    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcSubnets(vpcSubnets: List<String>) {
      cdkBuilder.vpcSubnets(vpcSubnets)
    }

    override fun vpcSubnets(vararg vpcSubnets: String): Unit = vpcSubnets(vpcSubnets.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps,
  ) : CdkObject(cdkObject), CfnGameServerGroupProps {
    override fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

    override fun balancingStrategy(): String? = unwrap(this).getBalancingStrategy()

    override fun deleteOption(): String? = unwrap(this).getDeleteOption()

    override fun gameServerGroupName(): String = unwrap(this).getGameServerGroupName()

    override fun gameServerProtectionPolicy(): String? =
        unwrap(this).getGameServerProtectionPolicy()

    override fun instanceDefinitions(): Any = unwrap(this).getInstanceDefinitions()

    override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

    override fun maxSize(): Number? = unwrap(this).getMaxSize()

    override fun minSize(): Number? = unwrap(this).getMinSize()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcSubnets(): List<String> = unwrap(this).getVpcSubnets() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGameServerGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps):
        CfnGameServerGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGameServerGroupProps):
        software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps
  }
}
