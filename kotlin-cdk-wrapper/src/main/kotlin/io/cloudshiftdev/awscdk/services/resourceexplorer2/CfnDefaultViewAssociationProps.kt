@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourceexplorer2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDefaultViewAssociationProps {
  public fun viewArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun viewArn(viewArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps.Builder =
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps.builder()

    override fun viewArn(viewArn: String) {
      cdkBuilder.viewArn(viewArn)
    }

    public fun build():
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps,
  ) : CdkObject(cdkObject), CfnDefaultViewAssociationProps {
    override fun viewArn(): String = unwrap(this).getViewArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDefaultViewAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps):
        CfnDefaultViewAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDefaultViewAssociationProps):
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps
  }
}
