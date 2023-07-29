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

package cloudshift.awscdk.dsl.services.finspace

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.finspace.CfnEnvironment

/**
 * Configuration information for the superuser.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.finspace.*;
 * SuperuserParametersProperty superuserParametersProperty = SuperuserParametersProperty.builder()
 * .emailAddress("emailAddress")
 * .firstName("firstName")
 * .lastName("lastName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-superuserparameters.html)
 */
@CdkDslMarker
public class CfnEnvironmentSuperuserParametersPropertyDsl {
    private val cdkBuilder: CfnEnvironment.SuperuserParametersProperty.Builder =
        CfnEnvironment.SuperuserParametersProperty.builder()

    /** @param emailAddress The email address of the superuser. */
    public fun emailAddress(emailAddress: String) {
        cdkBuilder.emailAddress(emailAddress)
    }

    /** @param firstName The first name of the superuser. */
    public fun firstName(firstName: String) {
        cdkBuilder.firstName(firstName)
    }

    /** @param lastName The last name of the superuser. */
    public fun lastName(lastName: String) {
        cdkBuilder.lastName(lastName)
    }

    public fun build(): CfnEnvironment.SuperuserParametersProperty = cdkBuilder.build()
}
