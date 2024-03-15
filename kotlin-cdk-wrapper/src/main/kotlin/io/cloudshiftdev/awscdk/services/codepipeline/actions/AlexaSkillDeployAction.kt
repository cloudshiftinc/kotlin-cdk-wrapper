@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class AlexaSkillDeployAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction,
) : Action(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun clientId(clientId: String)

    public fun clientSecret(clientSecret: SecretValue)

    public fun input(input: Artifact)

    public fun parameterOverridesArtifact(parameterOverridesArtifact: Artifact)

    public fun refreshToken(refreshToken: SecretValue)

    public fun runOrder(runOrder: Number)

    public fun skillId(skillId: String)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction.Builder.create()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    override fun clientSecret(clientSecret: SecretValue) {
      cdkBuilder.clientSecret(clientSecret.let(SecretValue::unwrap))
    }

    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
    }

    override fun parameterOverridesArtifact(parameterOverridesArtifact: Artifact) {
      cdkBuilder.parameterOverridesArtifact(parameterOverridesArtifact.let(Artifact::unwrap))
    }

    override fun refreshToken(refreshToken: SecretValue) {
      cdkBuilder.refreshToken(refreshToken.let(SecretValue::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun skillId(skillId: String) {
      cdkBuilder.skillId(skillId)
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlexaSkillDeployAction {
      val builderImpl = BuilderImpl()
      return AlexaSkillDeployAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction):
        AlexaSkillDeployAction = AlexaSkillDeployAction(cdkObject)

    internal fun unwrap(wrapped: AlexaSkillDeployAction):
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction =
        wrapped.cdkObject
  }
}
