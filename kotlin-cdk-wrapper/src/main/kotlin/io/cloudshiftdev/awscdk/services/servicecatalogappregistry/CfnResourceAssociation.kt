@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalogappregistry

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun application(): String = unwrap(this).getApplication()

  public open fun application(`value`: String) {
    unwrap(this).setApplication(`value`)
  }

  public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resource(): String = unwrap(this).getResource()

  public open fun resource(`value`: String) {
    unwrap(this).setResource(`value`)
  }

  public open fun resourceType(): String = unwrap(this).getResourceType()

  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun application(application: String)

    public fun resource(resource: String)

    public fun resourceType(resourceType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation.Builder =
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation.Builder.create(scope,
        id)

    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    override fun resource(resource: String) {
      cdkBuilder.resource(resource)
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation):
        CfnResourceAssociation = CfnResourceAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnResourceAssociation):
        software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation =
        wrapped.cdkObject
  }
}
