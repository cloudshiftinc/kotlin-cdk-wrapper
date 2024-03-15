@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface DeploymentProps {
  public fun api(): IRestApi

  public fun description(): String? = unwrap(this).getDescription()

  public fun retainDeployments(): Boolean? = unwrap(this).getRetainDeployments()

  @CdkDslMarker
  public interface Builder {
    public fun api(api: IRestApi)

    public fun description(description: String)

    public fun retainDeployments(retainDeployments: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.DeploymentProps.Builder =
        software.amazon.awscdk.services.apigateway.DeploymentProps.builder()

    override fun api(api: IRestApi) {
      cdkBuilder.api(api.let(IRestApi::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.DeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.DeploymentProps,
  ) : CdkObject(cdkObject), DeploymentProps {
    override fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun retainDeployments(): Boolean? = unwrap(this).getRetainDeployments()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.DeploymentProps):
        DeploymentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentProps):
        software.amazon.awscdk.services.apigateway.DeploymentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.DeploymentProps
  }
}
