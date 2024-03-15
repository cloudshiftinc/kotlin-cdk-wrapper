@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonActionProps
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface AlexaSkillDeployActionProps : CommonActionProps {
  public fun clientId(): String

  public fun clientSecret(): SecretValue

  public fun input(): Artifact

  public fun parameterOverridesArtifact(): Artifact? =
      unwrap(this).getParameterOverridesArtifact()?.let(Artifact::wrap)

  public fun refreshToken(): SecretValue

  public fun skillId(): String

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
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps.builder()

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

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps,
  ) : CdkObject(cdkObject), AlexaSkillDeployActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun clientId(): String = unwrap(this).getClientId()

    override fun clientSecret(): SecretValue = unwrap(this).getClientSecret().let(SecretValue::wrap)

    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    override fun parameterOverridesArtifact(): Artifact? =
        unwrap(this).getParameterOverridesArtifact()?.let(Artifact::wrap)

    override fun refreshToken(): SecretValue = unwrap(this).getRefreshToken().let(SecretValue::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun skillId(): String = unwrap(this).getSkillId()

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlexaSkillDeployActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps):
        AlexaSkillDeployActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlexaSkillDeployActionProps):
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps
  }
}
