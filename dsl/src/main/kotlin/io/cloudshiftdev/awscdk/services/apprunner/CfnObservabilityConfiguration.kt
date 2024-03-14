package io.cloudshiftdev.awscdk.services.apprunner

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
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnObservabilityConfiguration
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**
     * It's set to `true` for the configuration with the highest `Revision` among all configurations
     * that share the same `ObservabilityConfigurationName` .
     *
     * It's set to `false` otherwise.
     */
    public open fun attrLatest(): IResolvable = unwrap(this).getAttrLatest().let(IResolvable::wrap)

    /** The Amazon Resource Name (ARN) of this observability configuration. */
    public open fun attrObservabilityConfigurationArn(): String =
        unwrap(this).getAttrObservabilityConfigurationArn()

    /**
     * The revision of this observability configuration.
     *
     * It's unique among all the active configurations ( `"Status": "ACTIVE"` ) that share the same
     * `ObservabilityConfigurationName` .
     */
    public open fun attrObservabilityConfigurationRevision(): Number =
        unwrap(this).getAttrObservabilityConfigurationRevision()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** A name for the observability configuration. */
    public open fun observabilityConfigurationName(): String? =
        unwrap(this).getObservabilityConfigurationName()

    /** A name for the observability configuration. */
    public open fun observabilityConfigurationName(`value`: String) {
        unwrap(this).setObservabilityConfigurationName(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /**
     * A list of metadata items that you can associate with your observability configuration
     * resource.
     */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A list of metadata items that you can associate with your observability configuration
     * resource.
     */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /**
     * A list of metadata items that you can associate with your observability configuration
     * resource.
     */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** The configuration of the tracing feature within this observability configuration. */
    public open fun traceConfiguration(): Any? = unwrap(this).getTraceConfiguration()

    /** The configuration of the tracing feature within this observability configuration. */
    public open fun traceConfiguration(`value`: IResolvable) {
        unwrap(this).setTraceConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** The configuration of the tracing feature within this observability configuration. */
    public open fun traceConfiguration(`value`: TraceConfigurationProperty) {
        unwrap(this).setTraceConfiguration(`value`.let(TraceConfigurationProperty::unwrap))
    }

    /** The configuration of the tracing feature within this observability configuration. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cee5a56d6d4eb5726d4660dd0d93b4937a33ef2bf9f6477d7e23462730e4df91")
    public open fun traceConfiguration(
        `value`: TraceConfigurationProperty.Builder.() -> Unit
    ): Unit = traceConfiguration(TraceConfigurationProperty(`value`))

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.apprunner.CfnObservabilityConfiguration].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * A name for the observability configuration.
         *
         * When you use it for the first time in an AWS Region , App Runner creates revision number
         * `1` of this name. When you use the same name in subsequent calls, App Runner creates
         * incremental revisions of the configuration.
         *
         * The name `DefaultConfiguration` is reserved. You can't use it to create a new
         * observability configuration, and you can't create a revision of it.
         *
         * When you want to use your own observability configuration for your App Runner service,
         * *create a configuration with a different name* , and then provide it when you create or
         * update your service.
         *
         * If you don't specify a name, AWS CloudFormation generates a name for your observability
         * configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-observabilityconfigurationname)
         *
         * @param observabilityConfigurationName A name for the observability configuration.
         */
        public fun observabilityConfigurationName(observabilityConfigurationName: String)

        /**
         * A list of metadata items that you can associate with your observability configuration
         * resource.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-tags)
         *
         * @param tags A list of metadata items that you can associate with your observability
         *   configuration resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * A list of metadata items that you can associate with your observability configuration
         * resource.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-tags)
         *
         * @param tags A list of metadata items that you can associate with your observability
         *   configuration resource.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * The configuration of the tracing feature within this observability configuration.
         *
         * If you don't specify it, App Runner doesn't enable tracing.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-traceconfiguration)
         *
         * @param traceConfiguration The configuration of the tracing feature within this
         *   observability configuration.
         */
        public fun traceConfiguration(traceConfiguration: IResolvable)

        /**
         * The configuration of the tracing feature within this observability configuration.
         *
         * If you don't specify it, App Runner doesn't enable tracing.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-traceconfiguration)
         *
         * @param traceConfiguration The configuration of the tracing feature within this
         *   observability configuration.
         */
        public fun traceConfiguration(traceConfiguration: TraceConfigurationProperty)

        /**
         * The configuration of the tracing feature within this observability configuration.
         *
         * If you don't specify it, App Runner doesn't enable tracing.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-traceconfiguration)
         *
         * @param traceConfiguration The configuration of the tracing feature within this
         *   observability configuration.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7028513f5636ee1f40f285706d70135ba1109f4834c25920aef1e17a17fd7638")
        public fun traceConfiguration(
            traceConfiguration: TraceConfigurationProperty.Builder.() -> Unit
        )
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.Builder =
            software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.Builder.create(
                scope,
                id
            )

        /**
         * A name for the observability configuration.
         *
         * When you use it for the first time in an AWS Region , App Runner creates revision number
         * `1` of this name. When you use the same name in subsequent calls, App Runner creates
         * incremental revisions of the configuration.
         *
         * The name `DefaultConfiguration` is reserved. You can't use it to create a new
         * observability configuration, and you can't create a revision of it.
         *
         * When you want to use your own observability configuration for your App Runner service,
         * *create a configuration with a different name* , and then provide it when you create or
         * update your service.
         *
         * If you don't specify a name, AWS CloudFormation generates a name for your observability
         * configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-observabilityconfigurationname)
         *
         * @param observabilityConfigurationName A name for the observability configuration.
         */
        override fun observabilityConfigurationName(observabilityConfigurationName: String) {
            cdkBuilder.observabilityConfigurationName(observabilityConfigurationName)
        }

        /**
         * A list of metadata items that you can associate with your observability configuration
         * resource.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-tags)
         *
         * @param tags A list of metadata items that you can associate with your observability
         *   configuration resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * A list of metadata items that you can associate with your observability configuration
         * resource.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-tags)
         *
         * @param tags A list of metadata items that you can associate with your observability
         *   configuration resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * The configuration of the tracing feature within this observability configuration.
         *
         * If you don't specify it, App Runner doesn't enable tracing.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-traceconfiguration)
         *
         * @param traceConfiguration The configuration of the tracing feature within this
         *   observability configuration.
         */
        override fun traceConfiguration(traceConfiguration: IResolvable) {
            cdkBuilder.traceConfiguration(traceConfiguration.let(IResolvable::unwrap))
        }

        /**
         * The configuration of the tracing feature within this observability configuration.
         *
         * If you don't specify it, App Runner doesn't enable tracing.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-traceconfiguration)
         *
         * @param traceConfiguration The configuration of the tracing feature within this
         *   observability configuration.
         */
        override fun traceConfiguration(traceConfiguration: TraceConfigurationProperty) {
            cdkBuilder.traceConfiguration(
                traceConfiguration.let(TraceConfigurationProperty::unwrap)
            )
        }

        /**
         * The configuration of the tracing feature within this observability configuration.
         *
         * If you don't specify it, App Runner doesn't enable tracing.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-observabilityconfiguration.html#cfn-apprunner-observabilityconfiguration-traceconfiguration)
         *
         * @param traceConfiguration The configuration of the tracing feature within this
         *   observability configuration.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7028513f5636ee1f40f285706d70135ba1109f4834c25920aef1e17a17fd7638")
        override fun traceConfiguration(
            traceConfiguration: TraceConfigurationProperty.Builder.() -> Unit
        ): Unit = traceConfiguration(TraceConfigurationProperty(traceConfiguration))

        public fun build():
            software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnObservabilityConfiguration {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnObservabilityConfiguration(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration
        ): CfnObservabilityConfiguration = CfnObservabilityConfiguration(cdkObject)

        internal fun unwrap(
            wrapped: CfnObservabilityConfiguration
        ): software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration =
            wrapped.cdkObject
    }

    public interface TraceConfigurationProperty {
        /**
         * The implementation provider chosen for tracing App Runner services.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-observabilityconfiguration-traceconfiguration.html#cfn-apprunner-observabilityconfiguration-traceconfiguration-vendor)
         */
        public fun vendor(): String

        /** A builder for [TraceConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param vendor The implementation provider chosen for tracing App Runner services. */
            public fun vendor(vendor: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.TraceConfigurationProperty.Builder =
                software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration
                    .TraceConfigurationProperty
                    .builder()

            /** @param vendor The implementation provider chosen for tracing App Runner services. */
            override fun vendor(vendor: String) {
                cdkBuilder.vendor(vendor)
            }

            public fun build():
                software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.TraceConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.TraceConfigurationProperty,
        ) : TraceConfigurationProperty {
            /**
             * The implementation provider chosen for tracing App Runner services.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-observabilityconfiguration-traceconfiguration.html#cfn-apprunner-observabilityconfiguration-traceconfiguration-vendor)
             */
            override fun vendor(): String = unwrap(this).getVendor()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): TraceConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.TraceConfigurationProperty
            ): TraceConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TraceConfigurationProperty
            ): software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.TraceConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
