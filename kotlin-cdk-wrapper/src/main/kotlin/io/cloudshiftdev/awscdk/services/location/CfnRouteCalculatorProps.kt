@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRouteCalculatorProps {
  public fun calculatorName(): String

  public fun dataSource(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun calculatorName(calculatorName: String)

    public fun dataSource(dataSource: String)

    public fun description(description: String)

    public fun pricingPlan(pricingPlan: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnRouteCalculatorProps.Builder
        = software.amazon.awscdk.services.location.CfnRouteCalculatorProps.builder()

    override fun calculatorName(calculatorName: String) {
      cdkBuilder.calculatorName(calculatorName)
    }

    override fun dataSource(dataSource: String) {
      cdkBuilder.dataSource(dataSource)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnRouteCalculatorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.location.CfnRouteCalculatorProps,
  ) : CdkObject(cdkObject), CfnRouteCalculatorProps {
    override fun calculatorName(): String = unwrap(this).getCalculatorName()

    override fun dataSource(): String = unwrap(this).getDataSource()

    override fun description(): String? = unwrap(this).getDescription()

    override fun pricingPlan(): String? = unwrap(this).getPricingPlan()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteCalculatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnRouteCalculatorProps):
        CfnRouteCalculatorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteCalculatorProps):
        software.amazon.awscdk.services.location.CfnRouteCalculatorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.location.CfnRouteCalculatorProps
  }
}
