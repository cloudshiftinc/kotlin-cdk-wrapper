@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.frauddetector

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.frauddetector.CfnDetector
import software.amazon.awscdk.services.frauddetector.CfnDetectorProps

/**
 * Properties for defining a `CfnDetector`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.frauddetector.*;
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
@CdkDslMarker
public class CfnDetectorPropsDsl {
    private val cdkBuilder: CfnDetectorProps.Builder = CfnDetectorProps.builder()

    private val _associatedModels: MutableList<Any> = mutableListOf()

    private val _rules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param associatedModels The models to associate with this detector. You must provide the ARNs
     *   of all the models you want to associate.
     */
    public fun associatedModels(vararg associatedModels: Any) {
        _associatedModels.addAll(listOf(*associatedModels))
    }

    /**
     * @param associatedModels The models to associate with this detector. You must provide the ARNs
     *   of all the models you want to associate.
     */
    public fun associatedModels(associatedModels: Collection<Any>) {
        _associatedModels.addAll(associatedModels)
    }

    /**
     * @param associatedModels The models to associate with this detector. You must provide the ARNs
     *   of all the models you want to associate.
     */
    public fun associatedModels(associatedModels: IResolvable) {
        cdkBuilder.associatedModels(associatedModels)
    }

    /** @param description The detector description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param detectorId The name of the detector. */
    public fun detectorId(detectorId: String) {
        cdkBuilder.detectorId(detectorId)
    }

    /**
     * @param detectorVersionStatus The status of the detector version. If a value is not provided
     *   for this property, AWS CloudFormation assumes `DRAFT` status.
     *
     * Valid values: `ACTIVE | DRAFT`
     */
    public fun detectorVersionStatus(detectorVersionStatus: String) {
        cdkBuilder.detectorVersionStatus(detectorVersionStatus)
    }

    /** @param eventType The event type associated with this detector. */
    public fun eventType(eventType: IResolvable) {
        cdkBuilder.eventType(eventType)
    }

    /** @param eventType The event type associated with this detector. */
    public fun eventType(eventType: CfnDetector.EventTypeProperty) {
        cdkBuilder.eventType(eventType)
    }

    /**
     * @param ruleExecutionMode The rule execution mode for the rules included in the detector
     *   version. Valid values: `FIRST_MATCHED | ALL_MATCHED` Default value: `FIRST_MATCHED`
     *
     * You can define and edit the rule mode at the detector version level, when it is in draft
     * status.
     *
     * If you specify `FIRST_MATCHED` , Amazon Fraud Detector evaluates rules sequentially, first to
     * last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes
     * for that single rule.
     *
     * If you specifiy `ALL_MATCHED` , Amazon Fraud Detector evaluates all rules and returns the
     * outcomes for all matched rules.
     */
    public fun ruleExecutionMode(ruleExecutionMode: String) {
        cdkBuilder.ruleExecutionMode(ruleExecutionMode)
    }

    /** @param rules The rules to include in the detector version. */
    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    /** @param rules The rules to include in the detector version. */
    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    /** @param rules The rules to include in the detector version. */
    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDetectorProps {
        if (_associatedModels.isNotEmpty()) cdkBuilder.associatedModels(_associatedModels)
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
