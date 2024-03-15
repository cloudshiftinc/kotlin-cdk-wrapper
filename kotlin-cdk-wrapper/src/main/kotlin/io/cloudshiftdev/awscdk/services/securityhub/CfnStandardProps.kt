@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnStandardProps {
  public fun disabledStandardsControls(): Any? = unwrap(this).getDisabledStandardsControls()

  public fun standardsArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun disabledStandardsControls(disabledStandardsControls: IResolvable)

    public fun disabledStandardsControls(disabledStandardsControls: List<Any>)

    public fun disabledStandardsControls(vararg disabledStandardsControls: Any)

    public fun standardsArn(standardsArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnStandardProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnStandardProps.builder()

    override fun disabledStandardsControls(disabledStandardsControls: IResolvable) {
      cdkBuilder.disabledStandardsControls(disabledStandardsControls.let(IResolvable::unwrap))
    }

    override fun disabledStandardsControls(disabledStandardsControls: List<Any>) {
      cdkBuilder.disabledStandardsControls(disabledStandardsControls)
    }

    override fun disabledStandardsControls(vararg disabledStandardsControls: Any): Unit =
        disabledStandardsControls(disabledStandardsControls.toList())

    override fun standardsArn(standardsArn: String) {
      cdkBuilder.standardsArn(standardsArn)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnStandardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.securityhub.CfnStandardProps,
  ) : CdkObject(cdkObject), CfnStandardProps {
    override fun disabledStandardsControls(): Any? = unwrap(this).getDisabledStandardsControls()

    override fun standardsArn(): String = unwrap(this).getStandardsArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStandardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnStandardProps):
        CfnStandardProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStandardProps):
        software.amazon.awscdk.services.securityhub.CfnStandardProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.securityhub.CfnStandardProps
  }
}
