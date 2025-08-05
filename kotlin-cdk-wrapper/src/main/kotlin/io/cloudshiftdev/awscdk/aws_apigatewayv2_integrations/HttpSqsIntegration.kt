@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpIntegrationSubtype
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegration
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The Sqs integration resource for HTTP API.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegration;
 * IQueue queue;
 * HttpApi httpApi;
 * // default integration (send message)
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/default")
 * .methods(List.of(HttpMethod.POST))
 * .integration(HttpSqsIntegration.Builder.create("defaultIntegration")
 * .queue(queue)
 * .build())
 * .build());
 * // send message integration
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/send-message")
 * .methods(List.of(HttpMethod.POST))
 * .integration(HttpSqsIntegration.Builder.create("sendMessageIntegration")
 * .queue(queue)
 * .subtype(HttpIntegrationSubtype.SQS_SEND_MESSAGE)
 * .build())
 * .build());
 * // receive message integration
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/receive-message")
 * .methods(List.of(HttpMethod.POST))
 * .integration(HttpSqsIntegration.Builder.create("receiveMessageIntegration")
 * .queue(queue)
 * .subtype(HttpIntegrationSubtype.SQS_RECEIVE_MESSAGE)
 * .build())
 * .build());
 * // delete message integration
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/delete-message")
 * .methods(List.of(HttpMethod.POST))
 * .integration(HttpSqsIntegration.Builder.create("deleteMessageIntegration")
 * .queue(queue)
 * .subtype(HttpIntegrationSubtype.SQS_DELETE_MESSAGE)
 * .build())
 * .build());
 * // purge queue integration
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/purge-queue")
 * .methods(List.of(HttpMethod.POST))
 * .integration(HttpSqsIntegration.Builder.create("purgeQueueIntegration")
 * .queue(queue)
 * .subtype(HttpIntegrationSubtype.SQS_PURGE_QUEUE)
 * .build())
 * .build());
 * ```
 */
public open class HttpSqsIntegration(
  cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegration,
) : HttpRouteIntegration(cdkObject) {
  public constructor(id: String, props: HttpSqsIntegrationProps) :
      this(software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegration(id,
      props.let(HttpSqsIntegrationProps.Companion::unwrap))
  )

  public constructor(id: String, props: HttpSqsIntegrationProps.Builder.() -> Unit) : this(id,
      HttpSqsIntegrationProps(props)
  )

  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  public override fun bind(options: HttpRouteIntegrationBindOptions): HttpRouteIntegrationConfig =
      unwrap(this).bind(options.let(HttpRouteIntegrationBindOptions.Companion::unwrap)).let(HttpRouteIntegrationConfig::wrap)

  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adeb585f7d049df388aeb961213ea487ef99967ed3fab3c9dbfc7653776fc180")
  public override fun bind(options: HttpRouteIntegrationBindOptions.Builder.() -> Unit):
      HttpRouteIntegrationConfig = bind(HttpRouteIntegrationBindOptions(options))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: - specify `QueueUrl`. Additionally, set `MessageBody` to `$request.body.MessageBody`
     * for `SQS_SEND_MESSAGE` subtype
     * and set `ReceiptHandle` to `$request.body.ReceiptHandle` for `SQS_DELETE_MESSAGE` subtype.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html)
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend. 
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)

    /**
     * SQS queue that Integrates with API Gateway.
     *
     * @param queue SQS queue that Integrates with API Gateway. 
     */
    public fun queue(queue: IQueue)

    /**
     * The subtype of the HTTP integration.
     *
     * Only subtypes starting with SQS_ can be specified.
     *
     * Default: HttpIntegrationSubtype.SQS_SEND_MESSAGE
     *
     * @param subtype The subtype of the HTTP integration. 
     */
    public fun subtype(subtype: HttpIntegrationSubtype)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegration.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegration.Builder.create(id)

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: - specify `QueueUrl`. Additionally, set `MessageBody` to `$request.body.MessageBody`
     * for `SQS_SEND_MESSAGE` subtype
     * and set `ReceiptHandle` to `$request.body.ReceiptHandle` for `SQS_DELETE_MESSAGE` subtype.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html)
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend. 
     */
    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping.Companion::unwrap))
    }

    /**
     * SQS queue that Integrates with API Gateway.
     *
     * @param queue SQS queue that Integrates with API Gateway. 
     */
    override fun queue(queue: IQueue) {
      cdkBuilder.queue(queue.let(IQueue.Companion::unwrap))
    }

    /**
     * The subtype of the HTTP integration.
     *
     * Only subtypes starting with SQS_ can be specified.
     *
     * Default: HttpIntegrationSubtype.SQS_SEND_MESSAGE
     *
     * @param subtype The subtype of the HTTP integration. 
     */
    override fun subtype(subtype: HttpIntegrationSubtype) {
      cdkBuilder.subtype(subtype.let(HttpIntegrationSubtype.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(id: String, block: Builder.() -> Unit = {}): HttpSqsIntegration {
      val builderImpl = BuilderImpl(id)
      return HttpSqsIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegration):
        HttpSqsIntegration = HttpSqsIntegration(cdkObject)

    internal fun unwrap(wrapped: HttpSqsIntegration):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegration = wrapped.cdkObject
        as software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegration
  }
}
