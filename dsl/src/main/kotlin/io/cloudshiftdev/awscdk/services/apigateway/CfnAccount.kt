package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccount internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnAccount,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cloudWatchRoleArn(): String? = unwrap(this).getCloudWatchRoleArn()

  public open fun cloudWatchRoleArn(`value`: String) {
    unwrap(this).setCloudWatchRoleArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun cloudWatchRoleArn(cloudWatchRoleArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnAccount.Builder =
        software.amazon.awscdk.services.apigateway.CfnAccount.Builder.create(scope, id)

    public override fun cloudWatchRoleArn(cloudWatchRoleArn: String) {
      cdkBuilder.cloudWatchRoleArn(cloudWatchRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnAccount = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccount {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccount(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnAccount): CfnAccount
        = CfnAccount(cdkObject)

    internal fun unwrap(wrapped: CfnAccount): software.amazon.awscdk.services.apigateway.CfnAccount
        = wrapped.cdkObject
  }
}
