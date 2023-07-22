@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceCodeConfigurationValuesPropertyDsl {
  private val cdkBuilder: CfnService.CodeConfigurationValuesProperty.Builder =
      CfnService.CodeConfigurationValuesProperty.builder()

  private val _runtimeEnvironmentSecrets: MutableList<Any> = mutableListOf()

  private val _runtimeEnvironmentVariables: MutableList<Any> = mutableListOf()

  /**
   * @param buildCommand The command App Runner runs to build your application.
   */
  public fun buildCommand(buildCommand: String) {
    cdkBuilder.buildCommand(buildCommand)
  }

  /**
   * @param port The port that your application listens to in the container.
   * Default: `8080`
   */
  public fun port(port: String) {
    cdkBuilder.port(port)
  }

  /**
   * @param runtime A runtime environment type for building and running an App Runner service. 
   * It represents a programming language runtime.
   */
  public fun runtime(runtime: String) {
    cdkBuilder.runtime(runtime)
  }

  /**
   * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
   * parameters that get referenced to your service as an environment variable.
   * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets Manager
   * secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
   *
   *
   * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
   * service that you're launching, you can use either the full ARN or name of the secret. If the
   * parameter exists in a different Region, then the full ARN must be specified.
   * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is not
   * supported.
   */
  public fun runtimeEnvironmentSecrets(vararg runtimeEnvironmentSecrets: Any) {
    _runtimeEnvironmentSecrets.addAll(listOf(*runtimeEnvironmentSecrets))
  }

  /**
   * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
   * parameters that get referenced to your service as an environment variable.
   * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets Manager
   * secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
   *
   *
   * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
   * service that you're launching, you can use either the full ARN or name of the secret. If the
   * parameter exists in a different Region, then the full ARN must be specified.
   * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is not
   * supported.
   */
  public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: Collection<Any>) {
    _runtimeEnvironmentSecrets.addAll(runtimeEnvironmentSecrets)
  }

  /**
   * @param runtimeEnvironmentSecrets An array of key-value pairs representing the secrets and
   * parameters that get referenced to your service as an environment variable.
   * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets Manager
   * secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
   *
   *
   * * If the AWS Systems Manager Parameter Store parameter exists in the same AWS Region as the
   * service that you're launching, you can use either the full ARN or name of the secret. If the
   * parameter exists in a different Region, then the full ARN must be specified.
   * * Currently, cross account referencing of AWS Systems Manager Parameter Store parameter is not
   * supported.
   */
  public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: IResolvable) {
    cdkBuilder.runtimeEnvironmentSecrets(runtimeEnvironmentSecrets)
  }

  /**
   * @param runtimeEnvironmentVariables The environment variables that are available to your running
   * AWS App Runner service.
   * An array of key-value pairs.
   */
  public fun runtimeEnvironmentVariables(vararg runtimeEnvironmentVariables: Any) {
    _runtimeEnvironmentVariables.addAll(listOf(*runtimeEnvironmentVariables))
  }

  /**
   * @param runtimeEnvironmentVariables The environment variables that are available to your running
   * AWS App Runner service.
   * An array of key-value pairs.
   */
  public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: Collection<Any>) {
    _runtimeEnvironmentVariables.addAll(runtimeEnvironmentVariables)
  }

  /**
   * @param runtimeEnvironmentVariables The environment variables that are available to your running
   * AWS App Runner service.
   * An array of key-value pairs.
   */
  public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: IResolvable) {
    cdkBuilder.runtimeEnvironmentVariables(runtimeEnvironmentVariables)
  }

  /**
   * @param startCommand The command App Runner runs to start your application.
   */
  public fun startCommand(startCommand: String) {
    cdkBuilder.startCommand(startCommand)
  }

  public fun build(): CfnService.CodeConfigurationValuesProperty {
    if(_runtimeEnvironmentSecrets.isNotEmpty())
        cdkBuilder.runtimeEnvironmentSecrets(_runtimeEnvironmentSecrets)
    if(_runtimeEnvironmentVariables.isNotEmpty())
        cdkBuilder.runtimeEnvironmentVariables(_runtimeEnvironmentVariables)
    return cdkBuilder.build()
  }
}
