@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpIntegrationSubtype
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegration
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import io.cloudshiftdev.awscdk.services.stepfunctions.StateMachine
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The StepFunctions integration resource for HTTP API.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * StateMachine stateMachine;
 * HttpApi httpApi;
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/start")
 * .methods(List.of(HttpMethod.POST))
 * .integration(HttpStepFunctionsIntegration.Builder.create("StartExecutionIntegration")
 * .stateMachine(stateMachine)
 * .subtype(HttpIntegrationSubtype.STEPFUNCTIONS_START_EXECUTION)
 * .build())
 * .build());
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/start-sync")
 * .methods(List.of(HttpMethod.POST))
 * .integration(HttpStepFunctionsIntegration.Builder.create("StartSyncExecutionIntegration")
 * .stateMachine(stateMachine)
 * .subtype(HttpIntegrationSubtype.STEPFUNCTIONS_START_SYNC_EXECUTION)
 * .build())
 * .build());
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/stop")
 * .methods(List.of(HttpMethod.POST))
 * .integration(HttpStepFunctionsIntegration.Builder.create("StopExecutionIntegration")
 * .stateMachine(stateMachine)
 * .subtype(HttpIntegrationSubtype.STEPFUNCTIONS_STOP_EXECUTION)
 * // For the `STOP_EXECUTION` subtype, it is necessary to specify the `executionArn`.
 * .parameterMapping(new ParameterMapping().custom("ExecutionArn",
 * "$request.querystring.executionArn"))
 * .build())
 * .build());
 * ```
 */
public open class HttpStepFunctionsIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration,
) : HttpRouteIntegration(cdkObject) {
  public constructor(id: String, props: HttpStepFunctionsIntegrationProps) :
      this(software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration(id,
      props.let(HttpStepFunctionsIntegrationProps::unwrap))
  )

  public constructor(id: String, props: HttpStepFunctionsIntegrationProps.Builder.() -> Unit) :
      this(id, HttpStepFunctionsIntegrationProps(props)
  )

  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  public override fun bind(options: HttpRouteIntegrationBindOptions): HttpRouteIntegrationConfig =
      unwrap(this).bind(options.let(HttpRouteIntegrationBindOptions::unwrap)).let(HttpRouteIntegrationConfig::wrap)

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
   * [io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * When the subtype is either `START_EXECUTION` or `START_SYNC_EXECUTION`,
     * it is necessary to specify the `StateMachineArn`.
     * Conversely, when the subtype is `STOP_EXECUTION`, the `ExecutionArn` must be specified.
     *
     * Default: - specify only `StateMachineArn`
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend. 
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)

    /**
     * Statemachine that Integrates with API Gateway.
     *
     * @param stateMachine Statemachine that Integrates with API Gateway. 
     */
    public fun stateMachine(stateMachine: StateMachine)

    /**
     * The subtype of the HTTP integration.
     *
     * Only subtypes starting with STEPFUNCTIONS_ can be specified.
     *
     * Default: HttpIntegrationSubtype.STEPFUNCTIONS_START_EXECUTION
     *
     * @param subtype The subtype of the HTTP integration. 
     */
    public fun subtype(subtype: HttpIntegrationSubtype)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration.Builder.create(id)

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * When the subtype is either `START_EXECUTION` or `START_SYNC_EXECUTION`,
     * it is necessary to specify the `StateMachineArn`.
     * Conversely, when the subtype is `STOP_EXECUTION`, the `ExecutionArn` must be specified.
     *
     * Default: - specify only `StateMachineArn`
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend. 
     */
    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping::unwrap))
    }

    /**
     * Statemachine that Integrates with API Gateway.
     *
     * @param stateMachine Statemachine that Integrates with API Gateway. 
     */
    override fun stateMachine(stateMachine: StateMachine) {
      cdkBuilder.stateMachine(stateMachine.let(StateMachine::unwrap))
    }

    /**
     * The subtype of the HTTP integration.
     *
     * Only subtypes starting with STEPFUNCTIONS_ can be specified.
     *
     * Default: HttpIntegrationSubtype.STEPFUNCTIONS_START_EXECUTION
     *
     * @param subtype The subtype of the HTTP integration. 
     */
    override fun subtype(subtype: HttpIntegrationSubtype) {
      cdkBuilder.subtype(subtype.let(HttpIntegrationSubtype::unwrap))
    }

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(id: String, block: Builder.() -> Unit = {}):
        HttpStepFunctionsIntegration {
      val builderImpl = BuilderImpl(id)
      return HttpStepFunctionsIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration):
        HttpStepFunctionsIntegration = HttpStepFunctionsIntegration(cdkObject)

    internal fun unwrap(wrapped: HttpStepFunctionsIntegration):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration =
        wrapped.cdkObject
  }
}
