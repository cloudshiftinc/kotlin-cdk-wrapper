package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWebACLAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  public open fun webAclId(): String = unwrap(this).getWebAclId()

  public open fun webAclId(`value`: String) {
    unwrap(this).setWebAclId(`value`)
  }

  public interface Builder {
    public fun resourceArn(resourceArn: String) {
    }

    public fun webAclId(webAclId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation.Builder =
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation.Builder.create(scope, id)

    public override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    public override fun webAclId(webAclId: String) {
      cdkBuilder.webAclId(webAclId)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebACLAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebACLAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation):
        CfnWebACLAssociation = CfnWebACLAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnWebACLAssociation):
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation = wrapped.cdkObject
  }
}
