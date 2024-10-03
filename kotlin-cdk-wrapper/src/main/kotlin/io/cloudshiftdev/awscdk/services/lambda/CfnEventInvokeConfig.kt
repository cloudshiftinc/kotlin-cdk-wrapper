@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Lambda::EventInvokeConfig` resource configures options for [asynchronous
 * invocation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html) on a version or an
 * alias.
 *
 * By default, Lambda retries an asynchronous invocation twice if the function returns an error. It
 * retains events in a queue for up to six hours. When an event fails all processing attempts or stays
 * in the asynchronous invocation queue for too long, Lambda discards it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CfnEventInvokeConfig cfnEventInvokeConfig = CfnEventInvokeConfig.Builder.create(this,
 * "MyCfnEventInvokeConfig")
 * .functionName("functionName")
 * .qualifier("qualifier")
 * // the properties below are optional
 * .destinationConfig(DestinationConfigProperty.builder()
 * .onFailure(OnFailureProperty.builder()
 * .destination("destination")
 * .build())
 * .onSuccess(OnSuccessProperty.builder()
 * .destination("destination")
 * .build())
 * .build())
 * .maximumEventAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html)
 */
public open class CfnEventInvokeConfig(
  cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventInvokeConfigProps,
  ) :
      this(software.amazon.awscdk.services.lambda.CfnEventInvokeConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventInvokeConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventInvokeConfigProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventInvokeConfigProps(props)
  )

  /**
   * A destination for events after they have been sent to a function for processing.
   */
  public open fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

  /**
   * A destination for events after they have been sent to a function for processing.
   */
  public open fun destinationConfig(`value`: IResolvable) {
    unwrap(this).setDestinationConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A destination for events after they have been sent to a function for processing.
   */
  public open fun destinationConfig(`value`: DestinationConfigProperty) {
    unwrap(this).setDestinationConfig(`value`.let(DestinationConfigProperty.Companion::unwrap))
  }

  /**
   * A destination for events after they have been sent to a function for processing.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51071391ab2065c4a85e885ccafae73dcc98625e9f12ff0498b83b2a1bc7898d")
  public open fun destinationConfig(`value`: DestinationConfigProperty.Builder.() -> Unit): Unit =
      destinationConfig(DestinationConfigProperty(`value`))

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The maximum age of a request that Lambda sends to a function for processing.
   */
  public open fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

  /**
   * The maximum age of a request that Lambda sends to a function for processing.
   */
  public open fun maximumEventAgeInSeconds(`value`: Number) {
    unwrap(this).setMaximumEventAgeInSeconds(`value`)
  }

  /**
   * The maximum number of times to retry when the function returns an error.
   */
  public open fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

  /**
   * The maximum number of times to retry when the function returns an error.
   */
  public open fun maximumRetryAttempts(`value`: Number) {
    unwrap(this).setMaximumRetryAttempts(`value`)
  }

  /**
   * The identifier of a version or alias.
   */
  public open fun qualifier(): String = unwrap(this).getQualifier()

  /**
   * The identifier of a version or alias.
   */
  public open fun qualifier(`value`: String) {
    unwrap(this).setQualifier(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CfnEventInvokeConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A destination for events after they have been sent to a function for processing.
     *
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig)
     * @param destinationConfig A destination for events after they have been sent to a function for
     * processing. 
     */
    public fun destinationConfig(destinationConfig: IResolvable)

    /**
     * A destination for events after they have been sent to a function for processing.
     *
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig)
     * @param destinationConfig A destination for events after they have been sent to a function for
     * processing. 
     */
    public fun destinationConfig(destinationConfig: DestinationConfigProperty)

    /**
     * A destination for events after they have been sent to a function for processing.
     *
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig)
     * @param destinationConfig A destination for events after they have been sent to a function for
     * processing. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca885fb89db3d06474f73cc9783d10f31ac516380983e476d8f99f36065cb22b")
    public fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit)

    /**
     * The name of the Lambda function.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `64`
     *
     * *Pattern* : `([a-zA-Z0-9-_]+)`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-functionname)
     * @param functionName The name of the Lambda function. 
     */
    public fun functionName(functionName: String)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumeventageinseconds)
     * @param maximumEventAgeInSeconds The maximum age of a request that Lambda sends to a function
     * for processing. 
     */
    public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumretryattempts)
     * @param maximumRetryAttempts The maximum number of times to retry when the function returns an
     * error. 
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number)

    /**
     * The identifier of a version or alias.
     *
     * * *Version* - A version number.
     * * *Alias* - An alias name.
     * * *Latest* - To specify the unpublished version, use `$LATEST` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-qualifier)
     * @param qualifier The identifier of a version or alias. 
     */
    public fun qualifier(qualifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.Builder =
        software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.Builder.create(scope, id)

    /**
     * A destination for events after they have been sent to a function for processing.
     *
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig)
     * @param destinationConfig A destination for events after they have been sent to a function for
     * processing. 
     */
    override fun destinationConfig(destinationConfig: IResolvable) {
      cdkBuilder.destinationConfig(destinationConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * A destination for events after they have been sent to a function for processing.
     *
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig)
     * @param destinationConfig A destination for events after they have been sent to a function for
     * processing. 
     */
    override fun destinationConfig(destinationConfig: DestinationConfigProperty) {
      cdkBuilder.destinationConfig(destinationConfig.let(DestinationConfigProperty.Companion::unwrap))
    }

    /**
     * A destination for events after they have been sent to a function for processing.
     *
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig)
     * @param destinationConfig A destination for events after they have been sent to a function for
     * processing. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca885fb89db3d06474f73cc9783d10f31ac516380983e476d8f99f36065cb22b")
    override fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit):
        Unit = destinationConfig(DestinationConfigProperty(destinationConfig))

    /**
     * The name of the Lambda function.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `64`
     *
     * *Pattern* : `([a-zA-Z0-9-_]+)`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-functionname)
     * @param functionName The name of the Lambda function. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumeventageinseconds)
     * @param maximumEventAgeInSeconds The maximum age of a request that Lambda sends to a function
     * for processing. 
     */
    override fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
      cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumretryattempts)
     * @param maximumRetryAttempts The maximum number of times to retry when the function returns an
     * error. 
     */
    override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    /**
     * The identifier of a version or alias.
     *
     * * *Version* - A version number.
     * * *Alias* - An alias name.
     * * *Latest* - To specify the unpublished version, use `$LATEST` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-qualifier)
     * @param qualifier The identifier of a version or alias. 
     */
    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnEventInvokeConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventInvokeConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventInvokeConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig):
        CfnEventInvokeConfig = CfnEventInvokeConfig(cdkObject)

    internal fun unwrap(wrapped: CfnEventInvokeConfig):
        software.amazon.awscdk.services.lambda.CfnEventInvokeConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.CfnEventInvokeConfig
  }

  /**
   * A configuration object that specifies the destination of an event after Lambda processes it.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * DestinationConfigProperty destinationConfigProperty = DestinationConfigProperty.builder()
   * .onFailure(OnFailureProperty.builder()
   * .destination("destination")
   * .build())
   * .onSuccess(OnSuccessProperty.builder()
   * .destination("destination")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig.html)
   */
  public interface DestinationConfigProperty {
    /**
     * The destination configuration for failed invocations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig-onfailure)
     */
    public fun onFailure(): Any? = unwrap(this).getOnFailure()

    /**
     * The destination configuration for successful invocations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig-onsuccess)
     */
    public fun onSuccess(): Any? = unwrap(this).getOnSuccess()

    /**
     * A builder for [DestinationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      public fun onFailure(onFailure: IResolvable)

      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      public fun onFailure(onFailure: OnFailureProperty)

      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dbdff09ea3f6ad25eed2fd3d1089285979e928fe6db4b712232e789e38d983e")
      public fun onFailure(onFailure: OnFailureProperty.Builder.() -> Unit)

      /**
       * @param onSuccess The destination configuration for successful invocations.
       */
      public fun onSuccess(onSuccess: IResolvable)

      /**
       * @param onSuccess The destination configuration for successful invocations.
       */
      public fun onSuccess(onSuccess: OnSuccessProperty)

      /**
       * @param onSuccess The destination configuration for successful invocations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28faf1b795b060a72e364409fac9a5a0f08d96ec620d72677131ccf7b582231f")
      public fun onSuccess(onSuccess: OnSuccessProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty.builder()

      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      override fun onFailure(onFailure: IResolvable) {
        cdkBuilder.onFailure(onFailure.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      override fun onFailure(onFailure: OnFailureProperty) {
        cdkBuilder.onFailure(onFailure.let(OnFailureProperty.Companion::unwrap))
      }

      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dbdff09ea3f6ad25eed2fd3d1089285979e928fe6db4b712232e789e38d983e")
      override fun onFailure(onFailure: OnFailureProperty.Builder.() -> Unit): Unit =
          onFailure(OnFailureProperty(onFailure))

      /**
       * @param onSuccess The destination configuration for successful invocations.
       */
      override fun onSuccess(onSuccess: IResolvable) {
        cdkBuilder.onSuccess(onSuccess.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param onSuccess The destination configuration for successful invocations.
       */
      override fun onSuccess(onSuccess: OnSuccessProperty) {
        cdkBuilder.onSuccess(onSuccess.let(OnSuccessProperty.Companion::unwrap))
      }

      /**
       * @param onSuccess The destination configuration for successful invocations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28faf1b795b060a72e364409fac9a5a0f08d96ec620d72677131ccf7b582231f")
      override fun onSuccess(onSuccess: OnSuccessProperty.Builder.() -> Unit): Unit =
          onSuccess(OnSuccessProperty(onSuccess))

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty,
    ) : CdkObject(cdkObject),
        DestinationConfigProperty {
      /**
       * The destination configuration for failed invocations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig-onfailure)
       */
      override fun onFailure(): Any? = unwrap(this).getOnFailure()

      /**
       * The destination configuration for successful invocations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig-onsuccess)
       */
      override fun onSuccess(): Any? = unwrap(this).getOnSuccess()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty):
          DestinationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty
    }
  }

  /**
   * A destination for events that failed processing.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * OnFailureProperty onFailureProperty = OnFailureProperty.builder()
   * .destination("destination")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-onfailure.html)
   */
  public interface OnFailureProperty {
    /**
     * The Amazon Resource Name (ARN) of the destination resource.
     *
     * To retain records of [asynchronous
     * invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
     * , you can configure an Amazon SNS topic, Amazon SQS queue, Lambda function, or Amazon
     * EventBridge event bus as the destination.
     *
     * To retain records of failed invocations from [Kinesis and DynamoDB event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#event-source-mapping-destinations)
     * , you can configure an Amazon SNS topic or Amazon SQS queue as the destination.
     *
     * To retain records of failed invocations from [self-managed
     * Kafka](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka.html#services-smaa-onfailure-destination)
     * or [Amazon
     * MSK](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-onfailure-destination)
     * , you can configure an Amazon SNS topic, Amazon SQS queue, or Amazon S3 bucket as the
     * destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-onfailure.html#cfn-lambda-eventinvokeconfig-onfailure-destination)
     */
    public fun destination(): String

    /**
     * A builder for [OnFailureProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination The Amazon Resource Name (ARN) of the destination resource. 
       * To retain records of [asynchronous
       * invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, Lambda function, or Amazon
       * EventBridge event bus as the destination.
       *
       * To retain records of failed invocations from [Kinesis and DynamoDB event
       * sources](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#event-source-mapping-destinations)
       * , you can configure an Amazon SNS topic or Amazon SQS queue as the destination.
       *
       * To retain records of failed invocations from [self-managed
       * Kafka](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka.html#services-smaa-onfailure-destination)
       * or [Amazon
       * MSK](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-onfailure-destination)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, or Amazon S3 bucket as the
       * destination.
       */
      public fun destination(destination: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty.builder()

      /**
       * @param destination The Amazon Resource Name (ARN) of the destination resource. 
       * To retain records of [asynchronous
       * invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, Lambda function, or Amazon
       * EventBridge event bus as the destination.
       *
       * To retain records of failed invocations from [Kinesis and DynamoDB event
       * sources](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#event-source-mapping-destinations)
       * , you can configure an Amazon SNS topic or Amazon SQS queue as the destination.
       *
       * To retain records of failed invocations from [self-managed
       * Kafka](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka.html#services-smaa-onfailure-destination)
       * or [Amazon
       * MSK](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-onfailure-destination)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, or Amazon S3 bucket as the
       * destination.
       */
      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty,
    ) : CdkObject(cdkObject),
        OnFailureProperty {
      /**
       * The Amazon Resource Name (ARN) of the destination resource.
       *
       * To retain records of [asynchronous
       * invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, Lambda function, or Amazon
       * EventBridge event bus as the destination.
       *
       * To retain records of failed invocations from [Kinesis and DynamoDB event
       * sources](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#event-source-mapping-destinations)
       * , you can configure an Amazon SNS topic or Amazon SQS queue as the destination.
       *
       * To retain records of failed invocations from [self-managed
       * Kafka](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka.html#services-smaa-onfailure-destination)
       * or [Amazon
       * MSK](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-onfailure-destination)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, or Amazon S3 bucket as the
       * destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-onfailure.html#cfn-lambda-eventinvokeconfig-onfailure-destination)
       */
      override fun destination(): String = unwrap(this).getDestination()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OnFailureProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty):
          OnFailureProperty = CdkObjectWrappers.wrap(cdkObject) as? OnFailureProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnFailureProperty):
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty
    }
  }

  /**
   * A destination for events that were processed successfully.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * OnSuccessProperty onSuccessProperty = OnSuccessProperty.builder()
   * .destination("destination")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-onsuccess.html)
   */
  public interface OnSuccessProperty {
    /**
     * The Amazon Resource Name (ARN) of the destination resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-onsuccess.html#cfn-lambda-eventinvokeconfig-onsuccess-destination)
     */
    public fun destination(): String

    /**
     * A builder for [OnSuccessProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination The Amazon Resource Name (ARN) of the destination resource. 
       */
      public fun destination(destination: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty.builder()

      /**
       * @param destination The Amazon Resource Name (ARN) of the destination resource. 
       */
      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty,
    ) : CdkObject(cdkObject),
        OnSuccessProperty {
      /**
       * The Amazon Resource Name (ARN) of the destination resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-onsuccess.html#cfn-lambda-eventinvokeconfig-onsuccess-destination)
       */
      override fun destination(): String = unwrap(this).getDestination()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OnSuccessProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty):
          OnSuccessProperty = CdkObjectWrappers.wrap(cdkObject) as? OnSuccessProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnSuccessProperty):
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty
    }
  }
}
