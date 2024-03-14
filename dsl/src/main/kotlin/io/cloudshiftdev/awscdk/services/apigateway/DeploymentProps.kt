package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface DeploymentProps {
  /**
   * The Rest API to deploy.
   */
  public fun api(): IRestApi

  /**
   * A description of the purpose of the API Gateway deployment.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * When an API Gateway model is updated, a new deployment will automatically be created.
   *
   * If this is true, the old API Gateway Deployment resource will not be deleted.
   * This will allow manually reverting back to a previous deployment in case for example
   *
   * Default: false
   */
  public fun retainDeployments(): Boolean? = unwrap(this).getRetainDeployments()

  /**
   * A builder for [DeploymentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The Rest API to deploy. 
     */
    public fun api(api: IRestApi)

    /**
     * @param description A description of the purpose of the API Gateway deployment.
     */
    public fun description(description: String)

    /**
     * @param retainDeployments When an API Gateway model is updated, a new deployment will
     * automatically be created.
     * If this is true, the old API Gateway Deployment resource will not be deleted.
     * This will allow manually reverting back to a previous deployment in case for example
     */
    public fun retainDeployments(retainDeployments: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.DeploymentProps.Builder =
        software.amazon.awscdk.services.apigateway.DeploymentProps.builder()

    /**
     * @param api The Rest API to deploy. 
     */
    override fun api(api: IRestApi) {
      cdkBuilder.api(api.let(IRestApi::unwrap))
    }

    /**
     * @param description A description of the purpose of the API Gateway deployment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param retainDeployments When an API Gateway model is updated, a new deployment will
     * automatically be created.
     * If this is true, the old API Gateway Deployment resource will not be deleted.
     * This will allow manually reverting back to a previous deployment in case for example
     */
    override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.DeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.DeploymentProps,
  ) : CdkObject(cdkObject), DeploymentProps {
    /**
     * The Rest API to deploy.
     */
    override fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

    /**
     * A description of the purpose of the API Gateway deployment.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * When an API Gateway model is updated, a new deployment will automatically be created.
     *
     * If this is true, the old API Gateway Deployment resource will not be deleted.
     * This will allow manually reverting back to a previous deployment in case for example
     *
     * Default: false
     */
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
