@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSqlInjectionMatchSetProps {
  public fun name(): String

  public fun sqlInjectionMatchTuples(): Any? = unwrap(this).getSqlInjectionMatchTuples()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable)

    public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: List<Any>)

    public fun sqlInjectionMatchTuples(vararg sqlInjectionMatchTuples: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable) {
      cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples.let(IResolvable::unwrap))
    }

    override fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: List<Any>) {
      cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples)
    }

    override fun sqlInjectionMatchTuples(vararg sqlInjectionMatchTuples: Any): Unit =
        sqlInjectionMatchTuples(sqlInjectionMatchTuples.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps,
  ) : CdkObject(cdkObject), CfnSqlInjectionMatchSetProps {
    override fun name(): String = unwrap(this).getName()

    override fun sqlInjectionMatchTuples(): Any? = unwrap(this).getSqlInjectionMatchTuples()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSqlInjectionMatchSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps):
        CfnSqlInjectionMatchSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSqlInjectionMatchSetProps):
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps
  }
}
