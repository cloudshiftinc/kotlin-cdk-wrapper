@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSizeConstraintSetProps {
  public fun name(): String

  public fun sizeConstraints(): Any? = unwrap(this).getSizeConstraints()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun sizeConstraints(sizeConstraints: IResolvable)

    public fun sizeConstraints(sizeConstraints: List<Any>)

    public fun sizeConstraints(vararg sizeConstraints: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun sizeConstraints(sizeConstraints: IResolvable) {
      cdkBuilder.sizeConstraints(sizeConstraints.let(IResolvable::unwrap))
    }

    override fun sizeConstraints(sizeConstraints: List<Any>) {
      cdkBuilder.sizeConstraints(sizeConstraints)
    }

    override fun sizeConstraints(vararg sizeConstraints: Any): Unit =
        sizeConstraints(sizeConstraints.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps,
  ) : CdkObject(cdkObject), CfnSizeConstraintSetProps {
    override fun name(): String = unwrap(this).getName()

    override fun sizeConstraints(): Any? = unwrap(this).getSizeConstraints()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSizeConstraintSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps):
        CfnSizeConstraintSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSizeConstraintSetProps):
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps
  }
}
