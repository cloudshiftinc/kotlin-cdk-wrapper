@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection

/**
 * Information about AWS CloudFormation stacks.
 *
 * You can use up to 500 stacks to specify which AWS resources in your account to analyze. For more
 * information, see
 * [Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html) in the *AWS
 * CloudFormation User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devopsguru.*;
 * CloudFormationCollectionFilterProperty cloudFormationCollectionFilterProperty =
 * CloudFormationCollectionFilterProperty.builder()
 * .stackNames(List.of("stackNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-cloudformationcollectionfilter.html)
 */
@CdkDslMarker
public class CfnResourceCollectionCloudFormationCollectionFilterPropertyDsl {
  private val cdkBuilder: CfnResourceCollection.CloudFormationCollectionFilterProperty.Builder =
      CfnResourceCollection.CloudFormationCollectionFilterProperty.builder()

  private val _stackNames: MutableList<String> = mutableListOf()

  /**
   * @param stackNames An array of CloudFormation stack names.
   */
  public fun stackNames(vararg stackNames: String) {
    _stackNames.addAll(listOf(*stackNames))
  }

  /**
   * @param stackNames An array of CloudFormation stack names.
   */
  public fun stackNames(stackNames: Collection<String>) {
    _stackNames.addAll(stackNames)
  }

  public fun build(): CfnResourceCollection.CloudFormationCollectionFilterProperty {
    if(_stackNames.isNotEmpty()) cdkBuilder.stackNames(_stackNames)
    return cdkBuilder.build()
  }
}
