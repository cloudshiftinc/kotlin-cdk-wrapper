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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * Information to include in the subject name and alternate subject name of the certificate.
 *
 * The subject name can be common name, directory path, DNS as common name, or left blank. You can
 * optionally include email to the subject name for user templates. If you leave the subject name
 * blank then you must set a subject alternate name. The subject alternate name (SAN) can include
 * globally unique identifier (GUID), DNS, domain DNS, email, service principal name (SPN), and user
 * principal name (UPN). You can leave the SAN blank. If you leave the SAN blank, then you must set
 * a subject name.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * SubjectNameFlagsV4Property subjectNameFlagsV4Property = SubjectNameFlagsV4Property.builder()
 * .requireCommonName(false)
 * .requireDirectoryPath(false)
 * .requireDnsAsCn(false)
 * .requireEmail(false)
 * .sanRequireDirectoryGuid(false)
 * .sanRequireDns(false)
 * .sanRequireDomainDns(false)
 * .sanRequireEmail(false)
 * .sanRequireSpn(false)
 * .sanRequireUpn(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html)
 */
@CdkDslMarker
public class CfnTemplateSubjectNameFlagsV4PropertyDsl {
    private val cdkBuilder: CfnTemplate.SubjectNameFlagsV4Property.Builder =
        CfnTemplate.SubjectNameFlagsV4Property.builder()

    /** @param requireCommonName Include the common name in the subject name. */
    public fun requireCommonName(requireCommonName: Boolean) {
        cdkBuilder.requireCommonName(requireCommonName)
    }

    /** @param requireCommonName Include the common name in the subject name. */
    public fun requireCommonName(requireCommonName: IResolvable) {
        cdkBuilder.requireCommonName(requireCommonName)
    }

    /** @param requireDirectoryPath Include the directory path in the subject name. */
    public fun requireDirectoryPath(requireDirectoryPath: Boolean) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath)
    }

    /** @param requireDirectoryPath Include the directory path in the subject name. */
    public fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath)
    }

    /** @param requireDnsAsCn Include the DNS as common name in the subject name. */
    public fun requireDnsAsCn(requireDnsAsCn: Boolean) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn)
    }

    /** @param requireDnsAsCn Include the DNS as common name in the subject name. */
    public fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn)
    }

    /** @param requireEmail Include the subject's email in the subject name. */
    public fun requireEmail(requireEmail: Boolean) {
        cdkBuilder.requireEmail(requireEmail)
    }

    /** @param requireEmail Include the subject's email in the subject name. */
    public fun requireEmail(requireEmail: IResolvable) {
        cdkBuilder.requireEmail(requireEmail)
    }

    /**
     * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
     *   alternate name.
     */
    public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid)
    }

    /**
     * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
     *   alternate name.
     */
    public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid)
    }

    /** @param sanRequireDns Include the DNS in the subject alternate name. */
    public fun sanRequireDns(sanRequireDns: Boolean) {
        cdkBuilder.sanRequireDns(sanRequireDns)
    }

    /** @param sanRequireDns Include the DNS in the subject alternate name. */
    public fun sanRequireDns(sanRequireDns: IResolvable) {
        cdkBuilder.sanRequireDns(sanRequireDns)
    }

    /** @param sanRequireDomainDns Include the domain DNS in the subject alternate name. */
    public fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns)
    }

    /** @param sanRequireDomainDns Include the domain DNS in the subject alternate name. */
    public fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns)
    }

    /** @param sanRequireEmail Include the subject's email in the subject alternate name. */
    public fun sanRequireEmail(sanRequireEmail: Boolean) {
        cdkBuilder.sanRequireEmail(sanRequireEmail)
    }

    /** @param sanRequireEmail Include the subject's email in the subject alternate name. */
    public fun sanRequireEmail(sanRequireEmail: IResolvable) {
        cdkBuilder.sanRequireEmail(sanRequireEmail)
    }

    /**
     * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate name.
     */
    public fun sanRequireSpn(sanRequireSpn: Boolean) {
        cdkBuilder.sanRequireSpn(sanRequireSpn)
    }

    /**
     * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate name.
     */
    public fun sanRequireSpn(sanRequireSpn: IResolvable) {
        cdkBuilder.sanRequireSpn(sanRequireSpn)
    }

    /** @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name. */
    public fun sanRequireUpn(sanRequireUpn: Boolean) {
        cdkBuilder.sanRequireUpn(sanRequireUpn)
    }

    /** @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name. */
    public fun sanRequireUpn(sanRequireUpn: IResolvable) {
        cdkBuilder.sanRequireUpn(sanRequireUpn)
    }

    public fun build(): CfnTemplate.SubjectNameFlagsV4Property = cdkBuilder.build()
}
