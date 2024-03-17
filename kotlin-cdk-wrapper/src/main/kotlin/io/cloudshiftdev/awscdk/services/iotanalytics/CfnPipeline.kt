@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotanalytics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::IoTAnalytics::Pipeline resource consumes messages from one or more channels and allows
 * you to process the messages before storing them in a data store.
 *
 * You must specify both a `channel` and a `datastore` activity and, optionally, as many as 23
 * additional activities in the `pipelineActivities` array. For more information, see [How to Use AWS
 * IoT
 * Analytics](https://docs.aws.amazon.com/iotanalytics/latest/userguide/welcome.html#aws-iot-analytics-how)
 * in the *AWS IoT Analytics User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
 * CfnPipeline cfnPipeline = CfnPipeline.Builder.create(this, "MyCfnPipeline")
 * .pipelineActivities(List.of(ActivityProperty.builder()
 * .addAttributes(AddAttributesProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .name("name")
 * // the properties below are optional
 * .next("next")
 * .build())
 * .channel(ChannelProperty.builder()
 * .channelName("channelName")
 * .name("name")
 * // the properties below are optional
 * .next("next")
 * .build())
 * .datastore(DatastoreProperty.builder()
 * .datastoreName("datastoreName")
 * .name("name")
 * .build())
 * .deviceRegistryEnrich(DeviceRegistryEnrichProperty.builder()
 * .attribute("attribute")
 * .name("name")
 * .roleArn("roleArn")
 * .thingName("thingName")
 * // the properties below are optional
 * .next("next")
 * .build())
 * .deviceShadowEnrich(DeviceShadowEnrichProperty.builder()
 * .attribute("attribute")
 * .name("name")
 * .roleArn("roleArn")
 * .thingName("thingName")
 * // the properties below are optional
 * .next("next")
 * .build())
 * .filter(FilterProperty.builder()
 * .filter("filter")
 * .name("name")
 * // the properties below are optional
 * .next("next")
 * .build())
 * .lambda(LambdaProperty.builder()
 * .batchSize(123)
 * .lambdaName("lambdaName")
 * .name("name")
 * // the properties below are optional
 * .next("next")
 * .build())
 * .math(MathProperty.builder()
 * .attribute("attribute")
 * .math("math")
 * .name("name")
 * // the properties below are optional
 * .next("next")
 * .build())
 * .removeAttributes(RemoveAttributesProperty.builder()
 * .attributes(List.of("attributes"))
 * .name("name")
 * // the properties below are optional
 * .next("next")
 * .build())
 * .selectAttributes(SelectAttributesProperty.builder()
 * .attributes(List.of("attributes"))
 * .name("name")
 * // the properties below are optional
 * .next("next")
 * .build())
 * .build()))
 * // the properties below are optional
 * .pipelineName("pipelineName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html)
 */
public open class CfnPipeline internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A list of "PipelineActivity" objects.
   */
  public open fun pipelineActivities(): Any = unwrap(this).getPipelineActivities()

  /**
   * A list of "PipelineActivity" objects.
   */
  public open fun pipelineActivities(`value`: IResolvable) {
    unwrap(this).setPipelineActivities(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of "PipelineActivity" objects.
   */
  public open fun pipelineActivities(`value`: List<Any>) {
    unwrap(this).setPipelineActivities(`value`)
  }

  /**
   * A list of "PipelineActivity" objects.
   */
  public open fun pipelineActivities(vararg `value`: Any): Unit =
      pipelineActivities(`value`.toList())

  /**
   * The name of the pipeline.
   */
  public open fun pipelineName(): String? = unwrap(this).getPipelineName()

  /**
   * The name of the pipeline.
   */
  public open fun pipelineName(`value`: String) {
    unwrap(this).setPipelineName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata which can be used to manage the pipeline.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata which can be used to manage the pipeline.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata which can be used to manage the pipeline.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotanalytics.CfnPipeline].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of "PipelineActivity" objects.
     *
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelineactivities)
     * @param pipelineActivities A list of "PipelineActivity" objects. 
     */
    public fun pipelineActivities(pipelineActivities: IResolvable)

    /**
     * A list of "PipelineActivity" objects.
     *
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelineactivities)
     * @param pipelineActivities A list of "PipelineActivity" objects. 
     */
    public fun pipelineActivities(pipelineActivities: List<Any>)

    /**
     * A list of "PipelineActivity" objects.
     *
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelineactivities)
     * @param pipelineActivities A list of "PipelineActivity" objects. 
     */
    public fun pipelineActivities(vararg pipelineActivities: Any)

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelinename)
     * @param pipelineName The name of the pipeline. 
     */
    public fun pipelineName(pipelineName: String)

    /**
     * Metadata which can be used to manage the pipeline.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-tags)
     * @param tags Metadata which can be used to manage the pipeline. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata which can be used to manage the pipeline.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-tags)
     * @param tags Metadata which can be used to manage the pipeline. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnPipeline.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnPipeline.Builder.create(scope, id)

    /**
     * A list of "PipelineActivity" objects.
     *
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelineactivities)
     * @param pipelineActivities A list of "PipelineActivity" objects. 
     */
    override fun pipelineActivities(pipelineActivities: IResolvable) {
      cdkBuilder.pipelineActivities(pipelineActivities.let(IResolvable::unwrap))
    }

    /**
     * A list of "PipelineActivity" objects.
     *
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelineactivities)
     * @param pipelineActivities A list of "PipelineActivity" objects. 
     */
    override fun pipelineActivities(pipelineActivities: List<Any>) {
      cdkBuilder.pipelineActivities(pipelineActivities)
    }

    /**
     * A list of "PipelineActivity" objects.
     *
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelineactivities)
     * @param pipelineActivities A list of "PipelineActivity" objects. 
     */
    override fun pipelineActivities(vararg pipelineActivities: Any): Unit =
        pipelineActivities(pipelineActivities.toList())

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelinename)
     * @param pipelineName The name of the pipeline. 
     */
    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    /**
     * Metadata which can be used to manage the pipeline.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-tags)
     * @param tags Metadata which can be used to manage the pipeline. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata which can be used to manage the pipeline.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-tags)
     * @param tags Metadata which can be used to manage the pipeline. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotanalytics.CfnPipeline.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline):
        CfnPipeline = CfnPipeline(cdkObject)

    internal fun unwrap(wrapped: CfnPipeline):
        software.amazon.awscdk.services.iotanalytics.CfnPipeline = wrapped.cdkObject
  }

  /**
   * An activity that performs a transformation on a message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * ActivityProperty activityProperty = ActivityProperty.builder()
   * .addAttributes(AddAttributesProperty.builder()
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build())
   * .channel(ChannelProperty.builder()
   * .channelName("channelName")
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build())
   * .datastore(DatastoreProperty.builder()
   * .datastoreName("datastoreName")
   * .name("name")
   * .build())
   * .deviceRegistryEnrich(DeviceRegistryEnrichProperty.builder()
   * .attribute("attribute")
   * .name("name")
   * .roleArn("roleArn")
   * .thingName("thingName")
   * // the properties below are optional
   * .next("next")
   * .build())
   * .deviceShadowEnrich(DeviceShadowEnrichProperty.builder()
   * .attribute("attribute")
   * .name("name")
   * .roleArn("roleArn")
   * .thingName("thingName")
   * // the properties below are optional
   * .next("next")
   * .build())
   * .filter(FilterProperty.builder()
   * .filter("filter")
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build())
   * .lambda(LambdaProperty.builder()
   * .batchSize(123)
   * .lambdaName("lambdaName")
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build())
   * .math(MathProperty.builder()
   * .attribute("attribute")
   * .math("math")
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build())
   * .removeAttributes(RemoveAttributesProperty.builder()
   * .attributes(List.of("attributes"))
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build())
   * .selectAttributes(SelectAttributesProperty.builder()
   * .attributes(List.of("attributes"))
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html)
   */
  public interface ActivityProperty {
    /**
     * Adds other attributes based on existing attributes in the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-addattributes)
     */
    public fun addAttributes(): Any? = unwrap(this).getAddAttributes()

    /**
     * Determines the source of the messages to be processed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-channel)
     */
    public fun channel(): Any? = unwrap(this).getChannel()

    /**
     * Specifies where to store the processed message data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-datastore)
     */
    public fun datastore(): Any? = unwrap(this).getDatastore()

    /**
     * Adds data from the AWS IoT device registry to your message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-deviceregistryenrich)
     */
    public fun deviceRegistryEnrich(): Any? = unwrap(this).getDeviceRegistryEnrich()

    /**
     * Adds information from the AWS IoT Device Shadows service to a message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-deviceshadowenrich)
     */
    public fun deviceShadowEnrich(): Any? = unwrap(this).getDeviceShadowEnrich()

    /**
     * Filters a message based on its attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-filter)
     */
    public fun filter(): Any? = unwrap(this).getFilter()

    /**
     * Runs a Lambda function to modify the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-lambda)
     */
    public fun lambda(): Any? = unwrap(this).getLambda()

    /**
     * Computes an arithmetic expression using the message's attributes and adds it to the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-math)
     */
    public fun math(): Any? = unwrap(this).getMath()

    /**
     * Removes attributes from a message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-removeattributes)
     */
    public fun removeAttributes(): Any? = unwrap(this).getRemoveAttributes()

    /**
     * Creates a new message using only the specified attributes from the original message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-selectattributes)
     */
    public fun selectAttributes(): Any? = unwrap(this).getSelectAttributes()

    /**
     * A builder for [ActivityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addAttributes Adds other attributes based on existing attributes in the message.
       */
      public fun addAttributes(addAttributes: IResolvable)

      /**
       * @param addAttributes Adds other attributes based on existing attributes in the message.
       */
      public fun addAttributes(addAttributes: AddAttributesProperty)

      /**
       * @param addAttributes Adds other attributes based on existing attributes in the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ca532d9574bfdc45d025450d892c0b8d8b62aa85b803d454c5a3fabac19b356")
      public fun addAttributes(addAttributes: AddAttributesProperty.Builder.() -> Unit)

      /**
       * @param channel Determines the source of the messages to be processed.
       */
      public fun channel(channel: IResolvable)

      /**
       * @param channel Determines the source of the messages to be processed.
       */
      public fun channel(channel: ChannelProperty)

      /**
       * @param channel Determines the source of the messages to be processed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e850e1932b80f5f992254c3d68b3782548220a1bd812c3bf494bdeac00548e8")
      public fun channel(channel: ChannelProperty.Builder.() -> Unit)

      /**
       * @param datastore Specifies where to store the processed message data.
       */
      public fun datastore(datastore: IResolvable)

      /**
       * @param datastore Specifies where to store the processed message data.
       */
      public fun datastore(datastore: DatastoreProperty)

      /**
       * @param datastore Specifies where to store the processed message data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("269491e224203b708d5986e59ff0705f239a328198b2ceea9b94904122f8a560")
      public fun datastore(datastore: DatastoreProperty.Builder.() -> Unit)

      /**
       * @param deviceRegistryEnrich Adds data from the AWS IoT device registry to your message.
       */
      public fun deviceRegistryEnrich(deviceRegistryEnrich: IResolvable)

      /**
       * @param deviceRegistryEnrich Adds data from the AWS IoT device registry to your message.
       */
      public fun deviceRegistryEnrich(deviceRegistryEnrich: DeviceRegistryEnrichProperty)

      /**
       * @param deviceRegistryEnrich Adds data from the AWS IoT device registry to your message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab22e542b2d957497953e9d0672c37ec53a0d249180ac68a5b2fc0e3e956d83a")
      public
          fun deviceRegistryEnrich(deviceRegistryEnrich: DeviceRegistryEnrichProperty.Builder.() -> Unit)

      /**
       * @param deviceShadowEnrich Adds information from the AWS IoT Device Shadows service to a
       * message.
       */
      public fun deviceShadowEnrich(deviceShadowEnrich: IResolvable)

      /**
       * @param deviceShadowEnrich Adds information from the AWS IoT Device Shadows service to a
       * message.
       */
      public fun deviceShadowEnrich(deviceShadowEnrich: DeviceShadowEnrichProperty)

      /**
       * @param deviceShadowEnrich Adds information from the AWS IoT Device Shadows service to a
       * message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d41686fb04cacb0ea68292b59291060d7ff78c8f5b17e4b82aed6959861f72f")
      public
          fun deviceShadowEnrich(deviceShadowEnrich: DeviceShadowEnrichProperty.Builder.() -> Unit)

      /**
       * @param filter Filters a message based on its attributes.
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter Filters a message based on its attributes.
       */
      public fun filter(filter: FilterProperty)

      /**
       * @param filter Filters a message based on its attributes.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64cd2356ae73cd4ae7f0839ba69a5293f9ad40ef42a1261335c4f83c45d70a59")
      public fun filter(filter: FilterProperty.Builder.() -> Unit)

      /**
       * @param lambda Runs a Lambda function to modify the message.
       */
      public fun lambda(lambda: IResolvable)

      /**
       * @param lambda Runs a Lambda function to modify the message.
       */
      public fun lambda(lambda: LambdaProperty)

      /**
       * @param lambda Runs a Lambda function to modify the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("752400dbe34c10dfb329054e73dc85cd243b45e1b8551bf688df91bfdd8679f7")
      public fun lambda(lambda: LambdaProperty.Builder.() -> Unit)

      /**
       * @param math Computes an arithmetic expression using the message's attributes and adds it to
       * the message.
       */
      public fun math(math: IResolvable)

      /**
       * @param math Computes an arithmetic expression using the message's attributes and adds it to
       * the message.
       */
      public fun math(math: MathProperty)

      /**
       * @param math Computes an arithmetic expression using the message's attributes and adds it to
       * the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c6a1a86c0e9519c5c512a75d39a299706b42961487e63592617ff0e0dea4a2b")
      public fun math(math: MathProperty.Builder.() -> Unit)

      /**
       * @param removeAttributes Removes attributes from a message.
       */
      public fun removeAttributes(removeAttributes: IResolvable)

      /**
       * @param removeAttributes Removes attributes from a message.
       */
      public fun removeAttributes(removeAttributes: RemoveAttributesProperty)

      /**
       * @param removeAttributes Removes attributes from a message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12dfffc43b45420039a504fc1680bc58e9c19dd8f2a147c4d16fe29b86bd8285")
      public fun removeAttributes(removeAttributes: RemoveAttributesProperty.Builder.() -> Unit)

      /**
       * @param selectAttributes Creates a new message using only the specified attributes from the
       * original message.
       */
      public fun selectAttributes(selectAttributes: IResolvable)

      /**
       * @param selectAttributes Creates a new message using only the specified attributes from the
       * original message.
       */
      public fun selectAttributes(selectAttributes: SelectAttributesProperty)

      /**
       * @param selectAttributes Creates a new message using only the specified attributes from the
       * original message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("af4c5295ff31da7d5583a61d793d81b274c0fc52f577cb78d8d3be56b35f8edf")
      public fun selectAttributes(selectAttributes: SelectAttributesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.builder()

      /**
       * @param addAttributes Adds other attributes based on existing attributes in the message.
       */
      override fun addAttributes(addAttributes: IResolvable) {
        cdkBuilder.addAttributes(addAttributes.let(IResolvable::unwrap))
      }

      /**
       * @param addAttributes Adds other attributes based on existing attributes in the message.
       */
      override fun addAttributes(addAttributes: AddAttributesProperty) {
        cdkBuilder.addAttributes(addAttributes.let(AddAttributesProperty::unwrap))
      }

      /**
       * @param addAttributes Adds other attributes based on existing attributes in the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ca532d9574bfdc45d025450d892c0b8d8b62aa85b803d454c5a3fabac19b356")
      override fun addAttributes(addAttributes: AddAttributesProperty.Builder.() -> Unit): Unit =
          addAttributes(AddAttributesProperty(addAttributes))

      /**
       * @param channel Determines the source of the messages to be processed.
       */
      override fun channel(channel: IResolvable) {
        cdkBuilder.channel(channel.let(IResolvable::unwrap))
      }

      /**
       * @param channel Determines the source of the messages to be processed.
       */
      override fun channel(channel: ChannelProperty) {
        cdkBuilder.channel(channel.let(ChannelProperty::unwrap))
      }

      /**
       * @param channel Determines the source of the messages to be processed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e850e1932b80f5f992254c3d68b3782548220a1bd812c3bf494bdeac00548e8")
      override fun channel(channel: ChannelProperty.Builder.() -> Unit): Unit =
          channel(ChannelProperty(channel))

      /**
       * @param datastore Specifies where to store the processed message data.
       */
      override fun datastore(datastore: IResolvable) {
        cdkBuilder.datastore(datastore.let(IResolvable::unwrap))
      }

      /**
       * @param datastore Specifies where to store the processed message data.
       */
      override fun datastore(datastore: DatastoreProperty) {
        cdkBuilder.datastore(datastore.let(DatastoreProperty::unwrap))
      }

      /**
       * @param datastore Specifies where to store the processed message data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("269491e224203b708d5986e59ff0705f239a328198b2ceea9b94904122f8a560")
      override fun datastore(datastore: DatastoreProperty.Builder.() -> Unit): Unit =
          datastore(DatastoreProperty(datastore))

      /**
       * @param deviceRegistryEnrich Adds data from the AWS IoT device registry to your message.
       */
      override fun deviceRegistryEnrich(deviceRegistryEnrich: IResolvable) {
        cdkBuilder.deviceRegistryEnrich(deviceRegistryEnrich.let(IResolvable::unwrap))
      }

      /**
       * @param deviceRegistryEnrich Adds data from the AWS IoT device registry to your message.
       */
      override fun deviceRegistryEnrich(deviceRegistryEnrich: DeviceRegistryEnrichProperty) {
        cdkBuilder.deviceRegistryEnrich(deviceRegistryEnrich.let(DeviceRegistryEnrichProperty::unwrap))
      }

      /**
       * @param deviceRegistryEnrich Adds data from the AWS IoT device registry to your message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab22e542b2d957497953e9d0672c37ec53a0d249180ac68a5b2fc0e3e956d83a")
      override
          fun deviceRegistryEnrich(deviceRegistryEnrich: DeviceRegistryEnrichProperty.Builder.() -> Unit):
          Unit = deviceRegistryEnrich(DeviceRegistryEnrichProperty(deviceRegistryEnrich))

      /**
       * @param deviceShadowEnrich Adds information from the AWS IoT Device Shadows service to a
       * message.
       */
      override fun deviceShadowEnrich(deviceShadowEnrich: IResolvable) {
        cdkBuilder.deviceShadowEnrich(deviceShadowEnrich.let(IResolvable::unwrap))
      }

      /**
       * @param deviceShadowEnrich Adds information from the AWS IoT Device Shadows service to a
       * message.
       */
      override fun deviceShadowEnrich(deviceShadowEnrich: DeviceShadowEnrichProperty) {
        cdkBuilder.deviceShadowEnrich(deviceShadowEnrich.let(DeviceShadowEnrichProperty::unwrap))
      }

      /**
       * @param deviceShadowEnrich Adds information from the AWS IoT Device Shadows service to a
       * message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d41686fb04cacb0ea68292b59291060d7ff78c8f5b17e4b82aed6959861f72f")
      override
          fun deviceShadowEnrich(deviceShadowEnrich: DeviceShadowEnrichProperty.Builder.() -> Unit):
          Unit = deviceShadowEnrich(DeviceShadowEnrichProperty(deviceShadowEnrich))

      /**
       * @param filter Filters a message based on its attributes.
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      /**
       * @param filter Filters a message based on its attributes.
       */
      override fun filter(filter: FilterProperty) {
        cdkBuilder.filter(filter.let(FilterProperty::unwrap))
      }

      /**
       * @param filter Filters a message based on its attributes.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64cd2356ae73cd4ae7f0839ba69a5293f9ad40ef42a1261335c4f83c45d70a59")
      override fun filter(filter: FilterProperty.Builder.() -> Unit): Unit =
          filter(FilterProperty(filter))

      /**
       * @param lambda Runs a Lambda function to modify the message.
       */
      override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable::unwrap))
      }

      /**
       * @param lambda Runs a Lambda function to modify the message.
       */
      override fun lambda(lambda: LambdaProperty) {
        cdkBuilder.lambda(lambda.let(LambdaProperty::unwrap))
      }

      /**
       * @param lambda Runs a Lambda function to modify the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("752400dbe34c10dfb329054e73dc85cd243b45e1b8551bf688df91bfdd8679f7")
      override fun lambda(lambda: LambdaProperty.Builder.() -> Unit): Unit =
          lambda(LambdaProperty(lambda))

      /**
       * @param math Computes an arithmetic expression using the message's attributes and adds it to
       * the message.
       */
      override fun math(math: IResolvable) {
        cdkBuilder.math(math.let(IResolvable::unwrap))
      }

      /**
       * @param math Computes an arithmetic expression using the message's attributes and adds it to
       * the message.
       */
      override fun math(math: MathProperty) {
        cdkBuilder.math(math.let(MathProperty::unwrap))
      }

      /**
       * @param math Computes an arithmetic expression using the message's attributes and adds it to
       * the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c6a1a86c0e9519c5c512a75d39a299706b42961487e63592617ff0e0dea4a2b")
      override fun math(math: MathProperty.Builder.() -> Unit): Unit = math(MathProperty(math))

      /**
       * @param removeAttributes Removes attributes from a message.
       */
      override fun removeAttributes(removeAttributes: IResolvable) {
        cdkBuilder.removeAttributes(removeAttributes.let(IResolvable::unwrap))
      }

      /**
       * @param removeAttributes Removes attributes from a message.
       */
      override fun removeAttributes(removeAttributes: RemoveAttributesProperty) {
        cdkBuilder.removeAttributes(removeAttributes.let(RemoveAttributesProperty::unwrap))
      }

      /**
       * @param removeAttributes Removes attributes from a message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12dfffc43b45420039a504fc1680bc58e9c19dd8f2a147c4d16fe29b86bd8285")
      override fun removeAttributes(removeAttributes: RemoveAttributesProperty.Builder.() -> Unit):
          Unit = removeAttributes(RemoveAttributesProperty(removeAttributes))

      /**
       * @param selectAttributes Creates a new message using only the specified attributes from the
       * original message.
       */
      override fun selectAttributes(selectAttributes: IResolvable) {
        cdkBuilder.selectAttributes(selectAttributes.let(IResolvable::unwrap))
      }

      /**
       * @param selectAttributes Creates a new message using only the specified attributes from the
       * original message.
       */
      override fun selectAttributes(selectAttributes: SelectAttributesProperty) {
        cdkBuilder.selectAttributes(selectAttributes.let(SelectAttributesProperty::unwrap))
      }

      /**
       * @param selectAttributes Creates a new message using only the specified attributes from the
       * original message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("af4c5295ff31da7d5583a61d793d81b274c0fc52f577cb78d8d3be56b35f8edf")
      override fun selectAttributes(selectAttributes: SelectAttributesProperty.Builder.() -> Unit):
          Unit = selectAttributes(SelectAttributesProperty(selectAttributes))

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty,
    ) : CdkObject(cdkObject), ActivityProperty {
      /**
       * Adds other attributes based on existing attributes in the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-addattributes)
       */
      override fun addAttributes(): Any? = unwrap(this).getAddAttributes()

      /**
       * Determines the source of the messages to be processed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-channel)
       */
      override fun channel(): Any? = unwrap(this).getChannel()

      /**
       * Specifies where to store the processed message data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-datastore)
       */
      override fun datastore(): Any? = unwrap(this).getDatastore()

      /**
       * Adds data from the AWS IoT device registry to your message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-deviceregistryenrich)
       */
      override fun deviceRegistryEnrich(): Any? = unwrap(this).getDeviceRegistryEnrich()

      /**
       * Adds information from the AWS IoT Device Shadows service to a message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-deviceshadowenrich)
       */
      override fun deviceShadowEnrich(): Any? = unwrap(this).getDeviceShadowEnrich()

      /**
       * Filters a message based on its attributes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-filter)
       */
      override fun filter(): Any? = unwrap(this).getFilter()

      /**
       * Runs a Lambda function to modify the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-lambda)
       */
      override fun lambda(): Any? = unwrap(this).getLambda()

      /**
       * Computes an arithmetic expression using the message's attributes and adds it to the
       * message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-math)
       */
      override fun math(): Any? = unwrap(this).getMath()

      /**
       * Removes attributes from a message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-removeattributes)
       */
      override fun removeAttributes(): Any? = unwrap(this).getRemoveAttributes()

      /**
       * Creates a new message using only the specified attributes from the original message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html#cfn-iotanalytics-pipeline-activity-selectattributes)
       */
      override fun selectAttributes(): Any? = unwrap(this).getSelectAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActivityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty):
          ActivityProperty = CdkObjectWrappers.wrap(cdkObject) as? ActivityProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActivityProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty
    }
  }

  /**
   * The datastore activity that specifies where to store the processed data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * DatastoreProperty datastoreProperty = DatastoreProperty.builder()
   * .datastoreName("datastoreName")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html)
   */
  public interface DatastoreProperty {
    /**
     * The name of the data store where processed messages are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html#cfn-iotanalytics-pipeline-datastore-datastorename)
     */
    public fun datastoreName(): String

    /**
     * The name of the datastore activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html#cfn-iotanalytics-pipeline-datastore-name)
     */
    public fun name(): String

    /**
     * A builder for [DatastoreProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param datastoreName The name of the data store where processed messages are stored. 
       */
      public fun datastoreName(datastoreName: String)

      /**
       * @param name The name of the datastore activity. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.builder()

      /**
       * @param datastoreName The name of the data store where processed messages are stored. 
       */
      override fun datastoreName(datastoreName: String) {
        cdkBuilder.datastoreName(datastoreName)
      }

      /**
       * @param name The name of the datastore activity. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty,
    ) : CdkObject(cdkObject), DatastoreProperty {
      /**
       * The name of the data store where processed messages are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html#cfn-iotanalytics-pipeline-datastore-datastorename)
       */
      override fun datastoreName(): String = unwrap(this).getDatastoreName()

      /**
       * The name of the datastore activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html#cfn-iotanalytics-pipeline-datastore-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatastoreProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty):
          DatastoreProperty = CdkObjectWrappers.wrap(cdkObject) as? DatastoreProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatastoreProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty
    }
  }

  /**
   * An activity that adds other attributes based on existing attributes in the message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * AddAttributesProperty addAttributesProperty = AddAttributesProperty.builder()
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html)
   */
  public interface AddAttributesProperty {
    /**
     * A list of 1-50 "AttributeNameMapping" objects that map an existing attribute to a new
     * attribute.
     *
     *
     * The existing attributes remain in the message, so if you want to remove the originals, use
     * "RemoveAttributeActivity".
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html#cfn-iotanalytics-pipeline-addattributes-attributes)
     */
    public fun attributes(): Any

    /**
     * The name of the 'addAttributes' activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html#cfn-iotanalytics-pipeline-addattributes-name)
     */
    public fun name(): String

    /**
     * The next activity in the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html#cfn-iotanalytics-pipeline-addattributes-next)
     */
    public fun next(): String? = unwrap(this).getNext()

    /**
     * A builder for [AddAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes A list of 1-50 "AttributeNameMapping" objects that map an existing
       * attribute to a new attribute. 
       *
       * The existing attributes remain in the message, so if you want to remove the originals, use
       * "RemoveAttributeActivity".
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes A list of 1-50 "AttributeNameMapping" objects that map an existing
       * attribute to a new attribute. 
       *
       * The existing attributes remain in the message, so if you want to remove the originals, use
       * "RemoveAttributeActivity".
       */
      public fun attributes(attributes: Map<String, String>)

      /**
       * @param name The name of the 'addAttributes' activity. 
       */
      public fun name(name: String)

      /**
       * @param next The next activity in the pipeline.
       */
      public fun next(next: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.builder()

      /**
       * @param attributes A list of 1-50 "AttributeNameMapping" objects that map an existing
       * attribute to a new attribute. 
       *
       * The existing attributes remain in the message, so if you want to remove the originals, use
       * "RemoveAttributeActivity".
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      /**
       * @param attributes A list of 1-50 "AttributeNameMapping" objects that map an existing
       * attribute to a new attribute. 
       *
       * The existing attributes remain in the message, so if you want to remove the originals, use
       * "RemoveAttributeActivity".
       */
      override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param name The name of the 'addAttributes' activity. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param next The next activity in the pipeline.
       */
      override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty,
    ) : CdkObject(cdkObject), AddAttributesProperty {
      /**
       * A list of 1-50 "AttributeNameMapping" objects that map an existing attribute to a new
       * attribute.
       *
       *
       * The existing attributes remain in the message, so if you want to remove the originals, use
       * "RemoveAttributeActivity".
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html#cfn-iotanalytics-pipeline-addattributes-attributes)
       */
      override fun attributes(): Any = unwrap(this).getAttributes()

      /**
       * The name of the 'addAttributes' activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html#cfn-iotanalytics-pipeline-addattributes-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The next activity in the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html#cfn-iotanalytics-pipeline-addattributes-next)
       */
      override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AddAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty):
          AddAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as? AddAttributesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddAttributesProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty
    }
  }

  /**
   * An activity that filters a message based on its attributes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * FilterProperty filterProperty = FilterProperty.builder()
   * .filter("filter")
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-filter.html)
   */
  public interface FilterProperty {
    /**
     * An expression that looks like an SQL WHERE clause that must return a Boolean value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-filter.html#cfn-iotanalytics-pipeline-filter-filter)
     */
    public fun filter(): String

    /**
     * The name of the 'filter' activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-filter.html#cfn-iotanalytics-pipeline-filter-name)
     */
    public fun name(): String

    /**
     * The next activity in the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-filter.html#cfn-iotanalytics-pipeline-filter-next)
     */
    public fun next(): String? = unwrap(this).getNext()

    /**
     * A builder for [FilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filter An expression that looks like an SQL WHERE clause that must return a Boolean
       * value. 
       */
      public fun filter(filter: String)

      /**
       * @param name The name of the 'filter' activity. 
       */
      public fun name(name: String)

      /**
       * @param next The next activity in the pipeline.
       */
      public fun next(next: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.builder()

      /**
       * @param filter An expression that looks like an SQL WHERE clause that must return a Boolean
       * value. 
       */
      override fun filter(filter: String) {
        cdkBuilder.filter(filter)
      }

      /**
       * @param name The name of the 'filter' activity. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param next The next activity in the pipeline.
       */
      override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      /**
       * An expression that looks like an SQL WHERE clause that must return a Boolean value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-filter.html#cfn-iotanalytics-pipeline-filter-filter)
       */
      override fun filter(): String = unwrap(this).getFilter()

      /**
       * The name of the 'filter' activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-filter.html#cfn-iotanalytics-pipeline-filter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The next activity in the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-filter.html#cfn-iotanalytics-pipeline-filter-next)
       */
      override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty):
          FilterProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty
    }
  }

  /**
   * An activity that runs a Lambda function to modify the message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * LambdaProperty lambdaProperty = LambdaProperty.builder()
   * .batchSize(123)
   * .lambdaName("lambdaName")
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html)
   */
  public interface LambdaProperty {
    /**
     * The number of messages passed to the Lambda function for processing.
     *
     * The AWS Lambda function must be able to process all of these messages within five minutes,
     * which is the maximum timeout duration for Lambda functions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html#cfn-iotanalytics-pipeline-lambda-batchsize)
     */
    public fun batchSize(): Number

    /**
     * The name of the Lambda function that is run on the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html#cfn-iotanalytics-pipeline-lambda-lambdaname)
     */
    public fun lambdaName(): String

    /**
     * The name of the 'lambda' activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html#cfn-iotanalytics-pipeline-lambda-name)
     */
    public fun name(): String

    /**
     * The next activity in the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html#cfn-iotanalytics-pipeline-lambda-next)
     */
    public fun next(): String? = unwrap(this).getNext()

    /**
     * A builder for [LambdaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchSize The number of messages passed to the Lambda function for processing. 
       * The AWS Lambda function must be able to process all of these messages within five minutes,
       * which is the maximum timeout duration for Lambda functions.
       */
      public fun batchSize(batchSize: Number)

      /**
       * @param lambdaName The name of the Lambda function that is run on the message. 
       */
      public fun lambdaName(lambdaName: String)

      /**
       * @param name The name of the 'lambda' activity. 
       */
      public fun name(name: String)

      /**
       * @param next The next activity in the pipeline.
       */
      public fun next(next: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.builder()

      /**
       * @param batchSize The number of messages passed to the Lambda function for processing. 
       * The AWS Lambda function must be able to process all of these messages within five minutes,
       * which is the maximum timeout duration for Lambda functions.
       */
      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      /**
       * @param lambdaName The name of the Lambda function that is run on the message. 
       */
      override fun lambdaName(lambdaName: String) {
        cdkBuilder.lambdaName(lambdaName)
      }

      /**
       * @param name The name of the 'lambda' activity. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param next The next activity in the pipeline.
       */
      override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty,
    ) : CdkObject(cdkObject), LambdaProperty {
      /**
       * The number of messages passed to the Lambda function for processing.
       *
       * The AWS Lambda function must be able to process all of these messages within five minutes,
       * which is the maximum timeout duration for Lambda functions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html#cfn-iotanalytics-pipeline-lambda-batchsize)
       */
      override fun batchSize(): Number = unwrap(this).getBatchSize()

      /**
       * The name of the Lambda function that is run on the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html#cfn-iotanalytics-pipeline-lambda-lambdaname)
       */
      override fun lambdaName(): String = unwrap(this).getLambdaName()

      /**
       * The name of the 'lambda' activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html#cfn-iotanalytics-pipeline-lambda-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The next activity in the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html#cfn-iotanalytics-pipeline-lambda-next)
       */
      override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty):
          LambdaProperty = CdkObjectWrappers.wrap(cdkObject) as? LambdaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty
    }
  }

  /**
   * An activity that adds information from the AWS IoT Device Shadows service to a message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * DeviceShadowEnrichProperty deviceShadowEnrichProperty = DeviceShadowEnrichProperty.builder()
   * .attribute("attribute")
   * .name("name")
   * .roleArn("roleArn")
   * .thingName("thingName")
   * // the properties below are optional
   * .next("next")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html)
   */
  public interface DeviceShadowEnrichProperty {
    /**
     * The name of the attribute that is added to the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html#cfn-iotanalytics-pipeline-deviceshadowenrich-attribute)
     */
    public fun attribute(): String

    /**
     * The name of the 'deviceShadowEnrich' activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html#cfn-iotanalytics-pipeline-deviceshadowenrich-name)
     */
    public fun name(): String

    /**
     * The next activity in the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html#cfn-iotanalytics-pipeline-deviceshadowenrich-next)
     */
    public fun next(): String? = unwrap(this).getNext()

    /**
     * The ARN of the role that allows access to the device's shadow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html#cfn-iotanalytics-pipeline-deviceshadowenrich-rolearn)
     */
    public fun roleArn(): String

    /**
     * The name of the IoT device whose shadow information is added to the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html#cfn-iotanalytics-pipeline-deviceshadowenrich-thingname)
     */
    public fun thingName(): String

    /**
     * A builder for [DeviceShadowEnrichProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attribute The name of the attribute that is added to the message. 
       */
      public fun attribute(attribute: String)

      /**
       * @param name The name of the 'deviceShadowEnrich' activity. 
       */
      public fun name(name: String)

      /**
       * @param next The next activity in the pipeline.
       */
      public fun next(next: String)

      /**
       * @param roleArn The ARN of the role that allows access to the device's shadow. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param thingName The name of the IoT device whose shadow information is added to the
       * message. 
       */
      public fun thingName(thingName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.builder()

      /**
       * @param attribute The name of the attribute that is added to the message. 
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      /**
       * @param name The name of the 'deviceShadowEnrich' activity. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param next The next activity in the pipeline.
       */
      override fun next(next: String) {
        cdkBuilder.next(next)
      }

      /**
       * @param roleArn The ARN of the role that allows access to the device's shadow. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param thingName The name of the IoT device whose shadow information is added to the
       * message. 
       */
      override fun thingName(thingName: String) {
        cdkBuilder.thingName(thingName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty,
    ) : CdkObject(cdkObject), DeviceShadowEnrichProperty {
      /**
       * The name of the attribute that is added to the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html#cfn-iotanalytics-pipeline-deviceshadowenrich-attribute)
       */
      override fun attribute(): String = unwrap(this).getAttribute()

      /**
       * The name of the 'deviceShadowEnrich' activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html#cfn-iotanalytics-pipeline-deviceshadowenrich-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The next activity in the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html#cfn-iotanalytics-pipeline-deviceshadowenrich-next)
       */
      override fun next(): String? = unwrap(this).getNext()

      /**
       * The ARN of the role that allows access to the device's shadow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html#cfn-iotanalytics-pipeline-deviceshadowenrich-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The name of the IoT device whose shadow information is added to the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html#cfn-iotanalytics-pipeline-deviceshadowenrich-thingname)
       */
      override fun thingName(): String = unwrap(this).getThingName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceShadowEnrichProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty):
          DeviceShadowEnrichProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeviceShadowEnrichProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceShadowEnrichProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty
    }
  }

  /**
   * Creates a new message using only the specified attributes from the original message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * SelectAttributesProperty selectAttributesProperty = SelectAttributesProperty.builder()
   * .attributes(List.of("attributes"))
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html)
   */
  public interface SelectAttributesProperty {
    /**
     * A list of the attributes to select from the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html#cfn-iotanalytics-pipeline-selectattributes-attributes)
     */
    public fun attributes(): List<String>

    /**
     * The name of the 'selectAttributes' activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html#cfn-iotanalytics-pipeline-selectattributes-name)
     */
    public fun name(): String

    /**
     * The next activity in the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html#cfn-iotanalytics-pipeline-selectattributes-next)
     */
    public fun next(): String? = unwrap(this).getNext()

    /**
     * A builder for [SelectAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes A list of the attributes to select from the message. 
       */
      public fun attributes(attributes: List<String>)

      /**
       * @param attributes A list of the attributes to select from the message. 
       */
      public fun attributes(vararg attributes: String)

      /**
       * @param name The name of the 'selectAttributes' activity. 
       */
      public fun name(name: String)

      /**
       * @param next The next activity in the pipeline.
       */
      public fun next(next: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.builder()

      /**
       * @param attributes A list of the attributes to select from the message. 
       */
      override fun attributes(attributes: List<String>) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param attributes A list of the attributes to select from the message. 
       */
      override fun attributes(vararg attributes: String): Unit = attributes(attributes.toList())

      /**
       * @param name The name of the 'selectAttributes' activity. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param next The next activity in the pipeline.
       */
      override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty,
    ) : CdkObject(cdkObject), SelectAttributesProperty {
      /**
       * A list of the attributes to select from the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html#cfn-iotanalytics-pipeline-selectattributes-attributes)
       */
      override fun attributes(): List<String> = unwrap(this).getAttributes()

      /**
       * The name of the 'selectAttributes' activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html#cfn-iotanalytics-pipeline-selectattributes-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The next activity in the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html#cfn-iotanalytics-pipeline-selectattributes-next)
       */
      override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SelectAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty):
          SelectAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as? SelectAttributesProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelectAttributesProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty
    }
  }

  /**
   * An activity that removes attributes from a message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * RemoveAttributesProperty removeAttributesProperty = RemoveAttributesProperty.builder()
   * .attributes(List.of("attributes"))
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html)
   */
  public interface RemoveAttributesProperty {
    /**
     * A list of 1-50 attributes to remove from the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html#cfn-iotanalytics-pipeline-removeattributes-attributes)
     */
    public fun attributes(): List<String>

    /**
     * The name of the 'removeAttributes' activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html#cfn-iotanalytics-pipeline-removeattributes-name)
     */
    public fun name(): String

    /**
     * The next activity in the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html#cfn-iotanalytics-pipeline-removeattributes-next)
     */
    public fun next(): String? = unwrap(this).getNext()

    /**
     * A builder for [RemoveAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes A list of 1-50 attributes to remove from the message. 
       */
      public fun attributes(attributes: List<String>)

      /**
       * @param attributes A list of 1-50 attributes to remove from the message. 
       */
      public fun attributes(vararg attributes: String)

      /**
       * @param name The name of the 'removeAttributes' activity. 
       */
      public fun name(name: String)

      /**
       * @param next The next activity in the pipeline.
       */
      public fun next(next: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.builder()

      /**
       * @param attributes A list of 1-50 attributes to remove from the message. 
       */
      override fun attributes(attributes: List<String>) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param attributes A list of 1-50 attributes to remove from the message. 
       */
      override fun attributes(vararg attributes: String): Unit = attributes(attributes.toList())

      /**
       * @param name The name of the 'removeAttributes' activity. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param next The next activity in the pipeline.
       */
      override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty,
    ) : CdkObject(cdkObject), RemoveAttributesProperty {
      /**
       * A list of 1-50 attributes to remove from the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html#cfn-iotanalytics-pipeline-removeattributes-attributes)
       */
      override fun attributes(): List<String> = unwrap(this).getAttributes()

      /**
       * The name of the 'removeAttributes' activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html#cfn-iotanalytics-pipeline-removeattributes-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The next activity in the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html#cfn-iotanalytics-pipeline-removeattributes-next)
       */
      override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RemoveAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty):
          RemoveAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as? RemoveAttributesProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RemoveAttributesProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty
    }
  }

  /**
   * An activity that computes an arithmetic expression using the message's attributes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * MathProperty mathProperty = MathProperty.builder()
   * .attribute("attribute")
   * .math("math")
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html)
   */
  public interface MathProperty {
    /**
     * The name of the attribute that contains the result of the math operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html#cfn-iotanalytics-pipeline-math-attribute)
     */
    public fun attribute(): String

    /**
     * An expression that uses one or more existing attributes and must return an integer value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html#cfn-iotanalytics-pipeline-math-math)
     */
    public fun math(): String

    /**
     * The name of the 'math' activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html#cfn-iotanalytics-pipeline-math-name)
     */
    public fun name(): String

    /**
     * The next activity in the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html#cfn-iotanalytics-pipeline-math-next)
     */
    public fun next(): String? = unwrap(this).getNext()

    /**
     * A builder for [MathProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attribute The name of the attribute that contains the result of the math operation. 
       */
      public fun attribute(attribute: String)

      /**
       * @param math An expression that uses one or more existing attributes and must return an
       * integer value. 
       */
      public fun math(math: String)

      /**
       * @param name The name of the 'math' activity. 
       */
      public fun name(name: String)

      /**
       * @param next The next activity in the pipeline.
       */
      public fun next(next: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.builder()

      /**
       * @param attribute The name of the attribute that contains the result of the math operation. 
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      /**
       * @param math An expression that uses one or more existing attributes and must return an
       * integer value. 
       */
      override fun math(math: String) {
        cdkBuilder.math(math)
      }

      /**
       * @param name The name of the 'math' activity. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param next The next activity in the pipeline.
       */
      override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty,
    ) : CdkObject(cdkObject), MathProperty {
      /**
       * The name of the attribute that contains the result of the math operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html#cfn-iotanalytics-pipeline-math-attribute)
       */
      override fun attribute(): String = unwrap(this).getAttribute()

      /**
       * An expression that uses one or more existing attributes and must return an integer value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html#cfn-iotanalytics-pipeline-math-math)
       */
      override fun math(): String = unwrap(this).getMath()

      /**
       * The name of the 'math' activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html#cfn-iotanalytics-pipeline-math-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The next activity in the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html#cfn-iotanalytics-pipeline-math-next)
       */
      override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty):
          MathProperty = CdkObjectWrappers.wrap(cdkObject) as? MathProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MathProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty
    }
  }

  /**
   * Determines the source of the messages to be processed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * ChannelProperty channelProperty = ChannelProperty.builder()
   * .channelName("channelName")
   * .name("name")
   * // the properties below are optional
   * .next("next")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html)
   */
  public interface ChannelProperty {
    /**
     * The name of the channel from which the messages are processed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html#cfn-iotanalytics-pipeline-channel-channelname)
     */
    public fun channelName(): String

    /**
     * The name of the 'channel' activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html#cfn-iotanalytics-pipeline-channel-name)
     */
    public fun name(): String

    /**
     * The next activity in the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html#cfn-iotanalytics-pipeline-channel-next)
     */
    public fun next(): String? = unwrap(this).getNext()

    /**
     * A builder for [ChannelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param channelName The name of the channel from which the messages are processed. 
       */
      public fun channelName(channelName: String)

      /**
       * @param name The name of the 'channel' activity. 
       */
      public fun name(name: String)

      /**
       * @param next The next activity in the pipeline.
       */
      public fun next(next: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.builder()

      /**
       * @param channelName The name of the channel from which the messages are processed. 
       */
      override fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
      }

      /**
       * @param name The name of the 'channel' activity. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param next The next activity in the pipeline.
       */
      override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty,
    ) : CdkObject(cdkObject), ChannelProperty {
      /**
       * The name of the channel from which the messages are processed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html#cfn-iotanalytics-pipeline-channel-channelname)
       */
      override fun channelName(): String = unwrap(this).getChannelName()

      /**
       * The name of the 'channel' activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html#cfn-iotanalytics-pipeline-channel-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The next activity in the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html#cfn-iotanalytics-pipeline-channel-next)
       */
      override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChannelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty):
          ChannelProperty = CdkObjectWrappers.wrap(cdkObject) as? ChannelProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChannelProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty
    }
  }

  /**
   * An activity that adds data from the AWS IoT device registry to your message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * DeviceRegistryEnrichProperty deviceRegistryEnrichProperty =
   * DeviceRegistryEnrichProperty.builder()
   * .attribute("attribute")
   * .name("name")
   * .roleArn("roleArn")
   * .thingName("thingName")
   * // the properties below are optional
   * .next("next")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html)
   */
  public interface DeviceRegistryEnrichProperty {
    /**
     * The name of the attribute that is added to the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html#cfn-iotanalytics-pipeline-deviceregistryenrich-attribute)
     */
    public fun attribute(): String

    /**
     * The name of the 'deviceRegistryEnrich' activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html#cfn-iotanalytics-pipeline-deviceregistryenrich-name)
     */
    public fun name(): String

    /**
     * The next activity in the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html#cfn-iotanalytics-pipeline-deviceregistryenrich-next)
     */
    public fun next(): String? = unwrap(this).getNext()

    /**
     * The ARN of the role that allows access to the device's registry information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html#cfn-iotanalytics-pipeline-deviceregistryenrich-rolearn)
     */
    public fun roleArn(): String

    /**
     * The name of the IoT device whose registry information is added to the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html#cfn-iotanalytics-pipeline-deviceregistryenrich-thingname)
     */
    public fun thingName(): String

    /**
     * A builder for [DeviceRegistryEnrichProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attribute The name of the attribute that is added to the message. 
       */
      public fun attribute(attribute: String)

      /**
       * @param name The name of the 'deviceRegistryEnrich' activity. 
       */
      public fun name(name: String)

      /**
       * @param next The next activity in the pipeline.
       */
      public fun next(next: String)

      /**
       * @param roleArn The ARN of the role that allows access to the device's registry information.
       * 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param thingName The name of the IoT device whose registry information is added to the
       * message. 
       */
      public fun thingName(thingName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.builder()

      /**
       * @param attribute The name of the attribute that is added to the message. 
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      /**
       * @param name The name of the 'deviceRegistryEnrich' activity. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param next The next activity in the pipeline.
       */
      override fun next(next: String) {
        cdkBuilder.next(next)
      }

      /**
       * @param roleArn The ARN of the role that allows access to the device's registry information.
       * 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param thingName The name of the IoT device whose registry information is added to the
       * message. 
       */
      override fun thingName(thingName: String) {
        cdkBuilder.thingName(thingName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty,
    ) : CdkObject(cdkObject), DeviceRegistryEnrichProperty {
      /**
       * The name of the attribute that is added to the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html#cfn-iotanalytics-pipeline-deviceregistryenrich-attribute)
       */
      override fun attribute(): String = unwrap(this).getAttribute()

      /**
       * The name of the 'deviceRegistryEnrich' activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html#cfn-iotanalytics-pipeline-deviceregistryenrich-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The next activity in the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html#cfn-iotanalytics-pipeline-deviceregistryenrich-next)
       */
      override fun next(): String? = unwrap(this).getNext()

      /**
       * The ARN of the role that allows access to the device's registry information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html#cfn-iotanalytics-pipeline-deviceregistryenrich-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The name of the IoT device whose registry information is added to the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html#cfn-iotanalytics-pipeline-deviceregistryenrich-thingname)
       */
      override fun thingName(): String = unwrap(this).getThingName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceRegistryEnrichProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty):
          DeviceRegistryEnrichProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeviceRegistryEnrichProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceRegistryEnrichProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty
    }
  }
}
