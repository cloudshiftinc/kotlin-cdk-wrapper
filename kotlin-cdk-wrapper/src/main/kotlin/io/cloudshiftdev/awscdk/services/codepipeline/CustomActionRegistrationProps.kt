@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

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
public interface CustomActionRegistrationProps {
  /**
   * The properties used for customizing the instance of your Action.
   *
   * Default: []
   */
  public fun actionProperties(): List<CustomActionProperty> =
      unwrap(this).getActionProperties()?.map(CustomActionProperty::wrap) ?: emptyList()

  /**
   * The artifact bounds of the Action.
   */
  public fun artifactBounds(): ActionArtifactBounds

  /**
   * The category of the Action.
   */
  public fun category(): ActionCategory

  /**
   * The URL shown for the entire Action in the Pipeline UI.
   *
   * Default: none
   */
  public fun entityUrl(): String? = unwrap(this).getEntityUrl()

  /**
   * The URL shown for a particular execution of an Action in the Pipeline UI.
   *
   * Default: none
   */
  public fun executionUrl(): String? = unwrap(this).getExecutionUrl()

  /**
   * The provider of the Action.
   *
   * For example, `'MyCustomActionProvider'`
   */
  public fun provider(): String

  /**
   * The version of your Action.
   *
   * Default: '1'
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [CustomActionRegistrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionProperties The properties used for customizing the instance of your Action.
     */
    public fun actionProperties(actionProperties: List<CustomActionProperty>)

    /**
     * @param actionProperties The properties used for customizing the instance of your Action.
     */
    public fun actionProperties(vararg actionProperties: CustomActionProperty)

    /**
     * @param artifactBounds The artifact bounds of the Action. 
     */
    public fun artifactBounds(artifactBounds: ActionArtifactBounds)

    /**
     * @param artifactBounds The artifact bounds of the Action. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98cc6e48805fc09c222ac522a91a39441dd181481079a4e58818fcb7d2600eee")
    public fun artifactBounds(artifactBounds: ActionArtifactBounds.Builder.() -> Unit)

    /**
     * @param category The category of the Action. 
     */
    public fun category(category: ActionCategory)

    /**
     * @param entityUrl The URL shown for the entire Action in the Pipeline UI.
     */
    public fun entityUrl(entityUrl: String)

    /**
     * @param executionUrl The URL shown for a particular execution of an Action in the Pipeline UI.
     */
    public fun executionUrl(executionUrl: String)

    /**
     * @param provider The provider of the Action. 
     * For example, `'MyCustomActionProvider'`
     */
    public fun provider(provider: String)

    /**
     * @param version The version of your Action.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps.Builder =
        software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps.builder()

    /**
     * @param actionProperties The properties used for customizing the instance of your Action.
     */
    override fun actionProperties(actionProperties: List<CustomActionProperty>) {
      cdkBuilder.actionProperties(actionProperties.map(CustomActionProperty::unwrap))
    }

    /**
     * @param actionProperties The properties used for customizing the instance of your Action.
     */
    override fun actionProperties(vararg actionProperties: CustomActionProperty): Unit =
        actionProperties(actionProperties.toList())

    /**
     * @param artifactBounds The artifact bounds of the Action. 
     */
    override fun artifactBounds(artifactBounds: ActionArtifactBounds) {
      cdkBuilder.artifactBounds(artifactBounds.let(ActionArtifactBounds::unwrap))
    }

    /**
     * @param artifactBounds The artifact bounds of the Action. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98cc6e48805fc09c222ac522a91a39441dd181481079a4e58818fcb7d2600eee")
    override fun artifactBounds(artifactBounds: ActionArtifactBounds.Builder.() -> Unit): Unit =
        artifactBounds(ActionArtifactBounds(artifactBounds))

    /**
     * @param category The category of the Action. 
     */
    override fun category(category: ActionCategory) {
      cdkBuilder.category(category.let(ActionCategory::unwrap))
    }

    /**
     * @param entityUrl The URL shown for the entire Action in the Pipeline UI.
     */
    override fun entityUrl(entityUrl: String) {
      cdkBuilder.entityUrl(entityUrl)
    }

    /**
     * @param executionUrl The URL shown for a particular execution of an Action in the Pipeline UI.
     */
    override fun executionUrl(executionUrl: String) {
      cdkBuilder.executionUrl(executionUrl)
    }

    /**
     * @param provider The provider of the Action. 
     * For example, `'MyCustomActionProvider'`
     */
    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    /**
     * @param version The version of your Action.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps,
  ) : CdkObject(cdkObject), CustomActionRegistrationProps {
    /**
     * The properties used for customizing the instance of your Action.
     *
     * Default: []
     */
    override fun actionProperties(): List<CustomActionProperty> =
        unwrap(this).getActionProperties()?.map(CustomActionProperty::wrap) ?: emptyList()

    /**
     * The artifact bounds of the Action.
     */
    override fun artifactBounds(): ActionArtifactBounds =
        unwrap(this).getArtifactBounds().let(ActionArtifactBounds::wrap)

    /**
     * The category of the Action.
     */
    override fun category(): ActionCategory = unwrap(this).getCategory().let(ActionCategory::wrap)

    /**
     * The URL shown for the entire Action in the Pipeline UI.
     *
     * Default: none
     */
    override fun entityUrl(): String? = unwrap(this).getEntityUrl()

    /**
     * The URL shown for a particular execution of an Action in the Pipeline UI.
     *
     * Default: none
     */
    override fun executionUrl(): String? = unwrap(this).getExecutionUrl()

    /**
     * The provider of the Action.
     *
     * For example, `'MyCustomActionProvider'`
     */
    override fun provider(): String = unwrap(this).getProvider()

    /**
     * The version of your Action.
     *
     * Default: '1'
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomActionRegistrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps):
        CustomActionRegistrationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CustomActionRegistrationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomActionRegistrationProps):
        software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps
  }
}
