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

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * A logical rule statement used to negate the results of another rule statement.
 *
 * You provide one `Statement` within the `NotStatement` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-notstatement.html)
 */
@CdkDslMarker
public class CfnWebACLNotStatementPropertyDsl {
    private val cdkBuilder: CfnWebACL.NotStatementProperty.Builder =
        CfnWebACL.NotStatementProperty.builder()

    /** @param statement The statement to negate. You can use any statement that can be nested. */
    public fun statement(statement: IResolvable) {
        cdkBuilder.statement(statement)
    }

    /** @param statement The statement to negate. You can use any statement that can be nested. */
    public fun statement(statement: CfnWebACL.StatementProperty) {
        cdkBuilder.statement(statement)
    }

    public fun build(): CfnWebACL.NotStatementProperty = cdkBuilder.build()
}
