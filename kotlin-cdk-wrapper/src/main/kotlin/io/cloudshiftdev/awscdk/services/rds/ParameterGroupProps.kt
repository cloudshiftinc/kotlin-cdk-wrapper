@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ParameterGroupProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun engine(): IEngine

  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun engine(engine: IEngine)

    public fun parameters(parameters: Map<String, String>)

    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ParameterGroupProps.Builder =
        software.amazon.awscdk.services.rds.ParameterGroupProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engine(engine: IEngine) {
      cdkBuilder.engine(engine.let(IEngine::unwrap))
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.ParameterGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ParameterGroupProps,
  ) : CdkObject(cdkObject), ParameterGroupProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun engine(): IEngine = unwrap(this).getEngine().let(IEngine::wrap)

    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ParameterGroupProps):
        ParameterGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParameterGroupProps):
        software.amazon.awscdk.services.rds.ParameterGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.ParameterGroupProps
  }
}
