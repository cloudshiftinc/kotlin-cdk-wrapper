package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Deployment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.Deployment,
) : Resource(cdkObject) {
  public open fun addToLogicalId(`data`: Any) {
    unwrap(this).addToLogicalId(`data`)
  }

  public open fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

  public open fun deploymentId(): String = unwrap(this).getDeploymentId()

  public interface Builder {
    public fun api(api: IRestApi)

    public fun description(description: String)

    public fun retainDeployments(retainDeployments: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.Deployment.Builder =
        software.amazon.awscdk.services.apigateway.Deployment.Builder.create(scope, id)

    override fun api(api: IRestApi) {
      cdkBuilder.api(api.let(IRestApi::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.Deployment = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Deployment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Deployment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.Deployment): Deployment
        = Deployment(cdkObject)

    internal fun unwrap(wrapped: Deployment): software.amazon.awscdk.services.apigateway.Deployment
        = wrapped.cdkObject
  }
}
