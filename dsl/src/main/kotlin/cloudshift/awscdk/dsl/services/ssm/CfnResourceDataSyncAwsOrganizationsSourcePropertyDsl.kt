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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssm.CfnResourceDataSync

/**
 * Information about the `AwsOrganizationsSource` resource data sync source.
 *
 * A sync source of this type can synchronize data from AWS Organizations or, if an AWS organization
 * isn't present, from multiple AWS Regions .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * AwsOrganizationsSourceProperty awsOrganizationsSourceProperty =
 * AwsOrganizationsSourceProperty.builder()
 * .organizationSourceType("organizationSourceType")
 * // the properties below are optional
 * .organizationalUnits(List.of("organizationalUnits"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html)
 */
@CdkDslMarker
public class CfnResourceDataSyncAwsOrganizationsSourcePropertyDsl {
    private val cdkBuilder: CfnResourceDataSync.AwsOrganizationsSourceProperty.Builder =
        CfnResourceDataSync.AwsOrganizationsSourceProperty.builder()

    private val _organizationalUnits: MutableList<String> = mutableListOf()

    /**
     * @param organizationSourceType If an AWS organization is present, this is either
     *   `OrganizationalUnits` or `EntireOrganization` . For `OrganizationalUnits` , the data is
     *   aggregated from a set of organization units. For `EntireOrganization` , the data is
     *   aggregated from the entire AWS organization.
     */
    public fun organizationSourceType(organizationSourceType: String) {
        cdkBuilder.organizationSourceType(organizationSourceType)
    }

    /** @param organizationalUnits The AWS Organizations organization units included in the sync. */
    public fun organizationalUnits(vararg organizationalUnits: String) {
        _organizationalUnits.addAll(listOf(*organizationalUnits))
    }

    /** @param organizationalUnits The AWS Organizations organization units included in the sync. */
    public fun organizationalUnits(organizationalUnits: Collection<String>) {
        _organizationalUnits.addAll(organizationalUnits)
    }

    public fun build(): CfnResourceDataSync.AwsOrganizationsSourceProperty {
        if (_organizationalUnits.isNotEmpty()) cdkBuilder.organizationalUnits(_organizationalUnits)
        return cdkBuilder.build()
    }
}
