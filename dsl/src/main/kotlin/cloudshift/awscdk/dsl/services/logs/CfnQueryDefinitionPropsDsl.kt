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
import software.amazon.awscdk.services.logs.CfnQueryDefinitionProps

/**
 * Properties for defining a `CfnQueryDefinition`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnQueryDefinitionProps cfnQueryDefinitionProps = CfnQueryDefinitionProps.builder()
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
public class CfnQueryDefinitionPropsDsl {
    private val cdkBuilder: CfnQueryDefinitionProps.Builder = CfnQueryDefinitionProps.builder()

    private val _logGroupNames: MutableList<String> = mutableListOf()

    /**
     * @param logGroupNames Use this parameter if you want the query to query only certain log
     *   groups.
     */
    public fun logGroupNames(vararg logGroupNames: String) {
        _logGroupNames.addAll(listOf(*logGroupNames))
    }

    /**
     * @param logGroupNames Use this parameter if you want the query to query only certain log
     *   groups.
     */
    public fun logGroupNames(logGroupNames: Collection<String>) {
        _logGroupNames.addAll(logGroupNames)
    }

    /** @param name A name for the query definition. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param queryString The query string to use for this query definition. For more information,
     *   see
     *   [CloudWatch Logs Insights Query Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html)
     *   .
     */
    public fun queryString(queryString: String) {
        cdkBuilder.queryString(queryString)
    }

    public fun build(): CfnQueryDefinitionProps {
        if (_logGroupNames.isNotEmpty()) cdkBuilder.logGroupNames(_logGroupNames)
        return cdkBuilder.build()
    }
}
