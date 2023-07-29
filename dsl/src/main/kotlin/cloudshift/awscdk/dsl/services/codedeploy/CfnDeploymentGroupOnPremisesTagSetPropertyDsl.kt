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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * The `OnPremisesTagSet` property type specifies a list containing other lists of on-premises
 * instance tag groups.
 *
 * In order for an instance to be included in the deployment group, it must be identified by all the
 * tag groups in the list.
 *
 * For more information about using tags and tag groups to help manage your Amazon EC2 instances and
 * on-premises instances, see
 * [Tagging Instances for Deployment Groups in AWS CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-tagging.html)
 * in the *AWS CodeDeploy User Guide* .
 *
 * `OnPremisesTagSet` is a property of the
 * [DeploymentGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * OnPremisesTagSetProperty onPremisesTagSetProperty = OnPremisesTagSetProperty.builder()
 * .onPremisesTagSetList(List.of(OnPremisesTagSetListObjectProperty.builder()
 * .onPremisesTagGroup(List.of(TagFilterProperty.builder()
 * .key("key")
 * .type("type")
 * .value("value")
 * .build()))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupOnPremisesTagSetPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.OnPremisesTagSetProperty.Builder =
        CfnDeploymentGroup.OnPremisesTagSetProperty.builder()

    private val _onPremisesTagSetList: MutableList<Any> = mutableListOf()

    /**
     * @param onPremisesTagSetList A list that contains other lists of on-premises instance tag
     *   groups. For an instance to be included in the deployment group, it must be identified by
     *   all of the tag groups in the list.
     *
     * Duplicates are not allowed.
     */
    public fun onPremisesTagSetList(vararg onPremisesTagSetList: Any) {
        _onPremisesTagSetList.addAll(listOf(*onPremisesTagSetList))
    }

    /**
     * @param onPremisesTagSetList A list that contains other lists of on-premises instance tag
     *   groups. For an instance to be included in the deployment group, it must be identified by
     *   all of the tag groups in the list.
     *
     * Duplicates are not allowed.
     */
    public fun onPremisesTagSetList(onPremisesTagSetList: Collection<Any>) {
        _onPremisesTagSetList.addAll(onPremisesTagSetList)
    }

    /**
     * @param onPremisesTagSetList A list that contains other lists of on-premises instance tag
     *   groups. For an instance to be included in the deployment group, it must be identified by
     *   all of the tag groups in the list.
     *
     * Duplicates are not allowed.
     */
    public fun onPremisesTagSetList(onPremisesTagSetList: IResolvable) {
        cdkBuilder.onPremisesTagSetList(onPremisesTagSetList)
    }

    public fun build(): CfnDeploymentGroup.OnPremisesTagSetProperty {
        if (_onPremisesTagSetList.isNotEmpty())
            cdkBuilder.onPremisesTagSetList(_onPremisesTagSetList)
        return cdkBuilder.build()
    }
}
