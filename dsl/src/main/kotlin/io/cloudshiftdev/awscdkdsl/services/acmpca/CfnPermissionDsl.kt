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

package io.cloudshiftdev.awscdkdsl.services.acmpca

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.acmpca.CfnPermission
import software.constructs.Construct

/**
 * Grants permissions to the AWS Certificate Manager ( ACM ) service principal ( `acm.amazonaws.com`
 * ) to perform
 * [IssueCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_IssueCertificate.html)
 * ,
 * [GetCertificate](https://docs.aws.amazon.com/privateca/latest/APIReference/API_GetCertificate.html)
 * , and
 * [ListPermissions](https://docs.aws.amazon.com/privateca/latest/APIReference/API_ListPermissions.html)
 * actions on a CA. These actions are needed for the ACM principal to renew private PKI certificates
 * requested through ACM and residing in the same AWS account as the CA.
 *
 * **About permissions** - If the private CA and the certificates it issues reside in the same
 * account, you can use `AWS::ACMPCA::Permission` to grant permissions for ACM to carry out
 * automatic certificate renewals.
 * * For automatic certificate renewal to succeed, the ACM service principal needs permissions to
 *   create, retrieve, and list permissions.
 * * If the private CA and the ACM certificates reside in different accounts, then permissions
 *   cannot be used to enable automatic renewals. Instead, the ACM certificate owner must set up a
 *   resource-based policy to enable cross-account issuance and renewals. For more information, see
 *   [Using a Resource Based Policy with AWS Private CA](https://docs.aws.amazon.com/privateca/latest/userguide/pca-rbp.html)
 *   .
 *
 * To update an `AWS::ACMPCA::Permission` resource, you must first delete the existing permission
 * resource from the CloudFormation stack and then create a new permission resource with updated
 * properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * CfnPermission cfnPermission = CfnPermission.Builder.create(this, "MyCfnPermission")
 * .actions(List.of("actions"))
 * .certificateAuthorityArn("certificateAuthorityArn")
 * .principal("principal")
 * // the properties below are optional
 * .sourceAccount("sourceAccount")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html)
 */
@CdkDslMarker
public class CfnPermissionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPermission.Builder = CfnPermission.Builder.create(scope, id)

    private val _actions: MutableList<String> = mutableListOf()

    /**
     * The private CA actions that can be performed by the designated AWS service.
     *
     * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-actions)
     *
     * @param actions The private CA actions that can be performed by the designated AWS service.
     */
    public fun actions(vararg actions: String) {
        _actions.addAll(listOf(*actions))
    }

    /**
     * The private CA actions that can be performed by the designated AWS service.
     *
     * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-actions)
     *
     * @param actions The private CA actions that can be performed by the designated AWS service.
     */
    public fun actions(actions: Collection<String>) {
        _actions.addAll(actions)
    }

    /**
     * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-certificateauthorityarn)
     *
     * @param certificateAuthorityArn The Amazon Resource Number (ARN) of the private CA from which
     *   the permission was issued.
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * The AWS service or entity that holds the permission.
     *
     * At this time, the only valid principal is `acm.amazonaws.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-principal)
     *
     * @param principal The AWS service or entity that holds the permission.
     */
    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    /**
     * The ID of the account that assigned the permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-sourceaccount)
     *
     * @param sourceAccount The ID of the account that assigned the permission.
     */
    public fun sourceAccount(sourceAccount: String) {
        cdkBuilder.sourceAccount(sourceAccount)
    }

    public fun build(): CfnPermission {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
