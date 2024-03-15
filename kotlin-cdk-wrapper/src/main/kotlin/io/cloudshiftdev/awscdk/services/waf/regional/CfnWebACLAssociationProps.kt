@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnWebACLAssociationProps {
  public fun resourceArn(): String

  public fun webAclId(): String

  @CdkDslMarker
  public interface Builder {
    public fun resourceArn(resourceArn: String)

    public fun webAclId(webAclId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps.builder()

    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    override fun webAclId(webAclId: String) {
      cdkBuilder.webAclId(webAclId)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps,
  ) : CdkObject(cdkObject), CfnWebACLAssociationProps {
    override fun resourceArn(): String = unwrap(this).getResourceArn()

    override fun webAclId(): String = unwrap(this).getWebAclId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebACLAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps):
        CfnWebACLAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebACLAssociationProps):
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps
  }
}
