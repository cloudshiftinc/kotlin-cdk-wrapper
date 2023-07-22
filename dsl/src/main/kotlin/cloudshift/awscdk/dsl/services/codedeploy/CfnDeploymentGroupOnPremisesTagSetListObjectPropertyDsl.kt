@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * The `OnPremisesTagSetListObject` property type specifies lists of on-premises instance tag
 * groups.
 *
 * In order for an instance to be included in the deployment group, it must be identified by all the
 * tag groups in the list.
 *
 * `OnPremisesTagSetListObject` is a property of the [CodeDeploy DeploymentGroup
 * OnPremisesTagSet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * OnPremisesTagSetListObjectProperty onPremisesTagSetListObjectProperty =
 * OnPremisesTagSetListObjectProperty.builder()
 * .onPremisesTagGroup(List.of(TagFilterProperty.builder()
 * .key("key")
 * .type("type")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupOnPremisesTagSetListObjectPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.OnPremisesTagSetListObjectProperty.Builder =
      CfnDeploymentGroup.OnPremisesTagSetListObjectProperty.builder()

  private val _onPremisesTagGroup: MutableList<Any> = mutableListOf()

  /**
   * @param onPremisesTagGroup Information about groups of on-premises instance tags.
   */
  public fun onPremisesTagGroup(vararg onPremisesTagGroup: Any) {
    _onPremisesTagGroup.addAll(listOf(*onPremisesTagGroup))
  }

  /**
   * @param onPremisesTagGroup Information about groups of on-premises instance tags.
   */
  public fun onPremisesTagGroup(onPremisesTagGroup: Collection<Any>) {
    _onPremisesTagGroup.addAll(onPremisesTagGroup)
  }

  /**
   * @param onPremisesTagGroup Information about groups of on-premises instance tags.
   */
  public fun onPremisesTagGroup(onPremisesTagGroup: IResolvable) {
    cdkBuilder.onPremisesTagGroup(onPremisesTagGroup)
  }

  public fun build(): CfnDeploymentGroup.OnPremisesTagSetListObjectProperty {
    if(_onPremisesTagGroup.isNotEmpty()) cdkBuilder.onPremisesTagGroup(_onPremisesTagGroup)
    return cdkBuilder.build()
  }
}
