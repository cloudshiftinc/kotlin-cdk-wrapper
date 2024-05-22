@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotanalytics

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataset`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
 * CfnDatasetProps cfnDatasetProps = CfnDatasetProps.builder()
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
public interface CfnDatasetProps {
  /**
   * The `DatasetAction` objects that automatically create the dataset contents.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-actions)
   */
  public fun actions(): Any

  /**
   * When dataset contents are created they are delivered to destinations specified here.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-contentdeliveryrules)
   */
  public fun contentDeliveryRules(): Any? = unwrap(this).getContentDeliveryRules()

  /**
   * The name of the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-datasetname)
   */
  public fun datasetName(): String? = unwrap(this).getDatasetName()

  /**
   * A list of data rules that send notifications to CloudWatch, when data arrives late.
   *
   * To specify `lateDataRules` , the dataset must use a
   * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
   * filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-latedatarules)
   */
  public fun lateDataRules(): Any? = unwrap(this).getLateDataRules()

  /**
   * Optional.
   *
   * How long, in days, message data is kept for the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-retentionperiod)
   */
  public fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

  /**
   * Metadata which can be used to manage the data set.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The `DatasetTrigger` objects that specify when the dataset is automatically updated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-triggers)
   */
  public fun triggers(): Any? = unwrap(this).getTriggers()

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
   */
  public fun versioningConfiguration(): Any? = unwrap(this).getVersioningConfiguration()

  /**
   * A builder for [CfnDatasetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
     */
    public fun actions(actions: IResolvable)

    /**
     * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
     */
    public fun actions(actions: List<Any>)

    /**
     * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
     */
    public fun actions(vararg actions: Any)

    /**
     * @param contentDeliveryRules When dataset contents are created they are delivered to
     * destinations specified here.
     */
    public fun contentDeliveryRules(contentDeliveryRules: IResolvable)

    /**
     * @param contentDeliveryRules When dataset contents are created they are delivered to
     * destinations specified here.
     */
    public fun contentDeliveryRules(contentDeliveryRules: List<Any>)

    /**
     * @param contentDeliveryRules When dataset contents are created they are delivered to
     * destinations specified here.
     */
    public fun contentDeliveryRules(vararg contentDeliveryRules: Any)

    /**
     * @param datasetName The name of the dataset.
     */
    public fun datasetName(datasetName: String)

    /**
     * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
     * arrives late.
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     */
    public fun lateDataRules(lateDataRules: IResolvable)

    /**
     * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
     * arrives late.
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     */
    public fun lateDataRules(lateDataRules: List<Any>)

    /**
     * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
     * arrives late.
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     */
    public fun lateDataRules(vararg lateDataRules: Any)

    /**
     * @param retentionPeriod Optional.
     * How long, in days, message data is kept for the dataset.
     */
    public fun retentionPeriod(retentionPeriod: IResolvable)

    /**
     * @param retentionPeriod Optional.
     * How long, in days, message data is kept for the dataset.
     */
    public fun retentionPeriod(retentionPeriod: CfnDataset.RetentionPeriodProperty)

    /**
     * @param retentionPeriod Optional.
     * How long, in days, message data is kept for the dataset.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e585be29460628514dd7c49d16aa9175c576b146ac1679502f3c11a5226d6dd8")
    public
        fun retentionPeriod(retentionPeriod: CfnDataset.RetentionPeriodProperty.Builder.() -> Unit)

    /**
     * @param tags Metadata which can be used to manage the data set.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata which can be used to manage the data set.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
     * updated.
     */
    public fun triggers(triggers: IResolvable)

    /**
     * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
     * updated.
     */
    public fun triggers(triggers: List<Any>)

    /**
     * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
     * updated.
     */
    public fun triggers(vararg triggers: Any)

    /**
     * @param versioningConfiguration Optional.
     * How many versions of dataset contents are kept. If not specified or set to null, only the
     * latest version plus the latest succeeded version (if they are different) are kept for the time
     * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
     * Versions of AWS IoT Analytics
     * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * in the *AWS IoT Analytics User Guide* .
     */
    public fun versioningConfiguration(versioningConfiguration: IResolvable)

    /**
     * @param versioningConfiguration Optional.
     * How many versions of dataset contents are kept. If not specified or set to null, only the
     * latest version plus the latest succeeded version (if they are different) are kept for the time
     * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
     * Versions of AWS IoT Analytics
     * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * in the *AWS IoT Analytics User Guide* .
     */
    public
        fun versioningConfiguration(versioningConfiguration: CfnDataset.VersioningConfigurationProperty)

    /**
     * @param versioningConfiguration Optional.
     * How many versions of dataset contents are kept. If not specified or set to null, only the
     * latest version plus the latest succeeded version (if they are different) are kept for the time
     * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
     * Versions of AWS IoT Analytics
     * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * in the *AWS IoT Analytics User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60fe6e1ca66d647f6b7daa88db7f0eb648db412759da79cd3f78dc68a5416f66")
    public
        fun versioningConfiguration(versioningConfiguration: CfnDataset.VersioningConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.builder()

    /**
     * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * @param contentDeliveryRules When dataset contents are created they are delivered to
     * destinations specified here.
     */
    override fun contentDeliveryRules(contentDeliveryRules: IResolvable) {
      cdkBuilder.contentDeliveryRules(contentDeliveryRules.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param contentDeliveryRules When dataset contents are created they are delivered to
     * destinations specified here.
     */
    override fun contentDeliveryRules(contentDeliveryRules: List<Any>) {
      cdkBuilder.contentDeliveryRules(contentDeliveryRules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param contentDeliveryRules When dataset contents are created they are delivered to
     * destinations specified here.
     */
    override fun contentDeliveryRules(vararg contentDeliveryRules: Any): Unit =
        contentDeliveryRules(contentDeliveryRules.toList())

    /**
     * @param datasetName The name of the dataset.
     */
    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    /**
     * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
     * arrives late.
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     */
    override fun lateDataRules(lateDataRules: IResolvable) {
      cdkBuilder.lateDataRules(lateDataRules.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
     * arrives late.
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     */
    override fun lateDataRules(lateDataRules: List<Any>) {
      cdkBuilder.lateDataRules(lateDataRules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
     * arrives late.
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     */
    override fun lateDataRules(vararg lateDataRules: Any): Unit =
        lateDataRules(lateDataRules.toList())

    /**
     * @param retentionPeriod Optional.
     * How long, in days, message data is kept for the dataset.
     */
    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param retentionPeriod Optional.
     * How long, in days, message data is kept for the dataset.
     */
    override fun retentionPeriod(retentionPeriod: CfnDataset.RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(CfnDataset.RetentionPeriodProperty.Companion::unwrap))
    }

    /**
     * @param retentionPeriod Optional.
     * How long, in days, message data is kept for the dataset.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e585be29460628514dd7c49d16aa9175c576b146ac1679502f3c11a5226d6dd8")
    override
        fun retentionPeriod(retentionPeriod: CfnDataset.RetentionPeriodProperty.Builder.() -> Unit):
        Unit = retentionPeriod(CfnDataset.RetentionPeriodProperty(retentionPeriod))

    /**
     * @param tags Metadata which can be used to manage the data set.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the data set.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
     * updated.
     */
    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
     * updated.
     */
    override fun triggers(triggers: List<Any>) {
      cdkBuilder.triggers(triggers.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
     * updated.
     */
    override fun triggers(vararg triggers: Any): Unit = triggers(triggers.toList())

    /**
     * @param versioningConfiguration Optional.
     * How many versions of dataset contents are kept. If not specified or set to null, only the
     * latest version plus the latest succeeded version (if they are different) are kept for the time
     * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
     * Versions of AWS IoT Analytics
     * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * in the *AWS IoT Analytics User Guide* .
     */
    override fun versioningConfiguration(versioningConfiguration: IResolvable) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param versioningConfiguration Optional.
     * How many versions of dataset contents are kept. If not specified or set to null, only the
     * latest version plus the latest succeeded version (if they are different) are kept for the time
     * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
     * Versions of AWS IoT Analytics
     * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * in the *AWS IoT Analytics User Guide* .
     */
    override
        fun versioningConfiguration(versioningConfiguration: CfnDataset.VersioningConfigurationProperty) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(CfnDataset.VersioningConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param versioningConfiguration Optional.
     * How many versions of dataset contents are kept. If not specified or set to null, only the
     * latest version plus the latest succeeded version (if they are different) are kept for the time
     * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
     * Versions of AWS IoT Analytics
     * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
     * in the *AWS IoT Analytics User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60fe6e1ca66d647f6b7daa88db7f0eb648db412759da79cd3f78dc68a5416f66")
    override
        fun versioningConfiguration(versioningConfiguration: CfnDataset.VersioningConfigurationProperty.Builder.() -> Unit):
        Unit =
        versioningConfiguration(CfnDataset.VersioningConfigurationProperty(versioningConfiguration))

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDatasetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatasetProps,
  ) : CdkObject(cdkObject), CfnDatasetProps {
    /**
     * The `DatasetAction` objects that automatically create the dataset contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-actions)
     */
    override fun actions(): Any = unwrap(this).getActions()

    /**
     * When dataset contents are created they are delivered to destinations specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-contentdeliveryrules)
     */
    override fun contentDeliveryRules(): Any? = unwrap(this).getContentDeliveryRules()

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-datasetname)
     */
    override fun datasetName(): String? = unwrap(this).getDatasetName()

    /**
     * A list of data rules that send notifications to CloudWatch, when data arrives late.
     *
     * To specify `lateDataRules` , the dataset must use a
     * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-latedatarules)
     */
    override fun lateDataRules(): Any? = unwrap(this).getLateDataRules()

    /**
     * Optional.
     *
     * How long, in days, message data is kept for the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-retentionperiod)
     */
    override fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

    /**
     * Metadata which can be used to manage the data set.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The `DatasetTrigger` objects that specify when the dataset is automatically updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html#cfn-iotanalytics-dataset-triggers)
     */
    override fun triggers(): Any? = unwrap(this).getTriggers()

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
     */
    override fun versioningConfiguration(): Any? = unwrap(this).getVersioningConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatasetProps):
        CfnDatasetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDatasetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetProps):
        software.amazon.awscdk.services.iotanalytics.CfnDatasetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotanalytics.CfnDatasetProps
  }
}
