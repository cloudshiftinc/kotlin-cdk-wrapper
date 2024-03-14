package io.cloudshiftdev.awscdk.services.lambda

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.CfnVersion,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ARN of the version.
   */
  public open fun attrFunctionArn(): String = unwrap(this).getAttrFunctionArn()

  /**
   * The version number.
   */
  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  /**
   * Only publish a version if the hash value matches the value that's specified.
   */
  public open fun codeSha256(): String? = unwrap(this).getCodeSha256()

  /**
   * Only publish a version if the hash value matches the value that's specified.
   */
  public open fun codeSha256(`value`: String) {
    unwrap(this).setCodeSha256(`value`)
  }

  /**
   * A description for the version to override the description in the function configuration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the version to override the description in the function configuration.
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
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies a provisioned concurrency configuration for a function's version.
   */
  public open fun provisionedConcurrencyConfig(): Any? =
      unwrap(this).getProvisionedConcurrencyConfig()

  /**
   * Specifies a provisioned concurrency configuration for a function's version.
   */
  public open fun provisionedConcurrencyConfig(`value`: IResolvable) {
    unwrap(this).setProvisionedConcurrencyConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies a provisioned concurrency configuration for a function's version.
   */
  public open
      fun provisionedConcurrencyConfig(`value`: ProvisionedConcurrencyConfigurationProperty) {
    unwrap(this).setProvisionedConcurrencyConfig(`value`.let(ProvisionedConcurrencyConfigurationProperty::unwrap))
  }

  /**
   * Specifies a provisioned concurrency configuration for a function's version.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bce3e1203f25d7f54d7c0600ff88df5f2bdb34e43783ff15b82f37a6b96bce7c")
  public open
      fun provisionedConcurrencyConfig(`value`: ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit):
      Unit = provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty(`value`))

  /**
   * Runtime Management Config of a function.
   */
  public open fun runtimePolicy(): Any? = unwrap(this).getRuntimePolicy()

  /**
   * Runtime Management Config of a function.
   */
  public open fun runtimePolicy(`value`: IResolvable) {
    unwrap(this).setRuntimePolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * Runtime Management Config of a function.
   */
  public open fun runtimePolicy(`value`: RuntimePolicyProperty) {
    unwrap(this).setRuntimePolicy(`value`.let(RuntimePolicyProperty::unwrap))
  }

  /**
   * Runtime Management Config of a function.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5ce6ca93eebe50a05090453fa3f644dd4864a1a0fc1dacdbee33c4caf5a3325")
  public open fun runtimePolicy(`value`: RuntimePolicyProperty.Builder.() -> Unit): Unit =
      runtimePolicy(RuntimePolicyProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CfnVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Only publish a version if the hash value matches the value that's specified.
     *
     * Use this option to avoid publishing a version if the function code has changed since you last
     * updated it. Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-codesha256)
     * @param codeSha256 Only publish a version if the hash value matches the value that's
     * specified. 
     */
    public fun codeSha256(codeSha256: String)

    /**
     * A description for the version to override the description in the function configuration.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-description)
     * @param description A description for the version to override the description in the function
     * configuration. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-functionname)
     * @param functionName The name of the Lambda function. 
     */
    public fun functionName(functionName: String)

    /**
     * Specifies a provisioned concurrency configuration for a function's version.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-provisionedconcurrencyconfig)
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     * function's version. 
     */
    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable)

    /**
     * Specifies a provisioned concurrency configuration for a function's version.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-provisionedconcurrencyconfig)
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     * function's version. 
     */
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty)

    /**
     * Specifies a provisioned concurrency configuration for a function's version.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-provisionedconcurrencyconfig)
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     * function's version. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("432d513b1b189cd2d3072b81cb79413843ea783d3ab9da260500e42fd1f195a5")
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit)

    /**
     * Runtime Management Config of a function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-runtimepolicy)
     * @param runtimePolicy Runtime Management Config of a function. 
     */
    public fun runtimePolicy(runtimePolicy: IResolvable)

    /**
     * Runtime Management Config of a function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-runtimepolicy)
     * @param runtimePolicy Runtime Management Config of a function. 
     */
    public fun runtimePolicy(runtimePolicy: RuntimePolicyProperty)

    /**
     * Runtime Management Config of a function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-runtimepolicy)
     * @param runtimePolicy Runtime Management Config of a function. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0ab2f030fc478fd5d60453eabf7b2bd12e0ba9a0baf099951259bc38c6da412")
    public fun runtimePolicy(runtimePolicy: RuntimePolicyProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnVersion.Builder =
        software.amazon.awscdk.services.lambda.CfnVersion.Builder.create(scope, id)

    /**
     * Only publish a version if the hash value matches the value that's specified.
     *
     * Use this option to avoid publishing a version if the function code has changed since you last
     * updated it. Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-codesha256)
     * @param codeSha256 Only publish a version if the hash value matches the value that's
     * specified. 
     */
    override fun codeSha256(codeSha256: String) {
      cdkBuilder.codeSha256(codeSha256)
    }

    /**
     * A description for the version to override the description in the function configuration.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-description)
     * @param description A description for the version to override the description in the function
     * configuration. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-functionname)
     * @param functionName The name of the Lambda function. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * Specifies a provisioned concurrency configuration for a function's version.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-provisionedconcurrencyconfig)
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     * function's version. 
     */
    override fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies a provisioned concurrency configuration for a function's version.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-provisionedconcurrencyconfig)
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     * function's version. 
     */
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(ProvisionedConcurrencyConfigurationProperty::unwrap))
    }

    /**
     * Specifies a provisioned concurrency configuration for a function's version.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-provisionedconcurrencyconfig)
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     * function's version. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("432d513b1b189cd2d3072b81cb79413843ea783d3ab9da260500e42fd1f195a5")
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit):
        Unit =
        provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty(provisionedConcurrencyConfig))

    /**
     * Runtime Management Config of a function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-runtimepolicy)
     * @param runtimePolicy Runtime Management Config of a function. 
     */
    override fun runtimePolicy(runtimePolicy: IResolvable) {
      cdkBuilder.runtimePolicy(runtimePolicy.let(IResolvable::unwrap))
    }

    /**
     * Runtime Management Config of a function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-runtimepolicy)
     * @param runtimePolicy Runtime Management Config of a function. 
     */
    override fun runtimePolicy(runtimePolicy: RuntimePolicyProperty) {
      cdkBuilder.runtimePolicy(runtimePolicy.let(RuntimePolicyProperty::unwrap))
    }

    /**
     * Runtime Management Config of a function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-runtimepolicy)
     * @param runtimePolicy Runtime Management Config of a function. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0ab2f030fc478fd5d60453eabf7b2bd12e0ba9a0baf099951259bc38c6da412")
    override fun runtimePolicy(runtimePolicy: RuntimePolicyProperty.Builder.() -> Unit): Unit =
        runtimePolicy(RuntimePolicyProperty(runtimePolicy))

    public fun build(): software.amazon.awscdk.services.lambda.CfnVersion = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnVersion): CfnVersion =
        CfnVersion(cdkObject)

    internal fun unwrap(wrapped: CfnVersion): software.amazon.awscdk.services.lambda.CfnVersion =
        wrapped.cdkObject
  }

  public interface ProvisionedConcurrencyConfigurationProperty {
    /**
     * The amount of provisioned concurrency to allocate for the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-provisionedconcurrencyconfiguration.html#cfn-lambda-version-provisionedconcurrencyconfiguration-provisionedconcurrentexecutions)
     */
    public fun provisionedConcurrentExecutions(): Number

    /**
     * A builder for [ProvisionedConcurrencyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param provisionedConcurrentExecutions The amount of provisioned concurrency to allocate
       * for the version. 
       */
      public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty.builder()

      /**
       * @param provisionedConcurrentExecutions The amount of provisioned concurrency to allocate
       * for the version. 
       */
      override fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
        cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty,
    ) : ProvisionedConcurrencyConfigurationProperty {
      /**
       * The amount of provisioned concurrency to allocate for the version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-provisionedconcurrencyconfiguration.html#cfn-lambda-version-provisionedconcurrencyconfiguration-provisionedconcurrentexecutions)
       */
      override fun provisionedConcurrentExecutions(): Number =
          unwrap(this).getProvisionedConcurrentExecutions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProvisionedConcurrencyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty):
          ProvisionedConcurrencyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedConcurrencyConfigurationProperty):
          software.amazon.awscdk.services.lambda.CfnVersion.ProvisionedConcurrencyConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RuntimePolicyProperty {
    /**
     * The ARN of the runtime the function is configured to use.
     *
     * If the runtime update mode is manual, the ARN is returned, otherwise null is returned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-runtimepolicy.html#cfn-lambda-version-runtimepolicy-runtimeversionarn)
     */
    public fun runtimeVersionArn(): String? = unwrap(this).getRuntimeVersionArn()

    /**
     * The runtime update mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-runtimepolicy.html#cfn-lambda-version-runtimepolicy-updateruntimeon)
     */
    public fun updateRuntimeOn(): String

    /**
     * A builder for [RuntimePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param runtimeVersionArn The ARN of the runtime the function is configured to use.
       * If the runtime update mode is manual, the ARN is returned, otherwise null is returned.
       */
      public fun runtimeVersionArn(runtimeVersionArn: String)

      /**
       * @param updateRuntimeOn The runtime update mode. 
       */
      public fun updateRuntimeOn(updateRuntimeOn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnVersion.RuntimePolicyProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnVersion.RuntimePolicyProperty.builder()

      /**
       * @param runtimeVersionArn The ARN of the runtime the function is configured to use.
       * If the runtime update mode is manual, the ARN is returned, otherwise null is returned.
       */
      override fun runtimeVersionArn(runtimeVersionArn: String) {
        cdkBuilder.runtimeVersionArn(runtimeVersionArn)
      }

      /**
       * @param updateRuntimeOn The runtime update mode. 
       */
      override fun updateRuntimeOn(updateRuntimeOn: String) {
        cdkBuilder.updateRuntimeOn(updateRuntimeOn)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnVersion.RuntimePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnVersion.RuntimePolicyProperty,
    ) : RuntimePolicyProperty {
      /**
       * The ARN of the runtime the function is configured to use.
       *
       * If the runtime update mode is manual, the ARN is returned, otherwise null is returned.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-runtimepolicy.html#cfn-lambda-version-runtimepolicy-runtimeversionarn)
       */
      override fun runtimeVersionArn(): String? = unwrap(this).getRuntimeVersionArn()

      /**
       * The runtime update mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-runtimepolicy.html#cfn-lambda-version-runtimepolicy-updateruntimeon)
       */
      override fun updateRuntimeOn(): String = unwrap(this).getUpdateRuntimeOn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuntimePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnVersion.RuntimePolicyProperty):
          RuntimePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimePolicyProperty):
          software.amazon.awscdk.services.lambda.CfnVersion.RuntimePolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
