package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBasePathMapping internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnBasePathMapping,
) : CfnResource(cdkObject), IInspectable {
  public open fun basePath(): String? = unwrap(this).getBasePath()

  public open fun basePath(`value`: String) {
    unwrap(this).setBasePath(`value`)
  }

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun id(): String? = unwrap(this).getId()

  public open fun id(`value`: String) {
    unwrap(this).setId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun restApiId(): String? = unwrap(this).getRestApiId()

  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  public open fun stage(): String? = unwrap(this).getStage()

  public open fun stage(`value`: String) {
    unwrap(this).setStage(`value`)
  }

  public interface Builder {
    public fun basePath(basePath: String) {
    }

    public fun domainName(domainName: String) {
    }

    public fun id(id: String) {
    }

    public fun restApiId(restApiId: String) {
    }

    public fun stage(stage: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnBasePathMapping.Builder =
        software.amazon.awscdk.services.apigateway.CfnBasePathMapping.Builder.create(scope, id)

    public override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun id(id: String) {
      cdkBuilder.id(id)
    }

    public override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnBasePathMapping =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBasePathMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBasePathMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnBasePathMapping):
        CfnBasePathMapping = CfnBasePathMapping(cdkObject)

    internal fun unwrap(wrapped: CfnBasePathMapping):
        software.amazon.awscdk.services.apigateway.CfnBasePathMapping = wrapped.cdkObject
  }
}
