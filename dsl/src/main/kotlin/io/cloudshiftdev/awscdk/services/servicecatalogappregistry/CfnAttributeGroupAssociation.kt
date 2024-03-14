package io.cloudshiftdev.awscdk.services.servicecatalogappregistry

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAttributeGroupAssociation internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun application(): String = unwrap(this).getApplication()

  public open fun application(`value`: String) {
    unwrap(this).setApplication(`value`)
  }

  public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

  public open fun attrAttributeGroupArn(): String = unwrap(this).getAttrAttributeGroupArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attributeGroup(): String = unwrap(this).getAttributeGroup()

  public open fun attributeGroup(`value`: String) {
    unwrap(this).setAttributeGroup(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun application(application: String)

    public fun attributeGroup(attributeGroup: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation.Builder
        =
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation.Builder.create(scope,
        id)

    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    override fun attributeGroup(attributeGroup: String) {
      cdkBuilder.attributeGroup(attributeGroup)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAttributeGroupAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAttributeGroupAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation):
        CfnAttributeGroupAssociation = CfnAttributeGroupAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnAttributeGroupAssociation):
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation =
        wrapped.cdkObject
  }
}
