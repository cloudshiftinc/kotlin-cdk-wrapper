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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * Specifies information about the master user.
 *
 * Required if if `InternalUserDatabaseEnabled` is true in
 * [AdvancedSecurityOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * MasterUserOptionsProperty masterUserOptionsProperty = MasterUserOptionsProperty.builder()
 * .masterUserArn("masterUserArn")
 * .masterUserName("masterUserName")
 * .masterUserPassword("masterUserPassword")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-masteruseroptions.html)
 */
@CdkDslMarker
public class CfnDomainMasterUserOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.MasterUserOptionsProperty.Builder =
        CfnDomain.MasterUserOptionsProperty.builder()

    /**
     * @param masterUserArn Amazon Resource Name (ARN) for the master user. The ARN can point to an
     *   IAM user or role. This property is required for Amazon Cognito to work, and it must match
     *   the role configured for Cognito. Only specify if `InternalUserDatabaseEnabled` is false in
     *   [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
     *   .
     */
    public fun masterUserArn(masterUserArn: String) {
        cdkBuilder.masterUserArn(masterUserArn)
    }

    /**
     * @param masterUserName Username for the master user. Only specify if
     *   `InternalUserDatabaseEnabled` is true in
     *   [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
     *   . If you don't want to specify this value directly within the template, you can use a
     *   [dynamic reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html)
     *   instead.
     */
    public fun masterUserName(masterUserName: String) {
        cdkBuilder.masterUserName(masterUserName)
    }

    /**
     * @param masterUserPassword Password for the master user. Only specify if
     *   `InternalUserDatabaseEnabled` is true in
     *   [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
     *   . If you don't want to specify this value directly within the template, you can use a
     *   [dynamic reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html)
     *   instead.
     */
    public fun masterUserPassword(masterUserPassword: String) {
        cdkBuilder.masterUserPassword(masterUserPassword)
    }

    public fun build(): CfnDomain.MasterUserOptionsProperty = cdkBuilder.build()
}
