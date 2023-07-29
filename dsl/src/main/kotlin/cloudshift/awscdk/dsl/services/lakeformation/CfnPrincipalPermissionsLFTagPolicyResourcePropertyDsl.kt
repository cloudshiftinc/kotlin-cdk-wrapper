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

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

/**
 * A list of LF-tag conditions that define a resource's LF-tag policy.
 *
 * A structure that allows an admin to grant user permissions on certain conditions. For example,
 * granting a role access to all columns that do not have the LF-tag 'PII' in tables that have the
 * LF-tag 'Prod'.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * LFTagPolicyResourceProperty lFTagPolicyResourceProperty = LFTagPolicyResourceProperty.builder()
 * .catalogId("catalogId")
 * .expression(List.of(LFTagProperty.builder()
 * .tagKey("tagKey")
 * .tagValues(List.of("tagValues"))
 * .build()))
 * .resourceType("resourceType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagpolicyresource.html)
 */
@CdkDslMarker
public class CfnPrincipalPermissionsLFTagPolicyResourcePropertyDsl {
    private val cdkBuilder: CfnPrincipalPermissions.LFTagPolicyResourceProperty.Builder =
        CfnPrincipalPermissions.LFTagPolicyResourceProperty.builder()

    private val _expression: MutableList<Any> = mutableListOf()

    /**
     * @param catalogId The identifier for the Data Catalog . The Data Catalog is the persistent
     *   metadata store. It contains database definitions, table definitions, and other control
     *   information to manage your AWS Lake Formation environment.
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /** @param expression A list of LF-tag conditions that apply to the resource's LF-tag policy. */
    public fun expression(vararg expression: Any) {
        _expression.addAll(listOf(*expression))
    }

    /** @param expression A list of LF-tag conditions that apply to the resource's LF-tag policy. */
    public fun expression(expression: Collection<Any>) {
        _expression.addAll(expression)
    }

    /** @param expression A list of LF-tag conditions that apply to the resource's LF-tag policy. */
    public fun expression(expression: IResolvable) {
        cdkBuilder.expression(expression)
    }

    /** @param resourceType The resource type for which the LF-tag policy applies. */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    public fun build(): CfnPrincipalPermissions.LFTagPolicyResourceProperty {
        if (_expression.isNotEmpty()) cdkBuilder.expression(_expression)
        return cdkBuilder.build()
    }
}
