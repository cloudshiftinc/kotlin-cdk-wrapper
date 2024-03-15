@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Trigger.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * Action action;
 * Trigger trigger = Trigger.Builder.create()
 * .providerType(ProviderType.CODE_STAR_SOURCE_CONNECTION)
 * // the properties below are optional
 * .gitConfiguration(GitConfiguration.builder()
 * .sourceAction(action)
 * // the properties below are optional
 * .pushFilter(List.of(GitPushFilter.builder()
 * .tagsExcludes(List.of("tagsExcludes"))
 * .tagsIncludes(List.of("tagsIncludes"))
 * .build()))
 * .build())
 * .build();
 * ```
 */
public open class Trigger internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.Trigger,
) : CdkObject(cdkObject) {
  /**
   * The pipeline source action where the trigger configuration.
   */
  public open fun sourceAction(): IAction? = unwrap(this).getSourceAction()?.let(IAction::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.Trigger].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Provides the filter criteria and the source stage for the repository event that starts the
     * pipeline, such as Git tags.
     *
     * Default: - no configuration.
     *
     * @param gitConfiguration Provides the filter criteria and the source stage for the repository
     * event that starts the pipeline, such as Git tags. 
     */
    public fun gitConfiguration(gitConfiguration: GitConfiguration)

    /**
     * Provides the filter criteria and the source stage for the repository event that starts the
     * pipeline, such as Git tags.
     *
     * Default: - no configuration.
     *
     * @param gitConfiguration Provides the filter criteria and the source stage for the repository
     * event that starts the pipeline, such as Git tags. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43bdb8c0f6051746f3f200fd74a269256b6b989d220404453f8b254e5c48c062")
    public fun gitConfiguration(gitConfiguration: GitConfiguration.Builder.() -> Unit)

    /**
     * The source provider for the event, such as connections configured for a repository with Git
     * tags, for the specified trigger configuration.
     *
     * @param providerType The source provider for the event, such as connections configured for a
     * repository with Git tags, for the specified trigger configuration. 
     */
    public fun providerType(providerType: ProviderType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.Trigger.Builder =
        software.amazon.awscdk.services.codepipeline.Trigger.Builder.create()

    /**
     * Provides the filter criteria and the source stage for the repository event that starts the
     * pipeline, such as Git tags.
     *
     * Default: - no configuration.
     *
     * @param gitConfiguration Provides the filter criteria and the source stage for the repository
     * event that starts the pipeline, such as Git tags. 
     */
    override fun gitConfiguration(gitConfiguration: GitConfiguration) {
      cdkBuilder.gitConfiguration(gitConfiguration.let(GitConfiguration::unwrap))
    }

    /**
     * Provides the filter criteria and the source stage for the repository event that starts the
     * pipeline, such as Git tags.
     *
     * Default: - no configuration.
     *
     * @param gitConfiguration Provides the filter criteria and the source stage for the repository
     * event that starts the pipeline, such as Git tags. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43bdb8c0f6051746f3f200fd74a269256b6b989d220404453f8b254e5c48c062")
    override fun gitConfiguration(gitConfiguration: GitConfiguration.Builder.() -> Unit): Unit =
        gitConfiguration(GitConfiguration(gitConfiguration))

    /**
     * The source provider for the event, such as connections configured for a repository with Git
     * tags, for the specified trigger configuration.
     *
     * @param providerType The source provider for the event, such as connections configured for a
     * repository with Git tags, for the specified trigger configuration. 
     */
    override fun providerType(providerType: ProviderType) {
      cdkBuilder.providerType(providerType.let(ProviderType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.Trigger = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Trigger {
      val builderImpl = BuilderImpl()
      return Trigger(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Trigger): Trigger =
        Trigger(cdkObject)

    internal fun unwrap(wrapped: Trigger): software.amazon.awscdk.services.codepipeline.Trigger =
        wrapped.cdkObject
  }
}
