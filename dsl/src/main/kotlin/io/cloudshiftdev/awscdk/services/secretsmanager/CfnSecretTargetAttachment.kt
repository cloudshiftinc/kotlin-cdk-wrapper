package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecretTargetAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun secretId(): String = unwrap(this).getSecretId()

  public open fun secretId(`value`: String) {
    unwrap(this).setSecretId(`value`)
  }

  public open fun targetId(): String = unwrap(this).getTargetId()

  public open fun targetId(`value`: String) {
    unwrap(this).setTargetId(`value`)
  }

  public open fun targetType(): String = unwrap(this).getTargetType()

  public open fun targetType(`value`: String) {
    unwrap(this).setTargetType(`value`)
  }

  public interface Builder {
    public fun secretId(secretId: String) {
    }

    public fun targetId(targetId: String) {
    }

    public fun targetType(targetType: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment.Builder.create(scope,
        id)

    public override fun secretId(secretId: String) {
      cdkBuilder.secretId(secretId)
    }

    public override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    public override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecretTargetAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecretTargetAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment):
        CfnSecretTargetAttachment = CfnSecretTargetAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnSecretTargetAttachment):
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment = wrapped.cdkObject
  }
}
