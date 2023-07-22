@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.ActionArtifactBounds
import software.amazon.awscdk.services.codepipeline.ActionCategory
import software.amazon.awscdk.services.codepipeline.CustomActionProperty
import software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps

/**
 * Properties of registering a custom Action.
 *
 * Example:
 *
 * ```
 * // Make a custom CodePipeline Action
 * // Make a custom CodePipeline Action
 * CustomActionRegistration.Builder.create(this, "GenericGitSourceProviderResource")
 * .category(ActionCategory.SOURCE)
 * .artifactBounds(ActionArtifactBounds.builder().minInputs(0).maxInputs(0).minOutputs(1).maxOutputs(1).build())
 * .provider("GenericGitSource")
 * .version("1")
 * .entityUrl("https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-create-custom-action.html")
 * .executionUrl("https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-create-custom-action.html")
 * .actionProperties(List.of(CustomActionProperty.builder()
 * .name("Branch")
 * .required(true)
 * .key(false)
 * .secret(false)
 * .queryable(false)
 * .description("Git branch to pull")
 * .type("String")
 * .build(), CustomActionProperty.builder()
 * .name("GitUrl")
 * .required(true)
 * .key(false)
 * .secret(false)
 * .queryable(false)
 * .description("SSH git clone URL")
 * .type("String")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class CustomActionRegistrationPropsDsl {
  private val cdkBuilder: CustomActionRegistrationProps.Builder =
      CustomActionRegistrationProps.builder()

  private val _actionProperties: MutableList<CustomActionProperty> = mutableListOf()

  /**
   * @param actionProperties The properties used for customizing the instance of your Action.
   */
  public fun actionProperties(actionProperties: CustomActionPropertyDsl.() -> Unit) {
    _actionProperties.add(CustomActionPropertyDsl().apply(actionProperties).build())
  }

  /**
   * @param actionProperties The properties used for customizing the instance of your Action.
   */
  public fun actionProperties(actionProperties: Collection<CustomActionProperty>) {
    _actionProperties.addAll(actionProperties)
  }

  /**
   * @param artifactBounds The artifact bounds of the Action. 
   */
  public fun artifactBounds(artifactBounds: ActionArtifactBoundsDsl.() -> Unit = {}) {
    val builder = ActionArtifactBoundsDsl()
    builder.apply(artifactBounds)
    cdkBuilder.artifactBounds(builder.build())
  }

  /**
   * @param artifactBounds The artifact bounds of the Action. 
   */
  public fun artifactBounds(artifactBounds: ActionArtifactBounds) {
    cdkBuilder.artifactBounds(artifactBounds)
  }

  /**
   * @param category The category of the Action. 
   */
  public fun category(category: ActionCategory) {
    cdkBuilder.category(category)
  }

  /**
   * @param entityUrl The URL shown for the entire Action in the Pipeline UI.
   */
  public fun entityUrl(entityUrl: String) {
    cdkBuilder.entityUrl(entityUrl)
  }

  /**
   * @param executionUrl The URL shown for a particular execution of an Action in the Pipeline UI.
   */
  public fun executionUrl(executionUrl: String) {
    cdkBuilder.executionUrl(executionUrl)
  }

  /**
   * @param provider The provider of the Action. 
   * For example, `'MyCustomActionProvider'`
   */
  public fun provider(provider: String) {
    cdkBuilder.provider(provider)
  }

  /**
   * @param version The version of your Action.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CustomActionRegistrationProps {
    if(_actionProperties.isNotEmpty()) cdkBuilder.actionProperties(_actionProperties)
    return cdkBuilder.build()
  }
}
