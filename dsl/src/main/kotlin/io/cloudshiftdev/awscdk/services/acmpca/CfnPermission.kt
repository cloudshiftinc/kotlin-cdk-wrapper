package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPermission internal constructor(
  private val cdkObject: software.amazon.awscdk.services.acmpca.CfnPermission,
) : CfnResource(cdkObject), IInspectable {
  public open fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

  public open fun actions(`value`: List<String>) {
    unwrap(this).setActions(`value`)
  }

  public open fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

  public open fun certificateAuthorityArn(`value`: String) {
    unwrap(this).setCertificateAuthorityArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun principal(): String = unwrap(this).getPrincipal()

  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  public open fun sourceAccount(): String? = unwrap(this).getSourceAccount()

  public open fun sourceAccount(`value`: String) {
    unwrap(this).setSourceAccount(`value`)
  }

  public interface Builder {
    public fun actions(actions: List<String>)

    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    public fun principal(principal: String)

    public fun sourceAccount(sourceAccount: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.acmpca.CfnPermission.Builder =
        software.amazon.awscdk.services.acmpca.CfnPermission.Builder.create(scope, id)

    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    override fun sourceAccount(sourceAccount: String) {
      cdkBuilder.sourceAccount(sourceAccount)
    }

    public fun build(): software.amazon.awscdk.services.acmpca.CfnPermission = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPermission {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPermission(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnPermission):
        CfnPermission = CfnPermission(cdkObject)

    internal fun unwrap(wrapped: CfnPermission):
        software.amazon.awscdk.services.acmpca.CfnPermission = wrapped.cdkObject
  }
}
