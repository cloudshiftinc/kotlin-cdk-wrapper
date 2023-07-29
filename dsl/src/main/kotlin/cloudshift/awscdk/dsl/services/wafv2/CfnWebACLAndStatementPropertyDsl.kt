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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * A logical rule statement used to combine other rule statements with AND logic.
 *
 * You provide more than one `Statement` within the `AndStatement` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatement.html)
 */
@CdkDslMarker
public class CfnWebACLAndStatementPropertyDsl {
    private val cdkBuilder: CfnWebACL.AndStatementProperty.Builder =
        CfnWebACL.AndStatementProperty.builder()

    private val _statements: MutableList<Any> = mutableListOf()

    /**
     * @param statements The statements to combine with AND logic. You can use any statements that
     *   can be nested.
     */
    public fun statements(vararg statements: Any) {
        _statements.addAll(listOf(*statements))
    }

    /**
     * @param statements The statements to combine with AND logic. You can use any statements that
     *   can be nested.
     */
    public fun statements(statements: Collection<Any>) {
        _statements.addAll(statements)
    }

    /**
     * @param statements The statements to combine with AND logic. You can use any statements that
     *   can be nested.
     */
    public fun statements(statements: IResolvable) {
        cdkBuilder.statements(statements)
    }

    public fun build(): CfnWebACL.AndStatementProperty {
        if (_statements.isNotEmpty()) cdkBuilder.statements(_statements)
        return cdkBuilder.build()
    }
}
