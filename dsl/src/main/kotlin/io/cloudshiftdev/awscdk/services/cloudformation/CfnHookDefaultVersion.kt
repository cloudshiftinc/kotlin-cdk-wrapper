package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnHookDefaultVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun typeName(): String? = unwrap(this).getTypeName()

  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  public open fun typeVersionArn(): String? = unwrap(this).getTypeVersionArn()

  public open fun typeVersionArn(`value`: String) {
    unwrap(this).setTypeVersionArn(`value`)
  }

  public open fun versionId(): String? = unwrap(this).getVersionId()

  public open fun versionId(`value`: String) {
    unwrap(this).setVersionId(`value`)
  }

  public interface Builder {
    public fun typeName(typeName: String)

    public fun typeVersionArn(typeVersionArn: String)

    public fun versionId(versionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersion.Builder =
        software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersion.Builder.create(scope,
        id)

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    override fun typeVersionArn(typeVersionArn: String) {
      cdkBuilder.typeVersionArn(typeVersionArn)
    }

    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHookDefaultVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHookDefaultVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersion):
        CfnHookDefaultVersion = CfnHookDefaultVersion(cdkObject)

    internal fun unwrap(wrapped: CfnHookDefaultVersion):
        software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersion = wrapped.cdkObject
  }
}
