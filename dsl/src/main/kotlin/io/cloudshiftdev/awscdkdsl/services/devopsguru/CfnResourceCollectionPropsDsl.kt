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

package io.cloudshiftdev.awscdkdsl.services.devopsguru

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection
import software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps

/**
 * Properties for defining a `CfnResourceCollection`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devopsguru.*;
 * CfnResourceCollectionProps cfnResourceCollectionProps = CfnResourceCollectionProps.builder()
 * .resourceCollectionFilter(ResourceCollectionFilterProperty.builder()
 * .cloudFormation(CloudFormationCollectionFilterProperty.builder()
 * .stackNames(List.of("stackNames"))
 * .build())
 * .tags(List.of(TagCollectionProperty.builder()
 * .appBoundaryKey("appBoundaryKey")
 * .tagValues(List.of("tagValues"))
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html)
 */
@CdkDslMarker
public class CfnResourceCollectionPropsDsl {
    private val cdkBuilder: CfnResourceCollectionProps.Builder =
        CfnResourceCollectionProps.builder()

    /**
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     *   resources are analyzed for anomalous behavior by DevOps Guru.
     */
    public fun resourceCollectionFilter(resourceCollectionFilter: IResolvable) {
        cdkBuilder.resourceCollectionFilter(resourceCollectionFilter)
    }

    /**
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     *   resources are analyzed for anomalous behavior by DevOps Guru.
     */
    public fun resourceCollectionFilter(
        resourceCollectionFilter: CfnResourceCollection.ResourceCollectionFilterProperty
    ) {
        cdkBuilder.resourceCollectionFilter(resourceCollectionFilter)
    }

    public fun build(): CfnResourceCollectionProps = cdkBuilder.build()
}
