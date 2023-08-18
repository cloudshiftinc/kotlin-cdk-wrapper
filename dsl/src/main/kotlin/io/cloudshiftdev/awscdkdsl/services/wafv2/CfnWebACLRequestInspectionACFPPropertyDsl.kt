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

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Not currently supported by AWS CloudFormation .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * RequestInspectionACFPProperty requestInspectionACFPProperty =
 * RequestInspectionACFPProperty.builder()
 * .payloadType("payloadType")
 * // the properties below are optional
 * .addressFields(List.of(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build()))
 * .emailField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .passwordField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .phoneNumberFields(List.of(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build()))
 * .usernameField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html)
 */
@CdkDslMarker
public class CfnWebACLRequestInspectionACFPPropertyDsl {
    private val cdkBuilder: CfnWebACL.RequestInspectionACFPProperty.Builder =
        CfnWebACL.RequestInspectionACFPProperty.builder()

    private val _addressFields: MutableList<Any> = mutableListOf()

    private val _phoneNumberFields: MutableList<Any> = mutableListOf()

    /** @param addressFields Not currently supported by AWS CloudFormation . */
    public fun addressFields(vararg addressFields: Any) {
        _addressFields.addAll(listOf(*addressFields))
    }

    /** @param addressFields Not currently supported by AWS CloudFormation . */
    public fun addressFields(addressFields: Collection<Any>) {
        _addressFields.addAll(addressFields)
    }

    /** @param addressFields Not currently supported by AWS CloudFormation . */
    public fun addressFields(addressFields: IResolvable) {
        cdkBuilder.addressFields(addressFields)
    }

    /** @param emailField Not currently supported by AWS CloudFormation . */
    public fun emailField(emailField: IResolvable) {
        cdkBuilder.emailField(emailField)
    }

    /** @param emailField Not currently supported by AWS CloudFormation . */
    public fun emailField(emailField: CfnWebACL.FieldIdentifierProperty) {
        cdkBuilder.emailField(emailField)
    }

    /** @param passwordField Not currently supported by AWS CloudFormation . */
    public fun passwordField(passwordField: IResolvable) {
        cdkBuilder.passwordField(passwordField)
    }

    /** @param passwordField Not currently supported by AWS CloudFormation . */
    public fun passwordField(passwordField: CfnWebACL.FieldIdentifierProperty) {
        cdkBuilder.passwordField(passwordField)
    }

    /** @param payloadType Not currently supported by AWS CloudFormation . */
    public fun payloadType(payloadType: String) {
        cdkBuilder.payloadType(payloadType)
    }

    /** @param phoneNumberFields Not currently supported by AWS CloudFormation . */
    public fun phoneNumberFields(vararg phoneNumberFields: Any) {
        _phoneNumberFields.addAll(listOf(*phoneNumberFields))
    }

    /** @param phoneNumberFields Not currently supported by AWS CloudFormation . */
    public fun phoneNumberFields(phoneNumberFields: Collection<Any>) {
        _phoneNumberFields.addAll(phoneNumberFields)
    }

    /** @param phoneNumberFields Not currently supported by AWS CloudFormation . */
    public fun phoneNumberFields(phoneNumberFields: IResolvable) {
        cdkBuilder.phoneNumberFields(phoneNumberFields)
    }

    /** @param usernameField Not currently supported by AWS CloudFormation . */
    public fun usernameField(usernameField: IResolvable) {
        cdkBuilder.usernameField(usernameField)
    }

    /** @param usernameField Not currently supported by AWS CloudFormation . */
    public fun usernameField(usernameField: CfnWebACL.FieldIdentifierProperty) {
        cdkBuilder.usernameField(usernameField)
    }

    public fun build(): CfnWebACL.RequestInspectionACFPProperty {
        if (_addressFields.isNotEmpty()) cdkBuilder.addressFields(_addressFields)
        if (_phoneNumberFields.isNotEmpty()) cdkBuilder.phoneNumberFields(_phoneNumberFields)
        return cdkBuilder.build()
    }
}
