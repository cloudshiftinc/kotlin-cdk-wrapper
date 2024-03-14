package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.sam.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**  */
    public open fun location(): Any = unwrap(this).getLocation()

    /**  */
    public open fun location(`value`: String) {
        unwrap(this).setLocation(`value`)
    }

    /**  */
    public open fun location(`value`: IResolvable) {
        unwrap(this).setLocation(`value`.let(IResolvable::unwrap))
    }

    /**  */
    public open fun location(`value`: ApplicationLocationProperty) {
        unwrap(this).setLocation(`value`.let(ApplicationLocationProperty::unwrap))
    }

    /**  */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dcb31e66d0913c99b516e3e5eda6b247691a5d5e3e9eb879d4eb2c2b6cf4166")
    public open fun location(`value`: ApplicationLocationProperty.Builder.() -> Unit): Unit =
        location(ApplicationLocationProperty(`value`))

    /**  */
    public open fun notificationArns(): List<String> =
        unwrap(this).getNotificationArns() ?: emptyList()

    /**  */
    public open fun notificationArns(`value`: List<String>) {
        unwrap(this).setNotificationArns(`value`)
    }

    /**  */
    public open fun notificationArns(vararg `value`: String): Unit =
        notificationArns(`value`.toList())

    /**  */
    public open fun parameters(): Any? = unwrap(this).getParameters()

    /**  */
    public open fun parameters(`value`: IResolvable) {
        unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
    }

    /**  */
    public open fun parameters(`value`: Map<String, String>) {
        unwrap(this).setParameters(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /**  */
    public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

    /**  */
    public open fun tagsRaw(`value`: Map<String, String>) {
        unwrap(this).setTagsRaw(`value`)
    }

    /**  */
    public open fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

    /**  */
    public open fun timeoutInMinutes(`value`: Number) {
        unwrap(this).setTimeoutInMinutes(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.sam.CfnApplication]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
         *
         * @param location
         */
        public fun location(location: String)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
         *
         * @param location
         */
        public fun location(location: IResolvable)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
         *
         * @param location
         */
        public fun location(location: ApplicationLocationProperty)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
         *
         * @param location
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("52158d726646327e9d094bf58b871f34607bb62eb3f1bdc9c8d0fde88e133c5d")
        public fun location(location: ApplicationLocationProperty.Builder.() -> Unit)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-notificationarns)
         *
         * @param notificationArns
         */
        public fun notificationArns(notificationArns: List<String>)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-notificationarns)
         *
         * @param notificationArns
         */
        public fun notificationArns(vararg notificationArns: String)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-parameters)
         *
         * @param parameters
         */
        public fun parameters(parameters: IResolvable)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-parameters)
         *
         * @param parameters
         */
        public fun parameters(parameters: Map<String, String>)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-tags)
         *
         * @param tags
         */
        public fun tags(tags: Map<String, String>)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-timeoutinminutes)
         *
         * @param timeoutInMinutes
         */
        public fun timeoutInMinutes(timeoutInMinutes: Number)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApplication.Builder =
            software.amazon.awscdk.services.sam.CfnApplication.Builder.create(scope, id)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
         *
         * @param location
         */
        override fun location(location: String) {
            cdkBuilder.location(location)
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
         *
         * @param location
         */
        override fun location(location: IResolvable) {
            cdkBuilder.location(location.let(IResolvable::unwrap))
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
         *
         * @param location
         */
        override fun location(location: ApplicationLocationProperty) {
            cdkBuilder.location(location.let(ApplicationLocationProperty::unwrap))
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
         *
         * @param location
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("52158d726646327e9d094bf58b871f34607bb62eb3f1bdc9c8d0fde88e133c5d")
        override fun location(location: ApplicationLocationProperty.Builder.() -> Unit): Unit =
            location(ApplicationLocationProperty(location))

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-notificationarns)
         *
         * @param notificationArns
         */
        override fun notificationArns(notificationArns: List<String>) {
            cdkBuilder.notificationArns(notificationArns)
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-notificationarns)
         *
         * @param notificationArns
         */
        override fun notificationArns(vararg notificationArns: String): Unit =
            notificationArns(notificationArns.toList())

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-parameters)
         *
         * @param parameters
         */
        override fun parameters(parameters: IResolvable) {
            cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-parameters)
         *
         * @param parameters
         */
        override fun parameters(parameters: Map<String, String>) {
            cdkBuilder.parameters(parameters)
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-tags)
         *
         * @param tags
         */
        override fun tags(tags: Map<String, String>) {
            cdkBuilder.tags(tags)
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-timeoutinminutes)
         *
         * @param timeoutInMinutes
         */
        override fun timeoutInMinutes(timeoutInMinutes: Number) {
            cdkBuilder.timeoutInMinutes(timeoutInMinutes)
        }

        public fun build(): software.amazon.awscdk.services.sam.CfnApplication = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnApplication {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnApplication(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.sam.CfnApplication
        ): CfnApplication = CfnApplication(cdkObject)

        internal fun unwrap(
            wrapped: CfnApplication
        ): software.amazon.awscdk.services.sam.CfnApplication = wrapped.cdkObject
    }

    public interface ApplicationLocationProperty {
        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-application-applicationlocation.html#cfn-serverless-application-applicationlocation-applicationid)
         */
        public fun applicationId(): String

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-application-applicationlocation.html#cfn-serverless-application-applicationlocation-semanticversion)
         */
        public fun semanticVersion(): String

        /** A builder for [ApplicationLocationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param applicationId the value to be set. */
            public fun applicationId(applicationId: String)

            /** @param semanticVersion the value to be set. */
            public fun semanticVersion(semanticVersion: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.Builder =
                software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty
                    .builder()

            /** @param applicationId the value to be set. */
            override fun applicationId(applicationId: String) {
                cdkBuilder.applicationId(applicationId)
            }

            /** @param semanticVersion the value to be set. */
            override fun semanticVersion(semanticVersion: String) {
                cdkBuilder.semanticVersion(semanticVersion)
            }

            public fun build():
                software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty,
        ) : ApplicationLocationProperty {
            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-application-applicationlocation.html#cfn-serverless-application-applicationlocation-applicationid)
             */
            override fun applicationId(): String = unwrap(this).getApplicationId()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-application-applicationlocation.html#cfn-serverless-application-applicationlocation-semanticversion)
             */
            override fun semanticVersion(): String = unwrap(this).getSemanticVersion()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ApplicationLocationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty
            ): ApplicationLocationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ApplicationLocationProperty
            ): software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
