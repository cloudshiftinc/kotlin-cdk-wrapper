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
 * The `EC2TagSet` property type specifies information about groups of tags applied to Amazon EC2
 * instances.
 *
 * The deployment group includes only Amazon EC2 instances identified by all the tag groups. Cannot
 * be used in the same template as EC2TagFilters.
 *
 * For more information about using tags and tag groups to help manage your Amazon EC2 instances and
 * on-premises instances, see
 * [Tagging Instances for Deployment Groups in AWS CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-tagging.html)
 * in the *AWS CodeDeploy User Guide* .
 *
 * `EC2TagSet` is a property of the
 * [DeploymentGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
 * resource type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * EC2TagSetListObjectProperty eC2TagSetListObjectProperty = EC2TagSetListObjectProperty.builder()
 * .ec2TagGroup(List.of(EC2TagFilterProperty.builder()
 * .key("key")
 * .type("type")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagsetlistobject.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupEC2TagSetListObjectPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.EC2TagSetListObjectProperty.Builder =
        CfnDeploymentGroup.EC2TagSetListObjectProperty.builder()

    private val _ec2TagGroup: MutableList<Any> = mutableListOf()

    /**
     * @param ec2TagGroup A list that contains other lists of Amazon EC2 instance tag groups. For an
     *   instance to be included in the deployment group, it must be identified by all of the tag
     *   groups in the list.
     */
    public fun ec2TagGroup(vararg ec2TagGroup: Any) {
        _ec2TagGroup.addAll(listOf(*ec2TagGroup))
    }

    /**
     * @param ec2TagGroup A list that contains other lists of Amazon EC2 instance tag groups. For an
     *   instance to be included in the deployment group, it must be identified by all of the tag
     *   groups in the list.
     */
    public fun ec2TagGroup(ec2TagGroup: Collection<Any>) {
        _ec2TagGroup.addAll(ec2TagGroup)
    }

    /**
     * @param ec2TagGroup A list that contains other lists of Amazon EC2 instance tag groups. For an
     *   instance to be included in the deployment group, it must be identified by all of the tag
     *   groups in the list.
     */
    public fun ec2TagGroup(ec2TagGroup: IResolvable) {
        cdkBuilder.ec2TagGroup(ec2TagGroup)
    }

    public fun build(): CfnDeploymentGroup.EC2TagSetListObjectProperty {
        if (_ec2TagGroup.isNotEmpty()) cdkBuilder.ec2TagGroup(_ec2TagGroup)
        return cdkBuilder.build()
    }
}
