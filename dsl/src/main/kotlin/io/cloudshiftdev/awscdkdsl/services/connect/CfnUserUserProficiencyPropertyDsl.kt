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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.connect.CfnUser

/**
 * A predefined attribute must be created before using `UserProficiencies` in the Cloudformation
 * *User* template.
 *
 * For more information, see
 * [Predefined attributes](https://docs.aws.amazon.com/connect/latest/adminguide/predefined-attributes.html)
 * .
 *
 * Proficiency of a user.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * UserProficiencyProperty userProficiencyProperty = UserProficiencyProperty.builder()
 * .attributeName("attributeName")
 * .attributeValue("attributeValue")
 * .level(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userproficiency.html)
 */
@CdkDslMarker
public class CfnUserUserProficiencyPropertyDsl {
    private val cdkBuilder: CfnUser.UserProficiencyProperty.Builder =
        CfnUser.UserProficiencyProperty.builder()

    /**
     * @param attributeName The name of user’s proficiency. You must use a predefined attribute name
     *   that is present in the Amazon Connect instance.
     */
    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    /**
     * @param attributeValue The value of user’s proficiency. You must use a predefined attribute
     *   value that is present in the Amazon Connect instance.
     */
    public fun attributeValue(attributeValue: String) {
        cdkBuilder.attributeValue(attributeValue)
    }

    /** @param level The level of the proficiency. The valid values are 1, 2, 3, 4 and 5. */
    public fun level(level: Number) {
        cdkBuilder.level(level)
    }

    public fun build(): CfnUser.UserProficiencyProperty = cdkBuilder.build()
}
