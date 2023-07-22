@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnAlias
import software.amazon.awscdk.services.lambda.CfnAliasProps

@CdkDslMarker
public class CfnAliasPropsDsl {
  private val cdkBuilder: CfnAliasProps.Builder = CfnAliasProps.builder()

  /**
   * @param description A description of the alias.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param functionName The name of the Lambda function. 
   * **Name formats** - *Function name* - `MyFunction` .
   *
   * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
   * * *Partial ARN* - `123456789012:function:MyFunction` .
   *
   * The length constraint applies only to the full ARN. If you specify only the function name, it
   * is limited to 64 characters in length.
   */
  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  /**
   * @param functionVersion The function version that the alias invokes. 
   */
  public fun functionVersion(functionVersion: String) {
    cdkBuilder.functionVersion(functionVersion)
  }

  /**
   * @param name The name of the alias. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param provisionedConcurrencyConfig Specifies a [provisioned
   * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
   * configuration for a function's alias.
   */
  public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
    cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
  }

  /**
   * @param provisionedConcurrencyConfig Specifies a [provisioned
   * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
   * configuration for a function's alias.
   */
  public
      fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnAlias.ProvisionedConcurrencyConfigurationProperty) {
    cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
  }

  /**
   * @param routingConfig The [routing
   * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
   * of the alias.
   */
  public fun routingConfig(routingConfig: IResolvable) {
    cdkBuilder.routingConfig(routingConfig)
  }

  /**
   * @param routingConfig The [routing
   * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
   * of the alias.
   */
  public fun routingConfig(routingConfig: CfnAlias.AliasRoutingConfigurationProperty) {
    cdkBuilder.routingConfig(routingConfig)
  }

  public fun build(): CfnAliasProps = cdkBuilder.build()
}
