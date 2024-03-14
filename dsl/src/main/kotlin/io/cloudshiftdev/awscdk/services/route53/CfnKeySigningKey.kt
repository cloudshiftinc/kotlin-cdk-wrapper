package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnKeySigningKey internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.CfnKeySigningKey,
) : CfnResource(cdkObject), IInspectable {
  public open fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

  public open fun hostedZoneId(`value`: String) {
    unwrap(this).setHostedZoneId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keyManagementServiceArn(): String = unwrap(this).getKeyManagementServiceArn()

  public open fun keyManagementServiceArn(`value`: String) {
    unwrap(this).setKeyManagementServiceArn(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun status(): String = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public interface Builder {
    public fun hostedZoneId(hostedZoneId: String) {
    }

    public fun keyManagementServiceArn(keyManagementServiceArn: String) {
    }

    public fun name(name: String) {
    }

    public fun status(status: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnKeySigningKey.Builder =
        software.amazon.awscdk.services.route53.CfnKeySigningKey.Builder.create(scope, id)

    public override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public override fun keyManagementServiceArn(keyManagementServiceArn: String) {
      cdkBuilder.keyManagementServiceArn(keyManagementServiceArn)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnKeySigningKey =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKeySigningKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKeySigningKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnKeySigningKey):
        CfnKeySigningKey = CfnKeySigningKey(cdkObject)

    internal fun unwrap(wrapped: CfnKeySigningKey):
        software.amazon.awscdk.services.route53.CfnKeySigningKey = wrapped.cdkObject
  }
}
