@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.AliasProps
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.IVersion
import software.amazon.awscdk.services.lambda.VersionWeight

/**
 * Properties for a new Lambda alias.
 *
 * Example:
 *
 * ```
 * CfnParametersCode lambdaCode = Code.fromCfnParameters();
 * Function func = Function.Builder.create(this, "Lambda")
 * .code(lambdaCode)
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_14_X)
 * .build();
 * // used to make sure each CDK synthesis produces a different Version
 * Version version = func.getCurrentVersion();
 * Alias alias = Alias.Builder.create(this, "LambdaAlias")
 * .aliasName("Prod")
 * .version(version)
 * .build();
 * LambdaDeploymentGroup.Builder.create(this, "DeploymentGroup")
 * .alias(alias)
 * .deploymentConfig(LambdaDeploymentConfig.LINEAR_10PERCENT_EVERY_1MINUTE)
 * .build();
 * ```
 */
@CdkDslMarker
public class AliasPropsDsl {
  private val cdkBuilder: AliasProps.Builder = AliasProps.builder()

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
   * @param aliasName Name of this alias. 
   */
  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
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

  /**
   * @param version Function version this alias refers to. 
   * Use lambda.currentVersion to reference a version with your latest changes.
   */
  public fun version(version: IVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): AliasProps {
    if(_additionalVersions.isNotEmpty()) cdkBuilder.additionalVersions(_additionalVersions)
    return cdkBuilder.build()
  }
}
