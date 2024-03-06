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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps

/**
 * Properties for defining a `CfnTemplateGroupAccessControlEntry`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * CfnTemplateGroupAccessControlEntryProps cfnTemplateGroupAccessControlEntryProps =
 * CfnTemplateGroupAccessControlEntryProps.builder()
 * .accessRights(AccessRightsProperty.builder()
 * .autoEnroll("autoEnroll")
 * .enroll("enroll")
 * .build())
 * .groupDisplayName("groupDisplayName")
 * // the properties below are optional
 * .groupSecurityIdentifier("groupSecurityIdentifier")
 * .templateArn("templateArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html)
 */
@CdkDslMarker
public class CfnTemplateGroupAccessControlEntryPropsDsl {
    private val cdkBuilder: CfnTemplateGroupAccessControlEntryProps.Builder =
        CfnTemplateGroupAccessControlEntryProps.builder()

    /**
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     *   autoenroll certificates issued against a template.
     */
    public fun accessRights(accessRights: IResolvable) {
        cdkBuilder.accessRights(accessRights)
    }

    /**
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     *   autoenroll certificates issued against a template.
     */
    public fun accessRights(accessRights: CfnTemplateGroupAccessControlEntry.AccessRightsProperty) {
        cdkBuilder.accessRights(accessRights)
    }

    /**
     * @param groupDisplayName Name of the Active Directory group. This name does not need to match
     *   the group name in Active Directory.
     */
    public fun groupDisplayName(groupDisplayName: String) {
        cdkBuilder.groupDisplayName(groupDisplayName)
    }

    /**
     * @param groupSecurityIdentifier Security identifier (SID) of the group object from Active
     *   Directory. The SID starts with "S-".
     */
    public fun groupSecurityIdentifier(groupSecurityIdentifier: String) {
        cdkBuilder.groupSecurityIdentifier(groupSecurityIdentifier)
    }

    /**
     * @param templateArn The Amazon Resource Name (ARN) that was returned when you called
     *   [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
     *   .
     */
    public fun templateArn(templateArn: String) {
        cdkBuilder.templateArn(templateArn)
    }

    public fun build(): CfnTemplateGroupAccessControlEntryProps = cdkBuilder.build()
}
