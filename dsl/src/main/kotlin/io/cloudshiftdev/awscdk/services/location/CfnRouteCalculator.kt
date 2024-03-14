package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRouteCalculator internal constructor(
  private val cdkObject: software.amazon.awscdk.services.location.CfnRouteCalculator,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCalculatorArn(): String = unwrap(this).getAttrCalculatorArn()

  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

  public open fun calculatorName(): String = unwrap(this).getCalculatorName()

  public open fun calculatorName(`value`: String) {
    unwrap(this).setCalculatorName(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun dataSource(): String = unwrap(this).getDataSource()

  public open fun dataSource(`value`: String) {
    unwrap(this).setDataSource(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  public open fun pricingPlan(`value`: String) {
    unwrap(this).setPricingPlan(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun calculatorName(calculatorName: String)

    public fun dataSource(dataSource: String)

    public fun description(description: String)

    public fun pricingPlan(pricingPlan: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnRouteCalculator.Builder =
        software.amazon.awscdk.services.location.CfnRouteCalculator.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.location.CfnRouteCalculator =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRouteCalculator {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRouteCalculator(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnRouteCalculator):
        CfnRouteCalculator = CfnRouteCalculator(cdkObject)

    internal fun unwrap(wrapped: CfnRouteCalculator):
        software.amazon.awscdk.services.location.CfnRouteCalculator = wrapped.cdkObject
  }
}
