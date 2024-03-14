package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApiKey internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.CfnApiKey,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun attrApiKey(): String = unwrap(this).getAttrApiKey()

  public open fun attrApiKeyId(): String = unwrap(this).getAttrApiKeyId()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun expires(): Number? = unwrap(this).getExpires()

  public open fun expires(`value`: Number) {
    unwrap(this).setExpires(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun apiId(apiId: String) {
    }

    public fun description(description: String) {
    }

    public fun expires(expires: Number) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnApiKey.Builder =
        software.amazon.awscdk.services.appsync.CfnApiKey.Builder.create(scope, id)

    public override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun expires(expires: Number) {
      cdkBuilder.expires(expires)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnApiKey = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApiKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApiKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnApiKey): CfnApiKey =
        CfnApiKey(cdkObject)

    internal fun unwrap(wrapped: CfnApiKey): software.amazon.awscdk.services.appsync.CfnApiKey =
        wrapped.cdkObject
  }
}
