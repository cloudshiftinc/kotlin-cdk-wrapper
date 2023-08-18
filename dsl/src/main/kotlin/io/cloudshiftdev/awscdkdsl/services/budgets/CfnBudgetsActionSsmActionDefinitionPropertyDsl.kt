@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.budgets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

/**
 * The Amazon EC2 Systems Manager ( SSM ) action definition details.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * SsmActionDefinitionProperty ssmActionDefinitionProperty = SsmActionDefinitionProperty.builder()
 * .instanceIds(List.of("instanceIds"))
 * .region("region")
 * .subtype("subtype")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-ssmactiondefinition.html)
 */
@CdkDslMarker
public class CfnBudgetsActionSsmActionDefinitionPropertyDsl {
    private val cdkBuilder: CfnBudgetsAction.SsmActionDefinitionProperty.Builder =
        CfnBudgetsAction.SsmActionDefinitionProperty.builder()

    private val _instanceIds: MutableList<String> = mutableListOf()

    /** @param instanceIds The EC2 and RDS instance IDs. */
    public fun instanceIds(vararg instanceIds: String) {
        _instanceIds.addAll(listOf(*instanceIds))
    }

    /** @param instanceIds The EC2 and RDS instance IDs. */
    public fun instanceIds(instanceIds: Collection<String>) {
        _instanceIds.addAll(instanceIds)
    }

    /** @param region The Region to run the ( SSM ) document. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /** @param subtype The action subType. */
    public fun subtype(subtype: String) {
        cdkBuilder.subtype(subtype)
    }

    public fun build(): CfnBudgetsAction.SsmActionDefinitionProperty {
        if (_instanceIds.isNotEmpty()) cdkBuilder.instanceIds(_instanceIds)
        return cdkBuilder.build()
    }
}
