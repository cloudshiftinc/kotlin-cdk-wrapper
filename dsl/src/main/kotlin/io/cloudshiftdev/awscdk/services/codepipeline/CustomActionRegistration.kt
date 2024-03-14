package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CustomActionRegistration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.CustomActionRegistration,
) : CloudshiftdevConstructsConstruct(cdkObject) {
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
