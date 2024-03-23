@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonActionProps
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Construction properties of the `AlexaSkillDeployAction Alexa deploy Action`.
 *
 * Example:
 *
 * ```
 * // Read the secrets from ParameterStore
 * SecretValue clientId = SecretValue.secretsManager("AlexaClientId");
 * SecretValue clientSecret = SecretValue.secretsManager("AlexaClientSecret");
 * SecretValue refreshToken = SecretValue.secretsManager("AlexaRefreshToken");
 * // Add deploy action
 * Artifact sourceOutput = new Artifact();
 * AlexaSkillDeployAction.Builder.create()
 * .actionName("DeploySkill")
 * .runOrder(1)
 * .input(sourceOutput)
 * .clientId(clientId.toString())
 * .clientSecret(clientSecret)
 * .refreshToken(refreshToken)
 * .skillId("amzn1.ask.skill.12345678-1234-1234-1234-123456789012")
 * .build();
 * ```
 */
public interface AlexaSkillDeployActionProps : CommonActionProps {
  /**
   * The client id of the developer console token.
   */
  public fun clientId(): String

  /**
   * The client secret of the developer console token.
   */
  public fun clientSecret(): SecretValue

  /**
   * The source artifact containing the voice model and skill manifest.
   */
  public fun input(): Artifact

  /**
   * An optional artifact containing overrides for the skill manifest.
   */
  public fun parameterOverridesArtifact(): Artifact? =
      unwrap(this).getParameterOverridesArtifact()?.let(Artifact::wrap)

  /**
   * The refresh token of the developer console token.
   */
  public fun refreshToken(): SecretValue

  /**
   * The Alexa skill id.
   */
  public fun skillId(): String

  /**
   * A builder for [AlexaSkillDeployActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param clientId The client id of the developer console token. 
     */
    public fun clientId(clientId: String)

    /**
     * @param clientSecret The client secret of the developer console token. 
     */
    public fun clientSecret(clientSecret: SecretValue)

    /**
     * @param input The source artifact containing the voice model and skill manifest. 
     */
    public fun input(input: Artifact)

    /**
     * @param parameterOverridesArtifact An optional artifact containing overrides for the skill
     * manifest.
     */
    public fun parameterOverridesArtifact(parameterOverridesArtifact: Artifact)

    /**
     * @param refreshToken The refresh token of the developer console token. 
     */
    public fun refreshToken(refreshToken: SecretValue)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param skillId The Alexa skill id. 
     */
    public fun skillId(skillId: String)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param clientId The client id of the developer console token. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The client secret of the developer console token. 
     */
    override fun clientSecret(clientSecret: SecretValue) {
      cdkBuilder.clientSecret(clientSecret.let(SecretValue::unwrap))
    }

    /**
     * @param input The source artifact containing the voice model and skill manifest. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
    }

    /**
     * @param parameterOverridesArtifact An optional artifact containing overrides for the skill
     * manifest.
     */
    override fun parameterOverridesArtifact(parameterOverridesArtifact: Artifact) {
      cdkBuilder.parameterOverridesArtifact(parameterOverridesArtifact.let(Artifact::unwrap))
    }

    /**
     * @param refreshToken The refresh token of the developer console token. 
     */
    override fun refreshToken(refreshToken: SecretValue) {
      cdkBuilder.refreshToken(refreshToken.let(SecretValue::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param skillId The Alexa skill id. 
     */
    override fun skillId(skillId: String) {
      cdkBuilder.skillId(skillId)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps,
  ) : CdkObject(cdkObject), AlexaSkillDeployActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The client id of the developer console token.
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * The client secret of the developer console token.
     */
    override fun clientSecret(): SecretValue = unwrap(this).getClientSecret().let(SecretValue::wrap)

    /**
     * The source artifact containing the voice model and skill manifest.
     */
    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    /**
     * An optional artifact containing overrides for the skill manifest.
     */
    override fun parameterOverridesArtifact(): Artifact? =
        unwrap(this).getParameterOverridesArtifact()?.let(Artifact::wrap)

    /**
     * The refresh token of the developer console token.
     */
    override fun refreshToken(): SecretValue = unwrap(this).getRefreshToken().let(SecretValue::wrap)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     */
    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    /**
     * The Alexa skill id.
     */
    override fun skillId(): String = unwrap(this).getSkillId()

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlexaSkillDeployActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps):
        AlexaSkillDeployActionProps = CdkObjectWrappers.wrap(cdkObject) as?
        AlexaSkillDeployActionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlexaSkillDeployActionProps):
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps
  }
}
