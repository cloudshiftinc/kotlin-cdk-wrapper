@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction

@CdkDslMarker
public class AlexaSkillDeployActionDsl {
  private val cdkBuilder: AlexaSkillDeployAction.Builder = AlexaSkillDeployAction.Builder.create()

  /**
   * The physical, human-readable name of the Action.
   *
   * Note that Action names must be unique within a single Stage.
   *
   * @param actionName The physical, human-readable name of the Action. 
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * The client id of the developer console token.
   *
   * @param clientId The client id of the developer console token. 
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * The client secret of the developer console token.
   *
   * @param clientSecret The client secret of the developer console token. 
   */
  public fun clientSecret(clientSecret: SecretValue) {
    cdkBuilder.clientSecret(clientSecret)
  }

  /**
   * The source artifact containing the voice model and skill manifest.
   *
   * @param input The source artifact containing the voice model and skill manifest. 
   */
  public fun input(input: Artifact) {
    cdkBuilder.input(input)
  }

  /**
   * An optional artifact containing overrides for the skill manifest.
   *
   * @param parameterOverridesArtifact An optional artifact containing overrides for the skill
   * manifest. 
   */
  public fun parameterOverridesArtifact(parameterOverridesArtifact: Artifact) {
    cdkBuilder.parameterOverridesArtifact(parameterOverridesArtifact)
  }

  /**
   * The refresh token of the developer console token.
   *
   * @param refreshToken The refresh token of the developer console token. 
   */
  public fun refreshToken(refreshToken: SecretValue) {
    cdkBuilder.refreshToken(refreshToken)
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
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * The Alexa skill id.
   *
   * @param skillId The Alexa skill id. 
   */
  public fun skillId(skillId: String) {
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
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): AlexaSkillDeployAction = cdkBuilder.build()
}
