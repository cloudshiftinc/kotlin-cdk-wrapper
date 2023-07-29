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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.logs.CfnQueryDefinition
import software.constructs.Construct

/**
 * Creates a query definition for CloudWatch Logs Insights.
 *
 * For more information, see
 * [Analyzing Log Data with CloudWatch Logs Insights](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AnalyzingLogData.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnQueryDefinition cfnQueryDefinition = CfnQueryDefinition.Builder.create(this,
 * "MyCfnQueryDefinition")
 * .name("name")
 * .queryString("queryString")
 * // the properties below are optional
 * .logGroupNames(List.of("logGroupNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html)
 */
@CdkDslMarker
public class CfnQueryDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnQueryDefinition.Builder =
        CfnQueryDefinition.Builder.create(scope, id)

    private val _logGroupNames: MutableList<String> = mutableListOf()

    /**
     * Use this parameter if you want the query to query only certain log groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-loggroupnames)
     *
     * @param logGroupNames Use this parameter if you want the query to query only certain log
     *   groups.
     */
    public fun logGroupNames(vararg logGroupNames: String) {
        _logGroupNames.addAll(listOf(*logGroupNames))
    }

    /**
     * Use this parameter if you want the query to query only certain log groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-loggroupnames)
     *
     * @param logGroupNames Use this parameter if you want the query to query only certain log
     *   groups.
     */
    public fun logGroupNames(logGroupNames: Collection<String>) {
        _logGroupNames.addAll(logGroupNames)
    }

    /**
     * A name for the query definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-name)
     *
     * @param name A name for the query definition.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The query string to use for this query definition.
     *
     * For more information, see
     * [CloudWatch Logs Insights Query Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-querydefinition.html#cfn-logs-querydefinition-querystring)
     *
     * @param queryString The query string to use for this query definition.
     */
    public fun queryString(queryString: String) {
        cdkBuilder.queryString(queryString)
    }

    public fun build(): CfnQueryDefinition {
        if (_logGroupNames.isNotEmpty()) cdkBuilder.logGroupNames(_logGroupNames)
        return cdkBuilder.build()
    }
}
