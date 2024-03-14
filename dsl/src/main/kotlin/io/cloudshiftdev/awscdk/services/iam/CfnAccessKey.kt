package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccessKey internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.CfnAccessKey,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrSecretAccessKey(): String = unwrap(this).getAttrSecretAccessKey()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun serial(): Number? = unwrap(this).getSerial()

  public open fun serial(`value`: Number) {
    unwrap(this).setSerial(`value`)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public open fun userName(): String = unwrap(this).getUserName()

  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  public interface Builder {
    public fun serial(serial: Number) {
    }

    public fun status(status: String) {
    }

    public fun userName(userName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnAccessKey.Builder =
        software.amazon.awscdk.services.iam.CfnAccessKey.Builder.create(scope, id)

    public override fun serial(serial: Number) {
      cdkBuilder.serial(serial)
    }

    public override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnAccessKey = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnAccessKey): CfnAccessKey =
        CfnAccessKey(cdkObject)

    internal fun unwrap(wrapped: CfnAccessKey): software.amazon.awscdk.services.iam.CfnAccessKey =
        wrapped.cdkObject
  }
}
