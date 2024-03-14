package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSoftwarePackageVersion
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
    /** Error reason for a package version failure during creation or update. */
    public open fun attrErrorReason(): String = unwrap(this).getAttrErrorReason()

    /** The Amazon Resource Name (ARN) for the package. */
    public open fun attrPackageVersionArn(): String = unwrap(this).getAttrPackageVersionArn()

    /**
     * The status of the package version.
     *
     * For more information, see
     * [Package version lifecycle](https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle)
     * .
     */
    public open fun attrStatus(): String = unwrap(this).getAttrStatus()

    /**  */
    public open fun attributes(): Any? = unwrap(this).getAttributes()

    /**  */
    public open fun attributes(`value`: IResolvable) {
        unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
    }

    /**  */
    public open fun attributes(`value`: Map<String, String>) {
        unwrap(this).setAttributes(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun cdkTagManager(): TagManager =
        unwrap(this).getCdkTagManager().let(TagManager::wrap)

    /**  */
    public open fun description(): String? = unwrap(this).getDescription()

    /**  */
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

    /**  */
    public open fun packageName(): String = unwrap(this).getPackageName()

    /**  */
    public open fun packageName(`value`: String) {
        unwrap(this).setPackageName(`value`)
    }

    /** An array of key-value pairs to apply to this resource. */
    public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /** An array of key-value pairs to apply to this resource. */
    public open fun tags(`value`: List<CfnTag>) {
        unwrap(this).setTags(`value`.map(CfnTag::unwrap))
    }

    /** An array of key-value pairs to apply to this resource. */
    public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

    /**  */
    public open fun versionName(): String? = unwrap(this).getVersionName()

    /**  */
    public open fun versionName(`value`: String) {
        unwrap(this).setVersionName(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnSoftwarePackageVersion]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
         *
         * @param attributes
         */
        public fun attributes(attributes: IResolvable)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
         *
         * @param attributes
         */
        public fun attributes(attributes: Map<String, String>)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-description)
         *
         * @param description
         */
        public fun description(description: String)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-packagename)
         *
         * @param packageName
         */
        public fun packageName(packageName: String)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-versionname)
         *
         * @param versionName
         */
        public fun versionName(versionName: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.Builder =
            software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.Builder.create(scope, id)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
         *
         * @param attributes
         */
        override fun attributes(attributes: IResolvable) {
            cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
         *
         * @param attributes
         */
        override fun attributes(attributes: Map<String, String>) {
            cdkBuilder.attributes(attributes)
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-description)
         *
         * @param description
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-packagename)
         *
         * @param packageName
         */
        override fun packageName(packageName: String) {
            cdkBuilder.packageName(packageName)
        }

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-versionname)
         *
         * @param versionName
         */
        override fun versionName(versionName: String) {
            cdkBuilder.versionName(versionName)
        }

        public fun build(): software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnSoftwarePackageVersion {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnSoftwarePackageVersion(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion
        ): CfnSoftwarePackageVersion = CfnSoftwarePackageVersion(cdkObject)

        internal fun unwrap(
            wrapped: CfnSoftwarePackageVersion
        ): software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion = wrapped.cdkObject
    }
}
