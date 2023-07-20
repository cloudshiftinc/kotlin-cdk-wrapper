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

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWorkgroupWorkgroupPropertyDsl {
    private val cdkBuilder: CfnWorkgroup.WorkgroupProperty.Builder =
        CfnWorkgroup.WorkgroupProperty.builder()

    private val _configParameters: MutableList<Any> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    public fun baseCapacity(baseCapacity: Number) {
        cdkBuilder.baseCapacity(baseCapacity)
    }

    public fun configParameters(vararg configParameters: Any) {
        _configParameters.addAll(listOf(*configParameters))
    }

    public fun configParameters(configParameters: Collection<Any>) {
        _configParameters.addAll(configParameters)
    }

    public fun configParameters(configParameters: IResolvable) {
        cdkBuilder.configParameters(configParameters)
    }

    public fun creationDate(creationDate: String) {
        cdkBuilder.creationDate(creationDate)
    }

    public fun endpoint(endpoint: IResolvable) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun endpoint(endpoint: CfnWorkgroup.EndpointProperty) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
        cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
        cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    public fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
    }

    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    public fun workgroupArn(workgroupArn: String) {
        cdkBuilder.workgroupArn(workgroupArn)
    }

    public fun workgroupId(workgroupId: String) {
        cdkBuilder.workgroupId(workgroupId)
    }

    public fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
    }

    public fun build(): CfnWorkgroup.WorkgroupProperty {
        if (_configParameters.isNotEmpty()) cdkBuilder.configParameters(_configParameters)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
