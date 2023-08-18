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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.cognito.StringAttributeProps

/**
 * Props for constructing a StringAttr.
 *
 * Example:
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * // ...
 * .standardAttributes(StandardAttributes.builder()
 * .fullname(StandardAttribute.builder()
 * .required(true)
 * .mutable(false)
 * .build())
 * .address(StandardAttribute.builder()
 * .required(false)
 * .mutable(true)
 * .build())
 * .build())
 * .customAttributes(Map.of(
 * "myappid", StringAttribute.Builder.create().minLen(5).maxLen(15).mutable(false).build(),
 * "callingcode", NumberAttribute.Builder.create().min(1).max(3).mutable(true).build(),
 * "isEmployee", BooleanAttribute.Builder.create().mutable(true).build(),
 * "joinedOn", new DateTimeAttribute()))
 * .build();
 * ```
 */
@CdkDslMarker
public class StringAttributePropsDsl {
    private val cdkBuilder: StringAttributeProps.Builder = StringAttributeProps.builder()

    /** @param maxLen Maximum length of this attribute. */
    public fun maxLen(maxLen: Number) {
        cdkBuilder.maxLen(maxLen)
    }

    /** @param minLen Minimum length of this attribute. */
    public fun minLen(minLen: Number) {
        cdkBuilder.minLen(minLen)
    }

    /**
     * @param mutable Specifies whether the value of the attribute can be changed. For any user pool
     *   attribute that's mapped to an identity provider attribute, you must set this parameter to
     *   true. Amazon Cognito updates mapped attributes when users sign in to your application
     *   through an identity provider. If an attribute is immutable, Amazon Cognito throws an error
     *   when it attempts to update the attribute.
     */
    public fun mutable(mutable: Boolean) {
        cdkBuilder.mutable(mutable)
    }

    public fun build(): StringAttributeProps = cdkBuilder.build()
}
