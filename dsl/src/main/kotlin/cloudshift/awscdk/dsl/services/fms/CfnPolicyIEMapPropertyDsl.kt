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

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.fms.CfnPolicy

/**
 * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in or
 * exclude from the policy.
 *
 * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child
 * OUs, including any child OUs and accounts that are added at a later time.
 *
 * This is used for the policy's `IncludeMap` and `ExcludeMap` .
 *
 * You can specify account IDs, OUs, or a combination:
 * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
 *   map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
 * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
 *   `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
 * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
 *   following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” :
 *   [“ouid111”, “ouid112”]}` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fms.*;
 * IEMapProperty iEMapProperty = Map.of(
 * "account", List.of("account"),
 * "orgunit", List.of("orgunit"));
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html)
 */
@CdkDslMarker
public class CfnPolicyIEMapPropertyDsl {
    private val cdkBuilder: CfnPolicy.IEMapProperty.Builder = CfnPolicy.IEMapProperty.builder()

    private val _account: MutableList<String> = mutableListOf()

    private val _orgunit: MutableList<String> = mutableListOf()

    /** @param account The account list for the map. */
    public fun account(vararg account: String) {
        _account.addAll(listOf(*account))
    }

    /** @param account The account list for the map. */
    public fun account(account: Collection<String>) {
        _account.addAll(account)
    }

    /** @param orgunit The organizational unit list for the map. */
    public fun orgunit(vararg orgunit: String) {
        _orgunit.addAll(listOf(*orgunit))
    }

    /** @param orgunit The organizational unit list for the map. */
    public fun orgunit(orgunit: Collection<String>) {
        _orgunit.addAll(orgunit)
    }

    public fun build(): CfnPolicy.IEMapProperty {
        if (_account.isNotEmpty()) cdkBuilder.account(_account)
        if (_orgunit.isNotEmpty()) cdkBuilder.orgunit(_orgunit)
        return cdkBuilder.build()
    }
}
