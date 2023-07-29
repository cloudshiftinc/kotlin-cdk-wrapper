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

package cloudshift.awscdk.dsl.services.identitystore

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.identitystore.CfnGroupProps

/**
 * Properties for defining a `CfnGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.identitystore.*;
 * CfnGroupProps cfnGroupProps = CfnGroupProps.builder()
 * .displayName("displayName")
 * .identityStoreId("identityStoreId")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html)
 */
@CdkDslMarker
public class CfnGroupPropsDsl {
    private val cdkBuilder: CfnGroupProps.Builder = CfnGroupProps.builder()

    /** @param description A string containing the description of the group. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param displayName A string containing the name of the group. This value is commonly
     *   displayed when the group is referenced.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /** @param identityStoreId The globally unique identifier for the identity store. */
    public fun identityStoreId(identityStoreId: String) {
        cdkBuilder.identityStoreId(identityStoreId)
    }

    public fun build(): CfnGroupProps = cdkBuilder.build()
}
