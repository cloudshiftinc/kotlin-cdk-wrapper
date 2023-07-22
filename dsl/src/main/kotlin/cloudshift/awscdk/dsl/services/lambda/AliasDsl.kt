@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.Alias
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.IVersion
import software.amazon.awscdk.services.lambda.VersionWeight
import software.constructs.Construct

/**
 * A new alias to a particular version of a Lambda function.
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
public class AliasDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Alias.Builder = Alias.Builder.create(scope, id)

  private val _additionalVersions: MutableList<VersionWeight> = mutableListOf()

  /**
   * Additional versions with individual weights this alias points to.
   *
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
   *
   * Default: No additional versions
   *
   * @param additionalVersions Additional versions with individual weights this alias points to. 
   */
  public fun additionalVersions(additionalVersions: VersionWeightDsl.() -> Unit) {
    _additionalVersions.add(VersionWeightDsl().apply(additionalVersions).build())
  }

  /**
   * Additional versions with individual weights this alias points to.
   *
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
   *
   * Default: No additional versions
   *
   * @param additionalVersions Additional versions with individual weights this alias points to. 
   */
  public fun additionalVersions(additionalVersions: Collection<VersionWeight>) {
    _additionalVersions.addAll(additionalVersions)
  }

  /**
   * Name of this alias.
   *
   * @param aliasName Name of this alias. 
   */
  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
  }

  /**
   * Description for the alias.
   *
   * Default: No description
   *
   * @param description Description for the alias. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The maximum age of a request that Lambda sends to a function for processing.
   *
   * Minimum: 60 seconds
   * Maximum: 6 hours
   *
   * Default: Duration.hours(6)
   *
   * @param maxEventAge The maximum age of a request that Lambda sends to a function for processing.
   * 
   */
  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  /**
   * The destination for failed invocations.
   *
   * Default: - no destination
   *
   * @param onFailure The destination for failed invocations. 
   */
  public fun onFailure(onFailure: IDestination) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * The destination for successful invocations.
   *
   * Default: - no destination
   *
   * @param onSuccess The destination for successful invocations. 
   */
  public fun onSuccess(onSuccess: IDestination) {
    cdkBuilder.onSuccess(onSuccess)
  }

  /**
   * Specifies a provisioned concurrency configuration for a function's alias.
   *
   * Default: No provisioned concurrency
   *
   * @param provisionedConcurrentExecutions Specifies a provisioned concurrency configuration for a
   * function's alias. 
   */
  public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
    cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
  }

  /**
   * The maximum number of times to retry when the function returns an error.
   *
   * Minimum: 0
   * Maximum: 2
   *
   * Default: 2
   *
   * @param retryAttempts The maximum number of times to retry when the function returns an error. 
   */
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  /**
   * Function version this alias refers to.
   *
   * Use lambda.currentVersion to reference a version with your latest changes.
   *
   * @param version Function version this alias refers to. 
   */
  public fun version(version: IVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): Alias {
    if(_additionalVersions.isNotEmpty()) cdkBuilder.additionalVersions(_additionalVersions)
    return cdkBuilder.build()
  }
}
