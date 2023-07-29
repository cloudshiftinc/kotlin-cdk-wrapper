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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnCidrCollection
import software.constructs.Construct

/**
 * Creates a CIDR collection in the current AWS account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * CfnCidrCollection cfnCidrCollection = CfnCidrCollection.Builder.create(this,
 * "MyCfnCidrCollection")
 * .name("name")
 * // the properties below are optional
 * .locations(List.of(LocationProperty.builder()
 * .cidrList(List.of("cidrList"))
 * .locationName("locationName")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html)
 */
@CdkDslMarker
public class CfnCidrCollectionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCidrCollection.Builder = CfnCidrCollection.Builder.create(scope, id)

    private val _locations: MutableList<Any> = mutableListOf()

    /**
     * A complex type that contains information about the list of CIDR locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-locations)
     *
     * @param locations A complex type that contains information about the list of CIDR locations.
     */
    public fun locations(vararg locations: Any) {
        _locations.addAll(listOf(*locations))
    }

    /**
     * A complex type that contains information about the list of CIDR locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-locations)
     *
     * @param locations A complex type that contains information about the list of CIDR locations.
     */
    public fun locations(locations: Collection<Any>) {
        _locations.addAll(locations)
    }

    /**
     * A complex type that contains information about the list of CIDR locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-locations)
     *
     * @param locations A complex type that contains information about the list of CIDR locations.
     */
    public fun locations(locations: IResolvable) {
        cdkBuilder.locations(locations)
    }

    /**
     * The name of a CIDR collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-name)
     *
     * @param name The name of a CIDR collection.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnCidrCollection {
        if (_locations.isNotEmpty()) cdkBuilder.locations(_locations)
        return cdkBuilder.build()
    }
}
