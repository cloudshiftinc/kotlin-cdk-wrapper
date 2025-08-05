@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpIntegrationSubtype
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Unit

/**
 * Properties to initialize `HttpSqsIntegration`.
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
public interface HttpSqsIntegrationProps {
  /**
   * Specifies how to transform HTTP requests before sending them to the backend.
   *
   * Default: - specify `QueueUrl`. Additionally, set `MessageBody` to `$request.body.MessageBody`
   * for `SQS_SEND_MESSAGE` subtype
   * and set `ReceiptHandle` to `$request.body.ReceiptHandle` for `SQS_DELETE_MESSAGE` subtype.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html)
   */
  public fun parameterMapping(): ParameterMapping? =
      unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

  /**
   * SQS queue that Integrates with API Gateway.
   */
  public fun queue(): IQueue

  /**
   * The subtype of the HTTP integration.
   *
   * Only subtypes starting with SQS_ can be specified.
   *
   * Default: HttpIntegrationSubtype.SQS_SEND_MESSAGE
   */
  public fun subtype(): HttpIntegrationSubtype? =
      unwrap(this).getSubtype()?.let(HttpIntegrationSubtype::wrap)

  /**
   * A builder for [HttpSqsIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)

    /**
     * @param queue SQS queue that Integrates with API Gateway. 
     */
    public fun queue(queue: IQueue)

    /**
     * @param subtype The subtype of the HTTP integration.
     * Only subtypes starting with SQS_ can be specified.
     */
    public fun subtype(subtype: HttpIntegrationSubtype)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegrationProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegrationProps.builder()

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     */
    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping.Companion::unwrap))
    }

    /**
     * @param queue SQS queue that Integrates with API Gateway. 
     */
    override fun queue(queue: IQueue) {
      cdkBuilder.queue(queue.let(IQueue.Companion::unwrap))
    }

    /**
     * @param subtype The subtype of the HTTP integration.
     * Only subtypes starting with SQS_ can be specified.
     */
    override fun subtype(subtype: HttpIntegrationSubtype) {
      cdkBuilder.subtype(subtype.let(HttpIntegrationSubtype.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegrationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegrationProps,
  ) : CdkObject(cdkObject),
      HttpSqsIntegrationProps {
    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: - specify `QueueUrl`. Additionally, set `MessageBody` to `$request.body.MessageBody`
     * for `SQS_SEND_MESSAGE` subtype
     * and set `ReceiptHandle` to `$request.body.ReceiptHandle` for `SQS_DELETE_MESSAGE` subtype.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html)
     */
    override fun parameterMapping(): ParameterMapping? =
        unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

    /**
     * SQS queue that Integrates with API Gateway.
     */
    override fun queue(): IQueue = unwrap(this).getQueue().let(IQueue::wrap)

    /**
     * The subtype of the HTTP integration.
     *
     * Only subtypes starting with SQS_ can be specified.
     *
     * Default: HttpIntegrationSubtype.SQS_SEND_MESSAGE
     */
    override fun subtype(): HttpIntegrationSubtype? =
        unwrap(this).getSubtype()?.let(HttpIntegrationSubtype::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpSqsIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegrationProps):
        HttpSqsIntegrationProps = CdkObjectWrappers.wrap(cdkObject) as? HttpSqsIntegrationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpSqsIntegrationProps):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegrationProps
  }
}
