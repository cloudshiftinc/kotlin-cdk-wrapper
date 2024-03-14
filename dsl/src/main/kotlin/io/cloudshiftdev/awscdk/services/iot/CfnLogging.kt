package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLogging internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnLogging,
) : CfnResource(cdkObject), IInspectable {
  public open fun accountId(): String = unwrap(this).getAccountId()

  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  public open fun defaultLogLevel(): String = unwrap(this).getDefaultLogLevel()

  public open fun defaultLogLevel(`value`: String) {
    unwrap(this).setDefaultLogLevel(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public interface Builder {
    public fun accountId(accountId: String)

    public fun defaultLogLevel(defaultLogLevel: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnLogging.Builder =
        software.amazon.awscdk.services.iot.CfnLogging.Builder.create(scope, id)

    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    override fun defaultLogLevel(defaultLogLevel: String) {
      cdkBuilder.defaultLogLevel(defaultLogLevel)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnLogging = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogging {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogging(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnLogging): CfnLogging =
        CfnLogging(cdkObject)

    internal fun unwrap(wrapped: CfnLogging): software.amazon.awscdk.services.iot.CfnLogging =
        wrapped.cdkObject
  }
}
