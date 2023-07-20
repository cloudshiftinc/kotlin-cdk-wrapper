@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.macie

import software.amazon.awscdk.services.macie.CfnAllowList
import software.amazon.awscdk.services.macie.CfnAllowListProps
import software.amazon.awscdk.services.macie.CfnCustomDataIdentifier
import software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps
import software.amazon.awscdk.services.macie.CfnFindingsFilter
import software.amazon.awscdk.services.macie.CfnFindingsFilterProps
import software.amazon.awscdk.services.macie.CfnSession
import software.amazon.awscdk.services.macie.CfnSessionProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object macie {
    public inline fun cfnAllowList(
        scope: Construct,
        id: String,
        block: CfnAllowListDsl.() -> Unit = {},
    ): CfnAllowList {
        val builder = CfnAllowListDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAllowListCriteriaProperty(
        block: CfnAllowListCriteriaPropertyDsl.() -> Unit =
            {},
    ): CfnAllowList.CriteriaProperty {
        val builder = CfnAllowListCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAllowListProps(block: CfnAllowListPropsDsl.() -> Unit = {}): CfnAllowListProps {
        val builder = CfnAllowListPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAllowListS3WordsListProperty(
        block: CfnAllowListS3WordsListPropertyDsl.() -> Unit =
            {},
    ): CfnAllowList.S3WordsListProperty {
        val builder = CfnAllowListS3WordsListPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCustomDataIdentifier(
        scope: Construct,
        id: String,
        block: CfnCustomDataIdentifierDsl.() -> Unit = {},
    ): CfnCustomDataIdentifier {
        val builder = CfnCustomDataIdentifierDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCustomDataIdentifierProps(
        block: CfnCustomDataIdentifierPropsDsl.() -> Unit =
            {},
    ): CfnCustomDataIdentifierProps {
        val builder = CfnCustomDataIdentifierPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFindingsFilter(
        scope: Construct,
        id: String,
        block: CfnFindingsFilterDsl.() -> Unit = {},
    ): CfnFindingsFilter {
        val builder = CfnFindingsFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFindingsFilterCriterionAdditionalPropertiesProperty(
        block: CfnFindingsFilterCriterionAdditionalPropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnFindingsFilter.CriterionAdditionalPropertiesProperty {
        val builder = CfnFindingsFilterCriterionAdditionalPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFindingsFilterFindingCriteriaProperty(
        block: CfnFindingsFilterFindingCriteriaPropertyDsl.() -> Unit =
            {},
    ): CfnFindingsFilter.FindingCriteriaProperty {
        val builder = CfnFindingsFilterFindingCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFindingsFilterFindingsFilterListItemProperty(
        block: CfnFindingsFilterFindingsFilterListItemPropertyDsl.() -> Unit =
            {},
    ): CfnFindingsFilter.FindingsFilterListItemProperty {
        val builder = CfnFindingsFilterFindingsFilterListItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFindingsFilterProps(block: CfnFindingsFilterPropsDsl.() -> Unit = {}): CfnFindingsFilterProps {
        val builder = CfnFindingsFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSession(
        scope: Construct,
        id: String,
        block: CfnSessionDsl.() -> Unit = {},
    ): CfnSession {
        val builder = CfnSessionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSessionProps(block: CfnSessionPropsDsl.() -> Unit = {}): CfnSessionProps {
        val builder = CfnSessionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
