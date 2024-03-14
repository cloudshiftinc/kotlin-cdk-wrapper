package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReceiptRuleSet
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRuleSet,
) : CfnResource(cdkObject), IInspectable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the receipt rule set to reorder. */
    public open fun ruleSetName(): String? = unwrap(this).getRuleSetName()

    /** The name of the receipt rule set to reorder. */
    public open fun ruleSetName(`value`: String) {
        unwrap(this).setRuleSetName(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnReceiptRuleSet]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the receipt rule set to reorder.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname)
         *
         * @param ruleSetName The name of the receipt rule set to reorder.
         */
        public fun ruleSetName(ruleSetName: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ses.CfnReceiptRuleSet.Builder =
            software.amazon.awscdk.services.ses.CfnReceiptRuleSet.Builder.create(scope, id)

        /**
         * The name of the receipt rule set to reorder.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname)
         *
         * @param ruleSetName The name of the receipt rule set to reorder.
         */
        override fun ruleSetName(ruleSetName: String) {
            cdkBuilder.ruleSetName(ruleSetName)
        }

        public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRuleSet =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnReceiptRuleSet {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnReceiptRuleSet(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRuleSet
        ): CfnReceiptRuleSet = CfnReceiptRuleSet(cdkObject)

        internal fun unwrap(
            wrapped: CfnReceiptRuleSet
        ): software.amazon.awscdk.services.ses.CfnReceiptRuleSet = wrapped.cdkObject
    }
}
