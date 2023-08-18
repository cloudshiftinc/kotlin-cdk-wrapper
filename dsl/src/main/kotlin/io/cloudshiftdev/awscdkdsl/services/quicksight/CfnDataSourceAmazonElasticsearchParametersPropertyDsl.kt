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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * The parameters for OpenSearch.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AmazonElasticsearchParametersProperty amazonElasticsearchParametersProperty =
 * AmazonElasticsearchParametersProperty.builder()
 * .domain("domain")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-amazonelasticsearchparameters.html)
 */
@CdkDslMarker
public class CfnDataSourceAmazonElasticsearchParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.AmazonElasticsearchParametersProperty.Builder =
        CfnDataSource.AmazonElasticsearchParametersProperty.builder()

    /** @param domain The OpenSearch domain. */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    public fun build(): CfnDataSource.AmazonElasticsearchParametersProperty = cdkBuilder.build()
}
