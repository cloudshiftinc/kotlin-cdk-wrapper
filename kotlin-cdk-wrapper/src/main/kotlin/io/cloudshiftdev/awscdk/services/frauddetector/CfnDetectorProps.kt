@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.frauddetector

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
 * Properties for defining a `CfnDetector`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.frauddetector.*;
 * CfnDetectorProps cfnDetectorProps = CfnDetectorProps.builder()
 * .detectorId("detectorId")
 * .eventType(EventTypeProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .entityTypes(List.of(EntityTypeProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .eventVariables(List.of(EventVariableProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .dataSource("dataSource")
 * .dataType("dataType")
 * .defaultValue("defaultValue")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .variableType("variableType")
 * .build()))
 * .inline(false)
 * .labels(List.of(LabelProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .rules(List.of(RuleProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .detectorId("detectorId")
 * .expression("expression")
 * .language("language")
 * .lastUpdatedTime("lastUpdatedTime")
 * .outcomes(List.of(OutcomeProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .ruleId("ruleId")
 * .ruleVersion("ruleVersion")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * // the properties below are optional
 * .associatedModels(List.of(ModelProperty.builder()
 * .arn("arn")
 * .build()))
 * .description("description")
 * .detectorVersionStatus("detectorVersionStatus")
 * .ruleExecutionMode("ruleExecutionMode")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html)
 */
public interface CfnDetectorProps {
  /**
   * The models to associate with this detector.
   *
   * You must provide the ARNs of all the models you want to associate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-associatedmodels)
   */
  public fun associatedModels(): Any? = unwrap(this).getAssociatedModels()

  /**
   * The detector description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-detectorid)
   */
  public fun detectorId(): String

  /**
   * The status of the detector version.
   *
   * If a value is not provided for this property, AWS CloudFormation assumes `DRAFT` status.
   *
   * Valid values: `ACTIVE | DRAFT`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-detectorversionstatus)
   */
  public fun detectorVersionStatus(): String? = unwrap(this).getDetectorVersionStatus()

  /**
   * The event type associated with this detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-eventtype)
   */
  public fun eventType(): Any

  /**
   * The rule execution mode for the rules included in the detector version.
   *
   * Valid values: `FIRST_MATCHED | ALL_MATCHED` Default value: `FIRST_MATCHED`
   *
   * You can define and edit the rule mode at the detector version level, when it is in draft
   * status.
   *
   * If you specify `FIRST_MATCHED` , Amazon Fraud Detector evaluates rules sequentially, first to
   * last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for
   * that single rule.
   *
   * If you specifiy `ALL_MATCHED` , Amazon Fraud Detector evaluates all rules and returns the
   * outcomes for all matched rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-ruleexecutionmode)
   */
  public fun ruleExecutionMode(): String? = unwrap(this).getRuleExecutionMode()

  /**
   * The rules to include in the detector version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-rules)
   */
  public fun rules(): Any

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDetectorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param associatedModels The models to associate with this detector.
     * You must provide the ARNs of all the models you want to associate.
     */
    public fun associatedModels(associatedModels: IResolvable)

    /**
     * @param associatedModels The models to associate with this detector.
     * You must provide the ARNs of all the models you want to associate.
     */
    public fun associatedModels(associatedModels: List<Any>)

    /**
     * @param associatedModels The models to associate with this detector.
     * You must provide the ARNs of all the models you want to associate.
     */
    public fun associatedModels(vararg associatedModels: Any)

    /**
     * @param description The detector description.
     */
    public fun description(description: String)

    /**
     * @param detectorId The name of the detector. 
     */
    public fun detectorId(detectorId: String)

    /**
     * @param detectorVersionStatus The status of the detector version.
     * If a value is not provided for this property, AWS CloudFormation assumes `DRAFT` status.
     *
     * Valid values: `ACTIVE | DRAFT`
     */
    public fun detectorVersionStatus(detectorVersionStatus: String)

    /**
     * @param eventType The event type associated with this detector. 
     */
    public fun eventType(eventType: IResolvable)

    /**
     * @param eventType The event type associated with this detector. 
     */
    public fun eventType(eventType: CfnDetector.EventTypeProperty)

    /**
     * @param eventType The event type associated with this detector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b0355883f9cb11ed8e11183a80903d27ae91acc60a4c658ca054bc88543bbf1")
    public fun eventType(eventType: CfnDetector.EventTypeProperty.Builder.() -> Unit)

    /**
     * @param ruleExecutionMode The rule execution mode for the rules included in the detector
     * version.
     * Valid values: `FIRST_MATCHED | ALL_MATCHED` Default value: `FIRST_MATCHED`
     *
     * You can define and edit the rule mode at the detector version level, when it is in draft
     * status.
     *
     * If you specify `FIRST_MATCHED` , Amazon Fraud Detector evaluates rules sequentially, first to
     * last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for
     * that single rule.
     *
     * If you specifiy `ALL_MATCHED` , Amazon Fraud Detector evaluates all rules and returns the
     * outcomes for all matched rules.
     */
    public fun ruleExecutionMode(ruleExecutionMode: String)

    /**
     * @param rules The rules to include in the detector version. 
     */
    public fun rules(rules: IResolvable)

    /**
     * @param rules The rules to include in the detector version. 
     */
    public fun rules(rules: List<Any>)

    /**
     * @param rules The rules to include in the detector version. 
     */
    public fun rules(vararg rules: Any)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnDetectorProps.Builder =
        software.amazon.awscdk.services.frauddetector.CfnDetectorProps.builder()

    /**
     * @param associatedModels The models to associate with this detector.
     * You must provide the ARNs of all the models you want to associate.
     */
    override fun associatedModels(associatedModels: IResolvable) {
      cdkBuilder.associatedModels(associatedModels.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param associatedModels The models to associate with this detector.
     * You must provide the ARNs of all the models you want to associate.
     */
    override fun associatedModels(associatedModels: List<Any>) {
      cdkBuilder.associatedModels(associatedModels.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param associatedModels The models to associate with this detector.
     * You must provide the ARNs of all the models you want to associate.
     */
    override fun associatedModels(vararg associatedModels: Any): Unit =
        associatedModels(associatedModels.toList())

    /**
     * @param description The detector description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param detectorId The name of the detector. 
     */
    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    /**
     * @param detectorVersionStatus The status of the detector version.
     * If a value is not provided for this property, AWS CloudFormation assumes `DRAFT` status.
     *
     * Valid values: `ACTIVE | DRAFT`
     */
    override fun detectorVersionStatus(detectorVersionStatus: String) {
      cdkBuilder.detectorVersionStatus(detectorVersionStatus)
    }

    /**
     * @param eventType The event type associated with this detector. 
     */
    override fun eventType(eventType: IResolvable) {
      cdkBuilder.eventType(eventType.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param eventType The event type associated with this detector. 
     */
    override fun eventType(eventType: CfnDetector.EventTypeProperty) {
      cdkBuilder.eventType(eventType.let(CfnDetector.EventTypeProperty.Companion::unwrap))
    }

    /**
     * @param eventType The event type associated with this detector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b0355883f9cb11ed8e11183a80903d27ae91acc60a4c658ca054bc88543bbf1")
    override fun eventType(eventType: CfnDetector.EventTypeProperty.Builder.() -> Unit): Unit =
        eventType(CfnDetector.EventTypeProperty(eventType))

    /**
     * @param ruleExecutionMode The rule execution mode for the rules included in the detector
     * version.
     * Valid values: `FIRST_MATCHED | ALL_MATCHED` Default value: `FIRST_MATCHED`
     *
     * You can define and edit the rule mode at the detector version level, when it is in draft
     * status.
     *
     * If you specify `FIRST_MATCHED` , Amazon Fraud Detector evaluates rules sequentially, first to
     * last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for
     * that single rule.
     *
     * If you specifiy `ALL_MATCHED` , Amazon Fraud Detector evaluates all rules and returns the
     * outcomes for all matched rules.
     */
    override fun ruleExecutionMode(ruleExecutionMode: String) {
      cdkBuilder.ruleExecutionMode(ruleExecutionMode)
    }

    /**
     * @param rules The rules to include in the detector version. 
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param rules The rules to include in the detector version. 
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param rules The rules to include in the detector version. 
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetectorProps,
  ) : CdkObject(cdkObject), CfnDetectorProps {
    /**
     * The models to associate with this detector.
     *
     * You must provide the ARNs of all the models you want to associate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-associatedmodels)
     */
    override fun associatedModels(): Any? = unwrap(this).getAssociatedModels()

    /**
     * The detector description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-detectorid)
     */
    override fun detectorId(): String = unwrap(this).getDetectorId()

    /**
     * The status of the detector version.
     *
     * If a value is not provided for this property, AWS CloudFormation assumes `DRAFT` status.
     *
     * Valid values: `ACTIVE | DRAFT`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-detectorversionstatus)
     */
    override fun detectorVersionStatus(): String? = unwrap(this).getDetectorVersionStatus()

    /**
     * The event type associated with this detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-eventtype)
     */
    override fun eventType(): Any = unwrap(this).getEventType()

    /**
     * The rule execution mode for the rules included in the detector version.
     *
     * Valid values: `FIRST_MATCHED | ALL_MATCHED` Default value: `FIRST_MATCHED`
     *
     * You can define and edit the rule mode at the detector version level, when it is in draft
     * status.
     *
     * If you specify `FIRST_MATCHED` , Amazon Fraud Detector evaluates rules sequentially, first to
     * last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for
     * that single rule.
     *
     * If you specifiy `ALL_MATCHED` , Amazon Fraud Detector evaluates all rules and returns the
     * outcomes for all matched rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-ruleexecutionmode)
     */
    override fun ruleExecutionMode(): String? = unwrap(this).getRuleExecutionMode()

    /**
     * The rules to include in the detector version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-rules)
     */
    override fun rules(): Any = unwrap(this).getRules()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDetectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetectorProps):
        CfnDetectorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDetectorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDetectorProps):
        software.amazon.awscdk.services.frauddetector.CfnDetectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.frauddetector.CfnDetectorProps
  }
}
