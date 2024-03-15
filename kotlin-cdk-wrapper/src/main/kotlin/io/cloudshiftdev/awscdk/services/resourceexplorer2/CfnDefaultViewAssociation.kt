@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourceexplorer2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDefaultViewAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAssociatedAwsPrincipal(): String =
      unwrap(this).getAttrAssociatedAwsPrincipal()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun viewArn(): String = unwrap(this).getViewArn()

  public open fun viewArn(`value`: String) {
    unwrap(this).setViewArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun viewArn(viewArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation.Builder =
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation.Builder.create(scope,
        id)

    override fun viewArn(viewArn: String) {
      cdkBuilder.viewArn(viewArn)
    }

    public fun build(): software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDefaultViewAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDefaultViewAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation):
        CfnDefaultViewAssociation = CfnDefaultViewAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnDefaultViewAssociation):
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation =
        wrapped.cdkObject
  }
}
