package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplicationVersion
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion,
) : CfnResource(cdkObject), IInspectable {
    /**
     * The name of the Elastic Beanstalk application that is associated with this application
     * version.
     */
    public open fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * The name of the Elastic Beanstalk application that is associated with this application
     * version.
     */
    public open fun applicationName(`value`: String) {
        unwrap(this).setApplicationName(`value`)
    }

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** A description of this application version. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** A description of this application version. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
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
     * The Amazon S3 bucket and key that identify the location of the source bundle for this
     * version.
     */
    public open fun sourceBundle(): Any = unwrap(this).getSourceBundle()

    /**
     * The Amazon S3 bucket and key that identify the location of the source bundle for this
     * version.
     */
    public open fun sourceBundle(`value`: IResolvable) {
        unwrap(this).setSourceBundle(`value`.let(IResolvable::unwrap))
    }

    /**
     * The Amazon S3 bucket and key that identify the location of the source bundle for this
     * version.
     */
    public open fun sourceBundle(`value`: SourceBundleProperty) {
        unwrap(this).setSourceBundle(`value`.let(SourceBundleProperty::unwrap))
    }

    /**
     * The Amazon S3 bucket and key that identify the location of the source bundle for this
     * version.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eae3db08aef7d90cdb8308388f10fe050b8ae668e69290b96a8a630737e1483f")
    public open fun sourceBundle(`value`: SourceBundleProperty.Builder.() -> Unit): Unit =
        sourceBundle(SourceBundleProperty(`value`))

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.elasticbeanstalk.CfnApplicationVersion].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the Elastic Beanstalk application that is associated with this application
         * version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-applicationname)
         *
         * @param applicationName The name of the Elastic Beanstalk application that is associated
         *   with this application version.
         */
        public fun applicationName(applicationName: String)

        /**
         * A description of this application version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-description)
         *
         * @param description A description of this application version.
         */
        public fun description(description: String)

        /**
         * The Amazon S3 bucket and key that identify the location of the source bundle for this
         * version.
         *
         * The Amazon S3 bucket must be in the same region as the environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
         *
         * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
         *   bundle for this version.
         */
        public fun sourceBundle(sourceBundle: IResolvable)

        /**
         * The Amazon S3 bucket and key that identify the location of the source bundle for this
         * version.
         *
         * The Amazon S3 bucket must be in the same region as the environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
         *
         * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
         *   bundle for this version.
         */
        public fun sourceBundle(sourceBundle: SourceBundleProperty)

        /**
         * The Amazon S3 bucket and key that identify the location of the source bundle for this
         * version.
         *
         * The Amazon S3 bucket must be in the same region as the environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
         *
         * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
         *   bundle for this version.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("f795ae77678e6d15ed6b87c69dba1d60f35d044bf88ac97674c8556ff79d25a8")
        public fun sourceBundle(sourceBundle: SourceBundleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.Builder =
            software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.Builder.create(
                scope,
                id
            )

        /**
         * The name of the Elastic Beanstalk application that is associated with this application
         * version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-applicationname)
         *
         * @param applicationName The name of the Elastic Beanstalk application that is associated
         *   with this application version.
         */
        override fun applicationName(applicationName: String) {
            cdkBuilder.applicationName(applicationName)
        }

        /**
         * A description of this application version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-description)
         *
         * @param description A description of this application version.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The Amazon S3 bucket and key that identify the location of the source bundle for this
         * version.
         *
         * The Amazon S3 bucket must be in the same region as the environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
         *
         * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
         *   bundle for this version.
         */
        override fun sourceBundle(sourceBundle: IResolvable) {
            cdkBuilder.sourceBundle(sourceBundle.let(IResolvable::unwrap))
        }

        /**
         * The Amazon S3 bucket and key that identify the location of the source bundle for this
         * version.
         *
         * The Amazon S3 bucket must be in the same region as the environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
         *
         * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
         *   bundle for this version.
         */
        override fun sourceBundle(sourceBundle: SourceBundleProperty) {
            cdkBuilder.sourceBundle(sourceBundle.let(SourceBundleProperty::unwrap))
        }

        /**
         * The Amazon S3 bucket and key that identify the location of the source bundle for this
         * version.
         *
         * The Amazon S3 bucket must be in the same region as the environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
         *
         * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
         *   bundle for this version.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("f795ae77678e6d15ed6b87c69dba1d60f35d044bf88ac97674c8556ff79d25a8")
        override fun sourceBundle(sourceBundle: SourceBundleProperty.Builder.() -> Unit): Unit =
            sourceBundle(SourceBundleProperty(sourceBundle))

        public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnApplicationVersion {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnApplicationVersion(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
        ): CfnApplicationVersion = CfnApplicationVersion(cdkObject)

        internal fun unwrap(
            wrapped: CfnApplicationVersion
        ): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion =
            wrapped.cdkObject
    }

    public interface SourceBundleProperty {
        /**
         * The Amazon S3 bucket where the data is located.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-applicationversion-sourcebundle.html#cfn-elasticbeanstalk-applicationversion-sourcebundle-s3bucket)
         */
        public fun s3Bucket(): String

        /**
         * The Amazon S3 key where the data is located.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-applicationversion-sourcebundle.html#cfn-elasticbeanstalk-applicationversion-sourcebundle-s3key)
         */
        public fun s3Key(): String

        /** A builder for [SourceBundleProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param s3Bucket The Amazon S3 bucket where the data is located. */
            public fun s3Bucket(s3Bucket: String)

            /** @param s3Key The Amazon S3 key where the data is located. */
            public fun s3Key(s3Key: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty.Builder =
                software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
                    .SourceBundleProperty
                    .builder()

            /** @param s3Bucket The Amazon S3 bucket where the data is located. */
            override fun s3Bucket(s3Bucket: String) {
                cdkBuilder.s3Bucket(s3Bucket)
            }

            /** @param s3Key The Amazon S3 key where the data is located. */
            override fun s3Key(s3Key: String) {
                cdkBuilder.s3Key(s3Key)
            }

            public fun build():
                software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty,
        ) : SourceBundleProperty {
            /**
             * The Amazon S3 bucket where the data is located.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-applicationversion-sourcebundle.html#cfn-elasticbeanstalk-applicationversion-sourcebundle-s3bucket)
             */
            override fun s3Bucket(): String = unwrap(this).getS3Bucket()

            /**
             * The Amazon S3 key where the data is located.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-applicationversion-sourcebundle.html#cfn-elasticbeanstalk-applicationversion-sourcebundle-s3key)
             */
            override fun s3Key(): String = unwrap(this).getS3Key()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SourceBundleProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty
            ): SourceBundleProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SourceBundleProperty
            ): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
