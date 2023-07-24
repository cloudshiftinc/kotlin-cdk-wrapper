@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.licensemanager.CfnGrantProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for defining a `CfnGrant`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.licensemanager.*;
 * CfnGrantProps cfnGrantProps = CfnGrantProps.builder()
 * .allowedOperations(List.of("allowedOperations"))
 * .grantName("grantName")
 * .homeRegion("homeRegion")
 * .licenseArn("licenseArn")
 * .principals(List.of("principals"))
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html)
 */
@CdkDslMarker
public class CfnGrantPropsDsl {
    private val cdkBuilder: CfnGrantProps.Builder = CfnGrantProps.builder()

    private val _allowedOperations: MutableList<String> = mutableListOf()

    private val _principals: MutableList<String> = mutableListOf()

    /**
     * @param allowedOperations Allowed operations for the grant.
     */
    public fun allowedOperations(vararg allowedOperations: String) {
        _allowedOperations.addAll(listOf(*allowedOperations))
    }

    /**
     * @param allowedOperations Allowed operations for the grant.
     */
    public fun allowedOperations(allowedOperations: Collection<String>) {
        _allowedOperations.addAll(allowedOperations)
    }

    /**
     * @param grantName Grant name.
     */
    public fun grantName(grantName: String) {
        cdkBuilder.grantName(grantName)
    }

    /**
     * @param homeRegion Home Region of the grant.
     */
    public fun homeRegion(homeRegion: String) {
        cdkBuilder.homeRegion(homeRegion)
    }

    /**
     * @param licenseArn License ARN.
     */
    public fun licenseArn(licenseArn: String) {
        cdkBuilder.licenseArn(licenseArn)
    }

    /**
     * @param principals The grant principals. You can specify one of the following as an Amazon
     * Resource Name (ARN):.
     * * An AWS account, which includes only the account specified.
     * * An organizational unit (OU), which includes all accounts in the OU.
     * * An organization, which will include all accounts across your organization.
     */
    public fun principals(vararg principals: String) {
        _principals.addAll(listOf(*principals))
    }

    /**
     * @param principals The grant principals. You can specify one of the following as an Amazon
     * Resource Name (ARN):.
     * * An AWS account, which includes only the account specified.
     * * An organizational unit (OU), which includes all accounts in the OU.
     * * An organization, which will include all accounts across your organization.
     */
    public fun principals(principals: Collection<String>) {
        _principals.addAll(principals)
    }

    /**
     * @param status Granted license status.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnGrantProps {
        if (_allowedOperations.isNotEmpty()) cdkBuilder.allowedOperations(_allowedOperations)
        if (_principals.isNotEmpty()) cdkBuilder.principals(_principals)
        return cdkBuilder.build()
    }
}
