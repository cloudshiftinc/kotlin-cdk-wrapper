@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
public open class CustomActionRegistration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.CustomActionRegistration,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CustomActionRegistrationProps,
  ) :
      this(software.amazon.awscdk.services.codepipeline.CustomActionRegistration(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CustomActionRegistrationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CustomActionRegistrationProps.Builder.() -> Unit,
  ) : this(scope, id, CustomActionRegistrationProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.CustomActionRegistration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The properties used for customizing the instance of your Action.
     *
     * Default: []
     *
     * @param actionProperties The properties used for customizing the instance of your Action. 
     */
    public fun actionProperties(actionProperties: List<CustomActionProperty>)

    /**
     * The properties used for customizing the instance of your Action.
     *
     * Default: []
     *
     * @param actionProperties The properties used for customizing the instance of your Action. 
     */
    public fun actionProperties(vararg actionProperties: CustomActionProperty)

    /**
     * The artifact bounds of the Action.
     *
     * @param artifactBounds The artifact bounds of the Action. 
     */
    public fun artifactBounds(artifactBounds: ActionArtifactBounds)

    /**
     * The artifact bounds of the Action.
     *
     * @param artifactBounds The artifact bounds of the Action. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc269e49c8c05daaa3d41a643e5cf8f4e67fcf2394cf1e8ea218553bb25d9f4d")
    public fun artifactBounds(artifactBounds: ActionArtifactBounds.Builder.() -> Unit)

    /**
     * The category of the Action.
     *
     * @param category The category of the Action. 
     */
    public fun category(category: ActionCategory)

    /**
     * The URL shown for the entire Action in the Pipeline UI.
     *
     * Default: none
     *
     * @param entityUrl The URL shown for the entire Action in the Pipeline UI. 
     */
    public fun entityUrl(entityUrl: String)

    /**
     * The URL shown for a particular execution of an Action in the Pipeline UI.
     *
     * Default: none
     *
     * @param executionUrl The URL shown for a particular execution of an Action in the Pipeline UI.
     * 
     */
    public fun executionUrl(executionUrl: String)

    /**
     * The provider of the Action.
     *
     * For example, `'MyCustomActionProvider'`
     *
     * @param provider The provider of the Action. 
     */
    public fun provider(provider: String)

    /**
     * The version of your Action.
     *
     * Default: '1'
     *
     * @param version The version of your Action. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.CustomActionRegistration.Builder =
        software.amazon.awscdk.services.codepipeline.CustomActionRegistration.Builder.create(scope,
        id)

    /**
     * The properties used for customizing the instance of your Action.
     *
     * Default: []
     *
     * @param actionProperties The properties used for customizing the instance of your Action. 
     */
    override fun actionProperties(actionProperties: List<CustomActionProperty>) {
      cdkBuilder.actionProperties(actionProperties.map(CustomActionProperty::unwrap))
    }

    /**
     * The properties used for customizing the instance of your Action.
     *
     * Default: []
     *
     * @param actionProperties The properties used for customizing the instance of your Action. 
     */
    override fun actionProperties(vararg actionProperties: CustomActionProperty): Unit =
        actionProperties(actionProperties.toList())

    /**
     * The artifact bounds of the Action.
     *
     * @param artifactBounds The artifact bounds of the Action. 
     */
    override fun artifactBounds(artifactBounds: ActionArtifactBounds) {
      cdkBuilder.artifactBounds(artifactBounds.let(ActionArtifactBounds::unwrap))
    }

    /**
     * The artifact bounds of the Action.
     *
     * @param artifactBounds The artifact bounds of the Action. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc269e49c8c05daaa3d41a643e5cf8f4e67fcf2394cf1e8ea218553bb25d9f4d")
    override fun artifactBounds(artifactBounds: ActionArtifactBounds.Builder.() -> Unit): Unit =
        artifactBounds(ActionArtifactBounds(artifactBounds))

    /**
     * The category of the Action.
     *
     * @param category The category of the Action. 
     */
    override fun category(category: ActionCategory) {
      cdkBuilder.category(category.let(ActionCategory::unwrap))
    }

    /**
     * The URL shown for the entire Action in the Pipeline UI.
     *
     * Default: none
     *
     * @param entityUrl The URL shown for the entire Action in the Pipeline UI. 
     */
    override fun entityUrl(entityUrl: String) {
      cdkBuilder.entityUrl(entityUrl)
    }

    /**
     * The URL shown for a particular execution of an Action in the Pipeline UI.
     *
     * Default: none
     *
     * @param executionUrl The URL shown for a particular execution of an Action in the Pipeline UI.
     * 
     */
    override fun executionUrl(executionUrl: String) {
      cdkBuilder.executionUrl(executionUrl)
    }

    /**
     * The provider of the Action.
     *
     * For example, `'MyCustomActionProvider'`
     *
     * @param provider The provider of the Action. 
     */
    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    /**
     * The version of your Action.
     *
     * Default: '1'
     *
     * @param version The version of your Action. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CustomActionRegistration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CustomActionRegistration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CustomActionRegistration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CustomActionRegistration):
        CustomActionRegistration = CustomActionRegistration(cdkObject)

    internal fun unwrap(wrapped: CustomActionRegistration):
        software.amazon.awscdk.services.codepipeline.CustomActionRegistration = wrapped.cdkObject
  }
}
