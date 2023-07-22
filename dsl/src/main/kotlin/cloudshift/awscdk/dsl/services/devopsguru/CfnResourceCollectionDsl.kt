@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection
import software.constructs.Construct

/**
 * A collection of AWS resources supported by DevOps Guru.
 *
 * The one type of AWS resource collection supported is AWS CloudFormation stacks. DevOps Guru can
 * be configured to analyze only the AWS resources that are defined in the stacks.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devopsguru.*;
 * CfnResourceCollection cfnResourceCollection = CfnResourceCollection.Builder.create(this,
 * "MyCfnResourceCollection")
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
public class CfnResourceCollectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourceCollection.Builder =
      CfnResourceCollection.Builder.create(scope, id)

  /**
   * Information about a filter used to specify which AWS resources are analyzed for anomalous
   * behavior by DevOps Guru.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter)
   * @param resourceCollectionFilter Information about a filter used to specify which AWS resources
   * are analyzed for anomalous behavior by DevOps Guru. 
   */
  public fun resourceCollectionFilter(resourceCollectionFilter: IResolvable) {
    cdkBuilder.resourceCollectionFilter(resourceCollectionFilter)
  }

  /**
   * Information about a filter used to specify which AWS resources are analyzed for anomalous
   * behavior by DevOps Guru.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter)
   * @param resourceCollectionFilter Information about a filter used to specify which AWS resources
   * are analyzed for anomalous behavior by DevOps Guru. 
   */
  public
      fun resourceCollectionFilter(resourceCollectionFilter: CfnResourceCollection.ResourceCollectionFilterProperty) {
    cdkBuilder.resourceCollectionFilter(resourceCollectionFilter)
  }

  public fun build(): CfnResourceCollection = cdkBuilder.build()
}
