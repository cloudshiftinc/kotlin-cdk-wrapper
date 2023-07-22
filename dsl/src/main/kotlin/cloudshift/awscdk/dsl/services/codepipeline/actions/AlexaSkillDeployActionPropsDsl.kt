@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployActionProps

@CdkDslMarker
public class AlexaSkillDeployActionPropsDsl {
  private val cdkBuilder: AlexaSkillDeployActionProps.Builder =
      AlexaSkillDeployActionProps.builder()

  /**
   * @param actionName The physical, human-readable name of the Action. 
   * Note that Action names must be unique within a single Stage.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param clientId The client id of the developer console token. 
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * @param clientSecret The client secret of the developer console token. 
   */
  public fun clientSecret(clientSecret: SecretValue) {
    cdkBuilder.clientSecret(clientSecret)
  }

  /**
   * @param input The source artifact containing the voice model and skill manifest. 
   */
  public fun input(input: Artifact) {
    cdkBuilder.input(input)
  }

  /**
   * @param parameterOverridesArtifact An optional artifact containing overrides for the skill
   * manifest.
   */
  public fun parameterOverridesArtifact(parameterOverridesArtifact: Artifact) {
    cdkBuilder.parameterOverridesArtifact(parameterOverridesArtifact)
  }

  /**
   * @param refreshToken The refresh token of the developer console token. 
   */
  public fun refreshToken(refreshToken: SecretValue) {
    cdkBuilder.refreshToken(refreshToken)
  }

  /**
   * @param runOrder The runOrder property for this Action.
   * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * @param skillId The Alexa skill id. 
   */
  public fun skillId(skillId: String) {
    cdkBuilder.skillId(skillId)
  }

  /**
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): AlexaSkillDeployActionProps = cdkBuilder.build()
}
