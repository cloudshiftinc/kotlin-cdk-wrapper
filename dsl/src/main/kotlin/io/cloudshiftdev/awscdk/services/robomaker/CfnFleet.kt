package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFleet
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.robomaker.CfnFleet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**
     * The Amazon Resource Name (ARN) of the fleet, such as
     * `arn:aws:robomaker:us-west-2:123456789012:deployment-fleet/MyFleet/1539894765711` .
     */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the fleet. */
    public open fun name(): String? = unwrap(this).getName()

    /** The name of the fleet. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The list of all tags added to the fleet. */
    public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

    /** The list of all tags added to the fleet. */
    public open fun tagsRaw(`value`: Map<String, String>) {
        unwrap(this).setTagsRaw(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.robomaker.CfnFleet]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the fleet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html#cfn-robomaker-fleet-name)
         *
         * @param name The name of the fleet.
         */
        public fun name(name: String)

        /**
         * The list of all tags added to the fleet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html#cfn-robomaker-fleet-tags)
         *
         * @param tags The list of all tags added to the fleet.
         */
        public fun tags(tags: Map<String, String>)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.robomaker.CfnFleet.Builder =
            software.amazon.awscdk.services.robomaker.CfnFleet.Builder.create(scope, id)

        /**
         * The name of the fleet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html#cfn-robomaker-fleet-name)
         *
         * @param name The name of the fleet.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The list of all tags added to the fleet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html#cfn-robomaker-fleet-tags)
         *
         * @param tags The list of all tags added to the fleet.
         */
        override fun tags(tags: Map<String, String>) {
            cdkBuilder.tags(tags)
        }

        public fun build(): software.amazon.awscdk.services.robomaker.CfnFleet = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnFleet {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnFleet(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnFleet): CfnFleet =
            CfnFleet(cdkObject)

        internal fun unwrap(wrapped: CfnFleet): software.amazon.awscdk.services.robomaker.CfnFleet =
            wrapped.cdkObject
    }
}
