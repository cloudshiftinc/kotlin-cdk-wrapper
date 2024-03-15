@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDeploymentStrategyProps {
  public fun deploymentDurationInMinutes(): Number

  public fun description(): String? = unwrap(this).getDescription()

  public fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

  public fun growthFactor(): Number

  public fun growthType(): String? = unwrap(this).getGrowthType()

  public fun name(): String

  public fun replicateTo(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun deploymentDurationInMinutes(deploymentDurationInMinutes: Number)

    public fun description(description: String)

    public fun finalBakeTimeInMinutes(finalBakeTimeInMinutes: Number)

    public fun growthFactor(growthFactor: Number)

    public fun growthType(growthType: String)

    public fun name(name: String)

    public fun replicateTo(replicateTo: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps.Builder =
        software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps.builder()

    override fun deploymentDurationInMinutes(deploymentDurationInMinutes: Number) {
      cdkBuilder.deploymentDurationInMinutes(deploymentDurationInMinutes)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun finalBakeTimeInMinutes(finalBakeTimeInMinutes: Number) {
      cdkBuilder.finalBakeTimeInMinutes(finalBakeTimeInMinutes)
    }

    override fun growthFactor(growthFactor: Number) {
      cdkBuilder.growthFactor(growthFactor)
    }

    override fun growthType(growthType: String) {
      cdkBuilder.growthType(growthType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun replicateTo(replicateTo: String) {
      cdkBuilder.replicateTo(replicateTo)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps,
  ) : CdkObject(cdkObject), CfnDeploymentStrategyProps {
    override fun deploymentDurationInMinutes(): Number =
        unwrap(this).getDeploymentDurationInMinutes()

    override fun description(): String? = unwrap(this).getDescription()

    override fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

    override fun growthFactor(): Number = unwrap(this).getGrowthFactor()

    override fun growthType(): String? = unwrap(this).getGrowthType()

    override fun name(): String = unwrap(this).getName()

    override fun replicateTo(): String = unwrap(this).getReplicateTo()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentStrategyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps):
        CfnDeploymentStrategyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentStrategyProps):
        software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps
  }
}
