package io.cloudshiftdev.awscdk.services.databrew

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

public open class CfnProject
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.databrew.CfnProject,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The dataset that the project is to act upon. */
    public open fun datasetName(): String = unwrap(this).getDatasetName()

    /** The dataset that the project is to act upon. */
    public open fun datasetName(`value`: String) {
        unwrap(this).setDatasetName(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The unique name of a project. */
    public open fun name(): String = unwrap(this).getName()

    /** The unique name of a project. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** The name of a recipe that will be developed during a project session. */
    public open fun recipeName(): String = unwrap(this).getRecipeName()

    /** The name of a recipe that will be developed during a project session. */
    public open fun recipeName(`value`: String) {
        unwrap(this).setRecipeName(`value`)
    }

    /** The Amazon Resource Name (ARN) of the role that will be assumed for this project. */
    public open fun roleArn(): String = unwrap(this).getRoleArn()

    /** The Amazon Resource Name (ARN) of the role that will be assumed for this project. */
    public open fun roleArn(`value`: String) {
        unwrap(this).setRoleArn(`value`)
    }

    /** The sample size and sampling type to apply to the data. */
    public open fun sample(): Any? = unwrap(this).getSample()

    /** The sample size and sampling type to apply to the data. */
    public open fun sample(`value`: IResolvable) {
        unwrap(this).setSample(`value`.let(IResolvable::unwrap))
    }

    /** The sample size and sampling type to apply to the data. */
    public open fun sample(`value`: SampleProperty) {
        unwrap(this).setSample(`value`.let(SampleProperty::unwrap))
    }

    /** The sample size and sampling type to apply to the data. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76013231adedb9c8516d2a2367dedb7ca8b9effd85a2f3c9d94bc63d05375634")
    public open fun sample(`value`: SampleProperty.Builder.() -> Unit): Unit =
        sample(SampleProperty(`value`))

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** Metadata tags that have been applied to the project. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** Metadata tags that have been applied to the project. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** Metadata tags that have been applied to the project. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.databrew.CfnProject]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The dataset that the project is to act upon.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-datasetname)
         *
         * @param datasetName The dataset that the project is to act upon.
         */
        public fun datasetName(datasetName: String)

        /**
         * The unique name of a project.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-name)
         *
         * @param name The unique name of a project.
         */
        public fun name(name: String)

        /**
         * The name of a recipe that will be developed during a project session.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-recipename)
         *
         * @param recipeName The name of a recipe that will be developed during a project session.
         */
        public fun recipeName(recipeName: String)

        /**
         * The Amazon Resource Name (ARN) of the role that will be assumed for this project.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-rolearn)
         *
         * @param roleArn The Amazon Resource Name (ARN) of the role that will be assumed for this
         *   project.
         */
        public fun roleArn(roleArn: String)

        /**
         * The sample size and sampling type to apply to the data.
         *
         * If this parameter isn't specified, then the sample consists of the first 500 rows from
         * the dataset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-sample)
         *
         * @param sample The sample size and sampling type to apply to the data.
         */
        public fun sample(sample: IResolvable)

        /**
         * The sample size and sampling type to apply to the data.
         *
         * If this parameter isn't specified, then the sample consists of the first 500 rows from
         * the dataset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-sample)
         *
         * @param sample The sample size and sampling type to apply to the data.
         */
        public fun sample(sample: SampleProperty)

        /**
         * The sample size and sampling type to apply to the data.
         *
         * If this parameter isn't specified, then the sample consists of the first 500 rows from
         * the dataset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-sample)
         *
         * @param sample The sample size and sampling type to apply to the data.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("c3d5139527d6c03889a0fefa8ee2540297e40f654309f3677204b85a64024a2d")
        public fun sample(sample: SampleProperty.Builder.() -> Unit)

        /**
         * Metadata tags that have been applied to the project.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-tags)
         *
         * @param tags Metadata tags that have been applied to the project.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * Metadata tags that have been applied to the project.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-tags)
         *
         * @param tags Metadata tags that have been applied to the project.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnProject.Builder =
            software.amazon.awscdk.services.databrew.CfnProject.Builder.create(scope, id)

        /**
         * The dataset that the project is to act upon.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-datasetname)
         *
         * @param datasetName The dataset that the project is to act upon.
         */
        override fun datasetName(datasetName: String) {
            cdkBuilder.datasetName(datasetName)
        }

        /**
         * The unique name of a project.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-name)
         *
         * @param name The unique name of a project.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The name of a recipe that will be developed during a project session.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-recipename)
         *
         * @param recipeName The name of a recipe that will be developed during a project session.
         */
        override fun recipeName(recipeName: String) {
            cdkBuilder.recipeName(recipeName)
        }

        /**
         * The Amazon Resource Name (ARN) of the role that will be assumed for this project.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-rolearn)
         *
         * @param roleArn The Amazon Resource Name (ARN) of the role that will be assumed for this
         *   project.
         */
        override fun roleArn(roleArn: String) {
            cdkBuilder.roleArn(roleArn)
        }

        /**
         * The sample size and sampling type to apply to the data.
         *
         * If this parameter isn't specified, then the sample consists of the first 500 rows from
         * the dataset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-sample)
         *
         * @param sample The sample size and sampling type to apply to the data.
         */
        override fun sample(sample: IResolvable) {
            cdkBuilder.sample(sample.let(IResolvable::unwrap))
        }

        /**
         * The sample size and sampling type to apply to the data.
         *
         * If this parameter isn't specified, then the sample consists of the first 500 rows from
         * the dataset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-sample)
         *
         * @param sample The sample size and sampling type to apply to the data.
         */
        override fun sample(sample: SampleProperty) {
            cdkBuilder.sample(sample.let(SampleProperty::unwrap))
        }

        /**
         * The sample size and sampling type to apply to the data.
         *
         * If this parameter isn't specified, then the sample consists of the first 500 rows from
         * the dataset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-sample)
         *
         * @param sample The sample size and sampling type to apply to the data.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("c3d5139527d6c03889a0fefa8ee2540297e40f654309f3677204b85a64024a2d")
        override fun sample(sample: SampleProperty.Builder.() -> Unit): Unit =
            sample(SampleProperty(sample))

        /**
         * Metadata tags that have been applied to the project.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-tags)
         *
         * @param tags Metadata tags that have been applied to the project.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * Metadata tags that have been applied to the project.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-tags)
         *
         * @param tags Metadata tags that have been applied to the project.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.databrew.CfnProject = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnProject {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnProject(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.databrew.CfnProject
        ): CfnProject = CfnProject(cdkObject)

        internal fun unwrap(
            wrapped: CfnProject
        ): software.amazon.awscdk.services.databrew.CfnProject = wrapped.cdkObject
    }

    public interface SampleProperty {
        /**
         * The number of rows in the sample.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-project-sample.html#cfn-databrew-project-sample-size)
         */
        public fun size(): Number? = unwrap(this).getSize()

        /**
         * The way in which DataBrew obtains rows from a dataset.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-project-sample.html#cfn-databrew-project-sample-type)
         */
        public fun type(): String

        /** A builder for [SampleProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param size The number of rows in the sample. */
            public fun size(size: Number)

            /** @param type The way in which DataBrew obtains rows from a dataset. */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.databrew.CfnProject.SampleProperty.Builder =
                software.amazon.awscdk.services.databrew.CfnProject.SampleProperty.builder()

            /** @param size The number of rows in the sample. */
            override fun size(size: Number) {
                cdkBuilder.size(size)
            }

            /** @param type The way in which DataBrew obtains rows from a dataset. */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build(): software.amazon.awscdk.services.databrew.CfnProject.SampleProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.databrew.CfnProject.SampleProperty,
        ) : SampleProperty {
            /**
             * The number of rows in the sample.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-project-sample.html#cfn-databrew-project-sample-size)
             */
            override fun size(): Number? = unwrap(this).getSize()

            /**
             * The way in which DataBrew obtains rows from a dataset.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-project-sample.html#cfn-databrew-project-sample-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SampleProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.databrew.CfnProject.SampleProperty
            ): SampleProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SampleProperty
            ): software.amazon.awscdk.services.databrew.CfnProject.SampleProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
