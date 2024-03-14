package io.cloudshiftdev.awscdk.services.sdb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomain
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.sdb.CfnDomain,
) : CfnResource(cdkObject), IInspectable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** Information about the SimpleDB domain. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** Information about the SimpleDB domain. */
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

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.sdb.CfnDomain]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Information about the SimpleDB domain.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html#cfn-sdb-domain-description)
         *
         * @param description Information about the SimpleDB domain.
         */
        public fun description(description: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.sdb.CfnDomain.Builder =
            software.amazon.awscdk.services.sdb.CfnDomain.Builder.create(scope, id)

        /**
         * Information about the SimpleDB domain.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html#cfn-sdb-domain-description)
         *
         * @param description Information about the SimpleDB domain.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        public fun build(): software.amazon.awscdk.services.sdb.CfnDomain = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnDomain {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnDomain(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.sdb.CfnDomain): CfnDomain =
            CfnDomain(cdkObject)

        internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.sdb.CfnDomain =
            wrapped.cdkObject
    }
}
