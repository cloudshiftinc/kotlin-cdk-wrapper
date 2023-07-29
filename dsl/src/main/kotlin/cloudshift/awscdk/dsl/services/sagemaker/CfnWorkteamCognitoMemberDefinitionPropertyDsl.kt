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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnWorkteam

/**
 * Identifies a Amazon Cognito user group.
 *
 * A user group can be used in on or more work teams.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CognitoMemberDefinitionProperty cognitoMemberDefinitionProperty =
 * CognitoMemberDefinitionProperty.builder()
 * .cognitoClientId("cognitoClientId")
 * .cognitoUserGroup("cognitoUserGroup")
 * .cognitoUserPool("cognitoUserPool")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html)
 */
@CdkDslMarker
public class CfnWorkteamCognitoMemberDefinitionPropertyDsl {
    private val cdkBuilder: CfnWorkteam.CognitoMemberDefinitionProperty.Builder =
        CfnWorkteam.CognitoMemberDefinitionProperty.builder()

    /**
     * @param cognitoClientId An identifier for an application client. You must create the app
     *   client ID using Amazon Cognito.
     */
    public fun cognitoClientId(cognitoClientId: String) {
        cdkBuilder.cognitoClientId(cognitoClientId)
    }

    /** @param cognitoUserGroup An identifier for a user group. */
    public fun cognitoUserGroup(cognitoUserGroup: String) {
        cdkBuilder.cognitoUserGroup(cognitoUserGroup)
    }

    /**
     * @param cognitoUserPool An identifier for a user pool. The user pool must be in the same
     *   region as the service that you are calling.
     */
    public fun cognitoUserPool(cognitoUserPool: String) {
        cdkBuilder.cognitoUserPool(cognitoUserPool)
    }

    public fun build(): CfnWorkteam.CognitoMemberDefinitionProperty = cdkBuilder.build()
}
