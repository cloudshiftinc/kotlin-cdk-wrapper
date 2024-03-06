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

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry

/**
 * Allow or deny permissions for an Active Directory group to enroll or autoenroll certificates for
 * a template.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * AccessRightsProperty accessRightsProperty = AccessRightsProperty.builder()
 * .autoEnroll("autoEnroll")
 * .enroll("enroll")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-templategroupaccesscontrolentry-accessrights.html)
 */
@CdkDslMarker
public class CfnTemplateGroupAccessControlEntryAccessRightsPropertyDsl {
    private val cdkBuilder: CfnTemplateGroupAccessControlEntry.AccessRightsProperty.Builder =
        CfnTemplateGroupAccessControlEntry.AccessRightsProperty.builder()

    /**
     * @param autoEnroll Allow or deny an Active Directory group from autoenrolling certificates
     *   issued against a template. The Active Directory group must be allowed to enroll to allow
     *   autoenrollment
     */
    public fun autoEnroll(autoEnroll: String) {
        cdkBuilder.autoEnroll(autoEnroll)
    }

    /**
     * @param enroll Allow or deny an Active Directory group from enrolling certificates issued
     *   against a template.
     */
    public fun enroll(enroll: String) {
        cdkBuilder.enroll(enroll)
    }

    public fun build(): CfnTemplateGroupAccessControlEntry.AccessRightsProperty = cdkBuilder.build()
}
