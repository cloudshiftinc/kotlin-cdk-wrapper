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

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnNamedQueryProps

/**
 * Properties for defining a `CfnNamedQuery`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * CfnNamedQueryProps cfnNamedQueryProps = CfnNamedQueryProps.builder()
 * .database("database")
 * .queryString("queryString")
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .workGroup("workGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html)
 */
@CdkDslMarker
public class CfnNamedQueryPropsDsl {
    private val cdkBuilder: CfnNamedQueryProps.Builder = CfnNamedQueryProps.builder()

    /** @param database The database to which the query belongs. */
    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    /** @param description The query description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The query name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param queryString The SQL statements that make up the query. */
    public fun queryString(queryString: String) {
        cdkBuilder.queryString(queryString)
    }

    /** @param workGroup The name of the workgroup that contains the named query. */
    public fun workGroup(workGroup: String) {
        cdkBuilder.workGroup(workGroup)
    }

    public fun build(): CfnNamedQueryProps = cdkBuilder.build()
}
