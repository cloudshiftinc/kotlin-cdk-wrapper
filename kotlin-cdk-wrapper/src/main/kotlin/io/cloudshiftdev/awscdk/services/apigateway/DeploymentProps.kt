@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // production stage
 * LogGroup prodLogGroup = new LogGroup(this, "PrdLogs");
 * RestApi api = RestApi.Builder.create(this, "books")
 * .deployOptions(StageOptions.builder()
 * .accessLogDestination(new LogGroupLogDestination(prodLogGroup))
 * .accessLogFormat(AccessLogFormat.jsonWithStandardFields())
 * .build())
 * .build();
 * Deployment deployment = Deployment.Builder.create(this, "Deployment").api(api).build();
 * // development stage
 * LogGroup devLogGroup = new LogGroup(this, "DevLogs");
 * Stage.Builder.create(this, "dev")
 * .deployment(deployment)
 * .accessLogDestination(new LogGroupLogDestination(devLogGroup))
 * .accessLogFormat(AccessLogFormat.jsonWithStandardFields(JsonWithStandardFieldProps.builder()
 * .caller(false)
 * .httpMethod(true)
 * .ip(true)
 * .protocol(true)
 * .requestTime(true)
 * .resourcePath(true)
 * .responseLength(true)
 * .status(true)
 * .user(true)
 * .build()))
 * .build();
 * ```
 */
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
   * The name of the stage the API Gateway deployment deploys to.
   *
   * Default: - No stage name. If the `stageName` property is set but a stage with the
   * corresponding name does not exist, a new stage resource will be created with the
   * provided stage name.
   */
  public fun stageName(): String? = unwrap(this).getStageName()

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

    /**
     * @param stageName The name of the stage the API Gateway deployment deploys to.
     */
    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.DeploymentProps.Builder =
        software.amazon.awscdk.services.apigateway.DeploymentProps.builder()

    /**
     * @param api The Rest API to deploy. 
     */
    override fun api(api: IRestApi) {
      cdkBuilder.api(api.let(IRestApi.Companion::unwrap))
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

    /**
     * @param stageName The name of the stage the API Gateway deployment deploys to.
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.DeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.DeploymentProps,
  ) : CdkObject(cdkObject),
      DeploymentProps {
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

    /**
     * The name of the stage the API Gateway deployment deploys to.
     *
     * Default: - No stage name. If the `stageName` property is set but a stage with the
     * corresponding name does not exist, a new stage resource will be created with the
     * provided stage name.
     */
    override fun stageName(): String? = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.DeploymentProps):
        DeploymentProps = CdkObjectWrappers.wrap(cdkObject) as? DeploymentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentProps):
        software.amazon.awscdk.services.apigateway.DeploymentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.DeploymentProps
  }
}
