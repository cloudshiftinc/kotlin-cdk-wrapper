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

package cloudshift.awscdk.dsl.services.supportapp

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.supportapp.CfnAccountAlias
import software.constructs.Construct

/**
 * You can use the `AWS::SupportApp::AccountAlias` resource to specify your AWS account when you
 * configure the AWS Support App in Slack.
 *
 * Your alias name appears on the AWS Support App page in the Support Center Console and in messages
 * from the AWS Support App. You can use this alias to identify the account you've configured with
 * the AWS Support App .
 *
 * For more information, see
 * [AWS Support App in Slack](https://docs.aws.amazon.com/awssupport/latest/user/aws-support-app-for-slack.html)
 * in the *AWS Support User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.supportapp.*;
 * CfnAccountAlias cfnAccountAlias = CfnAccountAlias.Builder.create(this, "MyCfnAccountAlias")
 * .accountAlias("accountAlias")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-accountalias.html)
 */
@CdkDslMarker
public class CfnAccountAliasDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccountAlias.Builder = CfnAccountAlias.Builder.create(scope, id)

    /**
     * An alias or short name for an AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-accountalias.html#cfn-supportapp-accountalias-accountalias)
     *
     * @param accountAlias An alias or short name for an AWS account .
     */
    public fun accountAlias(accountAlias: String) {
        cdkBuilder.accountAlias(accountAlias)
    }

    public fun build(): CfnAccountAlias = cdkBuilder.build()
}
