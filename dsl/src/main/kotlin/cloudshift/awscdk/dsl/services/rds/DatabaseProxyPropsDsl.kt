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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.rds.DatabaseProxyProps
import software.amazon.awscdk.services.rds.ProxyTarget
import software.amazon.awscdk.services.rds.SessionPinningFilter
import software.amazon.awscdk.services.secretsmanager.ISecret
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class DatabaseProxyPropsDsl {
    private val cdkBuilder: DatabaseProxyProps.Builder = DatabaseProxyProps.builder()

    private val _secrets: MutableList<ISecret> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    private val _sessionPinningFilters: MutableList<SessionPinningFilter> = mutableListOf()

    public fun borrowTimeout(borrowTimeout: Duration) {
        cdkBuilder.borrowTimeout(borrowTimeout)
    }

    public fun dbProxyName(dbProxyName: String) {
        cdkBuilder.dbProxyName(dbProxyName)
    }

    public fun debugLogging(debugLogging: Boolean) {
        cdkBuilder.debugLogging(debugLogging)
    }

    public fun iamAuth(iamAuth: Boolean) {
        cdkBuilder.iamAuth(iamAuth)
    }

    public fun idleClientTimeout(idleClientTimeout: Duration) {
        cdkBuilder.idleClientTimeout(idleClientTimeout)
    }

    public fun initQuery(initQuery: String) {
        cdkBuilder.initQuery(initQuery)
    }

    public fun maxConnectionsPercent(maxConnectionsPercent: Number) {
        cdkBuilder.maxConnectionsPercent(maxConnectionsPercent)
    }

    public fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number) {
        cdkBuilder.maxIdleConnectionsPercent(maxIdleConnectionsPercent)
    }

    public fun proxyTarget(proxyTarget: ProxyTarget) {
        cdkBuilder.proxyTarget(proxyTarget)
    }

    public fun requireTls(requireTls: Boolean) {
        cdkBuilder.requireTls(requireTls)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun secrets(vararg secrets: ISecret) {
        _secrets.addAll(listOf(*secrets))
    }

    public fun secrets(secrets: Collection<ISecret>) {
        _secrets.addAll(secrets)
    }

    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun sessionPinningFilters(vararg sessionPinningFilters: SessionPinningFilter) {
        _sessionPinningFilters.addAll(listOf(*sessionPinningFilters))
    }

    public fun sessionPinningFilters(sessionPinningFilters: Collection<SessionPinningFilter>) {
        _sessionPinningFilters.addAll(sessionPinningFilters)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.vpcSubnets(builder.build())
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): DatabaseProxyProps {
        if (_secrets.isNotEmpty()) cdkBuilder.secrets(_secrets)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_sessionPinningFilters.isNotEmpty()) cdkBuilder.sessionPinningFilters(_sessionPinningFilters)
        return cdkBuilder.build()
    }
}
