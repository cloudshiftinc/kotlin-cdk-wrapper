package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAlias internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kms.CfnAlias,
) : CfnResource(cdkObject), IInspectable {
  public open fun aliasName(): String = unwrap(this).getAliasName()

  public open fun aliasName(`value`: String) {
    unwrap(this).setAliasName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun targetKeyId(): String = unwrap(this).getTargetKeyId()

  public open fun targetKeyId(`value`: String) {
    unwrap(this).setTargetKeyId(`value`)
  }

  public interface Builder {
    public fun aliasName(aliasName: String)

    public fun targetKeyId(targetKeyId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.CfnAlias.Builder =
        software.amazon.awscdk.services.kms.CfnAlias.Builder.create(scope, id)

    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    override fun targetKeyId(targetKeyId: String) {
      cdkBuilder.targetKeyId(targetKeyId)
    }

    public fun build(): software.amazon.awscdk.services.kms.CfnAlias = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.CfnAlias): CfnAlias =
        CfnAlias(cdkObject)

    internal fun unwrap(wrapped: CfnAlias): software.amazon.awscdk.services.kms.CfnAlias =
        wrapped.cdkObject
  }
}
