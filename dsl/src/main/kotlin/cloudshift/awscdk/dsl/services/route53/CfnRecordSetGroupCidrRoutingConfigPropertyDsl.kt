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

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnRecordSetGroup

/**
 * The object that is specified in resource record set object when you are linking a resource record
 * set to a CIDR location.
 *
 * A `LocationName` with an asterisk “*” can be used to create a default CIDR record. `CollectionId`
 * is still required for default record.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * CidrRoutingConfigProperty cidrRoutingConfigProperty = CidrRoutingConfigProperty.builder()
 * .collectionId("collectionId")
 * .locationName("locationName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-cidrroutingconfig.html)
 */
@CdkDslMarker
public class CfnRecordSetGroupCidrRoutingConfigPropertyDsl {
    private val cdkBuilder: CfnRecordSetGroup.CidrRoutingConfigProperty.Builder =
        CfnRecordSetGroup.CidrRoutingConfigProperty.builder()

    /** @param collectionId The CIDR collection ID. */
    public fun collectionId(collectionId: String) {
        cdkBuilder.collectionId(collectionId)
    }

    /** @param locationName The CIDR collection location name. */
    public fun locationName(locationName: String) {
        cdkBuilder.locationName(locationName)
    }

    public fun build(): CfnRecordSetGroup.CidrRoutingConfigProperty = cdkBuilder.build()
}
