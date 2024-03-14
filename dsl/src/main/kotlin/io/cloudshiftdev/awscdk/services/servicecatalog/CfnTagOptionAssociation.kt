package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTagOptionAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceId(): String = unwrap(this).getResourceId()

  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  public open fun tagOptionId(): String = unwrap(this).getTagOptionId()

  public open fun tagOptionId(`value`: String) {
    unwrap(this).setTagOptionId(`value`)
  }

  public interface Builder {
    public fun resourceId(resourceId: String)

    public fun tagOptionId(tagOptionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation.Builder.create(scope,
        id)

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    override fun tagOptionId(tagOptionId: String) {
      cdkBuilder.tagOptionId(tagOptionId)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTagOptionAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTagOptionAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation):
        CfnTagOptionAssociation = CfnTagOptionAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnTagOptionAssociation):
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation = wrapped.cdkObject
  }
}
