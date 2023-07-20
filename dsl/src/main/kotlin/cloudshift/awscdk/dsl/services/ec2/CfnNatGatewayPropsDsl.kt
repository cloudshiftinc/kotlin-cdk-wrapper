@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnNatGatewayProps
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnNatGatewayPropsDsl {
    private val cdkBuilder: CfnNatGatewayProps.Builder = CfnNatGatewayProps.builder()

    private val _secondaryAllocationIds: MutableList<String> = mutableListOf()

    private val _secondaryPrivateIpAddresses: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun allocationId(allocationId: String) {
        cdkBuilder.allocationId(allocationId)
    }

    public fun connectivityType(connectivityType: String) {
        cdkBuilder.connectivityType(connectivityType)
    }

    public fun maxDrainDurationSeconds(maxDrainDurationSeconds: Number) {
        cdkBuilder.maxDrainDurationSeconds(maxDrainDurationSeconds)
    }

    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    public fun secondaryAllocationIds(vararg secondaryAllocationIds: String) {
        _secondaryAllocationIds.addAll(listOf(*secondaryAllocationIds))
    }

    public fun secondaryAllocationIds(secondaryAllocationIds: Collection<String>) {
        _secondaryAllocationIds.addAll(secondaryAllocationIds)
    }

    public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
        cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
    }

    public fun secondaryPrivateIpAddresses(vararg secondaryPrivateIpAddresses: String) {
        _secondaryPrivateIpAddresses.addAll(listOf(*secondaryPrivateIpAddresses))
    }

    public fun secondaryPrivateIpAddresses(secondaryPrivateIpAddresses: Collection<String>) {
        _secondaryPrivateIpAddresses.addAll(secondaryPrivateIpAddresses)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnNatGatewayProps {
        if (_secondaryAllocationIds.isNotEmpty()) {
            cdkBuilder.secondaryAllocationIds(_secondaryAllocationIds)
        }
        if (_secondaryPrivateIpAddresses.isNotEmpty()) {
            cdkBuilder.secondaryPrivateIpAddresses(_secondaryPrivateIpAddresses)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
