@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRuleProps {
  public fun metricName(): String

  public fun name(): String

  public fun predicates(): Any? = unwrap(this).getPredicates()

  @CdkDslMarker
  public interface Builder {
    public fun metricName(metricName: String)

    public fun name(name: String)

    public fun predicates(predicates: IResolvable)

    public fun predicates(predicates: List<Any>)

    public fun predicates(vararg predicates: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnRuleProps.Builder =
        software.amazon.awscdk.services.waf.CfnRuleProps.builder()

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun predicates(predicates: IResolvable) {
      cdkBuilder.predicates(predicates.let(IResolvable::unwrap))
    }

    override fun predicates(predicates: List<Any>) {
      cdkBuilder.predicates(predicates)
    }

    override fun predicates(vararg predicates: Any): Unit = predicates(predicates.toList())

    public fun build(): software.amazon.awscdk.services.waf.CfnRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.CfnRuleProps,
  ) : CdkObject(cdkObject), CfnRuleProps {
    override fun metricName(): String = unwrap(this).getMetricName()

    override fun name(): String = unwrap(this).getName()

    override fun predicates(): Any? = unwrap(this).getPredicates()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnRuleProps): CfnRuleProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleProps): software.amazon.awscdk.services.waf.CfnRuleProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.waf.CfnRuleProps
  }
}
