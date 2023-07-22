@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnAlias
import software.constructs.Construct

@CdkDslMarker
public class CfnAliasDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAlias.Builder = CfnAlias.Builder.create(scope, id)

  /**
   * A description of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description)
   * @param description A description of the alias. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the Lambda function.
   *
   * **Name formats** - *Function name* - `MyFunction` .
   *
   * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
   * * *Partial ARN* - `123456789012:function:MyFunction` .
   *
   * The length constraint applies only to the full ARN. If you specify only the function name, it
   * is limited to 64 characters in length.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionname)
   * @param functionName The name of the Lambda function. 
   */
  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  /**
   * The function version that the alias invokes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion)
   * @param functionVersion The function version that the alias invokes. 
   */
  public fun functionVersion(functionVersion: String) {
    cdkBuilder.functionVersion(functionVersion)
  }

  /**
   * The name of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name)
   * @param name The name of the alias. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Specifies a [provisioned
   * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
   * configuration for a function's alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-provisionedconcurrencyconfig)
   * @param provisionedConcurrencyConfig Specifies a [provisioned
   * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
   * configuration for a function's alias. 
   */
  public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
    cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
  }

  /**
   * Specifies a [provisioned
   * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
   * configuration for a function's alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-provisionedconcurrencyconfig)
   * @param provisionedConcurrencyConfig Specifies a [provisioned
   * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
   * configuration for a function's alias. 
   */
  public
      fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnAlias.ProvisionedConcurrencyConfigurationProperty) {
    cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
  }

  /**
   * The [routing
   * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
   * of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-routingconfig)
   * @param routingConfig The [routing
   * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
   * of the alias. 
   */
  public fun routingConfig(routingConfig: IResolvable) {
    cdkBuilder.routingConfig(routingConfig)
  }

  /**
   * The [routing
   * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
   * of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-routingconfig)
   * @param routingConfig The [routing
   * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
   * of the alias. 
   */
  public fun routingConfig(routingConfig: CfnAlias.AliasRoutingConfigurationProperty) {
    cdkBuilder.routingConfig(routingConfig)
  }

  public fun build(): CfnAlias = cdkBuilder.build()
}
