package io.cloudshiftdev.awscdk.services.frauddetector

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDetector
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The models to associate with this detector. */
    public open fun associatedModels(): Any? = unwrap(this).getAssociatedModels()

    /** The models to associate with this detector. */
    public open fun associatedModels(`value`: IResolvable) {
        unwrap(this).setAssociatedModels(`value`.let(IResolvable::unwrap))
    }

    /** The models to associate with this detector. */
    public open fun associatedModels(__idx_ac66f0: List<Any>) {
        unwrap(this).setAssociatedModels(__idx_ac66f0)
    }

    /** The models to associate with this detector. */
    public open fun associatedModels(vararg __idx_ac66f0: Any): Unit =
        associatedModels(__idx_ac66f0.toList())

    /** The detector ARN. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** Timestamp of when detector was created. */
    public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

    /** The name of the detector. */
    public open fun attrDetectorVersionId(): String = unwrap(this).getAttrDetectorVersionId()

    /** The detector ARN. */
    public open fun attrEventTypeArn(): String = unwrap(this).getAttrEventTypeArn()

    /** Timestamp of when the detector was created. */
    public open fun attrEventTypeCreatedTime(): String = unwrap(this).getAttrEventTypeCreatedTime()

    /** Timestamp of when the detector was last updated. */
    public open fun attrEventTypeLastUpdatedTime(): String =
        unwrap(this).getAttrEventTypeLastUpdatedTime()

    /** Timestamp of when detector was last updated. */
    public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

    /** The detector description. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** The detector description. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /** The name of the detector. */
    public open fun detectorId(): String = unwrap(this).getDetectorId()

    /** The name of the detector. */
    public open fun detectorId(`value`: String) {
        unwrap(this).setDetectorId(`value`)
    }

    /** The status of the detector version. */
    public open fun detectorVersionStatus(): String? = unwrap(this).getDetectorVersionStatus()

    /** The status of the detector version. */
    public open fun detectorVersionStatus(`value`: String) {
        unwrap(this).setDetectorVersionStatus(`value`)
    }

    /** The event type associated with this detector. */
    public open fun eventType(): Any = unwrap(this).getEventType()

    /** The event type associated with this detector. */
    public open fun eventType(`value`: IResolvable) {
        unwrap(this).setEventType(`value`.let(IResolvable::unwrap))
    }

    /** The event type associated with this detector. */
    public open fun eventType(`value`: EventTypeProperty) {
        unwrap(this).setEventType(`value`.let(EventTypeProperty::unwrap))
    }

    /** The event type associated with this detector. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea093576b787a8e47cd555312a920e21e9d568a6c1930d5c16c16d353c1140a4")
    public open fun eventType(`value`: EventTypeProperty.Builder.() -> Unit): Unit =
        eventType(EventTypeProperty(`value`))

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The rule execution mode for the rules included in the detector version. */
    public open fun ruleExecutionMode(): String? = unwrap(this).getRuleExecutionMode()

    /** The rule execution mode for the rules included in the detector version. */
    public open fun ruleExecutionMode(`value`: String) {
        unwrap(this).setRuleExecutionMode(`value`)
    }

    /** The rules to include in the detector version. */
    public open fun rules(): Any = unwrap(this).getRules()

    /** The rules to include in the detector version. */
    public open fun rules(`value`: IResolvable) {
        unwrap(this).setRules(`value`.let(IResolvable::unwrap))
    }

    /** The rules to include in the detector version. */
    public open fun rules(__idx_ac66f0: List<Any>) {
        unwrap(this).setRules(__idx_ac66f0)
    }

    /** The rules to include in the detector version. */
    public open fun rules(vararg __idx_ac66f0: Any): Unit = rules(__idx_ac66f0.toList())

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.frauddetector.CfnDetector]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The models to associate with this detector.
         *
         * You must provide the ARNs of all the models you want to associate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-associatedmodels)
         *
         * @param associatedModels The models to associate with this detector.
         */
        public fun associatedModels(associatedModels: IResolvable)

        /**
         * The models to associate with this detector.
         *
         * You must provide the ARNs of all the models you want to associate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-associatedmodels)
         *
         * @param associatedModels The models to associate with this detector.
         */
        public fun associatedModels(associatedModels: List<Any>)

        /**
         * The models to associate with this detector.
         *
         * You must provide the ARNs of all the models you want to associate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-associatedmodels)
         *
         * @param associatedModels The models to associate with this detector.
         */
        public fun associatedModels(vararg associatedModels: Any)

        /**
         * The detector description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-description)
         *
         * @param description The detector description.
         */
        public fun description(description: String)

        /**
         * The name of the detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-detectorid)
         *
         * @param detectorId The name of the detector.
         */
        public fun detectorId(detectorId: String)

        /**
         * The status of the detector version.
         *
         * If a value is not provided for this property, AWS CloudFormation assumes `DRAFT` status.
         *
         * Valid values: `ACTIVE | DRAFT`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-detectorversionstatus)
         *
         * @param detectorVersionStatus The status of the detector version.
         */
        public fun detectorVersionStatus(detectorVersionStatus: String)

        /**
         * The event type associated with this detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-eventtype)
         *
         * @param eventType The event type associated with this detector.
         */
        public fun eventType(eventType: IResolvable)

        /**
         * The event type associated with this detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-eventtype)
         *
         * @param eventType The event type associated with this detector.
         */
        public fun eventType(eventType: EventTypeProperty)

        /**
         * The event type associated with this detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-eventtype)
         *
         * @param eventType The event type associated with this detector.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("1908bdf3c79730411659f2ed378d0a4ec38565e5f69568f793a845c4056359a0")
        public fun eventType(eventType: EventTypeProperty.Builder.() -> Unit)

        /**
         * The rule execution mode for the rules included in the detector version.
         *
         * Valid values: `FIRST_MATCHED | ALL_MATCHED` Default value: `FIRST_MATCHED`
         *
         * You can define and edit the rule mode at the detector version level, when it is in draft
         * status.
         *
         * If you specify `FIRST_MATCHED` , Amazon Fraud Detector evaluates rules sequentially,
         * first to last, stopping at the first matched rule. Amazon Fraud dectector then provides
         * the outcomes for that single rule.
         *
         * If you specifiy `ALL_MATCHED` , Amazon Fraud Detector evaluates all rules and returns the
         * outcomes for all matched rules.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-ruleexecutionmode)
         *
         * @param ruleExecutionMode The rule execution mode for the rules included in the detector
         *   version.
         */
        public fun ruleExecutionMode(ruleExecutionMode: String)

        /**
         * The rules to include in the detector version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-rules)
         *
         * @param rules The rules to include in the detector version.
         */
        public fun rules(rules: IResolvable)

        /**
         * The rules to include in the detector version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-rules)
         *
         * @param rules The rules to include in the detector version.
         */
        public fun rules(rules: List<Any>)

        /**
         * The rules to include in the detector version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-rules)
         *
         * @param rules The rules to include in the detector version.
         */
        public fun rules(vararg rules: Any)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-tags)
         *
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
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnDetector.Builder =
            software.amazon.awscdk.services.frauddetector.CfnDetector.Builder.create(scope, id)

        /**
         * The models to associate with this detector.
         *
         * You must provide the ARNs of all the models you want to associate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-associatedmodels)
         *
         * @param associatedModels The models to associate with this detector.
         */
        override fun associatedModels(associatedModels: IResolvable) {
            cdkBuilder.associatedModels(associatedModels.let(IResolvable::unwrap))
        }

        /**
         * The models to associate with this detector.
         *
         * You must provide the ARNs of all the models you want to associate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-associatedmodels)
         *
         * @param associatedModels The models to associate with this detector.
         */
        override fun associatedModels(associatedModels: List<Any>) {
            cdkBuilder.associatedModels(associatedModels)
        }

        /**
         * The models to associate with this detector.
         *
         * You must provide the ARNs of all the models you want to associate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-associatedmodels)
         *
         * @param associatedModels The models to associate with this detector.
         */
        override fun associatedModels(vararg associatedModels: Any): Unit =
            associatedModels(associatedModels.toList())

        /**
         * The detector description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-description)
         *
         * @param description The detector description.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The name of the detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-detectorid)
         *
         * @param detectorId The name of the detector.
         */
        override fun detectorId(detectorId: String) {
            cdkBuilder.detectorId(detectorId)
        }

        /**
         * The status of the detector version.
         *
         * If a value is not provided for this property, AWS CloudFormation assumes `DRAFT` status.
         *
         * Valid values: `ACTIVE | DRAFT`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-detectorversionstatus)
         *
         * @param detectorVersionStatus The status of the detector version.
         */
        override fun detectorVersionStatus(detectorVersionStatus: String) {
            cdkBuilder.detectorVersionStatus(detectorVersionStatus)
        }

        /**
         * The event type associated with this detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-eventtype)
         *
         * @param eventType The event type associated with this detector.
         */
        override fun eventType(eventType: IResolvable) {
            cdkBuilder.eventType(eventType.let(IResolvable::unwrap))
        }

        /**
         * The event type associated with this detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-eventtype)
         *
         * @param eventType The event type associated with this detector.
         */
        override fun eventType(eventType: EventTypeProperty) {
            cdkBuilder.eventType(eventType.let(EventTypeProperty::unwrap))
        }

        /**
         * The event type associated with this detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-eventtype)
         *
         * @param eventType The event type associated with this detector.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("1908bdf3c79730411659f2ed378d0a4ec38565e5f69568f793a845c4056359a0")
        override fun eventType(eventType: EventTypeProperty.Builder.() -> Unit): Unit =
            eventType(EventTypeProperty(eventType))

        /**
         * The rule execution mode for the rules included in the detector version.
         *
         * Valid values: `FIRST_MATCHED | ALL_MATCHED` Default value: `FIRST_MATCHED`
         *
         * You can define and edit the rule mode at the detector version level, when it is in draft
         * status.
         *
         * If you specify `FIRST_MATCHED` , Amazon Fraud Detector evaluates rules sequentially,
         * first to last, stopping at the first matched rule. Amazon Fraud dectector then provides
         * the outcomes for that single rule.
         *
         * If you specifiy `ALL_MATCHED` , Amazon Fraud Detector evaluates all rules and returns the
         * outcomes for all matched rules.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-ruleexecutionmode)
         *
         * @param ruleExecutionMode The rule execution mode for the rules included in the detector
         *   version.
         */
        override fun ruleExecutionMode(ruleExecutionMode: String) {
            cdkBuilder.ruleExecutionMode(ruleExecutionMode)
        }

        /**
         * The rules to include in the detector version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-rules)
         *
         * @param rules The rules to include in the detector version.
         */
        override fun rules(rules: IResolvable) {
            cdkBuilder.rules(rules.let(IResolvable::unwrap))
        }

        /**
         * The rules to include in the detector version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-rules)
         *
         * @param rules The rules to include in the detector version.
         */
        override fun rules(rules: List<Any>) {
            cdkBuilder.rules(rules)
        }

        /**
         * The rules to include in the detector version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-rules)
         *
         * @param rules The rules to include in the detector version.
         */
        override fun rules(vararg rules: Any): Unit = rules(rules.toList())

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-tags)
         *
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
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-detector.html#cfn-frauddetector-detector-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetector =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnDetector {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnDetector(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector
        ): CfnDetector = CfnDetector(cdkObject)

        internal fun unwrap(
            wrapped: CfnDetector
        ): software.amazon.awscdk.services.frauddetector.CfnDetector = wrapped.cdkObject
    }

    public interface LabelProperty {
        /**
         * The label ARN.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-arn)
         */
        public fun arn(): String? = unwrap(this).getArn()

        /**
         * Timestamp of when the event type was created.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-createdtime)
         */
        public fun createdTime(): String? = unwrap(this).getCreatedTime()

        /**
         * The label description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-description)
         */
        public fun description(): String? = unwrap(this).getDescription()

        /**
         * Indicates whether the resource is defined within this CloudFormation template and impacts
         * the create, update, and delete behavior of the stack.
         *
         * If the value is `true` , CloudFormation will create/update/delete the resource when
         * creating/updating/deleting the stack. If the value is `false` , CloudFormation will
         * validate that the object exists and then use it within the resource without making
         * changes to the object.
         *
         * For example, when creating `AWS::FraudDetector::Detector` you must define at least two
         * variables. You can set `Inline=true` for these variables and CloudFormation will
         * create/update/delete the variables as part of stack operations. However, if you set
         * `Inline=false` , CloudFormation will associate the variables to your detector but not
         * execute any changes to the variables.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-inline)
         */
        public fun `inline`(): Any? = unwrap(this).getInline()

        /**
         * Timestamp of when the label was last updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-lastupdatedtime)
         */
        public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

        /**
         * The label name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-name)
         */
        public fun name(): String? = unwrap(this).getName()

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-tags)
         */
        public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

        /** A builder for [LabelProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param arn The label ARN. */
            public fun arn(arn: String)

            /** @param createdTime Timestamp of when the event type was created. */
            public fun createdTime(createdTime: String)

            /** @param description The label description. */
            public fun description(description: String)

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            public fun `inline`(`inline`: Boolean)

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            public fun `inline`(`inline`: IResolvable)

            /** @param lastUpdatedTime Timestamp of when the label was last updated. */
            public fun lastUpdatedTime(lastUpdatedTime: String)

            /** @param name The label name. */
            public fun name(name: String)

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            public fun tags(tags: List<CfnTag>)

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            public fun tags(vararg tags: CfnTag)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty.Builder =
                software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty.builder()

            /** @param arn The label ARN. */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            /** @param createdTime Timestamp of when the event type was created. */
            override fun createdTime(createdTime: String) {
                cdkBuilder.createdTime(createdTime)
            }

            /** @param description The label description. */
            override fun description(description: String) {
                cdkBuilder.description(description)
            }

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            override fun `inline`(`inline`: Boolean) {
                cdkBuilder.`inline`(`inline`)
            }

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            override fun `inline`(`inline`: IResolvable) {
                cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
            }

            /** @param lastUpdatedTime Timestamp of when the label was last updated. */
            override fun lastUpdatedTime(lastUpdatedTime: String) {
                cdkBuilder.lastUpdatedTime(lastUpdatedTime)
            }

            /** @param name The label name. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            override fun tags(tags: List<CfnTag>) {
                cdkBuilder.tags(tags.map(CfnTag::unwrap))
            }

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

            public fun build():
                software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty,
        ) : LabelProperty {
            /**
             * The label ARN.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-arn)
             */
            override fun arn(): String? = unwrap(this).getArn()

            /**
             * Timestamp of when the event type was created.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-createdtime)
             */
            override fun createdTime(): String? = unwrap(this).getCreatedTime()

            /**
             * The label description.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-description)
             */
            override fun description(): String? = unwrap(this).getDescription()

            /**
             * Indicates whether the resource is defined within this CloudFormation template and
             * impacts the create, update, and delete behavior of the stack.
             *
             * If the value is `true` , CloudFormation will create/update/delete the resource when
             * creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             * validate that the object exists and then use it within the resource without making
             * changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-inline)
             */
            override fun `inline`(): Any? = unwrap(this).getInline()

            /**
             * Timestamp of when the label was last updated.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-lastupdatedtime)
             */
            override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

            /**
             * The label name.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-name)
             */
            override fun name(): String? = unwrap(this).getName()

            /**
             * An array of key-value pairs to apply to this resource.
             *
             * For more information, see
             * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-label.html#cfn-frauddetector-detector-label-tags)
             */
            override fun tags(): List<CfnTag> =
                unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): LabelProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty
            ): LabelProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: LabelProperty
            ): software.amazon.awscdk.services.frauddetector.CfnDetector.LabelProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface EventTypeProperty {
        /**
         * The entity type ARN.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-arn)
         */
        public fun arn(): String? = unwrap(this).getArn()

        /**
         * Timestamp of when the event type was created.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-createdtime)
         */
        public fun createdTime(): String? = unwrap(this).getCreatedTime()

        /**
         * The event type description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-description)
         */
        public fun description(): String? = unwrap(this).getDescription()

        /**
         * The event type entity types.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-entitytypes)
         */
        public fun entityTypes(): Any? = unwrap(this).getEntityTypes()

        /**
         * The event type event variables.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-eventvariables)
         */
        public fun eventVariables(): Any? = unwrap(this).getEventVariables()

        /**
         * Indicates whether the resource is defined within this CloudFormation template and impacts
         * the create, update, and delete behavior of the stack.
         *
         * If the value is `true` , CloudFormation will create/update/delete the resource when
         * creating/updating/deleting the stack. If the value is `false` , CloudFormation will
         * validate that the object exists and then use it within the resource without making
         * changes to the object.
         *
         * For example, when creating `AWS::FraudDetector::Detector` you must define at least two
         * variables. You can set `Inline=true` for these variables and CloudFormation will
         * create/update/delete the Variables as part of stack operations. However, if you set
         * `Inline=false` , CloudFormation will associate the variables to your detector but not
         * execute any changes to the variables.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-inline)
         */
        public fun `inline`(): Any? = unwrap(this).getInline()

        /**
         * The event type labels.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-labels)
         */
        public fun labels(): Any? = unwrap(this).getLabels()

        /**
         * Timestamp of when the event type was last updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-lastupdatedtime)
         */
        public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

        /**
         * The event type name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-name)
         */
        public fun name(): String? = unwrap(this).getName()

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-tags)
         */
        public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

        /** A builder for [EventTypeProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param arn The entity type ARN. */
            public fun arn(arn: String)

            /** @param createdTime Timestamp of when the event type was created. */
            public fun createdTime(createdTime: String)

            /** @param description The event type description. */
            public fun description(description: String)

            /** @param entityTypes The event type entity types. */
            public fun entityTypes(entityTypes: IResolvable)

            /** @param entityTypes The event type entity types. */
            public fun entityTypes(entityTypes: List<Any>)

            /** @param entityTypes The event type entity types. */
            public fun entityTypes(vararg entityTypes: Any)

            /** @param eventVariables The event type event variables. */
            public fun eventVariables(eventVariables: IResolvable)

            /** @param eventVariables The event type event variables. */
            public fun eventVariables(eventVariables: List<Any>)

            /** @param eventVariables The event type event variables. */
            public fun eventVariables(vararg eventVariables: Any)

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the Variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            public fun `inline`(`inline`: Boolean)

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the Variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            public fun `inline`(`inline`: IResolvable)

            /** @param labels The event type labels. */
            public fun labels(labels: IResolvable)

            /** @param labels The event type labels. */
            public fun labels(labels: List<Any>)

            /** @param labels The event type labels. */
            public fun labels(vararg labels: Any)

            /** @param lastUpdatedTime Timestamp of when the event type was last updated. */
            public fun lastUpdatedTime(lastUpdatedTime: String)

            /** @param name The event type name. */
            public fun name(name: String)

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            public fun tags(tags: List<CfnTag>)

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            public fun tags(vararg tags: CfnTag)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty.Builder =
                software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty
                    .builder()

            /** @param arn The entity type ARN. */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            /** @param createdTime Timestamp of when the event type was created. */
            override fun createdTime(createdTime: String) {
                cdkBuilder.createdTime(createdTime)
            }

            /** @param description The event type description. */
            override fun description(description: String) {
                cdkBuilder.description(description)
            }

            /** @param entityTypes The event type entity types. */
            override fun entityTypes(entityTypes: IResolvable) {
                cdkBuilder.entityTypes(entityTypes.let(IResolvable::unwrap))
            }

            /** @param entityTypes The event type entity types. */
            override fun entityTypes(entityTypes: List<Any>) {
                cdkBuilder.entityTypes(entityTypes)
            }

            /** @param entityTypes The event type entity types. */
            override fun entityTypes(vararg entityTypes: Any): Unit =
                entityTypes(entityTypes.toList())

            /** @param eventVariables The event type event variables. */
            override fun eventVariables(eventVariables: IResolvable) {
                cdkBuilder.eventVariables(eventVariables.let(IResolvable::unwrap))
            }

            /** @param eventVariables The event type event variables. */
            override fun eventVariables(eventVariables: List<Any>) {
                cdkBuilder.eventVariables(eventVariables)
            }

            /** @param eventVariables The event type event variables. */
            override fun eventVariables(vararg eventVariables: Any): Unit =
                eventVariables(eventVariables.toList())

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the Variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            override fun `inline`(`inline`: Boolean) {
                cdkBuilder.`inline`(`inline`)
            }

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the Variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            override fun `inline`(`inline`: IResolvable) {
                cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
            }

            /** @param labels The event type labels. */
            override fun labels(labels: IResolvable) {
                cdkBuilder.labels(labels.let(IResolvable::unwrap))
            }

            /** @param labels The event type labels. */
            override fun labels(labels: List<Any>) {
                cdkBuilder.labels(labels)
            }

            /** @param labels The event type labels. */
            override fun labels(vararg labels: Any): Unit = labels(labels.toList())

            /** @param lastUpdatedTime Timestamp of when the event type was last updated. */
            override fun lastUpdatedTime(lastUpdatedTime: String) {
                cdkBuilder.lastUpdatedTime(lastUpdatedTime)
            }

            /** @param name The event type name. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            override fun tags(tags: List<CfnTag>) {
                cdkBuilder.tags(tags.map(CfnTag::unwrap))
            }

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

            public fun build():
                software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty,
        ) : EventTypeProperty {
            /**
             * The entity type ARN.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-arn)
             */
            override fun arn(): String? = unwrap(this).getArn()

            /**
             * Timestamp of when the event type was created.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-createdtime)
             */
            override fun createdTime(): String? = unwrap(this).getCreatedTime()

            /**
             * The event type description.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-description)
             */
            override fun description(): String? = unwrap(this).getDescription()

            /**
             * The event type entity types.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-entitytypes)
             */
            override fun entityTypes(): Any? = unwrap(this).getEntityTypes()

            /**
             * The event type event variables.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-eventvariables)
             */
            override fun eventVariables(): Any? = unwrap(this).getEventVariables()

            /**
             * Indicates whether the resource is defined within this CloudFormation template and
             * impacts the create, update, and delete behavior of the stack.
             *
             * If the value is `true` , CloudFormation will create/update/delete the resource when
             * creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             * validate that the object exists and then use it within the resource without making
             * changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the Variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-inline)
             */
            override fun `inline`(): Any? = unwrap(this).getInline()

            /**
             * The event type labels.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-labels)
             */
            override fun labels(): Any? = unwrap(this).getLabels()

            /**
             * Timestamp of when the event type was last updated.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-lastupdatedtime)
             */
            override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

            /**
             * The event type name.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-name)
             */
            override fun name(): String? = unwrap(this).getName()

            /**
             * An array of key-value pairs to apply to this resource.
             *
             * For more information, see
             * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html#cfn-frauddetector-detector-eventtype-tags)
             */
            override fun tags(): List<CfnTag> =
                unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): EventTypeProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty
            ): EventTypeProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EventTypeProperty
            ): software.amazon.awscdk.services.frauddetector.CfnDetector.EventTypeProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface OutcomeProperty {
        /**
         * The outcome ARN.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-arn)
         */
        public fun arn(): String? = unwrap(this).getArn()

        /**
         * The timestamp when the outcome was created.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-createdtime)
         */
        public fun createdTime(): String? = unwrap(this).getCreatedTime()

        /**
         * The outcome description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-description)
         */
        public fun description(): String? = unwrap(this).getDescription()

        /**
         * Indicates whether the resource is defined within this CloudFormation template and impacts
         * the create, update, and delete behavior of the stack.
         *
         * If the value is `true` , CloudFormation will create/update/delete the resource when
         * creating/updating/deleting the stack. If the value is `false` , CloudFormation will
         * validate that the object exists and then use it within the resource without making
         * changes to the object.
         *
         * For example, when creating `AWS::FraudDetector::Detector` you must define at least two
         * variables. You can set `Inline=true` for these variables and CloudFormation will
         * create/update/delete the variables as part of stack operations. However, if you set
         * `Inline=false` , CloudFormation will associate the variables to your detector but not
         * execute any changes to the variables.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-inline)
         */
        public fun `inline`(): Any? = unwrap(this).getInline()

        /**
         * The timestamp when the outcome was last updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-lastupdatedtime)
         */
        public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

        /**
         * The outcome name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-name)
         */
        public fun name(): String? = unwrap(this).getName()

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-tags)
         */
        public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

        /** A builder for [OutcomeProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param arn The outcome ARN. */
            public fun arn(arn: String)

            /** @param createdTime The timestamp when the outcome was created. */
            public fun createdTime(createdTime: String)

            /** @param description The outcome description. */
            public fun description(description: String)

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            public fun `inline`(`inline`: Boolean)

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            public fun `inline`(`inline`: IResolvable)

            /** @param lastUpdatedTime The timestamp when the outcome was last updated. */
            public fun lastUpdatedTime(lastUpdatedTime: String)

            /** @param name The outcome name. */
            public fun name(name: String)

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            public fun tags(tags: List<CfnTag>)

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            public fun tags(vararg tags: CfnTag)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty.Builder =
                software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty.builder()

            /** @param arn The outcome ARN. */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            /** @param createdTime The timestamp when the outcome was created. */
            override fun createdTime(createdTime: String) {
                cdkBuilder.createdTime(createdTime)
            }

            /** @param description The outcome description. */
            override fun description(description: String) {
                cdkBuilder.description(description)
            }

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            override fun `inline`(`inline`: Boolean) {
                cdkBuilder.`inline`(`inline`)
            }

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            override fun `inline`(`inline`: IResolvable) {
                cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
            }

            /** @param lastUpdatedTime The timestamp when the outcome was last updated. */
            override fun lastUpdatedTime(lastUpdatedTime: String) {
                cdkBuilder.lastUpdatedTime(lastUpdatedTime)
            }

            /** @param name The outcome name. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            override fun tags(tags: List<CfnTag>) {
                cdkBuilder.tags(tags.map(CfnTag::unwrap))
            }

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

            public fun build():
                software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty,
        ) : OutcomeProperty {
            /**
             * The outcome ARN.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-arn)
             */
            override fun arn(): String? = unwrap(this).getArn()

            /**
             * The timestamp when the outcome was created.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-createdtime)
             */
            override fun createdTime(): String? = unwrap(this).getCreatedTime()

            /**
             * The outcome description.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-description)
             */
            override fun description(): String? = unwrap(this).getDescription()

            /**
             * Indicates whether the resource is defined within this CloudFormation template and
             * impacts the create, update, and delete behavior of the stack.
             *
             * If the value is `true` , CloudFormation will create/update/delete the resource when
             * creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             * validate that the object exists and then use it within the resource without making
             * changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-inline)
             */
            override fun `inline`(): Any? = unwrap(this).getInline()

            /**
             * The timestamp when the outcome was last updated.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-lastupdatedtime)
             */
            override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

            /**
             * The outcome name.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-name)
             */
            override fun name(): String? = unwrap(this).getName()

            /**
             * An array of key-value pairs to apply to this resource.
             *
             * For more information, see
             * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-outcome.html#cfn-frauddetector-detector-outcome-tags)
             */
            override fun tags(): List<CfnTag> =
                unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): OutcomeProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty
            ): OutcomeProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: OutcomeProperty
            ): software.amazon.awscdk.services.frauddetector.CfnDetector.OutcomeProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface RuleProperty {
        /**
         * The rule ARN.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-arn)
         */
        public fun arn(): String? = unwrap(this).getArn()

        /**
         * Timestamp for when the rule was created.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-createdtime)
         */
        public fun createdTime(): String? = unwrap(this).getCreatedTime()

        /**
         * The rule description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-description)
         */
        public fun description(): String? = unwrap(this).getDescription()

        /**
         * The detector for which the rule is associated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-detectorid)
         */
        public fun detectorId(): String? = unwrap(this).getDetectorId()

        /**
         * The rule expression.
         *
         * A rule expression captures the business logic. For more information, see
         * [Rule language reference](https://docs.aws.amazon.com/frauddetector/latest/ug/rule-language-reference.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-expression)
         */
        public fun expression(): String? = unwrap(this).getExpression()

        /**
         * The rule language.
         *
         * Valid Value: DETECTORPL
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-language)
         */
        public fun language(): String? = unwrap(this).getLanguage()

        /**
         * Timestamp for when the rule was last updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-lastupdatedtime)
         */
        public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

        /**
         * The rule outcome.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-outcomes)
         */
        public fun outcomes(): Any? = unwrap(this).getOutcomes()

        /**
         * The rule ID.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-ruleid)
         */
        public fun ruleId(): String? = unwrap(this).getRuleId()

        /**
         * The rule version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-ruleversion)
         */
        public fun ruleVersion(): String? = unwrap(this).getRuleVersion()

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-tags)
         */
        public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

        /** A builder for [RuleProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param arn The rule ARN. */
            public fun arn(arn: String)

            /** @param createdTime Timestamp for when the rule was created. */
            public fun createdTime(createdTime: String)

            /** @param description The rule description. */
            public fun description(description: String)

            /** @param detectorId The detector for which the rule is associated. */
            public fun detectorId(detectorId: String)

            /**
             * @param expression The rule expression. A rule expression captures the business logic.
             *   For more information, see
             *   [Rule language reference](https://docs.aws.amazon.com/frauddetector/latest/ug/rule-language-reference.html)
             *   .
             */
            public fun expression(expression: String)

            /** @param language The rule language. Valid Value: DETECTORPL */
            public fun language(language: String)

            /** @param lastUpdatedTime Timestamp for when the rule was last updated. */
            public fun lastUpdatedTime(lastUpdatedTime: String)

            /** @param outcomes The rule outcome. */
            public fun outcomes(outcomes: IResolvable)

            /** @param outcomes The rule outcome. */
            public fun outcomes(outcomes: List<Any>)

            /** @param outcomes The rule outcome. */
            public fun outcomes(vararg outcomes: Any)

            /** @param ruleId The rule ID. */
            public fun ruleId(ruleId: String)

            /** @param ruleVersion The rule version. */
            public fun ruleVersion(ruleVersion: String)

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            public fun tags(tags: List<CfnTag>)

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            public fun tags(vararg tags: CfnTag)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty.Builder =
                software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty.builder()

            /** @param arn The rule ARN. */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            /** @param createdTime Timestamp for when the rule was created. */
            override fun createdTime(createdTime: String) {
                cdkBuilder.createdTime(createdTime)
            }

            /** @param description The rule description. */
            override fun description(description: String) {
                cdkBuilder.description(description)
            }

            /** @param detectorId The detector for which the rule is associated. */
            override fun detectorId(detectorId: String) {
                cdkBuilder.detectorId(detectorId)
            }

            /**
             * @param expression The rule expression. A rule expression captures the business logic.
             *   For more information, see
             *   [Rule language reference](https://docs.aws.amazon.com/frauddetector/latest/ug/rule-language-reference.html)
             *   .
             */
            override fun expression(expression: String) {
                cdkBuilder.expression(expression)
            }

            /** @param language The rule language. Valid Value: DETECTORPL */
            override fun language(language: String) {
                cdkBuilder.language(language)
            }

            /** @param lastUpdatedTime Timestamp for when the rule was last updated. */
            override fun lastUpdatedTime(lastUpdatedTime: String) {
                cdkBuilder.lastUpdatedTime(lastUpdatedTime)
            }

            /** @param outcomes The rule outcome. */
            override fun outcomes(outcomes: IResolvable) {
                cdkBuilder.outcomes(outcomes.let(IResolvable::unwrap))
            }

            /** @param outcomes The rule outcome. */
            override fun outcomes(outcomes: List<Any>) {
                cdkBuilder.outcomes(outcomes)
            }

            /** @param outcomes The rule outcome. */
            override fun outcomes(vararg outcomes: Any): Unit = outcomes(outcomes.toList())

            /** @param ruleId The rule ID. */
            override fun ruleId(ruleId: String) {
                cdkBuilder.ruleId(ruleId)
            }

            /** @param ruleVersion The rule version. */
            override fun ruleVersion(ruleVersion: String) {
                cdkBuilder.ruleVersion(ruleVersion)
            }

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            override fun tags(tags: List<CfnTag>) {
                cdkBuilder.tags(tags.map(CfnTag::unwrap))
            }

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

            public fun build():
                software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty,
        ) : RuleProperty {
            /**
             * The rule ARN.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-arn)
             */
            override fun arn(): String? = unwrap(this).getArn()

            /**
             * Timestamp for when the rule was created.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-createdtime)
             */
            override fun createdTime(): String? = unwrap(this).getCreatedTime()

            /**
             * The rule description.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-description)
             */
            override fun description(): String? = unwrap(this).getDescription()

            /**
             * The detector for which the rule is associated.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-detectorid)
             */
            override fun detectorId(): String? = unwrap(this).getDetectorId()

            /**
             * The rule expression.
             *
             * A rule expression captures the business logic. For more information, see
             * [Rule language reference](https://docs.aws.amazon.com/frauddetector/latest/ug/rule-language-reference.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-expression)
             */
            override fun expression(): String? = unwrap(this).getExpression()

            /**
             * The rule language.
             *
             * Valid Value: DETECTORPL
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-language)
             */
            override fun language(): String? = unwrap(this).getLanguage()

            /**
             * Timestamp for when the rule was last updated.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-lastupdatedtime)
             */
            override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

            /**
             * The rule outcome.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-outcomes)
             */
            override fun outcomes(): Any? = unwrap(this).getOutcomes()

            /**
             * The rule ID.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-ruleid)
             */
            override fun ruleId(): String? = unwrap(this).getRuleId()

            /**
             * The rule version.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-ruleversion)
             */
            override fun ruleVersion(): String? = unwrap(this).getRuleVersion()

            /**
             * An array of key-value pairs to apply to this resource.
             *
             * For more information, see
             * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-rule.html#cfn-frauddetector-detector-rule-tags)
             */
            override fun tags(): List<CfnTag> =
                unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty
            ): RuleProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: RuleProperty
            ): software.amazon.awscdk.services.frauddetector.CfnDetector.RuleProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ModelProperty {
        /**
         * The ARN of the model.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-model.html#cfn-frauddetector-detector-model-arn)
         */
        public fun arn(): String? = unwrap(this).getArn()

        /** A builder for [ModelProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param arn The ARN of the model. */
            public fun arn(arn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty.Builder =
                software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty.builder()

            /** @param arn The ARN of the model. */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            public fun build():
                software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty,
        ) : ModelProperty {
            /**
             * The ARN of the model.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-model.html#cfn-frauddetector-detector-model-arn)
             */
            override fun arn(): String? = unwrap(this).getArn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ModelProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty
            ): ModelProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ModelProperty
            ): software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface EntityTypeProperty {
        /**
         * The entity type ARN.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-arn)
         */
        public fun arn(): String? = unwrap(this).getArn()

        /**
         * Timestamp of when the entity type was created.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-createdtime)
         */
        public fun createdTime(): String? = unwrap(this).getCreatedTime()

        /**
         * The entity type description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-description)
         */
        public fun description(): String? = unwrap(this).getDescription()

        /**
         * Indicates whether the resource is defined within this CloudFormation template and impacts
         * the create, update, and delete behavior of the stack.
         *
         * If the value is `true` , CloudFormation will create/update/delete the resource when
         * creating/updating/deleting the stack. If the value is `false` , CloudFormation will
         * validate that the object exists and then use it within the resource without making
         * changes to the object.
         *
         * For example, when creating `AWS::FraudDetector::Detector` you must define at least two
         * variables. You can set `Inline=true` for these Variables and CloudFormation will
         * create/update/delete the variables as part of stack operations. However, if you set
         * `Inline=false` , CloudFormation will associate the variables to your detector but not
         * execute any changes to the variables.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-inline)
         */
        public fun `inline`(): Any? = unwrap(this).getInline()

        /**
         * Timestamp of when the entity type was last updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-lastupdatedtime)
         */
        public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

        /**
         * The entity type name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-name)
         */
        public fun name(): String? = unwrap(this).getName()

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-tags)
         */
        public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

        /** A builder for [EntityTypeProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param arn The entity type ARN. */
            public fun arn(arn: String)

            /** @param createdTime Timestamp of when the entity type was created. */
            public fun createdTime(createdTime: String)

            /** @param description The entity type description. */
            public fun description(description: String)

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these Variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            public fun `inline`(`inline`: Boolean)

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these Variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            public fun `inline`(`inline`: IResolvable)

            /** @param lastUpdatedTime Timestamp of when the entity type was last updated. */
            public fun lastUpdatedTime(lastUpdatedTime: String)

            /** @param name The entity type name. */
            public fun name(name: String)

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            public fun tags(tags: List<CfnTag>)

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            public fun tags(vararg tags: CfnTag)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty.Builder =
                software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty
                    .builder()

            /** @param arn The entity type ARN. */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            /** @param createdTime Timestamp of when the entity type was created. */
            override fun createdTime(createdTime: String) {
                cdkBuilder.createdTime(createdTime)
            }

            /** @param description The entity type description. */
            override fun description(description: String) {
                cdkBuilder.description(description)
            }

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these Variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            override fun `inline`(`inline`: Boolean) {
                cdkBuilder.`inline`(`inline`)
            }

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these Variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            override fun `inline`(`inline`: IResolvable) {
                cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
            }

            /** @param lastUpdatedTime Timestamp of when the entity type was last updated. */
            override fun lastUpdatedTime(lastUpdatedTime: String) {
                cdkBuilder.lastUpdatedTime(lastUpdatedTime)
            }

            /** @param name The entity type name. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            override fun tags(tags: List<CfnTag>) {
                cdkBuilder.tags(tags.map(CfnTag::unwrap))
            }

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

            public fun build():
                software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty,
        ) : EntityTypeProperty {
            /**
             * The entity type ARN.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-arn)
             */
            override fun arn(): String? = unwrap(this).getArn()

            /**
             * Timestamp of when the entity type was created.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-createdtime)
             */
            override fun createdTime(): String? = unwrap(this).getCreatedTime()

            /**
             * The entity type description.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-description)
             */
            override fun description(): String? = unwrap(this).getDescription()

            /**
             * Indicates whether the resource is defined within this CloudFormation template and
             * impacts the create, update, and delete behavior of the stack.
             *
             * If the value is `true` , CloudFormation will create/update/delete the resource when
             * creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             * validate that the object exists and then use it within the resource without making
             * changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these Variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-inline)
             */
            override fun `inline`(): Any? = unwrap(this).getInline()

            /**
             * Timestamp of when the entity type was last updated.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-lastupdatedtime)
             */
            override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

            /**
             * The entity type name.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-name)
             */
            override fun name(): String? = unwrap(this).getName()

            /**
             * An array of key-value pairs to apply to this resource.
             *
             * For more information, see
             * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html#cfn-frauddetector-detector-entitytype-tags)
             */
            override fun tags(): List<CfnTag> =
                unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): EntityTypeProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty
            ): EntityTypeProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EntityTypeProperty
            ): software.amazon.awscdk.services.frauddetector.CfnDetector.EntityTypeProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface EventVariableProperty {
        /**
         * The event variable ARN.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-arn)
         */
        public fun arn(): String? = unwrap(this).getArn()

        /**
         * Timestamp for when the event variable was created.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-createdtime)
         */
        public fun createdTime(): String? = unwrap(this).getCreatedTime()

        /**
         * The data source of the event variable.
         *
         * Valid values: `EVENT | EXTERNAL_MODEL_SCORE`
         *
         * When defining a variable within a detector, you can only use the `EVENT` value for
         * DataSource when the *Inline* property is set to true. If the *Inline* property is set
         * false, you can use either `EVENT` or `MODEL_SCORE` for DataSource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-datasource)
         */
        public fun dataSource(): String? = unwrap(this).getDataSource()

        /**
         * The data type of the event variable.
         *
         * Valid values: `STRING | INTEGER | BOOLEAN | FLOAT`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-datatype)
         */
        public fun dataType(): String? = unwrap(this).getDataType()

        /**
         * The default value of the event variable.
         *
         * This is required if you are providing the details of your variables instead of the ARN.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-defaultvalue)
         */
        public fun defaultValue(): String? = unwrap(this).getDefaultValue()

        /**
         * The description of the event variable.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-description)
         */
        public fun description(): String? = unwrap(this).getDescription()

        /**
         * Indicates whether the resource is defined within this CloudFormation template and impacts
         * the create, update, and delete behavior of the stack.
         *
         * If the value is `true` , CloudFormation will create/update/delete the resource when
         * creating/updating/deleting the stack. If the value is `false` , CloudFormation will
         * validate that the object exists and then use it within the resource without making
         * changes to the object.
         *
         * For example, when creating `AWS::FraudDetector::Detector` you must define at least two
         * variables. You can set `Inline=true` for these variables and CloudFormation will
         * create/update/delete the variables as part of stack operations. However, if you set
         * `Inline=false` , CloudFormation will associate the variables to your detector but not
         * execute any changes to the variables.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-inline)
         */
        public fun `inline`(): Any? = unwrap(this).getInline()

        /**
         * Timestamp for when the event variable was last updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-lastupdatedtime)
         */
        public fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

        /**
         * The name of the event variable.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-name)
         */
        public fun name(): String? = unwrap(this).getName()

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-tags)
         */
        public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

        /**
         * The type of event variable.
         *
         * For more information, see
         * [Variable types](https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-variabletype)
         */
        public fun variableType(): String? = unwrap(this).getVariableType()

        /** A builder for [EventVariableProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param arn The event variable ARN. */
            public fun arn(arn: String)

            /** @param createdTime Timestamp for when the event variable was created. */
            public fun createdTime(createdTime: String)

            /**
             * @param dataSource The data source of the event variable. Valid values: `EVENT |
             *   EXTERNAL_MODEL_SCORE`
             *
             * When defining a variable within a detector, you can only use the `EVENT` value for
             * DataSource when the *Inline* property is set to true. If the *Inline* property is set
             * false, you can use either `EVENT` or `MODEL_SCORE` for DataSource.
             */
            public fun dataSource(dataSource: String)

            /**
             * @param dataType The data type of the event variable. Valid values: `STRING | INTEGER
             *   | BOOLEAN | FLOAT`
             */
            public fun dataType(dataType: String)

            /**
             * @param defaultValue The default value of the event variable. This is required if you
             *   are providing the details of your variables instead of the ARN.
             */
            public fun defaultValue(defaultValue: String)

            /** @param description The description of the event variable. */
            public fun description(description: String)

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            public fun `inline`(`inline`: Boolean)

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            public fun `inline`(`inline`: IResolvable)

            /** @param lastUpdatedTime Timestamp for when the event variable was last updated. */
            public fun lastUpdatedTime(lastUpdatedTime: String)

            /** @param name The name of the event variable. */
            public fun name(name: String)

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            public fun tags(tags: List<CfnTag>)

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            public fun tags(vararg tags: CfnTag)

            /**
             * @param variableType The type of event variable. For more information, see
             *   [Variable types](https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types)
             *   .
             */
            public fun variableType(variableType: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty.Builder =
                software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty
                    .builder()

            /** @param arn The event variable ARN. */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            /** @param createdTime Timestamp for when the event variable was created. */
            override fun createdTime(createdTime: String) {
                cdkBuilder.createdTime(createdTime)
            }

            /**
             * @param dataSource The data source of the event variable. Valid values: `EVENT |
             *   EXTERNAL_MODEL_SCORE`
             *
             * When defining a variable within a detector, you can only use the `EVENT` value for
             * DataSource when the *Inline* property is set to true. If the *Inline* property is set
             * false, you can use either `EVENT` or `MODEL_SCORE` for DataSource.
             */
            override fun dataSource(dataSource: String) {
                cdkBuilder.dataSource(dataSource)
            }

            /**
             * @param dataType The data type of the event variable. Valid values: `STRING | INTEGER
             *   | BOOLEAN | FLOAT`
             */
            override fun dataType(dataType: String) {
                cdkBuilder.dataType(dataType)
            }

            /**
             * @param defaultValue The default value of the event variable. This is required if you
             *   are providing the details of your variables instead of the ARN.
             */
            override fun defaultValue(defaultValue: String) {
                cdkBuilder.defaultValue(defaultValue)
            }

            /** @param description The description of the event variable. */
            override fun description(description: String) {
                cdkBuilder.description(description)
            }

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            override fun `inline`(`inline`: Boolean) {
                cdkBuilder.`inline`(`inline`)
            }

            /**
             * @param inline Indicates whether the resource is defined within this CloudFormation
             *   template and impacts the create, update, and delete behavior of the stack. If the
             *   value is `true` , CloudFormation will create/update/delete the resource when
             *   creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             *   validate that the object exists and then use it within the resource without making
             *   changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             */
            override fun `inline`(`inline`: IResolvable) {
                cdkBuilder.`inline`(`inline`.let(IResolvable::unwrap))
            }

            /** @param lastUpdatedTime Timestamp for when the event variable was last updated. */
            override fun lastUpdatedTime(lastUpdatedTime: String) {
                cdkBuilder.lastUpdatedTime(lastUpdatedTime)
            }

            /** @param name The name of the event variable. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            override fun tags(tags: List<CfnTag>) {
                cdkBuilder.tags(tags.map(CfnTag::unwrap))
            }

            /**
             * @param tags An array of key-value pairs to apply to this resource. For more
             *   information, see
             *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             *   .
             */
            override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

            /**
             * @param variableType The type of event variable. For more information, see
             *   [Variable types](https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types)
             *   .
             */
            override fun variableType(variableType: String) {
                cdkBuilder.variableType(variableType)
            }

            public fun build():
                software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty,
        ) : EventVariableProperty {
            /**
             * The event variable ARN.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-arn)
             */
            override fun arn(): String? = unwrap(this).getArn()

            /**
             * Timestamp for when the event variable was created.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-createdtime)
             */
            override fun createdTime(): String? = unwrap(this).getCreatedTime()

            /**
             * The data source of the event variable.
             *
             * Valid values: `EVENT | EXTERNAL_MODEL_SCORE`
             *
             * When defining a variable within a detector, you can only use the `EVENT` value for
             * DataSource when the *Inline* property is set to true. If the *Inline* property is set
             * false, you can use either `EVENT` or `MODEL_SCORE` for DataSource.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-datasource)
             */
            override fun dataSource(): String? = unwrap(this).getDataSource()

            /**
             * The data type of the event variable.
             *
             * Valid values: `STRING | INTEGER | BOOLEAN | FLOAT`
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-datatype)
             */
            override fun dataType(): String? = unwrap(this).getDataType()

            /**
             * The default value of the event variable.
             *
             * This is required if you are providing the details of your variables instead of the
             * ARN.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-defaultvalue)
             */
            override fun defaultValue(): String? = unwrap(this).getDefaultValue()

            /**
             * The description of the event variable.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-description)
             */
            override fun description(): String? = unwrap(this).getDescription()

            /**
             * Indicates whether the resource is defined within this CloudFormation template and
             * impacts the create, update, and delete behavior of the stack.
             *
             * If the value is `true` , CloudFormation will create/update/delete the resource when
             * creating/updating/deleting the stack. If the value is `false` , CloudFormation will
             * validate that the object exists and then use it within the resource without making
             * changes to the object.
             *
             * For example, when creating `AWS::FraudDetector::Detector` you must define at least
             * two variables. You can set `Inline=true` for these variables and CloudFormation will
             * create/update/delete the variables as part of stack operations. However, if you set
             * `Inline=false` , CloudFormation will associate the variables to your detector but not
             * execute any changes to the variables.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-inline)
             */
            override fun `inline`(): Any? = unwrap(this).getInline()

            /**
             * Timestamp for when the event variable was last updated.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-lastupdatedtime)
             */
            override fun lastUpdatedTime(): String? = unwrap(this).getLastUpdatedTime()

            /**
             * The name of the event variable.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-name)
             */
            override fun name(): String? = unwrap(this).getName()

            /**
             * An array of key-value pairs to apply to this resource.
             *
             * For more information, see
             * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-tags)
             */
            override fun tags(): List<CfnTag> =
                unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

            /**
             * The type of event variable.
             *
             * For more information, see
             * [Variable types](https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventvariable.html#cfn-frauddetector-detector-eventvariable-variabletype)
             */
            override fun variableType(): String? = unwrap(this).getVariableType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): EventVariableProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty
            ): EventVariableProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EventVariableProperty
            ): software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
