@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRateBasedRuleProps {
  public fun matchPredicates(): Any? = unwrap(this).getMatchPredicates()

  public fun metricName(): String

  public fun name(): String

  public fun rateKey(): String

  public fun rateLimit(): Number

  @CdkDslMarker
  public interface Builder {
    public fun matchPredicates(matchPredicates: IResolvable)

    public fun matchPredicates(matchPredicates: List<Any>)

    public fun matchPredicates(vararg matchPredicates: Any)

    public fun metricName(metricName: String)

    public fun name(name: String)

    public fun rateKey(rateKey: String)

    public fun rateLimit(rateLimit: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps.builder()

    override fun matchPredicates(matchPredicates: IResolvable) {
      cdkBuilder.matchPredicates(matchPredicates.let(IResolvable::unwrap))
    }

    override fun matchPredicates(matchPredicates: List<Any>) {
      cdkBuilder.matchPredicates(matchPredicates)
    }

    override fun matchPredicates(vararg matchPredicates: Any): Unit =
        matchPredicates(matchPredicates.toList())

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rateKey(rateKey: String) {
      cdkBuilder.rateKey(rateKey)
    }

    override fun rateLimit(rateLimit: Number) {
      cdkBuilder.rateLimit(rateLimit)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps,
  ) : CdkObject(cdkObject), CfnRateBasedRuleProps {
    override fun matchPredicates(): Any? = unwrap(this).getMatchPredicates()

    override fun metricName(): String = unwrap(this).getMetricName()

    override fun name(): String = unwrap(this).getName()

    override fun rateKey(): String = unwrap(this).getRateKey()

    override fun rateLimit(): Number = unwrap(this).getRateLimit()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRateBasedRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps):
        CfnRateBasedRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRateBasedRuleProps):
        software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps
  }
}
