@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Deploys the skill to Alexa.
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
public open class AlexaSkillDeployAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction,
) : Action(cdkObject) {
  public constructor(props: AlexaSkillDeployActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction(props.let(AlexaSkillDeployActionProps::unwrap))
  )

  public constructor(props: AlexaSkillDeployActionProps.Builder.() -> Unit) :
      this(AlexaSkillDeployActionProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.AlexaSkillDeployAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    public fun actionName(actionName: String)

    /**
     * The client id of the developer console token.
     *
     * @param clientId The client id of the developer console token. 
     */
    public fun clientId(clientId: String)

    /**
     * The client secret of the developer console token.
     *
     * @param clientSecret The client secret of the developer console token. 
     */
    public fun clientSecret(clientSecret: SecretValue)

    /**
     * The source artifact containing the voice model and skill manifest.
     *
     * @param input The source artifact containing the voice model and skill manifest. 
     */
    public fun input(input: Artifact)

    /**
     * An optional artifact containing overrides for the skill manifest.
     *
     * @param parameterOverridesArtifact An optional artifact containing overrides for the skill
     * manifest. 
     */
    public fun parameterOverridesArtifact(parameterOverridesArtifact: Artifact)

    /**
     * The refresh token of the developer console token.
     *
     * @param refreshToken The refresh token of the developer console token. 
     */
    public fun refreshToken(refreshToken: SecretValue)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    public fun runOrder(runOrder: Number)

    /**
     * The Alexa skill id.
     *
     * @param skillId The Alexa skill id. 
     */
    public fun skillId(skillId: String)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction.Builder.create()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * The client id of the developer console token.
     *
     * @param clientId The client id of the developer console token. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * The client secret of the developer console token.
     *
     * @param clientSecret The client secret of the developer console token. 
     */
    override fun clientSecret(clientSecret: SecretValue) {
      cdkBuilder.clientSecret(clientSecret.let(SecretValue::unwrap))
    }

    /**
     * The source artifact containing the voice model and skill manifest.
     *
     * @param input The source artifact containing the voice model and skill manifest. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
    }

    /**
     * An optional artifact containing overrides for the skill manifest.
     *
     * @param parameterOverridesArtifact An optional artifact containing overrides for the skill
     * manifest. 
     */
    override fun parameterOverridesArtifact(parameterOverridesArtifact: Artifact) {
      cdkBuilder.parameterOverridesArtifact(parameterOverridesArtifact.let(Artifact::unwrap))
    }

    /**
     * The refresh token of the developer console token.
     *
     * @param refreshToken The refresh token of the developer console token. 
     */
    override fun refreshToken(refreshToken: SecretValue) {
      cdkBuilder.refreshToken(refreshToken.let(SecretValue::unwrap))
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * The Alexa skill id.
     *
     * @param skillId The Alexa skill id. 
     */
    override fun skillId(skillId: String) {
      cdkBuilder.skillId(skillId)
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
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
        wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction
  }
}
