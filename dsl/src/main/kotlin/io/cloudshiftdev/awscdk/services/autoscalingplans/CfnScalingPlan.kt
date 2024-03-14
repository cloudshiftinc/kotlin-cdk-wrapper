package io.cloudshiftdev.awscdk.services.autoscalingplans

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScalingPlan
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan,
) : CfnResource(cdkObject), IInspectable {
    /** A CloudFormation stack or a set of tags. */
    public open fun applicationSource(): Any = unwrap(this).getApplicationSource()

    /** A CloudFormation stack or a set of tags. */
    public open fun applicationSource(`value`: IResolvable) {
        unwrap(this).setApplicationSource(`value`.let(IResolvable::unwrap))
    }

    /** A CloudFormation stack or a set of tags. */
    public open fun applicationSource(`value`: ApplicationSourceProperty) {
        unwrap(this).setApplicationSource(`value`.let(ApplicationSourceProperty::unwrap))
    }

    /** A CloudFormation stack or a set of tags. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08816efed08b8fd5398999854e4101af54fa8fc737993b68b8cea8033a1c7390")
    public open fun applicationSource(`value`: ApplicationSourceProperty.Builder.() -> Unit): Unit =
        applicationSource(ApplicationSourceProperty(`value`))

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**  */
    public open fun attrScalingPlanName(): String = unwrap(this).getAttrScalingPlanName()

    /**  */
    public open fun attrScalingPlanVersion(): String = unwrap(this).getAttrScalingPlanVersion()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The scaling instructions. */
    public open fun scalingInstructions(): Any = unwrap(this).getScalingInstructions()

    /** The scaling instructions. */
    public open fun scalingInstructions(`value`: IResolvable) {
        unwrap(this).setScalingInstructions(`value`.let(IResolvable::unwrap))
    }

    /** The scaling instructions. */
    public open fun scalingInstructions(__idx_ac66f0: List<Any>) {
        unwrap(this).setScalingInstructions(__idx_ac66f0)
    }

    /** The scaling instructions. */
    public open fun scalingInstructions(vararg __idx_ac66f0: Any): Unit =
        scalingInstructions(__idx_ac66f0.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.autoscalingplans.CfnScalingPlan]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * A CloudFormation stack or a set of tags.
         *
         * You can create one scaling plan per application source. The `ApplicationSource` property
         * must be present to ensure interoperability with the AWS Auto Scaling console.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
         *
         * @param applicationSource A CloudFormation stack or a set of tags.
         */
        public fun applicationSource(applicationSource: IResolvable)

        /**
         * A CloudFormation stack or a set of tags.
         *
         * You can create one scaling plan per application source. The `ApplicationSource` property
         * must be present to ensure interoperability with the AWS Auto Scaling console.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
         *
         * @param applicationSource A CloudFormation stack or a set of tags.
         */
        public fun applicationSource(applicationSource: ApplicationSourceProperty)

        /**
         * A CloudFormation stack or a set of tags.
         *
         * You can create one scaling plan per application source. The `ApplicationSource` property
         * must be present to ensure interoperability with the AWS Auto Scaling console.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
         *
         * @param applicationSource A CloudFormation stack or a set of tags.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("59c39acd531637587b5ce935b35b38315e0c2052909bebcd5ff5c0c8ddcdcaa0")
        public fun applicationSource(
            applicationSource: ApplicationSourceProperty.Builder.() -> Unit
        )

        /**
         * The scaling instructions.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
         *
         * @param scalingInstructions The scaling instructions.
         */
        public fun scalingInstructions(scalingInstructions: IResolvable)

        /**
         * The scaling instructions.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
         *
         * @param scalingInstructions The scaling instructions.
         */
        public fun scalingInstructions(scalingInstructions: List<Any>)

        /**
         * The scaling instructions.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
         *
         * @param scalingInstructions The scaling instructions.
         */
        public fun scalingInstructions(vararg scalingInstructions: Any)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.Builder =
            software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.Builder.create(
                scope,
                id
            )

        /**
         * A CloudFormation stack or a set of tags.
         *
         * You can create one scaling plan per application source. The `ApplicationSource` property
         * must be present to ensure interoperability with the AWS Auto Scaling console.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
         *
         * @param applicationSource A CloudFormation stack or a set of tags.
         */
        override fun applicationSource(applicationSource: IResolvable) {
            cdkBuilder.applicationSource(applicationSource.let(IResolvable::unwrap))
        }

        /**
         * A CloudFormation stack or a set of tags.
         *
         * You can create one scaling plan per application source. The `ApplicationSource` property
         * must be present to ensure interoperability with the AWS Auto Scaling console.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
         *
         * @param applicationSource A CloudFormation stack or a set of tags.
         */
        override fun applicationSource(applicationSource: ApplicationSourceProperty) {
            cdkBuilder.applicationSource(applicationSource.let(ApplicationSourceProperty::unwrap))
        }

        /**
         * A CloudFormation stack or a set of tags.
         *
         * You can create one scaling plan per application source. The `ApplicationSource` property
         * must be present to ensure interoperability with the AWS Auto Scaling console.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
         *
         * @param applicationSource A CloudFormation stack or a set of tags.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("59c39acd531637587b5ce935b35b38315e0c2052909bebcd5ff5c0c8ddcdcaa0")
        override fun applicationSource(
            applicationSource: ApplicationSourceProperty.Builder.() -> Unit
        ): Unit = applicationSource(ApplicationSourceProperty(applicationSource))

        /**
         * The scaling instructions.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
         *
         * @param scalingInstructions The scaling instructions.
         */
        override fun scalingInstructions(scalingInstructions: IResolvable) {
            cdkBuilder.scalingInstructions(scalingInstructions.let(IResolvable::unwrap))
        }

        /**
         * The scaling instructions.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
         *
         * @param scalingInstructions The scaling instructions.
         */
        override fun scalingInstructions(scalingInstructions: List<Any>) {
            cdkBuilder.scalingInstructions(scalingInstructions)
        }

        /**
         * The scaling instructions.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
         *
         * @param scalingInstructions The scaling instructions.
         */
        override fun scalingInstructions(vararg scalingInstructions: Any): Unit =
            scalingInstructions(scalingInstructions.toList())

        public fun build(): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnScalingPlan {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnScalingPlan(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
        ): CfnScalingPlan = CfnScalingPlan(cdkObject)

        internal fun unwrap(
            wrapped: CfnScalingPlan
        ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan = wrapped.cdkObject
    }

    public interface TagFilterProperty {
        /**
         * The tag key.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html#cfn-autoscalingplans-scalingplan-tagfilter-key)
         */
        public fun key(): String

        /**
         * The tag values (0 to 20).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html#cfn-autoscalingplans-scalingplan-tagfilter-values)
         */
        public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

        /** A builder for [TagFilterProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param key The tag key. */
            public fun key(key: String)

            /** @param values The tag values (0 to 20). */
            public fun values(values: List<String>)

            /** @param values The tag values (0 to 20). */
            public fun values(vararg values: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty.Builder =
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty
                    .builder()

            /** @param key The tag key. */
            override fun key(key: String) {
                cdkBuilder.key(key)
            }

            /** @param values The tag values (0 to 20). */
            override fun values(values: List<String>) {
                cdkBuilder.values(values)
            }

            /** @param values The tag values (0 to 20). */
            override fun values(vararg values: String): Unit = values(values.toList())

            public fun build():
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty,
        ) : TagFilterProperty {
            /**
             * The tag key.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html#cfn-autoscalingplans-scalingplan-tagfilter-key)
             */
            override fun key(): String = unwrap(this).getKey()

            /**
             * The tag values (0 to 20).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html#cfn-autoscalingplans-scalingplan-tagfilter-values)
             */
            override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): TagFilterProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty
            ): TagFilterProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TagFilterProperty
            ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface TargetTrackingConfigurationProperty {
        /**
         * A customized metric.
         *
         * You can specify either a predefined metric or a customized metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-customizedscalingmetricspecification)
         */
        public fun customizedScalingMetricSpecification(): Any? =
            unwrap(this).getCustomizedScalingMetricSpecification()

        /**
         * Indicates whether scale in by the target tracking scaling policy is disabled.
         *
         * If the value is `true` , scale in is disabled and the target tracking scaling policy
         * doesn't remove capacity from the scalable resource. Otherwise, scale in is enabled and
         * the target tracking scaling policy can remove capacity from the scalable resource.
         *
         * The default value is `false` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein)
         */
        public fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

        /**
         * The estimated time, in seconds, until a newly launched instance can contribute to the
         * CloudWatch metrics.
         *
         * This value is used only if the resource is an Auto Scaling group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup)
         */
        public fun estimatedInstanceWarmup(): Number? = unwrap(this).getEstimatedInstanceWarmup()

        /**
         * A predefined metric.
         *
         * You can specify either a predefined metric or a customized metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-predefinedscalingmetricspecification)
         */
        public fun predefinedScalingMetricSpecification(): Any? =
            unwrap(this).getPredefinedScalingMetricSpecification()

        /**
         * The amount of time, in seconds, after a scale-in activity completes before another scale
         * in activity can start.
         *
         * This value is not used if the scalable resource is an Auto Scaling group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown)
         */
        public fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

        /**
         * The amount of time, in seconds, after a scale-out activity completes before another
         * scale-out activity can start.
         *
         * This value is not used if the scalable resource is an Auto Scaling group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown)
         */
        public fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

        /**
         * The target value for the metric.
         *
         * Although this property accepts numbers of type Double, it won't accept values that are
         * either too small or too large. Values must be in the range of -2^360 to 2^360.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue)
         */
        public fun targetValue(): Number

        /** A builder for [TargetTrackingConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param customizedScalingMetricSpecification A customized metric. You can specify
             *   either a predefined metric or a customized metric.
             */
            public fun customizedScalingMetricSpecification(
                customizedScalingMetricSpecification: IResolvable
            )

            /**
             * @param customizedScalingMetricSpecification A customized metric. You can specify
             *   either a predefined metric or a customized metric.
             */
            public fun customizedScalingMetricSpecification(
                customizedScalingMetricSpecification: CustomizedScalingMetricSpecificationProperty
            )

            /**
             * @param customizedScalingMetricSpecification A customized metric. You can specify
             *   either a predefined metric or a customized metric.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("21a641c32153f8aa63fdd4d9171716567e8b16f69ba4187974f946cb0b0109c6")
            public fun customizedScalingMetricSpecification(
                customizedScalingMetricSpecification:
                    CustomizedScalingMetricSpecificationProperty.Builder.() -> Unit
            )

            /**
             * @param disableScaleIn Indicates whether scale in by the target tracking scaling
             *   policy is disabled. If the value is `true` , scale in is disabled and the target
             *   tracking scaling policy doesn't remove capacity from the scalable resource.
             *   Otherwise, scale in is enabled and the target tracking scaling policy can remove
             *   capacity from the scalable resource.
             *
             * The default value is `false` .
             */
            public fun disableScaleIn(disableScaleIn: Boolean)

            /**
             * @param disableScaleIn Indicates whether scale in by the target tracking scaling
             *   policy is disabled. If the value is `true` , scale in is disabled and the target
             *   tracking scaling policy doesn't remove capacity from the scalable resource.
             *   Otherwise, scale in is enabled and the target tracking scaling policy can remove
             *   capacity from the scalable resource.
             *
             * The default value is `false` .
             */
            public fun disableScaleIn(disableScaleIn: IResolvable)

            /**
             * @param estimatedInstanceWarmup The estimated time, in seconds, until a newly launched
             *   instance can contribute to the CloudWatch metrics. This value is used only if the
             *   resource is an Auto Scaling group.
             */
            public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number)

            /**
             * @param predefinedScalingMetricSpecification A predefined metric. You can specify
             *   either a predefined metric or a customized metric.
             */
            public fun predefinedScalingMetricSpecification(
                predefinedScalingMetricSpecification: IResolvable
            )

            /**
             * @param predefinedScalingMetricSpecification A predefined metric. You can specify
             *   either a predefined metric or a customized metric.
             */
            public fun predefinedScalingMetricSpecification(
                predefinedScalingMetricSpecification: PredefinedScalingMetricSpecificationProperty
            )

            /**
             * @param predefinedScalingMetricSpecification A predefined metric. You can specify
             *   either a predefined metric or a customized metric.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("4fac0d076170342ac4ce2296263a6555e9c1b27f89f5da59fe390ae01ef90023")
            public fun predefinedScalingMetricSpecification(
                predefinedScalingMetricSpecification:
                    PredefinedScalingMetricSpecificationProperty.Builder.() -> Unit
            )

            /**
             * @param scaleInCooldown The amount of time, in seconds, after a scale-in activity
             *   completes before another scale in activity can start. This value is not used if the
             *   scalable resource is an Auto Scaling group.
             */
            public fun scaleInCooldown(scaleInCooldown: Number)

            /**
             * @param scaleOutCooldown The amount of time, in seconds, after a scale-out activity
             *   completes before another scale-out activity can start. This value is not used if
             *   the scalable resource is an Auto Scaling group.
             */
            public fun scaleOutCooldown(scaleOutCooldown: Number)

            /**
             * @param targetValue The target value for the metric. Although this property accepts
             *   numbers of type Double, it won't accept values that are either too small or too
             *   large. Values must be in the range of -2^360 to 2^360.
             */
            public fun targetValue(targetValue: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder =
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
                    .TargetTrackingConfigurationProperty
                    .builder()

            /**
             * @param customizedScalingMetricSpecification A customized metric. You can specify
             *   either a predefined metric or a customized metric.
             */
            override fun customizedScalingMetricSpecification(
                customizedScalingMetricSpecification: IResolvable
            ) {
                cdkBuilder.customizedScalingMetricSpecification(
                    customizedScalingMetricSpecification.let(IResolvable::unwrap)
                )
            }

            /**
             * @param customizedScalingMetricSpecification A customized metric. You can specify
             *   either a predefined metric or a customized metric.
             */
            override fun customizedScalingMetricSpecification(
                customizedScalingMetricSpecification: CustomizedScalingMetricSpecificationProperty
            ) {
                cdkBuilder.customizedScalingMetricSpecification(
                    customizedScalingMetricSpecification.let(
                        CustomizedScalingMetricSpecificationProperty::unwrap
                    )
                )
            }

            /**
             * @param customizedScalingMetricSpecification A customized metric. You can specify
             *   either a predefined metric or a customized metric.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("21a641c32153f8aa63fdd4d9171716567e8b16f69ba4187974f946cb0b0109c6")
            override fun customizedScalingMetricSpecification(
                customizedScalingMetricSpecification:
                    CustomizedScalingMetricSpecificationProperty.Builder.() -> Unit
            ): Unit =
                customizedScalingMetricSpecification(
                    CustomizedScalingMetricSpecificationProperty(
                        customizedScalingMetricSpecification
                    )
                )

            /**
             * @param disableScaleIn Indicates whether scale in by the target tracking scaling
             *   policy is disabled. If the value is `true` , scale in is disabled and the target
             *   tracking scaling policy doesn't remove capacity from the scalable resource.
             *   Otherwise, scale in is enabled and the target tracking scaling policy can remove
             *   capacity from the scalable resource.
             *
             * The default value is `false` .
             */
            override fun disableScaleIn(disableScaleIn: Boolean) {
                cdkBuilder.disableScaleIn(disableScaleIn)
            }

            /**
             * @param disableScaleIn Indicates whether scale in by the target tracking scaling
             *   policy is disabled. If the value is `true` , scale in is disabled and the target
             *   tracking scaling policy doesn't remove capacity from the scalable resource.
             *   Otherwise, scale in is enabled and the target tracking scaling policy can remove
             *   capacity from the scalable resource.
             *
             * The default value is `false` .
             */
            override fun disableScaleIn(disableScaleIn: IResolvable) {
                cdkBuilder.disableScaleIn(disableScaleIn.let(IResolvable::unwrap))
            }

            /**
             * @param estimatedInstanceWarmup The estimated time, in seconds, until a newly launched
             *   instance can contribute to the CloudWatch metrics. This value is used only if the
             *   resource is an Auto Scaling group.
             */
            override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
                cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
            }

            /**
             * @param predefinedScalingMetricSpecification A predefined metric. You can specify
             *   either a predefined metric or a customized metric.
             */
            override fun predefinedScalingMetricSpecification(
                predefinedScalingMetricSpecification: IResolvable
            ) {
                cdkBuilder.predefinedScalingMetricSpecification(
                    predefinedScalingMetricSpecification.let(IResolvable::unwrap)
                )
            }

            /**
             * @param predefinedScalingMetricSpecification A predefined metric. You can specify
             *   either a predefined metric or a customized metric.
             */
            override fun predefinedScalingMetricSpecification(
                predefinedScalingMetricSpecification: PredefinedScalingMetricSpecificationProperty
            ) {
                cdkBuilder.predefinedScalingMetricSpecification(
                    predefinedScalingMetricSpecification.let(
                        PredefinedScalingMetricSpecificationProperty::unwrap
                    )
                )
            }

            /**
             * @param predefinedScalingMetricSpecification A predefined metric. You can specify
             *   either a predefined metric or a customized metric.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("4fac0d076170342ac4ce2296263a6555e9c1b27f89f5da59fe390ae01ef90023")
            override fun predefinedScalingMetricSpecification(
                predefinedScalingMetricSpecification:
                    PredefinedScalingMetricSpecificationProperty.Builder.() -> Unit
            ): Unit =
                predefinedScalingMetricSpecification(
                    PredefinedScalingMetricSpecificationProperty(
                        predefinedScalingMetricSpecification
                    )
                )

            /**
             * @param scaleInCooldown The amount of time, in seconds, after a scale-in activity
             *   completes before another scale in activity can start. This value is not used if the
             *   scalable resource is an Auto Scaling group.
             */
            override fun scaleInCooldown(scaleInCooldown: Number) {
                cdkBuilder.scaleInCooldown(scaleInCooldown)
            }

            /**
             * @param scaleOutCooldown The amount of time, in seconds, after a scale-out activity
             *   completes before another scale-out activity can start. This value is not used if
             *   the scalable resource is an Auto Scaling group.
             */
            override fun scaleOutCooldown(scaleOutCooldown: Number) {
                cdkBuilder.scaleOutCooldown(scaleOutCooldown)
            }

            /**
             * @param targetValue The target value for the metric. Although this property accepts
             *   numbers of type Double, it won't accept values that are either too small or too
             *   large. Values must be in the range of -2^360 to 2^360.
             */
            override fun targetValue(targetValue: Number) {
                cdkBuilder.targetValue(targetValue)
            }

            public fun build():
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty,
        ) : TargetTrackingConfigurationProperty {
            /**
             * A customized metric.
             *
             * You can specify either a predefined metric or a customized metric.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-customizedscalingmetricspecification)
             */
            override fun customizedScalingMetricSpecification(): Any? =
                unwrap(this).getCustomizedScalingMetricSpecification()

            /**
             * Indicates whether scale in by the target tracking scaling policy is disabled.
             *
             * If the value is `true` , scale in is disabled and the target tracking scaling policy
             * doesn't remove capacity from the scalable resource. Otherwise, scale in is enabled
             * and the target tracking scaling policy can remove capacity from the scalable
             * resource.
             *
             * The default value is `false` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein)
             */
            override fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

            /**
             * The estimated time, in seconds, until a newly launched instance can contribute to the
             * CloudWatch metrics.
             *
             * This value is used only if the resource is an Auto Scaling group.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup)
             */
            override fun estimatedInstanceWarmup(): Number? =
                unwrap(this).getEstimatedInstanceWarmup()

            /**
             * A predefined metric.
             *
             * You can specify either a predefined metric or a customized metric.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-predefinedscalingmetricspecification)
             */
            override fun predefinedScalingMetricSpecification(): Any? =
                unwrap(this).getPredefinedScalingMetricSpecification()

            /**
             * The amount of time, in seconds, after a scale-in activity completes before another
             * scale in activity can start.
             *
             * This value is not used if the scalable resource is an Auto Scaling group.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown)
             */
            override fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

            /**
             * The amount of time, in seconds, after a scale-out activity completes before another
             * scale-out activity can start.
             *
             * This value is not used if the scalable resource is an Auto Scaling group.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown)
             */
            override fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

            /**
             * The target value for the metric.
             *
             * Although this property accepts numbers of type Double, it won't accept values that
             * are either too small or too large. Values must be in the range of -2^360 to 2^360.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue)
             */
            override fun targetValue(): Number = unwrap(this).getTargetValue()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): TargetTrackingConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty
            ): TargetTrackingConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TargetTrackingConfigurationProperty
            ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MetricDimensionProperty {
        /**
         * The name of the dimension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html#cfn-autoscalingplans-scalingplan-metricdimension-name)
         */
        public fun name(): String

        /**
         * The value of the dimension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html#cfn-autoscalingplans-scalingplan-metricdimension-value)
         */
        public fun `value`(): String

        /** A builder for [MetricDimensionProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param name The name of the dimension. */
            public fun name(name: String)

            /** @param value The value of the dimension. */
            public fun `value`(`value`: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty.Builder =
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
                    .MetricDimensionProperty
                    .builder()

            /** @param name The name of the dimension. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /** @param value The value of the dimension. */
            override fun `value`(`value`: String) {
                cdkBuilder.`value`(`value`)
            }

            public fun build():
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty,
        ) : MetricDimensionProperty {
            /**
             * The name of the dimension.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html#cfn-autoscalingplans-scalingplan-metricdimension-name)
             */
            override fun name(): String = unwrap(this).getName()

            /**
             * The value of the dimension.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html#cfn-autoscalingplans-scalingplan-metricdimension-value)
             */
            override fun `value`(): String = unwrap(this).getValue()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty
            ): MetricDimensionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MetricDimensionProperty
            ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CustomizedLoadMetricSpecificationProperty {
        /**
         * The dimensions of the metric.
         *
         * Conditional: If you published your metric with dimensions, you must specify the same
         * dimensions in your customized load metric specification.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-dimensions)
         */
        public fun dimensions(): Any? = unwrap(this).getDimensions()

        /**
         * The name of the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-metricname)
         */
        public fun metricName(): String

        /**
         * The namespace of the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-namespace)
         */
        public fun namespace(): String

        /**
         * The statistic of the metric.
         *
         * *Allowed Values* : `Sum`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-statistic)
         */
        public fun statistic(): String

        /**
         * The unit of the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-unit)
         */
        public fun unit(): String? = unwrap(this).getUnit()

        /** A builder for [CustomizedLoadMetricSpecificationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param dimensions The dimensions of the metric. Conditional: If you published your
             *   metric with dimensions, you must specify the same dimensions in your customized
             *   load metric specification.
             */
            public fun dimensions(dimensions: IResolvable)

            /**
             * @param dimensions The dimensions of the metric. Conditional: If you published your
             *   metric with dimensions, you must specify the same dimensions in your customized
             *   load metric specification.
             */
            public fun dimensions(dimensions: List<Any>)

            /**
             * @param dimensions The dimensions of the metric. Conditional: If you published your
             *   metric with dimensions, you must specify the same dimensions in your customized
             *   load metric specification.
             */
            public fun dimensions(vararg dimensions: Any)

            /** @param metricName The name of the metric. */
            public fun metricName(metricName: String)

            /** @param namespace The namespace of the metric. */
            public fun namespace(namespace: String)

            /** @param statistic The statistic of the metric. *Allowed Values* : `Sum` */
            public fun statistic(statistic: String)

            /** @param unit The unit of the metric. */
            public fun unit(unit: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder =
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
                    .CustomizedLoadMetricSpecificationProperty
                    .builder()

            /**
             * @param dimensions The dimensions of the metric. Conditional: If you published your
             *   metric with dimensions, you must specify the same dimensions in your customized
             *   load metric specification.
             */
            override fun dimensions(dimensions: IResolvable) {
                cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
            }

            /**
             * @param dimensions The dimensions of the metric. Conditional: If you published your
             *   metric with dimensions, you must specify the same dimensions in your customized
             *   load metric specification.
             */
            override fun dimensions(dimensions: List<Any>) {
                cdkBuilder.dimensions(dimensions)
            }

            /**
             * @param dimensions The dimensions of the metric. Conditional: If you published your
             *   metric with dimensions, you must specify the same dimensions in your customized
             *   load metric specification.
             */
            override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

            /** @param metricName The name of the metric. */
            override fun metricName(metricName: String) {
                cdkBuilder.metricName(metricName)
            }

            /** @param namespace The namespace of the metric. */
            override fun namespace(namespace: String) {
                cdkBuilder.namespace(namespace)
            }

            /** @param statistic The statistic of the metric. *Allowed Values* : `Sum` */
            override fun statistic(statistic: String) {
                cdkBuilder.statistic(statistic)
            }

            /** @param unit The unit of the metric. */
            override fun unit(unit: String) {
                cdkBuilder.unit(unit)
            }

            public fun build():
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty,
        ) : CustomizedLoadMetricSpecificationProperty {
            /**
             * The dimensions of the metric.
             *
             * Conditional: If you published your metric with dimensions, you must specify the same
             * dimensions in your customized load metric specification.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-dimensions)
             */
            override fun dimensions(): Any? = unwrap(this).getDimensions()

            /**
             * The name of the metric.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-metricname)
             */
            override fun metricName(): String = unwrap(this).getMetricName()

            /**
             * The namespace of the metric.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-namespace)
             */
            override fun namespace(): String = unwrap(this).getNamespace()

            /**
             * The statistic of the metric.
             *
             * *Allowed Values* : `Sum`
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-statistic)
             */
            override fun statistic(): String = unwrap(this).getStatistic()

            /**
             * The unit of the metric.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedloadmetricspecification-unit)
             */
            override fun unit(): String? = unwrap(this).getUnit()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): CustomizedLoadMetricSpecificationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty
            ): CustomizedLoadMetricSpecificationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CustomizedLoadMetricSpecificationProperty
            ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CustomizedScalingMetricSpecificationProperty {
        /**
         * The dimensions of the metric.
         *
         * Conditional: If you published your metric with dimensions, you must specify the same
         * dimensions in your scaling policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-dimensions)
         */
        public fun dimensions(): Any? = unwrap(this).getDimensions()

        /**
         * The name of the metric.
         *
         * To get the exact metric name, namespace, and dimensions, inspect the
         * [Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
         * object that is returned by a call to
         * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-metricname)
         */
        public fun metricName(): String

        /**
         * The namespace of the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-namespace)
         */
        public fun namespace(): String

        /**
         * The statistic of the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-statistic)
         */
        public fun statistic(): String

        /**
         * The unit of the metric.
         *
         * For a complete list of the units that CloudWatch supports, see the
         * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
         * data type in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-unit)
         */
        public fun unit(): String? = unwrap(this).getUnit()

        /** A builder for [CustomizedScalingMetricSpecificationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param dimensions The dimensions of the metric. Conditional: If you published your
             *   metric with dimensions, you must specify the same dimensions in your scaling
             *   policy.
             */
            public fun dimensions(dimensions: IResolvable)

            /**
             * @param dimensions The dimensions of the metric. Conditional: If you published your
             *   metric with dimensions, you must specify the same dimensions in your scaling
             *   policy.
             */
            public fun dimensions(dimensions: List<Any>)

            /**
             * @param dimensions The dimensions of the metric. Conditional: If you published your
             *   metric with dimensions, you must specify the same dimensions in your scaling
             *   policy.
             */
            public fun dimensions(vararg dimensions: Any)

            /**
             * @param metricName The name of the metric. To get the exact metric name, namespace,
             *   and dimensions, inspect the
             *   [Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
             *   object that is returned by a call to
             *   [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
             *   .
             */
            public fun metricName(metricName: String)

            /** @param namespace The namespace of the metric. */
            public fun namespace(namespace: String)

            /** @param statistic The statistic of the metric. */
            public fun statistic(statistic: String)

            /**
             * @param unit The unit of the metric. For a complete list of the units that CloudWatch
             *   supports, see the
             *   [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
             *   data type in the *Amazon CloudWatch API Reference* .
             */
            public fun unit(unit: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder =
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
                    .CustomizedScalingMetricSpecificationProperty
                    .builder()

            /**
             * @param dimensions The dimensions of the metric. Conditional: If you published your
             *   metric with dimensions, you must specify the same dimensions in your scaling
             *   policy.
             */
            override fun dimensions(dimensions: IResolvable) {
                cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
            }

            /**
             * @param dimensions The dimensions of the metric. Conditional: If you published your
             *   metric with dimensions, you must specify the same dimensions in your scaling
             *   policy.
             */
            override fun dimensions(dimensions: List<Any>) {
                cdkBuilder.dimensions(dimensions)
            }

            /**
             * @param dimensions The dimensions of the metric. Conditional: If you published your
             *   metric with dimensions, you must specify the same dimensions in your scaling
             *   policy.
             */
            override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

            /**
             * @param metricName The name of the metric. To get the exact metric name, namespace,
             *   and dimensions, inspect the
             *   [Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
             *   object that is returned by a call to
             *   [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
             *   .
             */
            override fun metricName(metricName: String) {
                cdkBuilder.metricName(metricName)
            }

            /** @param namespace The namespace of the metric. */
            override fun namespace(namespace: String) {
                cdkBuilder.namespace(namespace)
            }

            /** @param statistic The statistic of the metric. */
            override fun statistic(statistic: String) {
                cdkBuilder.statistic(statistic)
            }

            /**
             * @param unit The unit of the metric. For a complete list of the units that CloudWatch
             *   supports, see the
             *   [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
             *   data type in the *Amazon CloudWatch API Reference* .
             */
            override fun unit(unit: String) {
                cdkBuilder.unit(unit)
            }

            public fun build():
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty,
        ) : CustomizedScalingMetricSpecificationProperty {
            /**
             * The dimensions of the metric.
             *
             * Conditional: If you published your metric with dimensions, you must specify the same
             * dimensions in your scaling policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-dimensions)
             */
            override fun dimensions(): Any? = unwrap(this).getDimensions()

            /**
             * The name of the metric.
             *
             * To get the exact metric name, namespace, and dimensions, inspect the
             * [Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
             * object that is returned by a call to
             * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-metricname)
             */
            override fun metricName(): String = unwrap(this).getMetricName()

            /**
             * The namespace of the metric.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-namespace)
             */
            override fun namespace(): String = unwrap(this).getNamespace()

            /**
             * The statistic of the metric.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-statistic)
             */
            override fun statistic(): String = unwrap(this).getStatistic()

            /**
             * The unit of the metric.
             *
             * For a complete list of the units that CloudWatch supports, see the
             * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
             * data type in the *Amazon CloudWatch API Reference* .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-unit)
             */
            override fun unit(): String? = unwrap(this).getUnit()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): CustomizedScalingMetricSpecificationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty
            ): CustomizedScalingMetricSpecificationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CustomizedScalingMetricSpecificationProperty
            ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ApplicationSourceProperty {
        /**
         * The Amazon Resource Name (ARN) of a CloudFormation stack.
         *
         * You must specify either a `CloudFormationStackARN` or `TagFilters` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-cloudformationstackarn)
         */
        public fun cloudFormationStackArn(): String? = unwrap(this).getCloudFormationStackArn()

        /**
         * A set of tag filters (keys and values).
         *
         * Each tag filter specified must contain a key with values as optional. Each scaling plan
         * can include up to 50 keys, and each key can include up to 20 values.
         *
         * Tags are part of the syntax that you use to specify the resources you want returned when
         * configuring a scaling plan from the AWS Auto Scaling console. You do not need to specify
         * valid tag filter values when you create a scaling plan with CloudFormation. The `Key` and
         * `Values` properties can accept any value as long as the combination of values is unique
         * across scaling plans. However, if you also want to use the AWS Auto Scaling console to
         * edit the scaling plan, then you must specify valid values.
         *
         * You must specify either a `CloudFormationStackARN` or `TagFilters` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-tagfilters)
         */
        public fun tagFilters(): Any? = unwrap(this).getTagFilters()

        /** A builder for [ApplicationSourceProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param cloudFormationStackArn The Amazon Resource Name (ARN) of a CloudFormation
             *   stack. You must specify either a `CloudFormationStackARN` or `TagFilters` .
             */
            public fun cloudFormationStackArn(cloudFormationStackArn: String)

            /**
             * @param tagFilters A set of tag filters (keys and values). Each tag filter specified
             *   must contain a key with values as optional. Each scaling plan can include up to 50
             *   keys, and each key can include up to 20 values.
             *
             * Tags are part of the syntax that you use to specify the resources you want returned
             * when configuring a scaling plan from the AWS Auto Scaling console. You do not need to
             * specify valid tag filter values when you create a scaling plan with CloudFormation.
             * The `Key` and `Values` properties can accept any value as long as the combination of
             * values is unique across scaling plans. However, if you also want to use the AWS Auto
             * Scaling console to edit the scaling plan, then you must specify valid values.
             *
             * You must specify either a `CloudFormationStackARN` or `TagFilters` .
             */
            public fun tagFilters(tagFilters: IResolvable)

            /**
             * @param tagFilters A set of tag filters (keys and values). Each tag filter specified
             *   must contain a key with values as optional. Each scaling plan can include up to 50
             *   keys, and each key can include up to 20 values.
             *
             * Tags are part of the syntax that you use to specify the resources you want returned
             * when configuring a scaling plan from the AWS Auto Scaling console. You do not need to
             * specify valid tag filter values when you create a scaling plan with CloudFormation.
             * The `Key` and `Values` properties can accept any value as long as the combination of
             * values is unique across scaling plans. However, if you also want to use the AWS Auto
             * Scaling console to edit the scaling plan, then you must specify valid values.
             *
             * You must specify either a `CloudFormationStackARN` or `TagFilters` .
             */
            public fun tagFilters(tagFilters: List<Any>)

            /**
             * @param tagFilters A set of tag filters (keys and values). Each tag filter specified
             *   must contain a key with values as optional. Each scaling plan can include up to 50
             *   keys, and each key can include up to 20 values.
             *
             * Tags are part of the syntax that you use to specify the resources you want returned
             * when configuring a scaling plan from the AWS Auto Scaling console. You do not need to
             * specify valid tag filter values when you create a scaling plan with CloudFormation.
             * The `Key` and `Values` properties can accept any value as long as the combination of
             * values is unique across scaling plans. However, if you also want to use the AWS Auto
             * Scaling console to edit the scaling plan, then you must specify valid values.
             *
             * You must specify either a `CloudFormationStackARN` or `TagFilters` .
             */
            public fun tagFilters(vararg tagFilters: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty.Builder =
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
                    .ApplicationSourceProperty
                    .builder()

            /**
             * @param cloudFormationStackArn The Amazon Resource Name (ARN) of a CloudFormation
             *   stack. You must specify either a `CloudFormationStackARN` or `TagFilters` .
             */
            override fun cloudFormationStackArn(cloudFormationStackArn: String) {
                cdkBuilder.cloudFormationStackArn(cloudFormationStackArn)
            }

            /**
             * @param tagFilters A set of tag filters (keys and values). Each tag filter specified
             *   must contain a key with values as optional. Each scaling plan can include up to 50
             *   keys, and each key can include up to 20 values.
             *
             * Tags are part of the syntax that you use to specify the resources you want returned
             * when configuring a scaling plan from the AWS Auto Scaling console. You do not need to
             * specify valid tag filter values when you create a scaling plan with CloudFormation.
             * The `Key` and `Values` properties can accept any value as long as the combination of
             * values is unique across scaling plans. However, if you also want to use the AWS Auto
             * Scaling console to edit the scaling plan, then you must specify valid values.
             *
             * You must specify either a `CloudFormationStackARN` or `TagFilters` .
             */
            override fun tagFilters(tagFilters: IResolvable) {
                cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
            }

            /**
             * @param tagFilters A set of tag filters (keys and values). Each tag filter specified
             *   must contain a key with values as optional. Each scaling plan can include up to 50
             *   keys, and each key can include up to 20 values.
             *
             * Tags are part of the syntax that you use to specify the resources you want returned
             * when configuring a scaling plan from the AWS Auto Scaling console. You do not need to
             * specify valid tag filter values when you create a scaling plan with CloudFormation.
             * The `Key` and `Values` properties can accept any value as long as the combination of
             * values is unique across scaling plans. However, if you also want to use the AWS Auto
             * Scaling console to edit the scaling plan, then you must specify valid values.
             *
             * You must specify either a `CloudFormationStackARN` or `TagFilters` .
             */
            override fun tagFilters(tagFilters: List<Any>) {
                cdkBuilder.tagFilters(tagFilters)
            }

            /**
             * @param tagFilters A set of tag filters (keys and values). Each tag filter specified
             *   must contain a key with values as optional. Each scaling plan can include up to 50
             *   keys, and each key can include up to 20 values.
             *
             * Tags are part of the syntax that you use to specify the resources you want returned
             * when configuring a scaling plan from the AWS Auto Scaling console. You do not need to
             * specify valid tag filter values when you create a scaling plan with CloudFormation.
             * The `Key` and `Values` properties can accept any value as long as the combination of
             * values is unique across scaling plans. However, if you also want to use the AWS Auto
             * Scaling console to edit the scaling plan, then you must specify valid values.
             *
             * You must specify either a `CloudFormationStackARN` or `TagFilters` .
             */
            override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

            public fun build():
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty,
        ) : ApplicationSourceProperty {
            /**
             * The Amazon Resource Name (ARN) of a CloudFormation stack.
             *
             * You must specify either a `CloudFormationStackARN` or `TagFilters` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-cloudformationstackarn)
             */
            override fun cloudFormationStackArn(): String? =
                unwrap(this).getCloudFormationStackArn()

            /**
             * A set of tag filters (keys and values).
             *
             * Each tag filter specified must contain a key with values as optional. Each scaling
             * plan can include up to 50 keys, and each key can include up to 20 values.
             *
             * Tags are part of the syntax that you use to specify the resources you want returned
             * when configuring a scaling plan from the AWS Auto Scaling console. You do not need to
             * specify valid tag filter values when you create a scaling plan with CloudFormation.
             * The `Key` and `Values` properties can accept any value as long as the combination of
             * values is unique across scaling plans. However, if you also want to use the AWS Auto
             * Scaling console to edit the scaling plan, then you must specify valid values.
             *
             * You must specify either a `CloudFormationStackARN` or `TagFilters` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-tagfilters)
             */
            override fun tagFilters(): Any? = unwrap(this).getTagFilters()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationSourceProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty
            ): ApplicationSourceProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ApplicationSourceProperty
            ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface PredefinedScalingMetricSpecificationProperty {
        /**
         * The metric type.
         *
         * The `ALBRequestCountPerTarget` metric type applies only to Auto Scaling groups, Spot
         * Fleet requests, and ECS services.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-predefinedscalingmetrictype)
         */
        public fun predefinedScalingMetricType(): String

        /**
         * Identifies the resource associated with the metric type.
         *
         * You can't specify a resource label unless the metric type is `ALBRequestCountPerTarget`
         * and there is a target group for an Application Load Balancer attached to the Auto Scaling
         * group, Spot Fleet request, or ECS service.
         *
         * You create the resource label by appending the final portion of the load balancer ARN and
         * the final portion of the target group ARN into a single value, separated by a forward
         * slash (/). The format is
         * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>,
         * where:
         * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer
         *   ARN
         * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
         *   group ARN.
         *
         * This is an example:
         * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
         *
         * To find the ARN for an Application Load Balancer, use the
         * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
         * API operation. To find the ARN for the target group, use the
         * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
         * API operation.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-resourcelabel)
         */
        public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

        /** A builder for [PredefinedScalingMetricSpecificationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param predefinedScalingMetricType The metric type. The `ALBRequestCountPerTarget`
             *   metric type applies only to Auto Scaling groups, Spot Fleet requests, and ECS
             *   services.
             */
            public fun predefinedScalingMetricType(predefinedScalingMetricType: String)

            /**
             * @param resourceLabel Identifies the resource associated with the metric type. You
             *   can't specify a resource label unless the metric type is `ALBRequestCountPerTarget`
             *   and there is a target group for an Application Load Balancer attached to the Auto
             *   Scaling group, Spot Fleet request, or ECS service.
             *
             * You create the resource label by appending the final portion of the load balancer ARN
             * and the final portion of the target group ARN into a single value, separated by a
             * forward slash (/). The format is
             * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>,
             * where:
             * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load
             *   balancer ARN
             * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the
             *   target group ARN.
             *
             * This is an example:
             * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
             *
             * To find the ARN for an Application Load Balancer, use the
             * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
             * API operation. To find the ARN for the target group, use the
             * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
             * API operation.
             */
            public fun resourceLabel(resourceLabel: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder =
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
                    .PredefinedScalingMetricSpecificationProperty
                    .builder()

            /**
             * @param predefinedScalingMetricType The metric type. The `ALBRequestCountPerTarget`
             *   metric type applies only to Auto Scaling groups, Spot Fleet requests, and ECS
             *   services.
             */
            override fun predefinedScalingMetricType(predefinedScalingMetricType: String) {
                cdkBuilder.predefinedScalingMetricType(predefinedScalingMetricType)
            }

            /**
             * @param resourceLabel Identifies the resource associated with the metric type. You
             *   can't specify a resource label unless the metric type is `ALBRequestCountPerTarget`
             *   and there is a target group for an Application Load Balancer attached to the Auto
             *   Scaling group, Spot Fleet request, or ECS service.
             *
             * You create the resource label by appending the final portion of the load balancer ARN
             * and the final portion of the target group ARN into a single value, separated by a
             * forward slash (/). The format is
             * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>,
             * where:
             * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load
             *   balancer ARN
             * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the
             *   target group ARN.
             *
             * This is an example:
             * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
             *
             * To find the ARN for an Application Load Balancer, use the
             * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
             * API operation. To find the ARN for the target group, use the
             * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
             * API operation.
             */
            override fun resourceLabel(resourceLabel: String) {
                cdkBuilder.resourceLabel(resourceLabel)
            }

            public fun build():
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty,
        ) : PredefinedScalingMetricSpecificationProperty {
            /**
             * The metric type.
             *
             * The `ALBRequestCountPerTarget` metric type applies only to Auto Scaling groups, Spot
             * Fleet requests, and ECS services.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-predefinedscalingmetrictype)
             */
            override fun predefinedScalingMetricType(): String =
                unwrap(this).getPredefinedScalingMetricType()

            /**
             * Identifies the resource associated with the metric type.
             *
             * You can't specify a resource label unless the metric type is
             * `ALBRequestCountPerTarget` and there is a target group for an Application Load
             * Balancer attached to the Auto Scaling group, Spot Fleet request, or ECS service.
             *
             * You create the resource label by appending the final portion of the load balancer ARN
             * and the final portion of the target group ARN into a single value, separated by a
             * forward slash (/). The format is
             * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>,
             * where:
             * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load
             *   balancer ARN
             * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the
             *   target group ARN.
             *
             * This is an example:
             * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
             *
             * To find the ARN for an Application Load Balancer, use the
             * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
             * API operation. To find the ARN for the target group, use the
             * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
             * API operation.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-resourcelabel)
             */
            override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): PredefinedScalingMetricSpecificationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty
            ): PredefinedScalingMetricSpecificationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PredefinedScalingMetricSpecificationProperty
            ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ScalingInstructionProperty {
        /**
         * The customized load metric to use for predictive scaling.
         *
         * This property or a *PredefinedLoadMetricSpecification* is required when configuring
         * predictive scaling, and cannot be used otherwise.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-customizedloadmetricspecification)
         */
        public fun customizedLoadMetricSpecification(): Any? =
            unwrap(this).getCustomizedLoadMetricSpecification()

        /**
         * Controls whether dynamic scaling is disabled.
         *
         * When dynamic scaling is enabled, AWS Auto Scaling creates target tracking scaling
         * policies based on the specified target tracking configurations.
         *
         * The default is enabled ( `false` ).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-disabledynamicscaling)
         */
        public fun disableDynamicScaling(): Any? = unwrap(this).getDisableDynamicScaling()

        /**
         * The maximum capacity of the resource.
         *
         * The exception to this upper limit is if you specify a non-default setting for
         * *PredictiveScalingMaxCapacityBehavior* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity)
         */
        public fun maxCapacity(): Number

        /**
         * The minimum capacity of the resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-mincapacity)
         */
        public fun minCapacity(): Number

        /**
         * The predefined load metric to use for predictive scaling.
         *
         * This property or a *CustomizedLoadMetricSpecification* is required when configuring
         * predictive scaling, and cannot be used otherwise.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predefinedloadmetricspecification)
         */
        public fun predefinedLoadMetricSpecification(): Any? =
            unwrap(this).getPredefinedLoadMetricSpecification()

        /**
         * Defines the behavior that should be applied if the forecast capacity approaches or
         * exceeds the maximum capacity specified for the resource.
         *
         * The default value is `SetForecastCapacityToMaxCapacity` .
         *
         * The following are possible values:
         * * `SetForecastCapacityToMaxCapacity` - AWS Auto Scaling cannot scale resource capacity
         *   higher than the maximum capacity. The maximum capacity is enforced as a hard limit.
         * * `SetMaxCapacityToForecastCapacity` - AWS Auto Scaling can scale resource capacity
         *   higher than the maximum capacity to equal but not exceed forecast capacity.
         * * `SetMaxCapacityAboveForecastCapacity` - AWS Auto Scaling can scale resource capacity
         *   higher than the maximum capacity by a specified buffer value. The intention is to give
         *   the target tracking scaling policy extra capacity if unexpected traffic occurs.
         *
         * Valid only when configuring predictive scaling.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmaxcapacitybehavior)
         */
        public fun predictiveScalingMaxCapacityBehavior(): String? =
            unwrap(this).getPredictiveScalingMaxCapacityBehavior()

        /**
         * The size of the capacity buffer to use when the forecast capacity is close to or exceeds
         * the maximum capacity.
         *
         * The value is specified as a percentage relative to the forecast capacity. For example, if
         * the buffer is 10, this means a 10 percent buffer. With a 10 percent buffer, if the
         * forecast capacity is 50, and the maximum capacity is 40, then the effective maximum
         * capacity is 55.
         *
         * Valid only when configuring predictive scaling. Required if
         * *PredictiveScalingMaxCapacityBehavior* is set to `SetMaxCapacityAboveForecastCapacity` ,
         * and cannot be used otherwise.
         *
         * The range is 1-100.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmaxcapacitybuffer)
         */
        public fun predictiveScalingMaxCapacityBuffer(): Number? =
            unwrap(this).getPredictiveScalingMaxCapacityBuffer()

        /**
         * The predictive scaling mode.
         *
         * The default value is `ForecastAndScale` . Otherwise, AWS Auto Scaling forecasts capacity
         * but does not apply any scheduled scaling actions based on the capacity forecast.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmode)
         */
        public fun predictiveScalingMode(): String? = unwrap(this).getPredictiveScalingMode()

        /**
         * The ID of the resource. This string consists of the resource type and unique identifier.
         * * Auto Scaling group - The resource type is `autoScalingGroup` and the unique identifier
         *   is the name of the Auto Scaling group. Example: `autoScalingGroup/my-asg` .
         * * ECS service - The resource type is `service` and the unique identifier is the cluster
         *   name and service name. Example: `service/default/sample-webapp` .
         * * Spot Fleet request - The resource type is `spot-fleet-request` and the unique
         *   identifier is the Spot Fleet request ID. Example:
         *   `spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE` .
         * * DynamoDB table - The resource type is `table` and the unique identifier is the resource
         *   ID. Example: `table/my-table` .
         * * DynamoDB global secondary index - The resource type is `index` and the unique
         *   identifier is the resource ID. Example: `table/my-table/index/my-table-index` .
         * * Aurora DB cluster - The resource type is `cluster` and the unique identifier is the
         *   cluster name. Example: `cluster:my-db-cluster` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid)
         */
        public fun resourceId(): String

        /**
         * The scalable dimension associated with the resource.
         * * `autoscaling:autoScalingGroup:DesiredCapacity` - The desired capacity of an Auto
         *   Scaling group.
         * * `ecs:service:DesiredCount` - The desired task count of an ECS service.
         * * `ec2:spot-fleet-request:TargetCapacity` - The target capacity of a Spot Fleet request.
         * * `dynamodb:table:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB
         *   table.
         * * `dynamodb:table:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB
         *   table.
         * * `dynamodb:index:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB
         *   global secondary index.
         * * `dynamodb:index:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB
         *   global secondary index.
         * * `rds:cluster:ReadReplicaCount` - The count of Aurora Replicas in an Aurora DB cluster.
         *   Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension)
         */
        public fun scalableDimension(): String

        /**
         * Controls whether a resource's externally created scaling policies are deleted and new
         * target tracking scaling policies created.
         *
         * The default value is `KeepExternalPolicies` .
         *
         * Valid only when configuring dynamic scaling.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalingpolicyupdatebehavior)
         */
        public fun scalingPolicyUpdateBehavior(): String? =
            unwrap(this).getScalingPolicyUpdateBehavior()

        /**
         * The amount of time, in seconds, to buffer the run time of scheduled scaling actions when
         * scaling out.
         *
         * For example, if the forecast says to add capacity at 10:00 AM, and the buffer time is 5
         * minutes, then the run time of the corresponding scheduled scaling action will be 9:55 AM.
         * The intention is to give resources time to be provisioned. For example, it can take a few
         * minutes to launch an EC2 instance. The actual amount of time required depends on several
         * factors, such as the size of the instance and whether there are startup scripts to
         * complete.
         *
         * The value must be less than the forecast interval duration of 3600 seconds (60 minutes).
         * The default is 300 seconds.
         *
         * Valid only when configuring predictive scaling.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scheduledactionbuffertime)
         */
        public fun scheduledActionBufferTime(): Number? =
            unwrap(this).getScheduledActionBufferTime()

        /**
         * The namespace of the AWS service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace)
         */
        public fun serviceNamespace(): String

        /**
         * The target tracking configurations (up to 10).
         *
         * Each of these structures must specify a unique scaling metric and a target value for the
         * metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-targettrackingconfigurations)
         */
        public fun targetTrackingConfigurations(): Any

        /** A builder for [ScalingInstructionProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param customizedLoadMetricSpecification The customized load metric to use for
             *   predictive scaling. This property or a *PredefinedLoadMetricSpecification* is
             *   required when configuring predictive scaling, and cannot be used otherwise.
             */
            public fun customizedLoadMetricSpecification(
                customizedLoadMetricSpecification: IResolvable
            )

            /**
             * @param customizedLoadMetricSpecification The customized load metric to use for
             *   predictive scaling. This property or a *PredefinedLoadMetricSpecification* is
             *   required when configuring predictive scaling, and cannot be used otherwise.
             */
            public fun customizedLoadMetricSpecification(
                customizedLoadMetricSpecification: CustomizedLoadMetricSpecificationProperty
            )

            /**
             * @param customizedLoadMetricSpecification The customized load metric to use for
             *   predictive scaling. This property or a *PredefinedLoadMetricSpecification* is
             *   required when configuring predictive scaling, and cannot be used otherwise.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5fb9662a50b6c7710f8bab7e3bba525aeb51f98fe8667fcc24e9ae392a673591")
            public fun customizedLoadMetricSpecification(
                customizedLoadMetricSpecification:
                    CustomizedLoadMetricSpecificationProperty.Builder.() -> Unit
            )

            /**
             * @param disableDynamicScaling Controls whether dynamic scaling is disabled. When
             *   dynamic scaling is enabled, AWS Auto Scaling creates target tracking scaling
             *   policies based on the specified target tracking configurations.
             *
             * The default is enabled ( `false` ).
             */
            public fun disableDynamicScaling(disableDynamicScaling: Boolean)

            /**
             * @param disableDynamicScaling Controls whether dynamic scaling is disabled. When
             *   dynamic scaling is enabled, AWS Auto Scaling creates target tracking scaling
             *   policies based on the specified target tracking configurations.
             *
             * The default is enabled ( `false` ).
             */
            public fun disableDynamicScaling(disableDynamicScaling: IResolvable)

            /**
             * @param maxCapacity The maximum capacity of the resource. The exception to this upper
             *   limit is if you specify a non-default setting for
             *   *PredictiveScalingMaxCapacityBehavior* .
             */
            public fun maxCapacity(maxCapacity: Number)

            /** @param minCapacity The minimum capacity of the resource. */
            public fun minCapacity(minCapacity: Number)

            /**
             * @param predefinedLoadMetricSpecification The predefined load metric to use for
             *   predictive scaling. This property or a *CustomizedLoadMetricSpecification* is
             *   required when configuring predictive scaling, and cannot be used otherwise.
             */
            public fun predefinedLoadMetricSpecification(
                predefinedLoadMetricSpecification: IResolvable
            )

            /**
             * @param predefinedLoadMetricSpecification The predefined load metric to use for
             *   predictive scaling. This property or a *CustomizedLoadMetricSpecification* is
             *   required when configuring predictive scaling, and cannot be used otherwise.
             */
            public fun predefinedLoadMetricSpecification(
                predefinedLoadMetricSpecification: PredefinedLoadMetricSpecificationProperty
            )

            /**
             * @param predefinedLoadMetricSpecification The predefined load metric to use for
             *   predictive scaling. This property or a *CustomizedLoadMetricSpecification* is
             *   required when configuring predictive scaling, and cannot be used otherwise.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("75e1476bf14827a88c82e804fdea5b28c70eea656be920d8f814a60708d13d0e")
            public fun predefinedLoadMetricSpecification(
                predefinedLoadMetricSpecification:
                    PredefinedLoadMetricSpecificationProperty.Builder.() -> Unit
            )

            /**
             * @param predictiveScalingMaxCapacityBehavior Defines the behavior that should be
             *   applied if the forecast capacity approaches or exceeds the maximum capacity
             *   specified for the resource. The default value is `SetForecastCapacityToMaxCapacity`
             *   .
             *
             * The following are possible values:
             * * `SetForecastCapacityToMaxCapacity` - AWS Auto Scaling cannot scale resource
             *   capacity higher than the maximum capacity. The maximum capacity is enforced as a
             *   hard limit.
             * * `SetMaxCapacityToForecastCapacity` - AWS Auto Scaling can scale resource capacity
             *   higher than the maximum capacity to equal but not exceed forecast capacity.
             * * `SetMaxCapacityAboveForecastCapacity` - AWS Auto Scaling can scale resource
             *   capacity higher than the maximum capacity by a specified buffer value. The
             *   intention is to give the target tracking scaling policy extra capacity if
             *   unexpected traffic occurs.
             *
             * Valid only when configuring predictive scaling.
             */
            public fun predictiveScalingMaxCapacityBehavior(
                predictiveScalingMaxCapacityBehavior: String
            )

            /**
             * @param predictiveScalingMaxCapacityBuffer The size of the capacity buffer to use when
             *   the forecast capacity is close to or exceeds the maximum capacity. The value is
             *   specified as a percentage relative to the forecast capacity. For example, if the
             *   buffer is 10, this means a 10 percent buffer. With a 10 percent buffer, if the
             *   forecast capacity is 50, and the maximum capacity is 40, then the effective maximum
             *   capacity is 55.
             *
             * Valid only when configuring predictive scaling. Required if
             * *PredictiveScalingMaxCapacityBehavior* is set to
             * `SetMaxCapacityAboveForecastCapacity` , and cannot be used otherwise.
             *
             * The range is 1-100.
             */
            public fun predictiveScalingMaxCapacityBuffer(
                predictiveScalingMaxCapacityBuffer: Number
            )

            /**
             * @param predictiveScalingMode The predictive scaling mode. The default value is
             *   `ForecastAndScale` . Otherwise, AWS Auto Scaling forecasts capacity but does not
             *   apply any scheduled scaling actions based on the capacity forecast.
             */
            public fun predictiveScalingMode(predictiveScalingMode: String)

            /**
             * @param resourceId The ID of the resource. This string consists of the resource type
             *   and unique identifier.
             * * Auto Scaling group - The resource type is `autoScalingGroup` and the unique
             *   identifier is the name of the Auto Scaling group. Example:
             *   `autoScalingGroup/my-asg` .
             * * ECS service - The resource type is `service` and the unique identifier is the
             *   cluster name and service name. Example: `service/default/sample-webapp` .
             * * Spot Fleet request - The resource type is `spot-fleet-request` and the unique
             *   identifier is the Spot Fleet request ID. Example:
             *   `spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE` .
             * * DynamoDB table - The resource type is `table` and the unique identifier is the
             *   resource ID. Example: `table/my-table` .
             * * DynamoDB global secondary index - The resource type is `index` and the unique
             *   identifier is the resource ID. Example: `table/my-table/index/my-table-index` .
             * * Aurora DB cluster - The resource type is `cluster` and the unique identifier is the
             *   cluster name. Example: `cluster:my-db-cluster` .
             */
            public fun resourceId(resourceId: String)

            /**
             * @param scalableDimension The scalable dimension associated with the resource.
             * * `autoscaling:autoScalingGroup:DesiredCapacity` - The desired capacity of an Auto
             *   Scaling group.
             * * `ecs:service:DesiredCount` - The desired task count of an ECS service.
             * * `ec2:spot-fleet-request:TargetCapacity` - The target capacity of a Spot Fleet
             *   request.
             * * `dynamodb:table:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB
             *   table.
             * * `dynamodb:table:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB
             *   table.
             * * `dynamodb:index:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB
             *   global secondary index.
             * * `dynamodb:index:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB
             *   global secondary index.
             * * `rds:cluster:ReadReplicaCount` - The count of Aurora Replicas in an Aurora DB
             *   cluster. Available for Aurora MySQL-compatible edition and Aurora
             *   PostgreSQL-compatible edition.
             */
            public fun scalableDimension(scalableDimension: String)

            /**
             * @param scalingPolicyUpdateBehavior Controls whether a resource's externally created
             *   scaling policies are deleted and new target tracking scaling policies created. The
             *   default value is `KeepExternalPolicies` .
             *
             * Valid only when configuring dynamic scaling.
             */
            public fun scalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior: String)

            /**
             * @param scheduledActionBufferTime The amount of time, in seconds, to buffer the run
             *   time of scheduled scaling actions when scaling out. For example, if the forecast
             *   says to add capacity at 10:00 AM, and the buffer time is 5 minutes, then the run
             *   time of the corresponding scheduled scaling action will be 9:55 AM. The intention
             *   is to give resources time to be provisioned. For example, it can take a few minutes
             *   to launch an EC2 instance. The actual amount of time required depends on several
             *   factors, such as the size of the instance and whether there are startup scripts to
             *   complete.
             *
             * The value must be less than the forecast interval duration of 3600 seconds (60
             * minutes). The default is 300 seconds.
             *
             * Valid only when configuring predictive scaling.
             */
            public fun scheduledActionBufferTime(scheduledActionBufferTime: Number)

            /** @param serviceNamespace The namespace of the AWS service. */
            public fun serviceNamespace(serviceNamespace: String)

            /**
             * @param targetTrackingConfigurations The target tracking configurations (up to 10).
             *   Each of these structures must specify a unique scaling metric and a target value
             *   for the metric.
             */
            public fun targetTrackingConfigurations(targetTrackingConfigurations: IResolvable)

            /**
             * @param targetTrackingConfigurations The target tracking configurations (up to 10).
             *   Each of these structures must specify a unique scaling metric and a target value
             *   for the metric.
             */
            public fun targetTrackingConfigurations(targetTrackingConfigurations: List<Any>)

            /**
             * @param targetTrackingConfigurations The target tracking configurations (up to 10).
             *   Each of these structures must specify a unique scaling metric and a target value
             *   for the metric.
             */
            public fun targetTrackingConfigurations(vararg targetTrackingConfigurations: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder =
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
                    .ScalingInstructionProperty
                    .builder()

            /**
             * @param customizedLoadMetricSpecification The customized load metric to use for
             *   predictive scaling. This property or a *PredefinedLoadMetricSpecification* is
             *   required when configuring predictive scaling, and cannot be used otherwise.
             */
            override fun customizedLoadMetricSpecification(
                customizedLoadMetricSpecification: IResolvable
            ) {
                cdkBuilder.customizedLoadMetricSpecification(
                    customizedLoadMetricSpecification.let(IResolvable::unwrap)
                )
            }

            /**
             * @param customizedLoadMetricSpecification The customized load metric to use for
             *   predictive scaling. This property or a *PredefinedLoadMetricSpecification* is
             *   required when configuring predictive scaling, and cannot be used otherwise.
             */
            override fun customizedLoadMetricSpecification(
                customizedLoadMetricSpecification: CustomizedLoadMetricSpecificationProperty
            ) {
                cdkBuilder.customizedLoadMetricSpecification(
                    customizedLoadMetricSpecification.let(
                        CustomizedLoadMetricSpecificationProperty::unwrap
                    )
                )
            }

            /**
             * @param customizedLoadMetricSpecification The customized load metric to use for
             *   predictive scaling. This property or a *PredefinedLoadMetricSpecification* is
             *   required when configuring predictive scaling, and cannot be used otherwise.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5fb9662a50b6c7710f8bab7e3bba525aeb51f98fe8667fcc24e9ae392a673591")
            override fun customizedLoadMetricSpecification(
                customizedLoadMetricSpecification:
                    CustomizedLoadMetricSpecificationProperty.Builder.() -> Unit
            ): Unit =
                customizedLoadMetricSpecification(
                    CustomizedLoadMetricSpecificationProperty(customizedLoadMetricSpecification)
                )

            /**
             * @param disableDynamicScaling Controls whether dynamic scaling is disabled. When
             *   dynamic scaling is enabled, AWS Auto Scaling creates target tracking scaling
             *   policies based on the specified target tracking configurations.
             *
             * The default is enabled ( `false` ).
             */
            override fun disableDynamicScaling(disableDynamicScaling: Boolean) {
                cdkBuilder.disableDynamicScaling(disableDynamicScaling)
            }

            /**
             * @param disableDynamicScaling Controls whether dynamic scaling is disabled. When
             *   dynamic scaling is enabled, AWS Auto Scaling creates target tracking scaling
             *   policies based on the specified target tracking configurations.
             *
             * The default is enabled ( `false` ).
             */
            override fun disableDynamicScaling(disableDynamicScaling: IResolvable) {
                cdkBuilder.disableDynamicScaling(disableDynamicScaling.let(IResolvable::unwrap))
            }

            /**
             * @param maxCapacity The maximum capacity of the resource. The exception to this upper
             *   limit is if you specify a non-default setting for
             *   *PredictiveScalingMaxCapacityBehavior* .
             */
            override fun maxCapacity(maxCapacity: Number) {
                cdkBuilder.maxCapacity(maxCapacity)
            }

            /** @param minCapacity The minimum capacity of the resource. */
            override fun minCapacity(minCapacity: Number) {
                cdkBuilder.minCapacity(minCapacity)
            }

            /**
             * @param predefinedLoadMetricSpecification The predefined load metric to use for
             *   predictive scaling. This property or a *CustomizedLoadMetricSpecification* is
             *   required when configuring predictive scaling, and cannot be used otherwise.
             */
            override fun predefinedLoadMetricSpecification(
                predefinedLoadMetricSpecification: IResolvable
            ) {
                cdkBuilder.predefinedLoadMetricSpecification(
                    predefinedLoadMetricSpecification.let(IResolvable::unwrap)
                )
            }

            /**
             * @param predefinedLoadMetricSpecification The predefined load metric to use for
             *   predictive scaling. This property or a *CustomizedLoadMetricSpecification* is
             *   required when configuring predictive scaling, and cannot be used otherwise.
             */
            override fun predefinedLoadMetricSpecification(
                predefinedLoadMetricSpecification: PredefinedLoadMetricSpecificationProperty
            ) {
                cdkBuilder.predefinedLoadMetricSpecification(
                    predefinedLoadMetricSpecification.let(
                        PredefinedLoadMetricSpecificationProperty::unwrap
                    )
                )
            }

            /**
             * @param predefinedLoadMetricSpecification The predefined load metric to use for
             *   predictive scaling. This property or a *CustomizedLoadMetricSpecification* is
             *   required when configuring predictive scaling, and cannot be used otherwise.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("75e1476bf14827a88c82e804fdea5b28c70eea656be920d8f814a60708d13d0e")
            override fun predefinedLoadMetricSpecification(
                predefinedLoadMetricSpecification:
                    PredefinedLoadMetricSpecificationProperty.Builder.() -> Unit
            ): Unit =
                predefinedLoadMetricSpecification(
                    PredefinedLoadMetricSpecificationProperty(predefinedLoadMetricSpecification)
                )

            /**
             * @param predictiveScalingMaxCapacityBehavior Defines the behavior that should be
             *   applied if the forecast capacity approaches or exceeds the maximum capacity
             *   specified for the resource. The default value is `SetForecastCapacityToMaxCapacity`
             *   .
             *
             * The following are possible values:
             * * `SetForecastCapacityToMaxCapacity` - AWS Auto Scaling cannot scale resource
             *   capacity higher than the maximum capacity. The maximum capacity is enforced as a
             *   hard limit.
             * * `SetMaxCapacityToForecastCapacity` - AWS Auto Scaling can scale resource capacity
             *   higher than the maximum capacity to equal but not exceed forecast capacity.
             * * `SetMaxCapacityAboveForecastCapacity` - AWS Auto Scaling can scale resource
             *   capacity higher than the maximum capacity by a specified buffer value. The
             *   intention is to give the target tracking scaling policy extra capacity if
             *   unexpected traffic occurs.
             *
             * Valid only when configuring predictive scaling.
             */
            override fun predictiveScalingMaxCapacityBehavior(
                predictiveScalingMaxCapacityBehavior: String
            ) {
                cdkBuilder.predictiveScalingMaxCapacityBehavior(
                    predictiveScalingMaxCapacityBehavior
                )
            }

            /**
             * @param predictiveScalingMaxCapacityBuffer The size of the capacity buffer to use when
             *   the forecast capacity is close to or exceeds the maximum capacity. The value is
             *   specified as a percentage relative to the forecast capacity. For example, if the
             *   buffer is 10, this means a 10 percent buffer. With a 10 percent buffer, if the
             *   forecast capacity is 50, and the maximum capacity is 40, then the effective maximum
             *   capacity is 55.
             *
             * Valid only when configuring predictive scaling. Required if
             * *PredictiveScalingMaxCapacityBehavior* is set to
             * `SetMaxCapacityAboveForecastCapacity` , and cannot be used otherwise.
             *
             * The range is 1-100.
             */
            override fun predictiveScalingMaxCapacityBuffer(
                predictiveScalingMaxCapacityBuffer: Number
            ) {
                cdkBuilder.predictiveScalingMaxCapacityBuffer(predictiveScalingMaxCapacityBuffer)
            }

            /**
             * @param predictiveScalingMode The predictive scaling mode. The default value is
             *   `ForecastAndScale` . Otherwise, AWS Auto Scaling forecasts capacity but does not
             *   apply any scheduled scaling actions based on the capacity forecast.
             */
            override fun predictiveScalingMode(predictiveScalingMode: String) {
                cdkBuilder.predictiveScalingMode(predictiveScalingMode)
            }

            /**
             * @param resourceId The ID of the resource. This string consists of the resource type
             *   and unique identifier.
             * * Auto Scaling group - The resource type is `autoScalingGroup` and the unique
             *   identifier is the name of the Auto Scaling group. Example:
             *   `autoScalingGroup/my-asg` .
             * * ECS service - The resource type is `service` and the unique identifier is the
             *   cluster name and service name. Example: `service/default/sample-webapp` .
             * * Spot Fleet request - The resource type is `spot-fleet-request` and the unique
             *   identifier is the Spot Fleet request ID. Example:
             *   `spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE` .
             * * DynamoDB table - The resource type is `table` and the unique identifier is the
             *   resource ID. Example: `table/my-table` .
             * * DynamoDB global secondary index - The resource type is `index` and the unique
             *   identifier is the resource ID. Example: `table/my-table/index/my-table-index` .
             * * Aurora DB cluster - The resource type is `cluster` and the unique identifier is the
             *   cluster name. Example: `cluster:my-db-cluster` .
             */
            override fun resourceId(resourceId: String) {
                cdkBuilder.resourceId(resourceId)
            }

            /**
             * @param scalableDimension The scalable dimension associated with the resource.
             * * `autoscaling:autoScalingGroup:DesiredCapacity` - The desired capacity of an Auto
             *   Scaling group.
             * * `ecs:service:DesiredCount` - The desired task count of an ECS service.
             * * `ec2:spot-fleet-request:TargetCapacity` - The target capacity of a Spot Fleet
             *   request.
             * * `dynamodb:table:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB
             *   table.
             * * `dynamodb:table:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB
             *   table.
             * * `dynamodb:index:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB
             *   global secondary index.
             * * `dynamodb:index:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB
             *   global secondary index.
             * * `rds:cluster:ReadReplicaCount` - The count of Aurora Replicas in an Aurora DB
             *   cluster. Available for Aurora MySQL-compatible edition and Aurora
             *   PostgreSQL-compatible edition.
             */
            override fun scalableDimension(scalableDimension: String) {
                cdkBuilder.scalableDimension(scalableDimension)
            }

            /**
             * @param scalingPolicyUpdateBehavior Controls whether a resource's externally created
             *   scaling policies are deleted and new target tracking scaling policies created. The
             *   default value is `KeepExternalPolicies` .
             *
             * Valid only when configuring dynamic scaling.
             */
            override fun scalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior: String) {
                cdkBuilder.scalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior)
            }

            /**
             * @param scheduledActionBufferTime The amount of time, in seconds, to buffer the run
             *   time of scheduled scaling actions when scaling out. For example, if the forecast
             *   says to add capacity at 10:00 AM, and the buffer time is 5 minutes, then the run
             *   time of the corresponding scheduled scaling action will be 9:55 AM. The intention
             *   is to give resources time to be provisioned. For example, it can take a few minutes
             *   to launch an EC2 instance. The actual amount of time required depends on several
             *   factors, such as the size of the instance and whether there are startup scripts to
             *   complete.
             *
             * The value must be less than the forecast interval duration of 3600 seconds (60
             * minutes). The default is 300 seconds.
             *
             * Valid only when configuring predictive scaling.
             */
            override fun scheduledActionBufferTime(scheduledActionBufferTime: Number) {
                cdkBuilder.scheduledActionBufferTime(scheduledActionBufferTime)
            }

            /** @param serviceNamespace The namespace of the AWS service. */
            override fun serviceNamespace(serviceNamespace: String) {
                cdkBuilder.serviceNamespace(serviceNamespace)
            }

            /**
             * @param targetTrackingConfigurations The target tracking configurations (up to 10).
             *   Each of these structures must specify a unique scaling metric and a target value
             *   for the metric.
             */
            override fun targetTrackingConfigurations(targetTrackingConfigurations: IResolvable) {
                cdkBuilder.targetTrackingConfigurations(
                    targetTrackingConfigurations.let(IResolvable::unwrap)
                )
            }

            /**
             * @param targetTrackingConfigurations The target tracking configurations (up to 10).
             *   Each of these structures must specify a unique scaling metric and a target value
             *   for the metric.
             */
            override fun targetTrackingConfigurations(targetTrackingConfigurations: List<Any>) {
                cdkBuilder.targetTrackingConfigurations(targetTrackingConfigurations)
            }

            /**
             * @param targetTrackingConfigurations The target tracking configurations (up to 10).
             *   Each of these structures must specify a unique scaling metric and a target value
             *   for the metric.
             */
            override fun targetTrackingConfigurations(
                vararg targetTrackingConfigurations: Any
            ): Unit = targetTrackingConfigurations(targetTrackingConfigurations.toList())

            public fun build():
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty,
        ) : ScalingInstructionProperty {
            /**
             * The customized load metric to use for predictive scaling.
             *
             * This property or a *PredefinedLoadMetricSpecification* is required when configuring
             * predictive scaling, and cannot be used otherwise.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-customizedloadmetricspecification)
             */
            override fun customizedLoadMetricSpecification(): Any? =
                unwrap(this).getCustomizedLoadMetricSpecification()

            /**
             * Controls whether dynamic scaling is disabled.
             *
             * When dynamic scaling is enabled, AWS Auto Scaling creates target tracking scaling
             * policies based on the specified target tracking configurations.
             *
             * The default is enabled ( `false` ).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-disabledynamicscaling)
             */
            override fun disableDynamicScaling(): Any? = unwrap(this).getDisableDynamicScaling()

            /**
             * The maximum capacity of the resource.
             *
             * The exception to this upper limit is if you specify a non-default setting for
             * *PredictiveScalingMaxCapacityBehavior* .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity)
             */
            override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

            /**
             * The minimum capacity of the resource.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-mincapacity)
             */
            override fun minCapacity(): Number = unwrap(this).getMinCapacity()

            /**
             * The predefined load metric to use for predictive scaling.
             *
             * This property or a *CustomizedLoadMetricSpecification* is required when configuring
             * predictive scaling, and cannot be used otherwise.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predefinedloadmetricspecification)
             */
            override fun predefinedLoadMetricSpecification(): Any? =
                unwrap(this).getPredefinedLoadMetricSpecification()

            /**
             * Defines the behavior that should be applied if the forecast capacity approaches or
             * exceeds the maximum capacity specified for the resource.
             *
             * The default value is `SetForecastCapacityToMaxCapacity` .
             *
             * The following are possible values:
             * * `SetForecastCapacityToMaxCapacity` - AWS Auto Scaling cannot scale resource
             *   capacity higher than the maximum capacity. The maximum capacity is enforced as a
             *   hard limit.
             * * `SetMaxCapacityToForecastCapacity` - AWS Auto Scaling can scale resource capacity
             *   higher than the maximum capacity to equal but not exceed forecast capacity.
             * * `SetMaxCapacityAboveForecastCapacity` - AWS Auto Scaling can scale resource
             *   capacity higher than the maximum capacity by a specified buffer value. The
             *   intention is to give the target tracking scaling policy extra capacity if
             *   unexpected traffic occurs.
             *
             * Valid only when configuring predictive scaling.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmaxcapacitybehavior)
             */
            override fun predictiveScalingMaxCapacityBehavior(): String? =
                unwrap(this).getPredictiveScalingMaxCapacityBehavior()

            /**
             * The size of the capacity buffer to use when the forecast capacity is close to or
             * exceeds the maximum capacity.
             *
             * The value is specified as a percentage relative to the forecast capacity. For
             * example, if the buffer is 10, this means a 10 percent buffer. With a 10 percent
             * buffer, if the forecast capacity is 50, and the maximum capacity is 40, then the
             * effective maximum capacity is 55.
             *
             * Valid only when configuring predictive scaling. Required if
             * *PredictiveScalingMaxCapacityBehavior* is set to
             * `SetMaxCapacityAboveForecastCapacity` , and cannot be used otherwise.
             *
             * The range is 1-100.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmaxcapacitybuffer)
             */
            override fun predictiveScalingMaxCapacityBuffer(): Number? =
                unwrap(this).getPredictiveScalingMaxCapacityBuffer()

            /**
             * The predictive scaling mode.
             *
             * The default value is `ForecastAndScale` . Otherwise, AWS Auto Scaling forecasts
             * capacity but does not apply any scheduled scaling actions based on the capacity
             * forecast.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmode)
             */
            override fun predictiveScalingMode(): String? = unwrap(this).getPredictiveScalingMode()

            /**
             * The ID of the resource. This string consists of the resource type and unique
             * identifier.
             * * Auto Scaling group - The resource type is `autoScalingGroup` and the unique
             *   identifier is the name of the Auto Scaling group. Example:
             *   `autoScalingGroup/my-asg` .
             * * ECS service - The resource type is `service` and the unique identifier is the
             *   cluster name and service name. Example: `service/default/sample-webapp` .
             * * Spot Fleet request - The resource type is `spot-fleet-request` and the unique
             *   identifier is the Spot Fleet request ID. Example:
             *   `spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE` .
             * * DynamoDB table - The resource type is `table` and the unique identifier is the
             *   resource ID. Example: `table/my-table` .
             * * DynamoDB global secondary index - The resource type is `index` and the unique
             *   identifier is the resource ID. Example: `table/my-table/index/my-table-index` .
             * * Aurora DB cluster - The resource type is `cluster` and the unique identifier is the
             *   cluster name. Example: `cluster:my-db-cluster` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid)
             */
            override fun resourceId(): String = unwrap(this).getResourceId()

            /**
             * The scalable dimension associated with the resource.
             * * `autoscaling:autoScalingGroup:DesiredCapacity` - The desired capacity of an Auto
             *   Scaling group.
             * * `ecs:service:DesiredCount` - The desired task count of an ECS service.
             * * `ec2:spot-fleet-request:TargetCapacity` - The target capacity of a Spot Fleet
             *   request.
             * * `dynamodb:table:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB
             *   table.
             * * `dynamodb:table:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB
             *   table.
             * * `dynamodb:index:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB
             *   global secondary index.
             * * `dynamodb:index:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB
             *   global secondary index.
             * * `rds:cluster:ReadReplicaCount` - The count of Aurora Replicas in an Aurora DB
             *   cluster. Available for Aurora MySQL-compatible edition and Aurora
             *   PostgreSQL-compatible edition.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension)
             */
            override fun scalableDimension(): String = unwrap(this).getScalableDimension()

            /**
             * Controls whether a resource's externally created scaling policies are deleted and new
             * target tracking scaling policies created.
             *
             * The default value is `KeepExternalPolicies` .
             *
             * Valid only when configuring dynamic scaling.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalingpolicyupdatebehavior)
             */
            override fun scalingPolicyUpdateBehavior(): String? =
                unwrap(this).getScalingPolicyUpdateBehavior()

            /**
             * The amount of time, in seconds, to buffer the run time of scheduled scaling actions
             * when scaling out.
             *
             * For example, if the forecast says to add capacity at 10:00 AM, and the buffer time is
             * 5 minutes, then the run time of the corresponding scheduled scaling action will be
             * 9:55 AM. The intention is to give resources time to be provisioned. For example, it
             * can take a few minutes to launch an EC2 instance. The actual amount of time required
             * depends on several factors, such as the size of the instance and whether there are
             * startup scripts to complete.
             *
             * The value must be less than the forecast interval duration of 3600 seconds (60
             * minutes). The default is 300 seconds.
             *
             * Valid only when configuring predictive scaling.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scheduledactionbuffertime)
             */
            override fun scheduledActionBufferTime(): Number? =
                unwrap(this).getScheduledActionBufferTime()

            /**
             * The namespace of the AWS service.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace)
             */
            override fun serviceNamespace(): String = unwrap(this).getServiceNamespace()

            /**
             * The target tracking configurations (up to 10).
             *
             * Each of these structures must specify a unique scaling metric and a target value for
             * the metric.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-targettrackingconfigurations)
             */
            override fun targetTrackingConfigurations(): Any =
                unwrap(this).getTargetTrackingConfigurations()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ScalingInstructionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty
            ): ScalingInstructionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ScalingInstructionProperty
            ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface PredefinedLoadMetricSpecificationProperty {
        /**
         * The metric type.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedloadmetricspecification-predefinedloadmetrictype)
         */
        public fun predefinedLoadMetricType(): String

        /**
         * Identifies the resource associated with the metric type.
         *
         * You can't specify a resource label unless the metric type is `ALBTargetGroupRequestCount`
         * and there is a target group for an Application Load Balancer attached to the Auto Scaling
         * group.
         *
         * You create the resource label by appending the final portion of the load balancer ARN and
         * the final portion of the target group ARN into a single value, separated by a forward
         * slash (/). The format is
         * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>,
         * where:
         * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer
         *   ARN
         * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
         *   group ARN.
         *
         * This is an example:
         * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
         *
         * To find the ARN for an Application Load Balancer, use the
         * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
         * API operation. To find the ARN for the target group, use the
         * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
         * API operation.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedloadmetricspecification-resourcelabel)
         */
        public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

        /** A builder for [PredefinedLoadMetricSpecificationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param predefinedLoadMetricType The metric type. */
            public fun predefinedLoadMetricType(predefinedLoadMetricType: String)

            /**
             * @param resourceLabel Identifies the resource associated with the metric type. You
             *   can't specify a resource label unless the metric type is
             *   `ALBTargetGroupRequestCount` and there is a target group for an Application Load
             *   Balancer attached to the Auto Scaling group.
             *
             * You create the resource label by appending the final portion of the load balancer ARN
             * and the final portion of the target group ARN into a single value, separated by a
             * forward slash (/). The format is
             * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>,
             * where:
             * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load
             *   balancer ARN
             * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the
             *   target group ARN.
             *
             * This is an example:
             * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
             *
             * To find the ARN for an Application Load Balancer, use the
             * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
             * API operation. To find the ARN for the target group, use the
             * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
             * API operation.
             */
            public fun resourceLabel(resourceLabel: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder =
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
                    .PredefinedLoadMetricSpecificationProperty
                    .builder()

            /** @param predefinedLoadMetricType The metric type. */
            override fun predefinedLoadMetricType(predefinedLoadMetricType: String) {
                cdkBuilder.predefinedLoadMetricType(predefinedLoadMetricType)
            }

            /**
             * @param resourceLabel Identifies the resource associated with the metric type. You
             *   can't specify a resource label unless the metric type is
             *   `ALBTargetGroupRequestCount` and there is a target group for an Application Load
             *   Balancer attached to the Auto Scaling group.
             *
             * You create the resource label by appending the final portion of the load balancer ARN
             * and the final portion of the target group ARN into a single value, separated by a
             * forward slash (/). The format is
             * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>,
             * where:
             * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load
             *   balancer ARN
             * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the
             *   target group ARN.
             *
             * This is an example:
             * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
             *
             * To find the ARN for an Application Load Balancer, use the
             * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
             * API operation. To find the ARN for the target group, use the
             * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
             * API operation.
             */
            override fun resourceLabel(resourceLabel: String) {
                cdkBuilder.resourceLabel(resourceLabel)
            }

            public fun build():
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty,
        ) : PredefinedLoadMetricSpecificationProperty {
            /**
             * The metric type.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedloadmetricspecification-predefinedloadmetrictype)
             */
            override fun predefinedLoadMetricType(): String =
                unwrap(this).getPredefinedLoadMetricType()

            /**
             * Identifies the resource associated with the metric type.
             *
             * You can't specify a resource label unless the metric type is
             * `ALBTargetGroupRequestCount` and there is a target group for an Application Load
             * Balancer attached to the Auto Scaling group.
             *
             * You create the resource label by appending the final portion of the load balancer ARN
             * and the final portion of the target group ARN into a single value, separated by a
             * forward slash (/). The format is
             * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>,
             * where:
             * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load
             *   balancer ARN
             * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the
             *   target group ARN.
             *
             * This is an example:
             * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
             *
             * To find the ARN for an Application Load Balancer, use the
             * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
             * API operation. To find the ARN for the target group, use the
             * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
             * API operation.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedloadmetricspecification-resourcelabel)
             */
            override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): PredefinedLoadMetricSpecificationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty
            ): PredefinedLoadMetricSpecificationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PredefinedLoadMetricSpecificationProperty
            ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
