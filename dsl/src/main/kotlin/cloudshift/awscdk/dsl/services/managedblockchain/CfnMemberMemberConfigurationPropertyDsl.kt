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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember

/**
 * Configuration properties of the member.
 *
 * Applies only to Hyperledger Fabric.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * MemberConfigurationProperty memberConfigurationProperty = MemberConfigurationProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .memberFrameworkConfiguration(MemberFrameworkConfigurationProperty.builder()
 * .memberFabricConfiguration(MemberFabricConfigurationProperty.builder()
 * .adminPassword("adminPassword")
 * .adminUsername("adminUsername")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html)
 */
@CdkDslMarker
public class CfnMemberMemberConfigurationPropertyDsl {
    private val cdkBuilder: CfnMember.MemberConfigurationProperty.Builder =
        CfnMember.MemberConfigurationProperty.builder()

    /** @param description An optional description of the member. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param memberFrameworkConfiguration Configuration properties of the blockchain framework
     *   relevant to the member.
     */
    public fun memberFrameworkConfiguration(memberFrameworkConfiguration: IResolvable) {
        cdkBuilder.memberFrameworkConfiguration(memberFrameworkConfiguration)
    }

    /**
     * @param memberFrameworkConfiguration Configuration properties of the blockchain framework
     *   relevant to the member.
     */
    public fun memberFrameworkConfiguration(
        memberFrameworkConfiguration: CfnMember.MemberFrameworkConfigurationProperty
    ) {
        cdkBuilder.memberFrameworkConfiguration(memberFrameworkConfiguration)
    }

    /** @param name The name of the member. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnMember.MemberConfigurationProperty = cdkBuilder.build()
}
