package io.cloudshiftdev.awscdk.services.simspaceweaver

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

public open class CfnSimulation
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.simspaceweaver.CfnSimulation,
) : CfnResource(cdkObject), IInspectable {
    /**
     * The JSON blob that the
     * [DescribeSimulation](https://docs.aws.amazon.com/simspaceweaver/latest/APIReference/API_DescribeSimulation.html)
     * action returns.
     */
    public open fun attrDescribePayload(): String = unwrap(this).getAttrDescribePayload()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**
     * The maximum running time of the simulation, specified as a number of minutes (m or M), hours
     * (h or H), or days (d or D).
     */
    public open fun maximumDuration(): String? = unwrap(this).getMaximumDuration()

    /**
     * The maximum running time of the simulation, specified as a number of minutes (m or M), hours
     * (h or H), or days (d or D).
     */
    public open fun maximumDuration(`value`: String) {
        unwrap(this).setMaximumDuration(`value`)
    }

    /** The name of the simulation. */
    public open fun name(): String = unwrap(this).getName()

    /** The name of the simulation. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management ( IAM ) role that
     * the simulation assumes to perform actions.
     */
    public open fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management ( IAM ) role that
     * the simulation assumes to perform actions.
     */
    public open fun roleArn(`value`: String) {
        unwrap(this).setRoleArn(`value`)
    }

    /** The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ). */
    public open fun schemaS3Location(): Any? = unwrap(this).getSchemaS3Location()

    /** The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ). */
    public open fun schemaS3Location(`value`: IResolvable) {
        unwrap(this).setSchemaS3Location(`value`.let(IResolvable::unwrap))
    }

    /** The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ). */
    public open fun schemaS3Location(`value`: S3LocationProperty) {
        unwrap(this).setSchemaS3Location(`value`.let(S3LocationProperty::unwrap))
    }

    /** The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ). */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("475380afe3765bc72323d7d3c3853fb4b4a405f48cd03a77c8e2e3a591691d34")
    public open fun schemaS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
        schemaS3Location(S3LocationProperty(`value`))

    /** The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ). */
    public open fun snapshotS3Location(): Any? = unwrap(this).getSnapshotS3Location()

    /** The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ). */
    public open fun snapshotS3Location(`value`: IResolvable) {
        unwrap(this).setSnapshotS3Location(`value`.let(IResolvable::unwrap))
    }

    /** The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ). */
    public open fun snapshotS3Location(`value`: S3LocationProperty) {
        unwrap(this).setSnapshotS3Location(`value`.let(S3LocationProperty::unwrap))
    }

    /** The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ). */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c2801cae644767f75149f0f79e3db62c9cd197d1b485e55d2e04d97753024ab")
    public open fun snapshotS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
        snapshotS3Location(S3LocationProperty(`value`))

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.simspaceweaver.CfnSimulation]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The maximum running time of the simulation, specified as a number of minutes (m or M),
         * hours (h or H), or days (d or D).
         *
         * The simulation stops when it reaches this limit. The maximum value is `14D` , or its
         * equivalent in the other units. The default value is `14D` . A value equivalent to `0`
         * makes the simulation immediately transition to `STOPPING` as soon as it reaches `STARTED`
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-maximumduration)
         *
         * @param maximumDuration The maximum running time of the simulation, specified as a number
         *   of minutes (m or M), hours (h or H), or days (d or D).
         */
        public fun maximumDuration(maximumDuration: String)

        /**
         * The name of the simulation.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-name)
         *
         * @param name The name of the simulation.
         */
        public fun name(name: String)

        /**
         * The Amazon Resource Name (ARN) of the AWS Identity and Access Management ( IAM ) role
         * that the simulation assumes to perform actions.
         *
         * For more information about ARNs, see
         * [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
         * in the *AWS General Reference* . For more information about IAM roles, see
         * [IAM roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html) in the *AWS
         * Identity and Access Management User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-rolearn)
         *
         * @param roleArn The Amazon Resource Name (ARN) of the AWS Identity and Access Management (
         *   IAM ) role that the simulation assumes to perform actions.
         */
        public fun roleArn(roleArn: String)

        /**
         * The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ).
         *
         * For more information about Amazon S3 , see the
         * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
         * .
         *
         * Provide a `SchemaS3Location` to start your simulation from a schema.
         *
         * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-schemas3location)
         *
         * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage
         *   Service ( Amazon S3 ).
         */
        public fun schemaS3Location(schemaS3Location: IResolvable)

        /**
         * The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ).
         *
         * For more information about Amazon S3 , see the
         * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
         * .
         *
         * Provide a `SchemaS3Location` to start your simulation from a schema.
         *
         * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-schemas3location)
         *
         * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage
         *   Service ( Amazon S3 ).
         */
        public fun schemaS3Location(schemaS3Location: S3LocationProperty)

        /**
         * The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ).
         *
         * For more information about Amazon S3 , see the
         * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
         * .
         *
         * Provide a `SchemaS3Location` to start your simulation from a schema.
         *
         * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-schemas3location)
         *
         * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage
         *   Service ( Amazon S3 ).
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7db59c9ce544d7dbd83199772c30b881d0db8e078f4412fed47b70f35151b91b")
        public fun schemaS3Location(schemaS3Location: S3LocationProperty.Builder.() -> Unit)

        /**
         * The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ).
         *
         * For more information about Amazon S3 , see the
         * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
         * .
         *
         * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
         *
         * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-snapshots3location)
         *
         * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
         *   Amazon S3 ).
         */
        public fun snapshotS3Location(snapshotS3Location: IResolvable)

        /**
         * The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ).
         *
         * For more information about Amazon S3 , see the
         * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
         * .
         *
         * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
         *
         * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-snapshots3location)
         *
         * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
         *   Amazon S3 ).
         */
        public fun snapshotS3Location(snapshotS3Location: S3LocationProperty)

        /**
         * The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ).
         *
         * For more information about Amazon S3 , see the
         * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
         * .
         *
         * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
         *
         * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-snapshots3location)
         *
         * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
         *   Amazon S3 ).
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("2e4644105d4bea75c7ef018f662e2ff5c31f9fc7fd491292f07a7540bf866cf5")
        public fun snapshotS3Location(snapshotS3Location: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.simspaceweaver.CfnSimulation.Builder =
            software.amazon.awscdk.services.simspaceweaver.CfnSimulation.Builder.create(scope, id)

        /**
         * The maximum running time of the simulation, specified as a number of minutes (m or M),
         * hours (h or H), or days (d or D).
         *
         * The simulation stops when it reaches this limit. The maximum value is `14D` , or its
         * equivalent in the other units. The default value is `14D` . A value equivalent to `0`
         * makes the simulation immediately transition to `STOPPING` as soon as it reaches `STARTED`
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-maximumduration)
         *
         * @param maximumDuration The maximum running time of the simulation, specified as a number
         *   of minutes (m or M), hours (h or H), or days (d or D).
         */
        override fun maximumDuration(maximumDuration: String) {
            cdkBuilder.maximumDuration(maximumDuration)
        }

        /**
         * The name of the simulation.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-name)
         *
         * @param name The name of the simulation.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The Amazon Resource Name (ARN) of the AWS Identity and Access Management ( IAM ) role
         * that the simulation assumes to perform actions.
         *
         * For more information about ARNs, see
         * [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
         * in the *AWS General Reference* . For more information about IAM roles, see
         * [IAM roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html) in the *AWS
         * Identity and Access Management User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-rolearn)
         *
         * @param roleArn The Amazon Resource Name (ARN) of the AWS Identity and Access Management (
         *   IAM ) role that the simulation assumes to perform actions.
         */
        override fun roleArn(roleArn: String) {
            cdkBuilder.roleArn(roleArn)
        }

        /**
         * The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ).
         *
         * For more information about Amazon S3 , see the
         * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
         * .
         *
         * Provide a `SchemaS3Location` to start your simulation from a schema.
         *
         * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-schemas3location)
         *
         * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage
         *   Service ( Amazon S3 ).
         */
        override fun schemaS3Location(schemaS3Location: IResolvable) {
            cdkBuilder.schemaS3Location(schemaS3Location.let(IResolvable::unwrap))
        }

        /**
         * The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ).
         *
         * For more information about Amazon S3 , see the
         * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
         * .
         *
         * Provide a `SchemaS3Location` to start your simulation from a schema.
         *
         * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-schemas3location)
         *
         * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage
         *   Service ( Amazon S3 ).
         */
        override fun schemaS3Location(schemaS3Location: S3LocationProperty) {
            cdkBuilder.schemaS3Location(schemaS3Location.let(S3LocationProperty::unwrap))
        }

        /**
         * The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ).
         *
         * For more information about Amazon S3 , see the
         * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
         * .
         *
         * Provide a `SchemaS3Location` to start your simulation from a schema.
         *
         * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-schemas3location)
         *
         * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage
         *   Service ( Amazon S3 ).
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7db59c9ce544d7dbd83199772c30b881d0db8e078f4412fed47b70f35151b91b")
        override fun schemaS3Location(
            schemaS3Location: S3LocationProperty.Builder.() -> Unit
        ): Unit = schemaS3Location(S3LocationProperty(schemaS3Location))

        /**
         * The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ).
         *
         * For more information about Amazon S3 , see the
         * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
         * .
         *
         * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
         *
         * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-snapshots3location)
         *
         * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
         *   Amazon S3 ).
         */
        override fun snapshotS3Location(snapshotS3Location: IResolvable) {
            cdkBuilder.snapshotS3Location(snapshotS3Location.let(IResolvable::unwrap))
        }

        /**
         * The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ).
         *
         * For more information about Amazon S3 , see the
         * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
         * .
         *
         * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
         *
         * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-snapshots3location)
         *
         * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
         *   Amazon S3 ).
         */
        override fun snapshotS3Location(snapshotS3Location: S3LocationProperty) {
            cdkBuilder.snapshotS3Location(snapshotS3Location.let(S3LocationProperty::unwrap))
        }

        /**
         * The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ).
         *
         * For more information about Amazon S3 , see the
         * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
         * .
         *
         * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
         *
         * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-snapshots3location)
         *
         * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
         *   Amazon S3 ).
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("2e4644105d4bea75c7ef018f662e2ff5c31f9fc7fd491292f07a7540bf866cf5")
        override fun snapshotS3Location(
            snapshotS3Location: S3LocationProperty.Builder.() -> Unit
        ): Unit = snapshotS3Location(S3LocationProperty(snapshotS3Location))

        public fun build(): software.amazon.awscdk.services.simspaceweaver.CfnSimulation =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnSimulation {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnSimulation(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.simspaceweaver.CfnSimulation
        ): CfnSimulation = CfnSimulation(cdkObject)

        internal fun unwrap(
            wrapped: CfnSimulation
        ): software.amazon.awscdk.services.simspaceweaver.CfnSimulation = wrapped.cdkObject
    }

    public interface S3LocationProperty {
        /**
         * The name of an Amazon S3 bucket.
         *
         * For more information about buckets, see
         * [Creating, configuring, and working with Amazon S3 buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html)
         * in the *Amazon Simple Storage Service User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simspaceweaver-simulation-s3location.html#cfn-simspaceweaver-simulation-s3location-bucketname)
         */
        public fun bucketName(): String

        /**
         * The key name of an object in Amazon S3 .
         *
         * For more information about Amazon S3 objects and object keys, see
         * [Uploading, downloading, and working with objects in Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html)
         * in the *Amazon Simple Storage Service User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simspaceweaver-simulation-s3location.html#cfn-simspaceweaver-simulation-s3location-objectkey)
         */
        public fun objectKey(): String

        /** A builder for [S3LocationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param bucketName The name of an Amazon S3 bucket. For more information about
             *   buckets, see
             *   [Creating, configuring, and working with Amazon S3 buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html)
             *   in the *Amazon Simple Storage Service User Guide* .
             */
            public fun bucketName(bucketName: String)

            /**
             * @param objectKey The key name of an object in Amazon S3 . For more information about
             *   Amazon S3 objects and object keys, see
             *   [Uploading, downloading, and working with objects in Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html)
             *   in the *Amazon Simple Storage Service User Guide* .
             */
            public fun objectKey(objectKey: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.simspaceweaver.CfnSimulation.S3LocationProperty.Builder =
                software.amazon.awscdk.services.simspaceweaver.CfnSimulation.S3LocationProperty
                    .builder()

            /**
             * @param bucketName The name of an Amazon S3 bucket. For more information about
             *   buckets, see
             *   [Creating, configuring, and working with Amazon S3 buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html)
             *   in the *Amazon Simple Storage Service User Guide* .
             */
            override fun bucketName(bucketName: String) {
                cdkBuilder.bucketName(bucketName)
            }

            /**
             * @param objectKey The key name of an object in Amazon S3 . For more information about
             *   Amazon S3 objects and object keys, see
             *   [Uploading, downloading, and working with objects in Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html)
             *   in the *Amazon Simple Storage Service User Guide* .
             */
            override fun objectKey(objectKey: String) {
                cdkBuilder.objectKey(objectKey)
            }

            public fun build():
                software.amazon.awscdk.services.simspaceweaver.CfnSimulation.S3LocationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.simspaceweaver.CfnSimulation.S3LocationProperty,
        ) : S3LocationProperty {
            /**
             * The name of an Amazon S3 bucket.
             *
             * For more information about buckets, see
             * [Creating, configuring, and working with Amazon S3 buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html)
             * in the *Amazon Simple Storage Service User Guide* .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simspaceweaver-simulation-s3location.html#cfn-simspaceweaver-simulation-s3location-bucketname)
             */
            override fun bucketName(): String = unwrap(this).getBucketName()

            /**
             * The key name of an object in Amazon S3 .
             *
             * For more information about Amazon S3 objects and object keys, see
             * [Uploading, downloading, and working with objects in Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html)
             * in the *Amazon Simple Storage Service User Guide* .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simspaceweaver-simulation-s3location.html#cfn-simspaceweaver-simulation-s3location-objectkey)
             */
            override fun objectKey(): String = unwrap(this).getObjectKey()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.simspaceweaver.CfnSimulation.S3LocationProperty
            ): S3LocationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: S3LocationProperty
            ): software.amazon.awscdk.services.simspaceweaver.CfnSimulation.S3LocationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
