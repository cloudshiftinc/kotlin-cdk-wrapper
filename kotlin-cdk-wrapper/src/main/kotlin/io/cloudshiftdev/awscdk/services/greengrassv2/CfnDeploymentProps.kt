@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrassv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnDeploymentProps {
  public fun components(): Any? = unwrap(this).getComponents()

  public fun deploymentName(): String? = unwrap(this).getDeploymentName()

  public fun deploymentPolicies(): Any? = unwrap(this).getDeploymentPolicies()

  public fun iotJobConfiguration(): Any? = unwrap(this).getIotJobConfiguration()

  public fun parentTargetArn(): String? = unwrap(this).getParentTargetArn()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun targetArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun components(components: IResolvable)

    public fun components(components: Map<String, Any>)

    public fun deploymentName(deploymentName: String)

    public fun deploymentPolicies(deploymentPolicies: IResolvable)

    public fun deploymentPolicies(deploymentPolicies: CfnDeployment.DeploymentPoliciesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2969602c296659fd60db1407e77255f5f8635043c28de1d9abc8e8c593c8c1eb")
    public
        fun deploymentPolicies(deploymentPolicies: CfnDeployment.DeploymentPoliciesProperty.Builder.() -> Unit)

    public fun iotJobConfiguration(iotJobConfiguration: IResolvable)

    public
        fun iotJobConfiguration(iotJobConfiguration: CfnDeployment.DeploymentIoTJobConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7318a6268df3159d19417903291d4d0d880c94c524dd690ea603823570c3d544")
    public
        fun iotJobConfiguration(iotJobConfiguration: CfnDeployment.DeploymentIoTJobConfigurationProperty.Builder.() -> Unit)

    public fun parentTargetArn(parentTargetArn: String)

    public fun tags(tags: Map<String, String>)

    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps.Builder
        = software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps.builder()

    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

    override fun components(components: Map<String, Any>) {
      cdkBuilder.components(components)
    }

    override fun deploymentName(deploymentName: String) {
      cdkBuilder.deploymentName(deploymentName)
    }

    override fun deploymentPolicies(deploymentPolicies: IResolvable) {
      cdkBuilder.deploymentPolicies(deploymentPolicies.let(IResolvable::unwrap))
    }

    override fun deploymentPolicies(deploymentPolicies: CfnDeployment.DeploymentPoliciesProperty) {
      cdkBuilder.deploymentPolicies(deploymentPolicies.let(CfnDeployment.DeploymentPoliciesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2969602c296659fd60db1407e77255f5f8635043c28de1d9abc8e8c593c8c1eb")
    override
        fun deploymentPolicies(deploymentPolicies: CfnDeployment.DeploymentPoliciesProperty.Builder.() -> Unit):
        Unit = deploymentPolicies(CfnDeployment.DeploymentPoliciesProperty(deploymentPolicies))

    override fun iotJobConfiguration(iotJobConfiguration: IResolvable) {
      cdkBuilder.iotJobConfiguration(iotJobConfiguration.let(IResolvable::unwrap))
    }

    override
        fun iotJobConfiguration(iotJobConfiguration: CfnDeployment.DeploymentIoTJobConfigurationProperty) {
      cdkBuilder.iotJobConfiguration(iotJobConfiguration.let(CfnDeployment.DeploymentIoTJobConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7318a6268df3159d19417903291d4d0d880c94c524dd690ea603823570c3d544")
    override
        fun iotJobConfiguration(iotJobConfiguration: CfnDeployment.DeploymentIoTJobConfigurationProperty.Builder.() -> Unit):
        Unit =
        iotJobConfiguration(CfnDeployment.DeploymentIoTJobConfigurationProperty(iotJobConfiguration))

    override fun parentTargetArn(parentTargetArn: String) {
      cdkBuilder.parentTargetArn(parentTargetArn)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps,
  ) : CdkObject(cdkObject), CfnDeploymentProps {
    override fun components(): Any? = unwrap(this).getComponents()

    override fun deploymentName(): String? = unwrap(this).getDeploymentName()

    override fun deploymentPolicies(): Any? = unwrap(this).getDeploymentPolicies()

    override fun iotJobConfiguration(): Any? = unwrap(this).getIotJobConfiguration()

    override fun parentTargetArn(): String? = unwrap(this).getParentTargetArn()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun targetArn(): String = unwrap(this).getTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps):
        CfnDeploymentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentProps):
        software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps
  }
}
