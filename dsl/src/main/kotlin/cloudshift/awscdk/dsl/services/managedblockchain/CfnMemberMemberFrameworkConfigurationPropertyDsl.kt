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

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember

/**
 * Configuration properties relevant to a member for the blockchain framework that the Managed
 * Blockchain network uses.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * MemberFrameworkConfigurationProperty memberFrameworkConfigurationProperty =
 * MemberFrameworkConfigurationProperty.builder()
 * .memberFabricConfiguration(MemberFabricConfigurationProperty.builder()
 * .adminPassword("adminPassword")
 * .adminUsername("adminUsername")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberframeworkconfiguration.html)
 */
@CdkDslMarker
public class CfnMemberMemberFrameworkConfigurationPropertyDsl {
    private val cdkBuilder: CfnMember.MemberFrameworkConfigurationProperty.Builder =
        CfnMember.MemberFrameworkConfigurationProperty.builder()

    /** @param memberFabricConfiguration Configuration properties for Hyperledger Fabric. */
    public fun memberFabricConfiguration(memberFabricConfiguration: IResolvable) {
        cdkBuilder.memberFabricConfiguration(memberFabricConfiguration)
    }

    /** @param memberFabricConfiguration Configuration properties for Hyperledger Fabric. */
    public fun memberFabricConfiguration(
        memberFabricConfiguration: CfnMember.MemberFabricConfigurationProperty
    ) {
        cdkBuilder.memberFabricConfiguration(memberFabricConfiguration)
    }

    public fun build(): CfnMember.MemberFrameworkConfigurationProperty = cdkBuilder.build()
}
