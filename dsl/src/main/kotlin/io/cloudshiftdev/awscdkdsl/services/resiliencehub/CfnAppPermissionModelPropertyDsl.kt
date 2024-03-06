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

package io.cloudshiftdev.awscdkdsl.services.resiliencehub

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.resiliencehub.CfnApp

/**
 * Defines the roles and credentials that AWS Resilience Hub would use while creating the
 * application, importing its resources, and running an assessment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resiliencehub.*;
 * PermissionModelProperty permissionModelProperty = PermissionModelProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .crossAccountRoleArns(List.of("crossAccountRoleArns"))
 * .invokerRoleName("invokerRoleName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-permissionmodel.html)
 */
@CdkDslMarker
public class CfnAppPermissionModelPropertyDsl {
    private val cdkBuilder: CfnApp.PermissionModelProperty.Builder =
        CfnApp.PermissionModelProperty.builder()

    private val _crossAccountRoleArns: MutableList<String> = mutableListOf()

    /**
     * @param crossAccountRoleArns Defines a list of role Amazon Resource Names (ARNs) to be used in
     *   other accounts. These ARNs are used for querying purposes while importing resources and
     *   assessing your application.
     * * These ARNs are required only when your resources are in other accounts and you have
     *   different role name in these accounts. Else, the invoker role name will be used in the
     *   other accounts.
     * * These roles must have a trust policy with `iam:AssumeRole` permission to the invoker role
     *   in the primary account.
     */
    public fun crossAccountRoleArns(vararg crossAccountRoleArns: String) {
        _crossAccountRoleArns.addAll(listOf(*crossAccountRoleArns))
    }

    /**
     * @param crossAccountRoleArns Defines a list of role Amazon Resource Names (ARNs) to be used in
     *   other accounts. These ARNs are used for querying purposes while importing resources and
     *   assessing your application.
     * * These ARNs are required only when your resources are in other accounts and you have
     *   different role name in these accounts. Else, the invoker role name will be used in the
     *   other accounts.
     * * These roles must have a trust policy with `iam:AssumeRole` permission to the invoker role
     *   in the primary account.
     */
    public fun crossAccountRoleArns(crossAccountRoleArns: Collection<String>) {
        _crossAccountRoleArns.addAll(crossAccountRoleArns)
    }

    /**
     * @param invokerRoleName Existing AWS IAM role name in the primary AWS account that will be
     *   assumed by AWS Resilience Hub Service Principle to obtain a read-only access to your
     *   application resources while running an assessment.
     * * You must have `iam:passRole` permission for this role while creating or updating the
     *   application.
     * * Currently, `invokerRoleName` accepts only `[A-Za-z0-9_+=,.&#64;-]` characters.
     */
    public fun invokerRoleName(invokerRoleName: String) {
        cdkBuilder.invokerRoleName(invokerRoleName)
    }

    /**
     * @param type Defines how AWS Resilience Hub scans your resources. It can scan for the
     *   resources by using a pre-existing role in your AWS account, or by using the credentials of
     *   the current IAM user.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnApp.PermissionModelProperty {
        if (_crossAccountRoleArns.isNotEmpty())
            cdkBuilder.crossAccountRoleArns(_crossAccountRoleArns)
        return cdkBuilder.build()
    }
}
