@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codecommit.RepositoryEventTrigger
import software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions

/**
 * Creates for a repository trigger to an SNS topic or Lambda function.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codecommit.*;
 * RepositoryTriggerOptions repositoryTriggerOptions = RepositoryTriggerOptions.builder()
 * .branches(List.of("branches"))
 * .customData("customData")
 * .events(List.of(RepositoryEventTrigger.ALL))
 * .name("name")
 * .build();
 * ```
 */
@CdkDslMarker
public class RepositoryTriggerOptionsDsl {
  private val cdkBuilder: RepositoryTriggerOptions.Builder = RepositoryTriggerOptions.builder()

  private val _branches: MutableList<String> = mutableListOf()

  private val _events: MutableList<RepositoryEventTrigger> = mutableListOf()

  /**
   * @param branches The names of the branches in the AWS CodeCommit repository that contain events
   * that you want to include in the trigger.
   * If you don't specify at
   * least one branch, the trigger applies to all branches.
   */
  public fun branches(vararg branches: String) {
    _branches.addAll(listOf(*branches))
  }

  /**
   * @param branches The names of the branches in the AWS CodeCommit repository that contain events
   * that you want to include in the trigger.
   * If you don't specify at
   * least one branch, the trigger applies to all branches.
   */
  public fun branches(branches: Collection<String>) {
    _branches.addAll(branches)
  }

  /**
   * @param customData When an event is triggered, additional information that AWS CodeCommit
   * includes when it sends information to the target.
   */
  public fun customData(customData: String) {
    cdkBuilder.customData(customData)
  }

  /**
   * @param events The repository events for which AWS CodeCommit sends information to the target,
   * which you specified in the DestinationArn property.If you don't specify events, the trigger runs
   * for all repository events.
   */
  public fun events(vararg events: RepositoryEventTrigger) {
    _events.addAll(listOf(*events))
  }

  /**
   * @param events The repository events for which AWS CodeCommit sends information to the target,
   * which you specified in the DestinationArn property.If you don't specify events, the trigger runs
   * for all repository events.
   */
  public fun events(events: Collection<RepositoryEventTrigger>) {
    _events.addAll(events)
  }

  /**
   * @param name A name for the trigger.Triggers on a repository must have unique names.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): RepositoryTriggerOptions {
    if(_branches.isNotEmpty()) cdkBuilder.branches(_branches)
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    return cdkBuilder.build()
  }
}
