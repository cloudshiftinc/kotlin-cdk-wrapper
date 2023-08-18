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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.glue.CfnCrawler

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * IcebergTargetProperty icebergTargetProperty = IcebergTargetProperty.builder()
 * .connectionName("connectionName")
 * .exclusions(List.of("exclusions"))
 * .maximumTraversalDepth(123)
 * .paths(List.of("paths"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-icebergtarget.html)
 */
@CdkDslMarker
public class CfnCrawlerIcebergTargetPropertyDsl {
    private val cdkBuilder: CfnCrawler.IcebergTargetProperty.Builder =
        CfnCrawler.IcebergTargetProperty.builder()

    private val _exclusions: MutableList<String> = mutableListOf()

    private val _paths: MutableList<String> = mutableListOf()

    /** @param connectionName the value to be set. */
    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    /** @param exclusions the value to be set. */
    public fun exclusions(vararg exclusions: String) {
        _exclusions.addAll(listOf(*exclusions))
    }

    /** @param exclusions the value to be set. */
    public fun exclusions(exclusions: Collection<String>) {
        _exclusions.addAll(exclusions)
    }

    /** @param maximumTraversalDepth the value to be set. */
    public fun maximumTraversalDepth(maximumTraversalDepth: Number) {
        cdkBuilder.maximumTraversalDepth(maximumTraversalDepth)
    }

    /** @param paths the value to be set. */
    public fun paths(vararg paths: String) {
        _paths.addAll(listOf(*paths))
    }

    /** @param paths the value to be set. */
    public fun paths(paths: Collection<String>) {
        _paths.addAll(paths)
    }

    public fun build(): CfnCrawler.IcebergTargetProperty {
        if (_exclusions.isNotEmpty()) cdkBuilder.exclusions(_exclusions)
        if (_paths.isNotEmpty()) cdkBuilder.paths(_paths)
        return cdkBuilder.build()
    }
}
