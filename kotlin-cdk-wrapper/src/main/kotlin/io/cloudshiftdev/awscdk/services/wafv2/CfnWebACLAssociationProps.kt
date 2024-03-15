@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnWebACLAssociationProps {
  public fun resourceArn(): String

  public fun webAclArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun resourceArn(resourceArn: String)

    public fun webAclArn(webAclArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps.Builder
        = software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps.builder()

    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    override fun webAclArn(webAclArn: String) {
      cdkBuilder.webAclArn(webAclArn)
    }

    public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps,
  ) : CdkObject(cdkObject), CfnWebACLAssociationProps {
    override fun resourceArn(): String = unwrap(this).getResourceArn()

    override fun webAclArn(): String = unwrap(this).getWebAclArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebACLAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps):
        CfnWebACLAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebACLAssociationProps):
        software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps
  }
}
