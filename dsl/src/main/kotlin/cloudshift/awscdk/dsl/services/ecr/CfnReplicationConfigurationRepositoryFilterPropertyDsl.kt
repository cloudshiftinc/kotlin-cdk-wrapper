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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

/**
 * The filter settings used with image replication.
 *
 * Specifying a repository filter to a replication rule provides a method for controlling which
 * repositories in a private registry are replicated. If no filters are added, the contents of all
 * repositories are replicated.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * RepositoryFilterProperty repositoryFilterProperty = RepositoryFilterProperty.builder()
 * .filter("filter")
 * .filterType("filterType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-repositoryfilter.html)
 */
@CdkDslMarker
public class CfnReplicationConfigurationRepositoryFilterPropertyDsl {
    private val cdkBuilder: CfnReplicationConfiguration.RepositoryFilterProperty.Builder =
        CfnReplicationConfiguration.RepositoryFilterProperty.builder()

    /**
     * @param filter The repository filter details. When the `PREFIX_MATCH` filter type is
     *   specified, this value is required and should be the repository name prefix to configure
     *   replication for.
     */
    public fun filter(filter: String) {
        cdkBuilder.filter(filter)
    }

    /**
     * @param filterType The repository filter type. The only supported value is `PREFIX_MATCH` ,
     *   which is a repository name prefix specified with the `filter` parameter.
     */
    public fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
    }

    public fun build(): CfnReplicationConfiguration.RepositoryFilterProperty = cdkBuilder.build()
}
