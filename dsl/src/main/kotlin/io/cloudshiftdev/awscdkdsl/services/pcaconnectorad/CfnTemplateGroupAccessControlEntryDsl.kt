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
import software.constructs.Construct

/**
 * Create a group access control entry.
 *
 * Allow or deny Active Directory groups from enrolling and/or autoenrolling with the template based
 * on the group security identifiers (SIDs).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * CfnTemplateGroupAccessControlEntry cfnTemplateGroupAccessControlEntry =
 * CfnTemplateGroupAccessControlEntry.Builder.create(this, "MyCfnTemplateGroupAccessControlEntry")
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
public class CfnTemplateGroupAccessControlEntryDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTemplateGroupAccessControlEntry.Builder =
        CfnTemplateGroupAccessControlEntry.Builder.create(scope, id)

    /**
     * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
     * issued against a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights)
     *
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     *   autoenroll certificates issued against a template.
     */
    public fun accessRights(accessRights: IResolvable) {
        cdkBuilder.accessRights(accessRights)
    }

    /**
     * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
     * issued against a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights)
     *
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     *   autoenroll certificates issued against a template.
     */
    public fun accessRights(accessRights: CfnTemplateGroupAccessControlEntry.AccessRightsProperty) {
        cdkBuilder.accessRights(accessRights)
    }

    /**
     * Name of the Active Directory group.
     *
     * This name does not need to match the group name in Active Directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-groupdisplayname)
     *
     * @param groupDisplayName Name of the Active Directory group.
     */
    public fun groupDisplayName(groupDisplayName: String) {
        cdkBuilder.groupDisplayName(groupDisplayName)
    }

    /**
     * Security identifier (SID) of the group object from Active Directory.
     *
     * The SID starts with "S-".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-groupsecurityidentifier)
     *
     * @param groupSecurityIdentifier Security identifier (SID) of the group object from Active
     *   Directory.
     */
    public fun groupSecurityIdentifier(groupSecurityIdentifier: String) {
        cdkBuilder.groupSecurityIdentifier(groupSecurityIdentifier)
    }

    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-templatearn)
     *
     * @param templateArn The Amazon Resource Name (ARN) that was returned when you called
     *   [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
     *   .
     */
    public fun templateArn(templateArn: String) {
        cdkBuilder.templateArn(templateArn)
    }

    public fun build(): CfnTemplateGroupAccessControlEntry = cdkBuilder.build()
}
