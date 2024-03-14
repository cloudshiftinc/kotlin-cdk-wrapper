package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApiMapping internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiMapping,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun apiMappingKey(): String? = unwrap(this).getApiMappingKey()

  public open fun apiMappingKey(`value`: String) {
    unwrap(this).setApiMappingKey(`value`)
  }

  public open fun attrApiMappingId(): String = unwrap(this).getAttrApiMappingId()

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun stage(): String = unwrap(this).getStage()

  public open fun stage(`value`: String) {
    unwrap(this).setStage(`value`)
  }

  public interface Builder {
    public fun apiId(apiId: String)

    public fun apiMappingKey(apiMappingKey: String)

    public fun domainName(domainName: String)

    public fun stage(stage: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnApiMapping.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnApiMapping.Builder.create(scope, id)

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun apiMappingKey(apiMappingKey: String) {
      cdkBuilder.apiMappingKey(apiMappingKey)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApiMapping =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApiMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApiMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiMapping):
        CfnApiMapping = CfnApiMapping(cdkObject)

    internal fun unwrap(wrapped: CfnApiMapping):
        software.amazon.awscdk.services.apigatewayv2.CfnApiMapping = wrapped.cdkObject
  }
}
