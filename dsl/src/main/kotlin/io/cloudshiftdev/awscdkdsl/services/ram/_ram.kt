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

package io.cloudshiftdev.awscdkdsl.services.ram

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ram.CfnPermission
import software.amazon.awscdk.services.ram.CfnPermissionProps
import software.amazon.awscdk.services.ram.CfnResourceShare
import software.amazon.awscdk.services.ram.CfnResourceShareProps
import software.constructs.Construct

public object ram {
    /**
     * Creates a customer managed permission for a specified resource type that you can attach to
     * resource shares.
     *
     * It is created in the AWS Region in which you call the operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ram.*;
     * Object policyTemplate;
     * CfnPermission cfnPermission = CfnPermission.Builder.create(this, "MyCfnPermission")
     * .name("name")
     * .policyTemplate(policyTemplate)
     * .resourceType("resourceType")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html)
     */
    public inline fun cfnPermission(
        scope: Construct,
        id: String,
        block: CfnPermissionDsl.() -> Unit = {},
    ): CfnPermission {
        val builder = CfnPermissionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPermission`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ram.*;
     * Object policyTemplate;
     * CfnPermissionProps cfnPermissionProps = CfnPermissionProps.builder()
     * .name("name")
     * .policyTemplate(policyTemplate)
     * .resourceType("resourceType")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html)
     */
    public inline fun cfnPermissionProps(
        block: CfnPermissionPropsDsl.() -> Unit = {}
    ): CfnPermissionProps {
        val builder = CfnPermissionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a resource share.
     *
     * You can provide a list of the Amazon Resource Names (ARNs) for the resources that you want to
     * share, a list of principals you want to share the resources with, and the permissions to
     * grant those principals.
     *
     * Sharing a resource makes it available for use by principals outside of the AWS account that
     * created the resource. Sharing doesn't change any permissions or quotas that apply to the
     * resource in the account that created it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ram.*;
     * CfnResourceShare cfnResourceShare = CfnResourceShare.Builder.create(this, "MyCfnResourceShare")
     * .name("name")
     * // the properties below are optional
     * .allowExternalPrincipals(false)
     * .permissionArns(List.of("permissionArns"))
     * .principals(List.of("principals"))
     * .resourceArns(List.of("resourceArns"))
     * .sources(List.of("sources"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html)
     */
    public inline fun cfnResourceShare(
        scope: Construct,
        id: String,
        block: CfnResourceShareDsl.() -> Unit = {},
    ): CfnResourceShare {
        val builder = CfnResourceShareDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourceShare`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ram.*;
     * CfnResourceShareProps cfnResourceShareProps = CfnResourceShareProps.builder()
     * .name("name")
     * // the properties below are optional
     * .allowExternalPrincipals(false)
     * .permissionArns(List.of("permissionArns"))
     * .principals(List.of("principals"))
     * .resourceArns(List.of("resourceArns"))
     * .sources(List.of("sources"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-resourceshare.html)
     */
    public inline fun cfnResourceShareProps(
        block: CfnResourceSharePropsDsl.() -> Unit = {}
    ): CfnResourceShareProps {
        val builder = CfnResourceSharePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
