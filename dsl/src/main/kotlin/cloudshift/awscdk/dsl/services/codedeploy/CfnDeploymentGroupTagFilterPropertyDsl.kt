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
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * `TagFilter` is a property type of the
 * [AWS::CodeDeploy::DeploymentGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
 * resource that specifies which on-premises instances to associate with the deployment group. To
 * register on-premise instances with AWS CodeDeploy , see
 * [Configure Existing On-Premises Instances by Using AWS CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
 * in the *AWS CodeDeploy User Guide* .
 *
 * For more information about using tags and tag groups to help manage your Amazon EC2 instances and
 * on-premises instances, see
 * [Tagging Instances for Deployment Groups in AWS CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-tagging.html)
 * in the *AWS CodeDeploy User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * TagFilterProperty tagFilterProperty = TagFilterProperty.builder()
 * .key("key")
 * .type("type")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-tagfilter.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupTagFilterPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.TagFilterProperty.Builder =
        CfnDeploymentGroup.TagFilterProperty.builder()

    /** @param key The on-premises instance tag filter key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param type The on-premises instance tag filter type:.
     * * KEY_ONLY: Key only.
     * * VALUE_ONLY: Value only.
     * * KEY_AND_VALUE: Key and value.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param value The on-premises instance tag filter value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDeploymentGroup.TagFilterProperty = cdkBuilder.build()
}
