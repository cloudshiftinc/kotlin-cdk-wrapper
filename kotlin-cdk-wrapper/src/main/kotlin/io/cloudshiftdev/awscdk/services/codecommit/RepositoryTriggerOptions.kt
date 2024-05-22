@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Creates for a repository trigger to an SNS topic or Lambda function.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codecommit.*;
 * RepositoryTriggerOptions repositoryTriggerOptions = RepositoryTriggerOptions.builder()
 * .branches(List.of("branches"))
 * .customData("customData")
 * .events(List.of(RepositoryEventTrigger.ALL))
 * .name("name")
 * .build();
 * ```
 */
public interface RepositoryTriggerOptions {
  /**
   * The names of the branches in the AWS CodeCommit repository that contain events that you want to
   * include in the trigger.
   *
   * If you don't specify at
   * least one branch, the trigger applies to all branches.
   */
  public fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

  /**
   * When an event is triggered, additional information that AWS CodeCommit includes when it sends
   * information to the target.
   */
  public fun customData(): String? = unwrap(this).getCustomData()

  /**
   * The repository events for which AWS CodeCommit sends information to the target, which you
   * specified in the DestinationArn property.If you don't specify events, the trigger runs for all
   * repository events.
   */
  public fun events(): List<RepositoryEventTrigger> =
      unwrap(this).getEvents()?.map(RepositoryEventTrigger::wrap) ?: emptyList()

  /**
   * A name for the trigger.Triggers on a repository must have unique names.
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [RepositoryTriggerOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param branches The names of the branches in the AWS CodeCommit repository that contain
     * events that you want to include in the trigger.
     * If you don't specify at
     * least one branch, the trigger applies to all branches.
     */
    public fun branches(branches: List<String>)

    /**
     * @param branches The names of the branches in the AWS CodeCommit repository that contain
     * events that you want to include in the trigger.
     * If you don't specify at
     * least one branch, the trigger applies to all branches.
     */
    public fun branches(vararg branches: String)

    /**
     * @param customData When an event is triggered, additional information that AWS CodeCommit
     * includes when it sends information to the target.
     */
    public fun customData(customData: String)

    /**
     * @param events The repository events for which AWS CodeCommit sends information to the target,
     * which you specified in the DestinationArn property.If you don't specify events, the trigger runs
     * for all repository events.
     */
    public fun events(events: List<RepositoryEventTrigger>)

    /**
     * @param events The repository events for which AWS CodeCommit sends information to the target,
     * which you specified in the DestinationArn property.If you don't specify events, the trigger runs
     * for all repository events.
     */
    public fun events(vararg events: RepositoryEventTrigger)

    /**
     * @param name A name for the trigger.Triggers on a repository must have unique names.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.Builder =
        software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.builder()

    /**
     * @param branches The names of the branches in the AWS CodeCommit repository that contain
     * events that you want to include in the trigger.
     * If you don't specify at
     * least one branch, the trigger applies to all branches.
     */
    override fun branches(branches: List<String>) {
      cdkBuilder.branches(branches)
    }

    /**
     * @param branches The names of the branches in the AWS CodeCommit repository that contain
     * events that you want to include in the trigger.
     * If you don't specify at
     * least one branch, the trigger applies to all branches.
     */
    override fun branches(vararg branches: String): Unit = branches(branches.toList())

    /**
     * @param customData When an event is triggered, additional information that AWS CodeCommit
     * includes when it sends information to the target.
     */
    override fun customData(customData: String) {
      cdkBuilder.customData(customData)
    }

    /**
     * @param events The repository events for which AWS CodeCommit sends information to the target,
     * which you specified in the DestinationArn property.If you don't specify events, the trigger runs
     * for all repository events.
     */
    override fun events(events: List<RepositoryEventTrigger>) {
      cdkBuilder.events(events.map(RepositoryEventTrigger.Companion::unwrap))
    }

    /**
     * @param events The repository events for which AWS CodeCommit sends information to the target,
     * which you specified in the DestinationArn property.If you don't specify events, the trigger runs
     * for all repository events.
     */
    override fun events(vararg events: RepositoryEventTrigger): Unit = events(events.toList())

    /**
     * @param name A name for the trigger.Triggers on a repository must have unique names.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions,
  ) : CdkObject(cdkObject), RepositoryTriggerOptions {
    /**
     * The names of the branches in the AWS CodeCommit repository that contain events that you want
     * to include in the trigger.
     *
     * If you don't specify at
     * least one branch, the trigger applies to all branches.
     */
    override fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

    /**
     * When an event is triggered, additional information that AWS CodeCommit includes when it sends
     * information to the target.
     */
    override fun customData(): String? = unwrap(this).getCustomData()

    /**
     * The repository events for which AWS CodeCommit sends information to the target, which you
     * specified in the DestinationArn property.If you don't specify events, the trigger runs for all
     * repository events.
     */
    override fun events(): List<RepositoryEventTrigger> =
        unwrap(this).getEvents()?.map(RepositoryEventTrigger::wrap) ?: emptyList()

    /**
     * A name for the trigger.Triggers on a repository must have unique names.
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryTriggerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions):
        RepositoryTriggerOptions = CdkObjectWrappers.wrap(cdkObject) as? RepositoryTriggerOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryTriggerOptions):
        software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions
  }
}
