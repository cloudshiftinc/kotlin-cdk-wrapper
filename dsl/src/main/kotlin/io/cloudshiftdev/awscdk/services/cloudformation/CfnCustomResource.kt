package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCustomResource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudformation.CfnCustomResource,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun serviceToken(): String = unwrap(this).getServiceToken()

  public open fun serviceToken(`value`: String) {
    unwrap(this).setServiceToken(`value`)
  }

  public interface Builder {
    public fun serviceToken(serviceToken: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnCustomResource.Builder
        = software.amazon.awscdk.services.cloudformation.CfnCustomResource.Builder.create(scope, id)

    public override fun serviceToken(serviceToken: String) {
      cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnCustomResource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnCustomResource):
        CfnCustomResource = CfnCustomResource(cdkObject)

    internal fun unwrap(wrapped: CfnCustomResource):
        software.amazon.awscdk.services.cloudformation.CfnCustomResource = wrapped.cdkObject
  }
}
