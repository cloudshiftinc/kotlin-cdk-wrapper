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
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::IoTAnalytics::Dataset resource stores data retrieved from a data store by applying a
 * `queryAction` (an SQL query) or a `containerAction` (executing a containerized application).
 *
 * The data set can be populated manually by calling `CreateDatasetContent` or automatically
 * according to a `trigger` you specify. For more information, see [How to Use AWS IoT
 * Analytics](https://docs.aws.amazon.com/iotanalytics/latest/userguide/welcome.html#aws-iot-analytics-how)
 * in the *AWS IoT Analytics User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
 * CfnDataset cfnDataset = CfnDataset.Builder.create(this, "MyCfnDataset")
 * .actions(List.of(ActionProperty.builder()
 * .actionName("actionName")
 * // the properties below are optional
 * .containerAction(ContainerActionProperty.builder()
 * .executionRoleArn("executionRoleArn")
 * .image("image")
 * .resourceConfiguration(ResourceConfigurationProperty.builder()
 * .computeType("computeType")
 * .volumeSizeInGb(123)
 * .build())
 * // the properties below are optional
 * .variables(List.of(VariableProperty.builder()
 * .variableName("variableName")
 * // the properties below are optional
 * .datasetContentVersionValue(DatasetContentVersionValueProperty.builder()
 * .datasetName("datasetName")
 * .build())
 * .doubleValue(123)
 * .outputFileUriValue(OutputFileUriValueProperty.builder()
 * .fileName("fileName")
 * .build())
 * .stringValue("stringValue")
 * .build()))
 * .build())
 * .queryAction(QueryActionProperty.builder()
 * .sqlQuery("sqlQuery")
 * // the properties below are optional
 * .filters(List.of(FilterProperty.builder()
 * .deltaTime(DeltaTimeProperty.builder()
 * .offsetSeconds(123)
 * .timeExpression("timeExpression")
 * .build())
 * .build()))
 * .build())
 * .build()))
 * // the properties below are optional
 * .contentDeliveryRules(List.of(DatasetContentDeliveryRuleProperty.builder()
 * .destination(DatasetContentDeliveryRuleDestinationProperty.builder()
 * .iotEventsDestinationConfiguration(IotEventsDestinationConfigurationProperty.builder()
 * .inputName("inputName")
 * .roleArn("roleArn")
 * .build())
 * .s3DestinationConfiguration(S3DestinationConfigurationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .glueConfiguration(GlueConfigurationProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .entryName("entryName")
 * .build()))
 * .datasetName("datasetName")
 * .lateDataRules(List.of(LateDataRuleProperty.builder()
 * .ruleConfiguration(LateDataRuleConfigurationProperty.builder()
 * .deltaTimeSessionWindowConfiguration(DeltaTimeSessionWindowConfigurationProperty.builder()
 * .timeoutInMinutes(123)
 * .build())
 * .build())
 * // the properties below are optional
 * .ruleName("ruleName")
 * .build()))
 * .retentionPeriod(RetentionPeriodProperty.builder()
 * .numberOfDays(123)
 * .unlimited(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .triggers(List.of(TriggerProperty.builder()
 * .schedule(ScheduleProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * .build())
 * .triggeringDataset(TriggeringDatasetProperty.builder()
 * .datasetName("datasetName")
 * .build())
 * .build()))
 * .versioningConfiguration(VersioningConfigurationProperty.builder()
 * .maxVersions(123)
 * .unlimited(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html)
 */
public open class CfnDataset internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The `DatasetAction` objects that automatically create the dataset contents.
   */
  public open fun actions(): Any = unwrap(this).getActions()

  /**
   * The `DatasetAction` objects that automatically create the dataset contents.
   */
  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The `DatasetAction` objects that automatically create the dataset contents.
   */
  public open fun actions(`value`: List<Any>) {
    unwrap(this).setActions(`value`)
  }

  /**
   * The `DatasetAction` objects that automatically create the dataset contents.
   */
  public open fun actions(vararg `value`: Any): Unit = actions(`value`.toList())

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * When dataset contents are created they are delivered to destinations specified here.
   */
  public open fun contentDeliveryRules(): Any? = unwrap(this).getContentDeliveryRules()

  /**
   * When dataset contents are created they are delivered to destinations specified here.
   */
  public open fun contentDeliveryRules(`value`: IResolvable) {
    unwrap(this).setContentDeliveryRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * When dataset contents are created they are delivered to destinations specified here.
   */
  public open fun contentDeliveryRules(`value`: List<Any>) {
    unwrap(this).setContentDeliveryRules(`value`)
  }

  /**
   * When dataset contents are created they are delivered to destinations specified here.
   */
  public open fun contentDeliveryRules(vararg `value`: Any): Unit =
      contentDeliveryRules(`value`.toList())

  /**
   * The name of the dataset.
   */
  public open fun datasetName(): String? = unwrap(this).getDatasetName()

  /**
   * The name of the dataset.
   */
  public open fun datasetName(`value`: String) {
    unwrap(this).setDatasetName(`value`)
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
   * A list of data rules that send notifications to CloudWatch, when data arrives late.
   */
  public open fun lateDataRules(): Any? = unwrap(this).getLateDataRules()

  /**
   * A list of data rules that send notifications to CloudWatch, when data arrives late.
   */
  public open fun lateDataRules(`value`: IResolvable) {
    unwrap(this).setLateDataRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of data rules that send notifications to CloudWatch, when data arrives late.
   */
  public open fun lateDataRules(`value`: List<Any>) {
    unwrap(this).setLateDataRules(`value`)
  }

  /**
   * A list of data rules that send notifications to CloudWatch, when data arrives late.
   */
  public open fun lateDataRules(vararg `value`: Any): Unit = lateDataRules(`value`.toList())

  /**
   * Optional.
   */
  public open fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

  /**
   * Optional.
   */
  public open fun retentionPeriod(`value`: IResolvable) {
    unwrap(this).setRetentionPeriod(`value`.let(IResolvable::unwrap))
  }

  /**
   * Optional.
   */
  public open fun retentionPeriod(`value`: RetentionPeriodProperty) {
    unwrap(this).setRetentionPeriod(`value`.let(RetentionPeriodProperty::unwrap))
  }

  /**
   * Optional.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f3d2b827472134f7d6e0faf747de7bf4dbe18db2d25da79fbd1ba10c038f907")
  public open fun retentionPeriod(`value`: RetentionPeriodProperty.Builder.() -> Unit): Unit =
      retentionPeriod(RetentionPeriodProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata which can be used to manage the data set.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata which can be used to manage the data set.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata which can be used to manage the data set.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The `DatasetTrigger` objects that specify when the dataset is automatically updated.
   */
  public open fun triggers(): Any? = unwrap(this).getTriggers()

  /**
   * The `DatasetTrigger` objects that specify when the dataset is automatically updated.
   */
  public open fun triggers(`value`: IResolvable) {
    unwrap(this).setTriggers(`value`.let(IResolvable::unwrap))
  }

  /**
   * The `DatasetTrigger` objects that specify when the dataset is automatically updated.
   */
  public open fun triggers(`value`: List<Any>) {
    unwrap(this).setTriggers(`value`)
  }

  /**
   * The `DatasetTrigger` objects that specify when the dataset is automatically updated.
   */
  public open fun triggers(vararg `value`: Any): Unit = triggers(`value`.toList())

  /**
   * Optional.
   */
  public open fun versioningConfiguration(): Any? = unwrap(this).getVersioningConfiguration()

  /**
   * Optional.
   */
  public open fun versioningConfiguration(`value`: IResolvable) {
    unwrap(this).setVersioningConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Optional.
   */
  public open fun versioningConfiguration(`value`: VersioningConfigurationProperty) {
    unwrap(this).setVersioningConfiguration(`value`.let(VersioningConfigurationProperty::unwrap))
  }

  /**
   * Optional.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("69ecd0ecda0a8c45a4cca5d4893e6f8e86b4b799c6f76005f236e0d0ad6a9ee6")
  public open
      fun versioningConfiguration(`value`: VersioningConfigurationProperty.Builder.() -> Unit): Unit
      = versioningConfiguration(VersioningConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotanalytics.CfnDataset].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The `DatasetAction` objects that automatically create the dataset contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-actions)
     * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
     */
    public fun actions(actions: IResolvable)

    /**
     * The `DatasetAction` objects that automatically create the dataset contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-actions)
     * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
     */
    public fun actions(actions: List<Any>)

    /**
     * The `DatasetAction` objects that automatically create the dataset contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-actions)
     * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
     */
    public fun actions(vararg actions: Any)

    /**
     * When dataset contents are created they are delivered to destinations specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-contentdeliveryrules)
     * @param contentDeliveryRules When dataset contents are created they are delivered to
     * destinations specified here. 
     */
    public fun contentDeliveryRules(contentDeliveryRules: IResolvable)

    /**
     * When dataset contents are created they are delivered to destinations specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-contentdeliveryrules)
     * @param contentDeliveryRules When dataset contents are created they are delivered to
     * destinations specified here. 
     */
    public fun contentDeliveryRules(contentDeliveryRules: List<Any>)

    /**
     * When dataset contents are created they are delivered to destinations specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-contentdeliveryrules)
     * @param contentDeliveryRules When dataset contents are created they are delivered to
     * destinations specified here. 
     */
    public fun contentDeliveryRules(vararg contentDeliveryRules: Any)

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-datasetname)
     * @param datasetName The name of the dataset. 
     */
    public fun datasetName(datasetName: String)

    /**
     * A list of data rules that send notifications to CloudWatch, when data arrives late.
     *
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-latedatarules)
     * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
     * arrives late. 
     */
    public fun lateDataRules(lateDataRules: IResolvable)

    /**
     * A list of data rules that send notifications to CloudWatch, when data arrives late.
     *
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-latedatarules)
     * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
     * arrives late. 
     */
    public fun lateDataRules(lateDataRules: List<Any>)

    /**
     * A list of data rules that send notifications to CloudWatch, when data arrives late.
     *
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-latedatarules)
     * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
     * arrives late. 
     */
    public fun lateDataRules(vararg lateDataRules: Any)

    /**
     * Optional.
     *
     * How long, in days, message data is kept for the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-retentionperiod)
     * @param retentionPeriod Optional. 
     */
    public fun retentionPeriod(retentionPeriod: IResolvable)

    /**
     * Optional.
     *
     * How long, in days, message data is kept for the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-retentionperiod)
     * @param retentionPeriod Optional. 
     */
    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty)

    /**
     * Optional.
     *
     * How long, in days, message data is kept for the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-retentionperiod)
     * @param retentionPeriod Optional. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed4b1a6c499b1aab7253c220d7bea5f6b604f2bae56e1a41fc8a151531e688b6")
    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit)

    /**
     * Metadata which can be used to manage the data set.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-tags)
     * @param tags Metadata which can be used to manage the data set. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata which can be used to manage the data set.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-tags)
     * @param tags Metadata which can be used to manage the data set. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The `DatasetTrigger` objects that specify when the dataset is automatically updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-triggers)
     * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
     * updated. 
     */
    public fun triggers(triggers: IResolvable)

    /**
     * The `DatasetTrigger` objects that specify when the dataset is automatically updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-triggers)
     * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
     * updated. 
     */
    public fun triggers(triggers: List<Any>)

    /**
     * The `DatasetTrigger` objects that specify when the dataset is automatically updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-triggers)
     * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
     * updated. 
     */
    public fun triggers(vararg triggers: Any)

    /**
     * Optional.
     *
     * How many versions of dataset contents are kept. If not specified or set to null, only the
     * latest version plus the latest succeeded version (if they are different) are kept for the time
     * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
     * Versions of AWS IoT Analytics
     * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * in the *AWS IoT Analytics User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-versioningconfiguration)
     * @param versioningConfiguration Optional. 
     */
    public fun versioningConfiguration(versioningConfiguration: IResolvable)

    /**
     * Optional.
     *
     * How many versions of dataset contents are kept. If not specified or set to null, only the
     * latest version plus the latest succeeded version (if they are different) are kept for the time
     * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
     * Versions of AWS IoT Analytics
     * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * in the *AWS IoT Analytics User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-versioningconfiguration)
     * @param versioningConfiguration Optional. 
     */
    public fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty)

    /**
     * Optional.
     *
     * How many versions of dataset contents are kept. If not specified or set to null, only the
     * latest version plus the latest succeeded version (if they are different) are kept for the time
     * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
     * Versions of AWS IoT Analytics
     * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * in the *AWS IoT Analytics User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-versioningconfiguration)
     * @param versioningConfiguration Optional. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cdff7b61aeda49e270b8e34c4421b701bf69a337e52852300e910e8de7f64610")
    public
        fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnDataset.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnDataset.Builder.create(scope, id)

    /**
     * The `DatasetAction` objects that automatically create the dataset contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-actions)
     * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    /**
     * The `DatasetAction` objects that automatically create the dataset contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-actions)
     * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    /**
     * The `DatasetAction` objects that automatically create the dataset contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-actions)
     * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * When dataset contents are created they are delivered to destinations specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-contentdeliveryrules)
     * @param contentDeliveryRules When dataset contents are created they are delivered to
     * destinations specified here. 
     */
    override fun contentDeliveryRules(contentDeliveryRules: IResolvable) {
      cdkBuilder.contentDeliveryRules(contentDeliveryRules.let(IResolvable::unwrap))
    }

    /**
     * When dataset contents are created they are delivered to destinations specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-contentdeliveryrules)
     * @param contentDeliveryRules When dataset contents are created they are delivered to
     * destinations specified here. 
     */
    override fun contentDeliveryRules(contentDeliveryRules: List<Any>) {
      cdkBuilder.contentDeliveryRules(contentDeliveryRules)
    }

    /**
     * When dataset contents are created they are delivered to destinations specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-contentdeliveryrules)
     * @param contentDeliveryRules When dataset contents are created they are delivered to
     * destinations specified here. 
     */
    override fun contentDeliveryRules(vararg contentDeliveryRules: Any): Unit =
        contentDeliveryRules(contentDeliveryRules.toList())

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-datasetname)
     * @param datasetName The name of the dataset. 
     */
    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    /**
     * A list of data rules that send notifications to CloudWatch, when data arrives late.
     *
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-latedatarules)
     * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
     * arrives late. 
     */
    override fun lateDataRules(lateDataRules: IResolvable) {
      cdkBuilder.lateDataRules(lateDataRules.let(IResolvable::unwrap))
    }

    /**
     * A list of data rules that send notifications to CloudWatch, when data arrives late.
     *
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-latedatarules)
     * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
     * arrives late. 
     */
    override fun lateDataRules(lateDataRules: List<Any>) {
      cdkBuilder.lateDataRules(lateDataRules)
    }

    /**
     * A list of data rules that send notifications to CloudWatch, when data arrives late.
     *
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-latedatarules)
     * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
     * arrives late. 
     */
    override fun lateDataRules(vararg lateDataRules: Any): Unit =
        lateDataRules(lateDataRules.toList())

    /**
     * Optional.
     *
     * How long, in days, message data is kept for the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-retentionperiod)
     * @param retentionPeriod Optional. 
     */
    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable::unwrap))
    }

    /**
     * Optional.
     *
     * How long, in days, message data is kept for the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-retentionperiod)
     * @param retentionPeriod Optional. 
     */
    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(RetentionPeriodProperty::unwrap))
    }

    /**
     * Optional.
     *
     * How long, in days, message data is kept for the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-retentionperiod)
     * @param retentionPeriod Optional. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed4b1a6c499b1aab7253c220d7bea5f6b604f2bae56e1a41fc8a151531e688b6")
    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit): Unit
        = retentionPeriod(RetentionPeriodProperty(retentionPeriod))

    /**
     * Metadata which can be used to manage the data set.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-tags)
     * @param tags Metadata which can be used to manage the data set. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata which can be used to manage the data set.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-tags)
     * @param tags Metadata which can be used to manage the data set. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The `DatasetTrigger` objects that specify when the dataset is automatically updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-triggers)
     * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
     * updated. 
     */
    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    /**
     * The `DatasetTrigger` objects that specify when the dataset is automatically updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-triggers)
     * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
     * updated. 
     */
    override fun triggers(triggers: List<Any>) {
      cdkBuilder.triggers(triggers)
    }

    /**
     * The `DatasetTrigger` objects that specify when the dataset is automatically updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-triggers)
     * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
     * updated. 
     */
    override fun triggers(vararg triggers: Any): Unit = triggers(triggers.toList())

    /**
     * Optional.
     *
     * How many versions of dataset contents are kept. If not specified or set to null, only the
     * latest version plus the latest succeeded version (if they are different) are kept for the time
     * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
     * Versions of AWS IoT Analytics
     * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * in the *AWS IoT Analytics User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-versioningconfiguration)
     * @param versioningConfiguration Optional. 
     */
    override fun versioningConfiguration(versioningConfiguration: IResolvable) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Optional.
     *
     * How many versions of dataset contents are kept. If not specified or set to null, only the
     * latest version plus the latest succeeded version (if they are different) are kept for the time
     * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
     * Versions of AWS IoT Analytics
     * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * in the *AWS IoT Analytics User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-versioningconfiguration)
     * @param versioningConfiguration Optional. 
     */
    override fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(VersioningConfigurationProperty::unwrap))
    }

    /**
     * Optional.
     *
     * How many versions of dataset contents are kept. If not specified or set to null, only the
     * latest version plus the latest succeeded version (if they are different) are kept for the time
     * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
     * Versions of AWS IoT Analytics
     * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * in the *AWS IoT Analytics User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-versioningconfiguration)
     * @param versioningConfiguration Optional. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cdff7b61aeda49e270b8e34c4421b701bf69a337e52852300e910e8de7f64610")
    override
        fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty.Builder.() -> Unit):
        Unit = versioningConfiguration(VersioningConfigurationProperty(versioningConfiguration))

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotanalytics.CfnDataset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset):
        CfnDataset = CfnDataset(cdkObject)

    internal fun unwrap(wrapped: CfnDataset):
        software.amazon.awscdk.services.iotanalytics.CfnDataset = wrapped.cdkObject
  }

  /**
   * Configuration information for coordination with AWS Glue , a fully managed extract, transform
   * and load (ETL) service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * GlueConfigurationProperty glueConfigurationProperty = GlueConfigurationProperty.builder()
   * .databaseName("databaseName")
   * .tableName("tableName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-glueconfiguration.html)
   */
  public interface GlueConfigurationProperty {
    /**
     * The name of the database in your AWS Glue Data Catalog in which the table is located.
     *
     * An AWS Glue Data Catalog database contains metadata tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-glueconfiguration.html#cfn-iotanalytics-dataset-glueconfiguration-databasename)
     */
    public fun databaseName(): String

    /**
     * The name of the table in your AWS Glue Data Catalog that is used to perform the ETL
     * operations.
     *
     * An AWS Glue Data Catalog table contains partitioned data and descriptions of data sources and
     * targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-glueconfiguration.html#cfn-iotanalytics-dataset-glueconfiguration-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [GlueConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseName The name of the database in your AWS Glue Data Catalog in which the
       * table is located. 
       * An AWS Glue Data Catalog database contains metadata tables.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param tableName The name of the table in your AWS Glue Data Catalog that is used to
       * perform the ETL operations. 
       * An AWS Glue Data Catalog table contains partitioned data and descriptions of data sources
       * and targets.
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty.builder()

      /**
       * @param databaseName The name of the database in your AWS Glue Data Catalog in which the
       * table is located. 
       * An AWS Glue Data Catalog database contains metadata tables.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param tableName The name of the table in your AWS Glue Data Catalog that is used to
       * perform the ETL operations. 
       * An AWS Glue Data Catalog table contains partitioned data and descriptions of data sources
       * and targets.
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty,
    ) : CdkObject(cdkObject), GlueConfigurationProperty {
      /**
       * The name of the database in your AWS Glue Data Catalog in which the table is located.
       *
       * An AWS Glue Data Catalog database contains metadata tables.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-glueconfiguration.html#cfn-iotanalytics-dataset-glueconfiguration-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * The name of the table in your AWS Glue Data Catalog that is used to perform the ETL
       * operations.
       *
       * An AWS Glue Data Catalog table contains partitioned data and descriptions of data sources
       * and targets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-glueconfiguration.html#cfn-iotanalytics-dataset-glueconfiguration-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GlueConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty):
          GlueConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty
    }
  }

  /**
   * Used to limit data to that which has arrived since the last execution of the action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * DeltaTimeProperty deltaTimeProperty = DeltaTimeProperty.builder()
   * .offsetSeconds(123)
   * .timeExpression("timeExpression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html)
   */
  public interface DeltaTimeProperty {
    /**
     * The number of seconds of estimated in-flight lag time of message data.
     *
     * When you create dataset contents using message data from a specified timeframe, some message
     * data might still be in flight when processing begins, and so do not arrive in time to be
     * processed. Use this field to make allowances for the in flight time of your message data, so
     * that data not processed from a previous timeframe is included with the next timeframe.
     * Otherwise, missed message data would be excluded from processing during the next timeframe too,
     * because its timestamp places it within the previous timeframe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-offsetseconds)
     */
    public fun offsetSeconds(): Number

    /**
     * An expression by which the time of the message data might be determined.
     *
     * This can be the name of a timestamp field or a SQL expression that is used to derive the time
     * the message data was generated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-timeexpression)
     */
    public fun timeExpression(): String

    /**
     * A builder for [DeltaTimeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param offsetSeconds The number of seconds of estimated in-flight lag time of message data.
       * 
       * When you create dataset contents using message data from a specified timeframe, some
       * message data might still be in flight when processing begins, and so do not arrive in time to
       * be processed. Use this field to make allowances for the in flight time of your message data,
       * so that data not processed from a previous timeframe is included with the next timeframe.
       * Otherwise, missed message data would be excluded from processing during the next timeframe
       * too, because its timestamp places it within the previous timeframe.
       */
      public fun offsetSeconds(offsetSeconds: Number)

      /**
       * @param timeExpression An expression by which the time of the message data might be
       * determined. 
       * This can be the name of a timestamp field or a SQL expression that is used to derive the
       * time the message data was generated.
       */
      public fun timeExpression(timeExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.builder()

      /**
       * @param offsetSeconds The number of seconds of estimated in-flight lag time of message data.
       * 
       * When you create dataset contents using message data from a specified timeframe, some
       * message data might still be in flight when processing begins, and so do not arrive in time to
       * be processed. Use this field to make allowances for the in flight time of your message data,
       * so that data not processed from a previous timeframe is included with the next timeframe.
       * Otherwise, missed message data would be excluded from processing during the next timeframe
       * too, because its timestamp places it within the previous timeframe.
       */
      override fun offsetSeconds(offsetSeconds: Number) {
        cdkBuilder.offsetSeconds(offsetSeconds)
      }

      /**
       * @param timeExpression An expression by which the time of the message data might be
       * determined. 
       * This can be the name of a timestamp field or a SQL expression that is used to derive the
       * time the message data was generated.
       */
      override fun timeExpression(timeExpression: String) {
        cdkBuilder.timeExpression(timeExpression)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty,
    ) : CdkObject(cdkObject), DeltaTimeProperty {
      /**
       * The number of seconds of estimated in-flight lag time of message data.
       *
       * When you create dataset contents using message data from a specified timeframe, some
       * message data might still be in flight when processing begins, and so do not arrive in time to
       * be processed. Use this field to make allowances for the in flight time of your message data,
       * so that data not processed from a previous timeframe is included with the next timeframe.
       * Otherwise, missed message data would be excluded from processing during the next timeframe
       * too, because its timestamp places it within the previous timeframe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-offsetseconds)
       */
      override fun offsetSeconds(): Number = unwrap(this).getOffsetSeconds()

      /**
       * An expression by which the time of the message data might be determined.
       *
       * This can be the name of a timestamp field or a SQL expression that is used to derive the
       * time the message data was generated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html#cfn-iotanalytics-dataset-deltatime-timeexpression)
       */
      override fun timeExpression(): String = unwrap(this).getTimeExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeltaTimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty):
          DeltaTimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeltaTimeProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty
    }
  }

  /**
   * Configuration information for delivery of dataset contents to Amazon Simple Storage Service
   * (Amazon S3).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * S3DestinationConfigurationProperty s3DestinationConfigurationProperty =
   * S3DestinationConfigurationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .glueConfiguration(GlueConfigurationProperty.builder()
   * .databaseName("databaseName")
   * .tableName("tableName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html)
   */
  public interface S3DestinationConfigurationProperty {
    /**
     * The name of the S3 bucket to which dataset contents are delivered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html#cfn-iotanalytics-dataset-s3destinationconfiguration-bucket)
     */
    public fun bucket(): String

    /**
     * Configuration information for coordination with AWS Glue , a fully managed extract, transform
     * and load (ETL) service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html#cfn-iotanalytics-dataset-s3destinationconfiguration-glueconfiguration)
     */
    public fun glueConfiguration(): Any? = unwrap(this).getGlueConfiguration()

    /**
     * The key of the dataset contents object in an S3 bucket.
     *
     * Each object has a key that is a unique identifier. Each object has exactly one key.
     *
     * You can create a unique key with the following options:
     *
     * * Use `!{iotanalytics:scheduleTime}` to insert the time of a scheduled SQL query run.
     * * Use `!{iotanalytics:versionId}` to insert a unique hash that identifies a dataset content.
     * * Use `!{iotanalytics:creationTime}` to insert the creation time of a dataset content.
     *
     * The following example creates a unique key for a CSV file:
     * `dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv`
     *
     *
     * If you don't use `!{iotanalytics:versionId}` to specify the key, you might get duplicate
     * keys. For example, you might have two dataset contents with the same `scheduleTime` but
     * different `versionId` s. This means that one dataset content overwrites the other.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html#cfn-iotanalytics-dataset-s3destinationconfiguration-key)
     */
    public fun key(): String

    /**
     * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3
     * and AWS Glue resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html#cfn-iotanalytics-dataset-s3destinationconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [S3DestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the S3 bucket to which dataset contents are delivered. 
       */
      public fun bucket(bucket: String)

      /**
       * @param glueConfiguration Configuration information for coordination with AWS Glue , a fully
       * managed extract, transform and load (ETL) service.
       */
      public fun glueConfiguration(glueConfiguration: IResolvable)

      /**
       * @param glueConfiguration Configuration information for coordination with AWS Glue , a fully
       * managed extract, transform and load (ETL) service.
       */
      public fun glueConfiguration(glueConfiguration: GlueConfigurationProperty)

      /**
       * @param glueConfiguration Configuration information for coordination with AWS Glue , a fully
       * managed extract, transform and load (ETL) service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d986fc3b747807a579f2262617d81f0c53cbf1ab91bc6b0b387b4db40f60623")
      public fun glueConfiguration(glueConfiguration: GlueConfigurationProperty.Builder.() -> Unit)

      /**
       * @param key The key of the dataset contents object in an S3 bucket. 
       * Each object has a key that is a unique identifier. Each object has exactly one key.
       *
       * You can create a unique key with the following options:
       *
       * * Use `!{iotanalytics:scheduleTime}` to insert the time of a scheduled SQL query run.
       * * Use `!{iotanalytics:versionId}` to insert a unique hash that identifies a dataset
       * content.
       * * Use `!{iotanalytics:creationTime}` to insert the creation time of a dataset content.
       *
       * The following example creates a unique key for a CSV file:
       * `dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv`
       *
       *
       * If you don't use `!{iotanalytics:versionId}` to specify the key, you might get duplicate
       * keys. For example, you might have two dataset contents with the same `scheduleTime` but
       * different `versionId` s. This means that one dataset content overwrites the other.
       */
      public fun key(key: String)

      /**
       * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to interact
       * with your Amazon S3 and AWS Glue resources. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty.builder()

      /**
       * @param bucket The name of the S3 bucket to which dataset contents are delivered. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param glueConfiguration Configuration information for coordination with AWS Glue , a fully
       * managed extract, transform and load (ETL) service.
       */
      override fun glueConfiguration(glueConfiguration: IResolvable) {
        cdkBuilder.glueConfiguration(glueConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param glueConfiguration Configuration information for coordination with AWS Glue , a fully
       * managed extract, transform and load (ETL) service.
       */
      override fun glueConfiguration(glueConfiguration: GlueConfigurationProperty) {
        cdkBuilder.glueConfiguration(glueConfiguration.let(GlueConfigurationProperty::unwrap))
      }

      /**
       * @param glueConfiguration Configuration information for coordination with AWS Glue , a fully
       * managed extract, transform and load (ETL) service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d986fc3b747807a579f2262617d81f0c53cbf1ab91bc6b0b387b4db40f60623")
      override
          fun glueConfiguration(glueConfiguration: GlueConfigurationProperty.Builder.() -> Unit):
          Unit = glueConfiguration(GlueConfigurationProperty(glueConfiguration))

      /**
       * @param key The key of the dataset contents object in an S3 bucket. 
       * Each object has a key that is a unique identifier. Each object has exactly one key.
       *
       * You can create a unique key with the following options:
       *
       * * Use `!{iotanalytics:scheduleTime}` to insert the time of a scheduled SQL query run.
       * * Use `!{iotanalytics:versionId}` to insert a unique hash that identifies a dataset
       * content.
       * * Use `!{iotanalytics:creationTime}` to insert the creation time of a dataset content.
       *
       * The following example creates a unique key for a CSV file:
       * `dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv`
       *
       *
       * If you don't use `!{iotanalytics:versionId}` to specify the key, you might get duplicate
       * keys. For example, you might have two dataset contents with the same `scheduleTime` but
       * different `versionId` s. This means that one dataset content overwrites the other.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to interact
       * with your Amazon S3 and AWS Glue resources. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty,
    ) : CdkObject(cdkObject), S3DestinationConfigurationProperty {
      /**
       * The name of the S3 bucket to which dataset contents are delivered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html#cfn-iotanalytics-dataset-s3destinationconfiguration-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * Configuration information for coordination with AWS Glue , a fully managed extract,
       * transform and load (ETL) service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html#cfn-iotanalytics-dataset-s3destinationconfiguration-glueconfiguration)
       */
      override fun glueConfiguration(): Any? = unwrap(this).getGlueConfiguration()

      /**
       * The key of the dataset contents object in an S3 bucket.
       *
       * Each object has a key that is a unique identifier. Each object has exactly one key.
       *
       * You can create a unique key with the following options:
       *
       * * Use `!{iotanalytics:scheduleTime}` to insert the time of a scheduled SQL query run.
       * * Use `!{iotanalytics:versionId}` to insert a unique hash that identifies a dataset
       * content.
       * * Use `!{iotanalytics:creationTime}` to insert the creation time of a dataset content.
       *
       * The following example creates a unique key for a CSV file:
       * `dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv`
       *
       *
       * If you don't use `!{iotanalytics:versionId}` to specify the key, you might get duplicate
       * keys. For example, you might have two dataset contents with the same `scheduleTime` but
       * different `versionId` s. This means that one dataset content overwrites the other.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html#cfn-iotanalytics-dataset-s3destinationconfiguration-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon
       * S3 and AWS Glue resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html#cfn-iotanalytics-dataset-s3destinationconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty):
          S3DestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty
    }
  }

  /**
   * The value of the variable as a structure that specifies an output file URI.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * OutputFileUriValueProperty outputFileUriValueProperty = OutputFileUriValueProperty.builder()
   * .fileName("fileName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-outputfileurivalue.html)
   */
  public interface OutputFileUriValueProperty {
    /**
     * The URI of the location where dataset contents are stored, usually the URI of a file in an S3
     * bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-outputfileurivalue.html#cfn-iotanalytics-dataset-outputfileurivalue-filename)
     */
    public fun fileName(): String

    /**
     * A builder for [OutputFileUriValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileName The URI of the location where dataset contents are stored, usually the URI
       * of a file in an S3 bucket. 
       */
      public fun fileName(fileName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty.builder()

      /**
       * @param fileName The URI of the location where dataset contents are stored, usually the URI
       * of a file in an S3 bucket. 
       */
      override fun fileName(fileName: String) {
        cdkBuilder.fileName(fileName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty,
    ) : CdkObject(cdkObject), OutputFileUriValueProperty {
      /**
       * The URI of the location where dataset contents are stored, usually the URI of a file in an
       * S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-outputfileurivalue.html#cfn-iotanalytics-dataset-outputfileurivalue-filename)
       */
      override fun fileName(): String = unwrap(this).getFileName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputFileUriValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty):
          OutputFileUriValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputFileUriValueProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty
    }
  }

  /**
   * Information needed to run the "containerAction" to produce data set contents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * ContainerActionProperty containerActionProperty = ContainerActionProperty.builder()
   * .executionRoleArn("executionRoleArn")
   * .image("image")
   * .resourceConfiguration(ResourceConfigurationProperty.builder()
   * .computeType("computeType")
   * .volumeSizeInGb(123)
   * .build())
   * // the properties below are optional
   * .variables(List.of(VariableProperty.builder()
   * .variableName("variableName")
   * // the properties below are optional
   * .datasetContentVersionValue(DatasetContentVersionValueProperty.builder()
   * .datasetName("datasetName")
   * .build())
   * .doubleValue(123)
   * .outputFileUriValue(OutputFileUriValueProperty.builder()
   * .fileName("fileName")
   * .build())
   * .stringValue("stringValue")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html)
   */
  public interface ContainerActionProperty {
    /**
     * The ARN of the role which gives permission to the system to access needed resources in order
     * to run the "containerAction".
     *
     * This includes, at minimum, permission to retrieve the data set contents which are the input
     * to the containerized application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html#cfn-iotanalytics-dataset-containeraction-executionrolearn)
     */
    public fun executionRoleArn(): String

    /**
     * The ARN of the Docker container stored in your account.
     *
     * The Docker container contains an application and needed support libraries and is used to
     * generate data set contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html#cfn-iotanalytics-dataset-containeraction-image)
     */
    public fun image(): String

    /**
     * Configuration of the resource which executes the "containerAction".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html#cfn-iotanalytics-dataset-containeraction-resourceconfiguration)
     */
    public fun resourceConfiguration(): Any

    /**
     * The values of variables used within the context of the execution of the containerized
     * application (basically, parameters passed to the application).
     *
     * Each variable must have a name and a value given by one of "stringValue",
     * "datasetContentVersionValue", or "outputFileUriValue".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html#cfn-iotanalytics-dataset-containeraction-variables)
     */
    public fun variables(): Any? = unwrap(this).getVariables()

    /**
     * A builder for [ContainerActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param executionRoleArn The ARN of the role which gives permission to the system to access
       * needed resources in order to run the "containerAction". 
       * This includes, at minimum, permission to retrieve the data set contents which are the input
       * to the containerized application.
       */
      public fun executionRoleArn(executionRoleArn: String)

      /**
       * @param image The ARN of the Docker container stored in your account. 
       * The Docker container contains an application and needed support libraries and is used to
       * generate data set contents.
       */
      public fun image(image: String)

      /**
       * @param resourceConfiguration Configuration of the resource which executes the
       * "containerAction". 
       */
      public fun resourceConfiguration(resourceConfiguration: IResolvable)

      /**
       * @param resourceConfiguration Configuration of the resource which executes the
       * "containerAction". 
       */
      public fun resourceConfiguration(resourceConfiguration: ResourceConfigurationProperty)

      /**
       * @param resourceConfiguration Configuration of the resource which executes the
       * "containerAction". 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f94ac89e4da5cf7280e11af6d60fab30c7a8ca77c06c00fbaff39e36613543b3")
      public
          fun resourceConfiguration(resourceConfiguration: ResourceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param variables The values of variables used within the context of the execution of the
       * containerized application (basically, parameters passed to the application).
       * Each variable must have a name and a value given by one of "stringValue",
       * "datasetContentVersionValue", or "outputFileUriValue".
       */
      public fun variables(variables: IResolvable)

      /**
       * @param variables The values of variables used within the context of the execution of the
       * containerized application (basically, parameters passed to the application).
       * Each variable must have a name and a value given by one of "stringValue",
       * "datasetContentVersionValue", or "outputFileUriValue".
       */
      public fun variables(variables: List<Any>)

      /**
       * @param variables The values of variables used within the context of the execution of the
       * containerized application (basically, parameters passed to the application).
       * Each variable must have a name and a value given by one of "stringValue",
       * "datasetContentVersionValue", or "outputFileUriValue".
       */
      public fun variables(vararg variables: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.builder()

      /**
       * @param executionRoleArn The ARN of the role which gives permission to the system to access
       * needed resources in order to run the "containerAction". 
       * This includes, at minimum, permission to retrieve the data set contents which are the input
       * to the containerized application.
       */
      override fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
      }

      /**
       * @param image The ARN of the Docker container stored in your account. 
       * The Docker container contains an application and needed support libraries and is used to
       * generate data set contents.
       */
      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      /**
       * @param resourceConfiguration Configuration of the resource which executes the
       * "containerAction". 
       */
      override fun resourceConfiguration(resourceConfiguration: IResolvable) {
        cdkBuilder.resourceConfiguration(resourceConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param resourceConfiguration Configuration of the resource which executes the
       * "containerAction". 
       */
      override fun resourceConfiguration(resourceConfiguration: ResourceConfigurationProperty) {
        cdkBuilder.resourceConfiguration(resourceConfiguration.let(ResourceConfigurationProperty::unwrap))
      }

      /**
       * @param resourceConfiguration Configuration of the resource which executes the
       * "containerAction". 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f94ac89e4da5cf7280e11af6d60fab30c7a8ca77c06c00fbaff39e36613543b3")
      override
          fun resourceConfiguration(resourceConfiguration: ResourceConfigurationProperty.Builder.() -> Unit):
          Unit = resourceConfiguration(ResourceConfigurationProperty(resourceConfiguration))

      /**
       * @param variables The values of variables used within the context of the execution of the
       * containerized application (basically, parameters passed to the application).
       * Each variable must have a name and a value given by one of "stringValue",
       * "datasetContentVersionValue", or "outputFileUriValue".
       */
      override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable::unwrap))
      }

      /**
       * @param variables The values of variables used within the context of the execution of the
       * containerized application (basically, parameters passed to the application).
       * Each variable must have a name and a value given by one of "stringValue",
       * "datasetContentVersionValue", or "outputFileUriValue".
       */
      override fun variables(variables: List<Any>) {
        cdkBuilder.variables(variables)
      }

      /**
       * @param variables The values of variables used within the context of the execution of the
       * containerized application (basically, parameters passed to the application).
       * Each variable must have a name and a value given by one of "stringValue",
       * "datasetContentVersionValue", or "outputFileUriValue".
       */
      override fun variables(vararg variables: Any): Unit = variables(variables.toList())

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty,
    ) : CdkObject(cdkObject), ContainerActionProperty {
      /**
       * The ARN of the role which gives permission to the system to access needed resources in
       * order to run the "containerAction".
       *
       * This includes, at minimum, permission to retrieve the data set contents which are the input
       * to the containerized application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html#cfn-iotanalytics-dataset-containeraction-executionrolearn)
       */
      override fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

      /**
       * The ARN of the Docker container stored in your account.
       *
       * The Docker container contains an application and needed support libraries and is used to
       * generate data set contents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html#cfn-iotanalytics-dataset-containeraction-image)
       */
      override fun image(): String = unwrap(this).getImage()

      /**
       * Configuration of the resource which executes the "containerAction".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html#cfn-iotanalytics-dataset-containeraction-resourceconfiguration)
       */
      override fun resourceConfiguration(): Any = unwrap(this).getResourceConfiguration()

      /**
       * The values of variables used within the context of the execution of the containerized
       * application (basically, parameters passed to the application).
       *
       * Each variable must have a name and a value given by one of "stringValue",
       * "datasetContentVersionValue", or "outputFileUriValue".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html#cfn-iotanalytics-dataset-containeraction-variables)
       */
      override fun variables(): Any? = unwrap(this).getVariables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty):
          ContainerActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerActionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty
    }
  }

  /**
   * The dataset whose latest contents are used as input to the notebook or application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * DatasetContentVersionValueProperty datasetContentVersionValueProperty =
   * DatasetContentVersionValueProperty.builder()
   * .datasetName("datasetName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentversionvalue.html)
   */
  public interface DatasetContentVersionValueProperty {
    /**
     * The name of the dataset whose latest contents are used as input to the notebook or
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentversionvalue.html#cfn-iotanalytics-dataset-datasetcontentversionvalue-datasetname)
     */
    public fun datasetName(): String

    /**
     * A builder for [DatasetContentVersionValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param datasetName The name of the dataset whose latest contents are used as input to the
       * notebook or application. 
       */
      public fun datasetName(datasetName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty.builder()

      /**
       * @param datasetName The name of the dataset whose latest contents are used as input to the
       * notebook or application. 
       */
      override fun datasetName(datasetName: String) {
        cdkBuilder.datasetName(datasetName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty,
    ) : CdkObject(cdkObject), DatasetContentVersionValueProperty {
      /**
       * The name of the dataset whose latest contents are used as input to the notebook or
       * application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentversionvalue.html#cfn-iotanalytics-dataset-datasetcontentversionvalue-datasetname)
       */
      override fun datasetName(): String = unwrap(this).getDatasetName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DatasetContentVersionValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty):
          DatasetContentVersionValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetContentVersionValueProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty
    }
  }

  /**
   * Information which is used to filter message data, to segregate it according to the time frame
   * in which it arrives.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * FilterProperty filterProperty = FilterProperty.builder()
   * .deltaTime(DeltaTimeProperty.builder()
   * .offsetSeconds(123)
   * .timeExpression("timeExpression")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html)
   */
  public interface FilterProperty {
    /**
     * Used to limit data to that which has arrived since the last execution of the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html#cfn-iotanalytics-dataset-filter-deltatime)
     */
    public fun deltaTime(): Any? = unwrap(this).getDeltaTime()

    /**
     * A builder for [FilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deltaTime Used to limit data to that which has arrived since the last execution of
       * the action.
       */
      public fun deltaTime(deltaTime: IResolvable)

      /**
       * @param deltaTime Used to limit data to that which has arrived since the last execution of
       * the action.
       */
      public fun deltaTime(deltaTime: DeltaTimeProperty)

      /**
       * @param deltaTime Used to limit data to that which has arrived since the last execution of
       * the action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("292b1a57aa57aee4937f19c951a48b9710aa5a181672b7d5d6d32846b1e2af24")
      public fun deltaTime(deltaTime: DeltaTimeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty.builder()

      /**
       * @param deltaTime Used to limit data to that which has arrived since the last execution of
       * the action.
       */
      override fun deltaTime(deltaTime: IResolvable) {
        cdkBuilder.deltaTime(deltaTime.let(IResolvable::unwrap))
      }

      /**
       * @param deltaTime Used to limit data to that which has arrived since the last execution of
       * the action.
       */
      override fun deltaTime(deltaTime: DeltaTimeProperty) {
        cdkBuilder.deltaTime(deltaTime.let(DeltaTimeProperty::unwrap))
      }

      /**
       * @param deltaTime Used to limit data to that which has arrived since the last execution of
       * the action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("292b1a57aa57aee4937f19c951a48b9710aa5a181672b7d5d6d32846b1e2af24")
      override fun deltaTime(deltaTime: DeltaTimeProperty.Builder.() -> Unit): Unit =
          deltaTime(DeltaTimeProperty(deltaTime))

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      /**
       * Used to limit data to that which has arrived since the last execution of the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html#cfn-iotanalytics-dataset-filter-deltatime)
       */
      override fun deltaTime(): Any? = unwrap(this).getDeltaTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty
    }
  }

  /**
   * A structure that contains the configuration information of a delta time session window.
   *
   * [`DeltaTime`](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
   * specifies a time interval. You can use `DeltaTime` to create dataset contents with data that has
   * arrived in the data store since the last execution. For an example of `DeltaTime` , see [Creating
   * a SQL dataset with a delta window
   * (CLI)](https://docs.aws.amazon.com/iotanalytics/latest/userguide/automate-create-dataset.html#automate-example6)
   * in the *AWS IoT Analytics User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * DeltaTimeSessionWindowConfigurationProperty deltaTimeSessionWindowConfigurationProperty =
   * DeltaTimeSessionWindowConfigurationProperty.builder()
   * .timeoutInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatimesessionwindowconfiguration.html)
   */
  public interface DeltaTimeSessionWindowConfigurationProperty {
    /**
     * A time interval.
     *
     * You can use `timeoutInMinutes` so that AWS IoT Analytics can batch up late data notifications
     * that have been generated since the last execution. AWS IoT Analytics sends one batch of
     * notifications to Amazon CloudWatch Events at one time.
     *
     * For more information about how to write a timestamp expression, see [Date and Time Functions
     * and
     * Operators](https://docs.aws.amazon.com/https://prestodb.io/docs/current/functions/datetime.html)
     * , in the *Presto 0.172 Documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatimesessionwindowconfiguration.html#cfn-iotanalytics-dataset-deltatimesessionwindowconfiguration-timeoutinminutes)
     */
    public fun timeoutInMinutes(): Number

    /**
     * A builder for [DeltaTimeSessionWindowConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param timeoutInMinutes A time interval. 
       * You can use `timeoutInMinutes` so that AWS IoT Analytics can batch up late data
       * notifications that have been generated since the last execution. AWS IoT Analytics sends one
       * batch of notifications to Amazon CloudWatch Events at one time.
       *
       * For more information about how to write a timestamp expression, see [Date and Time
       * Functions and
       * Operators](https://docs.aws.amazon.com/https://prestodb.io/docs/current/functions/datetime.html)
       * , in the *Presto 0.172 Documentation* .
       */
      public fun timeoutInMinutes(timeoutInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty.builder()

      /**
       * @param timeoutInMinutes A time interval. 
       * You can use `timeoutInMinutes` so that AWS IoT Analytics can batch up late data
       * notifications that have been generated since the last execution. AWS IoT Analytics sends one
       * batch of notifications to Amazon CloudWatch Events at one time.
       *
       * For more information about how to write a timestamp expression, see [Date and Time
       * Functions and
       * Operators](https://docs.aws.amazon.com/https://prestodb.io/docs/current/functions/datetime.html)
       * , in the *Presto 0.172 Documentation* .
       */
      override fun timeoutInMinutes(timeoutInMinutes: Number) {
        cdkBuilder.timeoutInMinutes(timeoutInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty,
    ) : CdkObject(cdkObject), DeltaTimeSessionWindowConfigurationProperty {
      /**
       * A time interval.
       *
       * You can use `timeoutInMinutes` so that AWS IoT Analytics can batch up late data
       * notifications that have been generated since the last execution. AWS IoT Analytics sends one
       * batch of notifications to Amazon CloudWatch Events at one time.
       *
       * For more information about how to write a timestamp expression, see [Date and Time
       * Functions and
       * Operators](https://docs.aws.amazon.com/https://prestodb.io/docs/current/functions/datetime.html)
       * , in the *Presto 0.172 Documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatimesessionwindowconfiguration.html#cfn-iotanalytics-dataset-deltatimesessionwindowconfiguration-timeoutinminutes)
       */
      override fun timeoutInMinutes(): Number = unwrap(this).getTimeoutInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DeltaTimeSessionWindowConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty):
          DeltaTimeSessionWindowConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeltaTimeSessionWindowConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty
    }
  }

  /**
   * The destination to which dataset contents are delivered.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * DatasetContentDeliveryRuleDestinationProperty datasetContentDeliveryRuleDestinationProperty =
   * DatasetContentDeliveryRuleDestinationProperty.builder()
   * .iotEventsDestinationConfiguration(IotEventsDestinationConfigurationProperty.builder()
   * .inputName("inputName")
   * .roleArn("roleArn")
   * .build())
   * .s3DestinationConfiguration(S3DestinationConfigurationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .glueConfiguration(GlueConfigurationProperty.builder()
   * .databaseName("databaseName")
   * .tableName("tableName")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryruledestination.html)
   */
  public interface DatasetContentDeliveryRuleDestinationProperty {
    /**
     * Configuration information for delivery of dataset contents to AWS IoT Events .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryruledestination.html#cfn-iotanalytics-dataset-datasetcontentdeliveryruledestination-ioteventsdestinationconfiguration)
     */
    public fun iotEventsDestinationConfiguration(): Any? =
        unwrap(this).getIotEventsDestinationConfiguration()

    /**
     * Configuration information for delivery of dataset contents to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryruledestination.html#cfn-iotanalytics-dataset-datasetcontentdeliveryruledestination-s3destinationconfiguration)
     */
    public fun s3DestinationConfiguration(): Any? = unwrap(this).getS3DestinationConfiguration()

    /**
     * A builder for [DatasetContentDeliveryRuleDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iotEventsDestinationConfiguration Configuration information for delivery of dataset
       * contents to AWS IoT Events .
       */
      public fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IResolvable)

      /**
       * @param iotEventsDestinationConfiguration Configuration information for delivery of dataset
       * contents to AWS IoT Events .
       */
      public
          fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IotEventsDestinationConfigurationProperty)

      /**
       * @param iotEventsDestinationConfiguration Configuration information for delivery of dataset
       * contents to AWS IoT Events .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a18c9c3ed206c1322a375f674aebf05dc3a1a936a9a9e2543dea8eb19a30fed1")
      public
          fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IotEventsDestinationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param s3DestinationConfiguration Configuration information for delivery of dataset
       * contents to Amazon S3.
       */
      public fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable)

      /**
       * @param s3DestinationConfiguration Configuration information for delivery of dataset
       * contents to Amazon S3.
       */
      public
          fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty)

      /**
       * @param s3DestinationConfiguration Configuration information for delivery of dataset
       * contents to Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4deed4a0e02afd5fc0a753305e969501d27a4a93446b9b8f63aed29f905facd6")
      public
          fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty.builder()

      /**
       * @param iotEventsDestinationConfiguration Configuration information for delivery of dataset
       * contents to AWS IoT Events .
       */
      override
          fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IResolvable) {
        cdkBuilder.iotEventsDestinationConfiguration(iotEventsDestinationConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param iotEventsDestinationConfiguration Configuration information for delivery of dataset
       * contents to AWS IoT Events .
       */
      override
          fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IotEventsDestinationConfigurationProperty) {
        cdkBuilder.iotEventsDestinationConfiguration(iotEventsDestinationConfiguration.let(IotEventsDestinationConfigurationProperty::unwrap))
      }

      /**
       * @param iotEventsDestinationConfiguration Configuration information for delivery of dataset
       * contents to AWS IoT Events .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a18c9c3ed206c1322a375f674aebf05dc3a1a936a9a9e2543dea8eb19a30fed1")
      override
          fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IotEventsDestinationConfigurationProperty.Builder.() -> Unit):
          Unit =
          iotEventsDestinationConfiguration(IotEventsDestinationConfigurationProperty(iotEventsDestinationConfiguration))

      /**
       * @param s3DestinationConfiguration Configuration information for delivery of dataset
       * contents to Amazon S3.
       */
      override fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable) {
        cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param s3DestinationConfiguration Configuration information for delivery of dataset
       * contents to Amazon S3.
       */
      override
          fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration.let(S3DestinationConfigurationProperty::unwrap))
      }

      /**
       * @param s3DestinationConfiguration Configuration information for delivery of dataset
       * contents to Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4deed4a0e02afd5fc0a753305e969501d27a4a93446b9b8f63aed29f905facd6")
      override
          fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit =
          s3DestinationConfiguration(S3DestinationConfigurationProperty(s3DestinationConfiguration))

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty,
    ) : CdkObject(cdkObject), DatasetContentDeliveryRuleDestinationProperty {
      /**
       * Configuration information for delivery of dataset contents to AWS IoT Events .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryruledestination.html#cfn-iotanalytics-dataset-datasetcontentdeliveryruledestination-ioteventsdestinationconfiguration)
       */
      override fun iotEventsDestinationConfiguration(): Any? =
          unwrap(this).getIotEventsDestinationConfiguration()

      /**
       * Configuration information for delivery of dataset contents to Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryruledestination.html#cfn-iotanalytics-dataset-datasetcontentdeliveryruledestination-s3destinationconfiguration)
       */
      override fun s3DestinationConfiguration(): Any? = unwrap(this).getS3DestinationConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DatasetContentDeliveryRuleDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty):
          DatasetContentDeliveryRuleDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetContentDeliveryRuleDestinationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty
    }
  }

  /**
   * The configuration of the resource used to execute the `containerAction` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * ResourceConfigurationProperty resourceConfigurationProperty =
   * ResourceConfigurationProperty.builder()
   * .computeType("computeType")
   * .volumeSizeInGb(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html)
   */
  public interface ResourceConfigurationProperty {
    /**
     * The type of the compute resource used to execute the `containerAction` .
     *
     * Possible values are: `ACU_1` (vCPU=4, memory=16 GiB) or `ACU_2` (vCPU=8, memory=32 GiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html#cfn-iotanalytics-dataset-resourceconfiguration-computetype)
     */
    public fun computeType(): String

    /**
     * The size, in GB, of the persistent storage available to the resource instance used to execute
     * the `containerAction` (min: 1, max: 50).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html#cfn-iotanalytics-dataset-resourceconfiguration-volumesizeingb)
     */
    public fun volumeSizeInGb(): Number

    /**
     * A builder for [ResourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param computeType The type of the compute resource used to execute the `containerAction` .
       * 
       * Possible values are: `ACU_1` (vCPU=4, memory=16 GiB) or `ACU_2` (vCPU=8, memory=32 GiB).
       */
      public fun computeType(computeType: String)

      /**
       * @param volumeSizeInGb The size, in GB, of the persistent storage available to the resource
       * instance used to execute the `containerAction` (min: 1, max: 50). 
       */
      public fun volumeSizeInGb(volumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.builder()

      /**
       * @param computeType The type of the compute resource used to execute the `containerAction` .
       * 
       * Possible values are: `ACU_1` (vCPU=4, memory=16 GiB) or `ACU_2` (vCPU=8, memory=32 GiB).
       */
      override fun computeType(computeType: String) {
        cdkBuilder.computeType(computeType)
      }

      /**
       * @param volumeSizeInGb The size, in GB, of the persistent storage available to the resource
       * instance used to execute the `containerAction` (min: 1, max: 50). 
       */
      override fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty,
    ) : CdkObject(cdkObject), ResourceConfigurationProperty {
      /**
       * The type of the compute resource used to execute the `containerAction` .
       *
       * Possible values are: `ACU_1` (vCPU=4, memory=16 GiB) or `ACU_2` (vCPU=8, memory=32 GiB).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html#cfn-iotanalytics-dataset-resourceconfiguration-computetype)
       */
      override fun computeType(): String = unwrap(this).getComputeType()

      /**
       * The size, in GB, of the persistent storage available to the resource instance used to
       * execute the `containerAction` (min: 1, max: 50).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html#cfn-iotanalytics-dataset-resourceconfiguration-volumesizeingb)
       */
      override fun volumeSizeInGb(): Number = unwrap(this).getVolumeSizeInGb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty):
          ResourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty
    }
  }

  /**
   * A structure that contains the name and configuration information of a late data rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * LateDataRuleProperty lateDataRuleProperty = LateDataRuleProperty.builder()
   * .ruleConfiguration(LateDataRuleConfigurationProperty.builder()
   * .deltaTimeSessionWindowConfiguration(DeltaTimeSessionWindowConfigurationProperty.builder()
   * .timeoutInMinutes(123)
   * .build())
   * .build())
   * // the properties below are optional
   * .ruleName("ruleName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-latedatarule.html)
   */
  public interface LateDataRuleProperty {
    /**
     * The information needed to configure the late data rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-latedatarule.html#cfn-iotanalytics-dataset-latedatarule-ruleconfiguration)
     */
    public fun ruleConfiguration(): Any

    /**
     * The name of the late data rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-latedatarule.html#cfn-iotanalytics-dataset-latedatarule-rulename)
     */
    public fun ruleName(): String? = unwrap(this).getRuleName()

    /**
     * A builder for [LateDataRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ruleConfiguration The information needed to configure the late data rule. 
       */
      public fun ruleConfiguration(ruleConfiguration: IResolvable)

      /**
       * @param ruleConfiguration The information needed to configure the late data rule. 
       */
      public fun ruleConfiguration(ruleConfiguration: LateDataRuleConfigurationProperty)

      /**
       * @param ruleConfiguration The information needed to configure the late data rule. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("463e70cb7b75495f7fc174c3f8820d790710441ef27883c96a823c3a9562ddde")
      public
          fun ruleConfiguration(ruleConfiguration: LateDataRuleConfigurationProperty.Builder.() -> Unit)

      /**
       * @param ruleName The name of the late data rule.
       */
      public fun ruleName(ruleName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty.builder()

      /**
       * @param ruleConfiguration The information needed to configure the late data rule. 
       */
      override fun ruleConfiguration(ruleConfiguration: IResolvable) {
        cdkBuilder.ruleConfiguration(ruleConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param ruleConfiguration The information needed to configure the late data rule. 
       */
      override fun ruleConfiguration(ruleConfiguration: LateDataRuleConfigurationProperty) {
        cdkBuilder.ruleConfiguration(ruleConfiguration.let(LateDataRuleConfigurationProperty::unwrap))
      }

      /**
       * @param ruleConfiguration The information needed to configure the late data rule. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("463e70cb7b75495f7fc174c3f8820d790710441ef27883c96a823c3a9562ddde")
      override
          fun ruleConfiguration(ruleConfiguration: LateDataRuleConfigurationProperty.Builder.() -> Unit):
          Unit = ruleConfiguration(LateDataRuleConfigurationProperty(ruleConfiguration))

      /**
       * @param ruleName The name of the late data rule.
       */
      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty,
    ) : CdkObject(cdkObject), LateDataRuleProperty {
      /**
       * The information needed to configure the late data rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-latedatarule.html#cfn-iotanalytics-dataset-latedatarule-ruleconfiguration)
       */
      override fun ruleConfiguration(): Any = unwrap(this).getRuleConfiguration()

      /**
       * The name of the late data rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-latedatarule.html#cfn-iotanalytics-dataset-latedatarule-rulename)
       */
      override fun ruleName(): String? = unwrap(this).getRuleName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LateDataRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty):
          LateDataRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LateDataRuleProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty
    }
  }

  /**
   * The "DatasetTrigger" that specifies when the data set is automatically updated.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * TriggerProperty triggerProperty = TriggerProperty.builder()
   * .schedule(ScheduleProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * .build())
   * .triggeringDataset(TriggeringDatasetProperty.builder()
   * .datasetName("datasetName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger.html)
   */
  public interface TriggerProperty {
    /**
     * The "Schedule" when the trigger is initiated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger.html#cfn-iotanalytics-dataset-trigger-schedule)
     */
    public fun schedule(): Any? = unwrap(this).getSchedule()

    /**
     * Information about the data set whose content generation triggers the new data set content
     * generation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger.html#cfn-iotanalytics-dataset-trigger-triggeringdataset)
     */
    public fun triggeringDataset(): Any? = unwrap(this).getTriggeringDataset()

    /**
     * A builder for [TriggerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param schedule The "Schedule" when the trigger is initiated.
       */
      public fun schedule(schedule: IResolvable)

      /**
       * @param schedule The "Schedule" when the trigger is initiated.
       */
      public fun schedule(schedule: ScheduleProperty)

      /**
       * @param schedule The "Schedule" when the trigger is initiated.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0282a88062b57f5491e350a63ffc7c391ab9e243980fdc18451e57d3916020d8")
      public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

      /**
       * @param triggeringDataset Information about the data set whose content generation triggers
       * the new data set content generation.
       */
      public fun triggeringDataset(triggeringDataset: IResolvable)

      /**
       * @param triggeringDataset Information about the data set whose content generation triggers
       * the new data set content generation.
       */
      public fun triggeringDataset(triggeringDataset: TriggeringDatasetProperty)

      /**
       * @param triggeringDataset Information about the data set whose content generation triggers
       * the new data set content generation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51aea310296e38b3b60aeb893a2a47e782046054bf5e23a5360066b529afdf0d")
      public fun triggeringDataset(triggeringDataset: TriggeringDatasetProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty.builder()

      /**
       * @param schedule The "Schedule" when the trigger is initiated.
       */
      override fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
      }

      /**
       * @param schedule The "Schedule" when the trigger is initiated.
       */
      override fun schedule(schedule: ScheduleProperty) {
        cdkBuilder.schedule(schedule.let(ScheduleProperty::unwrap))
      }

      /**
       * @param schedule The "Schedule" when the trigger is initiated.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0282a88062b57f5491e350a63ffc7c391ab9e243980fdc18451e57d3916020d8")
      override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
          schedule(ScheduleProperty(schedule))

      /**
       * @param triggeringDataset Information about the data set whose content generation triggers
       * the new data set content generation.
       */
      override fun triggeringDataset(triggeringDataset: IResolvable) {
        cdkBuilder.triggeringDataset(triggeringDataset.let(IResolvable::unwrap))
      }

      /**
       * @param triggeringDataset Information about the data set whose content generation triggers
       * the new data set content generation.
       */
      override fun triggeringDataset(triggeringDataset: TriggeringDatasetProperty) {
        cdkBuilder.triggeringDataset(triggeringDataset.let(TriggeringDatasetProperty::unwrap))
      }

      /**
       * @param triggeringDataset Information about the data set whose content generation triggers
       * the new data set content generation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51aea310296e38b3b60aeb893a2a47e782046054bf5e23a5360066b529afdf0d")
      override
          fun triggeringDataset(triggeringDataset: TriggeringDatasetProperty.Builder.() -> Unit):
          Unit = triggeringDataset(TriggeringDatasetProperty(triggeringDataset))

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty,
    ) : CdkObject(cdkObject), TriggerProperty {
      /**
       * The "Schedule" when the trigger is initiated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger.html#cfn-iotanalytics-dataset-trigger-schedule)
       */
      override fun schedule(): Any? = unwrap(this).getSchedule()

      /**
       * Information about the data set whose content generation triggers the new data set content
       * generation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger.html#cfn-iotanalytics-dataset-trigger-triggeringdataset)
       */
      override fun triggeringDataset(): Any? = unwrap(this).getTriggeringDataset()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TriggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty):
          TriggerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TriggerProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty
    }
  }

  /**
   * When dataset contents are created, they are delivered to destination specified here.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * DatasetContentDeliveryRuleProperty datasetContentDeliveryRuleProperty =
   * DatasetContentDeliveryRuleProperty.builder()
   * .destination(DatasetContentDeliveryRuleDestinationProperty.builder()
   * .iotEventsDestinationConfiguration(IotEventsDestinationConfigurationProperty.builder()
   * .inputName("inputName")
   * .roleArn("roleArn")
   * .build())
   * .s3DestinationConfiguration(S3DestinationConfigurationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .glueConfiguration(GlueConfigurationProperty.builder()
   * .databaseName("databaseName")
   * .tableName("tableName")
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .entryName("entryName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryrule.html)
   */
  public interface DatasetContentDeliveryRuleProperty {
    /**
     * The destination to which dataset contents are delivered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryrule.html#cfn-iotanalytics-dataset-datasetcontentdeliveryrule-destination)
     */
    public fun destination(): Any

    /**
     * The name of the dataset content delivery rules entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryrule.html#cfn-iotanalytics-dataset-datasetcontentdeliveryrule-entryname)
     */
    public fun entryName(): String? = unwrap(this).getEntryName()

    /**
     * A builder for [DatasetContentDeliveryRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination The destination to which dataset contents are delivered. 
       */
      public fun destination(destination: IResolvable)

      /**
       * @param destination The destination to which dataset contents are delivered. 
       */
      public fun destination(destination: DatasetContentDeliveryRuleDestinationProperty)

      /**
       * @param destination The destination to which dataset contents are delivered. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7002a69a78fa0a8d9c60b7eaf42ecee41d1f3761d56ad36c4cd9b8976df45abc")
      public
          fun destination(destination: DatasetContentDeliveryRuleDestinationProperty.Builder.() -> Unit)

      /**
       * @param entryName The name of the dataset content delivery rules entry.
       */
      public fun entryName(entryName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty.builder()

      /**
       * @param destination The destination to which dataset contents are delivered. 
       */
      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      /**
       * @param destination The destination to which dataset contents are delivered. 
       */
      override fun destination(destination: DatasetContentDeliveryRuleDestinationProperty) {
        cdkBuilder.destination(destination.let(DatasetContentDeliveryRuleDestinationProperty::unwrap))
      }

      /**
       * @param destination The destination to which dataset contents are delivered. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7002a69a78fa0a8d9c60b7eaf42ecee41d1f3761d56ad36c4cd9b8976df45abc")
      override
          fun destination(destination: DatasetContentDeliveryRuleDestinationProperty.Builder.() -> Unit):
          Unit = destination(DatasetContentDeliveryRuleDestinationProperty(destination))

      /**
       * @param entryName The name of the dataset content delivery rules entry.
       */
      override fun entryName(entryName: String) {
        cdkBuilder.entryName(entryName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty,
    ) : CdkObject(cdkObject), DatasetContentDeliveryRuleProperty {
      /**
       * The destination to which dataset contents are delivered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryrule.html#cfn-iotanalytics-dataset-datasetcontentdeliveryrule-destination)
       */
      override fun destination(): Any = unwrap(this).getDestination()

      /**
       * The name of the dataset content delivery rules entry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryrule.html#cfn-iotanalytics-dataset-datasetcontentdeliveryrule-entryname)
       */
      override fun entryName(): String? = unwrap(this).getEntryName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DatasetContentDeliveryRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty):
          DatasetContentDeliveryRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetContentDeliveryRuleProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty
    }
  }

  /**
   * Information needed to run the "containerAction" to produce data set contents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * ActionProperty actionProperty = ActionProperty.builder()
   * .actionName("actionName")
   * // the properties below are optional
   * .containerAction(ContainerActionProperty.builder()
   * .executionRoleArn("executionRoleArn")
   * .image("image")
   * .resourceConfiguration(ResourceConfigurationProperty.builder()
   * .computeType("computeType")
   * .volumeSizeInGb(123)
   * .build())
   * // the properties below are optional
   * .variables(List.of(VariableProperty.builder()
   * .variableName("variableName")
   * // the properties below are optional
   * .datasetContentVersionValue(DatasetContentVersionValueProperty.builder()
   * .datasetName("datasetName")
   * .build())
   * .doubleValue(123)
   * .outputFileUriValue(OutputFileUriValueProperty.builder()
   * .fileName("fileName")
   * .build())
   * .stringValue("stringValue")
   * .build()))
   * .build())
   * .queryAction(QueryActionProperty.builder()
   * .sqlQuery("sqlQuery")
   * // the properties below are optional
   * .filters(List.of(FilterProperty.builder()
   * .deltaTime(DeltaTimeProperty.builder()
   * .offsetSeconds(123)
   * .timeExpression("timeExpression")
   * .build())
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html)
   */
  public interface ActionProperty {
    /**
     * The name of the data set action by which data set contents are automatically created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html#cfn-iotanalytics-dataset-action-actionname)
     */
    public fun actionName(): String

    /**
     * Information which allows the system to run a containerized application in order to create the
     * data set contents.
     *
     * The application must be in a Docker container along with any needed support libraries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html#cfn-iotanalytics-dataset-action-containeraction)
     */
    public fun containerAction(): Any? = unwrap(this).getContainerAction()

    /**
     * An "SqlQueryDatasetAction" object that uses an SQL query to automatically create data set
     * contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html#cfn-iotanalytics-dataset-action-queryaction)
     */
    public fun queryAction(): Any? = unwrap(this).getQueryAction()

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionName The name of the data set action by which data set contents are
       * automatically created. 
       */
      public fun actionName(actionName: String)

      /**
       * @param containerAction Information which allows the system to run a containerized
       * application in order to create the data set contents.
       * The application must be in a Docker container along with any needed support libraries.
       */
      public fun containerAction(containerAction: IResolvable)

      /**
       * @param containerAction Information which allows the system to run a containerized
       * application in order to create the data set contents.
       * The application must be in a Docker container along with any needed support libraries.
       */
      public fun containerAction(containerAction: ContainerActionProperty)

      /**
       * @param containerAction Information which allows the system to run a containerized
       * application in order to create the data set contents.
       * The application must be in a Docker container along with any needed support libraries.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7fb0b2b4600952a7a3c76e021204da23616aea133683262928c645a6b64097d5")
      public fun containerAction(containerAction: ContainerActionProperty.Builder.() -> Unit)

      /**
       * @param queryAction An "SqlQueryDatasetAction" object that uses an SQL query to
       * automatically create data set contents.
       */
      public fun queryAction(queryAction: IResolvable)

      /**
       * @param queryAction An "SqlQueryDatasetAction" object that uses an SQL query to
       * automatically create data set contents.
       */
      public fun queryAction(queryAction: QueryActionProperty)

      /**
       * @param queryAction An "SqlQueryDatasetAction" object that uses an SQL query to
       * automatically create data set contents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("209643db6aef748be34590f8f172d702dfc98b6d584c2242f0f32d2150c0bf0e")
      public fun queryAction(queryAction: QueryActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.builder()

      /**
       * @param actionName The name of the data set action by which data set contents are
       * automatically created. 
       */
      override fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
      }

      /**
       * @param containerAction Information which allows the system to run a containerized
       * application in order to create the data set contents.
       * The application must be in a Docker container along with any needed support libraries.
       */
      override fun containerAction(containerAction: IResolvable) {
        cdkBuilder.containerAction(containerAction.let(IResolvable::unwrap))
      }

      /**
       * @param containerAction Information which allows the system to run a containerized
       * application in order to create the data set contents.
       * The application must be in a Docker container along with any needed support libraries.
       */
      override fun containerAction(containerAction: ContainerActionProperty) {
        cdkBuilder.containerAction(containerAction.let(ContainerActionProperty::unwrap))
      }

      /**
       * @param containerAction Information which allows the system to run a containerized
       * application in order to create the data set contents.
       * The application must be in a Docker container along with any needed support libraries.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7fb0b2b4600952a7a3c76e021204da23616aea133683262928c645a6b64097d5")
      override fun containerAction(containerAction: ContainerActionProperty.Builder.() -> Unit):
          Unit = containerAction(ContainerActionProperty(containerAction))

      /**
       * @param queryAction An "SqlQueryDatasetAction" object that uses an SQL query to
       * automatically create data set contents.
       */
      override fun queryAction(queryAction: IResolvable) {
        cdkBuilder.queryAction(queryAction.let(IResolvable::unwrap))
      }

      /**
       * @param queryAction An "SqlQueryDatasetAction" object that uses an SQL query to
       * automatically create data set contents.
       */
      override fun queryAction(queryAction: QueryActionProperty) {
        cdkBuilder.queryAction(queryAction.let(QueryActionProperty::unwrap))
      }

      /**
       * @param queryAction An "SqlQueryDatasetAction" object that uses an SQL query to
       * automatically create data set contents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("209643db6aef748be34590f8f172d702dfc98b6d584c2242f0f32d2150c0bf0e")
      override fun queryAction(queryAction: QueryActionProperty.Builder.() -> Unit): Unit =
          queryAction(QueryActionProperty(queryAction))

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      /**
       * The name of the data set action by which data set contents are automatically created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html#cfn-iotanalytics-dataset-action-actionname)
       */
      override fun actionName(): String = unwrap(this).getActionName()

      /**
       * Information which allows the system to run a containerized application in order to create
       * the data set contents.
       *
       * The application must be in a Docker container along with any needed support libraries.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html#cfn-iotanalytics-dataset-action-containeraction)
       */
      override fun containerAction(): Any? = unwrap(this).getContainerAction()

      /**
       * An "SqlQueryDatasetAction" object that uses an SQL query to automatically create data set
       * contents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html#cfn-iotanalytics-dataset-action-queryaction)
       */
      override fun queryAction(): Any? = unwrap(this).getQueryAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty
    }
  }

  /**
   * An "SqlQueryDatasetAction" object that uses an SQL query to automatically create data set
   * contents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * QueryActionProperty queryActionProperty = QueryActionProperty.builder()
   * .sqlQuery("sqlQuery")
   * // the properties below are optional
   * .filters(List.of(FilterProperty.builder()
   * .deltaTime(DeltaTimeProperty.builder()
   * .offsetSeconds(123)
   * .timeExpression("timeExpression")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html)
   */
  public interface QueryActionProperty {
    /**
     * Pre-filters applied to message data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-filters)
     */
    public fun filters(): Any? = unwrap(this).getFilters()

    /**
     * An "SqlQueryDatasetAction" object that uses an SQL query to automatically create data set
     * contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-sqlquery)
     */
    public fun sqlQuery(): String

    /**
     * A builder for [QueryActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filters Pre-filters applied to message data.
       */
      public fun filters(filters: IResolvable)

      /**
       * @param filters Pre-filters applied to message data.
       */
      public fun filters(filters: List<Any>)

      /**
       * @param filters Pre-filters applied to message data.
       */
      public fun filters(vararg filters: Any)

      /**
       * @param sqlQuery An "SqlQueryDatasetAction" object that uses an SQL query to automatically
       * create data set contents. 
       */
      public fun sqlQuery(sqlQuery: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.builder()

      /**
       * @param filters Pre-filters applied to message data.
       */
      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      /**
       * @param filters Pre-filters applied to message data.
       */
      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      /**
       * @param filters Pre-filters applied to message data.
       */
      override fun filters(vararg filters: Any): Unit = filters(filters.toList())

      /**
       * @param sqlQuery An "SqlQueryDatasetAction" object that uses an SQL query to automatically
       * create data set contents. 
       */
      override fun sqlQuery(sqlQuery: String) {
        cdkBuilder.sqlQuery(sqlQuery)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty,
    ) : CdkObject(cdkObject), QueryActionProperty {
      /**
       * Pre-filters applied to message data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-filters)
       */
      override fun filters(): Any? = unwrap(this).getFilters()

      /**
       * An "SqlQueryDatasetAction" object that uses an SQL query to automatically create data set
       * contents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html#cfn-iotanalytics-dataset-queryaction-sqlquery)
       */
      override fun sqlQuery(): String = unwrap(this).getSqlQuery()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty):
          QueryActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryActionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty
    }
  }

  /**
   * The schedule for when to trigger an update.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-schedule.html)
   */
  public interface ScheduleProperty {
    /**
     * The expression that defines when to trigger an update.
     *
     * For more information, see [Schedule Expressions for
     * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html) in the
     * Amazon CloudWatch documentation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-schedule.html#cfn-iotanalytics-dataset-schedule-scheduleexpression)
     */
    public fun scheduleExpression(): String

    /**
     * A builder for [ScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param scheduleExpression The expression that defines when to trigger an update. 
       * For more information, see [Schedule Expressions for
       * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html) in the
       * Amazon CloudWatch documentation.
       */
      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty.builder()

      /**
       * @param scheduleExpression The expression that defines when to trigger an update. 
       * For more information, see [Schedule Expressions for
       * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html) in the
       * Amazon CloudWatch documentation.
       */
      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty,
    ) : CdkObject(cdkObject), ScheduleProperty {
      /**
       * The expression that defines when to trigger an update.
       *
       * For more information, see [Schedule Expressions for
       * Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html) in the
       * Amazon CloudWatch documentation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-schedule.html#cfn-iotanalytics-dataset-schedule-scheduleexpression)
       */
      override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty):
          ScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty
    }
  }

  /**
   * An instance of a variable to be passed to the `containerAction` execution.
   *
   * Each variable must have a name and a value given by one of `stringValue` ,
   * `datasetContentVersionValue` , or `outputFileUriValue` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * VariableProperty variableProperty = VariableProperty.builder()
   * .variableName("variableName")
   * // the properties below are optional
   * .datasetContentVersionValue(DatasetContentVersionValueProperty.builder()
   * .datasetName("datasetName")
   * .build())
   * .doubleValue(123)
   * .outputFileUriValue(OutputFileUriValueProperty.builder()
   * .fileName("fileName")
   * .build())
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html)
   */
  public interface VariableProperty {
    /**
     * The value of the variable as a structure that specifies a dataset content version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-datasetcontentversionvalue)
     */
    public fun datasetContentVersionValue(): Any? = unwrap(this).getDatasetContentVersionValue()

    /**
     * The value of the variable as a double (numeric).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-doublevalue)
     */
    public fun doubleValue(): Number? = unwrap(this).getDoubleValue()

    /**
     * The value of the variable as a structure that specifies an output file URI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-outputfileurivalue)
     */
    public fun outputFileUriValue(): Any? = unwrap(this).getOutputFileUriValue()

    /**
     * The value of the variable as a string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-stringvalue)
     */
    public fun stringValue(): String? = unwrap(this).getStringValue()

    /**
     * The name of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-variablename)
     */
    public fun variableName(): String

    /**
     * A builder for [VariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param datasetContentVersionValue The value of the variable as a structure that specifies a
       * dataset content version.
       */
      public fun datasetContentVersionValue(datasetContentVersionValue: IResolvable)

      /**
       * @param datasetContentVersionValue The value of the variable as a structure that specifies a
       * dataset content version.
       */
      public
          fun datasetContentVersionValue(datasetContentVersionValue: DatasetContentVersionValueProperty)

      /**
       * @param datasetContentVersionValue The value of the variable as a structure that specifies a
       * dataset content version.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("319789726cadd953937be8d1bb9555c02edebefaaaf31aa32a55cc7e68537fc2")
      public
          fun datasetContentVersionValue(datasetContentVersionValue: DatasetContentVersionValueProperty.Builder.() -> Unit)

      /**
       * @param doubleValue The value of the variable as a double (numeric).
       */
      public fun doubleValue(doubleValue: Number)

      /**
       * @param outputFileUriValue The value of the variable as a structure that specifies an output
       * file URI.
       */
      public fun outputFileUriValue(outputFileUriValue: IResolvable)

      /**
       * @param outputFileUriValue The value of the variable as a structure that specifies an output
       * file URI.
       */
      public fun outputFileUriValue(outputFileUriValue: OutputFileUriValueProperty)

      /**
       * @param outputFileUriValue The value of the variable as a structure that specifies an output
       * file URI.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dff49335f37131756e75020f0f7bc73ce35f07617897f614befcd7d8205a3e1a")
      public
          fun outputFileUriValue(outputFileUriValue: OutputFileUriValueProperty.Builder.() -> Unit)

      /**
       * @param stringValue The value of the variable as a string.
       */
      public fun stringValue(stringValue: String)

      /**
       * @param variableName The name of the variable. 
       */
      public fun variableName(variableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.builder()

      /**
       * @param datasetContentVersionValue The value of the variable as a structure that specifies a
       * dataset content version.
       */
      override fun datasetContentVersionValue(datasetContentVersionValue: IResolvable) {
        cdkBuilder.datasetContentVersionValue(datasetContentVersionValue.let(IResolvable::unwrap))
      }

      /**
       * @param datasetContentVersionValue The value of the variable as a structure that specifies a
       * dataset content version.
       */
      override
          fun datasetContentVersionValue(datasetContentVersionValue: DatasetContentVersionValueProperty) {
        cdkBuilder.datasetContentVersionValue(datasetContentVersionValue.let(DatasetContentVersionValueProperty::unwrap))
      }

      /**
       * @param datasetContentVersionValue The value of the variable as a structure that specifies a
       * dataset content version.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("319789726cadd953937be8d1bb9555c02edebefaaaf31aa32a55cc7e68537fc2")
      override
          fun datasetContentVersionValue(datasetContentVersionValue: DatasetContentVersionValueProperty.Builder.() -> Unit):
          Unit =
          datasetContentVersionValue(DatasetContentVersionValueProperty(datasetContentVersionValue))

      /**
       * @param doubleValue The value of the variable as a double (numeric).
       */
      override fun doubleValue(doubleValue: Number) {
        cdkBuilder.doubleValue(doubleValue)
      }

      /**
       * @param outputFileUriValue The value of the variable as a structure that specifies an output
       * file URI.
       */
      override fun outputFileUriValue(outputFileUriValue: IResolvable) {
        cdkBuilder.outputFileUriValue(outputFileUriValue.let(IResolvable::unwrap))
      }

      /**
       * @param outputFileUriValue The value of the variable as a structure that specifies an output
       * file URI.
       */
      override fun outputFileUriValue(outputFileUriValue: OutputFileUriValueProperty) {
        cdkBuilder.outputFileUriValue(outputFileUriValue.let(OutputFileUriValueProperty::unwrap))
      }

      /**
       * @param outputFileUriValue The value of the variable as a structure that specifies an output
       * file URI.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dff49335f37131756e75020f0f7bc73ce35f07617897f614befcd7d8205a3e1a")
      override
          fun outputFileUriValue(outputFileUriValue: OutputFileUriValueProperty.Builder.() -> Unit):
          Unit = outputFileUriValue(OutputFileUriValueProperty(outputFileUriValue))

      /**
       * @param stringValue The value of the variable as a string.
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      /**
       * @param variableName The name of the variable. 
       */
      override fun variableName(variableName: String) {
        cdkBuilder.variableName(variableName)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty,
    ) : CdkObject(cdkObject), VariableProperty {
      /**
       * The value of the variable as a structure that specifies a dataset content version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-datasetcontentversionvalue)
       */
      override fun datasetContentVersionValue(): Any? = unwrap(this).getDatasetContentVersionValue()

      /**
       * The value of the variable as a double (numeric).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-doublevalue)
       */
      override fun doubleValue(): Number? = unwrap(this).getDoubleValue()

      /**
       * The value of the variable as a structure that specifies an output file URI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-outputfileurivalue)
       */
      override fun outputFileUriValue(): Any? = unwrap(this).getOutputFileUriValue()

      /**
       * The value of the variable as a string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-stringvalue)
       */
      override fun stringValue(): String? = unwrap(this).getStringValue()

      /**
       * The name of the variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-variablename)
       */
      override fun variableName(): String = unwrap(this).getVariableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty):
          VariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VariableProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty
    }
  }

  /**
   * The information needed to configure a delta time session window.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * LateDataRuleConfigurationProperty lateDataRuleConfigurationProperty =
   * LateDataRuleConfigurationProperty.builder()
   * .deltaTimeSessionWindowConfiguration(DeltaTimeSessionWindowConfigurationProperty.builder()
   * .timeoutInMinutes(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-latedataruleconfiguration.html)
   */
  public interface LateDataRuleConfigurationProperty {
    /**
     * The information needed to configure a delta time session window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-latedataruleconfiguration.html#cfn-iotanalytics-dataset-latedataruleconfiguration-deltatimesessionwindowconfiguration)
     */
    public fun deltaTimeSessionWindowConfiguration(): Any? =
        unwrap(this).getDeltaTimeSessionWindowConfiguration()

    /**
     * A builder for [LateDataRuleConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deltaTimeSessionWindowConfiguration The information needed to configure a delta time
       * session window.
       */
      public
          fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: IResolvable)

      /**
       * @param deltaTimeSessionWindowConfiguration The information needed to configure a delta time
       * session window.
       */
      public
          fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: DeltaTimeSessionWindowConfigurationProperty)

      /**
       * @param deltaTimeSessionWindowConfiguration The information needed to configure a delta time
       * session window.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9d87bc4aa9b49a152d09288df1a27a69707702fb08a386436e141051109adc4")
      public
          fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: DeltaTimeSessionWindowConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty.builder()

      /**
       * @param deltaTimeSessionWindowConfiguration The information needed to configure a delta time
       * session window.
       */
      override
          fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: IResolvable) {
        cdkBuilder.deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param deltaTimeSessionWindowConfiguration The information needed to configure a delta time
       * session window.
       */
      override
          fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: DeltaTimeSessionWindowConfigurationProperty) {
        cdkBuilder.deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration.let(DeltaTimeSessionWindowConfigurationProperty::unwrap))
      }

      /**
       * @param deltaTimeSessionWindowConfiguration The information needed to configure a delta time
       * session window.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9d87bc4aa9b49a152d09288df1a27a69707702fb08a386436e141051109adc4")
      override
          fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: DeltaTimeSessionWindowConfigurationProperty.Builder.() -> Unit):
          Unit =
          deltaTimeSessionWindowConfiguration(DeltaTimeSessionWindowConfigurationProperty(deltaTimeSessionWindowConfiguration))

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty,
    ) : CdkObject(cdkObject), LateDataRuleConfigurationProperty {
      /**
       * The information needed to configure a delta time session window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-latedataruleconfiguration.html#cfn-iotanalytics-dataset-latedataruleconfiguration-deltatimesessionwindowconfiguration)
       */
      override fun deltaTimeSessionWindowConfiguration(): Any? =
          unwrap(this).getDeltaTimeSessionWindowConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LateDataRuleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty):
          LateDataRuleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LateDataRuleConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty
    }
  }

  /**
   * How long, in days, message data is kept.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * RetentionPeriodProperty retentionPeriodProperty = RetentionPeriodProperty.builder()
   * .numberOfDays(123)
   * .unlimited(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-retentionperiod.html)
   */
  public interface RetentionPeriodProperty {
    /**
     * The number of days that message data is kept.
     *
     * The `unlimited` parameter must be false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-retentionperiod.html#cfn-iotanalytics-dataset-retentionperiod-numberofdays)
     */
    public fun numberOfDays(): Number? = unwrap(this).getNumberOfDays()

    /**
     * If true, message data is kept indefinitely.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-retentionperiod.html#cfn-iotanalytics-dataset-retentionperiod-unlimited)
     */
    public fun unlimited(): Any? = unwrap(this).getUnlimited()

    /**
     * A builder for [RetentionPeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param numberOfDays The number of days that message data is kept.
       * The `unlimited` parameter must be false.
       */
      public fun numberOfDays(numberOfDays: Number)

      /**
       * @param unlimited If true, message data is kept indefinitely.
       */
      public fun unlimited(unlimited: Boolean)

      /**
       * @param unlimited If true, message data is kept indefinitely.
       */
      public fun unlimited(unlimited: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty.builder()

      /**
       * @param numberOfDays The number of days that message data is kept.
       * The `unlimited` parameter must be false.
       */
      override fun numberOfDays(numberOfDays: Number) {
        cdkBuilder.numberOfDays(numberOfDays)
      }

      /**
       * @param unlimited If true, message data is kept indefinitely.
       */
      override fun unlimited(unlimited: Boolean) {
        cdkBuilder.unlimited(unlimited)
      }

      /**
       * @param unlimited If true, message data is kept indefinitely.
       */
      override fun unlimited(unlimited: IResolvable) {
        cdkBuilder.unlimited(unlimited.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty,
    ) : CdkObject(cdkObject), RetentionPeriodProperty {
      /**
       * The number of days that message data is kept.
       *
       * The `unlimited` parameter must be false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-retentionperiod.html#cfn-iotanalytics-dataset-retentionperiod-numberofdays)
       */
      override fun numberOfDays(): Number? = unwrap(this).getNumberOfDays()

      /**
       * If true, message data is kept indefinitely.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-retentionperiod.html#cfn-iotanalytics-dataset-retentionperiod-unlimited)
       */
      override fun unlimited(): Any? = unwrap(this).getUnlimited()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty):
          RetentionPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionPeriodProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty
    }
  }

  /**
   * Information about the versioning of dataset contents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * VersioningConfigurationProperty versioningConfigurationProperty =
   * VersioningConfigurationProperty.builder()
   * .maxVersions(123)
   * .unlimited(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html)
   */
  public interface VersioningConfigurationProperty {
    /**
     * How many versions of dataset contents are kept.
     *
     * The `unlimited` parameter must be `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html#cfn-iotanalytics-dataset-versioningconfiguration-maxversions)
     */
    public fun maxVersions(): Number? = unwrap(this).getMaxVersions()

    /**
     * If true, unlimited versions of dataset contents are kept.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html#cfn-iotanalytics-dataset-versioningconfiguration-unlimited)
     */
    public fun unlimited(): Any? = unwrap(this).getUnlimited()

    /**
     * A builder for [VersioningConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxVersions How many versions of dataset contents are kept.
       * The `unlimited` parameter must be `false` .
       */
      public fun maxVersions(maxVersions: Number)

      /**
       * @param unlimited If true, unlimited versions of dataset contents are kept.
       */
      public fun unlimited(unlimited: Boolean)

      /**
       * @param unlimited If true, unlimited versions of dataset contents are kept.
       */
      public fun unlimited(unlimited: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty.builder()

      /**
       * @param maxVersions How many versions of dataset contents are kept.
       * The `unlimited` parameter must be `false` .
       */
      override fun maxVersions(maxVersions: Number) {
        cdkBuilder.maxVersions(maxVersions)
      }

      /**
       * @param unlimited If true, unlimited versions of dataset contents are kept.
       */
      override fun unlimited(unlimited: Boolean) {
        cdkBuilder.unlimited(unlimited)
      }

      /**
       * @param unlimited If true, unlimited versions of dataset contents are kept.
       */
      override fun unlimited(unlimited: IResolvable) {
        cdkBuilder.unlimited(unlimited.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty,
    ) : CdkObject(cdkObject), VersioningConfigurationProperty {
      /**
       * How many versions of dataset contents are kept.
       *
       * The `unlimited` parameter must be `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html#cfn-iotanalytics-dataset-versioningconfiguration-maxversions)
       */
      override fun maxVersions(): Number? = unwrap(this).getMaxVersions()

      /**
       * If true, unlimited versions of dataset contents are kept.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html#cfn-iotanalytics-dataset-versioningconfiguration-unlimited)
       */
      override fun unlimited(): Any? = unwrap(this).getUnlimited()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VersioningConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty):
          VersioningConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VersioningConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty
    }
  }

  /**
   * Configuration information for delivery of dataset contents to AWS IoT Events .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * IotEventsDestinationConfigurationProperty iotEventsDestinationConfigurationProperty =
   * IotEventsDestinationConfigurationProperty.builder()
   * .inputName("inputName")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-ioteventsdestinationconfiguration.html)
   */
  public interface IotEventsDestinationConfigurationProperty {
    /**
     * The name of the AWS IoT Events input to which dataset contents are delivered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-ioteventsdestinationconfiguration.html#cfn-iotanalytics-dataset-ioteventsdestinationconfiguration-inputname)
     */
    public fun inputName(): String

    /**
     * The ARN of the role that grants AWS IoT Analytics permission to deliver dataset contents to
     * an AWS IoT Events input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-ioteventsdestinationconfiguration.html#cfn-iotanalytics-dataset-ioteventsdestinationconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [IotEventsDestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputName The name of the AWS IoT Events input to which dataset contents are
       * delivered. 
       */
      public fun inputName(inputName: String)

      /**
       * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to deliver
       * dataset contents to an AWS IoT Events input. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty.builder()

      /**
       * @param inputName The name of the AWS IoT Events input to which dataset contents are
       * delivered. 
       */
      override fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
      }

      /**
       * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to deliver
       * dataset contents to an AWS IoT Events input. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty,
    ) : CdkObject(cdkObject), IotEventsDestinationConfigurationProperty {
      /**
       * The name of the AWS IoT Events input to which dataset contents are delivered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-ioteventsdestinationconfiguration.html#cfn-iotanalytics-dataset-ioteventsdestinationconfiguration-inputname)
       */
      override fun inputName(): String = unwrap(this).getInputName()

      /**
       * The ARN of the role that grants AWS IoT Analytics permission to deliver dataset contents to
       * an AWS IoT Events input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-ioteventsdestinationconfiguration.html#cfn-iotanalytics-dataset-ioteventsdestinationconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IotEventsDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty):
          IotEventsDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotEventsDestinationConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty
    }
  }

  /**
   * Information about the dataset whose content generation triggers the new dataset content
   * generation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * TriggeringDatasetProperty triggeringDatasetProperty = TriggeringDatasetProperty.builder()
   * .datasetName("datasetName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html)
   */
  public interface TriggeringDatasetProperty {
    /**
     * The name of the data set whose content generation triggers the new data set content
     * generation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html#cfn-iotanalytics-dataset-triggeringdataset-datasetname)
     */
    public fun datasetName(): String

    /**
     * A builder for [TriggeringDatasetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param datasetName The name of the data set whose content generation triggers the new data
       * set content generation. 
       */
      public fun datasetName(datasetName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty.builder()

      /**
       * @param datasetName The name of the data set whose content generation triggers the new data
       * set content generation. 
       */
      override fun datasetName(datasetName: String) {
        cdkBuilder.datasetName(datasetName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty,
    ) : CdkObject(cdkObject), TriggeringDatasetProperty {
      /**
       * The name of the data set whose content generation triggers the new data set content
       * generation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html#cfn-iotanalytics-dataset-triggeringdataset-datasetname)
       */
      override fun datasetName(): String = unwrap(this).getDatasetName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TriggeringDatasetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty):
          TriggeringDatasetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TriggeringDatasetProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty
    }
  }
}
