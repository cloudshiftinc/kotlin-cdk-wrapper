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

public open class HttpStepFunctionsIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration,
) : HttpRouteIntegration(cdkObject) {
  public override fun bind(options: HttpRouteIntegrationBindOptions): HttpRouteIntegrationConfig =
      unwrap(this).bind(options.let(HttpRouteIntegrationBindOptions::unwrap)).let(HttpRouteIntegrationConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adeb585f7d049df388aeb961213ea487ef99967ed3fab3c9dbfc7653776fc180")
  public override fun bind(options: HttpRouteIntegrationBindOptions.Builder.() -> Unit):
      HttpRouteIntegrationConfig = bind(HttpRouteIntegrationBindOptions(options))

  @CdkDslMarker
  public interface Builder {
    public fun parameterMapping(parameterMapping: ParameterMapping)

    public fun stateMachine(stateMachine: StateMachine)

    public fun subtype(subtype: HttpIntegrationSubtype)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration.Builder.create(id)

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
