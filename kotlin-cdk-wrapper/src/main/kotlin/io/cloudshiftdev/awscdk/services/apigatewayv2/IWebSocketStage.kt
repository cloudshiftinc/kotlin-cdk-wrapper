@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the WebSocketStage.
 */
public interface IWebSocketStage : IStage {
  /**
   * The API this stage is associated to.
   */
  public fun api(): IWebSocketApi

  /**
   * The callback URL to this stage.
   *
   * You can use the callback URL to send messages to the client from the backend system.
   * https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-basic-concept.html
   * https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html
   */
  public fun callbackUrl(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketStage,
  ) : CdkObject(cdkObject), IWebSocketStage {
    /**
     * The API this stage is associated to.
     */
    override fun api(): IWebSocketApi = unwrap(this).getApi().let(IWebSocketApi::wrap)

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The callback URL to this stage.
     *
     * You can use the callback URL to send messages to the client from the backend system.
     * https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-basic-concept.html
     * https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html
     */
    override fun callbackUrl(): String = unwrap(this).getCallbackUrl()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Return the given named metric for this HTTP Api Gateway Stage.
     *
     * Default: - average over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this HTTP Api Gateway Stage.
     *
     * Default: - average over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this HTTP Api Gateway Stage.
     *
     * Default: - average over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The name of the stage;
     *
     * its primary identifier.
     */
    override fun stageName(): String = unwrap(this).getStageName()

    /**
     * The URL to this stage.
     */
    override fun url(): String = unwrap(this).getUrl()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketStage):
        IWebSocketStage = CdkObjectWrappers.wrap(cdkObject) as? IWebSocketStage ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IWebSocketStage):
        software.amazon.awscdk.services.apigatewayv2.IWebSocketStage = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IWebSocketStage
  }
}
