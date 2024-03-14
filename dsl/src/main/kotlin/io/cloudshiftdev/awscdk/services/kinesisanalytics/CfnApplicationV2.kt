package io.cloudshiftdev.awscdk.services.kinesisanalytics

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
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplicationV2
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** Use this parameter to configure the application. */
    public open fun applicationConfiguration(): Any? = unwrap(this).getApplicationConfiguration()

    /** Use this parameter to configure the application. */
    public open fun applicationConfiguration(`value`: IResolvable) {
        unwrap(this).setApplicationConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** Use this parameter to configure the application. */
    public open fun applicationConfiguration(`value`: ApplicationConfigurationProperty) {
        unwrap(this)
            .setApplicationConfiguration(`value`.let(ApplicationConfigurationProperty::unwrap))
    }

    /** Use this parameter to configure the application. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b5e11ba49e9164d8866a42e0693f67b97c4ed66de9086a82f6094e15d52e5c9")
    public open fun applicationConfiguration(
        `value`: ApplicationConfigurationProperty.Builder.() -> Unit
    ): Unit = applicationConfiguration(ApplicationConfigurationProperty(`value`))

    /** The description of the application. */
    public open fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

    /** The description of the application. */
    public open fun applicationDescription(`value`: String) {
        unwrap(this).setApplicationDescription(`value`)
    }

    /** Describes the maintenance configuration for the application. */
    public open fun applicationMaintenanceConfiguration(): Any? =
        unwrap(this).getApplicationMaintenanceConfiguration()

    /** Describes the maintenance configuration for the application. */
    public open fun applicationMaintenanceConfiguration(`value`: IResolvable) {
        unwrap(this).setApplicationMaintenanceConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** Describes the maintenance configuration for the application. */
    public open fun applicationMaintenanceConfiguration(
        `value`: ApplicationMaintenanceConfigurationProperty
    ) {
        unwrap(this)
            .setApplicationMaintenanceConfiguration(
                `value`.let(ApplicationMaintenanceConfigurationProperty::unwrap)
            )
    }

    /** Describes the maintenance configuration for the application. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdb94f1cebb358733aba10228ef4aa1abf1ca8ea84db3c5fc90e06ed008658fe")
    public open fun applicationMaintenanceConfiguration(
        `value`: ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit
    ): Unit =
        applicationMaintenanceConfiguration(ApplicationMaintenanceConfigurationProperty(`value`))

    /**
     * To create a Kinesis Data Analytics Studio notebook, you must set the mode to `INTERACTIVE` .
     */
    public open fun applicationMode(): String? = unwrap(this).getApplicationMode()

    /**
     * To create a Kinesis Data Analytics Studio notebook, you must set the mode to `INTERACTIVE` .
     */
    public open fun applicationMode(`value`: String) {
        unwrap(this).setApplicationMode(`value`)
    }

    /** The name of the application. */
    public open fun applicationName(): String? = unwrap(this).getApplicationName()

    /** The name of the application. */
    public open fun applicationName(`value`: String) {
        unwrap(this).setApplicationName(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Describes the starting parameters for an Managed Service for Apache Flink application. */
    public open fun runConfiguration(): Any? = unwrap(this).getRunConfiguration()

    /** Describes the starting parameters for an Managed Service for Apache Flink application. */
    public open fun runConfiguration(`value`: IResolvable) {
        unwrap(this).setRunConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** Describes the starting parameters for an Managed Service for Apache Flink application. */
    public open fun runConfiguration(`value`: RunConfigurationProperty) {
        unwrap(this).setRunConfiguration(`value`.let(RunConfigurationProperty::unwrap))
    }

    /** Describes the starting parameters for an Managed Service for Apache Flink application. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97125d14e64cf3cfe0110c9ed9e29c30322d724c4fd770bc6507c109daede9ea")
    public open fun runConfiguration(`value`: RunConfigurationProperty.Builder.() -> Unit): Unit =
        runConfiguration(RunConfigurationProperty(`value`))

    /** The runtime environment for the application. */
    public open fun runtimeEnvironment(): String = unwrap(this).getRuntimeEnvironment()

    /** The runtime environment for the application. */
    public open fun runtimeEnvironment(`value`: String) {
        unwrap(this).setRuntimeEnvironment(`value`)
    }

    /** Specifies the IAM role that the application uses to access external resources. */
    public open fun serviceExecutionRole(): String = unwrap(this).getServiceExecutionRole()

    /** Specifies the IAM role that the application uses to access external resources. */
    public open fun serviceExecutionRole(`value`: String) {
        unwrap(this).setServiceExecutionRole(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** A list of one or more tags to assign to the application. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** A list of one or more tags to assign to the application. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** A list of one or more tags to assign to the application. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesisanalytics.CfnApplicationV2].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * Use this parameter to configure the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
         *
         * @param applicationConfiguration Use this parameter to configure the application.
         */
        public fun applicationConfiguration(applicationConfiguration: IResolvable)

        /**
         * Use this parameter to configure the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
         *
         * @param applicationConfiguration Use this parameter to configure the application.
         */
        public fun applicationConfiguration(
            applicationConfiguration: ApplicationConfigurationProperty
        )

        /**
         * Use this parameter to configure the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
         *
         * @param applicationConfiguration Use this parameter to configure the application.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e2461bc2b62111ee8d16bfb11e5471f0c864aee523ab14ff01e7868d9632ad11")
        public fun applicationConfiguration(
            applicationConfiguration: ApplicationConfigurationProperty.Builder.() -> Unit
        )

        /**
         * The description of the application.
         *
         * Default: - ""
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationdescription)
         *
         * @param applicationDescription The description of the application.
         */
        public fun applicationDescription(applicationDescription: String)

        /**
         * Describes the maintenance configuration for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
         *
         * @param applicationMaintenanceConfiguration Describes the maintenance configuration for
         *   the application.
         */
        public fun applicationMaintenanceConfiguration(
            applicationMaintenanceConfiguration: IResolvable
        )

        /**
         * Describes the maintenance configuration for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
         *
         * @param applicationMaintenanceConfiguration Describes the maintenance configuration for
         *   the application.
         */
        public fun applicationMaintenanceConfiguration(
            applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty
        )

        /**
         * Describes the maintenance configuration for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
         *
         * @param applicationMaintenanceConfiguration Describes the maintenance configuration for
         *   the application.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("5c0917024c31d712ff0173d51f996e37b3b43030d06df00cd121122e235f8e60")
        public fun applicationMaintenanceConfiguration(
            applicationMaintenanceConfiguration:
                ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit
        )

        /**
         * To create a Kinesis Data Analytics Studio notebook, you must set the mode to
         * `INTERACTIVE` .
         *
         * However, for a Kinesis Data Analytics for Apache Flink application, the mode is optional.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmode)
         *
         * @param applicationMode To create a Kinesis Data Analytics Studio notebook, you must set
         *   the mode to `INTERACTIVE` .
         */
        public fun applicationMode(applicationMode: String)

        /**
         * The name of the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationname)
         *
         * @param applicationName The name of the application.
         */
        public fun applicationName(applicationName: String)

        /**
         * Describes the starting parameters for an Managed Service for Apache Flink application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
         *
         * @param runConfiguration Describes the starting parameters for an Managed Service for
         *   Apache Flink application.
         */
        public fun runConfiguration(runConfiguration: IResolvable)

        /**
         * Describes the starting parameters for an Managed Service for Apache Flink application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
         *
         * @param runConfiguration Describes the starting parameters for an Managed Service for
         *   Apache Flink application.
         */
        public fun runConfiguration(runConfiguration: RunConfigurationProperty)

        /**
         * Describes the starting parameters for an Managed Service for Apache Flink application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
         *
         * @param runConfiguration Describes the starting parameters for an Managed Service for
         *   Apache Flink application.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ccfbb79cafb763a2efbd29aba4eb92d1fba1e794d7068802fc41131c81325ff3")
        public fun runConfiguration(runConfiguration: RunConfigurationProperty.Builder.() -> Unit)

        /**
         * The runtime environment for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runtimeenvironment)
         *
         * @param runtimeEnvironment The runtime environment for the application.
         */
        public fun runtimeEnvironment(runtimeEnvironment: String)

        /**
         * Specifies the IAM role that the application uses to access external resources.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-serviceexecutionrole)
         *
         * @param serviceExecutionRole Specifies the IAM role that the application uses to access
         *   external resources.
         */
        public fun serviceExecutionRole(serviceExecutionRole: String)

        /**
         * A list of one or more tags to assign to the application.
         *
         * A tag is a key-value pair that identifies an application. Note that the maximum number of
         * application tags includes system tags. The maximum number of user-defined application
         * tags is 50.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-tags)
         *
         * @param tags A list of one or more tags to assign to the application.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * A list of one or more tags to assign to the application.
         *
         * A tag is a key-value pair that identifies an application. Note that the maximum number of
         * application tags includes system tags. The maximum number of user-defined application
         * tags is 50.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-tags)
         *
         * @param tags A list of one or more tags to assign to the application.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.Builder =
            software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.Builder.create(
                scope,
                id
            )

        /**
         * Use this parameter to configure the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
         *
         * @param applicationConfiguration Use this parameter to configure the application.
         */
        override fun applicationConfiguration(applicationConfiguration: IResolvable) {
            cdkBuilder.applicationConfiguration(applicationConfiguration.let(IResolvable::unwrap))
        }

        /**
         * Use this parameter to configure the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
         *
         * @param applicationConfiguration Use this parameter to configure the application.
         */
        override fun applicationConfiguration(
            applicationConfiguration: ApplicationConfigurationProperty
        ) {
            cdkBuilder.applicationConfiguration(
                applicationConfiguration.let(ApplicationConfigurationProperty::unwrap)
            )
        }

        /**
         * Use this parameter to configure the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
         *
         * @param applicationConfiguration Use this parameter to configure the application.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e2461bc2b62111ee8d16bfb11e5471f0c864aee523ab14ff01e7868d9632ad11")
        override fun applicationConfiguration(
            applicationConfiguration: ApplicationConfigurationProperty.Builder.() -> Unit
        ): Unit =
            applicationConfiguration(ApplicationConfigurationProperty(applicationConfiguration))

        /**
         * The description of the application.
         *
         * Default: - ""
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationdescription)
         *
         * @param applicationDescription The description of the application.
         */
        override fun applicationDescription(applicationDescription: String) {
            cdkBuilder.applicationDescription(applicationDescription)
        }

        /**
         * Describes the maintenance configuration for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
         *
         * @param applicationMaintenanceConfiguration Describes the maintenance configuration for
         *   the application.
         */
        override fun applicationMaintenanceConfiguration(
            applicationMaintenanceConfiguration: IResolvable
        ) {
            cdkBuilder.applicationMaintenanceConfiguration(
                applicationMaintenanceConfiguration.let(IResolvable::unwrap)
            )
        }

        /**
         * Describes the maintenance configuration for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
         *
         * @param applicationMaintenanceConfiguration Describes the maintenance configuration for
         *   the application.
         */
        override fun applicationMaintenanceConfiguration(
            applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty
        ) {
            cdkBuilder.applicationMaintenanceConfiguration(
                applicationMaintenanceConfiguration.let(
                    ApplicationMaintenanceConfigurationProperty::unwrap
                )
            )
        }

        /**
         * Describes the maintenance configuration for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
         *
         * @param applicationMaintenanceConfiguration Describes the maintenance configuration for
         *   the application.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("5c0917024c31d712ff0173d51f996e37b3b43030d06df00cd121122e235f8e60")
        override fun applicationMaintenanceConfiguration(
            applicationMaintenanceConfiguration:
                ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit
        ): Unit =
            applicationMaintenanceConfiguration(
                ApplicationMaintenanceConfigurationProperty(applicationMaintenanceConfiguration)
            )

        /**
         * To create a Kinesis Data Analytics Studio notebook, you must set the mode to
         * `INTERACTIVE` .
         *
         * However, for a Kinesis Data Analytics for Apache Flink application, the mode is optional.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmode)
         *
         * @param applicationMode To create a Kinesis Data Analytics Studio notebook, you must set
         *   the mode to `INTERACTIVE` .
         */
        override fun applicationMode(applicationMode: String) {
            cdkBuilder.applicationMode(applicationMode)
        }

        /**
         * The name of the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationname)
         *
         * @param applicationName The name of the application.
         */
        override fun applicationName(applicationName: String) {
            cdkBuilder.applicationName(applicationName)
        }

        /**
         * Describes the starting parameters for an Managed Service for Apache Flink application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
         *
         * @param runConfiguration Describes the starting parameters for an Managed Service for
         *   Apache Flink application.
         */
        override fun runConfiguration(runConfiguration: IResolvable) {
            cdkBuilder.runConfiguration(runConfiguration.let(IResolvable::unwrap))
        }

        /**
         * Describes the starting parameters for an Managed Service for Apache Flink application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
         *
         * @param runConfiguration Describes the starting parameters for an Managed Service for
         *   Apache Flink application.
         */
        override fun runConfiguration(runConfiguration: RunConfigurationProperty) {
            cdkBuilder.runConfiguration(runConfiguration.let(RunConfigurationProperty::unwrap))
        }

        /**
         * Describes the starting parameters for an Managed Service for Apache Flink application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
         *
         * @param runConfiguration Describes the starting parameters for an Managed Service for
         *   Apache Flink application.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ccfbb79cafb763a2efbd29aba4eb92d1fba1e794d7068802fc41131c81325ff3")
        override fun runConfiguration(
            runConfiguration: RunConfigurationProperty.Builder.() -> Unit
        ): Unit = runConfiguration(RunConfigurationProperty(runConfiguration))

        /**
         * The runtime environment for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runtimeenvironment)
         *
         * @param runtimeEnvironment The runtime environment for the application.
         */
        override fun runtimeEnvironment(runtimeEnvironment: String) {
            cdkBuilder.runtimeEnvironment(runtimeEnvironment)
        }

        /**
         * Specifies the IAM role that the application uses to access external resources.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-serviceexecutionrole)
         *
         * @param serviceExecutionRole Specifies the IAM role that the application uses to access
         *   external resources.
         */
        override fun serviceExecutionRole(serviceExecutionRole: String) {
            cdkBuilder.serviceExecutionRole(serviceExecutionRole)
        }

        /**
         * A list of one or more tags to assign to the application.
         *
         * A tag is a key-value pair that identifies an application. Note that the maximum number of
         * application tags includes system tags. The maximum number of user-defined application
         * tags is 50.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-tags)
         *
         * @param tags A list of one or more tags to assign to the application.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * A list of one or more tags to assign to the application.
         *
         * A tag is a key-value pair that identifies an application. Note that the maximum number of
         * application tags includes system tags. The maximum number of user-defined application
         * tags is 50.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-tags)
         *
         * @param tags A list of one or more tags to assign to the application.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2 =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnApplicationV2 {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnApplicationV2(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
        ): CfnApplicationV2 = CfnApplicationV2(cdkObject)

        internal fun unwrap(
            wrapped: CfnApplicationV2
        ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2 = wrapped.cdkObject
    }

    public interface ApplicationConfigurationProperty {
        /**
         * The code location and type parameters for a Managed Service for Apache Flink application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-applicationcodeconfiguration)
         */
        public fun applicationCodeConfiguration(): Any? =
            unwrap(this).getApplicationCodeConfiguration()

        /**
         * Describes whether snapshots are enabled for a Managed Service for Apache Flink
         * application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-applicationsnapshotconfiguration)
         */
        public fun applicationSnapshotConfiguration(): Any? =
            unwrap(this).getApplicationSnapshotConfiguration()

        /**
         * Describes execution properties for a Managed Service for Apache Flink application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-environmentproperties)
         */
        public fun environmentProperties(): Any? = unwrap(this).getEnvironmentProperties()

        /**
         * The creation and update parameters for a Managed Service for Apache Flink application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-flinkapplicationconfiguration)
         */
        public fun flinkApplicationConfiguration(): Any? =
            unwrap(this).getFlinkApplicationConfiguration()

        /**
         * The creation and update parameters for a SQL-based Managed Service for Apache Flink
         * application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-sqlapplicationconfiguration)
         */
        public fun sqlApplicationConfiguration(): Any? =
            unwrap(this).getSqlApplicationConfiguration()

        /**
         * The array of descriptions of VPC configurations available to the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-vpcconfigurations)
         */
        public fun vpcConfigurations(): Any? = unwrap(this).getVpcConfigurations()

        /**
         * The configuration parameters for a Kinesis Data Analytics Studio notebook.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-zeppelinapplicationconfiguration)
         */
        public fun zeppelinApplicationConfiguration(): Any? =
            unwrap(this).getZeppelinApplicationConfiguration()

        /** A builder for [ApplicationConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param applicationCodeConfiguration The code location and type parameters for a
             *   Managed Service for Apache Flink application.
             */
            public fun applicationCodeConfiguration(applicationCodeConfiguration: IResolvable)

            /**
             * @param applicationCodeConfiguration The code location and type parameters for a
             *   Managed Service for Apache Flink application.
             */
            public fun applicationCodeConfiguration(
                applicationCodeConfiguration: ApplicationCodeConfigurationProperty
            )

            /**
             * @param applicationCodeConfiguration The code location and type parameters for a
             *   Managed Service for Apache Flink application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5183db265e1aee172022265f5cfaccfeb5c83d87bd85388c41bb7878c858d108")
            public fun applicationCodeConfiguration(
                applicationCodeConfiguration:
                    ApplicationCodeConfigurationProperty.Builder.() -> Unit
            )

            /**
             * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
             *   Managed Service for Apache Flink application.
             */
            public fun applicationSnapshotConfiguration(
                applicationSnapshotConfiguration: IResolvable
            )

            /**
             * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
             *   Managed Service for Apache Flink application.
             */
            public fun applicationSnapshotConfiguration(
                applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty
            )

            /**
             * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
             *   Managed Service for Apache Flink application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f93f805f65fadc3b63cfb361bd2a49f4db63fc51fe1800d226c57963a17f2f24")
            public fun applicationSnapshotConfiguration(
                applicationSnapshotConfiguration:
                    ApplicationSnapshotConfigurationProperty.Builder.() -> Unit
            )

            /**
             * @param environmentProperties Describes execution properties for a Managed Service for
             *   Apache Flink application.
             */
            public fun environmentProperties(environmentProperties: IResolvable)

            /**
             * @param environmentProperties Describes execution properties for a Managed Service for
             *   Apache Flink application.
             */
            public fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty)

            /**
             * @param environmentProperties Describes execution properties for a Managed Service for
             *   Apache Flink application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("51366589d5f670f05c811a953407812cf8a2373acca786d670e30637e4968f42")
            public fun environmentProperties(
                environmentProperties: EnvironmentPropertiesProperty.Builder.() -> Unit
            )

            /**
             * @param flinkApplicationConfiguration The creation and update parameters for a Managed
             *   Service for Apache Flink application.
             */
            public fun flinkApplicationConfiguration(flinkApplicationConfiguration: IResolvable)

            /**
             * @param flinkApplicationConfiguration The creation and update parameters for a Managed
             *   Service for Apache Flink application.
             */
            public fun flinkApplicationConfiguration(
                flinkApplicationConfiguration: FlinkApplicationConfigurationProperty
            )

            /**
             * @param flinkApplicationConfiguration The creation and update parameters for a Managed
             *   Service for Apache Flink application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5113cb0b71cc6c88dd7ebe6cafe469183aabccff994515d9b052dd60df69fe1c")
            public fun flinkApplicationConfiguration(
                flinkApplicationConfiguration:
                    FlinkApplicationConfigurationProperty.Builder.() -> Unit
            )

            /**
             * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based
             *   Managed Service for Apache Flink application.
             */
            public fun sqlApplicationConfiguration(sqlApplicationConfiguration: IResolvable)

            /**
             * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based
             *   Managed Service for Apache Flink application.
             */
            public fun sqlApplicationConfiguration(
                sqlApplicationConfiguration: SqlApplicationConfigurationProperty
            )

            /**
             * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based
             *   Managed Service for Apache Flink application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5c5e8903b11230e80603cfcf6061ea65675f4ba6dca2394b69443e17adbf10f1")
            public fun sqlApplicationConfiguration(
                sqlApplicationConfiguration: SqlApplicationConfigurationProperty.Builder.() -> Unit
            )

            /**
             * @param vpcConfigurations The array of descriptions of VPC configurations available to
             *   the application.
             */
            public fun vpcConfigurations(vpcConfigurations: IResolvable)

            /**
             * @param vpcConfigurations The array of descriptions of VPC configurations available to
             *   the application.
             */
            public fun vpcConfigurations(vpcConfigurations: List<Any>)

            /**
             * @param vpcConfigurations The array of descriptions of VPC configurations available to
             *   the application.
             */
            public fun vpcConfigurations(vararg vpcConfigurations: Any)

            /**
             * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis
             *   Data Analytics Studio notebook.
             */
            public fun zeppelinApplicationConfiguration(
                zeppelinApplicationConfiguration: IResolvable
            )

            /**
             * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis
             *   Data Analytics Studio notebook.
             */
            public fun zeppelinApplicationConfiguration(
                zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty
            )

            /**
             * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis
             *   Data Analytics Studio notebook.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5512345b33fc22457b322e874d621c752f1ca40bb263f439750cb5398ec9c8e6")
            public fun zeppelinApplicationConfiguration(
                zeppelinApplicationConfiguration:
                    ZeppelinApplicationConfigurationProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .ApplicationConfigurationProperty
                    .builder()

            /**
             * @param applicationCodeConfiguration The code location and type parameters for a
             *   Managed Service for Apache Flink application.
             */
            override fun applicationCodeConfiguration(applicationCodeConfiguration: IResolvable) {
                cdkBuilder.applicationCodeConfiguration(
                    applicationCodeConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param applicationCodeConfiguration The code location and type parameters for a
             *   Managed Service for Apache Flink application.
             */
            override fun applicationCodeConfiguration(
                applicationCodeConfiguration: ApplicationCodeConfigurationProperty
            ) {
                cdkBuilder.applicationCodeConfiguration(
                    applicationCodeConfiguration.let(ApplicationCodeConfigurationProperty::unwrap)
                )
            }

            /**
             * @param applicationCodeConfiguration The code location and type parameters for a
             *   Managed Service for Apache Flink application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5183db265e1aee172022265f5cfaccfeb5c83d87bd85388c41bb7878c858d108")
            override fun applicationCodeConfiguration(
                applicationCodeConfiguration:
                    ApplicationCodeConfigurationProperty.Builder.() -> Unit
            ): Unit =
                applicationCodeConfiguration(
                    ApplicationCodeConfigurationProperty(applicationCodeConfiguration)
                )

            /**
             * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
             *   Managed Service for Apache Flink application.
             */
            override fun applicationSnapshotConfiguration(
                applicationSnapshotConfiguration: IResolvable
            ) {
                cdkBuilder.applicationSnapshotConfiguration(
                    applicationSnapshotConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
             *   Managed Service for Apache Flink application.
             */
            override fun applicationSnapshotConfiguration(
                applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty
            ) {
                cdkBuilder.applicationSnapshotConfiguration(
                    applicationSnapshotConfiguration.let(
                        ApplicationSnapshotConfigurationProperty::unwrap
                    )
                )
            }

            /**
             * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
             *   Managed Service for Apache Flink application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f93f805f65fadc3b63cfb361bd2a49f4db63fc51fe1800d226c57963a17f2f24")
            override fun applicationSnapshotConfiguration(
                applicationSnapshotConfiguration:
                    ApplicationSnapshotConfigurationProperty.Builder.() -> Unit
            ): Unit =
                applicationSnapshotConfiguration(
                    ApplicationSnapshotConfigurationProperty(applicationSnapshotConfiguration)
                )

            /**
             * @param environmentProperties Describes execution properties for a Managed Service for
             *   Apache Flink application.
             */
            override fun environmentProperties(environmentProperties: IResolvable) {
                cdkBuilder.environmentProperties(environmentProperties.let(IResolvable::unwrap))
            }

            /**
             * @param environmentProperties Describes execution properties for a Managed Service for
             *   Apache Flink application.
             */
            override fun environmentProperties(
                environmentProperties: EnvironmentPropertiesProperty
            ) {
                cdkBuilder.environmentProperties(
                    environmentProperties.let(EnvironmentPropertiesProperty::unwrap)
                )
            }

            /**
             * @param environmentProperties Describes execution properties for a Managed Service for
             *   Apache Flink application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("51366589d5f670f05c811a953407812cf8a2373acca786d670e30637e4968f42")
            override fun environmentProperties(
                environmentProperties: EnvironmentPropertiesProperty.Builder.() -> Unit
            ): Unit = environmentProperties(EnvironmentPropertiesProperty(environmentProperties))

            /**
             * @param flinkApplicationConfiguration The creation and update parameters for a Managed
             *   Service for Apache Flink application.
             */
            override fun flinkApplicationConfiguration(flinkApplicationConfiguration: IResolvable) {
                cdkBuilder.flinkApplicationConfiguration(
                    flinkApplicationConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param flinkApplicationConfiguration The creation and update parameters for a Managed
             *   Service for Apache Flink application.
             */
            override fun flinkApplicationConfiguration(
                flinkApplicationConfiguration: FlinkApplicationConfigurationProperty
            ) {
                cdkBuilder.flinkApplicationConfiguration(
                    flinkApplicationConfiguration.let(FlinkApplicationConfigurationProperty::unwrap)
                )
            }

            /**
             * @param flinkApplicationConfiguration The creation and update parameters for a Managed
             *   Service for Apache Flink application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5113cb0b71cc6c88dd7ebe6cafe469183aabccff994515d9b052dd60df69fe1c")
            override fun flinkApplicationConfiguration(
                flinkApplicationConfiguration:
                    FlinkApplicationConfigurationProperty.Builder.() -> Unit
            ): Unit =
                flinkApplicationConfiguration(
                    FlinkApplicationConfigurationProperty(flinkApplicationConfiguration)
                )

            /**
             * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based
             *   Managed Service for Apache Flink application.
             */
            override fun sqlApplicationConfiguration(sqlApplicationConfiguration: IResolvable) {
                cdkBuilder.sqlApplicationConfiguration(
                    sqlApplicationConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based
             *   Managed Service for Apache Flink application.
             */
            override fun sqlApplicationConfiguration(
                sqlApplicationConfiguration: SqlApplicationConfigurationProperty
            ) {
                cdkBuilder.sqlApplicationConfiguration(
                    sqlApplicationConfiguration.let(SqlApplicationConfigurationProperty::unwrap)
                )
            }

            /**
             * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based
             *   Managed Service for Apache Flink application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5c5e8903b11230e80603cfcf6061ea65675f4ba6dca2394b69443e17adbf10f1")
            override fun sqlApplicationConfiguration(
                sqlApplicationConfiguration: SqlApplicationConfigurationProperty.Builder.() -> Unit
            ): Unit =
                sqlApplicationConfiguration(
                    SqlApplicationConfigurationProperty(sqlApplicationConfiguration)
                )

            /**
             * @param vpcConfigurations The array of descriptions of VPC configurations available to
             *   the application.
             */
            override fun vpcConfigurations(vpcConfigurations: IResolvable) {
                cdkBuilder.vpcConfigurations(vpcConfigurations.let(IResolvable::unwrap))
            }

            /**
             * @param vpcConfigurations The array of descriptions of VPC configurations available to
             *   the application.
             */
            override fun vpcConfigurations(vpcConfigurations: List<Any>) {
                cdkBuilder.vpcConfigurations(vpcConfigurations)
            }

            /**
             * @param vpcConfigurations The array of descriptions of VPC configurations available to
             *   the application.
             */
            override fun vpcConfigurations(vararg vpcConfigurations: Any): Unit =
                vpcConfigurations(vpcConfigurations.toList())

            /**
             * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis
             *   Data Analytics Studio notebook.
             */
            override fun zeppelinApplicationConfiguration(
                zeppelinApplicationConfiguration: IResolvable
            ) {
                cdkBuilder.zeppelinApplicationConfiguration(
                    zeppelinApplicationConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis
             *   Data Analytics Studio notebook.
             */
            override fun zeppelinApplicationConfiguration(
                zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty
            ) {
                cdkBuilder.zeppelinApplicationConfiguration(
                    zeppelinApplicationConfiguration.let(
                        ZeppelinApplicationConfigurationProperty::unwrap
                    )
                )
            }

            /**
             * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis
             *   Data Analytics Studio notebook.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5512345b33fc22457b322e874d621c752f1ca40bb263f439750cb5398ec9c8e6")
            override fun zeppelinApplicationConfiguration(
                zeppelinApplicationConfiguration:
                    ZeppelinApplicationConfigurationProperty.Builder.() -> Unit
            ): Unit =
                zeppelinApplicationConfiguration(
                    ZeppelinApplicationConfigurationProperty(zeppelinApplicationConfiguration)
                )

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty,
        ) : ApplicationConfigurationProperty {
            /**
             * The code location and type parameters for a Managed Service for Apache Flink
             * application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-applicationcodeconfiguration)
             */
            override fun applicationCodeConfiguration(): Any? =
                unwrap(this).getApplicationCodeConfiguration()

            /**
             * Describes whether snapshots are enabled for a Managed Service for Apache Flink
             * application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-applicationsnapshotconfiguration)
             */
            override fun applicationSnapshotConfiguration(): Any? =
                unwrap(this).getApplicationSnapshotConfiguration()

            /**
             * Describes execution properties for a Managed Service for Apache Flink application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-environmentproperties)
             */
            override fun environmentProperties(): Any? = unwrap(this).getEnvironmentProperties()

            /**
             * The creation and update parameters for a Managed Service for Apache Flink
             * application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-flinkapplicationconfiguration)
             */
            override fun flinkApplicationConfiguration(): Any? =
                unwrap(this).getFlinkApplicationConfiguration()

            /**
             * The creation and update parameters for a SQL-based Managed Service for Apache Flink
             * application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-sqlapplicationconfiguration)
             */
            override fun sqlApplicationConfiguration(): Any? =
                unwrap(this).getSqlApplicationConfiguration()

            /**
             * The array of descriptions of VPC configurations available to the application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-vpcconfigurations)
             */
            override fun vpcConfigurations(): Any? = unwrap(this).getVpcConfigurations()

            /**
             * The configuration parameters for a Kinesis Data Analytics Studio notebook.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-zeppelinapplicationconfiguration)
             */
            override fun zeppelinApplicationConfiguration(): Any? =
                unwrap(this).getZeppelinApplicationConfiguration()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ApplicationConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty
            ): ApplicationConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ApplicationConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface KinesisStreamsInputProperty {
        /**
         * The ARN of the input Kinesis data stream to read.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html#cfn-kinesisanalyticsv2-application-kinesisstreamsinput-resourcearn)
         */
        public fun resourceArn(): String

        /** A builder for [KinesisStreamsInputProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param resourceArn The ARN of the input Kinesis data stream to read. */
            public fun resourceArn(resourceArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .KinesisStreamsInputProperty
                    .builder()

            /** @param resourceArn The ARN of the input Kinesis data stream to read. */
            override fun resourceArn(resourceArn: String) {
                cdkBuilder.resourceArn(resourceArn)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty,
        ) : KinesisStreamsInputProperty {
            /**
             * The ARN of the input Kinesis data stream to read.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html#cfn-kinesisanalyticsv2-application-kinesisstreamsinput-resourcearn)
             */
            override fun resourceArn(): String = unwrap(this).getResourceArn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): KinesisStreamsInputProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty
            ): KinesisStreamsInputProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: KinesisStreamsInputProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MappingParametersProperty {
        /**
         * Provides additional mapping information when the record format uses delimiters (for
         * example, CSV).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mappingparameters.html#cfn-kinesisanalyticsv2-application-mappingparameters-csvmappingparameters)
         */
        public fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

        /**
         * Provides additional mapping information when JSON is the record format on the streaming
         * source.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mappingparameters.html#cfn-kinesisanalyticsv2-application-mappingparameters-jsonmappingparameters)
         */
        public fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()

        /** A builder for [MappingParametersProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param csvMappingParameters Provides additional mapping information when the record
             *   format uses delimiters (for example, CSV).
             */
            public fun csvMappingParameters(csvMappingParameters: IResolvable)

            /**
             * @param csvMappingParameters Provides additional mapping information when the record
             *   format uses delimiters (for example, CSV).
             */
            public fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty)

            /**
             * @param csvMappingParameters Provides additional mapping information when the record
             *   format uses delimiters (for example, CSV).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e03d667539e6d937f0d660ec33db8a3908c3a5028e9965220b600a57f69b002f")
            public fun csvMappingParameters(
                csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit
            )

            /**
             * @param jsonMappingParameters Provides additional mapping information when JSON is the
             *   record format on the streaming source.
             */
            public fun jsonMappingParameters(jsonMappingParameters: IResolvable)

            /**
             * @param jsonMappingParameters Provides additional mapping information when JSON is the
             *   record format on the streaming source.
             */
            public fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty)

            /**
             * @param jsonMappingParameters Provides additional mapping information when JSON is the
             *   record format on the streaming source.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a687b0e095f8fc8bed12385c9c5405e169f32fc6bffaf1e990837e29501a83d1")
            public fun jsonMappingParameters(
                jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .MappingParametersProperty
                    .builder()

            /**
             * @param csvMappingParameters Provides additional mapping information when the record
             *   format uses delimiters (for example, CSV).
             */
            override fun csvMappingParameters(csvMappingParameters: IResolvable) {
                cdkBuilder.csvMappingParameters(csvMappingParameters.let(IResolvable::unwrap))
            }

            /**
             * @param csvMappingParameters Provides additional mapping information when the record
             *   format uses delimiters (for example, CSV).
             */
            override fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
                cdkBuilder.csvMappingParameters(
                    csvMappingParameters.let(CSVMappingParametersProperty::unwrap)
                )
            }

            /**
             * @param csvMappingParameters Provides additional mapping information when the record
             *   format uses delimiters (for example, CSV).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e03d667539e6d937f0d660ec33db8a3908c3a5028e9965220b600a57f69b002f")
            override fun csvMappingParameters(
                csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit
            ): Unit = csvMappingParameters(CSVMappingParametersProperty(csvMappingParameters))

            /**
             * @param jsonMappingParameters Provides additional mapping information when JSON is the
             *   record format on the streaming source.
             */
            override fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
                cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(IResolvable::unwrap))
            }

            /**
             * @param jsonMappingParameters Provides additional mapping information when JSON is the
             *   record format on the streaming source.
             */
            override fun jsonMappingParameters(
                jsonMappingParameters: JSONMappingParametersProperty
            ) {
                cdkBuilder.jsonMappingParameters(
                    jsonMappingParameters.let(JSONMappingParametersProperty::unwrap)
                )
            }

            /**
             * @param jsonMappingParameters Provides additional mapping information when JSON is the
             *   record format on the streaming source.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a687b0e095f8fc8bed12385c9c5405e169f32fc6bffaf1e990837e29501a83d1")
            override fun jsonMappingParameters(
                jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit
            ): Unit = jsonMappingParameters(JSONMappingParametersProperty(jsonMappingParameters))

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty,
        ) : MappingParametersProperty {
            /**
             * Provides additional mapping information when the record format uses delimiters (for
             * example, CSV).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mappingparameters.html#cfn-kinesisanalyticsv2-application-mappingparameters-csvmappingparameters)
             */
            override fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

            /**
             * Provides additional mapping information when JSON is the record format on the
             * streaming source.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mappingparameters.html#cfn-kinesisanalyticsv2-application-mappingparameters-jsonmappingparameters)
             */
            override fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MappingParametersProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty
            ): MappingParametersProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MappingParametersProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface RecordFormatProperty {
        /**
         * When you configure application input at the time of creating or updating an application,
         * provides additional mapping information specific to the record format (such as JSON, CSV,
         * or record fields delimited by some delimiter) on the streaming source.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html#cfn-kinesisanalyticsv2-application-recordformat-mappingparameters)
         */
        public fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

        /**
         * The type of record format.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html#cfn-kinesisanalyticsv2-application-recordformat-recordformattype)
         */
        public fun recordFormatType(): String

        /** A builder for [RecordFormatProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param mappingParameters When you configure application input at the time of creating
             *   or updating an application, provides additional mapping information specific to the
             *   record format (such as JSON, CSV, or record fields delimited by some delimiter) on
             *   the streaming source.
             */
            public fun mappingParameters(mappingParameters: IResolvable)

            /**
             * @param mappingParameters When you configure application input at the time of creating
             *   or updating an application, provides additional mapping information specific to the
             *   record format (such as JSON, CSV, or record fields delimited by some delimiter) on
             *   the streaming source.
             */
            public fun mappingParameters(mappingParameters: MappingParametersProperty)

            /**
             * @param mappingParameters When you configure application input at the time of creating
             *   or updating an application, provides additional mapping information specific to the
             *   record format (such as JSON, CSV, or record fields delimited by some delimiter) on
             *   the streaming source.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2e4cb691a6553bc1a37ffc0ad89ccdf126254533b6fb37fcc41980962693619f")
            public fun mappingParameters(
                mappingParameters: MappingParametersProperty.Builder.() -> Unit
            )

            /** @param recordFormatType The type of record format. */
            public fun recordFormatType(recordFormatType: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .RecordFormatProperty
                    .builder()

            /**
             * @param mappingParameters When you configure application input at the time of creating
             *   or updating an application, provides additional mapping information specific to the
             *   record format (such as JSON, CSV, or record fields delimited by some delimiter) on
             *   the streaming source.
             */
            override fun mappingParameters(mappingParameters: IResolvable) {
                cdkBuilder.mappingParameters(mappingParameters.let(IResolvable::unwrap))
            }

            /**
             * @param mappingParameters When you configure application input at the time of creating
             *   or updating an application, provides additional mapping information specific to the
             *   record format (such as JSON, CSV, or record fields delimited by some delimiter) on
             *   the streaming source.
             */
            override fun mappingParameters(mappingParameters: MappingParametersProperty) {
                cdkBuilder.mappingParameters(
                    mappingParameters.let(MappingParametersProperty::unwrap)
                )
            }

            /**
             * @param mappingParameters When you configure application input at the time of creating
             *   or updating an application, provides additional mapping information specific to the
             *   record format (such as JSON, CSV, or record fields delimited by some delimiter) on
             *   the streaming source.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2e4cb691a6553bc1a37ffc0ad89ccdf126254533b6fb37fcc41980962693619f")
            override fun mappingParameters(
                mappingParameters: MappingParametersProperty.Builder.() -> Unit
            ): Unit = mappingParameters(MappingParametersProperty(mappingParameters))

            /** @param recordFormatType The type of record format. */
            override fun recordFormatType(recordFormatType: String) {
                cdkBuilder.recordFormatType(recordFormatType)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty,
        ) : RecordFormatProperty {
            /**
             * When you configure application input at the time of creating or updating an
             * application, provides additional mapping information specific to the record format
             * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming
             * source.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html#cfn-kinesisanalyticsv2-application-recordformat-mappingparameters)
             */
            override fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

            /**
             * The type of record format.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html#cfn-kinesisanalyticsv2-application-recordformat-recordformattype)
             */
            override fun recordFormatType(): String = unwrap(this).getRecordFormatType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): RecordFormatProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty
            ): RecordFormatProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: RecordFormatProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CSVMappingParametersProperty {
        /**
         * The column delimiter.
         *
         * For example, in a CSV format, a comma (",") is the typical column delimiter.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html#cfn-kinesisanalyticsv2-application-csvmappingparameters-recordcolumndelimiter)
         */
        public fun recordColumnDelimiter(): String

        /**
         * The row delimiter.
         *
         * For example, in a CSV format, *'\n'* is the typical row delimiter.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html#cfn-kinesisanalyticsv2-application-csvmappingparameters-recordrowdelimiter)
         */
        public fun recordRowDelimiter(): String

        /** A builder for [CSVMappingParametersProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param recordColumnDelimiter The column delimiter. For example, in a CSV format, a
             *   comma (",") is the typical column delimiter.
             */
            public fun recordColumnDelimiter(recordColumnDelimiter: String)

            /**
             * @param recordRowDelimiter The row delimiter. For example, in a CSV format, *'\n'* is
             *   the typical row delimiter.
             */
            public fun recordRowDelimiter(recordRowDelimiter: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .CSVMappingParametersProperty
                    .builder()

            /**
             * @param recordColumnDelimiter The column delimiter. For example, in a CSV format, a
             *   comma (",") is the typical column delimiter.
             */
            override fun recordColumnDelimiter(recordColumnDelimiter: String) {
                cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
            }

            /**
             * @param recordRowDelimiter The row delimiter. For example, in a CSV format, *'\n'* is
             *   the typical row delimiter.
             */
            override fun recordRowDelimiter(recordRowDelimiter: String) {
                cdkBuilder.recordRowDelimiter(recordRowDelimiter)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty,
        ) : CSVMappingParametersProperty {
            /**
             * The column delimiter.
             *
             * For example, in a CSV format, a comma (",") is the typical column delimiter.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html#cfn-kinesisanalyticsv2-application-csvmappingparameters-recordcolumndelimiter)
             */
            override fun recordColumnDelimiter(): String = unwrap(this).getRecordColumnDelimiter()

            /**
             * The row delimiter.
             *
             * For example, in a CSV format, *'\n'* is the typical row delimiter.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html#cfn-kinesisanalyticsv2-application-csvmappingparameters-recordrowdelimiter)
             */
            override fun recordRowDelimiter(): String = unwrap(this).getRecordRowDelimiter()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): CSVMappingParametersProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty
            ): CSVMappingParametersProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CSVMappingParametersProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface EnvironmentPropertiesProperty {
        /**
         * Describes the execution property groups.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html#cfn-kinesisanalyticsv2-application-environmentproperties-propertygroups)
         */
        public fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

        /** A builder for [EnvironmentPropertiesProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param propertyGroups Describes the execution property groups. */
            public fun propertyGroups(propertyGroups: IResolvable)

            /** @param propertyGroups Describes the execution property groups. */
            public fun propertyGroups(propertyGroups: List<Any>)

            /** @param propertyGroups Describes the execution property groups. */
            public fun propertyGroups(vararg propertyGroups: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .EnvironmentPropertiesProperty
                    .builder()

            /** @param propertyGroups Describes the execution property groups. */
            override fun propertyGroups(propertyGroups: IResolvable) {
                cdkBuilder.propertyGroups(propertyGroups.let(IResolvable::unwrap))
            }

            /** @param propertyGroups Describes the execution property groups. */
            override fun propertyGroups(propertyGroups: List<Any>) {
                cdkBuilder.propertyGroups(propertyGroups)
            }

            /** @param propertyGroups Describes the execution property groups. */
            override fun propertyGroups(vararg propertyGroups: Any): Unit =
                propertyGroups(propertyGroups.toList())

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty,
        ) : EnvironmentPropertiesProperty {
            /**
             * Describes the execution property groups.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html#cfn-kinesisanalyticsv2-application-environmentproperties-propertygroups)
             */
            override fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): EnvironmentPropertiesProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty
            ): EnvironmentPropertiesProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EnvironmentPropertiesProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SqlApplicationConfigurationProperty {
        /**
         * The array of
         * [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html) objects
         * describing the input streams used by the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-sqlapplicationconfiguration-inputs)
         */
        public fun inputs(): Any? = unwrap(this).getInputs()

        /** A builder for [SqlApplicationConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param inputs The array of
             *   [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html)
             *   objects describing the input streams used by the application.
             */
            public fun inputs(inputs: IResolvable)

            /**
             * @param inputs The array of
             *   [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html)
             *   objects describing the input streams used by the application.
             */
            public fun inputs(inputs: List<Any>)

            /**
             * @param inputs The array of
             *   [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html)
             *   objects describing the input streams used by the application.
             */
            public fun inputs(vararg inputs: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .SqlApplicationConfigurationProperty
                    .builder()

            /**
             * @param inputs The array of
             *   [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html)
             *   objects describing the input streams used by the application.
             */
            override fun inputs(inputs: IResolvable) {
                cdkBuilder.inputs(inputs.let(IResolvable::unwrap))
            }

            /**
             * @param inputs The array of
             *   [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html)
             *   objects describing the input streams used by the application.
             */
            override fun inputs(inputs: List<Any>) {
                cdkBuilder.inputs(inputs)
            }

            /**
             * @param inputs The array of
             *   [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html)
             *   objects describing the input streams used by the application.
             */
            override fun inputs(vararg inputs: Any): Unit = inputs(inputs.toList())

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty,
        ) : SqlApplicationConfigurationProperty {
            /**
             * The array of
             * [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html)
             * objects describing the input streams used by the application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-sqlapplicationconfiguration-inputs)
             */
            override fun inputs(): Any? = unwrap(this).getInputs()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): SqlApplicationConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty
            ): SqlApplicationConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SqlApplicationConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface S3ContentBaseLocationProperty {
        /**
         * The base path for the S3 bucket.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentbaselocation.html#cfn-kinesisanalyticsv2-application-s3contentbaselocation-basepath)
         */
        public fun basePath(): String? = unwrap(this).getBasePath()

        /**
         * The Amazon Resource Name (ARN) of the S3 bucket.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentbaselocation.html#cfn-kinesisanalyticsv2-application-s3contentbaselocation-bucketarn)
         */
        public fun bucketArn(): String

        /** A builder for [S3ContentBaseLocationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param basePath The base path for the S3 bucket. */
            public fun basePath(basePath: String)

            /** @param bucketArn The Amazon Resource Name (ARN) of the S3 bucket. */
            public fun bucketArn(bucketArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .S3ContentBaseLocationProperty
                    .builder()

            /** @param basePath The base path for the S3 bucket. */
            override fun basePath(basePath: String) {
                cdkBuilder.basePath(basePath)
            }

            /** @param bucketArn The Amazon Resource Name (ARN) of the S3 bucket. */
            override fun bucketArn(bucketArn: String) {
                cdkBuilder.bucketArn(bucketArn)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty,
        ) : S3ContentBaseLocationProperty {
            /**
             * The base path for the S3 bucket.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentbaselocation.html#cfn-kinesisanalyticsv2-application-s3contentbaselocation-basepath)
             */
            override fun basePath(): String? = unwrap(this).getBasePath()

            /**
             * The Amazon Resource Name (ARN) of the S3 bucket.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentbaselocation.html#cfn-kinesisanalyticsv2-application-s3contentbaselocation-bucketarn)
             */
            override fun bucketArn(): String = unwrap(this).getBucketArn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): S3ContentBaseLocationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty
            ): S3ContentBaseLocationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: S3ContentBaseLocationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface JSONMappingParametersProperty {
        /**
         * The path to the top-level parent that contains the records.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-jsonmappingparameters.html#cfn-kinesisanalyticsv2-application-jsonmappingparameters-recordrowpath)
         */
        public fun recordRowPath(): String

        /** A builder for [JSONMappingParametersProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param recordRowPath The path to the top-level parent that contains the records. */
            public fun recordRowPath(recordRowPath: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .JSONMappingParametersProperty
                    .builder()

            /** @param recordRowPath The path to the top-level parent that contains the records. */
            override fun recordRowPath(recordRowPath: String) {
                cdkBuilder.recordRowPath(recordRowPath)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty,
        ) : JSONMappingParametersProperty {
            /**
             * The path to the top-level parent that contains the records.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-jsonmappingparameters.html#cfn-kinesisanalyticsv2-application-jsonmappingparameters-recordrowpath)
             */
            override fun recordRowPath(): String = unwrap(this).getRecordRowPath()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): JSONMappingParametersProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty
            ): JSONMappingParametersProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: JSONMappingParametersProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface KinesisFirehoseInputProperty {
        /**
         * The Amazon Resource Name (ARN) of the delivery stream.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html#cfn-kinesisanalyticsv2-application-kinesisfirehoseinput-resourcearn)
         */
        public fun resourceArn(): String

        /** A builder for [KinesisFirehoseInputProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param resourceArn The Amazon Resource Name (ARN) of the delivery stream. */
            public fun resourceArn(resourceArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .KinesisFirehoseInputProperty
                    .builder()

            /** @param resourceArn The Amazon Resource Name (ARN) of the delivery stream. */
            override fun resourceArn(resourceArn: String) {
                cdkBuilder.resourceArn(resourceArn)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty,
        ) : KinesisFirehoseInputProperty {
            /**
             * The Amazon Resource Name (ARN) of the delivery stream.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html#cfn-kinesisanalyticsv2-application-kinesisfirehoseinput-resourcearn)
             */
            override fun resourceArn(): String = unwrap(this).getResourceArn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): KinesisFirehoseInputProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty
            ): KinesisFirehoseInputProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: KinesisFirehoseInputProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface DeployAsApplicationConfigurationProperty {
        /**
         * The description of an Amazon S3 object that contains the Amazon Data Analytics
         * application, including the Amazon Resource Name (ARN) of the S3 bucket, the name of the
         * Amazon S3 object that contains the data, and the version number of the Amazon S3 object
         * that contains the data.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-deployasapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-deployasapplicationconfiguration-s3contentlocation)
         */
        public fun s3ContentLocation(): Any

        /** A builder for [DeployAsApplicationConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param s3ContentLocation The description of an Amazon S3 object that contains the
             *   Amazon Data Analytics application, including the Amazon Resource Name (ARN) of the
             *   S3 bucket, the name of the Amazon S3 object that contains the data, and the version
             *   number of the Amazon S3 object that contains the data.
             */
            public fun s3ContentLocation(s3ContentLocation: IResolvable)

            /**
             * @param s3ContentLocation The description of an Amazon S3 object that contains the
             *   Amazon Data Analytics application, including the Amazon Resource Name (ARN) of the
             *   S3 bucket, the name of the Amazon S3 object that contains the data, and the version
             *   number of the Amazon S3 object that contains the data.
             */
            public fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty)

            /**
             * @param s3ContentLocation The description of an Amazon S3 object that contains the
             *   Amazon Data Analytics application, including the Amazon Resource Name (ARN) of the
             *   S3 bucket, the name of the Amazon S3 object that contains the data, and the version
             *   number of the Amazon S3 object that contains the data.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f58f0b29b06c8e43d8cfa3e56a43ad26504eb075104826e1262337355c0ade78")
            public fun s3ContentLocation(
                s3ContentLocation: S3ContentBaseLocationProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .DeployAsApplicationConfigurationProperty
                    .builder()

            /**
             * @param s3ContentLocation The description of an Amazon S3 object that contains the
             *   Amazon Data Analytics application, including the Amazon Resource Name (ARN) of the
             *   S3 bucket, the name of the Amazon S3 object that contains the data, and the version
             *   number of the Amazon S3 object that contains the data.
             */
            override fun s3ContentLocation(s3ContentLocation: IResolvable) {
                cdkBuilder.s3ContentLocation(s3ContentLocation.let(IResolvable::unwrap))
            }

            /**
             * @param s3ContentLocation The description of an Amazon S3 object that contains the
             *   Amazon Data Analytics application, including the Amazon Resource Name (ARN) of the
             *   S3 bucket, the name of the Amazon S3 object that contains the data, and the version
             *   number of the Amazon S3 object that contains the data.
             */
            override fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty) {
                cdkBuilder.s3ContentLocation(
                    s3ContentLocation.let(S3ContentBaseLocationProperty::unwrap)
                )
            }

            /**
             * @param s3ContentLocation The description of an Amazon S3 object that contains the
             *   Amazon Data Analytics application, including the Amazon Resource Name (ARN) of the
             *   S3 bucket, the name of the Amazon S3 object that contains the data, and the version
             *   number of the Amazon S3 object that contains the data.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f58f0b29b06c8e43d8cfa3e56a43ad26504eb075104826e1262337355c0ade78")
            override fun s3ContentLocation(
                s3ContentLocation: S3ContentBaseLocationProperty.Builder.() -> Unit
            ): Unit = s3ContentLocation(S3ContentBaseLocationProperty(s3ContentLocation))

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty,
        ) : DeployAsApplicationConfigurationProperty {
            /**
             * The description of an Amazon S3 object that contains the Amazon Data Analytics
             * application, including the Amazon Resource Name (ARN) of the S3 bucket, the name of
             * the Amazon S3 object that contains the data, and the version number of the Amazon S3
             * object that contains the data.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-deployasapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-deployasapplicationconfiguration-s3contentlocation)
             */
            override fun s3ContentLocation(): Any = unwrap(this).getS3ContentLocation()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): DeployAsApplicationConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty
            ): DeployAsApplicationConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DeployAsApplicationConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ApplicationMaintenanceConfigurationProperty {
        /**
         * Specifies the start time of the maintence window.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationmaintenanceconfiguration.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration-applicationmaintenancewindowstarttime)
         */
        public fun applicationMaintenanceWindowStartTime(): String

        /** A builder for [ApplicationMaintenanceConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param applicationMaintenanceWindowStartTime Specifies the start time of the
             *   maintence window.
             */
            public fun applicationMaintenanceWindowStartTime(
                applicationMaintenanceWindowStartTime: String
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationMaintenanceConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .ApplicationMaintenanceConfigurationProperty
                    .builder()

            /**
             * @param applicationMaintenanceWindowStartTime Specifies the start time of the
             *   maintence window.
             */
            override fun applicationMaintenanceWindowStartTime(
                applicationMaintenanceWindowStartTime: String
            ) {
                cdkBuilder.applicationMaintenanceWindowStartTime(
                    applicationMaintenanceWindowStartTime
                )
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationMaintenanceConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationMaintenanceConfigurationProperty,
        ) : ApplicationMaintenanceConfigurationProperty {
            /**
             * Specifies the start time of the maintence window.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationmaintenanceconfiguration.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration-applicationmaintenancewindowstarttime)
             */
            override fun applicationMaintenanceWindowStartTime(): String =
                unwrap(this).getApplicationMaintenanceWindowStartTime()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ApplicationMaintenanceConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationMaintenanceConfigurationProperty
            ): ApplicationMaintenanceConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ApplicationMaintenanceConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationMaintenanceConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MavenReferenceProperty {
        /**
         * The artifact ID of the Maven reference.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html#cfn-kinesisanalyticsv2-application-mavenreference-artifactid)
         */
        public fun artifactId(): String

        /**
         * The group ID of the Maven reference.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html#cfn-kinesisanalyticsv2-application-mavenreference-groupid)
         */
        public fun groupId(): String

        /**
         * The version of the Maven reference.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html#cfn-kinesisanalyticsv2-application-mavenreference-version)
         */
        public fun version(): String

        /** A builder for [MavenReferenceProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param artifactId The artifact ID of the Maven reference. */
            public fun artifactId(artifactId: String)

            /** @param groupId The group ID of the Maven reference. */
            public fun groupId(groupId: String)

            /** @param version The version of the Maven reference. */
            public fun version(version: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .MavenReferenceProperty
                    .builder()

            /** @param artifactId The artifact ID of the Maven reference. */
            override fun artifactId(artifactId: String) {
                cdkBuilder.artifactId(artifactId)
            }

            /** @param groupId The group ID of the Maven reference. */
            override fun groupId(groupId: String) {
                cdkBuilder.groupId(groupId)
            }

            /** @param version The version of the Maven reference. */
            override fun version(version: String) {
                cdkBuilder.version(version)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty,
        ) : MavenReferenceProperty {
            /**
             * The artifact ID of the Maven reference.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html#cfn-kinesisanalyticsv2-application-mavenreference-artifactid)
             */
            override fun artifactId(): String = unwrap(this).getArtifactId()

            /**
             * The group ID of the Maven reference.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html#cfn-kinesisanalyticsv2-application-mavenreference-groupid)
             */
            override fun groupId(): String = unwrap(this).getGroupId()

            /**
             * The version of the Maven reference.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html#cfn-kinesisanalyticsv2-application-mavenreference-version)
             */
            override fun version(): String = unwrap(this).getVersion()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MavenReferenceProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty
            ): MavenReferenceProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MavenReferenceProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface InputLambdaProcessorProperty {
        /**
         * The ARN of the Amazon Lambda function that operates on records in the stream.
         *
         * To specify an earlier version of the Lambda function than the latest, include the Lambda
         * function version in the Lambda function ARN. For more information about Lambda ARNs, see
         * [Example ARNs: Amazon Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html#cfn-kinesisanalyticsv2-application-inputlambdaprocessor-resourcearn)
         */
        public fun resourceArn(): String

        /** A builder for [InputLambdaProcessorProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param resourceArn The ARN of the Amazon Lambda function that operates on records in
             *   the stream.
             *
             * To specify an earlier version of the Lambda function than the latest, include the
             * Lambda function version in the Lambda function ARN. For more information about Lambda
             * ARNs, see
             * [Example ARNs: Amazon Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
             */
            public fun resourceArn(resourceArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .InputLambdaProcessorProperty
                    .builder()

            /**
             * @param resourceArn The ARN of the Amazon Lambda function that operates on records in
             *   the stream.
             *
             * To specify an earlier version of the Lambda function than the latest, include the
             * Lambda function version in the Lambda function ARN. For more information about Lambda
             * ARNs, see
             * [Example ARNs: Amazon Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
             */
            override fun resourceArn(resourceArn: String) {
                cdkBuilder.resourceArn(resourceArn)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty,
        ) : InputLambdaProcessorProperty {
            /**
             * The ARN of the Amazon Lambda function that operates on records in the stream.
             *
             * To specify an earlier version of the Lambda function than the latest, include the
             * Lambda function version in the Lambda function ARN. For more information about Lambda
             * ARNs, see
             * [Example ARNs: Amazon Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html#cfn-kinesisanalyticsv2-application-inputlambdaprocessor-resourcearn)
             */
            override fun resourceArn(): String = unwrap(this).getResourceArn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): InputLambdaProcessorProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty
            ): InputLambdaProcessorProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: InputLambdaProcessorProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface FlinkRunConfigurationProperty {
        /**
         * When restoring from a snapshot, specifies whether the runtime is allowed to skip a state
         * that cannot be mapped to the new program.
         *
         * This will happen if the program is updated between snapshots to remove stateful
         * parameters, and state data in the snapshot no longer corresponds to valid application
         * data. For more information, see
         * [Allowing Non-Restored State](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state)
         * in the
         * [Apache Flink documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
         * .
         *
         * This value defaults to `false` . If you update your application without specifying this
         * parameter, `AllowNonRestoredState` will be set to `false` , even if it was previously set
         * to `true` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkrunconfiguration.html#cfn-kinesisanalyticsv2-application-flinkrunconfiguration-allownonrestoredstate)
         */
        public fun allowNonRestoredState(): Any? = unwrap(this).getAllowNonRestoredState()

        /** A builder for [FlinkRunConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param allowNonRestoredState When restoring from a snapshot, specifies whether the
             *   runtime is allowed to skip a state that cannot be mapped to the new program. This
             *   will happen if the program is updated between snapshots to remove stateful
             *   parameters, and state data in the snapshot no longer corresponds to valid
             *   application data. For more information, see
             *   [Allowing Non-Restored State](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state)
             *   in the
             *   [Apache Flink documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             *   .
             *
             * This value defaults to `false` . If you update your application without specifying
             * this parameter, `AllowNonRestoredState` will be set to `false` , even if it was
             * previously set to `true` .
             */
            public fun allowNonRestoredState(allowNonRestoredState: Boolean)

            /**
             * @param allowNonRestoredState When restoring from a snapshot, specifies whether the
             *   runtime is allowed to skip a state that cannot be mapped to the new program. This
             *   will happen if the program is updated between snapshots to remove stateful
             *   parameters, and state data in the snapshot no longer corresponds to valid
             *   application data. For more information, see
             *   [Allowing Non-Restored State](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state)
             *   in the
             *   [Apache Flink documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             *   .
             *
             * This value defaults to `false` . If you update your application without specifying
             * this parameter, `AllowNonRestoredState` will be set to `false` , even if it was
             * previously set to `true` .
             */
            public fun allowNonRestoredState(allowNonRestoredState: IResolvable)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkRunConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .FlinkRunConfigurationProperty
                    .builder()

            /**
             * @param allowNonRestoredState When restoring from a snapshot, specifies whether the
             *   runtime is allowed to skip a state that cannot be mapped to the new program. This
             *   will happen if the program is updated between snapshots to remove stateful
             *   parameters, and state data in the snapshot no longer corresponds to valid
             *   application data. For more information, see
             *   [Allowing Non-Restored State](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state)
             *   in the
             *   [Apache Flink documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             *   .
             *
             * This value defaults to `false` . If you update your application without specifying
             * this parameter, `AllowNonRestoredState` will be set to `false` , even if it was
             * previously set to `true` .
             */
            override fun allowNonRestoredState(allowNonRestoredState: Boolean) {
                cdkBuilder.allowNonRestoredState(allowNonRestoredState)
            }

            /**
             * @param allowNonRestoredState When restoring from a snapshot, specifies whether the
             *   runtime is allowed to skip a state that cannot be mapped to the new program. This
             *   will happen if the program is updated between snapshots to remove stateful
             *   parameters, and state data in the snapshot no longer corresponds to valid
             *   application data. For more information, see
             *   [Allowing Non-Restored State](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state)
             *   in the
             *   [Apache Flink documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             *   .
             *
             * This value defaults to `false` . If you update your application without specifying
             * this parameter, `AllowNonRestoredState` will be set to `false` , even if it was
             * previously set to `true` .
             */
            override fun allowNonRestoredState(allowNonRestoredState: IResolvable) {
                cdkBuilder.allowNonRestoredState(allowNonRestoredState.let(IResolvable::unwrap))
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkRunConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkRunConfigurationProperty,
        ) : FlinkRunConfigurationProperty {
            /**
             * When restoring from a snapshot, specifies whether the runtime is allowed to skip a
             * state that cannot be mapped to the new program.
             *
             * This will happen if the program is updated between snapshots to remove stateful
             * parameters, and state data in the snapshot no longer corresponds to valid application
             * data. For more information, see
             * [Allowing Non-Restored State](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state)
             * in the
             * [Apache Flink documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             * .
             *
             * This value defaults to `false` . If you update your application without specifying
             * this parameter, `AllowNonRestoredState` will be set to `false` , even if it was
             * previously set to `true` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkrunconfiguration.html#cfn-kinesisanalyticsv2-application-flinkrunconfiguration-allownonrestoredstate)
             */
            override fun allowNonRestoredState(): Any? = unwrap(this).getAllowNonRestoredState()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): FlinkRunConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkRunConfigurationProperty
            ): FlinkRunConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: FlinkRunConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkRunConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ParallelismConfigurationProperty {
        /**
         * Describes whether the Managed Service for Apache Flink service can increase the
         * parallelism of the application in response to increased throughput.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-autoscalingenabled)
         */
        public fun autoScalingEnabled(): Any? = unwrap(this).getAutoScalingEnabled()

        /**
         * Describes whether the application uses the default parallelism for the Managed Service
         * for Apache Flink service.
         *
         * You must set this property to `CUSTOM` in order to change your application's
         * `AutoScalingEnabled` , `Parallelism` , or `ParallelismPerKPU` properties.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-configurationtype)
         */
        public fun configurationType(): String

        /**
         * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics
         * application can perform.
         *
         * The Kinesis Data Analytics service can increase this number automatically if
         * [ParallelismConfiguration:AutoScalingEnabled](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_ParallelismConfiguration.html#kinesisanalytics-Type-ParallelismConfiguration-AutoScalingEnabled.html)
         * is set to `true` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelism)
         */
        public fun parallelism(): Number? = unwrap(this).getParallelism()

        /**
         * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics
         * application can perform per Kinesis Processing Unit (KPU) used by the application.
         *
         * For more information about KPUs, see
         * [Amazon Kinesis Data Analytics Pricing](https://docs.aws.amazon.com/kinesis/data-analytics/pricing/)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelismperkpu)
         */
        public fun parallelismPerKpu(): Number? = unwrap(this).getParallelismPerKpu()

        /** A builder for [ParallelismConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param autoScalingEnabled Describes whether the Managed Service for Apache Flink
             *   service can increase the parallelism of the application in response to increased
             *   throughput.
             */
            public fun autoScalingEnabled(autoScalingEnabled: Boolean)

            /**
             * @param autoScalingEnabled Describes whether the Managed Service for Apache Flink
             *   service can increase the parallelism of the application in response to increased
             *   throughput.
             */
            public fun autoScalingEnabled(autoScalingEnabled: IResolvable)

            /**
             * @param configurationType Describes whether the application uses the default
             *   parallelism for the Managed Service for Apache Flink service. You must set this
             *   property to `CUSTOM` in order to change your application's `AutoScalingEnabled` ,
             *   `Parallelism` , or `ParallelismPerKPU` properties.
             */
            public fun configurationType(configurationType: String)

            /**
             * @param parallelism Describes the initial number of parallel tasks that a Java-based
             *   Kinesis Data Analytics application can perform. The Kinesis Data Analytics service
             *   can increase this number automatically if
             *   [ParallelismConfiguration:AutoScalingEnabled](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_ParallelismConfiguration.html#kinesisanalytics-Type-ParallelismConfiguration-AutoScalingEnabled.html)
             *   is set to `true` .
             */
            public fun parallelism(parallelism: Number)

            /**
             * @param parallelismPerKpu Describes the number of parallel tasks that a Java-based
             *   Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU)
             *   used by the application. For more information about KPUs, see
             *   [Amazon Kinesis Data Analytics Pricing](https://docs.aws.amazon.com/kinesis/data-analytics/pricing/)
             *   .
             */
            public fun parallelismPerKpu(parallelismPerKpu: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .ParallelismConfigurationProperty
                    .builder()

            /**
             * @param autoScalingEnabled Describes whether the Managed Service for Apache Flink
             *   service can increase the parallelism of the application in response to increased
             *   throughput.
             */
            override fun autoScalingEnabled(autoScalingEnabled: Boolean) {
                cdkBuilder.autoScalingEnabled(autoScalingEnabled)
            }

            /**
             * @param autoScalingEnabled Describes whether the Managed Service for Apache Flink
             *   service can increase the parallelism of the application in response to increased
             *   throughput.
             */
            override fun autoScalingEnabled(autoScalingEnabled: IResolvable) {
                cdkBuilder.autoScalingEnabled(autoScalingEnabled.let(IResolvable::unwrap))
            }

            /**
             * @param configurationType Describes whether the application uses the default
             *   parallelism for the Managed Service for Apache Flink service. You must set this
             *   property to `CUSTOM` in order to change your application's `AutoScalingEnabled` ,
             *   `Parallelism` , or `ParallelismPerKPU` properties.
             */
            override fun configurationType(configurationType: String) {
                cdkBuilder.configurationType(configurationType)
            }

            /**
             * @param parallelism Describes the initial number of parallel tasks that a Java-based
             *   Kinesis Data Analytics application can perform. The Kinesis Data Analytics service
             *   can increase this number automatically if
             *   [ParallelismConfiguration:AutoScalingEnabled](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_ParallelismConfiguration.html#kinesisanalytics-Type-ParallelismConfiguration-AutoScalingEnabled.html)
             *   is set to `true` .
             */
            override fun parallelism(parallelism: Number) {
                cdkBuilder.parallelism(parallelism)
            }

            /**
             * @param parallelismPerKpu Describes the number of parallel tasks that a Java-based
             *   Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU)
             *   used by the application. For more information about KPUs, see
             *   [Amazon Kinesis Data Analytics Pricing](https://docs.aws.amazon.com/kinesis/data-analytics/pricing/)
             *   .
             */
            override fun parallelismPerKpu(parallelismPerKpu: Number) {
                cdkBuilder.parallelismPerKpu(parallelismPerKpu)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty,
        ) : ParallelismConfigurationProperty {
            /**
             * Describes whether the Managed Service for Apache Flink service can increase the
             * parallelism of the application in response to increased throughput.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-autoscalingenabled)
             */
            override fun autoScalingEnabled(): Any? = unwrap(this).getAutoScalingEnabled()

            /**
             * Describes whether the application uses the default parallelism for the Managed
             * Service for Apache Flink service.
             *
             * You must set this property to `CUSTOM` in order to change your application's
             * `AutoScalingEnabled` , `Parallelism` , or `ParallelismPerKPU` properties.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-configurationtype)
             */
            override fun configurationType(): String = unwrap(this).getConfigurationType()

            /**
             * Describes the initial number of parallel tasks that a Java-based Kinesis Data
             * Analytics application can perform.
             *
             * The Kinesis Data Analytics service can increase this number automatically if
             * [ParallelismConfiguration:AutoScalingEnabled](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_ParallelismConfiguration.html#kinesisanalytics-Type-ParallelismConfiguration-AutoScalingEnabled.html)
             * is set to `true` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelism)
             */
            override fun parallelism(): Number? = unwrap(this).getParallelism()

            /**
             * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics
             * application can perform per Kinesis Processing Unit (KPU) used by the application.
             *
             * For more information about KPUs, see
             * [Amazon Kinesis Data Analytics Pricing](https://docs.aws.amazon.com/kinesis/data-analytics/pricing/)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelismperkpu)
             */
            override fun parallelismPerKpu(): Number? = unwrap(this).getParallelismPerKpu()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ParallelismConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty
            ): ParallelismConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ParallelismConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CodeContentProperty {
        /**
         * Information about the Amazon S3 bucket that contains the application code.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-s3contentlocation)
         */
        public fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()

        /**
         * The text-format code for a Managed Service for Apache Flink application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-textcontent)
         */
        public fun textContent(): String? = unwrap(this).getTextContent()

        /**
         * The zip-format code for a Managed Service for Apache Flink application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-zipfilecontent)
         */
        public fun zipFileContent(): String? = unwrap(this).getZipFileContent()

        /** A builder for [CodeContentProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param s3ContentLocation Information about the Amazon S3 bucket that contains the
             *   application code.
             */
            public fun s3ContentLocation(s3ContentLocation: IResolvable)

            /**
             * @param s3ContentLocation Information about the Amazon S3 bucket that contains the
             *   application code.
             */
            public fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty)

            /**
             * @param s3ContentLocation Information about the Amazon S3 bucket that contains the
             *   application code.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("23b281f43c7fd367f282f61ea9ede9950239be7d96447744a63273c7d6068c0b")
            public fun s3ContentLocation(
                s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit
            )

            /**
             * @param textContent The text-format code for a Managed Service for Apache Flink
             *   application.
             */
            public fun textContent(textContent: String)

            /**
             * @param zipFileContent The zip-format code for a Managed Service for Apache Flink
             *   application.
             */
            public fun zipFileContent(zipFileContent: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .CodeContentProperty
                    .builder()

            /**
             * @param s3ContentLocation Information about the Amazon S3 bucket that contains the
             *   application code.
             */
            override fun s3ContentLocation(s3ContentLocation: IResolvable) {
                cdkBuilder.s3ContentLocation(s3ContentLocation.let(IResolvable::unwrap))
            }

            /**
             * @param s3ContentLocation Information about the Amazon S3 bucket that contains the
             *   application code.
             */
            override fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty) {
                cdkBuilder.s3ContentLocation(
                    s3ContentLocation.let(S3ContentLocationProperty::unwrap)
                )
            }

            /**
             * @param s3ContentLocation Information about the Amazon S3 bucket that contains the
             *   application code.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("23b281f43c7fd367f282f61ea9ede9950239be7d96447744a63273c7d6068c0b")
            override fun s3ContentLocation(
                s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit
            ): Unit = s3ContentLocation(S3ContentLocationProperty(s3ContentLocation))

            /**
             * @param textContent The text-format code for a Managed Service for Apache Flink
             *   application.
             */
            override fun textContent(textContent: String) {
                cdkBuilder.textContent(textContent)
            }

            /**
             * @param zipFileContent The zip-format code for a Managed Service for Apache Flink
             *   application.
             */
            override fun zipFileContent(zipFileContent: String) {
                cdkBuilder.zipFileContent(zipFileContent)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty,
        ) : CodeContentProperty {
            /**
             * Information about the Amazon S3 bucket that contains the application code.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-s3contentlocation)
             */
            override fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()

            /**
             * The text-format code for a Managed Service for Apache Flink application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-textcontent)
             */
            override fun textContent(): String? = unwrap(this).getTextContent()

            /**
             * The zip-format code for a Managed Service for Apache Flink application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-zipfilecontent)
             */
            override fun zipFileContent(): String? = unwrap(this).getZipFileContent()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): CodeContentProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty
            ): CodeContentProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CodeContentProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ApplicationCodeConfigurationProperty {
        /**
         * The location and type of the application code.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html#cfn-kinesisanalyticsv2-application-applicationcodeconfiguration-codecontent)
         */
        public fun codeContent(): Any

        /**
         * Specifies whether the code content is in text or zip format.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html#cfn-kinesisanalyticsv2-application-applicationcodeconfiguration-codecontenttype)
         */
        public fun codeContentType(): String

        /** A builder for [ApplicationCodeConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param codeContent The location and type of the application code. */
            public fun codeContent(codeContent: IResolvable)

            /** @param codeContent The location and type of the application code. */
            public fun codeContent(codeContent: CodeContentProperty)

            /** @param codeContent The location and type of the application code. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("9ff44823ca2dc4cb3a41b23ae125f3f9fb3045d8197a8ce2f67a28c78eb90062")
            public fun codeContent(codeContent: CodeContentProperty.Builder.() -> Unit)

            /**
             * @param codeContentType Specifies whether the code content is in text or zip format.
             */
            public fun codeContentType(codeContentType: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .ApplicationCodeConfigurationProperty
                    .builder()

            /** @param codeContent The location and type of the application code. */
            override fun codeContent(codeContent: IResolvable) {
                cdkBuilder.codeContent(codeContent.let(IResolvable::unwrap))
            }

            /** @param codeContent The location and type of the application code. */
            override fun codeContent(codeContent: CodeContentProperty) {
                cdkBuilder.codeContent(codeContent.let(CodeContentProperty::unwrap))
            }

            /** @param codeContent The location and type of the application code. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("9ff44823ca2dc4cb3a41b23ae125f3f9fb3045d8197a8ce2f67a28c78eb90062")
            override fun codeContent(codeContent: CodeContentProperty.Builder.() -> Unit): Unit =
                codeContent(CodeContentProperty(codeContent))

            /**
             * @param codeContentType Specifies whether the code content is in text or zip format.
             */
            override fun codeContentType(codeContentType: String) {
                cdkBuilder.codeContentType(codeContentType)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty,
        ) : ApplicationCodeConfigurationProperty {
            /**
             * The location and type of the application code.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html#cfn-kinesisanalyticsv2-application-applicationcodeconfiguration-codecontent)
             */
            override fun codeContent(): Any = unwrap(this).getCodeContent()

            /**
             * Specifies whether the code content is in text or zip format.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html#cfn-kinesisanalyticsv2-application-applicationcodeconfiguration-codecontenttype)
             */
            override fun codeContentType(): String = unwrap(this).getCodeContentType()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ApplicationCodeConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty
            ): ApplicationCodeConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ApplicationCodeConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface InputParallelismProperty {
        /**
         * The number of in-application streams to create.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html#cfn-kinesisanalyticsv2-application-inputparallelism-count)
         */
        public fun count(): Number? = unwrap(this).getCount()

        /** A builder for [InputParallelismProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param count The number of in-application streams to create. */
            public fun count(count: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .InputParallelismProperty
                    .builder()

            /** @param count The number of in-application streams to create. */
            override fun count(count: Number) {
                cdkBuilder.count(count)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty,
        ) : InputParallelismProperty {
            /**
             * The number of in-application streams to create.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html#cfn-kinesisanalyticsv2-application-inputparallelism-count)
             */
            override fun count(): Number? = unwrap(this).getCount()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): InputParallelismProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty
            ): InputParallelismProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: InputParallelismProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CustomArtifactConfigurationProperty {
        /**
         * Set this to either `UDF` or `DEPENDENCY_JAR` .
         *
         * `UDF` stands for user-defined functions. This type of artifact must be in an S3 bucket. A
         * `DEPENDENCY_JAR` can be in either Maven or an S3 bucket.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html#cfn-kinesisanalyticsv2-application-customartifactconfiguration-artifacttype)
         */
        public fun artifactType(): String

        /**
         * The parameters required to fully specify a Maven reference.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html#cfn-kinesisanalyticsv2-application-customartifactconfiguration-mavenreference)
         */
        public fun mavenReference(): Any? = unwrap(this).getMavenReference()

        /**
         * The location of the custom artifacts.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html#cfn-kinesisanalyticsv2-application-customartifactconfiguration-s3contentlocation)
         */
        public fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()

        /** A builder for [CustomArtifactConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param artifactType Set this to either `UDF` or `DEPENDENCY_JAR` . `UDF` stands for
             *   user-defined functions. This type of artifact must be in an S3 bucket. A
             *   `DEPENDENCY_JAR` can be in either Maven or an S3 bucket.
             */
            public fun artifactType(artifactType: String)

            /** @param mavenReference The parameters required to fully specify a Maven reference. */
            public fun mavenReference(mavenReference: IResolvable)

            /** @param mavenReference The parameters required to fully specify a Maven reference. */
            public fun mavenReference(mavenReference: MavenReferenceProperty)

            /** @param mavenReference The parameters required to fully specify a Maven reference. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("66d2abf3fb5448cb1c7c3954df2cf690c08718fe2474e503773a12e5b1dee20e")
            public fun mavenReference(mavenReference: MavenReferenceProperty.Builder.() -> Unit)

            /** @param s3ContentLocation The location of the custom artifacts. */
            public fun s3ContentLocation(s3ContentLocation: IResolvable)

            /** @param s3ContentLocation The location of the custom artifacts. */
            public fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty)

            /** @param s3ContentLocation The location of the custom artifacts. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("ac7877b1b4bd54d9592877b02d4c7823a5924cd8403d21b0b2fe2ab7d0c29a11")
            public fun s3ContentLocation(
                s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .CustomArtifactConfigurationProperty
                    .builder()

            /**
             * @param artifactType Set this to either `UDF` or `DEPENDENCY_JAR` . `UDF` stands for
             *   user-defined functions. This type of artifact must be in an S3 bucket. A
             *   `DEPENDENCY_JAR` can be in either Maven or an S3 bucket.
             */
            override fun artifactType(artifactType: String) {
                cdkBuilder.artifactType(artifactType)
            }

            /** @param mavenReference The parameters required to fully specify a Maven reference. */
            override fun mavenReference(mavenReference: IResolvable) {
                cdkBuilder.mavenReference(mavenReference.let(IResolvable::unwrap))
            }

            /** @param mavenReference The parameters required to fully specify a Maven reference. */
            override fun mavenReference(mavenReference: MavenReferenceProperty) {
                cdkBuilder.mavenReference(mavenReference.let(MavenReferenceProperty::unwrap))
            }

            /** @param mavenReference The parameters required to fully specify a Maven reference. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("66d2abf3fb5448cb1c7c3954df2cf690c08718fe2474e503773a12e5b1dee20e")
            override fun mavenReference(
                mavenReference: MavenReferenceProperty.Builder.() -> Unit
            ): Unit = mavenReference(MavenReferenceProperty(mavenReference))

            /** @param s3ContentLocation The location of the custom artifacts. */
            override fun s3ContentLocation(s3ContentLocation: IResolvable) {
                cdkBuilder.s3ContentLocation(s3ContentLocation.let(IResolvable::unwrap))
            }

            /** @param s3ContentLocation The location of the custom artifacts. */
            override fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty) {
                cdkBuilder.s3ContentLocation(
                    s3ContentLocation.let(S3ContentLocationProperty::unwrap)
                )
            }

            /** @param s3ContentLocation The location of the custom artifacts. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("ac7877b1b4bd54d9592877b02d4c7823a5924cd8403d21b0b2fe2ab7d0c29a11")
            override fun s3ContentLocation(
                s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit
            ): Unit = s3ContentLocation(S3ContentLocationProperty(s3ContentLocation))

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty,
        ) : CustomArtifactConfigurationProperty {
            /**
             * Set this to either `UDF` or `DEPENDENCY_JAR` .
             *
             * `UDF` stands for user-defined functions. This type of artifact must be in an S3
             * bucket. A `DEPENDENCY_JAR` can be in either Maven or an S3 bucket.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html#cfn-kinesisanalyticsv2-application-customartifactconfiguration-artifacttype)
             */
            override fun artifactType(): String = unwrap(this).getArtifactType()

            /**
             * The parameters required to fully specify a Maven reference.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html#cfn-kinesisanalyticsv2-application-customartifactconfiguration-mavenreference)
             */
            override fun mavenReference(): Any? = unwrap(this).getMavenReference()

            /**
             * The location of the custom artifacts.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html#cfn-kinesisanalyticsv2-application-customartifactconfiguration-s3contentlocation)
             */
            override fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): CustomArtifactConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty
            ): CustomArtifactConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CustomArtifactConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface InputSchemaProperty {
        /**
         * A list of `RecordColumn` objects.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordcolumns)
         */
        public fun recordColumns(): Any

        /**
         * Specifies the encoding of the records in the streaming source.
         *
         * For example, UTF-8.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordencoding)
         */
        public fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

        /**
         * Specifies the format of the records on the streaming source.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordformat)
         */
        public fun recordFormat(): Any

        /** A builder for [InputSchemaProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param recordColumns A list of `RecordColumn` objects. */
            public fun recordColumns(recordColumns: IResolvable)

            /** @param recordColumns A list of `RecordColumn` objects. */
            public fun recordColumns(recordColumns: List<Any>)

            /** @param recordColumns A list of `RecordColumn` objects. */
            public fun recordColumns(vararg recordColumns: Any)

            /**
             * @param recordEncoding Specifies the encoding of the records in the streaming source.
             *   For example, UTF-8.
             */
            public fun recordEncoding(recordEncoding: String)

            /** @param recordFormat Specifies the format of the records on the streaming source. */
            public fun recordFormat(recordFormat: IResolvable)

            /** @param recordFormat Specifies the format of the records on the streaming source. */
            public fun recordFormat(recordFormat: RecordFormatProperty)

            /** @param recordFormat Specifies the format of the records on the streaming source. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0b6c5535c654ded1c710c9da214ce6fa617300a1362bb7176b9cfb28d195a212")
            public fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .InputSchemaProperty
                    .builder()

            /** @param recordColumns A list of `RecordColumn` objects. */
            override fun recordColumns(recordColumns: IResolvable) {
                cdkBuilder.recordColumns(recordColumns.let(IResolvable::unwrap))
            }

            /** @param recordColumns A list of `RecordColumn` objects. */
            override fun recordColumns(recordColumns: List<Any>) {
                cdkBuilder.recordColumns(recordColumns)
            }

            /** @param recordColumns A list of `RecordColumn` objects. */
            override fun recordColumns(vararg recordColumns: Any): Unit =
                recordColumns(recordColumns.toList())

            /**
             * @param recordEncoding Specifies the encoding of the records in the streaming source.
             *   For example, UTF-8.
             */
            override fun recordEncoding(recordEncoding: String) {
                cdkBuilder.recordEncoding(recordEncoding)
            }

            /** @param recordFormat Specifies the format of the records on the streaming source. */
            override fun recordFormat(recordFormat: IResolvable) {
                cdkBuilder.recordFormat(recordFormat.let(IResolvable::unwrap))
            }

            /** @param recordFormat Specifies the format of the records on the streaming source. */
            override fun recordFormat(recordFormat: RecordFormatProperty) {
                cdkBuilder.recordFormat(recordFormat.let(RecordFormatProperty::unwrap))
            }

            /** @param recordFormat Specifies the format of the records on the streaming source. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0b6c5535c654ded1c710c9da214ce6fa617300a1362bb7176b9cfb28d195a212")
            override fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit): Unit =
                recordFormat(RecordFormatProperty(recordFormat))

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty,
        ) : InputSchemaProperty {
            /**
             * A list of `RecordColumn` objects.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordcolumns)
             */
            override fun recordColumns(): Any = unwrap(this).getRecordColumns()

            /**
             * Specifies the encoding of the records in the streaming source.
             *
             * For example, UTF-8.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordencoding)
             */
            override fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

            /**
             * Specifies the format of the records on the streaming source.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordformat)
             */
            override fun recordFormat(): Any = unwrap(this).getRecordFormat()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): InputSchemaProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty
            ): InputSchemaProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: InputSchemaProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface S3ContentLocationProperty {
        /**
         * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-bucketarn)
         */
        public fun bucketArn(): String

        /**
         * The file key for the object containing the application code.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-filekey)
         */
        public fun fileKey(): String

        /**
         * The version of the object containing the application code.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-objectversion)
         */
        public fun objectVersion(): String? = unwrap(this).getObjectVersion()

        /** A builder for [S3ContentLocationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param bucketArn The Amazon Resource Name (ARN) for the S3 bucket containing the
             *   application code.
             */
            public fun bucketArn(bucketArn: String)

            /** @param fileKey The file key for the object containing the application code. */
            public fun fileKey(fileKey: String)

            /** @param objectVersion The version of the object containing the application code. */
            public fun objectVersion(objectVersion: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .S3ContentLocationProperty
                    .builder()

            /**
             * @param bucketArn The Amazon Resource Name (ARN) for the S3 bucket containing the
             *   application code.
             */
            override fun bucketArn(bucketArn: String) {
                cdkBuilder.bucketArn(bucketArn)
            }

            /** @param fileKey The file key for the object containing the application code. */
            override fun fileKey(fileKey: String) {
                cdkBuilder.fileKey(fileKey)
            }

            /** @param objectVersion The version of the object containing the application code. */
            override fun objectVersion(objectVersion: String) {
                cdkBuilder.objectVersion(objectVersion)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty,
        ) : S3ContentLocationProperty {
            /**
             * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-bucketarn)
             */
            override fun bucketArn(): String = unwrap(this).getBucketArn()

            /**
             * The file key for the object containing the application code.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-filekey)
             */
            override fun fileKey(): String = unwrap(this).getFileKey()

            /**
             * The version of the object containing the application code.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-objectversion)
             */
            override fun objectVersion(): String? = unwrap(this).getObjectVersion()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): S3ContentLocationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty
            ): S3ContentLocationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: S3ContentLocationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MonitoringConfigurationProperty {
        /**
         * Describes whether to use the default CloudWatch logging configuration for an application.
         *
         * You must set this property to `CUSTOM` in order to set the `LogLevel` or `MetricsLevel`
         * parameters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-configurationtype)
         */
        public fun configurationType(): String

        /**
         * Describes the verbosity of the CloudWatch Logs for an application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-loglevel)
         */
        public fun logLevel(): String? = unwrap(this).getLogLevel()

        /**
         * Describes the granularity of the CloudWatch Logs for an application.
         *
         * The `Parallelism` level is not recommended for applications with a Parallelism over 64
         * due to excessive costs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-metricslevel)
         */
        public fun metricsLevel(): String? = unwrap(this).getMetricsLevel()

        /** A builder for [MonitoringConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param configurationType Describes whether to use the default CloudWatch logging
             *   configuration for an application. You must set this property to `CUSTOM` in order
             *   to set the `LogLevel` or `MetricsLevel` parameters.
             */
            public fun configurationType(configurationType: String)

            /**
             * @param logLevel Describes the verbosity of the CloudWatch Logs for an application.
             */
            public fun logLevel(logLevel: String)

            /**
             * @param metricsLevel Describes the granularity of the CloudWatch Logs for an
             *   application. The `Parallelism` level is not recommended for applications with a
             *   Parallelism over 64 due to excessive costs.
             */
            public fun metricsLevel(metricsLevel: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .MonitoringConfigurationProperty
                    .builder()

            /**
             * @param configurationType Describes whether to use the default CloudWatch logging
             *   configuration for an application. You must set this property to `CUSTOM` in order
             *   to set the `LogLevel` or `MetricsLevel` parameters.
             */
            override fun configurationType(configurationType: String) {
                cdkBuilder.configurationType(configurationType)
            }

            /**
             * @param logLevel Describes the verbosity of the CloudWatch Logs for an application.
             */
            override fun logLevel(logLevel: String) {
                cdkBuilder.logLevel(logLevel)
            }

            /**
             * @param metricsLevel Describes the granularity of the CloudWatch Logs for an
             *   application. The `Parallelism` level is not recommended for applications with a
             *   Parallelism over 64 due to excessive costs.
             */
            override fun metricsLevel(metricsLevel: String) {
                cdkBuilder.metricsLevel(metricsLevel)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty,
        ) : MonitoringConfigurationProperty {
            /**
             * Describes whether to use the default CloudWatch logging configuration for an
             * application.
             *
             * You must set this property to `CUSTOM` in order to set the `LogLevel` or
             * `MetricsLevel` parameters.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-configurationtype)
             */
            override fun configurationType(): String = unwrap(this).getConfigurationType()

            /**
             * Describes the verbosity of the CloudWatch Logs for an application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-loglevel)
             */
            override fun logLevel(): String? = unwrap(this).getLogLevel()

            /**
             * Describes the granularity of the CloudWatch Logs for an application.
             *
             * The `Parallelism` level is not recommended for applications with a Parallelism over
             * 64 due to excessive costs.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-metricslevel)
             */
            override fun metricsLevel(): String? = unwrap(this).getMetricsLevel()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): MonitoringConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty
            ): MonitoringConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MonitoringConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface PropertyGroupProperty {
        /**
         * Describes the key of an application execution property key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertygroupid)
         */
        public fun propertyGroupId(): String? = unwrap(this).getPropertyGroupId()

        /**
         * Describes the value of an application execution property key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertymap)
         */
        public fun propertyMap(): Any? = unwrap(this).getPropertyMap()

        /** A builder for [PropertyGroupProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param propertyGroupId Describes the key of an application execution property
             *   key-value pair.
             */
            public fun propertyGroupId(propertyGroupId: String)

            /**
             * @param propertyMap Describes the value of an application execution property key-value
             *   pair.
             */
            public fun propertyMap(propertyMap: IResolvable)

            /**
             * @param propertyMap Describes the value of an application execution property key-value
             *   pair.
             */
            public fun propertyMap(propertyMap: Map<String, String>)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .PropertyGroupProperty
                    .builder()

            /**
             * @param propertyGroupId Describes the key of an application execution property
             *   key-value pair.
             */
            override fun propertyGroupId(propertyGroupId: String) {
                cdkBuilder.propertyGroupId(propertyGroupId)
            }

            /**
             * @param propertyMap Describes the value of an application execution property key-value
             *   pair.
             */
            override fun propertyMap(propertyMap: IResolvable) {
                cdkBuilder.propertyMap(propertyMap.let(IResolvable::unwrap))
            }

            /**
             * @param propertyMap Describes the value of an application execution property key-value
             *   pair.
             */
            override fun propertyMap(propertyMap: Map<String, String>) {
                cdkBuilder.propertyMap(propertyMap)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty,
        ) : PropertyGroupProperty {
            /**
             * Describes the key of an application execution property key-value pair.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertygroupid)
             */
            override fun propertyGroupId(): String? = unwrap(this).getPropertyGroupId()

            /**
             * Describes the value of an application execution property key-value pair.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertymap)
             */
            override fun propertyMap(): Any? = unwrap(this).getPropertyMap()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): PropertyGroupProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty
            ): PropertyGroupProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PropertyGroupProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface InputProperty {
        /**
         * Describes the number of in-application streams to create.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-inputparallelism)
         */
        public fun inputParallelism(): Any? = unwrap(this).getInputParallelism()

        /**
         * The
         * [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
         * for the input. An input processor transforms records as they are received from the
         * stream, before the application's SQL code executes. Currently, the only input processing
         * configuration available is
         * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-inputprocessingconfiguration)
         */
        public fun inputProcessingConfiguration(): Any? =
            unwrap(this).getInputProcessingConfiguration()

        /**
         * Describes the format of the data in the streaming source, and how each data element maps
         * to corresponding columns in the in-application stream that is being created.
         *
         * Also used to describe the format of the reference data source.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-inputschema)
         */
        public fun inputSchema(): Any

        /**
         * If the streaming source is an Amazon Kinesis Data Firehose delivery stream, identifies
         * the delivery stream's ARN.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-kinesisfirehoseinput)
         */
        public fun kinesisFirehoseInput(): Any? = unwrap(this).getKinesisFirehoseInput()

        /**
         * If the streaming source is an Amazon Kinesis data stream, identifies the stream's Amazon
         * Resource Name (ARN).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-kinesisstreamsinput)
         */
        public fun kinesisStreamsInput(): Any? = unwrap(this).getKinesisStreamsInput()

        /**
         * The name prefix to use when creating an in-application stream.
         *
         * Suppose that you specify a prefix " `MyInApplicationStream` ." Managed Service for Apache
         * Flink then creates one or more (as per the `InputParallelism` count you specified)
         * in-application streams with the names " `MyInApplicationStream_001` ," "
         * `MyInApplicationStream_002` ," and so on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-nameprefix)
         */
        public fun namePrefix(): String

        /** A builder for [InputProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param inputParallelism Describes the number of in-application streams to create. */
            public fun inputParallelism(inputParallelism: IResolvable)

            /** @param inputParallelism Describes the number of in-application streams to create. */
            public fun inputParallelism(inputParallelism: InputParallelismProperty)

            /** @param inputParallelism Describes the number of in-application streams to create. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("239d3ca00e0b17514b8e33a37b72c01a4d7ad8ff5f906e7a89aa136289b19ddb")
            public fun inputParallelism(
                inputParallelism: InputParallelismProperty.Builder.() -> Unit
            )

            /**
             * @param inputProcessingConfiguration The
             *   [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
             *   for the input. An input processor transforms records as they are received from the
             *   stream, before the application's SQL code executes. Currently, the only input
             *   processing configuration available is
             *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             *   .
             */
            public fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable)

            /**
             * @param inputProcessingConfiguration The
             *   [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
             *   for the input. An input processor transforms records as they are received from the
             *   stream, before the application's SQL code executes. Currently, the only input
             *   processing configuration available is
             *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             *   .
             */
            public fun inputProcessingConfiguration(
                inputProcessingConfiguration: InputProcessingConfigurationProperty
            )

            /**
             * @param inputProcessingConfiguration The
             *   [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
             *   for the input. An input processor transforms records as they are received from the
             *   stream, before the application's SQL code executes. Currently, the only input
             *   processing configuration available is
             *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             *   .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("cc36e4cc2f220aeb3d0abafeaabf7477615f0abe54ed34b756d10a97a3b035af")
            public fun inputProcessingConfiguration(
                inputProcessingConfiguration:
                    InputProcessingConfigurationProperty.Builder.() -> Unit
            )

            /**
             * @param inputSchema Describes the format of the data in the streaming source, and how
             *   each data element maps to corresponding columns in the in-application stream that
             *   is being created.
             *
             * Also used to describe the format of the reference data source.
             */
            public fun inputSchema(inputSchema: IResolvable)

            /**
             * @param inputSchema Describes the format of the data in the streaming source, and how
             *   each data element maps to corresponding columns in the in-application stream that
             *   is being created.
             *
             * Also used to describe the format of the reference data source.
             */
            public fun inputSchema(inputSchema: InputSchemaProperty)

            /**
             * @param inputSchema Describes the format of the data in the streaming source, and how
             *   each data element maps to corresponding columns in the in-application stream that
             *   is being created.
             *
             * Also used to describe the format of the reference data source.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("768cef96d1a3e3f2ddb3096f440217c0d28863040f387ce42683a47186ec3d39")
            public fun inputSchema(inputSchema: InputSchemaProperty.Builder.() -> Unit)

            /**
             * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Data
             *   Firehose delivery stream, identifies the delivery stream's ARN.
             */
            public fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable)

            /**
             * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Data
             *   Firehose delivery stream, identifies the delivery stream's ARN.
             */
            public fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty)

            /**
             * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Data
             *   Firehose delivery stream, identifies the delivery stream's ARN.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("8aa74df2aced7dae3e5757ab3e5585ccc2b2f0bbcb1d6b17222b187fee4ba174")
            public fun kinesisFirehoseInput(
                kinesisFirehoseInput: KinesisFirehoseInputProperty.Builder.() -> Unit
            )

            /**
             * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis data stream,
             *   identifies the stream's Amazon Resource Name (ARN).
             */
            public fun kinesisStreamsInput(kinesisStreamsInput: IResolvable)

            /**
             * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis data stream,
             *   identifies the stream's Amazon Resource Name (ARN).
             */
            public fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty)

            /**
             * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis data stream,
             *   identifies the stream's Amazon Resource Name (ARN).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2c268deba05c2d4869cc7fd3c75c63f6a888cd41e450fb9f51b8c4a53ef23abd")
            public fun kinesisStreamsInput(
                kinesisStreamsInput: KinesisStreamsInputProperty.Builder.() -> Unit
            )

            /**
             * @param namePrefix The name prefix to use when creating an in-application stream.
             *   Suppose that you specify a prefix " `MyInApplicationStream` ." Managed Service for
             *   Apache Flink then creates one or more (as per the `InputParallelism` count you
             *   specified) in-application streams with the names " `MyInApplicationStream_001` ," "
             *   `MyInApplicationStream_002` ," and so on.
             */
            public fun namePrefix(namePrefix: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty
                    .builder()

            /** @param inputParallelism Describes the number of in-application streams to create. */
            override fun inputParallelism(inputParallelism: IResolvable) {
                cdkBuilder.inputParallelism(inputParallelism.let(IResolvable::unwrap))
            }

            /** @param inputParallelism Describes the number of in-application streams to create. */
            override fun inputParallelism(inputParallelism: InputParallelismProperty) {
                cdkBuilder.inputParallelism(inputParallelism.let(InputParallelismProperty::unwrap))
            }

            /** @param inputParallelism Describes the number of in-application streams to create. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("239d3ca00e0b17514b8e33a37b72c01a4d7ad8ff5f906e7a89aa136289b19ddb")
            override fun inputParallelism(
                inputParallelism: InputParallelismProperty.Builder.() -> Unit
            ): Unit = inputParallelism(InputParallelismProperty(inputParallelism))

            /**
             * @param inputProcessingConfiguration The
             *   [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
             *   for the input. An input processor transforms records as they are received from the
             *   stream, before the application's SQL code executes. Currently, the only input
             *   processing configuration available is
             *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             *   .
             */
            override fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable) {
                cdkBuilder.inputProcessingConfiguration(
                    inputProcessingConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param inputProcessingConfiguration The
             *   [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
             *   for the input. An input processor transforms records as they are received from the
             *   stream, before the application's SQL code executes. Currently, the only input
             *   processing configuration available is
             *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             *   .
             */
            override fun inputProcessingConfiguration(
                inputProcessingConfiguration: InputProcessingConfigurationProperty
            ) {
                cdkBuilder.inputProcessingConfiguration(
                    inputProcessingConfiguration.let(InputProcessingConfigurationProperty::unwrap)
                )
            }

            /**
             * @param inputProcessingConfiguration The
             *   [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
             *   for the input. An input processor transforms records as they are received from the
             *   stream, before the application's SQL code executes. Currently, the only input
             *   processing configuration available is
             *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             *   .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("cc36e4cc2f220aeb3d0abafeaabf7477615f0abe54ed34b756d10a97a3b035af")
            override fun inputProcessingConfiguration(
                inputProcessingConfiguration:
                    InputProcessingConfigurationProperty.Builder.() -> Unit
            ): Unit =
                inputProcessingConfiguration(
                    InputProcessingConfigurationProperty(inputProcessingConfiguration)
                )

            /**
             * @param inputSchema Describes the format of the data in the streaming source, and how
             *   each data element maps to corresponding columns in the in-application stream that
             *   is being created.
             *
             * Also used to describe the format of the reference data source.
             */
            override fun inputSchema(inputSchema: IResolvable) {
                cdkBuilder.inputSchema(inputSchema.let(IResolvable::unwrap))
            }

            /**
             * @param inputSchema Describes the format of the data in the streaming source, and how
             *   each data element maps to corresponding columns in the in-application stream that
             *   is being created.
             *
             * Also used to describe the format of the reference data source.
             */
            override fun inputSchema(inputSchema: InputSchemaProperty) {
                cdkBuilder.inputSchema(inputSchema.let(InputSchemaProperty::unwrap))
            }

            /**
             * @param inputSchema Describes the format of the data in the streaming source, and how
             *   each data element maps to corresponding columns in the in-application stream that
             *   is being created.
             *
             * Also used to describe the format of the reference data source.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("768cef96d1a3e3f2ddb3096f440217c0d28863040f387ce42683a47186ec3d39")
            override fun inputSchema(inputSchema: InputSchemaProperty.Builder.() -> Unit): Unit =
                inputSchema(InputSchemaProperty(inputSchema))

            /**
             * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Data
             *   Firehose delivery stream, identifies the delivery stream's ARN.
             */
            override fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable) {
                cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput.let(IResolvable::unwrap))
            }

            /**
             * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Data
             *   Firehose delivery stream, identifies the delivery stream's ARN.
             */
            override fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty) {
                cdkBuilder.kinesisFirehoseInput(
                    kinesisFirehoseInput.let(KinesisFirehoseInputProperty::unwrap)
                )
            }

            /**
             * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Data
             *   Firehose delivery stream, identifies the delivery stream's ARN.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("8aa74df2aced7dae3e5757ab3e5585ccc2b2f0bbcb1d6b17222b187fee4ba174")
            override fun kinesisFirehoseInput(
                kinesisFirehoseInput: KinesisFirehoseInputProperty.Builder.() -> Unit
            ): Unit = kinesisFirehoseInput(KinesisFirehoseInputProperty(kinesisFirehoseInput))

            /**
             * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis data stream,
             *   identifies the stream's Amazon Resource Name (ARN).
             */
            override fun kinesisStreamsInput(kinesisStreamsInput: IResolvable) {
                cdkBuilder.kinesisStreamsInput(kinesisStreamsInput.let(IResolvable::unwrap))
            }

            /**
             * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis data stream,
             *   identifies the stream's Amazon Resource Name (ARN).
             */
            override fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty) {
                cdkBuilder.kinesisStreamsInput(
                    kinesisStreamsInput.let(KinesisStreamsInputProperty::unwrap)
                )
            }

            /**
             * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis data stream,
             *   identifies the stream's Amazon Resource Name (ARN).
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2c268deba05c2d4869cc7fd3c75c63f6a888cd41e450fb9f51b8c4a53ef23abd")
            override fun kinesisStreamsInput(
                kinesisStreamsInput: KinesisStreamsInputProperty.Builder.() -> Unit
            ): Unit = kinesisStreamsInput(KinesisStreamsInputProperty(kinesisStreamsInput))

            /**
             * @param namePrefix The name prefix to use when creating an in-application stream.
             *   Suppose that you specify a prefix " `MyInApplicationStream` ." Managed Service for
             *   Apache Flink then creates one or more (as per the `InputParallelism` count you
             *   specified) in-application streams with the names " `MyInApplicationStream_001` ," "
             *   `MyInApplicationStream_002` ," and so on.
             */
            override fun namePrefix(namePrefix: String) {
                cdkBuilder.namePrefix(namePrefix)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty,
        ) : InputProperty {
            /**
             * Describes the number of in-application streams to create.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-inputparallelism)
             */
            override fun inputParallelism(): Any? = unwrap(this).getInputParallelism()

            /**
             * The
             * [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
             * for the input. An input processor transforms records as they are received from the
             * stream, before the application's SQL code executes. Currently, the only input
             * processing configuration available is
             * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-inputprocessingconfiguration)
             */
            override fun inputProcessingConfiguration(): Any? =
                unwrap(this).getInputProcessingConfiguration()

            /**
             * Describes the format of the data in the streaming source, and how each data element
             * maps to corresponding columns in the in-application stream that is being created.
             *
             * Also used to describe the format of the reference data source.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-inputschema)
             */
            override fun inputSchema(): Any = unwrap(this).getInputSchema()

            /**
             * If the streaming source is an Amazon Kinesis Data Firehose delivery stream,
             * identifies the delivery stream's ARN.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-kinesisfirehoseinput)
             */
            override fun kinesisFirehoseInput(): Any? = unwrap(this).getKinesisFirehoseInput()

            /**
             * If the streaming source is an Amazon Kinesis data stream, identifies the stream's
             * Amazon Resource Name (ARN).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-kinesisstreamsinput)
             */
            override fun kinesisStreamsInput(): Any? = unwrap(this).getKinesisStreamsInput()

            /**
             * The name prefix to use when creating an in-application stream.
             *
             * Suppose that you specify a prefix " `MyInApplicationStream` ." Managed Service for
             * Apache Flink then creates one or more (as per the `InputParallelism` count you
             * specified) in-application streams with the names " `MyInApplicationStream_001` ," "
             * `MyInApplicationStream_002` ," and so on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-nameprefix)
             */
            override fun namePrefix(): String = unwrap(this).getNamePrefix()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): InputProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty
            ): InputProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: InputProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CatalogConfigurationProperty {
        /**
         * The configuration parameters for the default Amazon Glue database.
         *
         * You use this database for Apache Flink SQL queries and table API transforms that you
         * write in a Kinesis Data Analytics Studio notebook.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-catalogconfiguration.html#cfn-kinesisanalyticsv2-application-catalogconfiguration-gluedatacatalogconfiguration)
         */
        public fun glueDataCatalogConfiguration(): Any? =
            unwrap(this).getGlueDataCatalogConfiguration()

        /** A builder for [CatalogConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param glueDataCatalogConfiguration The configuration parameters for the default
             *   Amazon Glue database. You use this database for Apache Flink SQL queries and table
             *   API transforms that you write in a Kinesis Data Analytics Studio notebook.
             */
            public fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: IResolvable)

            /**
             * @param glueDataCatalogConfiguration The configuration parameters for the default
             *   Amazon Glue database. You use this database for Apache Flink SQL queries and table
             *   API transforms that you write in a Kinesis Data Analytics Studio notebook.
             */
            public fun glueDataCatalogConfiguration(
                glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty
            )

            /**
             * @param glueDataCatalogConfiguration The configuration parameters for the default
             *   Amazon Glue database. You use this database for Apache Flink SQL queries and table
             *   API transforms that you write in a Kinesis Data Analytics Studio notebook.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("cae6ad8548b6c4eab778d0dc03188fb1040ff9730dc07755031d5d3a52943282")
            public fun glueDataCatalogConfiguration(
                glueDataCatalogConfiguration:
                    GlueDataCatalogConfigurationProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .CatalogConfigurationProperty
                    .builder()

            /**
             * @param glueDataCatalogConfiguration The configuration parameters for the default
             *   Amazon Glue database. You use this database for Apache Flink SQL queries and table
             *   API transforms that you write in a Kinesis Data Analytics Studio notebook.
             */
            override fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: IResolvable) {
                cdkBuilder.glueDataCatalogConfiguration(
                    glueDataCatalogConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param glueDataCatalogConfiguration The configuration parameters for the default
             *   Amazon Glue database. You use this database for Apache Flink SQL queries and table
             *   API transforms that you write in a Kinesis Data Analytics Studio notebook.
             */
            override fun glueDataCatalogConfiguration(
                glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty
            ) {
                cdkBuilder.glueDataCatalogConfiguration(
                    glueDataCatalogConfiguration.let(GlueDataCatalogConfigurationProperty::unwrap)
                )
            }

            /**
             * @param glueDataCatalogConfiguration The configuration parameters for the default
             *   Amazon Glue database. You use this database for Apache Flink SQL queries and table
             *   API transforms that you write in a Kinesis Data Analytics Studio notebook.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("cae6ad8548b6c4eab778d0dc03188fb1040ff9730dc07755031d5d3a52943282")
            override fun glueDataCatalogConfiguration(
                glueDataCatalogConfiguration:
                    GlueDataCatalogConfigurationProperty.Builder.() -> Unit
            ): Unit =
                glueDataCatalogConfiguration(
                    GlueDataCatalogConfigurationProperty(glueDataCatalogConfiguration)
                )

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty,
        ) : CatalogConfigurationProperty {
            /**
             * The configuration parameters for the default Amazon Glue database.
             *
             * You use this database for Apache Flink SQL queries and table API transforms that you
             * write in a Kinesis Data Analytics Studio notebook.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-catalogconfiguration.html#cfn-kinesisanalyticsv2-application-catalogconfiguration-gluedatacatalogconfiguration)
             */
            override fun glueDataCatalogConfiguration(): Any? =
                unwrap(this).getGlueDataCatalogConfiguration()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): CatalogConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty
            ): CatalogConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CatalogConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ApplicationRestoreConfigurationProperty {
        /**
         * Specifies how the application should be restored.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationrestoreconfiguration.html#cfn-kinesisanalyticsv2-application-applicationrestoreconfiguration-applicationrestoretype)
         */
        public fun applicationRestoreType(): String

        /**
         * The identifier of an existing snapshot of application state to use to restart an
         * application.
         *
         * The application uses this value if `RESTORE_FROM_CUSTOM_SNAPSHOT` is specified for the
         * `ApplicationRestoreType` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationrestoreconfiguration.html#cfn-kinesisanalyticsv2-application-applicationrestoreconfiguration-snapshotname)
         */
        public fun snapshotName(): String? = unwrap(this).getSnapshotName()

        /** A builder for [ApplicationRestoreConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param applicationRestoreType Specifies how the application should be restored. */
            public fun applicationRestoreType(applicationRestoreType: String)

            /**
             * @param snapshotName The identifier of an existing snapshot of application state to
             *   use to restart an application. The application uses this value if
             *   `RESTORE_FROM_CUSTOM_SNAPSHOT` is specified for the `ApplicationRestoreType` .
             */
            public fun snapshotName(snapshotName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationRestoreConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .ApplicationRestoreConfigurationProperty
                    .builder()

            /** @param applicationRestoreType Specifies how the application should be restored. */
            override fun applicationRestoreType(applicationRestoreType: String) {
                cdkBuilder.applicationRestoreType(applicationRestoreType)
            }

            /**
             * @param snapshotName The identifier of an existing snapshot of application state to
             *   use to restart an application. The application uses this value if
             *   `RESTORE_FROM_CUSTOM_SNAPSHOT` is specified for the `ApplicationRestoreType` .
             */
            override fun snapshotName(snapshotName: String) {
                cdkBuilder.snapshotName(snapshotName)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationRestoreConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationRestoreConfigurationProperty,
        ) : ApplicationRestoreConfigurationProperty {
            /**
             * Specifies how the application should be restored.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationrestoreconfiguration.html#cfn-kinesisanalyticsv2-application-applicationrestoreconfiguration-applicationrestoretype)
             */
            override fun applicationRestoreType(): String = unwrap(this).getApplicationRestoreType()

            /**
             * The identifier of an existing snapshot of application state to use to restart an
             * application.
             *
             * The application uses this value if `RESTORE_FROM_CUSTOM_SNAPSHOT` is specified for
             * the `ApplicationRestoreType` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationrestoreconfiguration.html#cfn-kinesisanalyticsv2-application-applicationrestoreconfiguration-snapshotname)
             */
            override fun snapshotName(): String? = unwrap(this).getSnapshotName()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ApplicationRestoreConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationRestoreConfigurationProperty
            ): ApplicationRestoreConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ApplicationRestoreConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationRestoreConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ZeppelinApplicationConfigurationProperty {
        /**
         * The Amazon Glue Data Catalog that you use in queries in a Kinesis Data Analytics Studio
         * notebook.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-catalogconfiguration)
         */
        public fun catalogConfiguration(): Any? = unwrap(this).getCatalogConfiguration()

        /**
         * A list of `CustomArtifactConfiguration` objects.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-customartifactsconfiguration)
         */
        public fun customArtifactsConfiguration(): Any? =
            unwrap(this).getCustomArtifactsConfiguration()

        /**
         * The information required to deploy a Kinesis Data Analytics Studio notebook as an
         * application with durable state.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-deployasapplicationconfiguration)
         */
        public fun deployAsApplicationConfiguration(): Any? =
            unwrap(this).getDeployAsApplicationConfiguration()

        /**
         * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-monitoringconfiguration)
         */
        public fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

        /** A builder for [ZeppelinApplicationConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a
             *   Kinesis Data Analytics Studio notebook.
             */
            public fun catalogConfiguration(catalogConfiguration: IResolvable)

            /**
             * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a
             *   Kinesis Data Analytics Studio notebook.
             */
            public fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty)

            /**
             * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a
             *   Kinesis Data Analytics Studio notebook.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("56a92e306ea7a4f9cb64c6cca427d99f611a927cacb9f9a8819ef3dba5abcff5")
            public fun catalogConfiguration(
                catalogConfiguration: CatalogConfigurationProperty.Builder.() -> Unit
            )

            /**
             * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
             */
            public fun customArtifactsConfiguration(customArtifactsConfiguration: IResolvable)

            /**
             * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
             */
            public fun customArtifactsConfiguration(customArtifactsConfiguration: List<Any>)

            /**
             * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
             */
            public fun customArtifactsConfiguration(vararg customArtifactsConfiguration: Any)

            /**
             * @param deployAsApplicationConfiguration The information required to deploy a Kinesis
             *   Data Analytics Studio notebook as an application with durable state.
             */
            public fun deployAsApplicationConfiguration(
                deployAsApplicationConfiguration: IResolvable
            )

            /**
             * @param deployAsApplicationConfiguration The information required to deploy a Kinesis
             *   Data Analytics Studio notebook as an application with durable state.
             */
            public fun deployAsApplicationConfiguration(
                deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty
            )

            /**
             * @param deployAsApplicationConfiguration The information required to deploy a Kinesis
             *   Data Analytics Studio notebook as an application with durable state.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("331c26ab38775b91c275d7b60ba0c7329cf10d5ba9e6445b91d788e4300663d4")
            public fun deployAsApplicationConfiguration(
                deployAsApplicationConfiguration:
                    DeployAsApplicationConfigurationProperty.Builder.() -> Unit
            )

            /**
             * @param monitoringConfiguration The monitoring configuration of a Kinesis Data
             *   Analytics Studio notebook.
             */
            public fun monitoringConfiguration(monitoringConfiguration: IResolvable)

            /**
             * @param monitoringConfiguration The monitoring configuration of a Kinesis Data
             *   Analytics Studio notebook.
             */
            public fun monitoringConfiguration(
                monitoringConfiguration: ZeppelinMonitoringConfigurationProperty
            )

            /**
             * @param monitoringConfiguration The monitoring configuration of a Kinesis Data
             *   Analytics Studio notebook.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a804da367ff63dc8e34fdea68bbba326290ab09e415676ac438dafe1456a8974")
            public fun monitoringConfiguration(
                monitoringConfiguration: ZeppelinMonitoringConfigurationProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .ZeppelinApplicationConfigurationProperty
                    .builder()

            /**
             * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a
             *   Kinesis Data Analytics Studio notebook.
             */
            override fun catalogConfiguration(catalogConfiguration: IResolvable) {
                cdkBuilder.catalogConfiguration(catalogConfiguration.let(IResolvable::unwrap))
            }

            /**
             * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a
             *   Kinesis Data Analytics Studio notebook.
             */
            override fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty) {
                cdkBuilder.catalogConfiguration(
                    catalogConfiguration.let(CatalogConfigurationProperty::unwrap)
                )
            }

            /**
             * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a
             *   Kinesis Data Analytics Studio notebook.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("56a92e306ea7a4f9cb64c6cca427d99f611a927cacb9f9a8819ef3dba5abcff5")
            override fun catalogConfiguration(
                catalogConfiguration: CatalogConfigurationProperty.Builder.() -> Unit
            ): Unit = catalogConfiguration(CatalogConfigurationProperty(catalogConfiguration))

            /**
             * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
             */
            override fun customArtifactsConfiguration(customArtifactsConfiguration: IResolvable) {
                cdkBuilder.customArtifactsConfiguration(
                    customArtifactsConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
             */
            override fun customArtifactsConfiguration(customArtifactsConfiguration: List<Any>) {
                cdkBuilder.customArtifactsConfiguration(customArtifactsConfiguration)
            }

            /**
             * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
             */
            override fun customArtifactsConfiguration(
                vararg customArtifactsConfiguration: Any
            ): Unit = customArtifactsConfiguration(customArtifactsConfiguration.toList())

            /**
             * @param deployAsApplicationConfiguration The information required to deploy a Kinesis
             *   Data Analytics Studio notebook as an application with durable state.
             */
            override fun deployAsApplicationConfiguration(
                deployAsApplicationConfiguration: IResolvable
            ) {
                cdkBuilder.deployAsApplicationConfiguration(
                    deployAsApplicationConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param deployAsApplicationConfiguration The information required to deploy a Kinesis
             *   Data Analytics Studio notebook as an application with durable state.
             */
            override fun deployAsApplicationConfiguration(
                deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty
            ) {
                cdkBuilder.deployAsApplicationConfiguration(
                    deployAsApplicationConfiguration.let(
                        DeployAsApplicationConfigurationProperty::unwrap
                    )
                )
            }

            /**
             * @param deployAsApplicationConfiguration The information required to deploy a Kinesis
             *   Data Analytics Studio notebook as an application with durable state.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("331c26ab38775b91c275d7b60ba0c7329cf10d5ba9e6445b91d788e4300663d4")
            override fun deployAsApplicationConfiguration(
                deployAsApplicationConfiguration:
                    DeployAsApplicationConfigurationProperty.Builder.() -> Unit
            ): Unit =
                deployAsApplicationConfiguration(
                    DeployAsApplicationConfigurationProperty(deployAsApplicationConfiguration)
                )

            /**
             * @param monitoringConfiguration The monitoring configuration of a Kinesis Data
             *   Analytics Studio notebook.
             */
            override fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
                cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(IResolvable::unwrap))
            }

            /**
             * @param monitoringConfiguration The monitoring configuration of a Kinesis Data
             *   Analytics Studio notebook.
             */
            override fun monitoringConfiguration(
                monitoringConfiguration: ZeppelinMonitoringConfigurationProperty
            ) {
                cdkBuilder.monitoringConfiguration(
                    monitoringConfiguration.let(ZeppelinMonitoringConfigurationProperty::unwrap)
                )
            }

            /**
             * @param monitoringConfiguration The monitoring configuration of a Kinesis Data
             *   Analytics Studio notebook.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a804da367ff63dc8e34fdea68bbba326290ab09e415676ac438dafe1456a8974")
            override fun monitoringConfiguration(
                monitoringConfiguration: ZeppelinMonitoringConfigurationProperty.Builder.() -> Unit
            ): Unit =
                monitoringConfiguration(
                    ZeppelinMonitoringConfigurationProperty(monitoringConfiguration)
                )

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty,
        ) : ZeppelinApplicationConfigurationProperty {
            /**
             * The Amazon Glue Data Catalog that you use in queries in a Kinesis Data Analytics
             * Studio notebook.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-catalogconfiguration)
             */
            override fun catalogConfiguration(): Any? = unwrap(this).getCatalogConfiguration()

            /**
             * A list of `CustomArtifactConfiguration` objects.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-customartifactsconfiguration)
             */
            override fun customArtifactsConfiguration(): Any? =
                unwrap(this).getCustomArtifactsConfiguration()

            /**
             * The information required to deploy a Kinesis Data Analytics Studio notebook as an
             * application with durable state.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-deployasapplicationconfiguration)
             */
            override fun deployAsApplicationConfiguration(): Any? =
                unwrap(this).getDeployAsApplicationConfiguration()

            /**
             * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-monitoringconfiguration)
             */
            override fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ZeppelinApplicationConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty
            ): ZeppelinApplicationConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ZeppelinApplicationConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CheckpointConfigurationProperty {
        /**
         * Describes the interval in milliseconds between checkpoint operations.
         *
         * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
         * `CheckpointInterval` value of 60000, even if this value is set to another value using
         * this API or in application code.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointinterval)
         */
        public fun checkpointInterval(): Number? = unwrap(this).getCheckpointInterval()

        /**
         * Describes whether checkpointing is enabled for a Managed Service for Apache Flink
         * application.
         *
         * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
         * `CheckpointingEnabled` value of `true` , even if this value is set to another value using
         * this API or in application code.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointingenabled)
         */
        public fun checkpointingEnabled(): Any? = unwrap(this).getCheckpointingEnabled()

        /**
         * Describes whether the application uses Managed Service for Apache Flink' default
         * checkpointing behavior.
         *
         * You must set this property to `CUSTOM` in order to set the `CheckpointingEnabled` ,
         * `CheckpointInterval` , or `MinPauseBetweenCheckpoints` parameters.
         *
         * If this value is set to `DEFAULT` , the application will use the following values, even
         * if they are set to other values using APIs or application code:
         * * *CheckpointingEnabled:* true
         * * *CheckpointInterval:* 60000
         * * *MinPauseBetweenCheckpoints:* 5000
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-configurationtype)
         */
        public fun configurationType(): String

        /**
         * Describes the minimum time in milliseconds after a checkpoint operation completes that a
         * new checkpoint operation can start.
         *
         * If a checkpoint operation takes longer than the `CheckpointInterval` , the application
         * otherwise performs continual checkpoint operations. For more information, see
         * [Tuning Checkpointing](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/large_state_tuning.html#tuning-checkpointing)
         * in the
         * [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
         * .
         *
         * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
         * `MinPauseBetweenCheckpoints` value of 5000, even if this value is set using this API or
         * in application code.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-minpausebetweencheckpoints)
         */
        public fun minPauseBetweenCheckpoints(): Number? =
            unwrap(this).getMinPauseBetweenCheckpoints()

        /** A builder for [CheckpointConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param checkpointInterval Describes the interval in milliseconds between checkpoint
             *   operations.
             *
             * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will
             * use a `CheckpointInterval` value of 60000, even if this value is set to another value
             * using this API or in application code.
             */
            public fun checkpointInterval(checkpointInterval: Number)

            /**
             * @param checkpointingEnabled Describes whether checkpointing is enabled for a Managed
             *   Service for Apache Flink application.
             *
             * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will
             * use a `CheckpointingEnabled` value of `true` , even if this value is set to another
             * value using this API or in application code.
             */
            public fun checkpointingEnabled(checkpointingEnabled: Boolean)

            /**
             * @param checkpointingEnabled Describes whether checkpointing is enabled for a Managed
             *   Service for Apache Flink application.
             *
             * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will
             * use a `CheckpointingEnabled` value of `true` , even if this value is set to another
             * value using this API or in application code.
             */
            public fun checkpointingEnabled(checkpointingEnabled: IResolvable)

            /**
             * @param configurationType Describes whether the application uses Managed Service for
             *   Apache Flink' default checkpointing behavior. You must set this property to
             *   `CUSTOM` in order to set the `CheckpointingEnabled` , `CheckpointInterval` , or
             *   `MinPauseBetweenCheckpoints` parameters.
             *
             * If this value is set to `DEFAULT` , the application will use the following values,
             * even if they are set to other values using APIs or application code:
             * * *CheckpointingEnabled:* true
             * * *CheckpointInterval:* 60000
             * * *MinPauseBetweenCheckpoints:* 5000
             */
            public fun configurationType(configurationType: String)

            /**
             * @param minPauseBetweenCheckpoints Describes the minimum time in milliseconds after a
             *   checkpoint operation completes that a new checkpoint operation can start. If a
             *   checkpoint operation takes longer than the `CheckpointInterval` , the application
             *   otherwise performs continual checkpoint operations. For more information, see
             *   [Tuning Checkpointing](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/large_state_tuning.html#tuning-checkpointing)
             *   in the
             *   [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             *   .
             *
             * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will
             * use a `MinPauseBetweenCheckpoints` value of 5000, even if this value is set using
             * this API or in application code.
             */
            public fun minPauseBetweenCheckpoints(minPauseBetweenCheckpoints: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .CheckpointConfigurationProperty
                    .builder()

            /**
             * @param checkpointInterval Describes the interval in milliseconds between checkpoint
             *   operations.
             *
             * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will
             * use a `CheckpointInterval` value of 60000, even if this value is set to another value
             * using this API or in application code.
             */
            override fun checkpointInterval(checkpointInterval: Number) {
                cdkBuilder.checkpointInterval(checkpointInterval)
            }

            /**
             * @param checkpointingEnabled Describes whether checkpointing is enabled for a Managed
             *   Service for Apache Flink application.
             *
             * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will
             * use a `CheckpointingEnabled` value of `true` , even if this value is set to another
             * value using this API or in application code.
             */
            override fun checkpointingEnabled(checkpointingEnabled: Boolean) {
                cdkBuilder.checkpointingEnabled(checkpointingEnabled)
            }

            /**
             * @param checkpointingEnabled Describes whether checkpointing is enabled for a Managed
             *   Service for Apache Flink application.
             *
             * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will
             * use a `CheckpointingEnabled` value of `true` , even if this value is set to another
             * value using this API or in application code.
             */
            override fun checkpointingEnabled(checkpointingEnabled: IResolvable) {
                cdkBuilder.checkpointingEnabled(checkpointingEnabled.let(IResolvable::unwrap))
            }

            /**
             * @param configurationType Describes whether the application uses Managed Service for
             *   Apache Flink' default checkpointing behavior. You must set this property to
             *   `CUSTOM` in order to set the `CheckpointingEnabled` , `CheckpointInterval` , or
             *   `MinPauseBetweenCheckpoints` parameters.
             *
             * If this value is set to `DEFAULT` , the application will use the following values,
             * even if they are set to other values using APIs or application code:
             * * *CheckpointingEnabled:* true
             * * *CheckpointInterval:* 60000
             * * *MinPauseBetweenCheckpoints:* 5000
             */
            override fun configurationType(configurationType: String) {
                cdkBuilder.configurationType(configurationType)
            }

            /**
             * @param minPauseBetweenCheckpoints Describes the minimum time in milliseconds after a
             *   checkpoint operation completes that a new checkpoint operation can start. If a
             *   checkpoint operation takes longer than the `CheckpointInterval` , the application
             *   otherwise performs continual checkpoint operations. For more information, see
             *   [Tuning Checkpointing](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/large_state_tuning.html#tuning-checkpointing)
             *   in the
             *   [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             *   .
             *
             * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will
             * use a `MinPauseBetweenCheckpoints` value of 5000, even if this value is set using
             * this API or in application code.
             */
            override fun minPauseBetweenCheckpoints(minPauseBetweenCheckpoints: Number) {
                cdkBuilder.minPauseBetweenCheckpoints(minPauseBetweenCheckpoints)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty,
        ) : CheckpointConfigurationProperty {
            /**
             * Describes the interval in milliseconds between checkpoint operations.
             *
             * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will
             * use a `CheckpointInterval` value of 60000, even if this value is set to another value
             * using this API or in application code.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointinterval)
             */
            override fun checkpointInterval(): Number? = unwrap(this).getCheckpointInterval()

            /**
             * Describes whether checkpointing is enabled for a Managed Service for Apache Flink
             * application.
             *
             * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will
             * use a `CheckpointingEnabled` value of `true` , even if this value is set to another
             * value using this API or in application code.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointingenabled)
             */
            override fun checkpointingEnabled(): Any? = unwrap(this).getCheckpointingEnabled()

            /**
             * Describes whether the application uses Managed Service for Apache Flink' default
             * checkpointing behavior.
             *
             * You must set this property to `CUSTOM` in order to set the `CheckpointingEnabled` ,
             * `CheckpointInterval` , or `MinPauseBetweenCheckpoints` parameters.
             *
             * If this value is set to `DEFAULT` , the application will use the following values,
             * even if they are set to other values using APIs or application code:
             * * *CheckpointingEnabled:* true
             * * *CheckpointInterval:* 60000
             * * *MinPauseBetweenCheckpoints:* 5000
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-configurationtype)
             */
            override fun configurationType(): String = unwrap(this).getConfigurationType()

            /**
             * Describes the minimum time in milliseconds after a checkpoint operation completes
             * that a new checkpoint operation can start.
             *
             * If a checkpoint operation takes longer than the `CheckpointInterval` , the
             * application otherwise performs continual checkpoint operations. For more information,
             * see
             * [Tuning Checkpointing](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/large_state_tuning.html#tuning-checkpointing)
             * in the
             * [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             * .
             *
             * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will
             * use a `MinPauseBetweenCheckpoints` value of 5000, even if this value is set using
             * this API or in application code.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-minpausebetweencheckpoints)
             */
            override fun minPauseBetweenCheckpoints(): Number? =
                unwrap(this).getMinPauseBetweenCheckpoints()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): CheckpointConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty
            ): CheckpointConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CheckpointConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface RunConfigurationProperty {
        /**
         * Describes the restore behavior of a restarting application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-runconfiguration.html#cfn-kinesisanalyticsv2-application-runconfiguration-applicationrestoreconfiguration)
         */
        public fun applicationRestoreConfiguration(): Any? =
            unwrap(this).getApplicationRestoreConfiguration()

        /**
         * Describes the starting parameters for a Managed Service for Apache Flink application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-runconfiguration.html#cfn-kinesisanalyticsv2-application-runconfiguration-flinkrunconfiguration)
         */
        public fun flinkRunConfiguration(): Any? = unwrap(this).getFlinkRunConfiguration()

        /** A builder for [RunConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
             *   application.
             */
            public fun applicationRestoreConfiguration(applicationRestoreConfiguration: IResolvable)

            /**
             * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
             *   application.
             */
            public fun applicationRestoreConfiguration(
                applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty
            )

            /**
             * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
             *   application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("84efb69bda14653cae67d9353fc0e242a5fbd1121ce722cb4077d6018882cb4a")
            public fun applicationRestoreConfiguration(
                applicationRestoreConfiguration:
                    ApplicationRestoreConfigurationProperty.Builder.() -> Unit
            )

            /**
             * @param flinkRunConfiguration Describes the starting parameters for a Managed Service
             *   for Apache Flink application.
             */
            public fun flinkRunConfiguration(flinkRunConfiguration: IResolvable)

            /**
             * @param flinkRunConfiguration Describes the starting parameters for a Managed Service
             *   for Apache Flink application.
             */
            public fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty)

            /**
             * @param flinkRunConfiguration Describes the starting parameters for a Managed Service
             *   for Apache Flink application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5337cf5e1902aa9b86757abe03a52b34802c6138d52004325dce6405a9cf9f8d")
            public fun flinkRunConfiguration(
                flinkRunConfiguration: FlinkRunConfigurationProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RunConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .RunConfigurationProperty
                    .builder()

            /**
             * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
             *   application.
             */
            override fun applicationRestoreConfiguration(
                applicationRestoreConfiguration: IResolvable
            ) {
                cdkBuilder.applicationRestoreConfiguration(
                    applicationRestoreConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
             *   application.
             */
            override fun applicationRestoreConfiguration(
                applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty
            ) {
                cdkBuilder.applicationRestoreConfiguration(
                    applicationRestoreConfiguration.let(
                        ApplicationRestoreConfigurationProperty::unwrap
                    )
                )
            }

            /**
             * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
             *   application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("84efb69bda14653cae67d9353fc0e242a5fbd1121ce722cb4077d6018882cb4a")
            override fun applicationRestoreConfiguration(
                applicationRestoreConfiguration:
                    ApplicationRestoreConfigurationProperty.Builder.() -> Unit
            ): Unit =
                applicationRestoreConfiguration(
                    ApplicationRestoreConfigurationProperty(applicationRestoreConfiguration)
                )

            /**
             * @param flinkRunConfiguration Describes the starting parameters for a Managed Service
             *   for Apache Flink application.
             */
            override fun flinkRunConfiguration(flinkRunConfiguration: IResolvable) {
                cdkBuilder.flinkRunConfiguration(flinkRunConfiguration.let(IResolvable::unwrap))
            }

            /**
             * @param flinkRunConfiguration Describes the starting parameters for a Managed Service
             *   for Apache Flink application.
             */
            override fun flinkRunConfiguration(
                flinkRunConfiguration: FlinkRunConfigurationProperty
            ) {
                cdkBuilder.flinkRunConfiguration(
                    flinkRunConfiguration.let(FlinkRunConfigurationProperty::unwrap)
                )
            }

            /**
             * @param flinkRunConfiguration Describes the starting parameters for a Managed Service
             *   for Apache Flink application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5337cf5e1902aa9b86757abe03a52b34802c6138d52004325dce6405a9cf9f8d")
            override fun flinkRunConfiguration(
                flinkRunConfiguration: FlinkRunConfigurationProperty.Builder.() -> Unit
            ): Unit = flinkRunConfiguration(FlinkRunConfigurationProperty(flinkRunConfiguration))

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RunConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RunConfigurationProperty,
        ) : RunConfigurationProperty {
            /**
             * Describes the restore behavior of a restarting application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-runconfiguration.html#cfn-kinesisanalyticsv2-application-runconfiguration-applicationrestoreconfiguration)
             */
            override fun applicationRestoreConfiguration(): Any? =
                unwrap(this).getApplicationRestoreConfiguration()

            /**
             * Describes the starting parameters for a Managed Service for Apache Flink application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-runconfiguration.html#cfn-kinesisanalyticsv2-application-runconfiguration-flinkrunconfiguration)
             */
            override fun flinkRunConfiguration(): Any? = unwrap(this).getFlinkRunConfiguration()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): RunConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RunConfigurationProperty
            ): RunConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: RunConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RunConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VpcConfigurationProperty {
        /**
         * The array of
         * [SecurityGroup](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html)
         * IDs used by the VPC configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-vpcconfiguration.html#cfn-kinesisanalyticsv2-application-vpcconfiguration-securitygroupids)
         */
        public fun securityGroupIds(): List<String>

        /**
         * The array of
         * [Subnet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html) IDs used
         * by the VPC configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-vpcconfiguration.html#cfn-kinesisanalyticsv2-application-vpcconfiguration-subnetids)
         */
        public fun subnetIds(): List<String>

        /** A builder for [VpcConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param securityGroupIds The array of
             *   [SecurityGroup](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html)
             *   IDs used by the VPC configuration.
             */
            public fun securityGroupIds(securityGroupIds: List<String>)

            /**
             * @param securityGroupIds The array of
             *   [SecurityGroup](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html)
             *   IDs used by the VPC configuration.
             */
            public fun securityGroupIds(vararg securityGroupIds: String)

            /**
             * @param subnetIds The array of
             *   [Subnet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html)
             *   IDs used by the VPC configuration.
             */
            public fun subnetIds(subnetIds: List<String>)

            /**
             * @param subnetIds The array of
             *   [Subnet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html)
             *   IDs used by the VPC configuration.
             */
            public fun subnetIds(vararg subnetIds: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.VpcConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .VpcConfigurationProperty
                    .builder()

            /**
             * @param securityGroupIds The array of
             *   [SecurityGroup](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html)
             *   IDs used by the VPC configuration.
             */
            override fun securityGroupIds(securityGroupIds: List<String>) {
                cdkBuilder.securityGroupIds(securityGroupIds)
            }

            /**
             * @param securityGroupIds The array of
             *   [SecurityGroup](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html)
             *   IDs used by the VPC configuration.
             */
            override fun securityGroupIds(vararg securityGroupIds: String): Unit =
                securityGroupIds(securityGroupIds.toList())

            /**
             * @param subnetIds The array of
             *   [Subnet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html)
             *   IDs used by the VPC configuration.
             */
            override fun subnetIds(subnetIds: List<String>) {
                cdkBuilder.subnetIds(subnetIds)
            }

            /**
             * @param subnetIds The array of
             *   [Subnet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html)
             *   IDs used by the VPC configuration.
             */
            override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.VpcConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.VpcConfigurationProperty,
        ) : VpcConfigurationProperty {
            /**
             * The array of
             * [SecurityGroup](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html)
             * IDs used by the VPC configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-vpcconfiguration.html#cfn-kinesisanalyticsv2-application-vpcconfiguration-securitygroupids)
             */
            override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

            /**
             * The array of
             * [Subnet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html) IDs
             * used by the VPC configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-vpcconfiguration.html#cfn-kinesisanalyticsv2-application-vpcconfiguration-subnetids)
             */
            override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.VpcConfigurationProperty
            ): VpcConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VpcConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.VpcConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface RecordColumnProperty {
        /**
         * A reference to the data element in the streaming input or the reference data source.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html#cfn-kinesisanalyticsv2-application-recordcolumn-mapping)
         */
        public fun mapping(): String? = unwrap(this).getMapping()

        /**
         * The name of the column that is created in the in-application input stream or reference
         * table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html#cfn-kinesisanalyticsv2-application-recordcolumn-name)
         */
        public fun name(): String

        /**
         * The type of column created in the in-application input stream or reference table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html#cfn-kinesisanalyticsv2-application-recordcolumn-sqltype)
         */
        public fun sqlType(): String

        /** A builder for [RecordColumnProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param mapping A reference to the data element in the streaming input or the
             *   reference data source.
             */
            public fun mapping(mapping: String)

            /**
             * @param name The name of the column that is created in the in-application input stream
             *   or reference table.
             */
            public fun name(name: String)

            /**
             * @param sqlType The type of column created in the in-application input stream or
             *   reference table.
             */
            public fun sqlType(sqlType: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .RecordColumnProperty
                    .builder()

            /**
             * @param mapping A reference to the data element in the streaming input or the
             *   reference data source.
             */
            override fun mapping(mapping: String) {
                cdkBuilder.mapping(mapping)
            }

            /**
             * @param name The name of the column that is created in the in-application input stream
             *   or reference table.
             */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param sqlType The type of column created in the in-application input stream or
             *   reference table.
             */
            override fun sqlType(sqlType: String) {
                cdkBuilder.sqlType(sqlType)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty,
        ) : RecordColumnProperty {
            /**
             * A reference to the data element in the streaming input or the reference data source.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html#cfn-kinesisanalyticsv2-application-recordcolumn-mapping)
             */
            override fun mapping(): String? = unwrap(this).getMapping()

            /**
             * The name of the column that is created in the in-application input stream or
             * reference table.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html#cfn-kinesisanalyticsv2-application-recordcolumn-name)
             */
            override fun name(): String = unwrap(this).getName()

            /**
             * The type of column created in the in-application input stream or reference table.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html#cfn-kinesisanalyticsv2-application-recordcolumn-sqltype)
             */
            override fun sqlType(): String = unwrap(this).getSqlType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): RecordColumnProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty
            ): RecordColumnProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: RecordColumnProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ZeppelinMonitoringConfigurationProperty {
        /**
         * The verbosity of the CloudWatch Logs for an application.
         *
         * You can set it to `INFO` , `WARN` , `ERROR` , or `DEBUG` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinmonitoringconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinmonitoringconfiguration-loglevel)
         */
        public fun logLevel(): String? = unwrap(this).getLogLevel()

        /** A builder for [ZeppelinMonitoringConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param logLevel The verbosity of the CloudWatch Logs for an application. You can set
             *   it to `INFO` , `WARN` , `ERROR` , or `DEBUG` .
             */
            public fun logLevel(logLevel: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .ZeppelinMonitoringConfigurationProperty
                    .builder()

            /**
             * @param logLevel The verbosity of the CloudWatch Logs for an application. You can set
             *   it to `INFO` , `WARN` , `ERROR` , or `DEBUG` .
             */
            override fun logLevel(logLevel: String) {
                cdkBuilder.logLevel(logLevel)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty,
        ) : ZeppelinMonitoringConfigurationProperty {
            /**
             * The verbosity of the CloudWatch Logs for an application.
             *
             * You can set it to `INFO` , `WARN` , `ERROR` , or `DEBUG` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinmonitoringconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinmonitoringconfiguration-loglevel)
             */
            override fun logLevel(): String? = unwrap(this).getLogLevel()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ZeppelinMonitoringConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty
            ): ZeppelinMonitoringConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ZeppelinMonitoringConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface GlueDataCatalogConfigurationProperty {
        /**
         * The Amazon Resource Name (ARN) of the database.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-gluedatacatalogconfiguration.html#cfn-kinesisanalyticsv2-application-gluedatacatalogconfiguration-databasearn)
         */
        public fun databaseArn(): String? = unwrap(this).getDatabaseArn()

        /** A builder for [GlueDataCatalogConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param databaseArn The Amazon Resource Name (ARN) of the database. */
            public fun databaseArn(databaseArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .GlueDataCatalogConfigurationProperty
                    .builder()

            /** @param databaseArn The Amazon Resource Name (ARN) of the database. */
            override fun databaseArn(databaseArn: String) {
                cdkBuilder.databaseArn(databaseArn)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty,
        ) : GlueDataCatalogConfigurationProperty {
            /**
             * The Amazon Resource Name (ARN) of the database.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-gluedatacatalogconfiguration.html#cfn-kinesisanalyticsv2-application-gluedatacatalogconfiguration-databasearn)
             */
            override fun databaseArn(): String? = unwrap(this).getDatabaseArn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): GlueDataCatalogConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty
            ): GlueDataCatalogConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: GlueDataCatalogConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ApplicationSnapshotConfigurationProperty {
        /**
         * Describes whether snapshots are enabled for a Managed Service for Apache Flink
         * application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html#cfn-kinesisanalyticsv2-application-applicationsnapshotconfiguration-snapshotsenabled)
         */
        public fun snapshotsEnabled(): Any

        /** A builder for [ApplicationSnapshotConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param snapshotsEnabled Describes whether snapshots are enabled for a Managed Service
             *   for Apache Flink application.
             */
            public fun snapshotsEnabled(snapshotsEnabled: Boolean)

            /**
             * @param snapshotsEnabled Describes whether snapshots are enabled for a Managed Service
             *   for Apache Flink application.
             */
            public fun snapshotsEnabled(snapshotsEnabled: IResolvable)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .ApplicationSnapshotConfigurationProperty
                    .builder()

            /**
             * @param snapshotsEnabled Describes whether snapshots are enabled for a Managed Service
             *   for Apache Flink application.
             */
            override fun snapshotsEnabled(snapshotsEnabled: Boolean) {
                cdkBuilder.snapshotsEnabled(snapshotsEnabled)
            }

            /**
             * @param snapshotsEnabled Describes whether snapshots are enabled for a Managed Service
             *   for Apache Flink application.
             */
            override fun snapshotsEnabled(snapshotsEnabled: IResolvable) {
                cdkBuilder.snapshotsEnabled(snapshotsEnabled.let(IResolvable::unwrap))
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty,
        ) : ApplicationSnapshotConfigurationProperty {
            /**
             * Describes whether snapshots are enabled for a Managed Service for Apache Flink
             * application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html#cfn-kinesisanalyticsv2-application-applicationsnapshotconfiguration-snapshotsenabled)
             */
            override fun snapshotsEnabled(): Any = unwrap(this).getSnapshotsEnabled()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ApplicationSnapshotConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty
            ): ApplicationSnapshotConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ApplicationSnapshotConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface InputProcessingConfigurationProperty {
        /**
         * The
         * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
         * that is used to preprocess the records in the stream before being processed by your
         * application code.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html#cfn-kinesisanalyticsv2-application-inputprocessingconfiguration-inputlambdaprocessor)
         */
        public fun inputLambdaProcessor(): Any? = unwrap(this).getInputLambdaProcessor()

        /** A builder for [InputProcessingConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param inputLambdaProcessor The
             *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             *   that is used to preprocess the records in the stream before being processed by your
             *   application code.
             */
            public fun inputLambdaProcessor(inputLambdaProcessor: IResolvable)

            /**
             * @param inputLambdaProcessor The
             *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             *   that is used to preprocess the records in the stream before being processed by your
             *   application code.
             */
            public fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty)

            /**
             * @param inputLambdaProcessor The
             *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             *   that is used to preprocess the records in the stream before being processed by your
             *   application code.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("6ac7a1ddc265772b8e655485937e0839e4b931a5fa731c9da007d2f57bc3007c")
            public fun inputLambdaProcessor(
                inputLambdaProcessor: InputLambdaProcessorProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .InputProcessingConfigurationProperty
                    .builder()

            /**
             * @param inputLambdaProcessor The
             *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             *   that is used to preprocess the records in the stream before being processed by your
             *   application code.
             */
            override fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
                cdkBuilder.inputLambdaProcessor(inputLambdaProcessor.let(IResolvable::unwrap))
            }

            /**
             * @param inputLambdaProcessor The
             *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             *   that is used to preprocess the records in the stream before being processed by your
             *   application code.
             */
            override fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty) {
                cdkBuilder.inputLambdaProcessor(
                    inputLambdaProcessor.let(InputLambdaProcessorProperty::unwrap)
                )
            }

            /**
             * @param inputLambdaProcessor The
             *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             *   that is used to preprocess the records in the stream before being processed by your
             *   application code.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("6ac7a1ddc265772b8e655485937e0839e4b931a5fa731c9da007d2f57bc3007c")
            override fun inputLambdaProcessor(
                inputLambdaProcessor: InputLambdaProcessorProperty.Builder.() -> Unit
            ): Unit = inputLambdaProcessor(InputLambdaProcessorProperty(inputLambdaProcessor))

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty,
        ) : InputProcessingConfigurationProperty {
            /**
             * The
             * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
             * that is used to preprocess the records in the stream before being processed by your
             * application code.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html#cfn-kinesisanalyticsv2-application-inputprocessingconfiguration-inputlambdaprocessor)
             */
            override fun inputLambdaProcessor(): Any? = unwrap(this).getInputLambdaProcessor()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): InputProcessingConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty
            ): InputProcessingConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: InputProcessingConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface FlinkApplicationConfigurationProperty {
        /**
         * Describes an application's checkpointing configuration.
         *
         * Checkpointing is the process of persisting application state for fault tolerance. For
         * more information, see
         * [Checkpoints for Fault Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
         * in the
         * [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-flinkapplicationconfiguration-checkpointconfiguration)
         */
        public fun checkpointConfiguration(): Any? = unwrap(this).getCheckpointConfiguration()

        /**
         * Describes configuration parameters for Amazon CloudWatch logging for an application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-flinkapplicationconfiguration-monitoringconfiguration)
         */
        public fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

        /**
         * Describes parameters for how an application executes multiple tasks simultaneously.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-flinkapplicationconfiguration-parallelismconfiguration)
         */
        public fun parallelismConfiguration(): Any? = unwrap(this).getParallelismConfiguration()

        /** A builder for [FlinkApplicationConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param checkpointConfiguration Describes an application's checkpointing
             *   configuration. Checkpointing is the process of persisting application state for
             *   fault tolerance. For more information, see
             *   [Checkpoints for Fault Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
             *   in the
             *   [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             *   .
             */
            public fun checkpointConfiguration(checkpointConfiguration: IResolvable)

            /**
             * @param checkpointConfiguration Describes an application's checkpointing
             *   configuration. Checkpointing is the process of persisting application state for
             *   fault tolerance. For more information, see
             *   [Checkpoints for Fault Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
             *   in the
             *   [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             *   .
             */
            public fun checkpointConfiguration(
                checkpointConfiguration: CheckpointConfigurationProperty
            )

            /**
             * @param checkpointConfiguration Describes an application's checkpointing
             *   configuration. Checkpointing is the process of persisting application state for
             *   fault tolerance. For more information, see
             *   [Checkpoints for Fault Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
             *   in the
             *   [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             *   .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("44389922c1668ab5939a60e0dd52171e0d91a7ec4724e49b72515f975748642b")
            public fun checkpointConfiguration(
                checkpointConfiguration: CheckpointConfigurationProperty.Builder.() -> Unit
            )

            /**
             * @param monitoringConfiguration Describes configuration parameters for Amazon
             *   CloudWatch logging for an application.
             */
            public fun monitoringConfiguration(monitoringConfiguration: IResolvable)

            /**
             * @param monitoringConfiguration Describes configuration parameters for Amazon
             *   CloudWatch logging for an application.
             */
            public fun monitoringConfiguration(
                monitoringConfiguration: MonitoringConfigurationProperty
            )

            /**
             * @param monitoringConfiguration Describes configuration parameters for Amazon
             *   CloudWatch logging for an application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a145583c3da8ac85deb1a97752d83a8592398a0694fa8bcee953fc5da08f96c7")
            public fun monitoringConfiguration(
                monitoringConfiguration: MonitoringConfigurationProperty.Builder.() -> Unit
            )

            /**
             * @param parallelismConfiguration Describes parameters for how an application executes
             *   multiple tasks simultaneously.
             */
            public fun parallelismConfiguration(parallelismConfiguration: IResolvable)

            /**
             * @param parallelismConfiguration Describes parameters for how an application executes
             *   multiple tasks simultaneously.
             */
            public fun parallelismConfiguration(
                parallelismConfiguration: ParallelismConfigurationProperty
            )

            /**
             * @param parallelismConfiguration Describes parameters for how an application executes
             *   multiple tasks simultaneously.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("22789524881e7159d7ca0c1d82f5c48c6f9ff6a62e2ffc0b73bd2c0e3bee5883")
            public fun parallelismConfiguration(
                parallelismConfiguration: ParallelismConfigurationProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
                    .FlinkApplicationConfigurationProperty
                    .builder()

            /**
             * @param checkpointConfiguration Describes an application's checkpointing
             *   configuration. Checkpointing is the process of persisting application state for
             *   fault tolerance. For more information, see
             *   [Checkpoints for Fault Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
             *   in the
             *   [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             *   .
             */
            override fun checkpointConfiguration(checkpointConfiguration: IResolvable) {
                cdkBuilder.checkpointConfiguration(checkpointConfiguration.let(IResolvable::unwrap))
            }

            /**
             * @param checkpointConfiguration Describes an application's checkpointing
             *   configuration. Checkpointing is the process of persisting application state for
             *   fault tolerance. For more information, see
             *   [Checkpoints for Fault Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
             *   in the
             *   [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             *   .
             */
            override fun checkpointConfiguration(
                checkpointConfiguration: CheckpointConfigurationProperty
            ) {
                cdkBuilder.checkpointConfiguration(
                    checkpointConfiguration.let(CheckpointConfigurationProperty::unwrap)
                )
            }

            /**
             * @param checkpointConfiguration Describes an application's checkpointing
             *   configuration. Checkpointing is the process of persisting application state for
             *   fault tolerance. For more information, see
             *   [Checkpoints for Fault Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
             *   in the
             *   [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             *   .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("44389922c1668ab5939a60e0dd52171e0d91a7ec4724e49b72515f975748642b")
            override fun checkpointConfiguration(
                checkpointConfiguration: CheckpointConfigurationProperty.Builder.() -> Unit
            ): Unit =
                checkpointConfiguration(CheckpointConfigurationProperty(checkpointConfiguration))

            /**
             * @param monitoringConfiguration Describes configuration parameters for Amazon
             *   CloudWatch logging for an application.
             */
            override fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
                cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(IResolvable::unwrap))
            }

            /**
             * @param monitoringConfiguration Describes configuration parameters for Amazon
             *   CloudWatch logging for an application.
             */
            override fun monitoringConfiguration(
                monitoringConfiguration: MonitoringConfigurationProperty
            ) {
                cdkBuilder.monitoringConfiguration(
                    monitoringConfiguration.let(MonitoringConfigurationProperty::unwrap)
                )
            }

            /**
             * @param monitoringConfiguration Describes configuration parameters for Amazon
             *   CloudWatch logging for an application.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a145583c3da8ac85deb1a97752d83a8592398a0694fa8bcee953fc5da08f96c7")
            override fun monitoringConfiguration(
                monitoringConfiguration: MonitoringConfigurationProperty.Builder.() -> Unit
            ): Unit =
                monitoringConfiguration(MonitoringConfigurationProperty(monitoringConfiguration))

            /**
             * @param parallelismConfiguration Describes parameters for how an application executes
             *   multiple tasks simultaneously.
             */
            override fun parallelismConfiguration(parallelismConfiguration: IResolvable) {
                cdkBuilder.parallelismConfiguration(
                    parallelismConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param parallelismConfiguration Describes parameters for how an application executes
             *   multiple tasks simultaneously.
             */
            override fun parallelismConfiguration(
                parallelismConfiguration: ParallelismConfigurationProperty
            ) {
                cdkBuilder.parallelismConfiguration(
                    parallelismConfiguration.let(ParallelismConfigurationProperty::unwrap)
                )
            }

            /**
             * @param parallelismConfiguration Describes parameters for how an application executes
             *   multiple tasks simultaneously.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("22789524881e7159d7ca0c1d82f5c48c6f9ff6a62e2ffc0b73bd2c0e3bee5883")
            override fun parallelismConfiguration(
                parallelismConfiguration: ParallelismConfigurationProperty.Builder.() -> Unit
            ): Unit =
                parallelismConfiguration(ParallelismConfigurationProperty(parallelismConfiguration))

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty,
        ) : FlinkApplicationConfigurationProperty {
            /**
             * Describes an application's checkpointing configuration.
             *
             * Checkpointing is the process of persisting application state for fault tolerance. For
             * more information, see
             * [Checkpoints for Fault Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
             * in the
             * [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-flinkapplicationconfiguration-checkpointconfiguration)
             */
            override fun checkpointConfiguration(): Any? = unwrap(this).getCheckpointConfiguration()

            /**
             * Describes configuration parameters for Amazon CloudWatch logging for an application.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-flinkapplicationconfiguration-monitoringconfiguration)
             */
            override fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

            /**
             * Describes parameters for how an application executes multiple tasks simultaneously.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-flinkapplicationconfiguration-parallelismconfiguration)
             */
            override fun parallelismConfiguration(): Any? =
                unwrap(this).getParallelismConfiguration()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): FlinkApplicationConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty
            ): FlinkApplicationConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: FlinkApplicationConfigurationProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
