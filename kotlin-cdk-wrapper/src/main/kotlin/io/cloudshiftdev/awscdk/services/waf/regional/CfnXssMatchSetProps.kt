@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnXssMatchSetProps {
  public fun name(): String

  public fun xssMatchTuples(): Any? = unwrap(this).getXssMatchTuples()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun xssMatchTuples(xssMatchTuples: IResolvable)

    public fun xssMatchTuples(xssMatchTuples: List<Any>)

    public fun xssMatchTuples(vararg xssMatchTuples: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps.Builder
        = software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun xssMatchTuples(xssMatchTuples: IResolvable) {
      cdkBuilder.xssMatchTuples(xssMatchTuples.let(IResolvable::unwrap))
    }

    override fun xssMatchTuples(xssMatchTuples: List<Any>) {
      cdkBuilder.xssMatchTuples(xssMatchTuples)
    }

    override fun xssMatchTuples(vararg xssMatchTuples: Any): Unit =
        xssMatchTuples(xssMatchTuples.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps,
  ) : CdkObject(cdkObject), CfnXssMatchSetProps {
    override fun name(): String = unwrap(this).getName()

    override fun xssMatchTuples(): Any? = unwrap(this).getXssMatchTuples()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnXssMatchSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps):
        CfnXssMatchSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnXssMatchSetProps):
        software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps
  }
}
