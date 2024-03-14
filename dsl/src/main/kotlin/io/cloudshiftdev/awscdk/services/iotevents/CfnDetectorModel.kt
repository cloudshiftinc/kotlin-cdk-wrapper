package io.cloudshiftdev.awscdk.services.iotevents

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDetectorModel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Information that defines how a detector operates.
   */
  public open fun detectorModelDefinition(): Any = unwrap(this).getDetectorModelDefinition()

  /**
   * Information that defines how a detector operates.
   */
  public open fun detectorModelDefinition(`value`: IResolvable) {
    unwrap(this).setDetectorModelDefinition(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information that defines how a detector operates.
   */
  public open fun detectorModelDefinition(`value`: DetectorModelDefinitionProperty) {
    unwrap(this).setDetectorModelDefinition(`value`.let(DetectorModelDefinitionProperty::unwrap))
  }

  /**
   * Information that defines how a detector operates.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0be0ab418d81047424da88cf1617c9e3b43e06a7ab4bed9affa7e9e0c4ff8c07")
  public open
      fun detectorModelDefinition(`value`: DetectorModelDefinitionProperty.Builder.() -> Unit): Unit
      = detectorModelDefinition(DetectorModelDefinitionProperty(`value`))

  /**
   * A brief description of the detector model.
   */
  public open fun detectorModelDescription(): String? = unwrap(this).getDetectorModelDescription()

  /**
   * A brief description of the detector model.
   */
  public open fun detectorModelDescription(`value`: String) {
    unwrap(this).setDetectorModelDescription(`value`)
  }

  /**
   * The name of the detector model.
   */
  public open fun detectorModelName(): String? = unwrap(this).getDetectorModelName()

  /**
   * The name of the detector model.
   */
  public open fun detectorModelName(`value`: String) {
    unwrap(this).setDetectorModelName(`value`)
  }

  /**
   * Information about the order in which events are evaluated and how actions are executed.
   */
  public open fun evaluationMethod(): String? = unwrap(this).getEvaluationMethod()

  /**
   * Information about the order in which events are evaluated and how actions are executed.
   */
  public open fun evaluationMethod(`value`: String) {
    unwrap(this).setEvaluationMethod(`value`)
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
   * The value used to identify a detector instance.
   */
  public open fun key(): String? = unwrap(this).getKey()

  /**
   * The value used to identify a detector instance.
   */
  public open fun key(`value`: String) {
    unwrap(this).setKey(`value`)
  }

  /**
   * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotevents.CfnDetectorModel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Information that defines how a detector operates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldefinition)
     * @param detectorModelDefinition Information that defines how a detector operates. 
     */
    public fun detectorModelDefinition(detectorModelDefinition: IResolvable)

    /**
     * Information that defines how a detector operates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldefinition)
     * @param detectorModelDefinition Information that defines how a detector operates. 
     */
    public fun detectorModelDefinition(detectorModelDefinition: DetectorModelDefinitionProperty)

    /**
     * Information that defines how a detector operates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldefinition)
     * @param detectorModelDefinition Information that defines how a detector operates. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be401907fd580a622c85830db56b4abba9620bf2dd662a4747952551dd3f424b")
    public
        fun detectorModelDefinition(detectorModelDefinition: DetectorModelDefinitionProperty.Builder.() -> Unit)

    /**
     * A brief description of the detector model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldescription)
     * @param detectorModelDescription A brief description of the detector model. 
     */
    public fun detectorModelDescription(detectorModelDescription: String)

    /**
     * The name of the detector model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodelname)
     * @param detectorModelName The name of the detector model. 
     */
    public fun detectorModelName(detectorModelName: String)

    /**
     * Information about the order in which events are evaluated and how actions are executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-evaluationmethod)
     * @param evaluationMethod Information about the order in which events are evaluated and how
     * actions are executed. 
     */
    public fun evaluationMethod(evaluationMethod: String)

    /**
     * The value used to identify a detector instance.
     *
     * When a device or system sends input, a new detector instance with a unique key value is
     * created. AWS IoT Events can continue to route input to its corresponding detector instance based
     * on this identifying information.
     *
     * This parameter uses a JSON-path expression to select the attribute-value pair in the message
     * payload that is used for identification. To route the message to the correct detector instance,
     * the device must send a message payload that contains the same attribute-value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-key)
     * @param key The value used to identify a detector instance. 
     */
    public fun key(key: String)

    /**
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-rolearn)
     * @param roleArn The ARN of the role that grants permission to AWS IoT Events to perform its
     * operations. 
     */
    public fun roleArn(roleArn: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotevents.CfnDetectorModel.Builder =
        software.amazon.awscdk.services.iotevents.CfnDetectorModel.Builder.create(scope, id)

    /**
     * Information that defines how a detector operates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldefinition)
     * @param detectorModelDefinition Information that defines how a detector operates. 
     */
    override fun detectorModelDefinition(detectorModelDefinition: IResolvable) {
      cdkBuilder.detectorModelDefinition(detectorModelDefinition.let(IResolvable::unwrap))
    }

    /**
     * Information that defines how a detector operates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldefinition)
     * @param detectorModelDefinition Information that defines how a detector operates. 
     */
    override fun detectorModelDefinition(detectorModelDefinition: DetectorModelDefinitionProperty) {
      cdkBuilder.detectorModelDefinition(detectorModelDefinition.let(DetectorModelDefinitionProperty::unwrap))
    }

    /**
     * Information that defines how a detector operates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldefinition)
     * @param detectorModelDefinition Information that defines how a detector operates. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be401907fd580a622c85830db56b4abba9620bf2dd662a4747952551dd3f424b")
    override
        fun detectorModelDefinition(detectorModelDefinition: DetectorModelDefinitionProperty.Builder.() -> Unit):
        Unit = detectorModelDefinition(DetectorModelDefinitionProperty(detectorModelDefinition))

    /**
     * A brief description of the detector model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldescription)
     * @param detectorModelDescription A brief description of the detector model. 
     */
    override fun detectorModelDescription(detectorModelDescription: String) {
      cdkBuilder.detectorModelDescription(detectorModelDescription)
    }

    /**
     * The name of the detector model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodelname)
     * @param detectorModelName The name of the detector model. 
     */
    override fun detectorModelName(detectorModelName: String) {
      cdkBuilder.detectorModelName(detectorModelName)
    }

    /**
     * Information about the order in which events are evaluated and how actions are executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-evaluationmethod)
     * @param evaluationMethod Information about the order in which events are evaluated and how
     * actions are executed. 
     */
    override fun evaluationMethod(evaluationMethod: String) {
      cdkBuilder.evaluationMethod(evaluationMethod)
    }

    /**
     * The value used to identify a detector instance.
     *
     * When a device or system sends input, a new detector instance with a unique key value is
     * created. AWS IoT Events can continue to route input to its corresponding detector instance based
     * on this identifying information.
     *
     * This parameter uses a JSON-path expression to select the attribute-value pair in the message
     * payload that is used for identification. To route the message to the correct detector instance,
     * the device must send a message payload that contains the same attribute-value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-key)
     * @param key The value used to identify a detector instance. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-rolearn)
     * @param roleArn The ARN of the role that grants permission to AWS IoT Events to perform its
     * operations. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotevents.CfnDetectorModel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDetectorModel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDetectorModel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel):
        CfnDetectorModel = CfnDetectorModel(cdkObject)

    internal fun unwrap(wrapped: CfnDetectorModel):
        software.amazon.awscdk.services.iotevents.CfnDetectorModel = wrapped.cdkObject
  }

  public interface ResetTimerProperty {
    /**
     * The name of the timer to reset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-resettimer.html#cfn-iotevents-detectormodel-resettimer-timername)
     */
    public fun timerName(): String

    /**
     * A builder for [ResetTimerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param timerName The name of the timer to reset. 
       */
      public fun timerName(timerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty.builder()

      /**
       * @param timerName The name of the timer to reset. 
       */
      override fun timerName(timerName: String) {
        cdkBuilder.timerName(timerName)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty,
    ) : CdkObject(cdkObject), ResetTimerProperty {
      /**
       * The name of the timer to reset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-resettimer.html#cfn-iotevents-detectormodel-resettimer-timername)
       */
      override fun timerName(): String = unwrap(this).getTimerName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResetTimerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty):
          ResetTimerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResetTimerProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty
    }
  }

  public interface SetTimerProperty {
    /**
     * The duration of the timer, in seconds.
     *
     * You can use a string expression that includes numbers, variables (
     * `$variable.&lt;variable-name&gt;` ), and input values (
     * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the duration. The range of the duration
     * is 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated
     * result of the duration is rounded down to the nearest whole number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-durationexpression)
     */
    public fun durationExpression(): String? = unwrap(this).getDurationExpression()

    /**
     * The number of seconds until the timer expires.
     *
     * The minimum value is 60 seconds to ensure accuracy. The maximum value is 31622400 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-seconds)
     */
    public fun seconds(): Number? = unwrap(this).getSeconds()

    /**
     * The name of the timer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-timername)
     */
    public fun timerName(): String

    /**
     * A builder for [SetTimerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param durationExpression The duration of the timer, in seconds.
       * You can use a string expression that includes numbers, variables (
       * `$variable.&lt;variable-name&gt;` ), and input values (
       * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the duration. The range of the duration
       * is 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated
       * result of the duration is rounded down to the nearest whole number.
       */
      public fun durationExpression(durationExpression: String)

      /**
       * @param seconds The number of seconds until the timer expires.
       * The minimum value is 60 seconds to ensure accuracy. The maximum value is 31622400 seconds.
       */
      public fun seconds(seconds: Number)

      /**
       * @param timerName The name of the timer. 
       */
      public fun timerName(timerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty.builder()

      /**
       * @param durationExpression The duration of the timer, in seconds.
       * You can use a string expression that includes numbers, variables (
       * `$variable.&lt;variable-name&gt;` ), and input values (
       * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the duration. The range of the duration
       * is 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated
       * result of the duration is rounded down to the nearest whole number.
       */
      override fun durationExpression(durationExpression: String) {
        cdkBuilder.durationExpression(durationExpression)
      }

      /**
       * @param seconds The number of seconds until the timer expires.
       * The minimum value is 60 seconds to ensure accuracy. The maximum value is 31622400 seconds.
       */
      override fun seconds(seconds: Number) {
        cdkBuilder.seconds(seconds)
      }

      /**
       * @param timerName The name of the timer. 
       */
      override fun timerName(timerName: String) {
        cdkBuilder.timerName(timerName)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty,
    ) : CdkObject(cdkObject), SetTimerProperty {
      /**
       * The duration of the timer, in seconds.
       *
       * You can use a string expression that includes numbers, variables (
       * `$variable.&lt;variable-name&gt;` ), and input values (
       * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the duration. The range of the duration
       * is 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated
       * result of the duration is rounded down to the nearest whole number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-durationexpression)
       */
      override fun durationExpression(): String? = unwrap(this).getDurationExpression()

      /**
       * The number of seconds until the timer expires.
       *
       * The minimum value is 60 seconds to ensure accuracy. The maximum value is 31622400 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-seconds)
       */
      override fun seconds(): Number? = unwrap(this).getSeconds()

      /**
       * The name of the timer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-timername)
       */
      override fun timerName(): String = unwrap(this).getTimerName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SetTimerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty):
          SetTimerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SetTimerProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty
    }
  }

  public interface PayloadProperty {
    /**
     * The content of the payload.
     *
     * You can use a string expression that includes quoted strings ( `'&lt;string&gt;'` ),
     * variables ( `$variable.&lt;variable-name&gt;` ), input values (
     * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ), string concatenations, and quoted strings
     * that contain `${}` as the content. The recommended maximum size of a content expression is 1 KB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html#cfn-iotevents-detectormodel-payload-contentexpression)
     */
    public fun contentExpression(): String

    /**
     * The value of the payload type can be either `STRING` or `JSON` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html#cfn-iotevents-detectormodel-payload-type)
     */
    public fun type(): String

    /**
     * A builder for [PayloadProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentExpression The content of the payload. 
       * You can use a string expression that includes quoted strings ( `'&lt;string&gt;'` ),
       * variables ( `$variable.&lt;variable-name&gt;` ), input values (
       * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ), string concatenations, and quoted strings
       * that contain `${}` as the content. The recommended maximum size of a content expression is 1
       * KB.
       */
      public fun contentExpression(contentExpression: String)

      /**
       * @param type The value of the payload type can be either `STRING` or `JSON` . 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty.builder()

      /**
       * @param contentExpression The content of the payload. 
       * You can use a string expression that includes quoted strings ( `'&lt;string&gt;'` ),
       * variables ( `$variable.&lt;variable-name&gt;` ), input values (
       * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ), string concatenations, and quoted strings
       * that contain `${}` as the content. The recommended maximum size of a content expression is 1
       * KB.
       */
      override fun contentExpression(contentExpression: String) {
        cdkBuilder.contentExpression(contentExpression)
      }

      /**
       * @param type The value of the payload type can be either `STRING` or `JSON` . 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty,
    ) : CdkObject(cdkObject), PayloadProperty {
      /**
       * The content of the payload.
       *
       * You can use a string expression that includes quoted strings ( `'&lt;string&gt;'` ),
       * variables ( `$variable.&lt;variable-name&gt;` ), input values (
       * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ), string concatenations, and quoted strings
       * that contain `${}` as the content. The recommended maximum size of a content expression is 1
       * KB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html#cfn-iotevents-detectormodel-payload-contentexpression)
       */
      override fun contentExpression(): String = unwrap(this).getContentExpression()

      /**
       * The value of the payload type can be either `STRING` or `JSON` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html#cfn-iotevents-detectormodel-payload-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty):
          PayloadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PayloadProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty
    }
  }

  public interface TransitionEventProperty {
    /**
     * The actions to be performed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-actions)
     */
    public fun actions(): Any? = unwrap(this).getActions()

    /**
     * Required.
     *
     * A Boolean expression that when TRUE causes the actions to be performed and the `nextState` to
     * be entered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-condition)
     */
    public fun condition(): String

    /**
     * The name of the transition event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-eventname)
     */
    public fun eventName(): String

    /**
     * The next state to enter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-nextstate)
     */
    public fun nextState(): String

    /**
     * A builder for [TransitionEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions The actions to be performed.
       */
      public fun actions(actions: IResolvable)

      /**
       * @param actions The actions to be performed.
       */
      public fun actions(actions: List<Any>)

      /**
       * @param actions The actions to be performed.
       */
      public fun actions(vararg actions: Any)

      /**
       * @param condition Required. 
       * A Boolean expression that when TRUE causes the actions to be performed and the `nextState`
       * to be entered.
       */
      public fun condition(condition: String)

      /**
       * @param eventName The name of the transition event. 
       */
      public fun eventName(eventName: String)

      /**
       * @param nextState The next state to enter. 
       */
      public fun nextState(nextState: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty.builder()

      /**
       * @param actions The actions to be performed.
       */
      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      /**
       * @param actions The actions to be performed.
       */
      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions The actions to be performed.
       */
      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      /**
       * @param condition Required. 
       * A Boolean expression that when TRUE causes the actions to be performed and the `nextState`
       * to be entered.
       */
      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      /**
       * @param eventName The name of the transition event. 
       */
      override fun eventName(eventName: String) {
        cdkBuilder.eventName(eventName)
      }

      /**
       * @param nextState The next state to enter. 
       */
      override fun nextState(nextState: String) {
        cdkBuilder.nextState(nextState)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty,
    ) : CdkObject(cdkObject), TransitionEventProperty {
      /**
       * The actions to be performed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-actions)
       */
      override fun actions(): Any? = unwrap(this).getActions()

      /**
       * Required.
       *
       * A Boolean expression that when TRUE causes the actions to be performed and the `nextState`
       * to be entered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-condition)
       */
      override fun condition(): String = unwrap(this).getCondition()

      /**
       * The name of the transition event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-eventname)
       */
      override fun eventName(): String = unwrap(this).getEventName()

      /**
       * The next state to enter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-nextstate)
       */
      override fun nextState(): String = unwrap(this).getNextState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransitionEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty):
          TransitionEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransitionEventProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty
    }
  }

  public interface IotEventsProperty {
    /**
     * The name of the AWS IoT Events input where the data is sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html#cfn-iotevents-detectormodel-iotevents-inputname)
     */
    public fun inputName(): String

    /**
     * You can configure the action payload when you send a message to an AWS IoT Events input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html#cfn-iotevents-detectormodel-iotevents-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * A builder for [IotEventsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputName The name of the AWS IoT Events input where the data is sent. 
       */
      public fun inputName(inputName: String)

      /**
       * @param payload You can configure the action payload when you send a message to an AWS IoT
       * Events input.
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload You can configure the action payload when you send a message to an AWS IoT
       * Events input.
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload You can configure the action payload when you send a message to an AWS IoT
       * Events input.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee353d5ad9081f54075a59c294379906f437f7cca9320c9a370872bbd1ab6acd")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty.builder()

      /**
       * @param inputName The name of the AWS IoT Events input where the data is sent. 
       */
      override fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
      }

      /**
       * @param payload You can configure the action payload when you send a message to an AWS IoT
       * Events input.
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to an AWS IoT
       * Events input.
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to an AWS IoT
       * Events input.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee353d5ad9081f54075a59c294379906f437f7cca9320c9a370872bbd1ab6acd")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty,
    ) : CdkObject(cdkObject), IotEventsProperty {
      /**
       * The name of the AWS IoT Events input where the data is sent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html#cfn-iotevents-detectormodel-iotevents-inputname)
       */
      override fun inputName(): String = unwrap(this).getInputName()

      /**
       * You can configure the action payload when you send a message to an AWS IoT Events input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html#cfn-iotevents-detectormodel-iotevents-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IotEventsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty):
          IotEventsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotEventsProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty
    }
  }

  public interface OnInputProperty {
    /**
     * Specifies the actions performed when the `condition` evaluates to TRUE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html#cfn-iotevents-detectormodel-oninput-events)
     */
    public fun events(): Any? = unwrap(this).getEvents()

    /**
     * Specifies the actions performed, and the next state entered, when a `condition` evaluates to
     * TRUE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html#cfn-iotevents-detectormodel-oninput-transitionevents)
     */
    public fun transitionEvents(): Any? = unwrap(this).getTransitionEvents()

    /**
     * A builder for [OnInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param events Specifies the actions performed when the `condition` evaluates to TRUE.
       */
      public fun events(events: IResolvable)

      /**
       * @param events Specifies the actions performed when the `condition` evaluates to TRUE.
       */
      public fun events(events: List<Any>)

      /**
       * @param events Specifies the actions performed when the `condition` evaluates to TRUE.
       */
      public fun events(vararg events: Any)

      /**
       * @param transitionEvents Specifies the actions performed, and the next state entered, when a
       * `condition` evaluates to TRUE.
       */
      public fun transitionEvents(transitionEvents: IResolvable)

      /**
       * @param transitionEvents Specifies the actions performed, and the next state entered, when a
       * `condition` evaluates to TRUE.
       */
      public fun transitionEvents(transitionEvents: List<Any>)

      /**
       * @param transitionEvents Specifies the actions performed, and the next state entered, when a
       * `condition` evaluates to TRUE.
       */
      public fun transitionEvents(vararg transitionEvents: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty.builder()

      /**
       * @param events Specifies the actions performed when the `condition` evaluates to TRUE.
       */
      override fun events(events: IResolvable) {
        cdkBuilder.events(events.let(IResolvable::unwrap))
      }

      /**
       * @param events Specifies the actions performed when the `condition` evaluates to TRUE.
       */
      override fun events(events: List<Any>) {
        cdkBuilder.events(events)
      }

      /**
       * @param events Specifies the actions performed when the `condition` evaluates to TRUE.
       */
      override fun events(vararg events: Any): Unit = events(events.toList())

      /**
       * @param transitionEvents Specifies the actions performed, and the next state entered, when a
       * `condition` evaluates to TRUE.
       */
      override fun transitionEvents(transitionEvents: IResolvable) {
        cdkBuilder.transitionEvents(transitionEvents.let(IResolvable::unwrap))
      }

      /**
       * @param transitionEvents Specifies the actions performed, and the next state entered, when a
       * `condition` evaluates to TRUE.
       */
      override fun transitionEvents(transitionEvents: List<Any>) {
        cdkBuilder.transitionEvents(transitionEvents)
      }

      /**
       * @param transitionEvents Specifies the actions performed, and the next state entered, when a
       * `condition` evaluates to TRUE.
       */
      override fun transitionEvents(vararg transitionEvents: Any): Unit =
          transitionEvents(transitionEvents.toList())

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty,
    ) : CdkObject(cdkObject), OnInputProperty {
      /**
       * Specifies the actions performed when the `condition` evaluates to TRUE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html#cfn-iotevents-detectormodel-oninput-events)
       */
      override fun events(): Any? = unwrap(this).getEvents()

      /**
       * Specifies the actions performed, and the next state entered, when a `condition` evaluates
       * to TRUE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html#cfn-iotevents-detectormodel-oninput-transitionevents)
       */
      override fun transitionEvents(): Any? = unwrap(this).getTransitionEvents()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OnInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty):
          OnInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnInputProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty
    }
  }

  public interface EventProperty {
    /**
     * The actions to be performed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-actions)
     */
    public fun actions(): Any? = unwrap(this).getActions()

    /**
     * Optional.
     *
     * The Boolean expression that, when TRUE, causes the `actions` to be performed. If not present,
     * the actions are performed (=TRUE). If the expression result is not a Boolean value, the actions
     * are not performed (=FALSE).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-condition)
     */
    public fun condition(): String? = unwrap(this).getCondition()

    /**
     * The name of the event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-eventname)
     */
    public fun eventName(): String

    /**
     * A builder for [EventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions The actions to be performed.
       */
      public fun actions(actions: IResolvable)

      /**
       * @param actions The actions to be performed.
       */
      public fun actions(actions: List<Any>)

      /**
       * @param actions The actions to be performed.
       */
      public fun actions(vararg actions: Any)

      /**
       * @param condition Optional.
       * The Boolean expression that, when TRUE, causes the `actions` to be performed. If not
       * present, the actions are performed (=TRUE). If the expression result is not a Boolean value,
       * the actions are not performed (=FALSE).
       */
      public fun condition(condition: String)

      /**
       * @param eventName The name of the event. 
       */
      public fun eventName(eventName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty.builder()

      /**
       * @param actions The actions to be performed.
       */
      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      /**
       * @param actions The actions to be performed.
       */
      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions The actions to be performed.
       */
      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      /**
       * @param condition Optional.
       * The Boolean expression that, when TRUE, causes the `actions` to be performed. If not
       * present, the actions are performed (=TRUE). If the expression result is not a Boolean value,
       * the actions are not performed (=FALSE).
       */
      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      /**
       * @param eventName The name of the event. 
       */
      override fun eventName(eventName: String) {
        cdkBuilder.eventName(eventName)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty,
    ) : CdkObject(cdkObject), EventProperty {
      /**
       * The actions to be performed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-actions)
       */
      override fun actions(): Any? = unwrap(this).getActions()

      /**
       * Optional.
       *
       * The Boolean expression that, when TRUE, causes the `actions` to be performed. If not
       * present, the actions are performed (=TRUE). If the expression result is not a Boolean value,
       * the actions are not performed (=FALSE).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-condition)
       */
      override fun condition(): String? = unwrap(this).getCondition()

      /**
       * The name of the event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-eventname)
       */
      override fun eventName(): String = unwrap(this).getEventName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty):
          EventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty
    }
  }

  public interface SnsProperty {
    /**
     * You can configure the action payload when you send a message as an Amazon SNS push
     * notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sns.html#cfn-iotevents-detectormodel-sns-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * The ARN of the Amazon SNS target where the message is sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sns.html#cfn-iotevents-detectormodel-sns-targetarn)
     */
    public fun targetArn(): String

    /**
     * A builder for [SnsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param payload You can configure the action payload when you send a message as an Amazon
       * SNS push notification.
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload You can configure the action payload when you send a message as an Amazon
       * SNS push notification.
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload You can configure the action payload when you send a message as an Amazon
       * SNS push notification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e38e9ec707c2083d5fed07bf997a90a6a70e3ebbe1e8aefb34e3837bbdf5085")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      /**
       * @param targetArn The ARN of the Amazon SNS target where the message is sent. 
       */
      public fun targetArn(targetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty.builder()

      /**
       * @param payload You can configure the action payload when you send a message as an Amazon
       * SNS push notification.
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message as an Amazon
       * SNS push notification.
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message as an Amazon
       * SNS push notification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e38e9ec707c2083d5fed07bf997a90a6a70e3ebbe1e8aefb34e3837bbdf5085")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      /**
       * @param targetArn The ARN of the Amazon SNS target where the message is sent. 
       */
      override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty,
    ) : CdkObject(cdkObject), SnsProperty {
      /**
       * You can configure the action payload when you send a message as an Amazon SNS push
       * notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sns.html#cfn-iotevents-detectormodel-sns-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()

      /**
       * The ARN of the Amazon SNS target where the message is sent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sns.html#cfn-iotevents-detectormodel-sns-targetarn)
       */
      override fun targetArn(): String = unwrap(this).getTargetArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty):
          SnsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty
    }
  }

  public interface FirehoseProperty {
    /**
     * The name of the Kinesis Data Firehose delivery stream where the data is written.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-deliverystreamname)
     */
    public fun deliveryStreamName(): String

    /**
     * You can configure the action payload when you send a message to an Amazon Data Firehose
     * delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * A character separator that is used to separate records written to the Kinesis Data Firehose
     * delivery stream.
     *
     * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-separator)
     */
    public fun separator(): String? = unwrap(this).getSeparator()

    /**
     * A builder for [FirehoseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryStreamName The name of the Kinesis Data Firehose delivery stream where the
       * data is written. 
       */
      public fun deliveryStreamName(deliveryStreamName: String)

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * Data Firehose delivery stream.
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * Data Firehose delivery stream.
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * Data Firehose delivery stream.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d6fe46e21f28c628927db685594aa34ebd736bce6212a486e4151fb794fa754")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      /**
       * @param separator A character separator that is used to separate records written to the
       * Kinesis Data Firehose delivery stream.
       * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
       */
      public fun separator(separator: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty.builder()

      /**
       * @param deliveryStreamName The name of the Kinesis Data Firehose delivery stream where the
       * data is written. 
       */
      override fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
      }

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * Data Firehose delivery stream.
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * Data Firehose delivery stream.
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * Data Firehose delivery stream.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d6fe46e21f28c628927db685594aa34ebd736bce6212a486e4151fb794fa754")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      /**
       * @param separator A character separator that is used to separate records written to the
       * Kinesis Data Firehose delivery stream.
       * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
       */
      override fun separator(separator: String) {
        cdkBuilder.separator(separator)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty,
    ) : CdkObject(cdkObject), FirehoseProperty {
      /**
       * The name of the Kinesis Data Firehose delivery stream where the data is written.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-deliverystreamname)
       */
      override fun deliveryStreamName(): String = unwrap(this).getDeliveryStreamName()

      /**
       * You can configure the action payload when you send a message to an Amazon Data Firehose
       * delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()

      /**
       * A character separator that is used to separate records written to the Kinesis Data Firehose
       * delivery stream.
       *
       * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-separator)
       */
      override fun separator(): String? = unwrap(this).getSeparator()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty):
          FirehoseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty
    }
  }

  public interface IotSiteWiseProperty {
    /**
     * The ID of the asset that has the specified property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-assetid)
     */
    public fun assetId(): String? = unwrap(this).getAssetId()

    /**
     * A unique identifier for this entry.
     *
     * You can use the entry ID to track which data entry causes an error in case of failure. The
     * default is a new unique identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-entryid)
     */
    public fun entryId(): String? = unwrap(this).getEntryId()

    /**
     * The alias of the asset property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyalias)
     */
    public fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

    /**
     * The ID of the asset property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyid)
     */
    public fun propertyId(): String? = unwrap(this).getPropertyId()

    /**
     * The value to send to the asset property.
     *
     * This value contains timestamp, quality, and value (TQV) information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyvalue)
     */
    public fun propertyValue(): Any

    /**
     * A builder for [IotSiteWiseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param assetId The ID of the asset that has the specified property.
       */
      public fun assetId(assetId: String)

      /**
       * @param entryId A unique identifier for this entry.
       * You can use the entry ID to track which data entry causes an error in case of failure. The
       * default is a new unique identifier.
       */
      public fun entryId(entryId: String)

      /**
       * @param propertyAlias The alias of the asset property.
       */
      public fun propertyAlias(propertyAlias: String)

      /**
       * @param propertyId The ID of the asset property.
       */
      public fun propertyId(propertyId: String)

      /**
       * @param propertyValue The value to send to the asset property. 
       * This value contains timestamp, quality, and value (TQV) information.
       */
      public fun propertyValue(propertyValue: IResolvable)

      /**
       * @param propertyValue The value to send to the asset property. 
       * This value contains timestamp, quality, and value (TQV) information.
       */
      public fun propertyValue(propertyValue: AssetPropertyValueProperty)

      /**
       * @param propertyValue The value to send to the asset property. 
       * This value contains timestamp, quality, and value (TQV) information.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b0a81d6728ba70e437a86613bfd50d5ce58f813db9dabb984529bd6e6bd215b")
      public fun propertyValue(propertyValue: AssetPropertyValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty.builder()

      /**
       * @param assetId The ID of the asset that has the specified property.
       */
      override fun assetId(assetId: String) {
        cdkBuilder.assetId(assetId)
      }

      /**
       * @param entryId A unique identifier for this entry.
       * You can use the entry ID to track which data entry causes an error in case of failure. The
       * default is a new unique identifier.
       */
      override fun entryId(entryId: String) {
        cdkBuilder.entryId(entryId)
      }

      /**
       * @param propertyAlias The alias of the asset property.
       */
      override fun propertyAlias(propertyAlias: String) {
        cdkBuilder.propertyAlias(propertyAlias)
      }

      /**
       * @param propertyId The ID of the asset property.
       */
      override fun propertyId(propertyId: String) {
        cdkBuilder.propertyId(propertyId)
      }

      /**
       * @param propertyValue The value to send to the asset property. 
       * This value contains timestamp, quality, and value (TQV) information.
       */
      override fun propertyValue(propertyValue: IResolvable) {
        cdkBuilder.propertyValue(propertyValue.let(IResolvable::unwrap))
      }

      /**
       * @param propertyValue The value to send to the asset property. 
       * This value contains timestamp, quality, and value (TQV) information.
       */
      override fun propertyValue(propertyValue: AssetPropertyValueProperty) {
        cdkBuilder.propertyValue(propertyValue.let(AssetPropertyValueProperty::unwrap))
      }

      /**
       * @param propertyValue The value to send to the asset property. 
       * This value contains timestamp, quality, and value (TQV) information.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b0a81d6728ba70e437a86613bfd50d5ce58f813db9dabb984529bd6e6bd215b")
      override fun propertyValue(propertyValue: AssetPropertyValueProperty.Builder.() -> Unit): Unit
          = propertyValue(AssetPropertyValueProperty(propertyValue))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty,
    ) : CdkObject(cdkObject), IotSiteWiseProperty {
      /**
       * The ID of the asset that has the specified property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-assetid)
       */
      override fun assetId(): String? = unwrap(this).getAssetId()

      /**
       * A unique identifier for this entry.
       *
       * You can use the entry ID to track which data entry causes an error in case of failure. The
       * default is a new unique identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-entryid)
       */
      override fun entryId(): String? = unwrap(this).getEntryId()

      /**
       * The alias of the asset property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyalias)
       */
      override fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

      /**
       * The ID of the asset property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyid)
       */
      override fun propertyId(): String? = unwrap(this).getPropertyId()

      /**
       * The value to send to the asset property.
       *
       * This value contains timestamp, quality, and value (TQV) information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html#cfn-iotevents-detectormodel-iotsitewise-propertyvalue)
       */
      override fun propertyValue(): Any = unwrap(this).getPropertyValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IotSiteWiseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty):
          IotSiteWiseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotSiteWiseProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotSiteWiseProperty
    }
  }

  public interface SetVariableProperty {
    /**
     * The new value of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-setvariable.html#cfn-iotevents-detectormodel-setvariable-value)
     */
    public fun `value`(): String

    /**
     * The name of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-setvariable.html#cfn-iotevents-detectormodel-setvariable-variablename)
     */
    public fun variableName(): String

    /**
     * A builder for [SetVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The new value of the variable. 
       */
      public fun `value`(`value`: String)

      /**
       * @param variableName The name of the variable. 
       */
      public fun variableName(variableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty.builder()

      /**
       * @param value The new value of the variable. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param variableName The name of the variable. 
       */
      override fun variableName(variableName: String) {
        cdkBuilder.variableName(variableName)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty,
    ) : CdkObject(cdkObject), SetVariableProperty {
      /**
       * The new value of the variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-setvariable.html#cfn-iotevents-detectormodel-setvariable-value)
       */
      override fun `value`(): String = unwrap(this).getValue()

      /**
       * The name of the variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-setvariable.html#cfn-iotevents-detectormodel-setvariable-variablename)
       */
      override fun variableName(): String = unwrap(this).getVariableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SetVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty):
          SetVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SetVariableProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty
    }
  }

  public interface StateProperty {
    /**
     * When entering this state, perform these `actions` if the `condition` is TRUE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html#cfn-iotevents-detectormodel-state-onenter)
     */
    public fun onEnter(): Any? = unwrap(this).getOnEnter()

    /**
     * When exiting this state, perform these `actions` if the specified `condition` is `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html#cfn-iotevents-detectormodel-state-onexit)
     */
    public fun onExit(): Any? = unwrap(this).getOnExit()

    /**
     * When an input is received and the `condition` is TRUE, perform the specified `actions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html#cfn-iotevents-detectormodel-state-oninput)
     */
    public fun onInput(): Any? = unwrap(this).getOnInput()

    /**
     * The name of the state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html#cfn-iotevents-detectormodel-state-statename)
     */
    public fun stateName(): String

    /**
     * A builder for [StateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onEnter When entering this state, perform these `actions` if the `condition` is
       * TRUE.
       */
      public fun onEnter(onEnter: IResolvable)

      /**
       * @param onEnter When entering this state, perform these `actions` if the `condition` is
       * TRUE.
       */
      public fun onEnter(onEnter: OnEnterProperty)

      /**
       * @param onEnter When entering this state, perform these `actions` if the `condition` is
       * TRUE.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dbe58dcb1ee46d3682f5d957890d6d35ed4f0b55ee4a740236fff99ba95e6019")
      public fun onEnter(onEnter: OnEnterProperty.Builder.() -> Unit)

      /**
       * @param onExit When exiting this state, perform these `actions` if the specified `condition`
       * is `TRUE` .
       */
      public fun onExit(onExit: IResolvable)

      /**
       * @param onExit When exiting this state, perform these `actions` if the specified `condition`
       * is `TRUE` .
       */
      public fun onExit(onExit: OnExitProperty)

      /**
       * @param onExit When exiting this state, perform these `actions` if the specified `condition`
       * is `TRUE` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82574d1c4fd6f6dbdc274d99921b89e2e192d9dc583c55c881c81073a30135eb")
      public fun onExit(onExit: OnExitProperty.Builder.() -> Unit)

      /**
       * @param onInput When an input is received and the `condition` is TRUE, perform the specified
       * `actions` .
       */
      public fun onInput(onInput: IResolvable)

      /**
       * @param onInput When an input is received and the `condition` is TRUE, perform the specified
       * `actions` .
       */
      public fun onInput(onInput: OnInputProperty)

      /**
       * @param onInput When an input is received and the `condition` is TRUE, perform the specified
       * `actions` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a872d3afe5265eeedc06502a337e9640e005a3bb2011a2f860fa9510635164f6")
      public fun onInput(onInput: OnInputProperty.Builder.() -> Unit)

      /**
       * @param stateName The name of the state. 
       */
      public fun stateName(stateName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty.builder()

      /**
       * @param onEnter When entering this state, perform these `actions` if the `condition` is
       * TRUE.
       */
      override fun onEnter(onEnter: IResolvable) {
        cdkBuilder.onEnter(onEnter.let(IResolvable::unwrap))
      }

      /**
       * @param onEnter When entering this state, perform these `actions` if the `condition` is
       * TRUE.
       */
      override fun onEnter(onEnter: OnEnterProperty) {
        cdkBuilder.onEnter(onEnter.let(OnEnterProperty::unwrap))
      }

      /**
       * @param onEnter When entering this state, perform these `actions` if the `condition` is
       * TRUE.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dbe58dcb1ee46d3682f5d957890d6d35ed4f0b55ee4a740236fff99ba95e6019")
      override fun onEnter(onEnter: OnEnterProperty.Builder.() -> Unit): Unit =
          onEnter(OnEnterProperty(onEnter))

      /**
       * @param onExit When exiting this state, perform these `actions` if the specified `condition`
       * is `TRUE` .
       */
      override fun onExit(onExit: IResolvable) {
        cdkBuilder.onExit(onExit.let(IResolvable::unwrap))
      }

      /**
       * @param onExit When exiting this state, perform these `actions` if the specified `condition`
       * is `TRUE` .
       */
      override fun onExit(onExit: OnExitProperty) {
        cdkBuilder.onExit(onExit.let(OnExitProperty::unwrap))
      }

      /**
       * @param onExit When exiting this state, perform these `actions` if the specified `condition`
       * is `TRUE` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82574d1c4fd6f6dbdc274d99921b89e2e192d9dc583c55c881c81073a30135eb")
      override fun onExit(onExit: OnExitProperty.Builder.() -> Unit): Unit =
          onExit(OnExitProperty(onExit))

      /**
       * @param onInput When an input is received and the `condition` is TRUE, perform the specified
       * `actions` .
       */
      override fun onInput(onInput: IResolvable) {
        cdkBuilder.onInput(onInput.let(IResolvable::unwrap))
      }

      /**
       * @param onInput When an input is received and the `condition` is TRUE, perform the specified
       * `actions` .
       */
      override fun onInput(onInput: OnInputProperty) {
        cdkBuilder.onInput(onInput.let(OnInputProperty::unwrap))
      }

      /**
       * @param onInput When an input is received and the `condition` is TRUE, perform the specified
       * `actions` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a872d3afe5265eeedc06502a337e9640e005a3bb2011a2f860fa9510635164f6")
      override fun onInput(onInput: OnInputProperty.Builder.() -> Unit): Unit =
          onInput(OnInputProperty(onInput))

      /**
       * @param stateName The name of the state. 
       */
      override fun stateName(stateName: String) {
        cdkBuilder.stateName(stateName)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty,
    ) : CdkObject(cdkObject), StateProperty {
      /**
       * When entering this state, perform these `actions` if the `condition` is TRUE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html#cfn-iotevents-detectormodel-state-onenter)
       */
      override fun onEnter(): Any? = unwrap(this).getOnEnter()

      /**
       * When exiting this state, perform these `actions` if the specified `condition` is `TRUE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html#cfn-iotevents-detectormodel-state-onexit)
       */
      override fun onExit(): Any? = unwrap(this).getOnExit()

      /**
       * When an input is received and the `condition` is TRUE, perform the specified `actions` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html#cfn-iotevents-detectormodel-state-oninput)
       */
      override fun onInput(): Any? = unwrap(this).getOnInput()

      /**
       * The name of the state.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html#cfn-iotevents-detectormodel-state-statename)
       */
      override fun stateName(): String = unwrap(this).getStateName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty):
          StateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StateProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty
    }
  }

  public interface ClearTimerProperty {
    /**
     * The name of the timer to clear.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html#cfn-iotevents-detectormodel-cleartimer-timername)
     */
    public fun timerName(): String

    /**
     * A builder for [ClearTimerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param timerName The name of the timer to clear. 
       */
      public fun timerName(timerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty.builder()

      /**
       * @param timerName The name of the timer to clear. 
       */
      override fun timerName(timerName: String) {
        cdkBuilder.timerName(timerName)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty,
    ) : CdkObject(cdkObject), ClearTimerProperty {
      /**
       * The name of the timer to clear.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html#cfn-iotevents-detectormodel-cleartimer-timername)
       */
      override fun timerName(): String = unwrap(this).getTimerName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClearTimerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty):
          ClearTimerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClearTimerProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty
    }
  }

  public interface OnExitProperty {
    /**
     * Specifies the `actions` that are performed when the state is exited and the `condition` is
     * `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onexit.html#cfn-iotevents-detectormodel-onexit-events)
     */
    public fun events(): Any? = unwrap(this).getEvents()

    /**
     * A builder for [OnExitProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param events Specifies the `actions` that are performed when the state is exited and the
       * `condition` is `TRUE` .
       */
      public fun events(events: IResolvable)

      /**
       * @param events Specifies the `actions` that are performed when the state is exited and the
       * `condition` is `TRUE` .
       */
      public fun events(events: List<Any>)

      /**
       * @param events Specifies the `actions` that are performed when the state is exited and the
       * `condition` is `TRUE` .
       */
      public fun events(vararg events: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty.builder()

      /**
       * @param events Specifies the `actions` that are performed when the state is exited and the
       * `condition` is `TRUE` .
       */
      override fun events(events: IResolvable) {
        cdkBuilder.events(events.let(IResolvable::unwrap))
      }

      /**
       * @param events Specifies the `actions` that are performed when the state is exited and the
       * `condition` is `TRUE` .
       */
      override fun events(events: List<Any>) {
        cdkBuilder.events(events)
      }

      /**
       * @param events Specifies the `actions` that are performed when the state is exited and the
       * `condition` is `TRUE` .
       */
      override fun events(vararg events: Any): Unit = events(events.toList())

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty,
    ) : CdkObject(cdkObject), OnExitProperty {
      /**
       * Specifies the `actions` that are performed when the state is exited and the `condition` is
       * `TRUE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onexit.html#cfn-iotevents-detectormodel-onexit-events)
       */
      override fun events(): Any? = unwrap(this).getEvents()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OnExitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty):
          OnExitProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnExitProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty
    }
  }

  public interface IotTopicPublishProperty {
    /**
     * The MQTT topic of the message.
     *
     * You can use a string expression that includes variables ( `$variable.&lt;variable-name&gt;` )
     * and input values ( `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the topic string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html#cfn-iotevents-detectormodel-iottopicpublish-mqtttopic)
     */
    public fun mqttTopic(): String

    /**
     * You can configure the action payload when you publish a message to an AWS IoT Core topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html#cfn-iotevents-detectormodel-iottopicpublish-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * A builder for [IotTopicPublishProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mqttTopic The MQTT topic of the message. 
       * You can use a string expression that includes variables ( `$variable.&lt;variable-name&gt;`
       * ) and input values ( `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the topic string.
       */
      public fun mqttTopic(mqttTopic: String)

      /**
       * @param payload You can configure the action payload when you publish a message to an AWS
       * IoT Core topic.
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload You can configure the action payload when you publish a message to an AWS
       * IoT Core topic.
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload You can configure the action payload when you publish a message to an AWS
       * IoT Core topic.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c17305249a77373a0a0d90b8ca415f03c90b527f54a63a1d107e5d424fc9362")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty.builder()

      /**
       * @param mqttTopic The MQTT topic of the message. 
       * You can use a string expression that includes variables ( `$variable.&lt;variable-name&gt;`
       * ) and input values ( `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the topic string.
       */
      override fun mqttTopic(mqttTopic: String) {
        cdkBuilder.mqttTopic(mqttTopic)
      }

      /**
       * @param payload You can configure the action payload when you publish a message to an AWS
       * IoT Core topic.
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you publish a message to an AWS
       * IoT Core topic.
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you publish a message to an AWS
       * IoT Core topic.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c17305249a77373a0a0d90b8ca415f03c90b527f54a63a1d107e5d424fc9362")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty,
    ) : CdkObject(cdkObject), IotTopicPublishProperty {
      /**
       * The MQTT topic of the message.
       *
       * You can use a string expression that includes variables ( `$variable.&lt;variable-name&gt;`
       * ) and input values ( `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the topic string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html#cfn-iotevents-detectormodel-iottopicpublish-mqtttopic)
       */
      override fun mqttTopic(): String = unwrap(this).getMqttTopic()

      /**
       * You can configure the action payload when you publish a message to an AWS IoT Core topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html#cfn-iotevents-detectormodel-iottopicpublish-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IotTopicPublishProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty):
          IotTopicPublishProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotTopicPublishProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty
    }
  }

  public interface AssetPropertyTimestampProperty {
    /**
     * The nanosecond offset converted from `timeInSeconds` .
     *
     * The valid range is between 0-999999999.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html#cfn-iotevents-detectormodel-assetpropertytimestamp-offsetinnanos)
     */
    public fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

    /**
     * The timestamp, in seconds, in the Unix epoch format.
     *
     * The valid range is between 1-31556889864403199.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html#cfn-iotevents-detectormodel-assetpropertytimestamp-timeinseconds)
     */
    public fun timeInSeconds(): String

    /**
     * A builder for [AssetPropertyTimestampProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param offsetInNanos The nanosecond offset converted from `timeInSeconds` .
       * The valid range is between 0-999999999.
       */
      public fun offsetInNanos(offsetInNanos: String)

      /**
       * @param timeInSeconds The timestamp, in seconds, in the Unix epoch format. 
       * The valid range is between 1-31556889864403199.
       */
      public fun timeInSeconds(timeInSeconds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty.builder()

      /**
       * @param offsetInNanos The nanosecond offset converted from `timeInSeconds` .
       * The valid range is between 0-999999999.
       */
      override fun offsetInNanos(offsetInNanos: String) {
        cdkBuilder.offsetInNanos(offsetInNanos)
      }

      /**
       * @param timeInSeconds The timestamp, in seconds, in the Unix epoch format. 
       * The valid range is between 1-31556889864403199.
       */
      override fun timeInSeconds(timeInSeconds: String) {
        cdkBuilder.timeInSeconds(timeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty,
    ) : CdkObject(cdkObject), AssetPropertyTimestampProperty {
      /**
       * The nanosecond offset converted from `timeInSeconds` .
       *
       * The valid range is between 0-999999999.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html#cfn-iotevents-detectormodel-assetpropertytimestamp-offsetinnanos)
       */
      override fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

      /**
       * The timestamp, in seconds, in the Unix epoch format.
       *
       * The valid range is between 1-31556889864403199.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html#cfn-iotevents-detectormodel-assetpropertytimestamp-timeinseconds)
       */
      override fun timeInSeconds(): String = unwrap(this).getTimeInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyTimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty):
          AssetPropertyTimestampProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyTimestampProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty
    }
  }

  public interface DynamoDBv2Property {
    /**
     * Information needed to configure the payload.
     *
     * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
     * payload contains all attribute-value pairs that have the information about the detector model
     * instance and the event triggered the action. To configure the action payload, you can use
     * `contentExpression` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodbv2.html#cfn-iotevents-detectormodel-dynamodbv2-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * The name of the DynamoDB table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodbv2.html#cfn-iotevents-detectormodel-dynamodbv2-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [DynamoDBv2Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92706b11054bb982d6adc246c989d5714835d614a6ccb974ac9b3da004bea6e0")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      /**
       * @param tableName The name of the DynamoDB table. 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property.builder()

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92706b11054bb982d6adc246c989d5714835d614a6ccb974ac9b3da004bea6e0")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      /**
       * @param tableName The name of the DynamoDB table. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property,
    ) : CdkObject(cdkObject), DynamoDBv2Property {
      /**
       * Information needed to configure the payload.
       *
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodbv2.html#cfn-iotevents-detectormodel-dynamodbv2-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()

      /**
       * The name of the DynamoDB table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodbv2.html#cfn-iotevents-detectormodel-dynamodbv2-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBv2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property):
          DynamoDBv2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBv2Property):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBv2Property
    }
  }

  public interface ActionProperty {
    /**
     * Information needed to clear the timer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-cleartimer)
     */
    public fun clearTimer(): Any? = unwrap(this).getClearTimer()

    /**
     * Writes to the DynamoDB table that you created.
     *
     * The default action payload contains all attribute-value pairs that have the information about
     * the detector model instance and the event that triggered the action. You can customize the
     * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
     * separate column of the DynamoDB table receives one attribute-value pair in the payload that you
     * specify. For more information, see
     * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
     * in *AWS IoT Events Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-dynamodbv2)
     */
    public fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

    /**
     * Writes to the DynamoDB table that you created.
     *
     * The default action payload contains all attribute-value pairs that have the information about
     * the detector model instance and the event that triggered the action. You can customize the
     * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One
     * column of the DynamoDB table receives all attribute-value pairs in the payload that you specify.
     * For more information, see
     * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
     * in *AWS IoT Events Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-dynamodb)
     */
    public fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

    /**
     * Sends information about the detector model instance and the event that triggered the action
     * to an Amazon Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-firehose)
     */
    public fun firehose(): Any? = unwrap(this).getFirehose()

    /**
     * Sends AWS IoT Events input, which passes information about the detector model instance and
     * the event that triggered the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-iotevents)
     */
    public fun iotEvents(): Any? = unwrap(this).getIotEvents()

    /**
     * Sends information about the detector model instance and the event that triggered the action
     * to an asset property in AWS IoT SiteWise .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-iotsitewise)
     */
    public fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

    /**
     * Publishes an MQTT message with the given topic to the AWS IoT message broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-iottopicpublish)
     */
    public fun iotTopicPublish(): Any? = unwrap(this).getIotTopicPublish()

    /**
     * Calls a Lambda function, passing in information about the detector model instance and the
     * event that triggered the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-lambda)
     */
    public fun lambda(): Any? = unwrap(this).getLambda()

    /**
     * Information needed to reset the timer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-resettimer)
     */
    public fun resetTimer(): Any? = unwrap(this).getResetTimer()

    /**
     * Information needed to set the timer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-settimer)
     */
    public fun setTimer(): Any? = unwrap(this).getSetTimer()

    /**
     * Sets a variable to a specified value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-setvariable)
     */
    public fun setVariable(): Any? = unwrap(this).getSetVariable()

    /**
     * Sends an Amazon SNS message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-sns)
     */
    public fun sns(): Any? = unwrap(this).getSns()

    /**
     * Sends an Amazon SNS message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-sqs)
     */
    public fun sqs(): Any? = unwrap(this).getSqs()

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clearTimer Information needed to clear the timer.
       */
      public fun clearTimer(clearTimer: IResolvable)

      /**
       * @param clearTimer Information needed to clear the timer.
       */
      public fun clearTimer(clearTimer: ClearTimerProperty)

      /**
       * @param clearTimer Information needed to clear the timer.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db7d8aa59ad72ba9956c40031210db20762d92ca2143ca8c28105e8ffa4d2330")
      public fun clearTimer(clearTimer: ClearTimerProperty.Builder.() -> Unit)

      /**
       * @param dynamoDBv2 Writes to the DynamoDB table that you created.
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       */
      public fun dynamoDBv2(dynamoDBv2: IResolvable)

      /**
       * @param dynamoDBv2 Writes to the DynamoDB table that you created.
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       */
      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property)

      /**
       * @param dynamoDBv2 Writes to the DynamoDB table that you created.
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c1a9008a423aeec6241494d587309a0a378495d79db57e6f71f7f0c79631298")
      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property.Builder.() -> Unit)

      /**
       * @param dynamoDb Writes to the DynamoDB table that you created.
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) .
       * One column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       */
      public fun dynamoDb(dynamoDb: IResolvable)

      /**
       * @param dynamoDb Writes to the DynamoDB table that you created.
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) .
       * One column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       */
      public fun dynamoDb(dynamoDb: DynamoDBProperty)

      /**
       * @param dynamoDb Writes to the DynamoDB table that you created.
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) .
       * One column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("271fb8d9e9d3bd401ed280c04a6c8132a9a15a7419bbb659800d1c6001f55247")
      public fun dynamoDb(dynamoDb: DynamoDBProperty.Builder.() -> Unit)

      /**
       * @param firehose Sends information about the detector model instance and the event that
       * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
       */
      public fun firehose(firehose: IResolvable)

      /**
       * @param firehose Sends information about the detector model instance and the event that
       * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
       */
      public fun firehose(firehose: FirehoseProperty)

      /**
       * @param firehose Sends information about the detector model instance and the event that
       * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba3e5622ef653af9dc7a69414dece1a773589cc1710d8d6c313c58103d89ea96")
      public fun firehose(firehose: FirehoseProperty.Builder.() -> Unit)

      /**
       * @param iotEvents Sends AWS IoT Events input, which passes information about the detector
       * model instance and the event that triggered the action.
       */
      public fun iotEvents(iotEvents: IResolvable)

      /**
       * @param iotEvents Sends AWS IoT Events input, which passes information about the detector
       * model instance and the event that triggered the action.
       */
      public fun iotEvents(iotEvents: IotEventsProperty)

      /**
       * @param iotEvents Sends AWS IoT Events input, which passes information about the detector
       * model instance and the event that triggered the action.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbe1eea9f0736eafc01048f402a4e6bf8f1cdfa270fbb4f64d92a9bf0f41fbc8")
      public fun iotEvents(iotEvents: IotEventsProperty.Builder.() -> Unit)

      /**
       * @param iotSiteWise Sends information about the detector model instance and the event that
       * triggered the action to an asset property in AWS IoT SiteWise .
       */
      public fun iotSiteWise(iotSiteWise: IResolvable)

      /**
       * @param iotSiteWise Sends information about the detector model instance and the event that
       * triggered the action to an asset property in AWS IoT SiteWise .
       */
      public fun iotSiteWise(iotSiteWise: IotSiteWiseProperty)

      /**
       * @param iotSiteWise Sends information about the detector model instance and the event that
       * triggered the action to an asset property in AWS IoT SiteWise .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13de76a3d29bb10ab350e0bbb5647d9ed80366eedee0baaa488467ce2e049798")
      public fun iotSiteWise(iotSiteWise: IotSiteWiseProperty.Builder.() -> Unit)

      /**
       * @param iotTopicPublish Publishes an MQTT message with the given topic to the AWS IoT
       * message broker.
       */
      public fun iotTopicPublish(iotTopicPublish: IResolvable)

      /**
       * @param iotTopicPublish Publishes an MQTT message with the given topic to the AWS IoT
       * message broker.
       */
      public fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty)

      /**
       * @param iotTopicPublish Publishes an MQTT message with the given topic to the AWS IoT
       * message broker.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3d86740eb79d983361036690dd00226c72d80e8042b9e4b3dd5a863906d2bda")
      public fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty.Builder.() -> Unit)

      /**
       * @param lambda Calls a Lambda function, passing in information about the detector model
       * instance and the event that triggered the action.
       */
      public fun lambda(lambda: IResolvable)

      /**
       * @param lambda Calls a Lambda function, passing in information about the detector model
       * instance and the event that triggered the action.
       */
      public fun lambda(lambda: LambdaProperty)

      /**
       * @param lambda Calls a Lambda function, passing in information about the detector model
       * instance and the event that triggered the action.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6f46a622d765c1d144250b22041e53dffa376cbbc5aa99d54771f981a6d9860")
      public fun lambda(lambda: LambdaProperty.Builder.() -> Unit)

      /**
       * @param resetTimer Information needed to reset the timer.
       */
      public fun resetTimer(resetTimer: IResolvable)

      /**
       * @param resetTimer Information needed to reset the timer.
       */
      public fun resetTimer(resetTimer: ResetTimerProperty)

      /**
       * @param resetTimer Information needed to reset the timer.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65d0c667ec672fdb4688d9d5a1254d0bc36f4f59b8f07a9b32dc3dde4e2413fa")
      public fun resetTimer(resetTimer: ResetTimerProperty.Builder.() -> Unit)

      /**
       * @param sns Sends an Amazon SNS message.
       */
      public fun sns(sns: IResolvable)

      /**
       * @param sns Sends an Amazon SNS message.
       */
      public fun sns(sns: SnsProperty)

      /**
       * @param sns Sends an Amazon SNS message.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e883dec081f39433c01e22279cc6c493f080a70233f313b015f3825b71773a93")
      public fun sns(sns: SnsProperty.Builder.() -> Unit)

      /**
       * @param sqs Sends an Amazon SNS message.
       */
      public fun sqs(sqs: IResolvable)

      /**
       * @param sqs Sends an Amazon SNS message.
       */
      public fun sqs(sqs: SqsProperty)

      /**
       * @param sqs Sends an Amazon SNS message.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b9dbae7dfd14c4928d2c12b8bfa00e0cbf004bd1e552ab2aec431fec729b82")
      public fun sqs(sqs: SqsProperty.Builder.() -> Unit)

      /**
       * @param setTimer Information needed to set the timer.
       */
      public fun timer(setTimer: IResolvable)

      /**
       * @param setTimer Information needed to set the timer.
       */
      public fun timer(setTimer: SetTimerProperty)

      /**
       * @param setTimer Information needed to set the timer.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f9ff70c4b783295b08051f98891dfe8e8f9e9645de78c4e98e36d0344174e3f")
      public fun timer(setTimer: SetTimerProperty.Builder.() -> Unit)

      /**
       * @param setVariable Sets a variable to a specified value.
       */
      public fun variable(setVariable: IResolvable)

      /**
       * @param setVariable Sets a variable to a specified value.
       */
      public fun variable(setVariable: SetVariableProperty)

      /**
       * @param setVariable Sets a variable to a specified value.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("873dceb69490e6eeffb77b7388e777abb52ee40efab1926a0c667271af0768db")
      public fun variable(setVariable: SetVariableProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty.builder()

      /**
       * @param clearTimer Information needed to clear the timer.
       */
      override fun clearTimer(clearTimer: IResolvable) {
        cdkBuilder.clearTimer(clearTimer.let(IResolvable::unwrap))
      }

      /**
       * @param clearTimer Information needed to clear the timer.
       */
      override fun clearTimer(clearTimer: ClearTimerProperty) {
        cdkBuilder.clearTimer(clearTimer.let(ClearTimerProperty::unwrap))
      }

      /**
       * @param clearTimer Information needed to clear the timer.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db7d8aa59ad72ba9956c40031210db20762d92ca2143ca8c28105e8ffa4d2330")
      override fun clearTimer(clearTimer: ClearTimerProperty.Builder.() -> Unit): Unit =
          clearTimer(ClearTimerProperty(clearTimer))

      /**
       * @param dynamoDBv2 Writes to the DynamoDB table that you created.
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       */
      override fun dynamoDBv2(dynamoDBv2: IResolvable) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(IResolvable::unwrap))
      }

      /**
       * @param dynamoDBv2 Writes to the DynamoDB table that you created.
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       */
      override fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(DynamoDBv2Property::unwrap))
      }

      /**
       * @param dynamoDBv2 Writes to the DynamoDB table that you created.
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c1a9008a423aeec6241494d587309a0a378495d79db57e6f71f7f0c79631298")
      override fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property.Builder.() -> Unit): Unit =
          dynamoDBv2(DynamoDBv2Property(dynamoDBv2))

      /**
       * @param dynamoDb Writes to the DynamoDB table that you created.
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) .
       * One column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       */
      override fun dynamoDb(dynamoDb: IResolvable) {
        cdkBuilder.dynamoDb(dynamoDb.let(IResolvable::unwrap))
      }

      /**
       * @param dynamoDb Writes to the DynamoDB table that you created.
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) .
       * One column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       */
      override fun dynamoDb(dynamoDb: DynamoDBProperty) {
        cdkBuilder.dynamoDb(dynamoDb.let(DynamoDBProperty::unwrap))
      }

      /**
       * @param dynamoDb Writes to the DynamoDB table that you created.
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) .
       * One column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("271fb8d9e9d3bd401ed280c04a6c8132a9a15a7419bbb659800d1c6001f55247")
      override fun dynamoDb(dynamoDb: DynamoDBProperty.Builder.() -> Unit): Unit =
          dynamoDb(DynamoDBProperty(dynamoDb))

      /**
       * @param firehose Sends information about the detector model instance and the event that
       * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
       */
      override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable::unwrap))
      }

      /**
       * @param firehose Sends information about the detector model instance and the event that
       * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
       */
      override fun firehose(firehose: FirehoseProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseProperty::unwrap))
      }

      /**
       * @param firehose Sends information about the detector model instance and the event that
       * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba3e5622ef653af9dc7a69414dece1a773589cc1710d8d6c313c58103d89ea96")
      override fun firehose(firehose: FirehoseProperty.Builder.() -> Unit): Unit =
          firehose(FirehoseProperty(firehose))

      /**
       * @param iotEvents Sends AWS IoT Events input, which passes information about the detector
       * model instance and the event that triggered the action.
       */
      override fun iotEvents(iotEvents: IResolvable) {
        cdkBuilder.iotEvents(iotEvents.let(IResolvable::unwrap))
      }

      /**
       * @param iotEvents Sends AWS IoT Events input, which passes information about the detector
       * model instance and the event that triggered the action.
       */
      override fun iotEvents(iotEvents: IotEventsProperty) {
        cdkBuilder.iotEvents(iotEvents.let(IotEventsProperty::unwrap))
      }

      /**
       * @param iotEvents Sends AWS IoT Events input, which passes information about the detector
       * model instance and the event that triggered the action.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbe1eea9f0736eafc01048f402a4e6bf8f1cdfa270fbb4f64d92a9bf0f41fbc8")
      override fun iotEvents(iotEvents: IotEventsProperty.Builder.() -> Unit): Unit =
          iotEvents(IotEventsProperty(iotEvents))

      /**
       * @param iotSiteWise Sends information about the detector model instance and the event that
       * triggered the action to an asset property in AWS IoT SiteWise .
       */
      override fun iotSiteWise(iotSiteWise: IResolvable) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IResolvable::unwrap))
      }

      /**
       * @param iotSiteWise Sends information about the detector model instance and the event that
       * triggered the action to an asset property in AWS IoT SiteWise .
       */
      override fun iotSiteWise(iotSiteWise: IotSiteWiseProperty) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IotSiteWiseProperty::unwrap))
      }

      /**
       * @param iotSiteWise Sends information about the detector model instance and the event that
       * triggered the action to an asset property in AWS IoT SiteWise .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13de76a3d29bb10ab350e0bbb5647d9ed80366eedee0baaa488467ce2e049798")
      override fun iotSiteWise(iotSiteWise: IotSiteWiseProperty.Builder.() -> Unit): Unit =
          iotSiteWise(IotSiteWiseProperty(iotSiteWise))

      /**
       * @param iotTopicPublish Publishes an MQTT message with the given topic to the AWS IoT
       * message broker.
       */
      override fun iotTopicPublish(iotTopicPublish: IResolvable) {
        cdkBuilder.iotTopicPublish(iotTopicPublish.let(IResolvable::unwrap))
      }

      /**
       * @param iotTopicPublish Publishes an MQTT message with the given topic to the AWS IoT
       * message broker.
       */
      override fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty) {
        cdkBuilder.iotTopicPublish(iotTopicPublish.let(IotTopicPublishProperty::unwrap))
      }

      /**
       * @param iotTopicPublish Publishes an MQTT message with the given topic to the AWS IoT
       * message broker.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3d86740eb79d983361036690dd00226c72d80e8042b9e4b3dd5a863906d2bda")
      override fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty.Builder.() -> Unit):
          Unit = iotTopicPublish(IotTopicPublishProperty(iotTopicPublish))

      /**
       * @param lambda Calls a Lambda function, passing in information about the detector model
       * instance and the event that triggered the action.
       */
      override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable::unwrap))
      }

      /**
       * @param lambda Calls a Lambda function, passing in information about the detector model
       * instance and the event that triggered the action.
       */
      override fun lambda(lambda: LambdaProperty) {
        cdkBuilder.lambda(lambda.let(LambdaProperty::unwrap))
      }

      /**
       * @param lambda Calls a Lambda function, passing in information about the detector model
       * instance and the event that triggered the action.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6f46a622d765c1d144250b22041e53dffa376cbbc5aa99d54771f981a6d9860")
      override fun lambda(lambda: LambdaProperty.Builder.() -> Unit): Unit =
          lambda(LambdaProperty(lambda))

      /**
       * @param resetTimer Information needed to reset the timer.
       */
      override fun resetTimer(resetTimer: IResolvable) {
        cdkBuilder.resetTimer(resetTimer.let(IResolvable::unwrap))
      }

      /**
       * @param resetTimer Information needed to reset the timer.
       */
      override fun resetTimer(resetTimer: ResetTimerProperty) {
        cdkBuilder.resetTimer(resetTimer.let(ResetTimerProperty::unwrap))
      }

      /**
       * @param resetTimer Information needed to reset the timer.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65d0c667ec672fdb4688d9d5a1254d0bc36f4f59b8f07a9b32dc3dde4e2413fa")
      override fun resetTimer(resetTimer: ResetTimerProperty.Builder.() -> Unit): Unit =
          resetTimer(ResetTimerProperty(resetTimer))

      /**
       * @param sns Sends an Amazon SNS message.
       */
      override fun sns(sns: IResolvable) {
        cdkBuilder.sns(sns.let(IResolvable::unwrap))
      }

      /**
       * @param sns Sends an Amazon SNS message.
       */
      override fun sns(sns: SnsProperty) {
        cdkBuilder.sns(sns.let(SnsProperty::unwrap))
      }

      /**
       * @param sns Sends an Amazon SNS message.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e883dec081f39433c01e22279cc6c493f080a70233f313b015f3825b71773a93")
      override fun sns(sns: SnsProperty.Builder.() -> Unit): Unit = sns(SnsProperty(sns))

      /**
       * @param sqs Sends an Amazon SNS message.
       */
      override fun sqs(sqs: IResolvable) {
        cdkBuilder.sqs(sqs.let(IResolvable::unwrap))
      }

      /**
       * @param sqs Sends an Amazon SNS message.
       */
      override fun sqs(sqs: SqsProperty) {
        cdkBuilder.sqs(sqs.let(SqsProperty::unwrap))
      }

      /**
       * @param sqs Sends an Amazon SNS message.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b9dbae7dfd14c4928d2c12b8bfa00e0cbf004bd1e552ab2aec431fec729b82")
      override fun sqs(sqs: SqsProperty.Builder.() -> Unit): Unit = sqs(SqsProperty(sqs))

      /**
       * @param setTimer Information needed to set the timer.
       */
      override fun timer(setTimer: IResolvable) {
        cdkBuilder.setTimer(setTimer.let(IResolvable::unwrap))
      }

      /**
       * @param setTimer Information needed to set the timer.
       */
      override fun timer(setTimer: SetTimerProperty) {
        cdkBuilder.setTimer(setTimer.let(SetTimerProperty::unwrap))
      }

      /**
       * @param setTimer Information needed to set the timer.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f9ff70c4b783295b08051f98891dfe8e8f9e9645de78c4e98e36d0344174e3f")
      override fun timer(setTimer: SetTimerProperty.Builder.() -> Unit): Unit =
          timer(SetTimerProperty(setTimer))

      /**
       * @param setVariable Sets a variable to a specified value.
       */
      override fun variable(setVariable: IResolvable) {
        cdkBuilder.setVariable(setVariable.let(IResolvable::unwrap))
      }

      /**
       * @param setVariable Sets a variable to a specified value.
       */
      override fun variable(setVariable: SetVariableProperty) {
        cdkBuilder.setVariable(setVariable.let(SetVariableProperty::unwrap))
      }

      /**
       * @param setVariable Sets a variable to a specified value.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("873dceb69490e6eeffb77b7388e777abb52ee40efab1926a0c667271af0768db")
      override fun variable(setVariable: SetVariableProperty.Builder.() -> Unit): Unit =
          variable(SetVariableProperty(setVariable))

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      /**
       * Information needed to clear the timer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-cleartimer)
       */
      override fun clearTimer(): Any? = unwrap(this).getClearTimer()

      /**
       * Writes to the DynamoDB table that you created.
       *
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-dynamodbv2)
       */
      override fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

      /**
       * Writes to the DynamoDB table that you created.
       *
       * The default action payload contains all attribute-value pairs that have the information
       * about the detector model instance and the event that triggered the action. You can customize
       * the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) .
       * One column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify. For more information, see
       * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
       * in *AWS IoT Events Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-dynamodb)
       */
      override fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

      /**
       * Sends information about the detector model instance and the event that triggered the action
       * to an Amazon Kinesis Data Firehose delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-firehose)
       */
      override fun firehose(): Any? = unwrap(this).getFirehose()

      /**
       * Sends AWS IoT Events input, which passes information about the detector model instance and
       * the event that triggered the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-iotevents)
       */
      override fun iotEvents(): Any? = unwrap(this).getIotEvents()

      /**
       * Sends information about the detector model instance and the event that triggered the action
       * to an asset property in AWS IoT SiteWise .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-iotsitewise)
       */
      override fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

      /**
       * Publishes an MQTT message with the given topic to the AWS IoT message broker.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-iottopicpublish)
       */
      override fun iotTopicPublish(): Any? = unwrap(this).getIotTopicPublish()

      /**
       * Calls a Lambda function, passing in information about the detector model instance and the
       * event that triggered the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-lambda)
       */
      override fun lambda(): Any? = unwrap(this).getLambda()

      /**
       * Information needed to reset the timer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-resettimer)
       */
      override fun resetTimer(): Any? = unwrap(this).getResetTimer()

      /**
       * Information needed to set the timer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-settimer)
       */
      override fun setTimer(): Any? = unwrap(this).getSetTimer()

      /**
       * Sets a variable to a specified value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-setvariable)
       */
      override fun setVariable(): Any? = unwrap(this).getSetVariable()

      /**
       * Sends an Amazon SNS message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-sns)
       */
      override fun sns(): Any? = unwrap(this).getSns()

      /**
       * Sends an Amazon SNS message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html#cfn-iotevents-detectormodel-action-sqs)
       */
      override fun sqs(): Any? = unwrap(this).getSqs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.ActionProperty
    }
  }

  public interface DynamoDBProperty {
    /**
     * The name of the hash key (also called the partition key).
     *
     * The `hashKeyField` value must match the partition key of the target DynamoDB table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeyfield)
     */
    public fun hashKeyField(): String

    /**
     * The data type for the hash key (also called the partition key). You can specify the following
     * values:.
     *
     * * `'STRING'` - The hash key is a string.
     * * `'NUMBER'` - The hash key is a number.
     *
     * If you don't specify `hashKeyType` , the default value is `'STRING'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeytype)
     */
    public fun hashKeyType(): String? = unwrap(this).getHashKeyType()

    /**
     * The value of the hash key (also called the partition key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeyvalue)
     */
    public fun hashKeyValue(): String

    /**
     * The type of operation to perform. You can specify the following values:.
     *
     * * `'INSERT'` - Insert data as a new item into the DynamoDB table. This item uses the
     * specified hash key as a partition key. If you specified a range key, the item uses the range key
     * as a sort key.
     * * `'UPDATE'` - Update an existing item of the DynamoDB table with new data. This item's
     * partition key must match the specified hash key. If you specified a range key, the range key
     * must match the item's sort key.
     * * `'DELETE'` - Delete an existing item of the DynamoDB table. This item's partition key must
     * match the specified hash key. If you specified a range key, the range key must match the item's
     * sort key.
     *
     * If you don't specify this parameter, AWS IoT Events triggers the `'INSERT'` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-operation)
     */
    public fun operation(): String? = unwrap(this).getOperation()

    /**
     * Information needed to configure the payload.
     *
     * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
     * payload contains all attribute-value pairs that have the information about the detector model
     * instance and the event triggered the action. To configure the action payload, you can use
     * `contentExpression` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * The name of the DynamoDB column that receives the action payload.
     *
     * If you don't specify this parameter, the name of the DynamoDB column is `payload` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-payloadfield)
     */
    public fun payloadField(): String? = unwrap(this).getPayloadField()

    /**
     * The name of the range key (also called the sort key).
     *
     * The `rangeKeyField` value must match the sort key of the target DynamoDB table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeyfield)
     */
    public fun rangeKeyField(): String? = unwrap(this).getRangeKeyField()

    /**
     * The data type for the range key (also called the sort key), You can specify the following
     * values:.
     *
     * * `'STRING'` - The range key is a string.
     * * `'NUMBER'` - The range key is number.
     *
     * If you don't specify `rangeKeyField` , the default value is `'STRING'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeytype)
     */
    public fun rangeKeyType(): String? = unwrap(this).getRangeKeyType()

    /**
     * The value of the range key (also called the sort key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeyvalue)
     */
    public fun rangeKeyValue(): String? = unwrap(this).getRangeKeyValue()

    /**
     * The name of the DynamoDB table.
     *
     * The `tableName` value must match the table name of the target DynamoDB table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [DynamoDBProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hashKeyField The name of the hash key (also called the partition key). 
       * The `hashKeyField` value must match the partition key of the target DynamoDB table.
       */
      public fun hashKeyField(hashKeyField: String)

      /**
       * @param hashKeyType The data type for the hash key (also called the partition key). You can
       * specify the following values:.
       * * `'STRING'` - The hash key is a string.
       * * `'NUMBER'` - The hash key is a number.
       *
       * If you don't specify `hashKeyType` , the default value is `'STRING'` .
       */
      public fun hashKeyType(hashKeyType: String)

      /**
       * @param hashKeyValue The value of the hash key (also called the partition key). 
       */
      public fun hashKeyValue(hashKeyValue: String)

      /**
       * @param operation The type of operation to perform. You can specify the following values:.
       * * `'INSERT'` - Insert data as a new item into the DynamoDB table. This item uses the
       * specified hash key as a partition key. If you specified a range key, the item uses the range
       * key as a sort key.
       * * `'UPDATE'` - Update an existing item of the DynamoDB table with new data. This item's
       * partition key must match the specified hash key. If you specified a range key, the range key
       * must match the item's sort key.
       * * `'DELETE'` - Delete an existing item of the DynamoDB table. This item's partition key
       * must match the specified hash key. If you specified a range key, the range key must match the
       * item's sort key.
       *
       * If you don't specify this parameter, AWS IoT Events triggers the `'INSERT'` operation.
       */
      public fun operation(operation: String)

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6376c0885764817128553b3273c1ad82e137d6ba9bd4d1b701d8ef13f9abaa66")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      /**
       * @param payloadField The name of the DynamoDB column that receives the action payload.
       * If you don't specify this parameter, the name of the DynamoDB column is `payload` .
       */
      public fun payloadField(payloadField: String)

      /**
       * @param rangeKeyField The name of the range key (also called the sort key).
       * The `rangeKeyField` value must match the sort key of the target DynamoDB table.
       */
      public fun rangeKeyField(rangeKeyField: String)

      /**
       * @param rangeKeyType The data type for the range key (also called the sort key), You can
       * specify the following values:.
       * * `'STRING'` - The range key is a string.
       * * `'NUMBER'` - The range key is number.
       *
       * If you don't specify `rangeKeyField` , the default value is `'STRING'` .
       */
      public fun rangeKeyType(rangeKeyType: String)

      /**
       * @param rangeKeyValue The value of the range key (also called the sort key).
       */
      public fun rangeKeyValue(rangeKeyValue: String)

      /**
       * @param tableName The name of the DynamoDB table. 
       * The `tableName` value must match the table name of the target DynamoDB table.
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty.builder()

      /**
       * @param hashKeyField The name of the hash key (also called the partition key). 
       * The `hashKeyField` value must match the partition key of the target DynamoDB table.
       */
      override fun hashKeyField(hashKeyField: String) {
        cdkBuilder.hashKeyField(hashKeyField)
      }

      /**
       * @param hashKeyType The data type for the hash key (also called the partition key). You can
       * specify the following values:.
       * * `'STRING'` - The hash key is a string.
       * * `'NUMBER'` - The hash key is a number.
       *
       * If you don't specify `hashKeyType` , the default value is `'STRING'` .
       */
      override fun hashKeyType(hashKeyType: String) {
        cdkBuilder.hashKeyType(hashKeyType)
      }

      /**
       * @param hashKeyValue The value of the hash key (also called the partition key). 
       */
      override fun hashKeyValue(hashKeyValue: String) {
        cdkBuilder.hashKeyValue(hashKeyValue)
      }

      /**
       * @param operation The type of operation to perform. You can specify the following values:.
       * * `'INSERT'` - Insert data as a new item into the DynamoDB table. This item uses the
       * specified hash key as a partition key. If you specified a range key, the item uses the range
       * key as a sort key.
       * * `'UPDATE'` - Update an existing item of the DynamoDB table with new data. This item's
       * partition key must match the specified hash key. If you specified a range key, the range key
       * must match the item's sort key.
       * * `'DELETE'` - Delete an existing item of the DynamoDB table. This item's partition key
       * must match the specified hash key. If you specified a range key, the range key must match the
       * item's sort key.
       *
       * If you don't specify this parameter, AWS IoT Events triggers the `'INSERT'` operation.
       */
      override fun operation(operation: String) {
        cdkBuilder.operation(operation)
      }

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6376c0885764817128553b3273c1ad82e137d6ba9bd4d1b701d8ef13f9abaa66")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      /**
       * @param payloadField The name of the DynamoDB column that receives the action payload.
       * If you don't specify this parameter, the name of the DynamoDB column is `payload` .
       */
      override fun payloadField(payloadField: String) {
        cdkBuilder.payloadField(payloadField)
      }

      /**
       * @param rangeKeyField The name of the range key (also called the sort key).
       * The `rangeKeyField` value must match the sort key of the target DynamoDB table.
       */
      override fun rangeKeyField(rangeKeyField: String) {
        cdkBuilder.rangeKeyField(rangeKeyField)
      }

      /**
       * @param rangeKeyType The data type for the range key (also called the sort key), You can
       * specify the following values:.
       * * `'STRING'` - The range key is a string.
       * * `'NUMBER'` - The range key is number.
       *
       * If you don't specify `rangeKeyField` , the default value is `'STRING'` .
       */
      override fun rangeKeyType(rangeKeyType: String) {
        cdkBuilder.rangeKeyType(rangeKeyType)
      }

      /**
       * @param rangeKeyValue The value of the range key (also called the sort key).
       */
      override fun rangeKeyValue(rangeKeyValue: String) {
        cdkBuilder.rangeKeyValue(rangeKeyValue)
      }

      /**
       * @param tableName The name of the DynamoDB table. 
       * The `tableName` value must match the table name of the target DynamoDB table.
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty,
    ) : CdkObject(cdkObject), DynamoDBProperty {
      /**
       * The name of the hash key (also called the partition key).
       *
       * The `hashKeyField` value must match the partition key of the target DynamoDB table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeyfield)
       */
      override fun hashKeyField(): String = unwrap(this).getHashKeyField()

      /**
       * The data type for the hash key (also called the partition key). You can specify the
       * following values:.
       *
       * * `'STRING'` - The hash key is a string.
       * * `'NUMBER'` - The hash key is a number.
       *
       * If you don't specify `hashKeyType` , the default value is `'STRING'` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeytype)
       */
      override fun hashKeyType(): String? = unwrap(this).getHashKeyType()

      /**
       * The value of the hash key (also called the partition key).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-hashkeyvalue)
       */
      override fun hashKeyValue(): String = unwrap(this).getHashKeyValue()

      /**
       * The type of operation to perform. You can specify the following values:.
       *
       * * `'INSERT'` - Insert data as a new item into the DynamoDB table. This item uses the
       * specified hash key as a partition key. If you specified a range key, the item uses the range
       * key as a sort key.
       * * `'UPDATE'` - Update an existing item of the DynamoDB table with new data. This item's
       * partition key must match the specified hash key. If you specified a range key, the range key
       * must match the item's sort key.
       * * `'DELETE'` - Delete an existing item of the DynamoDB table. This item's partition key
       * must match the specified hash key. If you specified a range key, the range key must match the
       * item's sort key.
       *
       * If you don't specify this parameter, AWS IoT Events triggers the `'INSERT'` operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-operation)
       */
      override fun operation(): String? = unwrap(this).getOperation()

      /**
       * Information needed to configure the payload.
       *
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()

      /**
       * The name of the DynamoDB column that receives the action payload.
       *
       * If you don't specify this parameter, the name of the DynamoDB column is `payload` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-payloadfield)
       */
      override fun payloadField(): String? = unwrap(this).getPayloadField()

      /**
       * The name of the range key (also called the sort key).
       *
       * The `rangeKeyField` value must match the sort key of the target DynamoDB table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeyfield)
       */
      override fun rangeKeyField(): String? = unwrap(this).getRangeKeyField()

      /**
       * The data type for the range key (also called the sort key), You can specify the following
       * values:.
       *
       * * `'STRING'` - The range key is a string.
       * * `'NUMBER'` - The range key is number.
       *
       * If you don't specify `rangeKeyField` , the default value is `'STRING'` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeytype)
       */
      override fun rangeKeyType(): String? = unwrap(this).getRangeKeyType()

      /**
       * The value of the range key (also called the sort key).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-rangekeyvalue)
       */
      override fun rangeKeyValue(): String? = unwrap(this).getRangeKeyValue()

      /**
       * The name of the DynamoDB table.
       *
       * The `tableName` value must match the table name of the target DynamoDB table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html#cfn-iotevents-detectormodel-dynamodb-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty):
          DynamoDBProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DynamoDBProperty
    }
  }

  public interface AssetPropertyValueProperty {
    /**
     * The quality of the asset property value.
     *
     * The value must be `'GOOD'` , `'BAD'` , or `'UNCERTAIN'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html#cfn-iotevents-detectormodel-assetpropertyvalue-quality)
     */
    public fun quality(): String? = unwrap(this).getQuality()

    /**
     * The timestamp associated with the asset property value.
     *
     * The default is the current event time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html#cfn-iotevents-detectormodel-assetpropertyvalue-timestamp)
     */
    public fun timestamp(): Any? = unwrap(this).getTimestamp()

    /**
     * The value to send to an asset property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html#cfn-iotevents-detectormodel-assetpropertyvalue-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [AssetPropertyValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param quality The quality of the asset property value.
       * The value must be `'GOOD'` , `'BAD'` , or `'UNCERTAIN'` .
       */
      public fun quality(quality: String)

      /**
       * @param timestamp The timestamp associated with the asset property value.
       * The default is the current event time.
       */
      public fun timestamp(timestamp: IResolvable)

      /**
       * @param timestamp The timestamp associated with the asset property value.
       * The default is the current event time.
       */
      public fun timestamp(timestamp: AssetPropertyTimestampProperty)

      /**
       * @param timestamp The timestamp associated with the asset property value.
       * The default is the current event time.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a3915e8dda48e5ddf58a35ff2a83ed0e79cfbc4a47024cd74aedbf6464daae5")
      public fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit)

      /**
       * @param value The value to send to an asset property. 
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The value to send to an asset property. 
       */
      public fun `value`(`value`: AssetPropertyVariantProperty)

      /**
       * @param value The value to send to an asset property. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12dad539c739121643e786152c5261d3ace7a3fa50ca93f430aafeddbe78c884")
      public fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty.builder()

      /**
       * @param quality The quality of the asset property value.
       * The value must be `'GOOD'` , `'BAD'` , or `'UNCERTAIN'` .
       */
      override fun quality(quality: String) {
        cdkBuilder.quality(quality)
      }

      /**
       * @param timestamp The timestamp associated with the asset property value.
       * The default is the current event time.
       */
      override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      /**
       * @param timestamp The timestamp associated with the asset property value.
       * The default is the current event time.
       */
      override fun timestamp(timestamp: AssetPropertyTimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(AssetPropertyTimestampProperty::unwrap))
      }

      /**
       * @param timestamp The timestamp associated with the asset property value.
       * The default is the current event time.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a3915e8dda48e5ddf58a35ff2a83ed0e79cfbc4a47024cd74aedbf6464daae5")
      override fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit): Unit =
          timestamp(AssetPropertyTimestampProperty(timestamp))

      /**
       * @param value The value to send to an asset property. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      /**
       * @param value The value to send to an asset property. 
       */
      override fun `value`(`value`: AssetPropertyVariantProperty) {
        cdkBuilder.`value`(`value`.let(AssetPropertyVariantProperty::unwrap))
      }

      /**
       * @param value The value to send to an asset property. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12dad539c739121643e786152c5261d3ace7a3fa50ca93f430aafeddbe78c884")
      override fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit): Unit =
          `value`(AssetPropertyVariantProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty,
    ) : CdkObject(cdkObject), AssetPropertyValueProperty {
      /**
       * The quality of the asset property value.
       *
       * The value must be `'GOOD'` , `'BAD'` , or `'UNCERTAIN'` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html#cfn-iotevents-detectormodel-assetpropertyvalue-quality)
       */
      override fun quality(): String? = unwrap(this).getQuality()

      /**
       * The timestamp associated with the asset property value.
       *
       * The default is the current event time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html#cfn-iotevents-detectormodel-assetpropertyvalue-timestamp)
       */
      override fun timestamp(): Any? = unwrap(this).getTimestamp()

      /**
       * The value to send to an asset property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html#cfn-iotevents-detectormodel-assetpropertyvalue-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty):
          AssetPropertyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyValueProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty
    }
  }

  public interface OnEnterProperty {
    /**
     * Specifies the actions that are performed when the state is entered and the `condition` is
     * `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onenter.html#cfn-iotevents-detectormodel-onenter-events)
     */
    public fun events(): Any? = unwrap(this).getEvents()

    /**
     * A builder for [OnEnterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param events Specifies the actions that are performed when the state is entered and the
       * `condition` is `TRUE` .
       */
      public fun events(events: IResolvable)

      /**
       * @param events Specifies the actions that are performed when the state is entered and the
       * `condition` is `TRUE` .
       */
      public fun events(events: List<Any>)

      /**
       * @param events Specifies the actions that are performed when the state is entered and the
       * `condition` is `TRUE` .
       */
      public fun events(vararg events: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty.builder()

      /**
       * @param events Specifies the actions that are performed when the state is entered and the
       * `condition` is `TRUE` .
       */
      override fun events(events: IResolvable) {
        cdkBuilder.events(events.let(IResolvable::unwrap))
      }

      /**
       * @param events Specifies the actions that are performed when the state is entered and the
       * `condition` is `TRUE` .
       */
      override fun events(events: List<Any>) {
        cdkBuilder.events(events)
      }

      /**
       * @param events Specifies the actions that are performed when the state is entered and the
       * `condition` is `TRUE` .
       */
      override fun events(vararg events: Any): Unit = events(events.toList())

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty,
    ) : CdkObject(cdkObject), OnEnterProperty {
      /**
       * Specifies the actions that are performed when the state is entered and the `condition` is
       * `TRUE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onenter.html#cfn-iotevents-detectormodel-onenter-events)
       */
      override fun events(): Any? = unwrap(this).getEvents()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OnEnterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty):
          OnEnterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnEnterProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty
    }
  }

  public interface SqsProperty {
    /**
     * You can configure the action payload when you send a message to an Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * The URL of the SQS queue where the data is written.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-queueurl)
     */
    public fun queueUrl(): String

    /**
     * Set this to TRUE if you want the data to be base-64 encoded before it is written to the
     * queue.
     *
     * Otherwise, set this to FALSE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-usebase64)
     */
    public fun useBase64(): Any? = unwrap(this).getUseBase64()

    /**
     * A builder for [SqsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * SQS queue.
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * SQS queue.
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * SQS queue.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00d74b45a618d619f64b950a77344905c2d5cc8e1d376582ac994928584a5efb")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      /**
       * @param queueUrl The URL of the SQS queue where the data is written. 
       */
      public fun queueUrl(queueUrl: String)

      /**
       * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
       * written to the queue.
       * Otherwise, set this to FALSE.
       */
      public fun useBase64(useBase64: Boolean)

      /**
       * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
       * written to the queue.
       * Otherwise, set this to FALSE.
       */
      public fun useBase64(useBase64: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty.builder()

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * SQS queue.
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * SQS queue.
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * SQS queue.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00d74b45a618d619f64b950a77344905c2d5cc8e1d376582ac994928584a5efb")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      /**
       * @param queueUrl The URL of the SQS queue where the data is written. 
       */
      override fun queueUrl(queueUrl: String) {
        cdkBuilder.queueUrl(queueUrl)
      }

      /**
       * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
       * written to the queue.
       * Otherwise, set this to FALSE.
       */
      override fun useBase64(useBase64: Boolean) {
        cdkBuilder.useBase64(useBase64)
      }

      /**
       * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
       * written to the queue.
       * Otherwise, set this to FALSE.
       */
      override fun useBase64(useBase64: IResolvable) {
        cdkBuilder.useBase64(useBase64.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty,
    ) : CdkObject(cdkObject), SqsProperty {
      /**
       * You can configure the action payload when you send a message to an Amazon SQS queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()

      /**
       * The URL of the SQS queue where the data is written.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-queueurl)
       */
      override fun queueUrl(): String = unwrap(this).getQueueUrl()

      /**
       * Set this to TRUE if you want the data to be base-64 encoded before it is written to the
       * queue.
       *
       * Otherwise, set this to FALSE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-usebase64)
       */
      override fun useBase64(): Any? = unwrap(this).getUseBase64()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SqsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty):
          SqsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqsProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty
    }
  }

  public interface LambdaProperty {
    /**
     * The ARN of the Lambda function that is executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html#cfn-iotevents-detectormodel-lambda-functionarn)
     */
    public fun functionArn(): String

    /**
     * You can configure the action payload when you send a message to a Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html#cfn-iotevents-detectormodel-lambda-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * A builder for [LambdaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param functionArn The ARN of the Lambda function that is executed. 
       */
      public fun functionArn(functionArn: String)

      /**
       * @param payload You can configure the action payload when you send a message to a Lambda
       * function.
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload You can configure the action payload when you send a message to a Lambda
       * function.
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload You can configure the action payload when you send a message to a Lambda
       * function.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f2a77b53098ccda137f1f71ae68c5e7b9f724aabb6bfdb499f7b6d771206ab7")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty.builder()

      /**
       * @param functionArn The ARN of the Lambda function that is executed. 
       */
      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      /**
       * @param payload You can configure the action payload when you send a message to a Lambda
       * function.
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to a Lambda
       * function.
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to a Lambda
       * function.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f2a77b53098ccda137f1f71ae68c5e7b9f724aabb6bfdb499f7b6d771206ab7")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty,
    ) : CdkObject(cdkObject), LambdaProperty {
      /**
       * The ARN of the Lambda function that is executed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html#cfn-iotevents-detectormodel-lambda-functionarn)
       */
      override fun functionArn(): String = unwrap(this).getFunctionArn()

      /**
       * You can configure the action payload when you send a message to a Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html#cfn-iotevents-detectormodel-lambda-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty):
          LambdaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty
    }
  }

  public interface DetectorModelDefinitionProperty {
    /**
     * The state that is entered at the creation of each detector (instance).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html#cfn-iotevents-detectormodel-detectormodeldefinition-initialstatename)
     */
    public fun initialStateName(): String

    /**
     * Information about the states of the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html#cfn-iotevents-detectormodel-detectormodeldefinition-states)
     */
    public fun states(): Any

    /**
     * A builder for [DetectorModelDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param initialStateName The state that is entered at the creation of each detector
       * (instance). 
       */
      public fun initialStateName(initialStateName: String)

      /**
       * @param states Information about the states of the detector. 
       */
      public fun states(states: IResolvable)

      /**
       * @param states Information about the states of the detector. 
       */
      public fun states(states: List<Any>)

      /**
       * @param states Information about the states of the detector. 
       */
      public fun states(vararg states: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty.builder()

      /**
       * @param initialStateName The state that is entered at the creation of each detector
       * (instance). 
       */
      override fun initialStateName(initialStateName: String) {
        cdkBuilder.initialStateName(initialStateName)
      }

      /**
       * @param states Information about the states of the detector. 
       */
      override fun states(states: IResolvable) {
        cdkBuilder.states(states.let(IResolvable::unwrap))
      }

      /**
       * @param states Information about the states of the detector. 
       */
      override fun states(states: List<Any>) {
        cdkBuilder.states(states)
      }

      /**
       * @param states Information about the states of the detector. 
       */
      override fun states(vararg states: Any): Unit = states(states.toList())

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty,
    ) : CdkObject(cdkObject), DetectorModelDefinitionProperty {
      /**
       * The state that is entered at the creation of each detector (instance).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html#cfn-iotevents-detectormodel-detectormodeldefinition-initialstatename)
       */
      override fun initialStateName(): String = unwrap(this).getInitialStateName()

      /**
       * Information about the states of the detector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html#cfn-iotevents-detectormodel-detectormodeldefinition-states)
       */
      override fun states(): Any = unwrap(this).getStates()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DetectorModelDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty):
          DetectorModelDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DetectorModelDefinitionProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty
    }
  }

  public interface AssetPropertyVariantProperty {
    /**
     * The asset property value is a Boolean value that must be `'TRUE'` or `'FALSE'` .
     *
     * You must use an expression, and the evaluated result should be a Boolean value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-booleanvalue)
     */
    public fun booleanValue(): String? = unwrap(this).getBooleanValue()

    /**
     * The asset property value is a double.
     *
     * You must use an expression, and the evaluated result should be a double.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-doublevalue)
     */
    public fun doubleValue(): String? = unwrap(this).getDoubleValue()

    /**
     * The asset property value is an integer.
     *
     * You must use an expression, and the evaluated result should be an integer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-integervalue)
     */
    public fun integerValue(): String? = unwrap(this).getIntegerValue()

    /**
     * The asset property value is a string.
     *
     * You must use an expression, and the evaluated result should be a string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-stringvalue)
     */
    public fun stringValue(): String? = unwrap(this).getStringValue()

    /**
     * A builder for [AssetPropertyVariantProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param booleanValue The asset property value is a Boolean value that must be `'TRUE'` or
       * `'FALSE'` .
       * You must use an expression, and the evaluated result should be a Boolean value.
       */
      public fun booleanValue(booleanValue: String)

      /**
       * @param doubleValue The asset property value is a double.
       * You must use an expression, and the evaluated result should be a double.
       */
      public fun doubleValue(doubleValue: String)

      /**
       * @param integerValue The asset property value is an integer.
       * You must use an expression, and the evaluated result should be an integer.
       */
      public fun integerValue(integerValue: String)

      /**
       * @param stringValue The asset property value is a string.
       * You must use an expression, and the evaluated result should be a string.
       */
      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty.builder()

      /**
       * @param booleanValue The asset property value is a Boolean value that must be `'TRUE'` or
       * `'FALSE'` .
       * You must use an expression, and the evaluated result should be a Boolean value.
       */
      override fun booleanValue(booleanValue: String) {
        cdkBuilder.booleanValue(booleanValue)
      }

      /**
       * @param doubleValue The asset property value is a double.
       * You must use an expression, and the evaluated result should be a double.
       */
      override fun doubleValue(doubleValue: String) {
        cdkBuilder.doubleValue(doubleValue)
      }

      /**
       * @param integerValue The asset property value is an integer.
       * You must use an expression, and the evaluated result should be an integer.
       */
      override fun integerValue(integerValue: String) {
        cdkBuilder.integerValue(integerValue)
      }

      /**
       * @param stringValue The asset property value is a string.
       * You must use an expression, and the evaluated result should be a string.
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty,
    ) : CdkObject(cdkObject), AssetPropertyVariantProperty {
      /**
       * The asset property value is a Boolean value that must be `'TRUE'` or `'FALSE'` .
       *
       * You must use an expression, and the evaluated result should be a Boolean value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-booleanvalue)
       */
      override fun booleanValue(): String? = unwrap(this).getBooleanValue()

      /**
       * The asset property value is a double.
       *
       * You must use an expression, and the evaluated result should be a double.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-doublevalue)
       */
      override fun doubleValue(): String? = unwrap(this).getDoubleValue()

      /**
       * The asset property value is an integer.
       *
       * You must use an expression, and the evaluated result should be an integer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-integervalue)
       */
      override fun integerValue(): String? = unwrap(this).getIntegerValue()

      /**
       * The asset property value is a string.
       *
       * You must use an expression, and the evaluated result should be a string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html#cfn-iotevents-detectormodel-assetpropertyvariant-stringvalue)
       */
      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty):
          AssetPropertyVariantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyVariantProperty):
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty
    }
  }
}
