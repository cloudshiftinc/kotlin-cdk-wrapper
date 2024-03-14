package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAlias internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.CfnAlias,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description of the alias.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the alias.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the Lambda function.
   */
  public open fun functionName(): String = unwrap(this).getFunctionName()

  /**
   * The name of the Lambda function.
   */
  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  /**
   * The function version that the alias invokes.
   */
  public open fun functionVersion(): String = unwrap(this).getFunctionVersion()

  /**
   * The function version that the alias invokes.
   */
  public open fun functionVersion(`value`: String) {
    unwrap(this).setFunctionVersion(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the alias.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the alias.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies a [provisioned
   * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
   * configuration for a function's alias.
   */
  public open fun provisionedConcurrencyConfig(): Any? =
      unwrap(this).getProvisionedConcurrencyConfig()

  /**
   * Specifies a [provisioned
   * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
   * configuration for a function's alias.
   */
  public open fun provisionedConcurrencyConfig(`value`: IResolvable) {
    unwrap(this).setProvisionedConcurrencyConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies a [provisioned
   * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
   * configuration for a function's alias.
   */
  public open
      fun provisionedConcurrencyConfig(`value`: ProvisionedConcurrencyConfigurationProperty) {
    unwrap(this).setProvisionedConcurrencyConfig(`value`.let(ProvisionedConcurrencyConfigurationProperty::unwrap))
  }

  /**
   * Specifies a [provisioned
   * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
   * configuration for a function's alias.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("16f8bd48899efb2fe864e6fefae1a4309339af9ad13219141095afda0ee979da")
  public open
      fun provisionedConcurrencyConfig(`value`: ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit):
      Unit = provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty(`value`))

  /**
   * The [routing
   * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
   * of the alias.
   */
  public open fun routingConfig(): Any? = unwrap(this).getRoutingConfig()

  /**
   * The [routing
   * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
   * of the alias.
   */
  public open fun routingConfig(`value`: IResolvable) {
    unwrap(this).setRoutingConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The [routing
   * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
   * of the alias.
   */
  public open fun routingConfig(`value`: AliasRoutingConfigurationProperty) {
    unwrap(this).setRoutingConfig(`value`.let(AliasRoutingConfigurationProperty::unwrap))
  }

  /**
   * The [routing
   * configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
   * of the alias.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("810fe5b519e2ec14e97f1b865992691b644a141d614646aecd85378f970aabf7")
  public open fun routingConfig(`value`: AliasRoutingConfigurationProperty.Builder.() -> Unit): Unit
      = routingConfig(AliasRoutingConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CfnAlias].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description)
     * @param description A description of the alias. 
     */
    public fun description(description: String)

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
    public fun functionName(functionName: String)

    /**
     * The function version that the alias invokes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion)
     * @param functionVersion The function version that the alias invokes. 
     */
    public fun functionVersion(functionVersion: String)

    /**
     * The name of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name)
     * @param name The name of the alias. 
     */
    public fun name(name: String)

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
    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable)

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
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da7ae274a617e7e7981478d5147e65d07a97ce375e8f41da28dabb437d23a30e")
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit)

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
    public fun routingConfig(routingConfig: IResolvable)

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
    public fun routingConfig(routingConfig: AliasRoutingConfigurationProperty)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("817345b2ea650b8bd76d585e4f3a58e86ece9f79b45e385598defd773387870e")
    public fun routingConfig(routingConfig: AliasRoutingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnAlias.Builder =
        software.amazon.awscdk.services.lambda.CfnAlias.Builder.create(scope, id)

    /**
     * A description of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description)
     * @param description A description of the alias. 
     */
    override fun description(description: String) {
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
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * The function version that the alias invokes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion)
     * @param functionVersion The function version that the alias invokes. 
     */
    override fun functionVersion(functionVersion: String) {
      cdkBuilder.functionVersion(functionVersion)
    }

    /**
     * The name of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name)
     * @param name The name of the alias. 
     */
    override fun name(name: String) {
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
    override fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(IResolvable::unwrap))
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
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(ProvisionedConcurrencyConfigurationProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da7ae274a617e7e7981478d5147e65d07a97ce375e8f41da28dabb437d23a30e")
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit):
        Unit =
        provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty(provisionedConcurrencyConfig))

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
    override fun routingConfig(routingConfig: IResolvable) {
      cdkBuilder.routingConfig(routingConfig.let(IResolvable::unwrap))
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
    override fun routingConfig(routingConfig: AliasRoutingConfigurationProperty) {
      cdkBuilder.routingConfig(routingConfig.let(AliasRoutingConfigurationProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("817345b2ea650b8bd76d585e4f3a58e86ece9f79b45e385598defd773387870e")
    override fun routingConfig(routingConfig: AliasRoutingConfigurationProperty.Builder.() -> Unit):
        Unit = routingConfig(AliasRoutingConfigurationProperty(routingConfig))

    public fun build(): software.amazon.awscdk.services.lambda.CfnAlias = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lambda.CfnAlias.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnAlias): CfnAlias =
        CfnAlias(cdkObject)

    internal fun unwrap(wrapped: CfnAlias): software.amazon.awscdk.services.lambda.CfnAlias =
        wrapped.cdkObject
  }

  public interface AliasRoutingConfigurationProperty {
    /**
     * The second version, and the percentage of traffic that's routed to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights)
     */
    public fun additionalVersionWeights(): Any

    /**
     * A builder for [AliasRoutingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalVersionWeights The second version, and the percentage of traffic that's
       * routed to it. 
       */
      public fun additionalVersionWeights(additionalVersionWeights: IResolvable)

      /**
       * @param additionalVersionWeights The second version, and the percentage of traffic that's
       * routed to it. 
       */
      public fun additionalVersionWeights(additionalVersionWeights: List<Any>)

      /**
       * @param additionalVersionWeights The second version, and the percentage of traffic that's
       * routed to it. 
       */
      public fun additionalVersionWeights(vararg additionalVersionWeights: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty.builder()

      /**
       * @param additionalVersionWeights The second version, and the percentage of traffic that's
       * routed to it. 
       */
      override fun additionalVersionWeights(additionalVersionWeights: IResolvable) {
        cdkBuilder.additionalVersionWeights(additionalVersionWeights.let(IResolvable::unwrap))
      }

      /**
       * @param additionalVersionWeights The second version, and the percentage of traffic that's
       * routed to it. 
       */
      override fun additionalVersionWeights(additionalVersionWeights: List<Any>) {
        cdkBuilder.additionalVersionWeights(additionalVersionWeights)
      }

      /**
       * @param additionalVersionWeights The second version, and the percentage of traffic that's
       * routed to it. 
       */
      override fun additionalVersionWeights(vararg additionalVersionWeights: Any): Unit =
          additionalVersionWeights(additionalVersionWeights.toList())

      public fun build():
          software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty,
    ) : CdkObject(cdkObject), AliasRoutingConfigurationProperty {
      /**
       * The second version, and the percentage of traffic that's routed to it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights)
       */
      override fun additionalVersionWeights(): Any = unwrap(this).getAdditionalVersionWeights()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AliasRoutingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty):
          AliasRoutingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AliasRoutingConfigurationProperty):
          software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty
    }
  }

  public interface ProvisionedConcurrencyConfigurationProperty {
    /**
     * The amount of provisioned concurrency to allocate for the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-provisionedconcurrencyconfiguration.html#cfn-lambda-alias-provisionedconcurrencyconfiguration-provisionedconcurrentexecutions)
     */
    public fun provisionedConcurrentExecutions(): Number

    /**
     * A builder for [ProvisionedConcurrencyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param provisionedConcurrentExecutions The amount of provisioned concurrency to allocate
       * for the alias. 
       */
      public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty.builder()

      /**
       * @param provisionedConcurrentExecutions The amount of provisioned concurrency to allocate
       * for the alias. 
       */
      override fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
        cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty,
    ) : CdkObject(cdkObject), ProvisionedConcurrencyConfigurationProperty {
      /**
       * The amount of provisioned concurrency to allocate for the alias.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-provisionedconcurrencyconfiguration.html#cfn-lambda-alias-provisionedconcurrencyconfiguration-provisionedconcurrentexecutions)
       */
      override fun provisionedConcurrentExecutions(): Number =
          unwrap(this).getProvisionedConcurrentExecutions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProvisionedConcurrencyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty):
          ProvisionedConcurrencyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedConcurrencyConfigurationProperty):
          software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty
    }
  }

  public interface VersionWeightProperty {
    /**
     * The qualifier of the second version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionversion)
     */
    public fun functionVersion(): String

    /**
     * The percentage of traffic that the alias routes to the second version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionweight)
     */
    public fun functionWeight(): Number

    /**
     * A builder for [VersionWeightProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param functionVersion The qualifier of the second version. 
       */
      public fun functionVersion(functionVersion: String)

      /**
       * @param functionWeight The percentage of traffic that the alias routes to the second
       * version. 
       */
      public fun functionWeight(functionWeight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.builder()

      /**
       * @param functionVersion The qualifier of the second version. 
       */
      override fun functionVersion(functionVersion: String) {
        cdkBuilder.functionVersion(functionVersion)
      }

      /**
       * @param functionWeight The percentage of traffic that the alias routes to the second
       * version. 
       */
      override fun functionWeight(functionWeight: Number) {
        cdkBuilder.functionWeight(functionWeight)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty,
    ) : CdkObject(cdkObject), VersionWeightProperty {
      /**
       * The qualifier of the second version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionversion)
       */
      override fun functionVersion(): String = unwrap(this).getFunctionVersion()

      /**
       * The percentage of traffic that the alias routes to the second version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionweight)
       */
      override fun functionWeight(): Number = unwrap(this).getFunctionWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VersionWeightProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty):
          VersionWeightProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VersionWeightProperty):
          software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty
    }
  }
}
