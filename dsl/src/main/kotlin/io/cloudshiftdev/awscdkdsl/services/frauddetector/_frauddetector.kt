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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnDetector
import software.amazon.awscdk.services.frauddetector.CfnDetectorProps
import software.amazon.awscdk.services.frauddetector.CfnEntityType
import software.amazon.awscdk.services.frauddetector.CfnEntityTypeProps
import software.amazon.awscdk.services.frauddetector.CfnEventType
import software.amazon.awscdk.services.frauddetector.CfnEventTypeProps
import software.amazon.awscdk.services.frauddetector.CfnLabel
import software.amazon.awscdk.services.frauddetector.CfnLabelProps
import software.amazon.awscdk.services.frauddetector.CfnList
import software.amazon.awscdk.services.frauddetector.CfnListProps
import software.amazon.awscdk.services.frauddetector.CfnOutcome
import software.amazon.awscdk.services.frauddetector.CfnOutcomeProps
import software.amazon.awscdk.services.frauddetector.CfnVariable
import software.amazon.awscdk.services.frauddetector.CfnVariableProps
import software.constructs.Construct

public object frauddetector {
    /**
     * Manages a detector and associated detector versions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnDetector cfnDetector = CfnDetector.Builder.create(this, "MyCfnDetector")
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
    public inline fun cfnDetector(
        scope: Construct,
        id: String,
        block: CfnDetectorDsl.() -> Unit = {},
    ): CfnDetector {
        val builder = CfnDetectorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The entity type details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * EntityTypeProperty entityTypeProperty = EntityTypeProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html)
     */
    public inline fun cfnDetectorEntityTypeProperty(
        block: CfnDetectorEntityTypePropertyDsl.() -> Unit = {}
    ): CfnDetector.EntityTypeProperty {
        val builder = CfnDetectorEntityTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The event type details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * EventTypeProperty eventTypeProperty = EventTypeProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html)
     */
    public inline fun cfnDetectorEventTypeProperty(
        block: CfnDetectorEventTypePropertyDsl.() -> Unit = {}
    ): CfnDetector.EventTypeProperty {
        val builder = CfnDetectorEventTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The event type variable for the detector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * EventVariableProperty eventVariableProperty = EventVariableProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html)
     */
    public inline fun cfnDetectorEventVariableProperty(
        block: CfnDetectorEventVariablePropertyDsl.() -> Unit = {}
    ): CfnDetector.EventVariableProperty {
        val builder = CfnDetectorEventVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The label details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * LabelProperty labelProperty = LabelProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html)
     */
    public inline fun cfnDetectorLabelProperty(
        block: CfnDetectorLabelPropertyDsl.() -> Unit = {}
    ): CfnDetector.LabelProperty {
        val builder = CfnDetectorLabelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * ModelProperty modelProperty = ModelProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-model.html)
     */
    public inline fun cfnDetectorModelProperty(
        block: CfnDetectorModelPropertyDsl.() -> Unit = {}
    ): CfnDetector.ModelProperty {
        val builder = CfnDetectorModelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The outcome.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * OutcomeProperty outcomeProperty = OutcomeProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html)
     */
    public inline fun cfnDetectorOutcomeProperty(
        block: CfnDetectorOutcomePropertyDsl.() -> Unit = {}
    ): CfnDetector.OutcomeProperty {
        val builder = CfnDetectorOutcomePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnDetectorProps(
        block: CfnDetectorPropsDsl.() -> Unit = {}
    ): CfnDetectorProps {
        val builder = CfnDetectorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * RuleProperty ruleProperty = RuleProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html)
     */
    public inline fun cfnDetectorRuleProperty(
        block: CfnDetectorRulePropertyDsl.() -> Unit = {}
    ): CfnDetector.RuleProperty {
        val builder = CfnDetectorRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Manages an entity type.
     *
     * An entity represents who is performing the event. As part of a fraud prediction, you pass the
     * entity ID to indicate the specific entity who performed the event. An entity type classifies
     * the entity. Example classifications include customer, merchant, or account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnEntityType cfnEntityType = CfnEntityType.Builder.create(this, "MyCfnEntityType")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-entitytype.html)
     */
    public inline fun cfnEntityType(
        scope: Construct,
        id: String,
        block: CfnEntityTypeDsl.() -> Unit = {},
    ): CfnEntityType {
        val builder = CfnEntityTypeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEntityType`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnEntityTypeProps cfnEntityTypeProps = CfnEntityTypeProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-entitytype.html)
     */
    public inline fun cfnEntityTypeProps(
        block: CfnEntityTypePropsDsl.() -> Unit = {}
    ): CfnEntityTypeProps {
        val builder = CfnEntityTypePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Manages an event type.
     *
     * An event is a business activity that is evaluated for fraud risk. With Amazon Fraud Detector,
     * you generate fraud predictions for events. An event type defines the structure for an event
     * sent to Amazon Fraud Detector. This includes the variables sent as part of the event, the
     * entity performing the event (such as a customer), and the labels that classify the event.
     * Example event types include online payment transactions, account registrations, and
     * authentications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnEventType cfnEventType = CfnEventType.Builder.create(this, "MyCfnEventType")
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
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html)
     */
    public inline fun cfnEventType(
        scope: Construct,
        id: String,
        block: CfnEventTypeDsl.() -> Unit = {},
    ): CfnEventType {
        val builder = CfnEventTypeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The entity type details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * EntityTypeProperty entityTypeProperty = EntityTypeProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-entitytype.html)
     */
    public inline fun cfnEventTypeEntityTypeProperty(
        block: CfnEventTypeEntityTypePropertyDsl.() -> Unit = {}
    ): CfnEventType.EntityTypeProperty {
        val builder = CfnEventTypeEntityTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The variables associated with this event type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * EventVariableProperty eventVariableProperty = EventVariableProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html)
     */
    public inline fun cfnEventTypeEventVariableProperty(
        block: CfnEventTypeEventVariablePropertyDsl.() -> Unit = {}
    ): CfnEventType.EventVariableProperty {
        val builder = CfnEventTypeEventVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The label associated with the event type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * LabelProperty labelProperty = LabelProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-label.html)
     */
    public inline fun cfnEventTypeLabelProperty(
        block: CfnEventTypeLabelPropertyDsl.() -> Unit = {}
    ): CfnEventType.LabelProperty {
        val builder = CfnEventTypeLabelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEventType`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnEventTypeProps cfnEventTypeProps = CfnEventTypeProps.builder()
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
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html)
     */
    public inline fun cfnEventTypeProps(
        block: CfnEventTypePropsDsl.() -> Unit = {}
    ): CfnEventTypeProps {
        val builder = CfnEventTypePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates label.
     *
     * A label classifies an event as fraudulent or legitimate. Labels are associated with event
     * types and used to train supervised machine learning models in Amazon Fraud Detector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnLabel cfnLabel = CfnLabel.Builder.create(this, "MyCfnLabel")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-label.html)
     */
    public inline fun cfnLabel(
        scope: Construct,
        id: String,
        block: CfnLabelDsl.() -> Unit = {},
    ): CfnLabel {
        val builder = CfnLabelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLabel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnLabelProps cfnLabelProps = CfnLabelProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-label.html)
     */
    public inline fun cfnLabelProps(block: CfnLabelPropsDsl.() -> Unit = {}): CfnLabelProps {
        val builder = CfnLabelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a list.
     *
     * List is a set of input data for a variable in your event dataset. You use the input data in a
     * rule that's associated with your detector. For more information, see
     * [Lists](https://docs.aws.amazon.com//frauddetector/latest/ug/lists.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnList cfnList = CfnList.Builder.create(this, "MyCfnList")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .elements(List.of("elements"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .variableType("variableType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html)
     */
    public inline fun cfnList(
        scope: Construct,
        id: String,
        block: CfnListDsl.() -> Unit = {},
    ): CfnList {
        val builder = CfnListDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnList`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnListProps cfnListProps = CfnListProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .elements(List.of("elements"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .variableType("variableType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html)
     */
    public inline fun cfnListProps(block: CfnListPropsDsl.() -> Unit = {}): CfnListProps {
        val builder = CfnListPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates an outcome.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnOutcome cfnOutcome = CfnOutcome.Builder.create(this, "MyCfnOutcome")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-outcome.html)
     */
    public inline fun cfnOutcome(
        scope: Construct,
        id: String,
        block: CfnOutcomeDsl.() -> Unit = {},
    ): CfnOutcome {
        val builder = CfnOutcomeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnOutcome`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnOutcomeProps cfnOutcomeProps = CfnOutcomeProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-outcome.html)
     */
    public inline fun cfnOutcomeProps(block: CfnOutcomePropsDsl.() -> Unit = {}): CfnOutcomeProps {
        val builder = CfnOutcomePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Manages a variable.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnVariable cfnVariable = CfnVariable.Builder.create(this, "MyCfnVariable")
     * .dataSource("dataSource")
     * .dataType("dataType")
     * .defaultValue("defaultValue")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .variableType("variableType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html)
     */
    public inline fun cfnVariable(
        scope: Construct,
        id: String,
        block: CfnVariableDsl.() -> Unit = {},
    ): CfnVariable {
        val builder = CfnVariableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVariable`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.frauddetector.*;
     * CfnVariableProps cfnVariableProps = CfnVariableProps.builder()
     * .dataSource("dataSource")
     * .dataType("dataType")
     * .defaultValue("defaultValue")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .variableType("variableType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html)
     */
    public inline fun cfnVariableProps(
        block: CfnVariablePropsDsl.() -> Unit = {}
    ): CfnVariableProps {
        val builder = CfnVariablePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
