@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpIntegrationSubtype
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import io.cloudshiftdev.awscdk.services.stepfunctions.StateMachine
import kotlin.Unit

/**
 * Properties to initialize `HttpStepFunctionsIntegration`.
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
public interface HttpStepFunctionsIntegrationProps {
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
   */
  public fun parameterMapping(): ParameterMapping? =
      unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

  /**
   * Statemachine that Integrates with API Gateway.
   */
  public fun stateMachine(): StateMachine

  /**
   * The subtype of the HTTP integration.
   *
   * Only subtypes starting with STEPFUNCTIONS_ can be specified.
   *
   * Default: HttpIntegrationSubtype.STEPFUNCTIONS_START_EXECUTION
   */
  public fun subtype(): HttpIntegrationSubtype? =
      unwrap(this).getSubtype()?.let(HttpIntegrationSubtype::wrap)

  /**
   * A builder for [HttpStepFunctionsIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     * When the subtype is either `START_EXECUTION` or `START_SYNC_EXECUTION`,
     * it is necessary to specify the `StateMachineArn`.
     * Conversely, when the subtype is `STOP_EXECUTION`, the `ExecutionArn` must be specified.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)

    /**
     * @param stateMachine Statemachine that Integrates with API Gateway. 
     */
    public fun stateMachine(stateMachine: StateMachine)

    /**
     * @param subtype The subtype of the HTTP integration.
     * Only subtypes starting with STEPFUNCTIONS_ can be specified.
     */
    public fun subtype(subtype: HttpIntegrationSubtype)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps.Builder
        =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps.builder()

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     * When the subtype is either `START_EXECUTION` or `START_SYNC_EXECUTION`,
     * it is necessary to specify the `StateMachineArn`.
     * Conversely, when the subtype is `STOP_EXECUTION`, the `ExecutionArn` must be specified.
     */
    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping.Companion::unwrap))
    }

    /**
     * @param stateMachine Statemachine that Integrates with API Gateway. 
     */
    override fun stateMachine(stateMachine: StateMachine) {
      cdkBuilder.stateMachine(stateMachine.let(StateMachine.Companion::unwrap))
    }

    /**
     * @param subtype The subtype of the HTTP integration.
     * Only subtypes starting with STEPFUNCTIONS_ can be specified.
     */
    override fun subtype(subtype: HttpIntegrationSubtype) {
      cdkBuilder.subtype(subtype.let(HttpIntegrationSubtype.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps,
  ) : CdkObject(cdkObject), HttpStepFunctionsIntegrationProps {
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
     */
    override fun parameterMapping(): ParameterMapping? =
        unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

    /**
     * Statemachine that Integrates with API Gateway.
     */
    override fun stateMachine(): StateMachine =
        unwrap(this).getStateMachine().let(StateMachine::wrap)

    /**
     * The subtype of the HTTP integration.
     *
     * Only subtypes starting with STEPFUNCTIONS_ can be specified.
     *
     * Default: HttpIntegrationSubtype.STEPFUNCTIONS_START_EXECUTION
     */
    override fun subtype(): HttpIntegrationSubtype? =
        unwrap(this).getSubtype()?.let(HttpIntegrationSubtype::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpStepFunctionsIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps):
        HttpStepFunctionsIntegrationProps = CdkObjectWrappers.wrap(cdkObject) as?
        HttpStepFunctionsIntegrationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpStepFunctionsIntegrationProps):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps
  }
}
