@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.AliasOptions
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.VersionWeight

/**
 * Options for `lambda.Alias`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.lambda.*;
 * IDestination destination;
 * Version version;
 * AliasOptions aliasOptions = AliasOptions.builder()
 * .additionalVersions(List.of(VersionWeight.builder()
 * .version(version)
 * .weight(123)
 * .build()))
 * .description("description")
 * .maxEventAge(Duration.minutes(30))
 * .onFailure(destination)
 * .onSuccess(destination)
 * .provisionedConcurrentExecutions(123)
 * .retryAttempts(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class AliasOptionsDsl {
  private val cdkBuilder: AliasOptions.Builder = AliasOptions.builder()

  private val _additionalVersions: MutableList<VersionWeight> = mutableListOf()

  /**
   * @param additionalVersions Additional versions with individual weights this alias points to.
   * Individual additional version weights specified here should add up to
   * (less than) one. All remaining weight is routed to the default
   * version.
   *
   * For example, the config is
   *
   * version: "1"
   * additionalVersions: [{ version: "2", weight: 0.05 }]
   *
   * Then 5% of traffic will be routed to function version 2, while
   * the remaining 95% of traffic will be routed to function version 1.
   */
  public fun additionalVersions(additionalVersions: VersionWeightDsl.() -> Unit) {
    _additionalVersions.add(VersionWeightDsl().apply(additionalVersions).build())
  }

  /**
   * @param additionalVersions Additional versions with individual weights this alias points to.
   * Individual additional version weights specified here should add up to
   * (less than) one. All remaining weight is routed to the default
   * version.
   *
   * For example, the config is
   *
   * version: "1"
   * additionalVersions: [{ version: "2", weight: 0.05 }]
   *
   * Then 5% of traffic will be routed to function version 2, while
   * the remaining 95% of traffic will be routed to function version 1.
   */
  public fun additionalVersions(additionalVersions: Collection<VersionWeight>) {
    _additionalVersions.addAll(additionalVersions)
  }

  /**
   * @param description Description for the alias.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param maxEventAge The maximum age of a request that Lambda sends to a function for processing.
   * Minimum: 60 seconds
   * Maximum: 6 hours
   */
  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  /**
   * @param onFailure The destination for failed invocations.
   */
  public fun onFailure(onFailure: IDestination) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * @param onSuccess The destination for successful invocations.
   */
  public fun onSuccess(onSuccess: IDestination) {
    cdkBuilder.onSuccess(onSuccess)
  }

  /**
   * @param provisionedConcurrentExecutions Specifies a provisioned concurrency configuration for a
   * function's alias.
   */
  public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
    cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
  }

  /**
   * @param retryAttempts The maximum number of times to retry when the function returns an error.
   * Minimum: 0
   * Maximum: 2
   */
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun build(): AliasOptions {
    if(_additionalVersions.isNotEmpty()) cdkBuilder.additionalVersions(_additionalVersions)
    return cdkBuilder.build()
  }
}
