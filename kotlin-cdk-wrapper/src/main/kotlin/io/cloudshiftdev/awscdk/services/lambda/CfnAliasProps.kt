@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAlias`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CfnAliasProps cfnAliasProps = CfnAliasProps.builder()
 * .functionName("functionName")
 * .functionVersion("functionVersion")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty.builder()
 * .provisionedConcurrentExecutions(123)
 * .build())
 * .routingConfig(AliasRoutingConfigurationProperty.builder()
 * .additionalVersionWeights(List.of(VersionWeightProperty.builder()
 * .functionVersion("functionVersion")
 * .functionWeight(123)
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html)
 */
public interface CfnAliasProps {
  /**
   * A description of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name or ARN of the Lambda function.
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
   */
  public fun functionName(): String

  /**
   * The function version that the alias invokes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion)
   */
  public fun functionVersion(): String

  /**
   * The name of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name)
   */
  public fun name(): String

  /**
   * Specifies a [provisioned
   * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
   * configuration for a function's alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-provisionedconcurrencyconfig)
   */
  public fun provisionedConcurrencyConfig(): Any? = unwrap(this).getProvisionedConcurrencyConfig()

  /**
   * The [routing
   * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
   * of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-routingconfig)
   */
  public fun routingConfig(): Any? = unwrap(this).getRoutingConfig()

  /**
   * A builder for [CfnAliasProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the alias.
     */
    public fun description(description: String)

    /**
     * @param functionName The name or ARN of the Lambda function. 
     * **Name formats** - *Function name* - `MyFunction` .
     *
     * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
     * * *Partial ARN* - `123456789012:function:MyFunction` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     */
    public fun functionName(functionName: String)

    /**
     * @param functionVersion The function version that the alias invokes. 
     */
    public fun functionVersion(functionVersion: String)

    /**
     * @param name The name of the alias. 
     */
    public fun name(name: String)

    /**
     * @param provisionedConcurrencyConfig Specifies a [provisioned
     * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
     * configuration for a function's alias.
     */
    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable)

    /**
     * @param provisionedConcurrencyConfig Specifies a [provisioned
     * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
     * configuration for a function's alias.
     */
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnAlias.ProvisionedConcurrencyConfigurationProperty)

    /**
     * @param provisionedConcurrencyConfig Specifies a [provisioned
     * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
     * configuration for a function's alias.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaa1b0fad1dc921f1f33428f8812aafc460d1cc2785a7d649dffe79068b4ba08")
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnAlias.ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit)

    /**
     * @param routingConfig The [routing
     * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     * of the alias.
     */
    public fun routingConfig(routingConfig: IResolvable)

    /**
     * @param routingConfig The [routing
     * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     * of the alias.
     */
    public fun routingConfig(routingConfig: CfnAlias.AliasRoutingConfigurationProperty)

    /**
     * @param routingConfig The [routing
     * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     * of the alias.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c66bef2b6f7628495d7e3669fb8effa5e46231302d06fef8c3701f6cc9a97d42")
    public
        fun routingConfig(routingConfig: CfnAlias.AliasRoutingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnAliasProps.Builder =
        software.amazon.awscdk.services.lambda.CfnAliasProps.builder()

    /**
     * @param description A description of the alias.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param functionName The name or ARN of the Lambda function. 
     * **Name formats** - *Function name* - `MyFunction` .
     *
     * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
     * * *Partial ARN* - `123456789012:function:MyFunction` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param functionVersion The function version that the alias invokes. 
     */
    override fun functionVersion(functionVersion: String) {
      cdkBuilder.functionVersion(functionVersion)
    }

    /**
     * @param name The name of the alias. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param provisionedConcurrencyConfig Specifies a [provisioned
     * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
     * configuration for a function's alias.
     */
    override fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param provisionedConcurrencyConfig Specifies a [provisioned
     * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
     * configuration for a function's alias.
     */
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnAlias.ProvisionedConcurrencyConfigurationProperty) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(CfnAlias.ProvisionedConcurrencyConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param provisionedConcurrencyConfig Specifies a [provisioned
     * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
     * configuration for a function's alias.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaa1b0fad1dc921f1f33428f8812aafc460d1cc2785a7d649dffe79068b4ba08")
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnAlias.ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit):
        Unit =
        provisionedConcurrencyConfig(CfnAlias.ProvisionedConcurrencyConfigurationProperty(provisionedConcurrencyConfig))

    /**
     * @param routingConfig The [routing
     * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     * of the alias.
     */
    override fun routingConfig(routingConfig: IResolvable) {
      cdkBuilder.routingConfig(routingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param routingConfig The [routing
     * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     * of the alias.
     */
    override fun routingConfig(routingConfig: CfnAlias.AliasRoutingConfigurationProperty) {
      cdkBuilder.routingConfig(routingConfig.let(CfnAlias.AliasRoutingConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param routingConfig The [routing
     * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     * of the alias.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c66bef2b6f7628495d7e3669fb8effa5e46231302d06fef8c3701f6cc9a97d42")
    override
        fun routingConfig(routingConfig: CfnAlias.AliasRoutingConfigurationProperty.Builder.() -> Unit):
        Unit = routingConfig(CfnAlias.AliasRoutingConfigurationProperty(routingConfig))

    public fun build(): software.amazon.awscdk.services.lambda.CfnAliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.CfnAliasProps,
  ) : CdkObject(cdkObject), CfnAliasProps {
    /**
     * A description of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name or ARN of the Lambda function.
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
     */
    override fun functionName(): String = unwrap(this).getFunctionName()

    /**
     * The function version that the alias invokes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion)
     */
    override fun functionVersion(): String = unwrap(this).getFunctionVersion()

    /**
     * The name of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Specifies a [provisioned
     * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
     * configuration for a function's alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-provisionedconcurrencyconfig)
     */
    override fun provisionedConcurrencyConfig(): Any? =
        unwrap(this).getProvisionedConcurrencyConfig()

    /**
     * The [routing
     * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     * of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-routingconfig)
     */
    override fun routingConfig(): Any? = unwrap(this).getRoutingConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnAliasProps):
        CfnAliasProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAliasProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAliasProps):
        software.amazon.awscdk.services.lambda.CfnAliasProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.CfnAliasProps
  }
}
