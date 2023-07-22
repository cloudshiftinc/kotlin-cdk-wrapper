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
import software.amazon.awscdk.services.codepipeline.CustomActionRegistration
import software.constructs.Construct

/**
 * The resource representing registering a custom Action with CodePipeline.
 *
 * For the Action to be usable, it has to be registered for every region and every account it's used
 * in.
 * In addition to this class, you should most likely also provide your clients a class
 * representing your custom Action, extending the Action class,
 * and taking the `actionProperties` as properly typed, construction properties.
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
public class CustomActionRegistrationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CustomActionRegistration.Builder =
      CustomActionRegistration.Builder.create(scope, id)

  private val _actionProperties: MutableList<CustomActionProperty> = mutableListOf()

  /**
   * The properties used for customizing the instance of your Action.
   *
   * Default: []
   *
   * @param actionProperties The properties used for customizing the instance of your Action. 
   */
  public fun actionProperties(actionProperties: CustomActionPropertyDsl.() -> Unit) {
    _actionProperties.add(CustomActionPropertyDsl().apply(actionProperties).build())
  }

  /**
   * The properties used for customizing the instance of your Action.
   *
   * Default: []
   *
   * @param actionProperties The properties used for customizing the instance of your Action. 
   */
  public fun actionProperties(actionProperties: Collection<CustomActionProperty>) {
    _actionProperties.addAll(actionProperties)
  }

  /**
   * The artifact bounds of the Action.
   *
   * @param artifactBounds The artifact bounds of the Action. 
   */
  public fun artifactBounds(artifactBounds: ActionArtifactBoundsDsl.() -> Unit = {}) {
    val builder = ActionArtifactBoundsDsl()
    builder.apply(artifactBounds)
    cdkBuilder.artifactBounds(builder.build())
  }

  /**
   * The artifact bounds of the Action.
   *
   * @param artifactBounds The artifact bounds of the Action. 
   */
  public fun artifactBounds(artifactBounds: ActionArtifactBounds) {
    cdkBuilder.artifactBounds(artifactBounds)
  }

  /**
   * The category of the Action.
   *
   * @param category The category of the Action. 
   */
  public fun category(category: ActionCategory) {
    cdkBuilder.category(category)
  }

  /**
   * The URL shown for the entire Action in the Pipeline UI.
   *
   * Default: none
   *
   * @param entityUrl The URL shown for the entire Action in the Pipeline UI. 
   */
  public fun entityUrl(entityUrl: String) {
    cdkBuilder.entityUrl(entityUrl)
  }

  /**
   * The URL shown for a particular execution of an Action in the Pipeline UI.
   *
   * Default: none
   *
   * @param executionUrl The URL shown for a particular execution of an Action in the Pipeline UI. 
   */
  public fun executionUrl(executionUrl: String) {
    cdkBuilder.executionUrl(executionUrl)
  }

  /**
   * The provider of the Action.
   *
   * For example, `'MyCustomActionProvider'`
   *
   * @param provider The provider of the Action. 
   */
  public fun provider(provider: String) {
    cdkBuilder.provider(provider)
  }

  /**
   * The version of your Action.
   *
   * Default: '1'
   *
   * @param version The version of your Action. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CustomActionRegistration {
    if(_actionProperties.isNotEmpty()) cdkBuilder.actionProperties(_actionProperties)
    return cdkBuilder.build()
  }
}
