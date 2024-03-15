@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Deployment of a REST API.
 *
 * An immutable representation of a RestApi resource that can be called by users
 * using Stages. A deployment must be associated with a Stage for it to be
 * callable over the Internet.
 *
 * Normally, you don't need to define deployments manually. The RestApi
 * construct manages a Deployment resource that represents the latest model. It
 * can be accessed through `restApi.latestDeployment` (unless `deploy: false` is
 * set when defining the `RestApi`).
 *
 * If you manually define this resource, you will need to know that since
 * deployments are immutable, as long as the resource's logical ID doesn't
 * change, the deployment will represent the snapshot in time in which the
 * resource was created. This means that if you modify the RestApi model (i.e.
 * add methods or resources), these changes will not be reflected unless a new
 * deployment resource is created.
 *
 * To achieve this behavior, the method `addToLogicalId(data)` can be used to
 * augment the logical ID generated for the deployment resource such that it
 * will include arbitrary data. This is done automatically for the
 * `restApi.latestDeployment` deployment.
 *
 * Furthermore, since a deployment does not reference any of the REST API
 * resources and methods, CloudFormation will likely provision it before these
 * resources are created, which means that it will represent a "half-baked"
 * model. Use the `node.addDependency(dep)` method to circumvent that. This is done
 * automatically for the `restApi.latestDeployment` deployment.
 *
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
public open class Deployment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.Deployment,
) : Resource(cdkObject) {
  /**
   * Adds a component to the hash that determines this Deployment resource's logical ID.
   *
   * This should be called by constructs of the API Gateway model that want to
   * invalidate the deployment when their settings change. The component will
   * be resolve()ed during synthesis so tokens are welcome.
   *
   * @param data 
   */
  public open fun addToLogicalId(`data`: Any) {
    unwrap(this).addToLogicalId(`data`)
  }

  /**
   *
   */
  public open fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

  /**
   *
   */
  public open fun deploymentId(): String = unwrap(this).getDeploymentId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.Deployment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Rest API to deploy.
     *
     * @param api The Rest API to deploy. 
     */
    public fun api(api: IRestApi)

    /**
     * A description of the purpose of the API Gateway deployment.
     *
     * Default: - No description.
     *
     * @param description A description of the purpose of the API Gateway deployment. 
     */
    public fun description(description: String)

    /**
     * When an API Gateway model is updated, a new deployment will automatically be created.
     *
     * If this is true, the old API Gateway Deployment resource will not be deleted.
     * This will allow manually reverting back to a previous deployment in case for example
     *
     * Default: false
     *
     * @param retainDeployments When an API Gateway model is updated, a new deployment will
     * automatically be created. 
     */
    public fun retainDeployments(retainDeployments: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.Deployment.Builder =
        software.amazon.awscdk.services.apigateway.Deployment.Builder.create(scope, id)

    /**
     * The Rest API to deploy.
     *
     * @param api The Rest API to deploy. 
     */
    override fun api(api: IRestApi) {
      cdkBuilder.api(api.let(IRestApi::unwrap))
    }

    /**
     * A description of the purpose of the API Gateway deployment.
     *
     * Default: - No description.
     *
     * @param description A description of the purpose of the API Gateway deployment. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * When an API Gateway model is updated, a new deployment will automatically be created.
     *
     * If this is true, the old API Gateway Deployment resource will not be deleted.
     * This will allow manually reverting back to a previous deployment in case for example
     *
     * Default: false
     *
     * @param retainDeployments When an API Gateway model is updated, a new deployment will
     * automatically be created. 
     */
    override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.Deployment = cdkBuilder.build()
  }

  public companion object {
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
