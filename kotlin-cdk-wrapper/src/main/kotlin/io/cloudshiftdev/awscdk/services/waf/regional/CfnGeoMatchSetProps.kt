@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnGeoMatchSetProps {
  public fun geoMatchConstraints(): Any? = unwrap(this).getGeoMatchConstraints()

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun geoMatchConstraints(geoMatchConstraints: IResolvable)

    public fun geoMatchConstraints(geoMatchConstraints: List<Any>)

    public fun geoMatchConstraints(vararg geoMatchConstraints: Any)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps.Builder
        = software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps.builder()

    override fun geoMatchConstraints(geoMatchConstraints: IResolvable) {
      cdkBuilder.geoMatchConstraints(geoMatchConstraints.let(IResolvable::unwrap))
    }

    override fun geoMatchConstraints(geoMatchConstraints: List<Any>) {
      cdkBuilder.geoMatchConstraints(geoMatchConstraints)
    }

    override fun geoMatchConstraints(vararg geoMatchConstraints: Any): Unit =
        geoMatchConstraints(geoMatchConstraints.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps,
  ) : CdkObject(cdkObject), CfnGeoMatchSetProps {
    override fun geoMatchConstraints(): Any? = unwrap(this).getGeoMatchConstraints()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGeoMatchSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps):
        CfnGeoMatchSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGeoMatchSetProps):
        software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps
  }
}
