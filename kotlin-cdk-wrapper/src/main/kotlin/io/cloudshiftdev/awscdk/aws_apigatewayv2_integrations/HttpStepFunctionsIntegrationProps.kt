@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpIntegrationSubtype
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import io.cloudshiftdev.awscdk.services.stepfunctions.StateMachine
import kotlin.Unit

public interface HttpStepFunctionsIntegrationProps {
  public fun parameterMapping(): ParameterMapping? =
      unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

  public fun stateMachine(): StateMachine

  public fun subtype(): HttpIntegrationSubtype? =
      unwrap(this).getSubtype()?.let(HttpIntegrationSubtype::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun parameterMapping(parameterMapping: ParameterMapping)

    public fun stateMachine(stateMachine: StateMachine)

    public fun subtype(subtype: HttpIntegrationSubtype)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps.Builder
        =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps.builder()

    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping::unwrap))
    }

    override fun stateMachine(stateMachine: StateMachine) {
      cdkBuilder.stateMachine(stateMachine.let(StateMachine::unwrap))
    }

    override fun subtype(subtype: HttpIntegrationSubtype) {
      cdkBuilder.subtype(subtype.let(HttpIntegrationSubtype::unwrap))
    }

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps,
  ) : CdkObject(cdkObject), HttpStepFunctionsIntegrationProps {
    override fun parameterMapping(): ParameterMapping? =
        unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

    override fun stateMachine(): StateMachine =
        unwrap(this).getStateMachine().let(StateMachine::wrap)

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
        HttpStepFunctionsIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpStepFunctionsIntegrationProps):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps
  }
}
