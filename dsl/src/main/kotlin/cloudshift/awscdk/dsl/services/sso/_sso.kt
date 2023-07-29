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

package cloudshift.awscdk.dsl.services.sso

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnAssignment
import software.amazon.awscdk.services.sso.CfnAssignmentProps
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps
import software.amazon.awscdk.services.sso.CfnPermissionSet
import software.amazon.awscdk.services.sso.CfnPermissionSetProps
import software.constructs.Construct

public object sso {
    /**
     * Assigns access to a Principal for a specified AWS account using a specified permission set.
     *
     * The term *principal* here refers to a user or group that is defined in IAM Identity Center .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sso.*;
     * CfnAssignment cfnAssignment = CfnAssignment.Builder.create(this, "MyCfnAssignment")
     * .instanceArn("instanceArn")
     * .permissionSetArn("permissionSetArn")
     * .principalId("principalId")
     * .principalType("principalType")
     * .targetId("targetId")
     * .targetType("targetType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html)
     */
    public inline fun cfnAssignment(
        scope: Construct,
        id: String,
        block: CfnAssignmentDsl.() -> Unit = {},
    ): CfnAssignment {
        val builder = CfnAssignmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAssignment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sso.*;
     * CfnAssignmentProps cfnAssignmentProps = CfnAssignmentProps.builder()
     * .instanceArn("instanceArn")
     * .permissionSetArn("permissionSetArn")
     * .principalId("principalId")
     * .principalType("principalType")
     * .targetId("targetId")
     * .targetType("targetType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html)
     */
    public inline fun cfnAssignmentProps(
        block: CfnAssignmentPropsDsl.() -> Unit = {}
    ): CfnAssignmentProps {
        val builder = CfnAssignmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Enables the attribute-based access control (ABAC) feature for the specified IAM Identity
     * Center instance.
     *
     * You can also specify new attributes to add to your ABAC configuration during the enabling
     * process. For more information about ABAC, see
     * [Attribute-Based Access Control](https://docs.aws.amazon.com//singlesignon/latest/userguide/abac.html)
     * in the *IAM Identity Center User Guide* .
     *
     * The `InstanceAccessControlAttributeConfiguration` property has been deprecated but is still
     * supported for backwards compatibility purposes. We recommend that you use the
     * `AccessControlAttributes` property instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sso.*;
     * CfnInstanceAccessControlAttributeConfiguration cfnInstanceAccessControlAttributeConfiguration =
     * CfnInstanceAccessControlAttributeConfiguration.Builder.create(this,
     * "MyCfnInstanceAccessControlAttributeConfiguration")
     * .instanceArn("instanceArn")
     * // the properties below are optional
     * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
     * .key("key")
     * .value(AccessControlAttributeValueProperty.builder()
     * .source(List.of("source"))
     * .build())
     * .build()))
     * .instanceAccessControlAttributeConfiguration(InstanceAccessControlAttributeConfigurationProperty.builder()
     * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
     * .key("key")
     * .value(AccessControlAttributeValueProperty.builder()
     * .source(List.of("source"))
     * .build())
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html)
     */
    public inline fun cfnInstanceAccessControlAttributeConfiguration(
        scope: Construct,
        id: String,
        block: CfnInstanceAccessControlAttributeConfigurationDsl.() -> Unit = {},
    ): CfnInstanceAccessControlAttributeConfiguration {
        val builder = CfnInstanceAccessControlAttributeConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * These are IAM Identity Center identity store attributes that you can configure for use in
     * attributes-based access control (ABAC).
     *
     * You can create permissions policies that determine who can access your AWS resources based
     * upon the configured attribute values. When you enable ABAC and specify
     * `AccessControlAttributes` , IAM Identity Center passes the attribute values of the
     * authenticated user into IAM for use in policy evaluation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sso.*;
     * AccessControlAttributeProperty accessControlAttributeProperty =
     * AccessControlAttributeProperty.builder()
     * .key("key")
     * .value(AccessControlAttributeValueProperty.builder()
     * .source(List.of("source"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattribute.html)
     */
    public inline fun cfnInstanceAccessControlAttributeConfigurationAccessControlAttributeProperty(
        block:
            CfnInstanceAccessControlAttributeConfigurationAccessControlAttributePropertyDsl.(
            ) -> Unit =
            {}
    ): CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty {
        val builder =
            CfnInstanceAccessControlAttributeConfigurationAccessControlAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The value used for mapping a specified attribute to an identity source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sso.*;
     * AccessControlAttributeValueProperty accessControlAttributeValueProperty =
     * AccessControlAttributeValueProperty.builder()
     * .source(List.of("source"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributevalue.html)
     */
    public inline fun cfnInstanceAccessControlAttributeConfigurationAccessControlAttributeValueProperty(
        block:
            CfnInstanceAccessControlAttributeConfigurationAccessControlAttributeValuePropertyDsl.(
            ) -> Unit =
            {}
    ): CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty {
        val builder =
            CfnInstanceAccessControlAttributeConfigurationAccessControlAttributeValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The InstanceAccessControlAttributeConfiguration property has been deprecated but is still
     * supported for backwards compatibility purposes.
     *
     * We recomend that you use AccessControlAttributes property instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sso.*;
     * InstanceAccessControlAttributeConfigurationProperty
     * instanceAccessControlAttributeConfigurationProperty =
     * InstanceAccessControlAttributeConfigurationProperty.builder()
     * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
     * .key("key")
     * .value(AccessControlAttributeValueProperty.builder()
     * .source(List.of("source"))
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration.html)
     */
    public inline fun cfnInstanceAccessControlAttributeConfigurationInstanceAccessControlAttributeConfigurationProperty(
        block:
            CfnInstanceAccessControlAttributeConfigurationInstanceAccessControlAttributeConfigurationPropertyDsl.(
            ) -> Unit =
            {}
    ): CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty {
        val builder =
            CfnInstanceAccessControlAttributeConfigurationInstanceAccessControlAttributeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInstanceAccessControlAttributeConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sso.*;
     * CfnInstanceAccessControlAttributeConfigurationProps
     * cfnInstanceAccessControlAttributeConfigurationProps =
     * CfnInstanceAccessControlAttributeConfigurationProps.builder()
     * .instanceArn("instanceArn")
     * // the properties below are optional
     * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
     * .key("key")
     * .value(AccessControlAttributeValueProperty.builder()
     * .source(List.of("source"))
     * .build())
     * .build()))
     * .instanceAccessControlAttributeConfiguration(InstanceAccessControlAttributeConfigurationProperty.builder()
     * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
     * .key("key")
     * .value(AccessControlAttributeValueProperty.builder()
     * .source(List.of("source"))
     * .build())
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html)
     */
    public inline fun cfnInstanceAccessControlAttributeConfigurationProps(
        block: CfnInstanceAccessControlAttributeConfigurationPropsDsl.() -> Unit = {}
    ): CfnInstanceAccessControlAttributeConfigurationProps {
        val builder = CfnInstanceAccessControlAttributeConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a permission set within a specified IAM Identity Center instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sso.*;
     * Object inlinePolicy;
     * CfnPermissionSet cfnPermissionSet = CfnPermissionSet.Builder.create(this, "MyCfnPermissionSet")
     * .instanceArn("instanceArn")
     * .name("name")
     * // the properties below are optional
     * .customerManagedPolicyReferences(List.of(CustomerManagedPolicyReferenceProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .path("path")
     * .build()))
     * .description("description")
     * .inlinePolicy(inlinePolicy)
     * .managedPolicies(List.of("managedPolicies"))
     * .permissionsBoundary(PermissionsBoundaryProperty.builder()
     * .customerManagedPolicyReference(CustomerManagedPolicyReferenceProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .path("path")
     * .build())
     * .managedPolicyArn("managedPolicyArn")
     * .build())
     * .relayStateType("relayStateType")
     * .sessionDuration("sessionDuration")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html)
     */
    public inline fun cfnPermissionSet(
        scope: Construct,
        id: String,
        block: CfnPermissionSetDsl.() -> Unit = {},
    ): CfnPermissionSet {
        val builder = CfnPermissionSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the name and path of a customer managed policy.
     *
     * You must have an IAM policy that matches the name and path in each AWS account where you want
     * to deploy your permission set.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sso.*;
     * CustomerManagedPolicyReferenceProperty customerManagedPolicyReferenceProperty =
     * CustomerManagedPolicyReferenceProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .path("path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-customermanagedpolicyreference.html)
     */
    public inline fun cfnPermissionSetCustomerManagedPolicyReferenceProperty(
        block: CfnPermissionSetCustomerManagedPolicyReferencePropertyDsl.() -> Unit = {}
    ): CfnPermissionSet.CustomerManagedPolicyReferenceProperty {
        val builder = CfnPermissionSetCustomerManagedPolicyReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of the AWS managed or customer managed policy that you want to
     * set as a permissions boundary.
     *
     * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer
     * managed policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions
     * boundary represents the maximum permissions that any policy can grant your role. For more
     * information, see
     * [Permissions boundaries for IAM entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html)
     * in the *IAM User Guide* .
     *
     * Policies used as permissions boundaries don't provide permissions. You must also attach an
     * IAM policy to the role. To learn how the effective permissions for a role are evaluated, see
     * [IAM JSON policy evaluation logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
     * in the *IAM User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sso.*;
     * PermissionsBoundaryProperty permissionsBoundaryProperty = PermissionsBoundaryProperty.builder()
     * .customerManagedPolicyReference(CustomerManagedPolicyReferenceProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .path("path")
     * .build())
     * .managedPolicyArn("managedPolicyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-permissionsboundary.html)
     */
    public inline fun cfnPermissionSetPermissionsBoundaryProperty(
        block: CfnPermissionSetPermissionsBoundaryPropertyDsl.() -> Unit = {}
    ): CfnPermissionSet.PermissionsBoundaryProperty {
        val builder = CfnPermissionSetPermissionsBoundaryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPermissionSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sso.*;
     * Object inlinePolicy;
     * CfnPermissionSetProps cfnPermissionSetProps = CfnPermissionSetProps.builder()
     * .instanceArn("instanceArn")
     * .name("name")
     * // the properties below are optional
     * .customerManagedPolicyReferences(List.of(CustomerManagedPolicyReferenceProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .path("path")
     * .build()))
     * .description("description")
     * .inlinePolicy(inlinePolicy)
     * .managedPolicies(List.of("managedPolicies"))
     * .permissionsBoundary(PermissionsBoundaryProperty.builder()
     * .customerManagedPolicyReference(CustomerManagedPolicyReferenceProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .path("path")
     * .build())
     * .managedPolicyArn("managedPolicyArn")
     * .build())
     * .relayStateType("relayStateType")
     * .sessionDuration("sessionDuration")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html)
     */
    public inline fun cfnPermissionSetProps(
        block: CfnPermissionSetPropsDsl.() -> Unit = {}
    ): CfnPermissionSetProps {
        val builder = CfnPermissionSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
