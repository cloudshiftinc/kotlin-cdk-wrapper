package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDocumentationVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun documentationVersion(): String = unwrap(this).getDocumentationVersion()

  public open fun documentationVersion(`value`: String) {
    unwrap(this).setDocumentationVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun restApiId(): String = unwrap(this).getRestApiId()

  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun documentationVersion(documentationVersion: String)

    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersion.Builder =
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersion.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun documentationVersion(documentationVersion: String) {
      cdkBuilder.documentationVersion(documentationVersion)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDocumentationVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDocumentationVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDocumentationVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationVersion):
        CfnDocumentationVersion = CfnDocumentationVersion(cdkObject)

    internal fun unwrap(wrapped: CfnDocumentationVersion):
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersion = wrapped.cdkObject
  }
}
