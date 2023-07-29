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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * Use this setting to define which verified available method a user can use to recover their
 * password when they call `ForgotPassword` .
 *
 * It allows you to define a preferred method when a user has more than one method available. With
 * this setting, SMS does not qualify for a valid password recovery mechanism if the user also has
 * SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to determine
 * the recovery method where SMS is preferred over email.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * AccountRecoverySettingProperty accountRecoverySettingProperty =
 * AccountRecoverySettingProperty.builder()
 * .recoveryMechanisms(List.of(RecoveryOptionProperty.builder()
 * .name("name")
 * .priority(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-accountrecoverysetting.html)
 */
@CdkDslMarker
public class CfnUserPoolAccountRecoverySettingPropertyDsl {
    private val cdkBuilder: CfnUserPool.AccountRecoverySettingProperty.Builder =
        CfnUserPool.AccountRecoverySettingProperty.builder()

    private val _recoveryMechanisms: MutableList<Any> = mutableListOf()

    /** @param recoveryMechanisms The list of `RecoveryOptionTypes` . */
    public fun recoveryMechanisms(vararg recoveryMechanisms: Any) {
        _recoveryMechanisms.addAll(listOf(*recoveryMechanisms))
    }

    /** @param recoveryMechanisms The list of `RecoveryOptionTypes` . */
    public fun recoveryMechanisms(recoveryMechanisms: Collection<Any>) {
        _recoveryMechanisms.addAll(recoveryMechanisms)
    }

    /** @param recoveryMechanisms The list of `RecoveryOptionTypes` . */
    public fun recoveryMechanisms(recoveryMechanisms: IResolvable) {
        cdkBuilder.recoveryMechanisms(recoveryMechanisms)
    }

    public fun build(): CfnUserPool.AccountRecoverySettingProperty {
        if (_recoveryMechanisms.isNotEmpty()) cdkBuilder.recoveryMechanisms(_recoveryMechanisms)
        return cdkBuilder.build()
    }
}
