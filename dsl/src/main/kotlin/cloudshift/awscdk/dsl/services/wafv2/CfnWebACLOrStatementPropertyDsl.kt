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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWebACLOrStatementPropertyDsl {
    private val cdkBuilder: CfnWebACL.OrStatementProperty.Builder =
        CfnWebACL.OrStatementProperty.builder()

    private val _statements: MutableList<Any> = mutableListOf()

    public fun statements(vararg statements: Any) {
        _statements.addAll(listOf(*statements))
    }

    public fun statements(statements: Collection<Any>) {
        _statements.addAll(statements)
    }

    public fun statements(statements: IResolvable) {
        cdkBuilder.statements(statements)
    }

    public fun build(): CfnWebACL.OrStatementProperty {
        if (_statements.isNotEmpty()) cdkBuilder.statements(_statements)
        return cdkBuilder.build()
    }
}
